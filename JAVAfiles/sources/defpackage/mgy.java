package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mgy {
    private final ahka a;
    private final int b;

    public mgy() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mgy) {
            mgy mgyVar = (mgy) obj;
            if (this.a.equals(mgyVar.a) && this.b == mgyVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "TraceSectionKey{eventName=" + this.a.a + ", cookie=" + this.b + "}";
    }

    public mgy(ahka ahkaVar, int i) {
        if (ahkaVar == null) {
            throw new NullPointerException("Null eventName");
        }
        this.a = ahkaVar;
        this.b = i;
    }
}
