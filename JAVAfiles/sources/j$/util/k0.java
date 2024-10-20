package j$.util;

import j$.util.function.LongConsumer$CC;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class k0 implements O, LongConsumer, A {
    boolean a = false;
    long b;
    final /* synthetic */ c0 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(c0 c0Var) {
        this.c = c0Var;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.a = true;
        this.b = j;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance((LongConsumer) this);
        }
        return this.a;
    }

    @Override // j$.util.O
    public final long nextLong() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }

    @Override // j$.util.O, java.util.Iterator, j$.util.A
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            forEachRemaining((LongConsumer) consumer);
            return;
        }
        consumer.getClass();
        if (!w0.a) {
            forEachRemaining((LongConsumer) new K(consumer));
        } else {
            w0.a(k0.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
    }

    @Override // java.util.Iterator
    public final Long next() {
        if (!w0.a) {
            return Long.valueOf(nextLong());
        }
        w0.a(k0.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
        throw null;
    }

    @Override // j$.util.P
    public final void forEachRemaining(LongConsumer longConsumer) {
        longConsumer.getClass();
        while (hasNext()) {
            longConsumer.accept(nextLong());
        }
    }
}
