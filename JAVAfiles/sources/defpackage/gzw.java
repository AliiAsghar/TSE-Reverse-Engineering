package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzw {
    private static final String a = gsy.b("ProcessUtils");

    public static final boolean a(Context context, gsb gsbVar) {
        String str;
        Object obj;
        context.getClass();
        gsbVar.getClass();
        if (Build.VERSION.SDK_INT < 28) {
            str = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, gtm.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, null);
                invoke.getClass();
                if (invoke instanceof String) {
                    str = (String) invoke;
                }
            } catch (Throwable th) {
                gsy.a().d(a, "Unable to check ActivityThread for processName", th);
            }
            int myPid = Process.myPid();
            Object systemService = context.getSystemService("activity");
            systemService.getClass();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<T> it = runningAppProcesses.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((ActivityManager.RunningAppProcessInfo) obj).pid == myPid) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
                if (runningAppProcessInfo != null) {
                    str = runningAppProcessInfo.processName;
                }
            }
        } else {
            str = Application.getProcessName();
            str.getClass();
        }
        String str2 = gsbVar.g;
        if (str2 != null && str2.length() != 0) {
            return d.F(str, gsbVar.g);
        }
        return d.F(str, context.getApplicationInfo().processName);
    }
}
