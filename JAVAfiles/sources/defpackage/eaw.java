package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eaw extends eav {
    protected final Class a;
    protected final Constructor b;
    protected final Method c;
    protected final Method d;
    protected final Method e;
    protected final Method f;
    protected final Method g;

    public eaw() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            Class<?> cls3 = Integer.TYPE;
            method2 = cls2.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, Boolean.TYPE, cls3, cls3, cls3, FontVariationAxis[].class);
            Class<?> cls4 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls4, FontVariationAxis[].class, cls4, cls4);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = e(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(String.valueOf(e.getClass().getName())), e);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.a = cls;
        this.b = constructor;
        this.c = method2;
        this.d = method3;
        this.e = method4;
        this.f = method5;
        this.g = method;
    }

    private final Object g() {
        try {
            return this.b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private final void h(Object obj) {
        try {
            this.f.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private final boolean i(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.c.invoke(obj, context.getAssets(), str, 0, false, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private final boolean j(Object obj) {
        try {
            return ((Boolean) this.e.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private final boolean k() {
        if (this.c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (this.c != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.eav, defpackage.ebb
    public final Typeface a(Context context, ebv[] ebvVarArr, int i) {
        Typeface c;
        Typeface.Builder weight;
        Typeface.Builder italic;
        Typeface build;
        if (ebvVarArr.length <= 0) {
            return null;
        }
        if (!k()) {
            ebv m = m(ebvVarArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(m.a, "r", null);
                if (openFileDescriptor == null) {
                    return null;
                }
                try {
                    weight = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(m.c);
                    italic = weight.setItalic(m.d);
                    build = italic.build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (ebv ebvVar : ebvVarArr) {
            if (ebvVar.e == 0) {
                Uri uri = ebvVar.a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, dyy.l(context, uri));
                }
            }
        }
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(hashMap);
        Object g = g();
        if (g == null) {
            return null;
        }
        int length = ebvVarArr.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            ebv ebvVar2 = ebvVarArr[i2];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(ebvVar2.a);
            if (byteBuffer != null) {
                if (((Boolean) this.d.invoke(g, byteBuffer, Integer.valueOf(ebvVar2.b), null, Integer.valueOf(ebvVar2.c), Integer.valueOf(ebvVar2.d ? 1 : 0))).booleanValue()) {
                    z = true;
                } else {
                    h(g);
                    return null;
                }
            }
            i2++;
            z = z;
        }
        if (!z) {
            h(g);
            return null;
        }
        if (!j(g) || (c = c(g)) == null) {
            return null;
        }
        return Typeface.create(c, i);
    }

    @Override // defpackage.eav, defpackage.ebb
    public final Typeface b(Context context, efu efuVar, Resources resources, int i) {
        FontVariationAxis[] fromFontVariationSettings;
        if (!k()) {
            return super.b(context, efuVar, resources, i);
        }
        Object g = g();
        if (g != null) {
            for (eai eaiVar : (eai[]) efuVar.a) {
                String str = eaiVar.a;
                int i2 = eaiVar.e;
                int i3 = eaiVar.b;
                boolean z = eaiVar.c;
                fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(eaiVar.d);
                if (!i(context, g, str, i2, i3, z ? 1 : 0, fromFontVariationSettings)) {
                    h(g);
                    return null;
                }
            }
            if (j(g)) {
                return c(g);
            }
        }
        return null;
    }

    protected Typeface c(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.g.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.ebb
    public final Typeface d(Context context, Resources resources, int i, String str, int i2) {
        if (!k()) {
            return super.d(context, resources, i, str, i2);
        }
        Object g = g();
        if (g != null) {
            if (!i(context, g, str, 0, -1, -1, null)) {
                h(g);
                return null;
            }
            if (j(g)) {
                return c(g);
            }
        }
        return null;
    }

    protected Method e(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
