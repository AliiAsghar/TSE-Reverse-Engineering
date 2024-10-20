package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpo {
    public final int a;

    public final boolean equals(Object obj) {
        if ((obj instanceof cpo) && this.a == ((cpo) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        if (a.bA(i, 1)) {
            return "Touch";
        }
        if (a.bA(i, 2)) {
            return "Keyboard";
        }
        return "Error";
    }
}
