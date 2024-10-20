package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes5.dex */
final class Y extends AbstractC0130e0 {
    public final /* synthetic */ int m;
    final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(AbstractC0114b abstractC0114b, int i, Object obj, int i2) {
        super(abstractC0114b, i, 1);
        this.m = i2;
        this.n = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0114b
    public final InterfaceC0182o2 N(int i, InterfaceC0182o2 interfaceC0182o2) {
        switch (this.m) {
            case 0:
                return new X(this, interfaceC0182o2, 1);
            case 1:
                return new X(this, interfaceC0182o2, 2);
            case 2:
                return new C0115b0(this, interfaceC0182o2);
            case 3:
                return new X(this, interfaceC0182o2, 3);
            case 4:
                return new r(this, interfaceC0182o2, 4);
            default:
                return new C0117b2(this, interfaceC0182o2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(AbstractC0135f0 abstractC0135f0, IntConsumer intConsumer) {
        super(abstractC0135f0, 0, 1);
        this.m = 0;
        this.n = intConsumer;
    }
}
