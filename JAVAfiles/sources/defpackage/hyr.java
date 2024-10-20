package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hyr {
    private final Map a = new LinkedHashMap(100, 0.75f, true);
    private final long b;
    private long c;
    private long d;

    public hyr(long j) {
        this.b = j;
        this.c = j;
    }

    private final void b() {
        k(this.c);
    }

    protected int a(Object obj) {
        return 1;
    }

    public final void e() {
        k(0L);
    }

    public final synchronized void f(float f) {
        if (f >= brg.a) {
            this.c = Math.round(((float) this.b) * f);
            b();
        } else {
            throw new IllegalArgumentException("Multiplier must be >= 0");
        }
    }

    public final synchronized long g() {
        return this.c;
    }

    public final synchronized Object h(Object obj) {
        atal atalVar = (atal) this.a.get(obj);
        if (atalVar != null) {
            return atalVar.b;
        }
        return null;
    }

    public final synchronized Object i(Object obj, Object obj2) {
        atal atalVar;
        int a = a(obj2);
        long j = a;
        if (j >= this.c) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.d += j;
        }
        Map map = this.a;
        if (obj2 == null) {
            atalVar = null;
        } else {
            atalVar = new atal(obj2, a);
        }
        atal atalVar2 = (atal) map.put(obj, atalVar);
        if (atalVar2 != null) {
            this.d -= atalVar2.a;
            if (!atalVar2.b.equals(obj2)) {
                c(obj, atalVar2.b);
            }
        }
        b();
        if (atalVar2 == null) {
            return null;
        }
        return atalVar2.b;
    }

    public final synchronized Object j(Object obj) {
        atal atalVar = (atal) this.a.remove(obj);
        if (atalVar == null) {
            return null;
        }
        this.d -= atalVar.a;
        return atalVar.b;
    }

    public final synchronized void k(long j) {
        while (this.d > j) {
            Iterator it = this.a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            atal atalVar = (atal) entry.getValue();
            this.d -= atalVar.a;
            Object key = entry.getKey();
            it.remove();
            c(key, atalVar.b);
        }
    }

    protected void c(Object obj, Object obj2) {
    }
}
