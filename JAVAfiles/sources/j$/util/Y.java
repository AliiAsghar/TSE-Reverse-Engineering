package j$.util;

import java.util.function.IntConsumer;

/* loaded from: classes5.dex */
public interface Y extends f0 {
    void forEachRemaining(IntConsumer intConsumer);

    boolean tryAdvance(IntConsumer intConsumer);

    @Override // j$.util.f0, j$.util.Spliterator
    Y trySplit();
}
