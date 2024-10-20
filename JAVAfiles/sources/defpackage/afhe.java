package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afhe {
    public final arqr a;
    public final arqg b;
    public final asai c;
    public final asai d;
    public final asai e;
    public final arqr f;

    public afhe(arqr arqrVar, arqg arqgVar, asai asaiVar, asai asaiVar2, asai asaiVar3, arqr arqrVar2) {
        asaiVar.getClass();
        this.a = arqrVar;
        this.b = arqgVar;
        this.c = asaiVar;
        this.d = asaiVar2;
        this.e = asaiVar3;
        this.f = arqrVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afhe)) {
            return false;
        }
        afhe afheVar = (afhe) obj;
        if (d.F(this.a, afheVar.a) && d.F(this.b, afheVar.b) && d.F(this.c, afheVar.c) && d.F(this.d, afheVar.d) && d.F(this.e, afheVar.e) && d.F(this.f, afheVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "GalleryUiData(prepareSystemContentPicker=" + this.a + ", launchSystemContentPicker=" + this.b + ", galleryMedia=" + this.c + ", selectedMedia=" + this.d + ", titleFlow=" + this.e + ", onGalleryItemClick=" + this.f + ")";
    }
}
