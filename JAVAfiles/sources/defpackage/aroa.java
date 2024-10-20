package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aroa implements Iterator, arse {
    private final Iterator a;
    private int b;

    public aroa(Iterator it) {
        it.getClass();
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.b;
        this.b = i + 1;
        if (i < 0) {
            aqjn.G();
        }
        return new arny(i, this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.g();
    }
}
