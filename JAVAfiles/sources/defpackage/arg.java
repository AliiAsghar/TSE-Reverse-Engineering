package defpackage;

import defpackage.are;
import defpackage.cga;
import defpackage.css;
import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arg extends cga.c implements cvy, css, cxi {
    private static final AnonymousClass1 e = new css.a() { // from class: arg.1
        @Override // css.a
        public final boolean a() {
            return false;
        }
    };
    public arh a;
    public are b;
    public boolean c;
    public ahp d;

    /* compiled from: PG */
    /* renamed from: arg$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ cvc a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(cvc cvcVar) {
            super(1);
            this.a = cvcVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            ((cvc.a) obj).e(this.a, 0, 0, brg.a);
            return arnb.a;
        }
    }

    public arg(arh arhVar, are areVar, boolean z, ahp ahpVar) {
        this.a = arhVar;
        this.b = areVar;
        this.c = z;
        this.d = ahpVar;
    }

    private final boolean i(int i) {
        if (!a.bA(i, 1)) {
            if (a.bA(i, 2)) {
                return true;
            }
            if (!a.bA(i, 5)) {
                if (a.bA(i, 6)) {
                    if (!this.c) {
                        return true;
                    }
                } else if (a.bA(i, 3)) {
                    drk i2 = cwp.i(this);
                    drk drkVar = drk.a;
                    int ordinal = i2.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            if (!this.c) {
                                return true;
                            }
                        } else {
                            throw new armm();
                        }
                    }
                } else if (a.bA(i, 4)) {
                    drk i3 = cwp.i(this);
                    drk drkVar2 = drk.a;
                    int ordinal2 = i3.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            return this.c;
                        }
                        throw new armm();
                    }
                    if (!this.c) {
                        return true;
                    }
                } else {
                    arf.a();
                    throw new armj();
                }
            }
            return this.c;
        }
        return false;
    }

    @Override // defpackage.css
    public final Object a(final int i, arqr arqrVar) {
        int a;
        if (this.a.b() > 0 && this.a.d() && this.z) {
            if (i(i)) {
                a = this.a.c();
            } else {
                a = this.a.a();
            }
            final arsb arsbVar = new arsb();
            arsbVar.a = this.b.a(a, a);
            Object obj = null;
            while (obj == null && h((are.a) arsbVar.a, i)) {
                are.a aVar = (are.a) arsbVar.a;
                int i2 = aVar.a;
                int i3 = aVar.b;
                if (i(i)) {
                    i3++;
                } else {
                    i2--;
                }
                are.a a2 = this.b.a(i2, i3);
                this.b.b((are.a) arsbVar.a);
                arsbVar.a = a2;
                cxl.d(this);
                obj = arqrVar.a(new css.a() { // from class: arg.2
                    @Override // css.a
                    public final boolean a() {
                        return arg.this.h((are.a) arsbVar.a, i);
                    }
                });
            }
            this.b.b((are.a) arsbVar.a);
            cxl.d(this);
            return obj;
        }
        return arqrVar.a(e);
    }

    @Override // defpackage.cxi
    public final cuf b(cuh cuhVar, cuc cucVar, long j) {
        cuf et;
        cvc e2 = cucVar.e(j);
        et = cuhVar.et(e2.a, e2.b, arnw.a, new AnonymousClass3(e2));
        return et;
    }

    @Override // defpackage.cxi
    public final /* synthetic */ int d(ctd ctdVar, ctc ctcVar, int i) {
        return cxh.a(this, ctdVar, ctcVar, i);
    }

    @Override // defpackage.cxi
    public final /* synthetic */ int e(ctd ctdVar, ctc ctcVar, int i) {
        return cxh.b(this, ctdVar, ctcVar, i);
    }

    @Override // defpackage.cxi
    public final /* synthetic */ int f(ctd ctdVar, ctc ctcVar, int i) {
        return cxh.c(this, ctdVar, ctcVar, i);
    }

    @Override // defpackage.cxi
    public final /* synthetic */ int g(ctd ctdVar, ctc ctcVar, int i) {
        return cxh.d(this, ctdVar, ctcVar, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
    
        if (r4.d == defpackage.ahp.a) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0043, code lost:
    
        if (r4.d != defpackage.ahp.b) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(are.a r5, int r6) {
        /*
            r4 = this;
            r0 = 5
            boolean r0 = defpackage.a.bA(r6, r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto La
            goto L3f
        La:
            r0 = 6
            boolean r0 = defpackage.a.bA(r6, r0)
            if (r0 != 0) goto L3f
            r0 = 3
            boolean r0 = defpackage.a.bA(r6, r0)
            if (r0 == 0) goto L19
            goto L38
        L19:
            r0 = 4
            boolean r0 = defpackage.a.bA(r6, r0)
            if (r0 != 0) goto L38
            boolean r0 = defpackage.a.bA(r6, r2)
            if (r0 == 0) goto L27
            goto L45
        L27:
            r0 = 2
            boolean r0 = defpackage.a.bA(r6, r0)
            if (r0 == 0) goto L2f
            goto L45
        L2f:
            defpackage.arf.a()
            armj r5 = new armj
            r5.<init>()
            throw r5
        L38:
            ahp r0 = r4.d
            ahp r3 = defpackage.ahp.a
            if (r0 != r3) goto L45
            goto L5d
        L3f:
            ahp r0 = r4.d
            ahp r3 = defpackage.ahp.b
            if (r0 == r3) goto L5d
        L45:
            boolean r6 = r4.i(r6)
            if (r6 == 0) goto L58
            int r5 = r5.b
            arh r6 = r4.a
            int r6 = r6.b()
            int r6 = r6 + (-1)
            if (r5 >= r6) goto L5d
            return r2
        L58:
            int r5 = r5.a
            if (r5 <= 0) goto L5d
            return r2
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arg.h(are$a, int):boolean");
    }

    @Override // defpackage.cvy
    public final cvw p() {
        return cvz.a(new armo(cst.a, this));
    }

    @Override // defpackage.cwb
    public final /* synthetic */ Object q(cvt cvtVar) {
        return cvx.a(this, cvtVar);
    }
}
