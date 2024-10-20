package defpackage;

import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.ajt;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ada extends cwr implements czi, cpv, czk, czp {
    public static final a a = new a();
    public ajr b;
    public boolean c;
    public arqg d;
    public crw e;
    public ajt.b f;
    public ajn g;
    private afa i;
    private String j;
    private dgv k;
    private final aen l;
    private cwo m;
    private ajr o;
    public final uf h = new uf((byte[]) null);
    private long n = 0;
    private boolean C = z();
    private final Object D = a;

    /* compiled from: PG */
    /* renamed from: ada$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<Boolean> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            ada.this.d.a();
            return true;
        }
    }

    /* compiled from: PG */
    /* renamed from: ada$2, reason: invalid class name */
    /* loaded from: classes.dex */
    /* synthetic */ class AnonymousClass2 extends arrm implements arqr<Boolean, arnb> {
        public AnonymousClass2(Object obj) {
            super(1, obj, ada.class, "onFocusChange", "onFocusChange(Z)V", 0);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            int i;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ada adaVar = (ada) this.e;
            if (booleanValue) {
                adaVar.h();
            } else {
                if (adaVar.b != null) {
                    uf ufVar = adaVar.h;
                    Object[] objArr = ufVar.c;
                    long[] jArr = ufVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = i2 - length;
                                int i4 = 0;
                                while (true) {
                                    i = 8 - ((~i3) >>> 31);
                                    if (i4 >= i) {
                                        break;
                                    }
                                    if ((255 & j) < 128) {
                                        arrn.J(adaVar.B(), null, null, new add(adaVar, (ajt.b) objArr[(i2 << 3) + i4], null), 3);
                                    }
                                    j >>= 8;
                                    i4++;
                                }
                                if (i != 8) {
                                    break;
                                }
                            }
                            if (i2 == length) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
                adaVar.h.e();
                adaVar.i();
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: ada$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        boolean a;
        int b;
        final /* synthetic */ ahq c;
        final /* synthetic */ long d;
        final /* synthetic */ ajr e;
        final /* synthetic */ ada f;
        private /* synthetic */ Object g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: ada$3$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
            Object a;
            int b;
            final /* synthetic */ ada c;
            final /* synthetic */ long d;
            final /* synthetic */ ajr e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ada adaVar, long j, ajr ajrVar, arpe arpeVar) {
                super(2, arpeVar);
                this.c = adaVar;
                this.d = j;
                this.e = ajrVar;
            }

            @Override // defpackage.arqv
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                return ((AnonymousClass1) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
            
                if (defpackage.arwi.m(r3, r5) != r0) goto L19;
             */
            @Override // defpackage.arpq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object b(java.lang.Object r6) {
                /*
                    r5 = this;
                    arpl r0 = defpackage.arpl.a
                    int r1 = r5.b
                    r2 = 1
                    if (r1 == 0) goto L13
                    if (r1 == r2) goto Lf
                    java.lang.Object r0 = r5.a
                    defpackage.aqil.P(r6)
                    goto L67
                Lf:
                    defpackage.aqil.P(r6)
                    goto L51
                L13:
                    defpackage.aqil.P(r6)
                    ada r6 = r5.c
                    arrx r1 = new arrx
                    r1.<init>()
                    ahw$a r3 = defpackage.ahw.a
                    ady r4 = new ady
                    r4.<init>(r1)
                    defpackage.czq.d(r6, r3, r4)
                    boolean r1 = r1.a
                    if (r1 != 0) goto L47
                    android.view.View r6 = defpackage.cwq.a(r6)
                    android.view.ViewParent r6 = r6.getParent()
                L33:
                    if (r6 == 0) goto L51
                    boolean r1 = r6 instanceof android.view.ViewGroup
                    if (r1 == 0) goto L51
                    android.view.ViewGroup r6 = (android.view.ViewGroup) r6
                    boolean r1 = r6.shouldDelayChildPressedState()
                    if (r1 == 0) goto L42
                    goto L47
                L42:
                    android.view.ViewParent r6 = r6.getParent()
                    goto L33
                L47:
                    long r3 = defpackage.aec.a
                    r5.b = r2
                    java.lang.Object r6 = defpackage.arwi.m(r3, r5)
                    if (r6 == r0) goto L70
                L51:
                    long r1 = r5.d
                    ajt$b r6 = new ajt$b
                    r6.<init>(r1)
                    ajr r1 = r5.e
                    r5.a = r6
                    r2 = 2
                    r5.b = r2
                    java.lang.Object r1 = r1.b(r6, r5)
                    if (r1 != r0) goto L66
                    goto L70
                L66:
                    r0 = r6
                L67:
                    ada r6 = r5.c
                    ajt$b r0 = (ajt.b) r0
                    r6.f = r0
                    arnb r6 = defpackage.arnb.a
                    return r6
                L70:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ada.AnonymousClass3.AnonymousClass1.b(java.lang.Object):java.lang.Object");
            }

            @Override // defpackage.arpq
            public final arpe c(Object obj, arpe arpeVar) {
                return new AnonymousClass1(this.c, this.d, this.e, arpeVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ahq ahqVar, long j, ajr ajrVar, ada adaVar, arpe arpeVar) {
            super(2, arpeVar);
            this.c = ahqVar;
            this.d = j;
            this.e = ajrVar;
            this.f = adaVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass3) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x008d, code lost:
        
            if (r14.b(r1, r13) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0081, code lost:
        
            if (r3.b(r14, r13) != r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00ae, code lost:
        
            if (r2.b(r14, r13) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x004e, code lost:
        
            if (r14 != r0) goto L13;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
        @Override // defpackage.arpq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object b(java.lang.Object r14) {
            /*
                r13 = this;
                arpl r0 = defpackage.arpl.a
                int r1 = r13.b
                r2 = 4
                r3 = 2
                r4 = 1
                r5 = 3
                r6 = 0
                if (r1 == 0) goto L2c
                if (r1 == r4) goto L24
                if (r1 == r3) goto L1e
                if (r1 == r5) goto L16
                defpackage.aqil.P(r14)
                goto Lb1
            L16:
                java.lang.Object r1 = r13.g
                ajt$c r1 = (ajt.c) r1
                defpackage.aqil.P(r14)
                goto L83
            L1e:
                boolean r1 = r13.a
                defpackage.aqil.P(r14)
                goto L69
            L24:
                java.lang.Object r1 = r13.g
                arxm r1 = (defpackage.arxm) r1
                defpackage.aqil.P(r14)
                goto L50
            L2c:
                defpackage.aqil.P(r14)
                java.lang.Object r14 = r13.g
                arwe r14 = (defpackage.arwe) r14
                ada r8 = r13.f
                long r9 = r13.d
                ajr r11 = r13.e
                ada$3$1 r1 = new ada$3$1
                r12 = 0
                r7 = r1
                r7.<init>(r8, r9, r11, r12)
                arxm r1 = defpackage.arrn.J(r14, r6, r6, r1, r5)
                ahq r14 = r13.c
                r13.g = r1
                r13.b = r4
                java.lang.Object r14 = r14.a(r13)
                if (r14 == r0) goto Lb8
            L50:
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                boolean r14 = r14.booleanValue()
                boolean r4 = r1.x()
                if (r4 == 0) goto L90
                r13.g = r6
                r13.a = r14
                r13.b = r3
                java.lang.Object r1 = defpackage.arwi.t(r1, r13)
                if (r1 == r0) goto Lb8
                r1 = r14
            L69:
                if (r1 == 0) goto Lb1
                long r3 = r13.d
                ajt$b r14 = new ajt$b
                r14.<init>(r3)
                ajt$c r1 = new ajt$c
                r1.<init>(r14)
                ajr r3 = r13.e
                r13.g = r1
                r13.b = r5
                java.lang.Object r14 = r3.b(r14, r13)
                if (r14 == r0) goto Lb8
            L83:
                ajr r14 = r13.e
                r13.g = r6
                r13.b = r2
                java.lang.Object r14 = r14.b(r1, r13)
                if (r14 != r0) goto Lb1
                goto Lb8
            L90:
                ada r1 = r13.f
                ajt$b r1 = r1.f
                if (r1 == 0) goto Lb1
                ajr r2 = r13.e
                if (r14 == 0) goto La0
                ajt$c r14 = new ajt$c
                r14.<init>(r1)
                goto La5
            La0:
                ajt$a r14 = new ajt$a
                r14.<init>(r1)
            La5:
                r13.g = r6
                r1 = 5
                r13.b = r1
                java.lang.Object r14 = r2.b(r14, r13)
                if (r14 != r0) goto Lb1
                goto Lb8
            Lb1:
                ada r14 = r13.f
                r14.f = r6
                arnb r14 = defpackage.arnb.a
                return r14
            Lb8:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ada.AnonymousClass3.b(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.c, this.d, this.e, this.f, arpeVar);
            anonymousClass3.g = obj;
            return anonymousClass3;
        }
    }

    /* compiled from: PG */
    /* renamed from: ada$4, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass4 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ ajt.b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ajt.b bVar, arpe arpeVar) {
            super(2, arpeVar);
            this.c = bVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass4) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            ajr ajrVar;
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0 && (ajrVar = ada.this.b) != null) {
                ajt.b bVar = this.c;
                this.a = 1;
                if (ajrVar.b(bVar, this) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass4(this.c, arpeVar);
        }
    }

    /* compiled from: PG */
    /* renamed from: ada$5, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass5 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ ajt.b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(ajt.b bVar, arpe arpeVar) {
            super(2, arpeVar);
            this.c = bVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass5) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            ajr ajrVar;
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0 && (ajrVar = ada.this.b) != null) {
                ajt.c cVar = new ajt.c(this.c);
                this.a = 1;
                if (ajrVar.b(cVar, this) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass5(this.c, arpeVar);
        }
    }

    /* compiled from: PG */
    /* renamed from: ada$6, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass6 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        public AnonymousClass6(arpe arpeVar) {
            super(2, arpeVar);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass6) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            aqil.P(obj);
            ada adaVar = ada.this;
            if (adaVar.g == null) {
                ajn ajnVar = new ajn();
                ajr ajrVar = adaVar.b;
                if (ajrVar != null) {
                    arrn.J(adaVar.B(), null, null, new adb(ajrVar, ajnVar, null), 3);
                }
                adaVar.g = ajnVar;
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass6(arpeVar);
        }
    }

    /* compiled from: PG */
    /* renamed from: ada$7, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass7 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        public AnonymousClass7(arpe arpeVar) {
            super(2, arpeVar);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass7) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            aqil.P(obj);
            ada adaVar = ada.this;
            ajn ajnVar = adaVar.g;
            if (ajnVar != null) {
                ajo ajoVar = new ajo(ajnVar);
                ajr ajrVar = adaVar.b;
                if (ajrVar != null) {
                    arrn.J(adaVar.B(), null, null, new adc(ajrVar, ajoVar, null), 3);
                }
                adaVar.g = null;
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass7(arpeVar);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
    }

    public ada(ajr ajrVar, afa afaVar, boolean z, String str, dgv dgvVar, arqg arqgVar) {
        this.b = ajrVar;
        this.i = afaVar;
        this.j = str;
        this.k = dgvVar;
        this.c = z;
        this.d = arqgVar;
        this.l = new aen(this.b, 0, new AnonymousClass2(this));
        this.o = this.b;
    }

    private final boolean z() {
        if (this.o == null && this.i != null) {
            return true;
        }
        return false;
    }

    public abstract Object a(crk crkVar, arpe arpeVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object d(ahq ahqVar, long j, arpe arpeVar) {
        Object d;
        ajr ajrVar = this.b;
        if (ajrVar != null && (d = arwi.d(new AnonymousClass3(ahqVar, j, ajrVar, this, null), arpeVar)) == arpl.a) {
            return d;
        }
        return arnb.a;
    }

    @Override // cga.c
    public final boolean dL() {
        return false;
    }

    @Override // defpackage.czk
    public final void dM(dho dhoVar) {
        dgv dgvVar = this.k;
        if (dgvVar != null) {
            dhl.k(dhoVar, dgvVar.a);
        }
        dhl.e(dhoVar, this.j, new AnonymousClass1());
        if (this.c) {
            this.l.dM(dhoVar);
        } else {
            dhl.b(dhoVar);
        }
        e(dhoVar);
    }

    @Override // defpackage.czp
    public final Object dP() {
        return this.D;
    }

    @Override // cga.c
    public final void dQ() {
        if (!this.C) {
            h();
        }
        if (this.c) {
            K(this.l);
        }
    }

    @Override // defpackage.czi
    public final void dR() {
        ajn ajnVar;
        ajr ajrVar = this.b;
        if (ajrVar != null && (ajnVar = this.g) != null) {
            ajrVar.c(new ajo(ajnVar));
        }
        this.g = null;
        crw crwVar = this.e;
        if (crwVar != null) {
            crwVar.dR();
        }
    }

    @Override // defpackage.czi
    public final /* synthetic */ void dS() {
        czh.a(this);
    }

    @Override // defpackage.czi
    public final void dT(cqq cqqVar, cqs cqsVar, long j) {
        long j2 = (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
        this.n = (Float.floatToRawIntBits(dre.b(j2)) & 4294967295L) | (Float.floatToRawIntBits(dre.a(j2)) << 32);
        h();
        if (this.c && cqsVar == cqs.b) {
            int i = cqqVar.d;
            if (defpackage.a.bA(i, 4)) {
                arrn.J(B(), null, null, new AnonymousClass6(null), 3);
            } else if (defpackage.a.bA(i, 5)) {
                arrn.J(B(), null, null, new AnonymousClass7(null), 3);
            }
        }
        if (this.e == null) {
            crx crxVar = new crx(null, null, null, new PointerInputEventHandler() { // from class: ada.8
                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                public final Object invoke(crk crkVar, arpe<? super arnb> arpeVar) {
                    Object a2 = ada.this.a(crkVar, arpeVar);
                    if (a2 == arpl.a) {
                        return a2;
                    }
                    return arnb.a;
                }
            });
            K(crxVar);
            this.e = crxVar;
        }
        crw crwVar = this.e;
        if (crwVar != null) {
            crwVar.dT(cqqVar, cqsVar, j);
        }
    }

    @Override // defpackage.czi
    public final /* synthetic */ void dU() {
        czh.b(this);
    }

    @Override // defpackage.czk
    public final /* synthetic */ boolean dY() {
        return false;
    }

    @Override // defpackage.czk
    public final boolean dZ() {
        return true;
    }

    public final void g() {
        int i;
        ajr ajrVar = this.b;
        if (ajrVar != null) {
            ajt.b bVar = this.f;
            if (bVar != null) {
                ajrVar.c(new ajt.a(bVar));
            }
            ajn ajnVar = this.g;
            if (ajnVar != null) {
                ajrVar.c(new ajo(ajnVar));
            }
            uf ufVar = this.h;
            Object[] objArr = ufVar.c;
            long[] jArr = ufVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = i2 - length;
                        int i4 = 0;
                        while (true) {
                            i = 8 - ((~i3) >>> 31);
                            if (i4 >= i) {
                                break;
                            }
                            if ((255 & j) < 128) {
                                ajrVar.c(new ajt.a((ajt.b) objArr[(i2 << 3) + i4]));
                            }
                            j >>= 8;
                            i4++;
                        }
                        if (i != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        this.f = null;
        this.g = null;
        this.h.e();
    }

    public final void h() {
        afa afaVar;
        if (this.m == null && (afaVar = this.i) != null) {
            if (this.b == null) {
                this.b = new ajs();
            }
            this.l.j(this.b);
            ajr ajrVar = this.b;
            ajrVar.getClass();
            cwo a2 = afaVar.a(ajrVar);
            K(a2);
            this.m = a2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r2.m == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r4 = r2.m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        if (r4 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (r3 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        r2.l.j(r2.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        if (r4 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        J(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        r2.m = null;
        h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        if (r1 != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(defpackage.ajr r3, defpackage.afa r4, boolean r5, java.lang.String r6, defpackage.dgv r7, defpackage.arqg r8) {
        /*
            r2 = this;
            ajr r0 = r2.o
            boolean r0 = defpackage.d.F(r0, r3)
            r1 = 1
            if (r0 != 0) goto L12
            r2.g()
            r2.o = r3
            r2.b = r3
            r3 = r1
            goto L13
        L12:
            r3 = 0
        L13:
            afa r0 = r2.i
            boolean r0 = defpackage.d.F(r0, r4)
            if (r0 != 0) goto L1e
            r2.i = r4
            goto L1f
        L1e:
            r1 = r3
        L1f:
            boolean r3 = r2.c
            if (r3 == r5) goto L38
            if (r5 == 0) goto L2b
            aen r3 = r2.l
            r2.K(r3)
            goto L33
        L2b:
            aen r3 = r2.l
            r2.J(r3)
            r2.g()
        L33:
            defpackage.czl.a(r2)
            r2.c = r5
        L38:
            java.lang.String r3 = r2.j
            boolean r3 = defpackage.d.F(r3, r6)
            if (r3 != 0) goto L45
            r2.j = r6
            defpackage.czl.a(r2)
        L45:
            dgv r3 = r2.k
            boolean r3 = defpackage.d.F(r3, r7)
            if (r3 != 0) goto L52
            r2.k = r7
            defpackage.czl.a(r2)
        L52:
            r2.d = r8
            boolean r3 = r2.C
            boolean r4 = r2.z()
            if (r3 == r4) goto L69
            boolean r3 = r2.z()
            r2.C = r3
            if (r3 != 0) goto L69
            cwo r4 = r2.m
            if (r4 != 0) goto L69
            goto L6b
        L69:
            if (r1 == 0) goto L7c
        L6b:
            cwo r4 = r2.m
            if (r4 != 0) goto L71
            if (r3 != 0) goto L7c
        L71:
            if (r4 == 0) goto L76
            r2.J(r4)
        L76:
            r3 = 0
            r2.m = r3
            r2.h()
        L7c:
            aen r3 = r2.l
            ajr r4 = r2.b
            r3.j(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ada.n(ajr, afa, boolean, java.lang.String, dgv, arqg):void");
    }

    protected abstract boolean r(KeyEvent keyEvent);

    @Override // cga.c
    public final void s() {
        g();
        if (this.o == null) {
            this.b = null;
        }
        cwo cwoVar = this.m;
        if (cwoVar != null) {
            J(cwoVar);
        }
        this.m = null;
    }

    @Override // defpackage.cpv
    public final boolean t(KeyEvent keyEvent) {
        boolean z;
        h();
        long b = cpt.b(keyEvent);
        if (this.c && defpackage.a.bA(cpt.a(keyEvent), 2) && aec.a(keyEvent)) {
            if (!this.h.b(b)) {
                ajt.b bVar = new ajt.b(this.n);
                this.h.f(b, bVar);
                if (this.b != null) {
                    arrn.J(B(), null, null, new AnonymousClass4(bVar, null), 3);
                }
                z = true;
            } else {
                z = false;
            }
            if (r(keyEvent) || z) {
                return true;
            }
            return false;
        }
        if (this.c && defpackage.a.bA(cpt.a(keyEvent), 1) && aec.a(keyEvent)) {
            ajt.b bVar2 = (ajt.b) this.h.d(b);
            if (bVar2 != null) {
                if (this.b != null) {
                    arrn.J(B(), null, null, new AnonymousClass5(bVar2, null), 3);
                }
                y(keyEvent);
            }
            if (bVar2 != null) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cpv
    public final boolean v(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.czi
    public final /* synthetic */ boolean w() {
        return false;
    }

    protected abstract void y(KeyEvent keyEvent);

    protected void i() {
    }

    @Override // defpackage.czi
    public final /* synthetic */ void x() {
    }

    public void e(dho dhoVar) {
    }
}
