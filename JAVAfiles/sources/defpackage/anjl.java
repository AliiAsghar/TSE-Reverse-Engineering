package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anjl {
    public final aqfn a;
    public final anjk b;

    public anjl() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anjl) {
            anjl anjlVar = (anjl) obj;
            if (this.a.equals(anjlVar.a) && this.b.equals(anjlVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        anjk anjkVar = this.b;
        return "GroupMember{id=" + String.valueOf(this.a) + ", role=" + String.valueOf(anjkVar) + "}";
    }

    public anjl(aqfn aqfnVar, anjk anjkVar) {
        this.a = aqfnVar;
        this.b = anjkVar;
    }
}
