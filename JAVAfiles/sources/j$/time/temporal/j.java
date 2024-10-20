package j$.time.temporal;

import j$.util.Objects;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class j {
    static final n a = new m(1);
    static final n b = new m(2);
    static final n c = new m(3);
    static final n d = new m(4);
    static final n e = new m(5);
    static final n f = new m(6);
    static final n g = new m(7);

    public static int a(TemporalAccessor temporalAccessor, TemporalField temporalField) {
        p u = temporalAccessor.u(temporalField);
        if (u.h()) {
            long y = temporalAccessor.y(temporalField);
            if (u.i(y)) {
                return (int) y;
            }
            throw new RuntimeException("Invalid value for " + String.valueOf(temporalField) + " (valid values " + String.valueOf(u) + "): " + y);
        }
        throw new RuntimeException("Invalid field " + String.valueOf(temporalField) + " for get() method, use getLong() instead");
    }

    public static Temporal b(Temporal temporal, long j, TemporalUnit temporalUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            temporal = temporal.d(Long.MAX_VALUE, temporalUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return temporal.d(j2, temporalUnit);
    }

    public static Object c(TemporalAccessor temporalAccessor, n nVar) {
        if (nVar != a && nVar != b && nVar != c) {
            return nVar.g(temporalAccessor);
        }
        return null;
    }

    public static p d(TemporalAccessor temporalAccessor, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalAccessor.f(temporalField)) {
                return ((ChronoField) temporalField).n();
            }
            throw new RuntimeException("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
        Objects.a(temporalField, "field");
        return temporalField.G(temporalAccessor);
    }

    public static n e() {
        return b;
    }

    public static n f() {
        return f;
    }

    public static n g() {
        return g;
    }

    public static /* synthetic */ int h(int i) {
        int i2 = i % 7;
        if (i2 == 0) {
            return 0;
        }
        if ((((i ^ 7) >> 31) | 1) <= 0) {
            return i2 + 7;
        }
        return i2;
    }

    public static n i() {
        return d;
    }

    public static n j() {
        return c;
    }

    public static n k() {
        return e;
    }

    public static n l() {
        return a;
    }
}
