package j$.util.stream;

import j$.util.OptionalInt;
import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* loaded from: classes5.dex */
final class P1 implements T1, InterfaceC0172m2 {
    private boolean a;
    private int b;
    final /* synthetic */ IntBinaryOperator c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P1(IntBinaryOperator intBinaryOperator) {
        this.c = intBinaryOperator;
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public final /* synthetic */ void accept(double d) {
        AbstractC0219w0.a();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.T1
    public final void g(T1 t1) {
        P1 p1 = (P1) t1;
        if (!p1.a) {
            accept(p1.b);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return OptionalInt.empty();
        }
        return OptionalInt.of(this.b);
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public final void l(long j) {
        this.a = true;
        this.b = 0;
    }

    @Override // j$.util.stream.InterfaceC0172m2
    public final /* synthetic */ void m(Integer num) {
        AbstractC0219w0.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC0182o2, j$.util.stream.InterfaceC0177n2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        AbstractC0219w0.l();
        throw null;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void q(Object obj) {
        m((Integer) obj);
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public final void accept(int i) {
        if (this.a) {
            this.a = false;
            this.b = i;
        } else {
            this.b = this.c.applyAsInt(this.b, i);
        }
    }
}
