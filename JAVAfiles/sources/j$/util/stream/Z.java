package j$.util.stream;

/* loaded from: classes5.dex */
final class Z extends AbstractC0152i2 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(int i, InterfaceC0182o2 interfaceC0182o2) {
        super(interfaceC0182o2);
        this.b = i;
    }

    @Override // j$.util.stream.InterfaceC0172m2, j$.util.stream.InterfaceC0182o2
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                this.a.accept(i);
                return;
            default:
                this.a.accept(i);
                return;
        }
    }
}
