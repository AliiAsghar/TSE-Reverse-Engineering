package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ade implements afl {
    public long a = 9205357640488583168L;
    public final byn b;
    public long c;
    private final dqv d;
    private final ael e;
    private boolean f;
    private long g;
    private final cga h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ade$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arps {
        long a;
        /* synthetic */ Object b;
        int d;
        ade e;

        public AnonymousClass1(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return ade.this.d(0L, null, this);
        }
    }

    public ade(Context context, dqv dqvVar, afj afjVar) {
        cga aehVar;
        this.d = dqvVar;
        ael aelVar = new ael(context, ckw.b(afjVar.a));
        this.e = aelVar;
        this.b = new byu(arnb.a, byo.a);
        this.g = 0L;
        this.c = -1L;
        cga a = cru.a(cga.e, arnb.a, new PointerInputEventHandler() { // from class: ade.2

            /* compiled from: PG */
            /* renamed from: ade$2$1, reason: invalid class name */
            /* loaded from: classes.dex */
            static final class AnonymousClass1 extends arpv implements arqv<cqg, arpe<? super arnb>, Object> {
                int a;
                final /* synthetic */ ade b;
                private /* synthetic */ Object c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(ade adeVar, arpe arpeVar) {
                    super(arpeVar);
                    this.b = adeVar;
                }

                @Override // defpackage.arqv
                public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                    return ((AnonymousClass1) c((cqg) obj, (arpe) obj2)).b(arnb.a);
                }

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x0042 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:33:0x0086 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0058  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0040 -> B:5:0x0043). Please report as a decompilation issue!!! */
                @Override // defpackage.arpq
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object b(java.lang.Object r12) {
                    /*
                        r11 = this;
                        arpl r0 = defpackage.arpl.a
                        int r1 = r11.a
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L1a
                        if (r1 == r3) goto L12
                        java.lang.Object r1 = r11.c
                        cqg r1 = (defpackage.cqg) r1
                        defpackage.aqil.P(r12)
                        goto L43
                    L12:
                        java.lang.Object r1 = r11.c
                        cqg r1 = (defpackage.cqg) r1
                        defpackage.aqil.P(r12)
                        goto L2c
                    L1a:
                        defpackage.aqil.P(r12)
                        java.lang.Object r12 = r11.c
                        r1 = r12
                        cqg r1 = (defpackage.cqg) r1
                        r11.c = r1
                        r11.a = r3
                        java.lang.Object r12 = defpackage.aik.j(r1, r11, r2)
                        if (r12 == r0) goto Lae
                    L2c:
                        ade r3 = r11.b
                        crc r12 = (defpackage.crc) r12
                        long r4 = r12.a
                        r3.c = r4
                        long r4 = r12.c
                        r3.a = r4
                    L38:
                        r11.c = r1
                        r11.a = r2
                        java.lang.Object r12 = defpackage.cqf.a(r1, r11)
                        if (r12 != r0) goto L43
                        return r0
                    L43:
                        cqq r12 = (defpackage.cqq) r12
                        java.util.List r12 = r12.a
                        java.util.ArrayList r3 = new java.util.ArrayList
                        int r4 = r12.size()
                        r3.<init>(r4)
                        int r4 = r12.size()
                        r5 = 0
                        r6 = r5
                    L56:
                        if (r6 >= r4) goto L69
                        java.lang.Object r7 = r12.get(r6)
                        r8 = r7
                        crc r8 = (defpackage.crc) r8
                        boolean r8 = r8.d
                        if (r8 == 0) goto L66
                        r3.add(r7)
                    L66:
                        int r6 = r6 + 1
                        goto L56
                    L69:
                        ade r12 = r11.b
                        int r4 = r3.size()
                    L6f:
                        if (r5 >= r4) goto L86
                        java.lang.Object r6 = r3.get(r5)
                        r7 = r6
                        crc r7 = (defpackage.crc) r7
                        long r7 = r7.a
                        long r9 = r12.c
                        boolean r7 = defpackage.a.bB(r7, r9)
                        if (r7 == 0) goto L83
                        goto L87
                    L83:
                        int r5 = r5 + 1
                        goto L6f
                    L86:
                        r6 = 0
                    L87:
                        crc r6 = (defpackage.crc) r6
                        if (r6 != 0) goto L92
                        java.lang.Object r12 = defpackage.aqjn.Z(r3)
                        r6 = r12
                        crc r6 = (defpackage.crc) r6
                    L92:
                        if (r6 == 0) goto L9e
                        ade r12 = r11.b
                        long r4 = r6.a
                        r12.c = r4
                        long r4 = r6.c
                        r12.a = r4
                    L9e:
                        boolean r12 = r3.isEmpty()
                        if (r12 != 0) goto La5
                        goto L38
                    La5:
                        ade r12 = r11.b
                        r0 = -1
                        r12.c = r0
                        arnb r12 = defpackage.arnb.a
                        return r12
                    Lae:
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ade.AnonymousClass2.AnonymousClass1.b(java.lang.Object):java.lang.Object");
                }

                @Override // defpackage.arpq
                public final arpe c(Object obj, arpe arpeVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, arpeVar);
                    anonymousClass1.c = obj;
                    return anonymousClass1;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(crk crkVar, arpe<? super arnb> arpeVar) {
                Object b = ahm.b(crkVar, new AnonymousClass1(ade.this, null), arpeVar);
                if (b == arpl.a) {
                    return b;
                }
                return arnb.a;
            }
        });
        if (Build.VERSION.SDK_INT >= 31) {
            aehVar = new aei(this, aelVar);
        } else {
            aehVar = new aeh(this, aelVar, afjVar);
        }
        this.h = a.a(aehVar);
    }

    private final float h(long j) {
        int i = (int) (j & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat((int) (b() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        float f = 1.0f - intBitsToFloat;
        EdgeEffect a = this.e.a();
        float intBitsToFloat3 = (-aej.c(a, -intBitsToFloat2, f)) * Float.intBitsToFloat((int) (this.g & 4294967295L));
        if (aej.a(a) == brg.a) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i);
    }

    private final float i(long j) {
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (b() & 4294967295L));
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        float f = 1.0f - intBitsToFloat;
        EdgeEffect c = this.e.c();
        float c2 = aej.c(c, intBitsToFloat2, f) * Float.intBitsToFloat((int) (this.g >> 32));
        if (aej.a(c) == brg.a) {
            return c2;
        }
        return Float.intBitsToFloat(i);
    }

    private final float j(long j) {
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (b() & 4294967295L));
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect e = this.e.e();
        float intBitsToFloat3 = (-aej.c(e, -intBitsToFloat2, intBitsToFloat)) * Float.intBitsToFloat((int) (this.g >> 32));
        if (aej.a(e) == brg.a) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i);
    }

    private final float k(long j) {
        int i = (int) (j & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat((int) (b() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect g = this.e.g();
        float c = aej.c(g, intBitsToFloat2, intBitsToFloat) * Float.intBitsToFloat((int) (4294967295L & this.g));
        if (aej.a(g) == brg.a) {
            return c;
        }
        return Float.intBitsToFloat(i);
    }

    private final void l() {
        boolean z;
        ael aelVar = this.e;
        EdgeEffect edgeEffect = aelVar.b;
        boolean z2 = false;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = aelVar.c;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            if (edgeEffect2.isFinished() && !z) {
                z = false;
            } else {
                z = true;
            }
        }
        EdgeEffect edgeEffect3 = aelVar.d;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            if (edgeEffect3.isFinished() && !z) {
                z = false;
            } else {
                z = true;
            }
        }
        EdgeEffect edgeEffect4 = aelVar.e;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (!edgeEffect4.isFinished() || z) {
                z2 = true;
            }
        } else {
            z2 = z;
        }
        if (z2) {
            e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x025a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0249  */
    @Override // defpackage.afl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(long r22, int r24, defpackage.arqr r25) {
        /*
            Method dump skipped, instructions count: 801
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ade.a(long, int, arqr):long");
    }

    public final long b() {
        long j = this.a;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            j = cju.a(this.g);
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    @Override // defpackage.afl
    public final cga c() {
        return this.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        if (r13.a(r14, r0) == r1) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.afl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(long r11, defpackage.arqv r13, defpackage.arpe r14) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ade.d(long, arqv, arpe):java.lang.Object");
    }

    public final void e() {
        this.b.h(arnb.a);
    }

    public final void f(long j) {
        long j2 = this.g;
        boolean bB = a.bB(j2, 0L);
        boolean bB2 = a.bB(j, j2);
        this.g = j;
        if (!bB2) {
            ael aelVar = this.e;
            long g = (arsk.g(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (arsk.g(Float.intBitsToFloat((int) (j >> 32))) << 32);
            aelVar.a = g;
            EdgeEffect edgeEffect = aelVar.b;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (g >> 32), (int) (g & 4294967295L));
            }
            EdgeEffect edgeEffect2 = aelVar.c;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (g >> 32), (int) (g & 4294967295L));
            }
            EdgeEffect edgeEffect3 = aelVar.d;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (g & 4294967295L), (int) (g >> 32));
            }
            EdgeEffect edgeEffect4 = aelVar.e;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (g & 4294967295L), (int) (g >> 32));
            }
            EdgeEffect edgeEffect5 = aelVar.f;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (g >> 32), (int) (g & 4294967295L));
            }
            EdgeEffect edgeEffect6 = aelVar.g;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (g >> 32), (int) (g & 4294967295L));
            }
            EdgeEffect edgeEffect7 = aelVar.h;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (g & 4294967295L), (int) (g >> 32));
            }
            EdgeEffect edgeEffect8 = aelVar.i;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (g & 4294967295L), (int) (g >> 32));
            }
        }
        if (!bB && !bB2) {
            l();
        }
    }

    @Override // defpackage.afl
    public final boolean g() {
        ael aelVar = this.e;
        EdgeEffect edgeEffect = aelVar.b;
        if (edgeEffect != null && aej.a(edgeEffect) != brg.a) {
            return true;
        }
        EdgeEffect edgeEffect2 = aelVar.c;
        if (edgeEffect2 != null && aej.a(edgeEffect2) != brg.a) {
            return true;
        }
        EdgeEffect edgeEffect3 = aelVar.d;
        if (edgeEffect3 != null && aej.a(edgeEffect3) != brg.a) {
            return true;
        }
        EdgeEffect edgeEffect4 = aelVar.e;
        if (edgeEffect4 != null && aej.a(edgeEffect4) != brg.a) {
            return true;
        }
        return false;
    }
}
