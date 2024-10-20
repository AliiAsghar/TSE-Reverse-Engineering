package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mkc {
    public final String a;
    public final int b;
    public final int c;
    public final int d;

    public mkc(String str, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = (i + i2) - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkc)) {
            return false;
        }
        mkc mkcVar = (mkc) obj;
        if (d.F(this.a, mkcVar.a) && this.b == mkcVar.b && this.c == mkcVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "ContactHeaderSection(value=" + this.a + ", start=" + this.b + ", count=" + this.c + ")";
    }
}
