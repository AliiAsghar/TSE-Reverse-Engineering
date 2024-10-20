package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnt {
    public final int a;

    public static String a(int i) {
        if (a.bA(i, -1)) {
            return "Unspecified";
        }
        if (a.bA(i, 0)) {
            return "None";
        }
        if (a.bA(i, 1)) {
            return "Characters";
        }
        if (a.bA(i, 2)) {
            return "Words";
        }
        if (a.bA(i, 3)) {
            return "Sentences";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof dnt) && this.a == ((dnt) obj).a) {
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
