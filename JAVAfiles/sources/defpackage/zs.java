package defpackage;

import defpackage.abb;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zs {
    public static final abb a(arqr arqrVar) {
        abb.b bVar = new abb.b();
        arqrVar.a(bVar);
        return new abb(bVar);
    }

    public static /* synthetic */ aaw b(aaj aajVar, abj abjVar, int i) {
        if ((i & 2) != 0) {
            abjVar = abj.a;
        }
        return new aaw(aajVar, abjVar);
    }

    public static /* synthetic */ abm c(float f, float f2, Object obj, int i) {
        if (1 == (i & 1)) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new abm(f, f2, obj);
    }

    public static /* synthetic */ acf d(int i, int i2, aak aakVar, int i3) {
        if ((i3 & 4) != 0) {
            aakVar = aao.a;
        }
        int i4 = i3 & 2;
        int i5 = i3 & 1;
        if (i4 != 0) {
            i2 = 0;
        }
        if (1 == i5) {
            i = 300;
        }
        return new acf(i, i2, aakVar);
    }
}
