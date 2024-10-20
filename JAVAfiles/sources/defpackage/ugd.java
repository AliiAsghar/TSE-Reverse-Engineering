package defpackage;

import android.content.Context;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ugd extends ufr {
    private static volatile hkg h;
    private final xwg j;
    public static final xze g = xze.g("Bugle", "NetworkUriImageRequest");
    private static final int i = (int) TimeUnit.SECONDS.toMillis(10);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        xwg Oj();
    }

    public ugd(Context context, ugi ugiVar) {
        super(context, ugiVar);
        this.e = 0;
        this.j = ((a) akec.w(context, a.class)).Oj();
    }

    @Override // defpackage.ufr
    protected final InputStream e() {
        xyl.h();
        String uri = ((ugi) this.b).a().toString();
        try {
            return new URL(uri).openStream();
        } catch (Exception e) {
            xyo b = g.b();
            b.H("Exception trying to get inputStream for image.");
            b.z("url", uri);
            b.r(e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00da, code lost:
    
        if (r2 == null) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ufr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap h() {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ugd.h():android.graphics.Bitmap");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.net.HttpURLConnection] */
    @Override // defpackage.ufr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean o() {
        /*
            r8 = this;
            java.lang.String r0 = "url"
            defpackage.xyl.h()
            ufs r1 = r8.b
            ugi r1 = (defpackage.ugi) r1
            android.net.Uri r1 = r1.a()
            r2 = 8963(0x2303, float:1.256E-41)
            r3 = 0
            r4 = 0
            android.net.TrafficStats.setThreadStatsTag(r2)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f java.net.MalformedURLException -> L55
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f java.net.MalformedURLException -> L55
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f java.net.MalformedURLException -> L55
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f java.net.MalformedURLException -> L55
            java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f java.net.MalformedURLException -> L55
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f java.net.MalformedURLException -> L55
            r2.connect()     // Catch: java.io.IOException -> L39 java.net.MalformedURLException -> L3b java.lang.Throwable -> L73
            int r4 = r2.getResponseCode()     // Catch: java.io.IOException -> L39 java.net.MalformedURLException -> L3b java.lang.Throwable -> L73
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 != r5) goto L6a
            java.lang.String r4 = "image/gif"
            java.lang.String r5 = r2.getContentType()     // Catch: java.io.IOException -> L39 java.net.MalformedURLException -> L3b java.lang.Throwable -> L73
            boolean r3 = r4.equalsIgnoreCase(r5)     // Catch: java.io.IOException -> L39 java.net.MalformedURLException -> L3b java.lang.Throwable -> L73
            goto L6a
        L39:
            r4 = move-exception
            goto L43
        L3b:
            r4 = move-exception
            goto L59
        L3d:
            r0 = move-exception
            goto L75
        L3f:
            r2 = move-exception
            r7 = r4
            r4 = r2
            r2 = r7
        L43:
            xze r5 = defpackage.ugd.g     // Catch: java.lang.Throwable -> L73
            xyo r5 = r5.b()     // Catch: java.lang.Throwable -> L73
            java.lang.String r6 = "IOException trying to get inputStream for image."
            r5.H(r6)     // Catch: java.lang.Throwable -> L73
            r5.z(r0, r1)     // Catch: java.lang.Throwable -> L73
            r5.r(r4)     // Catch: java.lang.Throwable -> L73
            goto L6a
        L55:
            r2 = move-exception
            r7 = r4
            r4 = r2
            r2 = r7
        L59:
            xze r5 = defpackage.ugd.g     // Catch: java.lang.Throwable -> L73
            xyo r5 = r5.b()     // Catch: java.lang.Throwable -> L73
            java.lang.String r6 = "MalformedUrl for image."
            r5.H(r6)     // Catch: java.lang.Throwable -> L73
            r5.z(r0, r1)     // Catch: java.lang.Throwable -> L73
            r5.r(r4)     // Catch: java.lang.Throwable -> L73
        L6a:
            if (r2 == 0) goto L6f
            r2.disconnect()
        L6f:
            android.net.TrafficStats.clearThreadStatsTag()
            return r3
        L73:
            r0 = move-exception
            r4 = r2
        L75:
            if (r4 == 0) goto L7a
            r4.disconnect()
        L7a:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ugd.o():boolean");
    }
}
