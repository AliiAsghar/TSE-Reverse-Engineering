package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgv implements jgx, afcs {
    public final afcv a;

    public jgv(afcv afcvVar) {
        afcvVar.getClass();
        this.a = afcvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jgv) && d.F(this.a, ((jgv) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.afcs
    public final Object fi() {
        return this.a.h();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Resolved(attachment=" + this.a.fj() + ")";
    }
}
