package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class akvo {
    public final long a;
    public final algw b;

    public akvo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akvo) {
            akvo akvoVar = (akvo) obj;
            if (this.a == akvoVar.a && this.b.equals(akvoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ParentInfo{ancestorRegionId=" + this.a + ", asyncInfo=" + this.b.toString() + "}";
    }

    public akvo(long j, algw algwVar) {
        this.a = j;
        this.b = algwVar;
    }
}
