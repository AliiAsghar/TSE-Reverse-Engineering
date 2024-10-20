package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahvo {
    public final ahui a;
    public final ahts b;

    public ahvo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahvo) {
            ahvo ahvoVar = (ahvo) obj;
            ahui ahuiVar = this.a;
            if (ahuiVar != null ? ahuiVar.equals(ahvoVar.a) : ahvoVar.a == null) {
                if (this.b.equals(ahvoVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        ahui ahuiVar = this.a;
        if (ahuiVar == null) {
            hashCode = 0;
        } else {
            hashCode = ahuiVar.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ahts ahtsVar = this.b;
        return "SnapshotBlobAndResult{snapshotBlob=" + String.valueOf(this.a) + ", snapshotResult=" + ahtsVar.toString() + "}";
    }

    public ahvo(ahui ahuiVar, ahts ahtsVar) {
        this.a = ahuiVar;
        if (ahtsVar == null) {
            throw new NullPointerException("Null snapshotResult");
        }
        this.b = ahtsVar;
    }
}
