package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class c4 extends AbstractC0129e {
    private final AbstractC0114b h;
    private final IntFunction i;
    private final boolean j;
    private long k;
    private long l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c4(AbstractC0114b abstractC0114b, AbstractC0114b abstractC0114b2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC0114b2, spliterator);
        this.h = abstractC0114b;
        this.i = intFunction;
        this.j = EnumC0143g3.ORDERED.y(abstractC0114b2.G());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0129e
    public final Object a() {
        long j;
        boolean z;
        boolean d = d();
        if (!d && this.j && EnumC0143g3.SIZED.D(this.h.c)) {
            j = this.h.C(this.b);
        } else {
            j = -1;
        }
        A0 J = this.a.J(j, this.i);
        a4 a4Var = (a4) this.h;
        if (this.j && !d) {
            z = true;
        } else {
            z = false;
        }
        b4 i = a4Var.i(J, z);
        this.a.R(this.b, i);
        I0 a = J.a();
        this.k = a.count();
        this.l = i.f();
        return a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0129e
    public final AbstractC0129e e(Spliterator spliterator) {
        return new c4(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0129e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        I0 I;
        AbstractC0129e abstractC0129e = this.d;
        if (abstractC0129e != null) {
            if (this.j) {
                c4 c4Var = (c4) abstractC0129e;
                long j = c4Var.l;
                this.l = j;
                if (j == c4Var.k) {
                    this.l = j + ((c4) this.e).l;
                }
            }
            c4 c4Var2 = (c4) abstractC0129e;
            long j2 = c4Var2.k;
            c4 c4Var3 = (c4) this.e;
            this.k = j2 + c4Var3.k;
            if (c4Var2.k == 0) {
                I = (I0) c4Var3.c();
            } else if (c4Var3.k == 0) {
                I = (I0) c4Var2.c();
            } else {
                I = AbstractC0219w0.I(this.h.E(), (I0) ((c4) this.d).c(), (I0) ((c4) this.e).c());
            }
            I0 i0 = I;
            if (d() && this.j) {
                i0 = i0.h(this.l, i0.count(), this.i);
            }
            f(i0);
        }
        super.onCompletion(countedCompleter);
    }

    c4(c4 c4Var, Spliterator spliterator) {
        super(c4Var, spliterator);
        this.h = c4Var.h;
        this.i = c4Var.i;
        this.j = c4Var.j;
    }
}
