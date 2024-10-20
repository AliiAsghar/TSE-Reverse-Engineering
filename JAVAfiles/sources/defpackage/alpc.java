package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class alpc {
    Map a;

    public alnt d(int i) {
        return alog.d(i);
    }

    public final alpg e() {
        Map map = this.a;
        if (map == null) {
            return almq.a;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return almq.a;
        }
        alok alokVar = new alok(entrySet.size());
        int i = 0;
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            alog g = ((alob) entry.getValue()).g();
            alokVar.h(key, g);
            i += ((alsx) g).c;
        }
        return new aloi(alokVar.b(), i);
    }

    final Map f() {
        Map map = this.a;
        if (map == null) {
            almd almdVar = new almd();
            this.a = almdVar;
            return almdVar;
        }
        return map;
    }

    public final void g(Object obj, Object obj2) {
        albo.v(obj, obj2);
        alnt alntVar = (alnt) f().get(obj);
        if (alntVar == null) {
            alntVar = d(4);
            f().put(obj, alntVar);
        }
        alntVar.c(obj2);
    }

    public final void h(Map.Entry entry) {
        g(entry.getKey(), entry.getValue());
    }

    public final void i(Object obj, Iterable iterable) {
        if (obj != null) {
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                alnt alntVar = (alnt) f().get(obj);
                if (alntVar == null) {
                    alntVar = d(j(iterable));
                    f().put(obj, alntVar);
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    albo.v(obj, next);
                    alntVar.c(next);
                }
                return;
            }
            return;
        }
        throw new NullPointerException("null key in entry: null=".concat(alzz.aR(iterable)));
    }

    public int j(Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            return 4;
        }
        return Math.max(4, ((Collection) iterable).size());
    }
}
