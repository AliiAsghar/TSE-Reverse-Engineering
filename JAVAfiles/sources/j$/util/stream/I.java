package j$.util.stream;

import j$.util.OptionalLong;
import j$.util.function.LongConsumer$CC;
import java.util.function.LongConsumer;

/* loaded from: classes5.dex */
final class I extends K implements InterfaceC0177n2 {
    static final F c;
    static final F d;

    static {
        EnumC0148h3 enumC0148h3 = EnumC0148h3.LONG_VALUE;
        c = new F(true, enumC0148h3, OptionalLong.empty(), new C0169m(23), new C0159k(17));
        d = new F(false, enumC0148h3, OptionalLong.empty(), new C0169m(23), new C0159k(17));
    }

    @Override // j$.util.stream.K, j$.util.stream.InterfaceC0182o2, j$.util.stream.InterfaceC0177n2, java.util.function.LongConsumer
    public final void accept(long j) {
        q(Long.valueOf(j));
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return OptionalLong.of(((Long) this.b).longValue());
        }
        return null;
    }
}
