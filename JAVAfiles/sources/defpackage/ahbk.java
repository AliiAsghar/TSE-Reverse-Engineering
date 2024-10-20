package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahbk {
    public static final alvi a = alvi.m("com/google/android/libraries/inputmethod/utils/ProcessUtil");
    private static final agsr b = new agsr();

    private ahbk() {
    }

    public static boolean a(Context context) {
        String str = (String) b.a(new agud(context, 7));
        if (str == null) {
            ((alvg) ((alvg) a.h()).h("com/google/android/libraries/inputmethod/utils/ProcessUtil", "isMainProcess", 54, "ProcessUtil.java")).q("Process name wasn't available. Assuming we're on the main process");
            return true;
        }
        return str.equals(context.getPackageName());
    }
}
