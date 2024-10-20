package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes5.dex */
public final /* synthetic */ class D implements F, A {
    public final /* synthetic */ PrimitiveIterator.OfDouble a;

    private /* synthetic */ D(PrimitiveIterator.OfDouble ofDouble) {
        this.a = ofDouble;
    }

    public static /* synthetic */ F a(PrimitiveIterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof E ? ((E) ofDouble).a : new D(ofDouble);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfDouble ofDouble = this.a;
        if (obj instanceof D) {
            obj = ((D) obj).a;
        }
        return ofDouble.equals(obj);
    }

    @Override // j$.util.P
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining((PrimitiveIterator.OfDouble) obj);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.F, java.util.Iterator
    public final /* synthetic */ Double next() {
        Double next;
        next = this.a.next();
        return next;
    }

    @Override // j$.util.F
    public final /* synthetic */ double nextDouble() {
        double nextDouble;
        nextDouble = this.a.nextDouble();
        return nextDouble;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.a.remove();
    }

    @Override // j$.util.F, java.util.Iterator, j$.util.A
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Object next;
        next = this.a.next();
        return next;
    }

    @Override // j$.util.F
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.a.forEachRemaining(doubleConsumer);
    }
}
