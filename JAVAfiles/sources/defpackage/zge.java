package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zge {
    private static final alvi b = alvi.m("com/google/android/apps/messaging/toast/ToastsImpl");
    public final ascc a;

    public zge(Context context) {
        context.getClass();
        this.a = asck.d(0, 5, 1);
    }

    public final void a(String str) {
        zgf zgfVar = new zgf(str);
        alvi alviVar = b;
        ((alvg) alviVar.d().h("com/google/android/apps/messaging/toast/ToastsImpl", "showToast", 38, "ToastsImpl.kt")).t("showToast: %s", zgfVar);
        if (!this.a.h(zgfVar)) {
            ((alvg) alviVar.h().h("com/google/android/apps/messaging/toast/ToastsImpl", "showToast", 43, "ToastsImpl.kt")).t("Too many toasts that have not been collected yet. Failed with %s", zgfVar);
        }
    }
}
