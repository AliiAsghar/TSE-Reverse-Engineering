package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.ICreator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acey {
    private static final String a = "acey";
    private static Context b;
    private static ICreator c;

    public static ICreator a(Context context) {
        return b(context, null);
    }

    public static ICreator b(Context context, aceo aceoVar) {
        abhg.m(context);
        String str = a;
        Log.d(str, "preferredRenderer: ".concat(String.valueOf(String.valueOf(aceoVar))));
        ICreator iCreator = c;
        if (iCreator == null) {
            int a2 = abqp.a(context, 13400000);
            if (a2 == 0) {
                ICreator e = e(context, aceoVar);
                c = e;
                try {
                    int rendererType = e.getRendererType();
                    String packageName = context.getPackageName();
                    if (rendererType == 2 && !packageName.equals("com.google.android.apps.photos")) {
                        Log.d(str, "early loading native code");
                        try {
                            c.preInit(ObjectWrapper.wrap(d(context, aceoVar)));
                        } catch (RemoteException e2) {
                            throw new acfc(e2);
                        } catch (UnsatisfiedLinkError unused) {
                            Log.w(a, "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                            b = null;
                            c = e(context, aceo.LEGACY);
                        }
                    } else {
                        Log.d(str, "not early loading native code");
                    }
                    try {
                        ICreator iCreator2 = c;
                        Context d = d(context, aceoVar);
                        d.getClass();
                        iCreator2.initV2(ObjectWrapper.wrap(d.getResources()), 19000100);
                        return c;
                    } catch (RemoteException e3) {
                        throw new acfc(e3);
                    }
                } catch (RemoteException e4) {
                    throw new acfc(e4);
                }
            }
            throw new abqn(a2);
        }
        return iCreator;
    }

    private static Context c(Exception exc, Context context) {
        Log.e(a, "Failed to load maps module, use pre-Chimera", exc);
        return abqp.b(context);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:5|6|(6:8|(1:10)|13|14|15|16)|27|13|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r5 != 1) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        r0 = "com.google.android.gms.maps_core_dynamite";
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (r0.equals("com.google.android.gms.maps_dynamite") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        r4 = c(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
    
        android.util.Log.d(defpackage.acey.a, "Attempting to load maps_dynamite again.");
        r4 = com.google.android.gms.dynamite.DynamiteModule.c(r4, com.google.android.gms.dynamite.DynamiteModule.a, "com.google.android.gms.maps_dynamite").c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        r4 = c(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x001e, code lost:
    
        if (r5 != defpackage.aceo.LEGACY) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.content.Context d(android.content.Context r4, defpackage.aceo r5) {
        /*
            java.lang.String r0 = "com.google.android.gms.maps_legacy_dynamite"
            java.lang.String r1 = "com.google.android.gms.maps_core_dynamite"
            java.lang.String r2 = "com.google.android.gms.maps_dynamite"
            android.content.Context r3 = defpackage.acey.b
            if (r3 != 0) goto L4f
            java.lang.String r3 = "com.google.android.gms.maps.internal.UseLegacyRendererAsDefault"
            java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L1c
            if (r5 == 0) goto L1a
            int r5 = r5.ordinal()
            if (r5 == 0) goto L22
            r0 = 1
            if (r5 == r0) goto L21
        L1a:
            r0 = r2
            goto L22
        L1c:
            aceo r3 = defpackage.aceo.LEGACY
            if (r5 != r3) goto L21
            goto L22
        L21:
            r0 = r1
        L22:
            abyd r5 = com.google.android.gms.dynamite.DynamiteModule.a     // Catch: java.lang.Exception -> L2b
            com.google.android.gms.dynamite.DynamiteModule r5 = com.google.android.gms.dynamite.DynamiteModule.c(r4, r5, r0)     // Catch: java.lang.Exception -> L2b
            android.content.Context r4 = r5.c     // Catch: java.lang.Exception -> L2b
            goto L4c
        L2b:
            r5 = move-exception
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L48
            java.lang.String r5 = defpackage.acey.a     // Catch: java.lang.Exception -> L42
            java.lang.String r0 = "Attempting to load maps_dynamite again."
            android.util.Log.d(r5, r0)     // Catch: java.lang.Exception -> L42
            abyd r5 = com.google.android.gms.dynamite.DynamiteModule.a     // Catch: java.lang.Exception -> L42
            com.google.android.gms.dynamite.DynamiteModule r5 = com.google.android.gms.dynamite.DynamiteModule.c(r4, r5, r2)     // Catch: java.lang.Exception -> L42
            android.content.Context r4 = r5.c     // Catch: java.lang.Exception -> L42
            goto L4c
        L42:
            r5 = move-exception
            android.content.Context r4 = c(r5, r4)
            goto L4c
        L48:
            android.content.Context r4 = c(r5, r4)
        L4c:
            defpackage.acey.b = r4
            return r4
        L4f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acey.d(android.content.Context, aceo):android.content.Context");
    }

    private static ICreator e(Context context, aceo aceoVar) {
        Log.i(a, "Making Creator dynamically");
        ClassLoader classLoader = d(context, aceoVar).getClassLoader();
        try {
            abhg.m(classLoader);
            return ICreator.Stub.asInterface((IBinder) f(classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl")));
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e);
        }
    }

    private static Object f(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(String.valueOf(cls.getName())), e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(String.valueOf(cls.getName())), e2);
        }
    }
}
