package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeqo implements aeqk {
    private final arqg a;
    private final arml b;

    public aeqo(arqg arqgVar) {
        this.a = arqgVar;
        this.b = armd.b(3, arqgVar);
    }

    @Override // defpackage.aeqk
    public final aeqn a() {
        return (aeqn) this.b.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aeqo) && d.F(this.a, ((aeqo) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LazyFavoriteUiData(initializer=" + this.a + ")";
    }
}
