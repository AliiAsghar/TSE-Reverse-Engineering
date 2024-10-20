package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.t1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0205t1 extends AbstractC0210u1 {
    private final Object[] h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0205t1(Spliterator spliterator, AbstractC0114b abstractC0114b, Object[] objArr) {
        super(spliterator, abstractC0114b, objArr.length);
        this.h = objArr;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f;
        if (i < this.g) {
            Object[] objArr = this.h;
            this.f = i + 1;
            objArr[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f));
    }

    @Override // j$.util.stream.AbstractC0210u1
    final AbstractC0210u1 b(Spliterator spliterator, long j, long j2) {
        return new C0205t1(this, spliterator, j, j2);
    }

    C0205t1(C0205t1 c0205t1, Spliterator spliterator, long j, long j2) {
        super(c0205t1, spliterator, j, j2, c0205t1.h.length);
        this.h = c0205t1.h;
    }
}
