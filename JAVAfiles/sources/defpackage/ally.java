package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ally extends AbstractSet {
    final /* synthetic */ almd a;

    public ally(almd almdVar) {
        this.a = almdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map j = this.a.j();
        if (j != null) {
            return j.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int d = this.a.d(entry.getKey());
            if (d != -1 && d.B(this.a.h(d), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return this.a.i();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map j = this.a.j();
        if (j != null) {
            return j.entrySet().remove(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            almd almdVar = this.a;
            if (!almdVar.o()) {
                int c = almdVar.c();
                Object key = entry.getKey();
                Object value = entry.getValue();
                almd almdVar2 = this.a;
                int bm = alzz.bm(key, value, c, almdVar2.g(), almdVar2.p(), almdVar2.q(), almdVar2.r());
                if (bm != -1) {
                    this.a.m(bm, c);
                    r10.f--;
                    this.a.k();
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
