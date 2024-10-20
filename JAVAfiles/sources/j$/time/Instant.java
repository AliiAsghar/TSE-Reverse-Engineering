package j$.time;

import j$.time.chrono.AbstractC0077h;
import j$.time.format.DateTimeFormatter;
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
public final class Instant implements Temporal, j$.time.temporal.k, Comparable<Instant>, Serializable {
    private static final long serialVersionUID = -665713676816604388L;
    private final long a;
    private final int b;
    public static final Instant EPOCH = new Instant(0, 0);
    public static final Instant MIN = ofEpochSecond(-31557014167219200L, 0);
    public static final Instant MAX = ofEpochSecond(31556889864403199L, 999999999);

    private Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    private static Instant a0(long j, int i) {
        if ((i | j) == 0) {
            return EPOCH;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new Instant(j, i);
        }
        throw new RuntimeException("Instant exceeds minimum or maximum instant");
    }

    public static Instant b0(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.a(temporalAccessor, "temporal");
        try {
            return ofEpochSecond(temporalAccessor.y(ChronoField.INSTANT_SECONDS), temporalAccessor.get(ChronoField.NANO_OF_SECOND));
        } catch (DateTimeException e) {
            throw new RuntimeException(d.d("Unable to obtain Instant from TemporalAccessor: ", String.valueOf(temporalAccessor), " of type ", temporalAccessor.getClass().getName()), e);
        }
    }

