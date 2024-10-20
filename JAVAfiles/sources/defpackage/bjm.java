package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjm {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bjm$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ arqg a;
        final /* synthetic */ arqv b;
        final /* synthetic */ cga c;
        final /* synthetic */ arqv d;
        final /* synthetic */ arqv e;
        final /* synthetic */ arqv f;
        final /* synthetic */ arqv g;
        final /* synthetic */ cmb h;
        final /* synthetic */ long i;
        final /* synthetic */ long j;
        final /* synthetic */ long k;
        final /* synthetic */ long l;
        final /* synthetic */ float m;
        final /* synthetic */ dte n;
        final /* synthetic */ int o;
        final /* synthetic */ int p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(arqg arqgVar, arqv arqvVar, cga cgaVar, arqv arqvVar2, arqv arqvVar3, arqv arqvVar4, arqv arqvVar5, cmb cmbVar, long j, long j2, long j3, long j4, float f, dte dteVar, int i, int i2) {
            super(2);
            this.a = arqgVar;
            this.b = arqvVar;
            this.c = cgaVar;
            this.d = arqvVar2;
            this.e = arqvVar3;
            this.f = arqvVar4;
            this.g = arqvVar5;
            this.h = cmbVar;
            this.i = j;
            this.j = j2;
            this.k = j3;
            this.l = j4;
            this.m = f;
            this.n = dteVar;
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
            bjm.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (bwj) obj, a, a2);
            return arnb.a;
        }
    }

    public static final void a(arqg arqgVar, arqv arqvVar, cga cgaVar, arqv arqvVar2, arqv arqvVar3, arqv arqvVar4, arqv arqvVar5, cmb cmbVar, long j, long j2, long j3, long j4, float f, dte dteVar, bwj bwjVar, int i, int i2) {
        int i3;
        int i4;
        int i5 = i & 6;
        bwj c = bwjVar.c(-2081346864);
        if (i5 == 0) {
            i3 = (true != c.I(arqgVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != c.I(arqvVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != c.G(cgaVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != c.I(arqvVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != c.I(arqvVar3) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != c.I(arqvVar4) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != c.I(arqvVar5) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != c.G(cmbVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != c.F(j) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != c.F(j2) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != c.F(j3) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != c.F(j4) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != c.D(f) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != c.G(dteVar) ? 1024 : 2048;
        }
        if ((306783379 & i3) == 306783378 && (i4 & 1171) == 1170 && c.L()) {
            c.v();
        } else {
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
            }
            c.n();
            bji.a(arqgVar, arqvVar, cgaVar, arqvVar2, arqvVar3, arqvVar4, arqvVar5, cmbVar, j, j2, j3, j4, f, dteVar, c, i3 & 2147483646, i4 & 8190);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass1(arqgVar, arqvVar, cgaVar, arqvVar2, arqvVar3, arqvVar4, arqvVar5, cmbVar, j, j2, j3, j4, f, dteVar, i, i2);
        }
    }
}
