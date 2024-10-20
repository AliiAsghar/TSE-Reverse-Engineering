package defpackage;

import defpackage.cga;
import defpackage.cxn;
import defpackage.cxt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxc extends cyn {
    private static final clp h;
    public final czn f;
    public cyc g;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class a extends cyc {
        public a(cxc cxcVar) {
            super(cxcVar);
        }

        @Override // defpackage.cyc, defpackage.ctc
        public final int a(int i) {
            cxe p = I().p();
            cue a = p.a();
            cxn cxnVar = p.a;
            return a.a(cxnVar.y(), cxnVar.B(), i);
        }

        @Override // defpackage.cyc, defpackage.ctc
        public final int b(int i) {
            cxe p = I().p();
            cue a = p.a();
            cxn cxnVar = p.a;
            return a.b(cxnVar.y(), cxnVar.B(), i);
        }

        @Override // defpackage.cyc, defpackage.ctc
        public final int c(int i) {
            cxe p = I().p();
            cue a = p.a();
            cxn cxnVar = p.a;
            return a.c(cxnVar.y(), cxnVar.B(), i);
        }

        @Override // defpackage.cyc, defpackage.ctc
        public final int d(int i) {
            cxe p = I().p();
            cue a = p.a();
            cxn cxnVar = p.a;
            return a.d(cxnVar.y(), cxnVar.B(), i);
        }

        @Override // defpackage.cuc
        public final cvc e(long j) {
            x(j);
            cbh o = I().o();
            int i = o.b;
            if (i > 0) {
                Object[] objArr = o.a;
                int i2 = 0;
                do {
                    cxt.a v = ((cxn) objArr[i2]).v();
                    v.getClass();
                    v.i = cxn.c.c;
                    i2++;
                } while (i2 < i);
            }
            super.C(I().p.e(this, I().B(), j));
            return this;
        }

        @Override // defpackage.cya
        public final int s(csh cshVar) {
            int i;
            cxt.a aVar = (cxt.a) A();
            if (!aVar.j) {
                if (cxt.this.c == cxn.a.b) {
                    cwe cweVar = aVar.q;
                    cweVar.f = true;
                    if (cweVar.b) {
                        cxt.this.f();
                    }
                } else {
                    aVar.q.g = true;
                }
            }
            cyc cycVar = ((cxc) aVar.i()).g;
            if (cycVar != null) {
                cycVar.k = true;
            }
            aVar.k();
            cyc cycVar2 = ((cxc) aVar.i()).g;
            if (cycVar2 != null) {
                cycVar2.k = false;
            }
            Integer num = (Integer) aVar.q.h.get(cshVar);
            if (num != null) {
                i = num.intValue();
            } else {
                i = Integer.MIN_VALUE;
            }
            this.o.g(cshVar, i);
            return i;
        }

        @Override // defpackage.cyc
        protected final void y() {
            cxt.a v = I().v();
            v.getClass();
            v.q();
        }
    }

    static {
        ckc ckcVar = new ckc();
        ckcVar.k(cku.e);
        ckcVar.r(1.0f);
        ckcVar.s(1);
        h = ckcVar;
    }

    public cxc(cxn cxnVar) {
        super(cxnVar);
        a aVar;
        czn cznVar = new czn();
        this.f = cznVar;
        cznVar.v = this;
        if (cxnVar.k != null) {
            aVar = new a(this);
        } else {
            aVar = null;
        }
        this.g = aVar;
    }

    private final void D() {
        if (this.j) {
            return;
        }
        this.r.w().s();
    }

    @Override // defpackage.cyn
    public final void A() {
        if (this.g == null) {
            this.g = new a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [cbh] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [cbh] */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.cyn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(cyn.a r20, long r21, defpackage.cxa r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxc.B(cyn$a, long, cxa, boolean, boolean):void");
    }

    @Override // defpackage.cyn
    public final void C(ckr ckrVar, cof cofVar) {
        cxn cxnVar = this.r;
        czb a2 = cxq.a(cxnVar);
        cbh n = cxnVar.n();
        int i = n.b;
        if (i > 0) {
            Object[] objArr = n.a;
            int i2 = 0;
            do {
                cxn cxnVar2 = (cxn) objArr[i2];
                if (cxnVar2.ew()) {
                    cxnVar2.K(ckrVar, cofVar);
                }
                i2++;
            } while (i2 < i);
        }
        if (((dai) a2).t) {
            ab(ckrVar, h);
        }
    }

    @Override // defpackage.ctc
    public final int a(int i) {
        cxe p = this.r.p();
        cue a2 = p.a();
        cxn cxnVar = p.a;
        return a2.a(cxnVar.y(), cxnVar.C(), i);
    }

    @Override // defpackage.ctc
    public final int b(int i) {
        cxe p = this.r.p();
        cue a2 = p.a();
        cxn cxnVar = p.a;
        return a2.b(cxnVar.y(), cxnVar.C(), i);
    }

    @Override // defpackage.ctc
    public final int c(int i) {
        cxe p = this.r.p();
        cue a2 = p.a();
        cxn cxnVar = p.a;
        return a2.c(cxnVar.y(), cxnVar.C(), i);
    }

    @Override // defpackage.ctc
    public final int d(int i) {
        cxe p = this.r.p();
        cue a2 = p.a();
        cxn cxnVar = p.a;
        return a2.d(cxnVar.y(), cxnVar.C(), i);
    }

    @Override // defpackage.cuc
    public final cvc e(long j) {
        if (this.t) {
            cyc cycVar = this.g;
            cycVar.getClass();
            j = cycVar.d;
        }
        x(j);
        cbh o = this.r.o();
        int i = o.b;
        if (i > 0) {
            Object[] objArr = o.a;
            int i2 = 0;
            do {
                ((cxn) objArr[i2]).w().k = cxn.c.c;
                i2++;
            } while (i2 < i);
        }
        cxn cxnVar = this.r;
        an(cxnVar.p.e(this, cxnVar.C(), j));
        ah();
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyn, defpackage.cvc
    public final void ee(long j, float f, arqr arqrVar) {
        super.ee(j, f, arqrVar);
        D();
    }

    @Override // defpackage.cya
    public final int s(csh cshVar) {
        cyc cycVar = this.g;
        if (cycVar != null) {
            return cycVar.s(cshVar);
        }
        cxt.b bVar = (cxt.b) X();
        if (!bVar.l) {
            if (cxt.this.c == cxn.a.a) {
                cwe cweVar = bVar.u;
                cweVar.f = true;
                if (cweVar.b) {
                    cxt.this.e();
                }
            } else {
                bVar.u.g = true;
            }
        }
        bVar.i().k = true;
        bVar.k();
        bVar.i().k = false;
        Integer num = (Integer) bVar.u.h.get(cshVar);
        if (num == null) {
            return Integer.MIN_VALUE;
        }
        return num.intValue();
    }

    @Override // defpackage.cyn, defpackage.cvc
    public final void v(long j, float f, cof cofVar) {
        super.v(j, f, cofVar);
        D();
    }

    @Override // defpackage.cyn
    public final /* synthetic */ cga.c y() {
        return this.f;
    }

    @Override // defpackage.cyn
    public final cyc z() {
        return this.g;
    }
}
