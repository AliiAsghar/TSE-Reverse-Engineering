package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asfq {
    public static final asfn a = new asfn("NO_THREAD_ELEMENTS");
    private static final arqv b = afup.u;
    private static final arqv c = asfp.b;
    private static final arqv d = asfp.a;

    public static final Object a(arpi arpiVar) {
        Object fold = arpiVar.fold(0, b);
        fold.getClass();
        return fold;
    }

    public static final Object b(arpi arpiVar, Object obj) {
        if (obj == null) {
            obj = a(arpiVar);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return arpiVar.fold(new asft(arpiVar, ((Number) obj).intValue()), d);
        }
        return ((aryk) obj).a(arpiVar);
    }

    public static final void c(arpi arpiVar, Object obj) {
        if (obj != a) {
            if (obj instanceof asft) {
                asft asftVar = (asft) obj;
                int length = asftVar.c.length - 1;
                if (length < 0) {
                    return;
                }
                while (true) {
                    int i = length - 1;
                    aryk arykVar = asftVar.c[length];
                    arykVar.getClass();
                    arykVar.b(arpiVar, asftVar.b[length]);
                    if (i >= 0) {
                        length = i;
                    } else {
                        return;
                    }
                }
            } else {
                Object fold = arpiVar.fold(null, c);
                fold.getClass();
                ((aryk) fold).b(arpiVar, obj);
            }
        }
    }
}
