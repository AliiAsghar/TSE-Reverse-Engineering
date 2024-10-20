package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.q1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0191q1 extends AbstractC0210u1 implements InterfaceC0167l2 {
    private final double[] h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0191q1(Spliterator spliterator, AbstractC0114b abstractC0114b, double[] dArr) {
        super(spliterator, abstractC0114b, dArr.length);
        this.h = dArr;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void q(Object obj) {
        q((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.nio.channels.c.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.AbstractC0210u1
    final AbstractC0210u1 b(Spliterator spliterator, long j, long j2) {
        return new C0191q1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.InterfaceC0167l2
    public final /* synthetic */ void q(Double d) {
        AbstractC0219w0.e(this, d);
    }

    @Override // j$.util.stream.AbstractC0210u1, j$.util.stream.InterfaceC0182o2
    public final void accept(double d) {
        int i = this.f;
        if (i < this.g) {
            double[] dArr = this.h;
            this.f = i + 1;
            dArr[i] = d;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f));
    }

    C0191q1(C0191q1 c0191q1, Spliterator spliterator, long j, long j2) {
        super(c0191q1, spliterator, j, j2, c0191q1.h.length);
        this.h = c0191q1.h;
    }
}
