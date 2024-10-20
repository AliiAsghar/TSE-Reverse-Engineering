package defpackage;

import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cvx {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [cga$c] */
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
    public static Object a(cvy cvyVar, cvt cvtVar) {
        cyk cykVar;
        if (!cvyVar.A().z) {
            csg.b("ModifierLocal accessed from an unattached node");
        }
        if (cvyVar.A().z) {
            cga.c cVar = cvyVar.A().s;
            cxn e = cwp.e(cvyVar);
            while (e != null) {
                if ((e.w.e.r & 32) != 0) {
                    while (cVar != null) {
                        if ((cVar.q & 32) != 0) {
                            cwr cwrVar = cVar;
                            ?? r3 = 0;
                            while (cwrVar != 0) {
                                if (cwrVar instanceof cvy) {
                                    cvy cvyVar2 = (cvy) cwrVar;
                                    if (cvyVar2.p().c(cvtVar)) {
                                        return cvyVar2.p().a(cvtVar);
                                    }
                                } else if ((cwrVar.q & 32) != 0 && (cwrVar instanceof cwr)) {
                                    cga.c cVar2 = cwrVar.B;
                                    int i = 0;
                                    cwrVar = cwrVar;
                                    r3 = r3;
                                    while (cVar2 != null) {
                                        if ((cVar2.q & 32) != 0) {
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
            return cvtVar.a.a();
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    public static void b(cvy cvyVar, cvt cvtVar, Object obj) {
        xy xyVar = (xy) cvyVar;
        if (xyVar.c == cvs.a) {
            csg.b("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!xyVar.c.c(cvtVar)) {
            csg.b(a.cc(cvtVar, "Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key ", " was not found."));
        }
        xyVar.c.b(cvtVar, obj);
    }
}
