package j$.util.stream;

import j$.util.OptionalDouble;
import java.util.function.DoubleConsumer;

/* loaded from: classes5.dex */
final class G extends K implements InterfaceC0167l2 {
    static final F c;
    static final F d;

    static {
        EnumC0148h3 enumC0148h3 = EnumC0148h3.DOUBLE_VALUE;
        c = new F(true, enumC0148h3, OptionalDouble.a(), new C0169m(21), new C0159k(15));
        d = new F(false, enumC0148h3, OptionalDouble.a(), new C0169m(21), new C0159k(15));
    }

    @Override // j$.util.stream.K, j$.util.stream.InterfaceC0182o2
    public final void accept(double d2) {
        q(Double.valueOf(d2));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.nio.channels.c.a(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return OptionalDouble.b(((Double) this.b).doubleValue());
        }
        return null;
    }
}
