package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.text.format.DateUtils;
import android.util.Log;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ajw;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;
import defpackage.csv;
import defpackage.cwl;
import defpackage.dhv;
import j$.time.Duration;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aetn {
    private static volatile atsg a;

    public static void A(aesx aesxVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c2 = bwjVar.c(-1249244177);
        if (i5 == 0) {
            if (true != c2.G(aesxVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c2.L()) {
            c2.v();
        } else {
            c2.y(1811733676);
            c = amv.c(cgaVar, 1.0f);
            cga a2 = chk.a(amh.i(amv.q(c, 68.0f, brg.a, 2), brg.a, 2.0f, 1), awh.a(24.0f));
            bwk bwkVar = (bwk) c2;
            bwkVar.Y();
            cga i6 = amh.i(a2, 16.0f, brg.a, 2);
            int i7 = cfq.a;
            cue a3 = amq.a(ajw.a, cfq.a.k, c2, 48);
            int a4 = bwg.a(c2);
            byx P = bwkVar.P();
            cga b = cfv.b(c2, i6);
            int i8 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar);
            } else {
                c2.C();
            }
            caw.b(c2, a3, cwl.a.e);
            caw.b(c2, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                bwkVar.ad(valueOf);
                c2.j(valueOf, arqvVar);
            }
            caw.b(c2, b, cwl.a.c);
            z(amu.a, aesxVar, c2, ((i2 << 3) & 112) | 6);
            ahji.e(((aesu) aesxVar.d).a, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, bmp.d(c2).g, c2, 0, 0, 65534);
            c2.p();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new aesw(aesxVar, cgaVar, i, 0);
        }
    }

    public static void B(String str, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        bwj bwjVar2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(340501333);
        if (i5 == 0) {
            if (true != c.G(str)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        int i6 = i2;
        if ((i6 & 91) == 18 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            int bb = adom.bb(BasePaymentResult.ERROR_REQUEST_FAILED);
            Uri parse = Uri.parse(str);
            int i7 = csv.a;
            csv csvVar = csv.a.b;
            Integer valueOf = Integer.valueOf(bb);
            bwjVar2 = c;
            aeke.bf(parse, "custom sticker", cgaVar, null, null, null, csvVar, null, brg.a, valueOf, valueOf, null, null, null, null, null, bwjVar2, ((i6 << 3) & 896) | 12582968, 0, 518008);
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new aesw(str, cgaVar, i, 2);
        }
    }

    public static void C(aesx aesxVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        cga c2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c3 = bwjVar.c(-1424455496);
        if (i5 == 0) {
            if (true != c3.G(aesxVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c3.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c3.L()) {
            c3.v();
        } else {
            c3.y(62700661);
            c = amv.c(cgaVar, 1.0f);
            cga a2 = chk.a(amh.i(amv.q(c, 68.0f, brg.a, 2), brg.a, 2.0f, 1), awh.a(24.0f));
            bwk bwkVar = (bwk) c3;
            bwkVar.Y();
            cga i6 = amh.i(a2, 16.0f, brg.a, 2);
            int i7 = cfq.a;
            cue a3 = amq.a(ajw.a, cfq.a.k, c3, 48);
            int a4 = bwg.a(c3);
            byx P = bwkVar.P();
            cga b = cfv.b(c3, i6);
            int i8 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c3.A();
            if (bwkVar.y) {
                c3.l(arqgVar);
            } else {
                c3.C();
            }
            caw.b(c3, a3, cwl.a.e);
            caw.b(c3, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                bwkVar.ad(valueOf);
                c3.j(valueOf, arqvVar);
            }
            caw.b(c3, b, cwl.a.c);
            c2 = amv.c(cgaVar, 1.0f);
            cue a5 = akk.a(ajw.c, cfq.a.m, c3, 0);
            int a6 = bwg.a(c3);
            byx P2 = bwkVar.P();
            cga b2 = cfv.b(c3, c2);
            arqg arqgVar2 = cwl.a.a;
            c3.A();
            if (bwkVar.y) {
                c3.l(arqgVar2);
            } else {
                c3.C();
            }
            caw.b(c3, a5, cwl.a.e);
            caw.b(c3, P2, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a6))) {
                Integer valueOf2 = Integer.valueOf(a6);
                bwkVar.ad(valueOf2);
                c3.j(valueOf2, arqvVar2);
            }
            caw.b(c3, b2, cwl.a.c);
            ako akoVar = ako.a;
            cfq.c cVar = cfq.a.k;
            cga.a aVar = cga.e;
            cue a7 = amq.a(ajw.a, cVar, c3, 48);
            int a8 = bwg.a(c3);
            byx P3 = bwkVar.P();
            cga b3 = cfv.b(c3, aVar);
            arqg arqgVar3 = cwl.a.a;
            c3.A();
            if (bwkVar.y) {
                c3.l(arqgVar3);
            } else {
                c3.C();
            }
            caw.b(c3, a7, cwl.a.e);
            caw.b(c3, P3, cwl.a.d);
            arqv arqvVar3 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a8))) {
                Integer valueOf3 = Integer.valueOf(a8);
                bwkVar.ad(valueOf3);
                c3.j(valueOf3, arqvVar3);
            }
            caw.b(c3, b3, cwl.a.c);
            z(amu.a, aesxVar, c3, ((i2 << 3) & 112) | 6);
            c3.p();
            B(((aesv) aesxVar.d).a, amh.j(akoVar.a(cga.e, cfq.a.m), brg.a, 8.0f, brg.a, brg.a, 13), c3, 0);
            c3.p();
            c3.p();
        }
        bzz e = c3.e();
        if (e != null) {
            ((bzf) e).d = new aesw(aesxVar, cgaVar, i, 3);
        }
    }

    public static void D(aesx aesxVar, cga cgaVar, bwj bwjVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        aesxVar.getClass();
        int i6 = i2 & 1;
        bwj c = bwjVar.c(-1538181723);
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (true != c.G(aesxVar)) {
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
        } else if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i3 |= i5;
        }
        if ((i3 & 91) == 18 && c.L()) {
            c.v();
        } else {
            if (i7 != 0) {
                cgaVar = cga.e;
            }
            aetn aetnVar = aesxVar.d;
            if (aetnVar instanceof aesv) {
                c.y(2041248363);
                C(aesxVar, cgaVar, c, i3 & 126);
                ((bwk) c).Y();
            } else if (aetnVar instanceof aesu) {
                c.y(2041250153);
                A(aesxVar, cgaVar, c, i3 & 126);
                ((bwk) c).Y();
            } else {
                c.y(2041247150);
                ((bwk) c).Y();
                throw new armm();
            }
        }
        cga cgaVar2 = cgaVar;
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeis(aesxVar, cgaVar2, i, i2, 7);
        }
    }

    public static void E(String str, bwj bwjVar, int i) {
        int i2;
        bwj bwjVar2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(1678108803);
        if (i4 == 0) {
            if (true != c.G(str)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            bwjVar2 = c;
            ahji.e(str, null, bmp.a(c).q, 0L, 0L, null, 0L, 2, false, 1, 0, null, bmp.d(c).j, bwjVar2, i2 & 14, 3120, 55290);
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new aery(str, i, 5);
        }
    }

    public static void F(aest aestVar, cga cgaVar, bwj bwjVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        cga cgaVar2;
        cga cgaVar3;
        int i6 = i2 & 1;
        bwj c = bwjVar.c(-247114737);
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (true != c.G(aestVar)) {
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
        } else if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i3 |= i5;
        }
        if ((i3 & 91) == 18 && c.L()) {
            c.v();
            cgaVar3 = cgaVar;
        } else {
            if (i7 != 0) {
                cgaVar2 = cga.e;
            } else {
                cgaVar2 = cgaVar;
            }
            c.y(-2039735255);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = new ajs();
                bwkVar.ad(T);
            }
            ajr ajrVar = (ajr) T;
            bwkVar.Y();
            G(cgaVar2, ajrVar, aestVar.d, cdk.e(-662568600, new ifo(aestVar, ajrVar, 15), c), c, ((i3 >> 3) & 14) | 3120);
            cgaVar3 = cgaVar2;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeis(aestVar, cgaVar3, i, i2, 6);
        }
    }

    public static void G(cga cgaVar, ajr ajrVar, arqg arqgVar, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        aev a2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i & 14;
        bwj c2 = bwjVar.c(-1410972339);
        if (i7 == 0) {
            if (true != c2.G(cgaVar)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.G(ajrVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (true != c2.I(arqgVar)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (true != c2.I(arqwVar)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) != 1170 || !c2.L()) {
            c = amv.c(cgaVar, 1.0f);
            cga i8 = amh.i(c, brg.a, 2.0f, 1);
            c2.y(-1858634999);
            if (((Boolean) adom.bY(c2).a.a()).booleanValue()) {
                a2 = bon.a(false, brg.a, 0L, 7);
            } else {
                a2 = biy.a(false, brg.a, c2, 0, 7);
            }
            aev aevVar = a2;
            bwk bwkVar = (bwk) c2;
            bwkVar.Y();
            cga e = amh.e(adw.b(i8, ajrVar, aevVar, false, null, null, arqgVar, 28), 16.0f, 6.0f);
            int i9 = cfq.a;
            int i10 = (i2 & 7168) | 384;
            cue a3 = amq.a(ajw.a, cfq.a.k, c2, 48);
            int a4 = bwg.a(c2);
            byx P = bwkVar.P();
            cga b = cfv.b(c2, e);
            int i11 = cwl.a;
            arqg arqgVar2 = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar2);
            } else {
                c2.C();
            }
            caw.b(c2, a3, cwl.a.e);
            caw.b(c2, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                bwkVar.ad(valueOf);
                c2.j(valueOf, arqvVar);
            }
            caw.b(c2, b, cwl.a.c);
            arqwVar.a(amu.a, c2, Integer.valueOf(((i10 >> 6) & 112) | 6));
            c2.p();
        } else {
            c2.v();
        }
        bzz e2 = c2.e();
        if (e2 != null) {
            ((bzf) e2).d = new lhq(cgaVar, ajrVar, arqgVar, arqwVar, i, 8);
        }
    }

    public static void H(String str, bwj bwjVar, int i) {
        int i2;
        bwj bwjVar2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(627231186);
        if (i4 == 0) {
            if (true != c.G(str)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            bwjVar2 = c;
            ahji.e(str, null, bmp.a(c).s, 0L, 0L, null, 0L, 0, false, 0, 0, null, bmp.d(c).k, bwjVar2, i2 & 14, 0, 65530);
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new aery(str, i, 3);
        }
    }

    public static void I(String str, bwj bwjVar, int i) {
        int i2;
        bwj bwjVar2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1045151888);
        if (i4 == 0) {
            if (true != c.G(str)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            bwjVar2 = c;
            ahji.e(str, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, bmp.d(c).j, bwjVar2, i2 & 14, 0, 65534);
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new aery(str, i, 4);
        }
    }

    public static void J(bwj bwjVar, int i) {
        cga c;
        cga b;
        int i2 = i | 54;
        int i3 = i2 & 91;
        bwj c2 = bwjVar.c(-411525320);
        if (i3 != 18 || !c2.L()) {
            c = amv.c(cga.e, 1.0f);
            cga f = amh.f(c, 16.0f, 14.0f, 24.0f, 14.0f);
            ajw.b bVar = ajw.a;
            int i4 = cfq.a;
            cue a2 = amq.a(bVar, cfq.a.j, c2, 0);
            int a3 = bwg.a(c2);
            bwk bwkVar = (bwk) c2;
            byx P = bwkVar.P();
            cga b2 = cfv.b(c2, f);
            int i5 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar);
            } else {
                c2.C();
            }
            caw.b(c2, a2, cwl.a.e);
            caw.b(c2, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                bwkVar.ad(valueOf);
                c2.j(valueOf, arqvVar);
            }
            caw.b(c2, b2, cwl.a.c);
            int i6 = i2 & 14;
            int i7 = i2 & 112;
            amu amuVar = amu.a;
            K(c2, i2 & 126);
            b = amuVar.b(cga.e, 1.0f, true);
            cga j = amh.j(b, 16.0f, brg.a, brg.a, brg.a, 14);
            cue a4 = akk.a(ajw.c, cfq.a.m, c2, 0);
            int a5 = bwg.a(c2);
            byx P2 = bwkVar.P();
            cga b3 = cfv.b(c2, j);
            arqg arqgVar2 = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar2);
            } else {
                c2.C();
            }
            caw.b(c2, a4, cwl.a.e);
            caw.b(c2, P2, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a5))) {
                Integer valueOf2 = Integer.valueOf(a5);
                bwkVar.ad(valueOf2);
                c2.j(valueOf2, arqvVar2);
            }
            caw.b(c2, b3, cwl.a.c);
            int i8 = i6 | 384 | i7;
            L(0.35f, c2, i8);
            amx.a(amv.d(cga.e, 2.0f), c2);
            L(0.55f, c2, i8);
            c2.p();
            L(0.15f, c2, i8);
            c2.p();
        } else {
            c2.v();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new aerz(i, 2);
        }
    }

    public static void K(bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        bwj c = bwjVar.c(-1752958801);
        if ((i & 14) == 0) {
            if (true != c.G(null)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(null)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            akc.b(adcx.aT(chk.a(amv.h(cga.e, 40.0f), awh.a), null, 4), c, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aerz(i, 3);
        }
    }

    public static void L(float f, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        bwj c = bwjVar.c(-1389127572);
        if ((i & 14) == 0) {
            if (true != c.G(null)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(null)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c.D(f)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            akc.b(adcx.aT(chk.a(amv.d(amv.c(cga.e, f), 18.0f), bmp.c(c).c), null, 4), c, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aess(f, i, 0);
        }
    }

    public static void M(aesr aesrVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        float f;
        bwj bwjVar2;
        long j;
        int i3;
        int i4;
        bwj c2 = bwjVar.c(-508138765);
        if ((i & 14) == 0) {
            if (true != c2.G(aesrVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        int i5 = i2 | 384;
        if ((i5 & 731) != 146 || !c2.L()) {
            c = amv.c(cgaVar, 1.0f);
            c2.y(-1656799414);
            float f2 = 24.0f;
            if (aesrVar.a != null) {
                f = 24.0f;
            } else {
                f = 16.0f;
            }
            bwk bwkVar = (bwk) c2;
            bwkVar.Y();
            cga e = amh.e(c, f, 12.0f);
            int i6 = cfq.a;
            cue a2 = amq.a(ajw.a, cfq.a.k, c2, 48);
            int a3 = bwg.a(c2);
            byx P = bwkVar.P();
            cga b = cfv.b(c2, e);
            int i7 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar);
            } else {
                c2.C();
            }
            caw.b(c2, a2, cwl.a.e);
            caw.b(c2, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                bwkVar.ad(valueOf);
                c2.j(valueOf, arqvVar);
            }
            caw.b(c2, b, cwl.a.c);
            aerb aerbVar = aesrVar.a;
            c2.y(-2089182188);
            if (aerbVar != null) {
                cga h = amv.h(cga.e, 24.0f);
                cor bg = aeke.bg(aerbVar, c2);
                if (aesrVar.c) {
                    c2.y(-1392261337);
                    j = bmp.a(c2).w;
                    bwkVar.Y();
                } else {
                    c2.y(-1392257815);
                    j = bmp.a(c2).a;
                    bwkVar.Y();
                }
                ahji.N(bg, null, h, j, c2, 392, 0);
            }
            bwkVar.Y();
            cga.a aVar = cga.e;
            c2.y(1847138529);
            if (aesrVar.a == null) {
                f2 = brg.a;
            }
            bwkVar.Y();
            cga j2 = amh.j(aVar, f2, brg.a, brg.a, brg.a, 14);
            c2.y(-2089166606);
            dje djeVar = bmp.d(c2).j;
            bwkVar.Y();
            bwjVar2 = c2;
            aeim.f(aesrVar, j2, bmp.a(c2).q, djeVar, 0L, null, false, null, c2, i5 & 14, 496);
            bwjVar2.p();
        } else {
            c2.v();
            bwjVar2 = c2;
        }
        bzz e2 = bwjVar2.e();
        if (e2 != null) {
            ((bzf) e2).d = new aeqs(aesrVar, cgaVar, i, 20);
        }
    }

    public static void N(aesq aesqVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(1290128093);
        if (i5 == 0) {
            if (true != c.G(aesqVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            ahji.U(cgaVar, 1.0f, 0L, c, (i2 >> 3) & 14, 4);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeqs(aesqVar, cgaVar, i, 19);
        }
    }

    public static void O(String str, String str2, List list, bwj bwjVar, int i) {
        cga c;
        bwj c2 = bwjVar.c(678071983);
        c = amv.c(cga.e, 1.0f);
        cga j = amh.j(c, 16.0f, brg.a, 8.0f, brg.a, 10);
        ajw.e eVar = ajw.c;
        int i2 = cfq.a;
        cue a2 = akk.a(eVar, cfq.a.m, c2, 0);
        int a3 = bwg.a(c2);
        bwk bwkVar = (bwk) c2;
        byx P = bwkVar.P();
        cga b = cfv.b(c2, j);
        int i3 = cwl.a;
        arqg arqgVar = cwl.a.a;
        c2.A();
        if (bwkVar.y) {
            c2.l(arqgVar);
        } else {
            c2.C();
        }
        caw.b(c2, a2, cwl.a.e);
        caw.b(c2, P, cwl.a.d);
        arqv arqvVar = cwl.a.f;
        if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a3))) {
            Integer valueOf = Integer.valueOf(a3);
            bwkVar.ad(valueOf);
            c2.j(valueOf, arqvVar);
        }
        caw.b(c2, b, cwl.a.c);
        Y(str, list, c2, (i & 14) | 512);
        c2.y(-288526141);
        if (str2 != null) {
            X(str2, list, c2, 512);
        }
        bwkVar.Y();
        c2.p();
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new aelx(str, str2, list, i, 18);
        }
    }

    public static void P(aesp aespVar, cga cgaVar, bwj bwjVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        aespVar.getClass();
        int i6 = i2 & 1;
        bwj c = bwjVar.c(538036457);
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (true != c.G(aespVar)) {
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
        } else if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i3 |= i5;
        }
        if ((i3 & 91) == 18 && c.L()) {
            c.v();
        } else {
            if (i7 != 0) {
                cgaVar = cga.e;
            }
            if (aespVar instanceof aesl) {
                c.y(2053093260);
                S((aesl) aespVar, cgaVar, c, i3 & 112);
                ((bwk) c).Y();
            } else if (aespVar instanceof aeso) {
                c.y(2053095884);
                T((aeso) aespVar, cgaVar, c, i3 & 112);
                ((bwk) c).Y();
            } else if (aespVar instanceof aesk) {
                c.y(2053098277);
                R((aesk) aespVar, cgaVar, c, i3 & 112);
                ((bwk) c).Y();
            } else if (aespVar instanceof aesn) {
                c.y(2053100618);
                W((aesn) aespVar, cgaVar, c, i3 & 112);
                ((bwk) c).Y();
            } else if (aespVar instanceof aesm) {
                c.y(2053103147);
                V((aesm) aespVar, cgaVar, c, i3 & 112);
                ((bwk) c).Y();
            } else if (aespVar instanceof aesj) {
                c.y(2053105674);
                Q((aesj) aespVar, cgaVar, c, i3 & 112);
                ((bwk) c).Y();
            } else {
                c.y(2053091821);
                ((bwk) c).Y();
                throw new armm();
            }
        }
        cga cgaVar2 = cgaVar;
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeis(aespVar, cgaVar2, i, i2, 5);
        }
    }

    public static void Q(aesj aesjVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        cga b;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c2 = bwjVar.c(-1954386582);
        if (i5 == 0) {
            if (true != c2.G(aesjVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c2.L()) {
            c2.v();
        } else {
            c2.y(708729964);
            bwk bwkVar = (bwk) c2;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                byu byuVar = new byu(false, cav.a);
                bwkVar.ad(byuVar);
                T = byuVar;
            }
            byn bynVar = (byn) T;
            bwkVar.Y();
            c = amv.c(cgaVar, 1.0f);
            cga f = amh.f(c.a(aO(cga.e)), 16.0f, 13.0f, 4.0f, 13.0f);
            int i6 = cfq.a;
            cue a2 = amq.a(ajw.a, cfq.a.k, c2, 48);
            int a3 = bwg.a(c2);
            byx P = bwkVar.P();
            cga b2 = cfv.b(c2, f);
            int i7 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar);
            } else {
                c2.C();
            }
            caw.b(c2, a2, cwl.a.e);
            caw.b(c2, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                bwkVar.ad(valueOf);
                c2.j(valueOf, arqvVar);
            }
            caw.b(c2, b2, cwl.a.c);
            amu amuVar = amu.a;
            adcx.bo(aesjVar.a, amv.h(cga.e, 40.0f), c2, 48);
            b = amuVar.b(cga.e, 1.0f, true);
            cga j = amh.j(b, 16.0f, brg.a, 8.0f, brg.a, 10);
            cue a4 = akk.a(ajw.c, cfq.a.m, c2, 0);
            int a5 = bwg.a(c2);
            byx P2 = bwkVar.P();
            cga b3 = cfv.b(c2, j);
            arqg arqgVar2 = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar2);
            } else {
                c2.C();
            }
            caw.b(c2, a4, cwl.a.e);
            caw.b(c2, P2, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a5))) {
                Integer valueOf2 = Integer.valueOf(a5);
                bwkVar.ad(valueOf2);
                c2.j(valueOf2, arqvVar2);
            }
            caw.b(c2, b3, cwl.a.c);
            Y(aesjVar.b, aesjVar.e, c2, 512);
            String str = aesjVar.d;
            c2.y(-1232655185);
            if (str != null) {
                X(str, aesjVar.e, c2, 512);
            }
            bwkVar.Y();
            c2.p();
            String str2 = aesjVar.f;
            c2.y(1988287723);
            if (str2 != null) {
                U(str2, amh.j(cga.e, brg.a, brg.a, 4.0f, brg.a, 11), c2, 48);
            }
            bwkVar.Y();
            c2.y(1988291619);
            Object T2 = bwkVar.T();
            if (T2 == bwj.a.a) {
                T2 = new aeot(bynVar, 5);
                bwkVar.ad(T2);
            }
            bwkVar.Y();
            ahji.P((arqg) T2, null, false, null, null, cdk.e(1272223912, new ifn(bynVar, aesjVar, 19, null), c2), c2, 1572870, 62);
            c2.p();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new aeqs(aesjVar, cgaVar, i, 10);
        }
    }

    public static void R(aesk aeskVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        aev a2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-628842084);
        if (i5 == 0) {
            if (true != c.G(aeskVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            cga a3 = chk.a(amh.e(cgaVar, 8.0f, 2.0f), awh.a(24.0f));
            c.y(1798543581);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = new ajs();
                bwkVar.ad(T);
            }
            ajr ajrVar = (ajr) T;
            bwkVar.Y();
            c.y(1798545978);
            if (((Boolean) adom.bY(c).a.a()).booleanValue()) {
                a2 = bon.a(false, brg.a, 0L, 7);
            } else {
                a2 = biy.a(true, brg.a, c, 6, 6);
            }
            bwkVar.Y();
            cga f = amh.f(adw.b(a3, ajrVar, a2, false, null, null, aeskVar.e, 28), 8.0f, 12.0f, 16.0f, 12.0f);
            int i6 = cfq.a;
            cue a4 = amq.a(ajw.a, cfq.a.k, c, 48);
            int a5 = bwg.a(c);
            byx P = bwkVar.P();
            cga b = cfv.b(c, f);
            int i7 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a4, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a5))) {
                Integer valueOf = Integer.valueOf(a5);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b, cwl.a.c);
            adcx.bo(aeskVar.a, amv.h(cga.e, 40.0f), c, 48);
            c.y(-1116762958);
            O(aeskVar.b, aeskVar.c, aeskVar.d, c, 512);
            bwkVar.Y();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeqs(aeskVar, cgaVar, i, 11);
        }
    }

    public static void S(aesl aeslVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        bwj bwjVar2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-854056214);
        if (i5 == 0) {
            if (true != c.G(aeslVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            cga j = amh.j(cgaVar, 30.0f, 14.0f, brg.a, 6.0f, 4);
            bwjVar2 = c;
            ahji.e(aeslVar.a, j, bmp.a(c).q, 0L, 0L, null, 0L, 0, false, 0, 0, null, bmp.d(c).m, bwjVar2, 0, 0, 65528);
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new aeqs(aeslVar, cgaVar, i, 12);
        }
    }

    public static void T(aeso aesoVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        cga a2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c2 = bwjVar.c(2010349802);
        if (i5 == 0) {
            if (true != c2.G(aesoVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !c2.L()) {
            c = amv.c(cgaVar, 1.0f);
            a2 = adf.a(c, bmp.a(c2).F, clw.a);
            int i6 = cfq.a;
            cue a3 = akc.a(cfq.a.a, false);
            int a4 = bwg.a(c2);
            bwk bwkVar = (bwk) c2;
            byx P = bwkVar.P();
            cga b = cfv.b(c2, a2);
            int i7 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar);
            } else {
                c2.C();
            }
            caw.b(c2, a3, cwl.a.e);
            caw.b(c2, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                bwkVar.ad(valueOf);
                c2.j(valueOf, arqvVar);
            }
            caw.b(c2, b, cwl.a.c);
            amh.j(cgaVar, 30.0f, 4.0f, brg.a, 4.0f, 4);
            throw null;
        }
        c2.v();
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new aeqs(aesoVar, cgaVar, i, 13);
        }
    }

    public static void U(String str, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        bwj bwjVar2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(1208124056);
        if (i5 == 0) {
            if (true != c.G(str)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        int i6 = i2;
        if ((i6 & 91) == 18 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            bwjVar2 = c;
            ahji.e(str, amv.t(cgaVar, brg.a, 72.0f, 1), bmp.a(c).s, 0L, 0L, null, 0L, 2, false, 1, 0, null, bmp.d(c).l, bwjVar2, i6 & 14, 3120, 55288);
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new aeqs(str, cgaVar, i, 15);
        }
    }

    public static void V(aesm aesmVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        aev a2;
        cga b;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c2 = bwjVar.c(-1065312468);
        if (i5 == 0) {
            if (true != c2.G(aesmVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !c2.L()) {
            c = amv.c(cgaVar, 1.0f);
            c2.y(1777151573);
            bwk bwkVar = (bwk) c2;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = new ajs();
                bwkVar.ad(T);
            }
            ajr ajrVar = (ajr) T;
            bwkVar.Y();
            c2.y(1777154106);
            if (((Boolean) adom.bY(c2).a.a()).booleanValue()) {
                a2 = bon.a(false, brg.a, 0L, 7);
            } else {
                a2 = biy.a(true, brg.a, c2, 6, 6);
            }
            bwkVar.Y();
            cga f = amh.f(adw.b(c, ajrVar, a2, false, null, null, aesmVar.e, 28), 16.0f, 14.0f, 14.0f, 14.0f);
            int i6 = cfq.a;
            cue a3 = amq.a(ajw.a, cfq.a.k, c2, 48);
            int a4 = bwg.a(c2);
            byx P = bwkVar.P();
            cga b2 = cfv.b(c2, f);
            int i7 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar);
            } else {
                c2.C();
            }
            caw.b(c2, a3, cwl.a.e);
            caw.b(c2, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                bwkVar.ad(valueOf);
                c2.j(valueOf, arqvVar);
            }
            caw.b(c2, b2, cwl.a.c);
            amu amuVar = amu.a;
            adcx.bo(aesmVar.a, amv.h(cga.e, 40.0f), c2, 48);
            b = amuVar.b(cga.e, 1.0f, true);
            cga j = amh.j(b, 16.0f, brg.a, 8.0f, brg.a, 10);
            cue a5 = akk.a(ajw.c, cfq.a.m, c2, 0);
            int a6 = bwg.a(c2);
            byx P2 = bwkVar.P();
            cga b3 = cfv.b(c2, j);
            arqg arqgVar2 = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar2);
            } else {
                c2.C();
            }
            caw.b(c2, a5, cwl.a.e);
            caw.b(c2, P2, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a6))) {
                Integer valueOf2 = Integer.valueOf(a6);
                bwkVar.ad(valueOf2);
                c2.j(valueOf2, arqvVar2);
            }
            caw.b(c2, b3, cwl.a.c);
            Y(aesmVar.b, aesmVar.d, c2, 512);
            X(aesmVar.c, aesmVar.d, c2, 512);
            c2.p();
            ahji.N(aeke.bg(aerb.ab, c2), dga.a(R.string.list_item_redirect_caret, c2), amv.h(cga.e, 24.0f), bmp.a(c2).s, c2, 392, 0);
            c2.p();
        } else {
            c2.v();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new aeqs(aesmVar, cgaVar, i, 17);
        }
    }

    public static void W(aesn aesnVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        long j;
        cga c;
        cga b;
        String a2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c2 = bwjVar.c(-357963990);
        if (i5 == 0) {
            if (true != c2.G(aesnVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c2.L()) {
            c2.v();
        } else if (((aewg) aesnVar.a).f != 3) {
            c2.y(805965559);
            bwk bwkVar = (bwk) c2;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = new ajs();
                bwkVar.ad(T);
            }
            ajr ajrVar = (ajr) T;
            bwkVar.Y();
            if (aesnVar.d) {
                c2.y(-784782630);
                j = bmp.a(c2).F;
                bwkVar.Y();
            } else {
                c2.y(-784721405);
                j = bmp.a(c2).p;
                bwkVar.Y();
            }
            cga f = amh.f(adw.b(chk.a(adf.a(amh.e(cga.e, 8.0f, 2.0f), j, awh.a(24.0f)), awh.a(24.0f)), ajrVar, null, false, null, null, aesnVar.f, 28), 8.0f, 12.0f, 8.0f, 12.0f);
            int i6 = cfq.a;
            cue a3 = akc.a(cfq.a.a, false);
            int a4 = bwg.a(c2);
            byx P = bwkVar.P();
            cga b2 = cfv.b(c2, f);
            int i7 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar);
            } else {
                c2.C();
            }
            caw.b(c2, a3, cwl.a.e);
            caw.b(c2, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                bwkVar.ad(valueOf);
                c2.j(valueOf, arqvVar);
            }
            caw.b(c2, b2, cwl.a.c);
            c = amv.c(cgaVar, 1.0f);
            cue a5 = amq.a(ajw.a, cfq.a.k, c2, 48);
            int a6 = bwg.a(c2);
            byx P2 = bwkVar.P();
            cga b3 = cfv.b(c2, c);
            arqg arqgVar2 = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar2);
            } else {
                c2.C();
            }
            caw.b(c2, a5, cwl.a.e);
            caw.b(c2, P2, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a6))) {
                Integer valueOf2 = Integer.valueOf(a6);
                bwkVar.ad(valueOf2);
                c2.j(valueOf2, arqvVar2);
            }
            caw.b(c2, b3, cwl.a.c);
            amu amuVar = amu.a;
            adcx.bo(aesnVar.a, amv.h(cga.e, 40.0f), c2, 48);
            b = amuVar.b(cga.e, 1.0f, true);
            cga j2 = amh.j(b, 16.0f, brg.a, 8.0f, brg.a, 10);
            cue a7 = akk.a(ajw.c, cfq.a.m, c2, 0);
            int a8 = bwg.a(c2);
            byx P3 = bwkVar.P();
            cga b4 = cfv.b(c2, j2);
            arqg arqgVar3 = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar3);
            } else {
                c2.C();
            }
            caw.b(c2, a7, cwl.a.e);
            caw.b(c2, P3, cwl.a.d);
            arqv arqvVar3 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a8))) {
                Integer valueOf3 = Integer.valueOf(a8);
                bwkVar.ad(valueOf3);
                c2.j(valueOf3, arqvVar3);
            }
            caw.b(c2, b4, cwl.a.c);
            Y(aesnVar.b, aesnVar.e, c2, 512);
            X(aesnVar.c, aesnVar.e, c2, 512);
            c2.p();
            cga h = amv.h(cga.e, 30.0f);
            boolean z = aesnVar.d;
            c2.y(-723587255);
            if (z) {
                c2.y(1349928930);
                a2 = dga.a(R.string.list_item_selected, c2);
                bwkVar.Y();
            } else {
                c2.y(1349987520);
                a2 = dga.a(R.string.list_item_unselected, c2);
                bwkVar.Y();
            }
            bwkVar.Y();
            c2.y(1755065736);
            int i8 = i2 & 14;
            Object T2 = bwkVar.T();
            if (i8 == 4 || T2 == bwj.a.a) {
                T2 = new aeql(aesnVar, 9);
                bwkVar.ad(T2);
            }
            bwkVar.Y();
            aeke.Q(new aeml(a2, z, (arqr) T2, false), h, c2, 48);
            c2.p();
            c2.p();
        } else {
            throw new IllegalStateException("Monograms with the selected icon override should not be used in selectable list items. The checkbox is already included as part of the list item.");
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new aeqs(aesnVar, cgaVar, i, 18);
        }
    }

    public static void X(String str, List list, bwj bwjVar, int i) {
        bwj c = bwjVar.c(-293776775);
        cga j = amh.j(cga.e, brg.a, 2.0f, brg.a, brg.a, 13);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((aesi) obj).d == 2) {
                arrayList.add(obj);
            }
        }
        ahji.d(bm(str, arrayList, c), j, bmp.a(c).s, 0L, 0L, 0L, 2, false, 1, null, null, bmp.d(c).k, c, 0, 3120, 55288);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeqs(str, list, i, 14, null);
        }
    }

    public static void Y(String str, List list, bwj bwjVar, int i) {
        bwj c = bwjVar.c(935140663);
        cga.a aVar = cga.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((aesi) obj).d == 1) {
                arrayList.add(obj);
            }
        }
        ahji.d(bm(str, arrayList, c), aVar, bmp.a(c).q, 0L, 0L, 0L, 2, false, 1, null, null, bmp.d(c).j, c, i & 112, 3120, 55288);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeqs(str, list, i, 16, null);
        }
    }

    public static void Z(aesh aeshVar, ajr ajrVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-470618256);
        if (i5 == 0) {
            if (true != c.G(aeshVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(ajrVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            boolean z = aeshVar.d;
            c.y(1681022086);
            int i6 = i2 & 14;
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (i6 == 4 || T == bwj.a.a) {
                T = new aeql(aeshVar, 8);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            ahji.ae(z, (arqr) T, null, false, null, ajrVar, c, (i2 << 12) & 458752, 28);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeqs(aeshVar, ajrVar, i, 7);
        }
    }

    public static Point a(Integer num, Integer num2, int i, int i2, int i3, int i4) {
        float intValue;
        float f;
        int intValue2;
        if (i4 == 3) {
            double intValue3 = num.intValue();
            double intValue4 = num2.intValue();
            double intValue5 = num.intValue();
            double m = arrn.m(i / intValue3, i3 / intValue4);
            return new Point(arrn.s((int) (intValue5 * m), i), arrn.s((int) (m * num2.intValue()), i2));
        }
        if (num.intValue() <= i && num2.intValue() <= i2) {
            if (i4 == 2) {
                if (num.intValue() > num2.intValue()) {
                    f = i;
                    intValue2 = num.intValue();
                } else {
                    f = i2;
                    intValue2 = num2.intValue();
                }
                intValue = f / intValue2;
            } else if (num.intValue() >= i3 && num2.intValue() >= i3) {
                intValue = 1.0f;
            } else {
                intValue = i3 / Math.min(num.intValue(), num2.intValue());
            }
        } else {
            float f2 = i;
            float f3 = i2;
            if (f2 / f3 < num.intValue() / num2.intValue()) {
                intValue = f2 / num.intValue();
            } else {
                intValue = f3 / num2.intValue();
            }
        }
        float f4 = i;
        if (num.intValue() * intValue > f4) {
            return new Point(i, (int) (num2.intValue() * (f4 / num.intValue())));
        }
        float f5 = i2;
        if (num2.intValue() * intValue > f5) {
            return new Point((int) (num.intValue() * (f5 / num2.intValue())), i2);
        }
        return new Point(arrn.u((int) (num.intValue() * intValue), i3, i), arrn.u((int) (num2.intValue() * intValue), i3, i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void aA(defpackage.aeki r20, defpackage.cga r21, defpackage.cmb r22, defpackage.bwj r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aetn.aA(aeki, cga, cmb, bwj, int, int):void");
    }

    public static void aB(ake akeVar, cmb cmbVar, bwj bwjVar, int i) {
        int i2;
        long f;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-125455114);
        if (i5 == 0) {
            if (true != c.G(akeVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cmbVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            cga b = akeVar.b(cga.e);
            f = ckw.f(cku.d(r1), cku.c(r1), cku.b(r1), 0.3f, cku.f(bmp.a(c).a));
            akc.b(adf.a(b, f, cmbVar), c, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aekg(akeVar, cmbVar, i, 5);
        }
    }

    public static void aC(aejk aejkVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(1281972601);
        if (i4 == 0) {
            if (true != c.G(aejkVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
        } else {
            cga d = amh.d(cga.e, 8.0f);
            int i5 = cfq.a;
            cue a2 = amq.a(new ajw.d(12.0f, true, ajx.a), cfq.a.k, c, 54);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, d);
            int i6 = cwl.a;
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
            caw.b(c, b, cwl.a.c);
            int i7 = i2 & 14;
            amu amuVar = amu.a;
            aE(aejkVar, c, i7);
            cga b2 = amuVar.b(cga.e, 1.0f, false);
            cue a4 = akc.a(cfq.a.a, false);
            int a5 = bwg.a(c);
            byx P2 = bwkVar.P();
            cga b3 = cfv.b(c, b2);
            arqg arqgVar2 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar2);
            } else {
                c.C();
            }
            caw.b(c, a4, cwl.a.e);
            caw.b(c, P2, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a5))) {
                Integer valueOf2 = Integer.valueOf(a5);
                bwkVar.ad(valueOf2);
                c.j(valueOf2, arqvVar2);
            }
            caw.b(c, b3, cwl.a.c);
            aF(aejkVar, c, i7);
            c.p();
            aD(c, 0);
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aaob(aejkVar, i, 11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void aD(defpackage.bwj r10, int r11) {
        /*
            r0 = 1276009169(0x4c0e5ad1, float:3.7317444E7)
            bwj r10 = r10.c(r0)
            r0 = 0
            if (r11 != 0) goto L16
            boolean r11 = r10.L()
            if (r11 != 0) goto L12
            r11 = r0
            goto L16
        L12:
            r10.v()
            goto L38
        L16:
            cga$a r1 = defpackage.cga.e
            r5 = 0
            r6 = 10
            r2 = 1082130432(0x40800000, float:4.0)
            r3 = 0
            r4 = 1090519040(0x41000000, float:8.0)
            cga r3 = defpackage.amh.j(r1, r2, r3, r4, r5, r6)
            r1 = 2131231892(0x7f080494, float:1.8079878E38)
            cor r1 = defpackage.dfv.a(r1, r10, r0)
            r8 = 392(0x188, float:5.5E-43)
            r9 = 120(0x78, float:1.68E-43)
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = r10
            defpackage.aet.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = r11
        L38:
            bzz r10 = r10.e()
            if (r10 == 0) goto L49
            lhs r11 = new lhs
            r1 = 9
            r11.<init>(r0, r1)
            bzf r10 = (defpackage.bzf) r10
            r10.d = r11
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aetn.aD(bwj, int):void");
    }

    public static void aE(aejk aejkVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-684293294);
        if (i4 == 0) {
            if (true != c.G(aejkVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
            bzz e = c.e();
            if (e != null) {
                ((bzf) e).d = new aaob(aejkVar, i, 12);
                return;
            }
            return;
        }
        chk.a(amv.h(cga.e, 56.0f), bmp.c(c).b);
        throw null;
    }

    public static void aF(aejk aejkVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1201806586);
        if (i4 == 0) {
            if (true != c.G(aejkVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
            bzz e = c.e();
            if (e != null) {
                ((bzf) e).d = new aaob(aejkVar, i, 13);
                return;
            }
            return;
        }
        cga.a aVar = cga.e;
        ajw.e eVar = ajw.c;
        int i5 = cfq.a;
        cue a2 = akk.a(eVar, cfq.a.m, c, 0);
        int a3 = bwg.a(c);
        bwk bwkVar = (bwk) c;
        byx P = bwkVar.P();
        cga b = cfv.b(c, aVar);
        int i6 = cwl.a;
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
        caw.b(c, b, cwl.a.c);
        throw null;
    }

    public static void aG(aekf aekfVar, bwj bwjVar, int i) {
        int i2;
        aerb aerbVar;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(1090328051);
        if (i4 == 0) {
            if (true != c.G(aekfVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
        } else {
            cga d = amh.d(amv.h(adf.a(cga.e, bmp.a(c).a, awh.a), 36.0f), 8.0f);
            int ordinal = aekfVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        aerbVar = aerb.aE;
                    } else {
                        throw new armm();
                    }
                } else {
                    aerbVar = aerb.L;
                }
            } else {
                aerbVar = aerb.aF;
            }
            ahji.N(aeke.bg(aerbVar, c), null, d, bmp.a(c).b, c, 8, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aaob(aekfVar, i, 7);
        }
    }

    public static void aH(aejh aejhVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-2143667013);
        if (i4 == 0) {
            if (true != c.G(aejhVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
        } else {
            cga.a aVar = cga.e;
            ajw.e eVar = ajw.c;
            int i5 = cfq.a;
            cue a2 = akk.a(eVar, cfq.a.m, c, 0);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, aVar);
            int i6 = cwl.a;
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
            caw.b(c, b, cwl.a.c);
            ahji.e(aejhVar.b, null, bmp.a(c).q, 0L, 0L, null, 0L, 2, false, 1, 0, null, bmp.d(c).i, c, 0, 3120, 55290);
            String str = aejhVar.c;
            c.y(-1746816298);
            if (str != null) {
                ahji.e(str, null, bmp.a(c).s, 0L, 0L, null, 0L, 2, false, 1, 0, null, bmp.d(c).l, c, 0, 3120, 55290);
            }
            bwkVar.Y();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aaob(aejhVar, i, 8);
        }
    }

    public static void aI(aejg aejgVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(1581255366);
        if (i5 == 0) {
            if (true != c.G(aejgVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            aeke.aP(new aerw(aerb.aM, aejgVar.a, aejgVar.b, false, false, 120), alw.b(cgaVar, alx.b), c, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zcj(aejgVar, cgaVar, i, 18);
        }
    }

    public static void aJ(aejh aejhVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-1372695026);
        if (i5 == 0) {
            if (true != c.G(aejhVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            int i6 = cfq.a;
            cue a2 = akc.a(cfq.a.a, false);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, cgaVar);
            int i7 = cwl.a;
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
            caw.b(c, b, cwl.a.c);
            cga b2 = alw.b(amh.e(cga.e, 16.0f, 18.0f), alx.b);
            cue a4 = amq.a(ajw.a, cfq.a.k, c, 48);
            int a5 = bwg.a(c);
            byx P2 = bwkVar.P();
            cga b3 = cfv.b(c, b2);
            arqg arqgVar2 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar2);
            } else {
                c.C();
            }
            caw.b(c, a4, cwl.a.e);
            caw.b(c, P2, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a5))) {
                Integer valueOf2 = Integer.valueOf(a5);
                bwkVar.ad(valueOf2);
                c.j(valueOf2, arqvVar2);
            }
            caw.b(c, b3, cwl.a.c);
            aG(aejhVar.a, c, 0);
            amx.a(amv.l(cga.e, 12.0f), c);
            aH(aejhVar, c, i2 & 14);
            c.y(974555334);
            bwkVar.Y();
            c.p();
            c.y(-1377587368);
            bwkVar.Y();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zcj(aejhVar, cgaVar, i, 19);
        }
    }

    public static void aK(cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1869457258);
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
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
        } else {
            awg a2 = awh.a(20.0f);
            cga e = amh.e(cgaVar, 16.0f, 18.0f);
            int i5 = cfq.a;
            cue a3 = amq.a(ajw.a, cfq.a.k, c, 48);
            int a4 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, e);
            int i6 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a3, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b, cwl.a.c);
            aL(chk.a(amv.h(cga.e, 36.0f), awh.a), c, 0);
            amx.a(amv.l(cga.e, 12.0f), c);
            cga.a aVar = cga.e;
            cue a5 = akk.a(ajw.c, cfq.a.m, c, 0);
            int a6 = bwg.a(c);
            byx P2 = bwkVar.P();
            cga b2 = cfv.b(c, aVar);
            arqg arqgVar2 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar2);
            } else {
                c.C();
            }
            caw.b(c, a5, cwl.a.e);
            caw.b(c, P2, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a6))) {
                Integer valueOf2 = Integer.valueOf(a6);
                bwkVar.ad(valueOf2);
                c.j(valueOf2, arqvVar2);
            }
            caw.b(c, b2, cwl.a.c);
            aL(chk.a(amv.d(amv.l(cga.e, 82.0f), 14.0f), a2), c, 0);
            amx.a(amv.d(cga.e, 4.0f), c);
            aL(chk.a(amv.d(amv.l(cga.e, 44.0f), 14.0f), a2), c, 0);
            c.p();
            c.p();
        }
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new aaob(cgaVar, i, 9);
        }
    }

    public static void aL(cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-686708619);
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
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
        } else {
            akc.b(adcx.aT(cgaVar, null, 7), c, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aaob(cgaVar, i, 10);
        }
    }

    public static void aM(aejj aejjVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1615513694);
        if (i4 == 0) {
            if (true != c.G(aejjVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i5 = i2 | 48;
        if ((i5 & 91) == 18 && c.L()) {
            c.v();
        } else {
            boolean z = aejjVar instanceof aeji;
            cga.a aVar = cga.e;
            if (z) {
                c.y(-361646940);
                aK(aVar, c, (i5 >> 3) & 14);
                ((bwk) c).Y();
            } else if (aejjVar instanceof aejh) {
                c.y(-361644759);
                aJ((aejh) aejjVar, aVar, c, i5 & 112);
                ((bwk) c).Y();
            } else if (aejjVar instanceof aejg) {
                c.y(-361642456);
                aI((aejg) aejjVar, aVar, c, i5 & 112);
                ((bwk) c).Y();
            } else {
                c.y(-361648466);
                ((bwk) c).Y();
                throw new armm();
            }
            cgaVar = aVar;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zcj(aejjVar, cgaVar, i, 17);
        }
    }

    public static cga aN(cga cgaVar, String str, boolean z) {
        cgaVar.getClass();
        return dhb.c(cgaVar, z, new aaji(str, 18));
    }

    public static cga aO(cga cgaVar) {
        cgaVar.getClass();
        return dhb.c(cgaVar, true, aedh.d);
    }

    public static cga aP(cga cgaVar) {
        cgaVar.getClass();
        return dhb.b(cgaVar, aedh.e);
    }

    public static /* synthetic */ cga aQ(cga cgaVar, String str) {
        return aN(cgaVar, str, true);
    }

    public static /* synthetic */ String aR(int i) {
        if (i != 1) {
            return "SYNC_FAILURE_REASON";
        }
        return "CONFIG_DATA_MAP";
    }

    public static apmm aS(int i, int i2) {
        aozy createBuilder = apmm.a.createBuilder();
        aozy createBuilder2 = apmo.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        apmo apmoVar = (apmo) apagVar;
        apmoVar.b |= 1;
        apmoVar.c = i;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        apmo apmoVar2 = (apmo) createBuilder2.b;
        apmoVar2.d = a.ak(i2);
        apmoVar2.b |= 2;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apmm apmmVar = (apmm) createBuilder.b;
        apmo apmoVar3 = (apmo) createBuilder2.s();
        apmoVar3.getClass();
        apmmVar.c = apmoVar3;
        apmmVar.b = 1;
        return (apmm) createBuilder.s();
    }

    public static apmm aT(UUID uuid, int i, UUID uuid2) {
        aozy createBuilder = apmm.a.createBuilder();
        aozy createBuilder2 = apmr.a.createBuilder();
        String uuid3 = uuid.toString();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apmr apmrVar = (apmr) createBuilder2.b;
        uuid3.getClass();
        apmrVar.b |= 1;
        apmrVar.e = uuid3;
        String uuid4 = uuid2.toString();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apmr apmrVar2 = (apmr) createBuilder2.b;
        uuid4.getClass();
        apmrVar2.b |= 2;
        apmrVar2.f = uuid4;
        aozy createBuilder3 = apms.a.createBuilder();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        apms apmsVar = (apms) createBuilder3.b;
        apmsVar.c = a.am(4);
        apmsVar.b |= 1;
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        apms apmsVar2 = (apms) createBuilder3.b;
        apmsVar2.d = a.ao(i);
        apmsVar2.b |= 2;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apmr apmrVar3 = (apmr) createBuilder2.b;
        apms apmsVar3 = (apms) createBuilder3.s();
        apmsVar3.getClass();
        apmrVar3.d = apmsVar3;
        apmrVar3.c = 3;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apmm apmmVar = (apmm) createBuilder.b;
        apmr apmrVar4 = (apmr) createBuilder2.s();
        apmrVar4.getClass();
        apmmVar.c = apmrVar4;
        apmmVar.b = 3;
        return (apmm) createBuilder.s();
    }

    public static apmm aU(UUID uuid, int i, UUID uuid2) {
        aozy createBuilder = apmm.a.createBuilder();
        aozy createBuilder2 = apmr.a.createBuilder();
        String uuid3 = uuid.toString();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apmr apmrVar = (apmr) createBuilder2.b;
        uuid3.getClass();
        apmrVar.b |= 1;
        apmrVar.e = uuid3;
        String uuid4 = uuid2.toString();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apmr apmrVar2 = (apmr) createBuilder2.b;
        uuid4.getClass();
        apmrVar2.b |= 2;
        apmrVar2.f = uuid4;
        aozy createBuilder3 = apms.a.createBuilder();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        apms apmsVar = (apms) createBuilder3.b;
        apmsVar.c = a.am(i);
        apmsVar.b |= 1;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apmr apmrVar3 = (apmr) createBuilder2.b;
        apms apmsVar2 = (apms) createBuilder3.s();
        apmsVar2.getClass();
        apmrVar3.d = apmsVar2;
        apmrVar3.c = 3;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apmm apmmVar = (apmm) createBuilder.b;
        apmr apmrVar4 = (apmr) createBuilder2.s();
        apmrVar4.getClass();
        apmmVar.c = apmrVar4;
        apmmVar.b = 3;
        return (apmm) createBuilder.s();
    }

    public static aegp aV(Context context, Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            hashSet.add(context.getString(((Integer) it.next()).intValue()));
        }
        return new aegq(hashSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void aW(Intent intent, abjx abjxVar) {
        String str;
        long j;
        float f;
        double d;
        int V = a.V(abjxVar.e);
        if (V == 0) {
            V = 1;
        }
        int i = 0;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        switch (V - 2) {
            case 0:
                throw new IllegalArgumentException("Can't assign unknown extra");
            case 1:
                String str2 = abjxVar.d;
                if (abjxVar.b == 3) {
                    str = (String) abjxVar.c;
                } else {
                    str = "";
                }
                intent.putExtra(str2, str);
                return;
            case 2:
                String str3 = abjxVar.d;
                if (abjxVar.b == 4) {
                    i = ((Integer) abjxVar.c).intValue();
                }
                intent.putExtra(str3, (byte) i);
                return;
            case 3:
                String str4 = abjxVar.d;
                if (abjxVar.b == 5) {
                    i3 = ((Integer) abjxVar.c).intValue();
                }
                intent.putExtra(str4, (short) i3);
                return;
            case 4:
                String str5 = abjxVar.d;
                if (abjxVar.b == 6) {
                    i2 = ((Integer) abjxVar.c).intValue();
                }
                intent.putExtra(str5, i2);
                return;
            case 5:
                String str6 = abjxVar.d;
                if (abjxVar.b == 7) {
                    j = ((Long) abjxVar.c).longValue();
                } else {
                    j = 0;
                }
                intent.putExtra(str6, j);
                return;
            case 6:
                String str7 = abjxVar.d;
                if (abjxVar.b == 8) {
                    f = ((Float) abjxVar.c).floatValue();
                } else {
                    f = brg.a;
                }
                intent.putExtra(str7, f);
                return;
            case 7:
                String str8 = abjxVar.d;
                if (abjxVar.b == 9) {
                    d = ((Double) abjxVar.c).doubleValue();
                } else {
                    d = 0.0d;
                }
                intent.putExtra(str8, d);
                return;
            case 8:
                String str9 = abjxVar.d;
                if (abjxVar.b == 10) {
                    z = ((Boolean) abjxVar.c).booleanValue();
                }
                intent.putExtra(str9, z);
                return;
            case 9:
                String[] strArr = new String[abjxVar.f.size()];
                for (int i4 = 0; i4 < abjxVar.f.size(); i4++) {
                    strArr[i4] = (String) abjxVar.f.get(i4);
                }
                intent.putExtra(abjxVar.d, strArr);
                return;
            case 10:
                byte[] bArr = new byte[abjxVar.g.size()];
                for (int i5 = 0; i5 < abjxVar.g.size(); i5++) {
                    bArr[i5] = (byte) abjxVar.g.d(i5);
                }
                intent.putExtra(abjxVar.d, bArr);
                return;
            case 11:
                short[] sArr = new short[abjxVar.h.size()];
                for (int i6 = 0; i6 < abjxVar.h.size(); i6++) {
                    sArr[i6] = (short) abjxVar.h.d(i6);
                }
                intent.putExtra(abjxVar.d, sArr);
                return;
            case 12:
                int[] iArr = new int[abjxVar.i.size()];
                for (int i7 = 0; i7 < abjxVar.i.size(); i7++) {
                    iArr[i7] = abjxVar.i.d(i7);
                }
                intent.putExtra(abjxVar.d, iArr);
                return;
            case 13:
                long[] jArr = new long[abjxVar.j.size()];
                for (int i8 = 0; i8 < abjxVar.j.size(); i8++) {
                    jArr[i8] = abjxVar.j.a(i8);
                }
                intent.putExtra(abjxVar.d, jArr);
                return;
            case 14:
                float[] fArr = new float[abjxVar.k.size()];
                for (int i9 = 0; i9 < abjxVar.k.size(); i9++) {
                    fArr[i9] = abjxVar.k.d(i9);
                }
                intent.putExtra(abjxVar.d, fArr);
                return;
            case 15:
                double[] dArr = new double[abjxVar.l.size()];
                for (int i10 = 0; i10 < abjxVar.l.size(); i10++) {
                    dArr[i10] = abjxVar.l.d(i10);
                }
                intent.putExtra(abjxVar.d, dArr);
                return;
            case 16:
                boolean[] zArr = new boolean[abjxVar.m.size()];
                for (int i11 = 0; i11 < abjxVar.m.size(); i11++) {
                    zArr[i11] = abjxVar.m.g(i11);
                }
                intent.putExtra(abjxVar.d, zArr);
                return;
            default:
                throw new IllegalArgumentException("Unrecognized extra type");
        }
    }

    public static /* synthetic */ void aX(amt amtVar, bwj bwjVar, int i) {
        amtVar.getClass();
        if ((i & 81) == 16 && bwjVar.L()) {
            bwjVar.v();
        }
    }

    public static /* synthetic */ void aY(StringBuilder sb, String str, int i) {
        for (int length = i - str.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(str);
    }

    public static /* synthetic */ apbt aZ(apbt apbtVar, byte[] bArr) {
        try {
            return apbtVar.toBuilder().h(bArr, aozs.a()).s();
        } catch (apba e) {
            throw new IllegalStateException(e);
        }
    }

    public static void aa(cga cgaVar, ajr ajrVar, boolean z, arqg arqgVar, cfq.c cVar, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        aev a2;
        float f;
        float f2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i & 14;
        bwj c2 = bwjVar.c(-1970084125);
        if (i9 == 0) {
            if (true != c2.G(cgaVar)) {
                i8 = 2;
            } else {
                i8 = 4;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.G(ajrVar)) {
                i7 = 16;
            } else {
                i7 = 32;
            }
            i2 |= i7;
        }
        if ((i & 896) == 0) {
            if (true != c2.H(z)) {
                i6 = 128;
            } else {
                i6 = 256;
            }
            i2 |= i6;
        }
        if ((i & 7168) == 0) {
            if (true != c2.I(arqgVar)) {
                i5 = 1024;
            } else {
                i5 = 2048;
            }
            i2 |= i5;
        }
        if ((57344 & i) == 0) {
            if (true != c2.G(cVar)) {
                i4 = 8192;
            } else {
                i4 = 16384;
            }
            i2 |= i4;
        }
        if ((458752 & i) == 0) {
            if (true != c2.I(arqwVar)) {
                i3 = 65536;
            } else {
                i3 = 131072;
            }
            i2 |= i3;
        }
        if ((374491 & i2) != 74898 || !c2.L()) {
            c = amv.c(cgaVar, 1.0f);
            cga a3 = chk.a(amh.i(amv.q(c, 56.0f, brg.a, 2), brg.a, 2.0f, 1), awh.a(24.0f));
            c2.y(-451212653);
            if (((Boolean) adom.bY(c2).a.a()).booleanValue()) {
                a2 = bon.a(false, brg.a, 0L, 7);
            } else {
                a2 = biy.a(true, brg.a, c2, 6, 6);
            }
            aev aevVar = a2;
            bwk bwkVar = (bwk) c2;
            bwkVar.Y();
            cga b = adw.b(a3, ajrVar, aevVar, false, null, null, arqgVar, 28);
            if (z) {
                f = 8.0f;
            } else {
                f = 2.0f;
            }
            if (z) {
                f2 = 2.0f;
            } else {
                f2 = 8.0f;
            }
            cga j = amh.j(b, f, brg.a, f2, brg.a, 10);
            int i10 = (i2 >> 6) & 8064;
            cue a4 = amq.a(ajw.a, cVar, c2, (i10 >> 3) & 112);
            int a5 = bwg.a(c2);
            byx P = bwkVar.P();
            cga b2 = cfv.b(c2, j);
            int i11 = cwl.a;
            arqg arqgVar2 = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar2);
            } else {
                c2.C();
            }
            caw.b(c2, a4, cwl.a.e);
            caw.b(c2, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a5))) {
                Integer valueOf = Integer.valueOf(a5);
                bwkVar.ad(valueOf);
                c2.j(valueOf, arqvVar);
            }
            caw.b(c2, b2, cwl.a.c);
            arqwVar.a(amu.a, c2, Integer.valueOf(((i10 >> 6) & 112) | 6));
            c2.p();
        } else {
            c2.v();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new aanz(cgaVar, ajrVar, z, arqgVar, cVar, arqwVar, i, 3);
        }
    }

    public static void ab(String str, List list, bwj bwjVar, int i) {
        bwj c = bwjVar.c(-570758912);
        aeim.f(new aeiq(str, list, 12), null, bmp.a(c).s, bmp.d(c).k, 0L, null, false, null, c, 0, 498);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeqs(str, list, i, 9, null);
        }
    }

    public static void ac(aesh aeshVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(1504950297);
        if (i4 == 0) {
            if (true != c.G(aeshVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
        } else {
            ahji.e(aeshVar.a, null, bmp.a(c).q, 0L, 0L, null, 0L, 2, false, aeshVar.h, 0, null, bmp.d(c).j, c, 0, 48, 55290);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aery(aeshVar, i, 2);
        }
    }

    public static void ad(aesh aeshVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(1596002353);
        if (i5 == 0) {
            if (true != c.G(aeshVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            c.y(1164596427);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = new ajs();
                bwkVar.ad(T);
            }
            ajr ajrVar = (ajr) T;
            bwkVar.Y();
            aa(cgaVar, ajrVar, aeshVar.e, aeshVar.f, aeshVar.g, cdk.e(-1583984142, new ifo(aeshVar, ajrVar, 13), c), c, ((i2 >> 3) & 14) | 196656);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeqs(aeshVar, cgaVar, i, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void ae(defpackage.aesg r14, defpackage.cga r15, defpackage.bwj r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aetn.ae(aesg, cga, bwj, int, int):void");
    }

    public static void af(aekv aekvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-2143150952);
        if (i4 == 0) {
            if (true != c.G(aekvVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
            bzz e = c.e();
            if (e != null) {
                ((bzf) e).d = new aaob(aekvVar, i, 17);
                return;
            }
            return;
        }
        int i5 = aekvVar.a;
        throw null;
    }

    public static void ag(aeku aekuVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(1341050588);
        if (i4 == 0) {
            if (true != c.G(aekuVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
        } else {
            arqg arqgVar = aekuVar.b;
            cga.a aVar = cga.e;
            c.y(-1728814032);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = new ajs();
                bwkVar.ad(T);
            }
            bwkVar.Y();
            cga aO = aO(adw.b(aVar, (ajr) T, null, false, null, null, arqgVar, 20));
            ajw.d dVar = new ajw.d(8.0f, true, ajx.a);
            int i5 = cfq.a;
            cue a2 = amq.a(dVar, cfq.a.j, c, 6);
            int a3 = bwg.a(c);
            byx P = bwkVar.P();
            cga b = cfv.b(c, aO);
            int i6 = cwl.a;
            arqg arqgVar2 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar2);
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
            caw.b(c, b, cwl.a.c);
            c.y(1240303289);
            Iterator it = aekuVar.a.iterator();
            while (it.hasNext()) {
                ah((aelb) it.next(), aekuVar.b, c, 0);
            }
            bwkVar.Y();
            c.p();
            Integer valueOf2 = Integer.valueOf(aekuVar.a.size());
            c.y(-1728804515);
            int i7 = i2 & 14;
            Object T2 = bwkVar.T();
            if (i7 == 4 || T2 == bwj.a.a) {
                T2 = new aanv(aekuVar, (arpe) null, 15);
                bwkVar.ad(T2);
            }
            bwkVar.Y();
            bxl.g(valueOf2, (arqv) T2, c);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aaob(aekuVar, i, 18);
        }
    }

    public static void ah(aelb aelbVar, arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-1358968908);
        if (i5 == 0) {
            if (true != c.G(aelbVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.I(arqgVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else if (aelbVar instanceof aekz) {
            c.y(1665737031);
            ap((aekz) aelbVar, arqgVar, c, i2 & 112);
            ((bwk) c).Y();
        } else if (aelbVar instanceof aeky) {
            c.y(1665739312);
            ao((aeky) aelbVar, arqgVar, c, i2 & 112);
            ((bwk) c).Y();
        } else if (aelbVar instanceof aekw) {
            c.y(1665741599);
            aj((aekw) aelbVar, c, 0);
            ((bwk) c).Y();
        } else if (aelbVar instanceof aekx) {
            c.y(1665743425);
            ak((aekx) aelbVar, c, 0);
            ((bwk) c).Y();
        } else if (aelbVar instanceof aela) {
            c.y(1665745214);
            aq((aela) aelbVar, c, 0);
            ((bwk) c).Y();
        } else if (aelbVar instanceof aekv) {
            c.y(1665747075);
            af((aekv) aelbVar, c, 0);
            ((bwk) c).Y();
        } else {
            c.y(1665735888);
            ((bwk) c).Y();
            throw new armm();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aekg(aelbVar, arqgVar, i, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void ai(int r22, java.lang.String r23, defpackage.aeli r24, long r25, long r27, float r29, float r30, defpackage.arqw r31, defpackage.bwj r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aetn.ai(int, java.lang.String, aeli, long, long, float, float, arqw, bwj, int, int):void");
    }

    public static void aj(aekw aekwVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1352888872);
        if (i4 == 0) {
            if (true != c.G(aekwVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
        } else if (aekwVar.a.length() == 0) {
            c.y(798319636);
            String str = aekwVar.c;
            int i5 = aekwVar.b;
            aeli aeliVar = aekwVar.d;
            aerb aerbVar = aerb.bq;
            cku ckuVar = new cku(bp(adom.cc(c), c));
            c.y(-251334145);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = accd.n;
                bwkVar.ad(T);
            }
            bwkVar.Y();
            al(aerbVar, str, i5, aeliVar, ckuVar, (arqg) T, c, 196614, 0);
            bwkVar.Y();
        } else {
            c.y(798593769);
            ai(aekwVar.b, aekwVar.c, aekwVar.d, 0L, 0L, brg.a, brg.a, cdk.e(976690, new yzl(aekwVar, 14), c), c, 12582912, 120);
            ((bwk) c).Y();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aaob(aekwVar, i, 19);
        }
    }

    public static void ak(aekx aekxVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(1329682360);
        if (i4 == 0) {
            if (true != c.G(aekxVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
        } else {
            int i5 = aekxVar.c;
            String str = aekxVar.d;
            aeli aeliVar = aekxVar.e;
            float bq = bq(c) * aekxVar.b;
            aeli aeliVar2 = aekxVar.e;
            ai(i5, str, aeliVar, 0L, 0L, bq, bq(c) * aekxVar.b, cdk.e(1471659118, new yzl(aekxVar, 15), c), c, 12582912, 24);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aaob(aekxVar, i, 20);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void al(defpackage.aerb r22, java.lang.String r23, int r24, defpackage.aeli r25, defpackage.cku r26, defpackage.arqg r27, defpackage.bwj r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aetn.al(aerb, java.lang.String, int, aeli, cku, arqg, bwj, int, int):void");
    }

    public static void am(String str, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-929465029);
        if (i4 == 0) {
            if (true != c.G(str)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
        } else {
            Uri parse = Uri.parse(str);
            int i5 = csv.a;
            aeke.bf(parse, null, amh.d(cga.e, 0.5f), null, null, null, csv.a.b, null, brg.a, null, null, null, null, null, null, null, c, 12583352, 0, 524152);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelf(str, i, 1);
        }
    }

    public static void an(String str, bwj bwjVar, int i) {
        int i2;
        bwj bwjVar2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1680758493);
        if (i4 == 0) {
            if (true != c.G(str)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            bwjVar2 = c;
            ahji.e(str, aP(cga.e), ((cku) c.g(blp.a)).i, 0L, 0L, new dqi(3), 0L, 0, false, 0, 0, null, bn(c), bwjVar2, i2 & 14, 0, 65016);
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new aelf(str, i, 0);
        }
    }

    public static void ao(aeky aekyVar, arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(1226331052);
        if (i5 == 0) {
            if (true != c.G(aekyVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.I(arqgVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            ddz ddzVar = (ddz) c.g(dch.j);
            Context context = (Context) c.g(AndroidCompositionLocals_androidKt.b);
            View view = (View) c.g(AndroidCompositionLocals_androidKt.f);
            al(aerb.cL, aekyVar.a, 0, aekyVar.b, null, new jda((Object) ddzVar, (Object) context, (Object) view, arqgVar, 19), c, 6, 16);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aekg(aekyVar, arqgVar, i, 9);
        }
    }

    public static void ap(aekz aekzVar, arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(1774718724);
        if (i5 == 0) {
            if (true != c.G(aekzVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.I(arqgVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            String str = aekzVar.a;
            al(aerb.dd, null, 0, aekzVar.b, null, arqgVar, c, ((i2 << 12) & 458752) | 6, 16);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aekg(aekzVar, arqgVar, i, 10);
        }
    }

    public static void aq(aela aelaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(374984922);
        if (i5 == 0) {
            if (true != c.G(aelaVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
            i3 = 2;
        } else {
            dja a2 = djb.a(c);
            String str = aelaVar.b;
            aeli aeliVar = aelaVar.c;
            float f = ((int) (dja.a(a2, aelaVar.a, bn(c), 0, 0, 0L, 1020).c >> 32)) / Resources.getSystem().getDisplayMetrics().density;
            aeli aeliVar2 = aelaVar.c;
            i3 = 2;
            ai(0, str, aeliVar, 0L, 0L, Math.max(((int) f) + (bq(c) - bo(8, c)), bo(40, c)), brg.a, cdk.e(-1110477296, new yzl(aelaVar, 16), c), c, 12582912, 88);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelf(aelaVar, i, i3);
        }
    }

    public static void ar(aelg aelgVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(1041713513);
        if (i5 == 0) {
            if (true != c.G(aelgVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            ajw.d dVar = new ajw.d(12.0f, true, ajx.a);
            int i6 = cfq.a;
            cue a2 = amq.a(dVar, cfq.a.j, c, 6);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, cgaVar);
            int i7 = cwl.a;
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
            caw.b(c, b, cwl.a.c);
            c.y(-1952479991);
            int i8 = 0;
            for (Object obj : aelgVar.a) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    aqjn.G();
                }
                ag((aeku) obj, c, 0);
                i8 = i9;
            }
            bwkVar.Y();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aekg((Object) aelgVar, cgaVar, i, 8);
        }
    }

    public static float as(long j, bwj bwjVar) {
        bwjVar.y(1135685962);
        float ef = ((dqv) bwjVar.g(dch.d)).ef(j);
        bwjVar.q();
        return ef;
    }

    public static boolean at(aeko aekoVar) {
        if (aekoVar == null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void au(defpackage.aekt r24, defpackage.cga r25, long r26, long r28, float r30, float r31, defpackage.bwj r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aetn.au(aekt, cga, long, long, float, float, bwj, int, int):void");
    }

    public static arsy av(byn bynVar) {
        return (arsy) bynVar.a();
    }

    public static void aw(float f, bwj bwjVar, int i) {
        int i2;
        cga a2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(304703075);
        if (i4 == 0) {
            if (true != c.D(f)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !c.L()) {
            a2 = adf.a(chk.a(amv.h(cga.e, f), awh.a), bmp.a(c).w, clw.a);
            akc.b(a2, c, 0);
        } else {
            c.v();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aess(f, i, 1);
        }
    }

    public static void ax(aekm aekmVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        cga cgaVar2;
        float f;
        long j;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-581172012);
        if (i4 == 0) {
            if (true != c.G(aekmVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 91) == 18 && c.L()) {
            c.v();
            cgaVar2 = cgaVar;
        } else {
            cgaVar2 = cga.e;
            ajw.c cVar = ajw.e;
            int i5 = cfq.a;
            cue a2 = amq.a(cVar, cfq.a.k, c, 54);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, cgaVar2);
            int i6 = cwl.a;
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
            caw.b(c, b, cwl.a.c);
            cga h = amv.h(cga.e, 8.0f);
            cue a4 = akc.a(cfq.a.e, false);
            int a5 = bwg.a(c);
            byx P2 = bwkVar.P();
            cga b2 = cfv.b(c, h);
            arqg arqgVar2 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar2);
            } else {
                c.C();
            }
            caw.b(c, a4, cwl.a.e);
            caw.b(c, P2, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a5))) {
                Integer valueOf2 = Integer.valueOf(a5);
                bwkVar.ad(valueOf2);
                c.j(valueOf2, arqvVar2);
            }
            caw.b(c, b2, cwl.a.c);
            c.y(-662782749);
            f = ((dqy) aay.c(aay.b(c), new dqy(4.0f), new dqy(8.0f), aci.c, adom.bZ(c).g, c, 37304).a()).a;
            bwkVar.Y();
            aw(f, c, 0);
            c.p();
            cga j2 = amh.j(cga.e, 7.0f, brg.a, brg.a, brg.a, 14);
            String formatElapsedTime = DateUtils.formatElapsedTime(aekmVar.a.getSeconds());
            formatElapsedTime.getClass();
            c.y(-1182005364);
            Duration minus = aekmVar.b.minus(aekmVar.a);
            Duration duration = aekl.a;
            if (minus.compareTo(aekl.a) <= 0) {
                c.y(-379416308);
                j = bmp.a(c).w;
                bwkVar.Y();
            } else {
                c.y(-379369560);
                j = bmp.a(c).q;
                bwkVar.Y();
            }
            bwkVar.Y();
            ahji.e(formatElapsedTime, j2, j, 0L, 0L, null, 0L, 0, false, 0, 0, null, dje.y(bmp.d(c).k, 0L, 0L, null, null, null, "tnum", 0L, 0, 0, 0L, null, null, 0, 16777151), c, 48, 0, 65528);
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aekg((Object) aekmVar, cgaVar2, i, 6);
        }
    }

    public static void ay(ake akeVar, bwj bwjVar, int i) {
        int i2;
        cga b;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1366866309);
        if (i4 == 0) {
            if (true != c.G(akeVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
        } else {
            cga j = amh.j(amv.h(cga.e, 32.0f), 4.0f, brg.a, brg.a, 4.0f, 6);
            int i5 = cfq.a;
            cga a2 = cgh.a(adf.a(akeVar.a(j, cfq.a.g), bmp.a(c).a, awh.a), 1.0f);
            cue a3 = akc.a(cfq.a.a, false);
            int a4 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b2 = cfv.b(c, a2);
            int i6 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a3, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b2, cwl.a.c);
            akf akfVar = akf.a;
            cor bg = aeke.bg(aerb.cg, c);
            String a5 = dga.a(R.string.attachment_bubble_magic_edit, c);
            long j2 = bmp.a(c).b;
            b = amv.b(cga.e, 1.0f);
            ahji.N(bg, a5, akfVar.a(amh.d(b, 4.0f), cfq.a.e), j2, c, 8, 0);
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aaob(akeVar, i, 16);
        }
    }

    public static void az(aekk aekkVar, cga cgaVar, cku ckuVar, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        bwk bwkVar;
        cga cgaVar2;
        akf akfVar;
        int i3;
        int i4;
        int i5;
        arqwVar.getClass();
        int i6 = i & 14;
        bwj c = bwjVar.c(1244131132);
        if (i6 == 0) {
            if (true != c.G(aekkVar)) {
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
            if (true != c.G(ckuVar)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i7 |= i4;
        }
        if ((i & 7168) == 0) {
            if (true != c.I(arqwVar)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i7 |= i3;
        }
        if ((i7 & 5851) == 1170 && c.L()) {
            c.v();
            cgaVar2 = cgaVar;
        } else {
            cga.a aVar = cga.e;
            int i8 = cfq.a;
            cue a2 = akc.a(cfq.a.a, false);
            int a3 = bwg.a(c);
            bwk bwkVar2 = (bwk) c;
            byx P = bwkVar2.P();
            cga b = cfv.b(c, aVar);
            int i9 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar2.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a2, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar2.y || !d.F(bwkVar2.T(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                bwkVar2.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b, cwl.a.c);
            akf akfVar2 = akf.a;
            cga j = amh.j(aVar, brg.a, 8.0f, 8.0f, brg.a, 9);
            awa awaVar = bmp.c(c).c;
            c.y(1188146052);
            int i10 = i7 & 14;
            Object T = bwkVar2.T();
            if (i10 != 4 && T != bwj.a.a) {
                bwkVar = bwkVar2;
            } else {
                T = new abcv(aekkVar, 10);
                bwkVar = bwkVar2;
                bwkVar.ad(T);
            }
            bwkVar.Y();
            cgaVar2 = aVar;
            bqv.d((arqg) T, j, false, awaVar, 0L, 0L, brg.a, null, null, cdk.e(-1380972661, new aekj(arqwVar, 0), c), c, 1012);
            c.y(1188154839);
            if (aekkVar.d) {
                akfVar = akfVar2;
                ay(akfVar, c, 6);
            } else {
                akfVar = akfVar2;
            }
            bwkVar.Y();
            aeke.Y(akfVar, new aemf(aekkVar.a), ckuVar, null, c, (i7 & 896) | 6, 4);
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new lhq((Object) aekkVar, cgaVar2, (Object) ckuVar, (Object) arqwVar, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0298 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x031d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(defpackage.aeto r24, defpackage.cga r25, defpackage.awg r26, boolean r27, defpackage.arqx r28, defpackage.bwj r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 875
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aetn.b(aeto, cga, awg, boolean, arqx, bwj, int, int):void");
    }

    public static /* synthetic */ String ba(String str, int i) {
        if (i == -1) {
            return null;
        }
        int i2 = i + 15;
        if (i2 >= str.length()) {
            return "";
        }
        int indexOf = str.indexOf(59, i2);
        if (indexOf != -1) {
            return str.substring(i2, indexOf);
        }
        return str.substring(i2);
    }

    public static /* synthetic */ StringBuilder bb(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            int digit = Character.digit(charSequence.charAt(i), 10);
            if (digit != -1) {
                sb.append(digit);
            }
        }
        return sb;
    }

    public static /* synthetic */ String bc(ainh ainhVar) {
        ainj ainjVar;
        ailt ailtVar;
        if (ainhVar.s()) {
            return ainhVar.u(2);
        }
        if (ainhVar.t() && (ailtVar = (ainjVar = (ainj) ainhVar).g) != null && "INVITE".equals(ailtVar.e()) && ainjVar.z()) {
            return ainhVar.v("ACK", 2);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [algw] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static /* synthetic */ algw bd(Activity activity) {
        try {
            if (activity == 0) {
                activity = alfd.a;
            } else {
                activity = algw.i((cj) activity);
            }
            return activity;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Expected activity to be a FragmentActivity: ".concat(String.valueOf(String.valueOf(activity))), e);
        }
    }

    public static /* synthetic */ Unsafe be() {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    public static /* synthetic */ byte[] bf(Queue queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i);
        int i2 = i - length;
        while (i2 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int min = Math.min(i2, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i - i2, min);
            i2 -= min;
        }
        return copyOf;
    }

    public static /* synthetic */ String bg(aodi aodiVar) {
        String str = aodiVar.c().c;
        if (str != null) {
            return str;
        }
        String str2 = aodiVar.c().b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public static /* synthetic */ int bh(String str) {
        int i = 0;
        for (int i2 = 0; i2 < 9; i2++) {
            i *= 10;
            if (i2 < str.length()) {
                if (str.charAt(i2) >= '0' && str.charAt(i2) <= '9') {
                    i += str.charAt(i2) - '0';
                } else {
                    throw new ParseException("Invalid nanoseconds.", 0);
                }
            }
        }
        return i;
    }

    public static void bi(RuntimeException runtimeException, aefu aefuVar, String str) {
        abjp abjpVar = aefuVar.a;
        if (abjpVar != abjp.STARTUP && abjpVar != abjp.TELEDOCTOR) {
            throw runtimeException;
        }
        try {
            Log.e("ExceptionUtil", a.cp(str, "RuntimeException while safely performing function: "), runtimeException);
        } catch (RuntimeException unused) {
        }
    }

    public static ListenableFuture bj(Callable callable) {
        anel anelVar = new anel(callable);
        new Thread(anelVar).start();
        return anelVar;
    }

    public static synchronized atsg bk(Context context) {
        atsg bl;
        synchronized (aetn.class) {
            agcp agcpVar = new agcp(Collections.singletonList(new aiuy(new aohs(context, (byte[]) null))));
            abgj abgjVar = accz.a;
            bl = bl(agcpVar, abgj.r(4));
        }
        return bl;
    }

    public static synchronized atsg bl(agcp agcpVar, Executor executor) {
        atsg atsgVar;
        synchronized (aetn.class) {
            if (a == null) {
                aiwx aiwxVar = aiwx.a;
                HashMap hashMap = new HashMap();
                ahmc.ae(aiwr.a, hashMap);
                a = new atsg(executor, agcpVar, aiwxVar, hashMap);
            }
            atsgVar = a;
        }
        return atsgVar;
    }

    private static dhv bm(String str, List list, bwj bwjVar) {
        dhv b;
        bwjVar.y(118183403);
        if (list.isEmpty()) {
            b = new dhv(str);
        } else {
            dip dipVar = new dip(bmp.a(bwjVar).a, 0L, null, null, null, null, null, 0L, null, null, 0L, null, null, 65534);
            dhv.b bVar = new dhv.b((byte[]) null);
            bVar.f(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                aesi aesiVar = (aesi) it.next();
                if (aesiVar.c - 1 != 0) {
                    String substring = str.substring(aesiVar.a, aesiVar.b);
                    substring.getClass();
                    bVar.c.add(new dhv.b.a(new dji(substring), aesiVar.a, aesiVar.b, null, 8));
                } else {
                    bVar.d(dipVar, aesiVar.a, aesiVar.b);
                }
            }
            b = bVar.b();
        }
        ((bwk) bwjVar).Y();
        return b;
    }

    private static dje bn(bwj bwjVar) {
        bwjVar.y(-429571024);
        dje y = dje.y((dje) bwjVar.g(brx.a), 0L, bmp.d(bwjVar).j.g(), null, null, null, null, 0L, 0, 0, bmp.d(bwjVar).j.g(), null, null, 0, 16646141);
        ((bwk) bwjVar).Y();
        return y;
    }

    private static float bo(int i, bwj bwjVar) {
        bwjVar.y(-383972475);
        float as = as(drn.c(i), bwjVar);
        ((bwk) bwjVar).Y();
        return as;
    }

    private static long bp(boolean z, bwj bwjVar) {
        long j;
        bwjVar.y(1978301337);
        if (z) {
            bwjVar.y(-1064553916);
            j = bmp.a(bwjVar).H;
            ((bwk) bwjVar).Y();
        } else {
            bwjVar.y(-1064481531);
            j = bmp.a(bwjVar).J;
            ((bwk) bwjVar).Y();
        }
        ((bwk) bwjVar).Y();
        return j;
    }

    private static float bq(bwj bwjVar) {
        bwjVar.y(678237569);
        bwjVar.y(-1277324095);
        float as = as(bmp.d(bwjVar).e.g(), bwjVar);
        bwk bwkVar = (bwk) bwjVar;
        bwkVar.Y();
        bwkVar.Y();
        return as;
    }

    private static boolean br(aeki aekiVar) {
        aejt aejtVar = aekiVar.a;
        if ((aejtVar instanceof aeja) && ((aeja) aejtVar).b() != null) {
            return true;
        }
        return false;
    }

    public static void c(ake akeVar, boolean z, cga cgaVar, bwj bwjVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        cga cgaVar2;
        cku ckuVar;
        cga a2;
        long f;
        int i6;
        int i7 = i & 14;
        bwj c = bwjVar.c(-1627311014);
        if (i7 == 0) {
            if (true != c.G(akeVar)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (true != c.H(z)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i3 |= i4;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (true != c.G(cgaVar)) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i3 |= i5;
        }
        if ((i3 & 731) == 146 && c.L()) {
            c.v();
            cgaVar2 = cgaVar;
        } else {
            if (i8 != 0) {
                cgaVar2 = cga.e;
            } else {
                cgaVar2 = cgaVar;
            }
            c.y(-1201247307);
            if (z) {
                f = ckw.f(cku.d(r5), cku.c(r5), cku.b(r5), 0.5f, cku.f(bmp.a(c).a));
                ckuVar = new cku(f);
            } else {
                ckuVar = null;
            }
            ((bwk) c).Y();
            if (ckuVar != null) {
                a2 = adf.a(akeVar.b(cgaVar2), ckuVar.i, clw.a);
                akc.b(a2, c, 0);
            } else {
                bzz e = c.e();
                if (e != null) {
                    ((bzf) e).d = new aetm(akeVar, z, cgaVar2, i, i2, 2);
                    return;
                }
                return;
            }
        }
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new aetm(akeVar, z, cgaVar2, i, i2, 0);
        }
    }

    public static void d(arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-219655286);
        if (i4 == 0) {
            if (true != c.I(arqgVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
        } else {
            ahji.P(arqgVar, null, false, null, null, aeti.a, c, (i2 & 14) | 1572864, 62);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aery(arqgVar, i, 11);
        }
    }

    public static void e(aetj aetjVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c2 = bwjVar.c(1399546767);
        int i7 = 4;
        if (i6 == 0) {
            if (true != c2.G(aetjVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.G(cgaVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i2 & 91) == 18 && c2.L()) {
            c2.v();
            i3 = 8;
        } else {
            arqg arqgVar = aetjVar.c;
            c = amv.c(cgaVar, 1.0f);
            cga i8 = amh.i(c, 16.0f, brg.a, 2);
            String str = aetjVar.b;
            arqr arqrVar = aetjVar.d;
            c2.y(-1732029235);
            cdi e = cdk.e(855340276, new aeqh(arqgVar, 7), c2);
            ((bwk) c2).Y();
            if (aetjVar.e - 1 != 0) {
                i7 = 1;
            }
            i3 = 8;
            ahji.F(str, arqrVar, i8, false, null, cdk.e(1321871350, new aeqh(aetjVar, 8), c2), e, null, new ayc(3, i7, 0, 122), null, 0, 0, null, null, null, c2, 12582912, 0, 0);
        }
        bzz e2 = c2.e();
        if (e2 != null) {
            ((bzf) e2).d = new aesw(aetjVar, cgaVar, i, i3);
        }
    }

    public static void f(aetf aetfVar, cku ckuVar, boolean z, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(1980678175);
        if (i6 == 0) {
            if (true != c.G(aetfVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(ckuVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c.H(z)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else if (aetfVar instanceof aete) {
            c.y(-1964830327);
            g((aete) aetfVar, ckuVar, z, c, i2 & 1008);
            ((bwk) c).Y();
        } else if (aetfVar instanceof aetd) {
            c.y(-1964825495);
            ahji.A(amv.h(cga.e, 24.0f), 0L, 2.0f, 0L, 0, brg.a, c, 390, 58);
            ((bwk) c).Y();
        } else {
            c.y(-1964832156);
            ((bwk) c).Y();
            throw new armm();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jyn(aetfVar, ckuVar, z, i, 12);
        }
    }

    public static void g(aete aeteVar, cku ckuVar, boolean z, bwj bwjVar, int i) {
        int i2;
        float b;
        long j;
        bwk bwkVar;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(2128654081);
        if (i6 == 0) {
            if (true != c.G(aeteVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(ckuVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c.H(z)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            c.y(-684700950);
            if (z) {
                b = 1.0f;
            } else {
                b = bfw.b(c);
            }
            bwk bwkVar2 = (bwk) c;
            bwkVar2.Y();
            c.y(-684699025);
            if (ckuVar == null) {
                j = bmp.a(c).s;
            } else {
                j = ckuVar.i;
            }
            long j2 = j;
            bwkVar2.Y();
            int i7 = cfq.a;
            cfq.b bVar = cfq.a.n;
            cga.a aVar = cga.e;
            cue a2 = akk.a(ajw.c, bVar, c, 48);
            int a3 = bwg.a(c);
            byx P = bwkVar2.P();
            cga b2 = cfv.b(c, aVar);
            int i8 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar2.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a2, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar2.y || !d.F(bwkVar2.T(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                bwkVar2.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b2, cwl.a.c);
            ahji.N(aeke.bg(aeteVar.a, c), null, cha.a(amv.h(cga.e, 24.0f), b), j2, c, 8, 0);
            String str = aeteVar.b;
            c.y(1579600716);
            if (str != null) {
                bwkVar = bwkVar2;
                adom.cq(str, amv.t(cha.a(cga.e, b), brg.a, 24.0f, 1), j2, new dqi(3), 2, 1, adom.ca(c).e, c, 221184, 0);
            } else {
                bwkVar = bwkVar2;
            }
            bwkVar.Y();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jyn(aeteVar, ckuVar, z, i, 13);
        }
    }

    public static void h(String str, boolean z, bwj bwjVar, int i) {
        int i2;
        bwj bwjVar2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(477780371);
        if (i5 == 0) {
            if (true != c.G(str)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.H(z)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        int i6 = i2;
        if ((i6 & 91) == 18 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            c.y(1897817239);
            cga i7 = amh.i(cga.e, 16.0f, brg.a, 2);
            if (!z) {
                i7 = i7.a(cha.a(cga.e, bfw.b(c)));
            }
            ((bwk) c).Y();
            bwjVar2 = c;
            ahji.e(str, i7, bmp.a(c).s, 0L, 0L, null, 0L, 0, false, 0, 0, null, bmp.d(c).o, bwjVar2, i6 & 14, 0, 65528);
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new aelm(str, z, i, 8);
        }
    }

    public static void i(String str, List list, boolean z, dje djeVar, cku ckuVar, bwj bwjVar, int i) {
        long j;
        bwj c = bwjVar.c(-877402214);
        c.y(1591813599);
        cga i2 = amh.i(cga.e, 16.0f, brg.a, 2);
        if (!z) {
            i2 = i2.a(cha.a(cga.e, bfw.b(c)));
        }
        cga cgaVar = i2;
        bwk bwkVar = (bwk) c;
        bwkVar.Y();
        aeiq aeiqVar = new aeiq(str, list, 12);
        c.y(1591819616);
        if (ckuVar == null) {
            j = bmp.a(c).q;
        } else {
            j = ckuVar.i;
        }
        bwkVar.Y();
        aeim.f(aeiqVar, cgaVar, j, djeVar, 0L, null, false, null, c, i & 7168, 496);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeod(str, list, z, djeVar, ckuVar, i, 4);
        }
    }

    public static void j(String str, List list, boolean z, dje djeVar, bwj bwjVar, int i) {
        bwj c = bwjVar.c(1291155890);
        c.y(-609963705);
        cga i2 = amh.i(cga.e, 16.0f, brg.a, 2);
        if (!z) {
            i2 = i2.a(cha.a(cga.e, bfw.b(c)));
        }
        cga cgaVar = i2;
        bwk bwkVar = (bwk) c;
        bwkVar.Y();
        aeiq aeiqVar = new aeiq(str, list, 12);
        c.y(-609957681);
        long j = bmp.a(c).s;
        bwkVar.Y();
        aeim.f(aeiqVar, cgaVar, j, djeVar, 0L, null, false, null, c, i & 7168, 496);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jxg(str, list, z, djeVar, i, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02f9 A[LOOP:1: B:98:0x02f3->B:100:0x02f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void k(defpackage.aeth r27, defpackage.cga r28, defpackage.dje r29, defpackage.cku r30, defpackage.cku r31, cfq.b r32, defpackage.bwj r33, int r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 962
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aetn.k(aeth, cga, dje, cku, cku, cfq$b, bwj, int, int, int):void");
    }

    public static void l(aetb aetbVar, ajr ajrVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(76157806);
        if (i5 == 0) {
            if (true != c.G(aetbVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(ajrVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            boolean z = aetbVar.c;
            c.y(832789862);
            int i6 = i2 & 14;
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (i6 == 4 || T == bwj.a.a) {
                T = new aeql(aetbVar, 10);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            ahji.x(z, (arqr) T, null, null, ajrVar, c, (i2 << 15) & 3670016);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aesw(aetbVar, ajrVar, i, 6);
        }
    }

    public static void m(aerb aerbVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(1505284584);
        if (i4 == 0) {
            if (true != c.G(aerbVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
        } else {
            ahji.N(aeke.bg(aerbVar, c), null, amv.h(cga.e, 24.0f), bmp.a(c).s, c, 392, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aery(aerbVar, i, 9);
        }
    }

    public static void n(cga cgaVar, ajr ajrVar, arqg arqgVar, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        aev a2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i & 14;
        bwj c2 = bwjVar.c(-1798202820);
        if (i7 == 0) {
            if (true != c2.G(cgaVar)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.G(ajrVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (true != c2.I(arqgVar)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (true != c2.I(arqwVar)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) != 1170 || !c2.L()) {
            c = amv.c(cgaVar, 1.0f);
            cga i8 = amh.i(amv.q(c, 56.0f, brg.a, 2), brg.a, 2.0f, 1);
            c2.y(1322411923);
            if (((Boolean) adom.bY(c2).a.a()).booleanValue()) {
                a2 = bon.a(false, brg.a, 0L, 7);
            } else {
                a2 = biy.a(true, brg.a, c2, 6, 6);
            }
            aev aevVar = a2;
            bwk bwkVar = (bwk) c2;
            bwkVar.Y();
            cga i9 = amh.i(adw.b(i8, ajrVar, aevVar, false, null, null, arqgVar, 28), 16.0f, brg.a, 2);
            int i10 = cfq.a;
            int i11 = (i2 & 7168) | 384;
            cue a3 = amq.a(ajw.a, cfq.a.k, c2, 48);
            int a4 = bwg.a(c2);
            byx P = bwkVar.P();
            cga b = cfv.b(c2, i9);
            int i12 = cwl.a;
            arqg arqgVar2 = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar2);
            } else {
                c2.C();
            }
            caw.b(c2, a3, cwl.a.e);
            caw.b(c2, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                bwkVar.ad(valueOf);
                c2.j(valueOf, arqvVar);
            }
            caw.b(c2, b, cwl.a.c);
            arqwVar.a(amu.a, c2, Integer.valueOf(((i11 >> 6) & 112) | 6));
            c2.p();
        } else {
            c2.v();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new lhq(cgaVar, ajrVar, arqgVar, arqwVar, i, 10);
        }
    }

    public static void o(aetb aetbVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(758838255);
        if (i5 == 0) {
            if (true != c.G(aetbVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            c.y(1400444139);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = new ajs();
                bwkVar.ad(T);
            }
            ajr ajrVar = (ajr) T;
            bwkVar.Y();
            n(cgaVar, ajrVar, aetbVar.d, cdk.e(701044511, new ifo(aetbVar, ajrVar, 17), c), c, ((i2 >> 3) & 14) | 3120);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aesw(aetbVar, cgaVar, i, 7);
        }
    }

    public static void p(String str, bwj bwjVar, int i) {
        int i2;
        bwj bwjVar2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-784300445);
        if (i5 == 0) {
            if (true != c.G(str)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.H(false)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            bwjVar2 = c;
            ahji.e(str, null, bmp.a(c).q, 0L, 0L, null, 0L, 2, false, Integer.MAX_VALUE, 0, null, bmp.d(c).j, bwjVar2, i2 & 14, 48, 55290);
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new aery(str, i, 10);
        }
    }

    public static void q(cga cgaVar, ajr ajrVar, arqg arqgVar, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        aev a2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i & 14;
        bwj c2 = bwjVar.c(1850257016);
        if (i7 == 0) {
            if (true != c2.G(cgaVar)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.G(ajrVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (true != c2.I(arqgVar)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (true != c2.I(arqwVar)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) != 1170 || !c2.L()) {
            c = amv.c(cgaVar, 1.0f);
            cga a3 = chk.a(amh.i(c, brg.a, 2.0f, 1), awh.a(24.0f));
            c2.y(19011815);
            if (((Boolean) adom.bY(c2).a.a()).booleanValue()) {
                a2 = bon.a(false, brg.a, 0L, 7);
            } else {
                a2 = biy.a(false, brg.a, c2, 0, 7);
            }
            aev aevVar = a2;
            bwk bwkVar = (bwk) c2;
            bwkVar.Y();
            cga e = amh.e(adw.b(a3, ajrVar, aevVar, false, null, null, arqgVar, 28), 16.0f, 6.0f);
            int i8 = cfq.a;
            int i9 = (i2 & 7168) | 384;
            cue a4 = amq.a(ajw.a, cfq.a.k, c2, 48);
            int a5 = bwg.a(c2);
            byx P = bwkVar.P();
            cga b = cfv.b(c2, e);
            int i10 = cwl.a;
            arqg arqgVar2 = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar2);
            } else {
                c2.C();
            }
            caw.b(c2, a4, cwl.a.e);
            caw.b(c2, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a5))) {
                Integer valueOf = Integer.valueOf(a5);
                bwkVar.ad(valueOf);
                c2.j(valueOf, arqvVar);
            }
            caw.b(c2, b, cwl.a.c);
            arqwVar.a(amu.a, c2, Integer.valueOf(((i9 >> 6) & 112) | 6));
            c2.p();
        } else {
            c2.v();
        }
        bzz e2 = c2.e();
        if (e2 != null) {
            ((bzf) e2).d = new lhq(cgaVar, ajrVar, arqgVar, arqwVar, i, 9);
        }
    }

    public static void r(String str, bwj bwjVar, int i) {
        int i2;
        bwj bwjVar2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1014465960);
        if (i4 == 0) {
            if (true != c.G(str)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            bwjVar2 = c;
            ahji.e(str, null, bmp.a(c).s, 0L, 0L, null, 0L, 0, false, 0, 0, null, bmp.d(c).k, bwjVar2, i2 & 14, 0, 65530);
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new aery(str, i, 8);
        }
    }

    public static void s(String str, boolean z, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-456817754);
        if (i5 == 0) {
            if (true != c.G(str)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.H(z)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            c.y(594475619);
            dhv.b bVar = new dhv.b((byte[]) null);
            int a2 = bVar.a(bmp.d(c).j.b);
            try {
                bVar.f(str);
                bVar.h(a2);
                c.y(594479085);
                if (z) {
                    a2 = bVar.a(bmp.d(c).o.b);
                    try {
                        bVar.f(" " + dga.a(R.string.sim_default_subtitle, c));
                    } finally {
                    }
                }
                bwk bwkVar = (bwk) c;
                bwkVar.Y();
                dhv b = bVar.b();
                bwkVar.Y();
                ahji.d(b, null, 0L, 0L, 0L, 0L, 0, false, 0, null, null, null, c, 0, 0, 131070);
            } finally {
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelm(str, z, i, 7);
        }
    }

    public static void t(aeta aetaVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-992495957);
        if (i5 == 0) {
            if (true != c.G(aetaVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            c.y(332065867);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = new ajs();
                bwkVar.ad(T);
            }
            ajr ajrVar = (ajr) T;
            bwkVar.Y();
            q(cgaVar, ajrVar, aetaVar.f, cdk.e(402065307, new ifo(aetaVar, ajrVar, 16), c), c, ((i2 >> 3) & 14) | 3120);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aesw(aetaVar, cgaVar, i, 5);
        }
    }

    public static void u(char c, int i, bwj bwjVar, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = i2 & 14;
        bwj c2 = bwjVar.c(152265022);
        if (i6 == 0) {
            bwk bwkVar = (bwk) c2;
            Object S = bwkVar.S();
            if ((S instanceof Character) && c == ((Character) S).charValue()) {
                i5 = 2;
            } else {
                bwkVar.af(Character.valueOf(c));
                i5 = 4;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (true != c2.E(i)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i3 |= i4;
        }
        if ((i3 & 91) == 18 && c2.L()) {
            c2.v();
        } else {
            cga a2 = adf.a(cga.e, bmp.a(c2).I, awh.a);
            int i7 = cfq.a;
            cue a3 = akc.a(cfq.a.a, false);
            int a4 = bwg.a(c2);
            bwk bwkVar2 = (bwk) c2;
            byx P = bwkVar2.P();
            cga b = cfv.b(c2, a2);
            int i8 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c2.A();
            if (bwkVar2.y) {
                c2.l(arqgVar);
            } else {
                c2.C();
            }
            caw.b(c2, a3, cwl.a.e);
            caw.b(c2, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar2.y || !d.F(bwkVar2.T(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                bwkVar2.ad(valueOf);
                c2.j(valueOf, arqvVar);
            }
            caw.b(c2, b, cwl.a.c);
            akf akfVar = akf.a;
            ahji.N(aeke.bg(aerb.ap, c2), null, amv.h(amh.d(cga.e, 8.0f), 24.0f), ckw.c(i), c2, 392, 0);
            cga a5 = akfVar.a(cga.e, cfq.a.e);
            ahji.e(String.valueOf(c), a5, ckw.c(i), 0L, 0L, new dqi(3), 0L, 0, false, 0, 0, null, dje.y(bmp.d(c2).n, 0L, 0L, null, null, null, "tnum", 0L, 0, 0, 0L, null, null, 0, 16777151), c2, 0, 0, 65016);
            c2.p();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new aesy(c, i, i2);
        }
    }

    public static void v(String str, bwj bwjVar, int i) {
        int i2;
        bwj bwjVar2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-233574889);
        if (i4 == 0) {
            if (true != c.G(str)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            bwjVar2 = c;
            ahji.e(str, null, bmp.a(c).s, 0L, 0L, null, 0L, 0, false, 0, 0, null, bmp.d(c).k, bwjVar2, i2 & 14, 0, 65530);
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new aery(str, i, 6);
        }
    }

    public static void w(String str, bwj bwjVar, int i) {
        int i2;
        bwj bwjVar2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1328529141);
        if (i4 == 0) {
            if (true != c.G(str)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            bwjVar2 = c;
            ahji.e(str, null, bmp.a(c).q, 0L, 0L, null, 0L, 0, false, 0, 0, null, bmp.d(c).j, bwjVar2, i2 & 14, 0, 65530);
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new aery(str, i, 7);
        }
    }

    public static void x(cga cgaVar, arqg arqgVar, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c2 = bwjVar.c(-482124952);
        if (i6 == 0) {
            if (true != c2.G(cgaVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.I(arqgVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c2.I(arqwVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !c2.L()) {
            c = amv.c(cgaVar, 1.0f);
            cga e = amh.e(adw.c(chk.a(amh.i(c, brg.a, 2.0f, 1), awh.a(24.0f)), false, null, arqgVar, 7), 16.0f, 6.0f);
            int i7 = cfq.a;
            int i8 = ((i2 << 3) & 7168) | 384;
            cue a2 = amq.a(ajw.a, cfq.a.k, c2, 48);
            int a3 = bwg.a(c2);
            bwk bwkVar = (bwk) c2;
            byx P = bwkVar.P();
            cga b = cfv.b(c2, e);
            int i9 = cwl.a;
            arqg arqgVar2 = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar2);
            } else {
                c2.C();
            }
            caw.b(c2, a2, cwl.a.e);
            caw.b(c2, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                bwkVar.ad(valueOf);
                c2.j(valueOf, arqvVar);
            }
            caw.b(c2, b, cwl.a.c);
            arqwVar.a(amu.a, c2, Integer.valueOf(((i8 >> 6) & 112) | 6));
            c2.p();
        } else {
            c2.v();
        }
        bzz e2 = c2.e();
        if (e2 != null) {
            ((bzf) e2).d = new aelx(cgaVar, arqgVar, arqwVar, i, 19, (byte[]) null);
        }
    }

    public static void y(aesz aeszVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(1836232411);
        if (i5 == 0) {
            if (true != c.G(aeszVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            x(cgaVar, aeszVar.e, cdk.e(1376183199, new aelu(aeszVar, 14), c), c, ((i2 >> 3) & 14) | 384);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aesw(aeszVar, cgaVar, i, 4);
        }
    }

    public static void z(amt amtVar, aesx aesxVar, bwj bwjVar, int i) {
        int i2;
        cga b;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-2051979187);
        if (i5 == 0) {
            if (true != c.G(amtVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aesxVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            adcx.bh(aesxVar.a, null, amv.h(cga.e, 40.0f), null, null, c, 432, 24);
            b = amtVar.b(cga.e, 1.0f, true);
            cga i6 = amh.i(b, 16.0f, brg.a, 2);
            ajw.e eVar = ajw.c;
            int i7 = cfq.a;
            cue a2 = akk.a(eVar, cfq.a.m, c, 0);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b2 = cfv.b(c, i6);
            int i8 = cwl.a;
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
            E(aesxVar.b, c, 0);
            c.y(-792892333);
            bwkVar.Y();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aesw(amtVar, aesxVar, i, 1, null);
        }
    }
}
