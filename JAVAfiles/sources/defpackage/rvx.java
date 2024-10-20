package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rvx {
    public static final alog a = alog.t(14, 15, 1);
    public static final alog b = alog.v(10, 4, 5, 6, 7);
    public final yck c;
    public final xnv d;

    public rvx(yck yckVar, xnv xnvVar) {
        this.c = yckVar;
        this.d = xnvVar;
    }

    public static boolean a(int i) {
        if (!d.A(i) && !z(i)) {
            return true;
        }
        return false;
    }

    public static boolean d(int i) {
        if (w(i) && i != 11) {
            return true;
        }
        return false;
    }

    public static boolean e(int i) {
        if (i != 214 && i != 215 && i != 216 && i != 219 && i != 235 && i != 236 && i != 237 && i != 238) {
            return false;
        }
        return true;
    }

    public static boolean f(int i) {
        if (i != 107 && i != 111) {
            return false;
        }
        return true;
    }

    public static boolean g(int i) {
        if (i != 207 && i != 206 && i != 213) {
            return false;
        }
        return true;
    }

    public static boolean h(int i) {
        if (i != 100 && i != 108 && i != 109) {
            return false;
        }
        return true;
    }

    public static boolean i(int i) {
        if (i != 105 && i != 103 && i != 104 && i != 102) {
            return false;
        }
        return true;
    }

    public static boolean j(int i) {
        if (i == 1) {
            return true;
        }
        return false;
    }

    public static boolean k(int i) {
        if (i == 2) {
            return true;
        }
        return false;
    }

    public static boolean l(int i) {
        if (i != 2 && i != 11) {
            return false;
        }
        return true;
    }

    public static boolean m(int i) {
        if (i == 11) {
            return true;
        }
        return false;
    }

    public static boolean n(int i) {
        if (i != 8 && i != 19) {
            return false;
        }
        return true;
    }

    public static boolean o(int i) {
        if (!f(i) && !x(i)) {
            return false;
        }
        return true;
    }

    public static boolean p(int i) {
        return b.contains(Integer.valueOf(i));
    }

    public static boolean q(int i) {
        return a.contains(Integer.valueOf(i));
    }

    public static boolean r(int i) {
        if (i == 17) {
            return true;
        }
        return false;
    }

    public static boolean s(int i) {
        if (i == 19) {
            return true;
        }
        return false;
    }

    public static boolean t(int i) {
        if (i == 22) {
            return true;
        }
        return false;
    }

    public static boolean u(int i) {
        if (i == 21) {
            return true;
        }
        return false;
    }

    public static boolean v(int i) {
        if (i == 1 || i == 2 || i == 11 || i == 15 || i == 14) {
            return true;
        }
        return false;
    }

    public static boolean w(int i) {
        if (i > 0 && i <= 22) {
            return true;
        }
        return false;
    }

    public static boolean x(int i) {
        if (i != 9 && i != 13 && i != 18) {
            return false;
        }
        return true;
    }

    public static boolean y(int i) {
        if (i == 3) {
            return true;
        }
        return false;
    }

    public static boolean z(int i) {
        if (i == 0) {
            return true;
        }
        return false;
    }

    public final boolean b(Context context, int i) {
        if (yhx.g(context)) {
            return false;
        }
        if (i != 106 && i != 101 && i != 110 && i != 112 && i != 115 && (!f(i) || !this.c.q())) {
            return false;
        }
        return true;
    }

    public final boolean c(Context context, int i) {
        if (yhx.g(context) || i == 16 || h(i) || v(i)) {
            return false;
        }
        if (o(i) && !this.c.q()) {
            return false;
        }
        return true;
    }
}
