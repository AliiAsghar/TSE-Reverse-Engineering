package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class N3 implements j$.util.Y {
    private int a;
    private final int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N3(int i, int i2, int i3) {
        this(i, i2);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17749;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return (this.b - this.a) + 0;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Q.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return null;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.Q.f(this, consumer);
    }

    private N3(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // j$.util.f0
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i = this.b;
        this.a = i;
        for (int i2 = this.a; i2 < i; i2++) {
            intConsumer.accept(i2);
        }
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i = this.a;
        if (i >= this.b) {
            return false;
        }
        this.a = i + 1;
        intConsumer.accept(i);
        return true;
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public final j$.util.Y trySplit() {
        long estimateSize = estimateSize();
        if (estimateSize <= 1) {
            return null;
        }
        int i = this.a;
        int i2 = ((int) (estimateSize / (estimateSize < 16777216 ? 2 : 8))) + i;
        this.a = i2;
        return new N3(i, i2);
    }
}
