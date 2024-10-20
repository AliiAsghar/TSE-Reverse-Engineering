package j$.util.stream;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Spliterators;
import j$.util.function.LongConsumer$CC;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class V2 extends X2 implements LongConsumer {
    @Override // j$.util.stream.X2
    protected final Object[] B() {
        return new long[8];
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public j$.util.c0 spliterator() {
        return new U2(this, 0, this.c, 0, this.b);
    }

    @Override // java.util.function.LongConsumer
    public void accept(long j) {
        C();
        long[] jArr = (long[]) this.e;
        int i = this.b;
        this.b = i + 1;
        jArr[i] = j;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // j$.util.stream.X2
    public final Object c(int i) {
        return new long[i];
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            e((LongConsumer) consumer);
        } else if (!S3.a) {
            j$.util.Q.c((U2) spliterator(), consumer);
        } else {
            S3.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
            throw null;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.h(spliterator());
    }

    public final String toString() {
        long[] jArr = (long[]) d();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.c), Arrays.toString(jArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(jArr, BasePaymentResult.ERROR_REQUEST_FAILED)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.X2
    public final void w(Object obj, int i, int i2, Object obj2) {
        long[] jArr = (long[]) obj;
        LongConsumer longConsumer = (LongConsumer) obj2;
        while (i < i2) {
            longConsumer.accept(jArr[i]);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.X2
    public final int x(Object obj) {
        return ((long[]) obj).length;
    }
}
