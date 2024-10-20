package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class t extends AbstractC0070a implements Serializable {
    public static final t d = new t();
    private static final long serialVersionUID = -1440403870442975015L;

    private t() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0071b A(int i, int i2) {
        return LocalDate.r0(i, i2);
    }

    @Override // j$.time.chrono.AbstractC0070a, j$.time.chrono.m
    public final InterfaceC0079j C(Temporal temporal) {
        return ZonedDateTime.a0(temporal);
    }

    @Override // j$.time.chrono.AbstractC0070a, j$.time.chrono.m
    public final ChronoLocalDateTime F(Temporal temporal) {
        return LocalDateTime.b0(temporal);
    }

    @Override // j$.time.chrono.AbstractC0070a
    final void G(Map map, j$.time.format.F f) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (f != j$.time.format.F.LENIENT) {
                chronoField.c0(l.longValue());
            }
            AbstractC0070a.n(map, ChronoField.MONTH_OF_YEAR, ((int) j$.nio.file.attribute.p.g(l.longValue(), r4)) + 1);
            AbstractC0070a.n(map, ChronoField.YEAR, j$.nio.file.attribute.p.f(l.longValue(), 12));
        }
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0071b M(int i, int i2, int i3) {
        return LocalDate.of(i, i2, i3);
    }

    @Override // j$.time.chrono.AbstractC0070a, j$.time.chrono.m
    public final InterfaceC0071b P(Map map, j$.time.format.F f) {
        return (LocalDate) super.P(map, f);
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.p Q(ChronoField chronoField) {
        return chronoField.n();
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0079j R(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.b0(instant, zoneId);
    }

    @Override // j$.time.chrono.m
    public final List T() {
        return j$.desugar.sun.nio.fs.g.b(u.values());
    }

    @Override // j$.time.chrono.m
    public final boolean W(long j) {
        if ((3 & j) == 0 && (j % 100 != 0 || j % 400 == 0)) {
            return true;
        }
        return false;
    }

    @Override // j$.time.chrono.m
    public final n X(int i) {
        if (i != 0) {
            if (i == 1) {
                return u.CE;
            }
            throw new RuntimeException("Invalid era: " + i);
        }
        return u.BCE;
    }

    @Override // j$.time.chrono.AbstractC0070a
    final InterfaceC0071b a0(Map map, j$.time.format.F f) {
        ChronoField chronoField = ChronoField.YEAR;
        int b0 = chronoField.b0(((Long) map.remove(chronoField)).longValue());
        boolean z = true;
        if (f == j$.time.format.F.LENIENT) {
            return LocalDate.of(b0, 1, 1).t0(j$.nio.channels.c.k(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L)).plusDays(j$.nio.channels.c.k(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L));
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int b02 = chronoField2.b0(((Long) map.remove(chronoField2)).longValue());
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int b03 = chronoField3.b0(((Long) map.remove(chronoField3)).longValue());
        if (f == j$.time.format.F.SMART) {
            if (b02 != 4 && b02 != 6 && b02 != 9 && b02 != 11) {
                if (b02 == 2) {
                    j$.time.i iVar = j$.time.i.FEBRUARY;
                    long j = b0;
                    int i = j$.time.p.b;
                    if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                        z = false;
                    }
                    b03 = Math.min(b03, iVar.b0(z));
                }
            } else {
                b03 = Math.min(b03, 30);
            }
        }
        return LocalDate.of(b0, b02, b03);
    }

    @Override // j$.time.chrono.AbstractC0070a
    final InterfaceC0071b b0(Map map, j$.time.format.F f) {
        long longValue;
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (f != j$.time.format.F.LENIENT) {
                chronoField.c0(l.longValue());
            }
            Long l2 = (Long) map.remove(ChronoField.ERA);
            if (l2 == null) {
                ChronoField chronoField2 = ChronoField.YEAR;
                Long l3 = (Long) map.get(chronoField2);
                if (f == j$.time.format.F.STRICT) {
                    if (l3 != null) {
                        long longValue2 = l3.longValue();
                        long longValue3 = l.longValue();
                        if (longValue2 <= 0) {
                            longValue3 = j$.nio.channels.c.k(1L, longValue3);
                        }
                        AbstractC0070a.n(map, chronoField2, longValue3);
                        return null;
                    }
                    map.put(chronoField, l);
                    return null;
                }
                if (l3 != null && l3.longValue() <= 0) {
                    longValue = j$.nio.channels.c.k(1L, l.longValue());
                } else {
                    longValue = l.longValue();
                }
                AbstractC0070a.n(map, chronoField2, longValue);
                return null;
            }
            if (l2.longValue() == 1) {
                AbstractC0070a.n(map, ChronoField.YEAR, l.longValue());
                return null;
            }
            if (l2.longValue() == 0) {
                AbstractC0070a.n(map, ChronoField.YEAR, j$.nio.channels.c.k(1L, l.longValue()));
                return null;
            }
            throw new RuntimeException("Invalid value for era: " + l2);
        }
        ChronoField chronoField3 = ChronoField.ERA;
        if (map.containsKey(chronoField3)) {
            chronoField3.c0(((Long) map.get(chronoField3)).longValue());
            return null;
        }
        return null;
    }

    @Override // j$.time.chrono.m
    public final int g(n nVar, int i) {
        if (nVar instanceof u) {
            if (nVar != u.CE) {
                return 1 - i;
            }
            return i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0071b l(long j) {
        return LocalDate.q0(j);
    }

    @Override // j$.time.chrono.m
    public final String m() {
        return "ISO";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0071b q(TemporalAccessor temporalAccessor) {
        return LocalDate.c0(temporalAccessor);
    }

    @Override // j$.time.chrono.AbstractC0070a
    public final InterfaceC0071b t() {
        return LocalDate.c0(LocalDate.o0(j$.time.b.c()));
    }

    Object writeReplace() {
        return new F((byte) 1, this);
    }

    @Override // j$.time.chrono.m
    public final String x() {
        return "iso8601";
    }
}
