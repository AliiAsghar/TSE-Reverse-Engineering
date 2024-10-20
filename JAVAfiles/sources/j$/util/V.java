package j$.util;

import java.util.function.DoubleConsumer;

/* loaded from: classes5.dex */
public interface V extends f0 {
    void forEachRemaining(DoubleConsumer doubleConsumer);

    boolean tryAdvance(DoubleConsumer doubleConsumer);

    @Override // j$.util.f0, j$.util.Spliterator
    V trySplit();
}
