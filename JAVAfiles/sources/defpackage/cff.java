package defpackage;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cff<T> implements ListIterator<T>, arse {
    private final cez a;
    private int b;
    private int c = -1;
    private int d;

    public cff(cez cezVar, int i) {
        this.a = cezVar;
        this.b = i - 1;
        this.d = cezVar.b();
    }

    private final void a() {
        if (this.a.b() == this.d) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        a();
        this.a.add(this.b + 1, obj);
        this.c = -1;
        this.b++;
        this.d = this.a.b();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.b < this.a.a() - 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.b >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        int i = this.b + 1;
        this.c = i;
        cfa.a(i, this.a.a());
        Object obj = this.a.get(i);
        this.b = i;
        return obj;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        cfa.a(this.b, this.a.a());
        int i = this.b;
        this.c = i;
        this.b--;
        return this.a.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        this.a.d(this.b);
        this.b--;
        this.c = -1;
        this.d = this.a.b();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.c;
        if (i >= 0) {
            this.a.set(i, obj);
            this.d = this.a.b();
            return;
        }
        throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
    }
}
