package j$.util.stream;

import j$.util.OptionalInt;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* loaded from: classes5.dex */
final class H extends K implements InterfaceC0172m2 {
    static final F c;
    static final F d;

    static {
        EnumC0148h3 enumC0148h3 = EnumC0148h3.INT_VALUE;
        c = new F(true, enumC0148h3, OptionalInt.empty(), new C0169m(22), new C0159k(16));
        d = new F(false, enumC0148h3, OptionalInt.empty(), new C0169m(22), new C0159k(16));
    }

    @Override // j$.util.stream.K, j$.util.stream.InterfaceC0182o2
    public final void accept(int i) {
        q(Integer.valueOf(i));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return OptionalInt.of(((Integer) this.b).intValue());
        }
        return null;
    }
}
