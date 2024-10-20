package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.h2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0147h2 implements InterfaceC0167l2 {
    protected final InterfaceC0182o2 a;

    public AbstractC0147h2(InterfaceC0182o2 interfaceC0182o2) {
        interfaceC0182o2.getClass();
        this.a = interfaceC0182o2;
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public final /* synthetic */ void accept(int i) {
        AbstractC0219w0.k();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public void k() {
        this.a.k();
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public void l(long j) {
        this.a.l(j);
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public boolean n() {
        return this.a.n();
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
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        q((Double) obj);
    }
}
