package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class algm<E> implements Serializable, algk {
    private static final long serialVersionUID = 0;
    public final Object a;

    public algm(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.algk
    public final E apply(Object obj) {
        return (E) this.a;
    }

    @Override // defpackage.algk
    public final boolean equals(Object obj) {
        if (obj instanceof algm) {
            return d.B(this.a, ((algm) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Functions.constant(" + String.valueOf(this.a) + ")";
    }
}
