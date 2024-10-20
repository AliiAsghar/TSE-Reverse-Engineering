package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.r3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C0197r3 extends AbstractC0153i3 implements j$.util.V {
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.X2, java.util.function.DoubleConsumer, j$.util.stream.d] */
    @Override // j$.util.stream.AbstractC0153i3
    final void d() {
        ?? x2 = new X2();
        this.h = x2;
        this.e = this.b.S(new C0193q3(x2, 0));
        this.f = new C0109a(6, this);
    }

    @Override // j$.util.stream.AbstractC0153i3
    final AbstractC0153i3 e(Spliterator spliterator) {
        return new AbstractC0153i3(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Q.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.Q.e(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0153i3, j$.util.Spliterator
    public final j$.util.V trySplit() {
        return (j$.util.V) super.trySplit();
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        double d;
        doubleConsumer.getClass();
        boolean a = a();
        if (a) {
            R2 r2 = (R2) this.h;
            long j = this.g;
            int y = r2.y(j);
            if (r2.c == 0 && y == 0) {
                d = ((double[]) r2.e)[(int) j];
            } else {
                d = ((double[][]) r2.f)[y][(int) (j - r2.d[y])];
            }
            doubleConsumer.accept(d);
        }
        return a;
    }

    @Override // j$.util.stream.AbstractC0153i3, j$.util.Spliterator
    public final j$.util.f0 trySplit() {
        return (j$.util.V) super.trySplit();
    }

    @Override // j$.util.f0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.h == null && !this.i) {
            doubleConsumer.getClass();
            c();
            C0193q3 c0193q3 = new C0193q3(doubleConsumer, 1);
            this.b.R(this.d, c0193q3);
            this.i = true;
            return;
        }
        do {
        } while (tryAdvance(doubleConsumer));
    }

    @Override // j$.util.stream.AbstractC0153i3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.V) super.trySplit();
    }
}
