package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* loaded from: classes5.dex */
public final /* synthetic */ class V implements IntConsumer {
    public final /* synthetic */ InterfaceC0182o2 a;

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.a.accept(i);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }
}
