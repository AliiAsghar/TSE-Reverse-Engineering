package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iek {
    private static final alvi c = alvi.m("com/google/android/apps/messaging/banner/eligibility/BannerEligibilityImpl");
    public final ascd a = ascy.a(arnw.a);
    public boolean b;

    public final void a(String str, iel ielVar) {
        ielVar.getClass();
        ((alvg) c.g().h("com/google/android/apps/messaging/banner/eligibility/BannerEligibilityImpl", "setIneligible", 23, "BannerEligibilityImpl.kt")).D("Setting banner %s to ineligible because of %s", str, ielVar);
        Map s = aqjn.s((Map) this.a.c());
        s.put(str, ielVar);
        this.a.f(aqjn.r(s));
    }
}
