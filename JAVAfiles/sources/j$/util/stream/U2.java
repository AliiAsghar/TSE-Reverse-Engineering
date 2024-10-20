package j$.util.stream;

import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes5.dex */
final class U2 extends W2 implements j$.util.c0 {
    final /* synthetic */ V2 g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U2(V2 v2, int i, int i2, int i3, int i4) {
        super(v2, i, i2, i3, i4);
        this.g = v2;
    }

    @Override // j$.util.stream.W2
    final void a(int i, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i]);
    }

    @Override // j$.util.stream.W2
    final j$.util.f0 b(Object obj, int i, int i2) {
        return Spliterators.k((long[]) obj, i, i2 + i);
    }

    @Override // j$.util.stream.W2
    final j$.util.f0 c(int i, int i2, int i3, int i4) {
        return new U2(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Q.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.Q.g(this, consumer);
    }
}
