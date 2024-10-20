package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhr {
    public final euf a = new euf(32);
    public fhq b;
    public fhq c;
    public fhq d;
    public long e;
    public final fjl f;

    public fhr(fjl fjlVar) {
        this.f = fjlVar;
        fhq fhqVar = new fhq(0L);
        this.b = fhqVar;
        this.c = fhqVar;
        this.d = fhqVar;
    }

    public static fhq b(fhq fhqVar, ewl ewlVar, fhs fhsVar, euf eufVar) {
        boolean z;
        if (ewlVar.j()) {
            long j = fhsVar.b;
            int i = 1;
            eufVar.F(1);
            fhq g = g(fhqVar, j, eufVar.a, 1);
            long j2 = j + 1;
            byte b = eufVar.a[0];
            int i2 = b & 128;
            int i3 = b & Byte.MAX_VALUE;
            ewh ewhVar = ewlVar.c;
            byte[] bArr = ewhVar.a;
            if (bArr == null) {
                ewhVar.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            fhqVar = g(g, j2, ewhVar.a, i3);
            long j3 = j2 + i3;
            if (z) {
                eufVar.F(2);
                fhqVar = g(fhqVar, j3, eufVar.a, 2);
                j3 += 2;
                i = eufVar.n();
            }
            int[] iArr = ewhVar.d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = ewhVar.e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i4 = i * 6;
                eufVar.F(i4);
                fhqVar = g(fhqVar, j3, eufVar.a, i4);
                j3 += i4;
                eufVar.J(0);
                for (int i5 = 0; i5 < i; i5++) {
                    iArr[i5] = eufVar.n();
                    iArr2[i5] = eufVar.m();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = fhsVar.a - ((int) (j3 - fhsVar.b));
            }
            fmp fmpVar = fhsVar.c;
            int i6 = eul.a;
            byte[] bArr2 = fmpVar.b;
            byte[] bArr3 = ewhVar.a;
            int i7 = fmpVar.a;
            int i8 = fmpVar.c;
            int i9 = fmpVar.d;
            ewhVar.f = i;
            ewhVar.d = iArr;
            ewhVar.e = iArr2;
            ewhVar.b = bArr2;
            ewhVar.c = i7;
            ewhVar.g = i8;
            ewhVar.h = i9;
            ewhVar.i.numSubSamples = i;
            ewhVar.i.numBytesOfClearData = iArr;
            ewhVar.i.numBytesOfEncryptedData = iArr2;
            ewhVar.i.key = bArr2;
            ewhVar.i.iv = bArr3;
            ewhVar.i.mode = i7;
            fdx fdxVar = ewhVar.j;
            fo$$ExternalSyntheticApiModelOutline0.m(fdxVar.a).set(i8, i9);
            ((MediaCodec.CryptoInfo) fdxVar.b).setPattern(fo$$ExternalSyntheticApiModelOutline0.m(fdxVar.a));
            long j4 = fhsVar.b;
            int i10 = (int) (j3 - j4);
            fhsVar.b = j4 + i10;
            fhsVar.a -= i10;
        }
        if (ewlVar.d()) {
            eufVar.F(4);
            fhq g2 = g(fhqVar, fhsVar.b, eufVar.a, 4);
            int m = eufVar.m();
            fhsVar.b += 4;
            fhsVar.a -= 4;
            ewlVar.h(m);
            fhq f = f(g2, fhsVar.b, ewlVar.d, m);
            fhsVar.b += m;
            int i11 = fhsVar.a - m;
            fhsVar.a = i11;
            ByteBuffer byteBuffer = ewlVar.g;
            if (byteBuffer != null && byteBuffer.capacity() >= i11) {
                ewlVar.g.clear();
            } else {
                ewlVar.g = ByteBuffer.allocate(i11);
            }
            return f(f, fhsVar.b, ewlVar.g, fhsVar.a);
        }
        ewlVar.h(fhsVar.a);
        return f(fhqVar, fhsVar.b, ewlVar.d, fhsVar.a);
    }

    private static fhq e(fhq fhqVar, long j) {
        while (j >= fhqVar.b) {
            fhqVar = fhqVar.c;
        }
        return fhqVar;
    }

    private static fhq f(fhq fhqVar, long j, ByteBuffer byteBuffer, int i) {
        fhq e = e(fhqVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (e.b - j));
            byteBuffer.put((byte[]) e.d.b, e.a(j), min);
            i -= min;
            j += min;
            if (j == e.b) {
                e = e.c;
            }
        }
        return e;
    }

    private static fhq g(fhq fhqVar, long j, byte[] bArr, int i) {
        fhq e = e(fhqVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (e.b - j));
            System.arraycopy(e.d.b, e.a(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == e.b) {
                e = e.c;
            }
        }
        return e;
    }

    public final int a(int i) {
        fhq fhqVar = this.d;
        if (fhqVar.d == null) {
            atal G = this.f.G();
            fhq fhqVar2 = new fhq(this.d.b);
            fhqVar.d = G;
            fhqVar.c = fhqVar2;
        }
        return Math.min(i, (int) (this.d.b - this.e));
    }

    public final void c(long j) {
        fhq fhqVar;
        if (j != -1) {
            while (true) {
                fhqVar = this.b;
                if (j < fhqVar.b) {
                    break;
                }
                this.f.H(fhqVar.d);
                this.b = this.b.b();
            }
            if (this.c.a < fhqVar.a) {
                this.c = fhqVar;
            }
        }
    }

    public final void d(int i) {
        long j = this.e + i;
        this.e = j;
        fhq fhqVar = this.d;
        if (j == fhqVar.b) {
            this.d = fhqVar.c;
        }
    }
}
