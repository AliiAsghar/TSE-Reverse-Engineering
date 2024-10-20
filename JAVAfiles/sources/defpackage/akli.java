package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akli implements emx {
    private final eno a;
    private final akqf b;

    public akli(akqf akqfVar, eno enoVar) {
        this.a = enoVar;
        this.b = akqfVar;
    }

    @Override // defpackage.emx
    public final void d(enm enmVar) {
        akqj.j();
        try {
            this.a.e(enf.ON_CREATE);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.emx
    public final void f(enm enmVar) {
        akqj.j();
        try {
            this.a.e(enf.ON_PAUSE);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.emx
    public final void gF(enm enmVar) {
        aksa b = this.b.b();
        try {
            this.a.e(enf.ON_DESTROY);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.emx
    public final void gG(enm enmVar) {
        akqf akqfVar = this.b;
        try {
            aksa b = akqfVar.b();
            try {
                this.a.e(enf.ON_RESUME);
                b.close();
            } catch (Throwable th) {
                try {
                    b.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } finally {
            akqfVar.a = null;
            akqfVar.b = null;
        }
    }

    @Override // defpackage.emx
    public final void h(enm enmVar) {
        akqj.j();
        try {
            this.a.e(enf.ON_START);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.emx
    public final void i(enm enmVar) {
        akqj.j();
        try {
            this.a.e(enf.ON_STOP);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
