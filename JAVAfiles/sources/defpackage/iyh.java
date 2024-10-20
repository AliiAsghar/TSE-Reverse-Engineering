package defpackage;

import android.content.Context;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iyh {
    public static final xze a = xze.g("Bugle", "SelectedMessagesImpl");
    public final Map b = new tm();
    public final List c = new ArrayList();

    private final rry g() {
        aiut.c();
        return (rry) b().iterator().next();
    }

    public final int a() {
        aiut.c();
        return ((vl) this.b).d;
    }

    public final Collection b() {
        aiut.c();
        return alog.n(this.b.values());
    }

    public final void c() {
        aiut.c();
        Map map = this.b;
        if (!map.isEmpty()) {
            alog n = alog.n(map.values());
            alog n2 = alog.n(this.b.keySet());
            this.b.clear();
            xyo c = a.c();
            c.H("Deselected messages");
            c.H(n2);
            c.q();
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((iyi) it.next()).I(n);
            }
        }
    }

    public final boolean d() {
        aiut.c();
        return this.b.isEmpty();
    }

    public final boolean e(rry rryVar) {
        aiut.c();
        return this.b.containsKey(rryVar.u());
    }

    public final boolean f(int i, Context context) {
        boolean z;
        aiut.c();
        if (a() == 1) {
            z = true;
        } else {
            z = false;
        }
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                if (!z) {
                                    return false;
                                }
                                rry g = g();
                                if (!g.ac()) {
                                    return false;
                                }
                                if (g.am()) {
                                    if (g.ak()) {
                                        return false;
                                    }
                                } else if (((alpt) Collection.EL.stream(g.T()).filter(new qxi(12)).map(new rqr(19)).collect(alls.b)).size() > 1) {
                                    return false;
                                }
                                return true;
                            }
                            if (!z) {
                                return false;
                            }
                            return g().ad(context);
                        }
                        if (!z) {
                            return false;
                        }
                        return g().ag();
                    }
                    return z;
                }
                if (!z) {
                    return false;
                }
                return g().ac();
            }
            if (!z) {
                return false;
            }
            rry g2 = g();
            if (g2.aj() || !g2.am()) {
                return false;
            }
            if (g2.au() && !rvx.h(g2.f())) {
                return false;
            }
            return true;
        }
        if (z) {
            rry g3 = g();
            if (!g3.aj() && !g3.T().isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
