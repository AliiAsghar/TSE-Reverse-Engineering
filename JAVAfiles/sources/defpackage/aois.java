package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aois {
    private static aois d;
    private String e = null;
    public Boolean a = null;
    public Boolean b = null;
    public final Queue c = new ArrayDeque();

    private aois() {
    }

    public static synchronized aois a() {
        aois aoisVar;
        synchronized (aois.class) {
            if (d == null) {
                d = new aois();
            }
            aoisVar = d;
        }
        return aoisVar;
    }

    public final synchronized String b(Context context, Intent intent) {
        String str = this.e;
        if (str != null) {
            return str;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null && resolveService.serviceInfo != null) {
            ServiceInfo serviceInfo = resolveService.serviceInfo;
            if (context.getPackageName().equals(serviceInfo.packageName) && serviceInfo.name != null) {
                if (serviceInfo.name.startsWith(".")) {
                    this.e = String.valueOf(context.getPackageName()).concat(String.valueOf(serviceInfo.name));
                } else {
                    this.e = serviceInfo.name;
                }
                return this.e;
            }
            Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
            return null;
        }
        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    public final boolean c(Context context) {
        boolean z;
        if (this.a == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.a = Boolean.valueOf(z);
        }
        if (!this.a.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.a.booleanValue();
    }
}
