package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pvo {
    private static final alwo a = alwo.o("BugleRcsCapabilities");
    private final xnv b;
    private final pvp c;

    public pvo(xnv xnvVar, pvp pvpVar) {
        this.b = xnvVar;
        this.c = pvpVar;
    }

    public final boolean a(pto ptoVar) {
        Duration a2;
        if (ptoVar.c()) {
            a2 = this.c.b();
        } else {
            a2 = this.c.a();
        }
        boolean isAfter = ptoVar.b().plus(a2).isAfter(this.b.f());
        ((alwl) a.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/validity/RcsCapabilitiesValidityChecker", "areCapabilitiesValid", 44, "RcsCapabilitiesValidityChecker.java")).H("RcsCapabilitiesValidityChecker: areCapabilitiesValid: %s for capabilities %s", isAfter, ptoVar);
        return isAfter;
    }
}
