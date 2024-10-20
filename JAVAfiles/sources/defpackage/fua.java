package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fua implements ftn {
    private String d;
    private fmq e;
    private boolean h;
    private int j;
    private int k;
    private int m;
    private int n;
    private int r;
    private boolean t;
    private int c = 0;
    private final euf a = new euf(new byte[15], 2);
    private final fjl u = new fjl((byte[]) null);
    private final euf b = new euf();
    private final fub o = new fub();
    private int p = -2147483647;
    private int q = -1;
    private long s = -1;
    private boolean i = true;
    private boolean l = true;
    private double f = -9.223372036854776E18d;
    private double g = -9.223372036854776E18d;

    private static final void f(euf eufVar, euf eufVar2, boolean z) {
        int i = eufVar.b;
        int min = Math.min(eufVar.b(), eufVar2.b());
        eufVar.E(eufVar2.a, eufVar2.b, min);
        eufVar2.K(min);
        if (z) {
            eufVar.J(i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:203:0x0245. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x035b A[SYNTHETIC] */
    @Override // defpackage.ftn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.euf r23) {
        /*
            Method dump skipped, instructions count: 1276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fua.a(euf):void");
    }

    @Override // defpackage.ftn
    public final void b(flw flwVar, fuq fuqVar) {
        fuqVar.c();
        this.d = fuqVar.b();
        this.e = flwVar.p(fuqVar.a(), 1);
    }

    @Override // defpackage.ftn
    public final void d(long j, int i) {
        this.j = i;
        if (!this.i && (this.n != 0 || !this.l)) {
            this.h = true;
        }
        if (j != -9223372036854775807L) {
            double d = j;
            if (this.h) {
                this.g = d;
            } else {
                this.f = d;
            }
        }
    }

    @Override // defpackage.ftn
    public final void e() {
        this.c = 0;
        this.k = 0;
        this.a.F(2);
        this.m = 0;
        this.n = 0;
        this.p = -2147483647;
        this.q = -1;
        this.r = 0;
        this.s = -1L;
        this.t = false;
        this.h = false;
        this.l = true;
        this.i = true;
        this.f = -9.223372036854776E18d;
        this.g = -9.223372036854776E18d;
    }

    @Override // defpackage.ftn
    public final void c(boolean z) {
    }
}
