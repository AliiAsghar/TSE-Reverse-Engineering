package defpackage;

import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fns {
    private static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0088, code lost:
    
        r8 = -9223372036854775807L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.aboh a(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fns.a(java.lang.String):aboh");
    }

    private static alog b(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        alob alobVar = new alob();
        do {
            String concat = str.concat(":Item");
            xmlPullParser.next();
            if (dzh.e(xmlPullParser, concat)) {
                String concat2 = str2.concat(":Mime");
                String concat3 = str2.concat(":Semantic");
                String concat4 = str2.concat(":Length");
                String concat5 = str2.concat(":Padding");
                String c2 = dzh.c(xmlPullParser, concat2);
                String c3 = dzh.c(xmlPullParser, concat3);
                String c4 = dzh.c(xmlPullParser, concat4);
                String c5 = dzh.c(xmlPullParser, concat5);
                if (c2 != null && c3 != null) {
                    if (c4 != null) {
                        j = Long.parseLong(c4);
                    } else {
                        j = 0;
                    }
                    if (c5 != null) {
                        j2 = Long.parseLong(c5);
                    } else {
                        j2 = 0;
                    }
                    alobVar.h(new mkk(c2, j, j2));
                } else {
                    return alsx.a;
                }
            }
        } while (!dzh.d(xmlPullParser, str.concat(":Directory")));
        return alobVar.g();
    }
}
