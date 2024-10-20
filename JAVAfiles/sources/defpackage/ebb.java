package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ebb {
    private final ConcurrentHashMap a = new ConcurrentHashMap();

    private static long g(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    private static Object h(Object[] objArr, int i, eba ebaVar) {
        boolean z;
        int i2;
        int i3 = Integer.MAX_VALUE;
        Object obj = null;
        for (Object obj2 : objArr) {
            int i4 = 1;
            int i5 = i & 1;
            if ((i & 2) == 0) {
                z = false;
            } else {
                z = true;
            }
            if (1 != i5) {
                i2 = 400;
            } else {
                i2 = 700;
            }
            int abs = Math.abs(ebaVar.a(obj2) - i2);
            int i6 = abs + abs;
            if (ebaVar.b(obj2) == z) {
                i4 = 0;
            }
            int i7 = i6 + i4;
            if (obj == null || i3 > i7) {
                i3 = i7;
                obj = obj2;
            }
        }
        return obj;
    }

    public Typeface a(Context context, ebv[] ebvVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (ebvVarArr.length <= 0) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(m(ebvVarArr, i).a);
            try {
                Typeface l = l(context, inputStream);
                d.q(inputStream);
                return l;
            } catch (IOException unused) {
                d.q(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                d.q(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public Typeface b(Context context, efu efuVar, Resources resources, int i) {
        eai eaiVar = (eai) h((Object[]) efuVar.a, i, new eaz(0));
        if (eaiVar == null) {
            return null;
        }
        Typeface a = eau.a(context, resources, eaiVar.f, eaiVar.a, 0, i);
        long g = g(a);
        if (g != 0) {
            this.a.put(Long.valueOf(g), efuVar);
        }
        return a;
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File i3 = dyy.i(context);
        Typeface typeface = null;
        if (i3 == null) {
            return null;
        }
        try {
            if (dyy.k(i3, resources, i)) {
                typeface = Typeface.createFromFile(i3.getPath());
            }
        } catch (RuntimeException unused) {
        } catch (Throwable th) {
            i3.delete();
            throw th;
        }
        i3.delete();
        return typeface;
    }

    public Typeface f(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Typeface l(Context context, InputStream inputStream) {
        File i = dyy.i(context);
        Typeface typeface = null;
        if (i == null) {
            return null;
        }
        try {
            if (dyy.j(i, inputStream)) {
                typeface = Typeface.createFromFile(i.getPath());
            }
        } catch (RuntimeException unused) {
        } catch (Throwable th) {
            i.delete();
            throw th;
        }
        i.delete();
        return typeface;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ebv m(ebv[] ebvVarArr, int i) {
        return (ebv) h(ebvVarArr, i, new eaz(1));
    }
}
