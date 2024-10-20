package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cci<K, V> extends ccb<Map.Entry<K, V>, K, V> {
    private final ccg a;

    public cci(ccg ccgVar) {
        this.a = ccgVar;
    }

    @Override // defpackage.ccb
    public final boolean a(Map.Entry entry) {
        Object obj = this.a.get(entry.getKey());
        if (obj != null) {
            return d.F(obj, entry.getValue());
        }
        if (entry.getValue() != null || !this.a.containsKey(entry.getKey())) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ccb
    public final boolean b(Map.Entry entry) {
        return this.a.remove(entry.getKey(), entry.getValue());
    }

    @Override // defpackage.arno
    public final int c() {
        return this.a.a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new ccj(this.a);
    }
}
