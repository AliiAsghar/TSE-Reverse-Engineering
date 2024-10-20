package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.LongConsumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.j2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0157j2 implements InterfaceC0177n2 {
    protected final InterfaceC0182o2 a;

    public AbstractC0157j2(InterfaceC0182o2 interfaceC0182o2) {
        interfaceC0182o2.getClass();
        this.a = interfaceC0182o2;
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public final /* synthetic */ void accept(double d) {
        AbstractC0219w0.a();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0177n2
    public final /* synthetic */ void j(Long l) {
        AbstractC0219w0.i(this, l);
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

    @Override // j$.util.stream.InterfaceC0182o2
    public final /* synthetic */ void accept(int i) {
        AbstractC0219w0.k();
        throw null;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        j((Long) obj);
    }
}
