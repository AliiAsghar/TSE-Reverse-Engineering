package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeid implements aeig {
    public final String a;
    public final arqr b;
    private final int d;
    private final int f;
    private final int g;
    private final String c = null;
    private final String e = null;

    public aeid(String str, int i, arqr arqrVar) {
        this.a = str;
        this.d = i;
        this.b = arqrVar;
        this.f = i;
        this.g = i;
    }

    @Override // defpackage.aeig
    public final int a() {
        return this.g;
    }

    @Override // defpackage.aeig
    public final int b() {
        return this.f;
    }

    @Override // defpackage.aeig
    public final /* bridge */ /* synthetic */ aeig c(int i, int i2) {
        return new aeid(this.a, i, this.b);
    }

    @Override // defpackage.aeig
    public final String d() {
        return null;
    }

    @Override // defpackage.aeig
    public final arqr e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeid)) {
            return false;
        }
        aeid aeidVar = (aeid) obj;
        if (!d.F(this.a, aeidVar.a)) {
            return false;
        }
        String str = aeidVar.c;
        if (!d.F(null, null) || this.d != aeidVar.d) {
            return false;
        }
        String str2 = aeidVar.e;
        if (d.F(null, null) && d.F(this.b, aeidVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 961) + this.d) * 961) + this.b.hashCode();
    }

    public final String toString() {
        return "Image(url=" + this.a + ", contentDescription=null, position=" + this.d + ", onClickLabel=null, onClick=" + this.b + ")";
    }
}
