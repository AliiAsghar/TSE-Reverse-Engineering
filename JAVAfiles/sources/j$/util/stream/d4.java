package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class d4 extends AbstractC0119c {
    private final AbstractC0114b j;
    private final IntFunction k;
    private final boolean l;
    private long m;
    private boolean n;
    private volatile boolean o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d4(AbstractC0114b abstractC0114b, AbstractC0114b abstractC0114b2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC0114b2, spliterator);
        this.j = abstractC0114b;
        this.k = intFunction;
        this.l = EnumC0143g3.ORDERED.y(abstractC0114b2.G());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0129e
    public final Object a() {
        A0 J = this.a.J(-1L, this.k);
        InterfaceC0182o2 N = this.j.N(this.a.G(), J);
        AbstractC0114b abstractC0114b = this.a;
        boolean r = abstractC0114b.r(this.b, abstractC0114b.S(N));
        this.n = r;
        if (r) {
            i();
        }
        I0 a = J.a();
        this.m = a.count();
        return a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0129e
    public final AbstractC0129e e(Spliterator spliterator) {
        return new d4(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0119c
    protected final void h() {
        this.i = true;
        if (this.l && this.o) {
            f(AbstractC0219w0.K(this.j.E()));
        }
    }

    @Override // j$.util.stream.AbstractC0119c
    protected final Object j() {
        return AbstractC0219w0.K(this.j.E());
    }

    @Override // j$.util.stream.AbstractC0129e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        Object I;
        AbstractC0129e abstractC0129e = this.d;
        if (abstractC0129e != null) {
            this.n = ((d4) abstractC0129e).n | ((d4) this.e).n;
            if (this.l && this.i) {
                this.m = 0L;
                I = AbstractC0219w0.K(this.j.E());
            } else {
                if (this.l) {
                    d4 d4Var = (d4) this.d;
                    if (d4Var.n) {
                        this.m = d4Var.m;
                        I = (I0) d4Var.c();
                    }
                }
                d4 d4Var2 = (d4) this.d;
                long j = d4Var2.m;
                d4 d4Var3 = (d4) this.e;
                this.m = j + d4Var3.m;
                if (d4Var2.m == 0) {
                    I = (I0) d4Var3.c();
                } else if (d4Var3.m == 0) {
                    I = (I0) d4Var2.c();
                } else {
                    I = AbstractC0219w0.I(this.j.E(), (I0) ((d4) this.d).c(), (I0) ((d4) this.e).c());
                }
            }
            f(I);
        }
        this.o = true;
        super.onCompletion(countedCompleter);
    }

    d4(d4 d4Var, Spliterator spliterator) {
        super(d4Var, spliterator);
        this.j = d4Var.j;
        this.k = d4Var.k;
        this.l = d4Var.l;
    }
}
