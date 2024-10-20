package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aflu extends aflp {
    public final aflq a;
    public final aflr b;
    private final CharSequence e;
    private final aflp f;

    public aflu(CharSequence charSequence, aflp aflpVar, aflq aflqVar, aflr aflrVar) {
        aflpVar.getClass();
        this.e = charSequence;
        this.f = aflpVar;
        this.a = aflqVar;
        this.b = aflrVar;
    }

    @Override // defpackage.aflw
    public final CharSequence a() {
        return this.e;
    }

    @Override // defpackage.aflp, defpackage.aflw
    public final aflp b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aflu)) {
            return false;
        }
        aflu afluVar = (aflu) obj;
        if (d.F(this.e, afluVar.e) && d.F(this.f, afluVar.f) && this.a == afluVar.a && this.b == afluVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.e.hashCode() * 31) + this.f.hashCode()) * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "GenderAndSkinTone(literal=" + ((Object) this.e) + ", base=" + this.f + ", gender=" + this.a + ", skinTone=" + this.b + ")";
    }
}
