package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;

/* renamed from: j$.util.stream.m1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
abstract class AbstractC0171m1 implements Spliterator {
    I0 a;
    int b;
    Spliterator c;
    Spliterator d;
    ArrayDeque e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0171m1(I0 i0) {
        this.a = i0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static I0 a(ArrayDeque arrayDeque) {
        while (true) {
            I0 i0 = (I0) arrayDeque.pollFirst();
            if (i0 != null) {
                if (i0.t() == 0) {
                    if (i0.count() > 0) {
                        return i0;
                    }
                } else {
                    for (int t = i0.t() - 1; t >= 0; t--) {
                        arrayDeque.addFirst(i0.b(t));
                    }
                }
            } else {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ArrayDeque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int t = this.a.t();
        while (true) {
            t--;
            if (t >= this.b) {
                arrayDeque.addFirst(this.a.b(t));
            } else {
                return arrayDeque;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean c() {
        if (this.a == null) {
            return false;
        }
        if (this.d == null) {
            Spliterator spliterator = this.c;
            if (spliterator == null) {
                ArrayDeque b = b();
                this.e = b;
                I0 a = a(b);
                if (a != null) {
                    this.d = a.spliterator();
                    return true;
                }
                this.a = null;
                return false;
            }
            this.d = spliterator;
            return true;
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long j = 0;
        if (this.a == null) {
            return 0L;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i = this.b; i < this.a.t(); i++) {
            j += this.a.b(i).count();
        }
        return j;
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
    public final Spliterator trySplit() {
        I0 i0 = this.a;
        if (i0 == null || this.d != null) {
            return null;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.b < i0.t() - 1) {
            I0 i02 = this.a;
            int i = this.b;
            this.b = i + 1;
            return i02.b(i).spliterator();
        }
        I0 b = this.a.b(this.b);
        this.a = b;
        if (b.t() == 0) {
            Spliterator spliterator2 = this.a.spliterator();
            this.c = spliterator2;
            return spliterator2.trySplit();
        }
        I0 i03 = this.a;
        this.b = 1;
        return i03.b(0).spliterator();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.f0 trySplit() {
        return (j$.util.f0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.Y trySplit() {
        return (j$.util.Y) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.c0 trySplit() {
        return (j$.util.c0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.V trySplit() {
        return (j$.util.V) trySplit();
    }
}
