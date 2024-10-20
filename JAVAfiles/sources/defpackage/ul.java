package defpackage;

import android.graphics.PorterDuff;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ul {
    public final efu a;
    public final a b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    public ul() {
        this(6);
    }

    public static int e(int i, PorterDuff.Mode mode) {
        return ((i + 31) * 31) + mode.hashCode();
    }

    protected static final void f(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
    }

    private static final void g(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
    }

    protected Object a(Object obj) {
        return null;
    }

    public final Object b(Object obj) {
        Object m;
        obj.getClass();
        synchronized (this.b) {
            Object obj2 = ((LinkedHashMap) this.a.a).get(obj);
            if (obj2 != null) {
                this.h++;
                return obj2;
            }
            this.i++;
            Object a = a(obj);
            if (a == null) {
                return null;
            }
            synchronized (this.b) {
                this.f++;
                m = this.a.m(obj, a);
                if (m != null) {
                    this.a.m(obj, m);
                } else {
                    int i = this.d;
                    g(obj, a);
                    this.d = i + 1;
                }
            }
            if (m != null) {
                f(obj, a);
                return m;
            }
            d(this.c);
            return a;
        }
    }

    public final Object c(Object obj, Object obj2) {
        Object m;
        obj.getClass();
        obj2.getClass();
        synchronized (this.b) {
            this.e++;
            int i = this.d;
            g(obj, obj2);
            this.d = i + 1;
            m = this.a.m(obj, obj2);
            if (m != null) {
                int i2 = this.d;
                g(obj, m);
                this.d = i2 - 1;
            }
        }
        if (m != null) {
            f(obj, m);
        }
        d(this.c);
        return m;
    }

    public final void d(int i) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.b) {
                if (this.d < 0 || (this.a.o() && this.d != 0)) {
                    a.bI("LruCache.sizeOf() is reporting inconsistent results!");
                }
                if (this.d <= i || this.a.o()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) aqjn.Y(this.a.n());
                if (entry == null) {
                    return;
                }
                key = entry.getKey();
                value = entry.getValue();
                efu efuVar = this.a;
                key.getClass();
                ((LinkedHashMap) efuVar.a).remove(key);
                int i2 = this.d;
                g(key, value);
                this.d = i2 - 1;
                this.g++;
            }
            f(key, value);
        }
    }

    public final String toString() {
        int i;
        String str;
        synchronized (this.b) {
            int i2 = this.h;
            int i3 = this.i + i2;
            if (i3 != 0) {
                i = (i2 * 100) / i3;
            } else {
                i = 0;
            }
            str = "LruCache[maxSize=" + this.c + ",hits=" + this.h + ",misses=" + this.i + ",hitRate=" + i + "%]";
        }
        return str;
    }

    public ul(int i) {
        this.c = i;
        if (i <= 0) {
            a.bH("maxSize <= 0");
        }
        this.a = new efu(0);
        this.b = new a();
    }
}
