package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xmm {
    public final xlb a;
    public final aozb b;
    public final xlb c;

    public xmm(xlb xlbVar, aozb aozbVar, xlb xlbVar2) {
        xlbVar.getClass();
        this.a = xlbVar;
        this.b = aozbVar;
        this.c = xlbVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmm)) {
            return false;
        }
        xmm xmmVar = (xmm) obj;
        if (d.F(this.a, xmmVar.a) && d.F(this.b, xmmVar.b) && d.F(this.c, xmmVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        xlb xlbVar = this.c;
        if (xlbVar == null) {
            hashCode = 0;
        } else {
            hashCode = xlbVar.hashCode();
        }
        return (hashCode2 * 31) + hashCode;
    }

    public final String toString() {
        return "MergeDetails(originalRequest=" + this.a + ", mergedRequestSyncId=" + this.b + ", updatedRequest=" + this.c + ")";
    }

    public /* synthetic */ xmm(xlb xlbVar, aozb aozbVar) {
        this(xlbVar, aozbVar, null);
    }
}
