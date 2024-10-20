package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.y2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0231y2 extends AbstractC0119c {
    private final AbstractC0114b j;
    private final IntFunction k;
    private final long l;
    private final long m;
    private long n;
    private volatile boolean o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0231y2(AbstractC0114b abstractC0114b, AbstractC0114b abstractC0114b2, Spliterator spliterator, IntFunction intFunction, long j, long j2) {
        super(abstractC0114b2, spliterator);
        this.j = abstractC0114b;
        this.k = intFunction;
        this.l = j;
        this.m = j2;
    }

    private long k(long j) {
        if (this.o) {
            return this.n;
        }
        C0231y2 c0231y2 = (C0231y2) this.d;
        C0231y2 c0231y22 = (C0231y2) this.e;
        if (c0231y2 != null && c0231y22 != null) {
            long k = c0231y2.k(j);
            if (k < j) {
                return k + c0231y22.k(j);
            }
            return k;
        }
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0129e
    public final Object a() {
        long j = -1;
        if (d()) {
            if (EnumC0143g3.SIZED.D(this.j.c)) {
                j = this.j.C(this.b);
            }
            A0 J = this.j.J(j, this.k);
            InterfaceC0182o2 N = this.j.N(this.a.G(), J);
            AbstractC0114b abstractC0114b = this.a;
            abstractC0114b.r(this.b, abstractC0114b.S(N));
            return J.a();
        }
        A0 J2 = this.j.J(-1L, this.k);
        if (this.l == 0) {
            InterfaceC0182o2 N2 = this.j.N(this.a.G(), J2);
            AbstractC0114b abstractC0114b2 = this.a;
            abstractC0114b2.r(this.b, abstractC0114b2.S(N2));
        } else {
            this.a.R(this.b, J2);
        }
        I0 a = J2.a();
        this.n = a.count();
        this.o = true;
        this.b = null;
        return a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0129e
    public final AbstractC0129e e(Spliterator spliterator) {
        return new C0231y2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0119c
    protected final void h() {
        this.i = true;
        if (this.o) {
            f(AbstractC0219w0.K(this.j.E()));
        }
    }

    @Override // j$.util.stream.AbstractC0119c
    protected final Object j() {
        return AbstractC0219w0.K(this.j.E());
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e9, code lost:
    
        if (r2 >= r0) goto L51;
     */
    @Override // j$.util.stream.AbstractC0129e, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r14) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.C0231y2.onCompletion(java.util.concurrent.CountedCompleter):void");
    }

    C0231y2(C0231y2 c0231y2, Spliterator spliterator) {
        super(c0231y2, spliterator);
        this.j = c0231y2.j;
        this.k = c0231y2.k;
        this.l = c0231y2.l;
        this.m = c0231y2.m;
    }
}
