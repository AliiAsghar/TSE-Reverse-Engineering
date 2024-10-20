package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aflv extends aflp {
    public final aflr a;
    private final CharSequence b;
    private final aflp e;

    public aflv(CharSequence charSequence, aflp aflpVar, aflr aflrVar) {
        aflpVar.getClass();
        this.b = charSequence;
        this.e = aflpVar;
        this.a = aflrVar;
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
        if (!(obj instanceof aflv)) {
            return false;
        }
        aflv aflvVar = (aflv) obj;
        if (d.F(this.b, aflvVar.b) && d.F(this.e, aflvVar.e) && this.a == aflvVar.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.e.hashCode()) * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "SkinTone(literal=" + ((Object) this.b) + ", base=" + this.e + ", skinTone=" + this.a + ")";
    }
}
