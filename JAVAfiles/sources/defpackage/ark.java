package defpackage;

import ark.a;
import defpackage.ara;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ark<Interval extends a> {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public interface a {
        arqr a();

        arqr b();
    }

    public abstract ara a();

    public final int d() {
        return ((atb) a()).b;
    }

    public final Object e(int i) {
        ara.a a2 = a().a(i);
        return ((a) a2.c).b().a(Integer.valueOf(i - a2.a));
    }

    public final Object f(int i) {
        Object a2;
        ara.a a3 = a().a(i);
        int i2 = i - a3.a;
        arqr a4 = ((a) a3.c).a();
        if (a4 != null && (a2 = a4.a(Integer.valueOf(i2))) != null) {
            return a2;
        }
        return new aqy(i);
    }
}
