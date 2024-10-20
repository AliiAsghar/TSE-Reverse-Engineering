package defpackage;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffe {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    private final boolean i;

    public ffe(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4) {
        dzg.g(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z2;
        this.f = z3;
        this.h = z4;
        this.i = erl.j(str2);
    }

    public static Point a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(eul.c(i, widthAlignment) * widthAlignment, eul.c(i2, heightAlignment) * heightAlignment);
    }

    private final void i(String str) {
        eub.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.a + ", " + this.b + "] [" + eul.e + "]");
    }

    private static boolean j(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point a = a(videoCapabilities, i, i2);
        int i3 = a.x;
        int i4 = a.y;
        if (d != -1.0d && d >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
        }
        return videoCapabilities.isSizeSupported(i3, i4);
    }

    public final ezi b(eqn eqnVar, eqn eqnVar2) {
        int i;
        int i2;
        if (true != Objects.equals(eqnVar.o, eqnVar2.o)) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.i) {
            if (eqnVar.y != eqnVar2.y) {
                i |= 1024;
            }
            if (!this.e && (eqnVar.v != eqnVar2.v || eqnVar.w != eqnVar2.w)) {
                i |= 512;
            }
            if ((!eqd.h(eqnVar.C) || !eqd.h(eqnVar2.C)) && !Objects.equals(eqnVar.C, eqnVar2.C)) {
                i |= 2048;
            }
            String str = this.a;
            if (eul.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !eqnVar.c(eqnVar2)) {
                i |= 2;
            }
            if (i == 0) {
                String str2 = this.a;
                if (true != eqnVar.c(eqnVar2)) {
                    i2 = 2;
                } else {
                    i2 = 3;
                }
                return new ezi(str2, eqnVar, eqnVar2, i2, 0);
            }
        } else {
            if (eqnVar.D != eqnVar2.D) {
                i |= 4096;
            }
            if (eqnVar.E != eqnVar2.E) {
                i |= 8192;
            }
            if (eqnVar.F != eqnVar2.F) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.b)) {
                int i3 = ffp.a;
                Pair a = etj.a(eqnVar);
                Pair a2 = etj.a(eqnVar2);
                if (a != null && a2 != null) {
                    int intValue = ((Integer) a.first).intValue();
                    int intValue2 = ((Integer) a2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new ezi(this.a, eqnVar, eqnVar2, 3, 0);
                    }
                }
            }
            if (!eqnVar.c(eqnVar2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.b)) {
                i |= 2;
            }
            if (i == 0) {
                return new ezi(this.a, eqnVar, eqnVar2, 1, 0);
            }
        }
        return new ezi(this.a, eqnVar, eqnVar2, 0, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(eqn eqnVar, boolean z) {
        String str;
        int i = ffp.a;
        Pair a = etj.a(eqnVar);
        String str2 = eqnVar.o;
        if (str2 != null && str2.equals("video/mv-hevc") && this.c.equals("video/hevc")) {
            List list = eqnVar.r;
            byte[] bArr = euw.a;
            int i2 = 0;
            loop0: while (true) {
                if (i2 < list.size()) {
                    byte[] bArr2 = (byte[]) list.get(i2);
                    int length = bArr2.length;
                    if (length > 3) {
                        boolean[] zArr = new boolean[3];
                        alob alobVar = new alob();
                        int i3 = 0;
                        while (true) {
                            int length2 = bArr2.length;
                            if (i3 >= length2) {
                                break;
                            }
                            int c = euw.c(bArr2, i3, length2, zArr);
                            if (c != length2) {
                                alobVar.h(Integer.valueOf(c));
                            }
                            i3 = c + 3;
                        }
                        alog g = alobVar.g();
                        for (int i4 = 0; i4 < ((alsx) g).c; i4++) {
                            if (((Integer) g.get(i4)).intValue() + 3 < length) {
                                gku gkuVar = new gku(bArr2, ((Integer) g.get(i4)).intValue() + 3, length);
                                fsq j = euw.j(gkuVar);
                                if (j.a == 33 && j.b == 0) {
                                    gkuVar.k(4);
                                    int f = gkuVar.f(3);
                                    gkuVar.j();
                                    eus i5 = euw.i(gkuVar, true, f, null);
                                    str = etj.d(i5.a, i5.b, i5.c, i5.d, i5.e, i5.f);
                                    break loop0;
                                }
                            }
                        }
                    }
                    i2++;
                } else {
                    str = null;
                    break;
                }
            }
            a = str == null ? null : etj.b(str, eul.ae(str.trim(), "\\."), eqnVar.C);
        }
        if (a != null) {
            int intValue = ((Integer) a.first).intValue();
            int intValue2 = ((Integer) a.second).intValue();
            if ("video/dolby-vision".equals(eqnVar.o)) {
                if ("video/avc".equals(this.b)) {
                    intValue = 8;
                } else if ("video/hevc".equals(this.b)) {
                    intValue = 2;
                }
                intValue2 = 0;
            }
            if (!this.i) {
                if (intValue == 42) {
                    intValue = 42;
                }
            }
            MediaCodecInfo.CodecProfileLevel[] h = h();
            int i6 = eul.a;
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : h) {
                if (codecProfileLevel.profile != intValue || ((codecProfileLevel.level < intValue2 && z) || ("video/hevc".equals(this.b) && intValue == 2 && ("sailfish".equals(eul.b) || "marlin".equals(eul.b))))) {
                }
            }
            i("codec.profileLevel, " + eqnVar.k + ", " + this.c);
            return false;
        }
        return true;
    }

    public final boolean d(eqn eqnVar) {
        int i;
        int i2;
        if (!e(eqnVar) || !c(eqnVar, true)) {
            return false;
        }
        if (this.i) {
            int i3 = eqnVar.v;
            if (i3 <= 0 || (i2 = eqnVar.w) <= 0) {
                return true;
            }
            return g(i3, i2, eqnVar.x);
        }
        int i4 = eqnVar.E;
        if (i4 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (codecCapabilities == null) {
                i("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                i("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i4)) {
                i(a.bV(i4, "sampleRate.support, "));
                return false;
            }
        }
        int i5 = eqnVar.D;
        if (i5 == -1) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.d;
        if (codecCapabilities2 == null) {
            i("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
        if (audioCapabilities2 == null) {
            i("channelCount.aCaps");
            return false;
        }
        String str = this.a;
        String str2 = this.b;
        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
        if (maxInputChannelCount <= 1) {
            int i6 = eul.a;
            if (maxInputChannelCount <= 0 && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2)) {
                if ("audio/ac3".equals(str2)) {
                    i = 6;
                } else if ("audio/eac3".equals(str2)) {
                    i = 16;
                } else {
                    i = 30;
                }
                eub.f("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i + "]");
                maxInputChannelCount = i;
            }
        }
        if (maxInputChannelCount >= i5) {
            return true;
        }
        i(a.bV(i5, "channelCount.support, "));
        return false;
    }

    public final boolean e(eqn eqnVar) {
        if (!this.b.equals(eqnVar.o) && !this.b.equals(ffp.b(eqnVar))) {
            return false;
        }
        return true;
    }

    public final boolean f(eqn eqnVar) {
        if (this.i) {
            return this.e;
        }
        int i = ffp.a;
        Pair a = etj.a(eqnVar);
        if (a != null && ((Integer) a.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        r2 = r0.getSupportedPerformancePoints();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
    
        if (defpackage.eeb.a.booleanValue() == false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(int r10, int r11, double r12) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffe.g(int, int, double):boolean");
    }

    public final MediaCodecInfo.CodecProfileLevel[] h() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities != null && codecCapabilities.profileLevels != null) {
            return this.d.profileLevels;
        }
        return new MediaCodecInfo.CodecProfileLevel[0];
    }

    public final String toString() {
        return this.a;
    }
}
