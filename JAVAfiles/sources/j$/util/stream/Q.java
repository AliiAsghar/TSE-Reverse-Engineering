package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class Q implements P3, Q3 {
    private final boolean a;

    /* JADX INFO: Access modifiers changed from: protected */
    public Q(boolean z) {
        this.a = z;
    }

    public /* synthetic */ void accept(double d) {
        AbstractC0219w0.a();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.P3
    public final Object b(AbstractC0114b abstractC0114b, Spliterator spliterator) {
        abstractC0114b.o(spliterator, abstractC0114b.S(this));
        return null;
    }

    @Override // j$.util.stream.P3
    public final Object c(AbstractC0114b abstractC0114b, Spliterator spliterator) {
        if (this.a) {
            new T(abstractC0114b, spliterator, this).invoke();
            return null;
        }
        new U(abstractC0114b, spliterator, abstractC0114b.S(this)).invoke();
        return null;
    }

    @Override // j$.util.stream.P3
    public final int d() {
        if (this.a) {
            return 0;
        }
        return EnumC0143g3.r;
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public final /* synthetic */ void l(long j) {
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
}
