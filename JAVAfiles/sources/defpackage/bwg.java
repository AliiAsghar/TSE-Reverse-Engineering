package defpackage;

import defpackage.bwk;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwg {
    public static final int a(bwj bwjVar) {
        return bwjVar.a();
    }

    public static final bze b(bwj bwjVar) {
        bzf R = ((bwk) bwjVar).R();
        if (R != null) {
            R.o();
            return R;
        }
        throw new IllegalStateException("no recompose scope found");
    }

    public static final bwr c(bwj bwjVar) {
        bwk.a aVar;
        bwk bwkVar = (bwk) bwjVar;
        bwkVar.ac(206, bwp.e);
        if (bwkVar.y) {
            cae.X(bwkVar.t);
        }
        Object S = bwkVar.S();
        if (S instanceof bwk.a) {
            aVar = (bwk.a) S;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            aVar = new bwk.a(new bwk.b(bwkVar.z, bwkVar.h, bwkVar.p));
            bwkVar.af(aVar);
        }
        aVar.a.b.h(bwkVar.P());
        bwkVar.Y();
        return aVar.a;
    }
}
