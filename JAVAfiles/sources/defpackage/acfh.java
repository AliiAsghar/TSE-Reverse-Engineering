package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acfh {
    public static String b = "0";
    private static final String c = "acfh";
    private static DynamiteModule e;
    private static final abqb d = abqb.d;
    public static final Object a = new Object();

    private acfh() {
    }

    public static DynamiteModule a() {
        DynamiteModule dynamiteModule;
        synchronized (a) {
            dynamiteModule = e;
        }
        return dynamiteModule;
    }

    @Deprecated
    public static void b(Context context) {
        synchronized (a) {
            if (c()) {
                return;
            }
            d.aC(context, "Context must not be null");
            ClassLoader classLoader = acfh.class.getClassLoader();
            abhg.m(classLoader);
            try {
                classLoader.loadClass("org.chromium.net.CronetEngine");
                abqp.c(context, 11925000);
                try {
                    DynamiteModule c2 = DynamiteModule.c(context, DynamiteModule.a, "com.google.android.gms.cronet_dynamite");
                    try {
                        Class<?> loadClass = c2.c.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                        if (loadClass.getClassLoader() != acfh.class.getClassLoader()) {
                            Method method = loadClass.getMethod("getApiLevel", null);
                            Method method2 = loadClass.getMethod("getCronetVersion", null);
                            Integer num = (Integer) d(method, new Object[0]);
                            abhg.m(num);
                            int intValue = num.intValue();
                            String str = (String) d(method2, new Object[0]);
                            abhg.m(str);
                            b = str;
                            if (intValue < 3) {
                                Intent i = d.i(context, 2, "cr");
                                if (i == null) {
                                    Log.e(c, "Unable to fetch error resolution intent");
                                    throw new abqn(2);
                                }
                                throw new abqo(2, "Google Play Services update is required. The API Level of the client is 3. The API Level of the implementation is " + intValue + ". The Cronet implementation version is " + b, i);
                            }
                            e = c2;
                            return;
                        }
                        Log.e(c, "ImplVersion class is missing from Cronet module.");
                        throw new abqn(8);
                    } catch (Exception e2) {
                        Log.e(c, "Unable to read Cronet version from the Cronet module ", e2);
                        throw ((abqn) new abqn(8).initCause(e2));
                    }
                } catch (abya e3) {
                    Log.e(c, "Unable to load Cronet module", e3);
                    throw ((abqn) new abqn(8).initCause(e3));
                }
            } catch (ClassNotFoundException e4) {
                Log.e(c, "Cronet API is not available. Have you included all required dependencies?");
                throw ((abqn) new abqn(10).initCause(e4));
            }
        }
    }

    public static boolean c() {
        if (a() != null) {
            return true;
        }
        return false;
    }

    private static Object d(Method method, Object... objArr) {
        return method.invoke(null, objArr);
    }
}
