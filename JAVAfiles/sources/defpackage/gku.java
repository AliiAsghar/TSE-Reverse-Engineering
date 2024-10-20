package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gku {
    public int a;
    public Object b;
    private int c;
    private int d;

    public gku() {
        if (gvf.t == null) {
            gvf.t = new gvf(null);
        }
    }

    private final void n() {
        int i;
        int i2 = this.c;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.d) || (i2 == i && this.a == 0))) {
            z = true;
        }
        dzg.d(z);
    }

    private final boolean o(int i) {
        if (i >= 2 && i < this.d) {
            byte[] bArr = (byte[]) this.b;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int a(int i) {
        if (i < this.d) {
            return ((ByteBuffer) this.b).getShort(this.c + i);
        }
        return 0;
    }

    public final int b(int i) {
        int i2 = i + this.a;
        return i2 + ((ByteBuffer) this.b).getInt(i2) + 4;
    }

    public final int c(int i) {
        int i2 = i + this.a;
        return ((ByteBuffer) this.b).getInt(i2 + ((ByteBuffer) this.b).getInt(i2));
    }

    public final void d(int i, ByteBuffer byteBuffer) {
        short s;
        this.b = byteBuffer;
        if (byteBuffer != null) {
            this.a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.c = i2;
            s = ((ByteBuffer) this.b).getShort(i2);
        } else {
            s = 0;
            this.a = 0;
            this.c = 0;
        }
        this.d = s;
    }

    public final int e() {
        int a = a(6);
        if (a != 0) {
            return c(a);
        }
        return 0;
    }

    public final int f(int i) {
        int i2;
        int i3;
        this.a += i;
        int i4 = 0;
        while (true) {
            i2 = this.a;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.a = i5;
            Object obj = this.b;
            int i6 = this.c;
            i4 |= (((byte[]) obj)[i6] & 255) << i5;
            if (true != o(i6 + 1)) {
                i3 = 1;
            }
            this.c = i6 + i3;
        }
        Object obj2 = this.b;
        int i7 = this.c;
        int i8 = i4 | ((((byte[]) obj2)[i7] & 255) >> (8 - i2));
        int i9 = 32 - i;
        if (i2 == 8) {
            this.a = 0;
            if (true != o(i7 + 1)) {
                i3 = 1;
            }
            this.c = i7 + i3;
        }
        int i10 = ((-1) >>> i9) & i8;
        n();
        return i10;
    }

    public final int g() {
        int i = 0;
        int i2 = 0;
        while (!m()) {
            i2++;
        }
        int i3 = 1 << i2;
        if (i2 > 0) {
            i = f(i2);
        }
        return (i3 - 1) + i;
    }

    public final int h() {
        int g = g();
        int i = g % 2;
        int i2 = 1;
        int i3 = g + 1;
        if (i == 0) {
            i2 = -1;
        }
        return i2 * (i3 / 2);
    }

    public final void i() {
        int i = this.a;
        if (i > 0) {
            k(8 - i);
        }
    }

    public final void j() {
        int i = 1;
        int i2 = this.a + 1;
        this.a = i2;
        if (i2 == 8) {
            this.a = 0;
            int i3 = this.c;
            if (true == o(i3 + 1)) {
                i = 2;
            }
            this.c = i3 + i;
        }
        n();
    }

    public final void k(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.c = i4;
        int i5 = this.a + (i - (i3 * 8));
        this.a = i5;
        if (i5 > 7) {
            this.c = i4 + 1;
            this.a = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 <= this.c) {
                if (o(i2)) {
                    this.c++;
                    i2 += 2;
                }
            } else {
                n();
                return;
            }
        }
    }

    public final boolean l(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.a + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.d) {
                break;
            }
            if (o(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.d;
        if (i4 < i6) {
            return true;
        }
        if (i4 == i6 && i5 == 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        int i = ((byte[]) this.b)[this.c] & (128 >> this.a);
        j();
        if (i != 0) {
            return true;
        }
        return false;
    }

    public gku(byte[] bArr, int i, int i2) {
        this.b = bArr;
        this.c = i;
        this.d = i2;
        this.a = 0;
        n();
    }
}
