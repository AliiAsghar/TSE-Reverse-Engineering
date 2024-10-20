package j$.util;

import j$.util.function.IntConsumer$CC;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class j0 implements J, IntConsumer, A {
    boolean a = false;
    int b;
    final /* synthetic */ Y c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0(Y y) {
        this.c = y;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.a = true;
        this.b = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance((IntConsumer) this);
        }
        return this.a;
    }

    @Override // j$.util.J
    public final int nextInt() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }

    @Override // j$.util.J, java.util.Iterator, j$.util.A
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            forEachRemaining((IntConsumer) consumer);
            return;
        }
        consumer.getClass();
        if (!w0.a) {
            forEachRemaining((IntConsumer) new G(consumer));
        } else {
            w0.a(j0.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
    }

    @Override // java.util.Iterator
    public final Integer next() {
        if (!w0.a) {
            return Integer.valueOf(nextInt());
        }
        w0.a(j0.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
        throw null;
    }

    @Override // j$.util.P
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        while (hasNext()) {
            intConsumer.accept(nextInt());
        }
    }
}
