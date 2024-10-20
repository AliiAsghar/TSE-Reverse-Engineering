package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anjf {
    public final anje a;
    public final anjd b;
    public final anjc c;

    public anjf() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anjf) {
            anjf anjfVar = (anjf) obj;
            if (this.a.equals(anjfVar.a) && this.b.equals(anjfVar.b) && this.c.equals(anjfVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        anjc anjcVar = this.c;
        anjd anjdVar = this.b;
        return "GroupFeatures{userRemovalPolicy=" + String.valueOf(this.a) + ", renamingPolicy=" + String.valueOf(anjdVar) + ", groupIconModificationPolicy=" + String.valueOf(anjcVar) + "}";
    }

    public anjf(anje anjeVar, anjd anjdVar, anjc anjcVar) {
        this.a = anjeVar;
        this.b = anjdVar;
        this.c = anjcVar;
    }
}
