package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.util.Objects;

/* renamed from: j$.time.chrono.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC0077h {
    public static Temporal a(InterfaceC0071b interfaceC0071b, Temporal temporal) {
        return temporal.c(interfaceC0071b.toEpochDay(), ChronoField.EPOCH_DAY);
    }

    public static int b(InterfaceC0071b interfaceC0071b, InterfaceC0071b interfaceC0071b2) {
        int compare = Long.compare(interfaceC0071b.toEpochDay(), interfaceC0071b2.toEpochDay());
        if (compare == 0) {
            return ((AbstractC0070a) interfaceC0071b.a()).m().compareTo(interfaceC0071b2.a().m());
        }
        return compare;
    }

    public static int c(ChronoLocalDateTime chronoLocalDateTime, ChronoLocalDateTime chronoLocalDateTime2) {
        int compareTo = chronoLocalDateTime.b().compareTo(chronoLocalDateTime2.b());
        if (compareTo == 0) {
            int compareTo2 = chronoLocalDateTime.toLocalTime().compareTo(chronoLocalDateTime2.toLocalTime());
            if (compareTo2 == 0) {
                return ((AbstractC0070a) chronoLocalDateTime.a()).m().compareTo(chronoLocalDateTime2.a().m());
            }
            return compareTo2;
        }
        return compareTo;
    }

    public static int d(InterfaceC0079j interfaceC0079j, InterfaceC0079j interfaceC0079j2) {
        int compare = Long.compare(interfaceC0079j.Z(), interfaceC0079j2.Z());
        if (compare == 0) {
            int g0 = interfaceC0079j.toLocalTime().g0() - interfaceC0079j2.toLocalTime().g0();
            if (g0 == 0) {
                int compareTo = interfaceC0079j.L().compareTo(interfaceC0079j2.L());
                if (compareTo == 0) {
                    int compareTo2 = interfaceC0079j.w().m().compareTo(interfaceC0079j2.w().m());
                    if (compareTo2 == 0) {
                        return ((AbstractC0070a) interfaceC0079j.a()).m().compareTo(interfaceC0079j2.a().m());
                    }
                    return compareTo2;
                }
                return compareTo;
            }
            return g0;
        }
        return compare;
    }

    public static int e(InterfaceC0079j interfaceC0079j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = AbstractC0078i.a[((ChronoField) temporalField).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return interfaceC0079j.L().get(temporalField);
                }
                return interfaceC0079j.h().i0();
            }
            throw new RuntimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return j$.time.temporal.j.a(interfaceC0079j, temporalField);
    }

    public static int f(n nVar, TemporalField temporalField) {
        if (temporalField == ChronoField.ERA) {
            return nVar.getValue();
        }
        return j$.time.temporal.j.a(nVar, temporalField);
    }

    public static long g(n nVar, TemporalField temporalField) {
        if (temporalField == ChronoField.ERA) {
            return nVar.getValue();
        }
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.u(nVar);
        }
        throw new RuntimeException("Unsupported field: ".concat(String.valueOf(temporalField)));
    }

    public static boolean h(InterfaceC0071b interfaceC0071b, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).a0();
        }
        if (temporalField != null && temporalField.y(interfaceC0071b)) {
            return true;
        }
        return false;
    }

    public static boolean i(n nVar, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField != ChronoField.ERA) {
                return false;
            }
            return true;
        }
        if (temporalField == null || !temporalField.y(nVar)) {
            return false;
        }
        return true;
    }

    public static Object j(InterfaceC0071b interfaceC0071b, j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.j.l() || nVar == j$.time.temporal.j.k() || nVar == j$.time.temporal.j.i() || nVar == j$.time.temporal.j.g()) {
            return null;
        }
        if (nVar == j$.time.temporal.j.e()) {
            return interfaceC0071b.a();
        }
        if (nVar == j$.time.temporal.j.j()) {
            return ChronoUnit.DAYS;
        }
        return nVar.g(interfaceC0071b);
    }

    public static Object k(ChronoLocalDateTime chronoLocalDateTime, j$.time.temporal.n nVar) {
        if (nVar != j$.time.temporal.j.l() && nVar != j$.time.temporal.j.k() && nVar != j$.time.temporal.j.i()) {
            if (nVar == j$.time.temporal.j.g()) {
                return chronoLocalDateTime.toLocalTime();
            }
            if (nVar == j$.time.temporal.j.e()) {
                return chronoLocalDateTime.a();
            }
            if (nVar == j$.time.temporal.j.j()) {
                return ChronoUnit.NANOS;
            }
            return nVar.g(chronoLocalDateTime);
        }
        return null;
    }

    public static Object l(InterfaceC0079j interfaceC0079j, j$.time.temporal.n nVar) {
        if (nVar != j$.time.temporal.j.k() && nVar != j$.time.temporal.j.l()) {
            if (nVar == j$.time.temporal.j.i()) {
                return interfaceC0079j.h();
            }
            if (nVar == j$.time.temporal.j.g()) {
                return interfaceC0079j.toLocalTime();
            }
            if (nVar == j$.time.temporal.j.e()) {
                return interfaceC0079j.a();
            }
            if (nVar == j$.time.temporal.j.j()) {
                return ChronoUnit.NANOS;
            }
            return nVar.g(interfaceC0079j);
        }
        return interfaceC0079j.w();
    }

    public static Object m(n nVar, j$.time.temporal.n nVar2) {
        if (nVar2 == j$.time.temporal.j.j()) {
            return ChronoUnit.ERAS;
        }
        return j$.time.temporal.j.c(nVar, nVar2);
    }

    public static long n(ChronoLocalDateTime chronoLocalDateTime, ZoneOffset zoneOffset) {
        Objects.a(zoneOffset, "offset");
        return ((chronoLocalDateTime.b().toEpochDay() * 86400) + chronoLocalDateTime.toLocalTime().s0()) - zoneOffset.i0();
    }

    public static long o(InterfaceC0079j interfaceC0079j) {
        return ((interfaceC0079j.b().toEpochDay() * 86400) + interfaceC0079j.toLocalTime().s0()) - interfaceC0079j.h().i0();
    }

    public static Instant p(ChronoLocalDateTime chronoLocalDateTime, ZoneOffset zoneOffset) {
        return Instant.ofEpochSecond(chronoLocalDateTime.toEpochSecond(zoneOffset), chronoLocalDateTime.toLocalTime().g0());
    }

    public static m q(TemporalAccessor temporalAccessor) {
        Objects.a(temporalAccessor, "temporal");
        return (m) Objects.requireNonNullElse((m) temporalAccessor.D(j$.time.temporal.j.e()), t.d);
    }
}
