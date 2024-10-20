package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyv extends eyw {
    public exq a;
    public qdq b;
    private eqo c;
    private final eqp d;

    public eyv(eqp eqpVar, ezc ezcVar) {
        super(ezcVar);
        this.d = eqpVar;
    }

    @Override // defpackage.eyw
    public final int a() {
        exq exqVar = this.a;
        dzg.g(exqVar);
        return exqVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eyw
    public final synchronized void b() {
        exq exqVar = this.a;
        dzg.g(exqVar);
        exqVar.u();
        super.b();
    }

    @Override // defpackage.eyw, defpackage.exu
    public final void d() {
        dzg.g(this.a);
        exq exqVar = this.a;
        exqVar.getClass();
        this.l.d(new ewt(exqVar, 19));
    }

    @Override // defpackage.eyw
    public final void f(exw exwVar) {
        this.a = new exq(this.d, exwVar, this.l);
    }

    @Override // defpackage.eyw
    public final void g() {
        this.l.d(new ewt(this, 18));
    }

    @Override // defpackage.eyw
    public final void q(eqo eqoVar, boolean z) {
        this.c = eqoVar;
    }

    @Override // defpackage.eyw, defpackage.exu
    public final void v(eqq eqqVar) {
        this.l.d(new exd(this, eqqVar, 6));
    }

    @Override // defpackage.eyw
    public final void w(final int i, final long j) {
        final eqo eqoVar = this.c;
        dzg.g(eqoVar);
        dzg.g(this.b);
        this.l.d(new ezb() { // from class: eyu
            @Override // defpackage.ezb
            public final void a() {
                int i2 = i;
                eqo eqoVar2 = eqoVar;
                eqq eqqVar = new eqq(i2, -1, eqoVar2.b, eqoVar2.c);
                exq exqVar = eyv.this.a;
                dzg.g(exqVar);
                exqVar.b(eqqVar, j);
                int i3 = ewx.a;
            }
        });
    }

    @Override // defpackage.eyw
    public final void x(qdq qdqVar) {
        this.b = qdqVar;
    }

    @Override // defpackage.eyw
    public final void e() {
    }
}
