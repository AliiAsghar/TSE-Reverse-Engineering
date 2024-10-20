package defpackage;

import android.app.Activity;
import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lli implements lju {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/navigation/targets/BackNavigationHandler");
    private final Context b;
    private final Optional c;

    public lli(Context context, Optional optional) {
        this.b = context;
        this.c = optional;
    }

    @Override // defpackage.lju
    public final /* bridge */ /* synthetic */ Object a(lkf lkfVar, arpe arpeVar) {
        this.c.isPresent();
        Activity al = aabr.al(this.b);
        if (al != null) {
            ((alvg) a.g().h("com/google/android/apps/messaging/navigation/targets/BackNavigationHandler", "navigate", 58, "Back.kt")).q("Dispatching Back navigation event.");
            aktp.J(llh.a, al);
            return arnb.a;
        }
        throw new IllegalArgumentException("BackNavigationHandler must be created with an activity context.");
    }
}
