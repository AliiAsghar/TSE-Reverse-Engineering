package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ezg implements fbd, fbf {
    public final int b;
    public int c;
    public fhv d;
    public long e;
    public long f;
    public boolean g;
    public fbe i;
    private fbg j;
    private int k;
    private fbz l;
    private eti m;
    private eqn[] n;
    private boolean p;
    public final Object a = new Object();
    private final fqu q = new fqu();
    private long o = Long.MIN_VALUE;
    public erz h = erz.a;

    public ezg(int i) {
        this.b = i;
    }

    private final void W(long j, boolean z) {
        this.g = false;
        this.f = j;
        this.o = j;
        u(j, z);
    }

    @Override // defpackage.fbd
    public final void A() {
        boolean z;
        if (this.c == 0) {
            z = true;
        } else {
            z = false;
        }
        dzg.d(z);
        v();
    }

    @Override // defpackage.fbd
    public final void B(eqn[] eqnVarArr, fhv fhvVar, long j, long j2, fgv fgvVar) {
        dzg.d(!this.g);
        this.d = fhvVar;
        if (this.o == Long.MIN_VALUE) {
            this.o = j;
        }
        this.n = eqnVarArr;
        this.e = j2;
        z(eqnVarArr, j, j2, fgvVar);
    }

    @Override // defpackage.fbd
    public final void C() {
        boolean z;
        if (this.c == 0) {
            z = true;
        } else {
            z = false;
        }
        dzg.d(z);
        this.q.a();
        w();
    }

    @Override // defpackage.fbd
    public final void D(long j) {
        W(j, false);
    }

    @Override // defpackage.fbd
    public final void E() {
        this.g = true;
    }

    @Override // defpackage.fbf
    public final void F(fbe fbeVar) {
        synchronized (this.a) {
            this.i = fbeVar;
        }
    }

    @Override // defpackage.fbd
    public final void H(erz erzVar) {
        if (!Objects.equals(this.h, erzVar)) {
            this.h = erzVar;
        }
    }

    @Override // defpackage.fbd
    public final void I() {
        boolean z = true;
        if (this.c != 1) {
            z = false;
        }
        dzg.d(z);
        this.c = 2;
        x();
    }

    @Override // defpackage.fbd
    public final void J() {
        boolean z;
        if (this.c == 2) {
            z = true;
        } else {
            z = false;
        }
        dzg.d(z);
        this.c = 1;
        y();
    }

    @Override // defpackage.fbd
    public final boolean K() {
        if (this.o == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fbd
    public final boolean L() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final eqn[] M() {
        eqn[] eqnVarArr = this.n;
        dzg.g(eqnVarArr);
        return eqnVarArr;
    }

    @Override // defpackage.fbd
    public final void N(fbg fbgVar, eqn[] eqnVarArr, fhv fhvVar, boolean z, boolean z2, long j, long j2, fgv fgvVar) {
        boolean z3;
        if (this.c == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        dzg.d(z3);
        this.j = fbgVar;
        this.c = 1;
        t(z, z2);
        B(eqnVarArr, fhvVar, j, j2, fgvVar);
        W(j, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void O() {
        dzg.g(this.j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int P(fqu fquVar, ewl ewlVar, int i) {
        fhv fhvVar = this.d;
        dzg.g(fhvVar);
        int d = fhvVar.d(fquVar, ewlVar, i);
        if (d == -4) {
            if (ewlVar.eR()) {
                this.o = Long.MIN_VALUE;
                if (this.g) {
                    return -4;
                }
                return -3;
            }
            long j = ewlVar.f + this.e;
            ewlVar.f = j;
            this.o = Math.max(this.o, j);
        } else if (d == -5) {
            eqn eqnVar = fquVar.a;
            dzg.g(eqnVar);
            long j2 = eqnVar.t;
            if (j2 != Long.MAX_VALUE) {
                eqm eqmVar = new eqm(eqnVar);
                eqmVar.r = j2 + this.e;
                fquVar.a = new eqn(eqmVar);
                return -5;
            }
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final fqu Q() {
        this.q.a();
        return this.q;
    }

    @Override // defpackage.fbf
    public int d() {
        return 0;
    }

    @Override // defpackage.fbd
    public final long e() {
        return this.o;
    }

    @Override // defpackage.fbd
    public final int eK() {
        return this.c;
    }

    @Override // defpackage.fbd, defpackage.fbf
    public final int eL() {
        return this.b;
    }

    public final int eM(long j) {
        fhv fhvVar = this.d;
        dzg.g(fhvVar);
        return fhvVar.a(j - this.e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final eti eN() {
        eti etiVar = this.m;
        dzg.g(etiVar);
        return etiVar;
    }

    public final ezo g(Throwable th, eqn eqnVar, int i) {
        return h(th, eqnVar, false, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ezo h(java.lang.Throwable r13, defpackage.eqn r14, boolean r15, int r16) {
        /*
            r12 = this;
            r1 = r12
            r0 = r14
            r2 = 4
            if (r0 == 0) goto L1e
            boolean r3 = r1.p
            if (r3 != 0) goto L1e
            r3 = 1
            r1.p = r3
            r3 = 0
            int r4 = r12.V(r14)     // Catch: java.lang.Throwable -> L18 defpackage.ezo -> L1c
            int r4 = defpackage.dzn.h(r4)     // Catch: java.lang.Throwable -> L18 defpackage.ezo -> L1c
            r1.p = r3
            goto L1f
        L18:
            r0 = move-exception
            r1.p = r3
            throw r0
        L1c:
            r1.p = r3
        L1e:
            r4 = r2
        L1f:
            java.lang.String r6 = r12.R()
            int r7 = r1.k
            if (r0 != 0) goto L29
            r9 = r2
            goto L2a
        L29:
            r9 = r4
        L2a:
            ezo r11 = new ezo
            r3 = 1
            r2 = r11
            r4 = r13
            r5 = r16
            r8 = r14
            r10 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezg.h(java.lang.Throwable, eqn, boolean, int):ezo");
    }

    @Override // defpackage.fbd
    public fan i() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final fbz k() {
        fbz fbzVar = this.l;
        dzg.g(fbzVar);
        return fbzVar;
    }

    @Override // defpackage.fbd
    public final fhv l() {
        return this.d;
    }

    @Override // defpackage.fbf
    public final void m() {
        synchronized (this.a) {
            this.i = null;
        }
    }

    @Override // defpackage.fbd
    public final void n() {
        boolean z = true;
        if (this.c != 1) {
            z = false;
        }
        dzg.d(z);
        this.q.a();
        this.c = 0;
        this.d = null;
        this.n = null;
        this.g = false;
        s();
    }

    @Override // defpackage.fbd
    public final void q(int i, fbz fbzVar, eti etiVar) {
        this.k = i;
        this.l = fbzVar;
        this.m = etiVar;
    }

    @Override // defpackage.fbd
    public final void r() {
        fhv fhvVar = this.d;
        dzg.g(fhvVar);
        fhvVar.b();
    }

    @Override // defpackage.fbd
    public final fbf j() {
        return this;
    }

    @Override // defpackage.fbd
    public /* synthetic */ void o() {
    }

    protected void s() {
    }

    protected void v() {
    }

    protected void w() {
    }

    protected void x() {
    }

    protected void y() {
    }

    @Override // defpackage.fbd
    public /* synthetic */ void G(float f, float f2) {
    }

    @Override // defpackage.fba
    public void p(int i, Object obj) {
    }

    protected void t(boolean z, boolean z2) {
    }

    protected void u(long j, boolean z) {
    }

    protected void z(eqn[] eqnVarArr, long j, long j2, fgv fgvVar) {
    }
}
