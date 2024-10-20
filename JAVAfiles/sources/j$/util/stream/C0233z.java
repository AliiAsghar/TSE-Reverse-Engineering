package j$.util.stream;

/* renamed from: j$.util.stream.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C0233z extends A {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0233z(AbstractC0114b abstractC0114b, int i, int i2) {
        super(abstractC0114b, i, 1);
        this.m = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0114b
    public final InterfaceC0182o2 N(int i, InterfaceC0182o2 interfaceC0182o2) {
        switch (this.m) {
            case 0:
                return interfaceC0182o2;
            case 1:
                return new Z(1, interfaceC0182o2);
            default:
                return new AbstractC0157j2(interfaceC0182o2);
        }
    }
}
