package j$.util;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* renamed from: j$.util.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0244z implements IntConsumer {
    private long count;
    private long sum;
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.count++;
        this.sum += i;
        this.min = Math.min(this.min, i);
        this.max = Math.max(this.max, i);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    public final void b(C0244z c0244z) {
        this.count += c0244z.count;
        this.sum += c0244z.sum;
        this.min = Math.min(this.min, c0244z.min);
        this.max = Math.max(this.max, c0244z.max);
    }

    public final String toString() {
        double d;
        String simpleName = C0244z.class.getSimpleName();
        Long valueOf = Long.valueOf(this.count);
        Long valueOf2 = Long.valueOf(this.sum);
        Integer valueOf3 = Integer.valueOf(this.min);
        long j = this.count;
        if (j > 0) {
            d = this.sum / j;
        } else {
            d = 0.0d;
        }
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, valueOf, valueOf2, valueOf3, Double.valueOf(d), Integer.valueOf(this.max));
    }
}
