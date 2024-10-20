package j$.util.stream;

/* renamed from: j$.util.stream.a0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C0110a0 extends AbstractC0170m0 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0110a0(AbstractC0114b abstractC0114b, int i, int i2) {
        super(abstractC0114b, i, 1);
        this.m = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0114b
    public final InterfaceC0182o2 N(int i, InterfaceC0182o2 interfaceC0182o2) {
        switch (this.m) {
            case 0:
                return new Z(0, interfaceC0182o2);
            default:
                return interfaceC0182o2;
        }
    }
}
