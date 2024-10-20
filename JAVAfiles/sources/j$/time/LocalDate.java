package j$.time;

import j$.time.chrono.AbstractC0077h;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.InterfaceC0071b;
import j$.time.chrono.u;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class LocalDate implements Temporal, j$.time.temporal.k, InterfaceC0071b, Serializable {
    private static final long serialVersionUID = 2942565459149668126L;
    private final int a;
    private final short b;
    private final short c;
    public static final LocalDate d = of(-999999999, 1, 1);
    public static final LocalDate e = of(999999999, 12, 31);
    public static final LocalDate EPOCH = of(1970, 1, 1);

    private LocalDate(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    private static LocalDate b0(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                if (i2 != 4 && i2 != 6 && i2 != 9 && i2 != 11) {
                    i4 = 31;
                } else {
                    i4 = 30;
                }
            } else if (j$.time.chrono.t.d.W(i)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new RuntimeException("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new RuntimeException("Invalid date '" + i.d0(i2).name() + " " + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate c0(TemporalAccessor temporalAccessor) {
        Objects.a(temporalAccessor, "temporal");
        LocalDate localDate = (LocalDate) temporalAccessor.D(j$.time.temporal.j.f());
        if (localDate != null) {
            return localDate;
        }
        throw new RuntimeException(d.d("Unable to obtain LocalDate from TemporalAccessor: ", String.valueOf(temporalAccessor), " of type ", temporalAccessor.getClass().getName()));
    }

    private int d0(ChronoField chronoField) {
        int i;
        int i2 = f.a[chronoField.ordinal()];
        short s = this.c;
        int i3 = this.a;
        switch (i2) {
            case 1:
                return s;
            case 2:
                return g0();
            case 3:
                i = (s - 1) / 7;
                break;
            case 4:
                if (i3 < 1) {
                    return 1 - i3;
                }
                return i3;
            case 5:
                return f0().getValue();
            case 6:
                i = (s - 1) % 7;
                break;
            case 7:
                return ((g0() - 1) % 7) + 1;
            case 8:
                throw new RuntimeException("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((g0() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new RuntimeException("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i3;
            case 13:
                if (i3 >= 1) {
                    return 1;
                }
                return 0;
            default:
                throw new RuntimeException("Unsupported field: ".concat(String.valueOf(chronoField)));
        }
        return i + 1;
    }

    private long i0() {
        return ((this.a * 12) + this.b) - 1;
    }

    private long n0(LocalDate localDate) {
        return (((localDate.i0() * 32) + localDate.c) - ((i0() * 32) + this.c)) / 32;
    }

    public static LocalDate now(ZoneId zoneId) {
        a aVar;
        Objects.a(zoneId, "zone");
        if (zoneId == ZoneOffset.UTC) {
            aVar = a.b;
        } else {
            aVar = new a(zoneId);
        }
        return o0(aVar);
    }

    public static LocalDate o0(b bVar) {
        Objects.a(bVar, "clock");
        Instant ofEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        ZoneId a = bVar.a();
        Objects.a(ofEpochMilli, "instant");
        Objects.a(a, "zone");
        return q0(j$.nio.file.attribute.p.f(ofEpochMilli.getEpochSecond() + a.b0().d(ofEpochMilli).i0(), 86400));
    }

    public static LocalDate of(int i, int i2, int i3) {
        ChronoField.YEAR.c0(i);
        ChronoField.MONTH_OF_YEAR.c0(i2);
        ChronoField.DAY_OF_MONTH.c0(i3);
        return b0(i, i2, i3);
    }

    public static LocalDate p0(int i, i iVar, int i2) {
        ChronoField.YEAR.c0(i);
        ChronoField.DAY_OF_MONTH.c0(i2);
        return b0(i, iVar.getValue(), i2);
    }

    public static LocalDate q0(long j) {
        long j2;
        ChronoField.EPOCH_DAY.c0(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        return new LocalDate(ChronoField.YEAR.b0(j5 + j2 + (i2 / 10)), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    public static LocalDate r0(int i, int i2) {
        long j = i;
        ChronoField.YEAR.c0(j);
        ChronoField.DAY_OF_YEAR.c0(i2);
        boolean W = j$.time.chrono.t.d.W(j);
        if (i2 == 366 && !W) {
            throw new RuntimeException("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
        }
        i d0 = i.d0(((i2 - 1) / 31) + 1);
        if (i2 > (d0.b0(W) + d0.a0(W)) - 1) {
            d0 = d0.e0();
        }
        return new LocalDate(i, d0.getValue(), (i2 - d0.a0(W)) + 1);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private static LocalDate w0(int i, int i2, int i3) {
        int i4;
        if (i2 != 2) {
            if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
                i3 = Math.min(i3, 30);
            }
        } else {
            if (j$.time.chrono.t.d.W(i)) {
                i4 = 29;
            } else {
                i4 = 28;
            }
            i3 = Math.min(i3, i4);
        }
        return new LocalDate(i, i2, i3);
    }

    private Object writeReplace() {
        return new n((byte) 3, this);
    }

    public final LocalDate A0(int i) {
        if (this.a == i) {
            return this;
        }
        ChronoField.YEAR.c0(i);
        return w0(i, this.b, this.c);
    }

    @Override // j$.time.chrono.InterfaceC0071b
    public final ChronoLocalDateTime B(LocalTime localTime) {
        return LocalDateTime.n0(this, localTime);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B0(DataOutput dataOutput) {
        dataOutput.writeInt(this.a);
        dataOutput.writeByte(this.b);
        dataOutput.writeByte(this.c);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.j.f()) {
            return this;
        }
        return AbstractC0077h.j(this, nVar);
    }

    @Override // j$.time.temporal.k
    public final Temporal G(Temporal temporal) {
        return AbstractC0077h.a(this, temporal);
    }

    @Override // j$.time.chrono.InterfaceC0071b
    public final j$.time.chrono.n H() {
        if (this.a >= 1) {
            return u.CE;
        }
        return u.BCE;
    }

    @Override // j$.time.chrono.InterfaceC0071b
    public final boolean N() {
        return j$.time.chrono.t.d.W(this.a);
    }

    @Override // j$.time.chrono.InterfaceC0071b
    public final InterfaceC0071b O(TemporalAmount temporalAmount) {
        if (temporalAmount instanceof Period) {
            return t0(((Period) temporalAmount).d()).plusDays(r4.a());
        }
        Objects.a(temporalAmount, "amountToAdd");
        return (LocalDate) temporalAmount.n(this);
    }

    @Override // j$.time.chrono.InterfaceC0071b
    public final int U() {
        if (N()) {
            return 366;
        }
        return 365;
    }

    @Override // java.lang.Comparable
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC0071b interfaceC0071b) {
        if (interfaceC0071b instanceof LocalDate) {
            return a0((LocalDate) interfaceC0071b);
        }
        return AbstractC0077h.b(this, interfaceC0071b);
    }

    @Override // j$.time.chrono.InterfaceC0071b
    public final j$.time.chrono.m a() {
        return j$.time.chrono.t.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a0(LocalDate localDate) {
        int i = this.a - localDate.a;
        if (i == 0) {
            int i2 = this.b - localDate.b;
            if (i2 == 0) {
                return this.c - localDate.c;
            }
            return i2;
        }
        return i;
    }

    public ZonedDateTime atStartOfDay(ZoneId zoneId) {
        j$.time.zone.b f;
        Objects.a(zoneId, "zone");
        LocalDateTime n0 = LocalDateTime.n0(this, LocalTime.g);
        if (!(zoneId instanceof ZoneOffset) && (f = zoneId.b0().f(n0)) != null && f.a0()) {
            n0 = f.n();
        }
        return ZonedDateTime.c0(n0, zoneId, null);
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        LocalDate c0 = c0(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            switch (f.b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return c0.toEpochDay() - toEpochDay();
                case 2:
                    return (c0.toEpochDay() - toEpochDay()) / 7;
                case 3:
                    return n0(c0);
                case 4:
                    return n0(c0) / 12;
                case 5:
                    return n0(c0) / 120;
                case 6:
                    return n0(c0) / 1200;
                case 7:
                    return n0(c0) / 12000;
                case 8:
                    ChronoField chronoField = ChronoField.ERA;
                    return c0.y(chronoField) - y(chronoField);
                default:
                    throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
            }
        }
        return temporalUnit.between(this, c0);
    }

    public final int e0() {
        return this.c;
    }

    @Override // j$.time.chrono.InterfaceC0071b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof LocalDate) && a0((LocalDate) obj) == 0) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        return AbstractC0077h.h(this, temporalField);
    }

    public final DayOfWeek f0() {
        return DayOfWeek.a0(((int) j$.nio.file.attribute.p.g(toEpochDay() + 3, 7)) + 1);
    }

    public final int g0() {
        return (i.d0(this.b).a0(N()) + this.c) - 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return d0((ChronoField) temporalField);
        }
        return j$.time.temporal.j.a(this, temporalField);
    }

    public final int h0() {
        return this.b;
    }

    @Override // j$.time.chrono.InterfaceC0071b
    public final int hashCode() {
        int i = this.a;
        return (((i << 11) + (this.b << 6)) + this.c) ^ (i & (-2048));
    }

    public final int j0() {
        return this.a;
    }

    public final boolean k0(InterfaceC0071b interfaceC0071b) {
        if (interfaceC0071b instanceof LocalDate) {
            if (a0((LocalDate) interfaceC0071b) >= 0) {
                return false;
            }
            return true;
        }
        if (toEpochDay() >= interfaceC0071b.toEpochDay()) {
            return false;
        }
        return true;
    }

    public final int l0() {
        short s = this.b;
        if (s != 2) {
            if (s != 4 && s != 6 && s != 9 && s != 11) {
                return 31;
            }
            return 30;
        }
        if (N()) {
            return 29;
        }
        return 28;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: m0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate n(long j, ChronoUnit chronoUnit) {
        if (j == Long.MIN_VALUE) {
            return d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit);
        }
        return d(-j, chronoUnit);
    }

    public LocalDate plusDays(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.c + j;
        if (j2 > 0) {
            short s = this.b;
            int i = this.a;
            if (j2 <= 28) {
                return new LocalDate(i, s, (int) j2);
            }
            if (j2 <= 59) {
                long l0 = l0();
                if (j2 <= l0) {
                    return new LocalDate(i, s, (int) j2);
                }
                if (s < 12) {
                    return new LocalDate(i, s + 1, (int) (j2 - l0));
                }
                int i2 = i + 1;
                ChronoField.YEAR.c0(i2);
                return new LocalDate(i2, 1, (int) (j2 - l0));
            }
        }
        return q0(j$.nio.channels.c.g(toEpochDay(), j));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public final LocalDate d(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (f.b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return plusDays(j);
                case 2:
                    return u0(j);
                case 3:
                    return t0(j);
                case 4:
                    return v0(j);
                case 5:
                    return v0(j$.nio.channels.c.j(j, 10));
                case 6:
                    return v0(j$.nio.channels.c.j(j, 100));
                case 7:
                    return v0(j$.nio.channels.c.j(j, 1000));
                case 8:
                    ChronoField chronoField = ChronoField.ERA;
                    return c(j$.nio.channels.c.g(y(chronoField), j), chronoField);
                default:
                    throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
            }
        }
        return (LocalDate) temporalUnit.n(this, j);
    }

    public final LocalDate t0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        long j3 = 12;
        return w0(ChronoField.YEAR.b0(j$.nio.file.attribute.p.f(j2, j3)), ((int) j$.nio.file.attribute.p.g(j2, j3)) + 1, this.c);
    }

    @Override // j$.time.chrono.InterfaceC0071b
    public long toEpochDay() {
        long j;
        long j2 = this.a;
        long j3 = this.b;
        long j4 = 365 * j2;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + (this.c - 1);
        if (j3 > 2) {
            long j6 = j5 - 1;
            if (!N()) {
                j5 -= 2;
            } else {
                j5 = j6;
            }
        }
        return j5 - 719528;
    }

    @Override // j$.time.chrono.InterfaceC0071b
    public String toString() {
        String str;
        int i = this.a;
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (abs < 1000) {
            if (i < 0) {
                sb.append(i - 10000);
                sb.deleteCharAt(1);
            } else {
                sb.append(i + 10000);
                sb.deleteCharAt(0);
            }
        } else {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        }
        String str2 = "-";
        short s = this.b;
        if (s >= 10) {
            str = "-";
        } else {
            str = "-0";
        }
        sb.append(str);
        sb.append((int) s);
        short s2 = this.c;
        if (s2 < 10) {
            str2 = "-0";
        }
        sb.append(str2);
        sb.append((int) s2);
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p u(TemporalField temporalField) {
        long j;
        long j2;
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            if (chronoField.a0()) {
                int i = f.a[chronoField.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return ((ChronoField) temporalField).n();
                            }
                            if (this.a <= 0) {
                                j2 = 1000000000;
                            } else {
                                j2 = 999999999;
                            }
                            return j$.time.temporal.p.j(1L, j2);
                        }
                        if (i.d0(this.b) == i.FEBRUARY && !N()) {
                            j = 4;
                        } else {
                            j = 5;
                        }
                        return j$.time.temporal.p.j(1L, j);
                    }
                    return j$.time.temporal.p.j(1L, U());
                }
                return j$.time.temporal.p.j(1L, l0());
            }
            throw new RuntimeException("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
        return temporalField.G(this);
    }

    public final LocalDate u0(long j) {
        return plusDays(j$.nio.channels.c.j(j, 7));
    }

    public final LocalDate v0(long j) {
        if (j == 0) {
            return this;
        }
        return w0(ChronoField.YEAR.b0(this.a + j), this.b, this.c);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public final LocalDate c(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            chronoField.c0(j);
            int i = f.a[chronoField.ordinal()];
            short s = this.c;
            short s2 = this.b;
            int i2 = this.a;
            switch (i) {
                case 1:
                    int i3 = (int) j;
                    if (s == i3) {
                        return this;
                    }
                    return of(i2, s2, i3);
                case 2:
                    return z0((int) j);
                case 3:
                    return u0(j - y(ChronoField.ALIGNED_WEEK_OF_MONTH));
                case 4:
                    if (i2 < 1) {
                        j = 1 - j;
                    }
                    return A0((int) j);
                case 5:
                    return plusDays(j - f0().getValue());
                case 6:
                    return plusDays(j - y(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                case 7:
                    return plusDays(j - y(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                case 8:
                    return q0(j);
                case 9:
                    return u0(j - y(ChronoField.ALIGNED_WEEK_OF_YEAR));
                case 10:
                    int i4 = (int) j;
                    if (s2 == i4) {
                        return this;
                    }
                    ChronoField.MONTH_OF_YEAR.c0(i4);
                    return w0(i2, i4, s);
                case 11:
                    return t0(j - i0());
                case 12:
                    return A0((int) j);
                case 13:
                    if (y(ChronoField.ERA) == j) {
                        return this;
                    }
                    return A0(1 - i2);
                default:
                    throw new RuntimeException("Unsupported field: ".concat(String.valueOf(temporalField)));
            }
        }
        return (LocalDate) temporalField.D(this, j);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.EPOCH_DAY) {
                return toEpochDay();
            }
            if (temporalField == ChronoField.PROLEPTIC_MONTH) {
                return i0();
            }
            return d0((ChronoField) temporalField);
        }
        return temporalField.u(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: y0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate t(j$.time.temporal.k kVar) {
        if (kVar instanceof LocalDate) {
            return (LocalDate) kVar;
        }
        return (LocalDate) kVar.G(this);
    }

    public final LocalDate z0(int i) {
        if (g0() == i) {
            return this;
        }
        return r0(this.a, i);
    }
}
