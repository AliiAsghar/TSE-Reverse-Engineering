package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lkd {
    private static final alvi d = alvi.m("com/google/android/apps/messaging/navigation/NavigationRouterImpl");
    public final Set a;
    public final ascd b;
    public final lkt c;

    public lkd(lkt lktVar) {
        lktVar.getClass();
        this.c = lktVar;
        this.a = new LinkedHashSet();
        this.b = ascy.a(true);
    }

    public final Object a(lkg lkgVar, arpe arpeVar) {
        alvi alviVar = d;
        ((alvg) alviVar.d().h("com/google/android/apps/messaging/navigation/NavigationRouterImpl", "navigate", 57, "NavigationRouterImpl.kt")).t("Navigation requested to %s", lkgVar);
        arpk arpkVar = new arpk(arhi.i(arpeVar));
        if (this.a.contains(lkgVar)) {
            ((alvg) alviVar.i().h("com/google/android/apps/messaging/navigation/NavigationRouterImpl", "navigate", 61, "NavigationRouterImpl.kt")).q("Attempting to navigate to disabled navigation target.");
            arpkVar.w(aqil.O(new ljy()));
        } else {
            try {
                lkt lktVar = this.c;
                lktVar.a((lkr) lktVar.d.c(), new lkz(lktVar.c.incrementAndGet(), lkgVar, arpkVar));
            } catch (Exception e) {
                ((alvg) ((alvg) d.i()).g(e).h("com/google/android/apps/messaging/navigation/NavigationRouterImpl", "navigate", 75, "NavigationRouterImpl.kt")).q("Navigation request failed.");
                arpkVar.w(aqil.O(e));
            }
        }
        Object a = arpkVar.a();
        if (a == arpl.a) {
            arpeVar.getClass();
        }
        return a;
    }

    public final void b(lkf lkfVar) {
        alvi alviVar = d;
        ((alvg) alviVar.d().h("com/google/android/apps/messaging/navigation/NavigationRouterImpl", "navigate", 30, "NavigationRouterImpl.kt")).t("Navigation requested to %s", lkfVar);
        if (!this.a.contains(lkfVar)) {
            lkt lktVar = this.c;
            lktVar.a((lkr) lktVar.d.c(), new lkw(lktVar.c.incrementAndGet(), lkfVar));
        } else {
            ((alvg) alviVar.i().h("com/google/android/apps/messaging/navigation/NavigationRouterImpl", "navigate", 32, "NavigationRouterImpl.kt")).q("Attempting to navigate to disabled navigation target.");
            throw new ljy();
        }
    }

    public final void c(int i) {
        lkt lktVar = this.c;
        lkr lkrVar = (lkr) lktVar.d.c();
        lkh b = lkrVar.b();
        if (b instanceof lkf) {
            lktVar.a(lkrVar, new lkj(i, (lkf) b));
            this.c.b();
        } else {
            lkq lkqVar = new lkq(lkrVar, "CompletedState", b, i);
            lga.h(lkrVar, lkrVar.b(), lkqVar.a, lkj.class, b, i, lkqVar);
            throw lkqVar;
        }
    }

    public final void d(int i, Object obj) {
        lkt lktVar = this.c;
        lkr lkrVar = (lkr) lktVar.d.c();
        lkh b = lkrVar.b();
        if (b instanceof lkg) {
            lktVar.a(lkrVar, new lkk(obj, i, (lkg) b, lktVar.b));
            this.c.b();
        } else {
            lkq lkqVar = new lkq(lkrVar, "CompletedWithResultState", b, i);
            lga.h(lkrVar, lkrVar.b(), lkqVar.a, lkk.class, b, i, lkqVar);
            throw lkqVar;
        }
    }

    public final void e(int i) {
        lkr lkoVar;
        lkt lktVar = this.c;
        lkr lkrVar = (lkr) lktVar.d.c();
        lkh b = lkrVar.b();
        if (lkrVar instanceof lkw) {
            lkoVar = new lkl(i, (lkf) b);
        } else if (lkrVar instanceof lkz) {
            lkoVar = new lko(i, (lkg) b);
        } else {
            lkq lkqVar = new lkq(lkrVar, "DispatchedState or DispatchedWithResultState", b, i);
            lga.h(lkrVar, lkrVar.b(), lkqVar.a, lkl.class, b, i, lkqVar);
            throw lkqVar;
        }
        lktVar.a(lkrVar, lkoVar);
    }

    public final boolean f(lkh lkhVar) {
        if (!this.a.contains(lkhVar)) {
            return true;
        }
        return false;
    }

    public final boolean g(lkf lkfVar) {
        ((alvg) d.d().h("com/google/android/apps/messaging/navigation/NavigationRouterImpl", "tryNavigate", 42, "NavigationRouterImpl.kt")).t("Navigation requested to %s", lkfVar);
        try {
            b(lkfVar);
            return true;
        } catch (Exception e) {
            ((alvg) ((alvg) d.i()).g(e).h("com/google/android/apps/messaging/navigation/NavigationRouterImpl", "tryNavigate", 47, "NavigationRouterImpl.kt")).q("Navigation request failed.");
            return false;
        }
    }
}
