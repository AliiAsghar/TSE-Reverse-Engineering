package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeiv implements aeja {
    public final boolean a;
    public final long b;
    public final arqg c;
    public final aeiy d;
    public final arqg e;
    public final aevr f;
    public final aekt g;
    private final String h;
    private final aeiz i;
    private final afbz j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final aeiu n;

    public /* synthetic */ aeiv(String str, aeiz aeizVar, afbz afbzVar, boolean z, boolean z2, boolean z3, boolean z4, long j, arqg arqgVar, aeiy aeiyVar, arqg arqgVar2, aekt aektVar, aeiu aeiuVar, int i) {
        arqg arqgVar3 = (i & 256) != 0 ? accd.h : arqgVar;
        arqg arqgVar4 = (i & 1024) != 0 ? null : arqgVar2;
        aekt aektVar2 = (i & 4096) != 0 ? null : aektVar;
        aeiu aeiuVar2 = (i & 8192) != 0 ? new aeiu() : aeiuVar;
        int i2 = i & 16;
        int i3 = i & 8;
        int i4 = i & 4;
        int i5 = i & 2;
        boolean z5 = ((i & 32) == 0) & z3;
        boolean z6 = (i2 == 0) & z2;
        boolean z7 = (i3 == 0) & z;
        afbz afbzVar2 = i4 != 0 ? null : afbzVar;
        aeiz aeizVar2 = i5 != 0 ? null : aeizVar;
        arqgVar3.getClass();
        aeiuVar2.getClass();
        this.h = str;
        this.i = aeizVar2;
        this.j = afbzVar2;
        this.k = z7;
        this.l = z6;
        this.m = z5;
        this.a = z4;
        this.b = j;
        this.c = arqgVar3;
        this.d = aeiyVar;
        this.e = arqgVar4;
        this.f = null;
        this.g = aektVar2;
        this.n = aeiuVar2;
    }

    @Override // defpackage.aeja
    public final aeiz a() {
        return this.i;
    }

    @Override // defpackage.aeja
    public final afbz b() {
        return this.j;
    }

    @Override // defpackage.aejt
    public final String c() {
        return this.h;
    }

    @Override // defpackage.aeja
    public final boolean d() {
        return this.m;
    }

    @Override // defpackage.aeja
    public final boolean e() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeiv)) {
            return false;
        }
        aeiv aeivVar = (aeiv) obj;
        if (!d.F(this.h, aeivVar.h) || !d.F(this.i, aeivVar.i) || !d.F(this.j, aeivVar.j) || this.k != aeivVar.k || this.l != aeivVar.l || this.m != aeivVar.m || this.a != aeivVar.a || this.b != aeivVar.b || !d.F(this.c, aeivVar.c) || !d.F(this.d, aeivVar.d) || !d.F(this.e, aeivVar.e)) {
            return false;
        }
        aevr aevrVar = aeivVar.f;
        if (d.F(null, null) && d.F(this.g, aeivVar.g) && d.F(this.n, aeivVar.n)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.aeja
    public final boolean f() {
        return this.l;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.h.hashCode() * 31;
        aeiz aeizVar = this.i;
        int i = 0;
        if (aeizVar == null) {
            hashCode = 0;
        } else {
            hashCode = aeizVar.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        afbz afbzVar = this.j;
        if (afbzVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = afbzVar.hashCode();
        }
        int v = (((((((((((((((i2 + hashCode2) * 31) + a.v(this.k)) * 31) + a.v(this.l)) * 31) + a.v(this.m)) * 31) + a.v(this.a)) * 31) + a.A(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        arqg arqgVar = this.e;
        if (arqgVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = arqgVar.hashCode();
        }
        int i3 = v + hashCode3;
        aekt aektVar = this.g;
        if (aektVar != null) {
            i = aektVar.hashCode();
        }
        return (((i3 * 961) + i) * 31) + this.n.hashCode();
    }

    public final String toString() {
        return "Loaded(contentDescription=" + this.h + ", transcript=" + this.i + ", voiceMood=" + this.j + ", isOutgoing=" + this.k + ", isRichType=" + this.l + ", isHighlighted=" + this.m + ", isPlaying=" + this.a + ", displayedTimeInMillis=" + this.b + ", onPlayButtonClick=" + this.c + ", seekbarUiData=" + this.d + ", onDispose=" + this.e + ", statusUiData=null, waveformUiData=" + this.g + ", flags=" + this.n + ")";
    }
}
