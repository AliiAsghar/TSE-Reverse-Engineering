package j$.util.stream;

/* renamed from: j$.util.stream.b0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C0115b0 extends AbstractC0152i2 {
    boolean b;
    V c;
    final /* synthetic */ Y d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0115b0(Y y, InterfaceC0182o2 interfaceC0182o2) {
        super(interfaceC0182o2);
        this.d = y;
        this.c = new V(interfaceC0182o2);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.Y] */
    @Override // j$.util.stream.InterfaceC0172m2, j$.util.stream.InterfaceC0182o2
    public final void accept(int i) {
        IntStream intStream = (IntStream) ((O0) this.d.n).apply(i);
        if (intStream != null) {
            try {
                boolean z = this.b;
                V v = this.c;
                if (!z) {
                    intStream.sequential().forEach(v);
                } else {
                    ?? spliterator = intStream.sequential().spliterator();
                    while (!this.a.n() && spliterator.tryAdvance(v)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    intStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.AbstractC0152i2, j$.util.stream.InterfaceC0182o2
    public final void l(long j) {
        this.a.l(-1L);
    }

    @Override // j$.util.stream.AbstractC0152i2, j$.util.stream.InterfaceC0182o2
    public final boolean n() {
        this.b = true;
        return this.a.n();
    }
}
