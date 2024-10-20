package j$.time.temporal;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;

/* loaded from: classes5.dex */
public final /* synthetic */ class m implements n, k {
    public final /* synthetic */ int a;

    public /* synthetic */ m(int i) {
        this.a = i;
    }

    @Override // j$.time.temporal.k
    public Temporal G(Temporal temporal) {
        ChronoField chronoField = ChronoField.DAY_OF_MONTH;
        return temporal.c(temporal.u(chronoField).d(), chronoField);
    }

    @Override // j$.time.temporal.n
    public Object g(TemporalAccessor temporalAccessor) {
        switch (this.a) {
            case 1:
                return (ZoneId) temporalAccessor.D(j.a);
            case 2:
                return (j$.time.chrono.m) temporalAccessor.D(j.b);
            case 3:
                return (TemporalUnit) temporalAccessor.D(j.c);
            case 4:
                ChronoField chronoField = ChronoField.OFFSET_SECONDS;
                if (temporalAccessor.f(chronoField)) {
                    return ZoneOffset.ofTotalSeconds(temporalAccessor.get(chronoField));
                }
                return null;
            case 5:
                ZoneId zoneId = (ZoneId) temporalAccessor.D(j.a);
                if (zoneId == null) {
                    return (ZoneId) temporalAccessor.D(j.d);
                }
                return zoneId;
            case 6:
                ChronoField chronoField2 = ChronoField.EPOCH_DAY;
                if (temporalAccessor.f(chronoField2)) {
                    return LocalDate.q0(temporalAccessor.y(chronoField2));
                }
                return null;
            default:
                ChronoField chronoField3 = ChronoField.NANO_OF_DAY;
                if (temporalAccessor.f(chronoField3)) {
                    return LocalTime.j0(temporalAccessor.y(chronoField3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "ZoneId";
            case 2:
                return "Chronology";
            case 3:
                return "Precision";
            case 4:
                return "ZoneOffset";
            case 5:
                return "Zone";
            case 6:
                return "LocalDate";
            case 7:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
