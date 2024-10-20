package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnn {
    public final int a;

    public static String a(int i) {
        if (a.bA(i, -1)) {
            return "Unspecified";
        }
        if (a.bA(i, 0)) {
            return "None";
        }
        if (a.bA(i, 1)) {
            return "Default";
        }
        if (a.bA(i, 2)) {
            return "Go";
        }
        if (a.bA(i, 3)) {
            return "Search";
        }
        if (a.bA(i, 4)) {
            return "Send";
        }
        if (a.bA(i, 5)) {
            return "Previous";
        }
        if (a.bA(i, 6)) {
            return "Next";
        }
        if (a.bA(i, 7)) {
            return "Done";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof dnn) && this.a == ((dnn) obj).a) {
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
