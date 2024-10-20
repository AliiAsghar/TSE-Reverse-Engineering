package j$.util.stream;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C0203t implements DoubleConsumer {
    public final /* synthetic */ InterfaceC0182o2 a;

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.a.accept(d);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.nio.channels.c.a(this, doubleConsumer);
    }
}
