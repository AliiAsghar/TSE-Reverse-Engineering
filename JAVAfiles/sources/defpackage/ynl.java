package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ynl {
    public final String a;
    public final String b;

    public ynl(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ynl)) {
            return false;
        }
        ynl ynlVar = (ynl) obj;
        if (d.F(this.a, ynlVar.a) && d.F(this.b, ynlVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "UserIds(userId=" + this.a + ", urlUserId=" + this.b + ")";
    }
}
