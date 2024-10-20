package j$.util.stream;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C0223x extends A {
    public final /* synthetic */ int m;
    final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0223x(AbstractC0114b abstractC0114b, int i, Object obj, int i2) {
        super(abstractC0114b, i, 1);
        this.m = i2;
        this.n = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0114b
    public final InterfaceC0182o2 N(int i, InterfaceC0182o2 interfaceC0182o2) {
        switch (this.m) {
            case 0:
                return new C0213v(this, interfaceC0182o2, 1);
            case 1:
                return new C0228y(this, interfaceC0182o2);
            case 2:
                return new C0213v(this, interfaceC0182o2, 2);
            case 3:
                return new r(this, interfaceC0182o2, 6);
            default:
                return new C0117b2(this, interfaceC0182o2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0223x(A a, DoubleConsumer doubleConsumer) {
        super(a, 0, 1);
        this.m = 2;
        this.n = doubleConsumer;
    }
}
