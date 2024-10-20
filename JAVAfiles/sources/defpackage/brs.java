package defpackage;

import com.android.vcard.VCardConfig;
import defpackage.bru;
import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brs {
    public static final brs a = new brs();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: brs$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ String b;
        final /* synthetic */ arqv c;
        final /* synthetic */ boolean d;
        final /* synthetic */ doy e;
        final /* synthetic */ ajq f;
        final /* synthetic */ arqv g;
        final /* synthetic */ cmb h;
        final /* synthetic */ brr i;
        final /* synthetic */ amj j;
        final /* synthetic */ arqv k;
        final /* synthetic */ int l;
        final /* synthetic */ int m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, arqv arqvVar, boolean z, doy doyVar, ajq ajqVar, arqv arqvVar2, cmb cmbVar, brr brrVar, amj amjVar, arqv arqvVar3, int i, int i2) {
            super(2);
            this.b = str;
            this.c = arqvVar;
            this.d = z;
            this.e = doyVar;
            this.f = ajqVar;
            this.g = arqvVar2;
            this.h = cmbVar;
            this.i = brrVar;
            this.j = amjVar;
            this.k = arqvVar3;
            this.l = i;
            this.m = i2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int i = this.l;
            int i2 = this.m;
            int a = bzh.a(i | 1);
            int a2 = bzh.a(i2);
            brs.this.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (bwj) obj, a, a2);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: brs$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 implements ckx, arrk {
        private final /* synthetic */ arqg a;

        public AnonymousClass2(arqg arqgVar) {
            this.a = arqgVar;
        }

        @Override // defpackage.ckx
        public final /* synthetic */ long a() {
            return ((cku) ((arru) this.a).b()).i;
        }

        @Override // defpackage.arrk
        public final armh b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ckx) && (obj instanceof arrk)) {
                return d.F(this.a, ((arrk) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    private brs() {
    }

    public final void a(String str, arqv arqvVar, boolean z, doy doyVar, ajq ajqVar, arqv arqvVar2, cmb cmbVar, brr brrVar, amj amjVar, arqv arqvVar3, bwj bwjVar, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        bwj c = bwjVar.c(289640444);
        if ((i & 6) == 0) {
            if (true != c.G(str)) {
                i22 = 2;
            } else {
                i22 = 4;
            }
            i3 = i22 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.I(arqvVar)) {
                i21 = 16;
            } else {
                i21 = 32;
            }
            i3 |= i21;
        }
        if ((i & 384) == 0) {
            if (true != c.H(true)) {
                i20 = 128;
            } else {
                i20 = 256;
            }
            i3 |= i20;
        }
        if ((i & 3072) == 0) {
            if (true != c.H(z)) {
                i19 = 1024;
            } else {
                i19 = 2048;
            }
            i3 |= i19;
        }
        int i23 = 8192;
        if ((i & 24576) == 0) {
            if (true != c.G(doyVar)) {
                i18 = 8192;
            } else {
                i18 = 16384;
            }
            i3 |= i18;
        }
        if ((i & 196608) == 0) {
            if (true != c.G(ajqVar)) {
                i17 = 65536;
            } else {
                i17 = 131072;
            }
            i3 |= i17;
        }
        if ((i & 1572864) == 0) {
            if (true != c.H(false)) {
                i16 = 524288;
            } else {
                i16 = 1048576;
            }
            i3 |= i16;
        }
        if ((i & 12582912) == 0) {
            if (true != c.I(null)) {
                i15 = 4194304;
            } else {
                i15 = VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
            }
            i3 |= i15;
        }
        if ((100663296 & i) == 0) {
            if (true != c.I(arqvVar2)) {
                i14 = VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
            } else {
                i14 = VCardConfig.FLAG_APPEND_TYPE_PARAM;
            }
            i3 |= i14;
        }
        if ((805306368 & i) == 0) {
            if (true != c.I(null)) {
                i13 = VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
            } else {
                i13 = 536870912;
            }
            i3 |= i13;
        }
        if ((i2 & 6) == 0) {
            if (true != c.I(null)) {
                i12 = 2;
            } else {
                i12 = 4;
            }
            i4 = i12 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (true != c.I(null)) {
                i11 = 16;
            } else {
                i11 = 32;
            }
            i4 |= i11;
        }
        if ((i2 & 384) == 0) {
            if (true != c.I(null)) {
                i10 = 128;
            } else {
                i10 = 256;
            }
            i4 |= i10;
        }
        if ((i2 & 3072) == 0) {
            if (true != c.I(null)) {
                i9 = 1024;
            } else {
                i9 = 2048;
            }
            i4 |= i9;
        }
        if ((i2 & 24576) == 0) {
            if (true == c.G(cmbVar)) {
                i23 = 16384;
            }
            i4 |= i23;
        }
        if ((196608 & i2) == 0) {
            if (true != c.G(brrVar)) {
                i8 = 65536;
            } else {
                i8 = 131072;
            }
            i4 |= i8;
        }
        if ((i2 & 1572864) == 0) {
            if (true != c.G(amjVar)) {
                i7 = 524288;
            } else {
                i7 = 1048576;
            }
            i4 |= i7;
        }
        if ((12582912 & i2) == 0) {
            if (true != c.I(arqvVar3)) {
                i6 = 4194304;
            } else {
                i6 = VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
            }
            i4 |= i6;
        }
        if ((100663296 & i2) == 0) {
            if (true != c.G(this)) {
                i5 = VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
            } else {
                i5 = VCardConfig.FLAG_APPEND_TYPE_PARAM;
            }
            i4 |= i5;
        }
        if ((306783379 & i3) == 306783378 && (38347923 & i4) == 38347922 && c.L()) {
            c.v();
        } else {
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
            }
            c.n();
            if ((i3 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((57344 & i3) == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if ((z2 | z3) || T == bwj.a.a) {
                T = doyVar.a(new dhv(str, null, 6));
                bwkVar.ad(T);
            }
            String str2 = ((dow) T).a.b;
            bub bubVar = bub.a;
            bru.a aVar = new bru.a(null);
            c.y(-1299361056);
            bwkVar.Y();
            int i24 = i3 >> 9;
            int i25 = i4 << 21;
            btq.d(bubVar, str2, arqvVar, aVar, null, arqvVar2, null, null, z, true, false, ajqVar, amjVar, brrVar, arqvVar3, c, (29360128 & i25) | ((i3 << 3) & 896) | 6 | (i24 & 458752) | (3670016 & i24) | (234881024 & i25) | (1879048192 & i25), ((i3 >> 3) & 57344) | (i3 & 896) | ((i4 >> 9) & 14) | ((i3 >> 6) & 112) | (i24 & 7168) | ((i4 >> 3) & 458752) | ((i4 << 3) & 3670016) | (i4 & 29360128));
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass1(str, arqvVar, z, doyVar, ajqVar, arqvVar2, cmbVar, brrVar, amjVar, arqvVar3, i, i2);
        }
    }
}
