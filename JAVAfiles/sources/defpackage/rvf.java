package defpackage;

import android.os.BaseBundle;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class rvf {
    public final String b;

    /* JADX INFO: Access modifiers changed from: protected */
    public rvf(String str) {
        this.b = str;
    }

    private static String a(rvf rvfVar, String str) {
        String str2;
        if (rvfVar != null && (str2 = rvfVar.b) != null) {
            return str2;
        }
        return str;
    }

    public static String c(rvf rvfVar) {
        return a(rvfVar, "null");
    }

    public static String d(rvf rvfVar) {
        if (rvfVar == null) {
            return null;
        }
        return rvfVar.b;
    }

    public static String e(rvf rvfVar) {
        return a(rvfVar, "");
    }

    public static void h(BaseBundle baseBundle, String str, rvf rvfVar) {
        baseBundle.putString(str, rvfVar.b);
    }

    public static boolean j(rvf rvfVar) {
        if (!l(rvfVar)) {
            return true;
        }
        return false;
    }

    public static boolean l(rvf rvfVar) {
        if (rvfVar != null && rvfVar.k()) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        rvf rvfVar = (rvf) obj;
        String str = this.b;
        if (str != null) {
            z = false;
        } else {
            z = true;
        }
        String str2 = rvfVar.b;
        if (str2 != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z != z2) {
            return false;
        }
        if (str == null) {
            return true;
        }
        return str.equals(str2);
    }

    public final String f() {
        String str = this.b;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final void g(Consumer consumer) {
        if (k()) {
            d$$ExternalSyntheticApiModelOutline0.m(consumer, this);
        }
    }

    public final int hashCode() {
        String str = this.b;
        if (str == null) {
            return 1;
        }
        return str.hashCode();
    }

    public final boolean i() {
        if (!k()) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.b != null) {
            return true;
        }
        return false;
    }
}
