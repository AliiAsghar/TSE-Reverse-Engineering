package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aknj {
    public final aojy a;

    public aknj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof aknj) && this.a.equals(((aknj) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 583896283;
    }

    public final String toString() {
        return "GrpcClientConfig{host=null, port=null, rpcServiceConfig=" + String.valueOf(this.a) + "}";
    }

    public aknj(aojy aojyVar) {
        this.a = aojyVar;
    }
}
