package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anid {
    public final aozb a;
    public final aozb b;

    public anid() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anid) {
            anid anidVar = (anid) obj;
            if (this.a.equals(anidVar.a) && this.b.equals(anidVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        aozb aozbVar = this.b;
        return "Curve25519KeyPair{publicKey=" + this.a.toString() + ", privateKey=" + aozbVar.toString() + "}";
    }

    public anid(aozb aozbVar, aozb aozbVar2) {
        this.a = aozbVar;
        this.b = aozbVar2;
    }
}
