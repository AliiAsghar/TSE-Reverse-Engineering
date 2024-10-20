package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.w3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C0222w3 extends AbstractC0153i3 implements j$.util.c0 {
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.X2, j$.util.stream.d, java.util.function.LongConsumer] */
    @Override // j$.util.stream.AbstractC0153i3
    final void d() {
        ?? x2 = new X2();
        this.h = x2;
        this.e = this.b.S(new C0217v3(x2, 0));
        this.f = new C0109a(8, this);
    }

    @Override // j$.util.stream.AbstractC0153i3
    final AbstractC0153i3 e(Spliterator spliterator) {
        return new AbstractC0153i3(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Q.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.Q.g(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0153i3, j$.util.Spliterator
    public final j$.util.c0 trySplit() {
        return (j$.util.c0) super.trySplit();
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        long j;
        longConsumer.getClass();
        boolean a = a();
        if (a) {
            V2 v2 = (V2) this.h;
            long j2 = this.g;
            int y = v2.y(j2);
            if (v2.c == 0 && y == 0) {
                j = ((long[]) v2.e)[(int) j2];
            } else {
                j = ((long[][]) v2.f)[y][(int) (j2 - v2.d[y])];
            }
            longConsumer.accept(j);
        }
        return a;
    }

    @Override // j$.util.stream.AbstractC0153i3, j$.util.Spliterator
    public final j$.util.f0 trySplit() {
        return (j$.util.c0) super.trySplit();
    }

    @Override // j$.util.f0
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.h == null && !this.i) {
            longConsumer.getClass();
            c();
            C0217v3 c0217v3 = new C0217v3(longConsumer, 1);
            this.b.R(this.d, c0217v3);
            this.i = true;
            return;
        }
        do {
        } while (tryAdvance(longConsumer));
    }

    @Override // j$.util.stream.AbstractC0153i3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.c0) super.trySplit();
    }
}
