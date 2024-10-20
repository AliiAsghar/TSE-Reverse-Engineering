package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes5.dex */
abstract class G3 extends J3 implements j$.util.f0 {
    protected abstract void e(Object obj);

    @Override // j$.util.f0
    public final void forEachRemaining(Object obj) {
        obj.getClass();
        AbstractC0173m3 abstractC0173m3 = null;
        while (true) {
            I3 d = d();
            if (d == I3.NO_MORE) {
                return;
            }
            I3 i3 = I3.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (d == i3) {
                int i = this.c;
                if (abstractC0173m3 == null) {
                    abstractC0173m3 = h(i);
                } else {
                    abstractC0173m3.b = 0;
                }
                long j = 0;
                while (((j$.util.f0) spliterator).tryAdvance(abstractC0173m3)) {
                    j++;
                    if (j >= i) {
                        break;
                    }
                }
                if (j == 0) {
                    return;
                } else {
                    abstractC0173m3.b(obj, b(j));
                }
            } else {
                ((j$.util.f0) spliterator).forEachRemaining(obj);
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

    protected abstract AbstractC0173m3 h(int i);

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(Object obj) {
        obj.getClass();
        while (d() != I3.NO_MORE && ((j$.util.f0) this.a).tryAdvance(this)) {
            if (b(1L) == 1) {
                e(obj);
                return true;
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }
}
