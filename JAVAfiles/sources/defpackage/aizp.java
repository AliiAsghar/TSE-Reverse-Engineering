package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aizp {
    public static final Object a = new Object();
    public static volatile Context b;
    public static volatile ahnz c;

    public static boolean a() {
        if (!c(aqpn.b(b)) && !c(aqpn.c(b))) {
            return false;
        }
        return true;
    }

    public static boolean b(boolean z) {
        if (aqph.b(b)) {
            return false;
        }
        return z;
    }

    public static boolean c(boolean z) {
        if (aqph.b(b)) {
            return false;
        }
        return z;
    }

    public static boolean d() {
        if (b == null) {
            return false;
        }
        return aqqf.a.get().b(b);
    }
}
