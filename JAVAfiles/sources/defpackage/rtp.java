package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rtp {
    public static final alpt a = alpt.v(8, 9, 18, 19, 22, 106, 107, 111, 112, 110, 113, 114);
    public final armf b;

    public rtp(armf armfVar) {
        this.b = armfVar;
    }

    public static boolean b(int i) {
        return a.contains(Integer.valueOf(i));
    }

    public static boolean c(boolean z, int i) {
        if (!z && i >= 100) {
            return true;
        }
        return false;
    }

    public static boolean d(boolean z, int i) {
        if (!c(z, i)) {
            return true;
        }
        return false;
    }

    public static boolean e(int i) {
        if (i != 110 && i != 106 && i != 112) {
            return false;
        }
        return true;
    }

    public static boolean f(boolean z, boolean z2, int i, boolean z3) {
        if (z) {
            return false;
        }
        if (z3 && !d(z2, i)) {
            return false;
        }
        return true;
    }

    public final String a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        return albo.ag(wfh.y(str3));
    }
}
