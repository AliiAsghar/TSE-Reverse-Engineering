package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anjg {
    public static final anjg a = new anjg("");
    public final String b;

    public anjg(String str) {
        str.getClass();
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof anjg) && d.F(this.b, ((anjg) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "GroupIcon(url=" + this.b + ")";
    }
}
