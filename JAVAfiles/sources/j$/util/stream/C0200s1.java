package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.LongConsumer$CC;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.s1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0200s1 extends AbstractC0210u1 implements InterfaceC0177n2 {
    private final long[] h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0200s1(Spliterator spliterator, AbstractC0114b abstractC0114b, long[] jArr) {
        super(spliterator, abstractC0114b, jArr.length);
        this.h = jArr;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void q(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // j$.util.stream.AbstractC0210u1
    final AbstractC0210u1 b(Spliterator spliterator, long j, long j2) {
        return new C0200s1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.InterfaceC0177n2
    public final /* synthetic */ void j(Long l) {
        AbstractC0219w0.i(this, l);
    }

    @Override // j$.util.stream.AbstractC0210u1, j$.util.stream.InterfaceC0182o2, j$.util.stream.InterfaceC0177n2, java.util.function.LongConsumer
    public final void accept(long j) {
        int i = this.f;
        if (i < this.g) {
            long[] jArr = this.h;
            this.f = i + 1;
            jArr[i] = j;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f));
    }

    C0200s1(C0200s1 c0200s1, Spliterator spliterator, long j, long j2) {
        super(c0200s1, spliterator, j, j2, c0200s1.h.length);
        this.h = c0200s1.h;
    }
}
