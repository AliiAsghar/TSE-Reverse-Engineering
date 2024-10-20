package defpackage;

import com.android.vcard.VCardConfig;
import defpackage.brs;
import defpackage.bru;
import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnv {
    public static final bnv a = new bnv();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bnv$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ boolean b;
        final /* synthetic */ boolean c;
        final /* synthetic */ ajq d;
        final /* synthetic */ cga e;
        final /* synthetic */ brr f;
        final /* synthetic */ cmb g;
        final /* synthetic */ float h;
        final /* synthetic */ float i;
        final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, boolean z2, ajq ajqVar, cga cgaVar, brr brrVar, cmb cmbVar, float f, float f2, int i) {
            super(2);
            this.b = z;
            this.c = z2;
            this.d = ajqVar;
            this.e = cgaVar;
            this.f = brrVar;
            this.g = cmbVar;
            this.h = f;
            this.i = f2;
            this.j = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            bnv.this.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (bwj) obj, bzh.a(this.j | 1));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bnv$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqw<brv, bwj, Integer, arnb> {
        final /* synthetic */ arqv a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(arqv arqvVar) {
            super(3);
            this.a = arqvVar;
        }

        @Override // defpackage.arqw
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            bwj bwjVar = (bwj) obj2;
            if ((((Number) obj3).intValue() & 17) == 16 && bwjVar.L()) {
                bwjVar.v();
            } else {
                this.a.a(bwjVar, 0);
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bnv$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ String b;
        final /* synthetic */ arqv c;
        final /* synthetic */ boolean d;
        final /* synthetic */ boolean e;
        final /* synthetic */ doy f;
        final /* synthetic */ ajq g;
        final /* synthetic */ boolean h;
        final /* synthetic */ arqv i;
        final /* synthetic */ arqv j;
        final /* synthetic */ arqv k;
        final /* synthetic */ arqv l;
        final /* synthetic */ brr m;
        final /* synthetic */ amj n;
        final /* synthetic */ arqv o;
        final /* synthetic */ int p;
        final /* synthetic */ int q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, arqv arqvVar, boolean z, boolean z2, doy doyVar, ajq ajqVar, boolean z3, arqv arqvVar2, arqv arqvVar3, arqv arqvVar4, arqv arqvVar5, brr brrVar, amj amjVar, arqv arqvVar6, int i, int i2) {
            super(2);
            this.b = str;
            this.c = arqvVar;
            this.d = z;
            this.e = z2;
            this.f = doyVar;
            this.g = ajqVar;
            this.h = z3;
            this.i = arqvVar2;
            this.j = arqvVar3;
            this.k = arqvVar4;
            this.l = arqvVar5;
            this.m = brrVar;
            this.n = amjVar;
            this.o = arqvVar6;
            this.p = i;
            this.q = i2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int i = this.p;
            int i2 = this.q;
            int a = bzh.a(i | 1);
            int a2 = bzh.a(i2);
            bnv.this.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (bwj) obj, a, a2);
            return arnb.a;
        }
    }

    private bnv() {
    }

    public final void a(boolean z, boolean z2, ajq ajqVar, cga cgaVar, brr brrVar, cmb cmbVar, float f, float f2, bwj bwjVar, int i) {
        int i2;
        cga cgaVar2;
        float f3;
        float f4;
        long j;
        cas a2;
        cas a3;
        long j2;
        cga cgaVar3;
        float f5;
        float f6;
        float f7;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        bwj c = bwjVar.c(1035477640);
        if ((i & 6) == 0) {
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
            if (true != c.H(z2)) {
                i7 = 16;
            } else {
                i7 = 32;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (true != c.G(ajqVar)) {
                i6 = 128;
            } else {
                i6 = 256;
            }
            i2 |= i6;
        }
        int i9 = i2 | 3072;
        if ((i & 24576) == 0) {
            if (true != c.G(brrVar)) {
                i5 = 8192;
            } else {
                i5 = 16384;
            }
            i9 |= i5;
        }
        if ((196608 & i) == 0) {
            if (true != c.G(cmbVar)) {
                i4 = 65536;
            } else {
                i4 = 131072;
            }
            i9 |= i4;
        }
        if ((1572864 & i) == 0) {
            i9 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i9 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            if (true != c.G(this)) {
                i3 = VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
            } else {
                i3 = VCardConfig.FLAG_APPEND_TYPE_PARAM;
            }
            i9 |= i3;
        }
        if ((38347923 & i9) == 38347922 && c.L()) {
            c.v();
            cgaVar3 = cgaVar;
            f5 = f;
            f6 = f2;
        } else {
            int i10 = i9 & (-33030145);
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
                cgaVar2 = cgaVar;
                f3 = f;
                f4 = f2;
            } else {
                cgaVar2 = cga.e;
                f3 = 2.0f;
                f4 = 1.0f;
            }
            c.n();
            boolean booleanValue = ((Boolean) ajm.a(ajqVar, c, (i10 >> 6) & 14).a()).booleanValue();
            if (!z) {
                j = brrVar.h;
            } else if (z2) {
                j = brrVar.i;
            } else if (booleanValue) {
                j = brrVar.f;
            } else {
                j = brrVar.g;
            }
            aap a4 = bnu.a(buz.e, c);
            if (z) {
                c.y(1023528174);
                a2 = yw.a(j, a4, c);
                ((bwk) c).Y();
            } else {
                c.y(1023608929);
                a2 = cap.a(new cku(j), c);
                ((bwk) c).Y();
            }
            aap a5 = bnu.a(buz.b, c);
            if (z) {
                c.y(1023790341);
                if (true != booleanValue) {
                    f7 = f4;
                } else {
                    f7 = f3;
                }
                a3 = zl.b(f7, a5, c, 0, 12);
                ((bwk) c).Y();
            } else {
                c.y(1023972404);
                a3 = cap.a(new dqy(f4), c);
                ((bwk) c).Y();
            }
            cas a6 = cap.a(ads.a(((dqy) a3.a()).a, ((cku) a2.a()).i), c);
            if (!z) {
                j2 = brrVar.c;
            } else if (z2) {
                j2 = brrVar.d;
            } else if (booleanValue) {
                j2 = brrVar.a;
            } else {
                j2 = brrVar.b;
            }
            akc.b(cho.b(adl.b(cgaVar2, (adr) a6.a(), cmbVar), new bua(cmbVar, new brs.AnonymousClass2(new arru(yw.a(j2, bnu.a(buz.e, c), c)) { // from class: bnv.1
                @Override // defpackage.arru
                public final Object b() {
                    return ((cas) this.e).a();
                }
            }))), c, 0);
            cgaVar3 = cgaVar2;
            f5 = f3;
            f6 = f4;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass2(z, z2, ajqVar, cgaVar3, brrVar, cmbVar, f5, f6, i);
        }
    }

    public final void b(String str, arqv arqvVar, boolean z, boolean z2, doy doyVar, ajq ajqVar, boolean z3, arqv arqvVar2, arqv arqvVar3, arqv arqvVar4, arqv arqvVar5, brr brrVar, amj amjVar, arqv arqvVar6, bwj bwjVar, int i, int i2) {
        int i3;
        int i4;
        amj amkVar;
        byte[] bArr;
        Object a2;
        amj amjVar2;
        bwj c = bwjVar.c(-350442135);
        if ((i & 6) == 0) {
            i3 = (true != c.G(str) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != c.I(arqvVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != c.H(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != c.H(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != c.G(doyVar) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            i3 |= true != c.G(ajqVar) ? 65536 : 131072;
        }
        if ((i & 1572864) == 0) {
            i3 |= true != c.H(z3) ? 524288 : 1048576;
        }
        if ((i & 12582912) == 0) {
            i3 |= true != c.I(arqvVar2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != c.I(arqvVar3) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != c.I(null) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = (true != c.I(arqvVar4) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != c.I(null) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != c.I(null) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true == c.I(arqvVar5) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true == c.G(brrVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= true != c.I(arqvVar6) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i4 |= true != c.G(this) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((306783379 & i3) == 306783378 && (4793491 & i4) == 4793490 && c.L()) {
            c.v();
            amjVar2 = amjVar;
        } else {
            int i5 = i4 >> 9;
            int i6 = (-458753) & i4;
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
                amkVar = amjVar;
            } else {
                amkVar = new amk(16.0f, 16.0f, 16.0f, 16.0f);
            }
            c.n();
            boolean z4 = (i3 & 14) == 4;
            boolean z5 = (57344 & i3) == 16384;
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if ((z4 || z5) || T == bwj.a.a) {
                bArr = null;
                a2 = doyVar.a(new dhv(str, null, 6));
                bwkVar.ad(a2);
            } else {
                a2 = T;
                bArr = null;
            }
            String str2 = ((dow) a2).a.b;
            bub bubVar = bub.b;
            bru.a aVar = new bru.a(bArr);
            c.y(-1290179330);
            cdi e = arqvVar2 == null ? null : cdk.e(790581763, new AnonymousClass3(arqvVar2), c);
            bwkVar.Y();
            int i7 = i3 >> 9;
            int i8 = i6 << 21;
            btq.d(bubVar, str2, arqvVar, aVar, e, arqvVar3, arqvVar4, arqvVar5, z2, z, z3, ajqVar, amkVar, brrVar, arqvVar6, c, ((i3 << 3) & 896) | 6 | (i7 & 458752) | (i7 & 3670016) | (29360128 & i8) | (234881024 & i8) | (1879048192 & i8), ((i3 >> 3) & 57344) | (i5 & 14) | ((i3 >> 6) & 112) | (i3 & 896) | (i7 & 7168) | ((i6 << 6) & 3670016) | (29360128 & (i6 << 3)));
            amjVar2 = amkVar;
        }
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new AnonymousClass4(str, arqvVar, z, z2, doyVar, ajqVar, z3, arqvVar2, arqvVar3, arqvVar4, arqvVar5, brrVar, amjVar2, arqvVar6, i, i2);
        }
    }
}
