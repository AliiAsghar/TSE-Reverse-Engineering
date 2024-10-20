package defpackage;

import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ws {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ws$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ Object a;
        final /* synthetic */ cga b;
        final /* synthetic */ aap c;
        final /* synthetic */ String d;
        final /* synthetic */ arqw e;
        final /* synthetic */ int f;
        final /* synthetic */ int g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj, cga cgaVar, aap aapVar, String str, arqw arqwVar, int i, int i2) {
            super(2);
            this.a = obj;
            this.b = cgaVar;
            this.c = aapVar;
            this.d = str;
            this.e = arqwVar;
            this.f = i;
            this.g = i2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            ws.a(this.a, this.b, this.c, this.d, this.e, (bwj) obj, bzh.a(this.f | 1), this.g);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ws$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqr {
        final /* synthetic */ abt a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(abt abtVar) {
            super(1);
            this.a = abtVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return Boolean.valueOf(!d.F(obj, this.a.f()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ws$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ abt a;
        final /* synthetic */ aap b;
        final /* synthetic */ Object c;
        final /* synthetic */ arqw d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(abt abtVar, aap aapVar, Object obj, arqw arqwVar) {
            super(2);
            this.a = abtVar;
            this.b = aapVar;
            this.c = obj;
            this.d = arqwVar;
        }

        /* JADX WARN: Type inference failed for: r3v2, types: [aap, java.lang.Object] */
        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            float f;
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                abt abtVar = this.a;
                wu wuVar = new wu(this.b);
                Object obj3 = this.c;
                acg acgVar = aci.a;
                Object e = abtVar.e();
                bwjVar.y(-438678252);
                boolean F = d.F(e, obj3);
                float f2 = brg.a;
                if (true != F) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                bwjVar.q();
                Float valueOf = Float.valueOf(f);
                Object f3 = abtVar.f();
                bwjVar.y(-438678252);
                if (true == d.F(f3, obj3)) {
                    f2 = 1.0f;
                }
                bwjVar.q();
                cas e2 = aby.e(abtVar, valueOf, Float.valueOf(f2), wuVar.a(abtVar.d(), bwjVar, 0), acgVar, bwjVar, 0);
                cga.a aVar = cga.e;
                boolean G = bwjVar.G(e2);
                Object h = bwjVar.h();
                if (G || h == bwj.a.a) {
                    h = new wt(e2);
                    bwjVar.B(h);
                }
                cga a = cld.a(aVar, (arqr) h);
                arqw arqwVar = this.d;
                Object obj4 = this.c;
                int i = cfq.a;
                cue a2 = akc.a(cfq.a.a, false);
                int a3 = bwg.a(bwjVar);
                bwy d = bwjVar.d();
                cga b = cfv.b(bwjVar, a);
                int i2 = cwl.a;
                arqg arqgVar = cwl.a.a;
                bwjVar.N();
                bwjVar.A();
                if (bwjVar.K()) {
                    bwjVar.l(arqgVar);
                } else {
                    bwjVar.C();
                }
                caw.b(bwjVar, a2, cwl.a.e);
                caw.b(bwjVar, d, cwl.a.d);
                arqv arqvVar = cwl.a.f;
                if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a3))) {
                    Integer valueOf2 = Integer.valueOf(a3);
                    bwjVar.B(valueOf2);
                    bwjVar.j(valueOf2, arqvVar);
                }
                caw.b(bwjVar, b, cwl.a.c);
                arqwVar.a(obj4, bwjVar, 0);
                bwjVar.p();
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ws$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ abt a;
        final /* synthetic */ cga b;
        final /* synthetic */ aap c;
        final /* synthetic */ arqr d;
        final /* synthetic */ arqw e;
        final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(abt abtVar, cga cgaVar, aap aapVar, arqr arqrVar, arqw arqwVar, int i) {
            super(2);
            this.a = abtVar;
            this.b = cgaVar;
            this.c = aapVar;
            this.d = arqrVar;
            this.e = arqwVar;
            this.f = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            ws.b(this.a, this.b, this.c, this.d, this.e, (bwj) obj, bzh.a(this.f | 1));
            return arnb.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.Object r16, defpackage.cga r17, defpackage.aap r18, java.lang.String r19, defpackage.arqw r20, defpackage.bwj r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ws.a(java.lang.Object, cga, aap, java.lang.String, arqw, bwj, int, int):void");
    }

    public static final void b(abt abtVar, cga cgaVar, aap aapVar, arqr arqrVar, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        arqr arqrVar2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i & 6;
        bwj c = bwjVar.c(679005231);
        if (i7 == 0) {
            if (true != c.G(abtVar)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.G(cgaVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (true != c.I(aapVar)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        int i8 = i2 | 3072;
        if ((i & 24576) == 0) {
            if (true != c.I(arqwVar)) {
                i3 = 8192;
            } else {
                i3 = 16384;
            }
            i8 |= i3;
        }
        if ((i8 & 9363) == 9362 && c.L()) {
            c.v();
            arqrVar2 = arqrVar;
        } else {
            arqrVar2 = AnonymousClass2.a;
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            Object obj = T;
            if (T == bwj.a.a) {
                cez cezVar = new cez();
                cezVar.add(abtVar.e());
                bwkVar.ad(cezVar);
                obj = cezVar;
            }
            cez cezVar2 = (cez) obj;
            Object T2 = bwkVar.T();
            if (T2 == bwj.a.a) {
                T2 = new ve((byte[]) null);
                bwkVar.ad(T2);
            }
            ve veVar = (ve) T2;
            c.y(1274688586);
            if (d.F(abtVar.e(), abtVar.f()) && (cezVar2.a() != 1 || !d.F(cezVar2.get(0), abtVar.f()))) {
                int i9 = i8 & 14;
                Object T3 = bwkVar.T();
                if (i9 == 4 || T3 == bwj.a.a) {
                    T3 = new AnonymousClass3(abtVar);
                    bwkVar.ad(T3);
                }
                aqjn.Q(cezVar2, (arqr) T3);
                veVar.i();
            }
            bwkVar.Y();
            c.y(1274701238);
            if (!ve.e(veVar, abtVar.f())) {
                cff cffVar = new cff(cezVar2, 0);
                int i10 = 0;
                while (true) {
                    if (cffVar.hasNext()) {
                        if (d.F(cffVar.next(), abtVar.f())) {
                            break;
                        } else {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 == -1) {
                    cezVar2.add(abtVar.f());
                } else {
                    cezVar2.set(i10, abtVar.f());
                }
                veVar.i();
                int a = cezVar2.a();
                for (int i11 = 0; i11 < a; i11++) {
                    Object obj2 = cezVar2.get(i11);
                    veVar.j(obj2, cdk.e(-1426421288, new AnonymousClass4(abtVar, aapVar, obj2, arqwVar), c));
                }
            }
            bwkVar.Y();
            int i12 = cfq.a;
            cue a2 = akc.a(cfq.a.a, false);
            int a3 = bwg.a(c);
            byx P = bwkVar.P();
            cga b = cfv.b(c, cgaVar);
            int i13 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a2, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b, cwl.a.c);
            c.y(-187482672);
            int a4 = cezVar2.a();
            for (int i14 = 0; i14 < a4; i14++) {
                Object obj3 = cezVar2.get(i14);
                c.x(-1081874049, obj3);
                arqv arqvVar2 = (arqv) veVar.a(obj3);
                if (arqvVar2 != null) {
                    arqvVar2.a(c, 0);
                }
                bwkVar.Y();
            }
            bwkVar.Y();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass5(abtVar, cgaVar, aapVar, arqrVar2, arqwVar, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ws$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqr {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final Object a(Object obj) {
            return obj;
        }
    }
}
