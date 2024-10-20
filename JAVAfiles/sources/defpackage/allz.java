package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class allz implements Iterator {
    int b;
    int c;
    int d = -1;
    final /* synthetic */ almd e;

    public allz(almd almdVar) {
        this.e = almdVar;
        this.b = almdVar.e;
        this.c = almdVar.a();
    }

    private final void b() {
        if (this.e.e == this.b) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        b();
        if (hasNext()) {
            int i = this.c;
            this.d = i;
            Object a = a(i);
            this.c = this.e.b(this.c);
            return a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        b();
        if (this.d >= 0) {
            z = true;
        } else {
            z = false;
        }
        albo.w(z);
        this.b += 32;
        int i = this.d;
        almd almdVar = this.e;
        almdVar.remove(almdVar.e(i));
        this.c--;
        this.d = -1;
    }
}
