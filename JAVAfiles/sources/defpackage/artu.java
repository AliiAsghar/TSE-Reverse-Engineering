package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class artu implements Iterator, arse {
    final /* synthetic */ artw a;
    private final Iterator b;
    private Iterator c;
    private int d;

    /* JADX WARN: Type inference failed for: r1v1, types: [artx, java.lang.Object] */
    public artu(artw artwVar) {
        this.a = artwVar;
        this.b = artwVar.b.a();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Iterator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, arqr] */
    private final boolean a() {
        ?? a;
        Iterator it = this.c;
        if (it != null && it.hasNext()) {
            this.d = 1;
            return true;
        }
        do {
            Iterator it2 = this.b;
            if (it2.hasNext()) {
                artw artwVar = this.a;
                a = artwVar.a.a(it2.next());
            } else {
                this.d = 2;
                this.c = null;
                return false;
            }
        } while (!a.hasNext());
        this.c = a;
        this.d = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.d;
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        return a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        if (i != 2) {
            if (i == 0 && !a()) {
                throw new NoSuchElementException();
            }
            this.d = 0;
            Iterator it = this.c;
            it.getClass();
            return it.next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.g();
    }
}
