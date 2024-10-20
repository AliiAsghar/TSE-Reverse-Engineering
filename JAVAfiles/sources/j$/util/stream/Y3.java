package j$.util.stream;

/* loaded from: classes5.dex */
final class Y3 extends AbstractC0152i2 implements b4 {
    long b;
    boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ Z3 e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y3(Z3 z3, InterfaceC0182o2 interfaceC0182o2, boolean z) {
        super(interfaceC0182o2);
        this.d = z;
        this.e = z3;
    }

    @Override // j$.util.stream.InterfaceC0172m2, j$.util.stream.InterfaceC0182o2
    public final void accept(int i) {
        boolean z;
        boolean z2;
        if (!this.c) {
            boolean test = this.e.m.test(i);
            this.c = !test;
            if (test) {
                z = false;
                z2 = this.d;
                if (z2 && !z) {
                    this.b++;
                }
                if (!z2 || z) {
                    this.a.accept(i);
                }
                return;
            }
        }
        z = true;
        z2 = this.d;
        if (z2) {
            this.b++;
        }
        if (!z2) {
        }
        this.a.accept(i);
    }

    @Override // j$.util.stream.b4
    public final long f() {
        return this.b;
    }
}
