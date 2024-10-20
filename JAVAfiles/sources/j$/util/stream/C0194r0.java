package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* renamed from: j$.util.stream.r0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C0194r0 extends AbstractC0199s0 implements InterfaceC0172m2 {
    final /* synthetic */ EnumC0204t0 c;
    final /* synthetic */ IntPredicate d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0194r0(EnumC0204t0 enumC0204t0, IntPredicate intPredicate) {
        super(enumC0204t0);
        this.c = enumC0204t0;
        this.d = intPredicate;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void q(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC0172m2
    public final /* synthetic */ void m(Integer num) {
        AbstractC0219w0.g(this, num);
    }

    @Override // j$.util.stream.AbstractC0199s0, j$.util.stream.InterfaceC0182o2
    public final void accept(int i) {
        boolean z;
        boolean z2;
        if (this.a) {
            return;
        }
        boolean test = this.d.test(i);
        EnumC0204t0 enumC0204t0 = this.c;
        z = enumC0204t0.a;
        if (test == z) {
            this.a = true;
            z2 = enumC0204t0.b;
            this.b = z2;
        }
    }
}
