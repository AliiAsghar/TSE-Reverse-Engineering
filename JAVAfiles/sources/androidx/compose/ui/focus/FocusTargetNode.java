package androidx.compose.ui.focus;

import defpackage.a;
import defpackage.armj;
import defpackage.armm;
import defpackage.arnb;
import defpackage.arqg;
import defpackage.arqv;
import defpackage.arro;
import defpackage.arrp;
import defpackage.arsb;
import defpackage.cbh;
import defpackage.cga;
import defpackage.cid;
import defpackage.cie;
import defpackage.cin;
import defpackage.ciq;
import defpackage.cir;
import defpackage.cis;
import defpackage.ciz;
import defpackage.cja;
import defpackage.cjb;
import defpackage.cjc;
import defpackage.cjd;
import defpackage.cpp;
import defpackage.csg;
import defpackage.css;
import defpackage.cst;
import defpackage.cvs;
import defpackage.cvt;
import defpackage.cvw;
import defpackage.cvx;
import defpackage.cvy;
import defpackage.cwm;
import defpackage.cwn;
import defpackage.cwp;
import defpackage.cwr;
import defpackage.cxn;
import defpackage.cyg;
import defpackage.cyk;
import defpackage.cyn;
import defpackage.cyu;
import defpackage.cyv;
import defpackage.czb;
import defpackage.dai;
import defpackage.dch;
import defpackage.ve;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FocusTargetNode extends cga.c implements cwm, cja, cyu, cvy {
    public boolean a;
    public boolean b;
    public ciz c;
    private final arqv d;
    private int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: androidx.compose.ui.focus.FocusTargetNode$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqg<arnb> {
        final /* synthetic */ arsb a;
        final /* synthetic */ FocusTargetNode b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(arsb arsbVar, FocusTargetNode focusTargetNode) {
            super(0);
            this.a = arsbVar;
            this.b = focusTargetNode;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            FocusTargetNode focusTargetNode = this.b;
            this.a.a = focusTargetNode.d();
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static final class FocusTargetElement extends cyg<FocusTargetNode> {
        public static final FocusTargetElement a = new FocusTargetElement();

        private FocusTargetElement() {
        }

        @Override // defpackage.cyg
        public final /* synthetic */ cga.c d() {
            return new FocusTargetNode(0, 3);
        }

        @Override // defpackage.cyg
        public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return 1739042953;
        }
    }

    public FocusTargetNode(int i, arqv arqvVar) {
        this.d = arqvVar;
        this.e = i;
    }

    @Override // defpackage.cyu
    public final void a() {
        ciz e = e();
        i();
        if (e != e()) {
            g();
        }
    }

    @Override // defpackage.cja
    public final boolean b() {
        Boolean c = cjd.c(this, 7);
        if (c != null) {
            return c.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [cbh] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [cbh] */
    public final ciq d() {
        boolean z;
        cyk cykVar;
        cir cirVar = new cir();
        int i = this.e;
        if (a.bA(i, 1)) {
            z = true;
        } else if (a.bA(i, 0)) {
            z = !a.bA(((cpp) cwn.a(this, dch.h)).a(), 1);
        } else if (a.bA(i, 2)) {
            z = false;
        } else {
            throw new IllegalStateException("Unknown Focusability");
        }
        cirVar.a = z;
        cga.c cVar = this.p;
        if (cVar.z) {
            cxn e = cwp.e(this);
            cga.c cVar2 = cVar;
            loop0: while (e != null) {
                if ((e.w.e.r & 3072) != 0) {
                    while (cVar2 != null) {
                        int i2 = cVar2.q;
                        if ((i2 & 3072) != 0) {
                            if (cVar2 != cVar && (i2 & 1024) != 0) {
                                break loop0;
                            }
                            if ((i2 & 2048) != 0) {
                                cwr cwrVar = cVar2;
                                ?? r8 = 0;
                                while (cwrVar != 0) {
                                    if (cwrVar instanceof cis) {
                                        ((cis) cwrVar).u(cirVar);
                                    } else if ((cwrVar.q & 2048) != 0 && (cwrVar instanceof cwr)) {
                                        cga.c cVar3 = cwrVar.B;
                                        int i3 = 0;
                                        cwrVar = cwrVar;
                                        r8 = r8;
                                        while (cVar3 != null) {
                                            if ((cVar3.q & 2048) != 0) {
                                                i3++;
                                                r8 = r8;
                                                if (i3 == 1) {
                                                    cwrVar = cVar3;
                                                } else {
                                                    if (r8 == 0) {
                                                        r8 = new cbh(new cga.c[16]);
                                                    }
                                                    if (cwrVar != 0) {
                                                        r8.n(cwrVar);
                                                    }
                                                    r8.n(cVar3);
                                                    cwrVar = 0;
                                                }
                                            }
                                            cVar3 = cVar3.t;
                                            cwrVar = cwrVar;
                                            r8 = r8;
                                        }
                                        if (i3 != 1) {
                                        }
                                    }
                                    cwrVar = cwp.a(r8);
                                }
                            }
                        }
                        cVar2 = cVar2.s;
                    }
                }
                e = e.t();
                if (e != null && (cykVar = e.w) != null) {
                    cVar2 = cykVar.d;
                } else {
                    cVar2 = null;
                }
            }
            return cirVar;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    @Override // cga.c
    public final boolean dL() {
        return false;
    }

    @Override // cga.c
    public final void dQ() {
        cjb.b(this);
    }

    public final ciz e() {
        ciz a;
        cxn cxnVar;
        czb czbVar;
        cin cinVar;
        cyn cynVar = this.p.v;
        cjc cjcVar = null;
        if (cynVar != null && (cxnVar = cynVar.r) != null && (czbVar = cxnVar.l) != null && (cinVar = ((dai) czbVar).d) != null) {
            cjcVar = ((FocusOwnerImpl) cinVar).e;
        }
        if (cjcVar == null || (a = cjcVar.a(this)) == null) {
            ciz cizVar = this.c;
            if (cizVar == null) {
                return ciz.d;
            }
            return cizVar;
        }
        return a;
    }

    public final css f() {
        return (css) cvx.a(this, cst.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [cbh] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [cbh] */
    public final void g() {
        cyk cykVar;
        arqv arqvVar;
        ciz cizVar = this.c;
        if (cizVar == null) {
            cizVar = ciz.d;
        }
        ciz e = e();
        if (cizVar != e && (arqvVar = this.d) != null) {
            arqvVar.a(cizVar, e);
        }
        cga.c cVar = this.p;
        if (cVar.z) {
            cxn e2 = cwp.e(this);
            cga.c cVar2 = cVar;
            while (e2 != null) {
                if ((e2.w.e.r & 5120) != 0) {
                    while (cVar2 != null) {
                        int i = cVar2.q;
                        if ((i & 5120) != 0) {
                            if (cVar2 == cVar || (i & 1024) == 0) {
                                if ((i & 4096) != 0) {
                                    cwr cwrVar = cVar2;
                                    ?? r5 = 0;
                                    while (cwrVar != 0) {
                                        if (cwrVar instanceof cid) {
                                            cid cidVar = (cid) cwrVar;
                                            cidVar.a(cie.a(cidVar));
                                        } else if ((cwrVar.q & 4096) != 0 && (cwrVar instanceof cwr)) {
                                            cga.c cVar3 = cwrVar.B;
                                            int i2 = 0;
                                            cwrVar = cwrVar;
                                            r5 = r5;
                                            while (cVar3 != null) {
                                                if ((cVar3.q & 4096) != 0) {
                                                    i2++;
                                                    r5 = r5;
                                                    if (i2 == 1) {
                                                        cwrVar = cVar3;
                                                    } else {
                                                        if (r5 == 0) {
                                                            r5 = new cbh(new cga.c[16]);
                                                        }
                                                        if (cwrVar != 0) {
                                                            r5.n(cwrVar);
                                                        }
                                                        r5.n(cVar3);
                                                        cwrVar = 0;
                                                    }
                                                }
                                                cVar3 = cVar3.t;
                                                cwrVar = cwrVar;
                                                r5 = r5;
                                            }
                                            if (i2 != 1) {
                                            }
                                        }
                                        cwrVar = cwp.a(r5);
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                        cVar2 = cVar2.s;
                    }
                }
                e2 = e2.t();
                if (e2 != null && (cykVar = e2.w) != null) {
                    cVar2 = cykVar.d;
                } else {
                    cVar2 = null;
                }
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    public final void h(ciz cizVar) {
        cyk cykVar;
        if (!k()) {
            cjc a = cjb.a(this);
            try {
                if (a.b) {
                    a.c();
                }
                a.b();
                if (cizVar == null) {
                    cga.c cVar = this.p;
                    if (cVar.z) {
                        cga.c cVar2 = cVar.s;
                        cxn e = cwp.e(this);
                        while (true) {
                            if (e == null) {
                                break;
                            }
                            if ((e.w.e.r & 1024) != 0) {
                                while (cVar2 != null) {
                                    if ((cVar2.q & 1024) != 0) {
                                        cga.c cVar3 = cVar2;
                                        cbh cbhVar = null;
                                        while (cVar3 != null) {
                                            int i = 0;
                                            if (cVar3 instanceof FocusTargetNode) {
                                                FocusTargetNode focusTargetNode = (FocusTargetNode) cVar3;
                                                if (focusTargetNode.k()) {
                                                    ciz e2 = focusTargetNode.e();
                                                    ciz cizVar2 = ciz.a;
                                                    int ordinal = e2.ordinal();
                                                    if (ordinal != 0) {
                                                        if (ordinal != 1) {
                                                            if (ordinal != 2 && ordinal != 3) {
                                                                throw new armm();
                                                            }
                                                        } else {
                                                            if (!this.p.z) {
                                                                csg.c("visitSubtreeIf called on an unattached node");
                                                            }
                                                            cbh cbhVar2 = new cbh(new cga.c[16]);
                                                            cga.c cVar4 = this.p;
                                                            cga.c cVar5 = cVar4.t;
                                                            if (cVar5 == null) {
                                                                cwp.j(cbhVar2, cVar4);
                                                            } else {
                                                                cbhVar2.n(cVar5);
                                                            }
                                                            while (true) {
                                                                int i2 = cbhVar2.b;
                                                                if (i2 == 0) {
                                                                    break;
                                                                }
                                                                cga.c cVar6 = (cga.c) cbhVar2.c(i2 - 1);
                                                                if ((cVar6.r & 1024) != 0) {
                                                                    for (cga.c cVar7 = cVar6; cVar7 != null; cVar7 = cVar7.t) {
                                                                        if ((cVar7.q & 1024) != 0) {
                                                                            cbh cbhVar3 = null;
                                                                            cga.c cVar8 = cVar7;
                                                                            while (cVar8 != null) {
                                                                                if (cVar8 instanceof FocusTargetNode) {
                                                                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar8;
                                                                                    if (focusTargetNode2.k()) {
                                                                                        int ordinal2 = focusTargetNode2.e().ordinal();
                                                                                        if (ordinal2 == 0 || ordinal2 == 1 || ordinal2 == 2) {
                                                                                            break;
                                                                                        } else if (ordinal2 != 3) {
                                                                                            throw new armm();
                                                                                        }
                                                                                    }
                                                                                } else if ((cVar8.q & 1024) != 0 && (cVar8 instanceof cwr)) {
                                                                                    int i3 = 0;
                                                                                    for (cga.c cVar9 = ((cwr) cVar8).B; cVar9 != null; cVar9 = cVar9.t) {
                                                                                        if ((cVar9.q & 1024) != 0) {
                                                                                            i3++;
                                                                                            if (i3 == 1) {
                                                                                                cVar8 = cVar9;
                                                                                            } else {
                                                                                                if (cbhVar3 == null) {
                                                                                                    cbhVar3 = new cbh(new cga.c[16]);
                                                                                                }
                                                                                                if (cVar8 != null) {
                                                                                                    cbhVar3.n(cVar8);
                                                                                                }
                                                                                                cbhVar3.n(cVar9);
                                                                                                cVar8 = null;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (i3 != 1) {
                                                                                    }
                                                                                }
                                                                                cVar8 = cwp.a(cbhVar3);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                cwp.j(cbhVar2, cVar6);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if ((cVar3.q & 1024) != 0 && (cVar3 instanceof cwr)) {
                                                for (cga.c cVar10 = ((cwr) cVar3).B; cVar10 != null; cVar10 = cVar10.t) {
                                                    if ((cVar10.q & 1024) != 0) {
                                                        i++;
                                                        if (i == 1) {
                                                            cVar3 = cVar10;
                                                        } else {
                                                            if (cbhVar == null) {
                                                                cbhVar = new cbh(new cga.c[16]);
                                                            }
                                                            if (cVar3 != null) {
                                                                cbhVar.n(cVar3);
                                                            }
                                                            cbhVar.n(cVar10);
                                                            cVar3 = null;
                                                        }
                                                    }
                                                }
                                                if (i != 1) {
                                                }
                                            }
                                            cVar3 = cwp.a(cbhVar);
                                        }
                                    }
                                    cVar2 = cVar2.s;
                                }
                            }
                            e = e.t();
                            if (e != null && (cykVar = e.w) != null) {
                                cVar2 = cykVar.d;
                            } else {
                                cVar2 = null;
                            }
                        }
                        cizVar = ciz.d;
                    } else {
                        throw new IllegalStateException("visitAncestors called on an unattached node");
                    }
                }
                j(cizVar);
                return;
            } finally {
                a.d();
            }
        }
        throw new IllegalStateException("Re-initializing focus target node.");
    }

    public final void i() {
        ciq ciqVar = null;
        if (!k()) {
            h(null);
        }
        ciz e = e();
        ciz cizVar = ciz.a;
        int ordinal = e.ordinal();
        if (ordinal == 0 || ordinal == 2) {
            arsb arsbVar = new arsb();
            cyv.a(this, new AnonymousClass1(arsbVar, this));
            Object obj = arsbVar.a;
            if (obj == null) {
                arro.b("focusProperties");
            } else {
                ciqVar = (ciq) obj;
            }
            if (!ciqVar.d()) {
                ((dai) cwp.g(this)).d.a(true);
            }
        }
    }

    public final void j(ciz cizVar) {
        ve veVar = cjb.a(this).c;
        if (cizVar != null) {
            veVar.j(this, cizVar);
        } else {
            csg.a("requires a non-null focus state");
            throw new armj();
        }
    }

    public final boolean k() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.cvy
    public final /* synthetic */ cvw p() {
        return cvs.a;
    }

    @Override // defpackage.cwb
    public final /* synthetic */ Object q(cvt cvtVar) {
        return cvx.a(this, cvtVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (r0 != 2) goto L18;
     */
    @Override // cga.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s() {
        /*
            r4 = this;
            ciz r0 = r4.e()
            ciz r1 = defpackage.ciz.a
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 == r1) goto L13
            r2 = 2
            if (r0 == r2) goto L2f
            goto L40
        L13:
            cjc r0 = defpackage.cjb.a(r4)
            boolean r1 = r0.b     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L1e
            r0.c()     // Catch: java.lang.Throwable -> L2a
        L1e:
            r0.b()     // Catch: java.lang.Throwable -> L2a
            ciz r1 = defpackage.ciz.d     // Catch: java.lang.Throwable -> L2a
            r4.j(r1)     // Catch: java.lang.Throwable -> L2a
            r0.d()
            goto L40
        L2a:
            r1 = move-exception
            r0.d()
            throw r1
        L2f:
            czb r0 = defpackage.cwp.g(r4)
            dai r0 = (defpackage.dai) r0
            cin r0 = r0.d
            r2 = 0
            r3 = 8
            r0.g(r1, r2, r3)
            defpackage.cjb.b(r4)
        L40:
            r0 = 0
            r4.c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTargetNode.s():void");
    }

    public /* synthetic */ FocusTargetNode(int i, int i2) {
        this(1 == (i2 & 1) ? 1 : i, (arqv) null);
    }
}
