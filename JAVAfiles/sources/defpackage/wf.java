package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wf {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: wf$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ abt a;
        final /* synthetic */ arqr b;
        final /* synthetic */ cga c;
        final /* synthetic */ xl d;
        final /* synthetic */ xn e;
        final /* synthetic */ arqv f;
        final /* synthetic */ arqw g;
        final /* synthetic */ int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(abt abtVar, arqr arqrVar, cga cgaVar, xl xlVar, xn xnVar, arqv arqvVar, arqw arqwVar, int i) {
            super(2);
            this.a = abtVar;
            this.b = arqrVar;
            this.c = cgaVar;
            this.d = xlVar;
            this.e = xnVar;
            this.f = arqvVar;
            this.g = arqwVar;
            this.h = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            wf.e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (bwj) obj, bzh.a(this.h | 1));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: wf$10, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass10 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ abd a;
        final /* synthetic */ cga b;
        final /* synthetic */ xl c;
        final /* synthetic */ xn d;
        final /* synthetic */ String e;
        final /* synthetic */ arqw f;
        final /* synthetic */ int g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(abd abdVar, cga cgaVar, xl xlVar, xn xnVar, String str, arqw arqwVar, int i) {
            super(2);
            this.a = abdVar;
            this.b = cgaVar;
            this.c = xlVar;
            this.d = xnVar;
            this.e = str;
            this.f = arqwVar;
            this.g = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            wf.f(this.a, this.b, this.c, this.d, this.e, this.f, (bwj) obj, bzh.a(this.g | 1));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: wf$11, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass11 extends arrp implements arqw<cuh, cuc, dqs, cuf> {
        final /* synthetic */ arqr a;
        final /* synthetic */ abt b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(arqr arqrVar, abt abtVar) {
            super(3);
            this.a = arqrVar;
            this.b = abtVar;
        }

        @Override // defpackage.arqw
        public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            long j;
            cuf et;
            cuh cuhVar = (cuh) obj;
            cvc e = ((cuc) obj2).e(((dqs) obj3).a);
            if (cuhVar.ev() && !((Boolean) this.a.a(this.b.f())).booleanValue()) {
                j = 0;
            } else {
                j = (e.a << 32) | (e.b & 4294967295L);
            }
            et = cuhVar.et((int) (j >> 32), (int) (4294967295L & j), arnw.a, new wg(e));
            return et;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: wf$12, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass12 extends arrp implements arqv<wv, wv, Boolean> {
        public static final AnonymousClass12 a = new AnonymousClass12();

        public AnonymousClass12() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            wv wvVar = (wv) obj2;
            boolean z = false;
            if (((wv) obj) == wvVar && wvVar == wv.c) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: wf$13, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass13 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ abt a;
        final /* synthetic */ arqr b;
        final /* synthetic */ cga c;
        final /* synthetic */ xl d;
        final /* synthetic */ xn e;
        final /* synthetic */ arqw f;
        final /* synthetic */ int g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass13(abt abtVar, arqr arqrVar, cga cgaVar, xl xlVar, xn xnVar, arqw arqwVar, int i) {
            super(2);
            this.a = abtVar;
            this.b = arqrVar;
            this.c = cgaVar;
            this.d = xlVar;
            this.e = xnVar;
            this.f = arqwVar;
            this.g = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            wf.c(this.a, this.b, this.c, this.d, this.e, this.f, (bwj) obj, bzh.a(this.g | 1));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: wf$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arpw implements arqv<bza<Boolean>, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ abt b;
        final /* synthetic */ cas c;
        private /* synthetic */ Object d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: wf$2$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends arrp implements arqg<Boolean> {
            final /* synthetic */ abt a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(abt abtVar) {
                super(0);
                this.a = abtVar;
            }

            @Override // defpackage.arqg
            public final /* bridge */ /* synthetic */ Object a() {
                return Boolean.valueOf(wf.d(this.a));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(abt abtVar, cas casVar, arpe arpeVar) {
            super(2, arpeVar);
            this.b = abtVar;
            this.c = casVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass2) c((bza) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                final bza bzaVar = (bza) this.d;
                asai a = cao.a(new AnonymousClass1(this.b));
                final abt abtVar = this.b;
                final cas casVar = this.c;
                asaj asajVar = new asaj() { // from class: wf.2.2
                    @Override // defpackage.asaj
                    public final /* bridge */ /* synthetic */ Object fv(Object obj2, arpe arpeVar) {
                        boolean z;
                        if (((Boolean) obj2).booleanValue()) {
                            arqv arqvVar = (arqv) casVar.a();
                            abt abtVar2 = abtVar;
                            z = ((Boolean) arqvVar.a(abtVar2.e(), abtVar2.f())).booleanValue();
                        } else {
                            z = false;
                        }
                        bza.this.h(Boolean.valueOf(z));
                        return arnb.a;
                    }
                };
                this.a = 1;
                if (a.a(asajVar, this) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.b, this.c, arpeVar);
            anonymousClass2.d = obj;
            return anonymousClass2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: wf$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqr<Boolean, Boolean> {
        public static final AnonymousClass3 a = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return bool;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: wf$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ boolean a;
        final /* synthetic */ cga b;
        final /* synthetic */ xl c;
        final /* synthetic */ xn d;
        final /* synthetic */ String e;
        final /* synthetic */ arqw f;
        final /* synthetic */ int g;
        final /* synthetic */ int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(boolean z, cga cgaVar, xl xlVar, xn xnVar, String str, arqw arqwVar, int i, int i2) {
            super(2);
            this.a = z;
            this.b = cgaVar;
            this.c = xlVar;
            this.d = xnVar;
            this.e = str;
            this.f = arqwVar;
            this.g = i;
            this.h = i2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            wf.a(this.a, this.b, this.c, this.d, this.e, this.f, (bwj) obj, bzh.a(this.g | 1), this.h);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: wf$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqr<Boolean, Boolean> {
        public static final AnonymousClass5 a = new AnonymousClass5();

        public AnonymousClass5() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return bool;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: wf$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ amt a;
        final /* synthetic */ boolean b;
        final /* synthetic */ cga c;
        final /* synthetic */ xl d;
        final /* synthetic */ xn e;
        final /* synthetic */ String f;
        final /* synthetic */ arqw g;
        final /* synthetic */ int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(amt amtVar, boolean z, cga cgaVar, xl xlVar, xn xnVar, String str, arqw arqwVar, int i) {
            super(2);
            this.a = amtVar;
            this.b = z;
            this.c = cgaVar;
            this.d = xlVar;
            this.e = xnVar;
            this.f = str;
            this.g = arqwVar;
            this.h = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            wf.g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (bwj) obj, bzh.a(this.h | 1));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: wf$7, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass7 extends arrp implements arqr<Boolean, Boolean> {
        public static final AnonymousClass7 a = new AnonymousClass7();

        public AnonymousClass7() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return bool;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: wf$8, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass8 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ akn a;
        final /* synthetic */ boolean b;
        final /* synthetic */ cga c;
        final /* synthetic */ xl d;
        final /* synthetic */ xn e;
        final /* synthetic */ String f;
        final /* synthetic */ arqw g;
        final /* synthetic */ int h;
        final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(akn aknVar, boolean z, cga cgaVar, xl xlVar, xn xnVar, String str, arqw arqwVar, int i, int i2) {
            super(2);
            this.a = aknVar;
            this.b = z;
            this.c = cgaVar;
            this.d = xlVar;
            this.e = xnVar;
            this.f = str;
            this.g = arqwVar;
            this.h = i;
            this.i = i2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            wf.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (bwj) obj, bzh.a(this.h | 1), this.i);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: wf$9, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass9 extends arrp implements arqr<Boolean, Boolean> {
        public static final AnonymousClass9 a = new AnonymousClass9();

        public AnonymousClass9() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return bool;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(boolean r16, defpackage.cga r17, defpackage.xl r18, defpackage.xn r19, java.lang.String r20, defpackage.arqw r21, defpackage.bwj r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wf.a(boolean, cga, xl, xn, java.lang.String, arqw, bwj, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.akn r17, boolean r18, defpackage.cga r19, defpackage.xl r20, defpackage.xn r21, java.lang.String r22, defpackage.arqw r23, defpackage.bwj r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wf.b(akn, boolean, cga, xl, xn, java.lang.String, arqw, bwj, int, int):void");
    }

    public static final void c(abt abtVar, arqr arqrVar, cga cgaVar, xl xlVar, xn xnVar, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i & 6;
        bwj c = bwjVar.c(429978603);
        boolean z2 = true;
        if (i9 == 0) {
            if (true != c.G(abtVar)) {
                i8 = 2;
            } else {
                i8 = 4;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.I(arqrVar)) {
                i7 = 16;
            } else {
                i7 = 32;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (true != c.G(cgaVar)) {
                i6 = 128;
            } else {
                i6 = 256;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (true != c.G(xlVar)) {
                i5 = 1024;
            } else {
                i5 = 2048;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (true != c.G(xnVar)) {
                i4 = 8192;
            } else {
                i4 = 16384;
            }
            i2 |= i4;
        }
        if ((i & 196608) == 0) {
            if (true != c.I(arqwVar)) {
                i3 = 65536;
            } else {
                i3 = 131072;
            }
            i2 |= i3;
        }
        if ((74899 & i2) == 74898 && c.L()) {
            c.v();
        } else {
            int i10 = i2 & 112;
            if (i10 == 32) {
                z = true;
            } else {
                z = false;
            }
            int i11 = i2 & 14;
            if (i11 != 4) {
                z2 = false;
            }
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if ((z2 | z) || T == bwj.a.a) {
                T = new AnonymousClass11(arqrVar, abtVar);
                bwkVar.ad(T);
            }
            e(abtVar, arqrVar, cts.a(cgaVar, (arqw) T), xlVar, xnVar, AnonymousClass12.a, arqwVar, c, i11 | 196608 | i10 | (i2 & 7168) | (57344 & i2) | ((i2 << 6) & 29360128));
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass13(abtVar, arqrVar, cgaVar, xlVar, xnVar, arqwVar, i);
        }
    }

    public static final boolean d(abt abtVar) {
        if (abtVar.e() == wv.c && abtVar.f() == wv.c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x017d, code lost:
    
        if (r2 == false) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(defpackage.abt r21, defpackage.arqr r22, defpackage.cga r23, defpackage.xl r24, defpackage.xn r25, defpackage.arqv r26, defpackage.arqw r27, defpackage.bwj r28, int r29) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wf.e(abt, arqr, cga, xl, xn, arqv, arqw, bwj, int):void");
    }

    public static final void f(abd abdVar, cga cgaVar, xl xlVar, xn xnVar, String str, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        cga cgaVar2;
        xn a;
        String str2;
        int i3;
        int i4;
        boolean I;
        int i5;
        int i6 = i & 6;
        bwj c = bwjVar.c(-222898426);
        if (i6 == 0) {
            if ((i & 8) == 0) {
                I = c.G(abdVar);
            } else {
                I = c.I(abdVar);
            }
            if (true != I) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        int i7 = i2 | 48;
        if ((i & 384) == 0) {
            if (true != c.G(xlVar)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i7 |= i4;
        }
        int i8 = i7 | 27648;
        if ((196608 & i) == 0) {
            if (true != c.I(arqwVar)) {
                i3 = 65536;
            } else {
                i3 = 131072;
            }
            i8 |= i3;
        }
        if ((74899 & i8) == 74898 && c.L()) {
            c.v();
            cgaVar2 = cgaVar;
            a = xnVar;
            str2 = str;
        } else {
            cgaVar2 = cga.e;
            a = wx.h(null, 3).a(wx.l());
            int i9 = i8 << 3;
            str2 = "AnimatedVisibility";
            c(aby.b(abdVar, "AnimatedVisibility", c, (i8 & 14) | ((i8 >> 9) & 112), 0), AnonymousClass9.a, cgaVar2, xlVar, a, arqwVar, c, (i8 & 458752) | (i9 & 57344) | (i9 & 896) | 48 | (i9 & 7168));
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass10(abdVar, cgaVar2, xlVar, a, str2, arqwVar, i);
        }
    }

    public static final void g(amt amtVar, boolean z, cga cgaVar, xl xlVar, xn xnVar, String str, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        String str2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        bwj c = bwjVar.c(-1741346906);
        if ((i & 48) == 0) {
            if (true != c.H(z)) {
                i7 = 16;
            } else {
                i7 = 32;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            if (true != c.G(cgaVar)) {
                i6 = 128;
            } else {
                i6 = 256;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (true != c.G(xlVar)) {
                i5 = 1024;
            } else {
                i5 = 2048;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (true != c.G(xnVar)) {
                i4 = 8192;
            } else {
                i4 = 16384;
            }
            i2 |= i4;
        }
        int i8 = i2 | 196608;
        if ((1572864 & i) == 0) {
            if (true != c.I(arqwVar)) {
                i3 = 524288;
            } else {
                i3 = 1048576;
            }
            i8 |= i3;
        }
        if ((599185 & i8) == 599184 && c.L()) {
            c.v();
            str2 = str;
        } else {
            int i9 = i8 >> 3;
            c(aby.d(Boolean.valueOf(z), "AnimatedVisibility", c, ((i8 >> 12) & 112) | (i9 & 14), 0), AnonymousClass5.a, cgaVar, xlVar, xnVar, arqwVar, c, (i8 & 57344) | (i8 & 896) | 48 | (i8 & 7168) | (i9 & 458752));
            str2 = "AnimatedVisibility";
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass6(amtVar, z, cgaVar, xlVar, xnVar, str2, arqwVar, i);
        }
    }

    private static final wv h(abt abtVar, arqr arqrVar, Object obj, bwj bwjVar) {
        wv wvVar;
        bwjVar.x(-902052157, abtVar);
        if (abtVar.t()) {
            if (((Boolean) arqrVar.a(obj)).booleanValue()) {
                wvVar = wv.b;
            } else if (((Boolean) arqrVar.a(abtVar.e())).booleanValue()) {
                wvVar = wv.c;
            } else {
                wvVar = wv.a;
            }
        } else {
            bwk bwkVar = (bwk) bwjVar;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                byu byuVar = new byu(false, cav.a);
                bwkVar.ad(byuVar);
                T = byuVar;
            }
            byn bynVar = (byn) T;
            if (((Boolean) arqrVar.a(abtVar.e())).booleanValue()) {
                bynVar.h(true);
            }
            if (((Boolean) arqrVar.a(obj)).booleanValue()) {
                wvVar = wv.b;
            } else if (((Boolean) bynVar.a()).booleanValue()) {
                wvVar = wv.c;
            } else {
                wvVar = wv.a;
            }
        }
        ((bwk) bwjVar).Y();
        return wvVar;
    }
}
