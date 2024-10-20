package defpackage;

import androidx.compose.foundation.selection.TriStateToggleableElement;
import defpackage.abt;
import defpackage.bwj;
import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blc {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: blc$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqg<arnb> {
        final /* synthetic */ arqr a;
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(arqr arqrVar, boolean z) {
            super(0);
            this.a = arqrVar;
            this.b = z;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            this.a.a(Boolean.valueOf(!this.b));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: blc$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ boolean a;
        final /* synthetic */ arqr b;
        final /* synthetic */ cga c;
        final /* synthetic */ boolean d;
        final /* synthetic */ blb e;
        final /* synthetic */ ajr f;
        final /* synthetic */ int g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, arqr arqrVar, cga cgaVar, boolean z2, blb blbVar, ajr ajrVar, int i) {
            super(2);
            this.a = z;
            this.b = arqrVar;
            this.c = cgaVar;
            this.d = z2;
            this.e = blbVar;
            this.f = ajrVar;
            this.g = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            blc.b(this.a, this.b, this.c, this.d, this.e, this.f, (bwj) obj, bzh.a(this.g | 1));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: blc$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqr<cny, arnb> {
        final /* synthetic */ cas a;
        final /* synthetic */ cas b;
        final /* synthetic */ cas c;
        final /* synthetic */ cas d;
        final /* synthetic */ cas e;
        final /* synthetic */ bla f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(cas casVar, cas casVar2, cas casVar3, cas casVar4, cas casVar5, bla blaVar) {
            super(1);
            this.a = casVar;
            this.b = casVar2;
            this.c = casVar3;
            this.d = casVar4;
            this.e = casVar5;
            this.f = blaVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            cny cnyVar = (cny) obj;
            float floor = (float) Math.floor(cnyVar.em(2.0f));
            long j = ((cku) this.a.a()).i;
            long j2 = ((cku) this.b.a()).i;
            float em = cnyVar.em(2.0f);
            cod codVar = new cod(floor, brg.a, 0, 0, 30);
            float c = cjt.c(cnyVar.o());
            if (a.bB(j, j2)) {
                cnw.f(cnyVar, j, 0L, a.z(c, c), cjj.a(em), coc.a, brg.a, 226);
            } else {
                float f = floor / 2.0f;
                float f2 = c - (floor + floor);
                cnw.f(cnyVar, j, a.z(floor, floor), a.z(f2, f2), cjj.a(Math.max(brg.a, em - floor)), coc.a, brg.a, 224);
                float f3 = c - floor;
                cnw.f(cnyVar, j2, a.z(f, f), a.z(f3, f3), cjj.a(em - f), codVar, brg.a, 224);
            }
            long j3 = ((cku) this.c.a()).i;
            float floatValue = ((Number) this.d.a()).floatValue();
            float floatValue2 = ((Number) this.e.a()).floatValue();
            bla blaVar = this.f;
            cod codVar2 = new cod(floor, brg.a, 2, 0, 26);
            float c2 = cjt.c(cnyVar.o());
            float b = drv.b(0.4f, 0.5f, floatValue2);
            float b2 = drv.b(0.7f, 0.5f, floatValue2);
            float b3 = drv.b(0.5f, 0.5f, floatValue2);
            float b4 = drv.b(0.3f, 0.5f, floatValue2);
            blaVar.a.k();
            blaVar.a.f(0.2f * c2, b3 * c2);
            blaVar.a.e(b * c2, b2 * c2);
            blaVar.a.e(0.8f * c2, c2 * b4);
            blaVar.b.c(blaVar.a);
            blaVar.c.k();
            clt cltVar = blaVar.b;
            cltVar.b(brg.a, cltVar.a() * floatValue, blaVar.c);
            cnw.d(cnyVar, blaVar.c, j3, codVar2, 52);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: blc$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ boolean a;
        final /* synthetic */ dhs b;
        final /* synthetic */ cga c;
        final /* synthetic */ blb d;
        final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(boolean z, dhs dhsVar, cga cgaVar, blb blbVar, int i) {
            super(2);
            this.a = z;
            this.b = dhsVar;
            this.c = cgaVar;
            this.d = blbVar;
            this.e = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            boolean z = this.a;
            dhs dhsVar = this.b;
            cga cgaVar = this.c;
            blc.a(z, dhsVar, cgaVar, this.d, (bwj) obj, bzh.a(this.e | 1));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: blc$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqw<abt.b<dhs>, bwj, Integer, aap<Float>> {
        final /* synthetic */ aap a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(aap aapVar) {
            super(3);
            this.a = aapVar;
        }

        @Override // defpackage.arqw
        public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            Object obj4;
            abt.b bVar = (abt.b) obj;
            bwj bwjVar = (bwj) obj2;
            ((Number) obj3).intValue();
            bwjVar.y(-1324481169);
            if (bVar.a() == dhs.b) {
                obj4 = new abk(0);
            } else if (bVar.b() == dhs.b) {
                obj4 = new abk(100);
            } else {
                obj4 = this.a;
            }
            bwjVar.q();
            return obj4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: blc$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends arrp implements arqw<abt.b<dhs>, bwj, Integer, aap<Float>> {
        final /* synthetic */ aap a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(aap aapVar) {
            super(3);
            this.a = aapVar;
        }

        @Override // defpackage.arqw
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            Object obj4;
            abt.b bVar = (abt.b) obj;
            bwj bwjVar = (bwj) obj2;
            ((Number) obj3).intValue();
            bwjVar.y(1373301606);
            if (bVar.a() == dhs.b) {
                obj4 = this.a;
            } else if (bVar.b() == dhs.b) {
                obj4 = new abk(100);
            } else {
                obj4 = this.a;
            }
            bwjVar.q();
            return obj4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: blc$7, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass7 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ dhs a;
        final /* synthetic */ arqg b;
        final /* synthetic */ cga c;
        final /* synthetic */ boolean d;
        final /* synthetic */ blb e;
        final /* synthetic */ ajr f;
        final /* synthetic */ int g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(dhs dhsVar, arqg arqgVar, cga cgaVar, boolean z, blb blbVar, ajr ajrVar, int i) {
            super(2);
            this.a = dhsVar;
            this.b = arqgVar;
            this.c = cgaVar;
            this.d = z;
            this.e = blbVar;
            this.f = ajrVar;
            this.g = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            blc.c(this.a, this.b, this.c, this.d, this.e, this.f, (bwj) obj, bzh.a(this.g | 1));
            return arnb.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0098, code lost:
    
        if (r8 == 2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c3, code lost:
    
        throw new defpackage.armm();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bb, code lost:
    
        if (r9 == 2) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0210  */
    /* JADX WARN: Type inference failed for: r10v7, types: [aap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [aap, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(boolean r29, defpackage.dhs r30, defpackage.cga r31, defpackage.blb r32, defpackage.bwj r33, int r34) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blc.a(boolean, dhs, cga, blb, bwj, int):void");
    }

    public static final void b(boolean z, arqr arqrVar, cga cgaVar, boolean z2, blb blbVar, ajr ajrVar, bwj bwjVar, int i) {
        int i2;
        arqg arqgVar;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i & 6;
        bwj c = bwjVar.c(-1406741137);
        boolean z4 = true;
        if (i9 == 0) {
            if (true != c.H(z)) {
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
            if (true != c.H(z2)) {
                i5 = 1024;
            } else {
                i5 = 2048;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (true != c.G(blbVar)) {
                i4 = 8192;
            } else {
                i4 = 16384;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (true != c.G(ajrVar)) {
                i3 = 65536;
            } else {
                i3 = 131072;
            }
            i2 |= i3;
        }
        if ((74899 & i2) == 74898 && c.L()) {
            c.v();
        } else {
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
            }
            c.n();
            dhs a = dht.a(z);
            c.y(1046937066);
            if (arqrVar != null) {
                if ((i2 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i2 & 14) != 4) {
                    z4 = false;
                }
                bwk bwkVar = (bwk) c;
                Object T = bwkVar.T();
                if ((z4 | z3) || T == bwj.a.a) {
                    T = new AnonymousClass1(arqrVar, z);
                    bwkVar.ad(T);
                }
                arqgVar = (arqg) T;
            } else {
                arqgVar = null;
            }
            ((bwk) c).Y();
            c(a, arqgVar, cgaVar, z2, blbVar, ajrVar, c, i2 & 524160);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass2(z, arqrVar, cgaVar, z2, blbVar, ajrVar, i);
        }
    }

    public static final void c(dhs dhsVar, arqg arqgVar, cga cgaVar, boolean z, blb blbVar, ajr ajrVar, bwj bwjVar, int i) {
        int i2;
        cga cgaVar2;
        cga cgaVar3;
        bwj bwjVar2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i & 6;
        bwj c = bwjVar.c(-1608358065);
        if (i9 == 0) {
            if (true != c.G(dhsVar)) {
                i8 = 2;
            } else {
                i8 = 4;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.I(arqgVar)) {
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
            if (true != c.H(z)) {
                i5 = 1024;
            } else {
                i5 = 2048;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (true != c.G(blbVar)) {
                i4 = 8192;
            } else {
                i4 = 16384;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (true != c.G(ajrVar)) {
                i3 = 65536;
            } else {
                i3 = 131072;
            }
            i2 |= i3;
        }
        int i10 = i2;
        if ((74899 & i10) == 74898 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
            }
            c.n();
            if (arqgVar != null) {
                cga.a aVar = cga.e;
                buo buoVar = bul.a;
                afa a = bon.a(false, bul.d / 2.0f, 0L, 4);
                dgv dgvVar = new dgv(1);
                if (a instanceof afa) {
                    cgaVar2 = new TriStateToggleableElement(dhsVar, ajrVar, a, z, dgvVar, arqgVar);
                } else if (a == null) {
                    cgaVar2 = new TriStateToggleableElement(dhsVar, ajrVar, null, z, dgvVar, arqgVar);
                } else if (ajrVar == null) {
                    cgaVar2 = cfv.g(cga.e, new avx(a, dhsVar, z, dgvVar, arqgVar));
                } else {
                    cgaVar2 = aex.a(cga.e, ajrVar, a).a(new TriStateToggleableElement(dhsVar, ajrVar, null, z, dgvVar, arqgVar));
                }
            } else {
                cgaVar2 = cga.e;
            }
            if (arqgVar != null) {
                cgaVar3 = bmi.a(cga.e);
            } else {
                cgaVar3 = cga.e;
            }
            bwjVar2 = c;
            a(z, dhsVar, amh.d(cgaVar.a(cgaVar3).a(cgaVar2), 2.0f), blbVar, c, ((i10 >> 9) & 14) | ((i10 << 3) & 112) | ((i10 >> 3) & 7168));
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass7(dhsVar, arqgVar, cgaVar, z, blbVar, ajrVar, i);
        }
    }
}
