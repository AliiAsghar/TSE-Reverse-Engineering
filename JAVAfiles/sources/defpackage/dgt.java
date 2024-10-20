package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgt {
    public final int a = 0;

    public final boolean equals(Object obj) {
        if (!(obj instanceof dgt)) {
            return false;
        }
        int i = ((dgt) obj).a;
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        if (a.bA(0, 0)) {
            return "Polite";
        }
        if (a.bA(0, 1)) {
            return "Assertive";
        }
        return "Unknown";
    }
}
