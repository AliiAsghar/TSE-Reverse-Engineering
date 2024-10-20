package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cbp<E> implements ListIterator<E>, arse {
    public int a;
    public int b;

    public cbp(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final void a() {
        if (hasNext()) {
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        a.p();
    }

    public final void b() {
        if (hasPrevious()) {
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.a < this.b) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.a > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        return a.m();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        a.g();
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        a.p();
    }
}
