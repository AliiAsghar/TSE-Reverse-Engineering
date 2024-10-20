package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpk {
    public final awa a;
    public final awa b;
    public final awa c;
    public final awa d;
    public final awa e;
    public final awa f;
    public final awa g;
    public final awa h;

    public bpk(awa awaVar, awa awaVar2, awa awaVar3, awa awaVar4, awa awaVar5, awa awaVar6, awa awaVar7, awa awaVar8) {
        this.a = awaVar;
        this.b = awaVar2;
        this.c = awaVar3;
        this.d = awaVar4;
        this.e = awaVar5;
        this.f = awaVar6;
        this.g = awaVar7;
        this.h = awaVar8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpk)) {
            return false;
        }
        bpk bpkVar = (bpk) obj;
        if (d.F(this.a, bpkVar.a) && d.F(this.b, bpkVar.b) && d.F(this.c, bpkVar.c) && d.F(this.d, bpkVar.d) && d.F(this.e, bpkVar.e) && d.F(this.f, bpkVar.f) && d.F(this.g, bpkVar.g) && d.F(this.h, bpkVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bpk() {
        this(bpj.a, bpj.b, bpj.c, bpj.d, bpj.f, bpj.e, bpj.g, bpj.h);
        awa awaVar = bpj.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bpk(byte[] bArr) {
        this(bpj.a, bpj.b, bpj.c, bpj.d, bpj.f, bpj.e, bpj.g, bpj.h);
        awa awaVar = bpj.a;
    }
}
