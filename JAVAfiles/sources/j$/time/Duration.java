package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* loaded from: classes5.dex */
public final class Duration implements TemporalAmount, Comparable<Duration>, Serializable {
    public static final Duration ZERO = new Duration(0, 0);
    private static final BigInteger c = BigInteger.valueOf(1000000000);
    private static final long serialVersionUID = 3078945930695997490L;
    private final long a;
    private final int b;

    private Duration(long j, int i) {
        this.a = j;
        this.b = i;
    }

    private Duration D(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofSeconds(j$.nio.channels.c.g(j$.nio.channels.c.g(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    private BigDecimal G() {
        return BigDecimal.valueOf(this.a).add(BigDecimal.valueOf(this.b, 9));
    }

    public static Duration between(Temporal temporal, Temporal temporal2) {
        try {
            return ofNanos(temporal.e(temporal2, ChronoUnit.NANOS));
        } catch (DateTimeException | ArithmeticException unused) {
            long e = temporal.e(temporal2, ChronoUnit.SECONDS);
            long j = 0;
            try {
                ChronoField chronoField = ChronoField.NANO_OF_SECOND;
                long y = temporal2.y(chronoField) - temporal.y(chronoField);
                if (e > 0 && y < 0) {
                    e++;
                } else if (e < 0 && y > 0) {
                    e--;
                }
                j = y;
            } catch (DateTimeException unused2) {
            }
            return ofSeconds(e, j);
        }
    }

    public static Duration of(long j, TemporalUnit temporalUnit) {
        Duration duration = ZERO;
        duration.getClass();
        Objects.a(temporalUnit, "unit");
        if (temporalUnit == ChronoUnit.DAYS) {
            return duration.D(j$.nio.channels.c.j(j, 86400), 0L);
        }
        if (!temporalUnit.t()) {
            if (j != 0) {
                if (temporalUnit instanceof ChronoUnit) {
                    int i = c.a[((ChronoUnit) temporalUnit).ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    return duration.plusSeconds(j$.nio.channels.c.j(temporalUnit.getDuration().a, j));
                                }
                                return duration.plusSeconds(j);
                            }
                            return duration.D(j / 1000, (j % 1000) * 1000000);
                        }
                        return duration.plusSeconds((j / 1000000000) * 1000).D(0L, (j % 1000000000) * 1000);
                    }
                    return duration.D(0L, j);
                }
                return duration.plusSeconds(temporalUnit.getDuration().multipliedBy(j).getSeconds()).D(0L, r11.getNano());
            }
            return duration;
        }
        throw new RuntimeException("Unit must not have an estimated duration");
    }

    public static Duration ofDays(long j) {
        return u(j$.nio.channels.c.j(j, 86400), 0);
    }

    public static Duration ofHours(long j) {
        return u(j$.nio.channels.c.j(j, 3600), 0);
    }

    public static Duration ofMillis(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        return u(j2, i * 1000000);
    }

    public static Duration ofMinutes(long j) {
        return u(j$.nio.channels.c.j(j, 60), 0);
    }

    public static Duration ofNanos(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (i + 1000000000);
            j2--;
        }
        return u(j2, i);
    }

