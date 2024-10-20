package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alti extends alsr implements Serializable {
    public static final alti a = new alti();
    private static final long serialVersionUID = 0;

    private alti() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.alsr
    public final alsr a() {
        return also.a;
    }

    @Override // defpackage.alsr, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
