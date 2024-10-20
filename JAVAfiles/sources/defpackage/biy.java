package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class biy {
    public static final acf a = new acf(15, aao.d, 2);

    @armg
    public static final aev a(boolean z, float f, bwj bwjVar, int i, int i2) {
        boolean z2;
        boolean z3;
        cas a2 = cap.a(new cku(cku.h), bwjVar);
        boolean z4 = false;
        if (1 != ((z ? 1 : 0) | (i2 & 1))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if ((((i & 14) ^ 6) > 4 && bwjVar.H(z2)) || (i & 6) == 4) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i2 & 2) != 0) {
            f = Float.NaN;
        }
        if ((((i & 112) ^ 48) > 32 && bwjVar.D(f)) || (i & 48) == 32) {
            z4 = true;
        }
        boolean z5 = z3 | z4;
        bwk bwkVar = (bwk) bwjVar;
        Object T = bwkVar.T();
        if (z5 || T == bwj.a.a) {
            T = new bil(z2, f, a2);
            bwkVar.ad(T);
        }
        return (bil) T;
    }
}
