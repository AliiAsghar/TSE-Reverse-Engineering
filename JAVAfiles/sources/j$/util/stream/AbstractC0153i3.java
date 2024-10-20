package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.i3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
abstract class AbstractC0153i3 implements Spliterator {
    final boolean a;
    final AbstractC0114b b;
    private Supplier c;
    Spliterator d;
    InterfaceC0182o2 e;
    BooleanSupplier f;
    long g;
    AbstractC0124d h;
    boolean i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0153i3(AbstractC0114b abstractC0114b, Supplier supplier, boolean z) {
        this.b = abstractC0114b;
        this.c = supplier;
        this.d = null;
        this.a = z;
    }

    private boolean b() {
        while (this.h.count() == 0) {
            if (this.e.n() || !this.f.getAsBoolean()) {
                if (this.i) {
                    return false;
                }
                this.e.k();
                this.i = true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        AbstractC0124d abstractC0124d = this.h;
        boolean z = false;
        if (abstractC0124d == null) {
            if (this.i) {
                return false;
            }
            c();
            d();
            this.g = 0L;
            this.e.l(this.d.getExactSizeIfKnown());
            return b();
        }
        long j = this.g + 1;
        this.g = j;
        if (j < abstractC0124d.count()) {
            z = true;
        }
        if (!z) {
            this.g = 0L;
            this.h.clear();
            return b();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (this.d == null) {
            this.d = (Spliterator) this.c.get();
            this.c = null;
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        c();
        int a0 = EnumC0143g3.a0(this.b.G()) & EnumC0143g3.f;
        if ((a0 & 64) != 0) {
            return (a0 & (-16449)) | (this.d.characteristics() & 16448);
        }
        return a0;
    }

    abstract void d();

    abstract AbstractC0153i3 e(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        c();
        return this.d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (Spliterator.CC.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        c();
        if (EnumC0143g3.SIZED.y(this.b.G())) {
            return this.d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.d);
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.a || this.h != null || this.i) {
            return null;
        }
        c();
        Spliterator trySplit = this.d.trySplit();
        if (trySplit == null) {
            return null;
        }
        return e(trySplit);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0153i3(AbstractC0114b abstractC0114b, Spliterator spliterator, boolean z) {
        this.b = abstractC0114b;
        this.c = null;
        this.d = spliterator;
        this.a = z;
    }
}
