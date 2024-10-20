package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgz implements jha, afcs {
    public final afcq a;
    public final jgy b;

    public jgz(afcq afcqVar, jgy jgyVar) {
        afcqVar.getClass();
        this.a = afcqVar;
        this.b = jgyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgz)) {
            return false;
        }
        jgz jgzVar = (jgz) obj;
        if (d.F(this.a, jgzVar.a) && d.F(this.b, jgzVar.b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.afcs
    public final Object fi() {
        return this.a.fi();
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Processed(attachment=" + this.a.fj() + ", metadata=" + this.b + ")";
    }
}
