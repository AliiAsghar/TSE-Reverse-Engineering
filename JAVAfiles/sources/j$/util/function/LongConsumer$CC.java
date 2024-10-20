package j$.util.function;

import java.util.function.LongConsumer;

/* renamed from: j$.util.function.LongConsumer$-CC, reason: invalid class name */
/* loaded from: classes5.dex */
public final /* synthetic */ class LongConsumer$CC {
    public static LongConsumer $default$andThen(final LongConsumer longConsumer, final LongConsumer longConsumer2) {
        longConsumer2.getClass();
        return new LongConsumer() { // from class: j$.util.function.i
            @Override // java.util.function.LongConsumer
            public final void accept(long j) {
                LongConsumer.this.accept(j);
                longConsumer2.accept(j);
            }

            public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer3) {
                return LongConsumer$CC.$default$andThen(this, longConsumer3);
            }
        };
    }
}
