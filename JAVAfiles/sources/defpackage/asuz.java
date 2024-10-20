package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asuz extends asva {
    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public asuz(defpackage.asuw r7, defpackage.asuy r8, defpackage.asuy r9) {
        /*
            r6 = this;
            int r0 = r7.h
            if (r0 == 0) goto L3d
            r1 = 5
            if (r0 == r1) goto L3d
            java.math.BigInteger r1 = defpackage.asuu.b
            asuy r1 = r7.c(r1)
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L38
            r4 = 2
            if (r0 == r4) goto L38
            r5 = 3
            if (r0 == r5) goto L2f
            r5 = 4
            if (r0 == r5) goto L26
            r4 = 6
            if (r0 != r4) goto L1e
            goto L38
        L1e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "unknown coordinate system"
            r7.<init>(r8)
            throw r7
        L26:
            asuy[] r0 = new defpackage.asuy[r4]
            r0[r2] = r1
            asuy r1 = r7.d
            r0[r3] = r1
            goto L3f
        L2f:
            asuy[] r0 = new defpackage.asuy[r5]
            r0[r2] = r1
            r0[r3] = r1
            r0[r4] = r1
            goto L3f
        L38:
            asuy[] r0 = new defpackage.asuy[r3]
            r0[r2] = r1
            goto L3f
        L3d:
            asuy[] r0 = defpackage.asva.a
        L3f:
            r6.<init>(r7, r8, r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asuz.<init>(asuw, asuy, asuy):void");
    }

    @Override // defpackage.asva
    public final boolean a() {
        asuy h;
        asuy k;
        asuw asuwVar = this.b;
        asuy asuyVar = asuwVar.d;
        asuy asuyVar2 = asuwVar.e;
        int i = asuwVar.h;
        asuy asuyVar3 = this.c;
        if (i == 6) {
            asuy asuyVar4 = this.e[0];
            boolean m = asuyVar4.m();
            if (asuyVar3.n()) {
                asuy j = this.d.j();
                if (!m) {
                    asuyVar2 = asuyVar2.g(asuyVar4.j());
                }
                return j.equals(asuyVar2);
            }
            asuy asuyVar5 = this.d;
            asuy j2 = asuyVar3.j();
            if (m) {
                h = asuyVar5.j().c(asuyVar5).c(asuyVar);
                k = j2.j().c(asuyVar2);
            } else {
                asuy j3 = asuyVar4.j();
                asuy j4 = j3.j();
                h = asuyVar5.c(asuyVar4).h(asuyVar5, asuyVar, j3);
                k = j2.k(asuyVar2, j4);
            }
            return h.g(j2).equals(k);
        }
        asuy asuyVar6 = this.d;
        asuy g = asuyVar6.c(asuyVar3).g(asuyVar6);
        if (i != 0) {
            if (i == 1) {
                asuy asuyVar7 = this.e[0];
                if (!asuyVar7.m()) {
                    asuy g2 = asuyVar7.g(asuyVar7.j());
                    g = g.g(asuyVar7);
                    asuyVar = asuyVar.g(asuyVar7);
                    asuyVar2 = asuyVar2.g(g2);
                }
            } else {
                throw new IllegalStateException("unsupported coordinate system");
            }
        }
        return g.equals(asuyVar3.c(asuyVar).g(asuyVar3.j()).c(asuyVar2));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
    @Override // defpackage.asva
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b() {
        /*
            Method dump skipped, instructions count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asuz.b():boolean");
    }

    @Override // defpackage.asva
    public final asuy c() {
        int f = f();
        if (f != 5 && f != 6) {
            return this.d;
        }
        asuy asuyVar = this.c;
        asuy asuyVar2 = this.d;
        if (!m() && !asuyVar.n()) {
            asuy g = asuyVar2.c(asuyVar).g(asuyVar);
            if (f == 6) {
                asuy asuyVar3 = this.e[0];
                if (!asuyVar3.m()) {
                    return g.e(asuyVar3);
                }
            }
            return g;
        }
        return asuyVar2;
    }

    @Override // defpackage.asva
    public final asva d(asva asvaVar) {
        asuy g;
        asuy g2;
        asuy asuyVar;
        asuy asuyVar2;
        asuy asuyVar3;
        asuy asuyVar4;
        asuy asuyVar5;
        asuy asuyVar6;
        asuy asuyVar7;
        if (m()) {
            return asvaVar;
        }
        if (!asvaVar.m()) {
            asuw asuwVar = this.b;
            asuy asuyVar8 = this.c;
            int i = asuwVar.h;
            asuy asuyVar9 = asvaVar.c;
            if (i != 0) {
                if (i != 1) {
                    if (i == 6) {
                        if (asuyVar8.n()) {
                            if (!asuyVar9.n()) {
                                return asvaVar.d(this);
                            }
                        } else {
                            asuy asuyVar10 = this.d;
                            asuy asuyVar11 = this.e[0];
                            asuy asuyVar12 = asvaVar.d;
                            asuy asuyVar13 = asvaVar.e[0];
                            boolean m = asuyVar11.m();
                            if (!m) {
                                asuyVar = asuyVar9.g(asuyVar11);
                                asuyVar2 = asuyVar12.g(asuyVar11);
                            } else {
                                asuyVar = asuyVar9;
                                asuyVar2 = asuyVar12;
                            }
                            boolean m2 = asuyVar13.m();
                            if (!m2) {
                                asuyVar8 = asuyVar8.g(asuyVar13);
                                asuyVar3 = asuyVar10.g(asuyVar13);
                            } else {
                                asuyVar3 = asuyVar10;
                            }
                            asuy c = asuyVar3.c(asuyVar2);
                            asuy c2 = asuyVar8.c(asuyVar);
                            if (c2.n()) {
                                if (c.n()) {
                                    return e();
                                }
                            } else {
                                if (asuyVar9.n()) {
                                    asva i2 = i();
                                    asuy asuyVar14 = i2.c;
                                    asuy c3 = i2.c();
                                    asuy e = c3.c(asuyVar12).e(asuyVar14);
                                    asuyVar5 = e.j().c(e).c(asuyVar14).c(asuwVar.d);
                                    if (asuyVar5.n()) {
                                        return new asuz(asuwVar, asuyVar5, asuwVar.e.i());
                                    }
                                    asuyVar7 = e.g(asuyVar14.c(asuyVar5)).c(asuyVar5).c(c3).e(asuyVar5).c(asuyVar5);
                                    asuyVar6 = asuwVar.c(asuu.b);
                                } else {
                                    asuy j = c2.j();
                                    asuy g3 = c.g(asuyVar8);
                                    asuy g4 = c.g(asuyVar);
                                    asuy g5 = g3.g(g4);
                                    if (g5.n()) {
                                        return new asuz(asuwVar, g5, asuwVar.e.i());
                                    }
                                    asuy g6 = c.g(j);
                                    if (!m2) {
                                        asuyVar4 = g6.g(asuyVar13);
                                    } else {
                                        asuyVar4 = g6;
                                    }
                                    asuy k = g4.c(j).k(asuyVar4, asuyVar10.c(asuyVar11));
                                    if (!m) {
                                        asuyVar4 = asuyVar4.g(asuyVar11);
                                    }
                                    asuyVar5 = g5;
                                    asuyVar6 = asuyVar4;
                                    asuyVar7 = k;
                                }
                                return new asuz(asuwVar, asuyVar5, asuyVar7, new asuy[]{asuyVar6});
                            }
                        }
                    } else {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                } else {
                    asuy asuyVar15 = this.d;
                    asuy asuyVar16 = this.e[0];
                    asuy asuyVar17 = asvaVar.d;
                    asuy asuyVar18 = asvaVar.e[0];
                    boolean m3 = asuyVar18.m();
                    asuy g7 = asuyVar16.g(asuyVar17);
                    if (m3) {
                        g = asuyVar15;
                    } else {
                        g = asuyVar15.g(asuyVar18);
                    }
                    asuy c4 = g7.c(g);
                    asuy g8 = asuyVar16.g(asuyVar9);
                    if (m3) {
                        g2 = asuyVar8;
                    } else {
                        g2 = asuyVar8.g(asuyVar18);
                    }
                    asuy c5 = g8.c(g2);
                    if (c5.n()) {
                        if (c4.n()) {
                            return e();
                        }
                    } else {
                        asuy j2 = c5.j();
                        asuy g9 = j2.g(c5);
                        if (!m3) {
                            asuyVar16 = asuyVar16.g(asuyVar18);
                        }
                        asuy c6 = c4.c(c5);
                        asuy c7 = c6.h(c4, j2, asuwVar.d).g(asuyVar16).c(g9);
                        asuy g10 = c5.g(c7);
                        if (!m3) {
                            j2 = j2.g(asuyVar18);
                        }
                        return new asuz(asuwVar, g10, c4.h(asuyVar8, c5, asuyVar15).h(j2, c6, c7), new asuy[]{g9.g(asuyVar16)});
                    }
                }
            } else {
                asuy asuyVar19 = this.d;
                asuy asuyVar20 = asvaVar.d;
                asuy c8 = asuyVar8.c(asuyVar9);
                asuy c9 = asuyVar19.c(asuyVar20);
                if (c8.n()) {
                    if (c9.n()) {
                        return e();
                    }
                } else {
                    asuy e2 = c9.e(c8);
                    asuy c10 = e2.j().c(e2).c(c8).c(asuwVar.d);
                    return new asuz(asuwVar, c10, e2.g(asuyVar8.c(c10)).c(c10).c(asuyVar19));
                }
            }
            return ((asuv) asuwVar).b;
        }
        return this;
    }

    @Override // defpackage.asva
    public final asva e() {
        asuy g;
        asuy g2;
        asuy j;
        asuy g3;
        asuy g4;
        asuy c;
        asuy k;
        if (m()) {
            return this;
        }
        asuw asuwVar = this.b;
        asuy asuyVar = this.c;
        if (!asuyVar.n()) {
            int i = asuwVar.h;
            if (i != 0) {
                if (i != 1) {
                    if (i == 6) {
                        asuy asuyVar2 = this.d;
                        asuy asuyVar3 = this.e[0];
                        boolean m = asuyVar3.m();
                        if (m) {
                            g2 = asuyVar2;
                        } else {
                            g2 = asuyVar2.g(asuyVar3);
                        }
                        if (m) {
                            j = asuyVar3;
                        } else {
                            j = asuyVar3.j();
                        }
                        asuy asuyVar4 = asuwVar.d;
                        if (m) {
                            g3 = asuyVar4;
                        } else {
                            g3 = asuyVar4.g(j);
                        }
                        asuy c2 = asuyVar2.j().c(g2).c(g3);
                        if (c2.n()) {
                            return new asuz(asuwVar, c2, asuwVar.e.i());
                        }
                        asuy j2 = c2.j();
                        if (m) {
                            g4 = c2;
                        } else {
                            g4 = c2.g(j);
                        }
                        asuy asuyVar5 = asuwVar.e;
                        if (((asux) asuyVar5).f.a() < (((asuv) asuwVar).a >> 1)) {
                            asuy j3 = asuyVar2.c(asuyVar).j();
                            if (asuyVar5.m()) {
                                k = g3.c(j).j();
                            } else {
                                k = g3.k(asuyVar5, j.j());
                            }
                            c = j3.c(c2).c(j).g(j3).c(k).c(j2);
                            if (asuyVar4.n()) {
                                c = c.c(g4);
                            } else if (!asuyVar4.m()) {
                                c = c.c(asuyVar4.d().g(g4));
                            }
                        } else {
                            if (!m) {
                                asuyVar = asuyVar.g(asuyVar3);
                            }
                            c = asuyVar.k(c2, g2).c(j2).c(g4);
                        }
                        return new asuz(asuwVar, j2, c, new asuy[]{g4});
                    }
                    throw new IllegalStateException("unsupported coordinate system");
                }
                asuy asuyVar6 = this.d;
                asuy asuyVar7 = this.e[0];
                boolean m2 = asuyVar7.m();
                if (m2) {
                    g = asuyVar;
                } else {
                    g = asuyVar.g(asuyVar7);
                }
                if (!m2) {
                    asuyVar6 = asuyVar6.g(asuyVar7);
                }
                asuy j4 = asuyVar.j();
                asuy c3 = j4.c(asuyVar6);
                asuy j5 = g.j();
                asuy c4 = c3.c(g);
                asuy h = c4.h(c3, j5, asuwVar.d);
                return new asuz(asuwVar, g.g(h), j4.j().h(g, h, c4), new asuy[]{g.g(j5)});
            }
            asuy c5 = this.d.e(asuyVar).c(asuyVar);
            asuy c6 = c5.j().c(c5).c(asuwVar.d);
            return new asuz(asuwVar, c6, asuyVar.k(c6, c5.d()));
        }
        return ((asuv) asuwVar).b;
    }

    protected asuz(asuw asuwVar, asuy asuyVar, asuy asuyVar2, asuy[] asuyVarArr) {
        super(asuwVar, asuyVar, asuyVar2, asuyVarArr);
    }
}
