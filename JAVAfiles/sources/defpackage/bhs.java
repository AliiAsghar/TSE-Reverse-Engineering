package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cwl;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhs {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bhs$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqw<arqv<? super bwj, ? super Integer, ? extends arnb>, bwj, Integer, arnb> {
        final /* synthetic */ bhm a;
        final /* synthetic */ bhm b;
        final /* synthetic */ List c;
        final /* synthetic */ bgr d;
        final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(bhm bhmVar, bhm bhmVar2, List list, bgr bgrVar, String str) {
            super(3);
            this.a = bhmVar;
            this.b = bhmVar2;
            this.c = list;
            this.d = bgrVar;
            this.e = str;
        }

        @Override // defpackage.arqw
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            int i;
            Boolean bool;
            zj zjVar;
            cga c;
            float f;
            float f2;
            int i2;
            arqv arqvVar = (arqv) obj;
            bwj bwjVar = (bwj) obj2;
            int intValue = ((Number) obj3).intValue();
            if ((intValue & 6) == 0) {
                if (true != bwjVar.I(arqvVar)) {
                    i2 = 2;
                } else {
                    i2 = 4;
                }
                intValue |= i2;
            }
            if ((intValue & 19) == 18 && bwjVar.L()) {
                bwjVar.v();
            } else {
                boolean F = d.F(this.a, this.b);
                int i3 = 75;
                if (true != F) {
                    i = 75;
                } else {
                    i = 150;
                }
                if (!F || dru.b(this.c).size() == 1) {
                    i3 = 0;
                }
                acf acfVar = new acf(i, i3, aao.d);
                boolean I = bwjVar.I(this.a) | bwjVar.I(this.d);
                bhm bhmVar = this.a;
                bgr bgrVar = this.d;
                Object h = bwjVar.h();
                if (I || h == bwj.a.a) {
                    h = new bhr(bhmVar, bgrVar);
                    bwjVar.B(h);
                }
                arqg arqgVar = (arqg) h;
                Object h2 = bwjVar.h();
                if (h2 == bwj.a.a) {
                    if (true != F) {
                        f2 = 1.0f;
                    } else {
                        f2 = brg.a;
                    }
                    h2 = zk.a(f2);
                    bwjVar.B(h2);
                }
                zj zjVar2 = (zj) h2;
                Boolean valueOf = Boolean.valueOf(F);
                boolean I2 = bwjVar.I(zjVar2) | bwjVar.H(F) | bwjVar.I(acfVar) | bwjVar.G(arqgVar);
                Object h3 = bwjVar.h();
                if (!I2 && h3 != bwj.a.a) {
                    bool = valueOf;
                    zjVar = zjVar2;
                } else {
                    bool = valueOf;
                    zjVar = zjVar2;
                    Object bhtVar = new bht(zjVar2, F, acfVar, arqgVar, null);
                    bwjVar.B(bhtVar);
                    h3 = bhtVar;
                }
                bxl.g(bool, (arqv) h3, bwjVar);
                zt ztVar = zjVar.b;
                acf acfVar2 = new acf(i, i3, aao.a);
                Object h4 = bwjVar.h();
                if (h4 == bwj.a.a) {
                    if (true != F) {
                        f = 1.0f;
                    } else {
                        f = 0.8f;
                    }
                    h4 = zk.a(f);
                    bwjVar.B(h4);
                }
                zj zjVar3 = (zj) h4;
                boolean I3 = bwjVar.I(zjVar3) | bwjVar.H(F) | bwjVar.I(acfVar2);
                Object h5 = bwjVar.h();
                if (I3 || h5 == bwj.a.a) {
                    h5 = new bhu(zjVar3, F, acfVar2, null);
                    bwjVar.B(h5);
                }
                bxl.g(bool, (arqv) h5, bwjVar);
                zt ztVar2 = zjVar3.b;
                cga b = cld.b(cga.e, ((Number) ztVar2.a()).floatValue(), ((Number) ztVar2.a()).floatValue(), ((Number) ztVar.a()).floatValue(), brg.a, brg.a, brg.a, brg.a, null, false, 0, 131064);
                boolean G = bwjVar.G(this.e) | bwjVar.I(this.a);
                String str = this.e;
                bhm bhmVar2 = this.a;
                Object h6 = bwjVar.h();
                if (G || h6 == bwj.a.a) {
                    h6 = new bhp(str, bhmVar2);
                    bwjVar.B(h6);
                }
                c = dhb.c(b, false, (arqr) h6);
                int i4 = cfq.a;
                cue a = akc.a(cfq.a.a, false);
                int a2 = bwg.a(bwjVar);
                bwy d = bwjVar.d();
                cga b2 = cfv.b(bwjVar, c);
                int i5 = cwl.a;
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
                    Object valueOf2 = Integer.valueOf(a2);
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
    /* renamed from: bhs$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ arqw a;
        final /* synthetic */ bhm b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(arqw arqwVar, bhm bhmVar) {
            super(2);
            this.a = arqwVar;
            this.b = bhmVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                arqw arqwVar = this.a;
                bhm bhmVar = this.b;
                bhmVar.getClass();
                arqwVar.a(bhmVar, bwjVar, 0);
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bhs$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ bhm a;
        final /* synthetic */ cga b;
        final /* synthetic */ arqw c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(bhm bhmVar, cga cgaVar, arqw arqwVar, int i) {
            super(2);
            this.a = bhmVar;
            this.b = cgaVar;
            this.c = arqwVar;
            this.d = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.d | 1);
            bhs.a(this.a, this.b, this.c, (bwj) obj, a);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bhs$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ bhm b;
        final /* synthetic */ dab c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(bhm bhmVar, dab dabVar, arpe arpeVar) {
            super(2, arpeVar);
            this.b = bhmVar;
            this.c = dabVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass4) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            long j;
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                bhm bhmVar = this.b;
                if (bhmVar != null) {
                    dab dabVar = this.c;
                    bhn a = bhmVar.a();
                    bhn bhnVar = bhn.a;
                    int ordinal = a.ordinal();
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
                        j = dabVar.a(j, false);
                    }
                    this.a = 1;
                    if (arwi.m(j, this) == arplVar) {
                        return arplVar;
                    }
                }
                return arnb.a;
            }
            this.b.c();
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass4(this.b, this.c, arpeVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bhs$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ bhv a;
        final /* synthetic */ cga b;
        final /* synthetic */ arqw c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(bhv bhvVar, cga cgaVar, arqw arqwVar, int i) {
            super(2);
            this.a = bhvVar;
            this.b = cgaVar;
            this.c = arqwVar;
            this.d = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.d | 1);
            bhs.b(this.a, this.b, this.c, (bwj) obj, a);
            return arnb.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [bhm, java.lang.Object] */
    public static final void a(bhm bhmVar, cga cgaVar, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        String str;
        int i3;
        int i4;
        boolean I;
        int i5;
        int i6 = i & 6;
        bwj c = bwjVar.c(2036134589);
        if (i6 == 0) {
            if ((i & 8) == 0) {
                I = c.G(bhmVar);
            } else {
                I = c.I(bhmVar);
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
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = new bgr();
                bwkVar.ad(T);
            }
            bgr bgrVar = (bgr) T;
            c.g(AndroidCompositionLocals_androidKt.a);
            Resources resources = ((Context) c.g(AndroidCompositionLocals_androidKt.b)).getResources();
            if (a.bA(7, 0)) {
                str = resources.getString(R.string.navigation_menu);
            } else if (a.bA(7, 1)) {
                str = resources.getString(R.string.close_drawer);
            } else if (a.bA(7, 2)) {
                str = resources.getString(R.string.close_sheet);
            } else if (a.bA(7, 3)) {
                str = resources.getString(R.string.default_error_message);
            } else if (a.bA(7, 4)) {
                str = resources.getString(R.string.dropdown_menu);
            } else if (a.bA(7, 5)) {
                str = resources.getString(R.string.range_start);
            } else if (a.bA(7, 6)) {
                str = resources.getString(R.string.range_end);
            } else if (a.bA(7, 7)) {
                str = resources.getString(R.string.mc2_snackbar_pane_title);
            } else {
                str = "";
            }
            String str2 = str;
            c.y(187643766);
            if (!d.F(bhmVar, bgrVar.a)) {
                bgrVar.a = bhmVar;
                List list = bgrVar.b;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i7 = 0; i7 < size; i7++) {
                    arrayList.add(((bgq) list.get(i7)).a);
                }
                List az = aqjn.az(arrayList);
                if (!az.contains(bhmVar)) {
                    az.add(bhmVar);
                }
                bgrVar.b.clear();
                List b = dru.b(az);
                List list2 = bgrVar.b;
                int size2 = b.size();
                int i8 = 0;
                while (i8 < size2) {
                    bhm bhmVar2 = (bhm) b.get(i8);
                    List list3 = list2;
                    list3.add(new bgq(bhmVar2, cdk.e(1471040642, new AnonymousClass1(bhmVar2, bhmVar, az, bgrVar, str2), c)));
                    i8++;
                    list2 = list3;
                    size2 = size2;
                    b = b;
                    az = az;
                }
            }
            bwkVar.Y();
            int i9 = cfq.a;
            cue a = akc.a(cfq.a.a, false);
            int a2 = bwg.a(c);
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
            caw.b(c, a, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b2, cwl.a.c);
            bgrVar.c = bwg.b(c);
            c.y(1801447460);
            List list4 = bgrVar.b;
            int size3 = list4.size();
            for (int i11 = 0; i11 < size3; i11++) {
                bgq bgqVar = (bgq) list4.get(i11);
                ?? r3 = bgqVar.a;
                arqw arqwVar2 = bgqVar.b;
                c.x(2123991584, r3);
                arqwVar2.a(cdk.e(2041982076, new AnonymousClass2(arqwVar, r3), c), c, 6);
                bwkVar.Y();
            }
            bwkVar.Y();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass3(bhmVar, cgaVar, arqwVar, i);
        }
    }

    public static final void b(bhv bhvVar, cga cgaVar, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 6;
        bwj c = bwjVar.c(431012348);
        if (i4 == 0) {
            if (true != c.G(bhvVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i5 = i2 | 432;
        if ((i5 & 147) == 146 && c.L()) {
            c.v();
        } else {
            cgaVar = cga.e;
            arqwVar = bfv.a;
            bhm a = bhvVar.a();
            dab dabVar = (dab) c.g(dch.a);
            boolean I = c.I(a) | c.I(dabVar);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (I || T == bwj.a.a) {
                T = new AnonymousClass4(a, dabVar, null);
                bwkVar.ad(T);
            }
            bxl.g(a, (arqv) T, c);
            a(bhvVar.a(), cgaVar, arqwVar, c, i5 & 1008);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass5(bhvVar, cgaVar, arqwVar, i);
        }
    }
}
