package defpackage;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahdb {
    private final adwq a;

    public ahdb(adwq adwqVar) {
        this.a = adwqVar;
    }

    public static final void b(Activity activity) {
        aiut.c();
        ahcq c = ahcz.c(ahcz.a(activity));
        if (c == null) {
            if (Log.isLoggable("GIL", 3)) {
                Log.d("GIL", "Not resetting VE state (no root CVE)");
                return;
            }
            return;
        }
        new ahda().b(c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [ahcv, java.lang.Object] */
    public final void a(View view, ahcn ahcnVar) {
        boolean z;
        boolean z2;
        aiut.c();
        boolean z3 = false;
        if (ahcnVar.b == null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "Cannot create CVE twice.");
        Object obj = ahcnVar.c;
        aozy aozyVar = (aozy) obj;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        Object obj2 = ahcnVar.d;
        adwq adwqVar = this.a;
        ahcw ahcwVar = (ahcw) ((apaa) obj).b;
        anas anasVar = (anas) ((aozy) obj2).s();
        ahcw ahcwVar2 = ahcw.a;
        anasVar.getClass();
        ahcwVar.d = anasVar;
        ahcwVar.b |= 1;
        ahcnVar.b = new ahcq((apaa) ((ahcw) ((aozy) ahcnVar.c).s()).toBuilder(), ahcnVar.a, adwqVar);
        Object obj3 = ahcnVar.b;
        adwq adwqVar2 = ((ahcq) obj3).g;
        if (!adwqVar2.a.isEmpty()) {
            if (Log.isLoggable("GIL", 2)) {
                Log.v("GIL", "Instrumented: ".concat(String.valueOf(String.valueOf(obj3))));
            }
            for (ahjj ahjjVar : adwqVar2.a) {
                aiut.c();
            }
        }
        Object obj4 = ahcnVar.b;
        ahcq c = ahcz.c(view);
        if (c == null) {
            ahcq ahcqVar = (ahcq) obj4;
            ahcz ahczVar = new ahcz(view, ahcqVar);
            ahcqVar.e = ahczVar;
            ahczVar.a.setTag(R.id.ve_tag, ahczVar.b);
            if (ahczVar.h.i()) {
                ahczVar.a.addOnAttachStateChangeListener(ahczVar);
                View view2 = ahczVar.a;
                int[] iArr = eek.a;
                if (view2.isAttachedToWindow()) {
                    ahczVar.onViewAttachedToWindow(ahczVar.a);
                    return;
                }
                return;
            }
            return;
        }
        if (!c.b()) {
            ahcq ahcqVar2 = (ahcq) obj4;
            if (ahcqVar2.e == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            albo.T(z2);
            albo.T(!c.b());
            if (c.c == ahcqVar2.c) {
                z3 = true;
            }
            albo.T(z3);
            boolean z4 = c.e.c;
            if (z4) {
                c.g.h(c);
            }
            apaa apaaVar = c.f;
            if (!apaaVar.a.isMutable()) {
                apaaVar.b = apaaVar.r();
                c.f.w((ahcw) ahcqVar2.f.s());
                if (z4) {
                    c.g.g(c);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        if (c.c()) {
            ahji.az(new IllegalStateException("CVE is already impressed and cannot be replaced."));
        } else {
            ahji.az(new IllegalStateException("CVE is already attached and cannot be replaced."));
        }
    }
}
