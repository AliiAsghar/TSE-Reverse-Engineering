package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aliq<K, V> extends AbstractQueue<alke<K, V>> {
    final alke a = new alio();

    @Override // java.util.Queue
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final alke peek() {
        alke alkeVar = this.a;
        alke alkeVar2 = ((alio) alkeVar).a;
        if (alkeVar2 == alkeVar) {
            return null;
        }
        return alkeVar2;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        alke alkeVar = ((alio) this.a).a;
        while (true) {
            alke alkeVar2 = this.a;
            if (alkeVar != alkeVar2) {
                alke f = alkeVar.f();
                alkd.e(alkeVar);
                alkeVar = f;
            } else {
                alio alioVar = (alio) alkeVar2;
                alioVar.a = alkeVar2;
                alioVar.b = alkeVar2;
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (((alke) obj).f() != alji.a) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        alke alkeVar = this.a;
        if (((alio) alkeVar).a == alkeVar) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<alke<K, V>> iterator() {
        return new alip(this, peek());
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        alke alkeVar = (alke) obj;
        alkd.c(alkeVar.h(), alkeVar.f());
        alkd.c(((alio) this.a).b, alkeVar);
        alkd.c(alkeVar, this.a);
        return true;
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ Object poll() {
        alke alkeVar = this.a;
        alke alkeVar2 = ((alio) alkeVar).a;
        if (alkeVar2 == alkeVar) {
            return null;
        }
        remove(alkeVar2);
        return alkeVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        alke alkeVar = (alke) obj;
        alke h = alkeVar.h();
        alke f = alkeVar.f();
        alkd.c(h, f);
        alkd.e(alkeVar);
        if (f != alji.a) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = 0;
        for (alke alkeVar = ((alio) this.a).a; alkeVar != this.a; alkeVar = alkeVar.f()) {
            i++;
        }
        return i;
    }
}
