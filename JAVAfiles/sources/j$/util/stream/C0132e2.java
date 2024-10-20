package j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.e2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0132e2 extends AbstractC0142g2 {
    @Override // j$.util.stream.AbstractC0114b
    final boolean M() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0114b
    public final InterfaceC0182o2 N(int i, InterfaceC0182o2 interfaceC0182o2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0142g2, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (!isParallel()) {
            P().forEachRemaining(consumer);
        } else {
            super.forEach(consumer);
        }
    }

    @Override // j$.util.stream.AbstractC0142g2, j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (!isParallel()) {
            P().forEachRemaining(consumer);
        } else {
            super.forEachOrdered(consumer);
        }
    }
}
