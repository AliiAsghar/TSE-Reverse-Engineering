package defpackage;

import java.security.cert.CRLException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class asud extends CRLException {
    private final Throwable a;

    public asud(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }

    public asud(Throwable th) {
        this.a = th;
    }
}
