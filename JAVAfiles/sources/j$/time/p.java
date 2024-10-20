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
public final class p implements Temporal, j$.time.temporal.k, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    private final int a;

    static {
        v vVar = new v();
        vVar.p(ChronoField.YEAR, 4, 10, G.EXCEEDS_PAD);
        vVar.x();
    }

    private p(int i) {
        this.a = i;
    }

    public static p a0(int i) {
        ChronoField.YEAR.c0(i);
        return new p(i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 11, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.j.e()) {
            return j$.time.chrono.t.d;
        }
        if (nVar == j$.time.temporal.j.j()) {
            return ChronoUnit.YEARS;
        }
        return j$.time.temporal.j.c(this, nVar);
    }

    @Override // j$.time.temporal.k
    public final Temporal G(Temporal temporal) {
        if (AbstractC0077h.q(temporal).equals(j$.time.chrono.t.d)) {
            return temporal.c(this.a, ChronoField.YEAR);
        }
        throw new RuntimeException("Adjustment only supported on ISO date-time");
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final p d(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            int i = o.b[((ChronoUnit) temporalUnit).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                ChronoField chronoField = ChronoField.ERA;
                                return c(j$.nio.channels.c.g(y(chronoField), j), chronoField);
                            }
                            throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                        }
                        return c0(j$.nio.channels.c.j(j, 1000));
                    }
                    return c0(j$.nio.channels.c.j(j, 100));
                }
                return c0(j$.nio.channels.c.j(j, 10));
            }
            return c0(j);
        }
        return (p) temporalUnit.n(this, j);
    }

    public final p c0(long j) {
        if (j == 0) {
            return this;
        }
        return a0(ChronoField.YEAR.b0(this.a + j));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((p) obj).a;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final p c(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            chronoField.c0(j);
            int i = o.a[chronoField.ordinal()];
            int i2 = this.a;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (y(ChronoField.ERA) == j) {
                            return this;
                        }
                        return a0(1 - i2);
                    }
                    throw new RuntimeException("Unsupported field: ".concat(String.valueOf(temporalField)));
                }
                return a0((int) j);
            }
            if (i2 < 1) {
                j = 1 - j;
            }
            return a0((int) j);
        }
        return (p) temporalField.D(this, j);
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        p a0;
        if (temporal instanceof p) {
            a0 = (p) temporal;
        } else {
            Objects.a(temporal, "temporal");
            try {
                if (!j$.time.chrono.t.d.equals(AbstractC0077h.q(temporal))) {
                    temporal = LocalDate.c0(temporal);
                }
                a0 = a0(temporal.get(ChronoField.YEAR));
            } catch (DateTimeException e) {
                throw new RuntimeException(d.d("Unable to obtain Year from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long j = a0.a - this.a;
            int i = o.b[((ChronoUnit) temporalUnit).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                ChronoField chronoField = ChronoField.ERA;
                                return a0.y(chronoField) - y(chronoField);
                            }
                            throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                        }
                        return j / 1000;
                    }
                    return j / 100;
                }
                return j / 10;
            }
            return j;
        }
        return temporalUnit.between(this, a0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e0(DataOutput dataOutput) {
        dataOutput.writeInt(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        if (this.a == ((p) obj).a) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.YEAR || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA) {
                return true;
            }
            return false;
        }
        if (temporalField != null && temporalField.y(this)) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return u(temporalField).a(y(temporalField), temporalField);
    }

    public final int hashCode() {
        return this.a;
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
        return (p) AbstractC0077h.a(localDate, this);
    }

    public final String toString() {
        return Integer.toString(this.a);
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
            int i = o.a[((ChronoField) temporalField).ordinal()];
            int i2 = this.a;
            int i3 = 1;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (i2 < 1) {
                            i3 = 0;
                        }
                        return i3;
                    }
                    throw new RuntimeException("Unsupported field: ".concat(String.valueOf(temporalField)));
                }
                return i2;
            }
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        return temporalField.u(this);
    }
}
