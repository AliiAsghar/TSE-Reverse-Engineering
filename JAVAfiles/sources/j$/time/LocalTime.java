package j$.time;

import j$.time.chrono.AbstractC0077h;
import j$.time.format.DateTimeFormatter;
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
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class LocalTime implements Temporal, j$.time.temporal.k, Comparable<LocalTime>, Serializable {
    public static final LocalTime e;
    public static final LocalTime f;
    public static final LocalTime g;
    private static final LocalTime[] h = new LocalTime[24];
    private static final long serialVersionUID = 6414437269572265201L;
    private final byte a;
    private final byte b;
    private final byte c;
    private final int d;

    static {
        int i = 0;
        while (true) {
            LocalTime[] localTimeArr = h;
            if (i < localTimeArr.length) {
                localTimeArr[i] = new LocalTime(i, 0, 0, 0);
                i++;
            } else {
                LocalTime localTime = localTimeArr[0];
                g = localTime;
                LocalTime localTime2 = localTimeArr[12];
                e = localTime;
                f = new LocalTime(23, 59, 59, 999999999);
                return;
            }
        }
    }

    private LocalTime(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    private static LocalTime b0(int i, int i2, int i3, int i4) {
        if ((i2 | i3 | i4) == 0) {
            return h[i];
        }
        return new LocalTime(i, i2, i3, i4);
    }

    public static LocalTime c0(Temporal temporal) {
        Objects.a(temporal, "temporal");
        LocalTime localTime = (LocalTime) temporal.D(j$.time.temporal.j.g());
        if (localTime != null) {
            return localTime;
        }
        throw new RuntimeException(d.d("Unable to obtain LocalTime from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()));
    }

    private int d0(TemporalField temporalField) {
        int i = h.a[((ChronoField) temporalField).ordinal()];
        byte b = this.b;
        int i2 = this.d;
        byte b2 = this.a;
        switch (i) {
            case 1:
                return i2;
            case 2:
                throw new RuntimeException("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i2 / 1000;
            case 4:
                throw new RuntimeException("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i2 / 1000000;
            case 6:
                return (int) (r0() / 1000000);
            case 7:
                return this.c;
            case 8:
                return s0();
            case 9:
                return b;
            case 10:
                return (b2 * 60) + b;
            case 11:
                return b2 % 12;
            case 12:
                int i3 = b2 % 12;
                if (i3 % 12 == 0) {
                    return 12;
                }
                return i3;
            case 13:
                return b2;
            case 14:
                if (b2 == 0) {
                    return 24;
                }
                return b2;
            case 15:
                return b2 / 12;
            default:
                throw new RuntimeException("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
    }

    public static LocalTime i0(int i, int i2, int i3, int i4) {
        ChronoField.HOUR_OF_DAY.c0(i);
        ChronoField.MINUTE_OF_HOUR.c0(i2);
        ChronoField.SECOND_OF_MINUTE.c0(i3);
        ChronoField.NANO_OF_SECOND.c0(i4);
        return b0(i, i2, i3, i4);
    }

    public static LocalTime j0(long j) {
        ChronoField.NANO_OF_DAY.c0(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return b0(i, i2, i3, (int) (j3 - (i3 * 1000000000)));
    }

    public static LocalTime k0(long j) {
        ChronoField.SECOND_OF_DAY.c0(j);
        int i = (int) (j / 3600);
        long j2 = j - (i * 3600);
        return b0(i, (int) (j2 / 60), (int) (j2 - (r0 * 60)), 0);
    }

    public static LocalTime of(int i, int i2) {
        ChronoField.HOUR_OF_DAY.c0(i);
        if (i2 == 0) {
            return h[i];
        }
        ChronoField.MINUTE_OF_HOUR.c0(i2);
        return new LocalTime(i, i2, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    public static LocalTime q0(ObjectInput objectInput) {
        int i;
        int i2;
        int readByte = objectInput.readByte();
        byte b = 0;
        if (readByte < 0) {
            readByte = ~readByte;
            i = 0;
        } else {
            byte readByte2 = objectInput.readByte();
            if (readByte2 < 0) {
                ?? r5 = ~readByte2;
                i2 = 0;
                b = r5;
                i = 0;
            } else {
                byte readByte3 = objectInput.readByte();
                if (readByte3 < 0) {
                    i = ~readByte3;
                    b = readByte2;
                } else {
                    int readInt = objectInput.readInt();
                    i = readByte3;
                    i2 = readInt;
                    b = readByte2;
                }
            }
            return i0(readByte, b, i, i2);
        }
        i2 = 0;
        return i0(readByte, b, i, i2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 4, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.j.e() || nVar == j$.time.temporal.j.l() || nVar == j$.time.temporal.j.k() || nVar == j$.time.temporal.j.i()) {
            return null;
        }
        if (nVar == j$.time.temporal.j.g()) {
            return this;
        }
        if (nVar == j$.time.temporal.j.f()) {
            return null;
        }
        if (nVar == j$.time.temporal.j.j()) {
            return ChronoUnit.NANOS;
        }
        return nVar.g(this);
    }

    @Override // j$.time.temporal.k
    public final Temporal G(Temporal temporal) {
        return temporal.c(r0(), ChronoField.NANO_OF_DAY);
    }

    @Override // java.lang.Comparable
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final int compareTo(LocalTime localTime) {
        int compare = Integer.compare(this.a, localTime.a);
        if (compare == 0) {
            int compare2 = Integer.compare(this.b, localTime.b);
            if (compare2 == 0) {
                int compare3 = Integer.compare(this.c, localTime.c);
                if (compare3 == 0) {
                    return Integer.compare(this.d, localTime.d);
                }
                return compare3;
            }
            return compare2;
        }
        return compare;
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        LocalTime c0 = c0(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            long r0 = c0.r0() - r0();
            switch (h.b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return r0;
                case 2:
                    return r0 / 1000;
                case 3:
                    return r0 / 1000000;
                case 4:
                    return r0 / 1000000000;
                case 5:
                    return r0 / 60000000000L;
                case 6:
                    return r0 / 3600000000000L;
                case 7:
                    return r0 / 43200000000000L;
                default:
                    throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
            }
        }
        return temporalUnit.between(this, c0);
    }

    public final int e0() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalTime)) {
            return false;
        }
        LocalTime localTime = (LocalTime) obj;
        if (this.a == localTime.a && this.b == localTime.b && this.c == localTime.c && this.d == localTime.d) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).d0();
        }
        if (temporalField != null && temporalField.y(this)) {
            return true;
        }
        return false;
    }

    public final int f0() {
        return this.b;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.a(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    public final int g0() {
        return this.d;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return d0(temporalField);
        }
        return j$.time.temporal.j.a(this, temporalField);
    }

    public final int h0() {
        return this.c;
    }

    public final int hashCode() {
        long r0 = r0();
        return (int) (r0 ^ (r0 >>> 32));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final LocalTime d(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (h.b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return o0(j);
                case 2:
                    return o0((j % 86400000000L) * 1000);
                case 3:
                    return o0((j % 86400000) * 1000000);
                case 4:
                    return p0(j);
                case 5:
                    return n0(j);
                case 6:
                    return m0(j);
                case 7:
                    return m0((j % 2) * 12);
                default:
                    throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
            }
        }
        return (LocalTime) temporalUnit.n(this, j);
    }

    public final LocalTime m0(long j) {
        if (j == 0) {
            return this;
        }
        return b0(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal n(long j, ChronoUnit chronoUnit) {
        if (j == Long.MIN_VALUE) {
            return d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit);
        }
        return d(-j, chronoUnit);
    }

    public final LocalTime n0(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.a * 60) + this.b;
        int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
        if (i == i2) {
            return this;
        }
        return b0(i2 / 60, i2 % 60, this.c, this.d);
    }

    public final LocalTime o0(long j) {
        if (j == 0) {
            return this;
        }
        long r0 = r0();
        long j2 = (((j % 86400000000000L) + r0) + 86400000000000L) % 86400000000000L;
        if (r0 == j2) {
            return this;
        }
        return b0((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
    }

    public final LocalTime p0(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.b * 60) + (this.a * 3600) + this.c;
        int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
        if (i == i2) {
            return this;
        }
        return b0(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
    }

    public final long r0() {
        return (this.c * 1000000000) + (this.b * 60000000000L) + (this.a * 3600000000000L) + this.d;
    }

    public final int s0() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal t(LocalDate localDate) {
        localDate.getClass();
        return (LocalTime) AbstractC0077h.a(localDate, this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public final LocalTime c(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            chronoField.c0(j);
            int i = h.a[chronoField.ordinal()];
            byte b = this.b;
            byte b2 = this.c;
            int i2 = this.d;
            byte b3 = this.a;
            switch (i) {
                case 1:
                    return u0((int) j);
                case 2:
                    return j0(j);
                case 3:
                    return u0(((int) j) * 1000);
                case 4:
                    return j0(j * 1000);
                case 5:
                    return u0(((int) j) * 1000000);
                case 6:
                    return j0(j * 1000000);
                case 7:
                    int i3 = (int) j;
                    if (b2 == i3) {
                        return this;
                    }
                    ChronoField.SECOND_OF_MINUTE.c0(i3);
                    return b0(b3, b, i3, i2);
                case 8:
                    return p0(j - s0());
                case 9:
                    int i4 = (int) j;
                    if (b == i4) {
                        return this;
                    }
                    ChronoField.MINUTE_OF_HOUR.c0(i4);
                    return b0(b3, i4, b2, i2);
                case 10:
                    return n0(j - ((b3 * 60) + b));
                case 11:
                    return m0(j - (b3 % 12));
                case 12:
                    if (j == 12) {
                        j = 0;
                    }
                    return m0(j - (b3 % 12));
                case 13:
                    int i5 = (int) j;
                    if (b3 == i5) {
                        return this;
                    }
                    ChronoField.HOUR_OF_DAY.c0(i5);
                    return b0(i5, b, b2, i2);
                case 14:
                    if (j == 24) {
                        j = 0;
                    }
                    int i6 = (int) j;
                    if (b3 == i6) {
                        return this;
                    }
                    ChronoField.HOUR_OF_DAY.c0(i6);
                    return b0(i6, b, b2, i2);
                case 15:
                    return m0((j - (b3 / 12)) * 12);
                default:
                    throw new RuntimeException("Unsupported field: ".concat(String.valueOf(temporalField)));
            }
        }
        return (LocalTime) temporalField.D(this, j);
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        if (b < 10) {
            str = "0";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append((int) b);
        String str3 = ":";
        byte b2 = this.b;
        if (b2 >= 10) {
            str2 = ":";
        } else {
            str2 = ":0";
        }
        sb.append(str2);
        sb.append((int) b2);
        byte b3 = this.c;
        int i = this.d;
        if (b3 > 0 || i > 0) {
            if (b3 < 10) {
                str3 = ":0";
            }
            sb.append(str3);
            sb.append((int) b3);
            if (i > 0) {
                sb.append('.');
                if (i % 1000000 == 0) {
                    sb.append(Integer.toString((i / 1000000) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p u(TemporalField temporalField) {
        return j$.time.temporal.j.d(this, temporalField);
    }

    public final LocalTime u0(int i) {
        if (this.d == i) {
            return this;
        }
        ChronoField.NANO_OF_SECOND.c0(i);
        return b0(this.a, this.b, this.c, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v0(DataOutput dataOutput) {
        byte b = this.c;
        byte b2 = this.a;
        byte b3 = this.b;
        int i = this.d;
        if (i == 0) {
            if (b == 0) {
                if (b3 == 0) {
                    dataOutput.writeByte(~b2);
                    return;
                } else {
                    dataOutput.writeByte(b2);
                    dataOutput.writeByte(~b3);
                    return;
                }
            }
            dataOutput.writeByte(b2);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(~b);
            return;
        }
        dataOutput.writeByte(b2);
        dataOutput.writeByte(b3);
        dataOutput.writeByte(b);
        dataOutput.writeInt(i);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.NANO_OF_DAY) {
                return r0();
            }
            if (temporalField == ChronoField.MICRO_OF_DAY) {
                return r0() / 1000;
            }
            return d0(temporalField);
        }
        return temporalField.u(this);
    }
}
