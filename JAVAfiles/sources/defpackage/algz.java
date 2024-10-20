package defpackage;

import java.io.Serializable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class algz implements Serializable, algy {
    private static final long serialVersionUID = 0;
    private final List a;

    public algz(List list) {
        this.a = list;
    }

    @Override // defpackage.algy
    public final boolean a(Object obj) {
        for (int i = 0; i < this.a.size(); i++) {
            if (!((algy) this.a.get(i)).a(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof algz) {
            return this.a.equals(((algz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.a) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
