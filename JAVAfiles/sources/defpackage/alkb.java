package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alkb<K, V> extends AbstractQueue<alke<K, V>> {
    final alke a = new aljz();

    @Override // java.util.Queue
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final alke peek() {
        alke alkeVar = this.a;
        alke alkeVar2 = ((aljz) alkeVar).a;
        if (alkeVar2 == alkeVar) {
            return null;
        }
        return alkeVar2;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        alke alkeVar = ((aljz) this.a).a;
        while (true) {
            alke alkeVar2 = this.a;
            if (alkeVar != alkeVar2) {
                alke g = alkeVar.g();
                alkd.f(alkeVar);
                alkeVar = g;
            } else {
                aljz aljzVar = (aljz) alkeVar2;
                aljzVar.a = alkeVar2;
                aljzVar.b = alkeVar2;
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (((alke) obj).g() != alji.a) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        alke alkeVar = this.a;
        if (((aljz) alkeVar).a == alkeVar) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<alke<K, V>> iterator() {
        return new alka(this, peek());
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        alke alkeVar = (alke) obj;
        alkd.d(alkeVar.i(), alkeVar.g());
        alkd.d(((aljz) this.a).b, alkeVar);
        alkd.d(alkeVar, this.a);
        return true;
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ Object poll() {
        alke alkeVar = this.a;
        alke alkeVar2 = ((aljz) alkeVar).a;
        if (alkeVar2 == alkeVar) {
            return null;
        }
        remove(alkeVar2);
        return alkeVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        alke alkeVar = (alke) obj;
        alke i = alkeVar.i();
        alke g = alkeVar.g();
        alkd.d(i, g);
        alkd.f(alkeVar);
        if (g != alji.a) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = 0;
        for (alke alkeVar = ((aljz) this.a).a; alkeVar != this.a; alkeVar = alkeVar.g()) {
            i++;
        }
        return i;
    }
}
