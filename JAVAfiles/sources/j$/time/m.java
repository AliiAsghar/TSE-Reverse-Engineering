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
public final class m implements Temporal, j$.time.temporal.k, Comparable, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;
    private final LocalTime a;
    private final ZoneOffset b;

    static {
        LocalTime localTime = LocalTime.e;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localTime.getClass();
        a0(localTime, zoneOffset);
        LocalTime localTime2 = LocalTime.f;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localTime2.getClass();
        a0(localTime2, zoneOffset2);
    }

    private m(LocalTime localTime, ZoneOffset zoneOffset) {
        Objects.a(localTime, "time");
        this.a = localTime;
        Objects.a(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    public static m a0(LocalTime localTime, ZoneOffset zoneOffset) {
        return new m(localTime, zoneOffset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m c0(ObjectInput objectInput) {
        return new m(LocalTime.q0(objectInput), ZoneOffset.m0(objectInput));
    }

    private long d0() {
        return this.a.r0() - (this.b.i0() * 1000000000);
    }

    private m e0(LocalTime localTime, ZoneOffset zoneOffset) {
        if (this.a == localTime && this.b.equals(zoneOffset)) {
            return this;
        }
        return new m(localTime, zoneOffset);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 9, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(j$.time.temporal.n nVar) {
        boolean z;
        if (nVar != j$.time.temporal.j.i() && nVar != j$.time.temporal.j.k()) {
            boolean z2 = false;
            if (nVar == j$.time.temporal.j.l()) {
                z = true;
            } else {
                z = false;
            }
            if (nVar == j$.time.temporal.j.e()) {
                z2 = true;
            }
            if (!(z | z2) && nVar != j$.time.temporal.j.f()) {
                if (nVar == j$.time.temporal.j.g()) {
                    return this.a;
                }
                if (nVar == j$.time.temporal.j.j()) {
                    return ChronoUnit.NANOS;
                }
                return nVar.g(this);
            }
            return null;
        }
        return this.b;
    }

    @Override // j$.time.temporal.k
    public final Temporal G(Temporal temporal) {
        return temporal.c(this.a.r0(), ChronoField.NANO_OF_DAY).c(this.b.i0(), ChronoField.OFFSET_SECONDS);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final m d(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return e0(this.a.d(j, temporalUnit), this.b);
        }
        return (m) temporalUnit.n(this, j);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = ChronoField.OFFSET_SECONDS;
            LocalTime localTime = this.a;
            if (temporalField == chronoField) {
                return e0(localTime, ZoneOffset.ofTotalSeconds(((ChronoField) temporalField).b0(j)));
            }
            return e0(localTime.c(j, temporalField), this.b);
        }
        return (m) temporalField.D(this, j);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        m mVar = (m) obj;
        boolean equals = this.b.equals(mVar.b);
        LocalTime localTime = this.a;
        LocalTime localTime2 = mVar.a;
        if (equals) {
            return localTime.compareTo(localTime2);
        }
        int compare = Long.compare(d0(), mVar.d0());
        if (compare == 0) {
            return localTime.compareTo(localTime2);
        }
        return compare;
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        m mVar;
        if (temporal instanceof m) {
            mVar = (m) temporal;
        } else {
            try {
                mVar = new m(LocalTime.c0(temporal), ZoneOffset.h0(temporal));
            } catch (DateTimeException e) {
                throw new RuntimeException(d.d("Unable to obtain OffsetTime from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long d0 = mVar.d0() - d0();
            switch (l.a[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return d0;
                case 2:
                    return d0 / 1000;
                case 3:
                    return d0 / 1000000;
                case 4:
                    return d0 / 1000000000;
                case 5:
                    return d0 / 60000000000L;
                case 6:
                    return d0 / 3600000000000L;
                case 7:
                    return d0 / 43200000000000L;
                default:
                    throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
            }
        }
        return temporalUnit.between(this, mVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.a.equals(mVar.a) && this.b.equals(mVar.b)) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (((ChronoField) temporalField).d0() || temporalField == ChronoField.OFFSET_SECONDS) {
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
        return j$.time.temporal.j.a(this, temporalField);
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
        localDate.getClass();
        return (m) AbstractC0077h.a(localDate, this);
    }

    public final String toString() {
        return this.a.toString() + this.b.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p u(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.OFFSET_SECONDS) {
                return ((ChronoField) temporalField).n();
            }
            LocalTime localTime = this.a;
            localTime.getClass();
            return j$.time.temporal.j.d(localTime, temporalField);
        }
        return temporalField.G(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        this.a.v0(objectOutput);
        this.b.n0(objectOutput);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.OFFSET_SECONDS) {
                return this.b.i0();
            }
            return this.a.y(temporalField);
        }
        return temporalField.u(this);
    }
}
