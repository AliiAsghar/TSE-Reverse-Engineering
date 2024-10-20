package defpackage;

import com.google.android.apps.messaging.R;
import defpackage.bqn;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cwl;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqk {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bqk$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqw<arqv<? super bwj, ? super Integer, ? extends arnb>, bwj, Integer, arnb> {
        final /* synthetic */ bqe a;
        final /* synthetic */ bqe b;
        final /* synthetic */ bly c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(bqe bqeVar, bqe bqeVar2, bly blyVar, String str) {
            super(3);
            this.a = bqeVar;
            this.b = bqeVar2;
            this.c = blyVar;
            this.d = str;
        }

        @Override // defpackage.arqw
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            cga c;
            float f;
            int i;
            arqv arqvVar = (arqv) obj;
            bwj bwjVar = (bwj) obj2;
            int intValue = ((Number) obj3).intValue();
            if ((intValue & 6) == 0) {
                if (true != bwjVar.I(arqvVar)) {
                    i = 2;
                } else {
                    i = 4;
                }
                intValue |= i;
            }
            if ((intValue & 19) == 18 && bwjVar.L()) {
                bwjVar.v();
            } else {
                boolean F = d.F(this.a, this.b);
                aap a = bnu.a(buz.e, bwjVar);
                boolean G = bwjVar.G(this.a) | bwjVar.I(this.c);
                bqe bqeVar = this.a;
                bly blyVar = this.c;
                Object h = bwjVar.h();
                if (G || h == bwj.a.a) {
                    h = new bqj(bqeVar, blyVar);
                    bwjVar.B(h);
                }
                arqg arqgVar = (arqg) h;
                Object h2 = bwjVar.h();
                float f2 = 1.0f;
                if (h2 == bwj.a.a) {
                    if (true != F) {
                        f = 1.0f;
                    } else {
                        f = brg.a;
                    }
                    h2 = zk.a(f);
                    bwjVar.B(h2);
                }
                zj zjVar = (zj) h2;
                Boolean valueOf = Boolean.valueOf(F);
                boolean I = bwjVar.I(zjVar) | bwjVar.H(F) | bwjVar.I(a) | bwjVar.G(arqgVar);
                Object h3 = bwjVar.h();
                if (I || h3 == bwj.a.a) {
                    Object bqlVar = new bql(zjVar, F, a, arqgVar, null);
                    bwjVar.B(bqlVar);
                    h3 = bqlVar;
                }
                bxl.g(valueOf, (arqv) h3, bwjVar);
                zt ztVar = zjVar.b;
                aap a2 = bnu.a(buz.b, bwjVar);
                Object h4 = bwjVar.h();
                if (h4 == bwj.a.a) {
                    if (true == F) {
                        f2 = 0.8f;
                    }
                    h4 = zk.a(f2);
                    bwjVar.B(h4);
                }
                zj zjVar2 = (zj) h4;
                boolean I2 = bwjVar.I(zjVar2) | bwjVar.H(F) | bwjVar.I(a2);
                Object h5 = bwjVar.h();
                if (I2 || h5 == bwj.a.a) {
                    h5 = new bqm(zjVar2, F, a2, null);
                    bwjVar.B(h5);
                }
                bxl.g(valueOf, (arqv) h5, bwjVar);
                zt ztVar2 = zjVar2.b;
                cga b = cld.b(cga.e, ((Number) ztVar2.a()).floatValue(), ((Number) ztVar2.a()).floatValue(), ((Number) ztVar.a()).floatValue(), brg.a, brg.a, brg.a, brg.a, null, false, 0, 131064);
                boolean G2 = bwjVar.G(this.a) | bwjVar.G(this.d);
                String str = this.d;
                bqe bqeVar2 = this.a;
                Object h6 = bwjVar.h();
                if (G2 || h6 == bwj.a.a) {
                    h6 = new bqh(str, bqeVar2);
                    bwjVar.B(h6);
                }
                c = dhb.c(b, false, (arqr) h6);
                int i2 = cfq.a;
                cue a3 = akc.a(cfq.a.a, false);
                int a4 = bwg.a(bwjVar);
                bwy d = bwjVar.d();
                cga b2 = cfv.b(bwjVar, c);
                int i3 = cwl.a;
                arqg arqgVar2 = cwl.a.a;
                bwjVar.N();
                bwjVar.A();
                if (bwjVar.K()) {
                    bwjVar.l(arqgVar2);
                } else {
                    bwjVar.C();
                }
                caw.b(bwjVar, a3, cwl.a.e);
                caw.b(bwjVar, d, cwl.a.d);
                arqv arqvVar2 = cwl.a.f;
                if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a4))) {
                    Object valueOf2 = Integer.valueOf(a4);
                    bwjVar.B(valueOf2);
                    bwjVar.j(valueOf2, arqvVar2);
                }
                caw.b(bwjVar, b2, cwl.a.c);
                arqvVar.a(bwjVar, Integer.valueOf(intValue & 14));
                bwjVar.p();
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bqk$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ arqw a;
        final /* synthetic */ bqe b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(arqw arqwVar, bqe bqeVar) {
            super(2);
            this.a = arqwVar;
            this.b = bqeVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                arqw arqwVar = this.a;
                bqe bqeVar = this.b;
                bqeVar.getClass();
                arqwVar.a(bqeVar, bwjVar, 0);
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bqk$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ bqe a;
        final /* synthetic */ cga b;
        final /* synthetic */ arqw c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(bqe bqeVar, cga cgaVar, arqw arqwVar, int i) {
            super(2);
            this.a = bqeVar;
            this.b = cgaVar;
            this.c = arqwVar;
            this.d = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.d | 1);
            bqk.b(this.a, this.b, this.c, (bwj) obj, a);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bqk$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ bqe b;
        final /* synthetic */ dab c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(bqe bqeVar, dab dabVar, arpe arpeVar) {
            super(2, arpeVar);
            this.b = bqeVar;
            this.c = dabVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass4) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            boolean z;
            long j;
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                bqe bqeVar = this.b;
                if (bqeVar != null) {
                    bqf bqfVar = ((bqn.b) bqeVar.a()).d;
                    if (((bqn.b) bqeVar.a()).b != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    dab dabVar = this.c;
                    int ordinal = bqfVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                j = Long.MAX_VALUE;
                            } else {
                                throw new armm();
                            }
                        } else {
                            j = 10000;
                        }
                    } else {
                        j = 4000;
                    }
                    if (dabVar != null) {
                        j = dabVar.a(j, z);
                    }
                    this.a = 1;
                    if (arwi.m(j, this) == arplVar) {
                        return arplVar;
                    }
                }
                return arnb.a;
            }
            this.b.b();
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass4(this.b, this.c, arpeVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bqk$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ bqn a;
        final /* synthetic */ cga b;
        final /* synthetic */ arqw c;
        final /* synthetic */ int d;
        final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(bqn bqnVar, cga cgaVar, arqw arqwVar, int i, int i2) {
            super(2);
            this.a = bqnVar;
            this.b = cgaVar;
            this.c = arqwVar;
            this.d = i;
            this.e = i2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            bqk.a(this.a, this.b, this.c, (bwj) obj, bzh.a(this.d | 1), this.e);
            return arnb.a;
        }
    }

    public static final void a(bqn bqnVar, cga cgaVar, arqw arqwVar, bwj bwjVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = i2 & 1;
        bwj c = bwjVar.c(464178177);
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (true != c.G(bqnVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (true != c.G(cgaVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i3 |= i5;
        }
        int i8 = i3 | 384;
        if ((i8 & 147) == 146 && c.L()) {
            c.v();
        } else {
            if (i7 != 0) {
                cgaVar = cga.e;
            }
            arqwVar = bln.a;
            bqe a = bqnVar.a();
            dab dabVar = (dab) c.g(dch.a);
            boolean G = c.G(a) | c.I(dabVar);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (G || T == bwj.a.a) {
                T = new AnonymousClass4(a, dabVar, null);
                bwkVar.ad(T);
            }
            bxl.g(a, (arqv) T, c);
            b(bqnVar.a(), cgaVar, arqwVar, c, i8 & 1008);
        }
        cga cgaVar2 = cgaVar;
        arqw arqwVar2 = arqwVar;
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass5(bqnVar, cgaVar2, arqwVar2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [bqe, java.lang.Object] */
    public static final void b(bqe bqeVar, cga cgaVar, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 6;
        bwj c = bwjVar.c(-1316639904);
        if (i6 == 0) {
            if (true != c.G(bqeVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.G(cgaVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (true != c.I(arqwVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c.L()) {
            c.v();
        } else {
            String a = btp.a(R.string.m3c_snackbar_pane_title, c);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = new bly();
                bwkVar.ad(T);
            }
            bly blyVar = (bly) T;
            c.y(-1256808570);
            if (!d.F(bqeVar, blyVar.a)) {
                blyVar.a = bqeVar;
                List list = blyVar.b;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i7 = 0; i7 < size; i7++) {
                    arrayList.add(((blx) list.get(i7)).a);
                }
                List az = aqjn.az(arrayList);
                if (!az.contains(bqeVar)) {
                    az.add(bqeVar);
                }
                blyVar.b.clear();
                List b = dru.b(az);
                List list2 = blyVar.b;
                int size2 = b.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    bqe bqeVar2 = (bqe) b.get(i8);
                    list2.add(new blx(bqeVar2, cdk.e(-1654683077, new AnonymousClass1(bqeVar2, bqeVar, blyVar, a), c)));
                }
            }
            bwkVar.Y();
            int i9 = cfq.a;
            cue a2 = akc.a(cfq.a.a, false);
            int a3 = bwg.a(c);
            byx P = bwkVar.P();
            cga b2 = cfv.b(c, cgaVar);
            int i10 = cwl.a;
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
            caw.b(c, b2, cwl.a.c);
            blyVar.c = bwg.b(c);
            c.y(1748070785);
            List list3 = blyVar.b;
            int size3 = list3.size();
            for (int i11 = 0; i11 < size3; i11++) {
                blx blxVar = (blx) list3.get(i11);
                ?? r10 = blxVar.a;
                arqw arqwVar2 = blxVar.b;
                c.x(1201061885, r10);
                arqwVar2.a(cdk.e(-1135367807, new AnonymousClass2(arqwVar, r10), c), c, 6);
                bwkVar.Y();
            }
            bwkVar.Y();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass3(bqeVar, cgaVar, arqwVar, i);
        }
    }
}
