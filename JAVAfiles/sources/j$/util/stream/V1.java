package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes5.dex */
final class V1 extends Z1 implements InterfaceC0167l2 {
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void q(Object obj) {
        q((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.nio.channels.c.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC0167l2
    public final /* synthetic */ void q(Double d) {
        AbstractC0219w0.e(this, d);
    }

    @Override // j$.util.stream.Z1, j$.util.stream.InterfaceC0182o2
    public final void accept(double d) {
        this.b++;
    }
}
