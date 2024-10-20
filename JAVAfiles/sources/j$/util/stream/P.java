package j$.util.stream;

import java.util.function.Consumer;

/* loaded from: classes5.dex */
final class P extends Q {
    final Consumer b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P(Consumer consumer, boolean z) {
        super(z);
        this.b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.b.accept(obj);
    }
}
