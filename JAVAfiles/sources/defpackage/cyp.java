package defpackage;

import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import defpackage.cga;
import defpackage.cxt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyp {
    private static final uv a = new uv((byte[]) null);

    public static final int a(cga.b bVar) {
        int i = 1;
        if (true == (bVar instanceof ctq)) {
            i = 3;
        }
        if (bVar instanceof chn) {
            i |= 4;
        }
        if (bVar instanceof dha) {
            i |= 8;
        }
        if (bVar instanceof cri) {
            i |= 16;
        }
        if ((bVar instanceof cvu) || (bVar instanceof cwa)) {
            i |= 32;
        }
        if (bVar instanceof cic) {
            i |= 4096;
        }
        if (bVar instanceof cil) {
            i |= 2048;
        }
        if (bVar instanceof cuq) {
            i |= 256;
        }
        if (bVar instanceof cuz) {
            i |= 64;
        }
        if (!(bVar instanceof cut) && !(bVar instanceof cuv)) {
            return i;
        }
        return i | 128;
    }

    public static final int b(cga.c cVar) {
        int i;
        int i2 = cVar.q;
        if (i2 != 0) {
            return i2;
        }
        uv uvVar = a;
        Class<?> cls = cVar.getClass();
        int a2 = uvVar.a(cls);
        if (a2 >= 0) {
            return uvVar.c[a2];
        }
        int i3 = 1;
        if (true == (cVar instanceof cxi)) {
            i3 = 3;
        }
        if (cVar instanceof cwx) {
            i3 |= 4;
        }
        if (cVar instanceof czk) {
            i3 |= 8;
        }
        if (cVar instanceof czi) {
            i3 |= 16;
        }
        if (cVar instanceof cvy) {
            i3 |= 32;
        }
        if (cVar instanceof czf) {
            i3 |= 64;
        }
        if (cVar instanceof cxg) {
            i3 |= 128;
        }
        if (cVar instanceof cwz) {
            i3 |= 256;
        }
        if (cVar instanceof csp) {
            i3 |= 512;
        }
        if (cVar instanceof FocusTargetNode) {
            i3 |= 1024;
        }
        if (cVar instanceof cis) {
            i3 |= 2048;
        }
        if (cVar instanceof cid) {
            i3 |= 4096;
        }
        if (cVar instanceof cpv) {
            i3 |= 8192;
        }
        if (cVar instanceof csd) {
            i3 |= 16384;
        }
        if (cVar instanceof cwm) {
            i3 |= 32768;
        }
        if (cVar instanceof cpy) {
            i3 |= 131072;
        }
        if (cVar instanceof czp) {
            i = 262144 | i3;
        } else {
            i = i3;
        }
        uvVar.g(cls, i);
        return i;
    }

    public static final int c(cga.c cVar) {
        if (cVar instanceof cwr) {
            cwr cwrVar = (cwr) cVar;
            int i = cwrVar.A;
            for (cga.c cVar2 = cwrVar.B; cVar2 != null; cVar2 = cVar2.t) {
                i |= c(cVar2);
            }
            return i;
        }
        return b(cVar);
    }

    public static final void d(cga.c cVar) {
        if (!cVar.z) {
            csg.c("autoInvalidateInsertedNode called on unattached node");
        }
        e(cVar, -1, 1);
    }

    public static final void e(cga.c cVar, int i, int i2) {
        if (cVar instanceof cwr) {
            cwr cwrVar = (cwr) cVar;
            i(cVar, cwrVar.A & i, i2);
            int i3 = (~cwrVar.A) & i;
            for (cga.c cVar2 = cwrVar.B; cVar2 != null; cVar2 = cVar2.t) {
                e(cVar2, i3, i2);
            }
            return;
        }
        i(cVar, i & cVar.q, i2);
    }

    public static final void f(cga.c cVar) {
        if (!cVar.z) {
            csg.c("autoInvalidateRemovedNode called on unattached node");
        }
        e(cVar, -1, 2);
    }

    public static final void g(cga.c cVar) {
        if (!cVar.z) {
            csg.c("autoInvalidateUpdatedNode called on unattached node");
        }
        e(cVar, -1, 0);
    }

    public static final boolean h(int i) {
        if ((i & 128) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void i(cga.c cVar, int i, int i2) {
        if (i2 != 0 || cVar.dL()) {
            if ((i & 2) != 0 && (cVar instanceof cxi)) {
                cxl.b((cxi) cVar);
                if (i2 == 2) {
                    cwp.f(cVar, 2).aj();
                }
            }
            if ((i & 128) != 0 && (cVar instanceof cxg) && i2 != 2) {
                cwp.e(cVar).P();
            }
            if ((i & 256) != 0 && (cVar instanceof cwz) && i2 != 2) {
                cxn e = cwp.e(cVar);
                if (!e.ai() && !e.al() && !e.B) {
                    cxq.a(e).y(e);
                }
            }
            if ((i & 4) != 0 && (cVar instanceof cwx)) {
                cwy.a((cwx) cVar);
            }
            if ((i & 8) != 0 && (cVar instanceof czk)) {
                czl.a((czk) cVar);
            }
            if ((i & 64) != 0 && (cVar instanceof czf)) {
                cxt cxtVar = cwp.e((czf) cVar).x;
                cxtVar.r.q = true;
                cxt.a aVar = cxtVar.s;
                if (aVar != null) {
                    aVar.u = true;
                }
            }
            if ((i & 2048) != 0 && (cVar instanceof cis)) {
                cis cisVar = (cis) cVar;
                cwj.b = null;
                cisVar.u(cwj.a);
                if (cwj.b != null) {
                    if (i2 == 2) {
                        if (cisVar.A().z) {
                            cbh cbhVar = new cbh(new cga.c[16]);
                            cga.c cVar2 = cisVar.A().t;
                            if (cVar2 == null) {
                                cwp.j(cbhVar, cisVar.A());
                            } else {
                                cbhVar.n(cVar2);
                            }
                            while (true) {
                                int i3 = cbhVar.b;
                                if (i3 == 0) {
                                    break;
                                }
                                cga.c cVar3 = (cga.c) cbhVar.c(i3 - 1);
                                if ((cVar3.r & 1024) == 0) {
                                    cwp.j(cbhVar, cVar3);
                                } else {
                                    while (true) {
                                        if (cVar3 == null) {
                                            break;
                                        }
                                        if ((cVar3.q & 1024) != 0) {
                                            cbh cbhVar2 = null;
                                            while (cVar3 != null) {
                                                if (cVar3 instanceof FocusTargetNode) {
                                                    cjb.b((FocusTargetNode) cVar3);
                                                } else if ((cVar3.q & 1024) != 0 && (cVar3 instanceof cwr)) {
                                                    int i4 = 0;
                                                    for (cga.c cVar4 = ((cwr) cVar3).B; cVar4 != null; cVar4 = cVar4.t) {
                                                        if ((cVar4.q & 1024) != 0) {
                                                            i4++;
                                                            if (i4 == 1) {
                                                                cVar3 = cVar4;
                                                            } else {
                                                                if (cbhVar2 == null) {
                                                                    cbhVar2 = new cbh(new cga.c[16]);
                                                                }
                                                                if (cVar3 != null) {
                                                                    cbhVar2.n(cVar3);
                                                                }
                                                                cbhVar2.n(cVar4);
                                                                cVar3 = null;
                                                            }
                                                        }
                                                    }
                                                    if (i4 != 1) {
                                                    }
                                                }
                                                cVar3 = cwp.a(cbhVar2);
                                            }
                                        } else {
                                            cVar3 = cVar3.t;
                                        }
                                    }
                                }
                            }
                        } else {
                            throw new IllegalStateException("visitChildren called on an unattached node");
                        }
                    } else {
                        cii ciiVar = ((FocusOwnerImpl) ((dai) cwp.g(cisVar)).d).d;
                        ciiVar.a(ciiVar.e, cisVar);
                    }
                }
            }
            if ((i & 4096) != 0 && (cVar instanceof cid)) {
                cid cidVar = (cid) cVar;
                cii ciiVar2 = ((FocusOwnerImpl) ((dai) cwp.g(cidVar)).d).d;
                ciiVar2.a(ciiVar2.d, cidVar);
            }
        }
    }
}
