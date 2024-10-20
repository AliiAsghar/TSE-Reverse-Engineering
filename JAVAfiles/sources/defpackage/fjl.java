package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjl {
    public int a;
    public int b;
    public Object c;
    private int d;

    public fjl(byte[] bArr, int i) {
        this.c = bArr;
        this.d = i;
    }

    public final void A(int i, ByteBuffer byteBuffer) {
        short s;
        this.c = byteBuffer;
        if (byteBuffer != null) {
            this.b = i;
            int i2 = i - byteBuffer.getInt(i);
            this.a = i2;
            s = ((ByteBuffer) this.c).getShort(i2);
        } else {
            s = 0;
            this.b = 0;
            this.a = 0;
        }
        this.d = s;
    }

    public final int B() {
        int x = x(6);
        if (x != 0) {
            return z(x);
        }
        return 0;
    }

    public final int C() {
        int i = this.d;
        if (i != this.a) {
            int i2 = ((int[]) this.c)[i];
            this.d = (i + 1) & this.b;
            return i2;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final void D(int i) {
        Object obj = this.c;
        int i2 = this.a;
        int[] iArr = (int[]) obj;
        iArr[i2] = i;
        int i3 = this.b & (i2 + 1);
        this.a = i3;
        int i4 = this.d;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length + length;
            if (i6 >= 0) {
                int[] iArr2 = new int[i6];
                aqil.x(iArr, iArr2, 0, i4, length);
                aqil.x((int[]) this.c, iArr2, i5, 0, this.d);
                this.c = iArr2;
                this.d = 0;
                this.a = length;
                this.b = i6 - 1;
                return;
            }
            throw new RuntimeException("Max array capacity exceeded");
        }
    }

    public final void E() {
        this.a = this.d;
    }

    public final boolean F() {
        if (this.d == this.a) {
            return true;
        }
        return false;
    }

    public final synchronized atal G() {
        atal atalVar;
        this.b++;
        int i = this.d;
        if (i > 0) {
            Object obj = this.c;
            int i2 = i - 1;
            this.d = i2;
            atalVar = ((atal[]) obj)[i2];
            dzg.g(atalVar);
            ((atal[]) this.c)[this.d] = null;
        } else {
            atalVar = new atal(new byte[65536]);
            int i3 = this.b;
            Object obj2 = this.c;
            int length = ((atal[]) obj2).length;
            if (i3 > length) {
                this.c = (atal[]) Arrays.copyOf((Object[]) obj2, length + length);
                return atalVar;
            }
        }
        return atalVar;
    }

    public final synchronized void H(atal atalVar) {
        Object obj = this.c;
        int i = this.d;
        this.d = i + 1;
        ((atal[]) obj)[i] = atalVar;
        this.b--;
        notifyAll();
    }

    public final synchronized int a() {
        return this.b * 65536;
    }

    public final synchronized void b() {
        c(0);
    }

    public final synchronized void c(int i) {
        int i2 = this.a;
        this.a = i;
        if (i < i2) {
            d();
        }
    }

    public final synchronized void d() {
        int max = Math.max(0, eul.c(this.a, 65536) - this.b);
        int i = this.d;
        if (max >= i) {
            return;
        }
        Arrays.fill((Object[]) this.c, max, i, (Object) null);
        this.d = max;
    }

    public final synchronized void e(fhq fhqVar) {
        while (fhqVar != null) {
            Object obj = this.c;
            int i = this.d;
            this.d = i + 1;
            atal atalVar = fhqVar.d;
            dzg.g(atalVar);
            ((atal[]) obj)[i] = atalVar;
            this.b--;
            fhqVar = fhqVar.c;
            if (fhqVar == null || fhqVar.d == null) {
                fhqVar = null;
            }
        }
        notifyAll();
    }

    public final int f() {
        return ((this.d - this.a) * 8) - this.b;
    }

    public final int g() {
        boolean z;
        if (this.b == 0) {
            z = true;
        } else {
            z = false;
        }
        dzg.d(z);
        return this.a;
    }

    public final int h() {
        return (this.a * 8) + this.b;
    }

    public final int i(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.b += i;
        int i3 = 0;
        while (true) {
            i2 = this.b;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.b = i4;
            Object obj = this.c;
            int i5 = this.a;
            this.a = i5 + 1;
            i3 |= (((byte[]) obj)[i5] & 255) << i4;
        }
        Object obj2 = this.c;
        int i6 = this.a;
        int i7 = i3 | ((((byte[]) obj2)[i6] & 255) >> (8 - i2));
        int i8 = 32 - i;
        if (i2 == 8) {
            this.b = 0;
            this.a = i6 + 1;
        }
        int i9 = ((-1) >>> i8) & i7;
        l();
        return i9;
    }

    public final long j(int i) {
        if (i <= 32) {
            return eul.y(i(i));
        }
        return (eul.y(i(i - 32)) << 32) | eul.y(i(32));
    }

    public final String k(int i, Charset charset) {
        byte[] bArr = new byte[i];
        w(bArr, i);
        return new String(bArr, charset);
    }

    public final void l() {
        int i;
        int i2 = this.a;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.d) || (i2 == i && this.b == 0))) {
            z = true;
        }
        dzg.d(z);
    }

    public final void m() {
        if (this.b == 0) {
            return;
        }
        this.b = 0;
        this.a++;
        l();
    }

    public final void n(euf eufVar) {
        p(eufVar.a, eufVar.c);
        q(eufVar.b * 8);
    }

    public final void o(byte[] bArr) {
        p(bArr, bArr.length);
    }

    public final void p(byte[] bArr, int i) {
        this.c = bArr;
        this.a = 0;
        this.b = 0;
        this.d = i;
    }

    public final void q(int i) {
        int i2 = i / 8;
        this.a = i2;
        this.b = i - (i2 * 8);
        l();
    }

    public final void r() {
        int i = this.b + 1;
        this.b = i;
        if (i == 8) {
            this.b = 0;
            this.a++;
        }
        l();
    }

    public final void s(int i) {
        int i2 = i / 8;
        int i3 = this.a + i2;
        this.a = i3;
        int i4 = this.b + (i - (i2 * 8));
        this.b = i4;
        if (i4 > 7) {
            this.a = i3 + 1;
            this.b = i4 - 8;
        }
        l();
    }

    public final void t(int i) {
        boolean z;
        if (this.b == 0) {
            z = true;
        } else {
            z = false;
        }
        dzg.d(z);
        this.a += i;
        l();
    }

    public final boolean u() {
        int i = ((byte[]) this.c)[this.a] & (128 >> this.b);
        r();
        if (i != 0) {
            return true;
        }
        return false;
    }

    public final void v(byte[] bArr, int i) {
        int i2;
        int i3 = 0;
        while (true) {
            i2 = i >> 3;
            if (i3 >= i2) {
                break;
            }
            Object obj = this.c;
            int i4 = this.a;
            int i5 = i4 + 1;
            this.a = i5;
            byte[] bArr2 = (byte[]) obj;
            byte b = bArr2[i4];
            int i6 = this.b;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((bArr2[i5] & 255) >> (8 - i6)) | b2);
            i3++;
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b3;
        int i8 = this.b;
        if (i8 + i7 > 8) {
            Object obj2 = this.c;
            int i9 = this.a;
            this.a = i9 + 1;
            b3 = (byte) (b3 | ((((byte[]) obj2)[i9] & 255) << i8));
            bArr[i2] = b3;
            i8 -= 8;
        }
        int i10 = i8 + i7;
        this.b = i10;
        Object obj3 = this.c;
        int i11 = this.a;
        bArr[i2] = (byte) (((byte) (((255 & ((byte[]) obj3)[i11]) >> (8 - i10)) << (8 - i7))) | b3);
        if (i10 == 8) {
            this.b = 0;
            this.a = i11 + 1;
        }
        l();
    }

    public final void w(byte[] bArr, int i) {
        boolean z;
        if (this.b == 0) {
            z = true;
        } else {
            z = false;
        }
        dzg.d(z);
        System.arraycopy(this.c, this.a, bArr, 0, i);
        this.a += i;
        l();
    }

    public final int x(int i) {
        if (i < this.d) {
            return ((ByteBuffer) this.c).getShort(this.a + i);
        }
        return 0;
    }

    public final int y(int i) {
        int i2 = i + this.b;
        return i2 + ((ByteBuffer) this.c).getInt(i2) + 4;
    }

    public final int z(int i) {
        int i2 = i + this.b;
        return ((ByteBuffer) this.c).getInt(i2 + ((ByteBuffer) this.c).getInt(i2));
    }

    public fjl(char[] cArr) {
        if (dys.a == null) {
            dys.a = new dys(null);
        }
    }

    public fjl() {
        d.s(true);
        d.s(true);
        this.d = 0;
        this.c = new atal[100];
    }

    public fjl(byte[] bArr) {
        this.c = eul.f;
    }

    public fjl(byte[] bArr, char[] cArr) {
        int i = 8;
        if (Integer.bitCount(8) != 1) {
            int highestOneBit = Integer.highestOneBit(7);
            i = highestOneBit + highestOneBit;
        }
        this.b = i - 1;
        this.c = new int[i];
    }

    public fjl(byte[] bArr, byte[] bArr2) {
        this(bArr, bArr.length);
    }
}
