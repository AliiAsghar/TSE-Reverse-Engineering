package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlt {
    public final int a;

    public static String a(int i) {
        if (a.bA(i, 0)) {
            return "None";
        }
        if (a.bA(i, 1)) {
            return "Weight";
        }
        if (a.bA(i, 2)) {
            return "Style";
        }
        if (a.bA(i, 65535)) {
            return "All";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof dlt) && this.a == ((dlt) obj).a) {
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
