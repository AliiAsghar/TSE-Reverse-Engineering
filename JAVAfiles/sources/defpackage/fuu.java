package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fuu implements fut {
    private final flw a;
    private final fmq b;
    private final fuw c;
    private final eqn d;
    private final int e;
    private long f;
    private int g;
    private long h;

    public fuu(flw flwVar, fmq fmqVar, fuw fuwVar, String str, int i) {
        this.a = flwVar;
        this.b = fmqVar;
        this.c = fuwVar;
        int i2 = fuwVar.b * fuwVar.e;
        int i3 = fuwVar.d;
        int i4 = i2 / 8;
        if (i3 == i4) {
            int i5 = fuwVar.c * i4;
            int i6 = i5 * 8;
            int max = Math.max(i4, i5 / 10);
            this.e = max;
            eqm eqmVar = new eqm();
            eqmVar.b(str);
            eqmVar.h = i6;
            eqmVar.i = i6;
            eqmVar.n = max;
            eqmVar.B = fuwVar.b;
            eqmVar.C = fuwVar.c;
            eqmVar.D = i;
            this.d = new eqn(eqmVar);
            return;
        }
        throw new erm(a.bU(i3, i4, "Expected block size: ", "; got: "), null, true, 1);
    }

    @Override // defpackage.fut
    public final void a(int i, long j) {
        this.a.w(new fux(this.c, 1, i, j));
        this.b.h(this.d);
    }

    @Override // defpackage.fut
    public final void b(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // defpackage.fut
    public final boolean c(flv flvVar, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
            int d = this.b.d(flvVar, (int) Math.min(i2 - i, j2), true);
            if (d == -1) {
                j2 = 0;
            } else {
                this.g += d;
                j2 -= d;
            }
        }
        fuw fuwVar = this.c;
        int i3 = this.g;
        int i4 = fuwVar.d;
        int i5 = i3 / i4;
        if (i5 > 0) {
            long w = this.f + eul.w(this.h, 1000000L, fuwVar.c);
            int i6 = i5 * i4;
            int i7 = this.g - i6;
            this.b.n(w, 1, i6, i7, null);
            this.h += i5;
            this.g = i7;
        }
        if (j2 <= 0) {
            return true;
        }
        return false;
    }
}
