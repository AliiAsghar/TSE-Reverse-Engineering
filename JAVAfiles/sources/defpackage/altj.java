package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class altj extends alsr implements Serializable {
    private static final long serialVersionUID = 0;
    final alsr a;

    public altj(alsr alsrVar) {
        this.a = alsrVar;
    }

    @Override // defpackage.alsr
    public final alsr a() {
        return this.a;
    }

    @Override // defpackage.alsr, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof altj) {
            return this.a.equals(((altj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString().concat(".reverse()");
    }
}
