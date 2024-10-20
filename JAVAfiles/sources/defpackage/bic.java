package defpackage;

import defpackage.cfq;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bic {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bic$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cga a;
        final /* synthetic */ cmb b;
        final /* synthetic */ long c;
        final /* synthetic */ float d;
        final /* synthetic */ float e;
        final /* synthetic */ arqv f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cga cgaVar, cmb cmbVar, long j, float f, float f2, arqv arqvVar) {
            super(2);
            this.a = cgaVar;
            this.b = cmbVar;
            this.c = j;
            this.d = f;
            this.e = f2;
            this.f = arqvVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                cga b = cru.b(dhb.c(bic.a(this.a, this.b, bic.c(this.c, (bgn) bwjVar.g(bgo.a), this.d, bwjVar), null, this.e), false, bia.a), arnb.a, new bib(null));
                arqv arqvVar = this.f;
                int i = cfq.a;
                cue a = akc.a(cfq.a.a, true);
                int a2 = bwg.a(bwjVar);
                bwy d = bwjVar.d();
                cga b2 = cfv.b(bwjVar, b);
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
                arqv arqvVar2 = cwl.a.f;
                if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a2))) {
                    Integer valueOf = Integer.valueOf(a2);
                    bwjVar.B(valueOf);
                    bwjVar.j(valueOf, arqvVar2);
                }
                caw.b(bwjVar, b2, cwl.a.c);
                arqvVar.a(bwjVar, 0);
                bwjVar.p();
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bic$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cga a;
        final /* synthetic */ cmb b;
        final /* synthetic */ long c;
        final /* synthetic */ long d;
        final /* synthetic */ float e;
        final /* synthetic */ arqv f;
        final /* synthetic */ int g;
        final /* synthetic */ int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(cga cgaVar, cmb cmbVar, long j, long j2, float f, arqv arqvVar, int i, int i2) {
            super(2);
            this.a = cgaVar;
            this.b = cmbVar;
            this.c = j;
            this.d = j2;
            this.e = f;
            this.f = arqvVar;
            this.g = i;
            this.h = i2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            bic.b(this.a, this.b, this.c, this.d, this.e, this.f, (bwj) obj, bzh.a(this.g | 1), this.h);
            return arnb.a;
        }
    }

    public static final cga a(cga cgaVar, cmb cmbVar, long j, adr adrVar, float f) {
        return chk.a(adf.a(chw.a(cgaVar, f, cmbVar, 0L, 0L, 24).a(cga.e), j, cmbVar), cmbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.cga r24, defpackage.cmb r25, long r26, long r28, float r30, defpackage.arqv r31, defpackage.bwj r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bic.b(cga, cmb, long, long, float, arqv, bwj, int, int):void");
    }

    public static final /* synthetic */ long c(long j, bgn bgnVar, float f, bwj bwjVar) {
        bwjVar.y(589120144);
        if (a.bB(j, bgu.a(bwjVar).l()) && bgnVar != null) {
            j = bgnVar.a(j, f, bwjVar);
        }
        bwjVar.q();
        return j;
    }
}
