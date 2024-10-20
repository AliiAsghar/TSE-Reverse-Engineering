package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.view.WindowManager;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahof {
    public static volatile long a;
    private static volatile float b;

    public static algw a(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return alfd.a;
        }
        float f = b;
        if (f == brg.a) {
            synchronized (ahof.class) {
                f = b;
                if (f == brg.a) {
                    float refreshRate = ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getRefreshRate();
                    b = refreshRate;
                    f = refreshRate;
                }
            }
        }
        return algw.i(Float.valueOf(f));
    }

    public static final void b(Level level, Executor executor, Throwable th, String str, Object... objArr) {
        executor.execute(akto.j(new uju(level, th, str, objArr, 10)));
    }

    public static final void c(Level level, Executor executor, String str, Object... objArr) {
        b(level, executor, null, str, objArr);
    }

    public static Object d(ahsr ahsrVar) {
        try {
            return ahsrVar.a();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return ahsrVar.a();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
