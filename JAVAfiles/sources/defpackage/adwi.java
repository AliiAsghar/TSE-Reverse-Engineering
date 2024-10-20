package defpackage;

import android.app.role.RoleManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.provider.Telephony;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adwi {
    private static final advp b = new advp("ApkUtil");
    private static final Optional c = Optional.empty();
    private static final Optional d = Optional.empty();
    private static final Map e = new HashMap();
    public static final String[] a = {"android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET", "android.permission.WAKE_LOCK"};

    public static int a(Context context) {
        if (aczf.N()) {
            return 0;
        }
        if (!aczx.u()) {
            d.isPresent();
            if (!m(context) || aczf.y()) {
                return 0;
            }
            if (e(context) && aczf.H()) {
                advr.k("getOperationMode(): SystemBinding enabled, run in Bugle", new Object[0]);
                return 0;
            }
            return 2;
        }
        advr.k("getOperationMode(): Forced to run in Bugle", new Object[0]);
        return 0;
    }

    public static ApplicationInfo b(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo("com.google.android.ims", 128);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static void c(Context context, Intent intent) {
        if (k(context)) {
            intent.setPackage("com.google.android.ims");
        } else {
            intent.setPackage("com.google.android.apps.messaging");
        }
    }

    public static boolean d(Context context) {
        if (!h(context)) {
            return false;
        }
        if (e(context) && (aczf.H() || aczf.N())) {
            return true;
        }
        return agkx.V(context.getApplicationContext());
    }

    public static boolean e(Context context) {
        if (yhx.d && h(context)) {
            return true;
        }
        return false;
    }

    public static boolean f(Context context) {
        if (!i(context)) {
            return false;
        }
        return yhx.f(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean g(android.content.Context r8, java.lang.String r9, int r10) {
        /*
            java.util.Map r0 = defpackage.adwi.e
            boolean r1 = r0.containsKey(r9)
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1f
            java.lang.Object r0 = r0.get(r9)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 != r10) goto L19
            r0 = r3
            goto L1a
        L19:
            r0 = r4
        L1a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L20
        L1f:
            r0 = r2
        L20:
            if (r0 != 0) goto Ldb
            android.content.pm.ApplicationInfo r0 = b(r8)
            if (r0 == 0) goto L67
            boolean r1 = defpackage.agkx.U(r8)
            if (r1 != 0) goto L36
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r0 = "Cannot use CS.apk as it's battery optimized"
            defpackage.advr.k(r0, r8)
            goto L67
        L36:
            boolean r8 = e(r8)
            if (r8 == 0) goto L4a
            boolean r8 = defpackage.aczf.H()
            if (r8 == 0) goto L4a
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r0 = "Do not use CS.apk as SystemBinding is enabled."
            defpackage.advr.k(r0, r8)
            goto L67
        L4a:
            int r8 = r0.flags
            boolean r8 = j(r8)
            if (r8 == 0) goto L67
            boolean r8 = r0.enabled
            if (r8 == 0) goto L67
            android.os.Bundle r8 = r0.metaData
            if (r8 != 0) goto L62
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r0 = "Cannot get service version because metadata not found."
            defpackage.advr.g(r0, r8)
            goto L6e
        L62:
            java.lang.String r2 = r8.getString(r9)
            goto L6e
        L67:
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r0 = "Cannot get service version because CS.apk was not found, not pre-loaded or disabled."
            defpackage.advr.c(r0, r8)
        L6e:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            if (r2 != 0) goto L76
            goto L9b
        L76:
            java.lang.String r0 = ","
            java.lang.String[] r0 = r2.split(r0)
            int r1 = r0.length
            r2 = r4
        L7e:
            if (r2 >= r1) goto L9b
            r5 = r0[r2]
            int r6 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.NumberFormatException -> L8e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.NumberFormatException -> L8e
            r8.add(r6)     // Catch: java.lang.NumberFormatException -> L8e
            goto L98
        L8e:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r4] = r5
            java.lang.String r5 = "Could not parse %s"
            defpackage.advr.i(r6, r5, r7)
        L98:
            int r2 = r2 + 1
            goto L7e
        L9b:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto La8
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r1 = "No supported version found"
            defpackage.advr.c(r1, r0)
        La8:
            java.util.Iterator r0 = r8.iterator()
        Lac:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lbf
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r10) goto Lac
            return r3
        Lbf:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r8 = r8.toArray()
            java.lang.String r8 = java.util.Arrays.toString(r8)
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r4] = r9
            r0[r3] = r10
            r9 = 2
            r0[r9] = r8
            java.lang.String r8 = "Service with meta data key: %s is not compatible. Service Version %d is not supported. Supported versions: %s"
            defpackage.advr.c(r8, r0)
            return r4
        Ldb:
            boolean r8 = r0.booleanValue()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adwi.g(android.content.Context, java.lang.String, int):boolean");
    }

    public static boolean h(Context context) {
        boolean isRoleHeld;
        if (yhx.c && "com.google.android.apps.messaging".equals(context.getPackageName())) {
            RoleManager m = aei$$ExternalSyntheticApiModelOutline0.m(context.getSystemService(aei$$ExternalSyntheticApiModelOutline0.m26m()));
            if (m == null) {
                return false;
            }
            isRoleHeld = m.isRoleHeld("android.app.role.SMS");
            if (isRoleHeld) {
                return true;
            }
            return false;
        }
        return "com.google.android.apps.messaging".equals(Telephony.Sms.getDefaultSmsPackage(context));
    }

    public static boolean i(Context context) {
        c.isPresent();
        return "com.google.android.apps.messaging".equals(context.getPackageName());
    }

    public static boolean j(int i) {
        if ((i & 129) != 0) {
            return true;
        }
        return false;
    }

    public static boolean k(Context context) {
        if (aczf.N()) {
            advr.d(b, "Binding to JibeService in Bugle, since cs.apk is marked as deprecated.", new Object[0]);
            return false;
        }
        if (aczx.u()) {
            advr.d(b, "Not using CS JibeService because RcsEngineLifecycleManager controls RCS engine.", new Object[0]);
            return false;
        }
        if (!m(context)) {
            advr.d(b, "Not using CS JibeService because it is not compatible with AM.", new Object[0]);
            return false;
        }
        if (i(context) && !((Boolean) aduv.g.d()).booleanValue()) {
            advr.d(b, "Not using CS JibeService because the CS migration has not completed.", new Object[0]);
            return false;
        }
        if (e(context) && aczf.H()) {
            advr.d(b, "Not using CS JibeService because SystemBinding and SingleRegistration are enabled.", new Object[0]);
            return false;
        }
        return true;
    }

    public static boolean l(Context context) {
        try {
            return j(context.getPackageManager().getApplicationInfo("com.google.android.ims", 128).flags);
        } catch (PackageManager.NameNotFoundException unused) {
            advr.q("%s not found returning false.", "com.google.android.ims");
            return false;
        }
    }

    private static boolean m(Context context) {
        if (g(context, "JibeServiceApiVersions", 1) && g(context, "MessagingServiceVersions", 2)) {
            return true;
        }
        return false;
    }
}
