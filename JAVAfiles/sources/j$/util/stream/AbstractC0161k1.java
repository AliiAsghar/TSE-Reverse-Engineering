package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.k1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
abstract class AbstractC0161k1 extends AbstractC0171m1 implements j$.util.f0 {
    @Override // j$.util.f0
    public final void forEachRemaining(Object obj) {
        if (this.a == null) {
            return;
        }
        if (this.d == null) {
            Spliterator spliterator = this.c;
            if (spliterator == null) {
                ArrayDeque b = b();
                while (true) {
                    H0 h0 = (H0) AbstractC0171m1.a(b);
                    if (h0 != null) {
                        h0.e(obj);
                    } else {
                        this.a = null;
                        return;
                    }
                }
            } else {
                ((j$.util.f0) spliterator).forEachRemaining(obj);
                return;
            }
        }
        do {
        } while (tryAdvance(obj));
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(Object obj) {
        H0 h0;
        if (!c()) {
            return false;
        }
        boolean tryAdvance = ((j$.util.f0) this.d).tryAdvance(obj);
        if (!tryAdvance) {
            if (this.c == null && (h0 = (H0) AbstractC0171m1.a(this.e)) != null) {
                j$.util.f0 spliterator = h0.spliterator();
                this.d = spliterator;
                return spliterator.tryAdvance(obj);
            }
            this.a = null;
        }
        return tryAdvance;
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }
}
