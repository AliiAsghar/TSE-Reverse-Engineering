package j$.time;

import j$.time.chrono.AbstractC0077h;
import j$.time.chrono.InterfaceC0079j;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes5.dex */
public final class ZonedDateTime implements Temporal, InterfaceC0079j, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    private final LocalDateTime a;
    private final ZoneOffset b;
    private final ZoneId c;

    private ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneId;
    }

    private static ZonedDateTime G(long j, int i, ZoneId zoneId) {
        ZoneOffset d = zoneId.b0().d(Instant.ofEpochSecond(j, i));
        return new ZonedDateTime(LocalDateTime.o0(j, i, d), zoneId, d);
    }

    public static ZonedDateTime a0(Temporal temporal) {
        if (temporal instanceof ZonedDateTime) {
            return (ZonedDateTime) temporal;
        }
        try {
            ZoneId a0 = ZoneId.a0(temporal);
            ChronoField chronoField = ChronoField.INSTANT_SECONDS;
            if (temporal.f(chronoField)) {
                return G(temporal.y(chronoField), temporal.get(ChronoField.NANO_OF_SECOND), a0);
            }
            return c0(LocalDateTime.n0(LocalDate.c0(temporal), LocalTime.c0(temporal)), a0, null);
        } catch (DateTimeException e) {
            throw new RuntimeException(d.d("Unable to obtain ZonedDateTime from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
        }
    }

    public static ZonedDateTime b0(Instant instant, ZoneId zoneId) {
        Objects.a(instant, "instant");
        Objects.a(zoneId, "zone");
        return G(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    public static ZonedDateTime c0(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.a(localDateTime, "localDateTime");
        Objects.a(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        j$.time.zone.e b0 = zoneId.b0();
        List g = b0.g(localDateTime);
        if (g.size() == 1) {
            zoneOffset = (ZoneOffset) g.get(0);
        } else if (g.size() == 0) {
            j$.time.zone.b f = b0.f(localDateTime);
            localDateTime = localDateTime.r0(f.u().getSeconds());
            zoneOffset = f.y();
        } else if (zoneOffset == null || !g.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) g.get(0);
            Objects.a(zoneOffset, "offset");
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZonedDateTime e0(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.c;
        LocalDate localDate = LocalDate.d;
        LocalDateTime n0 = LocalDateTime.n0(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.q0(objectInput));
        ZoneOffset m0 = ZoneOffset.m0(objectInput);
        ZoneId zoneId = (ZoneId) n.a(objectInput);
        Objects.a(m0, "offset");
        Objects.a(zoneId, "zone");
        if ((zoneId instanceof ZoneOffset) && !m0.equals(zoneId)) {
            throw new IllegalArgumentException("ZoneId must match ZoneOffset");
        }
        return new ZonedDateTime(n0, zoneId, m0);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 6, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.j.f()) {
            return b();
        }
        return AbstractC0077h.l(this, nVar);
    }

    @Override // j$.time.chrono.InterfaceC0079j
    public final /* synthetic */ long Z() {
        return AbstractC0077h.o(this);
    }

    @Override // j$.time.chrono.InterfaceC0079j
    public final j$.time.chrono.m a() {
        return ((LocalDate) b()).a();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            int i = t.a[chronoField.ordinal()];
            LocalDateTime localDateTime = this.a;
            ZoneId zoneId = this.c;
            if (i != 1) {
                ZoneOffset zoneOffset = this.b;
                if (i != 2) {
                    return c0(localDateTime.c(j, temporalField), zoneId, zoneOffset);
                }
                ZoneOffset ofTotalSeconds = ZoneOffset.ofTotalSeconds(chronoField.b0(j));
                if (!ofTotalSeconds.equals(zoneOffset) && zoneId.b0().g(localDateTime).contains(ofTotalSeconds)) {
                    return new ZonedDateTime(localDateTime, zoneId, ofTotalSeconds);
                }
                return this;
            }
            return G(j, localDateTime.g0(), zoneId);
        }
        return (ZonedDateTime) temporalField.D(this, j);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC0077h.d(this, (InterfaceC0079j) obj);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime d(long j, TemporalUnit temporalUnit) {
        boolean z;
        if (temporalUnit instanceof ChronoUnit) {
            ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
            if (chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER) {
                z = true;
            } else {
                z = false;
            }
            ZoneOffset zoneOffset = this.b;
            ZoneId zoneId = this.c;
            LocalDateTime localDateTime = this.a;
            if (z) {
                return c0(localDateTime.d(j, temporalUnit), zoneId, zoneOffset);
            }
            LocalDateTime d = localDateTime.d(j, temporalUnit);
            Objects.a(d, "localDateTime");
            Objects.a(zoneOffset, "offset");
            Objects.a(zoneId, "zone");
            if (zoneId.b0().g(d).contains(zoneOffset)) {
                return new ZonedDateTime(d, zoneId, zoneOffset);
            }
            return G(AbstractC0077h.n(d, zoneOffset), d.g0(), zoneId);
        }
        return (ZonedDateTime) temporalUnit.n(this, j);
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        ZonedDateTime a0 = a0(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            ZonedDateTime i = a0.i(this.c);
            ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
            if (chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER) {
                return this.a.e(i.a, temporalUnit);
            }
            return toOffsetDateTime().e(i.toOffsetDateTime(), temporalUnit);
        }
        return temporalUnit.between(this, a0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedDateTime)) {
            return false;
        }
        ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
        if (this.a.equals(zonedDateTime.a) && this.b.equals(zonedDateTime.b) && this.c.equals(zonedDateTime.c)) {
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

    @Override // j$.time.chrono.InterfaceC0079j
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime i(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        LocalDateTime localDateTime = this.a;
        localDateTime.getClass();
        return G(AbstractC0077h.n(localDateTime, this.b), localDateTime.g0(), zoneId);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g0(DataOutput dataOutput) {
        this.a.x0(dataOutput);
        this.b.n0(dataOutput);
        this.c.f0((ObjectOutput) dataOutput);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = t.a[((ChronoField) temporalField).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return this.a.get(temporalField);
                }
                return this.b.i0();
            }
            throw new RuntimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return AbstractC0077h.e(this, temporalField);
    }

    public int getMinute() {
        return this.a.e0();
    }

    public int getYear() {
        return this.a.i0();
    }

    @Override // j$.time.chrono.InterfaceC0079j
    public final ZoneOffset h() {
        return this.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.chrono.InterfaceC0079j
    public final InterfaceC0079j j(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        return c0(this.a, zoneId, this.b);
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
        ZoneOffset zoneOffset = this.b;
        LocalDateTime localDateTime = this.a;
        ZoneId zoneId = this.c;
        if (z) {
            return c0(LocalDateTime.n0(localDate, localDateTime.toLocalTime()), zoneId, zoneOffset);
        }
        localDate.getClass();
        return (ZonedDateTime) AbstractC0077h.a(localDate, this);
    }

    public Instant toInstant() {
        return Instant.ofEpochSecond(Z(), toLocalTime().g0());
    }

    @Override // j$.time.chrono.InterfaceC0079j
    /* renamed from: toLocalDate, reason: merged with bridge method [inline-methods] */
    public LocalDate b() {
        return this.a.b();
    }

    @Override // j$.time.chrono.InterfaceC0079j
    /* renamed from: toLocalDateTime, reason: merged with bridge method [inline-methods] */
    public LocalDateTime L() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC0079j
    public LocalTime toLocalTime() {
        return this.a.toLocalTime();
    }

    public OffsetDateTime toOffsetDateTime() {
        return OffsetDateTime.a0(this.a, this.b);
    }

    public final String toString() {
        String localDateTime = this.a.toString();
        ZoneOffset zoneOffset = this.b;
        String str = localDateTime + zoneOffset.toString();
        ZoneId zoneId = this.c;
        if (zoneOffset != zoneId) {
            return str + "[" + zoneId.toString() + "]";
        }
        return str;
    }

    public ZonedDateTime truncatedTo(TemporalUnit temporalUnit) {
        return c0(this.a.t0(temporalUnit), this.c, this.b);
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

    @Override // j$.time.chrono.InterfaceC0079j
    public final ZoneId w() {
        return this.c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = t.a[((ChronoField) temporalField).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return this.a.y(temporalField);
                }
                return this.b.i0();
            }
            return AbstractC0077h.o(this);
        }
        return temporalField.u(this);
    }
}
