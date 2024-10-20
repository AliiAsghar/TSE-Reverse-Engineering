package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aruk implements Iterator, arse {
    final /* synthetic */ artw a;
    private final Iterator b;

    /* JADX WARN: Type inference failed for: r1v1, types: [artx, java.lang.Object] */
    public aruk(artw artwVar) {
        this.a = artwVar;
        this.b = artwVar.b.a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, arqr] */
    @Override // java.util.Iterator
    public final Object next() {
        return this.a.a.a(this.b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.g();
    }
}
