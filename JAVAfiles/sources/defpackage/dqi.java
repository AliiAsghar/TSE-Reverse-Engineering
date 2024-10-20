package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqi {
    public final int a;

    public /* synthetic */ dqi(int i) {
        this.a = i;
    }

    public static String a(int i) {
        if (a.bA(i, 1)) {
            return "Left";
        }
        if (a.bA(i, 2)) {
            return "Right";
        }
        if (a.bA(i, 3)) {
            return "Center";
        }
        if (a.bA(i, 4)) {
            return "Justify";
        }
        if (a.bA(i, 5)) {
            return "Start";
        }
        if (a.bA(i, 6)) {
            return "End";
        }
        if (a.bA(i, Integer.MIN_VALUE)) {
            return "Unspecified";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof dqi) && this.a == ((dqi) obj).a) {
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
