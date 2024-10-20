package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tvu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String str) {
        if (!adah.d(str) && !adah.b(str)) {
            return false;
        }
        return true;
    }

    public static String b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return "group rcs";
                }
                throw new IllegalArgumentException(a.cb(i, "invalid conversation type (", ")"));
            }
            return "group xms";
        }
        return "one on one";
    }

    public static boolean c(int i) {
        if (i == 2 || i == 1) {
            return true;
        }
        return false;
    }

    public static boolean d(int i) {
        if (i == 0) {
            return true;
        }
        return false;
    }

    public static boolean e(int i) {
        if (i == 2) {
            return true;
        }
        return false;
    }

    public static boolean f(int i) {
        if (i == 1) {
            return true;
        }
        return false;
    }

    public static agmh[] g() {
        return sss.d.l;
    }
}
