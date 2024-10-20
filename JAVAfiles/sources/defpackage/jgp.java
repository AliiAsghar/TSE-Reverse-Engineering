package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgp {
    public final boolean a;
    public final int b;
    public final int c;

    public jgp(boolean z, int i, int i2) {
        this.a = z;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgp)) {
            return false;
        }
        jgp jgpVar = (jgp) obj;
        if (this.a == jgpVar.a && this.b == jgpVar.b && this.c == jgpVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((a.v(this.a) * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "ImageCompressionInfo(isCompressed=" + this.a + ", longDimension=" + this.b + ", jpegQuality=" + this.c + ")";
    }
}
