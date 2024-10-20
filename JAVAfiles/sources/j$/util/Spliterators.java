package j$.util;

import com.android.vcard.VCardConfig;
import j$.util.Spliterator;
import java.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes5.dex */
public final class Spliterators {
    private static final Spliterator a = new Object();
    private static final Y b = new Object();
    private static final c0 c = new Object();
    private static final V d = new Object();

    /* loaded from: classes5.dex */
    public static abstract class AbstractSpliterator<T> implements Spliterator<T> {
        private final int a;
        private long b;
        private int c;

        /* JADX INFO: Access modifiers changed from: protected */
        public AbstractSpliterator(long j, int i) {
            this.b = j;
            this.a = (i & 64) != 0 ? i | 16384 : i;
        }

        @Override // j$.util.Spliterator
        public final int characteristics() {
            return this.a;
        }

        @Override // j$.util.Spliterator
        public final long estimateSize() {
            return this.b;
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Spliterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ java.util.Comparator getComparator() {
            return Spliterator.CC.$default$getComparator(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i) {
            return Spliterator.CC.$default$hasCharacteristics(this, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.function.Consumer, j$.util.m0, java.lang.Object] */
        @Override // j$.util.Spliterator
        public final Spliterator trySplit() {
            ?? obj = new Object();
            long j = this.b;
            if (j > 1 && tryAdvance(obj)) {
                int i = this.c + 1024;
                if (i > j) {
                    i = (int) j;
                }
                if (i > 33554432) {
                    i = VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
                }
                Object[] objArr = new Object[i];
                int i2 = 0;
                do {
                    objArr[i2] = obj.a;
                    i2++;
                    if (i2 >= i) {
                        break;
                    }
                } while (tryAdvance(obj));
                this.c = i2;
                long j2 = this.b;
                if (j2 != Long.MAX_VALUE) {
                    this.b = j2 - i2;
                }
                return new n0(objArr, 0, i2, this.a);
            }
            return null;
        }
    }

    private static void a(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i2 >= 0) {
                if (i3 <= i) {
                    return;
                } else {
                    throw new ArrayIndexOutOfBoundsException(i3);
                }
            }
            throw new ArrayIndexOutOfBoundsException(i2);
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i2 + ") > fence(" + i3 + ")");
    }

    public static V b() {
        return d;
    }

    public static Y c() {
        return b;
    }

    public static c0 d() {
        return c;
    }

    public static Spliterator e() {
        return a;
    }

    public static F f(V v) {
        v.getClass();
        return new l0(v);
    }

    public static J g(Y y) {
        y.getClass();
        return new j0(y);
    }

    public static O h(c0 c0Var) {
        c0Var.getClass();
        return new k0(c0Var);
    }

    public static V i(double[] dArr, int i, int i2) {
        dArr.getClass();
        a(dArr.length, i, i2);
        return new o0(dArr, i, i2, 1040);
    }

    public static <T> Iterator<T> iterator(Spliterator<? extends T> spliterator) {
        spliterator.getClass();
        return new i0(spliterator);
    }

    public static Y j(int[] iArr, int i, int i2) {
        iArr.getClass();
        a(iArr.length, i, i2);
        return new t0(iArr, i, i2, 1040);
    }

    public static c0 k(long[] jArr, int i, int i2) {
        jArr.getClass();
        a(jArr.length, i, i2);
        return new v0(jArr, i, i2, 1040);
    }

    public static Spliterator l(Object[] objArr, int i, int i2, int i3) {
        objArr.getClass();
        a(objArr.length, i, i2);
        return new n0(objArr, i, i2, i3);
    }

    public static <T> Spliterator<T> spliterator(java.util.Collection<? extends T> collection, int i) {
        collection.getClass();
        return new u0(collection, i);
    }

    public static <T> Spliterator<T> spliteratorUnknownSize(Iterator<? extends T> it, int i) {
        it.getClass();
        return new u0(it, i);
    }
}
