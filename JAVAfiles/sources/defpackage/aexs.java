package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aexs {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public aexs(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aexs)) {
            return false;
        }
        aexs aexsVar = (aexs) obj;
        if (this.a == aexsVar.a && this.b == aexsVar.b && this.c == aexsVar.c && this.d == aexsVar.d && this.e == aexsVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "RichCardTextResult(spacer=" + this.a + ", title=" + this.b + ", desc=" + this.c + ", actionCount=" + this.d + ", bottomSpacer=" + this.e + ")";
    }
}
