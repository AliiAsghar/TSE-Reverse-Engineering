package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cib {
    public final int a;

    public /* synthetic */ cib(int i) {
        this.a = i;
    }

    public static String a(int i) {
        if (a.bA(i, 1)) {
            return "Next";
        }
        if (a.bA(i, 2)) {
            return "Previous";
        }
        if (a.bA(i, 3)) {
            return "Left";
        }
        if (a.bA(i, 4)) {
            return "Right";
        }
        if (a.bA(i, 5)) {
            return "Up";
        }
        if (a.bA(i, 6)) {
            return "Down";
        }
        if (a.bA(i, 7)) {
            return "Enter";
        }
        if (a.bA(i, 8)) {
            return "Exit";
        }
        return "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof cib) && this.a == ((cib) obj).a) {
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
