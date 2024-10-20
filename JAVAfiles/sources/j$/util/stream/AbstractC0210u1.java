package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.u1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
abstract class AbstractC0210u1 extends CountedCompleter implements InterfaceC0182o2 {
    protected final Spliterator a;
    protected final AbstractC0114b b;
    protected final long c;
    protected long d;
    protected long e;
    protected int f;
    protected int g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0210u1(Spliterator spliterator, AbstractC0114b abstractC0114b, int i) {
        this.a = spliterator;
        this.b = abstractC0114b;
        this.c = AbstractC0129e.g(spliterator.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    public /* synthetic */ void accept(double d) {
        AbstractC0219w0.a();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    abstract AbstractC0210u1 b(Spliterator spliterator, long j, long j2);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.a;
        AbstractC0210u1 abstractC0210u1 = this;
        while (spliterator.estimateSize() > abstractC0210u1.c && (trySplit = spliterator.trySplit()) != null) {
            abstractC0210u1.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            abstractC0210u1.b(trySplit, abstractC0210u1.d, estimateSize).fork();
            abstractC0210u1 = abstractC0210u1.b(spliterator, abstractC0210u1.d + estimateSize, abstractC0210u1.e - estimateSize);
        }
        abstractC0210u1.b.R(spliterator, abstractC0210u1);
        abstractC0210u1.propagateCompletion();
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public final void l(long j) {
        long j2 = this.e;
        if (j <= j2) {
            int i = (int) this.d;
            this.f = i;
            this.g = i + ((int) j2);
            return;
        }
        throw new IllegalStateException("size passed to Sink.begin exceeds array length");
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public final /* synthetic */ boolean n() {
        return false;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC0219w0.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        AbstractC0219w0.l();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0210u1(AbstractC0210u1 abstractC0210u1, Spliterator spliterator, long j, long j2, int i) {
        super(abstractC0210u1);
        this.a = spliterator;
        this.b = abstractC0210u1.b;
        this.c = abstractC0210u1.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }
}
