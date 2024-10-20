package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class alsp {
    transient Object[] a;
    transient int[] b;
    transient int c;
    transient int d;
    public transient int[] e;
    transient long[] f;
    private transient float g;
    private transient int h;

    public alsp() {
        n(3);
    }

    private static int q(long j) {
        return (int) (j >>> 32);
    }

    private final int r() {
        return this.e.length - 1;
    }

    private static long s(long j, int i) {
        return (j & (-4294967296L)) | (i & 4294967295L);
    }

    private final void t(int i) {
        if (this.e.length >= 1073741824) {
            this.h = Integer.MAX_VALUE;
            return;
        }
        float f = i * this.g;
        int[] u = u(i);
        long[] jArr = this.f;
        int length = u.length;
        for (int i2 = 0; i2 < this.c; i2++) {
            int q = q(jArr[i2]);
            int i3 = (length - 1) & q;
            int i4 = u[i3];
            u[i3] = i2;
            jArr[i2] = (q << 32) | (i4 & 4294967295L);
        }
        this.h = ((int) f) + 1;
        this.e = u;
    }

    private static int[] u(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public int a() {
        if (this.c == 0) {
            return -1;
        }
        return 0;
    }

    public final int b(Object obj) {
        int d = d(obj);
        if (d == -1) {
            return 0;
        }
        return this.b[d];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(int i) {
        albo.ad(i, this.c);
        return this.b[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d(Object obj) {
        int bg = alzz.bg(obj);
        int i = this.e[r() & bg];
        while (i != -1) {
            long j = this.f[i];
            if (q(j) == bg && d.B(obj, this.a[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    public int e(int i) {
        int i2 = i + 1;
        if (i2 < this.c) {
            return i2;
        }
        return -1;
    }

    public final int f(Object obj, int i) {
        int r = r() & i;
        int i2 = this.e[r];
        if (i2 != -1) {
            int i3 = -1;
            while (true) {
                if (q(this.f[i2]) == i && d.B(obj, this.a[i2])) {
                    int i4 = this.b[i2];
                    if (i3 == -1) {
                        this.e[r] = (int) this.f[i2];
                    } else {
                        long[] jArr = this.f;
                        jArr[i3] = s(jArr[i3], (int) jArr[i2]);
                    }
                    k(i2);
                    this.c--;
                    this.d++;
                    return i4;
                }
                int i5 = (int) this.f[i2];
                if (i5 != -1) {
                    i3 = i2;
                    i2 = i5;
                } else {
                    return 0;
                }
            }
        } else {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int g(int i) {
        return f(this.a[i], q(this.f[i]));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object h(int i) {
        albo.ad(i, this.c);
        return this.a[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(int i) {
        if (i > this.f.length) {
            l(i);
        }
        if (i >= this.h) {
            int highestOneBit = Integer.highestOneBit(i - 1);
            t(Math.max(2, highestOneBit + highestOneBit));
        }
    }

    public void j(int i, Object obj, int i2, int i3) {
        this.f[i] = (i3 << 32) | 4294967295L;
        this.a[i] = obj;
        this.b[i] = i2;
    }

    public void k(int i) {
        int i2 = this.c - 1;
        if (i < i2) {
            Object[] objArr = this.a;
            objArr[i] = objArr[i2];
            int[] iArr = this.b;
            iArr[i] = iArr[i2];
            objArr[i2] = null;
            iArr[i2] = 0;
            long[] jArr = this.f;
            long j = jArr[i2];
            jArr[i] = j;
            jArr[i2] = -1;
            int q = q(j) & r();
            int[] iArr2 = this.e;
            int i3 = iArr2[q];
            if (i3 == i2) {
                iArr2[q] = i;
                return;
            }
            while (true) {
                long[] jArr2 = this.f;
                long j2 = jArr2[i3];
                int i4 = (int) j2;
                if (i4 != i2) {
                    i3 = i4;
                } else {
                    jArr2[i3] = s(j2, i);
                    return;
                }
            }
        } else {
            this.a[i] = null;
            this.b[i] = 0;
            this.f[i] = -1;
        }
    }

    public void l(int i) {
        this.a = Arrays.copyOf(this.a, i);
        this.b = Arrays.copyOf(this.b, i);
        long[] jArr = this.f;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1L);
        }
        this.f = copyOf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(int i, int i2) {
        albo.ad(i, this.c);
        this.b[i] = i2;
    }

    public void n(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "Initial capacity must be non-negative");
        d.t(true, "Illegal load factor");
        int bh = alzz.bh(i);
        this.e = u(bh);
        this.g = 1.0f;
        this.a = new Object[i];
        this.b = new int[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        this.f = jArr;
        this.h = Math.max(1, bh);
    }

    public final void o(Object obj, int i) {
        if (i > 0) {
            long[] jArr = this.f;
            Object[] objArr = this.a;
            int[] iArr = this.b;
            int bg = alzz.bg(obj);
            int r = r() & bg;
            int i2 = this.c;
            int[] iArr2 = this.e;
            int i3 = iArr2[r];
            if (i3 == -1) {
                iArr2[r] = i2;
            } else {
                while (true) {
                    long j = jArr[i3];
                    if (q(j) == bg && d.B(obj, objArr[i3])) {
                        int i4 = iArr[i3];
                        iArr[i3] = i;
                        return;
                    } else {
                        int i5 = (int) j;
                        if (i5 == -1) {
                            jArr[i3] = s(j, i2);
                            break;
                        }
                        i3 = i5;
                    }
                }
            }
            int i6 = Integer.MAX_VALUE;
            if (i2 != Integer.MAX_VALUE) {
                int i7 = i2 + 1;
                int length = this.f.length;
                if (i7 > length) {
                    int max = Math.max(1, length >>> 1) + length;
                    if (max >= 0) {
                        i6 = max;
                    }
                    if (i6 != length) {
                        l(i6);
                    }
                }
                j(i2, obj, i, bg);
                this.c = i7;
                if (i2 >= this.h) {
                    int length2 = this.e.length;
                    t(length2 + length2);
                }
                this.d++;
                return;
            }
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        throw new IllegalArgumentException(a.bV(i, "count must be positive but was: "));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final alsk p(int i) {
        albo.ad(i, this.c);
        return new alsk(this, i);
    }

    public alsp(int i) {
        this(i, null);
    }

    public alsp(int i, byte[] bArr) {
        n(i);
    }

    public alsp(alsp alspVar) {
        n(alspVar.c);
        int a = alspVar.a();
        while (a != -1) {
            o(alspVar.h(a), alspVar.c(a));
            a = alspVar.e(a);
        }
    }
}
