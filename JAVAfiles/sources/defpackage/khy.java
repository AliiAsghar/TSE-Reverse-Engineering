package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class khy {
    public final kjr a;
    public final jym b;
    public final jfz c;
    public final ascv d;
    public final ascg e;
    public final asai f;
    public final ascv g;
    public final arqg h;
    public final arqx i;
    public final arqr j;
    public final arqg k;
    public final boolean l;
    public final ascv m;
    public final kid n;
    public final asai o;
    public final boolean p = true;
    public final khx q;

    public khy(kjr kjrVar, jym jymVar, jfz jfzVar, ascv ascvVar, ascg ascgVar, asai asaiVar, ascv ascvVar2, arqg arqgVar, arqx arqxVar, arqr arqrVar, arqg arqgVar2, boolean z, ascv ascvVar3, kid kidVar, asai asaiVar2, khx khxVar) {
        this.a = kjrVar;
        this.b = jymVar;
        this.c = jfzVar;
        this.d = ascvVar;
        this.e = ascgVar;
        this.f = asaiVar;
        this.g = ascvVar2;
        this.h = arqgVar;
        this.i = arqxVar;
        this.j = arqrVar;
        this.k = arqgVar2;
        this.l = z;
        this.m = ascvVar3;
        this.n = kidVar;
        this.o = asaiVar2;
        this.q = khxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khy)) {
            return false;
        }
        khy khyVar = (khy) obj;
        if (!d.F(this.a, khyVar.a) || !d.F(this.b, khyVar.b) || !d.F(this.c, khyVar.c) || !d.F(this.d, khyVar.d) || !d.F(this.e, khyVar.e) || !d.F(this.f, khyVar.f) || !d.F(this.g, khyVar.g) || !d.F(this.h, khyVar.h) || !d.F(this.i, khyVar.i) || !d.F(this.j, khyVar.j) || !d.F(this.k, khyVar.k) || this.l != khyVar.l || !d.F(this.m, khyVar.m) || !d.F(this.n, khyVar.n) || !d.F(this.o, khyVar.o)) {
            return false;
        }
        boolean z = khyVar.p;
        if (d.F(this.q, khyVar.q)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
        arqg arqgVar = this.h;
        int i = 0;
        if (arqgVar == null) {
            hashCode = 0;
        } else {
            hashCode = arqgVar.hashCode();
        }
        int hashCode4 = ((((((((((((hashCode3 * 31) + hashCode) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + a.v(this.l)) * 31) + this.m.hashCode()) * 31;
        kid kidVar = this.n;
        if (kidVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = kidVar.hashCode();
        }
        int i2 = (hashCode4 + hashCode2) * 31;
        asai asaiVar = this.o;
        if (asaiVar != null) {
            i = asaiVar.hashCode();
        }
        return ((((i2 + i) * 31) + a.v(true)) * 31) + this.q.hashCode();
    }

    public final String toString() {
        return "ConversationScreenUiData(topContentUiData=" + this.a + ", pagedMessageListUiData=" + this.b + ", bottomContentUiData=" + this.c + ", popupUiDataFlow=" + this.d + ", snackbarUiDataFlow=" + this.e + ", dogfoodIconTopPaddingFlow=" + this.f + ", effectUiDataFlow=" + this.g + ", onDogfoodIconClicked=" + this.h + ", onLayoutRectUpdated=" + this.i + ", onZoomEvent=" + this.j + ", onEffectFinished=" + this.k + ", useSamsungColors=" + this.l + ", miniConversationDetailsUiDataFlow=" + this.m + ", backgroundLoader=" + this.n + ", projectorUiDataFlow=" + this.o + ", pinTopBar=true, flags=" + this.q + ")";
    }
}
