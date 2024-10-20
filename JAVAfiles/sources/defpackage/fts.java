package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fts implements ftn {
    private static final float[] a = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final euf b;
    private final boolean[] c;
    private final ftq d;
    private final fuc e;
    private ftr f;
    private long g;
    private String h;
    private fmq i;
    private boolean j;
    private long k;
    private final fvq l;

    public fts() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013b  */
    @Override // defpackage.ftn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.euf r19) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fts.a(euf):void");
    }

    @Override // defpackage.ftn
    public final void b(flw flwVar, fuq fuqVar) {
        fuqVar.c();
        this.h = fuqVar.b();
        fmq p = flwVar.p(fuqVar.a(), 2);
        this.i = p;
        this.f = new ftr(p);
        fvq fvqVar = this.l;
        if (fvqVar != null) {
            fvqVar.b(flwVar, fuqVar);
        }
    }

    @Override // defpackage.ftn
    public final void c(boolean z) {
        dzg.h(this.f);
        if (z) {
            this.f.b(this.g, 0, this.j);
            this.f.c();
        }
    }

    @Override // defpackage.ftn
    public final void d(long j, int i) {
        this.k = j;
    }

    @Override // defpackage.ftn
    public final void e() {
        euw.g(this.c);
        this.d.b();
        ftr ftrVar = this.f;
        if (ftrVar != null) {
            ftrVar.c();
        }
        fuc fucVar = this.e;
        if (fucVar != null) {
            fucVar.b();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    public fts(fvq fvqVar) {
        euf eufVar;
        this.l = fvqVar;
        this.c = new boolean[4];
        this.d = new ftq();
        this.k = -9223372036854775807L;
        if (fvqVar != null) {
            this.e = new fuc(178);
            eufVar = new euf();
        } else {
            eufVar = null;
            this.e = null;
        }
        this.b = eufVar;
    }
}
