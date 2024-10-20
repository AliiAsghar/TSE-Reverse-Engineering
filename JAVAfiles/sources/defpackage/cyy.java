package defpackage;

import defpackage.cga;
import defpackage.cxn;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyy {
    public final cbh a = new cbh(new cxn[16]);
    public cxn[] b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [cbh] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [cbh] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final void a(cxn cxnVar) {
        int i = 0;
        if (cxnVar.q() == cxn.a.e && !cxnVar.ai() && !cxnVar.al() && !cxnVar.C && cxnVar.ew()) {
            cyk cykVar = cxnVar.w;
            if ((cykVar.a() & 256) != 0) {
                for (cga.c cVar = cykVar.e; cVar != null; cVar = cVar.t) {
                    if ((cVar.q & 256) != 0) {
                        cwr cwrVar = cVar;
                        ?? r6 = 0;
                        while (cwrVar != 0) {
                            if (cwrVar instanceof cwz) {
                                cwz cwzVar = (cwz) cwrVar;
                                cwzVar.i(cwp.f(cwzVar, 256));
                            } else if ((cwrVar.q & 256) != 0 && (cwrVar instanceof cwr)) {
                                cga.c cVar2 = cwrVar.B;
                                int i2 = 0;
                                cwrVar = cwrVar;
                                r6 = r6;
                                while (cVar2 != null) {
                                    if ((cVar2.q & 256) != 0) {
                                        i2++;
                                        r6 = r6;
                                        if (i2 == 1) {
                                            cwrVar = cVar2;
                                        } else {
                                            if (r6 == 0) {
                                                r6 = new cbh(new cga.c[16]);
                                            }
                                            if (cwrVar != 0) {
                                                r6.n(cwrVar);
                                            }
                                            r6.n(cVar2);
                                            cwrVar = 0;
                                        }
                                    }
                                    cVar2 = cVar2.t;
                                    cwrVar = cwrVar;
                                    r6 = r6;
                                }
                                if (i2 != 1) {
                                }
                            }
                            cwrVar = cwp.a(r6);
                        }
                    }
                    if ((cVar.r & 256) == 0) {
                        break;
                    }
                }
            }
        }
        cxnVar.B = false;
        cbh o = cxnVar.o();
        int i3 = o.b;
        if (i3 > 0) {
            Object[] objArr = o.a;
            do {
                a((cxn) objArr[i]);
                i++;
            } while (i < i3);
        }
    }

    public final void b(cxn cxnVar) {
        this.a.n(cxnVar);
        cxnVar.B = true;
    }
}
