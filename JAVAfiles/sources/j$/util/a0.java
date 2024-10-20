package j$.util;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes5.dex */
public final /* synthetic */ class a0 implements c0 {
    public final /* synthetic */ Spliterator.OfLong a;

    private /* synthetic */ a0(Spliterator.OfLong ofLong) {
        this.a = ofLong;
    }

    public static /* synthetic */ c0 a(Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof b0 ? ((b0) ofLong).a : new a0(ofLong);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        int characteristics;
        characteristics = this.a.characteristics();
        return characteristics;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfLong ofLong = this.a;
        if (obj instanceof a0) {
            obj = ((a0) obj).a;
        }
        return ofLong.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        long estimateSize;
        estimateSize = this.a.estimateSize();
        return estimateSize;
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining((Spliterator.OfLong) obj);
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
        tryAdvance = this.a.tryAdvance((Spliterator.OfLong) obj);
        return tryAdvance;
    }

    @Override // j$.util.c0, j$.util.f0, j$.util.Spliterator
    public final /* synthetic */ c0 trySplit() {
        Spliterator.OfLong trySplit;
        trySplit = this.a.trySplit();
        return a(trySplit);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        boolean tryAdvance;
        tryAdvance = this.a.tryAdvance((Consumer<? super Long>) consumer);
        return tryAdvance;
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public final /* synthetic */ f0 trySplit() {
        Spliterator.OfPrimitive trySplit;
        trySplit = this.a.trySplit();
        return d0.a(trySplit);
    }

    @Override // j$.util.c0
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.a.forEachRemaining(longConsumer);
    }

    @Override // j$.util.c0
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        boolean tryAdvance;
        tryAdvance = this.a.tryAdvance(longConsumer);
        return tryAdvance;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        java.util.Spliterator trySplit;
        trySplit = this.a.trySplit();
        return g0.a(trySplit);
    }
}
