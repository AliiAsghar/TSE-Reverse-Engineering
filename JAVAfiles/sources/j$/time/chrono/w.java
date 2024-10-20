package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class w extends AbstractC0070a implements Serializable {
    public static final w d = new w();
    private static final long serialVersionUID = 459996390165777884L;

    private w() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0071b A(int i, int i2) {
        return new y(LocalDate.r0(i, i2));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0071b M(int i, int i2, int i3) {
        return new y(LocalDate.of(i, i2, i3));
    }

    @Override // j$.time.chrono.AbstractC0070a, j$.time.chrono.m
    public final InterfaceC0071b P(Map map, j$.time.format.F f) {
        return (y) super.P(map, f);
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.p Q(ChronoField chronoField) {
        switch (v.a[chronoField.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new RuntimeException("Unsupported field: ".concat(String.valueOf(chronoField)));
            case 5:
                return j$.time.temporal.p.k(1L, z.s(), 999999999 - z.l().m().j0());
            case 6:
                return j$.time.temporal.p.k(1L, z.r(), ChronoField.DAY_OF_YEAR.n().d());
            case 7:
                return j$.time.temporal.p.j(y.d.j0(), 999999999L);
            case 8:
                return j$.time.temporal.p.j(z.d.getValue(), z.l().getValue());
            default:
                return chronoField.n();
        }
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0079j R(Instant instant, ZoneId zoneId) {
        return l.b0(this, instant, zoneId);
    }

    @Override // j$.time.chrono.m
    public final List T() {
        return j$.desugar.sun.nio.fs.g.b(z.v());
    }

    @Override // j$.time.chrono.m
    public final boolean W(long j) {
        return t.d.W(j);
    }

    @Override // j$.time.chrono.m
    public final n X(int i) {
        return z.q(i);
    }

    @Override // j$.time.chrono.AbstractC0070a
    final InterfaceC0071b b0(Map map, j$.time.format.F f) {
        LocalDate r0;
        y j0;
        int i = 0;
        ChronoField chronoField = ChronoField.ERA;
        Long l = (Long) map.get(chronoField);
        z q = l != null ? z.q(Q(chronoField).a(l.longValue(), chronoField)) : null;
        ChronoField chronoField2 = ChronoField.YEAR_OF_ERA;
        Long l2 = (Long) map.get(chronoField2);
        int a = l2 != null ? Q(chronoField2).a(l2.longValue(), chronoField2) : 0;
        if (q == null && l2 != null && !map.containsKey(ChronoField.YEAR) && f != j$.time.format.F.STRICT) {
            q = z.v()[z.v().length - 1];
        }
        if (l2 != null && q != null) {
            ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
            if (map.containsKey(chronoField3)) {
                ChronoField chronoField4 = ChronoField.DAY_OF_MONTH;
                if (map.containsKey(chronoField4)) {
                    map.remove(chronoField);
                    map.remove(chronoField2);
                    if (f == j$.time.format.F.LENIENT) {
                        return new y(LocalDate.of((q.m().j0() + a) - 1, 1, 1)).g0(j$.nio.channels.c.k(((Long) map.remove(chronoField3)).longValue(), 1L), ChronoUnit.MONTHS).g0(j$.nio.channels.c.k(((Long) map.remove(chronoField4)).longValue(), 1L), ChronoUnit.DAYS);
                    }
                    int a2 = Q(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                    int a3 = Q(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4);
                    if (f != j$.time.format.F.SMART) {
                        LocalDate localDate = y.d;
                        LocalDate of = LocalDate.of((q.m().j0() + a) - 1, a2, a3);
                        if (!of.k0(q.m()) && q == z.g(of)) {
                            return new y(q, a, of);
                        }
                        throw new RuntimeException("year, month, and day not valid for Era");
                    }
                    if (a >= 1) {
                        int j02 = (q.m().j0() + a) - 1;
                        try {
                            j0 = new y(LocalDate.of(j02, a2, a3));
                        } catch (DateTimeException unused) {
                            j0 = new y(LocalDate.of(j02, a2, 1)).j0(new j$.time.temporal.m(i));
                        }
                        if (j0.f0() == q || j$.time.temporal.j.a(j0, ChronoField.YEAR_OF_ERA) <= 1 || a <= 1) {
                            return j0;
                        }
                        throw new RuntimeException("Invalid YearOfEra for Era: " + String.valueOf(q) + " " + a);
                    }
                    throw new RuntimeException("Invalid YearOfEra: " + a);
                }
            }
            ChronoField chronoField5 = ChronoField.DAY_OF_YEAR;
            if (map.containsKey(chronoField5)) {
                map.remove(chronoField);
                map.remove(chronoField2);
                if (f == j$.time.format.F.LENIENT) {
                    return new y(LocalDate.r0((q.m().j0() + a) - 1, 1)).g0(j$.nio.channels.c.k(((Long) map.remove(chronoField5)).longValue(), 1L), ChronoUnit.DAYS);
                }
                int a4 = Q(chronoField5).a(((Long) map.remove(chronoField5)).longValue(), chronoField5);
                LocalDate localDate2 = y.d;
                if (a == 1) {
                    r0 = LocalDate.r0(q.m().j0(), (q.m().g0() + a4) - 1);
                } else {
                    r0 = LocalDate.r0((q.m().j0() + a) - 1, a4);
                }
                if (!r0.k0(q.m()) && q == z.g(r0)) {
                    return new y(q, a, r0);
                }
                throw new RuntimeException("Invalid parameters");
            }
        }
        return null;
    }

    @Override // j$.time.chrono.m
    public final int g(n nVar, int i) {
        if (nVar instanceof z) {
            z zVar = (z) nVar;
            int j0 = (zVar.m().j0() + i) - 1;
            if (i == 1) {
                return j0;
            }
            if (j0 >= -999999999 && j0 <= 999999999 && j0 >= zVar.m().j0() && nVar == z.g(LocalDate.of(j0, 1, 1))) {
                return j0;
            }
            throw new RuntimeException("Invalid yearOfEra value");
        }
        throw new ClassCastException("Era must be JapaneseEra");
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0071b l(long j) {
        return new y(LocalDate.q0(j));
    }

    @Override // j$.time.chrono.m
    public final String m() {
        return "Japanese";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0071b q(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof y) {
            return (y) temporalAccessor;
        }
        return new y(LocalDate.c0(temporalAccessor));
    }

    @Override // j$.time.chrono.AbstractC0070a
    public final InterfaceC0071b t() {
        return new y(LocalDate.c0(LocalDate.o0(j$.time.b.c())));
    }

    Object writeReplace() {
        return new F((byte) 1, this);
    }

    @Override // j$.time.chrono.m
    public final String x() {
        return "japanese";
    }
}
