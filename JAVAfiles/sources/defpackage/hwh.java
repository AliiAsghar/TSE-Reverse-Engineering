package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwh implements Handler.Callback {
    private static final hwg b = new hwf(0);
    public final tm a = new tm();
    private volatile hls c;
    private final hwg d;
    private final hvz e;
    private final ico f;

    public hwh(hwg hwgVar) {
        hvz hvwVar;
        hwgVar = hwgVar == null ? b : hwgVar;
        this.d = hwgVar;
        this.f = new ico(hwgVar);
        if (hue.b && hue.a) {
            hvwVar = new hvy();
        } else {
            hvwVar = new hvw();
        }
        this.e = hvwVar;
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void e(Collection collection, Map map) {
        View view;
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                cg cgVar = (cg) it.next();
                if (cgVar != null && (view = cgVar.Q) != null) {
                    map.put(view, cgVar);
                    e(cgVar.G().l(), map);
                }
            }
        }
    }

    public final hls b(Context context) {
        if (context != null) {
            if (hyv.l() && !(context instanceof Application)) {
                if (context instanceof cj) {
                    return d((cj) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return b(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.c == null) {
                synchronized (this) {
                    if (this.c == null) {
                        this.c = this.d.a(hkz.b(context.getApplicationContext()), new hvs(), new hwd(), context.getApplicationContext());
                    }
                }
            }
            return this.c;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public final hls c(cg cgVar) {
        d.aB(cgVar.x(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (hyv.k()) {
            return b(cgVar.x().getApplicationContext());
        }
        if (cgVar.fe() != null) {
            this.e.a(cgVar.fe());
        }
        cgVar.G();
        Context x = cgVar.x();
        return this.f.j(x, hkz.b(x.getApplicationContext()), cgVar.N(), cgVar.aB());
    }

    public final hls d(cj cjVar) {
        if (!hyv.k()) {
            if (!cjVar.isDestroyed()) {
                this.e.a(cjVar);
                Activity a = a(cjVar);
                boolean z = true;
                if (a != null && a.isFinishing()) {
                    z = false;
                }
                hkz b2 = hkz.b(cjVar.getApplicationContext());
                ico icoVar = this.f;
                enh N = cjVar.N();
                cjVar.a();
                return icoVar.j(cjVar, b2, N, z);
            }
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        return b(cjVar.getApplicationContext());
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public final boolean handleMessage(Message message) {
        return false;
    }
}
