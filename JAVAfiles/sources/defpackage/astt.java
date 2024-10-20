package defpackage;

import java.security.cert.CertificateException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class astt extends CertificateException {
    private final Throwable a;

    public astt(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
