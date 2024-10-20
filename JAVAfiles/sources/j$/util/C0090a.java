package j$.util;

import j$.util.Spliterator;
import java.util.ConcurrentModificationException;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0090a implements Spliterator {
    private final java.util.List a;
    private int b;
    private int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0090a(java.util.List list) {
        this.a = list;
        this.b = 0;
        this.c = -1;
    }

    private int a() {
        int i = this.c;
        if (i < 0) {
            int size = this.a.size();
            this.c = size;
            return size;
        }
        return i;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return a() - this.b;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        int a = a();
        this.b = a;
        for (int i = this.b; i < a; i++) {
            try {
                consumer.accept(this.a.get(i));
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
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
        int a = a();
        int i = this.b;
        if (i < a) {
            this.b = i + 1;
            try {
                consumer.accept(this.a.get(i));
                return true;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int a = a();
        int i = this.b;
        int i2 = (a + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.b = i2;
        return new C0090a(this, i, i2);
    }

    private C0090a(C0090a c0090a, int i, int i2) {
        this.a = c0090a.a;
        this.b = i;
        this.c = i2;
    }
}
