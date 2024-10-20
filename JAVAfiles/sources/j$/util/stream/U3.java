package j$.util.stream;

/* loaded from: classes5.dex */
final class U3 extends AbstractC0162k2 implements b4 {
    long b;
    boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ V3 e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U3(V3 v3, InterfaceC0182o2 interfaceC0182o2, boolean z) {
        super(interfaceC0182o2);
        this.d = z;
        this.e = v3;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z;
        boolean z2;
        if (!this.c) {
            boolean test = this.e.m.test(obj);
            this.c = !test;
            if (test) {
                z = false;
                z2 = this.d;
                if (z2 && !z) {
                    this.b++;
                }
                if (!z2 || z) {
                    this.a.accept((InterfaceC0182o2) obj);
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
        this.a.accept((InterfaceC0182o2) obj);
    }

    @Override // j$.util.stream.b4
    public final long f() {
        return this.b;
    }
}
