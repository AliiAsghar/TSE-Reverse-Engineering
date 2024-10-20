package j$.util;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes5.dex */
public final /* synthetic */ class T implements V {
    public final /* synthetic */ Spliterator.OfDouble a;

    private /* synthetic */ T(Spliterator.OfDouble ofDouble) {
        this.a = ofDouble;
    }

    public static /* synthetic */ V a(Spliterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof U ? ((U) ofDouble).a : new T(ofDouble);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        int characteristics;
        characteristics = this.a.characteristics();
        return characteristics;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfDouble ofDouble = this.a;
        if (obj instanceof T) {
            obj = ((T) obj).a;
        }
        return ofDouble.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        long estimateSize;
        estimateSize = this.a.estimateSize();
        return estimateSize;
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining((Spliterator.OfDouble) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        java.util.Comparator comparator;
        comparator = this.a.getComparator();
        return comparator;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        long exactSizeIfKnown;
        exactSizeIfKnown = this.a.getExactSizeIfKnown();
        return exactSizeIfKnown;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        boolean hasCharacteristics;
        hasCharacteristics = this.a.hasCharacteristics(i);
        return hasCharacteristics;
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        boolean tryAdvance;
        tryAdvance = this.a.tryAdvance((Spliterator.OfDouble) obj);
        return tryAdvance;
    }

    @Override // j$.util.V, j$.util.f0, j$.util.Spliterator
    public final /* synthetic */ V trySplit() {
        Spliterator.OfDouble trySplit;
        trySplit = this.a.trySplit();
        return a(trySplit);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        boolean tryAdvance;
        tryAdvance = this.a.tryAdvance((Consumer<? super Double>) consumer);
        return tryAdvance;
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public final /* synthetic */ f0 trySplit() {
        Spliterator.OfPrimitive trySplit;
        trySplit = this.a.trySplit();
        return d0.a(trySplit);
    }

    @Override // j$.util.V
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.a.forEachRemaining(doubleConsumer);
    }

    @Override // j$.util.V
    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        boolean tryAdvance;
        tryAdvance = this.a.tryAdvance(doubleConsumer);
        return tryAdvance;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        java.util.Spliterator trySplit;
        trySplit = this.a.trySplit();
        return g0.a(trySplit);
    }
}
