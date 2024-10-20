package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aewl implements aewn {
    private final long a;
    private final aaw b;
    private final cmd c;

    public aewl(long j, aaw aawVar) {
        this.a = j;
        this.b = aawVar;
        this.c = new cmd(j);
    }

    @Override // defpackage.aewn
    public final aaw b() {
        return this.b;
    }

    @Override // defpackage.aewn
    public final cko c(float f, long j) {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aewl)) {
            return false;
        }
        aewl aewlVar = (aewl) obj;
        if (a.bB(this.a, aewlVar.a) && d.F(this.b, aewlVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = cku.a;
        return (a.A(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Fade(highlightColor=" + cku.g(this.a) + ", animationSpec=" + this.b + ")";
    }

    @Override // defpackage.aewn
    public final float a(float f) {
        return f;
    }
}
