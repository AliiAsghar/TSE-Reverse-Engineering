package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftp implements ftn {
    private static final double[] a = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String b;
    private fmq c;
    private final euf d;
    private final fuc e;
    private final boolean[] f;
    private final fto g;
    private long h;
    private boolean i;
    private boolean j;
    private long k;
    private long l;
    private long m;
    private long n;
    private boolean o;
    private boolean p;
    private final fvq q;

    public ftp() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00fe  */
    @Override // defpackage.ftn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.euf r21) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftp.a(euf):void");
    }

    @Override // defpackage.ftn
    public final void b(flw flwVar, fuq fuqVar) {
        fuqVar.c();
        this.b = fuqVar.b();
        this.c = flwVar.p(fuqVar.a(), 2);
        fvq fvqVar = this.q;
        if (fvqVar != null) {
            fvqVar.b(flwVar, fuqVar);
        }
    }

    @Override // defpackage.ftn
    public final void c(boolean z) {
        dzg.h(this.c);
        if (z) {
            boolean z2 = this.o;
            long j = this.h - this.m;
            this.c.n(this.n, z2 ? 1 : 0, (int) j, 0, null);
        }
    }

    @Override // defpackage.ftn
    public final void d(long j, int i) {
        this.l = j;
    }

    @Override // defpackage.ftn
    public final void e() {
        euw.g(this.f);
        fto ftoVar = this.g;
        ftoVar.b = false;
        ftoVar.c = 0;
        ftoVar.d = 0;
        fuc fucVar = this.e;
        if (fucVar != null) {
            fucVar.b();
        }
        this.h = 0L;
        this.i = false;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    public ftp(fvq fvqVar) {
        euf eufVar;
        this.q = fvqVar;
        this.f = new boolean[4];
        this.g = new fto();
        if (fvqVar != null) {
            this.e = new fuc(178);
            eufVar = new euf();
        } else {
            eufVar = null;
            this.e = null;
        }
        this.d = eufVar;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }
}
