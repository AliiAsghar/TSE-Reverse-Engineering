package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alsm extends altv {
    final /* synthetic */ allj a;

    public alsm() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof alsk) {
            alsk alskVar = (alsk) obj;
            if (alskVar.a() > 0 && this.a.b(alskVar.a) == alskVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (obj instanceof alsk) {
            alsk alskVar = (alsk) obj;
            Object obj2 = alskVar.a;
            int a = alskVar.a();
            if (a != 0) {
                return this.a.h(obj2, a);
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.c();
    }

    public alsm(allj alljVar) {
        this.a = alljVar;
    }
}
