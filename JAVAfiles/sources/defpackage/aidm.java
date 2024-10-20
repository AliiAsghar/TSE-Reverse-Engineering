package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aidm {
    public final long a;
    public final aiei b;

    public aidm() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aidm) {
            aidm aidmVar = (aidm) obj;
            if (this.a == aidmVar.a && this.b.equals(aidmVar.b)) {
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
        return "ObservationStoreData{observationStoreId=" + this.a + ", observations=" + this.b.toString() + "}";
    }

    public aidm(long j, aiei aieiVar) {
        this.a = j;
        if (aieiVar == null) {
            throw new NullPointerException("Null observations");
        }
        this.b = aieiVar;
    }
}
