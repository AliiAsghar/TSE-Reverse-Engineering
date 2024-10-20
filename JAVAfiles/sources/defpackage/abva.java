package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abva {
    private static final Object b = new Object();
    private static volatile abva c;
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    private abva() {
    }

    public static abva a() {
        if (c == null) {
            synchronized (b) {
                if (c == null) {
                    c = new abva();
                }
            }
        }
        abva abvaVar = c;
        abhg.m(abvaVar);
        return abvaVar;
    }

    private static void e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private static boolean f(ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof abuj)) {
            return true;
        }
        return false;
    }

    public final void b(Context context, ServiceConnection serviceConnection) {
        if (f(serviceConnection) && this.a.containsKey(serviceConnection)) {
            try {
                e(context, (ServiceConnection) this.a.get(serviceConnection));
                return;
            } finally {
                this.a.remove(serviceConnection);
            }
        }
        e(context, serviceConnection);
    }

    public final boolean c(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return d(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((abvn.b(context).d(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (f(serviceConnection)) {
            ServiceConnection serviceConnection2 = (ServiceConnection) this.a.putIfAbsent(serviceConnection, serviceConnection);
            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            try {
                boolean bindService = context.bindService(intent, serviceConnection, i);
                if (!bindService) {
                    return false;
                }
                return bindService;
            } finally {
                this.a.remove(serviceConnection, serviceConnection);
            }
        }
        return context.bindService(intent, serviceConnection, i);
    }
}
