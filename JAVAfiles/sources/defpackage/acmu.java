package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabase;
import java.io.File;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acmu extends acmw {
    public final int a;
    private final BusinessInfoDatabase e;
    private final adih f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public acmu(java.lang.String r2, android.content.Context r3, int r4, com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabase r5, defpackage.adih r6) {
        /*
            r1 = this;
            java.lang.String r0 = r5.getLocalMediaPath(r2, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Ld
            acmz r0 = defpackage.acmz.INFO_LOCALLY_AVAILABLE
            goto Lf
        Ld:
            acmz r0 = defpackage.acmz.AVAILABILITY_UNKNOWN
        Lf:
            r1.<init>(r2, r3, r0)
            r1.e = r5
            r1.a = r4
            r1.f = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acmu.<init>(java.lang.String, android.content.Context, int, com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabase, adih):void");
    }

    private static final void g(File file) {
        advr.k("Deleting business media temp file %s", advr.a(file));
        if (!file.delete()) {
            advr.g("Unable to delete temporary business media file %s", advr.a(file));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x009a, code lost:
    
        if (r11 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009c, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cb, code lost:
    
        if (r11 != null) goto L15;
     */
    @Override // defpackage.acmw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final defpackage.acmz a(javax.net.ssl.HttpsURLConnection r11) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acmu.a(javax.net.ssl.HttpsURLConnection):acmz");
    }

    @Override // defpackage.acmw
    public final String b() {
        return String.format(dzf.c(this.c.getResources().getConfiguration()).f(0), "%s_%d", this.b, Integer.valueOf(this.a));
    }

    @Override // defpackage.acmw
    public final String c() {
        return this.e.getRemoteMediaPath(this.b, this.a);
    }

    @Override // defpackage.acmw
    protected final boolean e() {
        return false;
    }

    @Override // defpackage.acmw
    protected final void d(HttpsURLConnection httpsURLConnection) {
    }
}
