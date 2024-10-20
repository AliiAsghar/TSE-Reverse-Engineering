package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.r1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0195r1 extends AbstractC0210u1 implements InterfaceC0172m2 {
    private final int[] h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0195r1(Spliterator spliterator, AbstractC0114b abstractC0114b, int[] iArr) {
        super(spliterator, abstractC0114b, iArr.length);
        this.h = iArr;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void q(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.AbstractC0210u1
    final AbstractC0210u1 b(Spliterator spliterator, long j, long j2) {
        return new C0195r1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.InterfaceC0172m2
    public final /* synthetic */ void m(Integer num) {
        AbstractC0219w0.g(this, num);
    }

    @Override // j$.util.stream.AbstractC0210u1, j$.util.stream.InterfaceC0182o2
    public final void accept(int i) {
        int i2 = this.f;
        if (i2 < this.g) {
            int[] iArr = this.h;
            this.f = i2 + 1;
            iArr[i2] = i;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f));
    }

    C0195r1(C0195r1 c0195r1, Spliterator spliterator, long j, long j2) {
        super(c0195r1, spliterator, j, j2, c0195r1.h.length);
        this.h = c0195r1.h;
    }
}
