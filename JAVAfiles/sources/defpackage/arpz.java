package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arpz {
    public static final Method a;

    static {
        int length;
        Method method;
        Method[] methods = Throwable.class.getMethods();
        methods.getClass();
        int i = 0;
        while (true) {
            length = methods.length;
            method = null;
            Class<?> cls = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (d.F(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                parameterTypes.getClass();
                if (parameterTypes.length == 1) {
                    cls = parameterTypes[0];
                }
                if (d.F(cls, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        a = method;
        for (int i2 = 0; i2 < length && !d.F(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
