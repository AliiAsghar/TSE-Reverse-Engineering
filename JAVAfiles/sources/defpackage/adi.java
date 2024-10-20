package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adi {
    public clg a;
    public ckr b;
    public cnr c;
    private clr d;

    public adi() {
        this(null);
    }

    public final clr a() {
        clr clrVar = this.d;
        if (clrVar == null) {
            cke ckeVar = new cke((byte[]) null);
            this.d = ckeVar;
            return ckeVar;
        }
        return clrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adi)) {
            return false;
        }
        adi adiVar = (adi) obj;
        if (d.F(this.a, adiVar.a) && d.F(this.b, adiVar.b) && d.F(this.c, adiVar.c) && d.F(this.d, adiVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        clg clgVar = this.a;
        int i = 0;
        if (clgVar == null) {
            hashCode = 0;
        } else {
            hashCode = clgVar.hashCode();
        }
        ckr ckrVar = this.b;
        if (ckrVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = ckrVar.hashCode();
        }
        int i2 = hashCode * 31;
        cnr cnrVar = this.c;
        if (cnrVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = cnrVar.hashCode();
        }
        int i3 = (((i2 + hashCode2) * 31) + hashCode3) * 31;
        clr clrVar = this.d;
        if (clrVar != null) {
            i = clrVar.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }

    public /* synthetic */ adi(byte[] bArr) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
