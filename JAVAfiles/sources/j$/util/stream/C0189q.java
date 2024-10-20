package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C0189q extends AbstractC0162k2 {
    public final /* synthetic */ int b = 2;
    boolean c;
    Object d;

    public /* synthetic */ C0189q(InterfaceC0182o2 interfaceC0182o2) {
        super(interfaceC0182o2);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                InterfaceC0182o2 interfaceC0182o2 = this.a;
                if (obj == null) {
                    if (!this.c) {
                        this.c = true;
                        this.d = null;
                        interfaceC0182o2.accept((InterfaceC0182o2) null);
                        return;
                    }
                    return;
                }
                Object obj2 = this.d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.d = obj;
                    interfaceC0182o2.accept((InterfaceC0182o2) obj);
                    return;
                }
                return;
            case 1:
                Stream stream = (Stream) ((C0127d2) this.d).n.apply(obj);
                if (stream != null) {
                    try {
                        boolean z = this.c;
                        InterfaceC0182o2 interfaceC0182o22 = this.a;
                        if (!z) {
                            ((Stream) stream.sequential()).forEach(interfaceC0182o22);
                        } else {
                            Spliterator<T> spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!interfaceC0182o22.n() && spliterator.tryAdvance(interfaceC0182o22)) {
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            stream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.c) {
                    boolean test = ((T3) this.d).m.test(obj);
                    this.c = test;
                    if (test) {
                        this.a.accept((InterfaceC0182o2) obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0162k2, j$.util.stream.InterfaceC0182o2
    public void k() {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                this.a.k();
                return;
            default:
                super.k();
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0162k2, j$.util.stream.InterfaceC0182o2
    public final void l(long j) {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
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
    public boolean n() {
        switch (this.b) {
            case 1:
                this.c = true;
                return this.a.n();
            case 2:
                if (this.c && !this.a.n()) {
                    return false;
                }
                return true;
            default:
                return super.n();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0189q(T3 t3, InterfaceC0182o2 interfaceC0182o2) {
        super(interfaceC0182o2);
        this.d = t3;
        this.c = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0189q(C0127d2 c0127d2, InterfaceC0182o2 interfaceC0182o2) {
        super(interfaceC0182o2);
        this.d = c0127d2;
    }
}
