package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afae {
    public final cas a;
    public final dje b;
    public final dje c;
    public final dje d;
    public final dje e;
    public final dje f;
    public final dje g;
    public final bse h;

    public afae(cas casVar, dje djeVar, dje djeVar2, dje djeVar3, dje djeVar4, dje djeVar5, dje djeVar6, bse bseVar) {
        this.a = casVar;
        this.b = djeVar;
        this.c = djeVar2;
        this.d = djeVar3;
        this.e = djeVar4;
        this.f = djeVar5;
        this.g = djeVar6;
        this.h = bseVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afae)) {
            return false;
        }
        afae afaeVar = (afae) obj;
        if (d.F(this.a, afaeVar.a) && d.F(this.b, afaeVar.b) && d.F(this.c, afaeVar.c) && d.F(this.d, afaeVar.d) && d.F(this.e, afaeVar.e) && d.F(this.f, afaeVar.f) && d.F(this.g, afaeVar.g) && d.F(this.h, afaeVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "AbcTypography(scalableFontFactor=" + this.a + ", bodyBold=" + this.b + ", bodyExtraLarge=" + this.c + ", bodyMediumItalic=" + this.d + ", labelExtraSmall=" + this.e + ", titleMediumLarge=" + this.f + ", titleSmallCondensed=" + this.g + ", baseTypography=" + this.h + ")";
    }
}
