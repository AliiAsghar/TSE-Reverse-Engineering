package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dig {
    public final dih a;
    public final int b;
    public final int c;

    public dig(dih dihVar, int i, int i2) {
        this.a = dihVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dig)) {
            return false;
        }
        dig digVar = (dig) obj;
        if (d.F(this.a, digVar.a) && this.b == digVar.b && this.c == digVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ')';
    }
}
