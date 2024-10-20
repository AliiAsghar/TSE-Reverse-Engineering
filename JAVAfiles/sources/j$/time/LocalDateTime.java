package j$.time;

import j$.time.chrono.AbstractC0077h;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class LocalDateTime implements Temporal, j$.time.temporal.k, ChronoLocalDateTime<LocalDate>, Serializable {
    public static final LocalDateTime c = n0(LocalDate.d, LocalTime.e);
    public static final LocalDateTime d = n0(LocalDate.e, LocalTime.f);
    private static final long serialVersionUID = 6207766400415563566L;
    private final LocalDate a;
    private final LocalTime b;

    private LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.a = localDate;
        this.b = localTime;
    }

    private int a0(LocalDateTime localDateTime) {
        int a0 = this.a.a0(localDateTime.b());
        if (a0 == 0) {
            return this.b.compareTo(localDateTime.b);
        }
        return a0;
    }

    public static LocalDateTime b0(Temporal temporal) {
        if (temporal instanceof LocalDateTime) {
            return (LocalDateTime) temporal;
        }
        if (temporal instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporal).L();
        }
        if (temporal instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporal).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.c0(temporal), LocalTime.c0(temporal));
        } catch (DateTimeException e) {
            throw new RuntimeException(d.d("Unable to obtain LocalDateTime from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
        }
    }

    public static LocalDateTime l0(int i) {
        return new LocalDateTime(LocalDate.of(i, 12, 31), LocalTime.of(0, 0));
    }

    public static LocalDateTime m0(int i, int i2, int i3, int i4, int i5, int i6) {
        return new LocalDateTime(LocalDate.of(i, i2, i3), LocalTime.i0(i4, i5, i6, 0));
    }

    public static LocalDateTime n0(LocalDate localDate, LocalTime localTime) {
        Objects.a(localDate, "date");
        Objects.a(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    public static LocalDateTime o0(long j, int i, ZoneOffset zoneOffset) {
        Objects.a(zoneOffset, "offset");
        long j2 = i;
        ChronoField.NANO_OF_SECOND.c0(j2);
        return new LocalDateTime(LocalDate.q0(j$.nio.file.attribute.p.f(j + zoneOffset.i0(), 86400)), LocalTime.j0((((int) j$.nio.file.attribute.p.g(r5, r7)) * 1000000000) + j2));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private LocalDateTime s0(LocalDate localDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        LocalTime localTime = this.b;
        if (j5 == 0) {
            return w0(localDate, localTime);
        }
        long j6 = j / 24;
        long j7 = j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long j8 = 1;
        long j9 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long r0 = localTime.r0();
        long j10 = (j9 * j8) + r0;
        long f = j$.nio.file.attribute.p.f(j10, 86400000000000L) + (j7 * j8);
        long g = j$.nio.file.attribute.p.g(j10, 86400000000000L);
        if (g != r0) {
            localTime = LocalTime.j0(g);
        }
        return w0(localDate.plusDays(f), localTime);
    }

    private LocalDateTime w0(LocalDate localDate, LocalTime localTime) {
        if (this.a == localDate && this.b == localTime) {
            return this;
        }
        return new LocalDateTime(localDate, localTime);
    }

    private Object writeReplace() {
        return new n((byte) 5, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.j.f()) {
            return this.a;
        }
        return AbstractC0077h.k(this, nVar);
    }

    @Override // j$.time.temporal.k
    public final Temporal G(Temporal temporal) {
        return temporal.c(b().toEpochDay(), ChronoField.EPOCH_DAY).c(toLocalTime().r0(), ChronoField.NANO_OF_DAY);
    }

    @Override // java.lang.Comparable
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return a0((LocalDateTime) chronoLocalDateTime);
        }
        return AbstractC0077h.c(this, chronoLocalDateTime);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.chrono.m a() {
        return ((LocalDate) b()).a();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* renamed from: atZone, reason: merged with bridge method [inline-methods] */
    public ZonedDateTime p(ZoneId zoneId) {
        return ZonedDateTime.c0(this, zoneId, null);
    }

    public final int c0() {
        return this.a.e0();
    }

    public final DayOfWeek d0() {
        return this.a.f0();
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        boolean z;
        LocalDate localDate;
        long j;
        long j2;
        LocalDateTime b0 = b0(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            if (((ChronoUnit) temporalUnit).compareTo(ChronoUnit.DAYS) < 0) {
                z = true;
            } else {
                z = false;
            }
            LocalTime localTime = this.b;
            LocalDate localDate2 = this.a;
            if (z) {
                LocalDate localDate3 = b0.a;
                localDate2.getClass();
                long epochDay = localDate3.toEpochDay() - localDate2.toEpochDay();
                LocalTime localTime2 = b0.b;
                if (epochDay == 0) {
                    return localTime.e(localTime2, temporalUnit);
                }
                long r0 = localTime2.r0() - localTime.r0();
                if (epochDay > 0) {
                    j = epochDay - 1;
                    j2 = r0 + 86400000000000L;
                } else {
                    j = epochDay + 1;
                    j2 = r0 - 86400000000000L;
                }
                switch (g.a[((ChronoUnit) temporalUnit).ordinal()]) {
                    case 1:
                        j = j$.nio.channels.c.j(j, 86400000000000L);
                        break;
                    case 2:
                        j = j$.nio.channels.c.j(j, 86400000000L);
                        j2 /= 1000;
                        break;
                    case 3:
                        j = j$.nio.channels.c.j(j, 86400000L);
                        j2 /= 1000000;
                        break;
                    case 4:
                        j = j$.nio.channels.c.j(j, 86400);
                        j2 /= 1000000000;
                        break;
                    case 5:
                        j = j$.nio.channels.c.j(j, 1440);
                        j2 /= 60000000000L;
                        break;
                    case 6:
                        j = j$.nio.channels.c.j(j, 24);
                        j2 /= 3600000000000L;
                        break;
                    case 7:
                        j = j$.nio.channels.c.j(j, 2);
                        j2 /= 43200000000000L;
                        break;
                }
                return j$.nio.channels.c.g(j, j2);
            }
            LocalDate localDate4 = b0.a;
            localDate4.getClass();
            boolean z2 = localDate2 instanceof LocalDate;
            LocalTime localTime3 = b0.b;
            if (!z2 ? localDate4.toEpochDay() > localDate2.toEpochDay() : localDate4.a0(localDate2) > 0) {
                if (localTime3.compareTo(localTime) < 0) {
                    localDate = localDate4.plusDays(-1L);
                    return localDate2.e(localDate, temporalUnit);
                }
            }
            boolean k0 = localDate4.k0(localDate2);
            localDate = localDate4;
            if (k0) {
                localDate = localDate4;
                if (localTime3.compareTo(localTime) > 0) {
                    localDate = localDate4.plusDays(1L);
                }
            }
            return localDate2.e(localDate, temporalUnit);
        }
        return temporalUnit.between(this, b0);
    }

    public final int e0() {
        return this.b.f0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDateTime)) {
            return false;
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        if (this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b)) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            if (chronoField.a0() || chronoField.d0()) {
                return true;
            }
            return false;
        }
        if (temporalField != null && temporalField.y(this)) {
            return true;
        }
        return false;
    }

    public final int f0() {
        return this.a.h0();
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.a(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    public final int g0() {
        return this.b.g0();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (((ChronoField) temporalField).d0()) {
                return this.b.get(temporalField);
            }
            return this.a.get(temporalField);
        }
        return j$.time.temporal.j.a(this, temporalField);
    }

    public int getHour() {
        return this.b.e0();
    }

    public final int h0() {
        return this.b.h0();
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final int i0() {
        return this.a.j0();
    }

    public final boolean j0(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            if (a0(localDateTime) <= 0) {
                return false;
            }
            return true;
        }
        long epochDay = b().toEpochDay();
        long epochDay2 = localDateTime.b().toEpochDay();
        if (epochDay <= epochDay2 && (epochDay != epochDay2 || this.b.r0() <= localDateTime.b.r0())) {
            return false;
        }
        return true;
    }

    public final boolean k0(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            if (a0(localDateTime) >= 0) {
                return false;
            }
            return true;
        }
        long epochDay = b().toEpochDay();
        long epochDay2 = localDateTime.b().toEpochDay();
        if (epochDay >= epochDay2 && (epochDay != epochDay2 || this.b.r0() >= localDateTime.b.r0())) {
            return false;
        }
        return true;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal n(long j, ChronoUnit chronoUnit) {
        if (j == Long.MIN_VALUE) {
            return d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit);
        }
        return d(-j, chronoUnit);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime d(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (g.a[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return s0(this.a, 0L, 0L, 0L, j);
                case 2:
                    LocalDateTime q0 = q0(j / 86400000000L);
                    return q0.s0(q0.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
                case 3:
                    LocalDateTime q02 = q0(j / 86400000);
                    return q02.s0(q02.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
                case 4:
                    return r0(j);
                case 5:
                    return s0(this.a, 0L, j, 0L, 0L);
                case 6:
                    return s0(this.a, j, 0L, 0L, 0L);
                case 7:
                    LocalDateTime q03 = q0(j / 256);
                    return q03.s0(q03.a, (j % 256) * 12, 0L, 0L, 0L);
                default:
                    return w0(this.a.d(j, temporalUnit), this.b);
            }
        }
        return (LocalDateTime) temporalUnit.n(this, j);
    }

    public final LocalDateTime q0(long j) {
        return w0(this.a.plusDays(j), this.b);
    }

    public final LocalDateTime r0(long j) {
        return s0(this.a, 0L, 0L, j, 0L);
    }

    public final LocalDateTime t0(TemporalUnit temporalUnit) {
        LocalTime localTime = this.b;
        localTime.getClass();
        if (temporalUnit != ChronoUnit.NANOS) {
            Duration duration = temporalUnit.getDuration();
            if (duration.getSeconds() <= 86400) {
                long nanos = duration.toNanos();
                if (86400000000000L % nanos == 0) {
                    localTime = LocalTime.j0((localTime.r0() / nanos) * nanos);
                } else {
                    throw new RuntimeException("Unit must divide into a standard day without remainder");
                }
            } else {
                throw new RuntimeException("Unit is too large to be used for truncation");
            }
        }
        return w0(this.a, localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ long toEpochSecond(ZoneOffset zoneOffset) {
        return AbstractC0077h.n(this, zoneOffset);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* renamed from: toLocalDate, reason: merged with bridge method [inline-methods] */
    public LocalDate b() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final LocalTime toLocalTime() {
        return this.b;
    }

    public String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p u(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (((ChronoField) temporalField).d0()) {
                LocalTime localTime = this.b;
                localTime.getClass();
                return j$.time.temporal.j.d(localTime, temporalField);
            }
            return this.a.u(temporalField);
        }
        return temporalField.G(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime c(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            boolean d0 = ((ChronoField) temporalField).d0();
            LocalTime localTime = this.b;
            LocalDate localDate = this.a;
            if (d0) {
                return w0(localDate, localTime.c(j, temporalField));
            }
            return w0(localDate.c(j, temporalField), localTime);
        }
        return (LocalDateTime) temporalField.D(this, j);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime t(LocalDate localDate) {
        if (localDate instanceof LocalDate) {
            return w0(localDate, this.b);
        }
        localDate.getClass();
        return (LocalDateTime) AbstractC0077h.a(localDate, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void x0(DataOutput dataOutput) {
        this.a.B0(dataOutput);
        this.b.v0(dataOutput);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (((ChronoField) temporalField).d0()) {
                return this.b.y(temporalField);
            }
            return this.a.y(temporalField);
        }
        return temporalField.u(this);
    }
}
