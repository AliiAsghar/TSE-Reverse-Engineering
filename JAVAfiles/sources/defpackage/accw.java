package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class accw {
    public final algw a;
    private final algw b;
    private final algw c;
    private final algw d;
    private final algw e;

    public accw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof accw) {
            accw accwVar = (accw) obj;
            if (this.b.equals(accwVar.b) && this.a.equals(accwVar.a) && this.c.equals(accwVar.c) && this.d.equals(accwVar.d) && this.e.equals(accwVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        algw algwVar = this.e;
        algw algwVar2 = this.d;
        algw algwVar3 = this.c;
        algw algwVar4 = this.a;
        return "ValidatedEnforcementDecision{failureReason=" + String.valueOf(this.b) + ", enforcementDecision=" + String.valueOf(algwVar4) + ", enforcementResponse=" + String.valueOf(algwVar3) + ", responseUuid=" + String.valueOf(algwVar2) + ", provisionalState=" + String.valueOf(algwVar) + "}";
    }

    public accw(algw algwVar, algw algwVar2, algw algwVar3, algw algwVar4, algw algwVar5) {
        this.b = algwVar;
        this.a = algwVar2;
        this.c = algwVar3;
        this.d = algwVar4;
        this.e = algwVar5;
    }
}
