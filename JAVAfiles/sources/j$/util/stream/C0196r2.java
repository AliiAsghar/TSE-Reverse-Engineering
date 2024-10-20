package j$.util.stream;

/* renamed from: j$.util.stream.r2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C0196r2 extends AbstractC0152i2 {
    long b;
    long c;
    final /* synthetic */ C0201s2 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0196r2(C0201s2 c0201s2, InterfaceC0182o2 interfaceC0182o2) {
        super(interfaceC0182o2);
        this.d = c0201s2;
        this.b = c0201s2.m;
        long j = c0201s2.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.InterfaceC0172m2, j$.util.stream.InterfaceC0182o2
    public final void accept(int i) {
        long j = this.b;
        if (j == 0) {
            long j2 = this.c;
            if (j2 > 0) {
                this.c = j2 - 1;
                this.a.accept(i);
                return;
            }
            return;
        }
        this.b = j - 1;
    }

    @Override // j$.util.stream.AbstractC0152i2, j$.util.stream.InterfaceC0182o2
    public final void l(long j) {
        this.a.l(AbstractC0219w0.A(j, this.d.m, this.c));
    }

    @Override // j$.util.stream.AbstractC0152i2, j$.util.stream.InterfaceC0182o2
    public final boolean n() {
        if (this.c != 0 && !this.a.n()) {
            return false;
        }
        return true;
    }
}
