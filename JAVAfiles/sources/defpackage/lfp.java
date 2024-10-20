package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfp {
    public final afaw a;
    public final jzx b;

    public lfp(afaw afawVar, jzx jzxVar) {
        afawVar.getClass();
        this.a = afawVar;
        this.b = jzxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfp)) {
            return false;
        }
        lfp lfpVar = (lfp) obj;
        if (d.F(this.a, lfpVar.a) && d.F(this.b, lfpVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        jzx jzxVar = this.b;
        if (jzxVar == null) {
            hashCode = 0;
        } else {
            hashCode = jzxVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "MessageDetailsScreenUiData(topAppBarUiData=" + this.a + ", bugleMessageBubbleUiData=" + this.b + ")";
    }
}
