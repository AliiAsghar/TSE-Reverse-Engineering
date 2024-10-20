package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkl {
    public final fkh a;
    public esn d;
    public long f;
    public final qdq j;
    public final fkf b = new fkf();
    public final fxg h = new fxg((byte[]) null);
    public final fxg i = new fxg((byte[]) null);
    public final euc c = new euc(16);
    public esn e = esn.a;
    public long g = -9223372036854775807L;

    public fkl(qdq qdqVar, fkh fkhVar) {
        this.j = qdqVar;
        this.a = fkhVar;
    }

    private static Object b(fxg fxgVar) {
        boolean z;
        if (fxgVar.d() > 0) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        while (fxgVar.d() > 1) {
            fxgVar.f();
        }
        Object f = fxgVar.f();
        dzg.g(f);
        return f;
    }

    public final void a() {
        this.c.d();
        this.g = -9223372036854775807L;
        fxg fxgVar = this.i;
        if (fxgVar.d() > 0) {
            Long l = (Long) b(fxgVar);
            l.longValue();
            this.i.h(0L, l);
        }
        if (this.d == null) {
            fxg fxgVar2 = this.h;
            if (fxgVar2.d() > 0) {
                this.d = (esn) b(fxgVar2);
                return;
            }
            return;
        }
        this.h.i();
    }
}
