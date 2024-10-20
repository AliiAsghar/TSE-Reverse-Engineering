package j$.util.stream;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class R2 extends X2 implements DoubleConsumer {
    @Override // j$.util.stream.X2
    protected final Object[] B() {
        return new double[8];
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public j$.util.V spliterator() {
        return new Q2(this, 0, this.c, 0, this.b);
    }

    @Override // java.util.function.DoubleConsumer
    public void accept(double d) {
        C();
        double[] dArr = (double[]) this.e;
        int i = this.b;
        this.b = i + 1;
        dArr[i] = d;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.nio.channels.c.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.X2
    public final Object c(int i) {
        return new double[i];
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            e((DoubleConsumer) consumer);
        } else if (!S3.a) {
            j$.util.Q.a((Q2) spliterator(), consumer);
        } else {
            S3.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
            throw null;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.f(spliterator());
    }

    public final String toString() {
        double[] dArr = (double[]) d();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.c), Arrays.toString(dArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(dArr, BasePaymentResult.ERROR_REQUEST_FAILED)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.X2
    public final void w(Object obj, int i, int i2, Object obj2) {
        double[] dArr = (double[]) obj;
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj2;
        while (i < i2) {
            doubleConsumer.accept(dArr[i]);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.X2
    public final int x(Object obj) {
        return ((double[]) obj).length;
    }
}
