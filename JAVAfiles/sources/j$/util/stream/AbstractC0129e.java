package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0129e extends CountedCompleter {
    private static final int g;
    protected final AbstractC0114b a;
    protected Spliterator b;
    protected long c;
    protected AbstractC0129e d;
    protected AbstractC0129e e;
    private Object f;

    static {
        int commonPoolParallelism;
        commonPoolParallelism = ForkJoinPool.getCommonPoolParallelism();
        g = commonPoolParallelism << 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0129e(AbstractC0114b abstractC0114b, Spliterator spliterator) {
        super(null);
        this.a = abstractC0114b;
        this.b = spliterator;
        this.c = 0L;
    }

    public static int b() {
        return g;
    }

    public static long g(long j) {
        long j2 = j / g;
        if (j2 <= 0) {
            return 1L;
        }
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object a();

    /* JADX INFO: Access modifiers changed from: protected */
    public Object c() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.b;
        long estimateSize = spliterator.estimateSize();
        long j = this.c;
        if (j == 0) {
            j = g(estimateSize);
            this.c = j;
        }
        boolean z = false;
        AbstractC0129e abstractC0129e = this;
        while (estimateSize > j && (trySplit = spliterator.trySplit()) != null) {
            AbstractC0129e e = abstractC0129e.e(trySplit);
            abstractC0129e.d = e;
            AbstractC0129e e2 = abstractC0129e.e(spliterator);
            abstractC0129e.e = e2;
            abstractC0129e.setPendingCount(1);
            if (z) {
                spliterator = trySplit;
                abstractC0129e = e;
                e = e2;
            } else {
                abstractC0129e = e2;
            }
            z = !z;
            e.fork();
            estimateSize = spliterator.estimateSize();
        }
        abstractC0129e.f(abstractC0129e.a());
        abstractC0129e.tryComplete();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean d() {
        CountedCompleter completer;
        completer = getCompleter();
        if (((AbstractC0129e) completer) == null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract AbstractC0129e e(Spliterator spliterator);

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(Object obj) {
        this.f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.b = null;
        this.e = null;
        this.d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected final void setRawResult(Object obj) {
        if (obj == null) {
        } else {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0129e(AbstractC0129e abstractC0129e, Spliterator spliterator) {
        super(abstractC0129e);
        this.b = spliterator;
        this.a = abstractC0129e.a;
        this.c = abstractC0129e.c;
    }
}
