package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edo implements Iterator, arse {
    private final arqr a;
    private final List b = new ArrayList();
    private Iterator c;

    public edo(Iterator it, arqr arqrVar) {
        this.a = arqrVar;
        this.c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, java.lang.Object] */
    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.c.next();
        ?? a = this.a.a(next);
        if (a != 0 && a.hasNext()) {
            this.b.add(this.c);
            this.c = a;
        } else {
            while (!this.c.hasNext() && !this.b.isEmpty()) {
                this.c = (Iterator) aqjn.ac(this.b);
                aqjn.N(this.b);
            }
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.g();
    }
}
