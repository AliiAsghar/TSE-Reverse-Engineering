package defpackage;

import android.net.Uri;
import android.os.Build;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pa {
    public Object a;
    public Object b;
    public Object c;

    public pa(byte[] bArr) {
        gay gayVar = gay.b;
        this.c = gayVar;
        this.a = gayVar;
        this.b = gayVar;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
        } else {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }

    public final gaz b(gbb gbbVar) {
        Object obj;
        gbbVar.getClass();
        int ordinal = gbbVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    obj = this.b;
                } else {
                    throw new armm();
                }
            } else {
                obj = this.a;
            }
        } else {
            obj = this.c;
        }
        return (gaz) obj;
    }

    public final gba c() {
        Object obj = this.c;
        return new gba((gaz) obj, (gaz) this.a, (gaz) this.b);
    }

    public final void d(gba gbaVar) {
        this.c = gbaVar.b;
        this.b = gbaVar.d;
        this.a = gbaVar.c;
    }

    public final void e(gbb gbbVar, gaz gazVar) {
        gbbVar.getClass();
        int ordinal = gbbVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    this.b = gazVar;
                    return;
                }
                throw new armm();
            }
            this.a = gazVar;
            return;
        }
        this.c = gazVar;
    }

    public final boolean f() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public final ukf g() {
        Object obj;
        Object obj2 = this.a;
        if (obj2 != null && (obj = this.c) != null) {
            return new ukf((anlw) obj2, (tqr) obj, (Uri) this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" brandInfo");
        }
        if (this.c == null) {
            sb.append(" status");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void h(anlw anlwVar) {
        if (anlwVar != null) {
            this.a = anlwVar;
            return;
        }
        throw new NullPointerException("Null brandInfo");
    }

    public final void i(tqr tqrVar) {
        if (tqrVar != null) {
            this.c = tqrVar;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public final mya j() {
        Object obj;
        Object obj2 = this.a;
        if (obj2 != null && (obj = this.b) != null) {
            return new mya((String) obj2, (Uri) obj, (myz) this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" contentType");
        }
        if (this.b == null) {
            sb.append(" uri");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void k(Uri uri) {
        if (uri != null) {
            this.b = uri;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    public pa(char[] cArr) {
    }

    public pa() {
        this.a = null;
        this.b = null;
        this.c = null;
        a();
        try {
            Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
            this.a = declaredMethod;
            Method method = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        try {
            Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
            this.b = declaredMethod2;
            Method method2 = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            Method method3 = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            this.c = method3;
            Method method4 = method3;
            method3.setAccessible(true);
        } catch (NoSuchMethodException unused3) {
        }
    }
}
