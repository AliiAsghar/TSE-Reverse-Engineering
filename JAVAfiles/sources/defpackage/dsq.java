package defpackage;

import android.content.Context;
import defpackage.cwl;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsq {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dsq$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqr<bxi, bxh> {
        final /* synthetic */ dtg a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(dtg dtgVar) {
            super(1);
            this.a = dtgVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            this.a.show();
            return new dsp(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dsq$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqg<arnb> {
        final /* synthetic */ dtg a;
        final /* synthetic */ arqg b;
        final /* synthetic */ dte c;
        final /* synthetic */ drk d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(dtg dtgVar, arqg arqgVar, dte dteVar, drk drkVar) {
            super(0);
            this.a = dtgVar;
            this.b = arqgVar;
            this.c = dteVar;
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
    /* renamed from: dsq$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ arqg a;
        final /* synthetic */ dte b;
        final /* synthetic */ arqv c;
        final /* synthetic */ int d;
        final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(arqg arqgVar, dte dteVar, arqv arqvVar, int i, int i2) {
            super(2);
            this.a = arqgVar;
            this.b = dteVar;
            this.c = arqvVar;
            this.d = i;
            this.e = i2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            dsq.a(this.a, this.b, this.c, (bwj) obj, bzh.a(this.d | 1), this.e);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dsq$4, reason: invalid class name */
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
                c = dhb.c(cga.e, false, dsr.a);
                dsq.c(c, (arqv) this.a.a(), bwjVar, 0);
            } else {
                bwjVar.v();
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dsq$5, reason: invalid class name */
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.arqg r23, defpackage.dte r24, defpackage.arqv r25, defpackage.bwj r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsq.a(arqg, dte, arqv, bwj, int, int):void");
    }

    public static final boolean b(dte dteVar, Context context) {
        boolean z = dteVar.e;
        if (context.getApplicationInfo().targetSdkVersion < 35) {
            return true;
        }
        return false;
    }

    public static final /* synthetic */ void c(cga cgaVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 6;
        bwj c = bwjVar.c(-1177876616);
        if (i5 == 0) {
            if (true != c.G(cgaVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.I(arqvVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c.L()) {
            c.v();
        } else {
            int i6 = i2 >> 3;
            dss dssVar = dss.a;
            int a = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, cgaVar);
            int i7 = cwl.a;
            int i8 = (((((i2 << 3) & 112) | ((i6 & 14) | 384)) << 6) & 896) | 6;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, dssVar, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a))) {
                Integer valueOf = Integer.valueOf(a);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar2);
            }
            caw.b(c, b, cwl.a.c);
            arqvVar.a(c, Integer.valueOf((i8 >> 6) & 14));
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new dst(cgaVar, arqvVar, i);
        }
    }
}
