package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes5.dex */
final class E3 extends G3 implements j$.util.Y, IntConsumer {
    int f;

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.f = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.J3, j$.util.Spliterator] */
    @Override // j$.util.stream.J3
    protected final Spliterator c(Spliterator spliterator) {
        return new J3((j$.util.Y) spliterator, this);
    }

    @Override // j$.util.stream.G3
    protected final void e(Object obj) {
        ((IntConsumer) obj).accept(this.f);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Q.b(this, consumer);
    }

    @Override // j$.util.stream.G3
    protected final AbstractC0173m3 h(int i) {
        return new C0163k3(i);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.Q.f(this, consumer);
    }
}