    public static Duration ofSeconds(long j) {
        return u(j, 0);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private static Duration u(long j, int i) {
        if ((i | j) == 0) {
            return ZERO;
        }
        return new Duration(j, i);
    }

    private Object writeReplace() {
        return new n((byte) 1, this);
    }

    private static Duration y(BigDecimal bigDecimal) {
        BigInteger bigIntegerExact = bigDecimal.movePointRight(9).toBigIntegerExact();
        BigInteger[] divideAndRemainder = bigIntegerExact.divideAndRemainder(c);
        if (divideAndRemainder[0].bitLength() <= 63) {
            return ofSeconds(divideAndRemainder[0].longValue(), divideAndRemainder[1].intValue());
        }
        throw new ArithmeticException("Exceeds capacity of Duration: ".concat(String.valueOf(bigIntegerExact)));
    }

    public Duration abs() {
        if (isNegative()) {
            return multipliedBy(-1L);
        }
        return this;
    }

    public Duration dividedBy(long j) {
        if (j != 0) {
            return j == 1 ? this : y(G().divide(BigDecimal.valueOf(j), RoundingMode.DOWN));
        }
        throw new ArithmeticException("Cannot divide by zero");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        if (this.a == duration.a && this.b == duration.b) {
            return true;
        }
        return false;
    }

    public int getNano() {
        return this.b;
    }

    public long getSeconds() {
        return this.a;
    }

    public int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public boolean isNegative() {
        if (this.a < 0) {
            return true;
        }
        return false;
    }

    public boolean isZero() {
        if ((this.b | this.a) == 0) {
            return true;
        }
        return false;
    }

    public Duration minus(Duration duration) {
        long seconds = duration.getSeconds();
        int nano = duration.getNano();
        if (seconds == Long.MIN_VALUE) {
            return D(Long.MAX_VALUE, -nano).D(1L, 0L);
        }
        return D(-seconds, -nano);
    }

    public Duration multipliedBy(long j) {
        if (j == 0) {
            return ZERO;
        }
        if (j == 1) {
            return this;
        }
        return y(G().multiply(BigDecimal.valueOf(j)));
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal n(Temporal temporal) {
        long j = this.a;
        if (j != 0) {
            temporal = temporal.d(j, ChronoUnit.SECONDS);
        }
        int i = this.b;
        if (i != 0) {
            return temporal.d(i, ChronoUnit.NANOS);
        }
        return temporal;
    }

    public Duration plus(Duration duration) {
        return D(duration.getSeconds(), duration.getNano());
    }

    public Duration plusSeconds(long j) {
        return D(j, 0L);
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal t(Instant instant) {
        long j = this.a;
        if (j != 0) {
            instant = instant.n(j, ChronoUnit.SECONDS);
        }
        int i = this.b;
        if (i != 0) {
            return instant.n(i, ChronoUnit.NANOS);
        }
        return instant;
    }

    public long toDays() {
        return this.a / 86400;
    }

    public long toHours() {
        return this.a / 3600;
    }

    public long toMillis() {
        long j = this.b;
        long j2 = this.a;
        if (j2 < 0) {
            j2++;
            j -= 1000000000;
        }
        return j$.nio.channels.c.g(j$.nio.channels.c.j(j2, 1000), j / 1000000);
    }

    public long toMinutes() {
        return this.a / 60;
    }

    public long toNanos() {
        long j = this.b;
        long j2 = this.a;
        if (j2 < 0) {
            j2++;
            j -= 1000000000;
        }
        return j$.nio.channels.c.g(j$.nio.channels.c.j(j2, 1000000000L), j);
    }

    public long toSeconds() {
        return this.a;
    }

    public String toString() {
        long j;
        if (this == ZERO) {
            return "PT0S";
        }
        long j2 = this.a;
        int i = this.b;
        if (j2 < 0 && i > 0) {
            j = 1 + j2;
        } else {
            j = j2;
        }
        long j3 = j / 3600;
        int i2 = (int) ((j % 3600) / 60);
        int i3 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j3 != 0) {
            sb.append(j3);
            sb.append('H');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i3 == 0 && i == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (j2 < 0 && i > 0) {
            if (i3 == 0) {
                sb.append("-0");
            } else {
                sb.append(i3);
            }
        } else {
            sb.append(i3);
        }
        if (i > 0) {
            int length = sb.length();
            if (j2 < 0) {
                sb.append(2000000000 - i);
            } else {
                sb.append(i + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeLong(this.a);
        objectOutput.writeInt(this.b);
    }

    public static Duration ofSeconds(long j, long j2) {
        return u(j$.nio.channels.c.g(j, j$.nio.file.attribute.p.f(j2, 1000000000L)), (int) j$.nio.file.attribute.p.g(j2, 1000000000L));
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        int compare = Long.compare(this.a, duration.a);
        return compare != 0 ? compare : this.b - duration.b;
    }

    public long dividedBy(Duration duration) {
        Objects.a(duration, "divisor");
        return G().divideToIntegralValue(duration.G()).longValueExact();
    }
}
