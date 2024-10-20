package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aryb extends asfc implements arxi {
    public final String c(String str) {
        StringBuilder sb = new StringBuilder("List{");
        sb.append(str);
        sb.append("}[");
        Object f = f();
        f.getClass();
        boolean z = true;
        for (asfe asfeVar = (asfe) f; !d.F(asfeVar, this); asfeVar = asfeVar.h()) {
            if (asfeVar instanceof arxp) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(asfeVar);
                z = false;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.arxi
    public final boolean he() {
        return true;
    }

    @Override // defpackage.asfe
    public final String toString() {
        if (arwh.a) {
            return c("Active");
        }
        return super.toString();
    }

    @Override // defpackage.arxi
    public final aryb hc() {
        return this;
    }
}
