package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;
import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chx {
    public static final Object a(FocusTargetNode focusTargetNode, int i, arqr arqrVar) {
        int i2;
        cga.c cVar;
        css f;
        cyk cykVar;
        cga.c cVar2 = focusTargetNode.p;
        if (cVar2.z) {
            cga.c cVar3 = cVar2.s;
            cxn e = cwp.e(focusTargetNode);
            loop0: while (true) {
                i2 = 1;
                if (e != null) {
                    if ((e.w.e.r & 1024) != 0) {
                        while (cVar3 != null) {
                            if ((cVar3.q & 1024) != 0) {
                                cVar = cVar3;
                                cbh cbhVar = null;
                                while (cVar != null) {
                                    if (cVar instanceof FocusTargetNode) {
                                        break loop0;
                                    }
                                    if ((cVar.q & 1024) != 0 && (cVar instanceof cwr)) {
                                        int i3 = 0;
                                        for (cga.c cVar4 = ((cwr) cVar).B; cVar4 != null; cVar4 = cVar4.t) {
                                            if ((cVar4.q & 1024) != 0) {
                                                i3++;
                                                if (i3 == 1) {
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
                                        if (i3 != 1) {
                                        }
                                    }
                                    cVar = cwp.a(cbhVar);
                                }
                            }
                            cVar3 = cVar3.s;
                        }
                    }
                    e = e.t();
                    if (e != null && (cykVar = e.w) != null) {
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
            if ((focusTargetNode2 != null && d.F(focusTargetNode2.f(), focusTargetNode.f())) || (f = focusTargetNode.f()) == null) {
                return null;
            }
            int i4 = 5;
            if (!a.bA(i, 5)) {
                i4 = 6;
                if (!a.bA(i, 6)) {
                    i4 = 3;
                    if (!a.bA(i, 3)) {
                        i4 = 4;
                        if (!a.bA(i, 4)) {
                            if (a.bA(i, 1)) {
                                i2 = 2;
                            } else if (!a.bA(i, 2)) {
                                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                            }
                            return f.a(i2, arqrVar);
                        }
                    }
                }
            }
            i2 = i4;
            return f.a(i2, arqrVar);
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }
}
