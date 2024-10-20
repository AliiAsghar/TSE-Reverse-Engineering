package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes5.dex */
final class G1 extends U1 implements T1, InterfaceC0167l2 {
    final /* synthetic */ Supplier b;
    final /* synthetic */ ObjDoubleConsumer c;
    final /* synthetic */ C0208u d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public G1(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, C0208u c0208u) {
        this.b = supplier;
        this.c = objDoubleConsumer;
        this.d = c0208u;
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public final /* synthetic */ void accept(int i) {
        AbstractC0219w0.k();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.T1
    public final void g(T1 t1) {
        this.a = this.d.apply(this.a, ((G1) t1).a);
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

    @Override // j$.util.stream.InterfaceC0167l2
    public final /* synthetic */ void q(Double d) {
        AbstractC0219w0.e(this, d);
    }

    @Override // j$.util.stream.InterfaceC0182o2, j$.util.stream.InterfaceC0177n2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        AbstractC0219w0.l();
        throw null;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.nio.channels.c.a(this, doubleConsumer);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void q(Object obj) {
        q((Double) obj);
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public final void accept(double d) {
        this.c.accept(this.a, d);
    }
}
