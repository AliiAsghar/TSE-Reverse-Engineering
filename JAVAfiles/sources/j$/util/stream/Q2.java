package j$.util.stream;

import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes5.dex */
final class Q2 extends W2 implements j$.util.V {
    final /* synthetic */ R2 g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q2(R2 r2, int i, int i2, int i3, int i4) {
        super(r2, i, i2, i3, i4);
        this.g = r2;
    }

    @Override // j$.util.stream.W2
    final void a(int i, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i]);
    }

    @Override // j$.util.stream.W2
    final j$.util.f0 b(Object obj, int i, int i2) {
        return Spliterators.i((double[]) obj, i, i2 + i);
    }

    @Override // j$.util.stream.W2
    final j$.util.f0 c(int i, int i2, int i3, int i4) {
        return new Q2(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Q.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.Q.e(this, consumer);
    }
}
