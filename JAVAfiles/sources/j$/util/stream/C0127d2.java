package j$.util.stream;

import java.util.function.Function;

/* renamed from: j$.util.stream.d2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C0127d2 extends AbstractC0137f2 {
    public final /* synthetic */ int m;
    final /* synthetic */ Function n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0127d2(AbstractC0142g2 abstractC0142g2, int i, Function function, int i2) {
        super(abstractC0142g2, i, 1);
        this.m = i2;
        this.n = function;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0114b
    public final InterfaceC0182o2 N(int i, InterfaceC0182o2 interfaceC0182o2) {
        switch (this.m) {
            case 0:
                return new r(this, interfaceC0182o2, 3);
            default:
                return new C0189q(this, interfaceC0182o2);
        }
    }
}
