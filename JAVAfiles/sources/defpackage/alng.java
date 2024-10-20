package defpackage;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alng extends AbstractMap implements Serializable, allp {
    private final alnm a;
    private transient Set b;

    public alng(alnm alnmVar) {
        this.a = alnmVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a.g = this;
    }

    @Override // defpackage.allp
    public final allp a() {
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.b;
        if (set == null) {
            alnh alnhVar = new alnh(this.a);
            this.b = alnhVar;
            return alnhVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        alnm alnmVar = this.a;
        int e = alnmVar.e(obj);
        if (e == -1) {
            return null;
        }
        return alnmVar.a[e];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.a.values();
    }

    @Override // java.util.AbstractMap, java.util.Map, defpackage.allp
    public final Object put(Object obj, Object obj2) {
        return this.a.k(obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int bg = alzz.bg(obj);
        alnm alnmVar = this.a;
        int f = alnmVar.f(obj, bg);
        if (f == -1) {
            return null;
        }
        Object obj2 = alnmVar.a[f];
        alnmVar.i(f, bg);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return this.a.keySet();
    }
}
