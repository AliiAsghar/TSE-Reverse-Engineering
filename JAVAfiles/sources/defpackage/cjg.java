package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;
import defpackage.cga;
import defpackage.css;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjg {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cjg$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqr<css.a, Boolean> {
        final /* synthetic */ FocusTargetNode a;
        final /* synthetic */ FocusTargetNode b;
        final /* synthetic */ int c;
        final /* synthetic */ arqr d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, arqr arqrVar) {
            super(1);
            this.a = focusTargetNode;
            this.b = focusTargetNode2;
            this.c = i;
            this.d = arqrVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            css.a aVar = (css.a) obj;
            boolean c = cjg.c(this.a, this.b, this.c, this.d);
            Boolean valueOf = Boolean.valueOf(c);
            valueOf.getClass();
            if (!c && aVar.a()) {
                return null;
            }
            return valueOf;
        }
    }

    public static final boolean a(FocusTargetNode focusTargetNode, arqr arqrVar) {
        ciz e = focusTargetNode.e();
        ciz cizVar = ciz.a;
        int ordinal = e.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (!e(focusTargetNode, arqrVar) && (!((cir) focusTargetNode.d()).a || !((Boolean) arqrVar.a(focusTargetNode)).booleanValue())) {
                            return false;
                        }
                    } else {
                        throw new armm();
                    }
                }
            } else {
                FocusTargetNode b = cje.b(focusTargetNode);
                if (b != null) {
                    int ordinal2 = b.e().ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    throw new armm();
                                }
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                        } else if (!a(b, arqrVar) && !d(focusTargetNode, b, 2, arqrVar) && (!((cir) b.d()).a || !((Boolean) arqrVar.a(b)).booleanValue())) {
                            return false;
                        }
                    }
                    return d(focusTargetNode, b, 2, arqrVar);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            return true;
        }
        return e(focusTargetNode, arqrVar);
    }

    public static final boolean b(FocusTargetNode focusTargetNode, arqr arqrVar) {
        ciz e = focusTargetNode.e();
        ciz cizVar = ciz.a;
        int ordinal = e.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (((cir) focusTargetNode.d()).a) {
                            return ((Boolean) arqrVar.a(focusTargetNode)).booleanValue();
                        }
                        return f(focusTargetNode, arqrVar);
                    }
                    throw new armm();
                }
            } else {
                FocusTargetNode b = cje.b(focusTargetNode);
                if (b != null) {
                    if (b(b, arqrVar) || d(focusTargetNode, b, 1, arqrVar)) {
                        return true;
                    }
                    return false;
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
        }
        return f(focusTargetNode, arqrVar);
    }

    public static final boolean c(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, arqr arqrVar) {
        cga.c cVar;
        cyk cykVar;
        if (focusTargetNode.e() == ciz.b) {
            cbh cbhVar = new cbh(new FocusTargetNode[16]);
            cga.c cVar2 = focusTargetNode.p;
            if (cVar2.z) {
                cbh cbhVar2 = new cbh(new cga.c[16]);
                cga.c cVar3 = cVar2.t;
                if (cVar3 == null) {
                    cwp.j(cbhVar2, cVar2);
                } else {
                    cbhVar2.n(cVar3);
                }
                while (true) {
                    int i2 = cbhVar2.b;
                    cVar = null;
                    if (i2 == 0) {
                        break;
                    }
                    cga.c cVar4 = (cga.c) cbhVar2.c(i2 - 1);
                    if ((cVar4.r & 1024) == 0) {
                        cwp.j(cbhVar2, cVar4);
                    } else {
                        while (true) {
                            if (cVar4 == null) {
                                break;
                            }
                            if ((cVar4.q & 1024) != 0) {
                                cbh cbhVar3 = null;
                                while (cVar4 != null) {
                                    if (cVar4 instanceof FocusTargetNode) {
                                        cbhVar.n((FocusTargetNode) cVar4);
                                    } else if ((cVar4.q & 1024) != 0 && (cVar4 instanceof cwr)) {
                                        int i3 = 0;
                                        for (cga.c cVar5 = ((cwr) cVar4).B; cVar5 != null; cVar5 = cVar5.t) {
                                            if ((cVar5.q & 1024) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    cVar4 = cVar5;
                                                } else {
                                                    if (cbhVar3 == null) {
                                                        cbhVar3 = new cbh(new cga.c[16]);
                                                    }
                                                    if (cVar4 != null) {
                                                        cbhVar3.n(cVar4);
                                                    }
                                                    cbhVar3.n(cVar5);
                                                    cVar4 = null;
                                                }
                                            }
                                        }
                                        if (i3 != 1) {
                                        }
                                    }
                                    cVar4 = cwp.a(cbhVar3);
                                }
                            } else {
                                cVar4 = cVar4.t;
                            }
                        }
                    }
                }
                cbhVar.j(cjf.a);
                if (a.bA(i, 1)) {
                    artb B = arrn.B(0, cbhVar.b);
                    int i4 = B.a;
                    int i5 = B.b;
                    if (i4 <= i5) {
                        boolean z = false;
                        while (true) {
                            if (z) {
                                FocusTargetNode focusTargetNode3 = (FocusTargetNode) cbhVar.a[i4];
                                if (cje.d(focusTargetNode3) && b(focusTargetNode3, arqrVar)) {
                                    return true;
                                }
                            }
                            z |= d.F(cbhVar.a[i4], focusTargetNode2);
                            if (i4 == i5) {
                                break;
                            }
                            i4++;
                        }
                    }
                } else if (a.bA(i, 2)) {
                    artb B2 = arrn.B(0, cbhVar.b);
                    int i6 = B2.a;
                    int i7 = B2.b;
                    if (i6 <= i7) {
                        boolean z2 = false;
                        while (true) {
                            if (z2) {
                                FocusTargetNode focusTargetNode4 = (FocusTargetNode) cbhVar.a[i7];
                                if (cje.d(focusTargetNode4) && a(focusTargetNode4, arqrVar)) {
                                    return true;
                                }
                            }
                            z2 |= d.F(cbhVar.a[i7], focusTargetNode2);
                            if (i7 == i6) {
                                break;
                            }
                            i7--;
                        }
                    }
                } else {
                    throw new IllegalStateException("This function should only be used for 1-D focus search");
                }
                if (!a.bA(i, 1) && ((cir) focusTargetNode.d()).a) {
                    cga.c cVar6 = focusTargetNode.p;
                    if (cVar6.z) {
                        cga.c cVar7 = cVar6.s;
                        cxn e = cwp.e(focusTargetNode);
                        loop5: while (true) {
                            if (e == null) {
                                break;
                            }
                            if ((e.w.e.r & 1024) != 0) {
                                while (cVar7 != null) {
                                    if ((cVar7.q & 1024) != 0) {
                                        cga.c cVar8 = cVar7;
                                        cbh cbhVar4 = null;
                                        while (cVar8 != null) {
                                            if (!(cVar8 instanceof FocusTargetNode)) {
                                                if ((cVar8.q & 1024) != 0 && (cVar8 instanceof cwr)) {
                                                    int i8 = 0;
                                                    for (cga.c cVar9 = ((cwr) cVar8).B; cVar9 != null; cVar9 = cVar9.t) {
                                                        if ((cVar9.q & 1024) != 0) {
                                                            i8++;
                                                            if (i8 == 1) {
                                                                cVar8 = cVar9;
                                                            } else {
                                                                if (cbhVar4 == null) {
                                                                    cbhVar4 = new cbh(new cga.c[16]);
                                                                }
                                                                if (cVar8 != null) {
                                                                    cbhVar4.n(cVar8);
                                                                }
                                                                cbhVar4.n(cVar9);
                                                                cVar8 = null;
                                                            }
                                                        }
                                                    }
                                                    if (i8 != 1) {
                                                    }
                                                }
                                                cVar8 = cwp.a(cbhVar4);
                                            } else {
                                                cVar = cVar8;
                                                break loop5;
                                            }
                                        }
                                    }
                                    cVar7 = cVar7.s;
                                }
                            }
                            e = e.t();
                            if (e != null && (cykVar = e.w) != null) {
                                cVar7 = cykVar.d;
                            } else {
                                cVar7 = null;
                            }
                        }
                        if (cVar != null) {
                            return ((Boolean) arqrVar.a(focusTargetNode)).booleanValue();
                        }
                    } else {
                        throw new IllegalStateException("visitAncestors called on an unattached node");
                    }
                }
                return false;
            }
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        throw new IllegalStateException("This function should only be used within a parent that has focus.");
    }

    private static final boolean d(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, arqr arqrVar) {
        if (c(focusTargetNode, focusTargetNode2, i, arqrVar)) {
            return true;
        }
        Boolean bool = (Boolean) chx.a(focusTargetNode, i, new AnonymousClass1(focusTargetNode, focusTargetNode2, i, arqrVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean e(FocusTargetNode focusTargetNode, arqr arqrVar) {
        cbh cbhVar = new cbh(new FocusTargetNode[16]);
        cga.c cVar = focusTargetNode.p;
        if (cVar.z) {
            cbh cbhVar2 = new cbh(new cga.c[16]);
            cga.c cVar2 = cVar.t;
            if (cVar2 == null) {
                cwp.j(cbhVar2, cVar);
            } else {
                cbhVar2.n(cVar2);
            }
            while (true) {
                int i = cbhVar2.b;
                if (i == 0) {
                    break;
                }
                cga.c cVar3 = (cga.c) cbhVar2.c(i - 1);
                if ((cVar3.r & 1024) == 0) {
                    cwp.j(cbhVar2, cVar3);
                } else {
                    while (true) {
                        if (cVar3 == null) {
                            break;
                        }
                        if ((cVar3.q & 1024) != 0) {
                            cbh cbhVar3 = null;
                            while (cVar3 != null) {
                                if (cVar3 instanceof FocusTargetNode) {
                                    cbhVar.n((FocusTargetNode) cVar3);
                                } else if ((cVar3.q & 1024) != 0 && (cVar3 instanceof cwr)) {
                                    int i2 = 0;
                                    for (cga.c cVar4 = ((cwr) cVar3).B; cVar4 != null; cVar4 = cVar4.t) {
                                        if ((cVar4.q & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cVar3 = cVar4;
                                            } else {
                                                if (cbhVar3 == null) {
                                                    cbhVar3 = new cbh(new cga.c[16]);
                                                }
                                                if (cVar3 != null) {
                                                    cbhVar3.n(cVar3);
                                                }
                                                cbhVar3.n(cVar4);
                                                cVar3 = null;
                                            }
                                        }
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                cVar3 = cwp.a(cbhVar3);
                            }
                        } else {
                            cVar3 = cVar3.t;
                        }
                    }
                }
            }
            cbhVar.j(cjf.a);
            int i3 = cbhVar.b;
            if (i3 > 0) {
                Object[] objArr = cbhVar.a;
                int i4 = i3 - 1;
                do {
                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i4];
                    if (cje.d(focusTargetNode2) && a(focusTargetNode2, arqrVar)) {
                        return true;
                    }
                    i4--;
                } while (i4 >= 0);
            }
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node");
    }

    private static final boolean f(FocusTargetNode focusTargetNode, arqr arqrVar) {
        cbh cbhVar = new cbh(new FocusTargetNode[16]);
        cga.c cVar = focusTargetNode.p;
        if (cVar.z) {
            cbh cbhVar2 = new cbh(new cga.c[16]);
            cga.c cVar2 = cVar.t;
            if (cVar2 == null) {
                cwp.j(cbhVar2, cVar);
            } else {
                cbhVar2.n(cVar2);
            }
            while (true) {
                int i = cbhVar2.b;
                if (i == 0) {
                    break;
                }
                cga.c cVar3 = (cga.c) cbhVar2.c(i - 1);
                if ((cVar3.r & 1024) == 0) {
                    cwp.j(cbhVar2, cVar3);
                } else {
                    while (true) {
                        if (cVar3 == null) {
                            break;
                        }
                        if ((cVar3.q & 1024) != 0) {
                            cbh cbhVar3 = null;
                            while (cVar3 != null) {
                                if (cVar3 instanceof FocusTargetNode) {
                                    cbhVar.n((FocusTargetNode) cVar3);
                                } else if ((cVar3.q & 1024) != 0 && (cVar3 instanceof cwr)) {
                                    int i2 = 0;
                                    for (cga.c cVar4 = ((cwr) cVar3).B; cVar4 != null; cVar4 = cVar4.t) {
                                        if ((cVar4.q & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cVar3 = cVar4;
                                            } else {
                                                if (cbhVar3 == null) {
                                                    cbhVar3 = new cbh(new cga.c[16]);
                                                }
                                                if (cVar3 != null) {
                                                    cbhVar3.n(cVar3);
                                                }
                                                cbhVar3.n(cVar4);
                                                cVar3 = null;
                                            }
                                        }
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                cVar3 = cwp.a(cbhVar3);
                            }
                        } else {
                            cVar3 = cVar3.t;
                        }
                    }
                }
            }
            cbhVar.j(cjf.a);
            int i3 = cbhVar.b;
            if (i3 <= 0) {
                return false;
            }
            Object[] objArr = cbhVar.a;
            int i4 = 0;
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i4];
                if (cje.d(focusTargetNode2) && b(focusTargetNode2, arqrVar)) {
                    return true;
                }
                i4++;
            } while (i4 < i3);
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node");
    }
}
