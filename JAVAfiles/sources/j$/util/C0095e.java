package j$.util;

import j$.util.Comparator;
import java.io.Serializable;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0095e implements java.util.Comparator, Serializable, Comparator {
    private static final long serialVersionUID = -7569533591570686392L;
    private final boolean a;
    private final java.util.Comparator b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0095e(boolean z, java.util.Comparator comparator) {
        this.a = z;
        this.b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z = this.a;
        if (obj == null) {
            if (obj2 == null) {
                return 0;
            }
            if (!z) {
                return 1;
            }
            return -1;
        }
        if (obj2 == null) {
            if (z) {
                return 1;
            }
            return -1;
        }
        java.util.Comparator comparator = this.b;
        if (comparator == null) {
            return 0;
        }
        return comparator.compare(obj, obj2);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final java.util.Comparator reversed() {
        java.util.Comparator reversed;
        boolean z = !this.a;
        java.util.Comparator comparator = this.b;
        if (comparator == null) {
            reversed = null;
        } else {
            reversed = Comparator.EL.reversed(comparator);
        }
        return new C0095e(z, reversed);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(Function function) {
        java.util.Comparator thenComparing;
        thenComparing = Comparator.EL.thenComparing(this, Comparator.CC.comparing(function));
        return thenComparing;
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        java.util.Comparator thenComparing;
        thenComparing = Comparator.EL.thenComparing(this, Comparator.CC.comparingInt(toIntFunction));
        return thenComparing;
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        java.util.Comparator thenComparing;
        thenComparing = Comparator.EL.thenComparing(this, Comparator.CC.comparingLong(toLongFunction));
        return thenComparing;
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, function, comparator);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final java.util.Comparator thenComparing(java.util.Comparator comparator) {
        comparator.getClass();
        java.util.Comparator comparator2 = this.b;
        if (comparator2 != null) {
            comparator = Comparator.EL.thenComparing(comparator2, comparator);
        }
        return new C0095e(this.a, comparator);
    }
}
