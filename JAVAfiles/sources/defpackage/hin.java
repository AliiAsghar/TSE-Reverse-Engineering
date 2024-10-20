package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hin {
    public int a;
    public final Context b;
    public final String c;
    public IGetInstallReferrerService d;
    public ServiceConnection e;

    public hin() {
        throw null;
    }

    public final boolean a() {
        if (this.a == 2 && this.d != null && this.e != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (defpackage.ebg.a("UpsideDownCake", r0) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public hin(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.a = r0
            android.content.Context r0 = r4.getApplicationContext()
            r3.b = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 >= r1) goto L25
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r0 < r2) goto L49
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            r0.getClass()
            java.lang.String r2 = "UpsideDownCake"
            boolean r0 = defpackage.ebg.a(r2, r0)
            if (r0 == 0) goto L49
        L25:
            int r0 = defpackage.anf$$ExternalSyntheticApiModelOutline0.m(r1)
            r1 = 8
            if (r0 < r1) goto L49
            boolean r0 = defpackage.bo$$ExternalSyntheticApiModelOutline0.m118m()
            if (r0 == 0) goto L44
            java.lang.Class r0 = defpackage.a$$ExternalSyntheticApiModelOutline0.m$7()
            java.lang.Object r4 = r4.getSystemService(r0)
            android.app.sdksandbox.sdkprovider.SdkSandboxController r4 = defpackage.a$$ExternalSyntheticApiModelOutline0.m(r4)
            java.lang.String r4 = defpackage.dbc$$ExternalSyntheticApiModelOutline0.m(r4)
            goto L4d
        L44:
            java.lang.String r4 = r4.getPackageName()
            goto L4d
        L49:
            java.lang.String r4 = r4.getPackageName()
        L4d:
            r3.c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hin.<init>(android.content.Context):void");
    }
}
