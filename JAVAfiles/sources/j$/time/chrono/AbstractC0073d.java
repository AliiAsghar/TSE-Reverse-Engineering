package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.chrono.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0073d implements InterfaceC0071b, Temporal, j$.time.temporal.k, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InterfaceC0071b a0(m mVar, Temporal temporal) {
        InterfaceC0071b interfaceC0071b = (InterfaceC0071b) temporal;
        if (mVar.equals(interfaceC0071b.a())) {
            return interfaceC0071b;
        }
        throw new ClassCastException(j$.time.d.d("Chronology mismatch, expected: ", mVar.m(), ", actual: ", interfaceC0071b.a().m()));
    }

    private long b0(InterfaceC0071b interfaceC0071b) {
        if (a().Q(ChronoField.MONTH_OF_YEAR).d() == 12) {
            ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
            long y = y(chronoField) * 32;
            ChronoField chronoField2 = ChronoField.DAY_OF_MONTH;
            return (((interfaceC0071b.y(chronoField) * 32) + interfaceC0071b.get(chronoField2)) - (y + j$.time.temporal.j.a(this, chronoField2))) / 32;
        }
        throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
    }

    @Override // j$.time.chrono.InterfaceC0071b
    public ChronoLocalDateTime B(LocalTime localTime) {
        return C0075f.b0(this, localTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object D(j$.time.temporal.n nVar) {
        return AbstractC0077h.j(this, nVar);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ Temporal G(Temporal temporal) {
        return AbstractC0077h.a(this, temporal);
    }

    @Override // j$.time.chrono.InterfaceC0071b
    public n H() {
        return a().X(get(ChronoField.ERA));
    }

    @Override // j$.time.chrono.InterfaceC0071b
    public boolean N() {
        return a().W(y(ChronoField.YEAR));
    }

    @Override // j$.time.chrono.InterfaceC0071b
    public InterfaceC0071b O(TemporalAmount temporalAmount) {
        return a0(a(), temporalAmount.n(this));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: S */
    public InterfaceC0071b n(long j, TemporalUnit temporalUnit) {
        return a0(a(), j$.time.temporal.j.b(this, j, temporalUnit));
    }

    @Override // j$.time.chrono.InterfaceC0071b
    public int U() {
        if (N()) {
            return 366;
        }
        return 365;
    }

    @Override // java.lang.Comparable
    /* renamed from: V */
    public final /* synthetic */ int compareTo(InterfaceC0071b interfaceC0071b) {
        return AbstractC0077h.b(this, interfaceC0071b);
    }

    abstract InterfaceC0071b c0(long j);

    abstract InterfaceC0071b d0(long j);

    @Override // j$.time.chrono.InterfaceC0071b, j$.time.temporal.Temporal
    public long e(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.a(temporal, "endExclusive");
        InterfaceC0071b q = a().q(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            switch (AbstractC0072c.a[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return q.toEpochDay() - toEpochDay();
                case 2:
                    return (q.toEpochDay() - toEpochDay()) / 7;
                case 3:
                    return b0(q);
                case 4:
                    return b0(q) / 12;
                case 5:
                    return b0(q) / 120;
                case 6:
                    return b0(q) / 1200;
                case 7:
                    return b0(q) / 12000;
                case 8:
                    ChronoField chronoField = ChronoField.ERA;
                    return q.y(chronoField) - y(chronoField);
                default:
                    throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
            }
        }
        Objects.a(temporalUnit, "unit");
        return temporalUnit.between(this, q);
    }

    abstract InterfaceC0071b e0(long j);

    @Override // j$.time.chrono.InterfaceC0071b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof InterfaceC0071b) && AbstractC0077h.b(this, (InterfaceC0071b) obj) == 0) {
            return true;
        }
        return false;
    }

    @Override // j$.time.chrono.InterfaceC0071b, j$.time.temporal.TemporalAccessor
    public /* synthetic */ boolean f(TemporalField temporalField) {
        return AbstractC0077h.h(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int get(TemporalField temporalField) {
        return j$.time.temporal.j.a(this, temporalField);
    }

    @Override // j$.time.chrono.InterfaceC0071b
    public int hashCode() {
        long epochDay = toEpochDay();
        return a().hashCode() ^ ((int) (epochDay ^ (epochDay >>> 32)));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: k */
    public InterfaceC0071b t(j$.time.temporal.k kVar) {
        return a0(a(), kVar.G(this));
    }

    @Override // j$.time.chrono.InterfaceC0071b
    public long toEpochDay() {
        return y(ChronoField.EPOCH_DAY);
    }

    @Override // j$.time.chrono.InterfaceC0071b
    public String toString() {
        String str;
        long y = y(ChronoField.YEAR_OF_ERA);
        long y2 = y(ChronoField.MONTH_OF_YEAR);
        long y3 = y(ChronoField.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(a().toString());
        sb.append(" ");
        sb.append(H());
        sb.append(" ");
        sb.append(y);
        String str2 = "-";
        if (y2 >= 10) {
            str = "-";
        } else {
            str = "-0";
        }
        sb.append(str);
        sb.append(y2);
        if (y3 < 10) {
            str2 = "-0";
        }
        sb.append(str2);
        sb.append(y3);
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ j$.time.temporal.p u(TemporalField temporalField) {
        return j$.time.temporal.j.d(this, temporalField);
    }

    @Override // j$.time.temporal.Temporal
    public InterfaceC0071b c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return a0(a(), temporalField.D(this, j));
        }
        throw new RuntimeException("Unsupported field: ".concat(String.valueOf(temporalField)));
    }

    @Override // j$.time.temporal.Temporal
    public InterfaceC0071b d(long j, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        if (!z) {
            if (!z) {
                return a0(a(), temporalUnit.n(this, j));
            }
            throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
        switch (AbstractC0072c.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return c0(j);
            case 2:
                return c0(j$.nio.channels.c.j(j, 7));
            case 3:
                return d0(j);
            case 4:
                return e0(j);
            case 5:
                return e0(j$.nio.channels.c.j(j, 10));
            case 6:
                return e0(j$.nio.channels.c.j(j, 100));
            case 7:
                return e0(j$.nio.channels.c.j(j, 1000));
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return c(j$.nio.channels.c.g(y(chronoField), j), (TemporalField) chronoField);
            default:
                throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }
}
