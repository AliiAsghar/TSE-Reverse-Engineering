package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqk {
    public final int a;

    public /* synthetic */ dqk(int i) {
        this.a = i;
    }

    public static String a(int i) {
        if (a.bA(i, 1)) {
            return "Ltr";
        }
        if (a.bA(i, 2)) {
            return "Rtl";
        }
        if (a.bA(i, 3)) {
            return "Content";
        }
        if (a.bA(i, 4)) {
            return "ContentOrLtr";
        }
        if (a.bA(i, 5)) {
            return "ContentOrRtl";
        }
        if (a.bA(i, Integer.MIN_VALUE)) {
            return "Unspecified";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof dqk) && this.a == ((dqk) obj).a) {
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
