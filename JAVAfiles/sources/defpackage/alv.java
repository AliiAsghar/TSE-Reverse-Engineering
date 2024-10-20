package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alv extends aly {
    public alx a;
    public boolean b = true;

    public alv(alx alxVar) {
        this.a = alxVar;
    }

    @Override // defpackage.aly
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.aly, defpackage.cxi
    public final int d(ctd ctdVar, ctc ctcVar, int i) {
        if (this.a == alx.a) {
            return ctcVar.c(i);
        }
        return ctcVar.a(i);
    }

    @Override // defpackage.aly, defpackage.cxi
    public final int f(ctd ctdVar, ctc ctcVar, int i) {
        if (this.a == alx.a) {
            return ctcVar.c(i);
        }
        return ctcVar.a(i);
    }

    @Override // defpackage.aly
    public final long h(cuc cucVar, long j) {
        int a;
        if (this.a == alx.a) {
            a = cucVar.c(dqs.b(j));
        } else {
            a = cucVar.a(dqs.b(j));
        }
        if (a < 0) {
            a = 0;
        }
        return dqt.g(0, Integer.MAX_VALUE, a, a);
    }
}
