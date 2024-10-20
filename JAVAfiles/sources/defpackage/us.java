package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class us implements Iterator, arse {
    public int a = -1;
    public final vh b;
    private final Iterator c;

    public us(vh vhVar) {
        this.b = vhVar;
        this.c = arrn.b(new ur(this, vhVar, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        if (i != -1) {
            this.b.i(i);
            this.a = -1;
        }
    }
}
