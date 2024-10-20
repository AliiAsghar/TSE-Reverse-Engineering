package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.s3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C0202s3 implements Spliterator {
    long a;
    final Supplier b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0202s3(long j, Supplier supplier) {
        this.a = j;
        this.b = supplier;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 1024;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.a;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Spliterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
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
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        consumer.accept(this.b.get());
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        long j = this.a;
        if (j == 0) {
            return null;
        }
        long j2 = j >>> 1;
        this.a = j2;
        return new C0202s3(j2, this.b);
    }
}
