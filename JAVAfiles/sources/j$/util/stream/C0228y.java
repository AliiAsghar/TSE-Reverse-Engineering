package j$.util.stream;

/* renamed from: j$.util.stream.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C0228y extends AbstractC0147h2 {
    boolean b;
    C0203t c;
    final /* synthetic */ C0223x d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0228y(C0223x c0223x, InterfaceC0182o2 interfaceC0182o2) {
        super(interfaceC0182o2);
        this.d = c0223x;
        this.c = new C0203t(interfaceC0182o2);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [j$.util.V] */
    @Override // j$.util.stream.InterfaceC0167l2, j$.util.stream.InterfaceC0182o2
    public final void accept(double d) {
        DoubleStream doubleStream = (DoubleStream) ((C0109a) this.d.n).apply(d);
        if (doubleStream != null) {
            try {
                boolean z = this.b;
                C0203t c0203t = this.c;
                if (!z) {
                    doubleStream.sequential().forEach(c0203t);
                } else {
                    ?? spliterator = doubleStream.sequential().spliterator();
                    while (!this.a.n() && spliterator.tryAdvance(c0203t)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    doubleStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (doubleStream != null) {
            doubleStream.close();
        }
    }

    @Override // j$.util.stream.AbstractC0147h2, j$.util.stream.InterfaceC0182o2
    public final void l(long j) {
        this.a.l(-1L);
    }

    @Override // j$.util.stream.AbstractC0147h2, j$.util.stream.InterfaceC0182o2
    public final boolean n() {
        this.b = true;
        return this.a.n();
    }
}
