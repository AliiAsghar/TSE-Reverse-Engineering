package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yus {
    public final aozb a;
    public final apct b;

    public yus() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yus) {
            yus yusVar = (yus) obj;
            if (this.a.equals(yusVar.a) && this.b.equals(yusVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        apct apctVar = this.b;
        return "DecryptedKeyPair{publicKey=" + this.a.toString() + ", creationTime=" + apctVar.toString() + "}";
    }

    public yus(aozb aozbVar, apct apctVar) {
        this.a = aozbVar;
        if (apctVar == null) {
            throw new NullPointerException("Null creationTime");
        }
        this.b = apctVar;
    }
}
