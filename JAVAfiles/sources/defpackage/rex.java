package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class rex {
    public final rut a;
    public final tqc b;

    public rex() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rex) {
            rex rexVar = (rex) obj;
            if (this.a.equals(rexVar.a) && this.b.equals(rexVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        tqc tqcVar = this.b;
        return "TelephonyMatchResult{createConversationResult=" + this.a.toString() + ", archiveStatus=" + tqcVar.toString() + "}";
    }

    public rex(rut rutVar, tqc tqcVar) {
        if (rutVar == null) {
            throw new NullPointerException("Null createConversationResult");
        }
        this.a = rutVar;
        if (tqcVar != null) {
            this.b = tqcVar;
            return;
        }
        throw new NullPointerException("Null archiveStatus");
    }
}
