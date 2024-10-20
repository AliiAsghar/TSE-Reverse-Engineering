package defpackage;

import android.app.Activity;
import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lom implements lju {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/navigation/targets/SignOutOfAccountNavigationHandler");
    private final Context b;
    private final Optional c;

    public lom(Context context, Optional optional) {
        this.b = context;
        this.c = optional;
    }

    @Override // defpackage.lju
    public final /* bridge */ /* synthetic */ Object a(lkf lkfVar, arpe arpeVar) {
        this.c.isPresent();
        Activity al = aabr.al(this.b);
        if (al != null) {
            ((alvg) a.g().h("com/google/android/apps/messaging/navigation/targets/SignOutOfAccountNavigationHandler", "navigate", 57, "SignOutOfAccount.kt")).q("Dispatching finish activity navigation event.");
            aktp.J(lol.a, al);
            return arnb.a;
        }
        throw new IllegalArgumentException("SignOutOfAccountNavigationHandler must be created with an activity context.");
    }
}
