package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aozg {
    public static final /* synthetic */ int e = 0;
    private static volatile int f = 100;
    int a;
    final int b = f;
    public int c = Integer.MAX_VALUE;
    aozh d;

    public static int H(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long I(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static aozg J(InputStream inputStream) {
        return M(inputStream, 4096);
    }

    public static aozg K(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return P(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        }
        if (byteBuffer.isDirect() && apdb.a) {
            return new aozf(byteBuffer);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return P(bArr, 0, remaining);
    }

    public static aozg L(byte[] bArr) {
        int length = bArr.length;
        return O(bArr, 0);
    }

    public static aozg M(InputStream inputStream, int i) {
        if (i > 0) {
            if (inputStream == null) {
                return L(apay.b);
            }
            return new aoze(inputStream, i);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static aozg O(byte[] bArr, int i) {
        return P(bArr, 0, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aozg P(byte[] bArr, int i, int i2) {
        aozc aozcVar = new aozc(bArr, i, i2);
        try {
            aozcVar.e(i2);
            return aozcVar;
        } catch (apba e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract void A(int i);

    public abstract boolean C();

    public abstract boolean D();

    public abstract boolean E(int i);

    public abstract byte[] F();

    public final void N() {
        int m;
        do {
            m = m();
            if (m != 0) {
                int i = this.a;
                if (i < this.b) {
                    this.a = i + 1;
                    this.a--;
                } else {
                    throw new apba("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
            } else {
                return;
            }
        } while (E(m));
    }

    public abstract double b();

    public abstract float c();

    public abstract int d();

    public abstract int e(int i);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract long o();

    public abstract long p();

    public abstract long r();

    public abstract long t();

    public abstract long u();

    public abstract long v();

    public abstract aozb w();

    public abstract String x();

    public abstract String y();

    public abstract void z(int i);
}
