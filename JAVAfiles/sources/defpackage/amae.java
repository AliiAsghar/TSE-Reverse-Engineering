package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class amae extends amac implements amax {
    private static Map h(amax amaxVar) {
        return new alrp(amaxVar.c(), new akok(amaxVar, 6));
    }

    @Override // defpackage.amac, defpackage.amat
    public /* bridge */ /* synthetic */ Iterable b(Object obj) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof amax)) {
            return false;
        }
        amax amaxVar = (amax) obj;
        amaxVar.f();
        if (d().equals(amaxVar.d()) && h(this).equals(h(amaxVar))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return h(this).hashCode();
    }

    public final String toString() {
        return "isDirected: true, allowsSelfLoops: false, nodes: " + d().toString() + ", edges: " + h(this).toString();
    }
}
