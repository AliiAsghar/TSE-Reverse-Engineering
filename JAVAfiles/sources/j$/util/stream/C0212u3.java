package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.u3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C0212u3 extends AbstractC0153i3 implements j$.util.Y {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.function.IntConsumer, j$.util.stream.X2, j$.util.stream.d] */
    @Override // j$.util.stream.AbstractC0153i3
    final void d() {
        ?? x2 = new X2();
        this.h = x2;
        this.e = this.b.S(new C0207t3(x2, 0));
        this.f = new C0109a(7, this);
    }

    @Override // j$.util.stream.AbstractC0153i3
    final AbstractC0153i3 e(Spliterator spliterator) {
        return new AbstractC0153i3(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Q.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.Q.f(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0153i3, j$.util.Spliterator
    public final j$.util.Y trySplit() {
        return (j$.util.Y) super.trySplit();
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i;
        intConsumer.getClass();
        boolean a = a();
        if (a) {
            T2 t2 = (T2) this.h;
            long j = this.g;
            int y = t2.y(j);
            if (t2.c == 0 && y == 0) {
                i = ((int[]) t2.e)[(int) j];
            } else {
                i = ((int[][]) t2.f)[y][(int) (j - t2.d[y])];
            }
            intConsumer.accept(i);
        }
        return a;
    }

    @Override // j$.util.stream.AbstractC0153i3, j$.util.Spliterator
    public final j$.util.f0 trySplit() {
        return (j$.util.Y) super.trySplit();
    }

    @Override // j$.util.f0
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.h == null && !this.i) {
            intConsumer.getClass();
            c();
            C0207t3 c0207t3 = new C0207t3(intConsumer, 1);
            this.b.R(this.d, c0207t3);
            this.i = true;
            return;
        }
        do {
        } while (tryAdvance(intConsumer));
    }

    @Override // j$.util.stream.AbstractC0153i3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.Y) super.trySplit();
    }
}
