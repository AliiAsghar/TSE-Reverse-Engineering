package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes5.dex */
public final /* synthetic */ class M implements O, A {
    public final /* synthetic */ PrimitiveIterator.OfLong a;

    private /* synthetic */ M(PrimitiveIterator.OfLong ofLong) {
        this.a = ofLong;
    }

    public static /* synthetic */ O a(PrimitiveIterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof N ? ((N) ofLong).a : new M(ofLong);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfLong ofLong = this.a;
        if (obj instanceof M) {
            obj = ((M) obj).a;
        }
        return ofLong.equals(obj);
    }

    @Override // j$.util.P
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining((PrimitiveIterator.OfLong) obj);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.O, java.util.Iterator
    public final /* synthetic */ Long next() {
        Long next;
        next = this.a.next();
        return next;
    }

    @Override // j$.util.O
    public final /* synthetic */ long nextLong() {
        long nextLong;
        nextLong = this.a.nextLong();
        return nextLong;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.a.remove();
    }

    @Override // j$.util.O, java.util.Iterator, j$.util.A
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Object next;
        next = this.a.next();
        return next;
    }

    @Override // j$.util.O
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.a.forEachRemaining(longConsumer);
    }
}
