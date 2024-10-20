package j$.util;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes5.dex */
public final /* synthetic */ class W implements Y {
    public final /* synthetic */ Spliterator.OfInt a;

    private /* synthetic */ W(Spliterator.OfInt ofInt) {
        this.a = ofInt;
    }

    public static /* synthetic */ Y a(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof X ? ((X) ofInt).a : new W(ofInt);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        int characteristics;
        characteristics = this.a.characteristics();
        return characteristics;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfInt ofInt = this.a;
        if (obj instanceof W) {
            obj = ((W) obj).a;
        }
        return ofInt.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        long estimateSize;
        estimateSize = this.a.estimateSize();
        return estimateSize;
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining((Spliterator.OfInt) obj);
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
        tryAdvance = this.a.tryAdvance((Spliterator.OfInt) obj);
        return tryAdvance;
    }

    @Override // j$.util.Y, j$.util.f0, j$.util.Spliterator
    public final /* synthetic */ Y trySplit() {
        Spliterator.OfInt trySplit;
        trySplit = this.a.trySplit();
        return a(trySplit);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        boolean tryAdvance;
        tryAdvance = this.a.tryAdvance((Consumer<? super Integer>) consumer);
        return tryAdvance;
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public final /* synthetic */ f0 trySplit() {
        Spliterator.OfPrimitive trySplit;
        trySplit = this.a.trySplit();
        return d0.a(trySplit);
    }

    @Override // j$.util.Y
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.a.forEachRemaining(intConsumer);
    }

    @Override // j$.util.Y
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        boolean tryAdvance;
        tryAdvance = this.a.tryAdvance(intConsumer);
        return tryAdvance;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        java.util.Spliterator trySplit;
        trySplit = this.a.trySplit();
        return g0.a(trySplit);
    }
}
