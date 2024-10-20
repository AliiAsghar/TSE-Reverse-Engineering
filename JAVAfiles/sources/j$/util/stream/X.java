package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;

/* loaded from: classes5.dex */
final class X extends AbstractC0152i2 {
    public final /* synthetic */ int b;
    final /* synthetic */ AbstractC0114b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(AbstractC0114b abstractC0114b, InterfaceC0182o2 interfaceC0182o2, int i) {
        super(interfaceC0182o2);
        this.b = i;
        this.c = abstractC0114b;
    }

    @Override // j$.util.stream.InterfaceC0172m2, j$.util.stream.InterfaceC0182o2
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                this.a.accept((InterfaceC0182o2) ((IntFunction) ((C0218w) this.c).n).apply(i));
                return;
            case 1:
                ((IntConsumer) ((Y) this.c).n).accept(i);
                this.a.accept(i);
                return;
            case 2:
                this.a.accept(((IntUnaryOperator) ((Y) this.c).n).applyAsInt(i));
                return;
            default:
                if (((IntPredicate) ((Y) this.c).n).test(i)) {
                    this.a.accept(i);
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0152i2, j$.util.stream.InterfaceC0182o2
    public void l(long j) {
        switch (this.b) {
            case 3:
                this.a.l(-1L);
                return;
            default:
                super.l(j);
                return;
        }
    }
}
