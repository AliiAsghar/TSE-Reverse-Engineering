package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fus implements fut {
    private static final int[] a = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] b = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final flw c;
    private final fmq d;
    private final fuw e;
    private final int f;
    private final byte[] g;
    private final euf h;
    private final int i;
    private final eqn j;
    private int k;
    private long l;
    private int m;
    private long n;

    public fus(flw flwVar, fmq fmqVar, fuw fuwVar) {
        this.c = flwVar;
        this.d = fmqVar;
        this.e = fuwVar;
        int max = Math.max(1, fuwVar.c / 10);
        this.i = max;
        euf eufVar = new euf(fuwVar.f);
        eufVar.h();
        int h = eufVar.h();
        this.f = h;
        int i = fuwVar.b;
        int i2 = (((fuwVar.d - (i * 4)) * 8) / (fuwVar.e * i)) + 1;
        if (h == i2) {
            int c = eul.c(max, h);
            this.g = new byte[fuwVar.d * c];
            this.h = new euf(c * (h + h) * i);
            int i3 = ((fuwVar.c * fuwVar.d) * 8) / h;
            eqm eqmVar = new eqm();
            eqmVar.b("audio/raw");
            eqmVar.h = i3;
            eqmVar.i = i3;
            eqmVar.n = (max + max) * i;
            eqmVar.B = fuwVar.b;
            eqmVar.C = fuwVar.c;
            eqmVar.D = 2;
            this.j = new eqn(eqmVar);
            return;
        }
        throw new erm(a.bU(h, i2, "Expected frames per block: ", "; got: "), null, true, 1);
    }

    private final int d(int i) {
        int i2 = this.e.b;
        return i / (i2 + i2);
    }

    private final int e(int i) {
        return (i + i) * this.e.b;
    }

    private final void f(int i) {
        long w = this.l + eul.w(this.n, 1000000L, this.e.c);
        int e = e(i);
        this.d.n(w, 1, e, this.m - e, null);
        this.n += i;
        this.m -= e;
    }

    @Override // defpackage.fut
    public final void a(int i, long j) {
        this.c.w(new fux(this.e, this.f, i, j));
        this.d.h(this.j);
    }

    @Override // defpackage.fut
    public final void b(long j) {
        this.k = 0;
        this.l = j;
        this.m = 0;
        this.n = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003a -> B:3:0x001e). Please report as a decompilation issue!!! */
    @Override // defpackage.fut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(defpackage.flv r21, long r22) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fus.c(flv, long):boolean");
    }
}
