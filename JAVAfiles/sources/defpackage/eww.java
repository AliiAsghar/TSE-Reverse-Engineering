package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eww implements exu, exv {
    public final exw a;
    private final exq b;
    private final ezc c;

    public eww(eqp eqpVar, exw exwVar, exw exwVar2, ezc ezcVar) {
        this.a = exwVar;
        this.b = new exq(eqpVar, exwVar2, ezcVar);
        this.c = ezcVar;
    }

    @Override // defpackage.exv
    public final synchronized void a() {
        this.b.f();
    }

    @Override // defpackage.exv
    public final synchronized void b(eqq eqqVar, long j) {
        this.b.b(eqqVar, j);
    }

    @Override // defpackage.exu
    public final synchronized void d() {
        this.b.d();
    }

    @Override // defpackage.exu
    public final synchronized void u() {
        this.b.u();
        exw exwVar = this.a;
        exwVar.getClass();
        this.c.d(new ewt(exwVar, 3));
    }

    @Override // defpackage.exu
    public final void v(eqq eqqVar) {
        this.c.d(new exd(this, eqqVar, 1));
    }
}
