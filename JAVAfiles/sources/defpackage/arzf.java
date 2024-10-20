package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class arzf implements arzj {
    public static final /* synthetic */ int e = 0;
    public final arvd a;
    public final arvd b;
    public final arve c;
    public final arve d;
    private final int g;
    private final arvd h;
    private final arvd i;
    private final arve j;
    private final arve k;
    private final arve l;

    public arzf(int i) {
        this.g = i;
        if (i >= 0) {
            long j = 0;
            this.a = new arvd(0L, arvf.a);
            this.b = new arvd(0L, arvf.a);
            arzo arzoVar = arzh.a;
            if (i != 0) {
                if (i != Integer.MAX_VALUE) {
                    j = i;
                } else {
                    j = Long.MAX_VALUE;
                }
            }
            this.h = new arvd(j, arvf.a);
            this.i = new arvd(F(), arvf.a);
            arzo arzoVar2 = new arzo(0L, null, this, 3);
            this.c = new arve(arzoVar2, arvf.a);
            this.d = new arve(arzoVar2, arvf.a);
            if (Q()) {
                arzoVar2 = arzh.a;
                arzoVar2.getClass();
            }
            arvf arvfVar = arvf.a;
            this.j = new arve(arzoVar2, arvfVar);
            this.k = new arve(arzh.s, arvfVar);
            this.l = new arve(null, arvfVar);
            return;
        }
        throw new IllegalArgumentException(a.cb(i, "Invalid channel capacity: ", ", should be >=0"));
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0000 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int E(defpackage.arzo r6, int r7, java.lang.Object r8, long r9, java.lang.Object r11, boolean r12) {
        /*
            r5 = this;
        L0:
            java.lang.Object r0 = r6.d(r7)
            r1 = 4
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L35
            boolean r0 = r5.N(r9)
            r4 = 0
            if (r0 == 0) goto L1b
            if (r12 != 0) goto L29
            asfn r0 = defpackage.arzh.d
            boolean r0 = r6.k(r7, r4, r0)
            if (r0 == 0) goto L0
            return r3
        L1b:
            if (r12 != 0) goto L29
            if (r11 != 0) goto L21
            r6 = 3
            return r6
        L21:
            boolean r0 = r6.k(r7, r4, r11)
            if (r0 == 0) goto L0
            r6 = 2
            return r6
        L29:
            asfn r0 = defpackage.arzh.j
            boolean r0 = r6.k(r7, r4, r0)
            if (r0 == 0) goto L0
            r6.h(r7, r2)
            return r1
        L35:
            asfn r4 = defpackage.arzh.e
            if (r0 != r4) goto L42
            asfn r1 = defpackage.arzh.d
            boolean r0 = r6.k(r7, r0, r1)
            if (r0 == 0) goto L0
            return r3
        L42:
            asfn r9 = defpackage.arzh.k
            r10 = 5
            if (r0 == r9) goto L83
            asfn r9 = defpackage.arzh.h
            if (r0 == r9) goto L7f
            asfn r9 = defpackage.arzh.l
            if (r0 != r9) goto L56
            r6.g(r7)
            r5.f()
            return r1
        L56:
            boolean r9 = defpackage.arwh.a
            r6.g(r7)
            boolean r9 = r0 instanceof defpackage.arzy
            if (r9 == 0) goto L63
            arzy r0 = (defpackage.arzy) r0
            arys r0 = r0.a
        L63:
            boolean r8 = r5.R(r0, r8)
            if (r8 == 0) goto L6f
            asfn r8 = defpackage.arzh.i
            r6.j(r7, r8)
            goto L7a
        L6f:
            asfn r8 = defpackage.arzh.k
            java.lang.Object r8 = r6.b(r7, r8)
            asfn r9 = defpackage.arzh.k
            if (r8 != r9) goto L7b
            r2 = r10
        L7a:
            return r2
        L7b:
            r6.h(r7, r3)
            return r10
        L7f:
            r6.g(r7)
            return r10
        L83:
            r6.g(r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arzf.E(arzo, int, java.lang.Object, long, java.lang.Object, boolean):int");
    }

    private final long F() {
        return this.h.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x00e6, code lost:
    
        r1 = (defpackage.arzo) r1.o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x007d, code lost:
    
        r1 = (defpackage.arzo) r1.o();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.arzo G(long r13) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arzf.G(long):arzo");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x000d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void H() {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arzf.H():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(long j) {
        if ((this.i.a(j) & 4611686018427387904L) == 0) {
            return;
        }
        do {
        } while ((this.i.b & 4611686018427387904L) != 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void J(long r5, defpackage.arzo r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.b
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            aseo r0 = r7.n()
            arzo r0 = (defpackage.arzo) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.u()
            if (r5 == 0) goto L22
            aseo r5 = r7.n()
            arzo r5 = (defpackage.arzo) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            arve r5 = r4.j
        L24:
            java.lang.Object r6 = r5.a
            aseo r6 = (defpackage.aseo) r6
            long r0 = r6.b
            long r2 = r7.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L31
            goto L46
        L31:
            boolean r0 = r7.v()
            if (r0 == 0) goto L11
            boolean r0 = r5.d(r6, r7)
            if (r0 == 0) goto L47
            boolean r5 = r6.t()
            if (r5 == 0) goto L46
            r6.q()
        L46:
            return
        L47:
            boolean r6 = r7.t()
            if (r6 == 0) goto L24
            r7.q()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arzf.J(long, arzo):void");
    }

    private final void K(arys arysVar) {
        M(arysVar, true);
    }

    private final void L(arys arysVar) {
        M(arysVar, false);
    }

    private final void M(arys arysVar, boolean z) {
        Throwable q;
        if (!(arysVar instanceof arza)) {
            if (arysVar instanceof arvo) {
                arpe arpeVar = (arpe) arysVar;
                if (z) {
                    q = p();
                } else {
                    q = q();
                }
                arpeVar.w(aqil.O(q));
                return;
            }
            if (arysVar instanceof arzv) {
                ((arzv) arysVar).a.w(new arzn(new arzl(o())));
                return;
            }
            if (arysVar instanceof aryz) {
                aryz aryzVar = (aryz) arysVar;
                arvp arvpVar = aryzVar.b;
                arvpVar.getClass();
                aryzVar.b = null;
                aryzVar.a = arzh.l;
                Throwable o = aryzVar.c.o();
                if (o == null) {
                    arvpVar.w(false);
                    return;
                }
                if (arwh.b) {
                    o = asfm.a(o, arvpVar);
                }
                arvpVar.w(aqil.O(o));
                return;
            }
            if (arysVar instanceof asgj) {
                ((asgj) arysVar).g(this, arzh.l);
                return;
            } else {
                Objects.toString(arysVar);
                throw new IllegalStateException("Unexpected waiter: ".concat(String.valueOf(arysVar)));
            }
        }
        throw null;
    }

    private final boolean N(long j) {
        if (j >= F() && j >= g() + this.g) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0108, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x009d, code lost:
    
        r9 = (defpackage.arzo) r9.o();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean O(long r9, boolean r11) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arzf.O(long, boolean):boolean");
    }

    private final boolean P(long j) {
        return O(j, true);
    }

    private final boolean Q() {
        long F = F();
        if (F != 0 && F != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    private final boolean R(Object obj, Object obj2) {
        if (obj instanceof asgj) {
            return ((asgj) obj).g(this, obj2);
        }
        if (obj instanceof arzv) {
            obj.getClass();
            return arzh.c(((arzv) obj).a, new arzn(obj2));
        }
        if (obj instanceof aryz) {
            obj.getClass();
            aryz aryzVar = (aryz) obj;
            arvp arvpVar = aryzVar.b;
            arvpVar.getClass();
            aryzVar.b = null;
            aryzVar.a = obj2;
            return arzh.c(arvpVar, true);
        }
        if (obj instanceof arvo) {
            obj.getClass();
            return arzh.c((arvo) obj, obj2);
        }
        Objects.toString(obj);
        throw new IllegalStateException("Unexpected receiver type: ".concat(String.valueOf(obj)));
    }

    private final boolean S(Object obj, arzo arzoVar, int i) {
        char c;
        if (obj instanceof arvo) {
            obj.getClass();
            return arzh.c((arvo) obj, arnb.a);
        }
        if (obj instanceof asgj) {
            obj.getClass();
            int a = ((asgj) obj).a(this, arnb.a);
            if (a != 0) {
                if (a != 1) {
                    if (a != 2) {
                        c = 4;
                    } else {
                        c = 3;
                    }
                } else {
                    c = 2;
                }
            } else {
                c = 1;
            }
            if (c == 2) {
                arzoVar.g(i);
            } else if (c == 1) {
                return true;
            }
            return false;
        }
        if (obj instanceof arza) {
            throw null;
        }
        Objects.toString(obj);
        throw new IllegalStateException("Unexpected waiter: ".concat(String.valueOf(obj)));
    }

    private static final void T(arys arysVar, arzo arzoVar, int i) {
        arysVar.F(arzoVar, i + arzh.b);
    }

    private final Object U(arpe arpeVar) {
        arvp arvpVar = new arvp(arhi.i(arpeVar), 1);
        arvpVar.A();
        Throwable q = q();
        if (arwh.b) {
            q = asfm.a(q, arvpVar);
        }
        arvpVar.w(aqil.O(q));
        Object l = arvpVar.l();
        arpl arplVar = arpl.a;
        if (l == arplVar) {
            arpeVar.getClass();
        }
        if (l == arplVar) {
            return l;
        }
        return arnb.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void V(arvo arvoVar) {
        Throwable q = q();
        if (arwh.b) {
            q = asfm.a(q, arvoVar);
        }
        arvoVar.w(aqil.O(q));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object k(defpackage.arzf r13, defpackage.arpe r14) {
        /*
            boolean r0 = r14 instanceof defpackage.arzd
            if (r0 == 0) goto L13
            r0 = r14
            arzd r0 = (defpackage.arzd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            arzd r0 = new arzd
            r0.<init>(r13, r14)
        L18:
            r6 = r0
            java.lang.Object r14 = r6.a
            arpl r0 = defpackage.arpl.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            defpackage.aqil.P(r14)
            arzn r14 = (defpackage.arzn) r14
            java.lang.Object r13 = r14.b
            goto L9d
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            defpackage.aqil.P(r14)
            arve r14 = r13.d
            java.lang.Object r14 = r14.a
            arzo r14 = (defpackage.arzo) r14
        L3e:
            boolean r1 = r13.y()
            if (r1 == 0) goto L4f
            java.lang.Throwable r13 = r13.o()
            arzl r14 = new arzl
            r14.<init>(r13)
            r13 = r14
            goto L9d
        L4f:
            arvd r1 = r13.b
            long r4 = r1.b()
            int r1 = defpackage.arzh.b
            long r7 = (long) r1
            long r7 = r4 / r7
            int r1 = defpackage.arzh.b
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.b
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L6d
            arzo r1 = r13.r(r7, r14)
            if (r1 == 0) goto L3e
            r14 = r1
        L6d:
            r12 = 0
            r7 = r13
            r8 = r14
            r9 = r3
            r10 = r4
            java.lang.Object r1 = r7.n(r8, r9, r10, r12)
            asfn r7 = defpackage.arzh.m
            if (r1 == r7) goto L9e
            asfn r7 = defpackage.arzh.o
            if (r1 != r7) goto L8a
            long r7 = r13.h()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L3e
            r14.p()
            goto L3e
        L8a:
            asfn r7 = defpackage.arzh.n
            if (r1 != r7) goto L99
            r6.c = r2
            r1 = r13
            r2 = r14
            java.lang.Object r13 = r1.l(r2, r3, r4, r6)
            if (r13 != r0) goto L9d
            return r0
        L99:
            r14.p()
            r13 = r1
        L9d:
            return r13
        L9e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arzf.k(arzf, arpe):java.lang.Object");
    }

    protected boolean A() {
        return false;
    }

    @Override // defpackage.arzw
    public final aryz B() {
        return new aryz(this);
    }

    @Override // defpackage.arzw
    public final asqe D() {
        arzb arzbVar = arzb.a;
        arsd.g(arzbVar, 3);
        arzc arzcVar = arzc.a;
        arsd.g(arzcVar, 3);
        return new asqe((Object) this, (arqw) arzbVar, (arqw) arzcVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x019f, code lost:
    
        if (r0 == defpackage.arpl.a) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x003a, code lost:
    
        if (r0 == defpackage.arpl.a) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        if (r0 == defpackage.arpl.a) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01ac, code lost:
    
        return defpackage.arnb.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d5, code lost:
    
        r7 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d7, code lost:
    
        V(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00da, code lost:
    
        r1 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0186, code lost:
    
        if (r0 != r2) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00dd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e6, code lost:
    
        r1 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x018e, code lost:
    
        r1.C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0191, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0115, code lost:
    
        if (r19 >= g()) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0117, code lost:
    
        r17.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x011a, code lost:
    
        r1 = r18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0185  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [arvp] */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r21v0, types: [arzf] */
    @Override // defpackage.arzx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.Object r22, defpackage.arpe r23) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arzf.a(java.lang.Object, arpe):java.lang.Object");
    }

    public final int b(arzo arzoVar, int i, Object obj, long j, Object obj2, boolean z) {
        arzoVar.i(i, obj);
        if (z) {
            return E(arzoVar, i, obj, j, obj2, true);
        }
        Object d = arzoVar.d(i);
        if (d == null) {
            if (N(j)) {
                if (arzoVar.k(i, null, arzh.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (arzoVar.k(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (d instanceof arys) {
            arzoVar.g(i);
            if (R(d, obj)) {
                arzoVar.j(i, arzh.i);
                return 0;
            }
            if (arzoVar.b(i, arzh.k) == arzh.k) {
                return 5;
            }
            arzoVar.h(i, true);
            return 5;
        }
        return E(arzoVar, i, obj, j, obj2, false);
    }

    @Override // defpackage.arzx
    public Object c(Object obj) {
        arzo arzoVar;
        long j = this.a.b;
        if (!z(j) && !N(j & 1152921504606846975L)) {
            return arzn.a;
        }
        arve arveVar = this.c;
        asfn asfnVar = arzh.j;
        arzo arzoVar2 = (arzo) arveVar.a;
        while (true) {
            long b = this.a.b();
            long j2 = b & 1152921504606846975L;
            boolean z = z(b);
            long j3 = arzh.b;
            long j4 = j2 / j3;
            int i = (int) (j2 % j3);
            if (arzoVar2.b != j4) {
                arzo s = s(j4, arzoVar2);
                if (s == null) {
                    if (z) {
                        return new arzl(q());
                    }
                } else {
                    arzoVar = s;
                }
            } else {
                arzoVar = arzoVar2;
            }
            int b2 = b(arzoVar, i, obj, j2, asfnVar, z);
            if (b2 != 0) {
                if (b2 != 1) {
                    if (b2 != 2) {
                        if (b2 != 3) {
                            if (b2 != 4) {
                                arzoVar.p();
                                arzoVar2 = arzoVar;
                            } else {
                                if (j2 < g()) {
                                    arzoVar.p();
                                }
                                return new arzl(q());
                            }
                        } else {
                            throw new IllegalStateException("unexpected");
                        }
                    } else {
                        if (z) {
                            arzoVar.s();
                            return new arzl(q());
                        }
                        arzoVar.s();
                        return arzn.a;
                    }
                } else {
                    return arnb.a;
                }
            } else {
                arzoVar.p();
                return arnb.a;
            }
        }
    }

    @Override // defpackage.arzx
    public final void d(arqr arqrVar) {
        if (this.l.d(null, arqrVar)) {
            return;
        }
        arve arveVar = this.l;
        do {
            Object obj = arveVar.a;
            if (obj != arzh.q) {
                if (obj == arzh.r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                Objects.toString(obj);
                throw new IllegalStateException("Another handler is already registered: ".concat(String.valueOf(obj)));
            }
        } while (!this.l.d(arzh.q, arzh.r));
        arqrVar.a(o());
    }

    @Override // defpackage.arzx
    public final boolean e(Throwable th) {
        return x(th, false);
    }

    @Override // defpackage.arzx
    public final boolean f() {
        return z(this.a.b);
    }

    public final long g() {
        return this.b.b;
    }

    public final long h() {
        return this.a.b & 1152921504606846975L;
    }

    @Override // defpackage.arzw
    public final Object i(arpe arpeVar) {
        arzo arzoVar = (arzo) this.d.a;
        while (!y()) {
            long b = this.b.b();
            long j = b / arzh.b;
            int i = (int) (b % arzh.b);
            if (arzoVar.b != j) {
                arzo r = r(j, arzoVar);
                if (r != null) {
                    arzoVar = r;
                } else {
                    continue;
                }
            }
            Object n = n(arzoVar, i, b, null);
            if (n != arzh.m) {
                if (n == arzh.o) {
                    if (b < h()) {
                        arzoVar.p();
                    }
                } else {
                    if (n == arzh.n) {
                        arvp E = arrn.E(arhi.i(arpeVar));
                        try {
                            Object n2 = n(arzoVar, i, b, E);
                            if (n2 == arzh.m) {
                                u(E, arzoVar, i);
                            } else {
                                if (n2 == arzh.o) {
                                    if (b < h()) {
                                        arzoVar.p();
                                    }
                                    arzo arzoVar2 = (arzo) this.d.a;
                                    while (true) {
                                        if (y()) {
                                            E.w(aqil.O(p()));
                                            break;
                                        }
                                        long b2 = this.b.b();
                                        long j2 = arzh.b;
                                        long j3 = b2 / j2;
                                        int i2 = (int) (b2 % j2);
                                        if (arzoVar2.b != j3) {
                                            arzo r2 = r(j3, arzoVar2);
                                            if (r2 != null) {
                                                arzoVar2 = r2;
                                            } else {
                                                continue;
                                            }
                                        }
                                        n2 = n(arzoVar2, i2, b2, E);
                                        if (n2 == arzh.m) {
                                            u(E, arzoVar2, i2);
                                            break;
                                        }
                                        if (n2 == arzh.o) {
                                            if (b2 < h()) {
                                                arzoVar2.p();
                                            }
                                        } else if (n2 != arzh.n) {
                                            arzoVar2.p();
                                        } else {
                                            throw new IllegalStateException("unexpected");
                                        }
                                    }
                                } else {
                                    arzoVar.p();
                                }
                                E.f(n2, null);
                            }
                            n = E.l();
                            if (n == arpl.a) {
                                arpeVar.getClass();
                                return n;
                            }
                        } catch (Throwable th) {
                            E.C();
                            throw th;
                        }
                    } else {
                        arzoVar.p();
                    }
                    return n;
                }
            } else {
                throw new IllegalStateException("unexpected");
            }
        }
        throw asfm.b(p());
    }

    @Override // defpackage.arzw
    public final Object j(arpe arpeVar) {
        return k(this, arpeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(defpackage.arzo r10, int r11, long r12, defpackage.arpe r14) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arzf.l(arzo, int, long, arpe):java.lang.Object");
    }

    @Override // defpackage.arzw
    public final Object m() {
        long j = this.b.b;
        long j2 = this.a.b;
        if (P(j2)) {
            return new arzl(o());
        }
        if (j >= (j2 & 1152921504606846975L)) {
            return arzn.a;
        }
        arve arveVar = this.d;
        asfn asfnVar = arzh.k;
        arzo arzoVar = (arzo) arveVar.a;
        while (!y()) {
            long b = this.b.b();
            long j3 = arzh.b;
            long j4 = b / j3;
            int i = (int) (b % j3);
            if (arzoVar.b != j4) {
                arzo r = r(j4, arzoVar);
                if (r != null) {
                    arzoVar = r;
                } else {
                    continue;
                }
            }
            Object n = n(arzoVar, i, b, asfnVar);
            if (n == arzh.m) {
                w(b);
                arzoVar.s();
                return arzn.a;
            }
            if (n == arzh.o) {
                if (b < h()) {
                    arzoVar.p();
                }
            } else {
                if (n != arzh.n) {
                    arzoVar.p();
                    return n;
                }
                throw new IllegalStateException("unexpected");
            }
        }
        return new arzl(o());
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
    
        return defpackage.arzh.o;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(defpackage.arzo r6, int r7, long r8, java.lang.Object r10) {
        /*
            r5 = this;
            java.lang.Object r0 = r6.d(r7)
            r1 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r0 != 0) goto L27
            arvd r0 = r5.a
            long r3 = r0.b
            long r3 = r3 & r1
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L15
            goto L3b
        L15:
            if (r10 != 0) goto L1a
            asfn r6 = defpackage.arzh.n
            return r6
        L1a:
            r0 = 0
            boolean r0 = r6.k(r7, r0, r10)
            if (r0 == 0) goto L3b
            r5.H()
            asfn r6 = defpackage.arzh.m
            return r6
        L27:
            asfn r3 = defpackage.arzh.d
            if (r0 != r3) goto L3b
            asfn r3 = defpackage.arzh.i
            boolean r0 = r6.k(r7, r0, r3)
            if (r0 == 0) goto L3b
            r5.H()
            java.lang.Object r6 = r6.e(r7)
            return r6
        L3b:
            java.lang.Object r0 = r6.d(r7)
            if (r0 == 0) goto Laa
            asfn r3 = defpackage.arzh.e
            if (r0 != r3) goto L46
            goto Laa
        L46:
            asfn r3 = defpackage.arzh.d
            if (r0 != r3) goto L5b
            asfn r3 = defpackage.arzh.i
            boolean r0 = r6.k(r7, r0, r3)
            if (r0 == 0) goto L3b
            r5.H()
            java.lang.Object r6 = r6.e(r7)
            goto Ld1
        L5b:
            asfn r3 = defpackage.arzh.j
            if (r0 != r3) goto L63
        L5f:
            asfn r6 = defpackage.arzh.o
            goto Ld1
        L63:
            asfn r3 = defpackage.arzh.h
            if (r0 != r3) goto L68
            goto L5f
        L68:
            asfn r3 = defpackage.arzh.l
            if (r0 != r3) goto L72
            r5.H()
            asfn r6 = defpackage.arzh.o
            goto Ld1
        L72:
            asfn r3 = defpackage.arzh.g
            if (r0 == r3) goto L3b
            asfn r3 = defpackage.arzh.f
            boolean r3 = r6.k(r7, r0, r3)
            if (r3 == 0) goto L3b
            boolean r8 = r0 instanceof defpackage.arzy
            if (r8 == 0) goto L86
            arzy r0 = (defpackage.arzy) r0
            arys r0 = r0.a
        L86:
            boolean r9 = r5.S(r0, r6, r7)
            if (r9 == 0) goto L99
            asfn r8 = defpackage.arzh.i
            r6.j(r7, r8)
            r5.H()
            java.lang.Object r6 = r6.e(r7)
            goto Ld1
        L99:
            asfn r9 = defpackage.arzh.j
            r6.j(r7, r9)
            r9 = 0
            r6.h(r7, r9)
            if (r8 == 0) goto La7
            r5.H()
        La7:
            asfn r6 = defpackage.arzh.o
            goto Ld1
        Laa:
            arvd r3 = r5.a
            long r3 = r3.b
            long r3 = r3 & r1
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto Lc1
            asfn r3 = defpackage.arzh.h
            boolean r0 = r6.k(r7, r0, r3)
            if (r0 == 0) goto L3b
            r5.H()
            asfn r6 = defpackage.arzh.o
            goto Ld1
        Lc1:
            if (r10 != 0) goto Lc6
            asfn r6 = defpackage.arzh.n
            goto Ld1
        Lc6:
            boolean r0 = r6.k(r7, r0, r10)
            if (r0 == 0) goto L3b
            r5.H()
            asfn r6 = defpackage.arzh.m
        Ld1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arzf.n(arzo, int, long, java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Throwable o() {
        return (Throwable) this.k.a;
    }

    public final Throwable p() {
        Throwable o = o();
        if (o == null) {
            return new arzq();
        }
        return o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Throwable q() {
        Throwable o = o();
        if (o == null) {
            return new arzr();
        }
        return o;
    }

    public final arzo r(long j, arzo arzoVar) {
        Object a;
        long j2;
        long j3;
        arzg arzgVar = arzg.a;
        loop0: while (true) {
            a = asen.a(arzoVar, j, arzgVar);
            if (!asfl.a(a)) {
                aseo b = asfl.b(a);
                while (true) {
                    arve arveVar = this.d;
                    aseo aseoVar = (aseo) arveVar.a;
                    if (aseoVar.b >= b.b) {
                        break loop0;
                    }
                    if (b.v()) {
                        if (arveVar.d(aseoVar, b)) {
                            if (aseoVar.t()) {
                                aseoVar.q();
                            }
                        } else if (b.t()) {
                            b.q();
                        }
                    }
                }
            } else {
                break;
            }
        }
        if (asfl.a(a)) {
            f();
            if (arzoVar.b * arzh.b >= h()) {
                return null;
            }
            arzoVar.p();
            return null;
        }
        arzo arzoVar2 = (arzo) asfl.b(a);
        if (!Q() && j <= F() / arzh.b) {
            arve arveVar2 = this.j;
            while (true) {
                aseo aseoVar2 = (aseo) arveVar2.a;
                if (aseoVar2.b >= arzoVar2.b || !arzoVar2.v()) {
                    break;
                }
                if (arveVar2.d(aseoVar2, arzoVar2)) {
                    if (aseoVar2.t()) {
                        aseoVar2.q();
                    }
                } else if (arzoVar2.t()) {
                    arzoVar2.q();
                }
            }
        }
        long j4 = arzoVar2.b;
        if (j4 > j) {
            long j5 = arzh.b;
            arvd arvdVar = this.b;
            do {
                j2 = j4 * j5;
                j3 = arvdVar.b;
                if (j3 >= j2) {
                    break;
                }
            } while (!this.b.c(j3, j2));
            if (arzoVar2.b * arzh.b >= h()) {
                return null;
            }
            arzoVar2.p();
            return null;
        }
        boolean z = arwh.a;
        return arzoVar2;
    }

    public final arzo s(long j, arzo arzoVar) {
        Object a;
        long j2;
        long j3;
        arzg arzgVar = arzg.a;
        loop0: while (true) {
            a = asen.a(arzoVar, j, arzgVar);
            if (!asfl.a(a)) {
                aseo b = asfl.b(a);
                while (true) {
                    arve arveVar = this.c;
                    aseo aseoVar = (aseo) arveVar.a;
                    if (aseoVar.b >= b.b) {
                        break loop0;
                    }
                    if (b.v()) {
                        if (arveVar.d(aseoVar, b)) {
                            if (aseoVar.t()) {
                                aseoVar.q();
                            }
                        } else if (b.t()) {
                            b.q();
                        }
                    }
                }
            } else {
                break;
            }
        }
        if (asfl.a(a)) {
            f();
            if (arzoVar.b * arzh.b >= g()) {
                return null;
            }
            arzoVar.p();
            return null;
        }
        arzo arzoVar2 = (arzo) asfl.b(a);
        long j4 = arzoVar2.b;
        if (j4 > j) {
            long j5 = arzh.b;
            arvd arvdVar = this.a;
            do {
                long j6 = j4 * j5;
                j2 = arvdVar.b;
                j3 = 1152921504606846975L & j2;
                if (j3 >= j6) {
                    break;
                }
            } while (!this.a.c(j2, arzh.b(j3, (int) (j2 >> 60))));
            if (arzoVar2.b * arzh.b >= g()) {
                return null;
            }
            arzoVar2.p();
            return null;
        }
        boolean z = arwh.a;
        return arzoVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t(long j) {
        boolean z = arwh.a;
        arzo arzoVar = (arzo) this.d.a;
        while (true) {
            arvd arvdVar = this.b;
            int i = this.g;
            long j2 = arvdVar.b;
            if (j < Math.max(i + j2, F())) {
                return;
            }
            if (this.b.c(j2, 1 + j2)) {
                long j3 = j2 / arzh.b;
                int i2 = (int) (j2 % arzh.b);
                if (arzoVar.b != j3) {
                    arzo r = r(j3, arzoVar);
                    if (r != null) {
                        arzoVar = r;
                    }
                }
                if (n(arzoVar, i2, j2, null) == arzh.o) {
                    if (j2 < h()) {
                        arzoVar.p();
                    }
                } else {
                    arzoVar.p();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x019a, code lost:
    
        r4 = (defpackage.arzo) r4.n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01a1, code lost:
    
        if (r4 != null) goto L93;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arzf.toString():java.lang.String");
    }

    public final void u(arys arysVar, arzo arzoVar, int i) {
        arysVar.F(arzoVar, i);
    }

    @Override // defpackage.arzw
    public final void v(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        x(cancellationException, true);
    }

    public final void w(long j) {
        long j2;
        long j3;
        if (Q()) {
            return;
        }
        do {
        } while (F() <= j);
        int i = arzh.c;
        for (int i2 = 0; i2 < i; i2++) {
            long F = F();
            if (F == (4611686018427387903L & this.i.b) && F == F()) {
                return;
            }
        }
        arvd arvdVar = this.i;
        do {
            j2 = arvdVar.b;
        } while (!arvdVar.c(j2, arzh.a(j2 & 4611686018427387903L, true)));
        while (true) {
            long F2 = F();
            long j4 = this.i.b;
            long j5 = j4 & 4611686018427387903L;
            long j6 = 4611686018427387904L & j4;
            if (F2 == j5 && F2 == F()) {
                break;
            } else if (j6 == 0) {
                this.i.c(j4, arzh.a(j5, true));
            }
        }
        arvd arvdVar2 = this.i;
        do {
            j3 = arvdVar2.b;
        } while (!arvdVar2.c(j3, arzh.a(j3 & 4611686018427387903L, false)));
    }

    protected final boolean x(Throwable th, boolean z) {
        long j;
        long b;
        Object obj;
        asfn asfnVar;
        long j2;
        long j3;
        if (z) {
            arvd arvdVar = this.a;
            do {
                j3 = arvdVar.b;
                if (((int) (j3 >> 60)) != 0) {
                    break;
                }
            } while (!arvdVar.c(j3, arzh.b(j3 & 1152921504606846975L, 1)));
        }
        boolean d = this.k.d(arzh.s, th);
        if (z) {
            arvd arvdVar2 = this.a;
            do {
                j2 = arvdVar2.b;
            } while (!arvdVar2.c(j2, arzh.b(j2 & 1152921504606846975L, 3)));
        } else {
            arvd arvdVar3 = this.a;
            do {
                j = arvdVar3.b;
                int i = (int) (j >> 60);
                if (i != 0) {
                    if (i != 1) {
                        break;
                    }
                    b = arzh.b(j & 1152921504606846975L, 3);
                } else {
                    b = arzh.b(j & 1152921504606846975L, 2);
                }
            } while (!arvdVar3.c(j, b));
        }
        f();
        if (d) {
            arve arveVar = this.l;
            do {
                obj = arveVar.a;
                if (obj == null) {
                    asfnVar = arzh.q;
                } else {
                    asfnVar = arzh.r;
                }
            } while (!arveVar.d(obj, asfnVar));
            if (obj != null) {
                arsd.g(obj, 1);
                ((arqr) obj).a(o());
                return true;
            }
        }
        return d;
    }

    public final boolean y() {
        return P(this.a.b);
    }

    public final boolean z(long j) {
        return O(j, false);
    }
}
