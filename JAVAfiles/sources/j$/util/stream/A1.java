package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.LongConsumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes5.dex */
final class A1 extends U1 implements T1, InterfaceC0177n2 {
    final /* synthetic */ Supplier b;
    final /* synthetic */ ObjLongConsumer c;
    final /* synthetic */ C0208u d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A1(Supplier supplier, ObjLongConsumer objLongConsumer, C0208u c0208u) {
        this.b = supplier;
        this.c = objLongConsumer;
        this.d = c0208u;
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
        this.a = this.d.apply(this.a, ((A1) t1).a);
    }

    @Override // j$.util.stream.InterfaceC0177n2
    public final /* synthetic */ void j(Long l) {
        AbstractC0219w0.i(this, l);
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public final void l(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public final /* synthetic */ void accept(int i) {
        AbstractC0219w0.k();
        throw null;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void q(Object obj) {
        j((Long) obj);
    }

    @Override // j$.util.stream.InterfaceC0182o2, j$.util.stream.InterfaceC0177n2, java.util.function.LongConsumer
    public final void accept(long j) {
        this.c.accept(this.a, j);
    }
}
