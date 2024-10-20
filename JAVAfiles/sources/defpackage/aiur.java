package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiur {
    public static final Method a;
    public static final Method b;

    static {
        Method method;
        Class<?> cls;
        Method method2 = null;
        try {
            cls = Class.forName("android.os.SystemProperties");
            method = cls.getMethod("get", String.class, String.class);
        } catch (Exception e) {
            e = e;
            method = null;
        } catch (Throwable th) {
            th = th;
            method = null;
            a = method;
            b = null;
            throw th;
        }
        try {
            try {
                cls.getMethod("getInt", String.class, Integer.TYPE);
                cls.getMethod("getLong", String.class, Long.TYPE);
                method2 = cls.getMethod("getBoolean", String.class, Boolean.TYPE);
            } catch (Throwable th2) {
                th = th2;
                a = method;
                b = null;
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            a = method;
            b = method2;
        }
        a = method;
        b = method2;
    }
}
