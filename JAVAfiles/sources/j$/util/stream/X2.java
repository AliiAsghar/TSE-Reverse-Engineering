package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes5.dex */
abstract class X2 extends AbstractC0124d implements Iterable, j$.lang.a {
    Object e;
    Object[] f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public X2(int i) {
        super(i);
        this.e = c(1 << this.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void A(long j) {
        long x;
        int i = this.c;
        if (i == 0) {
            x = x(this.e);
        } else {
            x = x(this.f[i]) + this.d[i];
        }
        if (j > x) {
            if (this.f == null) {
                Object[] B = B();
                this.f = B;
                this.d = new long[8];
                B[0] = this.e;
            }
            int i2 = this.c + 1;
            while (j > x) {
                Object[] objArr = this.f;
                if (i2 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f = Arrays.copyOf(objArr, length);
                    this.d = Arrays.copyOf(this.d, length);
                }
                int i3 = this.a;
                if (i2 != 0 && i2 != 1) {
                    i3 = Math.min((i3 + i2) - 1, 30);
                }
                int i4 = 1 << i3;
                this.f[i2] = c(i4);
                long[] jArr = this.d;
                jArr[i2] = jArr[i2 - 1] + x(this.f[r6]);
                x += i4;
                i2++;
            }
        }
    }

    protected abstract Object[] B();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void C() {
        long x;
        if (this.b == x(this.e)) {
            if (this.f == null) {
                Object[] B = B();
                this.f = B;
                this.d = new long[8];
                B[0] = this.e;
            }
            int i = this.c;
            int i2 = i + 1;
            Object[] objArr = this.f;
            if (i2 >= objArr.length || objArr[i2] == null) {
                if (i == 0) {
                    x = x(this.e);
                } else {
                    x = x(objArr[i]) + this.d[i];
                }
                A(x + 1);
            }
            this.b = 0;
            int i3 = this.c + 1;
            this.c = i3;
            this.e = this.f[i3];
        }
    }

    public abstract Object c(int i);

    @Override // j$.util.stream.AbstractC0124d
    public final void clear() {
        Object[] objArr = this.f;
        if (objArr != null) {
            this.e = objArr[0];
            this.f = null;
            this.d = null;
        }
        this.b = 0;
        this.c = 0;
    }

    public Object d() {
        long count = count();
        if (count < 2147483639) {
            Object c = c((int) count);
            u(0, c);
            return c;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public void e(Object obj) {
        for (int i = 0; i < this.c; i++) {
            Object obj2 = this.f[i];
            w(obj2, 0, x(obj2), obj);
        }
        w(this.e, 0, this.b, obj);
    }

    public void u(int i, Object obj) {
        long j = i;
        long count = count() + j;
        if (count <= x(obj) && count >= j) {
            if (this.c == 0) {
                System.arraycopy(this.e, 0, obj, i, this.b);
                return;
            }
            for (int i2 = 0; i2 < this.c; i2++) {
                Object obj2 = this.f[i2];
                System.arraycopy(obj2, 0, obj, i, x(obj2));
                i += x(this.f[i2]);
            }
            int i3 = this.b;
            if (i3 > 0) {
                System.arraycopy(this.e, 0, obj, i, i3);
                return;
            }
            return;
        }
        throw new IndexOutOfBoundsException("does not fit");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void w(Object obj, int i, int i2, Object obj2);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int x(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public final int y(long j) {
        if (this.c == 0) {
            if (j < this.b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j < count()) {
            for (int i = 0; i <= this.c; i++) {
                if (j < this.d[i] + x(this.f[i])) {
                    return i;
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        throw new IndexOutOfBoundsException(Long.toString(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public X2() {
        this.e = c(16);
    }
}
