package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bie {
    public final dje a;
    public final dje b;
    private final dje c;
    private final dje d;
    private final dje e;
    private final dje f;
    private final dje g;
    private final dje h;
    private final dje i;
    private final dje j;
    private final dje k;
    private final dje l;
    private final dje m;

    public bie(dje djeVar, dje djeVar2, dje djeVar3, dje djeVar4, dje djeVar5, dje djeVar6, dje djeVar7, dje djeVar8, dje djeVar9, dje djeVar10, dje djeVar11, dje djeVar12, dje djeVar13) {
        this.c = djeVar;
        this.d = djeVar2;
        this.e = djeVar3;
        this.f = djeVar4;
        this.g = djeVar5;
        this.h = djeVar6;
        this.i = djeVar7;
        this.j = djeVar8;
        this.k = djeVar9;
        this.a = djeVar10;
        this.b = djeVar11;
        this.l = djeVar12;
        this.m = djeVar13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bie)) {
            return false;
        }
        bie bieVar = (bie) obj;
        if (d.F(this.c, bieVar.c) && d.F(this.d, bieVar.d) && d.F(this.e, bieVar.e) && d.F(this.f, bieVar.f) && d.F(this.g, bieVar.g) && d.F(this.h, bieVar.h) && d.F(this.i, bieVar.i) && d.F(this.j, bieVar.j) && d.F(this.k, bieVar.k) && d.F(this.a, bieVar.a) && d.F(this.b, bieVar.b) && d.F(this.l, bieVar.l) && d.F(this.m, bieVar.m)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode();
    }

    public final String toString() {
        return "Typography(h1=" + this.c + ", h2=" + this.d + ", h3=" + this.e + ", h4=" + this.f + ", h5=" + this.g + ", h6=" + this.h + ", subtitle1=" + this.i + ", subtitle2=" + this.j + ", body1=" + this.k + ", body2=" + this.a + ", button=" + this.b + ", caption=" + this.l + ", overline=" + this.m + ')';
    }
}
