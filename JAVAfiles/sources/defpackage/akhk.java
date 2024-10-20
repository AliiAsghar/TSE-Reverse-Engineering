package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akhk {
    public final algw a;
    public final algw b;
    public final algw c;
    public final algw d;

    public akhk() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final akhk a(akho akhoVar) {
        return new akhk(this.a, this.b, alfd.a, algw.i(akhoVar));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akhk) {
            akhk akhkVar = (akhk) obj;
            if (this.a.equals(akhkVar.a) && this.b.equals(akhkVar.b) && this.c.equals(akhkVar.c) && this.d.equals(akhkVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        algw algwVar = this.d;
        algw algwVar2 = this.c;
        algw algwVar3 = this.b;
        return "LocalSubscriptionState{maybeLocalDataSource=" + String.valueOf(this.a) + ", executingLoad=" + String.valueOf(algwVar3) + ", pendingTopicResult=" + String.valueOf(algwVar2) + ", publishedTopicResult=" + String.valueOf(algwVar) + "}";
    }

    public akhk(algw algwVar, algw algwVar2, algw algwVar3, algw algwVar4) {
        if (algwVar == null) {
            throw new NullPointerException("Null maybeLocalDataSource");
        }
        this.a = algwVar;
        if (algwVar2 != null) {
            this.b = algwVar2;
            if (algwVar3 != null) {
                this.c = algwVar3;
                if (algwVar4 != null) {
                    this.d = algwVar4;
                    return;
                }
                throw new NullPointerException("Null publishedTopicResult");
            }
            throw new NullPointerException("Null pendingTopicResult");
        }
        throw new NullPointerException("Null executingLoad");
    }
}
