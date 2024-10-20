package defpackage;

import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xmw {
    public final xlb a;
    public final Collection b;
    public final xlb c;

    public xmw(xlb xlbVar, Collection collection, xlb xlbVar2) {
        xlbVar.getClass();
        collection.getClass();
        this.a = xlbVar;
        this.b = collection;
        this.c = xlbVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmw)) {
            return false;
        }
        xmw xmwVar = (xmw) obj;
        if (d.F(this.a, xmwVar.a) && d.F(this.b, xmwVar.b) && d.F(this.c, xmwVar.c)) {
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
        return "PartialSyncAndSpotSyncs(updatedPartialSync=" + this.a + ", mergedSpotSyncs=" + this.b + ", updatedSpotSync=" + this.c + ")";
    }
}
