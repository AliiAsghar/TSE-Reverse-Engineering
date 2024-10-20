package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
abstract class J3 {
    protected final Spliterator a;
    protected final boolean b;
    protected final int c;
    private final long d;
    private final AtomicLong e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J3(Spliterator spliterator, long j, long j2) {
        this.a = spliterator;
        this.b = j2 < 0;
        this.d = j2 >= 0 ? j2 : 0L;
        this.c = 128;
        this.e = new AtomicLong(j2 >= 0 ? j + j2 : j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long b(long j) {
        AtomicLong atomicLong;
        long j2;
        boolean z;
        long min;
        do {
            atomicLong = this.e;
            j2 = atomicLong.get();
            z = this.b;
            if (j2 == 0) {
                if (!z) {
                    return 0L;
                }
                return j;
            }
            min = Math.min(j2, j);
            if (min <= 0) {
                break;
            }
        } while (!atomicLong.compareAndSet(j2, j2 - min));
        if (z) {
            return Math.max(j - min, 0L);
        }
        long j3 = this.d;
        if (j2 > j3) {
            return Math.max(min - (j2 - j3), 0L);
        }
        return min;
    }

    protected abstract Spliterator c(Spliterator spliterator);

    public final int characteristics() {
        return this.a.characteristics() & (-16465);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final I3 d() {
        if (this.e.get() > 0) {
            return I3.MAYBE_MORE;
        }
        if (this.b) {
            return I3.UNLIMITED;
        }
        return I3.NO_MORE;
    }

    public final long estimateSize() {
        return this.a.estimateSize();
    }

    public final Spliterator trySplit() {
        Spliterator trySplit;
        if (this.e.get() == 0 || (trySplit = this.a.trySplit()) == null) {
            return null;
        }
        return c(trySplit);
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.f0 m415trySplit() {
        return (j$.util.f0) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.Y m413trySplit() {
        return (j$.util.Y) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.c0 m414trySplit() {
        return (j$.util.c0) trySplit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public J3(Spliterator spliterator, J3 j3) {
        this.a = spliterator;
        this.b = j3.b;
        this.e = j3.e;
        this.d = j3.d;
        this.c = j3.c;
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.V m412trySplit() {
        return (j$.util.V) trySplit();
    }
}
