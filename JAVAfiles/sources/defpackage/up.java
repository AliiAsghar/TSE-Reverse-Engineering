package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class up implements Iterator, arse {
    public int a = -1;
    final /* synthetic */ vc b;
    private final Iterator c;

    public up(vc vcVar) {
        this.b = vcVar;
        this.c = arrn.b(new uo(vcVar, this, null));
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
            this.b.e(i);
            this.a = -1;
        }
    }
}
