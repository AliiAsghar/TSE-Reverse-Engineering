package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqd {
    public final int a;

    public static String a(int i) {
        if (a.bA(i, 1)) {
            return "Hyphens.None";
        }
        if (a.bA(i, 2)) {
            return "Hyphens.Auto";
        }
        if (a.bA(i, Integer.MIN_VALUE)) {
            return "Hyphens.Unspecified";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof dqd) && this.a == ((dqd) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
