package defpackage;

import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffp {
    public static final /* synthetic */ int a = 0;
    private static final HashMap b = new HashMap();

    public static ffe a() {
        List c = c("audio/raw", false, false);
        if (c.isEmpty()) {
            return null;
        }
        return (ffe) c.get(0);
    }

    public static String b(eqn eqnVar) {
        Pair a2;
        if ("audio/eac3-joc".equals(eqnVar.o)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(eqnVar.o) && (a2 = etj.a(eqnVar)) != null) {
            int intValue = ((Integer) a2.first).intValue();
            if (intValue != 16 && intValue != 256) {
                if (intValue == 512) {
                    return "video/avc";
                }
                if (intValue == 1024) {
                    return "video/av01";
                }
            } else {
                return "video/hevc";
            }
        }
        if (!"video/mv-hevc".equals(eqnVar.o)) {
            return null;
        }
        return "video/hevc";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r8 != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0120 A[Catch: Exception -> 0x01be, all -> 0x0236, TryCatch #1 {Exception -> 0x01be, blocks: (B:31:0x00e9, B:35:0x0104, B:39:0x011a, B:41:0x0120, B:42:0x0132, B:44:0x013b, B:45:0x015c, B:47:0x0160, B:49:0x0164, B:53:0x0173, B:55:0x017a, B:58:0x0187, B:61:0x018f, B:76:0x013f, B:78:0x014f, B:80:0x0157, B:81:0x0127), top: B:30:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013b A[Catch: Exception -> 0x01be, all -> 0x0236, TryCatch #1 {Exception -> 0x01be, blocks: (B:31:0x00e9, B:35:0x0104, B:39:0x011a, B:41:0x0120, B:42:0x0132, B:44:0x013b, B:45:0x015c, B:47:0x0160, B:49:0x0164, B:53:0x0173, B:55:0x017a, B:58:0x0187, B:61:0x018f, B:76:0x013f, B:78:0x014f, B:80:0x0157, B:81:0x0127), top: B:30:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0160 A[Catch: Exception -> 0x01be, all -> 0x0236, TryCatch #1 {Exception -> 0x01be, blocks: (B:31:0x00e9, B:35:0x0104, B:39:0x011a, B:41:0x0120, B:42:0x0132, B:44:0x013b, B:45:0x015c, B:47:0x0160, B:49:0x0164, B:53:0x0173, B:55:0x017a, B:58:0x0187, B:61:0x018f, B:76:0x013f, B:78:0x014f, B:80:0x0157, B:81:0x0127), top: B:30:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013f A[Catch: Exception -> 0x01be, all -> 0x0236, TryCatch #1 {Exception -> 0x01be, blocks: (B:31:0x00e9, B:35:0x0104, B:39:0x011a, B:41:0x0120, B:42:0x0132, B:44:0x013b, B:45:0x015c, B:47:0x0160, B:49:0x0164, B:53:0x0173, B:55:0x017a, B:58:0x0187, B:61:0x018f, B:76:0x013f, B:78:0x014f, B:80:0x0157, B:81:0x0127), top: B:30:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0127 A[Catch: Exception -> 0x01be, all -> 0x0236, TryCatch #1 {Exception -> 0x01be, blocks: (B:31:0x00e9, B:35:0x0104, B:39:0x011a, B:41:0x0120, B:42:0x0132, B:44:0x013b, B:45:0x015c, B:47:0x0160, B:49:0x0164, B:53:0x0173, B:55:0x017a, B:58:0x0187, B:61:0x018f, B:76:0x013f, B:78:0x014f, B:80:0x0157, B:81:0x0127), top: B:30:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized java.util.List c(java.lang.String r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffp.c(java.lang.String, boolean, boolean):java.util.List");
    }

    public static List d(List list, final eqn eqnVar) {
        ArrayList arrayList = new ArrayList(list);
        g(arrayList, new ffo() { // from class: ffl
            @Override // defpackage.ffo
            public final int a(Object obj) {
                ffe ffeVar = (ffe) obj;
                int i = ffp.a;
                eqn eqnVar2 = eqn.this;
                if (!ffeVar.e(eqnVar2) || !ffeVar.c(eqnVar2, false)) {
                    return 0;
                }
                return 1;
            }
        });
        return arrayList;
    }

    public static List e(eqn eqnVar, boolean z, boolean z2) {
        String b2 = b(eqnVar);
        if (b2 == null) {
            int i = alog.d;
            return alsx.a;
        }
        return c(b2, z, z2);
    }

    public static List f(eqn eqnVar, boolean z, boolean z2) {
        List c = c(eqnVar.o, z, z2);
        List e = e(eqnVar, z, z2);
        alob alobVar = new alob();
        alobVar.j(c);
        alobVar.j(e);
        return alobVar.g();
    }

    private static void g(List list, ffo ffoVar) {
        Collections.sort(list, new kdw(ffoVar, 1));
    }

    private static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (eul.a < 29) {
            if (erl.g(str)) {
                return true;
            }
            String ap = albo.ap(mediaCodecInfo.getName());
            if (ap.startsWith("arc.")) {
                return false;
            }
            if (ap.startsWith("omx.google.") || ap.startsWith("omx.ffmpeg.")) {
                return true;
            }
            if ((ap.startsWith("omx.sec.") && ap.contains(".sw.")) || ap.equals("omx.qcom.video.decoder.hevcswvdec") || ap.startsWith("c2.android.") || ap.startsWith("c2.google.")) {
                return true;
            }
            if (!ap.startsWith("omx.") && !ap.startsWith("c2.")) {
                return true;
            }
            return false;
        }
        isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
        return isSoftwareOnly;
    }
}
