package defpackage;

import android.os.Build;
import android.os.Looper;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class xyl {
    public static volatile boolean a;
    public static volatile boolean b;
    public static xyk c;
    private static final alvi d = alvi.m("com/google/android/apps/messaging/shared/util/common/Assert");

    public static void a(int i, int i2) {
        if (i != i2) {
            o(a.bU(i2, i, "Expected ", " but got "));
        }
    }

    public static void b(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || obj2 == null || !obj.equals(obj2)) {
                o(a.ct(obj2, obj, "Expected ", " but got "));
            }
        }
    }

    public static void c(String str) {
        o("Assert.fail() called: ".concat(String.valueOf(str)));
    }

    public static void d(int i, int i2, int i3) {
        if (i >= i2 && i <= i3) {
            return;
        }
        o("Expected value in range [" + i2 + ", " + i3 + "], but was " + i);
    }

    public static void e(long j, long j2) {
        if (j == j2) {
            o(a.cs(j2, j, "Expected anything but ", " but got "));
        }
    }

    public static void f(boolean z) {
        if (z) {
            o("Expected condition to be false");
        }
    }

    @Deprecated
    public static void g() {
        if (Looper.myLooper() != Looper.getMainLooper() && b) {
            o("Expected to run on main thread");
        }
    }

    @Deprecated
    public static void h() {
        if (Looper.myLooper() == Looper.getMainLooper() && b) {
            o("Not expected to run on main thread");
        }
    }

    public static void i(Object obj) {
        if (obj != null) {
            o("Expected object to be null");
        }
    }

    @Deprecated
    public static void j() {
        k(n());
    }

    public static void k(boolean z) {
        if (!z) {
            o("Expected condition to be true");
        }
    }

    public static void l(Object obj) {
        m(obj, "Expected value to be non-null");
    }

    public static void m(Object obj, String str) {
        if (obj == null) {
            o(str);
        }
    }

    @Deprecated
    public static boolean n() {
        return "robolectric".equals(Build.FINGERPRINT);
    }

    public static void o(String str) {
        p(str, null);
    }

    public static void p(String str, Throwable th) {
        AssertionError assertionError = new AssertionError(str, th);
        if (th == null) {
            th = assertionError;
        }
        if (!a) {
            if (c != null) {
                alvw i = d.i();
                i.X(alwp.a, "Bugle");
                ((alvg) ((alvg) ((alvg) i).g(th)).h("com/google/android/apps/messaging/shared/util/common/Assert", "fail", 314, "Assert.java")).t("%s", str);
                qiu.h(c.a(th));
                return;
            }
            return;
        }
        alvw h = d.h();
        h.X(alwp.a, "Bugle");
        ((alvg) ((alvg) ((alvg) h).g(th)).h("com/google/android/apps/messaging/shared/util/common/Assert", "fail", 311, "Assert.java")).t("%s", str);
        throw assertionError;
    }

    public static void q(double d2) {
        if (d2 <= 0.0d) {
            o("Expected greater than 0.0 but got " + d2);
        }
    }

    public static void r(long j) {
        if (j >= 0) {
            return;
        }
        o(a.ck(j, "Expected value in range [0, 9223372036854775807], but was "));
    }
}
