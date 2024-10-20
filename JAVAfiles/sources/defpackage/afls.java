package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afls extends aflp {
    private final CharSequence a;
    private final aflp b;
    private final aflr e;
    private final aflr f;

    public afls(CharSequence charSequence, aflp aflpVar, aflr aflrVar, aflr aflrVar2) {
        aflpVar.getClass();
        this.a = charSequence;
        this.b = aflpVar;
        this.e = aflrVar;
        this.f = aflrVar2;
    }

    @Override // defpackage.aflw
    public final CharSequence a() {
        return this.a;
    }

    @Override // defpackage.aflp, defpackage.aflw
    public final aflp b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afls)) {
            return false;
        }
        afls aflsVar = (afls) obj;
        if (d.F(this.a, aflsVar.a) && d.F(this.b, aflsVar.b) && this.e == aflsVar.e && this.f == aflsVar.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "DualSkinTone(literal=" + ((Object) this.a) + ", base=" + this.b + ", skinTone1=" + this.e + ", skinTone2=" + this.f + ")";
    }
}
