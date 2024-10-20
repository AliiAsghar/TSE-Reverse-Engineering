package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class amad extends amac implements amal {
    @Override // defpackage.amac, defpackage.amat
    public /* bridge */ /* synthetic */ Iterable b(Object obj) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof amal)) {
            return false;
        }
        amal amalVar = (amal) obj;
        amalVar.f();
        if (d().equals(amalVar.d()) && new amab(this).equals(amalVar.c())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return new amab(this).hashCode();
    }

    public final String toString() {
        return "isDirected: true, allowsSelfLoops: false, nodes: " + d().toString() + ", edges: " + new amab(this).toString();
    }
}
