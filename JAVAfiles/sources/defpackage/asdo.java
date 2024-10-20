package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asdo extends asdj {
    private final Iterable d;

    public asdo(Iterable iterable, arpi arpiVar, int i, int i2) {
        super(arpiVar, i, i2);
        this.d = iterable;
    }

    @Override // defpackage.asdj
    public final Object b(arzu arzuVar, arpe arpeVar) {
        asec asecVar = new asec(arzuVar);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            arrn.J(arzuVar, null, null, new albt((asai) it.next(), asecVar, (arpe) null, 2), 3);
        }
        return arnb.a;
    }

    @Override // defpackage.asdj
    protected final asdj c(arpi arpiVar, int i, int i2) {
        return new asdo(this.d, arpiVar, i, i2);
    }

    @Override // defpackage.asdj
    public final arzw e(arwe arweVar) {
        return arhi.o(arweVar, this.a, this.b, new akgp((asdj) this, (arpe) null, 6));
    }
}
