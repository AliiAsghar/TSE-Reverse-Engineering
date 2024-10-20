package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ccg<K, V> extends arnn<K, V> implements Map<K, V>, j$.util.Map<K, V>, arsi {
    public cdg a = new cdg();
    public ccu b;
    public Object c;
    public int d;
    public int e;
    private cce f;

    public ccg(cce cceVar) {
        this.f = cceVar;
        cce cceVar2 = this.f;
        this.b = cceVar2.b;
        this.e = cceVar2.e();
    }

    @Override // defpackage.arnn
    public final int a() {
        return this.e;
    }

    public cce b() {
        ccu ccuVar = this.b;
        cce cceVar = this.f;
        if (ccuVar != cceVar.b) {
            this.a = new cdg();
            cceVar = new cce(ccuVar, a());
        }
        this.f = cceVar;
        return cceVar;
    }

    @Override // defpackage.arnn
    public final Collection c() {
        return new ccm(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.b = ccu.a;
        f(0);
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        int i;
        ccu ccuVar = this.b;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return ccuVar.l(i, obj, 0);
    }

    @Override // defpackage.arnn
    public final Set d() {
        return new cci(this);
    }

    @Override // defpackage.arnn
    public final Set e() {
        return new cck(this);
    }

    public final void f(int i) {
        this.e = i;
        this.d++;
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        int i;
        ccu ccuVar = this.b;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return ccuVar.k(i, obj, 0);
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        this.c = null;
        ccu ccuVar = this.b;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        this.b = ccuVar.e(i, obj, obj2, 0, this);
        return this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        cce cceVar;
        ccg ccgVar;
        if (map instanceof cce) {
            cceVar = (cce) map;
        } else {
            cceVar = null;
        }
        if (cceVar == null) {
            if (map instanceof ccg) {
                ccgVar = (ccg) map;
            } else {
                ccgVar = null;
            }
            if (ccgVar != null) {
                cceVar = ccgVar.b();
            } else {
                cceVar = null;
            }
        }
        if (cceVar != null) {
            cde cdeVar = new cde(null);
            int a = a();
            ccu ccuVar = this.b;
            ccu ccuVar2 = cceVar.b;
            ccuVar2.getClass();
            this.b = ccuVar.f(ccuVar2, 0, cdeVar, this);
            int e = (cceVar.e() + a) - cdeVar.a;
            if (a != e) {
                f(e);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.c = null;
        ccu g = this.b.g(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (g == null) {
            g = ccu.a;
        }
        this.b = g;
        return this.c;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        int a = a();
        ccu h = this.b.h(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (h == null) {
            h = ccu.a;
        }
        this.b = h;
        return a != a();
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
