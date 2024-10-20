package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeif implements aeig {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    private final String e;
    private final arqr f;

    public aeif(String str, int i, int i2, boolean z, arqr arqrVar) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.e = null;
        this.d = z;
        this.f = arqrVar;
    }

    @Override // defpackage.aeig
    public final int a() {
        return this.c;
    }

    @Override // defpackage.aeig
    public final int b() {
        return this.b;
    }

    @Override // defpackage.aeig
    public final /* bridge */ /* synthetic */ aeig c(int i, int i2) {
        return new aeif(this.a, i, i2, this.d, this.f);
    }

    @Override // defpackage.aeig
    public final String d() {
        return null;
    }

    @Override // defpackage.aeig
    public final arqr e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeif)) {
            return false;
        }
        aeif aeifVar = (aeif) obj;
        if (!d.F(this.a, aeifVar.a) || this.b != aeifVar.b || this.c != aeifVar.c) {
            return false;
        }
        String str = aeifVar.e;
        if (d.F(null, null) && this.d == aeifVar.d && d.F(this.f, aeifVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 961) + a.v(this.d)) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "Url(url=" + this.a + ", start=" + this.b + ", end=" + this.c + ", onClickLabel=null, usePrimaryColor=" + this.d + ", onClick=" + this.f + ")";
    }

    public /* synthetic */ aeif(String str, int i, int i2, arqr arqrVar, int i3) {
        this(str, i, i2, (i3 & 16) != 0, arqrVar);
    }
}
