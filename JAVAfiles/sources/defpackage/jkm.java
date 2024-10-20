package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jkm {
    public final aeoa a = null;
    public final afyo b;

    public jkm(afyo afyoVar) {
        this.b = afyoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkm)) {
            return false;
        }
        jkm jkmVar = (jkm) obj;
        aeoa aeoaVar = jkmVar.a;
        if (d.F(null, null) && d.F(this.b, jkmVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "InputsData(inputsUiData=null, hugoUiData=" + this.b + ")";
    }
}
