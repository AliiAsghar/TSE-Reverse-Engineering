package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;

/* renamed from: j$.util.stream.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C0213v extends AbstractC0147h2 {
    public final /* synthetic */ int b;
    final /* synthetic */ AbstractC0114b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0213v(AbstractC0114b abstractC0114b, InterfaceC0182o2 interfaceC0182o2, int i) {
        super(interfaceC0182o2);
        this.b = i;
        this.c = abstractC0114b;
    }

    @Override // j$.util.stream.InterfaceC0167l2, j$.util.stream.InterfaceC0182o2
    public final void accept(double d) {
        switch (this.b) {
            case 0:
                this.a.accept((InterfaceC0182o2) ((DoubleFunction) ((C0218w) this.c).n).apply(d));
                return;
            case 1:
                this.a.accept(((DoubleUnaryOperator) ((C0223x) this.c).n).applyAsDouble(d));
                return;
            default:
                ((DoubleConsumer) ((C0223x) this.c).n).accept(d);
                this.a.accept(d);
                return;
        }
    }
}
