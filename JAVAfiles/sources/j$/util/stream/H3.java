package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes5.dex */
final class H3 extends J3 implements Spliterator, Consumer {
    Object f;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.J3, j$.util.Spliterator] */
    @Override // j$.util.stream.J3
    protected final Spliterator c(Spliterator spliterator) {
        return new J3(spliterator, this);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        C0178n3 c0178n3 = null;
        while (true) {
            I3 d = d();
            if (d != I3.NO_MORE) {
                I3 i3 = I3.MAYBE_MORE;
                Spliterator spliterator = this.a;
                if (d == i3) {
                    int i = this.c;
                    if (c0178n3 == null) {
                        c0178n3 = new C0178n3(i);
                    } else {
                        c0178n3.a = 0;
                    }
                    long j = 0;
                    while (spliterator.tryAdvance(c0178n3)) {
                        j++;
                        if (j >= i) {
                            break;
                        }
                    }
                    if (j == 0) {
                        return;
                    }
                    long b = b(j);
                    for (int i2 = 0; i2 < b; i2++) {
                        consumer.accept(c0178n3.b[i2]);
                    }
                } else {
                    spliterator.forEachRemaining(consumer);
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        while (d() != I3.NO_MORE && this.a.tryAdvance(this)) {
            if (b(1L) == 1) {
                consumer.accept(this.f);
                this.f = null;
                return true;
            }
        }
        return false;
    }
}
