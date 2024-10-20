package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class arnf implements Iterator, arse {
    private int a;
    private Object b;

    private final boolean d() {
        this.a = 3;
        a();
        if (this.a == 1) {
            return true;
        }
        return false;
    }

    protected abstract void a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b() {
        this.a = 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(Object obj) {
        this.b = obj;
        this.a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
        }
        return d();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i == 1 || (i != 2 && d())) {
            this.a = 0;
            return this.b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.g();
    }
}
