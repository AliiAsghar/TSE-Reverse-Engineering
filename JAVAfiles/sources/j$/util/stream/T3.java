package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes5.dex */
final class T3 extends AbstractC0137f2 {
    final /* synthetic */ Predicate m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T3(AbstractC0142g2 abstractC0142g2, int i, Predicate predicate) {
        super(abstractC0142g2, i, 0);
        this.m = predicate;
    }

    @Override // j$.util.stream.AbstractC0114b
    final I0 K(AbstractC0114b abstractC0114b, Spliterator spliterator, IntFunction intFunction) {
        Object invoke;
        invoke = new d4(this, abstractC0114b, spliterator, intFunction).invoke();
        return (I0) invoke;
    }

    @Override // j$.util.stream.AbstractC0114b
    final Spliterator L(AbstractC0114b abstractC0114b, Spliterator spliterator) {
        if (EnumC0143g3.ORDERED.y(abstractC0114b.G())) {
            return K(abstractC0114b, spliterator, new W(19)).spliterator();
        }
        return new f4(abstractC0114b.T(spliterator), this.m, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0114b
    public final InterfaceC0182o2 N(int i, InterfaceC0182o2 interfaceC0182o2) {
        return new C0189q(this, interfaceC0182o2);
    }
}
