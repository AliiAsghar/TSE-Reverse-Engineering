package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgq extends fif {
    public fgo d;
    private final boolean f;
    private final ery g;
    private final erx h;
    private fgn i;
    private boolean j;
    private boolean k;
    private boolean l;

    public fgq(fgx fgxVar, boolean z) {
        super(fgxVar);
        boolean z2;
        if (z) {
            fgxVar.q();
            z2 = true;
        } else {
            z2 = false;
        }
        this.f = z2;
        this.g = new ery();
        this.h = new erx();
        fgxVar.p();
        this.d = fgo.s(fgxVar.F());
    }

    private final Object H(Object obj) {
        fgo fgoVar = this.d;
        Object obj2 = fgo.c;
        if (fgoVar.d != null && obj.equals(fgo.c)) {
            return this.d.d;
        }
        return obj;
    }

    private final boolean I(long j) {
        fgn fgnVar = this.i;
        int a = this.d.a(fgnVar.a.a);
        if (a == -1) {
            return false;
        }
        long j2 = this.d.n(a, this.h).d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        fgnVar.e = j;
        return true;
    }

    @Override // defpackage.fif
    protected final fgv C(fgv fgvVar) {
        fgo fgoVar = this.d;
        Object obj = fgo.c;
        Object obj2 = fgoVar.d;
        Object obj3 = fgvVar.a;
        if (obj2 != null && this.d.d.equals(obj3)) {
            obj3 = fgo.c;
        }
        return fgvVar.a(obj3);
    }

    @Override // defpackage.fif
    public final void D() {
        if (!this.f) {
            this.j = true;
            G();
        }
    }

    @Override // defpackage.fif, defpackage.fgx
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final fgn w(fgv fgvVar, fjl fjlVar, long j) {
        boolean z;
        fgn fgnVar = new fgn(fgvVar, fjlVar, j);
        if (fgnVar.c == null) {
            z = true;
        } else {
            z = false;
        }
        dzg.d(z);
        fgnVar.c = this.e;
        if (this.k) {
            fgnVar.m(fgvVar.a(H(fgvVar.a)));
        } else {
            this.i = fgnVar;
            if (!this.j) {
                this.j = true;
                G();
            }
        }
        return fgnVar;
    }

    @Override // defpackage.fge, defpackage.ffv
    public final void l() {
        this.k = false;
        this.j = false;
        super.l();
    }

    @Override // defpackage.fif, defpackage.ffv, defpackage.fgx
    public final void o(ere ereVar) {
        if (this.l) {
            this.d = this.d.r(new fic(this.d.b, ereVar));
        } else {
            this.d = fgo.s(ereVar);
        }
        this.e.o(ereVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    @Override // defpackage.fif
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void u(defpackage.erz r15) {
        /*
            r14 = this;
            boolean r0 = r14.k
            r1 = 0
            if (r0 == 0) goto L18
            fgo r0 = r14.d
            fgo r15 = r0.r(r15)
            r14.d = r15
            fgn r15 = r14.i
            if (r15 == 0) goto La7
            long r2 = r15.e
            r14.I(r2)
            goto La7
        L18:
            boolean r0 = r15.q()
            if (r0 == 0) goto L37
            boolean r0 = r14.l
            if (r0 == 0) goto L29
            fgo r0 = r14.d
            fgo r15 = r0.r(r15)
            goto L33
        L29:
            java.lang.Object r0 = defpackage.ery.a
            java.lang.Object r2 = defpackage.fgo.c
            fgo r3 = new fgo
            r3.<init>(r15, r0, r2)
            r15 = r3
        L33:
            r14.d = r15
            goto La7
        L37:
            ery r0 = r14.g
            r2 = 0
            r15.p(r2, r0)
            ery r0 = r14.g
            long r3 = r0.l
            java.lang.Object r0 = r0.b
            fgn r5 = r14.i
            if (r5 == 0) goto L69
            fgo r6 = r14.d
            erx r7 = r14.h
            fgv r8 = r5.a
            java.lang.Object r8 = r8.a
            r6.o(r8, r7)
            erx r6 = r14.h
            long r6 = r6.e
            long r8 = r5.b
            long r6 = r6 + r8
            fgo r5 = r14.d
            ery r8 = r14.g
            ery r2 = r5.p(r2, r8)
            long r8 = r2.l
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 == 0) goto L69
            r12 = r6
            goto L6a
        L69:
            r12 = r3
        L6a:
            ery r9 = r14.g
            erx r10 = r14.h
            r11 = 0
            r8 = r15
            android.util.Pair r2 = r8.l(r9, r10, r11, r12)
            java.lang.Object r3 = r2.first
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            boolean r2 = r14.l
            if (r2 == 0) goto L89
            fgo r0 = r14.d
            fgo r15 = r0.r(r15)
            goto L8f
        L89:
            fgo r2 = new fgo
            r2.<init>(r15, r0, r3)
            r15 = r2
        L8f:
            r14.d = r15
            fgn r15 = r14.i
            if (r15 == 0) goto La7
            boolean r0 = r14.I(r4)
            if (r0 == 0) goto La7
            fgv r15 = r15.a
            java.lang.Object r0 = r15.a
            java.lang.Object r0 = r14.H(r0)
            fgv r1 = r15.a(r0)
        La7:
            r15 = 1
            r14.l = r15
            r14.k = r15
            fgo r15 = r14.d
            r14.j(r15)
            if (r1 == 0) goto Lbb
            fgn r15 = r14.i
            defpackage.dzg.g(r15)
            r15.m(r1)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgq.u(erz):void");
    }

    @Override // defpackage.fif, defpackage.fgx
    public final void v(fgt fgtVar) {
        fgn fgnVar = (fgn) fgtVar;
        if (fgnVar.d != null) {
            fgx fgxVar = fgnVar.c;
            dzg.g(fgxVar);
            fgxVar.v(fgnVar.d);
        }
        if (fgtVar == this.i) {
            this.i = null;
        }
    }

    @Override // defpackage.fge, defpackage.fgx
    public final void t() {
    }
}
