package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vrv implements vrn {
    private final Map a = new HashMap();
    private final Map b = new HashMap();

    private final amwt z(adiv adivVar) {
        if (this.a.containsKey(adivVar) && !((ArrayDeque) this.a.get(adivVar)).isEmpty()) {
            ArrayDeque arrayDeque = (ArrayDeque) this.a.get(adivVar);
            if (arrayDeque.size() == 1) {
                amwt amwtVar = (amwt) arrayDeque.peek();
                if (amwtVar != null) {
                    return amwtVar;
                }
            } else {
                return (amwt) arrayDeque.remove();
            }
        }
        return amwt.BUGLE_LOADING_AVAILABILITY_IN_PROGRESS;
    }

    @Override // defpackage.vrn
    public final akul a(vrk vrkVar) {
        return aktp.ag(null);
    }

    @Override // defpackage.vrn
    public final akul b(adiv adivVar, vrk vrkVar) {
        return aktp.ag(null);
    }

    @Override // defpackage.vrn
    public final amhv c() {
        return amhv.UNKNOWN_UNINITIALIZED_REASON;
    }

    @Override // defpackage.vrn
    public final amwt d() {
        return z(null);
    }

    @Override // defpackage.vrn
    public final amwt e(String str) {
        return z(new adiw(str));
    }

    @Override // defpackage.vrn
    public final amwt f(int i) {
        adiv adivVar = (adiv) this.b.get(Integer.valueOf(i));
        if (adivVar != null) {
            return z(adivVar);
        }
        return amwt.BUGLE_LOADING_AVAILABILITY_IN_PROGRESS;
    }

    @Override // defpackage.vrn
    public final String g(amwt amwtVar, amhv amhvVar) {
        return "";
    }

    @Override // defpackage.vrn
    public final boolean q() {
        if (d() == amwt.AVAILABLE) {
            return true;
        }
        return false;
    }

    @Override // defpackage.vrn
    public final boolean r() {
        if (d() == amwt.DISABLED_FROM_PREFERENCES) {
            return true;
        }
        return false;
    }

    @Override // defpackage.vrn
    public final boolean s() {
        int ordinal = d().ordinal();
        if (ordinal == 1 || ordinal == 6 || ordinal == 10 || ordinal == 13 || ordinal == 21) {
            return true;
        }
        return false;
    }

    @Override // defpackage.vrn
    public final boolean t() {
        if (d() == amwt.DISABLED_VIA_GSERVICES) {
            return true;
        }
        return false;
    }

    @Override // defpackage.vrn
    public final int u() {
        return 3;
    }

    @Override // defpackage.vrn
    public final amwt v(adiv adivVar) {
        return z(adivVar);
    }

    @Override // defpackage.vrn
    public final amwt w(adiv adivVar) {
        return z(adivVar);
    }

    @Override // defpackage.vrn
    public final amwt x() {
        return z(null);
    }

    @Override // defpackage.vrn
    public final void j() {
    }

    @Override // defpackage.vrn
    public final void k() {
    }

    @Override // defpackage.vrn
    public final void m() {
    }

    @Override // defpackage.vrn
    public final void y() {
    }

    @Override // defpackage.vrn
    @Deprecated
    public final void h(vrl vrlVar) {
    }

    @Override // defpackage.vrn
    @Deprecated
    public final void l(vrl vrlVar) {
    }

    @Override // defpackage.vrn
    public final void n(vrk vrkVar) {
    }

    @Override // defpackage.vrn
    public final void o(vrk vrkVar) {
    }

    @Override // defpackage.vrn
    public final void i(vrl vrlVar, Executor executor) {
    }

    @Override // defpackage.vrn
    public final void p(adiv adivVar, vrk vrkVar) {
    }
}
