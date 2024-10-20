package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes5.dex */
final class U extends CountedCompleter {
    private Spliterator a;
    private final InterfaceC0182o2 b;
    private final AbstractC0114b c;
    private long d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public U(AbstractC0114b abstractC0114b, Spliterator spliterator, InterfaceC0182o2 interfaceC0182o2) {
        super(null);
        this.b = interfaceC0182o2;
        this.c = abstractC0114b;
        this.a = spliterator;
        this.d = 0L;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.a;
        long estimateSize = spliterator.estimateSize();
        long j = this.d;
        if (j == 0) {
            j = AbstractC0129e.g(estimateSize);
            this.d = j;
        }
        boolean y = EnumC0143g3.SHORT_CIRCUIT.y(this.c.G());
        InterfaceC0182o2 interfaceC0182o2 = this.b;
        boolean z = false;
        U u = this;
        while (true) {
            if (y && interfaceC0182o2.n()) {
                break;
            }
            if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            U u2 = new U(u, trySplit);
            S.o(u);
            if (z) {
                spliterator = trySplit;
            } else {
                U u3 = u;
                u = u2;
                u2 = u3;
            }
            z = !z;
            u.fork();
            u = u2;
            estimateSize = spliterator.estimateSize();
        }
        u.c.o(spliterator, interfaceC0182o2);
        u.a = null;
        S.x(u);
    }

    U(U u, Spliterator spliterator) {
        super(u);
        this.a = spliterator;
        this.b = u.b;
        this.d = u.d;
        this.c = u.c;
    }
}
