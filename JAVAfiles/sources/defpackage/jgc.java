package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgc {
    public final aeoq a;
    public final afyo b;
    public final arqr c;
    public final asai d;
    public final jkz e;

    public jgc(aeoq aeoqVar, afyo afyoVar, arqr arqrVar, asai asaiVar, jkz jkzVar) {
        this.a = aeoqVar;
        this.b = afyoVar;
        this.c = arqrVar;
        this.d = asaiVar;
        this.e = jkzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgc)) {
            return false;
        }
        jgc jgcVar = (jgc) obj;
        if (d.F(this.a, jgcVar.a) && d.F(this.b, jgcVar.b) && d.F(this.c, jgcVar.c) && d.F(this.d, jgcVar.d) && d.F(this.e, jgcVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        jkz jkzVar = this.e;
        if (jkzVar == null) {
            hashCode = 0;
        } else {
            hashCode = jkzVar.hashCode();
        }
        return (hashCode2 * 31) + hashCode;
    }

    public final String toString() {
        return "ComposeRowHolderUiData(composeRow=" + this.a + ", hugo=" + this.b + ", onInteractive=" + this.c + ", effectIsRunning=" + this.d + ", disabledComposeRow=" + this.e + ")";
    }
}
