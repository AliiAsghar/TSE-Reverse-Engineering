package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fud implements fuh {
    private eqn a;
    private euj b;
    private fmq c;

    public fud(String str) {
        eqm eqmVar = new eqm();
        eqmVar.b(str);
        this.a = new eqn(eqmVar);
    }

    @Override // defpackage.fuh
    public final void a(euf eufVar) {
        dzg.h(this.b);
        int i = eul.a;
        long e = this.b.e();
        long f = this.b.f();
        if (e != -9223372036854775807L && f != -9223372036854775807L) {
            eqn eqnVar = this.a;
            if (f != eqnVar.t) {
                eqm eqmVar = new eqm(eqnVar);
                eqmVar.r = f;
                eqn eqnVar2 = new eqn(eqmVar);
                this.a = eqnVar2;
                this.c.h(eqnVar2);
            }
            int b = eufVar.b();
            this.c.l(eufVar, b);
            this.c.n(e, 1, b, 0, null);
        }
    }

    @Override // defpackage.fuh
    public final void b(euj eujVar, flw flwVar, fuq fuqVar) {
        this.b = eujVar;
        fuqVar.c();
        fmq p = flwVar.p(fuqVar.a(), 5);
        this.c = p;
        p.h(this.a);
    }
}
