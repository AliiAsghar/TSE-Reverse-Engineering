package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vrs {
    public final vrm a;
    public final long b;
    public final UUID c;

    public vrs() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vrs) {
            vrs vrsVar = (vrs) obj;
            if (this.a.equals(vrsVar.a) && this.b == vrsVar.b && this.c.equals(vrsVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        UUID uuid = this.c;
        return "ExecutionInfo{rcsAvailabilityUpdate=" + this.a.toString() + ", triggerTime=" + this.b + ", execId=" + uuid.toString() + "}";
    }

    public vrs(vrm vrmVar, long j, UUID uuid) {
        if (vrmVar == null) {
            throw new NullPointerException("Null rcsAvailabilityUpdate");
        }
        this.a = vrmVar;
        this.b = j;
        if (uuid != null) {
            this.c = uuid;
            return;
        }
        throw new NullPointerException("Null execId");
    }
}
