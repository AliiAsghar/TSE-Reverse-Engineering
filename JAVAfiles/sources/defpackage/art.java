package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class art {
    public static final int a(ars arsVar, Object obj, int i) {
        if (obj != null && arsVar.e() != 0) {
            if (i < arsVar.e() && d.F(obj, arsVar.g(i))) {
                return i;
            }
            int d = arsVar.d(obj);
            if (d != -1) {
                return d;
            }
        }
        return i;
    }
}
