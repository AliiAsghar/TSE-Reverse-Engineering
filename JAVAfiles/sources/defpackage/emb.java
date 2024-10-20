package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emb {
    public static final /* synthetic */ int a = 0;
    private static final ema b = ema.a;

    public static final void a(cg cgVar, String str) {
        cgVar.getClass();
        ely elyVar = new ely(cgVar, str);
        d(elyVar);
        ema b2 = b(cgVar);
        if (b2.b.contains(elz.DETECT_FRAGMENT_REUSE) && e(b2, cgVar.getClass(), elyVar.getClass())) {
            c(b2, elyVar);
        }
    }

    public static final ema b(cg cgVar) {
        while (cgVar != null) {
            if (cgVar.aw()) {
                cgVar.H();
            }
            cgVar = cgVar.E;
        }
        return b;
    }

    public static final void c(ema emaVar, eml emlVar) {
        cg cgVar = emlVar.a;
        String name = cgVar.getClass().getName();
        if (emaVar.b.contains(elz.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(String.valueOf(name)), emlVar);
        }
        if (emaVar.b.contains(elz.PENALTY_DEATH)) {
            bn bnVar = new bn(name, emlVar, 19);
            if (cgVar.aw()) {
                Handler handler = cgVar.H().n.d;
                if (d.F(handler.getLooper(), Looper.myLooper())) {
                    bnVar.run();
                    return;
                } else {
                    handler.post(bnVar);
                    return;
                }
            }
            bnVar.run();
        }
    }

    public static final void d(eml emlVar) {
        if (da.Y(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(String.valueOf(emlVar.a.getClass().getName())), emlVar);
        }
    }

    public static final boolean e(ema emaVar, Class cls, Class cls2) {
        Set set = (Set) emaVar.c.get(cls.getName());
        if (set == null) {
            return true;
        }
        if ((d.F(cls2.getSuperclass(), eml.class) || !aqjn.aH(set, cls2.getSuperclass())) && !set.contains(cls2)) {
            return true;
        }
        return false;
    }
}
