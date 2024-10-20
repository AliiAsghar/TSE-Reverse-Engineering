package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asoj {
    public final asqw c;
    public int e;
    public int f;
    private int g;
    public int a = 4096;
    public final List b = new ArrayList();
    public asoi[] d = new asoi[8];

    public asoj(asrq asrqVar) {
        this.c = new asrk(asrqVar);
        this.g = r2.length - 1;
    }

    public static final boolean h(int i) {
        if (i >= 0) {
            asoi[] asoiVarArr = asol.a;
            int length = asol.a.length;
            if (i <= 60) {
                return true;
            }
            return false;
        }
        return false;
    }

    private final int i() {
        return asmt.y(this.c.d());
    }

    public final int a(int i) {
        return this.g + 1 + i;
    }

    public final int b(int i, int i2) {
        int i3 = i & i2;
        if (i3 >= i2) {
            int i4 = 0;
            while (true) {
                int i5 = i();
                if ((i5 & 128) != 0) {
                    i2 += (i5 & 127) << i4;
                    i4 += 7;
                } else {
                    return i2 + (i5 << i4);
                }
            }
        } else {
            return i3;
        }
    }

    public final asqx c(int i) {
        if (h(i)) {
            asoi[] asoiVarArr = asol.a;
            return asol.a[i].g;
        }
        asoi[] asoiVarArr2 = asol.a;
        int length = asol.a.length;
        int a = a(i - 61);
        if (a >= 0) {
            asoi[] asoiVarArr3 = this.d;
            if (a < asoiVarArr3.length) {
                asoi asoiVar = asoiVarArr3[a];
                asoiVar.getClass();
                return asoiVar.g;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final asqx d() {
        int i;
        int i2 = i();
        int i3 = i2 & 128;
        long b = b(i2, 127);
        if (i3 == 128) {
            asqu asquVar = new asqu();
            int[] iArr = aspm.a;
            asqw asqwVar = this.c;
            aspl asplVar = aspm.c;
            int i4 = 0;
            long j = 0;
            int i5 = 0;
            while (j < b) {
                int y = asmt.y(asqwVar.d());
                int i6 = i4 << 8;
                i5 += 8;
                while (true) {
                    i = i6 | y;
                    if (i5 >= 8) {
                        int i7 = i5 - 8;
                        Object obj = asplVar.c;
                        obj.getClass();
                        asplVar = ((aspl[]) obj)[(i >>> i7) & 255];
                        asplVar.getClass();
                        if (asplVar.c == null) {
                            asquVar.M(asplVar.a);
                            i5 -= asplVar.b;
                            asplVar = aspm.c;
                        } else {
                            i5 = i7;
                        }
                    }
                }
                j++;
                i4 = i;
            }
            while (i5 > 0) {
                Object obj2 = asplVar.c;
                obj2.getClass();
                aspl asplVar2 = ((aspl[]) obj2)[(i4 << (8 - i5)) & 255];
                asplVar2.getClass();
                if (asplVar2.c != null || asplVar2.b > i5) {
                    break;
                }
                asquVar.M(asplVar2.a);
                i5 -= asplVar2.b;
                asplVar = aspm.c;
            }
            return asquVar.s();
        }
        return this.c.t(b);
    }

    public final void e() {
        aqil.d(r0, null, 0, this.d.length);
        this.g = this.d.length - 1;
        this.e = 0;
        this.f = 0;
    }

    public final void f(int i) {
        int i2;
        if (i > 0) {
            int length = this.d.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.g;
                if (length < i2 || i <= 0) {
                    break;
                }
                asoi asoiVar = this.d[length];
                asoiVar.getClass();
                int i4 = this.f;
                int i5 = asoiVar.i;
                this.f = i4 - i5;
                this.e--;
                i3++;
                i -= i5;
                length--;
            }
            asoi[] asoiVarArr = this.d;
            int i6 = i2 + 1;
            System.arraycopy(asoiVarArr, i6, asoiVarArr, i6 + i3, this.e);
            this.g += i3;
        }
    }

    public final void g(asoi asoiVar) {
        this.b.add(asoiVar);
        int i = asoiVar.i;
        int i2 = this.a;
        if (i > i2) {
            e();
            return;
        }
        f((this.f + i) - i2);
        int i3 = this.e + 1;
        asoi[] asoiVarArr = this.d;
        int length = asoiVarArr.length;
        if (i3 > length) {
            asoi[] asoiVarArr2 = new asoi[length + length];
            System.arraycopy(asoiVarArr, 0, asoiVarArr2, length, length);
            this.g = this.d.length - 1;
            this.d = asoiVarArr2;
        }
        int i4 = this.g;
        this.g = i4 - 1;
        this.d[i4] = asoiVar;
        this.e++;
        this.f += i;
    }
}
