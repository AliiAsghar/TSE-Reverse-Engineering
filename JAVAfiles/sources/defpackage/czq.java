package defpackage;

import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czq {
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
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [cbh] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [cbh] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final czp a(czp czpVar) {
        cyk cykVar;
        if (czpVar.A().z) {
            cga.c cVar = czpVar.A().s;
            cxn e = cwp.e(czpVar);
            while (e != null) {
                if ((e.w.e.r & 262144) != 0) {
                    while (cVar != null) {
                        if ((cVar.q & 262144) != 0) {
                            cwr cwrVar = cVar;
                            ?? r5 = 0;
                            while (cwrVar != 0) {
                                if (cwrVar instanceof czp) {
                                    czp czpVar2 = (czp) cwrVar;
                                    if (d.F(czpVar.dP(), czpVar2.dP()) && cfp.a(czpVar, czpVar2)) {
                                        return czpVar2;
                                    }
                                } else if ((cwrVar.q & 262144) != 0 && (cwrVar instanceof cwr)) {
                                    cga.c cVar2 = cwrVar.B;
                                    int i = 0;
                                    cwrVar = cwrVar;
                                    r5 = r5;
                                    while (cVar2 != null) {
                                        if ((cVar2.q & 262144) != 0) {
                                            i++;
                                            r5 = r5;
                                            if (i == 1) {
                                                cwrVar = cVar2;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new cbh(new cga.c[16]);
                                                }
                                                if (cwrVar != 0) {
                                                    r5.n(cwrVar);
                                                }
                                                r5.n(cVar2);
                                                cwrVar = 0;
                                            }
                                        }
                                        cVar2 = cVar2.t;
                                        cwrVar = cwrVar;
                                        r5 = r5;
                                    }
                                    if (i != 1) {
                                    }
                                }
                                cwrVar = cwp.a(r5);
                            }
                        }
                        cVar = cVar.s;
                    }
                }
                e = e.t();
                if (e != null && (cykVar = e.w) != null) {
                    cVar = cykVar.d;
                } else {
                    cVar = null;
                }
            }
            return null;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [cbh] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [cbh] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final czp b(cwo cwoVar, Object obj) {
        cyk cykVar;
        if (cwoVar.A().z) {
            cga.c cVar = cwoVar.A().s;
            cxn e = cwp.e(cwoVar);
            while (e != null) {
                if ((e.w.e.r & 262144) != 0) {
                    while (cVar != null) {
                        if ((cVar.q & 262144) != 0) {
                            cwr cwrVar = cVar;
                            ?? r4 = 0;
                            while (cwrVar != 0) {
                                if (cwrVar instanceof czp) {
                                    czp czpVar = (czp) cwrVar;
                                    if (d.F(obj, czpVar.dP())) {
                                        return czpVar;
                                    }
                                } else if ((cwrVar.q & 262144) != 0 && (cwrVar instanceof cwr)) {
                                    cga.c cVar2 = cwrVar.B;
                                    int i = 0;
                                    cwrVar = cwrVar;
                                    r4 = r4;
                                    while (cVar2 != null) {
                                        if ((cVar2.q & 262144) != 0) {
                                            i++;
                                            r4 = r4;
                                            if (i == 1) {
                                                cwrVar = cVar2;
                                            } else {
                                                if (r4 == 0) {
                                                    r4 = new cbh(new cga.c[16]);
                                                }
                                                if (cwrVar != 0) {
                                                    r4.n(cwrVar);
                                                }
                                                r4.n(cVar2);
                                                cwrVar = 0;
                                            }
                                        }
                                        cVar2 = cVar2.t;
                                        cwrVar = cwrVar;
                                        r4 = r4;
                                    }
                                    if (i != 1) {
                                    }
                                }
                                cwrVar = cwp.a(r4);
                            }
                        }
                        cVar = cVar.s;
                    }
                }
                e = e.t();
                if (e != null && (cykVar = e.w) != null) {
                    cVar = cykVar.d;
                } else {
                    cVar = null;
                }
            }
            return null;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [czp, cwo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [arqr] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [cbh] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [cbh] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void c(czp czpVar, arqr arqrVar) {
        cyk cykVar;
        cga.c cVar = ((cga.c) czpVar).p;
        if (cVar.z) {
            cga.c cVar2 = cVar.s;
            cxn e = cwp.e(czpVar);
            while (e != null) {
                if ((e.w.e.r & 262144) != 0) {
                    while (cVar2 != null) {
                        if ((cVar2.q & 262144) != 0) {
                            cwr cwrVar = cVar2;
                            ?? r5 = 0;
                            while (cwrVar != 0) {
                                if (cwrVar instanceof czp) {
                                    czp czpVar2 = (czp) cwrVar;
                                    if (d.F(((cqv) czpVar).a, czpVar2.dP()) && cfp.a(czpVar, czpVar2) && !((Boolean) arqrVar.a(czpVar2)).booleanValue()) {
                                        return;
                                    }
                                } else if ((cwrVar.q & 262144) != 0 && (cwrVar instanceof cwr)) {
                                    cga.c cVar3 = cwrVar.B;
                                    int i = 0;
                                    cwrVar = cwrVar;
                                    r5 = r5;
                                    while (cVar3 != null) {
                                        if ((cVar3.q & 262144) != 0) {
                                            i++;
                                            r5 = r5;
                                            if (i == 1) {
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
                                    if (i != 1) {
                                    }
                                }
                                cwrVar = cwp.a(r5);
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
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [arqr] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [cbh] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [cbh] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final void d(cwo cwoVar, Object obj, arqr arqrVar) {
        cyk cykVar;
        if (cwoVar.A().z) {
            cga.c cVar = cwoVar.A().s;
            cxn e = cwp.e(cwoVar);
            while (e != null) {
                if ((e.w.e.r & 262144) != 0) {
                    while (cVar != null) {
                        if ((cVar.q & 262144) != 0) {
                            cwr cwrVar = cVar;
                            ?? r4 = 0;
                            while (cwrVar != 0) {
                                if (cwrVar instanceof czp) {
                                    czp czpVar = (czp) cwrVar;
                                    if (d.F(obj, czpVar.dP()) && !((Boolean) arqrVar.a(czpVar)).booleanValue()) {
                                        return;
                                    }
                                } else if ((cwrVar.q & 262144) != 0 && (cwrVar instanceof cwr)) {
                                    cga.c cVar2 = cwrVar.B;
                                    int i = 0;
                                    cwrVar = cwrVar;
                                    r4 = r4;
                                    while (cVar2 != null) {
                                        if ((cVar2.q & 262144) != 0) {
                                            i++;
                                            r4 = r4;
                                            if (i == 1) {
                                                cwrVar = cVar2;
                                            } else {
                                                if (r4 == 0) {
                                                    r4 = new cbh(new cga.c[16]);
                                                }
                                                if (cwrVar != 0) {
                                                    r4.n(cwrVar);
                                                }
                                                r4.n(cVar2);
                                                cwrVar = 0;
                                            }
                                        }
                                        cVar2 = cVar2.t;
                                        cwrVar = cwrVar;
                                        r4 = r4;
                                    }
                                    if (i != 1) {
                                    }
                                }
                                cwrVar = cwp.a(r4);
                            }
                        }
                        cVar = cVar.s;
                    }
                }
                e = e.t();
                if (e != null && (cykVar = e.w) != null) {
                    cVar = cykVar.d;
                } else {
                    cVar = null;
                }
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [arqr] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [cbh] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [cbh] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void e(czp czpVar, arqr arqrVar) {
        czo czoVar;
        if (!czpVar.A().z) {
            csg.c("visitSubtreeIf called on an unattached node");
        }
        cbh cbhVar = new cbh(new cga.c[16]);
        cga.c cVar = czpVar.A().t;
        if (cVar == null) {
            cwp.j(cbhVar, czpVar.A());
        } else {
            cbhVar.n(cVar);
        }
        while (true) {
            int i = cbhVar.b;
            if (i != 0) {
                cga.c cVar2 = (cga.c) cbhVar.c(i - 1);
                if ((cVar2.r & 262144) != 0) {
                    for (cga.c cVar3 = cVar2; cVar3 != null; cVar3 = cVar3.t) {
                        if ((cVar3.q & 262144) != 0) {
                            cwr cwrVar = cVar3;
                            ?? r7 = 0;
                            while (cwrVar != 0) {
                                if (cwrVar instanceof czp) {
                                    czp czpVar2 = (czp) cwrVar;
                                    if (d.F(czpVar.dP(), czpVar2.dP()) && cfp.a(czpVar, czpVar2)) {
                                        czoVar = (czo) arqrVar.a(czpVar2);
                                    } else {
                                        czoVar = czo.a;
                                    }
                                    if (czoVar != czo.c) {
                                        if (czoVar == czo.b) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((cwrVar.q & 262144) != 0 && (cwrVar instanceof cwr)) {
                                    cga.c cVar4 = cwrVar.B;
                                    int i2 = 0;
                                    cwrVar = cwrVar;
                                    r7 = r7;
                                    while (cVar4 != null) {
                                        if ((cVar4.q & 262144) != 0) {
                                            i2++;
                                            r7 = r7;
                                            if (i2 == 1) {
                                                cwrVar = cVar4;
                                            } else {
                                                if (r7 == 0) {
                                                    r7 = new cbh(new cga.c[16]);
                                                }
                                                if (cwrVar != 0) {
                                                    r7.n(cwrVar);
                                                }
                                                r7.n(cVar4);
                                                cwrVar = 0;
                                            }
                                        }
                                        cVar4 = cVar4.t;
                                        cwrVar = cwrVar;
                                        r7 = r7;
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                cwrVar = cwp.a(r7);
                            }
                        }
                    }
                }
                cwp.j(cbhVar, cVar2);
            } else {
                return;
            }
        }
    }
}
