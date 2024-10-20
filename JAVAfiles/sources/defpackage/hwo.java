package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwo {
    private static volatile hwo d;
    public boolean a;
    public final Object b;
    public final Object c;

    public hwo(Handler handler, fbt fbtVar) {
        this.c = handler;
        this.b = fbtVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static hwo a(Context context) {
        if (d == null) {
            synchronized (hwo.class) {
                if (d == null) {
                    d = new hwo(context.getApplicationContext());
                }
            }
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, hyp] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, hyp] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Set, java.lang.Object] */
    public final synchronized void b(hvt hvtVar) {
        boolean z;
        this.b.add(hvtVar);
        if (!this.a && !this.b.isEmpty()) {
            Object obj = this.c;
            boolean z2 = true;
            if (((ConnectivityManager) ((akju) obj).d.a()).getActiveNetwork() != null) {
                z = true;
            } else {
                z = false;
            }
            ((akju) obj).a = z;
            try {
                ((ConnectivityManager) ((akju) obj).d.a()).registerDefaultNetworkCallback((ConnectivityManager.NetworkCallback) ((akju) obj).c);
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e);
                }
                z2 = false;
            }
            this.a = z2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, hyp] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Set, java.lang.Object] */
    public final synchronized void c(hvt hvtVar) {
        this.b.remove(hvtVar);
        if (this.a && this.b.isEmpty()) {
            Object obj = this.c;
            ((ConnectivityManager) ((akju) obj).d.a()).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) ((akju) obj).c);
            this.a = false;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [armf, java.lang.Object] */
    public final void d(Bundle bundle) {
        if (bundle == null) {
            ((mgv) this.b.b()).e(mgv.x);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    public final void e(ajwt ajwtVar, Activity activity) {
        ajwtVar.getClass();
        if (this.a) {
            return;
        }
        this.a = true;
        akrh e = aktp.e("ComposeRowStartupTracker#onReady");
        try {
            ((mgv) this.b.b()).f(mgv.x);
            jbo jboVar = (jbo) ((eoy) this.c).a(jbo.class);
            jboVar.c = true;
            jboVar.a(ajwtVar, activity);
            armd.i(e, null);
        } finally {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final void f() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((anmy) it.next()).a = false;
        }
    }

    public final void g() {
        if (!this.a) {
            aluq listIterator = ((altg) this.b).listIterator();
            while (listIterator.hasNext()) {
                ((dx) this.c).N().c((enl) listIterator.next());
            }
            this.a = true;
        }
    }

    private hwo(Context context) {
        this.b = new HashSet();
        this.c = new akju(new hyo(new hwk(context)), new hwl(this));
    }

    public hwo(Executor executor) {
        executor.getClass();
        this.c = new Object();
        this.b = new ArrayList();
    }

    public hwo(armf armfVar, eoy eoyVar) {
        armfVar.getClass();
        this.b = armfVar;
        this.c = eoyVar;
    }

    public hwo(Activity activity, Set set) {
        this.a = false;
        this.c = (cj) activity;
        this.b = set;
    }

    public hwo() {
        this.b = new ArrayList();
        this.c = anth.a;
        this.a = false;
    }
}
