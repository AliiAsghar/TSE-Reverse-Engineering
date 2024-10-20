package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arkk {
    public final asqw b;
    int f;
    public final List a = new ArrayList();
    arkj[] e = new arkj[8];
    int g = 0;
    int h = 0;
    public int c = 4096;
    public int d = 4096;

    public arkk(asrq asrqVar) {
        this.f = r0.length - 1;
        this.b = new asrk(asrqVar);
    }

    public static final boolean g(int i) {
        if (i >= 0) {
            int length = arkm.b.length;
            if (i <= 60) {
                return true;
            }
            return false;
        }
        return false;
    }

    private final int h() {
        return this.b.d() & 255;
    }

    private final void i() {
        Arrays.fill(this.e, (Object) null);
        this.f = this.e.length - 1;
        this.g = 0;
        this.h = 0;
    }

    private final void j(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.e[length].h;
                i -= i4;
                this.h -= i4;
                this.g--;
                i3++;
                length--;
            }
            arkj[] arkjVarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(arkjVarArr, i5, arkjVarArr, i5 + i3, this.g);
            this.f += i3;
        }
    }

    public final int a(int i) {
        return this.f + 1 + i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(int i, int i2) {
        int i3 = i & i2;
        if (i3 >= i2) {
            int i4 = 0;
            while (true) {
                int h = h();
                if ((h & 128) != 0) {
                    i2 += (h & 127) << i4;
                    i4 += 7;
                } else {
                    return i2 + (h << i4);
                }
            }
        } else {
            return i3;
        }
    }

    public final asqx c(int i) {
        if (g(i)) {
            return arkm.b[i].f;
        }
        int length = arkm.b.length;
        int a = a(i - 61);
        if (a >= 0) {
            arkj[] arkjVarArr = this.e;
            if (a < arkjVarArr.length) {
                return arkjVarArr[a].f;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final asqx d() {
        int i;
        int h = h();
        int i2 = h & 128;
        long b = b(h, 127);
        if (i2 == 128) {
            asqw asqwVar = this.b;
            arks arksVar = arks.a;
            byte[] F = asqwVar.F(b);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            aspl asplVar = arksVar.b;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < F.length) {
                int i6 = F[i3] & 255;
                int i7 = i4 << 8;
                i5 += 8;
                while (true) {
                    i = i7 | i6;
                    if (i5 >= 8) {
                        int i8 = i5 - 8;
                        asplVar = ((aspl[]) asplVar.c)[(i >>> i8) & 255];
                        if (asplVar.c == null) {
                            byteArrayOutputStream.write(asplVar.a);
                            i5 -= asplVar.b;
                            asplVar = arksVar.b;
                        } else {
                            i5 = i8;
                        }
                    }
                }
                i3++;
                i4 = i;
            }
            while (i5 > 0) {
                aspl asplVar2 = ((aspl[]) asplVar.c)[(i4 << (8 - i5)) & 255];
                if (asplVar2.c != null || asplVar2.b > i5) {
                    break;
                }
                byteArrayOutputStream.write(asplVar2.a);
                i5 -= asplVar2.b;
                asplVar = arksVar.b;
            }
            return asqx.f(byteArrayOutputStream.toByteArray());
        }
        return this.b.t(b);
    }

    public final void e() {
        int i = this.d;
        int i2 = this.h;
        if (i < i2) {
            if (i == 0) {
                i();
            } else {
                j(i2 - i);
            }
        }
    }

    public final void f(arkj arkjVar) {
        this.a.add(arkjVar);
        int i = arkjVar.h;
        int i2 = this.d;
        if (i > i2) {
            i();
            return;
        }
        j((this.h + i) - i2);
        int i3 = this.g + 1;
        arkj[] arkjVarArr = this.e;
        int length = arkjVarArr.length;
        if (i3 > length) {
            arkj[] arkjVarArr2 = new arkj[length + length];
            System.arraycopy(arkjVarArr, 0, arkjVarArr2, length, length);
            this.f = this.e.length - 1;
            this.e = arkjVarArr2;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = arkjVar;
        this.g++;
        this.h += i;
    }
}
