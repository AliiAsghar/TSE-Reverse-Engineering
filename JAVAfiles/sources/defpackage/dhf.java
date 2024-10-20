package defpackage;

import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhf {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [cbh] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [cbh] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static final czk a(cxn cxnVar) {
        cyk cykVar = cxnVar.w;
        czk czkVar = null;
        if ((cykVar.a() & 8) != 0) {
            cga.c cVar = cykVar.e;
            loop0: while (true) {
                if (cVar != null) {
                    if ((cVar.q & 8) != 0) {
                        cwr cwrVar = cVar;
                        ?? r2 = 0;
                        while (cwrVar != 0) {
                            if (cwrVar instanceof czk) {
                                if (cwrVar.dZ()) {
                                    czkVar = cwrVar;
                                    break loop0;
                                }
                            } else if ((cwrVar.q & 8) != 0 && (cwrVar instanceof cwr)) {
                                cga.c cVar2 = cwrVar.B;
                                int i = 0;
                                cwrVar = cwrVar;
                                r2 = r2;
                                while (cVar2 != null) {
                                    if ((cVar2.q & 8) != 0) {
                                        i++;
                                        r2 = r2;
                                        if (i == 1) {
                                            cwrVar = cVar2;
                                        } else {
                                            if (r2 == 0) {
                                                r2 = new cbh(new cga.c[16]);
                                            }
                                            if (cwrVar != 0) {
                                                r2.n(cwrVar);
                                            }
                                            r2.n(cVar2);
                                            cwrVar = 0;
                                        }
                                    }
                                    cVar2 = cVar2.t;
                                    cwrVar = cwrVar;
                                    r2 = r2;
                                }
                                if (i != 1) {
                                }
                            }
                            cwrVar = cwp.a(r2);
                        }
                    }
                    if ((cVar.r & 8) == 0) {
                        break;
                    }
                    cVar = cVar.t;
                } else {
                    break;
                }
            }
        }
        return czkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [cbh] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [cbh] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static final dhe b(cxn cxnVar, boolean z) {
        cyk cykVar = cxnVar.w;
        czk czkVar = null;
        if ((cykVar.a() & 8) != 0) {
            cga.c cVar = cykVar.e;
            loop0: while (true) {
                if (cVar != null) {
                    if ((cVar.q & 8) != 0) {
                        cwr cwrVar = cVar;
                        ?? r3 = 0;
                        while (cwrVar != 0) {
                            if (cwrVar instanceof czk) {
                                czkVar = cwrVar;
                                break loop0;
                            }
                            if ((cwrVar.q & 8) != 0 && (cwrVar instanceof cwr)) {
                                cga.c cVar2 = cwrVar.B;
                                int i = 0;
                                cwrVar = cwrVar;
                                r3 = r3;
                                while (cVar2 != null) {
                                    if ((cVar2.q & 8) != 0) {
                                        i++;
                                        r3 = r3;
                                        if (i == 1) {
                                            cwrVar = cVar2;
                                        } else {
                                            if (r3 == 0) {
                                                r3 = new cbh(new cga.c[16]);
                                            }
                                            if (cwrVar != 0) {
                                                r3.n(cwrVar);
                                            }
                                            r3.n(cVar2);
                                            cwrVar = 0;
                                        }
                                    }
                                    cVar2 = cVar2.t;
                                    cwrVar = cwrVar;
                                    r3 = r3;
                                }
                                if (i != 1) {
                                }
                            }
                            cwrVar = cwp.a(r3);
                        }
                    }
                    if ((cVar.r & 8) == 0) {
                        break;
                    }
                    cVar = cVar.t;
                } else {
                    break;
                }
            }
        }
        czkVar.getClass();
        cga.c A = czkVar.A();
        dgy z2 = cxnVar.z();
        z2.getClass();
        return new dhe(A, z, cxnVar, z2);
    }
}
