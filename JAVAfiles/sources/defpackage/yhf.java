package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yhf {
    private static final double n = TimeUnit.SECONDS.toMicros(1);
    public MediaExtractor a;
    public MediaExtractor b;
    public ygx c;
    public yha d;
    public MediaCodec e;
    public MediaCodec f;
    public MediaCodec g;
    public MediaCodec h;
    public MediaMuxer i;
    public volatile boolean j;
    public long k;
    public final Context l;
    public final yyt m;
    private MediaCodecInfo q;
    private MediaCodecInfo r;
    private MediaFormat s;
    private MediaFormat t;
    private ahqq v;
    private final xnv w;
    private final armf x;
    private double o = 0.03d;
    private double p = 0.9d;
    private int u = 0;

    public yhf(Context context, yyt yytVar, xnv xnvVar, armf armfVar) {
        this.l = context;
        this.m = yytVar;
        this.w = xnvVar;
        this.x = armfVar;
    }

    public static Optional a(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (albo.ar(str2, str)) {
                        return Optional.of(codecInfoAt);
                    }
                }
            }
        }
        return Optional.empty();
    }

    public static void b(MediaCodec mediaCodec) {
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                mediaCodec.release();
            } catch (IllegalStateException e) {
                ((alwl) ((alwl) ((alwl) yhh.a.h()).g(e)).h("com/google/android/apps/messaging/shared/util/media/video/VideoTranscoder", "release", (char) 895, "VideoTranscoder.java")).q("Error releasing codec");
            }
        }
    }

    public static void c(MediaExtractor mediaExtractor) {
        if (mediaExtractor != null) {
            mediaExtractor.release();
        }
    }

    private final int e(MediaFormat mediaFormat, String str) {
        if (mediaFormat.containsKey(str)) {
            return mediaFormat.getInteger(str);
        }
        this.m.u(9);
        throw new yhg("Required key " + str + " not found in " + String.valueOf(mediaFormat));
    }

    private final MediaExtractor f(Uri uri) {
        MediaExtractor mediaExtractor = new MediaExtractor();
        mediaExtractor.setDataSource(this.l, uri, (Map<String, String>) null);
        return mediaExtractor;
    }

    private final MediaMuxer g(File file) {
        try {
            return new MediaMuxer(file.getAbsolutePath(), 0);
        } catch (IOException | NoClassDefFoundError e) {
            this.m.u(6);
            throw new yhg("Failed to create muxer", e);
        }
    }

    private final void h(ygz ygzVar) {
        boolean z;
        int i;
        boolean z2;
        int dequeueInputBuffer;
        boolean z3 = true;
        if (!ygzVar.g && ((ygzVar.h == null || ygzVar.m) && (dequeueInputBuffer = ygzVar.e.a.dequeueInputBuffer(10000L)) != -1)) {
            int readSampleData = ygzVar.a.readSampleData(ygzVar.e.c[dequeueInputBuffer], 0);
            long sampleTime = ygzVar.a.getSampleTime();
            if (readSampleData >= 0) {
                ygzVar.e.a.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, sampleTime, ygzVar.a.getSampleFlags());
            }
            ygzVar.g = !ygzVar.a.advance();
            ((alwl) yhh.a.n().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "extract", 111, "MediaTrackPipeline.java")).K("extract(track= %s, size= %s, presentationTime: %s (%s)", Integer.valueOf(ygzVar.f), Integer.valueOf(readSampleData), Long.valueOf(sampleTime), Long.valueOf(ygzVar.a.getSampleTime() - sampleTime));
            if (ygzVar.g) {
                ygzVar.e.a.queueInputBuffer(ygzVar.e.a.dequeueInputBuffer(10000L), 0, 0, 0L, 4);
            }
        }
        if (ygzVar.b != null && ygzVar.c != null) {
            ygy ygyVar = ygzVar.e;
            if (!ygyVar.e && (ygzVar.h == null || ygzVar.m)) {
                int dequeueOutputBuffer = ygyVar.a.dequeueOutputBuffer(ygyVar.b, 10000L);
                ((alwl) yhh.a.n().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaSurfaces", 268, "MediaTrackPipeline.java")).J("dequeOutputBuffer(track= %s, size=%s...): %s", Integer.valueOf(ygzVar.f), Integer.valueOf(ygzVar.e.b.size), Integer.valueOf(dequeueOutputBuffer));
                if (dequeueOutputBuffer >= 0) {
                    if ((ygzVar.e.b.flags & 2) != 0) {
                        ygzVar.e.a.releaseOutputBuffer(dequeueOutputBuffer, false);
                    } else {
                        if (ygzVar.e.b.size != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        ygzVar.e.a.releaseOutputBuffer(dequeueOutputBuffer, z2);
                        if (z2) {
                            yha yhaVar = ygzVar.c;
                            synchronized (yhaVar.d) {
                                while (!yhaVar.f) {
                                    try {
                                        yhaVar.d.wait(yha.a);
                                    } catch (InterruptedException e) {
                                        ((alwl) ((alwl) ((alwl) yhh.a.h()).g(e)).h("com/google/android/apps/messaging/shared/util/media/video/OutputSurface", "awaitNewImage", 'N', "OutputSurface.java")).q("Unexpected exception");
                                    }
                                    if (!yhaVar.f) {
                                        throw new RuntimeException("Surface frame wait timed out");
                                        break;
                                    }
                                }
                                yhaVar.f = false;
                            }
                            yhaVar.b.updateTexImage();
                            yha yhaVar2 = ygzVar.c;
                            yhb yhbVar = yhaVar2.e;
                            yhaVar2.b.getTransformMatrix(yhbVar.c);
                            GLES20.glClearColor(brg.a, 1.0f, brg.a, 1.0f);
                            GLES20.glClear(16640);
                            GLES20.glUseProgram(yhbVar.d);
                            GLES20.glActiveTexture(33984);
                            GLES20.glBindTexture(36197, yhbVar.e);
                            yhbVar.a.position(0);
                            GLES20.glVertexAttribPointer(yhbVar.h, 3, 5126, false, 20, (Buffer) yhbVar.a);
                            GLES20.glEnableVertexAttribArray(yhbVar.h);
                            yhbVar.a.position(3);
                            GLES20.glVertexAttribPointer(yhbVar.i, 2, 5126, false, 20, (Buffer) yhbVar.a);
                            GLES20.glEnableVertexAttribArray(yhbVar.i);
                            Matrix.setIdentityM(yhbVar.b, 0);
                            GLES20.glUniformMatrix4fv(yhbVar.f, 1, false, yhbVar.b, 0);
                            GLES20.glUniformMatrix4fv(yhbVar.g, 1, false, yhbVar.c, 0);
                            if (!yhbVar.n) {
                                GLES20.glUniform1f(yhbVar.j, yhbVar.l);
                                GLES20.glUniform1f(yhbVar.k, yhbVar.m);
                            }
                            GLES20.glDrawArrays(5, 0, 4);
                            GLES20.glFinish();
                            ygx ygxVar = ygzVar.b;
                            EGLExt.eglPresentationTimeANDROID(ygxVar.a, ygxVar.c, ygzVar.e.b.presentationTimeUs * 1000);
                            ygx ygxVar2 = ygzVar.b;
                            EGL14.eglSwapBuffers(ygxVar2.a, ygxVar2.c);
                            ((alwl) yhh.a.n().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaSurfaces", 290, "MediaTrackPipeline.java")).v("track %s queueinput %s s", ygzVar.f, TimeUnit.MICROSECONDS.toSeconds(ygzVar.e.b.presentationTimeUs));
                        }
                        if ((ygzVar.e.b.flags & 4) != 0) {
                            ygzVar.e.e = true;
                            ((alwl) yhh.a.m().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaSurfaces", 297, "MediaTrackPipeline.java")).r("track %s signaling EOS", ygzVar.f);
                            ygzVar.d.a.signalEndOfInputStream();
                        }
                    }
                }
            }
        } else {
            ygy ygyVar2 = ygzVar.e;
            if (!ygyVar2.e && ygzVar.i == -1 && (ygzVar.h == null || ygzVar.m)) {
                int dequeueOutputBuffer2 = ygyVar2.a.dequeueOutputBuffer(ygyVar2.b, 10000L);
                ((alwl) yhh.a.n().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaBuffers", 141, "MediaTrackPipeline.java")).J("dequeOutputBuffer(track= %s, size=%s...):%s", Integer.valueOf(ygzVar.f), Integer.valueOf(ygzVar.e.b.size), Integer.valueOf(dequeueOutputBuffer2));
                if (dequeueOutputBuffer2 == -1) {
                    ((alwl) yhh.a.n().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaBuffers", 145, "MediaTrackPipeline.java")).q("MediaCodec.INFO_TRY_AGAIN_LATER");
                } else if (dequeueOutputBuffer2 == -3) {
                    ygy ygyVar3 = ygzVar.e;
                    ygyVar3.d = ygyVar3.a.getOutputBuffers();
                } else if (dequeueOutputBuffer2 == -2) {
                    MediaFormat outputFormat = ygzVar.e.a.getOutputFormat();
                    if (outputFormat.containsKey("sample-rate")) {
                        ygzVar.n = outputFormat.getInteger("sample-rate");
                    }
                    if (outputFormat.containsKey("channel-count")) {
                        ygzVar.o = outputFormat.getInteger("channel-count");
                    }
                    ((alwl) yhh.a.n().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaBuffers", 158, "MediaTrackPipeline.java")).w("transcodeViaBuffers: track %s decoder output format changed to %s", ygzVar.f, outputFormat);
                } else if ((ygzVar.e.b.flags & 2) != 0) {
                    ygzVar.e.a.releaseOutputBuffer(dequeueOutputBuffer2, false);
                } else {
                    ygzVar.i = dequeueOutputBuffer2;
                }
            }
            if (ygzVar.i != -1) {
                int dequeueInputBuffer2 = ygzVar.d.a.dequeueInputBuffer(10000L);
                ygzVar.j = dequeueInputBuffer2;
                if (dequeueInputBuffer2 != -1) {
                    MediaCodec.BufferInfo bufferInfo = ygzVar.e.b;
                    int i2 = bufferInfo.size - bufferInfo.offset;
                    ((alwl) yhh.a.n().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaBuffers", 177, "MediaTrackPipeline.java")).J("bytesQueued=%s, size= %s, offset=%s", Integer.valueOf(i2), Integer.valueOf(ygzVar.e.b.size), Integer.valueOf(ygzVar.e.b.offset));
                    if (ygzVar.o > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    d.t(z, "audioChannelCount can't smaller than 1");
                    if (ygzVar.n <= 0) {
                        z3 = false;
                    }
                    d.t(z3, "audioSampleRate can't be smaller than 1");
                    long j = ygzVar.e.b.presentationTimeUs;
                    if (ygzVar.n > 0 && ygzVar.o > 0) {
                        i = i2;
                        double d = ygzVar.n * ygzVar.o;
                        long micros = (long) (ygzVar.e.b.offset * (TimeUnit.SECONDS.toMicros(1L) / (d + d)));
                        ((alwl) yhh.a.n().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaBuffers", 190, "MediaTrackPipeline.java")).z("presentationTime=%s, delta=%s", j, micros);
                        j += micros;
                    } else {
                        i = i2;
                    }
                    long j2 = j;
                    ByteBuffer byteBuffer = ygzVar.d.c[ygzVar.j];
                    ByteBuffer duplicate = ygzVar.e.d[ygzVar.i].duplicate();
                    duplicate.position(ygzVar.e.b.offset);
                    int min = Math.min(byteBuffer.capacity(), i);
                    duplicate.limit(ygzVar.e.b.offset + min);
                    byteBuffer.position(0);
                    byteBuffer.put(duplicate);
                    ((alwl) yhh.a.n().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaBuffers", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "MediaTrackPipeline.java")).J("queueInputBuffer( %s): size=%s, presentationTime=%s", Integer.valueOf(ygzVar.f), Integer.valueOf(min), Long.valueOf(j2));
                    if (j2 > 0 && j2 < ygzVar.k) {
                        ((alwl) yhh.a.m().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaBuffers", 207, "MediaTrackPipeline.java")).z("presentationTime out of sequence? %s < %s", j2, ygzVar.k);
                        j2 = ygzVar.k;
                    }
                    ygzVar.k = Math.max(j2, ygzVar.k);
                    if (min > 0) {
                        ygzVar.d.a.queueInputBuffer(ygzVar.j, 0, min, j2, ygzVar.e.b.flags);
                        ygzVar.j = -1;
                        ((alwl) yhh.a.n().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaBuffers", 225, "MediaTrackPipeline.java")).v("track %s queueinput %s s", ygzVar.f, TimeUnit.MICROSECONDS.toSeconds(j2));
                    } else {
                        ((alwl) yhh.a.m().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaBuffers", 229, "MediaTrackPipeline.java")).r("track %s defer EOS", ygzVar.f);
                    }
                    if (ygzVar.e.b.offset + min < ygzVar.e.b.size) {
                        ygzVar.e.b.offset += min;
                    } else {
                        ygzVar.e.a.releaseOutputBuffer(ygzVar.i, false);
                        ygzVar.i = -1;
                        if ((ygzVar.e.b.flags & 4) != 0) {
                            ygzVar.e.e = true;
                        }
                    }
                }
            }
        }
        if (!ygzVar.c()) {
            ygzVar.b(this.i);
        }
    }

    private static int i(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("rotation-degrees")) {
            return mediaFormat.getInteger("rotation-degrees");
        }
        return 0;
    }

    private static int j(MediaExtractor mediaExtractor) {
        int i = 0;
        while (i < 5 && mediaExtractor.advance()) {
            i++;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x04a4, code lost:
    
        r2 = r36.getInteger("color-transfer", -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x05f4, code lost:
    
        r12.releaseOutputBuffer(r1, false);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x09b3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x045d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0797 A[Catch: all -> 0x09aa, IOException -> 0x09ad, IllegalStateException -> 0x09b0, TRY_ENTER, TryCatch #58 {IOException -> 0x09ad, IllegalStateException -> 0x09b0, all -> 0x09aa, blocks: (B:135:0x045d, B:164:0x0503, B:168:0x0703, B:171:0x07b4, B:181:0x0864, B:184:0x0872, B:192:0x089b, B:195:0x08ae, B:198:0x08c6, B:170:0x0797), top: B:134:0x045d }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x07cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x088a A[Catch: all -> 0x0781, IOException -> 0x078b, IllegalStateException -> 0x078d, TRY_ENTER, TryCatch #56 {IOException -> 0x078b, IllegalStateException -> 0x078d, all -> 0x0781, blocks: (B:263:0x071d, B:267:0x0739, B:270:0x0765, B:186:0x088a, B:188:0x0892, B:194:0x089f, B:197:0x08c0, B:200:0x0900, B:202:0x0904, B:208:0x08a8, B:281:0x0774, B:280:0x0771, B:292:0x0780, B:291:0x077d, B:269:0x0742, B:275:0x076b, B:266:0x0725, B:286:0x0777), top: B:262:0x071d, inners: #39, #44, #46, #48 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x089f A[Catch: all -> 0x0781, IOException -> 0x078b, IllegalStateException -> 0x078d, TRY_ENTER, TryCatch #56 {IOException -> 0x078b, IllegalStateException -> 0x078d, all -> 0x0781, blocks: (B:263:0x071d, B:267:0x0739, B:270:0x0765, B:186:0x088a, B:188:0x0892, B:194:0x089f, B:197:0x08c0, B:200:0x0900, B:202:0x0904, B:208:0x08a8, B:281:0x0774, B:280:0x0771, B:292:0x0780, B:291:0x077d, B:269:0x0742, B:275:0x076b, B:266:0x0725, B:286:0x0777), top: B:262:0x071d, inners: #39, #44, #46, #48 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x08c0 A[Catch: all -> 0x0781, IOException -> 0x078b, IllegalStateException -> 0x078d, TRY_ENTER, TRY_LEAVE, TryCatch #56 {IOException -> 0x078b, IllegalStateException -> 0x078d, all -> 0x0781, blocks: (B:263:0x071d, B:267:0x0739, B:270:0x0765, B:186:0x088a, B:188:0x0892, B:194:0x089f, B:197:0x08c0, B:200:0x0900, B:202:0x0904, B:208:0x08a8, B:281:0x0774, B:280:0x0771, B:292:0x0780, B:291:0x077d, B:269:0x0742, B:275:0x076b, B:266:0x0725, B:286:0x0777), top: B:262:0x071d, inners: #39, #44, #46, #48 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0900 A[Catch: all -> 0x0781, IOException -> 0x078b, IllegalStateException -> 0x078d, TRY_ENTER, TryCatch #56 {IOException -> 0x078b, IllegalStateException -> 0x078d, all -> 0x0781, blocks: (B:263:0x071d, B:267:0x0739, B:270:0x0765, B:186:0x088a, B:188:0x0892, B:194:0x089f, B:197:0x08c0, B:200:0x0900, B:202:0x0904, B:208:0x08a8, B:281:0x0774, B:280:0x0771, B:292:0x0780, B:291:0x077d, B:269:0x0742, B:275:0x076b, B:266:0x0725, B:286:0x0777), top: B:262:0x071d, inners: #39, #44, #46, #48 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x08a6  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x071d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0b0d A[Catch: all -> 0x0b31, TryCatch #11 {all -> 0x0b31, blocks: (B:123:0x09d8, B:124:0x09db, B:220:0x095b, B:219:0x0958, B:295:0x0b03, B:297:0x0b0d, B:298:0x0b12, B:300:0x0b16, B:301:0x0b29, B:302:0x0b30, B:256:0x096a, B:257:0x096d, B:371:0x0994, B:372:0x0997, B:406:0x09a6, B:407:0x09a9, B:458:0x09dc, B:459:0x0a19, B:475:0x0a44, B:474:0x0a41, B:493:0x0aae, B:492:0x0aab, B:529:0x0aaf, B:530:0x0ac7, B:541:0x0ad9, B:540:0x0ad6, B:552:0x0aeb, B:551:0x0ae8), top: B:8:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0b16 A[Catch: all -> 0x0b31, TryCatch #11 {all -> 0x0b31, blocks: (B:123:0x09d8, B:124:0x09db, B:220:0x095b, B:219:0x0958, B:295:0x0b03, B:297:0x0b0d, B:298:0x0b12, B:300:0x0b16, B:301:0x0b29, B:302:0x0b30, B:256:0x096a, B:257:0x096d, B:371:0x0994, B:372:0x0997, B:406:0x09a6, B:407:0x09a9, B:458:0x09dc, B:459:0x0a19, B:475:0x0a44, B:474:0x0a41, B:493:0x0aae, B:492:0x0aab, B:529:0x0aaf, B:530:0x0ac7, B:541:0x0ad9, B:540:0x0ad6, B:552:0x0aeb, B:551:0x0ae8), top: B:8:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x06eb A[Catch: all -> 0x06ef, TRY_ENTER, TRY_LEAVE, TryCatch #43 {all -> 0x06ef, blocks: (B:336:0x05fa, B:337:0x05fd, B:339:0x0614, B:340:0x061a, B:342:0x063b, B:343:0x0641, B:345:0x0662, B:346:0x0668, B:353:0x06eb), top: B:308:0x0532 }] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0978 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x033b A[Catch: all -> 0x09c9, TRY_LEAVE, TryCatch #21 {all -> 0x09c9, blocks: (B:71:0x0279, B:74:0x0297, B:77:0x02a7, B:82:0x02c2, B:83:0x02d7, B:85:0x02f1, B:86:0x02f7, B:434:0x032f, B:438:0x033b, B:442:0x02cd, B:444:0x02b6), top: B:70:0x0279 }] */
    /* JADX WARN: Removed duplicated region for block: B:442:0x02cd A[Catch: all -> 0x09c9, TryCatch #21 {all -> 0x09c9, blocks: (B:71:0x0279, B:74:0x0297, B:77:0x02a7, B:82:0x02c2, B:83:0x02d7, B:85:0x02f1, B:86:0x02f7, B:434:0x032f, B:438:0x033b, B:442:0x02cd, B:444:0x02b6), top: B:70:0x0279 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02c2 A[Catch: all -> 0x09c9, TryCatch #21 {all -> 0x09c9, blocks: (B:71:0x0279, B:74:0x0297, B:77:0x02a7, B:82:0x02c2, B:83:0x02d7, B:85:0x02f1, B:86:0x02f7, B:434:0x032f, B:438:0x033b, B:442:0x02cd, B:444:0x02b6), top: B:70:0x0279 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02f1 A[Catch: all -> 0x09c9, TryCatch #21 {all -> 0x09c9, blocks: (B:71:0x0279, B:74:0x0297, B:77:0x02a7, B:82:0x02c2, B:83:0x02d7, B:85:0x02f1, B:86:0x02f7, B:434:0x032f, B:438:0x033b, B:442:0x02cd, B:444:0x02b6), top: B:70:0x0279 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0366  */
    /* JADX WARN: Type inference failed for: r2v0, types: [yhd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v34, types: [yhf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(defpackage.yhd r47) {
        /*
            Method dump skipped, instructions count: 2986
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yhf.d(yhd):boolean");
    }
}
