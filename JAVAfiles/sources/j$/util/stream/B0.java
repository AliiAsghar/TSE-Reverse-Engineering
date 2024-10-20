package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes5.dex */
public final /* synthetic */ class B0 implements DoubleConsumer {
    public final /* synthetic */ int a;

    public /* synthetic */ B0(int i) {
        this.a = i;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        int i = this.a;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.a) {
            case 0:
                return j$.nio.channels.c.a(this, doubleConsumer);
            default:
                return j$.nio.channels.c.a(this, doubleConsumer);
        }
    }

    private final void accept$j$$util$stream$Node$OfDouble$$ExternalSyntheticLambda0(double d) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfDouble$$ExternalSyntheticLambda0(double d) {
    }
}
