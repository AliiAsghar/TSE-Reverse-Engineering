package j$.util.stream;

import j$.util.stream.Collector;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* loaded from: classes5.dex */
final class K1 extends AbstractC0219w0 {
    final /* synthetic */ BinaryOperator h;
    final /* synthetic */ BiConsumer i;
    final /* synthetic */ Supplier j;
    final /* synthetic */ Collector k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public K1(EnumC0148h3 enumC0148h3, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        this.h = binaryOperator;
        this.i = biConsumer;
        this.j = supplier;
        this.k = collector;
    }

    @Override // j$.util.stream.AbstractC0219w0
    public final T1 Z() {
        return new L1(this.j, this.i, this.h);
    }

    @Override // j$.util.stream.AbstractC0219w0, j$.util.stream.P3
    public final int d() {
        if (this.k.characteristics().contains(Collector.Characteristics.UNORDERED)) {
            return EnumC0143g3.r;
        }
        return 0;
    }
}
