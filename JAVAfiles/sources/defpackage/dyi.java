package defpackage;

import android.app.AppOpsManager;
import android.app.Notification;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dyi {
    public dyi() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Notification.Action action) {
        boolean isAuthenticationRequired;
        isAuthenticationRequired = action.isAuthenticationRequired();
        return isAuthenticationRequired;
    }

    public static int b(Context context, String str, int i, int i2, String str2) {
        int y;
        String opPackageName;
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String permissionToOp = AppOpsManager.permissionToOp(str);
        if (permissionToOp == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (myUid == i2 && Objects.equals(packageName, str2)) {
            if (Build.VERSION.SDK_INT >= 29) {
                AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                y = dxt.t(appOpsManager, permissionToOp, Binder.getCallingUid(), str2);
                if (y == 0) {
                    opPackageName = context.getOpPackageName();
                    y = dxt.t(appOpsManager, permissionToOp, i2, opPackageName);
                }
            } else {
                y = dxt.y(context, permissionToOp, str2);
            }
        } else {
            y = dxt.y(context, permissionToOp, str2);
        }
        if (y == 0) {
            return 0;
        }
        return -2;
    }

    public static int c(Context context, String str) {
        return b(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    public static gdj d() {
        gdj gdjVar = gdj.a;
        gdjVar.getClass();
        return gdjVar;
    }

    public static boolean e(int i) {
        return Log.isLoggable("Paging", i);
    }

    public static void f(int i, String str) {
        if (i != 2) {
            Log.d("Paging", str, null);
        } else {
            Log.v("Paging", str, null);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [asai, java.lang.Object] */
    public static /* synthetic */ gpx g(gpx gpxVar, arqv arqvVar) {
        gpxVar.getClass();
        return new gpx(new gdc(gpxVar.d, arqvVar), (qdq) gpxVar.c, (ghw) gpxVar.b);
    }

    public dyi(byte[] bArr) {
    }
}
