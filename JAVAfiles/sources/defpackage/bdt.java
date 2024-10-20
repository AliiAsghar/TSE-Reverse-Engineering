package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdt {
    public static final bco a(bco bcoVar, bco bcoVar2) {
        bco bcoVar3 = bco.a;
        int ordinal = bcoVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new armm();
                }
            } else {
                int ordinal2 = bcoVar.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            throw new armm();
                        }
                    } else {
                        return bco.b;
                    }
                } else {
                    return bco.a;
                }
            }
            return bco.c;
        }
        return bco.a;
    }

    public static final dqh b(diy diyVar, int i) {
        if (diyVar.a.a.a() != 0) {
            int g = diyVar.g(i);
            if ((i != 0 && g == diyVar.g(i - 1)) || (i != diyVar.a.a.a() && g == diyVar.g(i + 1))) {
                return diyVar.p(i);
            }
        }
        return diyVar.q(i);
    }
}
