package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yad {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/common/XslEventThrottler");

    public static boolean a(atok atokVar) {
        double doubleValue = aczf.p().doubleValue();
        if (doubleValue >= 1.0d) {
            return true;
        }
        if (doubleValue > 0.0d && atokVar != null && !atokVar.b.isEmpty()) {
            String str = atokVar.b;
            try {
                if (Math.abs(UUID.fromString(str).hashCode()) <= ((int) (doubleValue * 2.147483647E9d))) {
                    return true;
                }
                return false;
            } catch (IllegalArgumentException unused) {
                alvw d = a.d();
                d.X(alwp.a, "BugleDataModel");
                ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/util/common/XslEventThrottler", "clientSideThrottle", 40, "XslEventThrottler.java")).t("Unable to parse UUID from: %s", str);
            }
        }
        return false;
    }
}
