package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxk {
    public final apdz a;

    public jxk(apdz apdzVar) {
        this.a = apdzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jxk) && d.F(this.a, ((jxk) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        apdz apdzVar = this.a;
        if (apdzVar == null) {
            return 0;
        }
        return apdzVar.hashCode();
    }

    public final String toString() {
        return "EffectUiData(effect=" + this.a + ")";
    }
}
