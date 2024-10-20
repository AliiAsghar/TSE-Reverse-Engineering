package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yj<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        float a;
        xt xtVar = (xt) obj;
        float f = -1.0f;
        if (xtVar.a() == brg.a && (xtVar instanceof ye) && ((ye) xtVar).k == null) {
            a = -1.0f;
        } else {
            a = xtVar.a();
        }
        Float valueOf = Float.valueOf(a);
        xt xtVar2 = (xt) obj2;
        if (xtVar2.a() != brg.a || !(xtVar2 instanceof ye) || ((ye) xtVar2).k != null) {
            f = xtVar2.a();
        }
        return arrj.q(valueOf, Float.valueOf(f));
    }
}
