package j$.util.stream;

import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.l0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C0165l0 extends AbstractC0170m0 {
    public final /* synthetic */ int m;
    final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0165l0(AbstractC0114b abstractC0114b, int i, Object obj, int i2) {
        super(abstractC0114b, i, 1);
        this.m = i2;
        this.n = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0114b
    public final InterfaceC0182o2 N(int i, InterfaceC0182o2 interfaceC0182o2) {
        switch (this.m) {
            case 0:
                return new C0160k0(this, interfaceC0182o2);
            case 1:
                return new C0150i0(this, interfaceC0182o2, 1);
            case 2:
                return new C0117b2(this, interfaceC0182o2);
            default:
                return new r(this, interfaceC0182o2, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0165l0(AbstractC0170m0 abstractC0170m0, LongConsumer longConsumer) {
        super(abstractC0170m0, 0, 1);
        this.m = 1;
        this.n = longConsumer;
    }
}
