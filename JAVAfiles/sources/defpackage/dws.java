package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dws {
    public static final dwl a = new dwl();
    public static int b = 0;
    public static int c = 0;

    public static void a(int i, dwc dwcVar, dwm dwmVar, boolean z) {
        boolean z2;
        dwb dwbVar;
        dwb dwbVar2;
        boolean z3;
        dwb dwbVar3;
        dwb dwbVar4;
        if (!dwcVar.x) {
            b++;
            if (!(dwcVar instanceof dwd) && dwcVar.T() && c(dwcVar)) {
                dwd.al(dwcVar, dwmVar, new dwl());
            }
            dwb U = dwcVar.U(2);
            dwb U2 = dwcVar.U(4);
            int a2 = U.a();
            int a3 = U2.a();
            HashSet hashSet = U.a;
            if (hashSet != null && U.c) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    int i2 = i + 1;
                    dwb dwbVar5 = (dwb) it.next();
                    dwc dwcVar2 = dwbVar5.d;
                    boolean c2 = c(dwcVar2);
                    if (dwcVar2.T() && c2) {
                        dwd.al(dwcVar2, dwmVar, new dwl());
                    }
                    dwb dwbVar6 = dwcVar2.T;
                    if ((dwbVar5 == dwbVar6 && (dwbVar4 = dwcVar2.V.e) != null && dwbVar4.c) || (dwbVar5 == dwcVar2.V && (dwbVar3 = dwbVar6.e) != null && dwbVar3.c)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dwcVar2.W() == 3 && !c2) {
                        if (dwcVar2.W() == 3 && dwcVar2.G >= 0 && dwcVar2.F >= 0 && ((dwcVar2.ar == 8 || (dwcVar2.C == 0 && dwcVar2.ah == brg.a)) && !dwcVar2.R() && !dwcVar2.Q && z3 && !dwcVar2.R())) {
                            f(i2, dwcVar, dwmVar, dwcVar2, z);
                        }
                    } else if (!dwcVar2.T()) {
                        dwb dwbVar7 = dwcVar2.T;
                        if (dwbVar5 == dwbVar7 && dwcVar2.V.e == null) {
                            int b2 = dwbVar7.b() + a2;
                            dwcVar2.z(b2, dwcVar2.j() + b2);
                            a(i2, dwcVar2, dwmVar, z);
                        } else {
                            dwb dwbVar8 = dwcVar2.V;
                            if (dwbVar5 == dwbVar8 && dwbVar7.e == null) {
                                int b3 = a2 - dwbVar8.b();
                                dwcVar2.z(b3 - dwcVar2.j(), b3);
                                a(i2, dwcVar2, dwmVar, z);
                            } else if (z3 && !dwcVar2.R()) {
                                e(i2, dwmVar, dwcVar2, z);
                            }
                        }
                    }
                }
            }
            if (!(dwcVar instanceof dwg)) {
                HashSet hashSet2 = U2.a;
                if (hashSet2 != null && U2.c) {
                    Iterator it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        int i3 = i + 1;
                        dwb dwbVar9 = (dwb) it2.next();
                        dwc dwcVar3 = dwbVar9.d;
                        boolean c3 = c(dwcVar3);
                        if (dwcVar3.T() && c3) {
                            dwd.al(dwcVar3, dwmVar, new dwl());
                        }
                        dwb dwbVar10 = dwcVar3.T;
                        if ((dwbVar9 == dwbVar10 && (dwbVar2 = dwcVar3.V.e) != null && dwbVar2.c) || (dwbVar9 == dwcVar3.V && (dwbVar = dwbVar10.e) != null && dwbVar.c)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (dwcVar3.W() == 3 && !c3) {
                            if (dwcVar3.W() == 3 && dwcVar3.G >= 0 && dwcVar3.F >= 0 && (dwcVar3.ar == 8 || (dwcVar3.C == 0 && dwcVar3.ah == brg.a))) {
                                if (!dwcVar3.R() && !dwcVar3.Q && z2 && !dwcVar3.R()) {
                                    f(i3, dwcVar, dwmVar, dwcVar3, z);
                                }
                            }
                        } else if (!dwcVar3.T()) {
                            dwb dwbVar11 = dwcVar3.T;
                            if (dwbVar9 == dwbVar11 && dwcVar3.V.e == null) {
                                int b4 = dwbVar11.b() + a3;
                                dwcVar3.z(b4, dwcVar3.j() + b4);
                                a(i3, dwcVar3, dwmVar, z);
                            } else {
                                dwb dwbVar12 = dwcVar3.V;
                                if (dwbVar9 == dwbVar12 && dwbVar11.e == null) {
                                    int b5 = a3 - dwbVar12.b();
                                    dwcVar3.z(b5 - dwcVar3.j(), b5);
                                    a(i3, dwcVar3, dwmVar, z);
                                } else if (z2 && !dwcVar3.R()) {
                                    e(i3, dwmVar, dwcVar3, z);
                                }
                            }
                        }
                    }
                }
                dwcVar.x = true;
            }
        }
    }

    public static void b(int i, dwc dwcVar, dwm dwmVar) {
        boolean z;
        dwb dwbVar;
        dwb dwbVar2;
        boolean z2;
        dwb dwbVar3;
        dwb dwbVar4;
        if (!dwcVar.y) {
            c++;
            if (!(dwcVar instanceof dwd) && dwcVar.T() && c(dwcVar)) {
                dwd.al(dwcVar, dwmVar, new dwl());
            }
            dwb U = dwcVar.U(3);
            dwb U2 = dwcVar.U(5);
            int a2 = U.a();
            int a3 = U2.a();
            HashSet hashSet = U.a;
            if (hashSet != null && U.c) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    int i2 = i + 1;
                    dwb dwbVar5 = (dwb) it.next();
                    dwc dwcVar2 = dwbVar5.d;
                    boolean c2 = c(dwcVar2);
                    if (dwcVar2.T() && c2) {
                        dwd.al(dwcVar2, dwmVar, new dwl());
                    }
                    dwb dwbVar6 = dwcVar2.U;
                    if ((dwbVar5 == dwbVar6 && (dwbVar4 = dwcVar2.W.e) != null && dwbVar4.c) || (dwbVar5 == dwcVar2.W && (dwbVar3 = dwbVar6.e) != null && dwbVar3.c)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (dwcVar2.X() == 3 && !c2) {
                        if (dwcVar2.X() == 3 && dwcVar2.J >= 0 && dwcVar2.I >= 0 && (dwcVar2.ar == 8 || (dwcVar2.D == 0 && dwcVar2.ah == brg.a))) {
                            if (!dwcVar2.S() && !dwcVar2.Q && z2 && !dwcVar2.S()) {
                                h(i2, dwcVar, dwmVar, dwcVar2);
                            }
                        }
                    } else if (!dwcVar2.T()) {
                        dwb dwbVar7 = dwcVar2.U;
                        if (dwbVar5 == dwbVar7 && dwcVar2.W.e == null) {
                            int b2 = dwbVar7.b() + a2;
                            dwcVar2.A(b2, dwcVar2.h() + b2);
                            b(i2, dwcVar2, dwmVar);
                        } else {
                            dwb dwbVar8 = dwcVar2.W;
                            if (dwbVar5 == dwbVar8 && dwbVar7.e == null) {
                                int b3 = a2 - dwbVar8.b();
                                dwcVar2.A(b3 - dwcVar2.h(), b3);
                                b(i2, dwcVar2, dwmVar);
                            } else if (z2 && !dwcVar2.S()) {
                                g(i2, dwmVar, dwcVar2);
                            }
                        }
                    }
                }
            }
            if (!(dwcVar instanceof dwg)) {
                HashSet hashSet2 = U2.a;
                if (hashSet2 != null && U2.c) {
                    Iterator it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        int i3 = i + 1;
                        dwb dwbVar9 = (dwb) it2.next();
                        dwc dwcVar3 = dwbVar9.d;
                        boolean c3 = c(dwcVar3);
                        if (dwcVar3.T() && c3) {
                            dwd.al(dwcVar3, dwmVar, new dwl());
                        }
                        dwb dwbVar10 = dwcVar3.U;
                        if ((dwbVar9 == dwbVar10 && (dwbVar2 = dwcVar3.W.e) != null && dwbVar2.c) || (dwbVar9 == dwcVar3.W && (dwbVar = dwbVar10.e) != null && dwbVar.c)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (dwcVar3.X() == 3 && !c3) {
                            if (dwcVar3.X() == 3 && dwcVar3.J >= 0 && dwcVar3.I >= 0 && (dwcVar3.ar == 8 || (dwcVar3.D == 0 && dwcVar3.ah == brg.a))) {
                                if (!dwcVar3.S() && !dwcVar3.Q && z && !dwcVar3.S()) {
                                    h(i3, dwcVar, dwmVar, dwcVar3);
                                }
                            }
                        } else if (dwcVar3.T()) {
                            continue;
                        } else {
                            dwb dwbVar11 = dwcVar3.U;
                            if (dwbVar9 == dwbVar11 && dwcVar3.W.e == null) {
                                int b4 = dwbVar11.b() + a3;
                                dwcVar3.A(b4, dwcVar3.h() + b4);
                                b(i3, dwcVar3, dwmVar);
                            } else {
                                dwb dwbVar12 = dwcVar3.W;
                                if (dwbVar9 == dwbVar12 && dwbVar11.e == null) {
                                    int b5 = a3 - dwbVar12.b();
                                    dwcVar3.A(b5 - dwcVar3.h(), b5);
                                    b(i3, dwcVar3, dwmVar);
                                } else if (z && !dwcVar3.S()) {
                                    g(i3, dwmVar, dwcVar3);
                                }
                            }
                        }
                    }
                }
                dwb U3 = dwcVar.U(6);
                if (U3.a != null && U3.c) {
                    int a4 = U3.a();
                    Iterator it3 = U3.a.iterator();
                    while (it3.hasNext()) {
                        int i4 = i + 1;
                        dwb dwbVar13 = (dwb) it3.next();
                        dwc dwcVar4 = dwbVar13.d;
                        boolean c4 = c(dwcVar4);
                        if (dwcVar4.T() && c4) {
                            dwd.al(dwcVar4, dwmVar, new dwl());
                        }
                        if (dwcVar4.X() != 3 || c4) {
                            if (!dwcVar4.T() && dwbVar13 == dwcVar4.X) {
                                int b6 = dwbVar13.b() + a4;
                                if (dwcVar4.P) {
                                    int i5 = b6 - dwcVar4.al;
                                    int i6 = dwcVar4.ag + i5;
                                    dwcVar4.ak = i5;
                                    dwcVar4.U.f(i5);
                                    dwcVar4.W.f(i6);
                                    dwcVar4.X.f(b6);
                                    dwcVar4.w = true;
                                }
                                b(i4, dwcVar4, dwmVar);
                            }
                        }
                    }
                }
                dwcVar.y = true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (r8.P(0) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        if (r8.P(1) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007c, code lost:
    
        if (r8.Q(1, r8.h()) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x006c, code lost:
    
        if (r1 != 3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x004c, code lost:
    
        if (r8.Q(0, r8.j()) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x003c, code lost:
    
        if (r0 != 3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(defpackage.dwc r8) {
        /*
            int r0 = r8.W()
            int r1 = r8.X()
            dwc r2 = r8.ae
            if (r2 == 0) goto Lf
            dwd r2 = (defpackage.dwd) r2
            goto L10
        Lf:
            r2 = 0
        L10:
            if (r2 == 0) goto L15
            r2.W()
        L15:
            if (r2 == 0) goto L1a
            r2.X()
        L1a:
            r2 = 2
            r3 = 0
            r4 = 3
            r5 = 0
            r6 = 1
            if (r0 == r6) goto L4e
            boolean r7 = r8.e()
            if (r7 != 0) goto L4e
            if (r0 == r2) goto L4e
            if (r0 != r4) goto L3c
            int r0 = r8.C
            if (r0 != 0) goto L40
            float r0 = r8.ah
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L40
            boolean r0 = r8.P(r5)
            if (r0 != 0) goto L4e
            goto L40
        L3c:
            if (r0 == r4) goto L40
        L3e:
            r0 = r5
            goto L4f
        L40:
            int r0 = r8.C
            if (r0 != r6) goto L3e
            int r0 = r8.j()
            boolean r0 = r8.Q(r5, r0)
            if (r0 == 0) goto L3e
        L4e:
            r0 = r6
        L4f:
            if (r1 == r6) goto L7e
            boolean r7 = r8.f()
            if (r7 != 0) goto L7e
            if (r1 == r2) goto L7e
            if (r1 != r4) goto L6c
            int r1 = r8.D
            if (r1 != 0) goto L70
            float r1 = r8.ah
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L70
            boolean r1 = r8.P(r6)
            if (r1 != 0) goto L7e
            goto L70
        L6c:
            if (r1 == r4) goto L70
        L6e:
            r1 = r5
            goto L7f
        L70:
            int r1 = r8.D
            if (r1 != r6) goto L6e
            int r1 = r8.h()
            boolean r1 = r8.Q(r6, r1)
            if (r1 == 0) goto L6e
        L7e:
            r1 = r6
        L7f:
            float r8 = r8.ah
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 <= 0) goto L8d
            if (r0 != 0) goto L8c
            if (r1 != 0) goto L8c
            r0 = r5
            r1 = r0
            goto L8d
        L8c:
            return r6
        L8d:
            if (r0 == 0) goto L92
            if (r1 == 0) goto L92
            return r6
        L92:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dws.c(dwc):boolean");
    }

    public static void d(dvz dvzVar, dwm dwmVar, int i, boolean z) {
        if (dvzVar.c()) {
            if (i == 0) {
                a(1, dvzVar, dwmVar, z);
            } else {
                b(1, dvzVar, dwmVar);
            }
        }
    }

    private static void e(int i, dwm dwmVar, dwc dwcVar, boolean z) {
        float f;
        float f2 = dwcVar.ao;
        int a2 = dwcVar.T.e.a();
        int a3 = dwcVar.V.e.a();
        int b2 = dwcVar.T.b() + a2;
        int b3 = a3 - dwcVar.V.b();
        if (a2 == a3) {
            b3 = a3;
        }
        if (a2 == a3) {
            b2 = a2;
        }
        if (a2 == a3) {
            f2 = 0.5f;
        }
        int j = dwcVar.j();
        int i2 = (b3 - b2) - j;
        if (b2 > b3) {
            i2 = (b2 - b3) - j;
        }
        if (i2 > 0) {
            f = (f2 * i2) + 0.5f;
        } else {
            f = f2 * i2;
        }
        int i3 = ((int) f) + b2;
        int i4 = i3 + j;
        if (b2 > b3) {
            i4 = i3 - j;
        }
        dwcVar.z(i3, i4);
        a(i + 1, dwcVar, dwmVar, z);
    }

    private static void f(int i, dwc dwcVar, dwm dwmVar, dwc dwcVar2, boolean z) {
        int j;
        float f = dwcVar2.ao;
        int a2 = dwcVar2.T.e.a() + dwcVar2.T.b();
        int a3 = dwcVar2.V.e.a() - dwcVar2.V.b();
        if (a3 >= a2) {
            int j2 = dwcVar2.j();
            int i2 = a3 - a2;
            if (dwcVar2.ar != 8) {
                int i3 = dwcVar2.C;
                if (i3 == 2) {
                    if (dwcVar instanceof dwd) {
                        j = dwcVar.j();
                    } else {
                        j = dwcVar.ae.j();
                    }
                    j2 = (int) (dwcVar2.ao * 0.5f * j);
                } else if (i3 == 0) {
                    j2 = i2;
                }
                j2 = Math.max(dwcVar2.F, j2);
                int i4 = dwcVar2.G;
                if (i4 > 0) {
                    j2 = Math.min(i4, j2);
                }
            }
            int i5 = a2 + ((int) ((f * (i2 - j2)) + 0.5f));
            dwcVar2.z(i5, j2 + i5);
            a(i + 1, dwcVar2, dwmVar, z);
        }
    }

    private static void g(int i, dwm dwmVar, dwc dwcVar) {
        float f;
        float f2 = dwcVar.ap;
        int a2 = dwcVar.U.e.a();
        int a3 = dwcVar.W.e.a();
        int b2 = dwcVar.U.b() + a2;
        int b3 = a3 - dwcVar.W.b();
        if (a2 == a3) {
            b3 = a3;
        }
        if (a2 == a3) {
            b2 = a2;
        }
        if (a2 == a3) {
            f2 = 0.5f;
        }
        int h = dwcVar.h();
        int i2 = (b3 - b2) - h;
        if (b2 > b3) {
            i2 = (b2 - b3) - h;
        }
        if (i2 > 0) {
            f = (f2 * i2) + 0.5f;
        } else {
            f = f2 * i2;
        }
        int i3 = (int) f;
        int i4 = b2 + i3;
        int i5 = i4 + h;
        if (b2 > b3) {
            i4 = b2 - i3;
            i5 = i4 - h;
        }
        dwcVar.A(i4, i5);
        b(i + 1, dwcVar, dwmVar);
    }

    private static void h(int i, dwc dwcVar, dwm dwmVar, dwc dwcVar2) {
        int h;
        float f = dwcVar2.ap;
        int a2 = dwcVar2.U.e.a() + dwcVar2.U.b();
        int a3 = dwcVar2.W.e.a() - dwcVar2.W.b();
        if (a3 >= a2) {
            int h2 = dwcVar2.h();
            int i2 = a3 - a2;
            if (dwcVar2.ar != 8) {
                int i3 = dwcVar2.D;
                if (i3 == 2) {
                    if (dwcVar instanceof dwd) {
                        h = dwcVar.h();
                    } else {
                        h = dwcVar.ae.h();
                    }
                    h2 = (int) (f * 0.5f * h);
                } else if (i3 == 0) {
                    h2 = i2;
                }
                h2 = Math.max(dwcVar2.I, h2);
                int i4 = dwcVar2.J;
                if (i4 > 0) {
                    h2 = Math.min(i4, h2);
                }
            }
            int i5 = a2 + ((int) ((f * (i2 - h2)) + 0.5f));
            dwcVar2.A(i5, h2 + i5);
            b(i + 1, dwcVar2, dwmVar);
        }
    }
}
