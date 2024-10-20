package androidx.compose.ui.focus;

import defpackage.a;
import defpackage.armm;
import defpackage.arnb;
import defpackage.arqg;
import defpackage.arqr;
import defpackage.arqv;
import defpackage.arrm;
import defpackage.arrp;
import defpackage.arrq;
import defpackage.arru;
import defpackage.arsb;
import defpackage.cbh;
import defpackage.cga;
import defpackage.chy;
import defpackage.cib;
import defpackage.cii;
import defpackage.cin;
import defpackage.cio;
import defpackage.cip;
import defpackage.ciq;
import defpackage.cir;
import defpackage.cit;
import defpackage.ciy;
import defpackage.ciz;
import defpackage.cjc;
import defpackage.cjd;
import defpackage.cje;
import defpackage.cjg;
import defpackage.cjh;
import defpackage.cjp;
import defpackage.cwp;
import defpackage.cwr;
import defpackage.cxn;
import defpackage.cyg;
import defpackage.cyk;
import defpackage.d;
import defpackage.drk;
import defpackage.uh;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FocusOwnerImpl implements cin {
    public final arqv a;
    public final arqg b;
    public final FocusTargetNode c;
    public final cii d;
    public final cjc e = new cjc();
    public final cga f = new cyg<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // defpackage.cyg
        public final /* bridge */ /* synthetic */ cga.c d() {
            return FocusOwnerImpl.this.c;
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
            return FocusOwnerImpl.this.c.hashCode();
        }
    };
    private final arqr g;
    private final arqg h;
    private final arqg i;
    private uh j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: androidx.compose.ui.focus.FocusOwnerImpl$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqg<arnb> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: androidx.compose.ui.focus.FocusOwnerImpl$2, reason: invalid class name */
    /* loaded from: classes.dex */
    /* synthetic */ class AnonymousClass2 extends arrm implements arqg<arnb> {
        public AnonymousClass2(Object obj) {
            super(0, obj, FocusOwnerImpl.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) this.e;
            if (focusOwnerImpl.c.e() == ciz.d) {
                focusOwnerImpl.b.a();
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: androidx.compose.ui.focus.FocusOwnerImpl$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqr<FocusTargetNode, Boolean> {
        final /* synthetic */ FocusTargetNode a;
        final /* synthetic */ FocusOwnerImpl b;
        final /* synthetic */ arqr c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(FocusTargetNode focusTargetNode, FocusOwnerImpl focusOwnerImpl, arqr arqrVar) {
            super(1);
            this.a = focusTargetNode;
            this.b = focusOwnerImpl;
            this.c = arqrVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            boolean booleanValue;
            FocusTargetNode focusTargetNode = (FocusTargetNode) obj;
            if (d.F(focusTargetNode, this.a)) {
                booleanValue = false;
            } else if (!d.F(focusTargetNode, this.b.c)) {
                booleanValue = ((Boolean) this.c.a(focusTargetNode)).booleanValue();
            } else {
                throw new IllegalStateException("Focus search landed at the root.");
            }
            return Boolean.valueOf(booleanValue);
        }
    }

    /* compiled from: PG */
    /* renamed from: androidx.compose.ui.focus.FocusOwnerImpl$5, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass5 extends arrp implements arqr<FocusTargetNode, Boolean> {
        final /* synthetic */ arsb a;
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(arsb arsbVar, int i) {
            super(1);
            this.a = arsbVar;
            this.b = i;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            boolean z;
            Boolean c = cjd.c((FocusTargetNode) obj, this.b);
            arsb arsbVar = this.a;
            arsbVar.a = c;
            Boolean bool = (Boolean) arsbVar.a;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public FocusOwnerImpl(arqr arqrVar, arqv arqvVar, arqr arqrVar2, arqg arqgVar, arqg arqgVar2, arqg arqgVar3) {
        this.a = arqvVar;
        this.g = arqrVar2;
        this.b = arqgVar;
        this.h = arqgVar2;
        this.i = arqgVar3;
        int i = 2;
        this.c = new FocusTargetNode(i, i);
        this.d = new cii(arqrVar, new AnonymousClass2(this), new arru(this) { // from class: androidx.compose.ui.focus.FocusOwnerImpl.3
            @Override // defpackage.arru
            public final Object b() {
                return ((FocusOwnerImpl) this.e).c();
            }
        });
    }

    @Override // defpackage.cij
    public final void a(boolean z) {
        g(z, true, 8);
    }

    @Override // defpackage.cij
    public final boolean b(int i) {
        Boolean e;
        arsb arsbVar = new arsb();
        arsbVar.a = false;
        Boolean e2 = e(i, (cjp) this.h.a(), new AnonymousClass5(arsbVar, i));
        if (e2 == null || arsbVar.a == null) {
            return false;
        }
        if (d.F(e2, true) && d.F(arsbVar.a, true)) {
            return true;
        }
        if (cip.a(i)) {
            if (!g(false, false, i) || (e = e(i, null, new cio(i))) == null || !e.booleanValue()) {
                return false;
            }
            return true;
        }
        return ((Boolean) this.g.a(new cib(i))).booleanValue();
    }

    @Override // defpackage.cin
    public final ciy c() {
        return this.c.e();
    }

    @Override // defpackage.cin
    public final cjp d() {
        FocusTargetNode a = cje.a(this.c);
        if (a != null) {
            return cje.c(a);
        }
        return null;
    }

    @Override // defpackage.cin
    public final Boolean e(int i, cjp cjpVar, arqr arqrVar) {
        boolean a;
        FocusTargetNode focusTargetNode;
        cyk cykVar;
        cit citVar;
        FocusTargetNode a2 = cje.a(this.c);
        int i2 = 4;
        if (a2 != null) {
            arqg arqgVar = this.i;
            boolean bA = a.bA(i, 1);
            Object b = ((arrq) arqgVar).b();
            ciq d = a2.d();
            if (bA) {
                citVar = ((cir) d).b;
            } else if (a.bA(i, 2)) {
                citVar = ((cir) d).c;
            } else if (a.bA(i, 5)) {
                citVar = ((cir) d).d;
            } else if (a.bA(i, 6)) {
                citVar = ((cir) d).e;
            } else if (a.bA(i, 3)) {
                drk drkVar = drk.a;
                ciz cizVar = ciz.a;
                int ordinal = ((drk) b).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        citVar = ((cir) d).i;
                    } else {
                        throw new armm();
                    }
                } else {
                    citVar = ((cir) d).h;
                }
                if (citVar == cit.a) {
                    citVar = null;
                }
                if (citVar == null) {
                    citVar = ((cir) d).f;
                }
            } else if (a.bA(i, 4)) {
                drk drkVar2 = drk.a;
                ciz cizVar2 = ciz.a;
                int ordinal2 = ((drk) b).ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        citVar = ((cir) d).h;
                    } else {
                        throw new armm();
                    }
                } else {
                    citVar = ((cir) d).i;
                }
                if (citVar == cit.a) {
                    citVar = null;
                }
                if (citVar == null) {
                    citVar = ((cir) d).g;
                }
            } else if (a.bA(i, 7)) {
                citVar = (cit) ((cir) d).j.a(new cib(i));
            } else if (a.bA(i, 8)) {
                citVar = (cit) ((cir) d).k.a(new cib(i));
            } else {
                throw new IllegalStateException("invalid FocusDirection");
            }
            if (d.F(citVar, cit.b)) {
                return null;
            }
            if (!d.F(citVar, cit.a)) {
                return Boolean.valueOf(citVar.a(arqrVar));
            }
        } else {
            a2 = null;
        }
        FocusTargetNode focusTargetNode2 = this.c;
        Object b2 = ((arrq) this.i).b();
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(a2, this, arqrVar);
        if (!a.bA(i, 1) && !a.bA(i, 2)) {
            if (!a.bA(i, 3) && !a.bA(i, 4) && !a.bA(i, 5) && !a.bA(i, 6)) {
                if (a.bA(i, 7)) {
                    drk drkVar3 = drk.a;
                    ciz cizVar3 = ciz.a;
                    int ordinal3 = ((drk) b2).ordinal();
                    if (ordinal3 != 0) {
                        if (ordinal3 == 1) {
                            i2 = 3;
                        } else {
                            throw new armm();
                        }
                    }
                    FocusTargetNode a3 = cje.a(focusTargetNode2);
                    if (a3 != null) {
                        return cjh.a(a3, i2, cjpVar, anonymousClass4);
                    }
                    return null;
                }
                if (a.bA(i, 8)) {
                    FocusTargetNode a4 = cje.a(focusTargetNode2);
                    boolean z = false;
                    if (a4 != null) {
                        cga.c cVar = a4.p;
                        if (cVar.z) {
                            cga.c cVar2 = cVar.s;
                            cxn e = cwp.e(a4);
                            loop0: while (e != null) {
                                if ((e.w.e.r & 1024) != 0) {
                                    while (cVar2 != null) {
                                        if ((cVar2.q & 1024) != 0) {
                                            cga.c cVar3 = cVar2;
                                            cbh cbhVar = null;
                                            while (cVar3 != null) {
                                                if (cVar3 instanceof FocusTargetNode) {
                                                    focusTargetNode = (FocusTargetNode) cVar3;
                                                    if (((cir) focusTargetNode.d()).a) {
                                                        break loop0;
                                                    }
                                                } else if ((cVar3.q & 1024) != 0 && (cVar3 instanceof cwr)) {
                                                    int i3 = 0;
                                                    for (cga.c cVar4 = ((cwr) cVar3).B; cVar4 != null; cVar4 = cVar4.t) {
                                                        if ((cVar4.q & 1024) != 0) {
                                                            i3++;
                                                            if (i3 == 1) {
                                                                cVar3 = cVar4;
                                                            } else {
                                                                if (cbhVar == null) {
                                                                    cbhVar = new cbh(new cga.c[16]);
                                                                }
                                                                if (cVar3 != null) {
                                                                    cbhVar.n(cVar3);
                                                                }
                                                                cbhVar.n(cVar4);
                                                                cVar3 = null;
                                                            }
                                                        }
                                                    }
                                                    if (i3 != 1) {
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
                        } else {
                            throw new IllegalStateException("visitAncestors called on an unattached node");
                        }
                    }
                    focusTargetNode = null;
                    if (focusTargetNode != null && !d.F(focusTargetNode, focusTargetNode2)) {
                        z = ((Boolean) anonymousClass4.a(focusTargetNode)).booleanValue();
                    }
                    return Boolean.valueOf(z);
                }
                String a5 = cib.a(i);
                Objects.toString(a5);
                throw new IllegalStateException("Focus search invoked with invalid FocusDirection ".concat(a5));
            }
            return cjh.a(focusTargetNode2, i, cjpVar, anonymousClass4);
        }
        if (a.bA(i, 1)) {
            a = cjg.b(focusTargetNode2, anonymousClass4);
        } else if (a.bA(i, 2)) {
            a = cjg.a(focusTargetNode2, anonymousClass4);
        } else {
            throw new IllegalStateException("This function should only be used for 1-D focus search");
        }
        return Boolean.valueOf(a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:397:0x00b9, code lost:
    
        if (((((~r14) << 6) & r14) & (-9187201950435737472L)) == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x00bb, code lost:
    
        r6 = r2.b(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x00c1, code lost:
    
        if (r2.e != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x00d3, code lost:
    
        if (((r2.a[r6 >> 3] >> ((r6 & 7) << r3)) & 255) != 254) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x00d7, code lost:
    
        r6 = r2.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x00db, code lost:
    
        if (r6 <= 8) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x00dd, code lost:
    
        r6 = java.lang.Long.compare((r2.d * 32) ^ Long.MIN_VALUE, (r6 * 25) ^ Long.MIN_VALUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x00ed, code lost:
    
        if (r6 <= 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x00f1, code lost:
    
        r6 = r2.a;
        r7 = r2.c;
        r13 = r2.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x00f7, code lost:
    
        r14 = (r7 + 7) >> r3;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x00fb, code lost:
    
        if (r15 >= r14) goto L475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x00fd, code lost:
    
        r8 = r6[r15] & (-9187201950435737472L);
        r33 = r4;
        r6[r15] = ((~r8) + (r8 >>> 7)) & (-72340172838076674L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x010f, code lost:
    
        r15 = r15 + 1;
        r4 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0115, code lost:
    
        r33 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0117, code lost:
    
        r3 = defpackage.aqil.h(r6);
        r4 = r3 - 1;
        r6[r4] = (r6[r4] & 72057594037927935L) | (-72057594037927936L);
        r6[r3] = r6[0];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0131, code lost:
    
        if (r4 == r7) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0133, code lost:
    
        r3 = r4 >> 3;
        r16 = (r4 & 7) << 3;
        r8 = (r6[r3] >> r16) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0144, code lost:
    
        if (r8 != 128) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x014d, code lost:
    
        if (r8 == 254) goto L477;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0150, code lost:
    
        r8 = defpackage.a.A(r13[r4]) * (-862048943);
        r8 = r8 ^ (r8 << 16);
        r9 = r8 >>> 7;
        r17 = r2.b(r9);
        r9 = r9 & r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0171, code lost:
    
        if ((((r17 - r9) & r7) / 8) != (((r4 - r9) & r7) / 8)) goto L478;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x019f, code lost:
    
        r0 = r17 >> 3;
        r14 = r6[r0];
        r1 = r8 & 127;
        r9 = (r17 & 7) << 3;
        r8 = r6;
        r5 = ~(255 << r9);
        r35 = r10;
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x01b9, code lost:
    
        if (((r14 >> r9) & 255) != 128) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x01bb, code lost:
    
        r8[r0] = (r5 & r14) | (r10 << r9);
        r8[r3] = (r8[r3] & (~(255 << r16))) | (128 << r16);
        r13[r17] = r13[r4];
        r13[r4] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x01e7, code lost:
    
        r8[defpackage.aqil.h(r8)] = (r8[0] & 72057594037927935L) | Long.MIN_VALUE;
        r4 = r4 + 1;
        r6 = r8;
        r10 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x01d7, code lost:
    
        r8[r0] = (r5 & r14) | (r10 << r9);
        r0 = r13[r17];
        r13[r17] = r13[r4];
        r13[r4] = r0;
        r4 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0173, code lost:
    
        r6[r3] = ((r8 & 127) << r16) | (r6[r3] & (~(255 << r16)));
        r6[defpackage.aqil.h(r6)] = (r6[0] & 72057594037927935L) | Long.MIN_VALUE;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0146, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0205, code lost:
    
        r35 = r10;
        r2.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0283, code lost:
    
        r27 = r2.b(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0290, code lost:
    
        r2.d++;
        r0 = r2.e;
        r1 = r2.a;
        r3 = r27 >> 3;
        r6 = r1[r3];
        r4 = (r27 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x02aa, code lost:
    
        if (((r6 >> r4) & 255) != 128) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x02ac, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x02af, code lost:
    
        r2.e = r0 - r8;
        r0 = r2.c;
        r6 = (r6 & (~(255 << r4))) | (r35 << r4);
        r1[r3] = r6;
        r1[(((r27 - 7) & r0) + (r0 & 7)) >> 3] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x02ae, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x020d, code lost:
    
        r33 = r4;
        r35 = r10;
        r0 = defpackage.vf.b(r2.c);
        r3 = r2.a;
        r4 = r2.b;
        r6 = r2.c;
        r2.d(r0);
        r0 = r2.a;
        r7 = r2.b;
        r8 = r2.c;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0228, code lost:
    
        if (r9 >= r6) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x023a, code lost:
    
        if (((r3[r9 >> 3] >> ((r9 & 7) << 3)) & 255) >= 128) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x023c, code lost:
    
        r10 = r4[r9];
        r13 = defpackage.a.A(r10) * (-862048943);
        r14 = r2.b((r13 ^ (r13 << 16)) >>> 7);
        r15 = r14 >> 3;
        r16 = (r14 & 7) << 3;
        r17 = r6;
        r27 = r2;
        r1 = (r0[r15] & (~(255 << r16))) | ((r13 & 127) << r16);
        r0[r15] = r1;
        r0[(((r14 - 7) & r8) + (r8 & 7)) >> 3] = r1;
        r7[r14] = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x027b, code lost:
    
        r9 = r9 + 1;
        r6 = r17;
        r2 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0277, code lost:
    
        r27 = r2;
        r17 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x028a, code lost:
    
        r33 = r4;
        r35 = r10;
        r27 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x036c, code lost:
    
        if (((r10 & ((~r10) << 6)) & (-9187201950435737472L)) == 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x036e, code lost:
    
        r9 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x03dd, code lost:
    
        if (r6 == null) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03e1 A[Catch: all -> 0x06f3, TryCatch #0 {all -> 0x06f3, blocks: (B:3:0x0009, B:5:0x0011, B:10:0x001b, B:16:0x0044, B:22:0x0090, B:30:0x03a8, B:33:0x03b5, B:35:0x03bb, B:36:0x03c0, B:38:0x03c8, B:40:0x03cd, B:42:0x03d3, B:46:0x03d9, B:51:0x0503, B:53:0x050b, B:55:0x0518, B:58:0x0586, B:60:0x058c, B:67:0x0590, B:71:0x0526, B:75:0x0530, B:112:0x0536, B:113:0x053b, B:106:0x057e, B:77:0x053f, B:79:0x0545, B:81:0x0549, B:83:0x0554, B:85:0x055a, B:91:0x0563, B:93:0x056c, B:94:0x056f, B:89:0x0573, B:115:0x0583, B:120:0x0597, B:123:0x05a0, B:128:0x05b9, B:129:0x05c9, B:131:0x05cd, B:172:0x05d1, B:165:0x062b, B:133:0x05da, B:135:0x05e3, B:137:0x05e7, B:139:0x05ee, B:141:0x05f4, B:143:0x05f9, B:146:0x05fc, B:148:0x0602, B:149:0x0609, B:151:0x0611, B:153:0x0617, B:154:0x061a, B:155:0x061c, B:157:0x0622, B:145:0x0625, B:179:0x0636, B:181:0x0644, B:182:0x0654, B:184:0x0658, B:227:0x065c, B:219:0x06b9, B:186:0x0666, B:188:0x066f, B:190:0x0673, B:192:0x067a, B:194:0x0680, B:196:0x0685, B:199:0x0688, B:201:0x068e, B:202:0x0695, B:204:0x069d, B:206:0x06a3, B:207:0x06a6, B:208:0x06a8, B:210:0x06ae, B:198:0x06b1, B:234:0x06c7, B:236:0x06ce, B:238:0x06dc, B:244:0x06df, B:245:0x06e4, B:250:0x03e1, B:252:0x03e7, B:254:0x03ed, B:257:0x0452, B:259:0x0458, B:266:0x045c, B:270:0x03fb, B:274:0x0405, B:311:0x0462, B:313:0x0466, B:276:0x040b, B:278:0x0411, B:280:0x0415, B:282:0x0420, B:284:0x0426, B:290:0x042f, B:292:0x0438, B:293:0x043b, B:288:0x043f, B:301:0x044a, B:315:0x044f, B:320:0x046c, B:321:0x0471, B:322:0x0472, B:324:0x047a, B:326:0x0482, B:329:0x04e7, B:331:0x04ed, B:338:0x04f1, B:342:0x0490, B:346:0x049a, B:383:0x04f7, B:385:0x04fb, B:348:0x04a0, B:350:0x04a6, B:352:0x04aa, B:354:0x04b5, B:356:0x04bb, B:362:0x04c4, B:364:0x04cd, B:365:0x04d0, B:360:0x04d4, B:373:0x04df, B:388:0x04e4, B:393:0x06e9, B:394:0x06ee, B:413:0x00fd, B:464:0x02f1, B:466:0x02f5, B:468:0x02fd, B:470:0x0301, B:471:0x0313, B:474:0x0349, B:480:0x0372, B:476:0x035a, B:482:0x0361, B:484:0x039c), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x047a A[Catch: all -> 0x06f3, TryCatch #0 {all -> 0x06f3, blocks: (B:3:0x0009, B:5:0x0011, B:10:0x001b, B:16:0x0044, B:22:0x0090, B:30:0x03a8, B:33:0x03b5, B:35:0x03bb, B:36:0x03c0, B:38:0x03c8, B:40:0x03cd, B:42:0x03d3, B:46:0x03d9, B:51:0x0503, B:53:0x050b, B:55:0x0518, B:58:0x0586, B:60:0x058c, B:67:0x0590, B:71:0x0526, B:75:0x0530, B:112:0x0536, B:113:0x053b, B:106:0x057e, B:77:0x053f, B:79:0x0545, B:81:0x0549, B:83:0x0554, B:85:0x055a, B:91:0x0563, B:93:0x056c, B:94:0x056f, B:89:0x0573, B:115:0x0583, B:120:0x0597, B:123:0x05a0, B:128:0x05b9, B:129:0x05c9, B:131:0x05cd, B:172:0x05d1, B:165:0x062b, B:133:0x05da, B:135:0x05e3, B:137:0x05e7, B:139:0x05ee, B:141:0x05f4, B:143:0x05f9, B:146:0x05fc, B:148:0x0602, B:149:0x0609, B:151:0x0611, B:153:0x0617, B:154:0x061a, B:155:0x061c, B:157:0x0622, B:145:0x0625, B:179:0x0636, B:181:0x0644, B:182:0x0654, B:184:0x0658, B:227:0x065c, B:219:0x06b9, B:186:0x0666, B:188:0x066f, B:190:0x0673, B:192:0x067a, B:194:0x0680, B:196:0x0685, B:199:0x0688, B:201:0x068e, B:202:0x0695, B:204:0x069d, B:206:0x06a3, B:207:0x06a6, B:208:0x06a8, B:210:0x06ae, B:198:0x06b1, B:234:0x06c7, B:236:0x06ce, B:238:0x06dc, B:244:0x06df, B:245:0x06e4, B:250:0x03e1, B:252:0x03e7, B:254:0x03ed, B:257:0x0452, B:259:0x0458, B:266:0x045c, B:270:0x03fb, B:274:0x0405, B:311:0x0462, B:313:0x0466, B:276:0x040b, B:278:0x0411, B:280:0x0415, B:282:0x0420, B:284:0x0426, B:290:0x042f, B:292:0x0438, B:293:0x043b, B:288:0x043f, B:301:0x044a, B:315:0x044f, B:320:0x046c, B:321:0x0471, B:322:0x0472, B:324:0x047a, B:326:0x0482, B:329:0x04e7, B:331:0x04ed, B:338:0x04f1, B:342:0x0490, B:346:0x049a, B:383:0x04f7, B:385:0x04fb, B:348:0x04a0, B:350:0x04a6, B:352:0x04aa, B:354:0x04b5, B:356:0x04bb, B:362:0x04c4, B:364:0x04cd, B:365:0x04d0, B:360:0x04d4, B:373:0x04df, B:388:0x04e4, B:393:0x06e9, B:394:0x06ee, B:413:0x00fd, B:464:0x02f1, B:466:0x02f5, B:468:0x02fd, B:470:0x0301, B:471:0x0313, B:474:0x0349, B:480:0x0372, B:476:0x035a, B:482:0x0361, B:484:0x039c), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03b5 A[Catch: all -> 0x06f3, TRY_ENTER, TryCatch #0 {all -> 0x06f3, blocks: (B:3:0x0009, B:5:0x0011, B:10:0x001b, B:16:0x0044, B:22:0x0090, B:30:0x03a8, B:33:0x03b5, B:35:0x03bb, B:36:0x03c0, B:38:0x03c8, B:40:0x03cd, B:42:0x03d3, B:46:0x03d9, B:51:0x0503, B:53:0x050b, B:55:0x0518, B:58:0x0586, B:60:0x058c, B:67:0x0590, B:71:0x0526, B:75:0x0530, B:112:0x0536, B:113:0x053b, B:106:0x057e, B:77:0x053f, B:79:0x0545, B:81:0x0549, B:83:0x0554, B:85:0x055a, B:91:0x0563, B:93:0x056c, B:94:0x056f, B:89:0x0573, B:115:0x0583, B:120:0x0597, B:123:0x05a0, B:128:0x05b9, B:129:0x05c9, B:131:0x05cd, B:172:0x05d1, B:165:0x062b, B:133:0x05da, B:135:0x05e3, B:137:0x05e7, B:139:0x05ee, B:141:0x05f4, B:143:0x05f9, B:146:0x05fc, B:148:0x0602, B:149:0x0609, B:151:0x0611, B:153:0x0617, B:154:0x061a, B:155:0x061c, B:157:0x0622, B:145:0x0625, B:179:0x0636, B:181:0x0644, B:182:0x0654, B:184:0x0658, B:227:0x065c, B:219:0x06b9, B:186:0x0666, B:188:0x066f, B:190:0x0673, B:192:0x067a, B:194:0x0680, B:196:0x0685, B:199:0x0688, B:201:0x068e, B:202:0x0695, B:204:0x069d, B:206:0x06a3, B:207:0x06a6, B:208:0x06a8, B:210:0x06ae, B:198:0x06b1, B:234:0x06c7, B:236:0x06ce, B:238:0x06dc, B:244:0x06df, B:245:0x06e4, B:250:0x03e1, B:252:0x03e7, B:254:0x03ed, B:257:0x0452, B:259:0x0458, B:266:0x045c, B:270:0x03fb, B:274:0x0405, B:311:0x0462, B:313:0x0466, B:276:0x040b, B:278:0x0411, B:280:0x0415, B:282:0x0420, B:284:0x0426, B:290:0x042f, B:292:0x0438, B:293:0x043b, B:288:0x043f, B:301:0x044a, B:315:0x044f, B:320:0x046c, B:321:0x0471, B:322:0x0472, B:324:0x047a, B:326:0x0482, B:329:0x04e7, B:331:0x04ed, B:338:0x04f1, B:342:0x0490, B:346:0x049a, B:383:0x04f7, B:385:0x04fb, B:348:0x04a0, B:350:0x04a6, B:352:0x04aa, B:354:0x04b5, B:356:0x04bb, B:362:0x04c4, B:364:0x04cd, B:365:0x04d0, B:360:0x04d4, B:373:0x04df, B:388:0x04e4, B:393:0x06e9, B:394:0x06ee, B:413:0x00fd, B:464:0x02f1, B:466:0x02f5, B:468:0x02fd, B:470:0x0301, B:471:0x0313, B:474:0x0349, B:480:0x0372, B:476:0x035a, B:482:0x0361, B:484:0x039c), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x06e9 A[Catch: all -> 0x06f3, TRY_ENTER, TryCatch #0 {all -> 0x06f3, blocks: (B:3:0x0009, B:5:0x0011, B:10:0x001b, B:16:0x0044, B:22:0x0090, B:30:0x03a8, B:33:0x03b5, B:35:0x03bb, B:36:0x03c0, B:38:0x03c8, B:40:0x03cd, B:42:0x03d3, B:46:0x03d9, B:51:0x0503, B:53:0x050b, B:55:0x0518, B:58:0x0586, B:60:0x058c, B:67:0x0590, B:71:0x0526, B:75:0x0530, B:112:0x0536, B:113:0x053b, B:106:0x057e, B:77:0x053f, B:79:0x0545, B:81:0x0549, B:83:0x0554, B:85:0x055a, B:91:0x0563, B:93:0x056c, B:94:0x056f, B:89:0x0573, B:115:0x0583, B:120:0x0597, B:123:0x05a0, B:128:0x05b9, B:129:0x05c9, B:131:0x05cd, B:172:0x05d1, B:165:0x062b, B:133:0x05da, B:135:0x05e3, B:137:0x05e7, B:139:0x05ee, B:141:0x05f4, B:143:0x05f9, B:146:0x05fc, B:148:0x0602, B:149:0x0609, B:151:0x0611, B:153:0x0617, B:154:0x061a, B:155:0x061c, B:157:0x0622, B:145:0x0625, B:179:0x0636, B:181:0x0644, B:182:0x0654, B:184:0x0658, B:227:0x065c, B:219:0x06b9, B:186:0x0666, B:188:0x066f, B:190:0x0673, B:192:0x067a, B:194:0x0680, B:196:0x0685, B:199:0x0688, B:201:0x068e, B:202:0x0695, B:204:0x069d, B:206:0x06a3, B:207:0x06a6, B:208:0x06a8, B:210:0x06ae, B:198:0x06b1, B:234:0x06c7, B:236:0x06ce, B:238:0x06dc, B:244:0x06df, B:245:0x06e4, B:250:0x03e1, B:252:0x03e7, B:254:0x03ed, B:257:0x0452, B:259:0x0458, B:266:0x045c, B:270:0x03fb, B:274:0x0405, B:311:0x0462, B:313:0x0466, B:276:0x040b, B:278:0x0411, B:280:0x0415, B:282:0x0420, B:284:0x0426, B:290:0x042f, B:292:0x0438, B:293:0x043b, B:288:0x043f, B:301:0x044a, B:315:0x044f, B:320:0x046c, B:321:0x0471, B:322:0x0472, B:324:0x047a, B:326:0x0482, B:329:0x04e7, B:331:0x04ed, B:338:0x04f1, B:342:0x0490, B:346:0x049a, B:383:0x04f7, B:385:0x04fb, B:348:0x04a0, B:350:0x04a6, B:352:0x04aa, B:354:0x04b5, B:356:0x04bb, B:362:0x04c4, B:364:0x04cd, B:365:0x04d0, B:360:0x04d4, B:373:0x04df, B:388:0x04e4, B:393:0x06e9, B:394:0x06ee, B:413:0x00fd, B:464:0x02f1, B:466:0x02f5, B:468:0x02fd, B:470:0x0301, B:471:0x0313, B:474:0x0349, B:480:0x0372, B:476:0x035a, B:482:0x0361, B:484:0x039c), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0503 A[Catch: all -> 0x06f3, TryCatch #0 {all -> 0x06f3, blocks: (B:3:0x0009, B:5:0x0011, B:10:0x001b, B:16:0x0044, B:22:0x0090, B:30:0x03a8, B:33:0x03b5, B:35:0x03bb, B:36:0x03c0, B:38:0x03c8, B:40:0x03cd, B:42:0x03d3, B:46:0x03d9, B:51:0x0503, B:53:0x050b, B:55:0x0518, B:58:0x0586, B:60:0x058c, B:67:0x0590, B:71:0x0526, B:75:0x0530, B:112:0x0536, B:113:0x053b, B:106:0x057e, B:77:0x053f, B:79:0x0545, B:81:0x0549, B:83:0x0554, B:85:0x055a, B:91:0x0563, B:93:0x056c, B:94:0x056f, B:89:0x0573, B:115:0x0583, B:120:0x0597, B:123:0x05a0, B:128:0x05b9, B:129:0x05c9, B:131:0x05cd, B:172:0x05d1, B:165:0x062b, B:133:0x05da, B:135:0x05e3, B:137:0x05e7, B:139:0x05ee, B:141:0x05f4, B:143:0x05f9, B:146:0x05fc, B:148:0x0602, B:149:0x0609, B:151:0x0611, B:153:0x0617, B:154:0x061a, B:155:0x061c, B:157:0x0622, B:145:0x0625, B:179:0x0636, B:181:0x0644, B:182:0x0654, B:184:0x0658, B:227:0x065c, B:219:0x06b9, B:186:0x0666, B:188:0x066f, B:190:0x0673, B:192:0x067a, B:194:0x0680, B:196:0x0685, B:199:0x0688, B:201:0x068e, B:202:0x0695, B:204:0x069d, B:206:0x06a3, B:207:0x06a6, B:208:0x06a8, B:210:0x06ae, B:198:0x06b1, B:234:0x06c7, B:236:0x06ce, B:238:0x06dc, B:244:0x06df, B:245:0x06e4, B:250:0x03e1, B:252:0x03e7, B:254:0x03ed, B:257:0x0452, B:259:0x0458, B:266:0x045c, B:270:0x03fb, B:274:0x0405, B:311:0x0462, B:313:0x0466, B:276:0x040b, B:278:0x0411, B:280:0x0415, B:282:0x0420, B:284:0x0426, B:290:0x042f, B:292:0x0438, B:293:0x043b, B:288:0x043f, B:301:0x044a, B:315:0x044f, B:320:0x046c, B:321:0x0471, B:322:0x0472, B:324:0x047a, B:326:0x0482, B:329:0x04e7, B:331:0x04ed, B:338:0x04f1, B:342:0x0490, B:346:0x049a, B:383:0x04f7, B:385:0x04fb, B:348:0x04a0, B:350:0x04a6, B:352:0x04aa, B:354:0x04b5, B:356:0x04bb, B:362:0x04c4, B:364:0x04cd, B:365:0x04d0, B:360:0x04d4, B:373:0x04df, B:388:0x04e4, B:393:0x06e9, B:394:0x06ee, B:413:0x00fd, B:464:0x02f1, B:466:0x02f5, B:468:0x02fd, B:470:0x0301, B:471:0x0313, B:474:0x0349, B:480:0x0372, B:476:0x035a, B:482:0x0361, B:484:0x039c), top: B:2:0x0009 }] */
    @Override // defpackage.cin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(android.view.KeyEvent r38, defpackage.arqg r39) {
        /*
            Method dump skipped, instructions count: 1784
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.f(android.view.KeyEvent, arqg):boolean");
    }

    @Override // defpackage.cin
    public final boolean g(boolean z, boolean z2, int i) {
        boolean f;
        AnonymousClass1 anonymousClass1 = AnonymousClass1.a;
        cjc cjcVar = this.e;
        try {
            if (cjcVar.b) {
                cjcVar.c();
            }
            cjcVar.b();
            cjcVar.a.n(anonymousClass1);
            if (!z) {
                chy a = cjd.a(this.c, i);
                chy chyVar = chy.a;
                int ordinal = a.ordinal();
                if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                    f = false;
                    if (!f && z2) {
                        this.b.a();
                        return true;
                    }
                    return f;
                }
            }
            f = cjd.f(this.c, z);
            if (!f) {
            }
            return f;
        } finally {
            cjcVar.d();
        }
    }
}
