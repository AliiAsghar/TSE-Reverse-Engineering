package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.android.vcard.VCardConfig;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.IDynamiteLoader;
import com.google.android.gms.dynamite.IDynamiteLoaderV2;
import dalvik.system.DelegateLastClassLoader;
import defpackage.a;
import defpackage.abhg;
import defpackage.abhn;
import defpackage.abqb;
import defpackage.abvk;
import defpackage.abxu;
import defpackage.abxv;
import defpackage.abxw;
import defpackage.abxx;
import defpackage.abxy;
import defpackage.abxz;
import defpackage.abya;
import defpackage.abyb;
import defpackage.abyc;
import defpackage.abyd;
import defpackage.adjw;
import defpackage.d;
import defpackage.hht;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DynamiteModule {
    private static Boolean d = null;
    private static IDynamiteLoader e = null;
    private static IDynamiteLoaderV2 f = null;
    private static String g = null;
    private static boolean h = false;
    private static int i = -1;
    private static Boolean j;
    public final Context c;
    private static final ThreadLocal k = new ThreadLocal();
    private static final ThreadLocal l = new abxw();
    private static final abyb m = new abxx();
    public static final abyd a = new abxy(1);
    public static final abyd b = new abxy(0);

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    private DynamiteModule(Context context) {
        this.c = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass(a.bW(str, "com.google.android.gms.dynamite.descriptors.", ".ModuleDescriptor"));
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!d.B(declaredField.get(null), str)) {
                Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", a.bW(str, "Local module descriptor class for ", " not found."));
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, android.database.Cursor] */
    public static int b(Context context, String str, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException e2;
        ?? r0;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = d;
                Cursor cursor = null;
                int i2 = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e3) {
                        Log.w("DynamiteModule", hht.c(e3, "Failed to load module via V2: "));
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                h(classLoader);
                            } catch (abya unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!j(context)) {
                                return 0;
                            }
                            if (!h && !Boolean.TRUE.equals(null)) {
                                try {
                                    int e4 = e(context, str, z, true);
                                    String str2 = g;
                                    if (str2 != null && !str2.isEmpty()) {
                                        ClassLoader a2 = abxu.a();
                                        if (a2 == null) {
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                String str3 = g;
                                                abhg.m(str3);
                                                a2 = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                            } else {
                                                String str4 = g;
                                                abhg.m(str4);
                                                a2 = new abxv(str4, ClassLoader.getSystemClassLoader());
                                            }
                                        }
                                        h(a2);
                                        declaredField.set(null, a2);
                                        d = Boolean.TRUE;
                                        return e4;
                                    }
                                    return e4;
                                } catch (abya unused2) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                }
                            } else {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                bool = Boolean.FALSE;
                            }
                        }
                        d = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return e(context, str, z, false);
                    } catch (abya e5) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e5.getMessage());
                        return 0;
                    }
                }
                IDynamiteLoader g2 = g(context);
                if (g2 != null) {
                    try {
                        try {
                            int iDynamiteLoaderVersion = g2.getIDynamiteLoaderVersion();
                            if (iDynamiteLoaderVersion >= 3) {
                                adjw adjwVar = (adjw) k.get();
                                if (adjwVar != null && (r0 = adjwVar.a) != 0) {
                                    i2 = r0.getInt(0);
                                } else {
                                    Cursor cursor2 = (Cursor) ObjectWrapper.unwrap(g2.queryForDynamiteModuleNoCrashUtils(ObjectWrapper.wrap(context), str, z, ((Long) l.get()).longValue()));
                                    if (cursor2 != null) {
                                        try {
                                            if (cursor2.moveToFirst()) {
                                                int i3 = cursor2.getInt(0);
                                                if (i3 <= 0 || !i(cursor2)) {
                                                    cursor = cursor2;
                                                }
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                i2 = i3;
                                            }
                                        } catch (RemoteException e6) {
                                            e2 = e6;
                                            cursor = cursor2;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e2.getMessage());
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            return i2;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor = cursor2;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                }
                            } else if (iDynamiteLoaderVersion == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i2 = g2.getModuleVersion2NoCrashUtils(ObjectWrapper.wrap(context), str, z);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i2 = g2.getModuleVersion2(ObjectWrapper.wrap(context), str, z);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (RemoteException e7) {
                        e2 = e7;
                    }
                }
                return i2;
            }
        } catch (Throwable th4) {
            abhn.d(context);
            throw th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [adjw] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r20v0, types: [abyd] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, adjw] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public static DynamiteModule c(Context context, abyd abydVar, String str) {
        int i2;
        DynamiteModule f2;
        Boolean bool;
        IObjectWrapper createModuleContext;
        DynamiteModule dynamiteModule;
        IDynamiteLoaderV2 iDynamiteLoaderV2;
        boolean z;
        Boolean valueOf;
        IObjectWrapper loadModule2;
        ?? r1 = context;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            ThreadLocal threadLocal = k;
            ?? r9 = (adjw) threadLocal.get();
            adjw adjwVar = new adjw();
            threadLocal.set(adjwVar);
            ThreadLocal threadLocal2 = l;
            Long l2 = (Long) threadLocal2.get();
            long longValue = l2.longValue();
            try {
                threadLocal2.set(Long.valueOf(SystemClock.uptimeMillis()));
                abyc a2 = abydVar.a(r1, str, m);
                int i3 = a2.a;
                try {
                    r9 = a2.b;
                    try {
                        Log.i("DynamiteModule", "Considering local module " + str + ":" + i3 + " and remote module " + str + ":" + r9);
                        i2 = a2.c;
                    } catch (Throwable th) {
                        th = th;
                        r9 = r9;
                        r1 = adjwVar;
                    }
                    try {
                        if (i2 != 0 && (i2 != -1 || a2.a != 0)) {
                            r9 = 1;
                            if (i2 != 1 || a2.b != 0) {
                                if (i2 == -1) {
                                    f2 = f(applicationContext, str);
                                } else if (i2 == 1) {
                                    try {
                                        int i4 = a2.b;
                                        try {
                                            synchronized (DynamiteModule.class) {
                                                if (j(context)) {
                                                    bool = d;
                                                } else {
                                                    throw new abya("Remote loading disabled");
                                                }
                                            }
                                            if (bool != null) {
                                                if (bool.booleanValue()) {
                                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i4);
                                                    synchronized (DynamiteModule.class) {
                                                        iDynamiteLoaderV2 = f;
                                                    }
                                                    if (iDynamiteLoaderV2 != null) {
                                                        adjw adjwVar2 = (adjw) threadLocal.get();
                                                        if (adjwVar2 != null && adjwVar2.a != null) {
                                                            Context applicationContext2 = context.getApplicationContext();
                                                            Object obj = adjwVar2.a;
                                                            ObjectWrapper.wrap(null);
                                                            synchronized (DynamiteModule.class) {
                                                                if (i >= 2) {
                                                                    z = true;
                                                                } else {
                                                                    z = false;
                                                                }
                                                                valueOf = Boolean.valueOf(z);
                                                            }
                                                            valueOf.getClass();
                                                            if (z) {
                                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                                loadModule2 = iDynamiteLoaderV2.loadModule2NoCrashUtils(ObjectWrapper.wrap(applicationContext2), str, i4, ObjectWrapper.wrap(obj));
                                                            } else {
                                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                                loadModule2 = iDynamiteLoaderV2.loadModule2(ObjectWrapper.wrap(applicationContext2), str, i4, ObjectWrapper.wrap(obj));
                                                            }
                                                            Context context2 = (Context) ObjectWrapper.unwrap(loadModule2);
                                                            if (context2 != null) {
                                                                dynamiteModule = new DynamiteModule(context2);
                                                            } else {
                                                                throw new abya("Failed to get module context");
                                                            }
                                                        } else {
                                                            throw new abya("No result cursor");
                                                        }
                                                    } else {
                                                        throw new abya("DynamiteLoaderV2 was not cached.");
                                                    }
                                                } else {
                                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i4);
                                                    IDynamiteLoader g2 = g(context);
                                                    if (g2 != null) {
                                                        int iDynamiteLoaderVersion = g2.getIDynamiteLoaderVersion();
                                                        if (iDynamiteLoaderVersion >= 3) {
                                                            adjw adjwVar3 = (adjw) threadLocal.get();
                                                            if (adjwVar3 != null) {
                                                                createModuleContext = g2.createModuleContext3NoCrashUtils(ObjectWrapper.wrap(context), str, i4, ObjectWrapper.wrap(adjwVar3.a));
                                                            } else {
                                                                throw new abya("No cached result cursor holder");
                                                            }
                                                        } else if (iDynamiteLoaderVersion == 2) {
                                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                            createModuleContext = g2.createModuleContextNoCrashUtils(ObjectWrapper.wrap(context), str, i4);
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                            createModuleContext = g2.createModuleContext(ObjectWrapper.wrap(context), str, i4);
                                                        }
                                                        Object unwrap = ObjectWrapper.unwrap(createModuleContext);
                                                        if (unwrap != null) {
                                                            dynamiteModule = new DynamiteModule((Context) unwrap);
                                                        } else {
                                                            throw new abya("Failed to load remote module.");
                                                        }
                                                    } else {
                                                        throw new abya("Failed to create IDynamiteLoader.");
                                                    }
                                                }
                                                f2 = dynamiteModule;
                                            } else {
                                                throw new abya("Failed to determine which loading route to use.");
                                            }
                                        } catch (abya e2) {
                                            throw e2;
                                        } catch (RemoteException e3) {
                                            throw new abya("Failed to load remote module.", e3);
                                        } catch (Throwable th2) {
                                            abhn.d(context);
                                            throw new abya("Failed to load remote module.", th2);
                                        }
                                    } catch (abya e4) {
                                        Log.w("DynamiteModule", "Failed to load remote module: " + e4.getMessage());
                                        int i5 = a2.a;
                                        if (i5 != 0 && abydVar.a(r1, str, new abxz(i5)).c == -1) {
                                            f2 = f(applicationContext, str);
                                        } else {
                                            throw new abya("Remote load failed. No local fallback found.", e4);
                                        }
                                    }
                                } else {
                                    throw new abya(a.bV(0, "VersionPolicy returned invalid code:"));
                                }
                                if (longValue == 0) {
                                    l.remove();
                                } else {
                                    l.set(l2);
                                }
                                ?? r12 = adjwVar.a;
                                if (r12 != 0) {
                                    r12.close();
                                }
                                k.set(r9);
                                return f2;
                            }
                        }
                        throw new abya("No acceptable module " + str + " found. Local version is " + a2.a + " and remote version is " + a2.b + ".");
                    } catch (Throwable th3) {
                        th = th3;
                        if (longValue == 0) {
                            l.remove();
                        } else {
                            l.set(l2);
                        }
                        ?? r13 = r1.a;
                        if (r13 != 0) {
                            r13.close();
                        }
                        k.set(r9);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    r1 = adjwVar;
                    r9 = r9;
                }
            } catch (Throwable th5) {
                th = th5;
                r1 = adjwVar;
            }
        } else {
            throw new abya("null application Context");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x011b, code lost:
    
        if (i(r4) != false) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int e(android.content.Context r12, java.lang.String r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule f(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(str));
        return new DynamiteModule(context);
    }

    private static IDynamiteLoader g(Context context) {
        synchronized (DynamiteModule.class) {
            IDynamiteLoader iDynamiteLoader = e;
            if (iDynamiteLoader != null) {
                return iDynamiteLoader;
            }
            try {
                IDynamiteLoader asInterface = IDynamiteLoader.Stub.asInterface((IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance());
                if (asInterface != null) {
                    e = asInterface;
                    return asInterface;
                }
            } catch (Exception e2) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }

    private static void h(ClassLoader classLoader) {
        try {
            f = IDynamiteLoaderV2.Stub.asInterface((IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null));
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new abya("Failed to instantiate dynamite loader", e2);
        }
    }

    private static boolean i(Cursor cursor) {
        adjw adjwVar = (adjw) k.get();
        if (adjwVar != null && adjwVar.a == null) {
            adjwVar.a = cursor;
            return true;
        }
        return false;
    }

    private static boolean j(Context context) {
        int i2;
        if (Boolean.TRUE.equals(null) || Boolean.TRUE.equals(j)) {
            return true;
        }
        boolean z = false;
        if (j == null) {
            PackageManager packageManager = context.getPackageManager();
            if (true != abvk.c()) {
                i2 = 0;
            } else {
                i2 = VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider("com.google.android.gms.chimera", i2);
            if (abqb.d.h(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            j = valueOf;
            valueOf.getClass();
            if (z && resolveContentProvider.applicationInfo != null && (resolveContentProvider.applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                h = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    public final IBinder d() {
        try {
            return (IBinder) this.c.getClassLoader().loadClass("com.google.android.gms.common.GoogleCertificatesImpl").newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new abya("Failed to instantiate module class: com.google.android.gms.common.GoogleCertificatesImpl", e2);
        }
    }
}
