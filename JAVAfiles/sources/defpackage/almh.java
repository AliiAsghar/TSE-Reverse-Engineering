package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class almh extends almj {
    static final almj g(int i) {
        if (i < 0) {
            return almj.c;
        }
        if (i > 0) {
            return almj.d;
        }
        return almj.b;
    }

    @Override // defpackage.almj
    public final int a() {
        return 0;
    }

    @Override // defpackage.almj
    public final almj b(int i, int i2) {
        return g(Integer.compare(i, i2));
    }

    @Override // defpackage.almj
    public final almj c(Comparable comparable, Comparable comparable2) {
        return g(comparable.compareTo(comparable2));
    }

    @Override // defpackage.almj
    public final almj d(Object obj, Object obj2, Comparator comparator) {
        return g(comparator.compare(obj, obj2));
    }

    @Override // defpackage.almj
    public final almj e(boolean z, boolean z2) {
        return g(Boolean.compare(z, z2));
    }

    @Override // defpackage.almj
    public final almj f(boolean z, boolean z2) {
        return g(Boolean.compare(z2, z));
    }
}
