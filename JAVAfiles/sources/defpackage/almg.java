package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class almg extends alsr implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator a;

    public almg(Comparator comparator) {
        comparator.getClass();
        this.a = comparator;
    }

    @Override // defpackage.alsr, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof almg) {
            return this.a.equals(((almg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
