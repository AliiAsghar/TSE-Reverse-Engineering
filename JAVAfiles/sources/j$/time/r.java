package j$.time;

import j$.time.chrono.AbstractC0077h;
import j$.time.format.G;
import j$.time.format.v;
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
public final class r implements Temporal, j$.time.temporal.k, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 4183400860270640070L;
    private final int a;
    private final int b;

    static {
        v vVar = new v();
        vVar.p(ChronoField.YEAR, 4, 10, G.EXCEEDS_PAD);
        vVar.e('-');
        vVar.o(ChronoField.MONTH_OF_YEAR, 2);
        vVar.x();
    }

    private r(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private long a0() {
        return ((this.a * 12) + this.b) - 1;
    }

    public static r b0(int i, int i2) {
        ChronoField.YEAR.c0(i);
        ChronoField.MONTH_OF_YEAR.c0(i2);
        return new r(i, i2);
    }

    private r f0(int i, int i2) {
        if (this.a == i && this.b == i2) {
            return this;
        }
        return new r(i, i2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 12, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.j.e()) {
            return j$.time.chrono.t.d;
        }
        if (nVar == j$.time.temporal.j.j()) {
            return ChronoUnit.MONTHS;
        }
        return j$.time.temporal.j.c(this, nVar);
    }

    @Override // j$.time.temporal.k
    public final Temporal G(Temporal temporal) {
        if (AbstractC0077h.q(temporal).equals(j$.time.chrono.t.d)) {
            return temporal.c(a0(), ChronoField.PROLEPTIC_MONTH);
        }
        throw new RuntimeException("Adjustment only supported on ISO date-time");
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final r d(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (q.b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return d0(j);
                case 2:
                    return e0(j);
                case 3:
                    return e0(j$.nio.channels.c.j(j, 10));
                case 4:
                    return e0(j$.nio.channels.c.j(j, 100));
                case 5:
                    return e0(j$.nio.channels.c.j(j, 1000));
                case 6:
                    ChronoField chronoField = ChronoField.ERA;
                    return c(j$.nio.channels.c.g(y(chronoField), j), chronoField);
                default:
                    throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
            }
        }
        return (r) temporalUnit.n(this, j);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        r rVar = (r) obj;
        int i = this.a - rVar.a;
        if (i == 0) {
            return this.b - rVar.b;
        }
        return i;
    }

    public final r d0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        long j3 = 12;
        return f0(ChronoField.YEAR.b0(j$.nio.file.attribute.p.f(j2, j3)), ((int) j$.nio.file.attribute.p.g(j2, j3)) + 1);
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        r b0;
        if (temporal instanceof r) {
            b0 = (r) temporal;
        } else {
            Objects.a(temporal, "temporal");
            try {
                if (!j$.time.chrono.t.d.equals(AbstractC0077h.q(temporal))) {
                    temporal = LocalDate.c0(temporal);
                }
                b0 = b0(temporal.get(ChronoField.YEAR), temporal.get(ChronoField.MONTH_OF_YEAR));
            } catch (DateTimeException e) {
                throw new RuntimeException(d.d("Unable to obtain YearMonth from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long a0 = b0.a0() - a0();
            switch (q.b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return a0;
                case 2:
                    return a0 / 12;
                case 3:
                    return a0 / 120;
                case 4:
                    return a0 / 1200;
                case 5:
                    return a0 / 12000;
                case 6:
                    ChronoField chronoField = ChronoField.ERA;
                    return b0.y(chronoField) - y(chronoField);
                default:
                    throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
            }
        }
        return temporalUnit.between(this, b0);
    }

    public final r e0(long j) {
        if (j == 0) {
            return this;
        }
        return f0(ChronoField.YEAR.b0(this.a + j), this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.a == rVar.a && this.b == rVar.b) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.YEAR || temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.PROLEPTIC_MONTH || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA) {
                return true;
            }
            return false;
        }
        if (temporalField != null && temporalField.y(this)) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final r c(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            chronoField.c0(j);
            int i = q.a[chronoField.ordinal()];
            int i2 = this.a;
            if (i != 1) {
                if (i != 2) {
                    int i3 = this.b;
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                if (y(ChronoField.ERA) == j) {
                                    return this;
                                }
                                int i4 = 1 - i2;
                                ChronoField.YEAR.c0(i4);
                                return f0(i4, i3);
                            }
                            throw new RuntimeException("Unsupported field: ".concat(String.valueOf(temporalField)));
                        }
                        int i5 = (int) j;
                        ChronoField.YEAR.c0(i5);
                        return f0(i5, i3);
                    }
                    if (i2 < 1) {
                        j = 1 - j;
                    }
                    int i6 = (int) j;
                    ChronoField.YEAR.c0(i6);
                    return f0(i6, i3);
                }
                return d0(j - a0());
            }
            int i7 = (int) j;
            ChronoField.MONTH_OF_YEAR.c0(i7);
            return f0(i2, i7);
        }
        return (r) temporalField.D(this, j);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return u(temporalField).a(y(temporalField), temporalField);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h0(DataOutput dataOutput) {
        dataOutput.writeInt(this.a);
        dataOutput.writeByte(this.b);
    }

    public final int hashCode() {
        return (this.b << 27) ^ this.a;
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
        localDate.getClass();
        return (r) AbstractC0077h.a(localDate, this);
    }

    public final String toString() {
        String str;
        int i = this.a;
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder(9);
        if (abs < 1000) {
            if (i < 0) {
                sb.append(i - 10000);
                sb.deleteCharAt(1);
            } else {
                sb.append(i + 10000);
                sb.deleteCharAt(0);
            }
        } else {
            sb.append(i);
        }
        int i2 = this.b;
        if (i2 < 10) {
            str = "-0";
        } else {
            str = "-";
        }
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p u(TemporalField temporalField) {
        long j;
        if (temporalField == ChronoField.YEAR_OF_ERA) {
            if (this.a <= 0) {
                j = 1000000000;
            } else {
                j = 999999999;
            }
            return j$.time.temporal.p.j(1L, j);
        }
        return j$.time.temporal.j.d(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = q.a[((ChronoField) temporalField).ordinal()];
            int i2 = 1;
            if (i != 1) {
                if (i != 2) {
                    int i3 = this.a;
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                if (i3 < 1) {
                                    i2 = 0;
                                }
                                return i2;
                            }
                            throw new RuntimeException("Unsupported field: ".concat(String.valueOf(temporalField)));
                        }
                        return i3;
                    }
                    if (i3 < 1) {
                        i3 = 1 - i3;
                    }
                    return i3;
                }
                return a0();
            }
            return this.b;
        }
        return temporalField.u(this);
    }
}
