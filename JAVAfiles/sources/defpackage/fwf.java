package defpackage;

import android.media.CamcorderProfile;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Range;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwf {
    public static final /* synthetic */ int a = 0;
    private static final alln b = new alln();

    public static int a(MediaCodecInfo mediaCodecInfo, String str, int i) {
        int i2 = -1;
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
            if (codecProfileLevel.profile == i) {
                i2 = Math.max(i2, codecProfileLevel.level);
            }
        }
        return i2;
    }

    public static Range b(MediaCodecInfo mediaCodecInfo, String str) {
        return mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().getBitrateRange();
    }

    public static Size c(MediaCodecInfo mediaCodecInfo, String str, int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities();
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = i(i, widthAlignment);
        int i4 = i(i2, heightAlignment);
        if (h(mediaCodecInfo, str, i3, i4)) {
            return new Size(i3, i4);
        }
        float[] fArr = {0.95f, 0.9f, 0.85f, 0.8f, 0.75f, 0.7f, 0.6666667f, 0.6f, 0.55f, 0.5f, 0.4f, 0.33333334f, 0.25f};
        for (int i5 = 0; i5 < 13; i5++) {
            float f = fArr[i5];
            int i6 = i(Math.round(i * f), widthAlignment);
            int i7 = i(Math.round(i2 * f), heightAlignment);
            if (h(mediaCodecInfo, str, i6, i7)) {
                return new Size(i6, i7);
            }
        }
        int intValue = videoCapabilities.getSupportedHeightsFor(videoCapabilities.getSupportedWidths().clamp(Integer.valueOf(i)).intValue()).clamp(Integer.valueOf(i2)).intValue();
        if (intValue != i2) {
            i = i((int) Math.round((i * intValue) / i2), widthAlignment);
            i2 = i(intValue, heightAlignment);
        }
        if (h(mediaCodecInfo, str, i, i2)) {
            return new Size(i, i2);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static alog d(String str, int i) {
        char c;
        switch (str.hashCode()) {
            case -1662735862:
                if (str.equals("video/av01")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c == 3) {
                        if (i == 7) {
                            return alog.r(2);
                        }
                        if (i == 6) {
                            return alog.r(4096);
                        }
                    }
                } else {
                    if (i == 7) {
                        return alog.r(2);
                    }
                    if (i == 6) {
                        return alog.r(4096);
                    }
                }
            } else if (i == 7) {
                return alog.r(16);
            }
        } else if (i == 7 || i == 6) {
            return alog.s(4096, 8192);
        }
        int i2 = alog.d;
        return alsx.a;
    }

    public static synchronized alog e(String str) {
        alog n;
        synchronized (fwf.class) {
            j();
            n = alog.n(b.b(albo.ap(str)));
        }
        return n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static alog f(String str, eqd eqdVar) {
        boolean isAlias;
        if (eul.a >= 33 && eqdVar != null) {
            alog e = e(str);
            alog d = d(str, eqdVar.e);
            alob alobVar = new alob();
            for (int i = 0; i < e.size(); i++) {
                MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) e.get(i);
                isAlias = mediaCodecInfo.isAlias();
                if (!isAlias && (g(mediaCodecInfo, str, "hdr-editing") || (eqdVar.e == 7 && eul.a >= 35 && g(mediaCodecInfo, str, "hlg-editing")))) {
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
                        if (d.contains(Integer.valueOf(codecProfileLevel.profile))) {
                            alobVar.h(mediaCodecInfo);
                        }
                    }
                }
            }
            return alobVar.g();
        }
        int i2 = alog.d;
        return alsx.a;
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        return mediaCodecInfo.getCapabilitiesForType(str).isFeatureSupported(str2);
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str, int i, int i2) {
        if (mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().isSizeSupported(i, i2)) {
            return true;
        }
        if (i == 1920) {
            if (i2 == 1080) {
                return CamcorderProfile.hasProfile(6);
            }
            return false;
        }
        if (i == 3840 && i2 == 2160) {
            return CamcorderProfile.hasProfile(8);
        }
        return false;
    }

    private static int i(int i, int i2) {
        int i3 = i % 10;
        float f = i;
        float f2 = i2;
        if (i3 == 1) {
            return (int) (i2 * Math.floor(f / f2));
        }
        return Math.round(f / f2) * i2;
    }

    private static synchronized void j() {
        synchronized (fwf.class) {
            if (b.x()) {
                for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                    if (mediaCodecInfo.isEncoder()) {
                        for (String str : mediaCodecInfo.getSupportedTypes()) {
                            b.q(albo.ap(str), mediaCodecInfo);
                        }
                    }
                }
            }
        }
    }
}
