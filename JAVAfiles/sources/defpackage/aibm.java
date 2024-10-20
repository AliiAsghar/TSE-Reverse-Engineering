package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aibm {
    public final aiba a;

    public aibm() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aibm) {
            return this.a.equals(((aibm) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "FetchPlaceResponse{place=" + String.valueOf(this.a) + "}";
    }

    public aibm(aiba aibaVar) {
        this.a = aibaVar;
    }
}
