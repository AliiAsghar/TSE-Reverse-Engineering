package j$.util;

import j$.util.Comparator;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC0094d implements java.util.Comparator, Comparator {
    public static final EnumC0094d INSTANCE;
    private static final /* synthetic */ EnumC0094d[] a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, j$.util.d] */
    static {
        ?? r1 = new Enum("INSTANCE", 0);
        INSTANCE = r1;
        a = new EnumC0094d[]{r1};
    }

    public static EnumC0094d valueOf(String str) {
        return (EnumC0094d) Enum.valueOf(EnumC0094d.class, str);
    }

    public static EnumC0094d[] values() {
        return (EnumC0094d[]) a.clone();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final java.util.Comparator reversed() {
        return Collections.reverseOrder();
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, comparator);
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
    public final /* synthetic */ java.util.Comparator thenComparing(Function function) {
        java.util.Comparator thenComparing;
        thenComparing = Comparator.EL.thenComparing(this, Comparator.CC.comparing(function));
        return thenComparing;
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, function, comparator);
    }
}
