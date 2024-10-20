package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class allq extends alsr implements Serializable {
    private static final long serialVersionUID = 0;
    final algk a;
    final alsr b;

    public allq(algk algkVar, alsr alsrVar) {
        algkVar.getClass();
        this.a = algkVar;
        this.b = alsrVar;
    }

    @Override // defpackage.alsr, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        algk algkVar = this.a;
        return this.b.compare(algkVar.apply(obj), algkVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof allq) {
            allq allqVar = (allq) obj;
            if (this.a.equals(allqVar.a) && this.b.equals(allqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        algk algkVar = this.a;
        return this.b.toString() + ".onResultOf(" + algkVar.toString() + ")";
    }
}
