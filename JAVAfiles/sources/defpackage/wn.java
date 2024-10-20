package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wn {
    public final cfq a;
    public final arqr b;
    public final aap c;
    private final boolean d = true;

    public wn(cfq cfqVar, arqr arqrVar, aap aapVar) {
        this.a = cfqVar;
        this.b = arqrVar;
        this.c = aapVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn)) {
            return false;
        }
        wn wnVar = (wn) obj;
        if (!d.F(this.a, wnVar.a) || !d.F(this.b, wnVar.b) || !d.F(this.c, wnVar.c)) {
            return false;
        }
        boolean z = wnVar.d;
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + 1231;
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=true)";
    }
}
