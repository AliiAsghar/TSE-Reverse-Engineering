package j$.util.stream;

/* renamed from: j$.util.stream.t2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C0206t2 extends AbstractC0157j2 {
    long b;
    long c;
    final /* synthetic */ C0211u2 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0206t2(C0211u2 c0211u2, InterfaceC0182o2 interfaceC0182o2) {
        super(interfaceC0182o2);
        this.d = c0211u2;
        this.b = c0211u2.m;
        long j = c0211u2.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.InterfaceC0177n2, java.util.function.LongConsumer
    public final void accept(long j) {
        long j2 = this.b;
        if (j2 == 0) {
            long j3 = this.c;
            if (j3 > 0) {
                this.c = j3 - 1;
                this.a.accept(j);
                return;
            }
            return;
        }
        this.b = j2 - 1;
    }

    @Override // j$.util.stream.AbstractC0157j2, j$.util.stream.InterfaceC0182o2
    public final void l(long j) {
        this.a.l(AbstractC0219w0.A(j, this.d.m, this.c));
    }

    @Override // j$.util.stream.AbstractC0157j2, j$.util.stream.InterfaceC0182o2
    public final boolean n() {
        if (this.c != 0 && !this.a.n()) {
            return false;
        }
        return true;
    }
}
