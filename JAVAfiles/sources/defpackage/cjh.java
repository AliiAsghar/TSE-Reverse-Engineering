package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;
import defpackage.cga;
import defpackage.css;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjh {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cjh$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqr<css.a, Boolean> {
        final /* synthetic */ FocusTargetNode a;
        final /* synthetic */ cjp b;
        final /* synthetic */ int c;
        final /* synthetic */ arqr d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FocusTargetNode focusTargetNode, cjp cjpVar, int i, arqr arqrVar) {
            super(1);
            this.a = focusTargetNode;
            this.b = cjpVar;
            this.c = i;
            this.d = arqrVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            css.a aVar = (css.a) obj;
            boolean d = cjh.d(this.a, this.b, this.c, this.d);
            Boolean valueOf = Boolean.valueOf(d);
            valueOf.getClass();
            if (!d && aVar.a()) {
                return null;
            }
            return valueOf;
        }
    }

    public static final Boolean a(FocusTargetNode focusTargetNode, int i, cjp cjpVar, arqr arqrVar) {
        Object valueOf;
        ciz e = focusTargetNode.e();
        ciz cizVar = ciz.a;
        int ordinal = e.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (((cir) focusTargetNode.d()).a) {
                            valueOf = arqrVar.a(focusTargetNode);
                        } else if (cjpVar == null) {
                            valueOf = Boolean.valueOf(b(focusTargetNode, i, arqrVar));
                        } else {
                            valueOf = Boolean.valueOf(d(focusTargetNode, cjpVar, i, arqrVar));
                        }
                        return (Boolean) valueOf;
                    }
                    throw new armm();
                }
            } else {
                FocusTargetNode b = cje.b(focusTargetNode);
                if (b != null) {
                    int ordinal2 = b.e().ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    throw new armm();
                                }
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                        } else {
                            Boolean a = a(b, i, cjpVar, arqrVar);
                            if (!d.F(a, false)) {
                                return a;
                            }
                            if (cjpVar == null) {
                                if (b.e() == ciz.b) {
                                    FocusTargetNode a2 = cje.a(b);
                                    if (a2 != null) {
                                        cjpVar = cje.c(a2);
                                    } else {
                                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                                    }
                                } else {
                                    throw new IllegalStateException("Searching for active node in inactive hierarchy");
                                }
                            }
                            return Boolean.valueOf(j(focusTargetNode, cjpVar, i, arqrVar));
                        }
                    }
                    if (cjpVar == null) {
                        cjpVar = cje.c(b);
                    }
                    return Boolean.valueOf(j(focusTargetNode, cjpVar, i, arqrVar));
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
        }
        return Boolean.valueOf(b(focusTargetNode, i, arqrVar));
    }

    public static final boolean b(FocusTargetNode focusTargetNode, int i, arqr arqrVar) {
        cjp cjpVar;
        Object obj;
        cbh cbhVar = new cbh(new FocusTargetNode[16]);
        g(focusTargetNode, cbhVar);
        int i2 = cbhVar.b;
        if (i2 <= 1) {
            if (i2 == 0) {
                obj = null;
            } else {
                obj = cbhVar.a[0];
            }
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) obj;
            if (focusTargetNode2 != null) {
                return ((Boolean) arqrVar.a(focusTargetNode2)).booleanValue();
            }
        } else {
            if (true == a.bA(i, 7)) {
                i = 4;
            }
            if (!a.bA(i, 4) && !a.bA(i, 6)) {
                if (a.bA(i, 3) || a.bA(i, 5)) {
                    cjp c = cje.c(focusTargetNode);
                    float f = c.d;
                    float f2 = c.e;
                    cjpVar = new cjp(f, f2, f, f2);
                } else {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
            } else {
                cjp c2 = cje.c(focusTargetNode);
                float f3 = c2.b;
                float f4 = c2.c;
                cjpVar = new cjp(f3, f4, f3, f4);
            }
            FocusTargetNode f5 = f(cbhVar, cjpVar, i);
            if (f5 != null) {
                return ((Boolean) arqrVar.a(f5)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean c(cjp cjpVar, cjp cjpVar2, cjp cjpVar3, int i) {
        if (!k(cjpVar, i, cjpVar3)) {
            return false;
        }
        if (!k(cjpVar2, i, cjpVar3) || h(cjpVar3, cjpVar, cjpVar2, i)) {
            return true;
        }
        if (h(cjpVar3, cjpVar2, cjpVar, i) || e(i, cjpVar3, cjpVar) >= e(i, cjpVar3, cjpVar2)) {
            return false;
        }
        return true;
    }

    public static final boolean d(FocusTargetNode focusTargetNode, cjp cjpVar, int i, arqr arqrVar) {
        FocusTargetNode f;
        cbh cbhVar = new cbh(new FocusTargetNode[16]);
        cga.c cVar = focusTargetNode.p;
        if (cVar.z) {
            cbh cbhVar2 = new cbh(new cga.c[16]);
            cga.c cVar2 = cVar.t;
            if (cVar2 == null) {
                cwp.j(cbhVar2, cVar);
            } else {
                cbhVar2.n(cVar2);
            }
            while (true) {
                int i2 = cbhVar2.b;
                if (i2 == 0) {
                    break;
                }
                cga.c cVar3 = (cga.c) cbhVar2.c(i2 - 1);
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
                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar3;
                                    if (focusTargetNode2.z) {
                                        cbhVar.n(focusTargetNode2);
                                    }
                                } else if ((cVar3.q & 1024) != 0 && (cVar3 instanceof cwr)) {
                                    int i3 = 0;
                                    for (cga.c cVar4 = ((cwr) cVar3).B; cVar4 != null; cVar4 = cVar4.t) {
                                        if ((cVar4.q & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
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
                                    if (i3 != 1) {
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
            while (cbhVar.b != 0 && (f = f(cbhVar, cjpVar, i)) != null) {
                if (((cir) f.d()).a) {
                    return ((Boolean) arqrVar.a(f)).booleanValue();
                }
                if (j(f, cjpVar, i, arqrVar)) {
                    return true;
                }
                cbhVar.m(f);
            }
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node");
    }

    private static final long e(int i, cjp cjpVar, cjp cjpVar2) {
        float f;
        float f2;
        float f3;
        long aG = d.aG(cjpVar2, i, cjpVar);
        if (!a.bA(i, 3) && !a.bA(i, 4)) {
            if (a.bA(i, 5) || a.bA(i, 6)) {
                float f4 = cjpVar.b;
                f = f4 + ((cjpVar.d - f4) / 2.0f);
                f2 = cjpVar2.b;
                f3 = cjpVar2.d;
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
        } else {
            float f5 = cjpVar.c;
            f = f5 + ((cjpVar.e - f5) / 2.0f);
            f2 = cjpVar2.c;
            f3 = cjpVar2.e;
        }
        float f6 = f - (f2 + ((f3 - f2) / 2.0f));
        long j = 13 * aG * aG;
        long j2 = f6;
        return j + (j2 * j2);
    }

    private static final FocusTargetNode f(cbh cbhVar, cjp cjpVar, int i) {
        cjp e;
        if (a.bA(i, 3)) {
            e = cjpVar.e((cjpVar.d - cjpVar.b) + 1.0f, brg.a);
        } else if (a.bA(i, 4)) {
            e = cjpVar.e(-((cjpVar.d - cjpVar.b) + 1.0f), brg.a);
        } else if (a.bA(i, 5)) {
            e = cjpVar.e(brg.a, (cjpVar.e - cjpVar.c) + 1.0f);
        } else if (a.bA(i, 6)) {
            e = cjpVar.e(brg.a, -((cjpVar.e - cjpVar.c) + 1.0f));
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        int i2 = cbhVar.b;
        FocusTargetNode focusTargetNode = null;
        if (i2 > 0) {
            Object[] objArr = cbhVar.a;
            int i3 = 0;
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i3];
                if (cje.d(focusTargetNode2)) {
                    cjp c = cje.c(focusTargetNode2);
                    if (c(c, e, cjpVar, i)) {
                        focusTargetNode = focusTargetNode2;
                        e = c;
                    }
                }
                i3++;
            } while (i3 < i2);
        }
        return focusTargetNode;
    }

    private static final void g(cwo cwoVar, cbh cbhVar) {
        cga.c cVar = ((cga.c) cwoVar).p;
        if (cVar.z) {
            cbh cbhVar2 = new cbh(new cga.c[16]);
            cga.c cVar2 = cVar.t;
            if (cVar2 == null) {
                cwp.j(cbhVar2, cVar);
            } else {
                cbhVar2.n(cVar2);
            }
            while (true) {
                int i = cbhVar2.b;
                if (i != 0) {
                    cga.c cVar3 = (cga.c) cbhVar2.c(i - 1);
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
                                        FocusTargetNode focusTargetNode = (FocusTargetNode) cVar3;
                                        if (focusTargetNode.z && !cwp.e(focusTargetNode).C) {
                                            if (((cir) focusTargetNode.d()).a) {
                                                cbhVar.n(focusTargetNode);
                                            } else {
                                                g(focusTargetNode, cbhVar);
                                            }
                                        }
                                    } else if ((cVar3.q & 1024) != 0 && (cVar3 instanceof cwr)) {
                                        int i2 = 0;
                                        for (cga.c cVar4 = ((cwr) cVar3).B; cVar4 != null; cVar4 = cVar4.t) {
                                            if ((cVar4.q & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
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
                                        if (i2 != 1) {
                                        }
                                    }
                                    cVar3 = cwp.a(cbhVar3);
                                }
                            } else {
                                cVar3 = cVar3.t;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        if (defpackage.a.bA(r12, 3) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        if (defpackage.a.bA(r12, 4) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        r10 = defpackage.d.aG(r10, r12, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        if (defpackage.a.bA(r12, 3) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        r9 = r9.b;
        r11 = r11.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        r9 = r9 - r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
    
        if (r9 >= 1.0f) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009b, code lost:
    
        r9 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r10 < r9) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a1, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (defpackage.a.bA(r12, 4) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        r11 = r11.d;
        r9 = r9.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        r9 = r11 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (defpackage.a.bA(r12, 5) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        r9 = r9.c;
        r11 = r11.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
    
        if (defpackage.a.bA(r12, 6) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0090, code lost:
    
        r11 = r11.e;
        r9 = r9.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a7, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0034, code lost:
    
        if (r9.d > r11.b) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0043, code lost:
    
        if (r9.c < r11.e) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0052, code lost:
    
        if (r9.e > r11.c) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r9.b >= r11.d) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean h(defpackage.cjp r9, defpackage.cjp r10, defpackage.cjp r11, int r12) {
        /*
            boolean r0 = i(r11, r12, r9)
            r1 = 0
            if (r0 != 0) goto Lae
            boolean r0 = i(r10, r12, r9)
            if (r0 != 0) goto Lf
            goto Lae
        Lf:
            r0 = 3
            boolean r2 = defpackage.a.bA(r12, r0)
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            r4 = 6
            r5 = 5
            r6 = 4
            r7 = 1
            if (r2 == 0) goto L28
            float r2 = r9.b
            float r8 = r11.d
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 < 0) goto L25
            goto L55
        L25:
            r1 = r7
            goto Lae
        L28:
            boolean r2 = defpackage.a.bA(r12, r6)
            if (r2 == 0) goto L37
            float r2 = r9.d
            float r8 = r11.b
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 <= 0) goto L55
            goto L25
        L37:
            boolean r2 = defpackage.a.bA(r12, r5)
            if (r2 == 0) goto L46
            float r2 = r9.c
            float r8 = r11.e
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 >= 0) goto L55
            goto L25
        L46:
            boolean r2 = defpackage.a.bA(r12, r4)
            if (r2 == 0) goto La8
            float r2 = r9.e
            float r8 = r11.c
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 <= 0) goto L55
            goto L25
        L55:
            boolean r2 = defpackage.a.bA(r12, r0)
            if (r2 != 0) goto L25
            boolean r2 = defpackage.a.bA(r12, r6)
            if (r2 == 0) goto L62
            goto L25
        L62:
            float r10 = defpackage.d.aG(r10, r12, r9)
            boolean r0 = defpackage.a.bA(r12, r0)
            if (r0 == 0) goto L72
            float r9 = r9.b
            float r11 = r11.b
        L70:
            float r9 = r9 - r11
            goto L95
        L72:
            boolean r0 = defpackage.a.bA(r12, r6)
            if (r0 == 0) goto L7f
            float r11 = r11.d
            float r9 = r9.d
        L7c:
            float r9 = r11 - r9
            goto L95
        L7f:
            boolean r0 = defpackage.a.bA(r12, r5)
            if (r0 == 0) goto L8a
            float r9 = r9.c
            float r11 = r11.c
            goto L70
        L8a:
            boolean r12 = defpackage.a.bA(r12, r4)
            if (r12 == 0) goto La2
            float r11 = r11.e
            float r9 = r9.e
            goto L7c
        L95:
            r11 = 1065353216(0x3f800000, float:1.0)
            int r12 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r12 >= 0) goto L9c
            r9 = r11
        L9c:
            int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r9 < 0) goto La1
            goto Lae
        La1:
            return r7
        La2:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        La8:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjh.h(cjp, cjp, cjp, int):boolean");
    }

    private static final boolean i(cjp cjpVar, int i, cjp cjpVar2) {
        if (!a.bA(i, 3) && !a.bA(i, 4)) {
            if (a.bA(i, 5) || a.bA(i, 6)) {
                if (cjpVar.d > cjpVar2.b && cjpVar.b < cjpVar2.d) {
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        if (cjpVar.e > cjpVar2.c && cjpVar.c < cjpVar2.e) {
            return true;
        }
        return false;
    }

    private static final boolean j(FocusTargetNode focusTargetNode, cjp cjpVar, int i, arqr arqrVar) {
        if (d(focusTargetNode, cjpVar, i, arqrVar)) {
            return true;
        }
        Boolean bool = (Boolean) chx.a(focusTargetNode, i, new AnonymousClass1(focusTargetNode, cjpVar, i, arqrVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean k(cjp cjpVar, int i, cjp cjpVar2) {
        if (a.bA(i, 3)) {
            float f = cjpVar2.d;
            float f2 = cjpVar.d;
            if ((f > f2 || cjpVar2.b >= f2) && cjpVar2.b > cjpVar.b) {
                return true;
            }
            return false;
        }
        if (a.bA(i, 4)) {
            float f3 = cjpVar2.b;
            float f4 = cjpVar.b;
            if ((f3 < f4 || cjpVar2.d <= f4) && cjpVar2.d < cjpVar.d) {
                return true;
            }
            return false;
        }
        if (a.bA(i, 5)) {
            float f5 = cjpVar2.e;
            float f6 = cjpVar.e;
            if ((f5 > f6 || cjpVar2.c >= f6) && cjpVar2.c > cjpVar.c) {
                return true;
            }
            return false;
        }
        if (a.bA(i, 6)) {
            float f7 = cjpVar2.c;
            float f8 = cjpVar.c;
            if ((f7 < f8 || cjpVar2.e <= f8) && cjpVar2.e < cjpVar.e) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }
}
