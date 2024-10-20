package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahbf extends BroadcastReceiver {
    public volatile boolean b;
    public volatile boolean c;
    public volatile boolean d;
    private static final alvi e = alvi.m("com/google/android/libraries/inputmethod/userunlock/UserUnlockMonitor");
    public static final ahbf a = new ahbf();

    private ahbf() {
    }

    public static boolean b() {
        boolean z;
        if (!ahba.a || Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        try {
            Class<?> cls = Class.forName("android.os.storage.StorageManager");
            try {
                Method method = cls.getMethod("inCryptKeeperBounce", null);
                if (method == null) {
                    ((alvg) ((alvg) e.i()).h("com/google/android/libraries/inputmethod/userunlock/UserUnlockMonitor", "inCryptKeeperBounce", 192, "UserUnlockMonitor.java")).q("Cannot find StorageManager.inCryptKeeperBounce()");
                    return false;
                }
                try {
                    Object invoke = method.invoke(cls, null);
                    if (invoke != null && ((Boolean) invoke).booleanValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        ((alvg) ((alvg) e.g()).h("com/google/android/libraries/inputmethod/userunlock/UserUnlockMonitor", "inCryptKeeperBounce", BasePaymentResult.ERROR_REQUEST_FAILED, "UserUnlockMonitor.java")).q("Device in crypt keeper bounce state.");
                    }
                    return z;
                } catch (Exception e2) {
                    ((alvg) ((alvg) ((alvg) e.i()).g(e2)).h("com/google/android/libraries/inputmethod/userunlock/UserUnlockMonitor", "inCryptKeeperBounce", (char) 204, "UserUnlockMonitor.java")).q("Failed to invoke StorageManager.inCryptKeeperBounce()");
                    return false;
                }
            } catch (NoSuchMethodException e3) {
                ((alvg) ((alvg) ((alvg) e.i()).g(e3)).h("com/google/android/libraries/inputmethod/userunlock/UserUnlockMonitor", "inCryptKeeperBounce", (char) 187, "UserUnlockMonitor.java")).q("Cannot find StorageManager.inCryptKeeperBounce()");
                return false;
            }
        } catch (ClassNotFoundException e4) {
            ((alvg) ((alvg) ((alvg) e.i()).g(e4)).h("com/google/android/libraries/inputmethod/userunlock/UserUnlockMonitor", "inCryptKeeperBounce", (char) 179, "UserUnlockMonitor.java")).q("Cannot find android.os.storage.StorageManager");
            return false;
        }
    }

    public final void a(Context context) {
        if (this.d) {
            context.unregisterReceiver(this);
            this.d = false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        alvi alviVar = e;
        ((alvg) ((alvg) alviVar.g()).h("com/google/android/libraries/inputmethod/userunlock/UserUnlockMonitor", "onReceive", 123, "UserUnlockMonitor.java")).t("onReceive(): %s", intent);
        if (this.b) {
            a(context);
            return;
        }
        if ("android.intent.action.USER_UNLOCKED".equals(intent.getAction())) {
            this.b = !b();
            if (this.b) {
                a(context);
                agzt.d(ahbg.a);
            } else {
                ((alvg) ((alvg) alviVar.g()).h("com/google/android/libraries/inputmethod/userunlock/UserUnlockMonitor", "onReceive", 135, "UserUnlockMonitor.java")).q("Received ACTION_USER_UNLOCKED under crypt keeper bounce state.");
            }
        }
    }
}
