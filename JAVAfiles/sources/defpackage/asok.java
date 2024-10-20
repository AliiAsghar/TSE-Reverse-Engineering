package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asok {
    public final asqu a;
    public boolean c;
    public int f;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = 4096;
    public asoi[] e = new asoi[8];

    public asok(asqu asquVar) {
        this.a = asquVar;
        this.f = r1.length - 1;
    }

    public final void a() {
        aqil.d(r0, null, 0, this.e.length);
        this.f = this.e.length - 1;
        this.g = 0;
        this.h = 0;
    }

    public final void b(asoi asoiVar) {
        int i = asoiVar.i;
        int i2 = this.d;
        if (i > i2) {
            a();
            return;
        }
        e((this.h + i) - i2);
        int i3 = this.g + 1;
        asoi[] asoiVarArr = this.e;
        int length = asoiVarArr.length;
        if (i3 > length) {
            asoi[] asoiVarArr2 = new asoi[length + length];
            System.arraycopy(asoiVarArr, 0, asoiVarArr2, length, length);
            this.f = this.e.length - 1;
            this.e = asoiVarArr2;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = asoiVar;
        this.g++;
        this.h += i;
    }

    public final void c(asqx asqxVar) {
        long j;
        int[] iArr = aspm.a;
        int i = 0;
        long j2 = 0;
        for (int i2 = 0; i2 < asqxVar.b(); i2++) {
            j2 += aspm.b[asmt.y(asqxVar.a(i2))];
        }
        if (((int) ((j2 + 7) >> 3)) < asqxVar.b()) {
            asqu asquVar = new asqu();
            int b = asqxVar.b();
            long j3 = 0;
            int i3 = 0;
            while (i < b) {
                int y = asmt.y(asqxVar.a(i));
                int i4 = aspm.a[y];
                byte b2 = aspm.b[y];
                long j4 = j3 << b2;
                long j5 = i4;
                i3 += b2;
                while (true) {
                    j = j4 | j5;
                    if (i3 >= 8) {
                        i3 -= 8;
                        asquVar.M((int) (j >> i3));
                    }
                }
                i++;
                j3 = j;
            }
            if (i3 > 0) {
                asquVar.M((int) ((255 >>> i3) | (j3 << (8 - i3))));
            }
            asqx s = asquVar.s();
            d(s.b(), 127, 128);
            this.a.J(s);
            return;
        }
        d(asqxVar.b(), 127, 0);
        this.a.J(asqxVar);
    }

    public final void d(int i, int i2, int i3) {
        if (i < i2) {
            this.a.M(i | i3);
            return;
        }
        this.a.M(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            this.a.M(128 | (i4 & 127));
            i4 >>>= 7;
        }
        this.a.M(i4);
    }

    public final void e(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                asoi asoiVar = this.e[length];
                asoiVar.getClass();
                int i4 = this.h;
                asoiVar.getClass();
                int i5 = asoiVar.i;
                this.h = i4 - i5;
                this.g--;
                i3++;
                i -= i5;
                length--;
            }
            asoi[] asoiVarArr = this.e;
            int i6 = i2 + 1;
            System.arraycopy(asoiVarArr, i6, asoiVarArr, i6 + i3, this.g);
            asoi[] asoiVarArr2 = this.e;
            int i7 = this.f + 1;
            Arrays.fill(asoiVarArr2, i7, i7 + i3, (Object) null);
            this.f += i3;
        }
    }
}
