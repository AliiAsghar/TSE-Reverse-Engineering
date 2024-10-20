package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class P0 extends AbstractC0129e {
    protected final AbstractC0114b h;
    protected final LongFunction i;
    protected final BinaryOperator j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P0(AbstractC0114b abstractC0114b, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(abstractC0114b, spliterator);
        this.h = abstractC0114b;
        this.i = longFunction;
        this.j = binaryOperator;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0129e
    public final Object a() {
        A0 a0 = (A0) this.i.apply(this.h.C(this.b));
        this.h.R(this.b, a0);
        return a0.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0129e
    public final AbstractC0129e e(Spliterator spliterator) {
        return new P0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0129e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0129e abstractC0129e = this.d;
        if (abstractC0129e != null) {
            f((I0) this.j.apply((I0) ((P0) abstractC0129e).c(), (I0) ((P0) this.e).c()));
        }
        super.onCompletion(countedCompleter);
    }

    P0(P0 p0, Spliterator spliterator) {
        super(p0, spliterator);
        this.h = p0.h;
        this.i = p0.i;
        this.j = p0.j;
    }
}
