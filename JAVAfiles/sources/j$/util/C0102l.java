package j$.util;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* renamed from: j$.util.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C0102l implements Iterator, A {
    public final /* synthetic */ int a = 0;
    private final Iterator b;

    public C0102l(C0103m c0103m) {
        this.b = c0103m.a.iterator();
    }

    @Override // java.util.Iterator, j$.util.A
    public final void forEachRemaining(Consumer consumer) {
        switch (this.a) {
            case 0:
                Iterator$EL.forEachRemaining(this.b, consumer);
                return;
            default:
                Iterator$EL.forEachRemaining(this.b, new C0106p(consumer));
                return;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b.hasNext();
            default:
                return this.b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return this.b.next();
            default:
                return new C0107q((Map.Entry) this.b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0102l(C0108s c0108s) {
        this.b = c0108s.a.iterator();
    }
}
