package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccw<K, V> extends ccv<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.b;
        this.b = i + 2;
        Object[] objArr = this.a;
        return new ccc(objArr[i], objArr[i + 1]);
    }
}
