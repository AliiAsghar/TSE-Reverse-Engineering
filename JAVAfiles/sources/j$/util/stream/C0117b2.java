package j$.util.stream;

/* renamed from: j$.util.stream.b2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C0117b2 extends AbstractC0162k2 {
    public final /* synthetic */ int b = 1;
    boolean c;
    Object d;
    final /* synthetic */ AbstractC0114b e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0117b2(Y y, InterfaceC0182o2 interfaceC0182o2) {
        super(interfaceC0182o2);
        this.e = y;
        this.d = new V(interfaceC0182o2);
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [j$.util.Y] */
    /* JADX WARN: Type inference failed for: r0v26, types: [j$.util.V] */
    /* JADX WARN: Type inference failed for: r0v8, types: [j$.util.c0] */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                LongStream longStream = (LongStream) ((C0179o) ((C0165l0) this.e).n).apply(obj);
                if (longStream != null) {
                    try {
                        boolean z = this.c;
                        C0145h0 c0145h0 = (C0145h0) this.d;
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
                    return;
                }
                return;
            case 1:
                IntStream intStream = (IntStream) ((C0179o) ((Y) this.e).n).apply(obj);
                if (intStream != null) {
                    try {
                        boolean z2 = this.c;
                        V v = (V) this.d;
                        if (!z2) {
                            intStream.sequential().forEach(v);
                        } else {
                            ?? spliterator2 = intStream.sequential().spliterator();
                            while (!this.a.n() && spliterator2.tryAdvance(v)) {
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            intStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                DoubleStream doubleStream = (DoubleStream) ((C0179o) ((C0223x) this.e).n).apply(obj);
                if (doubleStream != null) {
                    try {
                        boolean z3 = this.c;
                        C0203t c0203t = (C0203t) this.d;
                        if (!z3) {
                            doubleStream.sequential().forEach(c0203t);
                        } else {
                            ?? spliterator3 = doubleStream.sequential().spliterator();
                            while (!this.a.n() && spliterator3.tryAdvance(c0203t)) {
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            doubleStream.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                }
                if (doubleStream != null) {
                    doubleStream.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0162k2, j$.util.stream.InterfaceC0182o2
    public final void l(long j) {
        switch (this.b) {
            case 0:
                this.a.l(-1L);
                return;
            case 1:
                this.a.l(-1L);
                return;
            default:
                this.a.l(-1L);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0162k2, j$.util.stream.InterfaceC0182o2
    public final boolean n() {
        switch (this.b) {
            case 0:
                this.c = true;
                return this.a.n();
            case 1:
                this.c = true;
                return this.a.n();
            default:
                this.c = true;
                return this.a.n();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0117b2(C0223x c0223x, InterfaceC0182o2 interfaceC0182o2) {
        super(interfaceC0182o2);
        this.e = c0223x;
        this.d = new C0203t(interfaceC0182o2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0117b2(C0165l0 c0165l0, InterfaceC0182o2 interfaceC0182o2) {
        super(interfaceC0182o2);
        this.e = c0165l0;
        this.d = new C0145h0(interfaceC0182o2);
    }
}
