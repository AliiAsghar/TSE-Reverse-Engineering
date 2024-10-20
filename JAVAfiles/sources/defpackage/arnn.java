package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class arnn<K, V> extends AbstractMap<K, V> implements Map<K, V>, arsi {
    public /* bridge */ int a() {
        throw null;
    }

    public /* bridge */ Collection c() {
        throw null;
    }

    public abstract Set d();

    public /* bridge */ Set e() {
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set entrySet() {
        return d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set keySet() {
        return e();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection values() {
        return c();
    }
}
