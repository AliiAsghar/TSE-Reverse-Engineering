package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yut {
    public final alor a;
    private final yuf b;
    private final alor c;

    public yut() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yut) {
            yut yutVar = (yut) obj;
            if (this.b.equals(yutVar.b) && alzz.am(this.c, yutVar.c) && alzz.am(this.a, yutVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "VerifiedSmsDataWithDecryptedKeyPairs{storedData=" + this.b.toString() + ", activeKeyPairs=" + alzz.ai(this.c) + ", evictedKeyPairs=" + alzz.ai(this.a) + "}";
    }

    public yut(yuf yufVar, alor alorVar, alor alorVar2) {
        if (yufVar == null) {
            throw new NullPointerException("Null storedData");
        }
        this.b = yufVar;
        this.c = alorVar;
        this.a = alorVar2;
    }
}
