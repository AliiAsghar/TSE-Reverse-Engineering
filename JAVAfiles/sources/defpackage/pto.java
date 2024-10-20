package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.stream.Collectors;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class pto {
    public static final utz a = uuh.f(uuh.b, "tachygram_rcs_capability_validity_expiry", 86400000);
    public static final utz b = uuh.f(uuh.b, "tachygram_non_rcs_capability_validity_expiry", 600000);

    public static pto d() {
        return e(Instant.EPOCH);
    }

    public static pto e(Instant instant) {
        pvm pvmVar = new pvm();
        pvmVar.i(ptz.a);
        pvmVar.h(instant);
        return pvmVar.g();
    }

    public abstract ptz a();

    public abstract Instant b();

    public boolean c() {
        throw null;
    }

    @Deprecated
    public final boolean f(Instant instant) {
        Long l;
        if (c()) {
            l = (Long) a.e();
        } else {
            l = (Long) b.e();
        }
        return instant.isAfter(b().plus(Duration.ofMillis(l.longValue())));
    }

    public final String toString() {
        if (!anfi.a("bugle.print_rcs_capabilities", "bugle")) {
            return super.toString();
        }
        return String.format("RcsCapabilitiesWithMetadata {timestamp: %s, capabilities: %s}", b(), (String) Collection.EL.stream(a().b).map(new prj(14)).collect(Collectors.joining(";")));
    }
}
