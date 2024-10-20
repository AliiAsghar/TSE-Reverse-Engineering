package j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.d0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0125d0 extends AbstractC0135f0 {
    @Override // j$.util.stream.AbstractC0114b
    final boolean M() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0114b
    public final InterfaceC0182o2 N(int i, InterfaceC0182o2 interfaceC0182o2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0135f0, j$.util.stream.IntStream
    public final void forEach(IntConsumer intConsumer) {
        j$.util.Y V;
        if (!isParallel()) {
            V = AbstractC0135f0.V(P());
            V.forEachRemaining(intConsumer);
        } else {
            super.forEach(intConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC0135f0, j$.util.stream.IntStream
    public final void forEachOrdered(IntConsumer intConsumer) {
        j$.util.Y V;
        if (!isParallel()) {
            V = AbstractC0135f0.V(P());
            V.forEachRemaining(intConsumer);
        } else {
            super.forEachOrdered(intConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC0114b, j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC0114b, j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        sequential();
        return this;
    }
}
