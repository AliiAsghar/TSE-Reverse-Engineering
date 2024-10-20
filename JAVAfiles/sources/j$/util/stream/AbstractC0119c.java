package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0119c extends AbstractC0129e {
    protected final AtomicReference h;
    protected volatile boolean i;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0119c(AbstractC0114b abstractC0114b, Spliterator spliterator) {
        super(abstractC0114b, spliterator);
        this.h = new AtomicReference(null);
    }

    @Override // j$.util.stream.AbstractC0129e
    public final Object c() {
        if (d()) {
            Object obj = this.h.get();
            if (obj == null) {
                return j();
            }
            return obj;
        }
        return super.c();
    }

    @Override // j$.util.stream.AbstractC0129e, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object obj;
        Spliterator trySplit;
        CountedCompleter completer;
        Spliterator spliterator = this.b;
        long estimateSize = spliterator.estimateSize();
        long j = this.c;
        if (j == 0) {
            j = AbstractC0129e.g(estimateSize);
            this.c = j;
        }
        AtomicReference atomicReference = this.h;
        boolean z = false;
        AbstractC0119c abstractC0119c = this;
        while (true) {
            obj = atomicReference.get();
            if (obj != null) {
                break;
            }
            boolean z2 = abstractC0119c.i;
            if (!z2) {
                completer = abstractC0119c.getCompleter();
                while (true) {
                    AbstractC0119c abstractC0119c2 = (AbstractC0119c) ((AbstractC0129e) completer);
                    if (z2 || abstractC0119c2 == null) {
                        break;
                    }
                    z2 = abstractC0119c2.i;
                    completer = abstractC0119c2.getCompleter();
                }
            }
            if (z2) {
                obj = abstractC0119c.j();
                break;
            }
            if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            AbstractC0119c abstractC0119c3 = (AbstractC0119c) abstractC0119c.e(trySplit);
            abstractC0119c.d = abstractC0119c3;
            AbstractC0119c abstractC0119c4 = (AbstractC0119c) abstractC0119c.e(spliterator);
            abstractC0119c.e = abstractC0119c4;
            abstractC0119c.setPendingCount(1);
            if (z) {
                spliterator = trySplit;
                abstractC0119c = abstractC0119c3;
                abstractC0119c3 = abstractC0119c4;
            } else {
                abstractC0119c = abstractC0119c4;
            }
            z = !z;
            abstractC0119c3.fork();
            estimateSize = spliterator.estimateSize();
        }
        obj = abstractC0119c.a();
        abstractC0119c.f(obj);
        abstractC0119c.tryComplete();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0129e
    public final void f(Object obj) {
        if (d()) {
            if (obj != null) {
                j$.util.concurrent.n.a(this.h, null, obj);
                return;
            }
            return;
        }
        super.f(obj);
    }

    @Override // j$.util.stream.AbstractC0129e, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return c();
    }

    protected void h() {
        this.i = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i() {
        CountedCompleter completer;
        CountedCompleter completer2;
        completer = getCompleter();
        AbstractC0119c abstractC0119c = (AbstractC0119c) ((AbstractC0129e) completer);
        AbstractC0119c abstractC0119c2 = this;
        while (abstractC0119c != null) {
            if (abstractC0119c.d == abstractC0119c2) {
                AbstractC0119c abstractC0119c3 = (AbstractC0119c) abstractC0119c.e;
                if (!abstractC0119c3.i) {
                    abstractC0119c3.h();
                }
            }
            completer2 = abstractC0119c.getCompleter();
            AbstractC0119c abstractC0119c4 = (AbstractC0119c) ((AbstractC0129e) completer2);
            abstractC0119c2 = abstractC0119c;
            abstractC0119c = abstractC0119c4;
        }
    }

    protected abstract Object j();

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0119c(AbstractC0119c abstractC0119c, Spliterator spliterator) {
        super(abstractC0119c, spliterator);
        this.h = abstractC0119c.h;
    }
}
