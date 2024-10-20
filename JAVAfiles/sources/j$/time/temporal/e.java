package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.chrono.AbstractC0077h;
import j$.time.chrono.t;
import j$.time.format.F;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
abstract class e implements TemporalField {
    public static final e DAY_OF_QUARTER;
    public static final e QUARTER_OF_YEAR;
    public static final e WEEK_BASED_YEAR;
    public static final e WEEK_OF_WEEK_BASED_YEAR;
    private static final int[] a;
    private static final /* synthetic */ e[] b;

    static {
        e eVar = new e() { // from class: j$.time.temporal.a
            @Override // j$.time.temporal.TemporalField
            public final Temporal D(Temporal temporal, long j) {
                long u = u(temporal);
                n().b(j, this);
                ChronoField chronoField = ChronoField.DAY_OF_YEAR;
                return temporal.c((j - u) + temporal.y(chronoField), chronoField);
            }

            @Override // j$.time.temporal.TemporalField
            public final p G(TemporalAccessor temporalAccessor) {
                if (y(temporalAccessor)) {
                    long y = temporalAccessor.y(e.QUARTER_OF_YEAR);
                    if (y == 1) {
                        if (t.d.W(temporalAccessor.y(ChronoField.YEAR))) {
                            return p.j(1L, 91L);
                        }
                        return p.j(1L, 90L);
                    }
                    if (y == 2) {
                        return p.j(1L, 91L);
                    }
                    if (y != 3 && y != 4) {
                        return n();
                    }
                    return p.j(1L, 92L);
                }
                throw new RuntimeException("Unsupported field: DayOfQuarter");
            }

            @Override // j$.time.temporal.TemporalField
            public final p n() {
                return p.k(1L, 90L, 92L);
            }

            @Override // j$.time.temporal.e, j$.time.temporal.TemporalField
            public final TemporalAccessor t(HashMap hashMap, TemporalAccessor temporalAccessor, F f) {
                long j;
                LocalDate localDate;
                ChronoField chronoField = ChronoField.YEAR;
                Long l = (Long) hashMap.get(chronoField);
                TemporalField temporalField = e.QUARTER_OF_YEAR;
                Long l2 = (Long) hashMap.get(temporalField);
                if (l != null && l2 != null) {
                    int b0 = chronoField.b0(l.longValue());
                    long longValue = ((Long) hashMap.get(e.DAY_OF_QUARTER)).longValue();
                    TemporalField temporalField2 = g.a;
                    if (AbstractC0077h.q(temporalAccessor).equals(t.d)) {
                        if (f == F.LENIENT) {
                            localDate = LocalDate.of(b0, 1, 1).t0(j$.nio.channels.c.j(j$.nio.channels.c.k(l2.longValue(), 1L), 3));
                            j = j$.nio.channels.c.k(longValue, 1L);
                        } else {
                            LocalDate of = LocalDate.of(b0, ((temporalField.n().a(l2.longValue(), temporalField) - 1) * 3) + 1, 1);
                            if (longValue < 1 || longValue > 90) {
                                if (f == F.STRICT) {
                                    G(of).b(longValue, this);
                                } else {
                                    n().b(longValue, this);
                                }
                            }
                            j = longValue - 1;
                            localDate = of;
                        }
                        hashMap.remove(this);
                        hashMap.remove(chronoField);
                        hashMap.remove(temporalField);
                        return localDate.plusDays(j);
                    }
                    throw new RuntimeException("Resolve requires IsoChronology");
                }
                return null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }

            @Override // j$.time.temporal.TemporalField
            public final long u(TemporalAccessor temporalAccessor) {
                int[] iArr;
                int i;
                if (y(temporalAccessor)) {
                    int i2 = temporalAccessor.get(ChronoField.DAY_OF_YEAR);
                    int i3 = temporalAccessor.get(ChronoField.MONTH_OF_YEAR);
                    long y = temporalAccessor.y(ChronoField.YEAR);
                    iArr = e.a;
                    int i4 = (i3 - 1) / 3;
                    if (t.d.W(y)) {
                        i = 4;
                    } else {
                        i = 0;
                    }
                    return i2 - iArr[i4 + i];
                }
                throw new RuntimeException("Unsupported field: DayOfQuarter");
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean y(TemporalAccessor temporalAccessor) {
                if (temporalAccessor.f(ChronoField.DAY_OF_YEAR) && temporalAccessor.f(ChronoField.MONTH_OF_YEAR) && temporalAccessor.f(ChronoField.YEAR)) {
                    TemporalField temporalField = g.a;
                    if (AbstractC0077h.q(temporalAccessor).equals(t.d)) {
                        return true;
                    }
                }
                return false;
            }
        };
        DAY_OF_QUARTER = eVar;
        e eVar2 = new e() { // from class: j$.time.temporal.b
            @Override // j$.time.temporal.TemporalField
            public final Temporal D(Temporal temporal, long j) {
                long u = u(temporal);
                n().b(j, this);
                ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
                return temporal.c(((j - u) * 3) + temporal.y(chronoField), chronoField);
            }

            @Override // j$.time.temporal.TemporalField
            public final p G(TemporalAccessor temporalAccessor) {
                if (y(temporalAccessor)) {
                    return n();
                }
                throw new RuntimeException("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final p n() {
                return p.j(1L, 4L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }

            @Override // j$.time.temporal.TemporalField
            public final long u(TemporalAccessor temporalAccessor) {
                if (y(temporalAccessor)) {
                    return (temporalAccessor.y(ChronoField.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new RuntimeException("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean y(TemporalAccessor temporalAccessor) {
                if (temporalAccessor.f(ChronoField.MONTH_OF_YEAR)) {
                    TemporalField temporalField = g.a;
                    if (AbstractC0077h.q(temporalAccessor).equals(t.d)) {
                        return true;
                    }
                }
                return false;
            }
        };
        QUARTER_OF_YEAR = eVar2;
        e eVar3 = new e() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.TemporalField
            public final Temporal D(Temporal temporal, long j) {
                n().b(j, this);
                return temporal.d(j$.nio.channels.c.k(j, u(temporal)), ChronoUnit.WEEKS);
            }

            @Override // j$.time.temporal.TemporalField
            public final p G(TemporalAccessor temporalAccessor) {
                if (y(temporalAccessor)) {
                    return e.f0(LocalDate.c0(temporalAccessor));
                }
                throw new RuntimeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final p n() {
                return p.k(1L, 52L, 53L);
            }

            @Override // j$.time.temporal.e, j$.time.temporal.TemporalField
            public final TemporalAccessor t(HashMap hashMap, TemporalAccessor temporalAccessor, F f) {
                LocalDate c;
                long j;
                long j2;
                TemporalField temporalField = e.WEEK_BASED_YEAR;
                Long l = (Long) hashMap.get(temporalField);
                ChronoField chronoField = ChronoField.DAY_OF_WEEK;
                Long l2 = (Long) hashMap.get(chronoField);
                if (l != null && l2 != null) {
                    int a2 = temporalField.n().a(l.longValue(), temporalField);
                    long longValue = ((Long) hashMap.get(e.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                    TemporalField temporalField2 = g.a;
                    if (AbstractC0077h.q(temporalAccessor).equals(t.d)) {
                        LocalDate of = LocalDate.of(a2, 1, 4);
                        if (f == F.LENIENT) {
                            long longValue2 = l2.longValue();
                            if (longValue2 > 7) {
                                long j3 = longValue2 - 1;
                                of = of.u0(j3 / 7);
                                j2 = j3 % 7;
                            } else {
                                j = 1;
                                if (longValue2 < 1) {
                                    of = of.u0(j$.nio.channels.c.k(longValue2, 7L) / 7);
                                    j2 = (longValue2 + 6) % 7;
                                }
                                c = of.u0(j$.nio.channels.c.k(longValue, j)).c(longValue2, chronoField);
                            }
                            j = 1;
                            longValue2 = j2 + 1;
                            c = of.u0(j$.nio.channels.c.k(longValue, j)).c(longValue2, chronoField);
                        } else {
                            int b0 = chronoField.b0(l2.longValue());
                            if (longValue < 1 || longValue > 52) {
                                if (f == F.STRICT) {
                                    e.f0(of).b(longValue, this);
                                } else {
                                    n().b(longValue, this);
                                }
                            }
                            c = of.u0(longValue - 1).c(b0, chronoField);
                        }
                        hashMap.remove(this);
                        hashMap.remove(temporalField);
                        hashMap.remove(chronoField);
                        return c;
                    }
                    throw new RuntimeException("Resolve requires IsoChronology");
                }
                return null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }

            @Override // j$.time.temporal.TemporalField
            public final long u(TemporalAccessor temporalAccessor) {
                if (y(temporalAccessor)) {
                    return e.c0(LocalDate.c0(temporalAccessor));
                }
                throw new RuntimeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean y(TemporalAccessor temporalAccessor) {
                if (temporalAccessor.f(ChronoField.EPOCH_DAY)) {
                    TemporalField temporalField = g.a;
                    if (AbstractC0077h.q(temporalAccessor).equals(t.d)) {
                        return true;
                    }
                }
                return false;
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = eVar3;
        e eVar4 = new e() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.TemporalField
            public final Temporal D(Temporal temporal, long j) {
                int h0;
                if (y(temporal)) {
                    int a2 = ChronoField.YEAR.n().a(j, e.WEEK_BASED_YEAR);
                    LocalDate c0 = LocalDate.c0(temporal);
                    int i = c0.get(ChronoField.DAY_OF_WEEK);
                    int c02 = e.c0(c0);
                    if (c02 == 53) {
                        h0 = e.h0(a2);
                        if (h0 == 52) {
                            c02 = 52;
                        }
                    }
                    return temporal.t(LocalDate.of(a2, 1, 4).plusDays(((c02 - 1) * 7) + (i - r6.get(r0))));
                }
                throw new RuntimeException("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final p G(TemporalAccessor temporalAccessor) {
                if (y(temporalAccessor)) {
                    return n();
                }
                throw new RuntimeException("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final p n() {
                return ChronoField.YEAR.n();
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }

            @Override // j$.time.temporal.TemporalField
            public final long u(TemporalAccessor temporalAccessor) {
                int g0;
                if (y(temporalAccessor)) {
                    g0 = e.g0(LocalDate.c0(temporalAccessor));
                    return g0;
                }
                throw new RuntimeException("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean y(TemporalAccessor temporalAccessor) {
                if (temporalAccessor.f(ChronoField.EPOCH_DAY)) {
                    TemporalField temporalField = g.a;
                    if (AbstractC0077h.q(temporalAccessor).equals(t.d)) {
                        return true;
                    }
                }
                return false;
            }
        };
        WEEK_BASED_YEAR = eVar4;
        b = new e[]{eVar, eVar2, eVar3, eVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c0(LocalDate localDate) {
        int ordinal = localDate.f0().ordinal();
        int i = 1;
        int g0 = localDate.g0() - 1;
        int i2 = (3 - ordinal) + g0;
        int i3 = i2 - ((i2 / 7) * 7);
        int i4 = i3 - 3;
        if (i4 < -3) {
            i4 = i3 + 4;
        }
        if (g0 < i4) {
            return (int) p.j(1L, h0(g0(localDate.z0(180).v0(-1L)))).d();
        }
        int i5 = ((g0 - i4) / 7) + 1;
        if (i5 != 53 || i4 == -3 || (i4 == -2 && localDate.N())) {
            i = i5;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p f0(LocalDate localDate) {
        return p.j(1L, h0(g0(localDate)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int g0(LocalDate localDate) {
        int j0 = localDate.j0();
        int g0 = localDate.g0();
        if (g0 <= 3) {
            if (g0 - localDate.f0().ordinal() < -2) {
                return j0 - 1;
            }
            return j0;
        }
        if (g0 >= 363) {
            if (((g0 - 363) - (localDate.N() ? 1 : 0)) - localDate.f0().ordinal() >= 0) {
                return j0 + 1;
            }
            return j0;
        }
        return j0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h0(int i) {
        LocalDate of = LocalDate.of(i, 1, 1);
        if (of.f0() != DayOfWeek.THURSDAY) {
            if (of.f0() != DayOfWeek.WEDNESDAY || !of.N()) {
                return 52;
            }
            return 53;
        }
        return 53;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) b.clone();
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean a0() {
        return true;
    }

    public /* synthetic */ TemporalAccessor t(HashMap hashMap, TemporalAccessor temporalAccessor, F f) {
        return null;
    }
}
