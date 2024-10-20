package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseBooleanArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acqo {
    public static boolean a = false;
    public static final SparseBooleanArray b = new SparseBooleanArray();
    public static akip f = null;
    public static final acqn c = new acqn();
    public static final BroadcastReceiver d = new acql();
    public static acoe e = null;

    public static void a(Context context) {
        advr.k("Initializing Carrier Services Logging.", new Object[0]);
        advr.y(context);
        a = true;
    }

    public static synchronized void b(Context context) {
        synchronized (acqo.class) {
            if (f == null) {
                advr.k("Initializing Carrier Services Library.", new Object[0]);
                ahtp.f(context);
                aczc.m();
                acpq.I(context);
                f = new akip();
                Context applicationContext = context.getApplicationContext();
                SparseBooleanArray sparseBooleanArray = b;
                if (!sparseBooleanArray.get(applicationContext.hashCode(), false)) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("com.google.gservices.intent.action.GSERVICES_CHANGED");
                    acqn acqnVar = c;
                    egl.h(applicationContext, acqnVar, intentFilter);
                    acbq acbqVar = new acbq(applicationContext, 9);
                    synchronized (acqnVar.a) {
                        acqnVar.a.add(acbqVar);
                    }
                    IntentFilter intentFilter2 = new IntentFilter();
                    intentFilter2.addAction("android.intent.action.PACKAGE_REMOVED");
                    intentFilter2.addAction("android.intent.action.PACKAGE_CHANGED");
                    intentFilter2.addDataScheme("package");
                    applicationContext.registerReceiver(d, intentFilter2);
                    sparseBooleanArray.put(applicationContext.hashCode(), true);
                }
                e = (acoe) acrj.b(context.getApplicationContext()).aT.b();
            }
        }
    }
}
