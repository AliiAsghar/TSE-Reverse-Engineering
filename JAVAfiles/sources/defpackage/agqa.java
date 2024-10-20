package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.UserManager;
import android.util.Log;
import com.google.android.libraries.directboot.DirectBootHelperService;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agqa {
    public static final /* synthetic */ int a = 0;
    private static UserManager b = null;
    private static volatile boolean c = false;
    private static boolean d = false;

    private agqa() {
    }

    public static Context a(Context context) {
        boolean isDeviceProtectedStorage;
        Context createDeviceProtectedStorageContext;
        isDeviceProtectedStorage = context.isDeviceProtectedStorage();
        if (isDeviceProtectedStorage) {
            return context;
        }
        createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        return createDeviceProtectedStorageContext;
    }

    public static ListenableFuture b(Context context, Runnable runnable) {
        if (e(context)) {
            runnable.run();
            return aneh.a;
        }
        return d.m(new mfg(context, runnable, 6));
    }

    public static synchronized void c() {
        synchronized (agqa.class) {
            d = true;
        }
    }

    public static boolean d(Context context) {
        if (!f(context)) {
            return true;
        }
        return false;
    }

    public static boolean e(Context context) {
        if (f(context)) {
            return true;
        }
        return false;
    }

    private static boolean f(Context context) {
        boolean g;
        boolean z;
        if (c) {
            return true;
        }
        synchronized (agqa.class) {
            if (c) {
                return true;
            }
            if (d) {
                List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setClassName(context, DirectBootHelperService.class.getName()), 268435968);
                g = false;
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    Iterator<ResolveInfo> it = queryIntentServices.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z = it.next().serviceInfo.directBootAware;
                            if (z) {
                                Log.w("DirectBootUtils", "Falling back to user manager.");
                                d = false;
                                g = g(context);
                                break;
                            }
                        } else {
                            g = true;
                            break;
                        }
                    }
                }
            } else {
                g = g(context);
            }
            if (g) {
                c = true;
            }
            return g;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        if (r2.isUserRunning(android.os.Process.myUserHandle()) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean g(android.content.Context r6) {
        /*
            r0 = 1
            r1 = r0
        L2:
            r2 = 2
            r3 = 0
            r4 = 0
            if (r1 > r2) goto L38
            android.os.UserManager r2 = defpackage.agqa.b
            if (r2 != 0) goto L15
            java.lang.Class<android.os.UserManager> r2 = android.os.UserManager.class
            java.lang.Object r2 = r6.getSystemService(r2)
            android.os.UserManager r2 = (android.os.UserManager) r2
            defpackage.agqa.b = r2
        L15:
            android.os.UserManager r2 = defpackage.agqa.b
            if (r2 != 0) goto L1a
            return r0
        L1a:
            boolean r5 = defpackage.d$$ExternalSyntheticApiModelOutline0.m(r2)     // Catch: java.lang.NullPointerException -> L2b
            if (r5 != 0) goto L39
            android.os.UserHandle r5 = android.os.Process.myUserHandle()     // Catch: java.lang.NullPointerException -> L2b
            boolean r6 = r2.isUserRunning(r5)     // Catch: java.lang.NullPointerException -> L2b
            if (r6 != 0) goto L38
            goto L39
        L2b:
            r2 = move-exception
            java.lang.String r4 = "DirectBootUtils"
            java.lang.String r5 = "Failed to check if user is unlocked."
            android.util.Log.w(r4, r5, r2)
            defpackage.agqa.b = r3
            int r1 = r1 + 1
            goto L2
        L38:
            r0 = r4
        L39:
            if (r0 == 0) goto L3d
            defpackage.agqa.b = r3
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agqa.g(android.content.Context):boolean");
    }
}
