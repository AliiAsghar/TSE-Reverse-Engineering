package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abjk {
    public int a = 0;
    public int b = 0;
    public final int[] c;
    public final byte[] d;

    public abjk(int[] iArr, byte[] bArr) {
        this.c = iArr;
        this.d = bArr;
    }

    public final void a(int i) {
        if (i < this.a) {
            this.a = 0;
            this.b = 0;
        }
        while (true) {
            int i2 = this.a;
            if (i2 < i) {
                this.b += this.c[i2];
                this.a = i2 + 1;
            } else {
                return;
            }
        }
    }
}
