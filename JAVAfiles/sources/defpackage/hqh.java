package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqh {
    private final hqd a;
    private final hqg b;
    private final Map c;
    private final Map d;
    private final int e;
    private int f;

    public hqh() {
        this.a = new hqd();
        this.b = new hqg();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = 4194304;
    }

    private final hpy f(Class cls) {
        hpy hpyVar = (hpy) this.d.get(cls);
        if (hpyVar == null) {
            if (cls.equals(int[].class)) {
                hpyVar = new hqe(0);
            } else if (cls.equals(byte[].class)) {
                hpyVar = new hqe(1);
            } else {
                throw new IllegalArgumentException("No array pool found for: ".concat(String.valueOf(cls.getSimpleName())));
            }
            this.d.put(cls, hpyVar);
        }
        return hpyVar;
    }

    private final Object g(hqf hqfVar, Class cls) {
        hqd hqdVar = this.a;
        hpy f = f(cls);
        Object a = hqdVar.a(hqfVar);
        if (a != null) {
            this.f -= f.a(a) * f.b();
            i(f.a(a), cls);
        }
        if (a == null) {
            if (Log.isLoggable(f.d(), 2)) {
                Log.v(f.d(), "Allocated " + hqfVar.a + " bytes");
            }
            return f.c(hqfVar.a);
        }
        return a;
    }

    private final NavigableMap h(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.c.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.c.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    private final void i(int i, Class cls) {
        NavigableMap h = h(cls);
        Integer valueOf = Integer.valueOf(i);
        Integer num = (Integer) h.get(valueOf);
        if (num != null) {
            if (num.intValue() == 1) {
                h.remove(valueOf);
                return;
            } else {
                h.put(valueOf, Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + toString());
    }

    private final void j(int i) {
        while (this.f > i) {
            Object b = this.a.b();
            hwr.i(b);
            hpy f = f(b.getClass());
            this.f -= f.a(b) * f.b();
            i(f.a(b), b.getClass());
            if (Log.isLoggable(f.d(), 2)) {
                Log.v(f.d(), "evicted: " + f.a(b));
            }
        }
    }

    public final synchronized Object a(int i, Class cls) {
        hqf d;
        Integer num = (Integer) h(cls).ceilingKey(Integer.valueOf(i));
        if (num != null) {
            int i2 = this.f;
            if (i2 != 0 && this.e / i2 < 2 && num.intValue() > i * 8) {
            }
            d = this.b.d(num.intValue(), cls);
        }
        d = this.b.d(i, cls);
        return g(d, cls);
    }

    public final synchronized void b() {
        j(0);
    }

    public final synchronized void c(Object obj) {
        Class<?> cls = obj.getClass();
        hpy f = f(cls);
        int a = f.a(obj);
        int b = f.b() * a;
        int i = 1;
        if (b <= (this.e >> 1)) {
            hqf d = this.b.d(a, cls);
            this.a.c(d, obj);
            NavigableMap h = h(cls);
            Integer num = (Integer) h.get(Integer.valueOf(d.a));
            Integer valueOf = Integer.valueOf(d.a);
            if (num != null) {
                i = 1 + num.intValue();
            }
            h.put(valueOf, Integer.valueOf(i));
            this.f += b;
            j(this.e);
        }
    }

    public final synchronized void d(int i) {
        if (i >= 40) {
            b();
        } else {
            if (i < 20 && i != 15) {
                return;
            }
            j(this.e >> 1);
        }
    }

    public final synchronized Object e(Class cls) {
        return g(this.b.d(8, cls), cls);
    }

    public hqh(int i) {
        this.a = new hqd();
        this.b = new hqg();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = i;
    }
}
