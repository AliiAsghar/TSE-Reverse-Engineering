package defpackage;

import j$.util.concurrent.atomic.DesugarAtomicReference;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abem implements yxa {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/wearable/util/CachedWearableCompanionAppInstalledImpl");
    public static final uuf b = uuh.f(uuh.b, "is_wearable_installed_cache_seconds", 15);
    public final armf c;
    private final AtomicReference d = new AtomicReference();
    private final AtomicReference e = new AtomicReference();

    public abem(armf armfVar) {
        this.c = armfVar;
    }

    private static Boolean c(AtomicReference atomicReference, armf armfVar) {
        return (Boolean) ((alhr) DesugarAtomicReference.updateAndGet(atomicReference, new wse(armfVar, 5))).get();
    }

    @Override // defpackage.yxa
    public final boolean a() {
        return c(this.e, new wkb(this, 20)).booleanValue();
    }

    @Override // defpackage.yxa
    public final boolean b() {
        return c(this.d, new wkb(this, 19)).booleanValue();
    }
}
