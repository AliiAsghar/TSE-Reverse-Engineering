package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftu implements ftn {
    private long d;
    private String f;
    private fmq g;
    private ftt h;
    private boolean i;
    private boolean k;
    private final kkc m;
    private final boolean[] e = new boolean[3];
    private final fuc a = new fuc(7);
    private final fuc b = new fuc(8);
    private final fuc c = new fuc(6);
    private long j = -9223372036854775807L;
    private final euf l = new euf();

    public ftu(kkc kkcVar) {
        this.m = kkcVar;
    }

    private final void f() {
        dzg.h(this.g);
        int i = eul.a;
    }

    private final void g(byte[] bArr, int i, int i2) {
        if (this.i) {
            boolean z = this.h.b;
        } else {
            this.a.a(bArr, i, i2);
            this.b.a(bArr, i, i2);
        }
        this.c.a(bArr, i, i2);
        boolean z2 = this.h.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0197  */
    @Override // defpackage.ftn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.euf r31) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftu.a(euf):void");
    }

    @Override // defpackage.ftn
    public final void b(flw flwVar, fuq fuqVar) {
        fuqVar.c();
        this.f = fuqVar.b();
        fmq p = flwVar.p(fuqVar.a(), 2);
        this.g = p;
        this.h = new ftt(p);
        this.m.s(flwVar, fuqVar);
    }

    @Override // defpackage.ftn
    public final void c(boolean z) {
        f();
        if (z) {
            this.m.t();
            ftt fttVar = this.h;
            long j = this.d;
            fttVar.d();
            fttVar.e = j;
            fttVar.a(0);
            fttVar.h = false;
        }
    }

    @Override // defpackage.ftn
    public final void d(long j, int i) {
        boolean z;
        this.j = j;
        int i2 = i & 2;
        boolean z2 = this.k;
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        this.k = z | z2;
    }

    @Override // defpackage.ftn
    public final void e() {
        this.d = 0L;
        this.k = false;
        this.j = -9223372036854775807L;
        euw.g(this.e);
        this.a.b();
        this.b.b();
        this.c.b();
        this.m.t();
        ftt fttVar = this.h;
        if (fttVar != null) {
            fttVar.c();
        }
    }
}
