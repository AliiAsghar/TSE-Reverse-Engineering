package defpackage;

import com.android.vcard.VCardConfig;
import defpackage.ajw;
import defpackage.bwj;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apf {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: apf$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ apb a;
        final /* synthetic */ cga b;
        final /* synthetic */ aqr c;
        final /* synthetic */ amj d;
        final /* synthetic */ ajw.e e;
        final /* synthetic */ ajw.b f;
        final /* synthetic */ ahl g;
        final /* synthetic */ boolean h;
        final /* synthetic */ arqr i;
        final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(apb apbVar, cga cgaVar, aqr aqrVar, amj amjVar, ajw.e eVar, ajw.b bVar, ahl ahlVar, boolean z, arqr arqrVar, int i) {
            super(2);
            this.a = apbVar;
            this.b = cgaVar;
            this.c = aqrVar;
            this.d = amjVar;
            this.e = eVar;
            this.f = bVar;
            this.g = ahlVar;
            this.h = z;
            this.i = arqrVar;
            this.j = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            apf.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (bwj) obj, bzh.a(this.j | 1));
            return arnb.a;
        }
    }

    public static final List a(int i, int i2, int i3) {
        int i4;
        int i5 = i - (i3 * (i2 - 1));
        int i6 = i5 / i2;
        int i7 = i5 % i2;
        ArrayList arrayList = new ArrayList(i2);
        for (int i8 = 0; i8 < i2; i8++) {
            if (i8 < i7) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            arrayList.add(Integer.valueOf(i4 + i6));
        }
        return arrayList;
    }

    public static final void b(apb apbVar, cga cgaVar, aqr aqrVar, amj amjVar, ajw.e eVar, ajw.b bVar, ahl ahlVar, boolean z, arqr arqrVar, bwj bwjVar, int i) {
        int i2;
        boolean z2;
        int i3;
        aqr aqrVar2;
        amj amkVar;
        ahl a;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        aqr aqrVar3;
        amj amjVar2;
        ahl ahlVar2;
        boolean z7;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        bwj c = bwjVar.c(1485410512);
        if ((i & 6) == 0) {
            if (true != c.G(apbVar)) {
                i8 = 2;
            } else {
                i8 = 4;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.G(cgaVar)) {
                i7 = 16;
            } else {
                i7 = 32;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        int i9 = i2 | 27648;
        if ((i & 196608) == 0) {
            if (true != c.G(eVar)) {
                i6 = 65536;
            } else {
                i6 = 131072;
            }
            i9 |= i6;
        }
        if ((1572864 & i) == 0) {
            if (true != c.G(bVar)) {
                i5 = 524288;
            } else {
                i5 = 1048576;
            }
            i9 |= i5;
        }
        if ((12582912 & i) == 0) {
            i9 |= 4194304;
        }
        int i10 = i9 | 100663296;
        if ((805306368 & i) == 0) {
            if (true != c.I(arqrVar)) {
                i4 = VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
            } else {
                i4 = 536870912;
            }
            i10 |= i4;
        }
        int i11 = i10;
        if ((306783379 & i11) == 306783378 && c.L()) {
            c.v();
            aqrVar3 = aqrVar;
            amjVar2 = amjVar;
            ahlVar2 = ahlVar;
            z7 = z;
        } else {
            int i12 = i11 >> 15;
            int i13 = i11 & (-29361025);
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
                aqrVar2 = aqrVar;
                amkVar = amjVar;
                a = ahlVar;
                z3 = z;
                z2 = false;
                i3 = i11;
            } else {
                aqe aqeVar = aqt.a;
                Object[] objArr = new Object[0];
                ceh cehVar = aqr.a;
                boolean E = c.E(0) | c.E(0);
                bwk bwkVar = (bwk) c;
                Object T = bwkVar.T();
                if (E || T == bwj.a.a) {
                    T = new aqu();
                    bwkVar.ad(T);
                }
                z2 = false;
                i3 = i11;
                aqrVar2 = (aqr) cdy.b(objArr, cehVar, (arqg) T, c, 0, 4);
                amkVar = new amk(brg.a, brg.a, brg.a, brg.a);
                a = ahx.a(c);
                z3 = true;
            }
            c.n();
            int i14 = i13 >> 3;
            int i15 = (i3 & 14) | (i12 & 112) | (i14 & 896);
            if ((((i15 & 14) ^ 6) > 4 && c.G(apbVar)) || (i15 & 6) == 4) {
                z4 = true;
            } else {
                z4 = z2;
            }
            if ((((i15 & 112) ^ 48) > 32 && c.G(bVar)) || (i15 & 48) == 32) {
                z5 = true;
            } else {
                z5 = z2;
            }
            boolean z8 = z5 | z4;
            if (((i15 & 896) ^ 384) > 256 && c.G(amkVar)) {
                z6 = true;
            } else {
                z6 = z2;
            }
            boolean z9 = z8 | z6;
            bwk bwkVar2 = (bwk) c;
            Object T2 = bwkVar2.T();
            if (z9 || T2 == bwj.a.a) {
                T2 = new apd(new apg(amkVar, apbVar, bVar));
                bwkVar2.ad(T2);
            }
            int i16 = i13 << 9;
            aqrVar3 = aqrVar2;
            aps.a(cgaVar, aqrVar3, (aqp) T2, amkVar, a, z3, eVar, bVar, arqrVar, c, (i14 & 14) | 196608 | (i3 & 7168) | (57344 & i3) | (i14 & 29360128) | (234881024 & i16) | (1879048192 & i16), (i3 >> 27) & 14);
            amjVar2 = amkVar;
            ahlVar2 = a;
            z7 = z3;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass1(apbVar, cgaVar, aqrVar3, amjVar2, eVar, bVar, ahlVar2, z7, arqrVar, i);
        }
    }
}
