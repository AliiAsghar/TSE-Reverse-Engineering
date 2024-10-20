package defpackage;

import defpackage.dqs;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alz extends aly {
    public alx a;
    public boolean b = true;

    public alz(alx alxVar) {
        this.a = alxVar;
    }

    @Override // defpackage.aly
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.aly, defpackage.cxi
    public final int e(ctd ctdVar, ctc ctcVar, int i) {
        if (this.a == alx.a) {
            return ctcVar.d(i);
        }
        return ctcVar.b(i);
    }

    @Override // defpackage.aly, defpackage.cxi
    public final int g(ctd ctdVar, ctc ctcVar, int i) {
        if (this.a == alx.a) {
            return ctcVar.d(i);
        }
        return ctcVar.b(i);
    }

    @Override // defpackage.aly
    public final long h(cuc cucVar, long j) {
        int b;
        if (this.a == alx.a) {
            b = cucVar.d(dqs.a(j));
        } else {
            b = cucVar.b(dqs.a(j));
        }
        if (b < 0) {
            b = 0;
        }
        return dqs.a.d(b);
    }
}
