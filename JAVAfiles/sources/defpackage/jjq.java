package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jjq {
    public final jxq a;
    public final afyo b;

    public jjq(jxq jxqVar, afyo afyoVar) {
        this.a = jxqVar;
        this.b = afyoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjq)) {
            return false;
        }
        jjq jjqVar = (jjq) obj;
        if (d.F(this.a, jjqVar.a) && d.F(this.b, jjqVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DirectSendComposeRowHolderUiData(fullScreenComposeRowUiData=" + this.a + ", hugoUiData=" + this.b + ")";
    }
}
