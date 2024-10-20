package j$.time;

import j$.time.chrono.AbstractC0077h;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class i implements TemporalAccessor, j$.time.temporal.k {
    public static final i APRIL;
    public static final i AUGUST;
    public static final i DECEMBER;
    public static final i FEBRUARY;
    public static final i JANUARY;
    public static final i JULY;
    public static final i JUNE;
    public static final i MARCH;
    public static final i MAY;
    public static final i NOVEMBER;
    public static final i OCTOBER;
    public static final i SEPTEMBER;
    private static final i[] a;
    private static final /* synthetic */ i[] b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Enum, j$.time.i] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, j$.time.i] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Enum, j$.time.i] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Enum, j$.time.i] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, j$.time.i] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, j$.time.i] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, j$.time.i] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, j$.time.i] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, j$.time.i] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, j$.time.i] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, j$.time.i] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, j$.time.i] */
    static {
        ?? r12 = new Enum("JANUARY", 0);
        JANUARY = r12;
        ?? r13 = new Enum("FEBRUARY", 1);
        FEBRUARY = r13;
        ?? r14 = new Enum("MARCH", 2);
        MARCH = r14;
        ?? r15 = new Enum("APRIL", 3);
        APRIL = r15;
        ?? r9 = new Enum("MAY", 4);
        MAY = r9;
        ?? r8 = new Enum("JUNE", 5);
        JUNE = r8;
        ?? r7 = new Enum("JULY", 6);
        JULY = r7;
        ?? r6 = new Enum("AUGUST", 7);
        AUGUST = r6;
        ?? r5 = new Enum("SEPTEMBER", 8);
        SEPTEMBER = r5;
        ?? r4 = new Enum("OCTOBER", 9);
        OCTOBER = r4;
        ?? r3 = new Enum("NOVEMBER", 10);
        NOVEMBER = r3;
        ?? r2 = new Enum("DECEMBER", 11);
        DECEMBER = r2;
        b = new i[]{r12, r13, r14, r15, r9, r8, r7, r6, r5, r4, r3, r2};
        a = values();
    }

    public static i d0(int i) {
        if (i >= 1 && i <= 12) {
            return a[i - 1];
        }
        throw new RuntimeException("Invalid value for MonthOfYear: " + i);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) b.clone();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.j.e()) {
            return j$.time.chrono.t.d;
        }
        if (nVar == j$.time.temporal.j.j()) {
            return ChronoUnit.MONTHS;
        }
        return j$.time.temporal.j.c(this, nVar);
    }

    @Override // j$.time.temporal.k
    public final Temporal G(Temporal temporal) {
        if (AbstractC0077h.q(temporal).equals(j$.time.chrono.t.d)) {
            return temporal.c(getValue(), ChronoField.MONTH_OF_YEAR);
        }
        throw new RuntimeException("Adjustment only supported on ISO date-time");
    }

    public final int a0(boolean z) {
        switch (ordinal()) {
            case 0:
                return 1;
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 60;
            case 3:
                return (z ? 1 : 0) + 91;
            case 4:
                return (z ? 1 : 0) + 121;
            case 5:
                return (z ? 1 : 0) + 152;
            case 6:
                return (z ? 1 : 0) + 182;
            case 7:
                return (z ? 1 : 0) + 213;
            case 8:
                return (z ? 1 : 0) + 244;
            case 9:
                return (z ? 1 : 0) + 274;
            case 10:
                return (z ? 1 : 0) + 305;
            default:
                return (z ? 1 : 0) + 335;
        }
    }

    public final int b0(boolean z) {
        int ordinal = ordinal();
        if (ordinal != 1) {
            if (ordinal != 3 && ordinal != 5 && ordinal != 8 && ordinal != 10) {
                return 31;
            }
            return 30;
        }
        if (z) {
            return 29;
        }
        return 28;
    }

    public final int c0() {
        int ordinal = ordinal();
        if (ordinal != 1) {
            if (ordinal != 3 && ordinal != 5 && ordinal != 8 && ordinal != 10) {
                return 31;
            }
            return 30;
        }
        return 29;
    }

    public final i e0() {
        return a[((((int) 1) + 12) + ordinal()) % 12];
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField != ChronoField.MONTH_OF_YEAR) {
                return false;
            }
            return true;
        }
        if (temporalField == null || !temporalField.y(this)) {
            return false;
        }
        return true;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return getValue();
        }
        return j$.time.temporal.j.a(this, temporalField);
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p u(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return temporalField.n();
        }
        return j$.time.temporal.j.d(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return getValue();
        }
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.u(this);
        }
        throw new RuntimeException("Unsupported field: ".concat(String.valueOf(temporalField)));
    }
}
