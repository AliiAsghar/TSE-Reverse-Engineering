package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftw implements ftn {
    private String a;
    private fmq b;
    private ftv c;
    private boolean d;
    private long k;
    private final kkc n;
    private final boolean[] e = new boolean[3];
    private final fuc f = new fuc(32);
    private final fuc g = new fuc(33);
    private final fuc h = new fuc(34);
    private final fuc i = new fuc(39);
    private final fuc j = new fuc(40);
    private long l = -9223372036854775807L;
    private final euf m = new euf();

    public ftw(kkc kkcVar) {
        this.n = kkcVar;
    }

    private final void f() {
        dzg.h(this.b);
        int i = eul.a;
    }

    private final void g(byte[] bArr, int i, int i2) {
        boolean z;
        ftv ftvVar = this.c;
        if (ftvVar.e) {
            int i3 = ftvVar.c;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                if ((bArr[i4] & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                ftvVar.f = z;
                ftvVar.e = false;
            } else {
                ftvVar.c = i3 + (i2 - i);
            }
        }
        if (!this.d) {
            this.f.a(bArr, i, i2);
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
        }
        this.i.a(bArr, i, i2);
        this.j.a(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x022f A[SYNTHETIC] */
    @Override // defpackage.ftn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.euf r28) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftw.a(euf):void");
    }

    @Override // defpackage.ftn
    public final void b(flw flwVar, fuq fuqVar) {
        fuqVar.c();
        this.a = fuqVar.b();
        fmq p = flwVar.p(fuqVar.a(), 2);
        this.b = p;
        this.c = new ftv(p);
        this.n.s(flwVar, fuqVar);
    }

    @Override // defpackage.ftn
    public final void c(boolean z) {
        f();
        if (z) {
            this.n.t();
            ftv ftvVar = this.c;
            long j = this.k;
            ftvVar.l = ftvVar.b;
            ftvVar.a((int) (j - ftvVar.a));
            ftvVar.j = ftvVar.a;
            ftvVar.a = j;
            ftvVar.a(0);
            ftvVar.h = false;
        }
    }

    @Override // defpackage.ftn
    public final void d(long j, int i) {
        this.l = j;
    }

    @Override // defpackage.ftn
    public final void e() {
        this.k = 0L;
        this.l = -9223372036854775807L;
        euw.g(this.e);
        this.f.b();
        this.g.b();
        this.h.b();
        this.i.b();
        this.j.b();
        this.n.t();
        ftv ftvVar = this.c;
        if (ftvVar != null) {
            ftvVar.e = false;
            ftvVar.f = false;
            ftvVar.g = false;
            ftvVar.h = false;
            ftvVar.i = false;
        }
    }
}
