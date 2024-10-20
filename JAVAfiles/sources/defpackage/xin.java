package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xin {
    public final wyc a;
    public final wyb b;

    public xin() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xin) {
            xin xinVar = (xin) obj;
            if (this.a.equals(xinVar.a) && this.b.equals(xinVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        wyb wybVar = this.b;
        return "LocalAndRemoteMessagesToMerge{localMessage=" + this.a.toString() + ", remoteMessage=" + wybVar.toString() + "}";
    }

    public xin(wyc wycVar, wyb wybVar) {
        if (wycVar == null) {
            throw new NullPointerException("Null localMessage");
        }
        this.a = wycVar;
        if (wybVar != null) {
            this.b = wybVar;
            return;
        }
        throw new NullPointerException("Null remoteMessage");
    }
}
