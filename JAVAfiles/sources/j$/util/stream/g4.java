package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* loaded from: classes5.dex */
abstract class g4 implements Spliterator {
    final Spliterator a;
    final AtomicBoolean b;
    boolean c;
    int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g4(Spliterator spliterator) {
        this.c = true;
        this.a = spliterator;
        this.b = new AtomicBoolean();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        if (this.d == 0 && this.b.get()) {
            return false;
        }
        return true;
    }

    abstract Spliterator c(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.a.characteristics() & (-16449);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Spliterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        Spliterator trySplit = this.a.trySplit();
        if (trySplit != null) {
            return c(trySplit);
        }
        return null;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.Y trySplit() {
        return (j$.util.Y) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.f0 trySplit() {
        return (j$.util.f0) trySplit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g4(Spliterator spliterator, g4 g4Var) {
        this.c = true;
        this.a = spliterator;
        g4Var.getClass();
        this.b = g4Var.b;
    }
}
