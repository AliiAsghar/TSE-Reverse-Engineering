package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqe {
    public final int a;

    public static String a(int i) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int a = dqf.a(i);
        String str3 = "Invalid";
        if (a.bA(a, 1)) {
            str = "Strategy.Simple";
        } else if (a.bA(a, 2)) {
            str = "Strategy.HighQuality";
        } else if (a.bA(a, 3)) {
            str = "Strategy.Balanced";
        } else if (!a.bA(a, 0)) {
            str = "Invalid";
        } else {
            str = "Strategy.Unspecified";
        }
        sb.append((Object) str);
        sb.append(", strictness=");
        int b = dqf.b(i);
        if (a.bA(b, 1)) {
            str2 = "Strictness.None";
        } else if (a.bA(b, 2)) {
            str2 = "Strictness.Loose";
        } else if (a.bA(b, 3)) {
            str2 = "Strictness.Normal";
        } else if (a.bA(b, 4)) {
            str2 = "Strictness.Strict";
        } else if (!a.bA(b, 0)) {
            str2 = "Invalid";
        } else {
            str2 = "Strictness.Unspecified";
        }
        sb.append((Object) str2);
        sb.append(", wordBreak=");
        int c = dqf.c(i);
        if (a.bA(c, 1)) {
            str3 = "WordBreak.None";
        } else if (a.bA(c, 2)) {
            str3 = "WordBreak.Phrase";
        } else if (a.bA(c, 0)) {
            str3 = "WordBreak.Unspecified";
        }
        sb.append((Object) str3);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof dqe) && this.a == ((dqe) obj).a) {
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
