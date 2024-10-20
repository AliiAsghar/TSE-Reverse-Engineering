package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes5.dex */
public final /* synthetic */ class H implements J, A {
    public final /* synthetic */ PrimitiveIterator.OfInt a;

    private /* synthetic */ H(PrimitiveIterator.OfInt ofInt) {
        this.a = ofInt;
    }

    public static /* synthetic */ J a(PrimitiveIterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof I ? ((I) ofInt).a : new H(ofInt);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfInt ofInt = this.a;
        if (obj instanceof H) {
            obj = ((H) obj).a;
        }
        return ofInt.equals(obj);
    }

    @Override // j$.util.P
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining((PrimitiveIterator.OfInt) obj);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.J, java.util.Iterator
    public final /* synthetic */ Integer next() {
        Integer next;
        next = this.a.next();
        return next;
    }

    @Override // j$.util.J
    public final /* synthetic */ int nextInt() {
        int nextInt;
        nextInt = this.a.nextInt();
        return nextInt;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.a.remove();
    }

    @Override // j$.util.J, java.util.Iterator, j$.util.A
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Object next;
        next = this.a.next();
        return next;
    }

    @Override // j$.util.J
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.a.forEachRemaining(intConsumer);
    }
}
