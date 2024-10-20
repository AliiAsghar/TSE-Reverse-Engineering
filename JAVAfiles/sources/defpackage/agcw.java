package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agcw {
    public final cga a;
    public final arqy b;
    public final arqy c;
    public final arqy d;
    public final arqy e;
    public final arqy f;
    public final arqx g;

    public agcw(cga cgaVar, arqy arqyVar, arqy arqyVar2, arqy arqyVar3, arqy arqyVar4, arqy arqyVar5, arqx arqxVar) {
        cgaVar.getClass();
        this.a = cgaVar;
        this.b = arqyVar;
        this.c = arqyVar2;
        this.d = arqyVar3;
        this.e = arqyVar4;
        this.f = arqyVar5;
        this.g = arqxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agcw)) {
            return false;
        }
        agcw agcwVar = (agcw) obj;
        if (d.F(this.a, agcwVar.a) && d.F(this.b, agcwVar.b) && d.F(this.c, agcwVar.c) && d.F(this.d, agcwVar.d) && d.F(this.e, agcwVar.e) && d.F(this.f, agcwVar.f) && d.F(this.g, agcwVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "UiSpec(modifier=" + this.a + ", header=" + this.b + ", footer=" + this.c + ", content=" + this.d + ", contentOverlay=" + this.e + ", screenOverlay=" + this.f + ", snackbar=" + this.g + ")";
    }
}
