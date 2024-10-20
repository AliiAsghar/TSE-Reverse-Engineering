package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class puk implements puu {
    public final puu a;
    private final arwe b;
    private final qxr c;

    public puk(puu puuVar, qxr qxrVar, arwe arweVar) {
        qxrVar.getClass();
        arweVar.getClass();
        this.a = puuVar;
        this.c = qxrVar;
        this.b = arweVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
    @Override // defpackage.puu
    public final akul a(Iterable iterable) {
        boolean z;
        List alqvVar;
        akul c;
        iterable.getClass();
        List ax = aqjn.ax(iterable);
        int longValue = (int) ((Number) this.c.e.b()).longValue();
        if (longValue > 0) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        if (ax instanceof RandomAccess) {
            alqvVar = new alqw(ax, longValue);
        } else {
            alqvVar = new alqv(ax, longValue);
        }
        c = qjh.c(this.b, arpj.a, arwf.a, new ylz(alqvVar, this, (arpe) null, 1));
        return c;
    }

    @Override // defpackage.puu
    public final akul b(qei qeiVar) {
        qeiVar.getClass();
        return this.a.b(qeiVar);
    }
}
