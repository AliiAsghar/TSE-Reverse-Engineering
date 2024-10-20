package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnu {
    public final int a;

    public static String a(int i) {
        if (a.bA(i, 0)) {
            return "Unspecified";
        }
        if (a.bA(i, 1)) {
            return "Text";
        }
        if (a.bA(i, 2)) {
            return "Ascii";
        }
        if (a.bA(i, 3)) {
            return "Number";
        }
        if (a.bA(i, 4)) {
            return "Phone";
        }
        if (a.bA(i, 5)) {
            return "Uri";
        }
        if (a.bA(i, 6)) {
            return "Email";
        }
        if (a.bA(i, 7)) {
            return "Password";
        }
        if (a.bA(i, 8)) {
            return "NumberPassword";
        }
        if (a.bA(i, 9)) {
            return "Decimal";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof dnu) && this.a == ((dnu) obj).a) {
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
