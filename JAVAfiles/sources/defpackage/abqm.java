package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abqm {
    public static final abqm a = new abqm(true, null, null);
    public final boolean b;
    final String c;
    final Throwable d;

    public abqm(boolean z, String str, Throwable th) {
        this.b = z;
        this.c = str;
        this.d = th;
    }

    public String a() {
        return this.c;
    }

    public final void b() {
        if (!this.b && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.d != null) {
                Log.d("GoogleCertificatesRslt", a(), this.d);
            } else {
                Log.d("GoogleCertificatesRslt", a());
            }
        }
    }

    public final void c() {
        if (!this.b) {
            String str = "GoogleCertificatesRslt: " + a() + " (go/gsrlt)";
            Throwable th = this.d;
            if (th != null) {
                throw new SecurityException(str, th);
            }
            throw new SecurityException(str);
        }
    }
}
