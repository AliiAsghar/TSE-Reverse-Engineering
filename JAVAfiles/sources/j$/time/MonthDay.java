package j$.time;

import j$.time.chrono.AbstractC0077h;
import j$.time.format.v;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class MonthDay implements TemporalAccessor, j$.time.temporal.k, Comparable<MonthDay>, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = -939150713474957432L;
    private final int a;
    private final int b;

    static {
        v vVar = new v();
        vVar.f("--");
        vVar.o(ChronoField.MONTH_OF_YEAR, 2);
        vVar.e('-');
        vVar.o(ChronoField.DAY_OF_MONTH, 2);
        vVar.x();
    }

    private MonthDay(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static MonthDay a0(int i, int i2) {
        i d0 = i.d0(i);
        Objects.a(d0, "month");
        ChronoField.DAY_OF_MONTH.c0(i2);
        if (i2 <= d0.c0()) {
            return new MonthDay(d0.getValue(), i2);
        }
        throw new RuntimeException("Illegal value for DayOfMonth field, value " + i2 + " is not valid for month " + d0.name());
    }

    public static MonthDay from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof MonthDay) {
            return (MonthDay) temporalAccessor;
        }
        try {
            if (!j$.time.chrono.t.d.equals(AbstractC0077h.q(temporalAccessor))) {
                temporalAccessor = LocalDate.c0(temporalAccessor);
            }
            return a0(temporalAccessor.get(ChronoField.MONTH_OF_YEAR), temporalAccessor.get(ChronoField.DAY_OF_MONTH));
        } catch (DateTimeException e) {
            throw new RuntimeException(d.d("Unable to obtain MonthDay from TemporalAccessor: ", String.valueOf(temporalAccessor), " of type ", temporalAccessor.getClass().getName()), e);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 13, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.j.e()) {
            return j$.time.chrono.t.d;
        }
        return j$.time.temporal.j.c(this, nVar);
    }

    @Override // j$.time.temporal.k
    public final Temporal G(Temporal temporal) {
        if (AbstractC0077h.q(temporal).equals(j$.time.chrono.t.d)) {
            Temporal c2 = temporal.c(this.a, ChronoField.MONTH_OF_YEAR);
            ChronoField chronoField = ChronoField.DAY_OF_MONTH;
            return c2.c(Math.min(c2.u(chronoField).d(), this.b), chronoField);
        }
        throw new RuntimeException("Adjustment only supported on ISO date-time");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b0(DataOutput dataOutput) {
        dataOutput.writeByte(this.a);
        dataOutput.writeByte(this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(MonthDay monthDay) {
        MonthDay monthDay2 = monthDay;
        int i = this.a - monthDay2.a;
        if (i == 0) {
            return this.b - monthDay2.b;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MonthDay)) {
            return false;
        }
        MonthDay monthDay = (MonthDay) obj;
        if (this.a == monthDay.a && this.b == monthDay.b) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.DAY_OF_MONTH) {
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
        return (this.a << 6) + this.b;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        int i = this.a;
        if (i < 10) {
            str = "0";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(i);
        int i2 = this.b;
        if (i2 < 10) {
            str2 = "-0";
        } else {
            str2 = "-";
        }
        sb.append(str2);
        sb.append(i2);
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p u(TemporalField temporalField) {
        int i;
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return temporalField.n();
        }
        if (temporalField == ChronoField.DAY_OF_MONTH) {
            int ordinal = i.d0(this.a).ordinal();
            if (ordinal != 1) {
                if (ordinal != 3 && ordinal != 5 && ordinal != 8 && ordinal != 10) {
                    i = 31;
                } else {
                    i = 30;
                }
            } else {
                i = 28;
            }
            return j$.time.temporal.p.k(1L, i, i.d0(r8).c0());
        }
        return j$.time.temporal.j.d(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        int i;
        if (temporalField instanceof ChronoField) {
            int i2 = j.a[((ChronoField) temporalField).ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    i = this.a;
                } else {
                    throw new RuntimeException("Unsupported field: ".concat(String.valueOf(temporalField)));
                }
            } else {
                i = this.b;
            }
            return i;
        }
        return temporalField.u(this);
    }
}
