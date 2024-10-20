package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alzg implements Iterator {
    final /* synthetic */ alzh a;
    private int b = 0;

    public alzg(alzh alzhVar) {
        this.a = alzhVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b < this.a.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        if (i < this.a.size()) {
            alzh alzhVar = this.a;
            Object obj = alzhVar.b.b[alzhVar.b() + i];
            this.b = i + 1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
