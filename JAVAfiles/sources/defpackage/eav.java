package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
class eav extends ebb {
    private static Class a = null;
    private static Constructor b = null;
    private static Method c = null;
    private static Method d = null;
    private static boolean e = false;

    private static Object g() {
        h();
        try {
            return b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void h() {
        Method method;
        Class<?> cls;
        Method method2;
        if (e) {
            return;
        }
        e = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        b = constructor;
        a = cls;
        c = method2;
        d = method;
    }

    private static final File i(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    @Override // defpackage.ebb
    public Typeface a(Context context, ebv[] ebvVarArr, int i) {
        if (ebvVarArr.length <= 0) {
            return null;
        }
        ebv m = m(ebvVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(m.a, "r", null);
            if (openFileDescriptor == null) {
                return null;
            }
            try {
                File i2 = i(openFileDescriptor);
                if (i2 != null && i2.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(i2);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    Typeface l = super.l(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return l;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // defpackage.ebb
    public Typeface b(Context context, efu efuVar, Resources resources, int i) {
        Object obj = efuVar.a;
        Object g = g();
        for (eai eaiVar : (eai[]) obj) {
            File i2 = dyy.i(context);
            if (i2 != null) {
                try {
                    if (dyy.k(i2, resources, eaiVar.f)) {
                        String path = i2.getPath();
                        int i3 = eaiVar.b;
                        boolean z = eaiVar.c;
                        h();
                        try {
                            if (((Boolean) c.invoke(g, path, Integer.valueOf(i3), Boolean.valueOf(z))).booleanValue()) {
                                i2.delete();
                            }
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                } catch (RuntimeException unused) {
                } catch (Throwable th) {
                    i2.delete();
                    throw th;
                }
                i2.delete();
            }
            return null;
        }
        h();
        try {
            Object newInstance = Array.newInstance((Class<?>) a, 1);
            Array.set(newInstance, 0, g);
            return (Typeface) d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
