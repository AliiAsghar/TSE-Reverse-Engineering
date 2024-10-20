package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajb implements ain {
    public final ajd a;
    public final aag b;
    public final zr c;
    private final cge d = ahy.c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ajb$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arps {
        Object a;
        /* synthetic */ Object b;
        int d;

        public AnonymousClass1(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return ajb.this.c(null, brg.a, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ajb$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arpw implements arqv<arwe, arpe<? super aiv<Float, zv>>, Object> {
        Object a;
        int b;
        final /* synthetic */ float d;
        final /* synthetic */ arqr e;
        final /* synthetic */ ahv f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: ajb$2$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends arrp implements arqr<Float, arnb> {
            final /* synthetic */ arry a;
            final /* synthetic */ arqr b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(arry arryVar, arqr arqrVar) {
                super(1);
                this.a = arryVar;
                this.b = arqrVar;
            }

            @Override // defpackage.arqr
            public final /* bridge */ /* synthetic */ Object a(Object obj) {
                float floatValue = ((Number) obj).floatValue();
                arry arryVar = this.a;
                float f = arryVar.a - floatValue;
                arryVar.a = f;
                this.b.a(Float.valueOf(f));
                return arnb.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: ajb$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00142 extends arrp implements arqr<Float, arnb> {
            final /* synthetic */ arry a;
            final /* synthetic */ arqr b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00142(arry arryVar, arqr arqrVar) {
                super(1);
                this.a = arryVar;
                this.b = arqrVar;
            }

            @Override // defpackage.arqr
            public final /* bridge */ /* synthetic */ Object a(Object obj) {
                float floatValue = ((Number) obj).floatValue();
                arry arryVar = this.a;
                float f = arryVar.a - floatValue;
                arryVar.a = f;
                this.b.a(Float.valueOf(f));
                return arnb.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(float f, arqr arqrVar, ahv ahvVar, arpe arpeVar) {
            super(2, arpeVar);
            this.d = f;
            this.e = arqrVar;
            this.f = ahvVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass2) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.arpq
        public final Object b(Object obj) {
            int i;
            float signum;
            arry arryVar;
            Object d;
            boolean z;
            float f;
            arpl arplVar = arpl.a;
            int i2 = this.b;
            if (i2 != 0) {
                if (i2 != 1) {
                    aqil.P(obj);
                    return obj;
                }
                Object obj2 = this.a;
                aqil.P(obj);
                arryVar = obj2;
                d = obj;
            } else {
                aqil.P(obj);
                ajb ajbVar = ajb.this;
                float f2 = this.d;
                ajd ajdVar = ajbVar.a;
                float a = aai.a(ajbVar.b, f2);
                aiz aizVar = (aiz) ajdVar;
                avc avcVar = aizVar.a;
                int k = avcVar.k() + avcVar.m();
                if (k == 0) {
                    signum = 0.0f;
                } else {
                    if (f2 < brg.a) {
                        i = aizVar.a.d + 1;
                    } else {
                        i = aizVar.a.d;
                    }
                    int u = arrn.u(((int) (a / k)) + i, 0, aizVar.a.b());
                    aizVar.a.k();
                    aizVar.a.m();
                    long j = i;
                    int r = arrn.r(Math.abs((arrn.u(arrn.u(u, (int) arrn.v(j - 1, 0L), (int) arrn.w(1 + j, 2147483647L)), 0, aizVar.a.b()) - i) * k) - k, 0);
                    if (r == 0) {
                        signum = brg.a;
                    } else {
                        signum = r * Math.signum(f2);
                    }
                }
                if (Float.isNaN(signum)) {
                    aju.d("calculateApproachOffset returned NaN. Please use a valid value.");
                }
                arryVar = new arry();
                float abs = Math.abs(signum) * Math.signum(this.d);
                arryVar.a = abs;
                this.e.a(new Float(abs));
                ajb ajbVar2 = ajb.this;
                ahv ahvVar = this.f;
                float f3 = arryVar.a;
                float f4 = this.d;
                C00142 c00142 = new C00142(arryVar, this.e);
                this.a = arryVar;
                this.b = 1;
                d = ajbVar2.d(ahvVar, f3, f4, c00142, this);
                if (d == arplVar) {
                    return arplVar;
                }
            }
            ajb ajbVar3 = ajb.this;
            zt ztVar = (zt) d;
            float floatValue = ((Number) ztVar.b()).floatValue();
            aiz aizVar2 = (aiz) ajbVar3.a;
            aizVar2.a.p().i();
            List g = aizVar2.a().g();
            int size = g.size();
            float f5 = Float.NEGATIVE_INFINITY;
            float f6 = Float.POSITIVE_INFINITY;
            for (int i3 = 0; i3 < size; i3++) {
                aty atyVar = (aty) g.get(i3);
                auk a2 = aizVar2.a();
                a2.f();
                ahp ahpVar = ahp.a;
                a2.e();
                avc avcVar2 = aizVar2.a;
                aizVar2.a().b();
                aizVar2.a().a();
                aizVar2.a().c();
                int b = atyVar.b();
                atyVar.a();
                avcVar2.b();
                float a3 = ajf.a(b);
                if (a3 <= brg.a && a3 > f5) {
                    f5 = a3;
                }
                if (a3 >= brg.a && a3 < f6) {
                    f6 = a3;
                }
            }
            if (f5 == Float.NEGATIVE_INFINITY) {
                f5 = f6;
            }
            if (f6 == Float.POSITIVE_INFINITY) {
                f6 = f5;
            }
            float a4 = aja.a(aizVar2.a);
            if (a4 == brg.a) {
                z = false;
            } else {
                z = true;
            }
            if (!aizVar2.a.h()) {
                if (a4 != brg.a && aja.b(aizVar2.a)) {
                    f5 = brg.a;
                }
                f6 = brg.a;
            }
            if (!aizVar2.a.g()) {
                if (z && !aja.b(aizVar2.a)) {
                    f5 = brg.a;
                    f6 = brg.a;
                } else {
                    f5 = brg.a;
                }
            }
            armo armoVar = new armo(Float.valueOf(f5), Float.valueOf(f6));
            float floatValue2 = ((Number) armoVar.a).floatValue();
            float floatValue3 = ((Number) armoVar.b).floatValue();
            float floatValue4 = ((Number) aizVar2.b.a(Float.valueOf(floatValue), Float.valueOf(floatValue2), Float.valueOf(floatValue3))).floatValue();
            if (floatValue4 != floatValue2 && floatValue4 != floatValue3 && floatValue4 != brg.a) {
                aju.d("Final Snapping Offset Should Be one of " + floatValue2 + ", " + floatValue3 + " or 0.0");
            }
            if (floatValue4 == Float.POSITIVE_INFINITY || floatValue4 == Float.NEGATIVE_INFINITY) {
                f = brg.a;
            } else {
                f = floatValue4;
            }
            if (Float.isNaN(f)) {
                aju.d("calculateSnapOffset returned NaN. Please use a valid value.");
            }
            arry arryVar2 = arryVar;
            arryVar2.a = f;
            ahv ahvVar2 = this.f;
            zt c = zu.c(ztVar, brg.a, brg.a, 30);
            ajb ajbVar4 = ajb.this;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(arryVar2, this.e);
            this.a = null;
            this.b = 2;
            Object c2 = ajc.c(ahvVar2, f, f, c, ajbVar4.c, anonymousClass1, this);
            if (c2 == arplVar) {
                return arplVar;
            }
            return c2;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass2(this.d, this.e, this.f, arpeVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ajb$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arps {
        /* synthetic */ Object a;
        int c;

        public AnonymousClass3(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return ajb.this.b(null, brg.a, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ajb$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arps {
        /* synthetic */ Object a;
        int c;

        public AnonymousClass4(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return ajb.this.d(null, brg.a, brg.a, null, this);
        }
    }

    public ajb(ajd ajdVar, aag aagVar, zr zrVar) {
        this.a = ajdVar;
        this.b = aagVar;
        this.c = zrVar;
    }

    @Override // defpackage.ahl
    public final /* synthetic */ Object a(ahv ahvVar, float f, arpe arpeVar) {
        return b(ahvVar, f, aio.a, arpeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ain
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.ahv r5, float r6, defpackage.arqr r7, defpackage.arpe r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.ajb.AnonymousClass3
            if (r0 == 0) goto L13
            r0 = r8
            ajb$3 r0 = (defpackage.ajb.AnonymousClass3) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajb$3 r0 = new ajb$3
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r8)
            goto L3a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.aqil.P(r8)
            r0.c = r3
            java.lang.Object r8 = r4.c(r5, r6, r7, r0)
            if (r8 == r1) goto L5c
        L3a:
            aiv r8 = (defpackage.aiv) r8
            java.lang.Object r5 = r8.a
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            zt r6 = r8.b
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L4c
            goto L56
        L4c:
            java.lang.Object r5 = r6.b()
            java.lang.Number r5 = (java.lang.Number) r5
            float r7 = r5.floatValue()
        L56:
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r7)
            return r5
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajb.b(ahv, float, arqr, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.ahv r11, float r12, defpackage.arqr r13, defpackage.arpe r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.ajb.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r14
            ajb$1 r0 = (defpackage.ajb.AnonymousClass1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ajb$1 r0 = new ajb$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r13 = r0.a
            defpackage.aqil.P(r14)
            goto L4c
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            defpackage.aqil.P(r14)
            cge r14 = r10.d
            ajb$2 r2 = new ajb$2
            r9 = 0
            r4 = r2
            r5 = r10
            r6 = r12
            r7 = r13
            r8 = r11
            r4.<init>(r6, r7, r8, r9)
            r0.a = r13
            r0.d = r3
            java.lang.Object r14 = defpackage.arro.q(r14, r2, r0)
            if (r14 != r1) goto L4c
            return r1
        L4c:
            aiv r14 = (defpackage.aiv) r14
            java.lang.Float r11 = new java.lang.Float
            r12 = 0
            r11.<init>(r12)
            r13.a(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajb.c(ahv, float, arqr, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.ahv r8, float r9, float r10, defpackage.arqr r11, defpackage.arpe r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.ajb.AnonymousClass4
            if (r0 == 0) goto L13
            r0 = r12
            ajb$4 r0 = (defpackage.ajb.AnonymousClass4) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajb$4 r0 = new ajb$4
            r0.<init>(r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.a
            arpl r0 = defpackage.arpl.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            defpackage.aqil.P(r12)
            goto L7a
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            defpackage.aqil.P(r12)
            float r12 = java.lang.Math.abs(r9)
            r1 = 0
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 != 0) goto L3d
            goto L80
        L3d:
            float r12 = java.lang.Math.abs(r10)
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 == 0) goto L80
            r6.c = r2
            aag r12 = r7.b
            float r12 = defpackage.aai.a(r12, r10)
            float r12 = java.lang.Math.abs(r12)
            float r1 = java.lang.Math.abs(r9)
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 < 0) goto L61
            aag r12 = r7.b
            aix r1 = new aix
            r1.<init>(r12)
            goto L68
        L61:
            zr r12 = r7.c
            ajg r1 = new ajg
            r1.<init>(r12)
        L68:
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r9)
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r10)
            r2 = r8
            r5 = r11
            java.lang.Object r12 = r1.a(r2, r3, r4, r5, r6)
            if (r12 == r0) goto L7f
        L7a:
            aiv r12 = (defpackage.aiv) r12
            zt r8 = r12.b
            goto L86
        L7f:
            return r0
        L80:
            r8 = 28
            zt r8 = defpackage.zu.b(r9, r10, r8)
        L86:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajb.d(ahv, float, float, arqr, arpe):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ajb) {
            ajb ajbVar = (ajb) obj;
            if (d.F(ajbVar.c, this.c) && d.F(ajbVar.b, this.b) && d.F(ajbVar.a, this.a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + this.b.hashCode()) * 31) + this.a.hashCode();
    }
}
