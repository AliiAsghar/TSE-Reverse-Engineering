package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kbi implements aetv {
    public final arqg a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final arqg f;
    public final arqg g;
    public final kbo h;
    public final boolean i;
    public final afbz j;
    public final List k;
    public final aevr l = null;
    public final kbh m;
    public final kbn n;

    public kbi(kbn kbnVar, arqg arqgVar, String str, boolean z, boolean z2, boolean z3, arqg arqgVar2, arqg arqgVar3, kbo kboVar, boolean z4, afbz afbzVar, List list, kbh kbhVar) {
        this.n = kbnVar;
        this.a = arqgVar;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = arqgVar2;
        this.g = arqgVar3;
        this.h = kboVar;
        this.i = z4;
        this.j = afbzVar;
        this.k = list;
        this.m = kbhVar;
    }

    @Override // defpackage.aetv
    public final String a() {
        throw null;
    }

    @Override // defpackage.aetv
    public final arqg b() {
        return this.f;
    }

    @Override // defpackage.aetv
    public final arqg c() {
        throw null;
    }

    @Override // defpackage.aetv
    public final boolean d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbi)) {
            return false;
        }
        kbi kbiVar = (kbi) obj;
        if (!d.F(this.n, kbiVar.n) || !d.F(this.a, kbiVar.a) || !d.F(this.b, kbiVar.b) || this.c != kbiVar.c || this.d != kbiVar.d || this.e != kbiVar.e || !d.F(this.f, kbiVar.f) || !d.F(this.g, kbiVar.g) || !d.F(this.h, kbiVar.h) || this.i != kbiVar.i || !d.F(this.j, kbiVar.j) || !d.F(this.k, kbiVar.k)) {
            return false;
        }
        aevr aevrVar = kbiVar.l;
        if (d.F(null, null) && d.F(this.m, kbiVar.m)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (((this.n.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
        arqg arqgVar = this.f;
        int v = (((((((((hashCode3 * 31) + a.v(this.c)) * 31) + a.v(this.d)) * 31) + a.v(this.e)) * 31) + arqgVar.hashCode()) * 31) + this.g.hashCode();
        kbo kboVar = this.h;
        int i = 0;
        if (kboVar == null) {
            hashCode = 0;
        } else {
            hashCode = kboVar.hashCode();
        }
        int v2 = ((((v * 31) + hashCode) * 31) + a.v(this.i)) * 31;
        afbz afbzVar = this.j;
        if (afbzVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = afbzVar.hashCode();
        }
        int i2 = (v2 + hashCode2) * 31;
        List list = this.k;
        if (list != null) {
            i = list.hashCode();
        }
        return ((i2 + i) * 961) + 1237;
    }

    public final String toString() {
        return "BugleAudioBubbleUiData(audioPlayer=" + this.n + ", onDispose=" + this.a + ", contentDescription=" + this.b + ", isHighlighted=" + this.c + ", isOutgoing=" + this.d + ", isTransferring=" + this.e + ", onClick=" + this.f + ", onLayout=" + this.g + ", transcript=" + this.h + ", isRichType=" + this.i + ", voiceMood=" + this.j + ", amplitudeList=" + this.k + ", statusUiData=null, flags=" + this.m + ")";
    }
}
