package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes5.dex */
final class P2 implements Spliterator {
    int a;
    final int b;
    int c;
    final int d;
    Object[] e;
    final /* synthetic */ Y2 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P2(Y2 y2, int i, int i2, int i3, int i4) {
        Object[] objArr;
        this.f = y2;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        Object[][] objArr2 = y2.f;
        if (objArr2 == null) {
            objArr = y2.e;
        } else {
            objArr = objArr2[i];
        }
        this.e = objArr;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i == i3) {
            return i2 - this.c;
        }
        long[] jArr = this.f.d;
        return ((jArr[i3] + i2) - jArr[i]) - this.c;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Y2 y2;
        Object[] objArr;
        consumer.getClass();
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i < i3 || (i == i3 && this.c < i2)) {
            int i4 = this.c;
            while (true) {
                y2 = this.f;
                if (i >= i3) {
                    break;
                }
                Object[] objArr2 = y2.f[i];
                while (i4 < objArr2.length) {
                    consumer.accept(objArr2[i4]);
                    i4++;
                }
                i++;
                i4 = 0;
            }
            if (this.a == i3) {
                objArr = this.e;
            } else {
                objArr = y2.f[i3];
            }
            while (i4 < i2) {
                consumer.accept(objArr[i4]);
                i4++;
            }
            this.a = i3;
            this.c = i2;
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
        int i = this.a;
        int i2 = this.b;
        if (i >= i2 && (i != i2 || this.c >= this.d)) {
            return false;
        }
        Object[] objArr = this.e;
        int i3 = this.c;
        this.c = i3 + 1;
        consumer.accept(objArr[i3]);
        if (this.c == this.e.length) {
            this.c = 0;
            int i4 = this.a + 1;
            this.a = i4;
            Object[][] objArr2 = this.f.f;
            if (objArr2 != null && i4 <= i2) {
                this.e = objArr2[i4];
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i = this.a;
        int i2 = this.b;
        if (i < i2) {
            int i3 = this.c;
            Y2 y2 = this.f;
            P2 p2 = new P2(y2, i, i2 - 1, i3, y2.f[i2 - 1].length);
            this.a = i2;
            this.c = 0;
            this.e = this.f.f[i2];
            return p2;
        }
        if (i != i2) {
            return null;
        }
        int i4 = this.c;
        int i5 = (this.d - i4) / 2;
        if (i5 == 0) {
            return null;
        }
        Spliterator l = Spliterators.l(this.e, i4, i4 + i5, 1040);
        this.c += i5;
        return l;
    }
}
