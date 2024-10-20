package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alhw<T> implements Serializable, alhr {
    private static final long serialVersionUID = 0;
    public final Object a;

    public alhw(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof alhw) {
            return d.B(this.a, ((alhw) obj).a);
        }
        return false;
    }

    @Override // defpackage.alhr
    public final T get() {
        return (T) this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.a.toString() + ")";
    }
}
