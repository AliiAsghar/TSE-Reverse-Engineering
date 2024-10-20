package defpackage;

import java.security.cert.CRLException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class astv extends CRLException {
    final Throwable a;

    public astv(Throwable th) {
        super("Exception reading IssuingDistributionPoint");
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
