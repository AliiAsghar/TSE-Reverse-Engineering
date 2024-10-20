package defpackage;

import defpackage.cga;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvv {
    public final cbh a = new cbh(new cwg[16]);
    public final cbh b = new cbh(new cvt[16]);
    public final cbh c = new cbh(new cxn[16]);
    public final cbh d = new cbh(new cvt[16]);
    public boolean e;
    private final czb f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cvv$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqg<arnb> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            cvv cvvVar = cvv.this;
            int i = 0;
            cvvVar.e = false;
            HashSet hashSet = new HashSet();
            cbh cbhVar = cvvVar.c;
            int i2 = cbhVar.b;
            if (i2 > 0) {
                Object[] objArr = cbhVar.a;
                int i3 = 0;
                do {
                    cxn cxnVar = (cxn) objArr[i3];
                    cvt cvtVar = (cvt) cvvVar.d.a[i3];
                    cga.c cVar = cxnVar.w.e;
                    if (cVar.z) {
                        cvv.b(cVar, cvtVar, hashSet);
                    }
                    i3++;
                } while (i3 < i2);
            }
            cvvVar.c.g();
            cvvVar.d.g();
            cbh cbhVar2 = cvvVar.a;
            int i4 = cbhVar2.b;
            if (i4 > 0) {
                Object[] objArr2 = cbhVar2.a;
                do {
                    cwg cwgVar = (cwg) objArr2[i];
                    cvt cvtVar2 = (cvt) cvvVar.b.a[i];
                    if (cwgVar.z) {
                        cvv.b(cwgVar, cvtVar2, hashSet);
                    }
                    i++;
                } while (i < i4);
            }
            cvvVar.a.g();
            cvvVar.b.g();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((cwg) it.next()).z();
            }
            return arnb.a;
        }
    }

    public cvv(czb czbVar) {
        this.f = czbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
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
    public static final void b(cga.c cVar, cvt cvtVar, Set set) {
        if (!cVar.A().z) {
            csg.c("visitSubtreeIf called on an unattached node");
        }
        cbh cbhVar = new cbh(new cga.c[16]);
        cga.c cVar2 = cVar.A().t;
        if (cVar2 == null) {
            cwp.j(cbhVar, cVar.A());
        } else {
            cbhVar.n(cVar2);
        }
        while (true) {
            int i = cbhVar.b;
            if (i != 0) {
                cga.c cVar3 = (cga.c) cbhVar.c(i - 1);
                if ((cVar3.r & 32) != 0) {
                    for (cga.c cVar4 = cVar3; cVar4 != null; cVar4 = cVar4.t) {
                        if ((cVar4.q & 32) != 0) {
                            cwr cwrVar = cVar4;
                            ?? r5 = 0;
                            while (cwrVar != 0) {
                                if (cwrVar instanceof cvy) {
                                    cvy cvyVar = (cvy) cwrVar;
                                    if (cvyVar instanceof cwg) {
                                        cwg cwgVar = (cwg) cvyVar;
                                        if ((cwgVar.a instanceof cvu) && cwgVar.c.contains(cvtVar)) {
                                            set.add(cvyVar);
                                        }
                                    }
                                    if (cvyVar.p().c(cvtVar)) {
                                        break;
                                    }
                                } else if ((cwrVar.q & 32) != 0 && (cwrVar instanceof cwr)) {
                                    cga.c cVar5 = cwrVar.B;
                                    int i2 = 0;
                                    cwrVar = cwrVar;
                                    r5 = r5;
                                    while (cVar5 != null) {
                                        if ((cVar5.q & 32) != 0) {
                                            i2++;
                                            r5 = r5;
                                            if (i2 == 1) {
                                                cwrVar = cVar5;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new cbh(new cga.c[16]);
                                                }
                                                if (cwrVar != 0) {
                                                    r5.n(cwrVar);
                                                }
                                                r5.n(cVar5);
                                                cwrVar = 0;
                                            }
                                        }
                                        cVar5 = cVar5.t;
                                        cwrVar = cwrVar;
                                        r5 = r5;
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                cwrVar = cwp.a(r5);
                            }
                        }
                    }
                }
                cwp.j(cbhVar, cVar3);
            } else {
                return;
            }
        }
    }

    public final void a() {
        if (!this.e) {
            this.e = true;
            this.f.x(new AnonymousClass1());
        }
    }
}
