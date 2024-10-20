package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class rrm {
    public final boolean a;
    public final atkn b;

    public rrm(boolean z, atkn atknVar) {
        this.a = z;
        this.b = atknVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrm)) {
            return false;
        }
        rrm rrmVar = (rrm) obj;
        if (this.a == rrmVar.a && d.F(this.b, rrmVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.v(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "RemoteParticipantsSearchResult(hasSelfAmongRemoteParticipants=" + this.a + ", remoteParticipants=" + this.b + ")";
    }
}
