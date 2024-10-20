package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arug implements Iterator, arse {
    final /* synthetic */ aruh a;
    private final Iterator b;
    private int c;

    public arug(aruh aruhVar) {
        this.a = aruhVar;
        this.b = aruhVar.a.a();
    }

    private final void a() {
        while (this.c < this.a.b && this.b.hasNext()) {
            this.b.next();
            this.c++;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        if (this.c < this.a.c && this.b.hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        int i = this.c;
        if (i < this.a.c) {
            this.c = i + 1;
            return this.b.next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.g();
    }
}
