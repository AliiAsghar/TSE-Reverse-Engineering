package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amp {
    public float a;
    public boolean b;
    public akr c;
    private aky d;

    public amp() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amp)) {
            return false;
        }
        amp ampVar = (amp) obj;
        if (Float.compare(this.a, ampVar.a) != 0 || this.b != ampVar.b || !d.F(this.c, ampVar.c)) {
            return false;
        }
        aky akyVar = ampVar.d;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int floatToIntBits = Float.floatToIntBits(this.a) * 31;
        int v = a.v(this.b);
        akr akrVar = this.c;
        if (akrVar == null) {
            hashCode = 0;
        } else {
            hashCode = akrVar.hashCode();
        }
        return (((floatToIntBits + v) * 31) + hashCode) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }

    public /* synthetic */ amp(byte[] bArr) {
        this.a = brg.a;
        this.b = true;
        this.c = null;
        this.d = null;
    }
}
