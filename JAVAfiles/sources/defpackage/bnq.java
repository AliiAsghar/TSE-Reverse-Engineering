package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cwl;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnq {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bnq$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqr<bxi, bxh> {
        final /* synthetic */ bna a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(bna bnaVar) {
            super(1);
            this.a = bnaVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            this.a.show();
            return new bnp(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bnq$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqg<arnb> {
        final /* synthetic */ bna a;
        final /* synthetic */ arqg b;
        final /* synthetic */ bno c;
        final /* synthetic */ drk d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(bna bnaVar, arqg arqgVar, bno bnoVar, drk drkVar) {
            super(0);
            this.a = bnaVar;
            this.b = arqgVar;
            this.c = bnoVar;
            this.d = drkVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            this.a.a(this.b, this.c, this.d);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bnq$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ arqg a;
        final /* synthetic */ bno b;
        final /* synthetic */ zj c;
        final /* synthetic */ arqv d;
        final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(arqg arqgVar, bno bnoVar, zj zjVar, arqv arqvVar, int i) {
            super(2);
            this.a = arqgVar;
            this.b = bnoVar;
            this.c = zjVar;
            this.d = arqvVar;
            this.e = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            bnq.a(this.a, this.b, this.c, this.d, (bwj) obj, bzh.a(this.e | 1));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bnq$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cas a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(cas casVar) {
            super(2);
            this.a = casVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            cga c;
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) != 2 || !bwjVar.L()) {
                c = dhb.c(cga.e, false, bnr.a);
                cas casVar = this.a;
                int i = cfq.a;
                cue a = akc.a(cfq.a.a, false);
                int a2 = bwg.a(bwjVar);
                bwy d = bwjVar.d();
                cga b = cfv.b(bwjVar, c);
                int i2 = cwl.a;
                arqg arqgVar = cwl.a.a;
                bwjVar.N();
                bwjVar.A();
                if (bwjVar.K()) {
                    bwjVar.l(arqgVar);
                } else {
                    bwjVar.C();
                }
                caw.b(bwjVar, a, cwl.a.e);
                caw.b(bwjVar, d, cwl.a.d);
                arqv arqvVar = cwl.a.f;
                if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a2))) {
                    Integer valueOf = Integer.valueOf(a2);
                    bwjVar.B(valueOf);
                    bwjVar.j(valueOf, arqvVar);
                }
                caw.b(bwjVar, b, cwl.a.c);
                ((arqv) casVar.a()).a(bwjVar, 0);
                bwjVar.p();
            } else {
                bwjVar.v();
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bnq$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqg<UUID> {
        public static final AnonymousClass5 a = new AnonymousClass5();

        public AnonymousClass5() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* synthetic */ Object a() {
            return UUID.randomUUID();
        }
    }

    public static final void a(arqg arqgVar, bno bnoVar, zj zjVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        boolean z;
        bwk bwkVar;
        boolean z2;
        drk drkVar;
        boolean z3;
        int i4;
        boolean I;
        int i5;
        int i6;
        int i7;
        int i8 = i & 6;
        bwj c = bwjVar.c(1254951810);
        if (i8 == 0) {
            if (true != c.I(arqgVar)) {
                i7 = 2;
            } else {
                i7 = 4;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.G(bnoVar)) {
                i6 = 16;
            } else {
                i6 = 32;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if ((i & 512) == 0) {
                I = c.G(zjVar);
            } else {
                I = c.I(zjVar);
            }
            if (true != I) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (true != c.I(arqvVar)) {
                i4 = 1024;
            } else {
                i4 = 2048;
            }
            i2 |= i4;
        }
        int i9 = i2;
        if ((i9 & 1171) == 1170 && c.L()) {
            c.v();
        } else {
            View view = (View) c.g(AndroidCompositionLocals_androidKt.f);
            dqv dqvVar = (dqv) c.g(dch.d);
            drk drkVar2 = (drk) c.g(dch.i);
            bwr c2 = bwg.c(c);
            cas a = cap.a(arqvVar, c);
            UUID uuid = (UUID) cdy.b(new Object[0], null, AnonymousClass5.a, c, 3072, 6);
            bwk bwkVar2 = (bwk) c;
            Object T = bwkVar2.T();
            if (T == bwj.a.a) {
                T = bxl.a(arpj.a, c);
                bwkVar2.ad(T);
            }
            arwe arweVar = (arwe) T;
            boolean a2 = aef.a(c);
            boolean G = c.G(view) | c.G(dqvVar);
            Object T2 = bwkVar2.T();
            if (!G && T2 != bwj.a.a) {
                i3 = i9;
                bwkVar = bwkVar2;
                z = true;
            } else {
                i3 = i9;
                z = true;
                bna bnaVar = new bna(arqgVar, bnoVar, view, drkVar2, dqvVar, uuid, zjVar, arweVar, a2);
                bnaVar.c.c(c2, new cdj(-1560960657, true, new AnonymousClass4(a)));
                bwkVar = bwkVar2;
                bwkVar.ad(bnaVar);
                T2 = bnaVar;
            }
            bna bnaVar2 = (bna) T2;
            boolean I2 = c.I(bnaVar2);
            Object T3 = bwkVar.T();
            if (I2 || T3 == bwj.a.a) {
                T3 = new AnonymousClass1(bnaVar2);
                bwkVar.ad(T3);
            }
            bxl.c(bnaVar2, (arqr) T3, c);
            boolean I3 = c.I(bnaVar2);
            if ((i3 & 14) == 4) {
                z2 = z;
            } else {
                z2 = false;
            }
            boolean z4 = I3 | z2;
            if ((i3 & 112) == 32) {
                z3 = z;
                drkVar = drkVar2;
            } else {
                drkVar = drkVar2;
                z3 = false;
            }
            boolean G2 = z4 | z3 | c.G(drkVar);
            Object T4 = bwkVar.T();
            if (G2 || T4 == bwj.a.a) {
                T4 = new AnonymousClass2(bnaVar2, arqgVar, bnoVar, drkVar);
                bwkVar.ad(T4);
            }
            bxl.h((arqg) T4, c);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass3(arqgVar, bnoVar, zjVar, arqvVar, i);
        }
    }
}
