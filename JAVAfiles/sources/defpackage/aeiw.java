package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeiw implements aeja {
    private final String a;
    private final aeiz b;
    private final afbz c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final aevr g = null;
    private final aeiu h;

    public aeiw(String str, aeiz aeizVar, afbz afbzVar, boolean z, boolean z2, boolean z3, aeiu aeiuVar) {
        this.a = str;
        this.b = aeizVar;
        this.c = afbzVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.h = aeiuVar;
    }

    @Override // defpackage.aeja
    public final aeiz a() {
        return this.b;
    }

    @Override // defpackage.aeja
    public final afbz b() {
        return this.c;
    }

    @Override // defpackage.aejt
    public final String c() {
        return this.a;
    }

    @Override // defpackage.aeja
    public final boolean d() {
        return this.f;
    }

    @Override // defpackage.aeja
    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeiw)) {
            return false;
        }
        aeiw aeiwVar = (aeiw) obj;
        if (!d.F(this.a, aeiwVar.a) || !d.F(this.b, aeiwVar.b) || !d.F(this.c, aeiwVar.c) || this.d != aeiwVar.d || this.e != aeiwVar.e || this.f != aeiwVar.f) {
            return false;
        }
        aevr aevrVar = aeiwVar.g;
        if (d.F(null, null) && d.F(this.h, aeiwVar.h)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.aeja
    public final boolean f() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        aeiz aeizVar = this.b;
        int i = 0;
        if (aeizVar == null) {
            hashCode = 0;
        } else {
            hashCode = aeizVar.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        afbz afbzVar = this.c;
        if (afbzVar != null) {
            i = afbzVar.hashCode();
        }
        return ((((((((i2 + i) * 31) + a.v(this.d)) * 31) + a.v(this.e)) * 31) + a.v(this.f)) * 961) + this.h.hashCode();
    }

    public final String toString() {
        return "Loading(contentDescription=" + this.a + ", transcript=" + this.b + ", voiceMood=" + this.c + ", isOutgoing=" + this.d + ", isRichType=" + this.e + ", isHighlighted=" + this.f + ", statusUiData=null, flags=" + this.h + ")";
    }
}
