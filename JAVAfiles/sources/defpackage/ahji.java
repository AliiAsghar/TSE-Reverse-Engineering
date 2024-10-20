package defpackage;

import android.net.TrafficStats;
import android.os.Process;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.util.Pair;
import com.android.vcard.VCardConfig;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.bwj;
import defpackage.cga;
import defpackage.doy;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;
import java.util.function.Consumer;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahji {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A(defpackage.cga r24, long r25, float r27, long r28, int r30, float r31, defpackage.bwj r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahji.A(cga, long, float, long, int, float, bwj, int, int):void");
    }

    public static final void B(arqg arqgVar, cga cgaVar, long j, long j2, int i, float f, arqr arqrVar, bwj bwjVar, int i2) {
        int i3;
        boolean z;
        float f2;
        arqr arqrVar2;
        float f3;
        arqr arqrVar3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        arqgVar.getClass();
        int i9 = i2 & 14;
        bwj c = bwjVar.c(1664062262);
        boolean z2 = true;
        if (i9 == 0) {
            if (true != c.I(arqgVar)) {
                i8 = 2;
            } else {
                i8 = 4;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i7 = 16;
            } else {
                i7 = 32;
            }
            i3 |= i7;
        }
        if ((i2 & 896) == 0) {
            if (true != c.F(j)) {
                i6 = 128;
            } else {
                i6 = 256;
            }
            i3 |= i6;
        }
        if ((i2 & 7168) == 0) {
            if (true != c.F(j2)) {
                i5 = 1024;
            } else {
                i5 = 2048;
            }
            i3 |= i5;
        }
        if ((i2 & 57344) == 0) {
            if (true != c.E(i)) {
                i4 = 8192;
            } else {
                i4 = 16384;
            }
            i3 |= i4;
        }
        int i10 = 196608 | i3;
        if ((3670016 & i2) == 0) {
            i10 = i3 | 720896;
        }
        if ((2995931 & i10) == 599186 && c.L()) {
            c.v();
            f3 = f;
            arqrVar3 = arqrVar;
        } else {
            c.w();
            if ((i2 & 1) != 0 && !c.J()) {
                c.v();
                f2 = f;
                arqrVar2 = arqrVar;
            } else {
                c.y(-1613630304);
                if ((((i10 & 896) ^ 384) > 256 && c.F(j)) || (i10 & 384) == 256) {
                    z = true;
                } else {
                    z = false;
                }
                if ((57344 & i10) != 16384) {
                    z2 = false;
                }
                bwk bwkVar = (bwk) c;
                Object T = bwkVar.T();
                if ((z | z2) || T == bwj.a.a) {
                    T = new ahgq(j, i);
                    bwkVar.ad(T);
                }
                bwkVar.Y();
                f2 = 4.0f;
                arqrVar2 = (arqr) T;
            }
            c.n();
            bog.f(arqgVar, cgaVar, j, j2, i, f2, arqrVar2, c, i10 & 524286);
            f3 = f2;
            arqrVar3 = arqrVar2;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new ahgr(arqgVar, cgaVar, j, j2, i, f3, arqrVar3, i2, 0);
        }
    }

    @armg
    public static final void C(float f, cga cgaVar, long j, long j2, int i, bwj bwjVar, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i2 & 14;
        bwj c = bwjVar.c(425945727);
        int i10 = 1;
        if (i9 == 0) {
            if (true != c.D(f)) {
                i8 = 2;
            } else {
                i8 = 4;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i7 = 16;
            } else {
                i7 = 32;
            }
            i3 |= i7;
        }
        if ((i2 & 896) == 0) {
            if (true != c.F(j)) {
                i6 = 128;
            } else {
                i6 = 256;
            }
            i3 |= i6;
        }
        if ((i2 & 7168) == 0) {
            if (true != c.F(j2)) {
                i5 = 1024;
            } else {
                i5 = 2048;
            }
            i3 |= i5;
        }
        int i11 = i3 | 24576;
        if ((46811 & i11) == 9362 && c.L()) {
            c.v();
            i4 = i;
        } else {
            c.w();
            if ((i2 & 1) != 0 && !c.J()) {
                c.v();
                i10 = i;
            }
            c.n();
            c.y(-1613572926);
            int i12 = i11 & 14;
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (i12 == 4 || T == bwj.a.a) {
                T = new ahfm(f, 2);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            B((arqg) T, cgaVar, j, j2, i10, brg.a, null, c, i11 & 65520);
            i4 = i10;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new ahgs(f, cgaVar, j, j2, i4, i2);
        }
    }

    public static final void D(arqg arqgVar, cga cgaVar, long j, long j2, int i, float f, bwj bwjVar, int i2) {
        int i3;
        float f2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        arqgVar.getClass();
        bwj c = bwjVar.c(948952683);
        int i10 = 1;
        if ((i2 & 14) == 0) {
            if (true != c.I(arqgVar)) {
                i9 = 2;
            } else {
                i9 = 4;
            }
            i3 = i9 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i8 = 16;
            } else {
                i8 = 32;
            }
            i3 |= i8;
        }
        if ((i2 & 896) == 0) {
            if (true != c.F(j)) {
                i7 = 128;
            } else {
                i7 = 256;
            }
            i3 |= i7;
        }
        if ((i2 & 7168) == 0) {
            if (true != c.D(2.0f)) {
                i6 = 1024;
            } else {
                i6 = 2048;
            }
            i3 |= i6;
        }
        if ((57344 & i2) == 0) {
            if (true != c.F(j2)) {
                i5 = 8192;
            } else {
                i5 = 16384;
            }
            i3 |= i5;
        }
        int i11 = i3 | 1769472;
        if ((2995931 & i11) == 599186 && c.L()) {
            c.v();
            i4 = i;
            f2 = f;
        } else {
            c.w();
            if ((i2 & 1) != 0 && !c.J()) {
                c.v();
                i10 = i;
                f2 = f;
            } else {
                f2 = 4.0f;
            }
            c.n();
            bog.b(arqgVar, cgaVar, j, 2.0f, j2, i10, f2, c, i11 & 4194302, 0);
            i4 = i10;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new ahgo(arqgVar, cgaVar, j, j2, i4, f2, i2);
        }
    }

    public static final void E(doj dojVar, arqr arqrVar, cga cgaVar, boolean z, dje djeVar, arqv arqvVar, arqv arqvVar2, arqv arqvVar3, arqv arqvVar4, boolean z2, doy doyVar, ayc aycVar, ayb aybVar, int i, int i2, ajr ajrVar, cmb cmbVar, brr brrVar, bwj bwjVar, int i3, int i4, int i5) {
        int i6;
        int i7;
        dje djeVar2;
        doy doyVar2;
        cmb H;
        ajr ajrVar2;
        brr G;
        ayb aybVar2;
        int i8;
        boolean z3;
        int i9;
        boolean z4;
        ayb aybVar3;
        int i10;
        dje djeVar3;
        doy doyVar3;
        brr brrVar2;
        dojVar.getClass();
        arqrVar.getClass();
        bwj c = bwjVar.c(1370984951);
        if ((i3 & 14) == 0) {
            i6 = (true != c.G(dojVar) ? 2 : 4) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 112) == 0) {
            i6 |= true != c.I(arqrVar) ? 16 : 32;
        }
        if ((i3 & 896) == 0) {
            i6 |= true != c.G(cgaVar) ? 128 : 256;
        }
        int i11 = 458752;
        int i12 = i6 | 27648;
        if ((i3 & 458752) == 0) {
            i12 = i6 | 93184;
        }
        if ((3670016 & i3) == 0) {
            i12 |= true != c.I(arqvVar) ? 524288 : 1048576;
        }
        if ((29360128 & i3) == 0) {
            i12 |= true != c.I(arqvVar2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        int i13 = i12 | 100663296;
        if ((i3 & 1879048192) == 0) {
            i13 |= true != c.I(arqvVar3) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i4 & 14) == 0) {
            i7 = i4 | (true != c.I(arqvVar4) ? 2 : 4);
        } else {
            i7 = i4;
        }
        if ((i4 & 112) == 0) {
            i7 |= true != c.H(z2) ? 16 : 32;
        }
        int i14 = i7 | 384;
        if ((i4 & 7168) == 0) {
            i14 |= true != c.G(aycVar) ? 1024 : 2048;
            i11 = 458752;
        }
        int i15 = i14 | 24576;
        if ((i11 & i4) == 0) {
            i15 |= true != c.H(true) ? 65536 : 131072;
        }
        int i16 = i15 | 114819072;
        if ((1879048192 & i4) == 0) {
            i16 = i15 | 383254528;
        }
        int i17 = (i5 & 14) == 0 ? i5 | 2 : i5;
        if ((i13 & 1533916891) == 306783378 && (i16 & 1533916891) == 306783378 && (i17 & 11) == 2 && c.L()) {
            c.v();
            z4 = z;
            djeVar3 = djeVar;
            doyVar3 = doyVar;
            aybVar3 = aybVar;
            i10 = i;
            i9 = i2;
            ajrVar2 = ajrVar;
            H = cmbVar;
            brrVar2 = brrVar;
        } else {
            int i18 = i16 >> 24;
            int i19 = i16 & (-1879048193);
            c.w();
            if ((i3 & 1) != 0 && !c.J()) {
                c.v();
                z3 = z;
                djeVar2 = djeVar;
                doyVar2 = doyVar;
                aybVar2 = aybVar;
                i8 = i;
                i9 = i2;
                ajrVar2 = ajrVar;
                H = cmbVar;
                G = brrVar;
            } else {
                djeVar2 = (dje) c.g(brx.a);
                int i20 = doy.a;
                doyVar2 = doy.a.a;
                ayb aybVar4 = ayb.a;
                c.y(735066315);
                bwk bwkVar = (bwk) c;
                Object T = bwkVar.T();
                if (T == bwj.a.a) {
                    T = new ajs();
                    bwkVar.ad(T);
                }
                bwkVar.Y();
                H = H(c);
                ajrVar2 = (ajr) T;
                G = G(c);
                aybVar2 = aybVar4;
                i8 = Integer.MAX_VALUE;
                z3 = true;
                i9 = 1;
            }
            c.n();
            bny.b(dojVar, arqrVar, cgaVar, z3, djeVar2, arqvVar, arqvVar2, arqvVar3, arqvVar4, z2, doyVar2, aycVar, aybVar2, i8, i9, ajrVar2, H, G, c, i13 & 2147024894, (i19 << 6) & 2147483520, i18 & 14);
            z4 = z3;
            aybVar3 = aybVar2;
            i10 = i8;
            djeVar3 = djeVar2;
            doyVar3 = doyVar2;
            brrVar2 = G;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new ahgn(dojVar, arqrVar, cgaVar, z4, djeVar3, arqvVar, arqvVar2, arqvVar3, arqvVar4, z2, doyVar3, aycVar, aybVar3, i10, i9, ajrVar2, H, brrVar2, i3, i4, i5);
        }
    }

    public static final void F(String str, arqr arqrVar, cga cgaVar, boolean z, dje djeVar, arqv arqvVar, arqv arqvVar2, doy doyVar, ayc aycVar, ayb aybVar, int i, int i2, ajr ajrVar, cmb cmbVar, brr brrVar, bwj bwjVar, int i3, int i4, int i5) {
        int i6;
        doy doyVar2;
        ayb aybVar2;
        ajr ajrVar2;
        cmb H;
        brr G;
        int i7;
        boolean z2;
        int i8;
        dje djeVar2;
        dje djeVar3;
        boolean z3;
        int i9 = i3 & 14;
        bwj c = bwjVar.c(-544387420);
        if (i9 == 0) {
            i6 = (true != c.G(str) ? 2 : 4) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 112) == 0) {
            i6 |= true != c.I(arqrVar) ? 16 : 32;
        }
        if ((i3 & 896) == 0) {
            i6 |= true != c.G(cgaVar) ? 128 : 256;
        }
        int i10 = i6 | 27648;
        if ((458752 & i3) == 0) {
            i10 = i6 | 93184;
        }
        int i11 = 1572864 | i10;
        if ((29360128 & i3) == 0) {
            i11 |= true != c.I(arqvVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        int i12 = i11 | 100663296;
        if ((i3 & 1879048192) == 0) {
            i12 |= true != c.I(arqvVar2) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        int i13 = i4 | 438;
        if ((i4 & 7168) == 0) {
            i13 |= true != c.G(aycVar) ? 1024 : 2048;
        }
        int i14 = 115040256 | i13;
        if ((1879048192 & i4) == 0) {
            i14 = i13 | 383475712;
        }
        int i15 = (i5 & 14) == 0 ? i5 | 2 : i5;
        if ((i12 & 1533916891) == 306783378 && (1533916891 & i14) == 306783378 && (i15 & 11) == 2 && c.L()) {
            c.v();
            z3 = z;
            djeVar3 = djeVar;
            doyVar2 = doyVar;
            aybVar2 = aybVar;
            i7 = i;
            i8 = i2;
            ajrVar2 = ajrVar;
            H = cmbVar;
            G = brrVar;
        } else {
            int i16 = i14 >> 24;
            int i17 = (-1879048193) & i14;
            c.w();
            if ((i3 & 1) != 0 && !c.J()) {
                c.v();
                z2 = z;
                djeVar2 = djeVar;
                doyVar2 = doyVar;
                aybVar2 = aybVar;
                i7 = i;
                i8 = i2;
                ajrVar2 = ajrVar;
                H = cmbVar;
                G = brrVar;
            } else {
                dje djeVar4 = (dje) c.g(brx.a);
                int i18 = doy.a;
                doyVar2 = doy.a.a;
                aybVar2 = ayb.a;
                c.y(734864651);
                bwk bwkVar = (bwk) c;
                Object T = bwkVar.T();
                if (T == bwj.a.a) {
                    T = new ajs();
                    bwkVar.ad(T);
                }
                bwkVar.Y();
                ajrVar2 = (ajr) T;
                H = H(c);
                G = G(c);
                i7 = Integer.MAX_VALUE;
                z2 = true;
                i8 = 1;
                djeVar2 = djeVar4;
            }
            c.n();
            bny.a(str, arqrVar, cgaVar, z2, djeVar2, arqvVar, arqvVar2, doyVar2, aycVar, aybVar2, i7, i8, ajrVar2, H, G, c, i12 & 2147024894, (i17 << 6) & 2147483520, i16 & 14);
            djeVar3 = djeVar2;
            z3 = z2;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new ahgm(str, arqrVar, cgaVar, z3, djeVar3, arqvVar, arqvVar2, doyVar2, aycVar, aybVar2, i7, i8, ajrVar2, H, G, i3, i4, i5);
        }
    }

    public static final brr G(bwj bwjVar) {
        bwjVar.y(-231149431);
        long ab = ab(18, bwjVar);
        long ab2 = ab(18, bwjVar);
        long h = cku.h(ab(18, bwjVar), 0.38f);
        long ab3 = ab(18, bwjVar);
        long j = cku.g;
        long ab4 = ab(26, bwjVar);
        long ab5 = ab(2, bwjVar);
        bfo bfoVar = (bfo) bwjVar.g(bfp.a);
        long ab6 = ab(26, bwjVar);
        long ab7 = ab(24, bwjVar);
        long h2 = cku.h(ab(18, bwjVar), 0.12f);
        long ab8 = ab(2, bwjVar);
        long ab9 = ab(19, bwjVar);
        long ab10 = ab(19, bwjVar);
        long h3 = cku.h(ab(18, bwjVar), 0.38f);
        long ab11 = ab(19, bwjVar);
        long ab12 = ab(19, bwjVar);
        long ab13 = ab(19, bwjVar);
        long h4 = cku.h(ab(18, bwjVar), 0.38f);
        long ab14 = ab(2, bwjVar);
        long ab15 = ab(26, bwjVar);
        long ab16 = ab(19, bwjVar);
        long h5 = cku.h(ab(18, bwjVar), 0.38f);
        long ab17 = ab(2, bwjVar);
        long ab18 = ab(19, bwjVar);
        long ab19 = ab(19, bwjVar);
        long h6 = cku.h(ab(18, bwjVar), 0.38f);
        long ab20 = ab(19, bwjVar);
        long ab21 = ab(19, bwjVar);
        long ab22 = ab(19, bwjVar);
        long h7 = cku.h(ab(18, bwjVar), 0.38f);
        long ab23 = ab(2, bwjVar);
        long ab24 = ab(19, bwjVar);
        long ab25 = ab(19, bwjVar);
        long h8 = cku.h(ab(19, bwjVar), 0.38f);
        long ab26 = ab(19, bwjVar);
        long ab27 = ab(19, bwjVar);
        long ab28 = ab(19, bwjVar);
        long h9 = cku.h(ab(19, bwjVar), 0.38f);
        long ab29 = ab(19, bwjVar);
        blh a = bmp.a(bwjVar);
        brr brrVar = a.W;
        bwjVar.y(1540910445);
        if (brrVar == null) {
            brrVar = null;
        } else {
            bfo bfoVar2 = (bfo) bwjVar.g(bfp.a);
            if (!d.F(brrVar.e, bfoVar2)) {
                brrVar = brr.d(brrVar, bfoVar2);
                a.W = brrVar;
            }
        }
        bwk bwkVar = (bwk) bwjVar;
        bwkVar.Y();
        bwjVar.y(1540915088);
        if (brrVar == null) {
            buo buoVar = bvb.a;
            long b = bli.b(a, bvb.o);
            long b2 = bli.b(a, bvb.u);
            long h10 = cku.h(bli.b(a, bvb.b), 0.38f);
            long b3 = bli.b(a, bvb.i);
            long j2 = cku.g;
            brrVar = new brr(b, b2, h10, b3, j2, j2, j2, j2, bli.b(a, bvb.a), bli.b(a, bvb.h), (bfo) bwjVar.g(bfp.a), bli.b(a, bvb.r), bli.b(a, bvb.A), cku.h(bli.b(a, bvb.e), 0.12f), bli.b(a, bvb.l), bli.b(a, bvb.q), bli.b(a, bvb.z), cku.h(bli.b(a, bvb.d), 0.38f), bli.b(a, bvb.k), bli.b(a, bvb.t), bli.b(a, bvb.C), cku.h(bli.b(a, bvb.g), 0.38f), bli.b(a, bvb.n), bli.b(a, bvb.p), bli.b(a, bvb.y), cku.h(bli.b(a, bvb.c), 0.38f), bli.b(a, bvb.j), bli.b(a, bvb.v), bli.b(a, bvb.v), cku.h(bli.b(a, bvb.b), 0.38f), bli.b(a, bvb.v), bli.b(a, bvb.s), bli.b(a, bvb.B), cku.h(bli.b(a, bvb.f), 0.38f), bli.b(a, bvb.m), bli.b(a, bvb.w), bli.b(a, bvb.w), cku.h(bli.b(a, bvb.w), 0.38f), bli.b(a, bvb.w), bli.b(a, bvb.x), bli.b(a, bvb.x), cku.h(bli.b(a, bvb.x), 0.38f), bli.b(a, bvb.x));
            a.W = brrVar;
        }
        bwkVar.Y();
        brr c = brrVar.c(ab, ab2, h, ab3, j, j, j, j, ab4, ab5, bfoVar, ab6, ab7, h2, ab8, ab9, ab10, h3, ab11, ab12, ab13, h4, ab14, ab15, ab16, h5, ab17, ab18, ab19, h6, ab20, ab21, ab22, h7, ab23, ab24, ab25, h8, ab26, ab27, ab28, h9, ab29);
        bwkVar.Y();
        return c;
    }

    public static final cmb H(bwj bwjVar) {
        bwjVar.y(1795617127);
        cmb b = ahgv.b(5, bwjVar);
        ((bwk) bwjVar).Y();
        return b;
    }

    public static final void I(arqg arqgVar, cga cgaVar, bpq bpqVar, cmb cmbVar, long j, long j2, float f, long j3, and andVar, bno bnoVar, arqw arqwVar, bwj bwjVar, int i, int i2) {
        int i3;
        long Y;
        bno bnoVar2;
        float f2;
        long j4;
        float f3;
        bwj bwjVar2;
        bno bnoVar3;
        arqwVar.getClass();
        int i4 = i & 14;
        bwj c = bwjVar.c(-1078184055);
        if (i4 == 0) {
            i3 = (true != c.I(arqgVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= true != c.G(cgaVar) ? 16 : 32;
        }
        if ((i & 896) == 0) {
            i3 |= true != c.G(bpqVar) ? 128 : 256;
        }
        if ((i & 7168) == 0) {
            i3 |= true != c.G(cmbVar) ? 1024 : 2048;
        }
        if ((i & 57344) == 0) {
            i3 |= true != c.F(j) ? 8192 : 16384;
        }
        if ((i & 458752) == 0) {
            i3 |= 65536;
        }
        int i5 = i3 | 1572864;
        if ((i & 29360128) == 0) {
            i5 |= true != c.F(j3) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((i & 234881024) == 0) {
            i5 |= true != c.I(null) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((i & 1879048192) == 0) {
            i5 |= true != c.G(andVar) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        int i6 = (i2 & 14) == 0 ? i2 | 2 : i2;
        if ((i2 & 112) == 0) {
            i6 |= true != c.I(arqwVar) ? 16 : 32;
        }
        if ((1533916891 & i5) == 306783378 && (i6 & 91) == 18 && c.L()) {
            c.v();
            j4 = j2;
            f3 = f;
            bnoVar3 = bnoVar;
            bwjVar2 = c;
        } else {
            int i7 = i6 & (-15);
            int i8 = (-458753) & i5;
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
                Y = j2;
                f2 = f;
                bnoVar2 = bnoVar;
            } else {
                Y = Y(j, c);
                bno bnoVar4 = bmw.a;
                bnoVar2 = bmw.a;
                f2 = 1.0f;
            }
            c.n();
            int i9 = i8 << 3;
            int i10 = i9 & 234881024;
            int i11 = (i5 & 1022) | (57344 & i9) | (458752 & i9) | (i9 & 29360128) | i10 | (i9 & 1879048192);
            j4 = Y;
            f3 = f2;
            bwjVar2 = c;
            bnoVar3 = bnoVar2;
            bnb.e(arqgVar, cgaVar, bpqVar, brg.a, cmbVar, j, j4, f3, j3, new aeyl(andVar, 20), bnoVar3, arqwVar, bwjVar2, i11, (i7 << 3) & 896);
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new ahgk(arqgVar, cgaVar, bpqVar, cmbVar, j, j4, f3, j3, andVar, bnoVar3, arqwVar, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void J(boolean r33, defpackage.arqg r34, defpackage.cga r35, long r36, defpackage.afv r38, defpackage.dtn r39, defpackage.cmb r40, long r41, float r43, defpackage.arqw r44, defpackage.bwj r45, int r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahji.J(boolean, arqg, cga, long, afv, dtn, cmb, long, float, arqw, bwj, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void K(defpackage.arqv r30, defpackage.arqg r31, defpackage.cga r32, boolean r33, defpackage.bms r34, defpackage.amj r35, defpackage.ajr r36, defpackage.bwj r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahji.K(arqv, arqg, cga, boolean, bms, amj, ajr, bwj, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void L(defpackage.arqv r16, defpackage.cga r17, defpackage.arqv r18, defpackage.arqv r19, defpackage.bmj r20, defpackage.bwj r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahji.L(arqv, cga, arqv, arqv, bmj, bwj, int, int):void");
    }

    public static final bmj M(long j, bwj bwjVar, int i) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        bwjVar.y(408210655);
        if ((i & 1) != 0) {
            j2 = ab(35, bwjVar);
        } else {
            j2 = j;
        }
        long ab = ab(18, bwjVar);
        long ab2 = ab(19, bwjVar);
        long ab3 = ab(19, bwjVar);
        long ab4 = ab(19, bwjVar);
        long ab5 = ab(19, bwjVar);
        long h = cku.h(ab(18, bwjVar), 0.38f);
        long h2 = cku.h(ab(18, bwjVar), 0.38f);
        long h3 = cku.h(ab(18, bwjVar), 0.38f);
        int i2 = bmk.a;
        blh a = bmp.a(bwjVar);
        bmj bmjVar = a.S;
        if (bmjVar == null) {
            buo buoVar = buw.a;
            j3 = h3;
            bmjVar = new bmj(bli.b(a, buw.a), bli.b(a, buw.i), bli.b(a, buw.k), bli.b(a, buw.m), bli.b(a, buw.n), bli.b(a, buw.p), cku.h(bli.b(a, buw.c), buw.d), cku.h(bli.b(a, buw.e), buw.f), cku.h(bli.b(a, buw.g), buw.h));
            a.S = bmjVar;
        } else {
            j3 = h3;
        }
        if (j2 == 16) {
            j2 = bmjVar.a;
        }
        long j7 = j2;
        if (ab == 16) {
            ab = bmjVar.b;
        }
        long j8 = ab;
        if (ab2 == 16) {
            ab2 = bmjVar.c;
        }
        long j9 = ab2;
        if (ab3 == 16) {
            ab3 = bmjVar.d;
        }
        long j10 = ab3;
        if (ab4 == 16) {
            ab4 = bmjVar.e;
        }
        long j11 = ab5;
        long j12 = ab4;
        if (j11 == 16) {
            j11 = bmjVar.f;
        }
        long j13 = j11;
        if (h != 16) {
            j4 = h;
        } else {
            j4 = bmjVar.g;
        }
        if (h2 != 16) {
            j5 = h2;
        } else {
            j5 = bmjVar.h;
        }
        if (j3 != 16) {
            j6 = j3;
        } else {
            j6 = bmjVar.i;
        }
        bmj bmjVar2 = new bmj(j7, j8, j9, j10, j12, j13, j4, j5, j6);
        ((bwk) bwjVar).Y();
        return bmjVar2;
    }

    public static final void N(cor corVar, String str, cga cgaVar, long j, bwj bwjVar, int i, int i2) {
        cga cgaVar2;
        long j2;
        int i3;
        corVar.getClass();
        int i4 = i2 & 4;
        bwj c = bwjVar.c(-1924880865);
        if (i4 != 0) {
            cgaVar2 = cga.e;
        } else {
            cgaVar2 = cgaVar;
        }
        if ((i2 & 8) != 0) {
            i3 = i & (-7169);
            j2 = ((cku) c.g(blp.a)).i;
        } else {
            j2 = j;
            i3 = i;
        }
        bmd.a(corVar, str, cgaVar2, j2, c, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168), 0);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeok(corVar, str, cgaVar2, j2, i, i2, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void O(defpackage.cov r16, java.lang.String r17, defpackage.cga r18, long r19, defpackage.bwj r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahji.O(cov, java.lang.String, cga, long, bwj, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void P(defpackage.arqg r18, defpackage.cga r19, boolean r20, defpackage.bma r21, defpackage.cmb r22, defpackage.arqv r23, defpackage.bwj r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahji.P(arqg, cga, boolean, bma, cmb, arqv, bwj, int, int):void");
    }

    public static final bma Q(long j, long j2, bwj bwjVar, int i) {
        bwjVar.y(791995565);
        if ((i & 1) != 0) {
            j = cku.g;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = ((cku) bwjVar.g(blp.a)).i;
        }
        long j4 = j2;
        long j5 = cku.g;
        long h = cku.h(j4, 0.38f);
        int i2 = bmb.a;
        bma c = bmb.c(j3, j4, j5, h, bwjVar, 0);
        ((bwk) bwjVar).Y();
        return c;
    }

    public static /* synthetic */ bse R() {
        dje djeVar = ahia.a;
        dje djeVar2 = ahia.d;
        dje djeVar3 = ahia.e;
        dje djeVar4 = ahia.f;
        dje djeVar5 = ahia.g;
        dje djeVar6 = ahia.h;
        dje djeVar7 = ahia.i;
        dje djeVar8 = ahia.m;
        dje djeVar9 = ahia.n;
        dje djeVar10 = ahia.o;
        dje djeVar11 = ahia.a;
        dje djeVar12 = ahia.b;
        dje djeVar13 = ahia.c;
        dje djeVar14 = ahia.j;
        dje djeVar15 = ahia.k;
        dje djeVar16 = ahia.l;
        dje djeVar17 = ahhz.a;
        dje djeVar18 = ahhz.d;
        dje djeVar19 = ahhz.e;
        dje djeVar20 = ahhz.f;
        dje djeVar21 = ahhz.g;
        dje djeVar22 = ahhz.h;
        dje djeVar23 = ahhz.i;
        dje djeVar24 = ahhz.m;
        dje djeVar25 = ahhz.n;
        dje djeVar26 = ahhz.o;
        dje djeVar27 = ahhz.a;
        dje djeVar28 = ahhz.b;
        dje djeVar29 = ahhz.c;
        dje djeVar30 = ahhz.j;
        dje djeVar31 = ahhz.k;
        dje djeVar32 = ahhz.l;
        djeVar2.getClass();
        djeVar3.getClass();
        djeVar4.getClass();
        djeVar5.getClass();
        djeVar6.getClass();
        djeVar7.getClass();
        djeVar8.getClass();
        djeVar9.getClass();
        djeVar10.getClass();
        djeVar11.getClass();
        djeVar12.getClass();
        djeVar13.getClass();
        djeVar14.getClass();
        djeVar15.getClass();
        djeVar16.getClass();
        djeVar18.getClass();
        djeVar19.getClass();
        djeVar20.getClass();
        djeVar21.getClass();
        djeVar22.getClass();
        djeVar23.getClass();
        djeVar24.getClass();
        djeVar25.getClass();
        djeVar26.getClass();
        djeVar27.getClass();
        djeVar28.getClass();
        djeVar29.getClass();
        djeVar30.getClass();
        djeVar31.getClass();
        djeVar32.getClass();
        return new bse(djeVar2, djeVar3, djeVar4, djeVar5, djeVar6, djeVar7, djeVar8, djeVar9, djeVar10, djeVar11, djeVar12, djeVar13, djeVar14, djeVar15, djeVar16, djeVar18, djeVar19, djeVar20, djeVar21, djeVar22, djeVar23, djeVar24, djeVar25, djeVar26, djeVar27, djeVar28, djeVar29, djeVar30, djeVar31, djeVar32);
    }

    public static final dje S(bse bseVar, int i) {
        bseVar.getClass();
        if (i != 0) {
            switch (i - 1) {
                case 0:
                    return bseVar.j;
                case 1:
                    return bseVar.k;
                case 2:
                    return bseVar.l;
                case 3:
                    return bseVar.a;
                case 4:
                    return bseVar.b;
                case 5:
                    return bseVar.c;
                case 6:
                    return bseVar.d;
                case 7:
                    return bseVar.e;
                case 8:
                    return bseVar.f;
                case 9:
                    return bseVar.m;
                case 10:
                    return bseVar.n;
                case 11:
                default:
                    return bseVar.o;
                case 12:
                    return bseVar.g;
                case 13:
                    return bseVar.h;
                case 14:
                    return bseVar.i;
            }
        }
        throw null;
    }

    public static final long T(long j, float f) {
        boolean z;
        double pow;
        double d = f;
        boolean z2 = true;
        if (d < 1.0E-4d) {
            z = true;
        } else {
            z = false;
        }
        if (d <= 99.9999d) {
            z2 = false;
        }
        if (z | z2) {
            float f2 = (f + 16.0f) / 116.0f;
            float f3 = f2 * f2 * f2;
            if (f3 <= 0.008856452f) {
                f3 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
            }
            double d2 = (f3 * 100.0f) / 100.0f;
            if (d2 <= 0.0031308d) {
                pow = d2 * 12.92d;
            } else {
                pow = (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d;
            }
            int c = dze.c(arsk.f(pow * 255.0d), 0, 255);
            return ckw.k(c, c, c);
        }
        float[] fArr = cms.a;
        long e = cku.e(j, cms.t);
        return cku.e(ckw.j(f, cku.c(e), cku.b(e), brg.a, cms.t, 8), cms.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0057  */
    @defpackage.armg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void U(defpackage.cga r14, float r15, long r16, defpackage.bwj r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahji.U(cga, float, long, bwj, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void V(defpackage.cga r14, float r15, long r16, defpackage.bwj r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahji.V(cga, float, long, bwj, int, int):void");
    }

    public static final void W(cga cgaVar, long j, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(634017535);
        if (i6 == 0) {
            if (true != c.G(cgaVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.D(1.0f)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c.F(j)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
            }
            c.n();
            blt.c(cgaVar, j, c, i2 & 1022);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aejz(cgaVar, j, i, 3);
        }
    }

    public static final long X(bwj bwjVar) {
        bwjVar.y(-1483115615);
        long ab = ab(25, bwjVar);
        ((bwk) bwjVar).Y();
        return ab;
    }

    public static final long Y(long j, bwj bwjVar) {
        long j2;
        blh a = bmp.a(bwjVar);
        a.getClass();
        if (a.bB(j, a.a)) {
            j2 = a.b;
        } else if (a.bB(j, a.f)) {
            j2 = a.g;
        } else if (a.bB(j, a.j)) {
            j2 = a.k;
        } else if (a.bB(j, a.n)) {
            j2 = a.o;
        } else if (a.bB(j, a.w)) {
            j2 = a.x;
        } else {
            if (!a.bB(j, a.p)) {
                if (a.bB(j, a.r)) {
                    j2 = a.s;
                } else if (a.bB(j, a.c)) {
                    j2 = a.d;
                } else if (a.bB(j, a.h)) {
                    j2 = a.i;
                } else if (a.bB(j, a.l)) {
                    j2 = a.m;
                } else if (a.bB(j, a.y)) {
                    j2 = a.z;
                } else if (a.bB(j, a.u)) {
                    j2 = a.v;
                } else if (!a.bB(j, a.F) && !a.bB(j, a.G) && !a.bB(j, a.H) && !a.bB(j, a.I) && !a.bB(j, a.J) && !a.bB(j, a.D) && !a.bB(j, a.E)) {
                    j2 = cku.h;
                }
            }
            j2 = a.q;
        }
        if (j2 != 16) {
            return j2;
        }
        return ((cku) bwjVar.g(blp.a)).i;
    }

    public static /* synthetic */ blh Z(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, int i, int i2) {
        long j33;
        long j34;
        long j35;
        long j36;
        long j37;
        long j38;
        long j39;
        long j40;
        long j41;
        long j42;
        long j43;
        long j44;
        long j45;
        long j46;
        long j47;
        long j48;
        long j49;
        long j50;
        long j51;
        long j52;
        long j53;
        long j54;
        long j55;
        long j56;
        long j57;
        long j58;
        long j59;
        long j60;
        long j61;
        long j62;
        long j63;
        long j64;
        long j65;
        long j66;
        long j67;
        long j68;
        if ((i & 1) != 0) {
            long j69 = ahhp.a;
            j33 = ahhp.t;
        } else {
            j33 = j;
        }
        if ((i & 2) != 0) {
            long j70 = ahhp.a;
            j34 = ahhp.j;
        } else {
            j34 = j2;
        }
        if ((i & 4) != 0) {
            long j71 = ahhp.a;
            j35 = ahhp.u;
        } else {
            j35 = j3;
        }
        if ((i & 8) != 0) {
            long j72 = ahhp.a;
            j36 = ahhp.k;
        } else {
            j36 = j4;
        }
        if ((i & 16) != 0) {
            long j73 = ahhp.a;
            j37 = ahhp.e;
        } else {
            j37 = j5;
        }
        if ((i & 32) != 0) {
            long j74 = ahhp.a;
            j38 = ahhp.w;
        } else {
            j38 = j6;
        }
        if ((i & 64) != 0) {
            long j75 = ahhp.a;
            j39 = ahhp.l;
        } else {
            j39 = j7;
        }
        if ((i & 128) != 0) {
            long j76 = ahhp.a;
            j40 = ahhp.x;
        } else {
            j40 = j8;
        }
        if ((i & 256) != 0) {
            long j77 = ahhp.a;
            j41 = ahhp.m;
        } else {
            j41 = j9;
        }
        if ((i & 512) != 0) {
            long j78 = ahhp.a;
            j42 = ahhp.I;
        } else {
            j42 = j10;
        }
        if ((i & 1024) != 0) {
            long j79 = ahhp.a;
            j43 = ahhp.p;
        } else {
            j43 = j11;
        }
        if ((i & 2048) != 0) {
            long j80 = ahhp.a;
            j44 = ahhp.J;
        } else {
            j44 = j12;
        }
        if ((i & 4096) != 0) {
            long j81 = ahhp.a;
            j45 = ahhp.q;
        } else {
            j45 = j13;
        }
        if ((i & 8192) != 0) {
            long j82 = ahhp.a;
            j46 = ahhp.a;
        } else {
            j46 = j14;
        }
        if ((i & 16384) != 0) {
            long j83 = ahhp.a;
            j47 = ahhp.g;
        } else {
            j47 = j15;
        }
        if ((32768 & i) != 0) {
            long j84 = ahhp.a;
            j48 = ahhp.y;
        } else {
            j48 = j16;
        }
        if ((65536 & i) != 0) {
            long j85 = ahhp.a;
            j49 = ahhp.n;
        } else {
            j49 = j17;
        }
        if ((131072 & i) != 0) {
            long j86 = ahhp.a;
            j50 = ahhp.H;
        } else {
            j50 = j18;
        }
        if ((262144 & i) != 0) {
            long j87 = ahhp.a;
            j51 = ahhp.o;
        } else {
            j51 = j19;
        }
        if ((524288 & i) != 0) {
            long j88 = ahhp.a;
            j52 = ahhp.f;
        } else {
            j52 = j20;
        }
        if ((1048576 & i) != 0) {
            long j89 = ahhp.a;
            j53 = ahhp.d;
        } else {
            j53 = j21;
        }
        if ((2097152 & i) != 0) {
            long j90 = ahhp.a;
            j54 = ahhp.G;
        } else {
            j54 = j22;
        }
        if ((4194304 & i) != 0) {
            long j91 = ahhp.a;
            j55 = ahhp.b;
        } else {
            j55 = 0;
        }
        if ((8388608 & i) != 0) {
            long j92 = ahhp.a;
            j56 = ahhp.h;
        } else {
            j56 = 0;
        }
        if ((16777216 & i) != 0) {
            long j93 = ahhp.a;
            j57 = ahhp.c;
        } else {
            j57 = 0;
        }
        if ((33554432 & i) != 0) {
            long j94 = ahhp.a;
            j58 = ahhp.i;
        } else {
            j58 = 0;
        }
        if ((67108864 & i) != 0) {
            long j95 = ahhp.a;
            j59 = ahhp.r;
        } else {
            j59 = j23;
        }
        if ((134217728 & i) != 0) {
            long j96 = ahhp.a;
            j60 = ahhp.s;
        } else {
            j60 = j24;
        }
        if ((268435456 & i) != 0) {
            long j97 = ahhp.a;
            j61 = ahhp.v;
        } else {
            j61 = j25;
        }
        if ((536870912 & i) != 0) {
            long j98 = ahhp.a;
            j62 = ahhp.A;
        } else {
            j62 = j26;
        }
        if ((1073741824 & i) != 0) {
            long j99 = ahhp.a;
            j63 = ahhp.B;
        } else {
            j63 = j27;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            long j100 = ahhp.a;
            j64 = ahhp.C;
        } else {
            j64 = j28;
        }
        if ((i2 & 1) != 0) {
            long j101 = ahhp.a;
            j65 = ahhp.D;
        } else {
            j65 = j29;
        }
        if ((i2 & 2) != 0) {
            long j102 = ahhp.a;
            j66 = ahhp.E;
        } else {
            j66 = j30;
        }
        if ((i2 & 4) != 0) {
            long j103 = ahhp.a;
            j67 = ahhp.z;
        } else {
            j67 = j31;
        }
        if ((i2 & 8) != 0) {
            long j104 = ahhp.a;
            j68 = ahhp.F;
        } else {
            j68 = j32;
        }
        return new blh(j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, j49, j50, j51, j54, j52, j53, j55, j56, j57, j58, j59, j60, j61, j67, j68, j62, j63, j64, j65, j66);
    }

    public static /* synthetic */ String a(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "null";
                    }
                    return "INVALID_PAYLOAD";
                }
                return "INVALID_ENCODING";
            }
            return "UNKNOWN_OPTION";
        }
        return "MALFORMED";
    }

    public static anat aA(ahdu ahduVar, boolean z) {
        List b = ahduVar.b();
        for (int i = !z ? 1 : 0; i < b.size(); i++) {
            ahcw ahcwVar = (ahcw) b.get(i);
            anas anasVar = ahcwVar.d;
            if (anasVar == null) {
                anasVar = anas.a;
            }
            if ((anasVar.b & 2048) != 0) {
                anas anasVar2 = ahcwVar.d;
                if (anasVar2 == null) {
                    anasVar2 = anas.a;
                }
                anat anatVar = anasVar2.e;
                if (anatVar == null) {
                    return anat.a;
                }
                return anatVar;
            }
        }
        return null;
    }

    public static final void aB(int i, boolean z, aozy aozyVar, apaa[] apaaVarArr, aozy aozyVar2, ahdw ahdwVar) {
        apaa apaaVar = apaaVarArr[i];
        if (!apaaVar.cs(amnx.a)) {
            if (z) {
                apae apaeVar = amnx.a;
                amoe amoeVar = (amoe) apaaVar.b;
                apaaVar.ct(apaeVar, Long.valueOf((amoeVar.c << 32) | (amoeVar.d & 4294967295L)));
            }
        } else {
            z = true;
        }
        Iterator it = DesugarCollections.unmodifiableList(((amoe) apaaVar.b).e).iterator();
        while (it.hasNext()) {
            aB(((Integer) it.next()).intValue(), z, aozyVar, apaaVarArr, aozyVar2, ahdwVar);
        }
    }

    public static final void aC(anat anatVar, ahdv ahdvVar, ahdw ahdwVar, aozy aozyVar) {
        if (ahdwVar.b.size() == 1) {
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            amnr amnrVar = (amnr) aozyVar.b;
            amnr amnrVar2 = amnr.a;
            amnrVar.e = anatVar;
            amnrVar.b |= 2;
            return;
        }
        anas anasVar = aF(ahdvVar).d;
        if (anasVar == null) {
            anasVar = anas.a;
        }
        anat anatVar2 = anasVar.e;
        if (anatVar2 == null) {
            anatVar2 = anat.a;
        }
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amnr amnrVar3 = (amnr) aozyVar.b;
        amnr amnrVar4 = amnr.a;
        anatVar2.getClass();
        amnrVar3.e = anatVar2;
        amnrVar3.b |= 2;
    }

    public static ListenableFuture aD() {
        return albo.bI(aozp.a);
    }

    public static ListenableFuture aE() {
        return albo.bI(null);
    }

    public static ahcw aF(ahdu ahduVar) {
        return (ahcw) ahduVar.b().get(r1.size() - 1);
    }

    public static ahcw aG(ahdu ahduVar) {
        return (ahcw) ahduVar.b().get(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (r0.l.o(r6.d) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void aH(defpackage.ahcq r5, java.util.List r6) {
        /*
        L0:
            if (r5 == 0) goto L4d
            ahcw r0 = r5.a()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L21
            anas r3 = r0.d
            if (r3 != 0) goto L10
            anas r3 = defpackage.anas.a
        L10:
            int r3 = r3.b
            r3 = r3 & 8
            if (r3 == 0) goto L18
            r3 = r2
            goto L19
        L18:
            r3 = r1
        L19:
            java.lang.String r4 = "Instrumented view has no VE ID."
            defpackage.albo.U(r3, r4)
            r6.add(r0)
        L21:
            ahcz r3 = r5.e
            ahcq r3 = r3.d()
            if (r3 != 0) goto L4b
            ahcz r6 = r5.e
            boolean r6 = r6.g()
            if (r6 != 0) goto L44
            apae r6 = defpackage.ahfd.a
            apae r6 = defpackage.apag.m88$$Nest$smcheckIsLite(r6)
            r0.b(r6)
            aozu r0 = r0.l
            apad r6 = r6.d
            boolean r6 = r0.o(r6)
            if (r6 == 0) goto L45
        L44:
            r1 = r2
        L45:
            java.lang.String r6 = "Activity's content root (android.R.id.content) must be annotated with a VE. CVE root was: %s"
            defpackage.albo.X(r1, r6, r5)
            return
        L4b:
            r5 = r3
            goto L0
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahji.aH(ahcq, java.util.List):void");
    }

    public static ahcp aI() {
        apae apaeVar = ahde.a;
        aozy createBuilder = ahdd.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ahdd ahddVar = (ahdd) createBuilder.b;
        ahddVar.d = 3;
        ahddVar.b |= 2;
        return new ahcp(apaeVar, (ahdd) createBuilder.s());
    }

    public static int aJ(int i) {
        if (i != 0) {
            if (i != 200) {
                if (i != 400) {
                    if (i != 404) {
                        if (i != 500) {
                            return 0;
                        }
                        return 501;
                    }
                    return 405;
                }
                return 401;
            }
            return BasePaymentResult.ERROR_REQUEST_TIMEOUT;
        }
        return 1;
    }

    public static CharSequence aK(Locale locale, CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && locale != null) {
            SpannableString spannableString = new SpannableString(charSequence);
            if (!TextUtils.isEmpty(spannableString)) {
                spannableString.setSpan(new LocaleSpan(locale), 0, spannableString.length(), 33);
            }
            return spannableString;
        }
        return charSequence;
    }

    public static String aL(Class cls) {
        String simpleName = cls.getSimpleName();
        if (TextUtils.isEmpty(simpleName)) {
            String name = cls.getName();
            if (TextUtils.isEmpty(name)) {
                return "UnknownClass";
            }
            return name.substring(name.lastIndexOf(".") + 1);
        }
        return simpleName;
    }

    public static String aM(String str) {
        if (str.length() > 127) {
            str = str.substring(str.length() - 127);
        }
        return str.replace('$', '.');
    }

    public static int aN(int i) {
        if (i != 0) {
            switch (i) {
                case 2:
                    return 1;
                case 3:
                    return 2;
                case 4:
                    return 3;
                case 5:
                    return 4;
                case 6:
                    return 5;
                case 7:
                    return 6;
                default:
                    return 0;
            }
        }
        return 7;
    }

    private static final aikp aO(String str) {
        try {
            return (aikp) new ailc(str, (int[]) null).n();
        } catch (ClassCastException unused) {
            throw new ailb(str.concat(" Not a SIP URL "));
        }
    }

    private static void aP(InputStream inputStream, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            try {
                i2 += inputStream.read(bArr, i2, i - i2);
            } catch (IndexOutOfBoundsException e) {
                throw new IOException("Invalid ID length", e);
            }
        }
    }

    public static /* synthetic */ blh aa(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, int i, int i2) {
        long j33;
        long j34;
        long j35;
        long j36;
        long j37;
        long j38;
        long j39;
        long j40;
        long j41;
        long j42;
        long j43;
        long j44;
        long j45;
        long j46;
        long j47;
        long j48;
        long j49;
        long j50;
        long j51;
        long j52;
        long j53;
        long j54;
        long j55;
        long j56;
        long j57;
        long j58;
        long j59;
        long j60;
        long j61;
        long j62;
        long j63;
        long j64;
        long j65;
        long j66;
        long j67;
        long j68;
        if ((i & 1) != 0) {
            long j69 = ahhq.a;
            j33 = ahhq.p;
        } else {
            j33 = j;
        }
        if ((i & 2) != 0) {
            long j70 = ahhq.a;
            j34 = ahhq.i;
        } else {
            j34 = j2;
        }
        if ((i & 4) != 0) {
            long j71 = ahhq.a;
            j35 = ahhq.q;
        } else {
            j35 = j3;
        }
        if ((i & 8) != 0) {
            long j72 = ahhr.a;
            j36 = ahhr.L;
        } else {
            j36 = j4;
        }
        if ((i & 16) != 0) {
            long j73 = ahhq.a;
            j37 = ahhq.e;
        } else {
            j37 = j5;
        }
        if ((i & 32) != 0) {
            long j74 = ahhq.a;
            j38 = ahhq.s;
        } else {
            j38 = j6;
        }
        if ((i & 64) != 0) {
            long j75 = ahhq.a;
            j39 = ahhq.j;
        } else {
            j39 = j7;
        }
        if ((i & 128) != 0) {
            long j76 = ahhq.a;
            j40 = ahhq.t;
        } else {
            j40 = j8;
        }
        if ((i & 256) != 0) {
            long j77 = ahhr.a;
            j41 = ahhr.W;
        } else {
            j41 = j9;
        }
        if ((i & 512) != 0) {
            long j78 = ahhq.a;
            j42 = ahhq.E;
        } else {
            j42 = j10;
        }
        if ((i & 1024) != 0) {
            long j79 = ahhq.a;
            j43 = ahhq.m;
        } else {
            j43 = j11;
        }
        if ((i & 2048) != 0) {
            long j80 = ahhq.a;
            j44 = ahhq.F;
        } else {
            j44 = j12;
        }
        if ((i & 4096) != 0) {
            long j81 = ahhr.a;
            j45 = ahhr.ae;
        } else {
            j45 = j13;
        }
        if ((i & 8192) != 0) {
            long j82 = ahhq.a;
            j46 = ahhq.a;
        } else {
            j46 = j14;
        }
        if ((i & 16384) != 0) {
            long j83 = ahhq.a;
            j47 = ahhq.g;
        } else {
            j47 = j15;
        }
        if ((32768 & i) != 0) {
            long j84 = ahhq.a;
            j48 = ahhq.u;
        } else {
            j48 = j16;
        }
        if ((65536 & i) != 0) {
            long j85 = ahhq.a;
            j49 = ahhq.k;
        } else {
            j49 = j17;
        }
        if ((131072 & i) != 0) {
            long j86 = ahhq.a;
            j50 = ahhq.D;
        } else {
            j50 = j18;
        }
        if ((262144 & i) != 0) {
            long j87 = ahhq.a;
            j51 = ahhq.l;
        } else {
            j51 = j19;
        }
        if ((524288 & i) != 0) {
            long j88 = ahhq.a;
            j52 = ahhq.f;
        } else {
            j52 = j20;
        }
        if ((1048576 & i) != 0) {
            long j89 = ahhq.a;
            j53 = ahhq.d;
        } else {
            j53 = j21;
        }
        if ((2097152 & i) != 0) {
            long j90 = ahhq.a;
            j54 = ahhq.C;
        } else {
            j54 = j22;
        }
        if ((4194304 & i) != 0) {
            long j91 = ahhq.a;
            j55 = ahhq.b;
        } else {
            j55 = 0;
        }
        if ((8388608 & i) != 0) {
            long j92 = ahhq.a;
            j56 = ahhq.h;
        } else {
            j56 = 0;
        }
        if ((16777216 & i) != 0) {
            long j93 = ahhq.a;
            j57 = ahhq.c;
        } else {
            j57 = 0;
        }
        if ((33554432 & i) != 0) {
            long j94 = ahhr.a;
            j58 = ahhr.a;
        } else {
            j58 = 0;
        }
        if ((67108864 & i) != 0) {
            long j95 = ahhq.a;
            j59 = ahhq.n;
        } else {
            j59 = j23;
        }
        if ((134217728 & i) != 0) {
            long j96 = ahhq.a;
            j60 = ahhq.o;
        } else {
            j60 = j24;
        }
        if ((268435456 & i) != 0) {
            long j97 = ahhq.a;
            j61 = ahhq.r;
        } else {
            j61 = j25;
        }
        if ((536870912 & i) != 0) {
            long j98 = ahhq.a;
            j62 = ahhq.w;
        } else {
            j62 = j26;
        }
        if ((1073741824 & i) != 0) {
            long j99 = ahhq.a;
            j63 = ahhq.x;
        } else {
            j63 = j27;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            long j100 = ahhq.a;
            j64 = ahhq.y;
        } else {
            j64 = j28;
        }
        if ((i2 & 1) != 0) {
            long j101 = ahhq.a;
            j65 = ahhq.z;
        } else {
            j65 = j29;
        }
        if ((i2 & 2) != 0) {
            long j102 = ahhq.a;
            j66 = ahhq.A;
        } else {
            j66 = j30;
        }
        if ((i2 & 4) != 0) {
            long j103 = ahhq.a;
            j67 = ahhq.v;
        } else {
            j67 = j31;
        }
        if ((i2 & 8) != 0) {
            long j104 = ahhq.a;
            j68 = ahhq.B;
        } else {
            j68 = j32;
        }
        return new blh(j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, j49, j50, j51, j54, j52, j53, j55, j56, j57, j58, j59, j60, j61, j67, j68, j62, j63, j64, j65, j66);
    }

    public static final long ab(int i, bwj bwjVar) {
        if (i != 0) {
            blh a = bmp.a(bwjVar);
            switch (i - 1) {
                case 0:
                    return a.n;
                case 1:
                    return a.w;
                case 2:
                    return a.y;
                case 3:
                    return a.v;
                case 4:
                    return a.e;
                case 5:
                    return a.u;
                case 6:
                    return a.o;
                case 7:
                    return a.x;
                case 8:
                    return a.z;
                case 9:
                    return a.b;
                case 10:
                    return a.d;
                case 11:
                case 12:
                case 15:
                case 16:
                case 21:
                case 22:
                case 27:
                case 28:
                case 32:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                default:
                    return cku.h;
                case 13:
                    return a.g;
                case 14:
                    return a.i;
                case 17:
                    return a.q;
                case 18:
                    return a.s;
                case 19:
                    return a.k;
                case 20:
                    return a.m;
                case 23:
                    return a.A;
                case 24:
                    return a.B;
                case 25:
                    return a.a;
                case 26:
                    return a.c;
                case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                    return a.C;
                case 30:
                    return a.f;
                case 31:
                    return a.h;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                    return a.p;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                    return a.D;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                    return a.F;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                    return a.G;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                    return a.H;
                case 39:
                    return a.I;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                    return a.J;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                    return a.E;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                    return a.t;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                    return a.r;
            }
        }
        throw null;
    }

    public static final void ac(arqg arqgVar, arqv arqvVar, cga cgaVar, boolean z, arqv arqvVar2, arqv arqvVar3, cmb cmbVar, bpf bpfVar, bpi bpiVar, adr adrVar, ajr ajrVar, bwj bwjVar, int i, int i2) {
        int i3;
        bpi bpiVar2;
        bpf bpfVar2;
        adr adrVar2;
        ajr ajrVar2;
        bwj bwjVar2;
        bpf bpfVar3;
        bpi bpiVar3;
        adr adrVar3;
        ajr ajrVar3;
        arqgVar.getClass();
        arqvVar.getClass();
        int i4 = i & 14;
        bwj c = bwjVar.c(242855447);
        if (i4 == 0) {
            i3 = (true != c.H(false) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= true != c.I(arqgVar) ? 16 : 32;
        }
        if ((i & 896) == 0) {
            i3 |= true != c.I(arqvVar) ? 128 : 256;
        }
        if ((i & 7168) == 0) {
            i3 |= true != c.G(cgaVar) ? 1024 : 2048;
        }
        if ((57344 & i) == 0) {
            i3 |= true != c.H(z) ? 8192 : 16384;
        }
        int i5 = i3 | 196608;
        if ((3670016 & i) == 0) {
            i5 |= true != c.I(arqvVar2) ? 524288 : 1048576;
        }
        if ((29360128 & i) == 0) {
            i5 |= true != c.I(arqvVar3) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((234881024 & i) == 0) {
            i5 |= true != c.G(cmbVar) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((1879048192 & i) == 0) {
            i5 |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        }
        int i6 = (i2 & 14) == 0 ? i2 | 2 : i2;
        if ((i2 & 112) == 0) {
            i6 |= 16;
        }
        int i7 = i6 | 384;
        if ((1533916891 & i5) == 306783378 && (i7 & 731) == 146 && c.L()) {
            c.v();
            bpfVar3 = bpfVar;
            bpiVar3 = bpiVar;
            adrVar3 = adrVar;
            ajrVar3 = ajrVar;
            bwjVar2 = c;
        } else {
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
                bpfVar2 = bpfVar;
                bpiVar2 = bpiVar;
                adrVar2 = adrVar;
                ajrVar2 = ajrVar;
            } else {
                c.y(1572031674);
                long j = cku.g;
                long ab = ab(19, c);
                long ab2 = ab(19, c);
                long ab3 = ab(19, c);
                long j2 = cku.g;
                long h = cku.h(ab(18, c), 0.38f);
                long h2 = cku.h(ab(18, c), 0.38f);
                long h3 = cku.h(ab(18, c), 0.38f);
                long ab4 = ab(32, c);
                long h4 = cku.h(ab(18, c), 0.12f);
                long ab5 = ab(15, c);
                long ab6 = ab(26, c);
                long ab7 = ab(15, c);
                float f = bme.a;
                blh a = bmp.a(c);
                bpf bpfVar4 = a.O;
                if (bpfVar4 == null) {
                    long j3 = cku.g;
                    buo buoVar = buu.a;
                    bpfVar4 = new bpf(j3, bli.b(a, buu.f), bli.b(a, buu.j), bli.b(a, buu.m), cku.g, cku.h(bli.b(a, buu.a), 0.38f), cku.h(bli.b(a, buu.h), 0.38f), cku.h(bli.b(a, buu.k), 0.38f), bli.b(a, buu.d), cku.h(bli.b(a, buu.b), 0.12f), bli.b(a, buu.e), bli.b(a, buu.i), bli.b(a, buu.l));
                    a.O = bpfVar4;
                }
                bpf a2 = bpfVar4.a(j, ab, ab2, ab3, j2, h, h2, h3, ab4, h4, ab5, ab6, ab7);
                bwk bwkVar = (bwk) c;
                bwkVar.Y();
                c.y(1445578179);
                bpi bpiVar4 = new bpi(brg.a);
                bwkVar.Y();
                c.y(1864829805);
                adr a3 = ads.a(1.0f, true != z ? cku.h(ab(18, c), 0.12f) : ab(25, c));
                bwkVar.Y();
                c.y(1854692182);
                Object T = bwkVar.T();
                if (T == bwj.a.a) {
                    T = new ajs();
                    bwkVar.ad(T);
                }
                bwkVar.Y();
                bpiVar2 = bpiVar4;
                bpfVar2 = a2;
                adrVar2 = a3;
                ajrVar2 = (ajr) T;
            }
            c.n();
            bwjVar2 = c;
            ble.b(arqgVar, arqvVar, cgaVar, z, arqvVar2, arqvVar3, cmbVar, bpfVar2, bpiVar2, adrVar2, ajrVar2, c, i5 & 268435454, i7 & 896);
            bpfVar3 = bpfVar2;
            bpiVar3 = bpiVar2;
            adrVar3 = adrVar2;
            ajrVar3 = ajrVar2;
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new ahhi(arqgVar, arqvVar, cgaVar, z, arqvVar2, arqvVar3, cmbVar, bpfVar3, bpiVar3, adrVar3, ajrVar3, i, i2, 1);
        }
    }

    public static final void ad(arqg arqgVar, arqv arqvVar, cga cgaVar, boolean z, arqv arqvVar2, cmb cmbVar, bpf bpfVar, bpi bpiVar, adr adrVar, ajr ajrVar, bwj bwjVar, int i, int i2) {
        int i3;
        cga cgaVar2;
        adr adrVar2;
        ajr ajrVar2;
        bpi bpiVar2;
        cmb cmbVar2;
        boolean z2;
        bpf bpfVar2;
        bpf bpfVar3;
        boolean z3;
        cmb cmbVar3;
        cga cgaVar3;
        arqvVar.getClass();
        bwj c = bwjVar.c(-1861818496);
        if ((i & 14) == 0) {
            i3 = (true != c.H(false) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= true != c.I(arqgVar) ? 16 : 32;
        }
        if ((i & 896) == 0) {
            i3 |= true != c.I(arqvVar) ? 128 : 256;
        }
        int i4 = i3 | 27648;
        if ((458752 & i) == 0) {
            i4 |= true != c.I(arqvVar2) ? 65536 : 131072;
        }
        int i5 = 1572864 | i4;
        if ((29360128 & i) == 0) {
            i5 = i4 | 5767168;
        }
        if ((234881024 & i) == 0) {
            i5 |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        }
        if ((1879048192 & i) == 0) {
            i5 |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        }
        int i6 = ((i2 & 14) == 0 ? i2 | 2 : i2) | 48;
        if ((1533916891 & i5) == 306783378 && (i6 & 91) == 18 && c.L()) {
            c.v();
            cgaVar3 = cgaVar;
            z3 = z;
            cmbVar3 = cmbVar;
            bpfVar3 = bpfVar;
            bpiVar2 = bpiVar;
            adrVar2 = adrVar;
            ajrVar2 = ajrVar;
        } else {
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
                cgaVar2 = cgaVar;
                z2 = z;
                cmbVar2 = cmbVar;
                bpfVar2 = bpfVar;
                bpiVar2 = bpiVar;
                adrVar2 = adrVar;
                ajrVar2 = ajrVar;
            } else {
                cgaVar2 = cga.e;
                c.y(858760725);
                cmb b = ahgv.b(15, c);
                bwk bwkVar = (bwk) c;
                bwkVar.Y();
                c.y(1329529049);
                long j = cku.g;
                long ab = ab(19, c);
                long ab2 = ab(26, c);
                long j2 = cku.g;
                long h = cku.h(ab(18, c), 0.38f);
                long h2 = cku.h(ab(18, c), 0.38f);
                long ab3 = ab(32, c);
                long h3 = cku.h(ab(18, c), 0.12f);
                long ab4 = ab(15, c);
                long ab5 = ab(15, c);
                float f = blz.a;
                blh a = bmp.a(c);
                bpf bpfVar4 = a.N;
                if (bpfVar4 == null) {
                    long j3 = cku.g;
                    buo buoVar = but.a;
                    bpfVar4 = new bpf(j3, bli.b(a, but.h), bli.b(a, but.l), bli.b(a, but.l), cku.g, cku.h(bli.b(a, but.a), but.b), cku.h(bli.b(a, but.i), but.j), cku.h(bli.b(a, but.i), but.j), bli.b(a, but.e), cku.h(bli.b(a, but.c), but.d), bli.b(a, but.g), bli.b(a, but.k), bli.b(a, but.k));
                    a.N = bpfVar4;
                }
                bpf a2 = bpfVar4.a(j, ab, ab2, ab2, j2, h, h2, h2, ab3, h3, ab4, ab5, ab5);
                bwkVar.Y();
                c.y(-1841020999);
                bpi bpiVar3 = new bpi(1.0f);
                bwkVar.Y();
                c.y(1972721871);
                long ab6 = ab(25, c);
                cku.h(ab(18, c), 0.12f);
                adr a3 = ads.a(1.0f, ab6);
                bwkVar.Y();
                c.y(1572978130);
                Object T = bwkVar.T();
                if (T == bwj.a.a) {
                    T = new ajs();
                    bwkVar.ad(T);
                }
                bwkVar.Y();
                adrVar2 = a3;
                ajrVar2 = (ajr) T;
                bpiVar2 = bpiVar3;
                cmbVar2 = b;
                z2 = true;
                bpfVar2 = a2;
            }
            c.n();
            ble.c(arqgVar, arqvVar, cgaVar2, z2, arqvVar2, cmbVar2, bpfVar2, bpiVar2, adrVar2, ajrVar2, c, i5 & 4194302, i6 & 112);
            bpfVar3 = bpfVar2;
            z3 = z2;
            cga cgaVar4 = cgaVar2;
            cmbVar3 = cmbVar2;
            cgaVar3 = cgaVar4;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new ahfx(arqgVar, arqvVar, cgaVar3, z3, arqvVar2, cmbVar3, bpfVar3, bpiVar2, adrVar2, ajrVar2, i, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ae(boolean r44, defpackage.arqr r45, defpackage.cga r46, boolean r47, defpackage.blb r48, defpackage.ajr r49, defpackage.bwj r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahji.ae(boolean, arqr, cga, boolean, blb, ajr, bwj, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void af(defpackage.cga r16, defpackage.cmb r17, defpackage.bku r18, defpackage.bky r19, defpackage.adr r20, defpackage.arqw r21, defpackage.bwj r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahji.af(cga, cmb, bku, bky, adr, arqw, bwj, int, int):void");
    }

    public static final void ag(cga cgaVar, cmb cmbVar, bku bkuVar, bky bkyVar, adr adrVar, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        cmb b;
        bku a;
        bky bkyVar2;
        adr adrVar2;
        int i3;
        int i4;
        arqwVar.getClass();
        int i5 = i & 14;
        bwj c = bwjVar.c(488271448);
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
        if ((i & 112) == 0) {
            i2 |= 16;
        }
        if ((i & 896) == 0) {
            i2 |= 128;
        }
        if ((i & 7168) == 0) {
            i2 |= 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= 8192;
        }
        if ((458752 & i) == 0) {
            if (true != c.I(arqwVar)) {
                i3 = 65536;
            } else {
                i3 = 131072;
            }
            i2 |= i3;
        }
        if ((374491 & i2) == 74898 && c.L()) {
            c.v();
            b = cmbVar;
            a = bkuVar;
            bkyVar2 = bkyVar;
            adrVar2 = adrVar;
        } else {
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
                b = cmbVar;
                a = bkuVar;
                bkyVar2 = bkyVar;
                adrVar2 = adrVar;
            } else {
                c.y(-2063131167);
                b = ahgv.b(13, c);
                bwk bwkVar = (bwk) c;
                bwkVar.Y();
                c.y(-976332415);
                long ab = ab(35, c);
                long Y = Y(ab, c);
                a = bkv.a(ab, Y, ab, cku.h(Y, 0.38f), c);
                bwkVar.Y();
                c.y(-463571699);
                bky bkyVar3 = new bky(brg.a);
                bwkVar.Y();
                c.y(652558697);
                c.y(1760685800);
                long ab2 = ab(25, c);
                bwkVar.Y();
                adr a2 = ads.a(1.0f, ab2);
                bwkVar.Y();
                bkyVar2 = bkyVar3;
                adrVar2 = a2;
            }
            c.n();
            af(cgaVar, b, a, bkyVar2, adrVar2, arqwVar, c, i2 & 458766, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new ahfv(cgaVar, b, a, bkyVar2, adrVar2, arqwVar, i);
        }
    }

    public static final void ah(arqg arqgVar, cga cgaVar, boolean z, cmb cmbVar, bku bkuVar, bky bkyVar, ajr ajrVar, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        bky ai;
        ajr ajrVar2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        arqwVar.getClass();
        bwj c = bwjVar.c(-2043141941);
        boolean z3 = true;
        if ((i & 14) == 0) {
            if (true != c.I(arqgVar)) {
                i7 = 2;
            } else {
                i7 = 4;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i6 = 16;
            } else {
                i6 = 32;
            }
            i2 |= i6;
        }
        int i8 = i2 | 384;
        if ((i & 7168) == 0) {
            if (true != c.G(cmbVar)) {
                i5 = 1024;
            } else {
                i5 = 2048;
            }
            i8 |= i5;
        }
        if ((57344 & i) == 0) {
            if (true != c.G(bkuVar)) {
                i4 = 8192;
            } else {
                i4 = 16384;
            }
            i8 |= i4;
        }
        if ((458752 & i) == 0) {
            i8 |= 65536;
        }
        int i9 = i8 | 14155776;
        if ((234881024 & i) == 0) {
            if (true != c.I(arqwVar)) {
                i3 = VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
            } else {
                i3 = VCardConfig.FLAG_APPEND_TYPE_PARAM;
            }
            i9 |= i3;
        }
        if ((191739611 & i9) == 38347922 && c.L()) {
            c.v();
            z2 = z;
            ai = bkyVar;
            ajrVar2 = ajrVar;
        } else {
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
                z3 = z;
                ai = bkyVar;
                ajrVar2 = ajrVar;
            } else {
                ai = ai(c);
                c.y(178749758);
                bwk bwkVar = (bwk) c;
                Object T = bwkVar.T();
                if (T == bwj.a.a) {
                    T = new ajs();
                    bwkVar.ad(T);
                }
                bwkVar.Y();
                ajrVar2 = (ajr) T;
            }
            c.n();
            bkz.b(arqgVar, cgaVar, z3, cmbVar, bkuVar, ai, ajrVar2, arqwVar, c, i9 & 267976702);
            z2 = z3;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new ahfu(arqgVar, cgaVar, z2, cmbVar, bkuVar, ai, ajrVar2, arqwVar, i);
        }
    }

    public static final bky ai(bwj bwjVar) {
        bwjVar.y(-347913265);
        bky bkyVar = new bky(1.0f);
        ((bwk) bwjVar).Y();
        return bkyVar;
    }

    public static final bku aj(long j, bwj bwjVar, int i) {
        long h;
        bwjVar.y(-860673981);
        if ((i & 1) != 0) {
            j = ab(39, bwjVar);
        }
        long j2 = j;
        long Y = Y(j2, bwjVar);
        long h2 = cku.h(ab(44, bwjVar), 0.38f);
        blh a = bmp.a(bwjVar);
        a.getClass();
        if (dqy.b(brg.a, brg.a)) {
            h = a.p;
        } else {
            float log = (float) Math.log(1.0d);
            long j3 = a.t;
            h = ckw.h(cku.h(j3, ((log * 4.5f) + 2.0f) / 100.0f), a.p);
        }
        bku a2 = bkv.a(j2, Y, ckw.h(h2, h), cku.h(Y(j2, bwjVar), 0.38f), bwjVar);
        ((bwk) bwjVar).Y();
        return a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ak(defpackage.arqg r26, defpackage.cga r27, boolean r28, defpackage.cmb r29, defpackage.bkn r30, defpackage.bkr r31, defpackage.adr r32, defpackage.amj r33, defpackage.ajr r34, defpackage.arqw r35, defpackage.bwj r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahji.ak(arqg, cga, boolean, cmb, bkn, bkr, adr, amj, ajr, arqw, bwj, int, int):void");
    }

    public static final void al(arqg arqgVar, cga cgaVar, boolean z, cmb cmbVar, bkn bknVar, bkr bkrVar, amj amjVar, ajr ajrVar, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        cga cgaVar2;
        cmb a;
        bkn b;
        bkr c;
        amj amjVar2;
        ajr ajrVar2;
        int i3;
        int i4;
        int i5;
        arqgVar.getClass();
        arqwVar.getClass();
        int i6 = i & 14;
        bwj c2 = bwjVar.c(-1787590994);
        if (i6 == 0) {
            if (true != c2.I(arqgVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        int i7 = i2 | 48;
        if ((i & 896) == 0) {
            if (true != c2.H(z)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i7 |= i4;
        }
        if ((i & 7168) == 0) {
            i7 |= 1024;
        }
        if ((57344 & i) == 0) {
            i7 |= 8192;
        }
        if ((458752 & i) == 0) {
            i7 |= 65536;
        }
        int i8 = i7 | 114819072;
        if ((1879048192 & i) == 0) {
            if (true != c2.I(arqwVar)) {
                i3 = VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
            } else {
                i3 = 536870912;
            }
            i8 |= i3;
        }
        if ((1533916891 & i8) == 306783378 && c2.L()) {
            c2.v();
            cgaVar2 = cgaVar;
            a = cmbVar;
            b = bknVar;
            c = bkrVar;
            amjVar2 = amjVar;
            ajrVar2 = ajrVar;
        } else {
            c2.w();
            if ((i & 1) != 0 && !c2.J()) {
                c2.v();
                cgaVar2 = cgaVar;
                a = cmbVar;
                b = bknVar;
                c = bkrVar;
                amjVar2 = amjVar;
                ajrVar2 = ajrVar;
            } else {
                cgaVar2 = cga.e;
                amj amjVar3 = ahfq.a;
                a = ahfq.a(c2);
                c2.y(-1039129803);
                long ab = ab(40, c2);
                long ab2 = ab(26, c2);
                long h = cku.h(ab(18, c2), 0.1f);
                long h2 = cku.h(ab(19, c2), 0.38f);
                amj amjVar4 = bko.a;
                b = bko.b(ab, ab2, h, h2, c2, 0);
                bwk bwkVar = (bwk) c2;
                bwkVar.Y();
                c2.y(1410833095);
                c = bko.c(1.0f, 1.0f, 1.0f, 3.0f, 0);
                bwkVar.Y();
                amj amjVar5 = ahfq.a;
                c2.y(385063306);
                Object T = bwkVar.T();
                if (T == bwj.a.a) {
                    T = new ajs();
                    bwkVar.ad(T);
                }
                bwkVar.Y();
                amjVar2 = amjVar5;
                ajrVar2 = (ajr) T;
            }
            c2.n();
            ak(arqgVar, cgaVar2, z, a, b, c, null, amjVar2, ajrVar2, arqwVar, c2, i8 & 2146960382, 0);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new ahfr(arqgVar, cgaVar2, z, a, b, c, amjVar2, ajrVar2, arqwVar, i, 1);
        }
    }

    public static final void am(arqg arqgVar, cga cgaVar, boolean z, cmb cmbVar, bkn bknVar, bkr bkrVar, amj amjVar, ajr ajrVar, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        cmb a;
        bkn b;
        bkr bkrVar2;
        amj amjVar2;
        ajr ajrVar2;
        cmb cmbVar2;
        amj amjVar3;
        bkn bknVar2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(97925604);
        boolean z3 = true;
        if (i6 == 0) {
            if (true != c.I(arqgVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        int i7 = i2 | 384;
        if ((i & 7168) == 0) {
            i7 = i2 | 1408;
        }
        if ((57344 & i) == 0) {
            i7 |= 8192;
        }
        if ((458752 & i) == 0) {
            i7 |= 65536;
        }
        int i8 = 114819072 | i7;
        if ((1879048192 & i) == 0) {
            if (true != c.I(arqwVar)) {
                i3 = VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
            } else {
                i3 = 536870912;
            }
            i8 |= i3;
        }
        if ((1533916891 & i8) == 306783378 && c.L()) {
            c.v();
            z2 = z;
            cmbVar2 = cmbVar;
            bknVar2 = bknVar;
            bkrVar2 = bkrVar;
            amjVar3 = amjVar;
            ajrVar2 = ajrVar;
        } else {
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
                z3 = z;
                a = cmbVar;
                b = bknVar;
                bkrVar2 = bkrVar;
                amjVar2 = amjVar;
                ajrVar2 = ajrVar;
            } else {
                amj amjVar4 = ahfq.a;
                a = ahfq.a(c);
                c.y(-1496735361);
                long ab = ab(32, c);
                long ab2 = ab(15, c);
                long h = cku.h(ab(18, c), 0.12f);
                long h2 = cku.h(ab(18, c), 0.38f);
                amj amjVar5 = bko.a;
                b = bko.b(ab, ab2, h, h2, c, 0);
                bwk bwkVar = (bwk) c;
                bwkVar.Y();
                c.y(1160106173);
                bkrVar2 = new bkr(brg.a, brg.a, brg.a, 1.0f);
                bwkVar.Y();
                amj amjVar6 = ahfq.a;
                c.y(1396941006);
                Object T = bwkVar.T();
                if (T == bwj.a.a) {
                    T = new ajs();
                    bwkVar.ad(T);
                }
                bwkVar.Y();
                amjVar2 = amjVar6;
                ajrVar2 = (ajr) T;
            }
            c.n();
            ak(arqgVar, cgaVar, z3, a, b, bkrVar2, null, amjVar2, ajrVar2, arqwVar, c, i8 & 2146960382, 0);
            cmbVar2 = a;
            amjVar3 = amjVar2;
            bknVar2 = b;
            z2 = z3;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new ahfr(arqgVar, cgaVar, z2, cmbVar2, bknVar2, bkrVar2, amjVar3, ajrVar2, arqwVar, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void an(defpackage.arqg r25, defpackage.cga r26, boolean r27, defpackage.cmb r28, defpackage.bkn r29, defpackage.amj r30, defpackage.ajr r31, defpackage.arqw r32, defpackage.bwj r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahji.an(arqg, cga, boolean, cmb, bkn, amj, ajr, arqw, bwj, int, int):void");
    }

    public static final void ao(arqg arqgVar, cga cgaVar, boolean z, cmb cmbVar, bkn bknVar, adr adrVar, amj amjVar, ajr ajrVar, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        cga cgaVar2;
        amj amjVar2;
        ajr ajrVar2;
        boolean z2;
        cga cgaVar3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i & 14;
        bwj c = bwjVar.c(-229789338);
        boolean z3 = true;
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
        int i9 = i2 | 432;
        if ((i & 7168) == 0) {
            if (true != c.G(cmbVar)) {
                i6 = 1024;
            } else {
                i6 = 2048;
            }
            i9 |= i6;
        }
        if ((57344 & i) == 0) {
            if (true != c.G(bknVar)) {
                i5 = 8192;
            } else {
                i5 = 16384;
            }
            i9 |= i5;
        }
        int i10 = i9 | 196608;
        if ((3670016 & i) == 0) {
            if (true != c.G(adrVar)) {
                i4 = 524288;
            } else {
                i4 = 1048576;
            }
            i10 |= i4;
        }
        int i11 = i10 | 113246208;
        if ((1879048192 & i) == 0) {
            if (true != c.I(arqwVar)) {
                i3 = VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
            } else {
                i3 = 536870912;
            }
            i11 |= i3;
        }
        if ((1533916891 & i11) == 306783378 && c.L()) {
            c.v();
            cgaVar3 = cgaVar;
            z2 = z;
            amjVar2 = amjVar;
            ajrVar2 = ajrVar;
        } else {
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
                cgaVar2 = cgaVar;
                z3 = z;
                amjVar2 = amjVar;
                ajrVar2 = ajrVar;
            } else {
                cgaVar2 = cga.e;
                amj amjVar3 = ahfq.a;
                amjVar2 = ahfq.a;
                c.y(-1166931838);
                bwk bwkVar = (bwk) c;
                Object T = bwkVar.T();
                if (T == bwj.a.a) {
                    T = new ajs();
                    bwkVar.ad(T);
                }
                bwkVar.Y();
                ajrVar2 = (ajr) T;
            }
            c.n();
            ak(arqgVar, cgaVar2, z3, cmbVar, bknVar, null, adrVar, amjVar2, ajrVar2, arqwVar, c, i11 & 2147483646, 0);
            cga cgaVar4 = cgaVar2;
            z2 = z3;
            cgaVar3 = cgaVar4;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new ahfr(arqgVar, cgaVar3, z2, cmbVar, bknVar, adrVar, amjVar2, ajrVar2, arqwVar, i, 2);
        }
    }

    public static final void ap(arqw arqwVar, cga cgaVar, bkm bkmVar, float f, cmb cmbVar, long j, long j2, float f2, float f3, arqv arqvVar, boolean z, arqv arqvVar2, arqw arqwVar2, long j3, long j4, arqw arqwVar3, bwj bwjVar, int i, int i2) {
        int i3;
        cmb b;
        cga cgaVar2;
        arqw arqwVar4;
        long Y;
        float f4;
        float f5;
        boolean z2;
        cmb cmbVar2;
        float f6;
        bwj bwjVar2;
        float f7;
        boolean z3;
        arqw arqwVar5;
        long j5;
        cga cgaVar3;
        arqwVar.getClass();
        arqwVar3.getClass();
        int i4 = i & 14;
        bwj c = bwjVar.c(-1146176352);
        if (i4 == 0) {
            i3 = (true != c.I(arqwVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | 48;
        if ((i & 896) == 0) {
            i5 |= true != c.G(bkmVar) ? 128 : 256;
        }
        if ((i & 7168) == 0) {
            i5 |= true != c.D(f) ? 1024 : 2048;
        }
        if ((i & 57344) == 0) {
            i5 |= 8192;
        }
        if ((i & 458752) == 0) {
            i5 |= true != c.F(j) ? 65536 : 131072;
        }
        if ((i & 3670016) == 0) {
            i5 |= true != c.F(j2) ? 524288 : 1048576;
        }
        int i6 = i5 | 113246208;
        if ((i & 1879048192) == 0) {
            i6 |= true != c.I(arqvVar) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        int i7 = i2 | 6;
        if ((i2 & 112) == 0) {
            i7 |= true != c.I(arqvVar2) ? 16 : 32;
        }
        int i8 = i7 | 384;
        if ((i2 & 7168) == 0) {
            i8 |= true != c.F(j3) ? 1024 : 2048;
        }
        if ((i2 & 57344) == 0) {
            i8 |= 8192;
        }
        if ((458752 & i2) == 0) {
            i8 |= true == c.I(arqwVar3) ? 131072 : 65536;
        }
        if ((1533916891 & i6) == 306783378 && (374491 & i8) == 74898 && c.L()) {
            c.v();
            cgaVar3 = cgaVar;
            cmbVar2 = cmbVar;
            f6 = f2;
            z3 = z;
            arqwVar5 = arqwVar2;
            j5 = j4;
            bwjVar2 = c;
            f7 = f3;
        } else {
            int i9 = i8 & (-57345);
            int i10 = (-57345) & i6;
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
                cgaVar2 = cgaVar;
                b = cmbVar;
                f4 = f2;
                f5 = f3;
                z2 = z;
                arqwVar4 = arqwVar2;
                Y = j4;
            } else {
                cga.a aVar = cga.e;
                b = ahgv.b(4, c);
                cgaVar2 = aVar;
                arqwVar4 = ahga.a;
                Y = Y(j3, c);
                f4 = 1.0f;
                f5 = 1.0f;
                z2 = true;
            }
            c.n();
            int i11 = i10 << 3;
            int i12 = i9 << 3;
            int i13 = i12 & 57344;
            int i14 = (i12 & 896) | ((i6 >> 27) & 14) | (i12 & 112) | (i12 & 7168) | i13 | (i12 & 3670016);
            cmbVar2 = b;
            f6 = f4;
            bwjVar2 = c;
            f7 = f5;
            z3 = z2;
            arqwVar5 = arqwVar4;
            j5 = Y;
            bjx.e(arqwVar, cgaVar2, bkmVar, f, brg.a, cmbVar2, j, j2, f6, f7, arqvVar, z3, arqvVar2, arqwVar5, j3, j5, arqwVar3, bwjVar2, (i6 & 8190) | (i11 & 3670016) | (29360128 & i11) | (i11 & 234881024) | (1879048192 & i11), i14);
            cgaVar3 = cgaVar2;
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new ahfp(arqwVar, cgaVar3, bkmVar, f, cmbVar2, j, j2, f6, f7, arqvVar, z3, arqvVar2, arqwVar5, j3, j5, arqwVar3, i, i2);
        }
    }

    public static final long aq(bwj bwjVar) {
        return ab(40, bwjVar);
    }

    public static final void ar(cga cgaVar, long j, long j2, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1012366174);
        if (i4 == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= 16;
        }
        if ((i & 896) == 0) {
            i2 |= 128;
        }
        int i5 = i2 | 3072;
        if ((i5 & 5851) == 1170 && c.L()) {
            c.v();
        } else {
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
            } else {
                c.y(-213021945);
                j = ab(2, c);
                ((bwk) c).Y();
                j2 = Y(j, c);
            }
            c.n();
            bjs.a(cgaVar, j, j2, c, i5 & 7182);
        }
        long j3 = j;
        long j4 = j2;
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new ahfo(cgaVar, j3, j4, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0218  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void as(defpackage.arqg r46, defpackage.arqv r47, defpackage.cga r48, defpackage.arqv r49, defpackage.arqv r50, defpackage.arqv r51, defpackage.arqv r52, defpackage.cmb r53, long r54, float r56, long r57, long r59, long r61, defpackage.dte r63, defpackage.bwj r64, int r65, int r66, int r67) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahji.as(arqg, arqv, cga, arqv, arqv, arqv, arqv, cmb, long, float, long, long, long, dte, bwj, int, int, int):void");
    }

    public static final long at(bwj bwjVar) {
        bwjVar.y(-382446681);
        long ab = ab(38, bwjVar);
        bwjVar.q();
        return ab;
    }

    public static final long au(bwj bwjVar) {
        bwjVar.y(991733063);
        long ab = ab(31, bwjVar);
        ((bwk) bwjVar).Y();
        return ab;
    }

    public static final cmb av(bwj bwjVar) {
        bwjVar.y(571072827);
        cmb b = ahgv.b(2, bwjVar);
        bwjVar.q();
        return b;
    }

    public static final long aw(bwj bwjVar) {
        bwjVar.y(299879367);
        long ab = ab(19, bwjVar);
        ((bwk) bwjVar).Y();
        return ab;
    }

    public static final long ax(bwj bwjVar) {
        bwjVar.y(-195307969);
        long ab = ab(18, bwjVar);
        bwjVar.q();
        return ab;
    }

    public static aqrv ay() {
        return new arll(new aqut(), 0);
    }

    public static final void az(RuntimeException runtimeException) {
        ((alwl) ((alwl) ((alwl) ahez.a.h()).g(runtimeException)).h("com/google/android/libraries/logging/ve/handlers/result/flogger/FloggerResultDaggerModule", "provideErrorHandler", 18, "FloggerResultDaggerModule.java")).o();
    }

    public static /* synthetic */ bse b() {
        dje djeVar = ahie.a;
        dje djeVar2 = ahie.d;
        dje djeVar3 = ahie.e;
        dje djeVar4 = ahie.f;
        dje djeVar5 = ahie.g;
        dje djeVar6 = ahie.h;
        dje djeVar7 = ahie.i;
        dje djeVar8 = ahie.m;
        dje djeVar9 = ahie.n;
        dje djeVar10 = ahie.o;
        dje djeVar11 = ahie.a;
        dje djeVar12 = ahie.b;
        dje djeVar13 = ahie.c;
        dje djeVar14 = ahie.j;
        dje djeVar15 = ahie.k;
        dje djeVar16 = ahie.l;
        djeVar2.getClass();
        djeVar3.getClass();
        djeVar4.getClass();
        djeVar5.getClass();
        djeVar6.getClass();
        djeVar7.getClass();
        djeVar8.getClass();
        djeVar9.getClass();
        djeVar10.getClass();
        djeVar11.getClass();
        djeVar12.getClass();
        djeVar13.getClass();
        djeVar14.getClass();
        djeVar15.getClass();
        djeVar16.getClass();
        return new bse(djeVar2, djeVar3, djeVar4, djeVar5, djeVar6, djeVar7, djeVar8, djeVar9, djeVar10, djeVar11, djeVar12, djeVar13, djeVar14, djeVar15, djeVar16, djeVar2, djeVar3, djeVar4, djeVar5, djeVar6, djeVar7, djeVar8, djeVar9, djeVar10, djeVar11, djeVar12, djeVar13, djeVar14, djeVar15, djeVar16);
    }

    public static final bsa c(long j, long j2, long j3, bwj bwjVar, int i) {
        long j4;
        long j5;
        long j6;
        long j7;
        bwjVar.y(53281385);
        if ((i & 1) != 0) {
            j4 = ab(35, bwjVar);
        } else {
            j4 = j;
        }
        if ((i & 2) != 0) {
            j5 = ab(37, bwjVar);
        } else {
            j5 = j2;
        }
        if ((i & 4) != 0) {
            j6 = ab(18, bwjVar);
        } else {
            j6 = 0;
        }
        if ((i & 8) != 0) {
            j7 = ab(18, bwjVar);
        } else {
            j7 = j3;
        }
        long ab = ab(19, bwjVar);
        float f = bsb.a;
        bsa b = bsb.b(j4, j5, j6, j7, ab, bwjVar, 0);
        ((bwk) bwjVar).Y();
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(defpackage.dhv r44, defpackage.cga r45, long r46, long r48, long r50, long r52, int r54, boolean r55, int r56, java.util.Map r57, defpackage.arqr r58, defpackage.dje r59, defpackage.bwj r60, int r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahji.d(dhv, cga, long, long, long, long, int, boolean, int, java.util.Map, arqr, dje, bwj, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0298  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(java.lang.String r43, defpackage.cga r44, long r45, long r47, long r49, defpackage.dqi r51, long r52, int r54, boolean r55, int r56, int r57, defpackage.arqr r58, defpackage.dje r59, defpackage.bwj r60, int r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 906
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahji.e(java.lang.String, cga, long, long, long, dqi, long, int, boolean, int, int, arqr, dje, bwj, int, int, int):void");
    }

    public static final aini f(aiks aiksVar, String str, ailu ailuVar, ailt ailtVar, aimg aimgVar, aimy aimyVar, List list, aimj aimjVar) {
        aini ainiVar = new aini(new aims(str, aiksVar));
        ainiVar.p(ailuVar);
        ainiVar.p(ailtVar);
        ainiVar.p(aimgVar);
        ainiVar.p(aimyVar);
        ainiVar.m("Via");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ainiVar.k((aimh) it.next());
        }
        ainiVar.p(aimjVar);
        return ainiVar;
    }

    public static final aikn g(aiks aiksVar) {
        aikn aiknVar = new aikn();
        aiknVar.b = aiksVar;
        return aiknVar;
    }

    public static final aikn h(String str) {
        if (str.equals("*")) {
            aikn aiknVar = new aikn();
            aiknVar.c = 3;
            return aiknVar;
        }
        return new ailc(str).g(true);
    }

    public static final aikp i(String str, int i, String str2) {
        aikp aikpVar = new aikp();
        aikv aikvVar = new aikv(str);
        aikpVar.a = new aiko();
        aiko aikoVar = aikpVar.a;
        if (aikoVar.a == null) {
            aikoVar.a = new aikw();
        }
        aikoVar.a.a = aikvVar;
        aikpVar.i(i);
        aikz aikzVar = new aikz("lr", null);
        aikpVar.b.i("lr");
        aikpVar.b.e(aikzVar);
        aikpVar.j(str2);
        return aikpVar;
    }

    public static final aiks j(String str) {
        if (str != null) {
            try {
                String str2 = null;
                ailc ailcVar = new ailc(str, (int[]) null);
                Vector g = ailcVar.a.g(1);
                if (g.size() != 0) {
                    str2 = ((ailg) g.elementAt(0)).a;
                }
                if (str2 != null) {
                    if (str2.equalsIgnoreCase("sip")) {
                        return ailcVar.k();
                    }
                    if (str2.equalsIgnoreCase("sips")) {
                        return ailcVar.k();
                    }
                    if (str2.equalsIgnoreCase("tel")) {
                        return ailcVar.m();
                    }
                    return new aiks(str);
                }
                throw new ailb("bad scheme");
            } catch (ailb e) {
                throw new ailb(Objects.toString(e.getMessage(), "Problems parsing URI"));
            }
        }
        throw new NullPointerException("null arg");
    }

    public static final aikp k(String str) {
        if (str != null) {
            try {
                return aO(str);
            } catch (ailb e) {
                throw new ailb(Objects.toString(e.getMessage(), "Problems parsing SIP URI"));
            }
        }
        throw new NullPointerException("null URI");
    }

    public static final aikp l(String str, boolean z, String str2, String str3) {
        if (str != null && !z) {
            return k(str);
        }
        if (str3 != null) {
            StringBuffer stringBuffer = new StringBuffer("sip:");
            if (str2 != null) {
                stringBuffer.append(str2);
                stringBuffer.append("@");
            }
            if (str3.indexOf(58) != str3.lastIndexOf(58) && str3.trim().charAt(0) != '[') {
                str3 = a.bW(str3, "[", "]");
            }
            stringBuffer.append(str3);
            try {
                return aO(stringBuffer.toString());
            } catch (ailb e) {
                throw new ailb(Objects.toString(e.getMessage(), "Problems parsing SIP URI"));
            }
        }
        throw new NullPointerException("null host");
    }

    public static int m(String str) {
        try {
            if (!Objects.isNull(str)) {
                return Integer.parseInt(str);
            }
            throw new aijn("Invalid SDP format, integer expected but got null.");
        } catch (NumberFormatException e) {
            throw new aijn("Invalid SDP format, integer expected: ".concat(String.valueOf(str)), e);
        }
    }

    public static aijr n(String str) {
        aijr aijrVar = new aijr();
        BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
        try {
            aiji aijiVar = null;
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                if (readLine.startsWith("v=")) {
                    String o = o(readLine, "v=");
                    try {
                        aijrVar.d = new aijq(Integer.parseInt(o));
                    } catch (NumberFormatException e) {
                        throw new aijn("Invalid SDP version format: ".concat(String.valueOf(o)), e);
                    }
                } else {
                    if (readLine.startsWith("o=")) {
                        aijrVar.e = aijl.e(readLine);
                    } else if (readLine.startsWith("s=")) {
                        aijrVar.f = new aijt(o(readLine, "s="));
                    } else if (readLine.startsWith("i=")) {
                        aijs c = aijs.c(readLine);
                        if (aijiVar == null) {
                            aijrVar.g = c;
                            aijiVar = null;
                        } else {
                            aijiVar.b = c;
                        }
                    } else if (readLine.startsWith("c=")) {
                        aijf a = aijf.a(readLine);
                        if (aijiVar == null) {
                            aijrVar.h = a;
                            aijiVar = null;
                        } else {
                            aijiVar.c = a;
                        }
                    } else if (readLine.startsWith("b=")) {
                        aije a2 = aije.a(readLine);
                        if (aijiVar == null) {
                            aijrVar.i = a2;
                            aijiVar = null;
                        } else {
                            aijiVar.d = a2;
                        }
                    } else if (readLine.startsWith("t=")) {
                        String o2 = o(readLine, "t=");
                        String[] split = o2.split(" ");
                        if (split.length >= 2) {
                            try {
                                aijrVar.c(new aiju(Long.valueOf(split[0]).longValue(), Long.valueOf(split[1]).longValue()));
                            } catch (NumberFormatException e2) {
                                throw new aijn(e2);
                            }
                        } else {
                            throw new aijn("Illegal format for time description: ".concat(String.valueOf(o2)));
                        }
                    } else if (readLine.startsWith("a=")) {
                        aijg a3 = aijg.a(readLine);
                        if (aijiVar == null) {
                            aijrVar.b.add(a3);
                            aijiVar = null;
                        } else {
                            aijiVar.e(a3);
                        }
                    } else if (readLine.startsWith("m=")) {
                        aijiVar = aiji.c(readLine);
                        aijrVar.a(aijiVar);
                    }
                }
            }
            return aijrVar;
        } catch (IOException e3) {
            throw new aijn(e3);
        }
    }

    public static String o(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (!Objects.isNull(str2) && !TextUtils.isEmpty(str2) && str.startsWith(str2)) {
                str = str.substring(str2.length());
            }
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.endsWith("\r")) {
                str = str.substring(0, str.length() - 1);
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            throw new aijn("Invalid SDP! Line only contains line feed or type but is empty otherwise!");
        }
        throw new aijn("Invalid SDP, line is empty");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.aijc p(java.io.InputStream r13) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahji.p(java.io.InputStream):aijc");
    }

    public static synchronized int q() {
        int i;
        synchronized (ahji.class) {
            int i2 = 20000;
            i = -1;
            while (i == -1) {
                try {
                    TrafficStats.setThreadStatsTag(Process.myPid());
                    ServerSocketFactory.getDefault().createServerSocket(i2).close();
                    TrafficStats.clearThreadStatsTag();
                    i = i2;
                } catch (IOException unused) {
                    TrafficStats.clearThreadStatsTag();
                    i2++;
                } catch (Throwable th) {
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
        }
        return i;
    }

    public static boolean r(aipc aipcVar) {
        Object obj;
        if (aipcVar.g) {
            aipg aipgVar = aipcVar.a;
            if (aipcVar.b) {
                obj = null;
            } else {
                obj = aipcVar.c.get();
            }
            if (!aipgVar.equals(obj)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static apjg s(int i, Socket socket, aipc aipcVar) {
        apjf apjfVar;
        int i2;
        int i3;
        int i4;
        aozy createBuilder = apjg.a.createBuilder();
        boolean z = socket instanceof SSLSocket;
        if (z) {
            apjfVar = apjf.SOCKET_PROTOCOL_TYPE_TLS;
        } else {
            apjfVar = apjf.SOCKET_PROTOCOL_TYPE_TCP;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apjg apjgVar = (apjg) apagVar;
        apjgVar.f = apjfVar.e;
        int i5 = 8;
        apjgVar.b |= 8;
        int i6 = i - 1;
        int i7 = 3;
        if (i6 != 1) {
            if (i6 != 2) {
                i2 = 2;
            } else {
                i2 = 3;
            }
        } else {
            i2 = 4;
        }
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        apjg apjgVar2 = (apjg) apagVar2;
        apjgVar2.g = i2 - 1;
        apjgVar2.b |= 16;
        if (true != z) {
            i3 = 2;
        } else {
            i3 = 5;
        }
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apjg apjgVar3 = (apjg) createBuilder.b;
        apjgVar3.c = i3 - 1;
        apjgVar3.b |= 1;
        switch (((aigg) aipcVar.a.a).ordinal()) {
            case 0:
                i5 = 2;
                break;
            case 1:
                i5 = 3;
                break;
            case 2:
                i5 = 4;
                break;
            case 3:
                i5 = 5;
                break;
            case 4:
                i5 = 6;
                break;
            case 5:
                i5 = 7;
                break;
            case 6:
                break;
            case 7:
                i5 = 9;
                break;
            case 8:
                i5 = 10;
                break;
            case 9:
                i5 = 11;
                break;
            case 10:
                i5 = 12;
                break;
            default:
                throw new IllegalArgumentException("unknown socket state");
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apjg apjgVar4 = (apjg) createBuilder.b;
        apjgVar4.m = i5 - 1;
        apjgVar4.b |= 2048;
        String uuid = aipcVar.f.toString();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        apjg apjgVar5 = (apjg) apagVar3;
        uuid.getClass();
        apjgVar5.b |= 4096;
        apjgVar5.n = uuid;
        int i8 = aipcVar.h;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        apag apagVar4 = createBuilder.b;
        apjg apjgVar6 = (apjg) apagVar4;
        apjgVar6.b |= 16384;
        apjgVar6.o = i8;
        int i9 = aipcVar.e;
        if (!apagVar4.isMutable()) {
            createBuilder.u();
        }
        apjg apjgVar7 = (apjg) createBuilder.b;
        apjgVar7.b |= 32768;
        apjgVar7.p = i9;
        if (!aipcVar.b) {
            int intValue = ((Integer) aipcVar.d.get()).intValue();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apjg apjgVar8 = (apjg) createBuilder.b;
            apjgVar8.b |= 65536;
            apjgVar8.q = intValue;
        }
        if (aipcVar.a.b().isPresent()) {
            String simpleName = ((Throwable) aipcVar.a.b().get()).getClass().getSimpleName();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apjg apjgVar9 = (apjg) createBuilder.b;
            simpleName.getClass();
            apjgVar9.b |= 131072;
            apjgVar9.r = simpleName;
        }
        if (socket.getLocalSocketAddress() != null) {
            SocketAddress localSocketAddress = socket.getLocalSocketAddress();
            if (localSocketAddress instanceof InetSocketAddress) {
                if (true != (((InetSocketAddress) localSocketAddress).getAddress() instanceof Inet4Address)) {
                    i4 = 3;
                } else {
                    i4 = 2;
                }
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apjg apjgVar10 = (apjg) createBuilder.b;
                apjgVar10.k = i4 - 1;
                apjgVar10.b |= 256;
            }
        }
        if (socket.getRemoteSocketAddress() != null) {
            SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
            if (remoteSocketAddress instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) remoteSocketAddress;
                boolean z2 = inetSocketAddress.getAddress() instanceof Inet4Address;
                String hostString = inetSocketAddress.getHostString();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apjg apjgVar11 = (apjg) createBuilder.b;
                hostString.getClass();
                apjgVar11.b |= 32;
                apjgVar11.h = hostString;
                int port = inetSocketAddress.getPort();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar5 = createBuilder.b;
                apjg apjgVar12 = (apjg) apagVar5;
                apjgVar12.b |= 64;
                apjgVar12.i = port;
                if (true == z2) {
                    i7 = 2;
                }
                if (!apagVar5.isMutable()) {
                    createBuilder.u();
                }
                apjg apjgVar13 = (apjg) createBuilder.b;
                apjgVar13.j = i7 - 1;
                apjgVar13.b |= 128;
            }
        }
        return (apjg) createBuilder.s();
    }

    public static void t(InputStream inputStream, Consumer consumer) {
        String ai = agkx.ai(inputStream);
        while (!albo.ah(ai)) {
            Pair pair = null;
            if (TextUtils.isEmpty(ai)) {
                advr.q("Unable to parse header from an empty line!", new Object[0]);
            } else {
                String[] split = ai.split(": ");
                if (split.length != 2) {
                    advr.q("Invalid CPIM header format: %s", ai);
                } else {
                    pair = Pair.create(split[0], split[1]);
                }
            }
            if (Objects.isNull(pair)) {
                advr.q("Skipping invalid element: %s", ai);
            } else {
                d$$ExternalSyntheticApiModelOutline0.m(consumer, pair);
            }
            ai = agkx.ai(inputStream);
        }
    }

    public static void u(Map map) {
        for (Map.Entry entry : ((alor) map).entrySet()) {
            akrh e = aktp.e((String) entry.getKey());
            try {
                ((aiex) ((armf) entry.getValue()).b()).a();
                e.close();
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static final void v(int i, cga cgaVar, long j, long j2, float f, arqw arqwVar, arqv arqvVar, arqv arqvVar2, bwj bwjVar, int i2, int i3) {
        int i4;
        cga cgaVar2;
        int i5;
        arqw e;
        long j3;
        long j4;
        arqv arqvVar3;
        float f2;
        cga cgaVar3;
        long j5;
        long j6;
        float f3;
        arqw arqwVar2;
        arqv arqvVar4;
        int i6;
        int i7;
        arqvVar2.getClass();
        bwj c = bwjVar.c(218982954);
        if ((i2 & 14) == 0) {
            if (true != c.E(i)) {
                i7 = 2;
            } else {
                i7 = 4;
            }
            i4 = i7 | i2;
        } else {
            i4 = i2;
        }
        int i8 = i4 | 48;
        if ((i2 & 896) == 0) {
            i8 = i4 | 176;
        }
        if ((i2 & 7168) == 0) {
            i8 |= 1024;
        }
        int i9 = 1794048 | i8;
        if ((29360128 & i2) == 0) {
            if (true != c.I(arqvVar2)) {
                i6 = 4194304;
            } else {
                i6 = VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
            }
            i9 |= i6;
        }
        if ((23967451 & i9) == 4793490 && c.L()) {
            c.v();
            cgaVar3 = cgaVar;
            j5 = j;
            j6 = j2;
            f3 = f;
            arqwVar2 = arqwVar;
            arqvVar4 = arqvVar;
        } else {
            c.w();
            if ((i2 & 1) != 0 && !c.J()) {
                c.v();
                i5 = i9 & (-8065);
                cgaVar2 = cgaVar;
                j3 = j;
                j4 = j2;
                f2 = f;
                e = arqwVar;
                arqvVar3 = arqvVar;
            } else {
                cga.a aVar = cga.e;
                c.y(291271527);
                long ab = ab(35, c);
                bwk bwkVar = (bwk) c;
                bwkVar.Y();
                c.y(1269314295);
                long ab2 = ab(18, c);
                bwkVar.Y();
                cgaVar2 = aVar;
                i5 = i9 & (-8065);
                e = cdk.e(1000586351, new ahhg(i), c);
                j3 = ab;
                j4 = ab2;
                arqvVar3 = ahgc.a;
                f2 = 52.0f;
            }
            c.n();
            brm.a(i, cgaVar2, j3, j4, f2, e, arqvVar3, arqvVar2, c, i5 & 33546366);
            cgaVar3 = cgaVar2;
            j5 = j3;
            j6 = j4;
            f3 = f2;
            arqwVar2 = e;
            arqvVar4 = arqvVar3;
        }
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new ahhh(i, cgaVar3, j5, j6, f3, arqwVar2, arqvVar4, arqvVar2, i2, 126);
        }
    }

    public static final void w(boolean z, arqg arqgVar, cga cgaVar, boolean z2, arqv arqvVar, long j, long j2, ajr ajrVar, bwj bwjVar, int i) {
        int i2;
        boolean z3;
        cga cgaVar2;
        long j3;
        long j4;
        ajr ajrVar2;
        cdi e;
        cga cgaVar3;
        long j5;
        ajr ajrVar3;
        int i3;
        int i4;
        int i5;
        arqgVar.getClass();
        int i6 = i & 14;
        bwj c = bwjVar.c(730053613);
        if (i6 == 0) {
            if (true != c.H(z)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i | i5;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.I(arqgVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        int i7 = i2 | 3456;
        if ((i & 57344) == 0) {
            if (true != c.I(arqvVar)) {
                i3 = 8192;
            } else {
                i3 = 16384;
            }
            i7 |= i3;
        }
        int i8 = 196608 | i7;
        if ((i & 3670016) == 0) {
            i8 = i7 | 720896;
        }
        if ((i & 29360128) == 0) {
            i8 |= 4194304;
        }
        int i9 = 100663296 | i8;
        if ((191739611 & i9) == 38347922 && c.L()) {
            c.v();
            cgaVar3 = cgaVar;
            z3 = z2;
            j3 = j;
            j5 = j2;
            ajrVar3 = ajrVar;
        } else {
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
                cgaVar2 = cgaVar;
                z3 = z2;
                j3 = j;
                j4 = j2;
                ajrVar2 = ajrVar;
            } else {
                cga.a aVar = cga.e;
                long j6 = ((cku) c.g(blp.a)).i;
                c.y(21533749);
                bwk bwkVar = (bwk) c;
                Object T = bwkVar.T();
                if (T == bwj.a.a) {
                    T = new ajs();
                    bwkVar.ad(T);
                }
                bwkVar.Y();
                z3 = true;
                cgaVar2 = aVar;
                j3 = j6;
                j4 = j3;
                ajrVar2 = (ajr) T;
            }
            c.n();
            c.y(21537151);
            if (arqvVar == null) {
                e = null;
            } else {
                e = cdk.e(1066915646, new ahhd(arqvVar, 0), c);
            }
            ((bwk) c).Y();
            brg.c(z, arqgVar, cgaVar2, z3, e, j3, j4, ajrVar2, c, i9 & 235347966);
            cgaVar3 = cgaVar2;
            j5 = j4;
            ajrVar3 = ajrVar2;
        }
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new ahhc(z, arqgVar, cgaVar3, z3, arqvVar, j3, j5, ajrVar3, i);
        }
    }

    public static final void x(boolean z, arqr arqrVar, cga cgaVar, bre breVar, ajr ajrVar, bwj bwjVar, int i) {
        int i2;
        cga cgaVar2;
        bre breVar2;
        cga cgaVar3;
        bre breVar3;
        int i3;
        int i4;
        int i5;
        int i6;
        bwj c = bwjVar.c(-789572113);
        if ((i & 14) == 0) {
            if (true != c.H(z)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i | i6;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.I(arqrVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i2 |= i5;
        }
        int i7 = i2 | 3456;
        if ((i & 57344) == 0) {
            if (true != c.H(true)) {
                i4 = 8192;
            } else {
                i4 = 16384;
            }
            i7 |= i4;
        }
        if ((i & 458752) == 0) {
            i7 |= 65536;
        }
        if ((i & 3670016) == 0) {
            if (true != c.G(ajrVar)) {
                i3 = 524288;
            } else {
                i3 = 1048576;
            }
            i7 |= i3;
        }
        if ((2995931 & i7) == 599186 && c.L()) {
            c.v();
            cgaVar3 = cgaVar;
            breVar3 = breVar;
        } else {
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
                cgaVar2 = cgaVar;
                breVar2 = breVar;
            } else {
                cga.a aVar = cga.e;
                c.y(640814011);
                bre breVar4 = new bre(ab(10, c), ab(26, c), cku.g, ab(11, c), ab(24, c), ab(39, c), ab(24, c), ab(39, c), ckw.h(cku.h(ab(35, c), 1.0f), bmp.a(c).p), ckw.h(cku.h(ab(18, c), 0.12f), bmp.a(c).p), cku.g, ckw.h(cku.h(ab(18, c), 0.38f), bmp.a(c).p), ckw.h(cku.h(ab(18, c), 0.38f), bmp.a(c).p), ckw.h(cku.h(ab(39, c), 0.12f), bmp.a(c).p), ckw.h(cku.h(ab(18, c), 0.12f), bmp.a(c).p), ckw.h(cku.h(ab(39, c), 0.38f), bmp.a(c).p));
                ((bwk) c).Y();
                cgaVar2 = aVar;
                breVar2 = breVar4;
            }
            c.n();
            cgaVar3 = cgaVar2;
            breVar3 = breVar2;
            brf.a(z, arqrVar, cgaVar3, breVar3, ajrVar, c, i7 & 3735550);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeod(z, arqrVar, cgaVar3, breVar3, ajrVar, i, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void y(defpackage.cga r32, defpackage.arqv r33, defpackage.arqv r34, defpackage.arqv r35, defpackage.arqv r36, int r37, long r38, long r40, defpackage.and r42, defpackage.arqw r43, defpackage.bwj r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahji.y(cga, arqv, arqv, arqv, arqv, int, long, long, and, arqw, bwj, int, int):void");
    }

    public static final void z(boolean z, arqg arqgVar, cga cgaVar, boolean z2, boj bojVar, ajr ajrVar, bwj bwjVar, int i) {
        int i2;
        cga.a aVar;
        boj bojVar2;
        boolean z3;
        cga cgaVar2;
        cga cgaVar3;
        boolean z4;
        boj bojVar3;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(528231714);
        if (i6 == 0) {
            if (true != c.H(z)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i | i5;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.I(arqgVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        int i7 = i2 | 3456;
        if ((i & 57344) == 0) {
            i7 = i2 | 11648;
        }
        if ((i & 458752) == 0) {
            if (true != c.G(ajrVar)) {
                i3 = 65536;
            } else {
                i3 = 131072;
            }
            i7 |= i3;
        }
        if ((374491 & i7) == 74898 && c.L()) {
            c.v();
            cgaVar3 = cgaVar;
            z4 = z2;
            bojVar3 = bojVar;
        } else {
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
                cgaVar2 = cgaVar;
                z3 = z2;
                bojVar2 = bojVar;
            } else {
                cga.a aVar2 = cga.e;
                c.y(708255984);
                long ab = ab(26, c);
                long ab2 = ab(19, c);
                long h = cku.h(ab(18, c), 0.38f);
                long h2 = cku.h(ab(18, c), 0.38f);
                blh a = bmp.a(c);
                boj bojVar4 = a.U;
                if (bojVar4 == null) {
                    buo buoVar = bvf.a;
                    aVar = aVar2;
                    bojVar4 = new boj(bli.b(a, bvf.d), bli.b(a, bvf.f), cku.h(bli.b(a, bvf.a), 0.38f), cku.h(bli.b(a, bvf.b), 0.38f));
                    a.U = bojVar4;
                } else {
                    aVar = aVar2;
                }
                if (ab == 16) {
                    ab = bojVar4.a;
                }
                long j = ab;
                if (ab2 == 16) {
                    ab2 = bojVar4.b;
                }
                long j2 = ab2;
                if (h == 16) {
                    h = bojVar4.c;
                }
                long j3 = h;
                if (h2 == 16) {
                    h2 = bojVar4.d;
                }
                boj bojVar5 = new boj(j, j2, j3, h2);
                ((bwk) c).Y();
                bojVar2 = bojVar5;
                z3 = true;
                cgaVar2 = aVar;
            }
            c.n();
            bok.a(z, arqgVar, cgaVar2, z3, bojVar2, ajrVar, c, i7 & 466942);
            cgaVar3 = cgaVar2;
            z4 = z3;
            bojVar3 = bojVar2;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new kbg(z, arqgVar, cgaVar3, z4, bojVar3, ajrVar, i, 5);
        }
    }
}
