package j$.util.stream;

/* renamed from: j$.util.stream.k0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C0160k0 extends AbstractC0157j2 {
    boolean b;
    C0145h0 c;
    final /* synthetic */ C0165l0 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0160k0(C0165l0 c0165l0, InterfaceC0182o2 interfaceC0182o2) {
        super(interfaceC0182o2);
        this.d = c0165l0;
        this.c = new C0145h0(interfaceC0182o2);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [j$.util.c0] */
    @Override // j$.util.stream.InterfaceC0177n2, java.util.function.LongConsumer
    public final void accept(long j) {
        LongStream longStream = (LongStream) ((C0109a) this.d.n).apply(j);
        if (longStream != null) {
            try {
                boolean z = this.b;
                C0145h0 c0145h0 = this.c;
                if (!z) {
                    longStream.sequential().forEach(c0145h0);
                } else {
                    ?? spliterator = longStream.sequential().spliterator();
                    while (!this.a.n() && spliterator.tryAdvance(c0145h0)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    longStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (longStream != null) {
            longStream.close();
        }
    }

    @Override // j$.util.stream.AbstractC0157j2, j$.util.stream.InterfaceC0182o2
    public final void l(long j) {
        this.a.l(-1L);
    }

    @Override // j$.util.stream.AbstractC0157j2, j$.util.stream.InterfaceC0182o2
    public final boolean n() {
        this.b = true;
        return this.a.n();
    }
}
