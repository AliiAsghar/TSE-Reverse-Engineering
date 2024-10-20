package defpackage;

import java.security.cert.CertificateEncodingException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class asuh extends CertificateEncodingException {
    private final Throwable a;

    public asuh(Throwable th) {
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
