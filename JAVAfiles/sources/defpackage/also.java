package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class also extends alsr implements Serializable {
    public static final also a = new also();
    private static final long serialVersionUID = 0;

    private also() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.alsr
    public final alsr a() {
        return alti.a;
    }

    @Override // defpackage.alsr, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
