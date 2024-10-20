package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anix {
    public final String a;

    public anix(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof anix) && d.F(this.a, ((anix) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TraceId(id=" + this.a + ")";
    }
}
