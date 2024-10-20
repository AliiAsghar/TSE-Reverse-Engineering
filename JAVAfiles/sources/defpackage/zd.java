package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zd {
    public final arqr a;
    public final aap b;

    public zd(arqr arqrVar, aap aapVar) {
        this.a = arqrVar;
        this.b = aapVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd)) {
            return false;
        }
        zd zdVar = (zd) obj;
        if (d.F(this.a, zdVar.a) && d.F(this.b, zdVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
