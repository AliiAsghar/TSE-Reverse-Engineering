package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qsa implements qrv {
    private final puu a;
    private final anen b;

    public qsa(puu puuVar, anen anenVar) {
        this.a = puuVar;
        this.b = anenVar;
    }

    @Override // defpackage.qrv
    public final akul a(int i, msh mshVar) {
        return b(mshVar);
    }

    public final akul b(msh mshVar) {
        Optional e = mshVar.e();
        if (e.isEmpty()) {
            return aktp.ag(qry.b());
        }
        return this.a.b((qei) e.get()).h(new qda(17), this.b);
    }

    public final akul c(qei qeiVar) {
        return this.a.b(qeiVar).h(new qda(18), this.b);
    }
}
