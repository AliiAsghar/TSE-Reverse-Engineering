package defpackage;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arom implements ListIterator, arse {
    private int a;
    private int b = -1;
    private int c;
    private final /* synthetic */ int d;
    private final arnm e;

    public arom(arol arolVar, int i, int i2) {
        int i3;
        this.d = i2;
        this.e = arolVar;
        this.a = i;
        i3 = arolVar.modCount;
        this.c = i3;
    }

    private final void a() {
        int i;
        i = ((aron) this.e).modCount;
        if (i == this.c) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    private final void b() {
        int i;
        i = ((arol) this.e).d.modCount;
        if (i == this.c) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i2;
        if (this.d != 0) {
            b();
            int i3 = this.a;
            this.a = i3 + 1;
            ((arol) this.e).add(i3, obj);
            this.b = -1;
            i2 = ((arol) this.e).modCount;
            this.c = i2;
            return;
        }
        a();
        int i4 = this.a;
        this.a = i4 + 1;
        ((aron) this.e).add(i4, obj);
        this.b = -1;
        i = ((aron) this.e).modCount;
        this.c = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.d != 0) {
            if (this.a < ((arol) this.e).c) {
                return true;
            }
            return false;
        }
        if (this.a < ((aron) this.e).c) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.d != 0) {
            if (this.a > 0) {
                return true;
            }
            return false;
        }
        if (this.a > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (this.d != 0) {
            b();
            arnm arnmVar = this.e;
            int i = this.a;
            arol arolVar = (arol) arnmVar;
            if (i < arolVar.c) {
                this.a = i + 1;
                this.b = i;
                return arolVar.a[arolVar.b + i];
            }
            throw new NoSuchElementException();
        }
        a();
        arnm arnmVar2 = this.e;
        int i2 = this.a;
        aron aronVar = (aron) arnmVar2;
        if (i2 < aronVar.c) {
            this.a = i2 + 1;
            this.b = i2;
            return aronVar.b[i2];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        if (this.d != 0) {
            return this.a;
        }
        return this.a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (this.d != 0) {
            b();
            int i = this.a;
            if (i > 0) {
                int i2 = i - 1;
                this.a = i2;
                this.b = i2;
                arol arolVar = (arol) this.e;
                return arolVar.a[arolVar.b + i2];
            }
            throw new NoSuchElementException();
        }
        a();
        int i3 = this.a;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.a = i4;
            this.b = i4;
            return ((aron) this.e).b[i4];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i = this.d;
        return this.a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i2;
        if (this.d != 0) {
            b();
            int i3 = this.b;
            if (i3 != -1) {
                this.e.d(i3);
                this.a = this.b;
                this.b = -1;
                i2 = ((arol) this.e).modCount;
                this.c = i2;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }
        a();
        int i4 = this.b;
        if (i4 != -1) {
            this.e.d(i4);
            this.a = this.b;
            this.b = -1;
            i = ((aron) this.e).modCount;
            this.c = i;
            return;
        }
        throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        if (this.d != 0) {
            b();
            int i = this.b;
            if (i != -1) {
                ((arol) this.e).set(i, obj);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
        a();
        int i2 = this.b;
        if (i2 != -1) {
            ((aron) this.e).set(i2, obj);
            return;
        }
        throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
    }

    public arom(aron aronVar, int i, int i2) {
        int i3;
        this.d = i2;
        this.e = aronVar;
        this.a = i;
        i3 = aronVar.modCount;
        this.c = i3;
    }
}
