package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xmn {
    public final Collection a;
    public final xku b;
    public final Set c;

    public xmn(Collection collection, xku xkuVar, Set set) {
        this.a = collection;
        this.b = xkuVar;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmn)) {
            return false;
        }
        xmn xmnVar = (xmn) obj;
        if (d.F(this.a, xmnVar.a) && d.F(this.b, xmnVar.b) && d.F(this.c, xmnVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ActiveSyncMergeResult(updatedQueue=" + this.a + ", updatedActiveSync=" + this.b + ", mergeDetails=" + this.c + ")";
    }
}