    private Instant c0(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(j$.nio.channels.c.g(j$.nio.channels.c.g(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    private long e0(Instant instant) {
        long k = j$.nio.channels.c.k(instant.a, this.a);
        long j = instant.b - this.b;
        if (k > 0 && j < 0) {
            return k - 1;
        }
        if (k < 0 && j > 0) {
            return k + 1;
        }
        return k;
    }

    public static Instant now() {
        a.b.getClass();
        return ofEpochMilli(System.currentTimeMillis());
    }

    public static Instant ofEpochMilli(long j) {
        long j2 = 1000;
        return a0(j$.nio.file.attribute.p.f(j, j2), ((int) j$.nio.file.attribute.p.g(j, j2)) * 1000000);
    }

    public static Instant ofEpochSecond(long j) {
        return a0(j, 0);
    }

    public static Instant parse(CharSequence charSequence) {
        return (Instant) DateTimeFormatter.g.e(charSequence, new j$.desugar.sun.nio.fs.n(1));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 2, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.j.j()) {
            return ChronoUnit.NANOS;
        }
        if (nVar != j$.time.temporal.j.e() && nVar != j$.time.temporal.j.l() && nVar != j$.time.temporal.j.k() && nVar != j$.time.temporal.j.i() && nVar != j$.time.temporal.j.f() && nVar != j$.time.temporal.j.g()) {
            return nVar.g(this);
        }
        return null;
    }

    @Override // j$.time.temporal.k
    public final Temporal G(Temporal temporal) {
        return temporal.c(this.a, ChronoField.INSTANT_SECONDS).c(this.b, ChronoField.NANO_OF_SECOND);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.b0(this, zoneOffset);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.b0(this, zoneId);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            chronoField.c0(j);
            int i = e.a[chronoField.ordinal()];
            int i2 = this.b;
            long j2 = this.a;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            if (j != j2) {
                                return a0(j, i2);
                            }
                        } else {
                            throw new RuntimeException("Unsupported field: ".concat(String.valueOf(temporalField)));
                        }
                    } else {
                        int i3 = ((int) j) * 1000000;
                        if (i3 != i2) {
                            return a0(j2, i3);
                        }
                    }
                } else {
                    int i4 = ((int) j) * 1000;
                    if (i4 != i2) {
                        return a0(j2, i4);
                    }
                }
            } else if (j != i2) {
                return a0(j2, (int) j);
            }
            return this;
        }
        return (Instant) temporalField.D(this, j);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final Instant d(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (e.b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return plusNanos(j);
                case 2:
                    return c0(j / 1000000, (j % 1000000) * 1000);
                case 3:
                    return plusMillis(j);
                case 4:
                    return plusSeconds(j);
                case 5:
                    return plusSeconds(j$.nio.channels.c.j(j, 60));
                case 6:
                    return plusSeconds(j$.nio.channels.c.j(j, 3600));
                case 7:
                    return plusSeconds(j$.nio.channels.c.j(j, 43200));
                case 8:
                    return plusSeconds(j$.nio.channels.c.j(j, 86400));
                default:
                    throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
            }
        }
        return (Instant) temporalUnit.n(this, j);
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        Instant b0 = b0(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            int i = e.b[((ChronoUnit) temporalUnit).ordinal()];
            int i2 = this.b;
            long j = this.a;
            switch (i) {
                case 1:
                    return j$.nio.channels.c.g(j$.nio.channels.c.j(j$.nio.channels.c.k(b0.a, j), 1000000000L), b0.b - i2);
                case 2:
                    return j$.nio.channels.c.g(j$.nio.channels.c.j(j$.nio.channels.c.k(b0.a, j), 1000000000L), b0.b - i2) / 1000;
                case 3:
                    return j$.nio.channels.c.k(b0.toEpochMilli(), toEpochMilli());
                case 4:
                    return e0(b0);
                case 5:
                    return e0(b0) / 60;
                case 6:
                    return e0(b0) / 3600;
                case 7:
                    return e0(b0) / 43200;
                case 8:
                    return e0(b0) / 86400;
                default:
                    throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
            }
        }
        return temporalUnit.between(this, b0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        if (this.a == instant.a && this.b == instant.b) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.NANO_OF_SECOND || temporalField == ChronoField.MICRO_OF_SECOND || temporalField == ChronoField.MILLI_OF_SECOND) {
                return true;
            }
            return false;
        }
        if (temporalField != null && temporalField.y(this)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f0(DataOutput dataOutput) {
        dataOutput.writeLong(this.a);
        dataOutput.writeInt(this.b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = e.a[((ChronoField) temporalField).ordinal()];
            int i2 = this.b;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            ChronoField.INSTANT_SECONDS.b0(this.a);
                        }
                        throw new RuntimeException("Unsupported field: ".concat(String.valueOf(temporalField)));
                    }
                    return i2 / 1000000;
                }
                return i2 / 1000;
            }
            return i2;
        }
        return j$.time.temporal.j.d(this, temporalField).a(temporalField.u(this), temporalField);
    }

    public long getEpochSecond() {
        return this.a;
    }

    public int getNano() {
        return this.b;
    }

    public int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public boolean isAfter(Instant instant) {
        if (compareTo(instant) > 0) {
            return true;
        }
        return false;
    }

    public boolean isBefore(Instant instant) {
        if (compareTo(instant) < 0) {
            return true;
        }
        return false;
    }

    public Instant minus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.t(this);
    }

    public Instant minusMillis(long j) {
        if (j == Long.MIN_VALUE) {
            return plusMillis(Long.MAX_VALUE).plusMillis(1L);
        }
        return plusMillis(-j);
    }

    public Instant minusSeconds(long j) {
        if (j == Long.MIN_VALUE) {
            return plusSeconds(Long.MAX_VALUE).plusSeconds(1L);
        }
        return plusSeconds(-j);
    }

    public Instant plus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.n(this);
    }

    public Instant plusMillis(long j) {
        return c0(j / 1000, (j % 1000) * 1000000);
    }

    public Instant plusNanos(long j) {
        return c0(0L, j);
    }

    public Instant plusSeconds(long j) {
        return c0(j, 0L);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal t(LocalDate localDate) {
        localDate.getClass();
        return (Instant) AbstractC0077h.a(localDate, this);
    }

    public long toEpochMilli() {
        int i = this.b;
        long j = this.a;
        if (j < 0 && i > 0) {
            return j$.nio.channels.c.g(j$.nio.channels.c.j(j + 1, 1000), (i / 1000000) - 1000);
        }
        return j$.nio.channels.c.g(j$.nio.channels.c.j(j, 1000), i / 1000000);
    }

    public String toString() {
        return DateTimeFormatter.g.format(this);
    }

    public Instant truncatedTo(TemporalUnit temporalUnit) {
        if (temporalUnit == ChronoUnit.NANOS) {
            return this;
        }
        Duration duration = temporalUnit.getDuration();
        if (duration.getSeconds() <= 86400) {
            long nanos = duration.toNanos();
            if (86400000000000L % nanos == 0) {
                long j = ((this.a % 86400) * 1000000000) + this.b;
                return plusNanos((j$.nio.file.attribute.p.f(j, nanos) * nanos) - j);
            }
            throw new RuntimeException("Unit must divide into a standard day without remainder");
        }
        throw new RuntimeException("Unit is too large to be used for truncation");
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p u(TemporalField temporalField) {
        return j$.time.temporal.j.d(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        int i;
        if (temporalField instanceof ChronoField) {
            int i2 = e.a[((ChronoField) temporalField).ordinal()];
            int i3 = this.b;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            return this.a;
                        }
                        throw new RuntimeException("Unsupported field: ".concat(String.valueOf(temporalField)));
                    }
                    i = i3 / 1000000;
                } else {
                    i = i3 / 1000;
                }
                return i;
            }
            return i3;
        }
        return temporalField.u(this);
    }

    public static Instant ofEpochSecond(long j, long j2) {
        return a0(j$.nio.channels.c.g(j, j$.nio.file.attribute.p.f(j2, 1000000000L)), (int) j$.nio.file.attribute.p.g(j2, 1000000000L));
    }

    @Override // java.lang.Comparable
    public int compareTo(Instant instant) {
        int compare = Long.compare(this.a, instant.a);
        return compare != 0 ? compare : this.b - instant.b;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: minus, reason: merged with bridge method [inline-methods] */
    public Instant n(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, temporalUnit).d(1L, temporalUnit) : d(-j, temporalUnit);
    }
}
