package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anbr {
    static final String a;
    public static final Comparator b;

    static {
        Comparator comparator;
        String concat = String.valueOf(anbr.class.getName()).concat("$UnsafeComparator");
        a = concat;
        try {
            Object[] enumConstants = Class.forName(concat).getEnumConstants();
            enumConstants.getClass();
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = anbq.a;
        }
        b = comparator;
    }

    anbr() {
    }
}
