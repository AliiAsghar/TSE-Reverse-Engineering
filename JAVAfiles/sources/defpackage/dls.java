package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dls {
    public final int a;

    public static String a(int i) {
        if (a.bA(i, 0)) {
            return "Normal";
        }
        if (a.bA(i, 1)) {
            return "Italic";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof dls) && this.a == ((dls) obj).a) {
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
