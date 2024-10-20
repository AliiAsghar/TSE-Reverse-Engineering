package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acos {
    public int a;
    public boolean b = true;
    public boolean c = false;

    public static String a(boolean z) {
        if (z) {
            return "yes";
        }
        return "no";
    }

    public static boolean b(String str) {
        if (!str.equals("1") && !str.equals("yes") && !str.equals("true")) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof acos)) {
            return false;
        }
        acos acosVar = (acos) obj;
        if (this.b != acosVar.b || this.c != acosVar.c || this.a != acosVar.a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(this.a)});
    }

    public final String toString() {
        return "User count: " + this.a + ", locked: " + this.c + ", active: " + this.b;
    }
}
