package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0114b implements BaseStream {
    private final AbstractC0114b a;
    private final AbstractC0114b b;
    protected final int c;
    private AbstractC0114b d;
    private int e;
    private int f;
    private Spliterator g;
    private boolean h;
    private boolean i;
    private Runnable j;
    private boolean k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0114b(Spliterator spliterator, int i, boolean z) {
        this.b = null;
        this.g = spliterator;
        this.a = this;
        int i2 = EnumC0143g3.g & i;
        this.c = i2;
        this.f = (~(i2 << 1)) & EnumC0143g3.l;
        this.e = 0;
        this.k = z;
    }

    private Spliterator O(int i) {
        int i2;
        int i3;
        AbstractC0114b abstractC0114b = this.a;
        Spliterator spliterator = abstractC0114b.g;
        if (spliterator != null) {
            abstractC0114b.g = null;
            if (abstractC0114b.k && abstractC0114b.i) {
                AbstractC0114b abstractC0114b2 = abstractC0114b.d;
                int i4 = 1;
                while (abstractC0114b != this) {
                    int i5 = abstractC0114b2.c;
                    if (abstractC0114b2.M()) {
                        if (EnumC0143g3.SHORT_CIRCUIT.y(i5)) {
                            i5 &= ~EnumC0143g3.u;
                        }
                        spliterator = abstractC0114b2.L(abstractC0114b, spliterator);
                        if (spliterator.hasCharacteristics(64)) {
                            i2 = (~EnumC0143g3.t) & i5;
                            i3 = EnumC0143g3.s;
                        } else {
                            i2 = (~EnumC0143g3.s) & i5;
                            i3 = EnumC0143g3.t;
                        }
                        i5 = i2 | i3;
                        i4 = 0;
                    }
                    abstractC0114b2.e = i4;
                    abstractC0114b2.f = EnumC0143g3.n(i5, abstractC0114b.f);
                    i4++;
                    AbstractC0114b abstractC0114b3 = abstractC0114b2;
                    abstractC0114b2 = abstractC0114b2.d;
                    abstractC0114b = abstractC0114b3;
                }
            }
            if (i != 0) {
                this.f = EnumC0143g3.n(i, this.f);
            }
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    abstract I0 B(AbstractC0114b abstractC0114b, Spliterator spliterator, boolean z, IntFunction intFunction);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long C(Spliterator spliterator) {
        if (EnumC0143g3.SIZED.y(this.f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    abstract boolean D(Spliterator spliterator, InterfaceC0182o2 interfaceC0182o2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract EnumC0148h3 E();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final EnumC0148h3 F() {
        AbstractC0114b abstractC0114b = this;
        while (abstractC0114b.e > 0) {
            abstractC0114b = abstractC0114b.b;
        }
        return abstractC0114b.E();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int G() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean H() {
        return EnumC0143g3.ORDERED.y(this.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Spliterator I() {
        return O(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract A0 J(long j, IntFunction intFunction);

    I0 K(AbstractC0114b abstractC0114b, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    Spliterator L(AbstractC0114b abstractC0114b, Spliterator spliterator) {
        return K(abstractC0114b, spliterator, new C0159k(26)).spliterator();
    }

    abstract boolean M();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract InterfaceC0182o2 N(int i, InterfaceC0182o2 interfaceC0182o2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Spliterator P() {
        AbstractC0114b abstractC0114b = this.a;
        if (this == abstractC0114b) {
            if (!this.h) {
                this.h = true;
                Spliterator spliterator = abstractC0114b.g;
                if (spliterator != null) {
                    abstractC0114b.g = null;
                    return spliterator;
                }
                throw new IllegalStateException("source already consumed or closed");
            }
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        throw new IllegalStateException();
    }

    abstract Spliterator Q(AbstractC0114b abstractC0114b, Supplier supplier, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final InterfaceC0182o2 R(Spliterator spliterator, InterfaceC0182o2 interfaceC0182o2) {
        interfaceC0182o2.getClass();
        o(spliterator, S(interfaceC0182o2));
        return interfaceC0182o2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final InterfaceC0182o2 S(InterfaceC0182o2 interfaceC0182o2) {
        interfaceC0182o2.getClass();
        AbstractC0114b abstractC0114b = this;
        while (abstractC0114b.e > 0) {
            AbstractC0114b abstractC0114b2 = abstractC0114b.b;
            interfaceC0182o2 = abstractC0114b.N(abstractC0114b2.f, interfaceC0182o2);
            abstractC0114b = abstractC0114b2;
        }
        return interfaceC0182o2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Spliterator T(Spliterator spliterator) {
        if (this.e == 0) {
            return spliterator;
        }
        return Q(this, new C0109a(12, spliterator), this.a.k);
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final void close() {
        this.h = true;
        this.g = null;
        AbstractC0114b abstractC0114b = this.a;
        Runnable runnable = abstractC0114b.j;
        if (runnable != null) {
            abstractC0114b.j = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.BaseStream
    public final boolean isParallel() {
        return this.a.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(Spliterator spliterator, InterfaceC0182o2 interfaceC0182o2) {
        interfaceC0182o2.getClass();
        if (!EnumC0143g3.SHORT_CIRCUIT.y(this.f)) {
            interfaceC0182o2.l(spliterator.getExactSizeIfKnown());
            spliterator.forEachRemaining(interfaceC0182o2);
            interfaceC0182o2.k();
            return;
        }
        r(spliterator, interfaceC0182o2);
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream onClose(Runnable runnable) {
        if (!this.h) {
            runnable.getClass();
            AbstractC0114b abstractC0114b = this.a;
            Runnable runnable2 = abstractC0114b.j;
            if (runnable2 != null) {
                runnable = new L3(0, runnable2, runnable);
            }
            abstractC0114b.j = runnable;
            return this;
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final BaseStream parallel() {
        this.a.k = true;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean r(Spliterator spliterator, InterfaceC0182o2 interfaceC0182o2) {
        AbstractC0114b abstractC0114b = this;
        while (abstractC0114b.e > 0) {
            abstractC0114b = abstractC0114b.b;
        }
        interfaceC0182o2.l(spliterator.getExactSizeIfKnown());
        boolean D = abstractC0114b.D(spliterator, interfaceC0182o2);
        interfaceC0182o2.k();
        return D;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final I0 s(Spliterator spliterator, boolean z, IntFunction intFunction) {
        if (this.a.k) {
            return B(this, spliterator, z, intFunction);
        }
        A0 J = J(C(spliterator), intFunction);
        R(spliterator, J);
        return J.a();
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final BaseStream sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.BaseStream
    public Spliterator spliterator() {
        if (!this.h) {
            this.h = true;
            AbstractC0114b abstractC0114b = this.a;
            if (this == abstractC0114b) {
                Spliterator spliterator = abstractC0114b.g;
                if (spliterator != null) {
                    abstractC0114b.g = null;
                    return spliterator;
                }
                throw new IllegalStateException("source already consumed or closed");
            }
            return Q(this, new C0109a(0, this), abstractC0114b.k);
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object v(P3 p3) {
        if (!this.h) {
            this.h = true;
            if (this.a.k) {
                return p3.c(this, O(p3.d()));
            }
            return p3.b(this, O(p3.d()));
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final I0 z(IntFunction intFunction) {
        AbstractC0114b abstractC0114b;
        if (!this.h) {
            this.h = true;
            if (this.a.k && (abstractC0114b = this.b) != null && M()) {
                this.e = 0;
                return K(abstractC0114b, abstractC0114b.O(0), intFunction);
            }
            return s(O(0), true, intFunction);
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0114b(AbstractC0114b abstractC0114b, int i) {
        if (!abstractC0114b.h) {
            abstractC0114b.h = true;
            abstractC0114b.d = this;
            this.b = abstractC0114b;
            this.c = EnumC0143g3.h & i;
            this.f = EnumC0143g3.n(i, abstractC0114b.f);
            AbstractC0114b abstractC0114b2 = abstractC0114b.a;
            this.a = abstractC0114b2;
            if (M()) {
                abstractC0114b2.i = true;
            }
            this.e = abstractC0114b.e + 1;
            return;
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }
}
