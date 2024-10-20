package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* renamed from: j$.time.chrono.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0070a implements m {
    private static final ConcurrentHashMap a = new ConcurrentHashMap();
    private static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final /* synthetic */ int c = 0;

    static {
        new Locale("ja", "JP", "JP");
    }

    static InterfaceC0071b D(InterfaceC0071b interfaceC0071b, long j, long j2, long j3) {
        long j4;
        InterfaceC0071b d = interfaceC0071b.d(j, (TemporalUnit) ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        InterfaceC0071b d2 = d.d(j2, (TemporalUnit) chronoUnit);
        if (j3 > 7) {
            long j5 = j3 - 1;
            d2 = d2.d(j5 / 7, (TemporalUnit) chronoUnit);
            j4 = j5 % 7;
        } else {
            if (j3 < 1) {
                d2 = d2.d(j$.nio.channels.c.k(j3, 7L) / 7, (TemporalUnit) chronoUnit);
                j4 = (j3 + 6) % 7;
            }
            return d2.t(new j$.time.temporal.l(DayOfWeek.a0((int) j3).getValue(), 0));
        }
        j3 = j4 + 1;
        return d2.t(new j$.time.temporal.l(DayOfWeek.a0((int) j3).getValue(), 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void n(Map map, ChronoField chronoField, long j) {
        Long l = (Long) map.get(chronoField);
        if (l != null && l.longValue() != j) {
            throw new RuntimeException("Conflict found: " + String.valueOf(chronoField) + " " + l + " differs from " + String.valueOf(chronoField) + " " + j);
        }
        map.put(chronoField, Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m u(String str) {
        Objects.a(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap = a;
            m mVar = (m) concurrentHashMap.get(str);
            if (mVar == null) {
                mVar = (m) b.get(str);
            }
            if (mVar != null) {
                return mVar;
            }
            if (concurrentHashMap.get("ISO") == null) {
                p pVar = p.o;
                y(pVar, pVar.m());
                w wVar = w.d;
                y(wVar, wVar.m());
                B b2 = B.d;
                y(b2, b2.m());
                H h = H.d;
                y(h, h.m());
                try {
                    for (AbstractC0070a abstractC0070a : Arrays.asList(new AbstractC0070a[0])) {
                        if (!abstractC0070a.m().equals("ISO")) {
                            y(abstractC0070a, abstractC0070a.m());
                        }
                    }
                    t tVar = t.d;
                    y(tVar, tVar.m());
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(th.getMessage(), th);
                }
            } else {
                Iterator it = ServiceLoader.load(m.class).iterator();
                while (it.hasNext()) {
                    m mVar2 = (m) it.next();
                    if (str.equals(mVar2.m()) || str.equals(mVar2.x())) {
                        return mVar2;
                    }
                }
                throw new RuntimeException("Unknown chronology: ".concat(str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m y(AbstractC0070a abstractC0070a, String str) {
        String x;
        m mVar = (m) a.putIfAbsent(str, abstractC0070a);
        if (mVar == null && (x = abstractC0070a.x()) != null) {
            b.putIfAbsent(x, abstractC0070a);
        }
        return mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [j$.time.chrono.j] */
    @Override // j$.time.chrono.m
    public InterfaceC0079j C(Temporal temporal) {
        try {
            ZoneId a0 = ZoneId.a0(temporal);
            try {
                temporal = R(Instant.b0(temporal), a0);
                return temporal;
            } catch (DateTimeException unused) {
                return l.a0(a0, null, C0075f.a0(this, F(temporal)));
            }
        } catch (DateTimeException e) {
            throw new RuntimeException("Unable to obtain ChronoZonedDateTime from TemporalAccessor: ".concat(String.valueOf(temporal.getClass())), e);
        }
    }

    @Override // j$.time.chrono.m
    public ChronoLocalDateTime F(Temporal temporal) {
        try {
            return q(temporal).B(LocalTime.c0(temporal));
        } catch (DateTimeException e) {
            throw new RuntimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: ".concat(String.valueOf(temporal.getClass())), e);
        }
    }

    void G(Map map, j$.time.format.F f) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (f != j$.time.format.F.LENIENT) {
                chronoField.c0(l.longValue());
            }
            InterfaceC0071b c2 = t().c(1L, (TemporalField) ChronoField.DAY_OF_MONTH).c(l.longValue(), (TemporalField) chronoField);
            n(map, ChronoField.MONTH_OF_YEAR, c2.get(r0));
            n(map, ChronoField.YEAR, c2.get(r0));
        }
    }

    @Override // j$.time.chrono.m
    public InterfaceC0071b P(Map map, j$.time.format.F f) {
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        if (map.containsKey(chronoField)) {
            return l(((Long) map.remove(chronoField)).longValue());
        }
        G(map, f);
        InterfaceC0071b b0 = b0(map, f);
        if (b0 != null) {
            return b0;
        }
        ChronoField chronoField2 = ChronoField.YEAR;
        if (!map.containsKey(chronoField2)) {
            return null;
        }
        ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
        if (map.containsKey(chronoField3)) {
            if (map.containsKey(ChronoField.DAY_OF_MONTH)) {
                return a0(map, f);
            }
            ChronoField chronoField4 = ChronoField.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(chronoField4)) {
                ChronoField chronoField5 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map.containsKey(chronoField5)) {
                    int a2 = Q(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                    if (f == j$.time.format.F.LENIENT) {
                        long k = j$.nio.channels.c.k(((Long) map.remove(chronoField3)).longValue(), 1L);
                        return M(a2, 1, 1).d(k, (TemporalUnit) ChronoUnit.MONTHS).d(j$.nio.channels.c.k(((Long) map.remove(chronoField4)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).d(j$.nio.channels.c.k(((Long) map.remove(chronoField5)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                    }
                    int a3 = Q(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                    int a4 = Q(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4);
                    InterfaceC0071b d = M(a2, a3, 1).d((Q(chronoField5).a(((Long) map.remove(chronoField5)).longValue(), chronoField5) - 1) + ((a4 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                    if (f != j$.time.format.F.STRICT || d.get(chronoField3) == a3) {
                        return d;
                    }
                    throw new RuntimeException("Strict mode rejected resolved date as it is in a different month");
                }
                ChronoField chronoField6 = ChronoField.DAY_OF_WEEK;
                if (map.containsKey(chronoField6)) {
                    int a5 = Q(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                    if (f == j$.time.format.F.LENIENT) {
                        return D(M(a5, 1, 1), j$.nio.channels.c.k(((Long) map.remove(chronoField3)).longValue(), 1L), j$.nio.channels.c.k(((Long) map.remove(chronoField4)).longValue(), 1L), j$.nio.channels.c.k(((Long) map.remove(chronoField6)).longValue(), 1L));
                    }
                    int a6 = Q(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                    InterfaceC0071b t = M(a5, a6, 1).d((Q(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).t(new j$.time.temporal.l(DayOfWeek.a0(Q(chronoField6).a(((Long) map.remove(chronoField6)).longValue(), chronoField6)).getValue(), 0));
                    if (f != j$.time.format.F.STRICT || t.get(chronoField3) == a6) {
                        return t;
                    }
                    throw new RuntimeException("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        ChronoField chronoField7 = ChronoField.DAY_OF_YEAR;
        if (map.containsKey(chronoField7)) {
            int a7 = Q(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
            if (f == j$.time.format.F.LENIENT) {
                return A(a7, 1).d(j$.nio.channels.c.k(((Long) map.remove(chronoField7)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
            }
            return A(a7, Q(chronoField7).a(((Long) map.remove(chronoField7)).longValue(), chronoField7));
        }
        ChronoField chronoField8 = ChronoField.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(chronoField8)) {
            return null;
        }
        ChronoField chronoField9 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(chronoField9)) {
            int a8 = Q(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
            if (f == j$.time.format.F.LENIENT) {
                return A(a8, 1).d(j$.nio.channels.c.k(((Long) map.remove(chronoField8)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).d(j$.nio.channels.c.k(((Long) map.remove(chronoField9)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
            }
            int a9 = Q(chronoField8).a(((Long) map.remove(chronoField8)).longValue(), chronoField8);
            InterfaceC0071b d2 = A(a8, 1).d((Q(chronoField9).a(((Long) map.remove(chronoField9)).longValue(), chronoField9) - 1) + ((a9 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
            if (f != j$.time.format.F.STRICT || d2.get(chronoField2) == a8) {
                return d2;
            }
            throw new RuntimeException("Strict mode rejected resolved date as it is in a different year");
        }
        ChronoField chronoField10 = ChronoField.DAY_OF_WEEK;
        if (!map.containsKey(chronoField10)) {
            return null;
        }
        int a10 = Q(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        if (f == j$.time.format.F.LENIENT) {
            return D(A(a10, 1), 0L, j$.nio.channels.c.k(((Long) map.remove(chronoField8)).longValue(), 1L), j$.nio.channels.c.k(((Long) map.remove(chronoField10)).longValue(), 1L));
        }
        InterfaceC0071b t2 = A(a10, 1).d((Q(chronoField8).a(((Long) map.remove(chronoField8)).longValue(), chronoField8) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).t(new j$.time.temporal.l(DayOfWeek.a0(Q(chronoField10).a(((Long) map.remove(chronoField10)).longValue(), chronoField10)).getValue(), 0));
        if (f != j$.time.format.F.STRICT || t2.get(chronoField2) == a10) {
            return t2;
        }
        throw new RuntimeException("Strict mode rejected resolved date as it is in a different year");
    }

    InterfaceC0071b a0(Map map, j$.time.format.F f) {
        ChronoField chronoField = ChronoField.YEAR;
        int a2 = Q(chronoField).a(((Long) map.remove(chronoField)).longValue(), chronoField);
        if (f == j$.time.format.F.LENIENT) {
            long k = j$.nio.channels.c.k(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L);
            return M(a2, 1, 1).d(k, (TemporalUnit) ChronoUnit.MONTHS).d(j$.nio.channels.c.k(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int a3 = Q(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int a4 = Q(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
        if (f == j$.time.format.F.SMART) {
            try {
                return M(a2, a3, a4);
            } catch (DateTimeException unused) {
                return M(a2, a3, 1).t(new j$.time.temporal.m(0));
            }
        }
        return M(a2, a3, a4);
    }

    InterfaceC0071b b0(Map map, j$.time.format.F f) {
        int f2;
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            Long l2 = (Long) map.remove(ChronoField.ERA);
            if (f != j$.time.format.F.LENIENT) {
                f2 = Q(chronoField).a(l.longValue(), chronoField);
            } else {
                f2 = j$.nio.channels.c.f(l.longValue());
            }
            if (l2 != null) {
                n(map, ChronoField.YEAR, g(X(Q(r2).a(l2.longValue(), r2)), f2));
                return null;
            }
            ChronoField chronoField2 = ChronoField.YEAR;
            if (map.containsKey(chronoField2)) {
                n(map, chronoField2, g(A(Q(chronoField2).a(((Long) map.get(chronoField2)).longValue(), chronoField2), 1).H(), f2));
                return null;
            }
            if (f == j$.time.format.F.STRICT) {
                map.put(chronoField, l);
                return null;
            }
            if (T().isEmpty()) {
                n(map, chronoField2, f2);
                return null;
            }
            n(map, chronoField2, g((n) r9.get(r9.size() - 1), f2));
            return null;
        }
        ChronoField chronoField3 = ChronoField.ERA;
        if (map.containsKey(chronoField3)) {
            Q(chronoField3).b(((Long) map.get(chronoField3)).longValue(), chronoField3);
            return null;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return m().compareTo(((m) obj).m());
    }

    @Override // j$.time.chrono.m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AbstractC0070a) && m().compareTo(((AbstractC0070a) obj).m()) == 0) {
            return true;
        }
        return false;
    }

    @Override // j$.time.chrono.m
    public final int hashCode() {
        return getClass().hashCode() ^ m().hashCode();
    }

    public abstract /* synthetic */ InterfaceC0071b t();

    @Override // j$.time.chrono.m
    public final String toString() {
        return m();
    }
}
