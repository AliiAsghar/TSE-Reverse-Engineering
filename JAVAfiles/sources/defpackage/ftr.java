package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ftr {
    public boolean a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public long f;
    private final fmq g;
    private long h;

    public ftr(fmq fmqVar) {
        this.g = fmqVar;
    }

    public final void a(byte[] bArr, int i, int i2) {
        boolean z;
        if (this.b) {
            int i3 = this.e;
            int i4 = (i + 1) - i3;
            if (i4 < i2) {
                if (((bArr[i4] & 192) >> 6) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.c = z;
                this.b = false;
                return;
            }
            this.e = i3 + (i2 - i);
        }
    }

    public final void b(long j, int i, boolean z) {
        boolean z2;
        if (this.f != -9223372036854775807L) {
            z2 = true;
        } else {
            z2 = false;
        }
        dzg.d(z2);
        if (this.d == 182 && z && this.a) {
            long j2 = j - this.h;
            this.g.n(this.f, this.c ? 1 : 0, (int) j2, i, null);
        }
        if (this.d != 179) {
            this.h = j;
        }
    }

    public final void c() {
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = -1;
    }
}
