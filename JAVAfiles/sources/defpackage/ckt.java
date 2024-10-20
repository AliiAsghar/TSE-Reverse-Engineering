package defpackage;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckt {
    private static Method a;
    private static Method b;
    private static boolean c;

    public static final void a(Canvas canvas, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (!z) {
                canvas.disableZ();
                return;
            } else {
                canvas.enableZ();
                return;
            }
        }
        if (!c) {
            try {
                if (Build.VERSION.SDK_INT == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    a = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    b = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    a = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    b = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method = a;
                if (method != null) {
                    method.setAccessible(true);
                }
                Method method2 = b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            c = true;
        }
        try {
            if (z) {
                Method method3 = a;
                if (method3 != null) {
                    method3.invoke(canvas, null);
                    return;
                }
                return;
            }
            Method method4 = b;
            if (method4 != null) {
                method4.invoke(canvas, null);
            }
        } catch (IllegalAccessException | InvocationTargetException unused2) {
        }
    }
}
