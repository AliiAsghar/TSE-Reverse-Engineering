package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ews implements exw {
    protected final anna c;
    private exu d = new exn(1);
    public exv a = new ewr();
    public ext b = new ext() { // from class: ewp
        @Override // defpackage.ext
        public final void a(esh eshVar) {
        }
    };
    private int e = -1;
    private int f = -1;

    public ews(boolean z) {
        this.c = new anna(z, 1);
    }

    public abstract eug a(int i, int i2);

    public abstract void b(int i, long j);

    @Override // defpackage.exw
    public final void c() {
        this.c.n();
        this.d.u();
        for (int i = 0; i < this.c.a; i++) {
            this.d.d();
        }
    }

    @Override // defpackage.exw
    public final void d(eqp eqpVar, eqq eqqVar, long j) {
        try {
            if (this.e != eqqVar.d || this.f != eqqVar.e || !this.c.p()) {
                int i = eqqVar.d;
                this.e = i;
                int i2 = eqqVar.e;
                this.f = i2;
                eug a = a(i, i2);
                this.c.m(eqpVar, a.b, a.c);
            }
            eqq k = this.c.k();
            ett.u(k.c, k.d, k.e);
            if (j()) {
                ett.o();
            }
            b(eqqVar.b, j);
            this.d.v(eqqVar);
            this.a.b(k, j);
        } catch (esh | ets e) {
            new ewq(this, e, 0).run();
        }
    }

    @Override // defpackage.exw
    public void e() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Queue] */
    @Override // defpackage.exw
    public final void f(eqq eqqVar) {
        if (!this.c.d.contains(eqqVar)) {
            return;
        }
        anna annaVar = this.c;
        dzg.d(annaVar.d.contains(eqqVar));
        annaVar.d.remove(eqqVar);
        annaVar.c.add(eqqVar);
        this.d.d();
    }

    @Override // defpackage.exw
    public final void g(exu exuVar) {
        this.d = exuVar;
        for (int i = 0; i < this.c.j(); i++) {
            exuVar.d();
        }
    }

    @Override // defpackage.exw
    public final void h(exv exvVar) {
        this.a = exvVar;
    }

    @Override // defpackage.exw
    public final void i() {
        this.a.a();
    }

    public boolean j() {
        throw null;
    }

    @Override // defpackage.exw
    public final void k(ext extVar) {
        this.b = extVar;
    }
}
