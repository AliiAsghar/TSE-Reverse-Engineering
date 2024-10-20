package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xmo {
    public final Collection a;
    public final Collection b;
    public final amvm c;
    public final int d;

    public xmo(Collection collection, int i, Collection collection2, amvm amvmVar) {
        this.a = collection;
        this.d = i;
        this.b = collection2;
        this.c = amvmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmo)) {
            return false;
        }
        xmo xmoVar = (xmo) obj;
        if (d.F(this.a, xmoVar.a) && this.d == xmoVar.d && d.F(this.b, xmoVar.b) && this.c == xmoVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        int i = this.d;
        a.bm(i);
        int hashCode3 = ((hashCode2 + i) * 31) + this.b.hashCode();
        amvm amvmVar = this.c;
        if (amvmVar == null) {
            hashCode = 0;
        } else {
            hashCode = amvmVar.hashCode();
        }
        return (hashCode3 * 31) + hashCode;
    }

    public final String toString() {
        return "NewRequestMergeResult(updatedQueue=" + this.a + ", mergeCase=" + ((Object) Integer.toString(a.M(this.d))) + ", mergeDetails=" + this.b + ", newFullSyncReason=" + this.c + ")";
    }

    public /* synthetic */ xmo(Collection collection, int i, Collection collection2) {
        this(collection, i, collection2, null);
    }
}
