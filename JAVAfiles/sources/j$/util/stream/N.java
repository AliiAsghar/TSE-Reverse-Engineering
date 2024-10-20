package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class N extends Q implements InterfaceC0172m2 {
    final IntConsumer b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N(IntConsumer intConsumer, boolean z) {
        super(z);
        this.b = intConsumer;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void q(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC0172m2
    public final /* synthetic */ void m(Integer num) {
        AbstractC0219w0.g(this, num);
    }

    @Override // j$.util.stream.Q, j$.util.stream.InterfaceC0182o2
    public final void accept(int i) {
        this.b.accept(i);
    }
}
