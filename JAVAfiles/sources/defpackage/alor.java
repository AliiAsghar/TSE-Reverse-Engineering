package defpackage;

import j$.util.Map;
import j$.util.stream.Collector;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class alor<K, V> implements Map<K, V>, Serializable, j$.util.Map<K, V> {
    static final Map.Entry[] b = new Map.Entry[0];
    private static final long serialVersionUID = 912559;
    private transient alpt a;
    private transient alpt c;
    private transient alnu d;
    private transient alpx e;

    public static alok h(int i) {
        albo.x(i, "expectedSize");
        return new alok(i);
    }

    public static alor i(Iterable iterable) {
        int i;
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        } else {
            i = 4;
        }
        alok alokVar = new alok(i);
        alokVar.k(iterable);
        return alokVar.b();
    }

    public static alor j(Map map) {
        if ((map instanceof alor) && !(map instanceof SortedMap)) {
            alor alorVar = (alor) map;
            if (!alorVar.gY()) {
                return alorVar;
            }
        }
        return i(map.entrySet());
    }

    public static alor k() {
        return altc.a;
    }

    public static alor l(Object obj, Object obj2) {
        albo.v(obj, obj2);
        return altc.a(1, new Object[]{obj, obj2});
    }

    public static alor m(Object obj, Object obj2, Object obj3, Object obj4) {
        albo.v(obj, obj2);
        albo.v(obj3, obj4);
        return altc.a(2, new Object[]{obj, obj2, obj3, obj4});
    }

    public static alor n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        albo.v(obj, obj2);
        albo.v(obj3, obj4);
        albo.v(obj5, obj6);
        return altc.a(3, new Object[]{obj, obj2, obj3, obj4, obj5, obj6});
    }

    public static alor o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        albo.v(obj, obj2);
        albo.v(obj3, obj4);
        albo.v(obj5, obj6);
        albo.v(obj7, obj8);
        return altc.a(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    public static alor p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        albo.v(obj, obj2);
        albo.v(obj3, obj4);
        albo.v(obj5, obj6);
        albo.v(obj7, obj8);
        albo.v(obj9, obj10);
        return altc.a(5, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10});
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static Collector t() {
        return alls.a(new allr(3), new allr(4));
    }

    public abstract alnu c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
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

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public alnu values() {
        alnu alnuVar = this.d;
        if (alnuVar == null) {
            alnu c = c();
            this.d = c;
            return c;
        }
        return alnuVar;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return alzz.am(this, obj);
    }

    public abstract alpt f();

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public abstract alpt g();

    public aluq gX() {
        return new aloj(entrySet().listIterator());
    }

    public abstract boolean gY();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public int hashCode() {
        return alzz.F(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final alpt entrySet() {
        alpt alptVar = this.a;
        if (alptVar == null) {
            alpt f = f();
            this.a = f;
            return f;
        }
        return alptVar;
    }

    @Override // java.util.Map
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public alpt keySet() {
        alpt alptVar = this.c;
        if (alptVar == null) {
            alpt g = g();
            this.c = g;
            return g;
        }
        return alptVar;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final alpx s() {
        if (isEmpty()) {
            return almr.a;
        }
        alpx alpxVar = this.e;
        if (alpxVar == null) {
            alpx alpxVar2 = new alpx(new alop(this), size());
            this.e = alpxVar2;
            return alpxVar2;
        }
        return alpxVar;
    }

    public final String toString() {
        return alzz.ai(this);
    }

    public Object writeReplace() {
        return new aloq(this);
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
