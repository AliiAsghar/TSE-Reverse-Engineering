package j$.time;

import j$.time.chrono.AbstractC0077h;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class OffsetDateTime implements Temporal, j$.time.temporal.k, Comparable<OffsetDateTime>, Serializable {
    private static final long serialVersionUID = 2287754244819255394L;
    private final LocalDateTime a;
    private final ZoneOffset b;

    static {
        LocalDateTime localDateTime = LocalDateTime.c;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localDateTime.getClass();
        a0(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.d;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localDateTime2.getClass();
        a0(localDateTime2, zoneOffset2);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.a(localDateTime, "dateTime");
        this.a = localDateTime;
        Objects.a(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    public static OffsetDateTime a0(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime b0(Instant instant, ZoneId zoneId) {
        Objects.a(instant, "instant");
        Objects.a(zoneId, "zone");
        ZoneOffset d = zoneId.b0().d(instant);
        return new OffsetDateTime(LocalDateTime.o0(instant.getEpochSecond(), instant.getNano(), d), d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static OffsetDateTime d0(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.c;
        LocalDate localDate = LocalDate.d;
        return new OffsetDateTime(LocalDateTime.n0(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.q0(objectInput)), ZoneOffset.m0(objectInput));
    }

    private OffsetDateTime e0(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        if (this.a == localDateTime && this.b.equals(zoneOffset)) {
            return this;
        }
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime of(LocalDate localDate, LocalTime localTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(LocalDateTime.n0(localDate, localTime), zoneOffset);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 10, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(j$.time.temporal.n nVar) {
        if (nVar != j$.time.temporal.j.i() && nVar != j$.time.temporal.j.k()) {
            if (nVar == j$.time.temporal.j.l()) {
                return null;
            }
            j$.time.temporal.n f = j$.time.temporal.j.f();
            LocalDateTime localDateTime = this.a;
            if (nVar == f) {
                return localDateTime.b();
            }
            if (nVar == j$.time.temporal.j.g()) {
                return localDateTime.toLocalTime();
            }
            if (nVar == j$.time.temporal.j.e()) {
                return j$.time.chrono.t.d;
            }
            if (nVar == j$.time.temporal.j.j()) {
                return ChronoUnit.NANOS;
            }
            return nVar.g(this);
        }
        return this.b;
    }

    @Override // j$.time.temporal.k
    public final Temporal G(Temporal temporal) {
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        LocalDateTime localDateTime = this.a;
        return temporal.c(localDateTime.b().toEpochDay(), chronoField).c(localDateTime.toLocalTime().r0(), ChronoField.NANO_OF_DAY).c(this.b.i0(), ChronoField.OFFSET_SECONDS);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            int i = k.a[chronoField.ordinal()];
            ZoneOffset zoneOffset = this.b;
            LocalDateTime localDateTime = this.a;
            if (i != 1) {
                if (i != 2) {
                    return e0(localDateTime.c(j, temporalField), zoneOffset);
                }
                return e0(localDateTime, ZoneOffset.ofTotalSeconds(chronoField.b0(j)));
            }
            return b0(Instant.ofEpochSecond(j, localDateTime.g0()), zoneOffset);
        }
        return (OffsetDateTime) temporalField.D(this, j);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime d(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return e0(this.a.d(j, temporalUnit), this.b);
        }
        return (OffsetDateTime) temporalUnit.n(this, j);
    }

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int i;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.b;
        ZoneOffset zoneOffset2 = this.b;
        if (zoneOffset2.equals(zoneOffset)) {
            i = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.a;
            localDateTime.getClass();
            long n = AbstractC0077h.n(localDateTime, zoneOffset2);
            LocalDateTime localDateTime2 = offsetDateTime2.a;
            localDateTime2.getClass();
            int compare = Long.compare(n, AbstractC0077h.n(localDateTime2, offsetDateTime2.b));
            if (compare == 0) {
                i = localDateTime.toLocalTime().g0() - localDateTime2.toLocalTime().g0();
            } else {
                i = compare;
            }
        }
        if (i == 0) {
            return toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v16, types: [j$.time.OffsetDateTime] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        if (temporal instanceof OffsetDateTime) {
            temporal = (OffsetDateTime) temporal;
        } else {
            try {
                ZoneOffset h0 = ZoneOffset.h0(temporal);
                LocalDate localDate = (LocalDate) temporal.D(j$.time.temporal.j.f());
                LocalTime localTime = (LocalTime) temporal.D(j$.time.temporal.j.g());
                if (localDate != null && localTime != null) {
                    temporal = of(localDate, localTime, h0);
                } else {
                    temporal = b0(Instant.b0(temporal), h0);
                }
            } catch (DateTimeException e) {
                throw new RuntimeException(d.d("Unable to obtain OffsetDateTime from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            ZoneOffset zoneOffset = temporal.b;
            ZoneOffset zoneOffset2 = this.b;
            OffsetDateTime offsetDateTime = temporal;
            if (!zoneOffset2.equals(zoneOffset)) {
                offsetDateTime = new OffsetDateTime(temporal.a.r0(zoneOffset2.i0() - zoneOffset.i0()), zoneOffset2);
            }
            return this.a.e(offsetDateTime.a, temporalUnit);
        }
        return temporalUnit.between(this, temporal);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetDateTime)) {
            return false;
        }
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        if (this.a.equals(offsetDateTime.a) && this.b.equals(offsetDateTime.b)) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField) && (temporalField == null || !temporalField.y(this))) {
            return false;
        }
        return true;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = k.a[((ChronoField) temporalField).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return this.a.get(temporalField);
                }
                return this.b.i0();
            }
            throw new RuntimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return j$.time.temporal.j.a(this, temporalField);
    }

    public DayOfWeek getDayOfWeek() {
        return this.a.d0();
    }

    public int getHour() {
        return this.a.getHour();
    }

    public int getMinute() {
        return this.a.e0();
    }

    public final ZoneOffset h() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal n(long j, ChronoUnit chronoUnit) {
        if (j == Long.MIN_VALUE) {
            return d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit);
        }
        return d(-j, chronoUnit);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal t(LocalDate localDate) {
        boolean z = localDate instanceof LocalDate;
        LocalDateTime localDateTime = this.a;
        ZoneOffset zoneOffset = this.b;
        if (!z) {
            localDate.getClass();
            return (OffsetDateTime) AbstractC0077h.a(localDate, this);
        }
        return e0(localDateTime.t(localDate), zoneOffset);
    }

    public Instant toInstant() {
        LocalDateTime localDateTime = this.a;
        localDateTime.getClass();
        return AbstractC0077h.p(localDateTime, this.b);
    }

    public LocalDateTime toLocalDateTime() {
        return this.a;
    }

    public String toString() {
        return this.a.toString() + this.b.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p u(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField != ChronoField.INSTANT_SECONDS && temporalField != ChronoField.OFFSET_SECONDS) {
                return this.a.u(temporalField);
            }
            return ((ChronoField) temporalField).n();
        }
        return temporalField.G(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        this.a.x0(objectOutput);
        this.b.n0(objectOutput);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = k.a[((ChronoField) temporalField).ordinal()];
            ZoneOffset zoneOffset = this.b;
            LocalDateTime localDateTime = this.a;
            if (i != 1) {
                if (i != 2) {
                    return localDateTime.y(temporalField);
                }
                return zoneOffset.i0();
            }
            localDateTime.getClass();
            return AbstractC0077h.n(localDateTime, zoneOffset);
        }
        return temporalField.u(this);
    }
}
