package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
class alkv implements Iterator {
    final Iterator a;
    final Collection b;
    final /* synthetic */ alkw c;

    public alkv(alkw alkwVar, Iterator it) {
        this.c = alkwVar;
        this.b = alkwVar.b;
        this.a = it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.c.b();
        if (this.c.b == this.b) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
        alkw alkwVar = this.c;
        alla allaVar = alkwVar.e;
        allaVar.b--;
        alkwVar.c();
    }

    public alkv(alkw alkwVar) {
        Iterator it;
        this.c = alkwVar;
        this.b = alkwVar.b;
        Collection collection = alkwVar.b;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.a = it;
    }
}
