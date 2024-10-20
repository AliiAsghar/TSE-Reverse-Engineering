package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhk {
    public final awa a;
    public final awa b;
    private final awa c;

    public bhk() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhk)) {
            return false;
        }
        bhk bhkVar = (bhk) obj;
        if (d.F(this.a, bhkVar.a) && d.F(this.c, bhkVar.c) && d.F(this.b, bhkVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Shapes(small=" + this.a + ", medium=" + this.c + ", large=" + this.b + ')';
    }

    public /* synthetic */ bhk(byte[] bArr) {
        awg a = awh.a(4.0f);
        awg a2 = awh.a(4.0f);
        awg a3 = awh.a(brg.a);
        this.a = a;
        this.c = a2;
        this.b = a3;
    }
}
