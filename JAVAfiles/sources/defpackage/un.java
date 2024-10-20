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
public final class un implements Map, j$.util.Map, arse {
    private final ve a;
    private tp b;
    private uc c;
    private vo d;

    public un(ve veVar) {
        this.a = veVar;
    }

    @Override // java.util.Map
    public final void clear() {
        a.g();
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final Object compute(Object obj, BiFunction biFunction) {
        return a.j();
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        return a.j();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return ve.e(this.a, obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.a.b(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        tp tpVar = this.b;
        if (tpVar != null) {
            return tpVar;
        }
        tp tpVar2 = new tp(this.a);
        this.b = tpVar2;
        return tpVar2;
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.a.a(obj);
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.a.c();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        uc ucVar = this.c;
        if (ucVar != null) {
            return ucVar;
        }
        uc ucVar2 = new uc(this.a);
        this.c = ucVar2;
        return ucVar2;
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return a.k();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object putIfAbsent(Object obj, Object obj2) {
        return a.k();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return this.a.e;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        vo voVar = this.d;
        if (voVar != null) {
            return voVar;
        }
        vo voVar2 = new vo(this.a);
        this.d = voVar2;
        return voVar2;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object replace(Object obj, Object obj2) {
        return a.k();
    }
}
