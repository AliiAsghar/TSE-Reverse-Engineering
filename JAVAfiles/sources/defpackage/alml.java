package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alml extends almp {
    public static final alml a = new alml();
    private static final long serialVersionUID = 0;

    private alml() {
        super("");
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.almp
    /* renamed from: a */
    public final int compareTo(almp almpVar) {
        if (almpVar == this) {
            return 0;
        }
        return 1;
    }

    @Override // defpackage.almp
    public final Comparable b() {
        throw new IllegalStateException("range unbounded on this side");
    }

    @Override // defpackage.almp
    public final void c(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // defpackage.almp, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((almp) obj);
    }

    @Override // defpackage.almp
    public final void d(StringBuilder sb) {
        sb.append("+∞)");
    }

    @Override // defpackage.almp
    public final boolean e(Comparable comparable) {
        return false;
    }

    @Override // defpackage.almp
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "+∞";
    }
}
