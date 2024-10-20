package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.a2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0112a2 extends AbstractC0129e {
    private final AbstractC0219w0 h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0112a2(AbstractC0219w0 abstractC0219w0, AbstractC0114b abstractC0114b, Spliterator spliterator) {
        super(abstractC0114b, spliterator);
        this.h = abstractC0219w0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0129e
    public final Object a() {
        AbstractC0114b abstractC0114b = this.a;
        T1 Z = this.h.Z();
        abstractC0114b.R(this.b, Z);
        return Z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0129e
    public final AbstractC0129e e(Spliterator spliterator) {
        return new C0112a2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0129e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0129e abstractC0129e = this.d;
        if (abstractC0129e != null) {
            T1 t1 = (T1) ((C0112a2) abstractC0129e).c();
            t1.g((T1) ((C0112a2) this.e).c());
            f(t1);
        }
        super.onCompletion(countedCompleter);
    }

    C0112a2(C0112a2 c0112a2, Spliterator spliterator) {
        super(c0112a2, spliterator);
        this.h = c0112a2.h;
    }
}
