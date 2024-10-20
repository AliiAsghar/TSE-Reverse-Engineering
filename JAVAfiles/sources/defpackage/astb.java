package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class astb implements assy {
    public final byte[] a = new byte[4];
    public int b = 0;
    public long c;

    @Override // defpackage.assy
    public final void d(byte b) {
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte[] bArr = this.a;
        bArr[i] = b;
        if (i2 == 4) {
            g(bArr, 0);
            this.b = 0;
        }
        this.c++;
    }

    @Override // defpackage.assy
    public final void e(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int max = Math.max(0, i2);
        if (this.b != 0) {
            int i4 = 0;
            while (true) {
                if (i4 < max) {
                    byte[] bArr2 = this.a;
                    int i5 = this.b;
                    int i6 = i5 + 1;
                    this.b = i6;
                    int i7 = i4 + 1;
                    bArr2[i5] = bArr[i4 + i];
                    if (i6 == 4) {
                        g(bArr2, 0);
                        this.b = 0;
                        i3 = i7;
                        break;
                    }
                    i4 = i7;
                } else {
                    i3 = i4;
                    break;
                }
            }
        }
        int i8 = max - 3;
        while (i3 < i8) {
            g(bArr, i + i3);
            i3 += 4;
        }
        while (i3 < max) {
            byte[] bArr3 = this.a;
            int i9 = this.b;
            this.b = i9 + 1;
            bArr3[i9] = bArr[i3 + i];
            i3++;
        }
        this.c += max;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void f();

    protected abstract void g(byte[] bArr, int i);
}
