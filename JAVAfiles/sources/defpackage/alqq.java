package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alqq implements Iterator {
    private Iterator a;
    private Iterator b = alqp.a;
    private Iterator c;
    private Deque d;

    public alqq(Iterator it) {
        this.c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        while (true) {
            Iterator it2 = this.b;
            it2.getClass();
            if (!it2.hasNext()) {
                while (true) {
                    Iterator it3 = this.c;
                    if (it3 != null && it3.hasNext()) {
                        it = this.c;
                        break;
                    }
                    Deque deque = this.d;
                    if (deque == null || deque.isEmpty()) {
                        break;
                    }
                    this.c = (Iterator) this.d.removeFirst();
                }
                it = null;
                this.c = it;
                if (it == null) {
                    return false;
                }
                Iterator it4 = (Iterator) it.next();
                this.b = it4;
                if (it4 instanceof alqq) {
                    alqq alqqVar = (alqq) it4;
                    this.b = alqqVar.b;
                    if (this.d == null) {
                        this.d = new ArrayDeque();
                    }
                    this.d.addFirst(this.c);
                    if (alqqVar.d != null) {
                        while (!alqqVar.d.isEmpty()) {
                            this.d.addFirst((Iterator) alqqVar.d.removeLast());
                        }
                    }
                    this.c = alqqVar.c;
                }
            } else {
                return true;
            }
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Iterator it = this.b;
            this.a = it;
            return it.next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Iterator it = this.a;
        if (it != null) {
            it.remove();
            this.a = null;
            return;
        }
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
