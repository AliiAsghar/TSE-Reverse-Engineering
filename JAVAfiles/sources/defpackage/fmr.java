package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmr {
    private final byte[] a = new byte[10];
    private boolean b;
    private int c;
    private long d;
    private int e;
    private int f;
    private int g;

    public final void a(fmq fmqVar, fmp fmpVar) {
        if (this.c > 0) {
            fmqVar.n(this.d, this.e, this.f, this.g, fmpVar);
            this.c = 0;
        }
    }

    public final void b() {
        this.b = false;
        this.c = 0;
    }

    public final void c(fmq fmqVar, long j, int i, int i2, int i3, fmp fmpVar) {
        boolean z;
        if (this.g <= i2 + i3) {
            z = true;
        } else {
            z = false;
        }
        dzg.e(z, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(fmqVar, fmpVar);
            }
        }
    }

    public final void d(flv flvVar) {
        if (!this.b) {
            flvVar.j(this.a, 0, 10);
            flvVar.l();
            byte[] bArr = this.a;
            int[] iArr = flb.a;
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
                this.b = true;
            }
        }
    }
}
