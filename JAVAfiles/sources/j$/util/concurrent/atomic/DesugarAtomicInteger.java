package j$.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntUnaryOperator;

/* loaded from: classes5.dex */
public class DesugarAtomicInteger {
    public static int updateAndGet(AtomicInteger atomicInteger, IntUnaryOperator intUnaryOperator) {
        int i;
        int applyAsInt;
        do {
            i = atomicInteger.get();
            applyAsInt = intUnaryOperator.applyAsInt(i);
        } while (!atomicInteger.compareAndSet(i, applyAsInt));
        return applyAsInt;
    }
}
