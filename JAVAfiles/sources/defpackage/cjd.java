package defpackage;

import android.os.Trace;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjd {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cjd$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqg<arnb> {
        final /* synthetic */ FocusTargetNode a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FocusTargetNode focusTargetNode) {
            super(0);
            this.a = focusTargetNode;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            this.a.d();
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cjd$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqg<arnb> {
        final /* synthetic */ FocusTargetNode a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FocusTargetNode focusTargetNode) {
            super(0);
            this.a = focusTargetNode;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            FocusTargetNode focusTargetNode = this.a;
            if (focusTargetNode.p.z) {
                focusTargetNode.g();
            }
            return arnb.a;
        }
    }

    public static final chy a(FocusTargetNode focusTargetNode, int i) {
        chy chyVar;
        ciz e = focusTargetNode.e();
        chy chyVar2 = chy.a;
        ciz cizVar = ciz.a;
        int ordinal = e.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new armm();
                    }
                } else {
                    return chy.b;
                }
            } else {
                chy a = a(h(focusTargetNode), i);
                if (a == chy.a) {
                    a = null;
                }
                if (a == null) {
                    if (!focusTargetNode.a) {
                        focusTargetNode.a = true;
                        try {
                            cit citVar = (cit) ((cir) focusTargetNode.d()).k.a(new cib(i));
                            if (citVar != cit.a) {
                                if (citVar == cit.b) {
                                    chyVar = chy.b;
                                } else {
                                    if (citVar.b()) {
                                        chyVar = chy.c;
                                    } else {
                                        chyVar = chy.d;
                                    }
                                    focusTargetNode.a = false;
                                }
                                return chyVar;
                            }
                        } finally {
                            focusTargetNode.a = false;
                        }
                    }
                } else {
                    return a;
                }
            }
        }
        return chy.a;
    }

    public static final chy b(FocusTargetNode focusTargetNode, int i) {
        chy chyVar;
        cga.c cVar;
        cyk cykVar;
        ciz e = focusTargetNode.e();
        chy chyVar2 = chy.a;
        ciz cizVar = ciz.a;
        int ordinal = e.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        cga.c cVar2 = focusTargetNode.p;
                        if (cVar2.z) {
                            cga.c cVar3 = cVar2.s;
                            cxn e2 = cwp.e(focusTargetNode);
                            loop0: while (true) {
                                chyVar = null;
                                if (e2 != null) {
                                    if ((e2.w.e.r & 1024) != 0) {
                                        while (cVar3 != null) {
                                            if ((cVar3.q & 1024) != 0) {
                                                cVar = cVar3;
                                                cbh cbhVar = null;
                                                while (cVar != null) {
                                                    if (cVar instanceof FocusTargetNode) {
                                                        break loop0;
                                                    }
                                                    if ((cVar.q & 1024) != 0 && (cVar instanceof cwr)) {
                                                        int i2 = 0;
                                                        for (cga.c cVar4 = ((cwr) cVar).B; cVar4 != null; cVar4 = cVar4.t) {
                                                            if ((cVar4.q & 1024) != 0) {
                                                                i2++;
                                                                if (i2 == 1) {
                                                                    cVar = cVar4;
                                                                } else {
                                                                    if (cbhVar == null) {
                                                                        cbhVar = new cbh(new cga.c[16]);
                                                                    }
                                                                    if (cVar != null) {
                                                                        cbhVar.n(cVar);
                                                                    }
                                                                    cbhVar.n(cVar4);
                                                                    cVar = null;
                                                                }
                                                            }
                                                        }
                                                        if (i2 != 1) {
                                                        }
                                                    }
                                                    cVar = cwp.a(cbhVar);
                                                }
                                            }
                                            cVar3 = cVar3.s;
                                        }
                                    }
                                    e2 = e2.t();
                                    if (e2 != null && (cykVar = e2.w) != null) {
                                        cVar3 = cykVar.d;
                                    } else {
                                        cVar3 = null;
                                    }
                                } else {
                                    cVar = null;
                                    break;
                                }
                            }
                            FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar;
                            if (focusTargetNode2 == null) {
                                return chy.a;
                            }
                            int ordinal2 = focusTargetNode2.e().ordinal();
                            if (ordinal2 != 0) {
                                if (ordinal2 != 1) {
                                    if (ordinal2 != 2) {
                                        if (ordinal2 == 3) {
                                            chy b = b(focusTargetNode2, i);
                                            if (b != chy.a) {
                                                chyVar = b;
                                            }
                                            if (chyVar == null) {
                                                return g(focusTargetNode2, i);
                                            }
                                            return chyVar;
                                        }
                                        throw new armm();
                                    }
                                    return chy.b;
                                }
                                return b(focusTargetNode2, i);
                            }
                            return g(focusTargetNode2, i);
                        }
                        throw new IllegalStateException("visitAncestors called on an unattached node");
                    }
                    throw new armm();
                }
            } else {
                return a(h(focusTargetNode), i);
            }
        }
        return chy.a;
    }

    public static final Boolean c(FocusTargetNode focusTargetNode, int i) {
        Boolean valueOf;
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            if (!((cir) focusTargetNode.d()).a) {
                valueOf = false;
            } else {
                cjc a = cjb.a(focusTargetNode);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(focusTargetNode);
                try {
                    if (a.b) {
                        a.c();
                    }
                    a.b();
                    a.a.n(anonymousClass2);
                    chy b = b(focusTargetNode, i);
                    chy chyVar = chy.a;
                    ciz cizVar = ciz.a;
                    int ordinal = b.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal != 3) {
                                    throw new armm();
                                }
                            } else {
                                valueOf = true;
                            }
                        }
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(d(focusTargetNode));
                    }
                } finally {
                    a.d();
                }
            }
            return valueOf;
        } finally {
            Trace.endSection();
        }
    }

    public static final boolean d(FocusTargetNode focusTargetNode) {
        cga.c cVar;
        cyk cykVar;
        ciz e = focusTargetNode.e();
        chy chyVar = chy.a;
        ciz cizVar = ciz.a;
        int ordinal = e.ordinal();
        boolean z = true;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        cga.c cVar2 = focusTargetNode.p;
                        if (cVar2.z) {
                            cga.c cVar3 = cVar2.s;
                            cxn e2 = cwp.e(focusTargetNode);
                            loop0: while (true) {
                                cVar = null;
                                if (e2 == null) {
                                    break;
                                }
                                if ((e2.w.e.r & 1024) != 0) {
                                    while (cVar3 != null) {
                                        if ((cVar3.q & 1024) != 0) {
                                            cga.c cVar4 = cVar3;
                                            cbh cbhVar = null;
                                            while (cVar4 != null) {
                                                if (cVar4 instanceof FocusTargetNode) {
                                                    cVar = cVar4;
                                                    break loop0;
                                                }
                                                if ((cVar4.q & 1024) != 0 && (cVar4 instanceof cwr)) {
                                                    int i = 0;
                                                    for (cga.c cVar5 = ((cwr) cVar4).B; cVar5 != null; cVar5 = cVar5.t) {
                                                        if ((cVar5.q & 1024) != 0) {
                                                            i++;
                                                            if (i == 1) {
                                                                cVar4 = cVar5;
                                                            } else {
                                                                if (cbhVar == null) {
                                                                    cbhVar = new cbh(new cga.c[16]);
                                                                }
                                                                if (cVar4 != null) {
                                                                    cbhVar.n(cVar4);
                                                                }
                                                                cbhVar.n(cVar5);
                                                                cVar4 = null;
                                                            }
                                                        }
                                                    }
                                                    if (i != 1) {
                                                    }
                                                }
                                                cVar4 = cwp.a(cbhVar);
                                            }
                                        }
                                        cVar3 = cVar3.s;
                                    }
                                }
                                e2 = e2.t();
                                if (e2 != null && (cykVar = e2.w) != null) {
                                    cVar3 = cykVar.d;
                                } else {
                                    cVar3 = null;
                                }
                            }
                            FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar;
                            if (focusTargetNode2 != null) {
                                ciz e3 = focusTargetNode2.e();
                                z = i(focusTargetNode2, focusTargetNode);
                                if (z && e3 != focusTargetNode2.e()) {
                                    focusTargetNode2.g();
                                }
                            } else {
                                if (j(focusTargetNode)) {
                                    l(focusTargetNode);
                                }
                                z = false;
                            }
                        } else {
                            throw new IllegalStateException("visitAncestors called on an unattached node");
                        }
                    } else {
                        throw new armm();
                    }
                }
            } else {
                if (k(focusTargetNode, false)) {
                    l(focusTargetNode);
                }
                z = false;
            }
        }
        if (z) {
            focusTargetNode.g();
        }
        return z;
    }

    public static final boolean f(FocusTargetNode focusTargetNode, boolean z) {
        ciz e = focusTargetNode.e();
        chy chyVar = chy.a;
        ciz cizVar = ciz.a;
        int ordinal = e.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return true;
                    }
                    throw new armm();
                }
                if (z) {
                    focusTargetNode.j(ciz.d);
                    focusTargetNode.g();
                    return true;
                }
                return z;
            }
            if (!k(focusTargetNode, z)) {
                return false;
            }
            focusTargetNode.j(ciz.d);
            focusTargetNode.g();
            return true;
        }
        focusTargetNode.j(ciz.d);
        focusTargetNode.g();
        return true;
    }

    private static final chy g(FocusTargetNode focusTargetNode, int i) {
        chy chyVar;
        if (!focusTargetNode.b) {
            focusTargetNode.b = true;
            try {
                cit citVar = (cit) ((cir) focusTargetNode.d()).j.a(new cib(i));
                if (citVar != cit.a) {
                    if (citVar == cit.b) {
                        chyVar = chy.b;
                    } else if (citVar.b()) {
                        chyVar = chy.c;
                    } else {
                        chyVar = chy.d;
                    }
                    return chyVar;
                }
            } finally {
                focusTargetNode.b = false;
            }
        }
        return chy.a;
    }

    private static final FocusTargetNode h(FocusTargetNode focusTargetNode) {
        FocusTargetNode b = cje.b(focusTargetNode);
        if (b != null) {
            return b;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }

    private static final boolean i(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        boolean z;
        cga.c cVar;
        cga.c cVar2;
        cyk cykVar;
        cyk cykVar2;
        cga.c cVar3 = focusTargetNode2.p;
        if (cVar3.z) {
            cga.c cVar4 = cVar3.s;
            cxn e = cwp.e(focusTargetNode2);
            loop0: while (true) {
                z = false;
                cVar = null;
                if (e != null) {
                    if ((e.w.e.r & 1024) != 0) {
                        while (cVar4 != null) {
                            if ((cVar4.q & 1024) != 0) {
                                cVar2 = cVar4;
                                cbh cbhVar = null;
                                while (cVar2 != null) {
                                    if (cVar2 instanceof FocusTargetNode) {
                                        break loop0;
                                    }
                                    if ((cVar2.q & 1024) != 0 && (cVar2 instanceof cwr)) {
                                        int i = 0;
                                        for (cga.c cVar5 = ((cwr) cVar2).B; cVar5 != null; cVar5 = cVar5.t) {
                                            if ((cVar5.q & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    cVar2 = cVar5;
                                                } else {
                                                    if (cbhVar == null) {
                                                        cbhVar = new cbh(new cga.c[16]);
                                                    }
                                                    if (cVar2 != null) {
                                                        cbhVar.n(cVar2);
                                                    }
                                                    cbhVar.n(cVar5);
                                                    cVar2 = null;
                                                }
                                            }
                                        }
                                        if (i != 1) {
                                        }
                                    }
                                    cVar2 = cwp.a(cbhVar);
                                }
                            }
                            cVar4 = cVar4.s;
                        }
                    }
                    e = e.t();
                    if (e != null && (cykVar2 = e.w) != null) {
                        cVar4 = cykVar2.d;
                    } else {
                        cVar4 = null;
                    }
                } else {
                    cVar2 = null;
                    break;
                }
            }
            if (d.F(cVar2, focusTargetNode)) {
                ciz e2 = focusTargetNode.e();
                chy chyVar = chy.a;
                ciz cizVar = ciz.a;
                int ordinal = e2.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                cga.c cVar6 = focusTargetNode.p;
                                if (cVar6.z) {
                                    cga.c cVar7 = cVar6.s;
                                    cxn e3 = cwp.e(focusTargetNode);
                                    loop4: while (true) {
                                        if (e3 == null) {
                                            break;
                                        }
                                        if ((e3.w.e.r & 1024) != 0) {
                                            while (cVar7 != null) {
                                                if ((cVar7.q & 1024) != 0) {
                                                    cga.c cVar8 = cVar7;
                                                    cbh cbhVar2 = null;
                                                    while (cVar8 != null) {
                                                        if (cVar8 instanceof FocusTargetNode) {
                                                            cVar = cVar8;
                                                            break loop4;
                                                        }
                                                        if ((cVar8.q & 1024) != 0 && (cVar8 instanceof cwr)) {
                                                            int i2 = 0;
                                                            for (cga.c cVar9 = ((cwr) cVar8).B; cVar9 != null; cVar9 = cVar9.t) {
                                                                if ((cVar9.q & 1024) != 0) {
                                                                    i2++;
                                                                    if (i2 == 1) {
                                                                        cVar8 = cVar9;
                                                                    } else {
                                                                        if (cbhVar2 == null) {
                                                                            cbhVar2 = new cbh(new cga.c[16]);
                                                                        }
                                                                        if (cVar8 != null) {
                                                                            cbhVar2.n(cVar8);
                                                                        }
                                                                        cbhVar2.n(cVar9);
                                                                        cVar8 = null;
                                                                    }
                                                                }
                                                            }
                                                            if (i2 != 1) {
                                                            }
                                                        }
                                                        cVar8 = cwp.a(cbhVar2);
                                                    }
                                                }
                                                cVar7 = cVar7.s;
                                            }
                                        }
                                        e3 = e3.t();
                                        if (e3 != null && (cykVar = e3.w) != null) {
                                            cVar7 = cykVar.d;
                                        } else {
                                            cVar7 = null;
                                        }
                                    }
                                    FocusTargetNode focusTargetNode3 = (FocusTargetNode) cVar;
                                    if (focusTargetNode3 == null && j(focusTargetNode)) {
                                        l(focusTargetNode2);
                                        focusTargetNode.j(ciz.b);
                                        return true;
                                    }
                                    if (focusTargetNode3 != null && i(focusTargetNode3, focusTargetNode)) {
                                        z = i(focusTargetNode, focusTargetNode2);
                                        if (focusTargetNode.e() == ciz.b) {
                                            if (z) {
                                                focusTargetNode3.g();
                                                return true;
                                            }
                                        } else {
                                            throw new IllegalStateException("Deactivated node is focused");
                                        }
                                    }
                                } else {
                                    throw new IllegalStateException("visitAncestors called on an unattached node");
                                }
                            } else {
                                throw new armm();
                            }
                        }
                    } else {
                        h(focusTargetNode);
                        if (k(focusTargetNode, false)) {
                            l(focusTargetNode2);
                            return true;
                        }
                    }
                    return z;
                }
                l(focusTargetNode2);
                focusTargetNode.j(ciz.b);
                return true;
            }
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    private static final boolean j(FocusTargetNode focusTargetNode) {
        return ((Boolean) ((FocusOwnerImpl) ((dai) cwp.g(focusTargetNode)).d).a.a(null, null)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(FocusTargetNode focusTargetNode, boolean z) {
        FocusTargetNode b = cje.b(focusTargetNode);
        if (b != null) {
            return f(b, z);
        }
        return true;
    }

    private static final void l(FocusTargetNode focusTargetNode) {
        cyv.a(focusTargetNode, new AnonymousClass1(focusTargetNode));
        ciz e = focusTargetNode.e();
        chy chyVar = chy.a;
        ciz cizVar = ciz.a;
        int ordinal = e.ordinal();
        if (ordinal != 1 && ordinal != 3) {
            return;
        }
        focusTargetNode.j(ciz.a);
    }
}
