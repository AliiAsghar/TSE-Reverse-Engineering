package defpackage;

import j$.util.Comparator;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aroz implements Comparator, j$.util.Comparator {
    private final /* synthetic */ int c;
    public static final aroz b = new aroz(1);
    public static final aroz a = new aroz(0);

    private aroz(int i) {
        this.c = i;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        if (this.c != 0) {
            Comparable comparable = (Comparable) obj;
            Comparable comparable2 = (Comparable) obj2;
            comparable.getClass();
            comparable2.getClass();
            return comparable.compareTo(comparable2);
        }
        Comparable comparable3 = (Comparable) obj;
        Comparable comparable4 = (Comparable) obj2;
        comparable3.getClass();
        comparable4.getClass();
        return comparable4.compareTo(comparable3);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final Comparator reversed() {
        if (this.c != 0) {
            return a;
        }
        return b;
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ Comparator thenComparing(Comparator comparator) {
        return this.c != 0 ? Comparator.CC.$default$thenComparing(this, comparator) : Comparator.CC.$default$thenComparing(this, comparator);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        if (this.c != 0) {
            return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
        }
        return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        java.util.Comparator thenComparing;
        java.util.Comparator thenComparing2;
        if (this.c != 0) {
            thenComparing2 = Comparator.EL.thenComparing(this, Comparator.CC.comparingInt(toIntFunction));
            return thenComparing2;
        }
        thenComparing = Comparator.EL.thenComparing(this, Comparator.CC.comparingInt(toIntFunction));
        return thenComparing;
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        java.util.Comparator thenComparing;
        java.util.Comparator thenComparing2;
        if (this.c != 0) {
            thenComparing2 = Comparator.EL.thenComparing(this, Comparator.CC.comparingLong(toLongFunction));
            return thenComparing2;
        }
        thenComparing = Comparator.EL.thenComparing(this, Comparator.CC.comparingLong(toLongFunction));
        return thenComparing;
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(Function function) {
        java.util.Comparator thenComparing;
        java.util.Comparator thenComparing2;
        if (this.c != 0) {
            thenComparing2 = Comparator.EL.thenComparing(this, Comparator.CC.comparing(function));
            return thenComparing2;
        }
        thenComparing = Comparator.EL.thenComparing(this, Comparator.CC.comparing(function));
        return thenComparing;
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
        return this.c != 0 ? Comparator.CC.$default$thenComparing(this, function, comparator) : Comparator.CC.$default$thenComparing(this, function, comparator);
    }
}
