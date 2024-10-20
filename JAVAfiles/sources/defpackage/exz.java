package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exz implements exv, exu {
    public boolean a;
    private final eww b;

    public exz(eqp eqpVar, exw exwVar, exw exwVar2, ezc ezcVar) {
        this.b = new eww(eqpVar, exwVar, exwVar2, ezcVar);
    }

    @Override // defpackage.exv
    public final synchronized void a() {
        if (this.a) {
            this.b.a();
        }
    }

    @Override // defpackage.exv
    public final synchronized void b(eqq eqqVar, long j) {
        if (this.a) {
            this.b.b(eqqVar, j);
        }
    }

    @Override // defpackage.exu
    public final void d() {
        if (this.a) {
            this.b.d();
        }
    }

    @Override // defpackage.exu
    public final synchronized void u() {
        if (this.a) {
            this.b.u();
        }
    }

    @Override // defpackage.exu
    public final void v(eqq eqqVar) {
        if (this.a) {
            this.b.v(eqqVar);
        }
    }
}
