package j$.time.temporal;

import j$.time.chrono.AbstractC0077h;
import j$.time.chrono.InterfaceC0071b;
import j$.time.format.F;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class q implements TemporalField {
    private static final p f = p.j(1, 7);
    private static final p g = p.k(0, 4, 6);
    private static final p h = p.k(0, 52, 54);
    private static final p i = p.k(1, 52, 53);
    private final String a;
    private final r b;
    private final Enum c;
    private final Enum d;
    private final p e;

    /* JADX WARN: Multi-variable type inference failed */
    private q(String str, r rVar, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, p pVar) {
        this.a = str;
        this.b = rVar;
        this.c = (Enum) temporalUnit;
        this.d = (Enum) temporalUnit2;
        this.e = pVar;
    }

    private static int a(int i2, int i3) {
        return ((i3 - 1) + (i2 + 7)) / 7;
    }

    private int b(TemporalAccessor temporalAccessor) {
        return j.h(temporalAccessor.get(ChronoField.DAY_OF_WEEK) - this.b.e().getValue()) + 1;
    }

    private int c(TemporalAccessor temporalAccessor) {
        int b = b(temporalAccessor);
        int i2 = temporalAccessor.get(ChronoField.YEAR);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        int i3 = temporalAccessor.get(chronoField);
        int l = l(i3, b);
        int a = a(l, i3);
        if (a == 0) {
            return i2 - 1;
        }
        if (a >= a(l, this.b.f() + ((int) temporalAccessor.u(chronoField).d()))) {
            return i2 + 1;
        }
        return i2;
    }

    private int d(TemporalAccessor temporalAccessor) {
        int b = b(temporalAccessor);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        int i2 = temporalAccessor.get(chronoField);
        int l = l(i2, b);
        int a = a(l, i2);
        if (a == 0) {
            return d(AbstractC0077h.q(temporalAccessor).q(temporalAccessor).n(i2, ChronoUnit.DAYS));
        }
        if (a > 50) {
            int a2 = a(l, this.b.f() + ((int) temporalAccessor.u(chronoField).d()));
            if (a >= a2) {
                return (a - a2) + 1;
            }
            return a;
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q e(r rVar) {
        return new q("DayOfWeek", rVar, ChronoUnit.DAYS, ChronoUnit.WEEKS, f);
    }

    private InterfaceC0071b f(j$.time.chrono.m mVar, int i2, int i3, int i4) {
        InterfaceC0071b M = mVar.M(i2, 1, 1);
        int l = l(1, b(M));
        int i5 = i4 - 1;
        return M.d(((Math.min(i3, a(l, this.b.f() + M.U()) - 1) - 1) * 7) + i5 + (-l), (TemporalUnit) ChronoUnit.DAYS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q g(r rVar) {
        return new q("WeekBasedYear", rVar, g.d, ChronoUnit.FOREVER, ChronoField.YEAR.n());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q h(r rVar) {
        return new q("WeekOfMonth", rVar, ChronoUnit.WEEKS, ChronoUnit.MONTHS, g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q i(r rVar) {
        return new q("WeekOfWeekBasedYear", rVar, ChronoUnit.WEEKS, g.d, i);
    }

    private p j(TemporalAccessor temporalAccessor, ChronoField chronoField) {
        int l = l(temporalAccessor.get(chronoField), b(temporalAccessor));
        p u = temporalAccessor.u(chronoField);
        return p.j(a(l, (int) u.e()), a(l, (int) u.d()));
    }

    private p k(TemporalAccessor temporalAccessor) {
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        if (!temporalAccessor.f(chronoField)) {
            return h;
        }
        int b = b(temporalAccessor);
        int i2 = temporalAccessor.get(chronoField);
        int l = l(i2, b);
        int a = a(l, i2);
        if (a == 0) {
            return k(AbstractC0077h.q(temporalAccessor).q(temporalAccessor).n(i2 + 7, ChronoUnit.DAYS));
        }
        if (a >= a(l, this.b.f() + ((int) temporalAccessor.u(chronoField).d()))) {
            return k(AbstractC0077h.q(temporalAccessor).q(temporalAccessor).d((r0 - i2) + 8, (TemporalUnit) ChronoUnit.DAYS));
        }
        return p.j(1L, r1 - 1);
    }

    private int l(int i2, int i3) {
        int h2 = j.h(i2 - i3);
        int i4 = -h2;
        if (h2 + 1 > this.b.f()) {
            return 7 - h2;
        }
        return i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Enum, j$.time.temporal.TemporalUnit] */
    @Override // j$.time.temporal.TemporalField
    public final Temporal D(Temporal temporal, long j) {
        TemporalField temporalField;
        TemporalField temporalField2;
        if (this.e.a(j, this) == temporal.get(this)) {
            return temporal;
        }
        if (this.d == ChronoUnit.FOREVER) {
            r rVar = this.b;
            temporalField = rVar.c;
            int i2 = temporal.get(temporalField);
            temporalField2 = rVar.e;
            return f(AbstractC0077h.q(temporal), (int) j, temporal.get(temporalField2), i2);
        }
        return temporal.d(r0 - r1, this.c);
    }

    @Override // j$.time.temporal.TemporalField
    public final p G(TemporalAccessor temporalAccessor) {
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        Enum r1 = this.d;
        if (r1 == chronoUnit) {
            return this.e;
        }
        if (r1 == ChronoUnit.MONTHS) {
            return j(temporalAccessor, ChronoField.DAY_OF_MONTH);
        }
        if (r1 == ChronoUnit.YEARS) {
            return j(temporalAccessor, ChronoField.DAY_OF_YEAR);
        }
        if (r1 == r.h) {
            return k(temporalAccessor);
        }
        if (r1 == ChronoUnit.FOREVER) {
            return ChronoField.YEAR.n();
        }
        throw new IllegalStateException(j$.time.d.d("unreachable, rangeUnit: ", String.valueOf(r1), ", this: ", String.valueOf(this)));
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean a0() {
        return true;
    }

    @Override // j$.time.temporal.TemporalField
    public final p n() {
        return this.e;
    }

    @Override // j$.time.temporal.TemporalField
    public final TemporalAccessor t(HashMap hashMap, TemporalAccessor temporalAccessor, F f2) {
        Object obj;
        Object obj2;
        TemporalField temporalField;
        Object obj3;
        TemporalField temporalField2;
        TemporalField temporalField3;
        Object obj4;
        TemporalField temporalField4;
        InterfaceC0071b interfaceC0071b;
        Object obj5;
        Object obj6;
        Object obj7;
        InterfaceC0071b interfaceC0071b2;
        ChronoField chronoField;
        InterfaceC0071b interfaceC0071b3;
        long longValue = ((Long) hashMap.get(this)).longValue();
        int f3 = j$.nio.channels.c.f(longValue);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        Enum r7 = this.d;
        p pVar = this.e;
        r rVar = this.b;
        if (r7 == chronoUnit) {
            long h2 = j.h((pVar.a(longValue, this) - 1) + (rVar.e().getValue() - 1)) + 1;
            hashMap.remove(this);
            hashMap.put(ChronoField.DAY_OF_WEEK, Long.valueOf(h2));
        } else {
            ChronoField chronoField2 = ChronoField.DAY_OF_WEEK;
            if (hashMap.containsKey(chronoField2)) {
                int h3 = j.h(chronoField2.b0(((Long) hashMap.get(chronoField2)).longValue()) - rVar.e().getValue()) + 1;
                j$.time.chrono.m q = AbstractC0077h.q(temporalAccessor);
                ChronoField chronoField3 = ChronoField.YEAR;
                if (hashMap.containsKey(chronoField3)) {
                    int b0 = chronoField3.b0(((Long) hashMap.get(chronoField3)).longValue());
                    ChronoUnit chronoUnit2 = ChronoUnit.MONTHS;
                    if (r7 == chronoUnit2) {
                        ChronoField chronoField4 = ChronoField.MONTH_OF_YEAR;
                        if (hashMap.containsKey(chronoField4)) {
                            long longValue2 = ((Long) hashMap.get(chronoField4)).longValue();
                            long j = f3;
                            if (f2 == F.LENIENT) {
                                InterfaceC0071b d = q.M(b0, 1, 1).d(j$.nio.channels.c.k(longValue2, 1L), (TemporalUnit) chronoUnit2);
                                int b = b(d);
                                int i2 = d.get(ChronoField.DAY_OF_MONTH);
                                interfaceC0071b3 = d.d(j$.nio.channels.c.g(j$.nio.channels.c.j(j$.nio.channels.c.k(j, a(l(i2, b), i2)), 7), h3 - b(d)), (TemporalUnit) ChronoUnit.DAYS);
                                chronoField = chronoField4;
                            } else {
                                chronoField = chronoField4;
                                InterfaceC0071b M = q.M(b0, chronoField.b0(longValue2), 1);
                                long a = pVar.a(j, this);
                                int b2 = b(M);
                                int i3 = M.get(ChronoField.DAY_OF_MONTH);
                                InterfaceC0071b d2 = M.d((((int) (a - a(l(i3, b2), i3))) * 7) + (h3 - b(M)), (TemporalUnit) ChronoUnit.DAYS);
                                if (f2 == F.STRICT && d2.y(chronoField) != longValue2) {
                                    throw new RuntimeException("Strict mode rejected resolved date as it is in a different month");
                                }
                                interfaceC0071b3 = d2;
                            }
                            hashMap.remove(this);
                            hashMap.remove(chronoField3);
                            hashMap.remove(chronoField);
                            hashMap.remove(chronoField2);
                            return interfaceC0071b3;
                        }
                    }
                    if (r7 == ChronoUnit.YEARS) {
                        long j2 = f3;
                        InterfaceC0071b M2 = q.M(b0, 1, 1);
                        if (f2 == F.LENIENT) {
                            int b3 = b(M2);
                            int i4 = M2.get(ChronoField.DAY_OF_YEAR);
                            interfaceC0071b2 = M2.d(j$.nio.channels.c.g(j$.nio.channels.c.j(j$.nio.channels.c.k(j2, a(l(i4, b3), i4)), 7), h3 - b(M2)), (TemporalUnit) ChronoUnit.DAYS);
                        } else {
                            long a2 = pVar.a(j2, this);
                            int b4 = b(M2);
                            int i5 = M2.get(ChronoField.DAY_OF_YEAR);
                            InterfaceC0071b d3 = M2.d((((int) (a2 - a(l(i5, b4), i5))) * 7) + (h3 - b(M2)), (TemporalUnit) ChronoUnit.DAYS);
                            if (f2 == F.STRICT && d3.y(chronoField3) != b0) {
                                throw new RuntimeException("Strict mode rejected resolved date as it is in a different year");
                            }
                            interfaceC0071b2 = d3;
                        }
                        hashMap.remove(this);
                        hashMap.remove(chronoField3);
                        hashMap.remove(chronoField2);
                        return interfaceC0071b2;
                    }
                } else if (r7 == r.h || r7 == ChronoUnit.FOREVER) {
                    obj = rVar.f;
                    if (hashMap.containsKey(obj)) {
                        obj2 = rVar.e;
                        if (hashMap.containsKey(obj2)) {
                            temporalField = rVar.f;
                            p pVar2 = ((q) temporalField).e;
                            obj3 = rVar.f;
                            long longValue3 = ((Long) hashMap.get(obj3)).longValue();
                            temporalField2 = rVar.f;
                            int a3 = pVar2.a(longValue3, temporalField2);
                            if (f2 != F.LENIENT) {
                                temporalField3 = rVar.e;
                                p pVar3 = ((q) temporalField3).e;
                                obj4 = rVar.e;
                                long longValue4 = ((Long) hashMap.get(obj4)).longValue();
                                temporalField4 = rVar.e;
                                InterfaceC0071b f4 = f(q, a3, pVar3.a(longValue4, temporalField4), h3);
                                if (f2 == F.STRICT && c(f4) != a3) {
                                    throw new RuntimeException("Strict mode rejected resolved date as it is in a different week-based-year");
                                }
                                interfaceC0071b = f4;
                            } else {
                                InterfaceC0071b f5 = f(q, a3, 1, h3);
                                obj7 = rVar.e;
                                interfaceC0071b = f5.d(j$.nio.channels.c.k(((Long) hashMap.get(obj7)).longValue(), 1L), (TemporalUnit) chronoUnit);
                            }
                            hashMap.remove(this);
                            obj5 = rVar.f;
                            hashMap.remove(obj5);
                            obj6 = rVar.e;
                            hashMap.remove(obj6);
                            hashMap.remove(chronoField2);
                            return interfaceC0071b;
                        }
                    }
                }
            }
        }
        return null;
    }

    public final String toString() {
        return this.a + "[" + this.b.toString() + "]";
    }

    @Override // j$.time.temporal.TemporalField
    public final long u(TemporalAccessor temporalAccessor) {
        int c;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        Enum r1 = this.d;
        if (r1 == chronoUnit) {
            c = b(temporalAccessor);
        } else {
            if (r1 == ChronoUnit.MONTHS) {
                int b = b(temporalAccessor);
                int i2 = temporalAccessor.get(ChronoField.DAY_OF_MONTH);
                return a(l(i2, b), i2);
            }
            if (r1 == ChronoUnit.YEARS) {
                int b2 = b(temporalAccessor);
                int i3 = temporalAccessor.get(ChronoField.DAY_OF_YEAR);
                return a(l(i3, b2), i3);
            }
            if (r1 == r.h) {
                c = d(temporalAccessor);
            } else if (r1 == ChronoUnit.FOREVER) {
                c = c(temporalAccessor);
            } else {
                throw new IllegalStateException(j$.time.d.d("unreachable, rangeUnit: ", String.valueOf(r1), ", this: ", String.valueOf(this)));
            }
        }
        return c;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean y(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.f(ChronoField.DAY_OF_WEEK)) {
            ChronoUnit chronoUnit = ChronoUnit.WEEKS;
            Enum r1 = this.d;
            if (r1 == chronoUnit) {
                return true;
            }
            if (r1 == ChronoUnit.MONTHS) {
                return temporalAccessor.f(ChronoField.DAY_OF_MONTH);
            }
            if (r1 == ChronoUnit.YEARS) {
                return temporalAccessor.f(ChronoField.DAY_OF_YEAR);
            }
            if (r1 == r.h) {
                return temporalAccessor.f(ChronoField.DAY_OF_YEAR);
            }
            if (r1 == ChronoUnit.FOREVER) {
                return temporalAccessor.f(ChronoField.YEAR);
            }
            return false;
        }
        return false;
    }
}
