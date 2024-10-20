package defpackage;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arkl {
    public final asqu a;
    arkj[] b = new arkj[8];
    int c;
    public int d;
    private int e;

    public arkl(asqu asquVar) {
        this.d = r0.length - 1;
        this.a = asquVar;
    }

    public final void a(arkj arkjVar) {
        int i;
        int i2 = arkjVar.h;
        if (i2 > 4096) {
            Arrays.fill(this.b, (Object) null);
            this.d = this.b.length - 1;
            this.c = 0;
            this.e = 0;
            return;
        }
        int i3 = (this.e + i2) - 4096;
        if (i3 > 0) {
            int length = this.b.length - 1;
            int i4 = 0;
            while (true) {
                i = this.d;
                if (length < i || i3 <= 0) {
                    break;
                }
                int i5 = this.b[length].h;
                i3 -= i5;
                this.e -= i5;
                this.c--;
                i4++;
                length--;
            }
            arkj[] arkjVarArr = this.b;
            int i6 = i + 1;
            System.arraycopy(arkjVarArr, i6, arkjVarArr, i6 + i4, this.c);
            this.d += i4;
        }
        int i7 = this.c + 1;
        arkj[] arkjVarArr2 = this.b;
        int length2 = arkjVarArr2.length;
        if (i7 > length2) {
            arkj[] arkjVarArr3 = new arkj[length2 + length2];
            System.arraycopy(arkjVarArr2, 0, arkjVarArr3, length2, length2);
            this.d = this.b.length - 1;
            this.b = arkjVarArr3;
        }
        int i8 = this.d;
        this.d = i8 - 1;
        this.b[i8] = arkjVar;
        this.c++;
        this.e += i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(asqx asqxVar) {
        c(asqxVar.b(), 127, 0);
        this.a.J(asqxVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(int i, int i2, int i3) {
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
}
