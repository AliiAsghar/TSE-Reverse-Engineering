package defpackage;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import defpackage.ajw;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cru;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnb {
    public static final long a = cmh.a(0.5f, brg.a);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bnb$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqg<arnb> {
        final /* synthetic */ bpq a;
        final /* synthetic */ aap b;
        final /* synthetic */ aap c;
        final /* synthetic */ aap d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(bpq bpqVar, aap aapVar, aap aapVar2, aap aapVar3) {
            super(0);
            this.a = bpqVar;
            this.b = aapVar;
            this.c = aapVar2;
            this.d = aapVar3;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            bpq bpqVar = this.a;
            bpqVar.e = this.b;
            bpqVar.f = this.c;
            bpqVar.c = this.d;
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bnb$10, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass10 extends arrp implements arqr<dho, arnb> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(String str) {
            super(1);
            this.a = str;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            dho dhoVar = (dho) obj;
            dhl.i(dhoVar, this.a);
            dhl.t(dhoVar, brg.a);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bnb$11, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass11 extends arrp implements arqr<cle, arnb> {
        final /* synthetic */ bpq a;
        final /* synthetic */ zj b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(bpq bpqVar, zj zjVar) {
            super(1);
            this.a = bpqVar;
            this.b = zjVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            cle cleVar = (cle) obj;
            float c = this.a.d.c();
            float a = cjt.a(cleVar.a());
            if (!Float.isNaN(c) && !Float.isNaN(a) && a != brg.a) {
                float floatValue = ((Number) this.b.d()).floatValue();
                cleVar.x(bnb.a(cleVar, floatValue));
                cleVar.y(bnb.b(cleVar, floatValue));
                cleVar.C(cmh.a(0.5f, (c + a) / a));
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bnb$12, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass12 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ arqv a;
        final /* synthetic */ zj b;
        final /* synthetic */ bpq c;
        final /* synthetic */ arqw d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass12(arqv arqvVar, zj zjVar, bpq bpqVar, arqw arqwVar) {
            super(2);
            this.a = arqvVar;
            this.b = zjVar;
            this.c = bpqVar;
            this.d = arqwVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [and, java.lang.Object] */
        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            cga c;
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) != 2 || !bwjVar.L()) {
                c = amv.c(cga.e, 1.0f);
                cga b = anh.b(c, this.a.a(bwjVar, 0));
                boolean I = bwjVar.I(this.b);
                zj zjVar = this.b;
                Object h = bwjVar.h();
                if (I || h == bwj.a.a) {
                    h = new bnm(zjVar);
                    bwjVar.B(h);
                }
                cga a = bjx.a(cld.a(b, (arqr) h), this.c);
                arqw arqwVar = this.d;
                ajw.e eVar = ajw.c;
                int i = cfq.a;
                cue a2 = akk.a(eVar, cfq.a.m, bwjVar, 0);
                int a3 = bwg.a(bwjVar);
                bwy d = bwjVar.d();
                cga b2 = cfv.b(bwjVar, a);
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
                    Integer valueOf = Integer.valueOf(a3);
                    bwjVar.B(valueOf);
                    bwjVar.j(valueOf, arqvVar);
                }
                caw.b(bwjVar, b2, cwl.a.c);
                ako akoVar = ako.a;
                bwjVar.y(-1636515495);
                bwjVar.q();
                arqwVar.a(akoVar, bwjVar, 6);
                bwjVar.p();
            } else {
                bwjVar.v();
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bnb$13, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass13 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ ake a;
        final /* synthetic */ zj b;
        final /* synthetic */ arwe c;
        final /* synthetic */ arqg d;
        final /* synthetic */ arqr e;
        final /* synthetic */ cga f;
        final /* synthetic */ bpq g;
        final /* synthetic */ float h;
        final /* synthetic */ cmb i;
        final /* synthetic */ long j;
        final /* synthetic */ long k;
        final /* synthetic */ float l;
        final /* synthetic */ arqv m;
        final /* synthetic */ arqw n;
        final /* synthetic */ int o;
        final /* synthetic */ int p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass13(ake akeVar, zj zjVar, arwe arweVar, arqg arqgVar, arqr arqrVar, cga cgaVar, bpq bpqVar, float f, cmb cmbVar, long j, long j2, float f2, arqv arqvVar, arqw arqwVar, int i, int i2) {
            super(2);
            this.a = akeVar;
            this.b = zjVar;
            this.c = arweVar;
            this.d = arqgVar;
            this.e = arqrVar;
            this.f = cgaVar;
            this.g = bpqVar;
            this.h = f;
            this.i = cmbVar;
            this.j = j;
            this.k = j2;
            this.l = f2;
            this.m = arqvVar;
            this.n = arqwVar;
            this.o = i;
            this.p = i2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int i = this.o;
            int i2 = this.p;
            int a = bzh.a(i | 1);
            int a2 = bzh.a(i2);
            bnb.f(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (bwj) obj, a, a2);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bnb$14, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass14 extends arrp implements arqr<cny, arnb> {
        final /* synthetic */ long a;
        final /* synthetic */ cas b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass14(long j, cas casVar) {
            super(1);
            this.a = j;
            this.b = casVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            float floatValue;
            cny cnyVar = (cny) obj;
            floatValue = ((Number) this.b.a()).floatValue();
            cnw.l(cnyVar, this.a, 0L, 0L, arrn.q(floatValue, brg.a, 1.0f), null, 118);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bnb$15, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass15 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ long a;
        final /* synthetic */ arqg b;
        final /* synthetic */ boolean c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass15(long j, arqg arqgVar, boolean z, int i) {
            super(2);
            this.a = j;
            this.b = arqgVar;
            this.c = z;
            this.d = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            long j = this.a;
            arqg arqgVar = this.b;
            bnb.c(j, arqgVar, this.c, (bwj) obj, bzh.a(this.d | 1));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bnb$16, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass16 extends arpw implements arqv<crk, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ arqg b;
        private /* synthetic */ Object c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: bnb$16$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends arrp implements arqr<cjn, arnb> {
            final /* synthetic */ arqg a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(arqg arqgVar) {
                super(1);
                this.a = arqgVar;
            }

            @Override // defpackage.arqr
            public final /* synthetic */ Object a(Object obj) {
                long j = ((cjn) obj).a;
                this.a.a();
                return arnb.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass16(arqg arqgVar, arpe arpeVar) {
            super(2, arpeVar);
            this.b = arqgVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass16) c((crk) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                crk crkVar = (crk) this.c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b);
                this.a = 1;
                if (aik.g(crkVar, null, null, null, anonymousClass1, this, 7) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass16 anonymousClass16 = new AnonymousClass16(this.b, arpeVar);
            anonymousClass16.c = obj;
            return anonymousClass16;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bnb$17, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass17 extends arrp implements arqr<dho, arnb> {
        final /* synthetic */ String a;
        final /* synthetic */ arqg b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass17(String str, arqg arqgVar) {
            super(1);
            this.a = str;
            this.b = arqgVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            dho dhoVar = (dho) obj;
            dhl.t(dhoVar, 1.0f);
            dhl.f(dhoVar, this.a);
            dhl.e(dhoVar, null, new bnn(this.b));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bnb$18, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass18 extends arrp implements arqr<bps, Boolean> {
        public static final AnonymousClass18 a = new AnonymousClass18();

        public AnonymousClass18() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bnb$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqg<arnb> {
        final /* synthetic */ bpq a;
        final /* synthetic */ arwe b;
        final /* synthetic */ zj c;
        final /* synthetic */ arqg d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(bpq bpqVar, arwe arweVar, zj zjVar, arqg arqgVar) {
            super(0);
            this.a = bpqVar;
            this.b = arweVar;
            this.c = zjVar;
            this.d = arqgVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            if (this.a.c() == bps.b && this.a.i()) {
                arrn.J(this.b, null, null, new bnc(this.c, null), 3);
                arrn.J(this.b, null, null, new bnd(this.a, null), 3);
            } else {
                arrn.J(this.b, null, null, new bne(this.a, null), 3).s(new bnf(this.d));
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bnb$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ long a;
        final /* synthetic */ arqg b;
        final /* synthetic */ bpq c;
        final /* synthetic */ zj d;
        final /* synthetic */ arwe e;
        final /* synthetic */ arqr f;
        final /* synthetic */ cga g;
        final /* synthetic */ float h;
        final /* synthetic */ cmb i;
        final /* synthetic */ long j;
        final /* synthetic */ long k;
        final /* synthetic */ float l;
        final /* synthetic */ arqv m;
        final /* synthetic */ arqw n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(long j, arqg arqgVar, bpq bpqVar, zj zjVar, arwe arweVar, arqr arqrVar, cga cgaVar, float f, cmb cmbVar, long j2, long j3, float f2, arqv arqvVar, arqw arqwVar) {
            super(2);
            this.a = j;
            this.b = arqgVar;
            this.c = bpqVar;
            this.d = zjVar;
            this.e = arweVar;
            this.f = arqrVar;
            this.g = cgaVar;
            this.h = f;
            this.i = cmbVar;
            this.j = j2;
            this.k = j3;
            this.l = f2;
            this.m = arqvVar;
            this.n = arqwVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            cga b;
            cga c;
            boolean z;
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) != 2 || !bwjVar.L()) {
                b = amv.b(cga.e, 1.0f);
                c = dhb.c(ani.a(b), false, bng.a);
                long j = this.a;
                arqg arqgVar = this.b;
                bpq bpqVar = this.c;
                zj zjVar = this.d;
                arwe arweVar = this.e;
                arqr arqrVar = this.f;
                cga cgaVar = this.g;
                float f = this.h;
                cmb cmbVar = this.i;
                long j2 = this.j;
                long j3 = this.k;
                float f2 = this.l;
                arqv arqvVar = this.m;
                arqw arqwVar = this.n;
                int i = cfq.a;
                cue a = akc.a(cfq.a.a, false);
                int a2 = bwg.a(bwjVar);
                bwy d = bwjVar.d();
                cga b2 = cfv.b(bwjVar, c);
                int i2 = cwl.a;
                arqg arqgVar2 = cwl.a.a;
                bwjVar.N();
                bwjVar.A();
                if (bwjVar.K()) {
                    bwjVar.l(arqgVar2);
                } else {
                    bwjVar.C();
                }
                caw.b(bwjVar, a, cwl.a.e);
                caw.b(bwjVar, d, cwl.a.d);
                arqv arqvVar2 = cwl.a.f;
                if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a2))) {
                    Integer valueOf = Integer.valueOf(a2);
                    bwjVar.B(valueOf);
                    bwjVar.j(valueOf, arqvVar2);
                }
                caw.b(bwjVar, b2, cwl.a.c);
                akf akfVar = akf.a;
                if (((bps) bpqVar.d.l()) != bps.a) {
                    z = true;
                } else {
                    z = false;
                }
                bnb.c(j, arqgVar, z, bwjVar, 0);
                bnb.f(akfVar, zjVar, arweVar, arqgVar, arqrVar, cgaVar, bpqVar, f, cmbVar, j2, j3, f2, arqvVar, arqwVar, bwjVar, 70, 0);
                bwjVar.p();
            } else {
                bwjVar.v();
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bnb$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ bpq b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(bpq bpqVar, arpe arpeVar) {
            super(2, arpeVar);
            this.b = bpqVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass4) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                bpq bpqVar = this.b;
                this.a = 1;
                if (bpqVar.h(this) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass4(this.b, arpeVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bnb$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ arqg a;
        final /* synthetic */ cga b;
        final /* synthetic */ bpq c;
        final /* synthetic */ float d;
        final /* synthetic */ cmb e;
        final /* synthetic */ long f;
        final /* synthetic */ long g;
        final /* synthetic */ float h;
        final /* synthetic */ long i;
        final /* synthetic */ arqv j;
        final /* synthetic */ bno k;
        final /* synthetic */ arqw l;
        final /* synthetic */ int m;
        final /* synthetic */ int n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(arqg arqgVar, cga cgaVar, bpq bpqVar, float f, cmb cmbVar, long j, long j2, float f2, long j3, arqv arqvVar, bno bnoVar, arqw arqwVar, int i, int i2) {
            super(2);
            this.a = arqgVar;
            this.b = cgaVar;
            this.c = bpqVar;
            this.d = f;
            this.e = cmbVar;
            this.f = j;
            this.g = j2;
            this.h = f2;
            this.i = j3;
            this.j = arqvVar;
            this.k = bnoVar;
            this.l = arqwVar;
            this.m = i;
            this.n = i2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int i = this.m;
            int i2 = this.n;
            int a = bzh.a(i | 1);
            int a2 = bzh.a(i2);
            bnb.e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (bwj) obj, a, a2);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bnb$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends arrp implements arqg<arnb> {
        final /* synthetic */ bpq a;
        final /* synthetic */ arwe b;
        final /* synthetic */ arqg c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(bpq bpqVar, arwe arweVar, arqg arqgVar) {
            super(0);
            this.a = bpqVar;
            this.b = arweVar;
            this.c = arqgVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            if (((Boolean) this.a.d.b.a(bps.a)).booleanValue()) {
                arrn.J(this.b, null, null, new bnh(this.a, null), 3).s(new bni(this.a, this.c));
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bnb$7, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass7 extends arrp implements arqr<Float, arnb> {
        final /* synthetic */ arwe a;
        final /* synthetic */ bpq b;
        final /* synthetic */ arqg c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(arwe arweVar, bpq bpqVar, arqg arqgVar) {
            super(1);
            this.a = arweVar;
            this.b = bpqVar;
            this.c = arqgVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            arrn.J(this.a, null, null, new bnj(this.b, ((Number) obj).floatValue(), null), 3).s(new bnk(this.b, this.c));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bnb$8, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass8 extends arrp implements arqv<dri, dqs, armo<? extends bsw<bps>, ? extends bps>> {
        final /* synthetic */ bpq a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(bpq bpqVar) {
            super(2);
            this.a = bpqVar;
        }

        @Override // defpackage.arqv
        public final /* synthetic */ Object a(Object obj, Object obj2) {
            bps bpsVar;
            bsw a = bsq.a(new bnl(dqs.a(((dqs) obj2).a), ((dri) obj).a, this.a));
            bps bpsVar2 = (bps) this.a.d.l();
            bps bpsVar3 = bps.a;
            int ordinal = bpsVar2.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1 && ordinal != 2) {
                    throw new armm();
                }
                if (a.g(bps.c)) {
                    bpsVar = bps.c;
                } else if (a.g(bps.b)) {
                    bpsVar = bps.b;
                } else {
                    bpsVar = bps.a;
                }
            } else {
                bpsVar = bps.a;
            }
            return new armo(a, bpsVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bnb$9, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass9 extends arpw implements arqw<arwe, Float, arpe<? super arnb>, Object> {
        /* synthetic */ float a;
        final /* synthetic */ arqr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(arqr arqrVar, arpe arpeVar) {
            super(3, arpeVar);
            this.b = arqrVar;
        }

        @Override // defpackage.arqw
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            float floatValue = ((Number) obj2).floatValue();
            AnonymousClass9 anonymousClass9 = new AnonymousClass9(this.b, (arpe) obj3);
            anonymousClass9.a = floatValue;
            return anonymousClass9.b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            aqil.P(obj);
            this.b.a(new Float(this.a));
            return arnb.a;
        }
    }

    public static final float a(cle cleVar, float f) {
        float c = cjt.c(cleVar.a());
        if (Float.isNaN(c) || c == brg.a) {
            return 1.0f;
        }
        return 1.0f - (drv.b(brg.a, Math.min(cleVar.em(48.0f), c), f) / c);
    }

    public static final float b(cle cleVar, float f) {
        float a2 = cjt.a(cleVar.a());
        if (Float.isNaN(a2) || a2 == brg.a) {
            return 1.0f;
        }
        return 1.0f - (drv.b(brg.a, Math.min(cleVar.em(24.0f), a2), f) / a2);
    }

    public static final void c(long j, arqg arqgVar, boolean z, bwj bwjVar, int i) {
        int i2;
        float f;
        cga cgaVar;
        cga b;
        cga a2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 6;
        bwj c = bwjVar.c(951870469);
        boolean z3 = true;
        if (i6 == 0) {
            if (true != c.F(j)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.I(arqgVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (true != c.H(z)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c.L()) {
            c.v();
        } else if (j != 16) {
            if (true != z) {
                f = brg.a;
            } else {
                f = 1.0f;
            }
            cas c2 = zl.c(f, bnu.a(buz.d, c), null, c, 0, 28);
            String a3 = btp.a(R.string.close_sheet, c);
            c.y(-1785574670);
            if (z) {
                int i7 = i2 & 112;
                cga.a aVar = cga.e;
                bwk bwkVar = (bwk) c;
                Object T = bwkVar.T();
                if (i7 == 32 || T == bwj.a.a) {
                    T = new AnonymousClass16(arqgVar, null);
                    bwkVar.ad(T);
                }
                a2 = aVar.a(new SuspendPointerInputElement(arqgVar, null, null, new cru.AnonymousClass1((arqv) T), 6));
                boolean G = c.G(a3);
                if (i7 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z4 = z2 | G;
                Object T2 = bwkVar.T();
                if (z4 || T2 == bwj.a.a) {
                    T2 = new AnonymousClass17(a3, arqgVar);
                    bwkVar.ad(T2);
                }
                cgaVar = dhb.c(a2, true, (arqr) T2);
            } else {
                cgaVar = cga.e;
            }
            bwk bwkVar2 = (bwk) c;
            bwkVar2.Y();
            b = amv.b(cga.e, 1.0f);
            cga a4 = b.a(cgaVar);
            if ((i2 & 14) != 4) {
                z3 = false;
            }
            boolean G2 = c.G(c2) | z3;
            Object T3 = bwkVar2.T();
            if (G2 || T3 == bwj.a.a) {
                T3 = new AnonymousClass14(j, c2);
                bwkVar2.ad(T3);
            }
            adt.a(a4, (arqr) T3, c, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass15(j, arqgVar, z, i);
        }
    }

    public static final bpq d(boolean z, bwj bwjVar, int i, int i2) {
        boolean z2 = true;
        if (1 != ((z ? 1 : 0) & ((i2 & 1) ^ 1))) {
            z2 = false;
        }
        return bpn.a(z2, AnonymousClass18.a, bps.a, false, bwjVar, (i & 14) | 384, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x02ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(defpackage.arqg r28, defpackage.cga r29, defpackage.bpq r30, float r31, defpackage.cmb r32, long r33, long r35, float r37, long r38, defpackage.arqv r40, defpackage.bno r41, defpackage.arqw r42, defpackage.bwj r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 784
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnb.e(arqg, cga, bpq, float, cmb, long, long, float, long, arqv, bno, arqw, bwj, int, int):void");
    }

    public static final void f(ake akeVar, zj zjVar, arwe arweVar, arqg arqgVar, arqr arqrVar, cga cgaVar, bpq bpqVar, float f, cmb cmbVar, long j, long j2, float f2, arqv arqvVar, arqw arqwVar, bwj bwjVar, int i, int i2) {
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        int i4;
        boolean z4;
        cga c;
        cga a2;
        cga c2;
        int i5 = i & 6;
        bwj c3 = bwjVar.c(-1676960531);
        if (i5 == 0) {
            i3 = (true != c3.G(akeVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != ((i & 64) == 0 ? c3.G(zjVar) : c3.I(zjVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != c3.I(arweVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != c3.I(arqgVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            z = true;
            i3 |= true != c3.I(arqrVar) ? 8192 : 16384;
        } else {
            z = true;
        }
        if ((196608 & i) == 0) {
            i3 |= z != c3.G(cgaVar) ? 65536 : 131072;
        }
        if ((i & 1572864) == 0) {
            z2 = true;
            i3 |= true != c3.G(bpqVar) ? 524288 : 1048576;
        } else {
            z2 = true;
        }
        if ((12582912 & i) == 0) {
            i3 |= z2 != c3.D(f) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != c3.G(cmbVar) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != c3.F(j) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            z3 = true;
            i4 = (true != c3.F(j2) ? 2 : 4) | i2;
        } else {
            z3 = true;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= z3 == c3.D(f2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z4 = true;
            i4 |= true == c3.I(null) ? 256 : 128;
        } else {
            z4 = true;
        }
        if ((i2 & 3072) == 0) {
            i4 |= z4 == c3.I(arqvVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= z4 == c3.I(arqwVar) ? 16384 : 8192;
        }
        if ((306783379 & i3) == 306783378 && (i4 & 9363) == 9362 && c3.L()) {
            c3.v();
        } else {
            c3.w();
            if ((i & 1) != 0 && !c3.J()) {
                c3.v();
            }
            c3.n();
            String a3 = btp.a(R.string.m3c_bottom_sheet_pane_title, c3);
            int i6 = cfq.a;
            c = amv.c(amv.t(akeVar.a(cgaVar, cfq.a.b), brg.a, f, 1), 1.0f);
            int i7 = (3670016 & i3) ^ 1572864;
            boolean z5 = false;
            boolean z6 = (i7 > 1048576 && c3.G(bpqVar)) || (i3 & 1572864) == 1048576;
            bwk bwkVar = (bwk) c3;
            Object T = bwkVar.T();
            if (z6 || T == bwj.a.a) {
                T = new bpm(bpqVar, arqrVar, ahp.a);
                bwkVar.ad(T);
            }
            a2 = cqb.a(c, (cpz) T, null);
            bsr bsrVar = bpqVar.d;
            ahp ahpVar = ahp.a;
            boolean z7 = (i7 > 1048576 && c3.G(bpqVar)) || (i3 & 1572864) == 1048576;
            Object T2 = bwkVar.T();
            if (z7 || T2 == bwj.a.a) {
                T2 = new AnonymousClass8(bpqVar);
                bwkVar.ad(T2);
            }
            cga b = bsq.b(a2, bsrVar, ahpVar, (arqv) T2);
            ahk ahkVar = bpqVar.d.d;
            ahp ahpVar2 = ahp.a;
            boolean j3 = bpqVar.j();
            boolean q = bpqVar.d.q();
            int i8 = 57344 & i3;
            Object T3 = bwkVar.T();
            if (i8 == 16384 || T3 == bwj.a.a) {
                T3 = new AnonymousClass9(arqrVar, null);
                bwkVar.ad(T3);
            }
            cga a4 = ahh.a(b, ahkVar, ahpVar2, j3, null, q, (arqw) T3, false, 168);
            boolean G = c3.G(a3);
            Object T4 = bwkVar.T();
            if (G || T4 == bwj.a.a) {
                T4 = new AnonymousClass10(a3);
                bwkVar.ad(T4);
            }
            c2 = dhb.c(a4, false, (arqr) T4);
            boolean z8 = (i7 > 1048576 && c3.G(bpqVar)) || (1572864 & i3) == 1048576;
            if ((i3 & 112) == 32 || ((i3 & 64) != 0 && c3.I(zjVar))) {
                z5 = true;
            }
            boolean z9 = z8 | z5;
            Object T5 = bwkVar.T();
            if (z9 || T5 == bwj.a.a) {
                T5 = new AnonymousClass11(bpqVar, zjVar);
                bwkVar.ad(T5);
            }
            bqv.c(bjx.b(cld.a(c2, (arqr) T5), bpqVar), cmbVar, j, j2, f2, brg.a, null, cdk.e(-692668920, new AnonymousClass12(arqvVar, zjVar, bpqVar, arqwVar), c3), c3, 96);
        }
        bzz e = c3.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass13(akeVar, zjVar, arweVar, arqgVar, arqrVar, cgaVar, bpqVar, f, cmbVar, j, j2, f2, arqvVar, arqwVar, i, i2);
        }
    }
}
