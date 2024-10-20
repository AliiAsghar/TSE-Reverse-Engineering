package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arof implements ListIterator, arse {
    final /* synthetic */ arog a;
    private final ListIterator b;

    public arof(arog arogVar, int i) {
        this.a = arogVar;
        List list = arogVar.a;
        if (new artb(0, arogVar.a()).e(i)) {
            this.b = list.listIterator(arogVar.a() - i);
            return;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new artb(0, arogVar.a()) + "].");
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        a.p();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.b.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return aqjn.R(this.a, this.b.previousIndex());
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.b.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return aqjn.R(this.a, this.b.nextIndex());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a.g();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a.p();
    }
}
