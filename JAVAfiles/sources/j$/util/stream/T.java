package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes5.dex */
final class T extends CountedCompleter {
    private final AbstractC0114b a;
    private Spliterator b;
    private final long c;
    private final ConcurrentHashMap d;
    private final Q e;
    private final T f;
    private I0 g;

    /* JADX INFO: Access modifiers changed from: protected */
    public T(AbstractC0114b abstractC0114b, Spliterator spliterator, Q q) {
        super(null);
        this.a = abstractC0114b;
        this.b = spliterator;
        this.c = AbstractC0129e.g(spliterator.estimateSize());
        this.d = new ConcurrentHashMap(Math.max(16, AbstractC0129e.b() << 1));
        this.e = q;
        this.f = null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.b;
        long j = this.c;
        boolean z = false;
        T t = this;
        while (spliterator.estimateSize() > j && (trySplit = spliterator.trySplit()) != null) {
            T t2 = new T(t, trySplit, t.f);
            T t3 = new T(t, spliterator, t2);
            S.n(t);
            S.n(t3);
            t.d.put(t2, t3);
            if (t.f != null) {
                S.n(t2);
                if (t.d.replace(t.f, t, t2)) {
                    S.w(t);
                } else {
                    S.w(t2);
                }
            }
            if (z) {
                spliterator = trySplit;
                t = t2;
                t2 = t3;
            } else {
                t = t3;
            }
            z = !z;
            t2.fork();
        }
        if (S.a(t) > 0) {
            C0169m c0169m = new C0169m(25);
            AbstractC0114b abstractC0114b = t.a;
            A0 J = abstractC0114b.J(abstractC0114b.C(spliterator), c0169m);
            t.a.R(spliterator, J);
            t.g = J.a();
            t.b = null;
        }
        B.r(t);
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        I0 i0 = this.g;
        if (i0 != null) {
            i0.forEach(this.e);
            this.g = null;
        } else {
            Spliterator spliterator = this.b;
            if (spliterator != null) {
                this.a.R(spliterator, this.e);
                this.b = null;
            }
        }
        T t = (T) this.d.remove(this);
        if (t != null) {
            B.r(t);
        }
    }

    T(T t, Spliterator spliterator, T t2) {
        super(t);
        this.a = t.a;
        this.b = spliterator;
        this.c = t.c;
        this.d = t.d;
        this.e = t.e;
        this.f = t2;
    }
}
