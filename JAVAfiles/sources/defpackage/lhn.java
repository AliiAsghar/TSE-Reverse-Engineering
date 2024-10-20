package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lhn {
    public final ascv a;
    public final asai b;
    public final ascv c;
    public final arqr d;
    public final arqg e;
    public final arqg f;

    public lhn(ascv ascvVar, asai asaiVar, ascv ascvVar2, arqr arqrVar, arqg arqgVar, arqg arqgVar2) {
        ascvVar.getClass();
        asaiVar.getClass();
        this.a = ascvVar;
        this.b = asaiVar;
        this.c = ascvVar2;
        this.d = arqrVar;
        this.e = arqgVar;
        this.f = arqgVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhn)) {
            return false;
        }
        lhn lhnVar = (lhn) obj;
        if (d.F(this.a, lhnVar.a) && d.F(this.b, lhnVar.b) && d.F(this.c, lhnVar.c) && d.F(this.d, lhnVar.d) && d.F(this.e, lhnVar.e) && d.F(this.f, lhnVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "MultiShareListUiData(conversationsFlow=" + this.a + ", contactsFlow=" + this.b + ", headerIndexFlow=" + this.c + ", onMultiShareListScroll=" + this.d + ", onMultiShareListInteractive=" + this.e + ", onActivateFastScroll=" + this.f + ")";
    }
}
