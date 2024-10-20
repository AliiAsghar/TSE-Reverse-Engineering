package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;
import defpackage.cga;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cii {
    public final arqg a;
    public final arqg b;
    public final List c = new ArrayList();
    public final List d = new ArrayList();
    public final List e = new ArrayList();
    public final List f = new ArrayList();
    private final arqr g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cii$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class AnonymousClass1 extends arrm implements arqg<arnb> {
        public AnonymousClass1(Object obj) {
            super(0, obj, cii.class, "invalidateNodes", "invalidateNodes()V", 0);
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [ciy, java.lang.Object] */
        @Override // defpackage.arqg
        public final /* synthetic */ Object a() {
            int i;
            char c;
            ciy ciyVar;
            int i2;
            int i3;
            cii ciiVar = (cii) this.e;
            if (!((arru) ciiVar.b).b().a()) {
                List list = ciiVar.d;
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((cid) list.get(i4)).a(ciz.d);
                }
                List list2 = ciiVar.c;
                int size2 = list2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    FocusTargetNode focusTargetNode = (FocusTargetNode) list2.get(i5);
                    if (focusTargetNode.z && !focusTargetNode.k()) {
                        focusTargetNode.h(ciz.d);
                    }
                }
                ciiVar.c.clear();
                ciiVar.d.clear();
                ciiVar.e.clear();
                ciiVar.f.clear();
                ciiVar.a.a();
            } else {
                List list3 = ciiVar.e;
                int size3 = list3.size();
                int i6 = 0;
                while (true) {
                    char c2 = 16;
                    int i7 = 1;
                    if (i6 < size3) {
                        cis cisVar = (cis) list3.get(i6);
                        if (cisVar.A().z) {
                            cga.c A = cisVar.A();
                            cbh cbhVar = null;
                            while (A != null) {
                                if (A instanceof FocusTargetNode) {
                                    ciiVar.c.add((FocusTargetNode) A);
                                } else if ((A.q & 1024) != 0 && (A instanceof cwr)) {
                                    int i8 = 0;
                                    for (cga.c cVar = ((cwr) A).B; cVar != null; cVar = cVar.t) {
                                        if ((cVar.q & 1024) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                A = cVar;
                                            } else {
                                                if (cbhVar == null) {
                                                    cbhVar = new cbh(new cga.c[16]);
                                                }
                                                if (A != null) {
                                                    cbhVar.n(A);
                                                }
                                                cbhVar.n(cVar);
                                                A = null;
                                            }
                                        }
                                    }
                                    if (i8 != 1) {
                                    }
                                }
                                A = cwp.a(cbhVar);
                            }
                            if (cisVar.A().z) {
                                cbh cbhVar2 = new cbh(new cga.c[16]);
                                cga.c cVar2 = cisVar.A().t;
                                if (cVar2 == null) {
                                    cwp.j(cbhVar2, cisVar.A());
                                } else {
                                    cbhVar2.n(cVar2);
                                }
                                while (true) {
                                    int i9 = cbhVar2.b;
                                    if (i9 != 0) {
                                        cga.c cVar3 = (cga.c) cbhVar2.c(i9 - 1);
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
                                                            ciiVar.c.add((FocusTargetNode) cVar3);
                                                        } else if ((cVar3.q & 1024) != 0 && (cVar3 instanceof cwr)) {
                                                            int i10 = 0;
                                                            for (cga.c cVar4 = ((cwr) cVar3).B; cVar4 != null; cVar4 = cVar4.t) {
                                                                if ((cVar4.q & 1024) != 0) {
                                                                    i10++;
                                                                    if (i10 == 1) {
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
                                                            if (i10 != 1) {
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
                                }
                            } else {
                                throw new IllegalStateException("visitChildren called on an unattached node");
                            }
                        }
                        i6++;
                    } else {
                        ciiVar.e.clear();
                        List list4 = ciiVar.d;
                        int size4 = list4.size();
                        int i11 = 0;
                        while (i11 < size4) {
                            cid cidVar = (cid) list4.get(i11);
                            if (!cidVar.A().z) {
                                cidVar.a(ciz.d);
                                c = c2;
                                i = i7;
                            } else {
                                cga.c A2 = cidVar.A();
                                int i12 = i7;
                                FocusTargetNode focusTargetNode2 = null;
                                int i13 = 0;
                                cbh cbhVar4 = null;
                                while (A2 != null) {
                                    if (A2 instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) A2;
                                        if (focusTargetNode2 != null) {
                                            i3 = 0;
                                        } else {
                                            i3 = i7;
                                        }
                                        i13 |= i3 ^ i7;
                                        if (ciiVar.c.contains(focusTargetNode3)) {
                                            ciiVar.f.add(focusTargetNode3);
                                            i12 = 0;
                                        }
                                        focusTargetNode2 = focusTargetNode3;
                                    } else if ((A2.q & 1024) != 0 && (A2 instanceof cwr)) {
                                        cga.c cVar5 = ((cwr) A2).B;
                                        int i14 = 0;
                                        while (cVar5 != null) {
                                            if ((cVar5.q & 1024) != 0) {
                                                i14++;
                                                if (i14 == i7) {
                                                    A2 = cVar5;
                                                } else {
                                                    if (cbhVar4 == null) {
                                                        cbhVar4 = new cbh(new cga.c[16]);
                                                    }
                                                    if (A2 != null) {
                                                        cbhVar4.n(A2);
                                                    }
                                                    cbhVar4.n(cVar5);
                                                    A2 = null;
                                                }
                                            }
                                            cVar5 = cVar5.t;
                                            i7 = 1;
                                        }
                                        int i15 = i7;
                                        if (i14 == i15) {
                                            i7 = i15;
                                        }
                                    }
                                    A2 = cwp.a(cbhVar4);
                                    i7 = 1;
                                }
                                if (cidVar.A().z) {
                                    cbh cbhVar5 = new cbh(new cga.c[16]);
                                    cga.c cVar6 = cidVar.A().t;
                                    if (cVar6 == null) {
                                        cwp.j(cbhVar5, cidVar.A());
                                    } else {
                                        cbhVar5.n(cVar6);
                                    }
                                    while (true) {
                                        int i16 = cbhVar5.b;
                                        if (i16 == 0) {
                                            break;
                                        }
                                        cga.c cVar7 = (cga.c) cbhVar5.c(i16 - 1);
                                        if ((cVar7.r & 1024) == 0) {
                                            cwp.j(cbhVar5, cVar7);
                                        } else {
                                            while (cVar7 != null) {
                                                if ((cVar7.q & 1024) != 0) {
                                                    cbh cbhVar6 = null;
                                                    while (cVar7 != null) {
                                                        if (cVar7 instanceof FocusTargetNode) {
                                                            FocusTargetNode focusTargetNode4 = (FocusTargetNode) cVar7;
                                                            if (focusTargetNode2 != null) {
                                                                i2 = 0;
                                                            } else {
                                                                i2 = 1;
                                                            }
                                                            i13 |= i2 ^ 1;
                                                            if (ciiVar.c.contains(focusTargetNode4)) {
                                                                ciiVar.f.add(focusTargetNode4);
                                                                i12 = 0;
                                                            }
                                                            focusTargetNode2 = focusTargetNode4;
                                                        } else if ((cVar7.q & 1024) != 0 && (cVar7 instanceof cwr)) {
                                                            int i17 = 0;
                                                            for (cga.c cVar8 = ((cwr) cVar7).B; cVar8 != null; cVar8 = cVar8.t) {
                                                                if ((cVar8.q & 1024) != 0) {
                                                                    i17++;
                                                                    if (i17 == 1) {
                                                                        cVar7 = cVar8;
                                                                    } else {
                                                                        if (cbhVar6 == null) {
                                                                            cbhVar6 = new cbh(new cga.c[16]);
                                                                        }
                                                                        if (cVar7 != null) {
                                                                            cbhVar6.n(cVar7);
                                                                        }
                                                                        cbhVar6.n(cVar8);
                                                                        cVar7 = null;
                                                                    }
                                                                }
                                                            }
                                                            if (i17 == 1) {
                                                            }
                                                            cVar7 = cwp.a(cbhVar6);
                                                        }
                                                        cVar7 = cwp.a(cbhVar6);
                                                    }
                                                } else {
                                                    cVar7 = cVar7.t;
                                                }
                                            }
                                        }
                                    }
                                    i = 1;
                                    c = 16;
                                    if (i12 != 0) {
                                        if (i13 != 0) {
                                            ciyVar = cie.a(cidVar);
                                        } else if (focusTargetNode2 == null || (ciyVar = focusTargetNode2.e()) == null) {
                                            ciyVar = ciz.d;
                                        }
                                        cidVar.a(ciyVar);
                                    }
                                } else {
                                    throw new IllegalStateException("visitChildren called on an unattached node");
                                }
                            }
                            i11++;
                            i7 = i;
                            c2 = c;
                        }
                        ciiVar.d.clear();
                        List list5 = ciiVar.c;
                        int size5 = list5.size();
                        for (int i18 = 0; i18 < size5; i18++) {
                            FocusTargetNode focusTargetNode5 = (FocusTargetNode) list5.get(i18);
                            if (focusTargetNode5.z) {
                                ciz e = focusTargetNode5.e();
                                focusTargetNode5.i();
                                if (e != focusTargetNode5.e() || ciiVar.f.contains(focusTargetNode5)) {
                                    focusTargetNode5.g();
                                }
                            }
                        }
                        ciiVar.c.clear();
                        ciiVar.f.clear();
                        ciiVar.a.a();
                        if (!ciiVar.e.isEmpty()) {
                            csg.c("Unprocessed FocusProperties nodes");
                        }
                        if (!ciiVar.d.isEmpty()) {
                            csg.c("Unprocessed FocusEvent nodes");
                        }
                        if (!ciiVar.c.isEmpty()) {
                            csg.c("Unprocessed FocusTarget nodes");
                        }
                    }
                }
            }
            return arnb.a;
        }
    }

    public cii(arqr arqrVar, arqg arqgVar, arqg arqgVar2) {
        this.g = arqrVar;
        this.a = arqgVar;
        this.b = arqgVar2;
    }

    public final void a(List list, Object obj) {
        if (list.add(obj)) {
            if (this.c.size() + this.d.size() + this.e.size() == 1) {
                this.g.a(new AnonymousClass1(this));
            }
        }
    }

    public final boolean b() {
        if (this.c.isEmpty() && this.e.isEmpty() && this.d.isEmpty()) {
            return false;
        }
        return true;
    }
}
