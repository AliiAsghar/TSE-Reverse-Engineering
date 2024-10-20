package defpackage;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ygz {
    public final MediaExtractor a;
    public final ygx b;
    public final yha c;
    public final ygy d;
    public final ygy e;
    public int f;
    public boolean g;
    public MediaFormat h;
    public int i;
    public int j;
    public long k;
    public long l;
    public boolean m;
    public int n;
    public int o;

    public ygz(MediaExtractor mediaExtractor, MediaCodec mediaCodec, MediaCodec mediaCodec2) {
        this(mediaExtractor, mediaCodec, mediaCodec2, null, null);
        this.n = 0;
        this.o = 0;
    }

    public final void a(MediaMuxer mediaMuxer) {
        MediaFormat mediaFormat = this.h;
        if (mediaFormat != null) {
            this.f = mediaMuxer.addTrack(mediaFormat);
            ((alwl) yhh.a.m().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "addTrackToMuxer", 88, "MediaTrackPipeline.java")).w("Added track %s: %s", this.f, this.h);
        }
        this.m = true;
    }

    public final void b(MediaMuxer mediaMuxer) {
        int dequeueOutputBuffer;
        int i;
        if (this.e.e && (i = this.j) >= 0) {
            this.d.a.queueInputBuffer(i, 0, 0, 0L, 4);
            this.j = -1;
            ((alwl) yhh.a.m().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "mux", 311, "MediaTrackPipeline.java")).r("track %s signaling EOS", this.f);
        }
        ygy ygyVar = this.d;
        if (!ygyVar.e) {
            if ((this.h == null || this.m) && (dequeueOutputBuffer = ygyVar.a.dequeueOutputBuffer(ygyVar.b, 10000L)) != -1) {
                if (dequeueOutputBuffer == -3) {
                    ygy ygyVar2 = this.d;
                    ygyVar2.d = ygyVar2.a.getOutputBuffers();
                    return;
                }
                if (dequeueOutputBuffer == -2) {
                    ((alwl) yhh.a.m().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "mux", 321, "MediaTrackPipeline.java")).w("mux: track %s output format changed to %s", this.f, this.d.a.getOutputFormat());
                    this.h = this.d.a.getOutputFormat();
                    return;
                }
                ygy ygyVar3 = this.d;
                ByteBuffer byteBuffer = ygyVar3.d[dequeueOutputBuffer];
                if ((ygyVar3.b.flags & 2) != 0) {
                    this.d.a.releaseOutputBuffer(dequeueOutputBuffer, false);
                    return;
                }
                if (this.d.b.size != 0) {
                    long j = this.d.b.presentationTimeUs;
                    long j2 = this.l;
                    if (j < j2) {
                        this.d.b.presentationTimeUs = j2 + 1;
                    }
                    mediaMuxer.writeSampleData(this.f, byteBuffer, this.d.b);
                    this.l = this.d.b.presentationTimeUs;
                    ((alwl) yhh.a.n().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "mux", 340, "MediaTrackPipeline.java")).v("track %s mux: %s s", this.f, TimeUnit.MICROSECONDS.toSeconds(this.l));
                }
                if ((this.d.b.flags & 4) != 0) {
                    this.d.e = true;
                }
                this.d.a.releaseOutputBuffer(dequeueOutputBuffer, false);
            }
        }
    }

    public final boolean c() {
        return this.e.e;
    }

    public final boolean d() {
        return this.d.e;
    }

    public final boolean e() {
        if (this.m) {
            return false;
        }
        if (this.h == null && this.a != null) {
            return false;
        }
        return true;
    }

    public ygz(MediaExtractor mediaExtractor, MediaCodec mediaCodec, MediaCodec mediaCodec2, ygx ygxVar, yha yhaVar) {
        this.f = -1;
        this.h = null;
        this.i = -1;
        this.j = -1;
        this.k = -1L;
        this.l = -1L;
        this.e = new ygy(mediaCodec);
        this.d = new ygy(mediaCodec2);
        this.a = mediaExtractor;
        this.b = ygxVar;
        this.c = yhaVar;
        this.g = mediaExtractor == null;
    }
}
