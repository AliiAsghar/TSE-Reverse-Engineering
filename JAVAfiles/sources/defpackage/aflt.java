package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aflt extends aflp {
    public final aflq a;
    private final CharSequence b;
    private final aflp e;

    public aflt(CharSequence charSequence, aflp aflpVar, aflq aflqVar) {
        aflpVar.getClass();
        this.b = charSequence;
        this.e = aflpVar;
        this.a = aflqVar;
    }

    @Override // defpackage.aflw
    public final CharSequence a() {
        return this.b;
    }

    @Override // defpackage.aflp, defpackage.aflw
    public final aflp b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aflt)) {
            return false;
        }
        aflt afltVar = (aflt) obj;
        if (d.F(this.b, afltVar.b) && d.F(this.e, afltVar.e) && this.a == afltVar.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.e.hashCode()) * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "Gender(literal=" + ((Object) this.b) + ", base=" + this.e + ", gender=" + this.a + ")";
    }
}
