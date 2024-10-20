package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeix implements aeja {
    public final afbz a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final aevr e = null;
    public final long f;
    public final aekt g;
    private final String h;
    private final aeiz i;
    private final aeiu j;

    public aeix(String str, aeiz aeizVar, afbz afbzVar, boolean z, boolean z2, boolean z3, long j, aekt aektVar, aeiu aeiuVar) {
        this.h = str;
        this.i = aeizVar;
        this.a = afbzVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.f = j;
        this.g = aektVar;
        this.j = aeiuVar;
    }

    @Override // defpackage.aeja
    public final aeiz a() {
        return this.i;
    }

    @Override // defpackage.aeja
    public final afbz b() {
        return this.a;
    }

    @Override // defpackage.aejt
    public final String c() {
        return this.h;
    }

    @Override // defpackage.aeja
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.aeja
    public final boolean e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeix)) {
            return false;
        }
        aeix aeixVar = (aeix) obj;
        if (!d.F(this.h, aeixVar.h) || !d.F(this.i, aeixVar.i) || !d.F(this.a, aeixVar.a) || this.b != aeixVar.b || this.c != aeixVar.c || this.d != aeixVar.d) {
            return false;
        }
        aevr aevrVar = aeixVar.e;
        if (d.F(null, null) && this.f == aeixVar.f && d.F(this.g, aeixVar.g) && d.F(this.j, aeixVar.j)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.aeja
    public final boolean f() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.h.hashCode() * 31;
        aeiz aeizVar = this.i;
        int i = 0;
        if (aeizVar == null) {
            hashCode = 0;
        } else {
            hashCode = aeizVar.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        afbz afbzVar = this.a;
        if (afbzVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = afbzVar.hashCode();
        }
        int v = (((((((((i2 + hashCode2) * 31) + a.v(this.b)) * 31) + a.v(this.c)) * 31) + a.v(this.d)) * 961) + a.A(this.f)) * 31;
        aekt aektVar = this.g;
        if (aektVar != null) {
            i = aektVar.hashCode();
        }
        return ((v + i) * 31) + this.j.hashCode();
    }

    public final String toString() {
        return "LoadingPlayback(contentDescription=" + this.h + ", transcript=" + this.i + ", voiceMood=" + this.a + ", isOutgoing=" + this.b + ", isRichType=" + this.c + ", isHighlighted=" + this.d + ", statusUiData=null, displayedTimeInMillis=" + this.f + ", waveformUiData=" + this.g + ", flags=" + this.j + ")";
    }
}
