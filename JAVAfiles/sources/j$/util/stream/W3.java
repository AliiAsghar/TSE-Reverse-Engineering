package j$.util.stream;

/* loaded from: classes5.dex */
final class W3 extends AbstractC0152i2 {
    boolean b;
    final /* synthetic */ X3 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W3(X3 x3, InterfaceC0182o2 interfaceC0182o2) {
        super(interfaceC0182o2);
        this.c = x3;
        this.b = true;
    }

    @Override // j$.util.stream.InterfaceC0172m2, j$.util.stream.InterfaceC0182o2
    public final void accept(int i) {
        if (this.b) {
            boolean test = this.c.m.test(i);
            this.b = test;
            if (test) {
                this.a.accept(i);
            }
        }
    }

    @Override // j$.util.stream.AbstractC0152i2, j$.util.stream.InterfaceC0182o2
    public final void l(long j) {
        this.a.l(-1L);
    }

    @Override // j$.util.stream.AbstractC0152i2, j$.util.stream.InterfaceC0182o2
    public final boolean n() {
        if (this.b && !this.a.n()) {
            return false;
        }
        return true;
    }
}
