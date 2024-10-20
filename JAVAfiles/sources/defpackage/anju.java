package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anju {
    public final String a;
    public final String b;
    public final String c;

    public anju(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        if (str2.length() > 0) {
        } else {
            throw new IllegalStateException("Header name must not be empty.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anju)) {
            return false;
        }
        anju anjuVar = (anju) obj;
        if (d.F(this.a, anjuVar.a) && d.F(this.b, anjuVar.b) && d.F(this.c, anjuVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Header(namespace=" + this.a + ", name=" + this.b + ", value=" + this.c + ")";
    }
}
