package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahbn {
    public static final /* synthetic */ int a = 0;
    private static final vl b;

    static {
        new ConcurrentHashMap();
        b();
        vl vlVar = new vl();
        b = vlVar;
        vlVar.put(Byte.class, Byte.TYPE);
        vlVar.put(Short.class, Short.TYPE);
        vlVar.put(Integer.class, Integer.TYPE);
        vlVar.put(Long.class, Long.TYPE);
        vlVar.put(Float.class, Float.TYPE);
        vlVar.put(Double.class, Double.TYPE);
        vlVar.put(Character.class, Character.TYPE);
        vlVar.put(Boolean.class, Boolean.TYPE);
    }

    public static Context a(Context context) {
        boolean isDeviceProtectedStorage;
        Context createDeviceProtectedStorageContext;
        isDeviceProtectedStorage = context.isDeviceProtectedStorage();
        if (isDeviceProtectedStorage) {
            createDeviceProtectedStorageContext = context;
        } else {
            createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        }
        if (createDeviceProtectedStorageContext != null) {
            return createDeviceProtectedStorageContext;
        }
        return context;
    }

    public static void b() {
        if (ahaw.a) {
            for (StackTraceElement stackTraceElement : new Throwable().getStackTrace()) {
                if (stackTraceElement.getMethodName().equals("<clinit>") && (stackTraceElement.getClassName().endsWith("AppBase") || stackTraceElement.getClassName().endsWith("LatinApp") || stackTraceElement.getClassName().endsWith("Application"))) {
                    throw new alia("This class shall not be used before Application.onCreate() as it has a static filed of ConcurrentHashMap, please move it to later in the initialization sequence");
                }
            }
        }
    }
}
