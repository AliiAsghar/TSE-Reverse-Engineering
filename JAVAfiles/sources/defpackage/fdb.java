package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdb extends ess {
    public boolean e;
    public long f;
    private int g;
    private int h;
    private byte[] j;
    private byte[] m;
    private int i = 0;
    private int k = 0;
    private int l = 0;

    public fdb() {
        d.s(true);
        this.j = eul.f;
        this.m = eul.f;
    }

    private final int o(int i) {
        int i2 = this.g;
        return (i / i2) * i2;
    }

    private final int p(int i) {
        boolean z = true;
        int q = ((q(2000000L) - this.i) * this.g) - (this.j.length >> 1);
        if (q < 0) {
            z = false;
        }
        dzg.d(z);
        return o((int) Math.min((i * 0.2f) + 0.5f, q));
    }

    private final int q(long j) {
        return (int) ((j * this.b.b) / 1000000);
    }

    private static int r(byte b, byte b2) {
        return (b << 8) | (b2 & 255);
    }

    private final void s(boolean z) {
        int i;
        int i2;
        boolean z2;
        boolean z3;
        int i3 = this.l;
        int length = this.j.length;
        boolean z4 = true;
        if (i3 != length) {
            if (z) {
                z = true;
            } else {
                return;
            }
        }
        if (this.i == 0) {
            if (z) {
                t(i3, 3);
                i2 = i3;
            } else {
                if (i3 >= (length >> 1)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                dzg.d(z3);
                i2 = this.j.length >> 1;
                t(i2, 0);
            }
            i = i2;
        } else {
            int i4 = length >> 1;
            int i5 = i3 - i4;
            if (z) {
                int p = p(i5) + (this.j.length >> 1);
                t(p, 2);
                int i6 = i4 + i5;
                i = p;
                i2 = i6;
            } else {
                int p2 = p(i5);
                t(p2, 1);
                i = p2;
                i2 = i5;
            }
        }
        if (i2 % this.g == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        dzg.e(z2, a.bV(i2, "bytesConsumed is not aligned to frame size: %s"));
        if (i3 < i) {
            z4 = false;
        }
        dzg.d(z4);
        this.l -= i2;
        int i7 = this.k + i2;
        this.k = i7;
        this.k = i7 % this.j.length;
        this.i = this.i + (i / this.g);
        this.f += (i2 - i) / r2;
    }

    private final void t(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        if (i == 0) {
            return;
        }
        boolean z4 = true;
        if (this.l >= i) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        if (i2 == 2) {
            int i4 = this.k;
            int i5 = this.l;
            int i6 = i4 + i5;
            byte[] bArr = this.j;
            int length = bArr.length;
            if (i6 <= length) {
                System.arraycopy(bArr, i6 - i, this.m, 0, i);
            } else {
                int i7 = i5 - (length - i4);
                if (i7 >= i) {
                    System.arraycopy(bArr, i7 - i, this.m, 0, i);
                } else {
                    int i8 = i - i7;
                    System.arraycopy(bArr, length - i8, this.m, 0, i8);
                    System.arraycopy(this.j, 0, this.m, i8, i7);
                }
            }
        } else {
            int i9 = this.k;
            int i10 = i9 + i;
            byte[] bArr2 = this.j;
            int length2 = bArr2.length;
            if (i10 <= length2) {
                System.arraycopy(bArr2, i9, this.m, 0, i);
            } else {
                int i11 = length2 - i9;
                System.arraycopy(bArr2, i9, this.m, 0, i11);
                System.arraycopy(this.j, 0, this.m, i11, i - i11);
            }
        }
        if (i % this.g == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        d.t(z2, a.bV(i, "sizeToOutput is not aligned to frame size: "));
        if (this.k < this.j.length) {
            z3 = true;
        } else {
            z3 = false;
        }
        dzg.d(z3);
        byte[] bArr3 = this.m;
        int i12 = i % this.g;
        String bV = a.bV(i, "byteOutput size is not aligned to frame size ");
        if (i12 != 0) {
            z4 = false;
        }
        d.t(z4, bV);
        if (i2 != 3) {
            for (int i13 = 0; i13 < i; i13 += 2) {
                int i14 = i13 + 1;
                int r = r(bArr3[i14], bArr3[i13]);
                if (i2 == 0) {
                    i3 = ((((i13 * 1000) / (i - 1)) * (-90)) / 1000) + 100;
                } else {
                    i3 = 10;
                    if (i2 == 2) {
                        i3 = 10 + (((90000 * i13) / (i - 1)) / 1000);
                    }
                }
                int i15 = (r * i3) / 100;
                if (i15 >= 32767) {
                    bArr3[i13] = -1;
                    bArr3[i14] = Byte.MAX_VALUE;
                } else if (i15 <= -32768) {
                    bArr3[i13] = 0;
                    bArr3[i14] = Byte.MIN_VALUE;
                } else {
                    bArr3[i13] = (byte) (i15 & 255);
                    bArr3[i14] = (byte) (i15 >> 8);
                }
            }
        }
        k(i).put(bArr3, 0, i).flip();
    }

    private static final boolean u(byte b, byte b2) {
        if (Math.abs(r(b, b2)) > 1024) {
            return true;
        }
        return false;
    }

    @Override // defpackage.esr
    public final void f(ByteBuffer byteBuffer) {
        boolean z;
        int limit;
        int i;
        boolean z2;
        int position;
        while (byteBuffer.hasRemaining() && !this.d.hasRemaining()) {
            boolean z3 = true;
            if (this.h != 0) {
                if (this.k < this.j.length) {
                    z = true;
                } else {
                    z = false;
                }
                dzg.d(z);
                int limit2 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 < byteBuffer.limit()) {
                        if (u(byteBuffer.get(position2), byteBuffer.get(position2 - 1))) {
                            int i2 = this.g;
                            limit = i2 * (position2 / i2);
                            break;
                        }
                        position2 += 2;
                    } else {
                        limit = byteBuffer.limit();
                        break;
                    }
                }
                int position3 = limit - byteBuffer.position();
                int i3 = this.k;
                int i4 = this.l;
                int i5 = i3 + i4;
                int length = this.j.length;
                if (i5 < length) {
                    i = length - i5;
                } else {
                    i5 = i4 - (length - i3);
                    i = i3 - i5;
                }
                int min = Math.min(position3, i);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.j, i5, min);
                int i6 = this.l + min;
                this.l = i6;
                if (i6 <= this.j.length) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                dzg.d(z2);
                if (limit >= limit2 || position3 >= i) {
                    z3 = false;
                }
                s(z3);
                if (z3) {
                    this.h = 0;
                    this.i = 0;
                }
                byteBuffer.limit(limit2);
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.j.length));
                int limit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit4 >= byteBuffer.position()) {
                        if (u(byteBuffer.get(limit4), byteBuffer.get(limit4 - 1))) {
                            int i7 = this.g;
                            position = ((limit4 / i7) * i7) + i7;
                            break;
                        }
                        limit4 -= 2;
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.h = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    k(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // defpackage.ess, defpackage.esr
    public final boolean h() {
        if (super.h() && this.e) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ess
    protected final esp j(esp espVar) {
        if (espVar.d == 2) {
            if (espVar.b == -1) {
                return esp.a;
            }
            return espVar;
        }
        throw new esq(espVar);
    }

    @Override // defpackage.ess
    public final void l() {
        if (h()) {
            int i = this.b.c;
            this.g = i + i;
            int o = o(q(100000L) / 2);
            int i2 = o + o;
            if (this.j.length != i2) {
                this.j = new byte[i2];
                this.m = new byte[i2];
            }
        }
        this.h = 0;
        this.f = 0L;
        this.i = 0;
        this.k = 0;
        this.l = 0;
    }

    @Override // defpackage.ess
    public final void m() {
        if (this.l > 0) {
            s(true);
            this.i = 0;
        }
    }

    @Override // defpackage.ess
    public final void n() {
        this.e = false;
        this.j = eul.f;
        this.m = eul.f;
    }
}
