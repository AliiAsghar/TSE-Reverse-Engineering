package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aecj {
    public final String a;
    public final String b;

    public aecj(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        if (d.F(this.b, "")) {
            return this.a;
        }
        return this.a + ":" + this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aecj)) {
            return false;
        }
        aecj aecjVar = (aecj) obj;
        if (d.F(this.a, aecjVar.a) && d.F(this.b, aecjVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return a();
    }
}
