package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.icu.text.DateFormat;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.media.MediaCodec;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.text.format.DateUtils;
import android.util.Size;
import android.widget.EditText;
import androidx.compose.foundation.layout.AspectRatioElement;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.vcard.VCardConstants;
import com.google.android.apps.messaging.R;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import defpackage.ajw;
import defpackage.apb;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;
import defpackage.csv;
import defpackage.cwl;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aeke {
    public aeke() {
    }

    public static long A(aeja aejaVar, bwj bwjVar) {
        boolean z;
        long j;
        bwjVar.y(-2118908668);
        if (aejaVar.b() != null) {
            j = cku.a;
        } else {
            bwjVar.y(-1184847567);
            boolean z2 = true;
            if (adom.cc(bwjVar) && aejaVar.d()) {
                z = true;
            } else {
                z = false;
            }
            bwjVar.q();
            if (z) {
                j = cku.a;
            } else if (aejaVar.d()) {
                j = cku.d;
            } else if (aejaVar.f() && aejaVar.e()) {
                j = cku.d;
            } else {
                bwjVar.y(-1184843282);
                if (!adom.cc(bwjVar) || !aejaVar.e()) {
                    z2 = false;
                }
                bwjVar.q();
                if (z2) {
                    j = cku.a;
                } else {
                    bwjVar.y(-1184840491);
                    j = bmp.a(bwjVar).f;
                    bwjVar.q();
                }
            }
        }
        bwjVar.q();
        return j;
    }

    public static long B(aeja aejaVar, bwj bwjVar) {
        long f;
        bwjVar.y(-1898018054);
        f = ckw.f(cku.d(r0), cku.c(r0), cku.b(r0), 0.2f, cku.f(C(aejaVar, bwjVar)));
        bwjVar.q();
        return f;
    }

    public static long C(aeja aejaVar, bwj bwjVar) {
        boolean z;
        long j;
        bwjVar.y(811095143);
        if (aejaVar.b() != null) {
            j = cku.a;
        } else {
            bwjVar.y(-131506834);
            boolean z2 = true;
            if (adom.cc(bwjVar) && aejaVar.d()) {
                z = true;
            } else {
                z = false;
            }
            bwjVar.q();
            if (z) {
                j = cku.a;
            } else if (aejaVar.d()) {
                j = cku.d;
            } else if (aejaVar.f() && aejaVar.e()) {
                j = cku.d;
            } else {
                bwjVar.y(-131502549);
                if (!adom.cc(bwjVar) || !aejaVar.e()) {
                    z2 = false;
                }
                bwjVar.q();
                if (z2) {
                    j = cku.a;
                } else {
                    bwjVar.y(-131499758);
                    j = bmp.a(bwjVar).q;
                    bwjVar.q();
                }
            }
        }
        bwjVar.q();
        return j;
    }

    public static void D(aejt aejtVar, cmb cmbVar, bwj bwjVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        aejtVar.getClass();
        int i6 = i2 & 1;
        bwj c = bwjVar.c(-730325091);
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (true != c.G(aejtVar)) {
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
            if (true != c.G(cmbVar)) {
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
                cmbVar = clw.a;
            }
            if (aejtVar instanceof aeja) {
                c.y(-1787770640);
                k((aeja) aejtVar, null, cmbVar, c, (i3 << 3) & 896);
                ((bwk) c).Y();
            } else if (aejtVar instanceof aejf) {
                c.y(-1787768349);
                p((aejf) aejtVar, null, c, 0);
                ((bwk) c).Y();
            } else if (aejtVar instanceof aejj) {
                c.y(-1787766560);
                aetn.aM((aejj) aejtVar, null, c, 0);
                ((bwk) c).Y();
            } else if (aejtVar instanceof aejk) {
                c.y(-1787764600);
                aetn.aC((aejk) aejtVar, c, 0);
                ((bwk) c).Y();
            } else if (aejtVar instanceof aejo) {
                c.y(-1787762623);
                z((aejo) aejtVar, null, c, 0);
                ((bwk) c).Y();
            } else if (aejtVar instanceof aejs) {
                c.y(-1787760863);
                v((aejs) aejtVar, null, c, 0);
                ((bwk) c).Y();
            } else {
                c.y(-1787771802);
                ((bwk) c).Y();
                throw new armm();
            }
        }
        cmb cmbVar2 = cmbVar;
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeis(aejtVar, cmbVar2, i, i2, 0);
        }
    }

    public static void E(String str, List list, bwj bwjVar, int i) {
        cga d;
        list.getClass();
        bwj c = bwjVar.c(-1455226064);
        d = afs.d(cga.e, afs.b(c, 6), false, true, false);
        cga aP = aetn.aP(amh.d(d, 16.0f));
        int i2 = cfq.a;
        cue a = akc.a(cfq.a.a, false);
        int a2 = bwg.a(c);
        bwk bwkVar = (bwk) c;
        byx P = bwkVar.P();
        cga b = cfv.b(c, aP);
        int i3 = cwl.a;
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
        caw.b(c, b, cwl.a.c);
        awa awaVar = bmp.c(c).a;
        cga b2 = alw.b(adl.c(chk.a(cga.e, awaVar), 1.0f, bmp.a(c).s, awaVar), alx.b);
        cue a3 = akk.a(ajw.c, cfq.a.m, c, 0);
        int a4 = bwg.a(c);
        byx P2 = bwkVar.P();
        cga b3 = cfv.b(c, b2);
        arqg arqgVar2 = cwl.a.a;
        c.A();
        if (bwkVar.y) {
            c.l(arqgVar2);
        } else {
            c.C();
        }
        caw.b(c, a3, cwl.a.e);
        caw.b(c, P2, cwl.a.d);
        arqv arqvVar2 = cwl.a.f;
        if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a4))) {
            Integer valueOf2 = Integer.valueOf(a4);
            bwkVar.ad(valueOf2);
            c.j(valueOf2, arqvVar2);
        }
        caw.b(c, b3, cwl.a.c);
        F(str, list, c, (i & 14) | 64);
        c.p();
        c.p();
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zcj(str, list, i, 12, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x02d8, code lost:
    
        r20 = r13;
        r21 = r14;
        r18 = r15;
        r21.Y();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void F(java.lang.String r22, java.util.List r23, defpackage.bwj r24, int r25) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeke.F(java.lang.String, java.util.List, bwj, int):void");
    }

    public static void G(cga cgaVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c2 = bwjVar.c(2143130376);
        if (i5 == 0) {
            if (true != c2.G(cgaVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.I(arqvVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !c2.L()) {
            c = amv.c(cgaVar, 1.0f);
            bqv.c(amh.j(c, brg.a, brg.a, brg.a, 10.0f, 7), bmp.c(c2).c, bmp.a(c2).F, 0L, brg.a, brg.a, null, arqvVar, c2, 120);
        } else {
            c2.v();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new zcj(cgaVar, arqvVar, i, 10, null);
        }
    }

    public static void H(arqv arqvVar, arqv arqvVar2, arqv arqvVar3, bwj bwjVar, int i) {
        int i2;
        cga c;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c2 = bwjVar.c(1105820876);
        if (i6 == 0) {
            if (true != c2.I(arqvVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.I(arqvVar2)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c2.I(arqvVar3)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !c2.L()) {
            c = amv.c(amh.e(cga.e, 32.0f, 24.0f), 1.0f);
            int i7 = cfq.a;
            cue a = akk.a(ajw.c, cfq.a.n, c2, 48);
            int a2 = bwg.a(c2);
            bwk bwkVar = (bwk) c2;
            byx P = bwkVar.P();
            cga b = cfv.b(c2, c);
            int i8 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar);
            } else {
                c2.C();
            }
            caw.b(c2, a, cwl.a.e);
            caw.b(c2, P, cwl.a.d);
            arqv arqvVar4 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c2.j(valueOf, arqvVar4);
            }
            caw.b(c2, b, cwl.a.c);
            arqvVar.a(c2, Integer.valueOf(i2 & 14));
            amx.a(amv.d(cga.e, 24.0f), c2);
            arqvVar2.a(c2, Integer.valueOf((i2 >> 3) & 14));
            amx.a(amv.d(cga.e, 36.0f), c2);
            arqvVar3.a(c2, Integer.valueOf((i2 >> 6) & 14));
            c2.p();
        } else {
            c2.v();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new jkb((Object) arqvVar, (Object) arqvVar2, (Object) arqvVar3, i, 18, (byte[]) null);
        }
    }

    public static void I(aeib aeibVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(1763678507);
        if (i4 == 0) {
            if (true != c.G(aeibVar)) {
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
            cgaVar = cga.e;
            G(cgaVar, cdk.e(-1194708323, new aahl(9), c), c, ((i5 >> 3) & 14) | 48);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zcj(aeibVar, cgaVar, i, 9);
        }
    }

    public static /* synthetic */ Object J(Object obj, Object obj2) {
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
            bwjVar.v();
            return arnb.a;
        }
        throw null;
    }

    public static void K(amt amtVar, aeoo aeooVar, float f, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        cga b;
        int i3;
        int i4;
        int i5;
        int i6;
        arqvVar.getClass();
        int i7 = i & 14;
        bwj c = bwjVar.c(1765724902);
        if (i7 == 0) {
            if (true != c.G(amtVar)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aeooVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (true != c.D(f)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (true != c.I(arqvVar)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) != 1170 || !c.L()) {
            b = amtVar.b(cga.e, 1.0f, true);
            bqv.c(b, awh.a(24.0f), adom.aW(aeooVar, f, c), 0L, brg.a, brg.a, null, arqvVar, c, 120);
        } else {
            c.v();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aemr(amtVar, aeooVar, f, arqvVar, i, 0);
        }
    }

    public static void L(aeoq aeoqVar, cga cgaVar, cit citVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        citVar.getClass();
        int i6 = i & 14;
        bwj c = bwjVar.c(-710451877);
        if (i6 == 0) {
            if (true != c.G(aeoqVar)) {
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
        if ((i & 896) == 0) {
            if (true != c.G(citVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            aeoa aeoaVar = aeoqVar.c;
            if (aeoaVar != null) {
                c.y(1208114445);
                aenr aenrVar = aeoqVar.a;
                aeom aeomVar = aeoqVar.b;
                aeoo aeooVar = aeoqVar.d;
                float f = aeoqVar.e;
                aeop aeopVar = aeoqVar.g;
                adom.X(aenrVar, aeomVar, aeoaVar, aeooVar, f, aeopVar.b, cgaVar, citVar, aeoqVar.f, aeopVar.c, aeopVar, c, (i2 << 15) & 33030144, 0);
                ((bwk) c).Y();
            } else {
                c.y(1208603904);
                adom.M(aeoqVar.a, aeoqVar.d, aeoqVar.e, cgaVar, citVar, aeoqVar.g, c, (i2 << 6) & 64512);
                ((bwk) c).Y();
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelx((Object) aeoqVar, cgaVar, (Object) citVar, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void M(defpackage.aenp r29, defpackage.aeoo r30, float r31, boolean r32, defpackage.arqv r33, defpackage.bwj r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeke.M(aenp, aeoo, float, boolean, arqv, bwj, int, int):void");
    }

    public static void N(aeoq aeoqVar, cga cgaVar, cit citVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        citVar.getClass();
        int i6 = i & 14;
        bwj c = bwjVar.c(1231696797);
        if (i6 == 0) {
            if (true != c.G(aeoqVar)) {
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
        if ((i & 896) == 0) {
            if (true != c.G(citVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            aeoa aeoaVar = aeoqVar.c;
            if (aeoaVar != null) {
                c.y(1208547918);
                aenr aenrVar = aeoqVar.a;
                aeom aeomVar = aeoqVar.b;
                aeoo aeooVar = aeoqVar.d;
                float f = aeoqVar.e;
                aeop aeopVar = aeoqVar.g;
                adom.Z(aenrVar, aeomVar, aeoaVar, aeooVar, f, aeopVar.b, aeoqVar.f, cgaVar, citVar, aeopVar, c, (i2 << 18) & 264241152);
                ((bwk) c).Y();
            } else {
                c.y(1208977113);
                adom.O(aeoqVar.a, aeoqVar.b, aeoqVar.d, aeoqVar.e, cgaVar, citVar, aeoqVar.g, c, (i2 << 9) & 516096);
                ((bwk) c).Y();
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelx((Object) aeoqVar, cgaVar, (Object) citVar, i, 2);
        }
    }

    public static void O(boolean z, bwj bwjVar, int i) {
        int i2;
        cga c;
        int i3;
        int i4 = i & 14;
        bwj c2 = bwjVar.c(1400902942);
        if (i4 == 0) {
            if (true != c2.H(z)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c2.L()) {
            c2.v();
        } else {
            cga a = adf.a(amv.g(cga.e, 20.0f), bmp.a(c2).a, awh.a);
            c2.y(-363273523);
            int i5 = i2 & 14;
            bwk bwkVar = (bwk) c2;
            Object T = bwkVar.T();
            if (i5 == 4 || T == bwj.a.a) {
                T = new jsw(z, 10);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            c = dhb.c(a, false, (arqr) T);
            ahji.N(bg(aerb.X, c2), null, c, bmp.a(c2).b, c2, 56, 0);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new aell(z, i, 4);
        }
    }

    public static void P(boolean z, bwj bwjVar, int i) {
        int i2;
        cga c;
        int i3;
        int i4 = i & 14;
        bwj c2 = bwjVar.c(-1626461833);
        if (i4 == 0) {
            if (true != c2.H(z)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c2.L()) {
            c2.v();
        } else {
            cga c3 = adl.c(amv.g(cga.e, 20.0f), 1.5f, bmp.a(c2).s, awh.a);
            c2.y(-853256652);
            int i5 = i2 & 14;
            bwk bwkVar = (bwk) c2;
            Object T = bwkVar.T();
            if (i5 == 4 || T == bwj.a.a) {
                T = new jsw(z, 11);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            c = dhb.c(c3, false, (arqr) T);
            amx.a(c, c2);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new aell(z, i, 5);
        }
    }

    public static void Q(aeml aemlVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c2 = bwjVar.c(1971594751);
        if (i5 == 0) {
            if (true != c2.G(aemlVar)) {
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
            c2.y(-2136149336);
            int i6 = i2 & 14;
            bwk bwkVar = (bwk) c2;
            Object T = bwkVar.T();
            if (i6 == 4 || T == bwj.a.a) {
                T = new aeju(aemlVar, 9);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            c = dhb.c(cgaVar, false, (arqr) T);
            cga a = dea.a(c, "circle_checkbox");
            int i7 = cfq.a;
            cue a2 = akc.a(cfq.a.e, false);
            int a3 = bwg.a(c2);
            byx P = bwkVar.P();
            cga b = cfv.b(c2, a);
            int i8 = cwl.a;
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
            c2.y(-366152005);
            Object T2 = bwkVar.T();
            if (i6 == 4 || T2 == bwj.a.a) {
                T2 = new abcv(aemlVar, 13);
                bwkVar.ad(T2);
            }
            bwkVar.Y();
            ahji.P((arqg) T2, null, false, null, null, cdk.e(942190243, new aekj(aemlVar, 6), c2), c2, 1572864, 62);
            c2.p();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new aeol(aemlVar, cgaVar, i, 1);
        }
    }

    public static void R(arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-572434123);
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
            cga h = amv.h(cga.e, 16.0f);
            c.y(618644364);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = new ajs();
                bwkVar.ad(T);
            }
            bwkVar.Y();
            ahji.N(bg(aerb.ac, c), dga.a(R.string.chip_close_icon, c), adw.b(h, (ajr) T, null, false, null, null, arqgVar, 28), 0L, c, 8, 8);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelf(arqgVar, i, 9);
        }
    }

    public static void S(String str, bwj bwjVar, int i) {
        int i2;
        bwj bwjVar2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(1907046261);
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
            ahji.e(str, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, bmp.d(c).m, bwjVar2, i2 & 14, 0, 65534);
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new aelf(str, i, 10);
        }
    }

    public static void T(aevy aevyVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(842013341);
        if (i4 == 0) {
            if (true != c.G(aevyVar)) {
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
            adcx.bh(aevyVar, null, aetn.aP(amv.h(cga.e, 24.0f)), null, null, c, i2 & 14, 24);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelf(aevyVar, i, 11);
        }
    }

    public static void U(aemk aemkVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        cga cgaVar2;
        boolean booleanValue;
        cdi cdiVar;
        int i3;
        aemkVar.getClass();
        int i4 = i & 14;
        bwj c = bwjVar.c(-1533189975);
        if (i4 == 0) {
            if (true != c.G(aemkVar)) {
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
            c.y(230790862);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                byu byuVar = new byu(false, cav.a);
                bwkVar.ad(byuVar);
                T = byuVar;
            }
            byn bynVar = (byn) T;
            bwkVar.Y();
            cga b = wj.b(cgaVar2);
            boolean z = aemkVar.c;
            aevy aevyVar = aemkVar.b;
            awg a = awh.a(30.0f);
            c.y(230801802);
            cdi e = cdk.e(-1420634708, new aekj(aevyVar, 3), c);
            bwkVar.Y();
            c.y(230805734);
            booleanValue = ((Boolean) bynVar.a()).booleanValue();
            if (booleanValue) {
                cdiVar = cdk.e(-895816559, new aekj(aemkVar, 4), c);
            } else {
                cdiVar = null;
            }
            cdi cdiVar2 = cdiVar;
            bwkVar.Y();
            c.y(230799626);
            Object T2 = bwkVar.T();
            if (T2 == bwj.a.a) {
                T2 = new abcv(bynVar, 12);
                bwkVar.ad(T2);
            }
            bwkVar.Y();
            ahji.ac((arqg) T2, cdk.e(1663055360, new aekj(aemkVar, 5), c), b, z, e, cdiVar2, a, null, null, null, null, c, 432, 0);
        }
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new aekg((Object) aemkVar, cgaVar2, i, 20);
        }
    }

    public static void V(aemg aemgVar, long j, long j2, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(-2128209296);
        if (i6 == 0) {
            if (true != c.G(aemgVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.F(j)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c.F(j2)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            bqv.d(aemgVar.b, null, false, awh.a(20.0f), j, 0L, brg.a, null, null, cdk.e(-1923936059, new aevc(aemgVar, j2, 1), c), c, 998);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new ahfo(aemgVar, j, j2, i, 1);
        }
    }

    public static void W(aemj aemjVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        cga cgaVar2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1026500061);
        if (i4 == 0) {
            if (true != c.G(aemjVar)) {
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
            cga d = amh.d(cgaVar2, 8.0f);
            awg a = awh.a(20.0f);
            long X = X(c);
            c.y(1592835305);
            adr a2 = ads.a(1.0f, bmp.a(c).B);
            ((bwk) c).Y();
            bqv.c(d, a, X, 0L, brg.a, brg.a, a2, cdk.e(-15489346, new aemh(aemjVar), c), c, 56);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aekg((Object) aemjVar, cgaVar2, i, 19);
        }
    }

    public static long X(bwj bwjVar) {
        bwjVar.y(812498753);
        bwjVar.y(1995308413);
        long j = bmp.a(bwjVar).p;
        bwjVar.q();
        bwjVar.q();
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void Y(defpackage.ake r18, defpackage.aemf r19, defpackage.cku r20, defpackage.cga r21, defpackage.bwj r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeke.Y(ake, aemf, cku, cga, bwj, int, int):void");
    }

    public static void Z(aemc aemcVar, cga cgaVar, bwj bwjVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = i2 & 1;
        bwj c = bwjVar.c(-1408454495);
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (true != c.G(aemcVar)) {
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
            if (aemcVar instanceof aemb) {
                c.y(1650258744);
                ad((aemb) aemcVar, cgaVar, c, i3 & 112);
                ((bwk) c).Y();
            } else if (aemcVar instanceof aema) {
                c.y(1650261020);
                aj((aema) aemcVar, cgaVar, null, c, i3 & 112);
                ((bwk) c).Y();
            } else {
                c.y(-381462455);
                ((bwk) c).Y();
                throw new IllegalArgumentException("This type of BottomSheetUiData is not supported by BottomSheet(). Did you mean to use CustomBottomSheet() instead?");
            }
        }
        cga cgaVar2 = cgaVar;
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeis(aemcVar, cgaVar2, i, i2, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(defpackage.bwj r9, int r10) {
        /*
            r0 = -1192737813(0xffffffffb8e843eb, float:-1.1075273E-4)
            bwj r9 = r9.c(r0)
            if (r10 != 0) goto L16
            boolean r10 = r9.L()
            r0 = 0
            if (r10 != 0) goto L12
            r10 = r0
            goto L16
        L12:
            r9.v()
            goto L36
        L16:
            cga$a r0 = defpackage.cga.e
            cga r0 = defpackage.amv.p(r0)
            aerw r8 = new aerw
            aerb r2 = defpackage.aerb.aM
            r1 = 2132017445(0x7f140125, float:1.9673169E38)
            java.lang.String r3 = defpackage.dga.a(r1, r9)
            r6 = 0
            r7 = 124(0x7c, float:1.74E-43)
            r4 = 0
            r5 = 0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r1 = 48
            aP(r8, r0, r9, r1)
            r0 = r10
        L36:
            bzz r9 = r9.e()
            if (r9 == 0) goto L47
            lhs r10 = new lhs
            r1 = 8
            r10.<init>(r0, r1)
            bzf r9 = (defpackage.bzf) r9
            r9.d = r10
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeke.a(bwj, int):void");
    }

    public static /* synthetic */ void aA(aelk aelkVar, bwj bwjVar, int i) {
        int i2;
        cfq.c cVar;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(1193250576);
        if (i5 == 0) {
            if (true != c.G(aelkVar)) {
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
            cga.a aVar = cga.e;
            ajw.e eVar = ajw.c;
            int i6 = cfq.a;
            cue a = akk.a(eVar, cfq.a.m, c, 0);
            int a2 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, aVar);
            int i7 = cwl.a;
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
            caw.b(c, b, cwl.a.c);
            if (aelkVar.f == null && (aelkVar.a == null || aelkVar.e == null)) {
                cVar = cfq.a.k;
            } else {
                cVar = cfq.a.j;
            }
            cga.a aVar2 = cga.e;
            cue a3 = amq.a(ajw.a, cVar, c, 0);
            int a4 = bwg.a(c);
            byx P2 = bwkVar.P();
            cga b2 = cfv.b(c, aVar2);
            arqg arqgVar2 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar2);
            } else {
                c.C();
            }
            caw.b(c, a3, cwl.a.e);
            caw.b(c, P2, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a4))) {
                Integer valueOf2 = Integer.valueOf(a4);
                bwkVar.ad(valueOf2);
                c.j(valueOf2, arqvVar2);
            }
            caw.b(c, b2, cwl.a.c);
            aelq aelqVar = aelkVar.d;
            amu amuVar = amu.a;
            aw(aelqVar, true, c, 48);
            if (aelkVar.b == null && aelkVar.c == null) {
                z = false;
            } else {
                z = true;
            }
            if (aelkVar.f != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            an(amuVar, z, z2, cdk.e(325530296, new yzl(aelkVar, 20), c), c, 3078);
            at(aelkVar.f, amh.j(cga.e, brg.a, 4.0f, brg.a, brg.a, 13), c, 48);
            c.p();
            as(aelkVar.b, aelkVar.c, c, 0);
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelf(aelkVar, i, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void aB(defpackage.bwj r23, int r24) {
        /*
            r0 = 273838333(0x105270fd, float:4.150224E-29)
            r1 = r23
            bwj r0 = r1.c(r0)
            if (r24 != 0) goto L1a
            boolean r1 = r0.L()
            r2 = 0
            if (r1 != 0) goto L15
            r22 = r2
            goto L1c
        L15:
            r0.v()
            goto Lb2
        L1a:
            r22 = r24
        L1c:
            cga$a r1 = defpackage.cga.e
            cga r1 = defpackage.amv.p(r1)
            r2 = 1118830592(0x42b00000, float:88.0)
            cga r1 = defpackage.amv.d(r1, r2)
            ajw$c r2 = defpackage.ajw.e
            int r3 = defpackage.cfq.a
            cfq$b r3 = cfq.a.n
            r4 = 54
            cue r2 = defpackage.akk.a(r2, r3, r0, r4)
            int r3 = defpackage.bwg.a(r0)
            r4 = r0
            bwk r4 = (defpackage.bwk) r4
            byx r5 = r4.P()
            cga r1 = defpackage.cfv.b(r0, r1)
            int r6 = defpackage.cwl.a
            arqg r6 = cwl.a.a
            r0.A()
            boolean r7 = r4.y
            if (r7 == 0) goto L52
            r0.l(r6)
            goto L55
        L52:
            r0.C()
        L55:
            arqv r6 = cwl.a.e
            defpackage.caw.b(r0, r2, r6)
            arqv r2 = cwl.a.d
            defpackage.caw.b(r0, r5, r2)
            arqv r2 = cwl.a.f
            boolean r5 = r4.y
            if (r5 != 0) goto L73
            java.lang.Object r5 = r4.T()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            boolean r5 = defpackage.d.F(r5, r6)
            if (r5 != 0) goto L7d
        L73:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.ad(r3)
            r0.j(r3, r2)
        L7d:
            arqv r2 = cwl.a.c
            defpackage.caw.b(r0, r1, r2)
            r1 = 2132019415(0x7f1408d7, float:1.9677164E38)
            java.lang.String r1 = defpackage.dga.a(r1, r0)
            bse r2 = defpackage.bmp.d(r0)
            dje r2 = r2.i
            r17 = r2
            r20 = 0
            r21 = 65534(0xfffe, float:9.1833E-41)
            r2 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r19 = 0
            r18 = r0
            defpackage.ahji.e(r1, r2, r3, r5, r7, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0.p()
            r2 = r22
        Lb2:
            bzz r0 = r0.e()
            if (r0 == 0) goto Lc3
            lhs r1 = new lhs
            r3 = 20
            r1.<init>(r2, r3)
            bzf r0 = (defpackage.bzf) r0
            r0.d = r1
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeke.aB(bwj, int):void");
    }

    public static void aC(aesc aescVar, bwj bwjVar, int i) {
        int i2;
        bwk bwkVar;
        cga c;
        bwk bwkVar2;
        int i3;
        bwj c2 = bwjVar.c(-701199013);
        if ((i & 14) == 0) {
            if (true != c2.G(aescVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c2.L()) {
            c2.v();
        } else {
            cga t = amv.t(cga.e, brg.a, adcx.ce(brg.a, c2, 1), 1);
            ajw.e eVar = ajw.c;
            int i4 = cfq.a;
            cue a = akk.a(eVar, cfq.a.m, c2, 0);
            int a2 = bwg.a(c2);
            bwk bwkVar3 = (bwk) c2;
            byx P = bwkVar3.P();
            cga b = cfv.b(c2, t);
            int i5 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c2.A();
            if (bwkVar3.y) {
                c2.l(arqgVar);
            } else {
                c2.C();
            }
            caw.b(c2, a, cwl.a.e);
            caw.b(c2, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar3.y || !d.F(bwkVar3.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar3.ad(valueOf);
                c2.j(valueOf, arqvVar);
            }
            caw.b(c2, b, cwl.a.c);
            c2.y(852265278);
            if (!d.F(aescVar.d, Uri.EMPTY)) {
                cga d = amv.d(amv.l(cga.e, adcx.ce(brg.a, c2, 1)), 135.0f);
                cue a3 = akc.a(cfq.a.a, false);
                int a4 = bwg.a(c2);
                byx P2 = bwkVar3.P();
                cga b2 = cfv.b(c2, d);
                arqg arqgVar2 = cwl.a.a;
                c2.A();
                if (bwkVar3.y) {
                    c2.l(arqgVar2);
                } else {
                    c2.C();
                }
                caw.b(c2, a3, cwl.a.e);
                caw.b(c2, P2, cwl.a.d);
                arqv arqvVar2 = cwl.a.f;
                if (bwkVar3.y || !d.F(bwkVar3.T(), Integer.valueOf(a4))) {
                    Integer valueOf2 = Integer.valueOf(a4);
                    bwkVar3.ad(valueOf2);
                    c2.j(valueOf2, arqvVar2);
                }
                caw.b(c2, b2, cwl.a.c);
                Uri uri = aescVar.d;
                String str = aescVar.e;
                cga b3 = akf.a.b(cga.e);
                int i6 = csv.a;
                bwkVar = bwkVar3;
                bf(uri, str, b3, null, null, null, csv.a.d, null, brg.a, null, null, null, null, null, aescVar.f, null, c2, 12582920, 16777216, 393080);
                c2.p();
            } else {
                bwkVar = bwkVar3;
            }
            bwkVar.Y();
            c = amv.c(amh.e(cga.e, 16.0f, 12.0f), 1.0f);
            cue a5 = akk.a(new ajw.d(8.0f, true, ajx.a), cfq.a.m, c2, 6);
            int a6 = bwg.a(c2);
            byx P3 = bwkVar.P();
            cga b4 = cfv.b(c2, c);
            arqg arqgVar3 = cwl.a.a;
            c2.A();
            bwk bwkVar4 = bwkVar;
            if (bwkVar4.y) {
                c2.l(arqgVar3);
            } else {
                c2.C();
            }
            caw.b(c2, a5, cwl.a.e);
            caw.b(c2, P3, cwl.a.d);
            arqv arqvVar3 = cwl.a.f;
            if (bwkVar4.y || !d.F(bwkVar4.T(), Integer.valueOf(a6))) {
                Integer valueOf3 = Integer.valueOf(a6);
                bwkVar4.ad(valueOf3);
                c2.j(valueOf3, arqvVar3);
            }
            caw.b(c2, b4, cwl.a.c);
            c2.y(-1565572194);
            if (!arsd.M(aescVar.a)) {
                bwkVar2 = bwkVar4;
                ahji.e(aescVar.a, null, 0L, 0L, 0L, null, 0L, 2, false, 1, 0, null, bmp.d(c2).m, c2, 0, 3120, 55294);
            } else {
                bwkVar2 = bwkVar4;
            }
            bwkVar2.Y();
            c2.y(-1565565013);
            if (!arsd.M(aescVar.b)) {
                ahji.e(aescVar.b, null, 0L, 0L, 0L, null, 0L, 2, false, 2, 0, null, bmp.d(c2).l, c2, 0, 3120, 55294);
            }
            bwkVar2.Y();
            c2.y(-1565557439);
            if (!arsd.M(aescVar.c)) {
                ahji.e(aescVar.c, null, 0L, 0L, 0L, null, 0L, 2, false, 1, 0, null, bmp.d(c2).l, c2, 0, 3120, 55294);
            }
            bwkVar2.Y();
            c2.p();
            c2.p();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new aery(aescVar, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void aD(defpackage.bwj r12, int r13) {
        /*
            r0 = 1992016201(0x76bbc149, float:1.9040621E33)
            bwj r12 = r12.c(r0)
            if (r13 != 0) goto L17
            boolean r13 = r12.L()
            r0 = 0
            if (r13 != 0) goto L12
            r13 = r0
            goto L17
        L12:
            r12.v()
            goto La2
        L17:
            cga$a r0 = defpackage.cga.e
            cga r0 = defpackage.amv.p(r0)
            r1 = 1118830592(0x42b00000, float:88.0)
            cga r0 = defpackage.amv.d(r0, r1)
            ajw$c r1 = defpackage.ajw.e
            int r2 = defpackage.cfq.a
            cfq$b r2 = cfq.a.n
            r3 = 54
            cue r1 = defpackage.akk.a(r1, r2, r12, r3)
            int r2 = defpackage.bwg.a(r12)
            r3 = r12
            bwk r3 = (defpackage.bwk) r3
            byx r4 = r3.P()
            cga r0 = defpackage.cfv.b(r12, r0)
            int r5 = defpackage.cwl.a
            arqg r5 = cwl.a.a
            r12.A()
            boolean r6 = r3.y
            if (r6 == 0) goto L4d
            r12.l(r5)
            goto L50
        L4d:
            r12.C()
        L50:
            arqv r5 = cwl.a.e
            defpackage.caw.b(r12, r1, r5)
            arqv r1 = cwl.a.d
            defpackage.caw.b(r12, r4, r1)
            arqv r1 = cwl.a.f
            boolean r4 = r3.y
            if (r4 != 0) goto L6e
            java.lang.Object r4 = r3.T()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            boolean r4 = defpackage.d.F(r4, r5)
            if (r4 != 0) goto L78
        L6e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.ad(r2)
            r12.j(r2, r1)
        L78:
            arqv r1 = cwl.a.c
            defpackage.caw.b(r12, r0, r1)
            cga$a r0 = defpackage.cga.e
            r1 = 1108344832(0x42100000, float:36.0)
            cga r0 = defpackage.amv.h(r0, r1)
            r1 = 2132019418(0x7f1408da, float:1.967717E38)
            java.lang.String r1 = defpackage.dga.a(r1, r12)
            cga r1 = defpackage.aetn.aQ(r0, r1)
            r10 = 0
            r11 = 62
            r2 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = r12
            defpackage.ahji.A(r1, r2, r4, r5, r7, r8, r9, r10, r11)
            r12.p()
            r0 = r13
        La2:
            bzz r12 = r12.e()
            if (r12 == 0) goto Lb2
            aerz r13 = new aerz
            r1 = 1
            r13.<init>(r0, r1)
            bzf r12 = (defpackage.bzf) r12
            r12.d = r13
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeke.aD(bwj, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void aE(defpackage.bwj r23, int r24) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeke.aE(bwj, int):void");
    }

    public static void aF(aesf aesfVar, cga cgaVar, cmb cmbVar, bwj bwjVar, int i) {
        int i2;
        adr a;
        cga cgaVar2;
        int i3;
        int i4;
        aesfVar.getClass();
        int i5 = i & 14;
        bwj c = bwjVar.c(-1275159904);
        if (i5 == 0) {
            if (true != c.G(aesfVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        int i6 = i2 | 48;
        if ((i & 896) == 0) {
            if (true != c.G(cmbVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i6 |= i3;
        }
        if ((i6 & 731) == 146 && c.L()) {
            c.v();
            cgaVar2 = cgaVar;
        } else {
            cga.a aVar = cga.e;
            cga a2 = dea.a(aVar, "LinkPreviewContent");
            arnb arnbVar = arnb.a;
            c.y(-2107027947);
            int i7 = i6 & 14;
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (i7 == 4 || T == bwj.a.a) {
                T = new kiz(aesfVar, 3);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            cga a3 = cru.a(a2, arnbVar, (PointerInputEventHandler) T);
            c.y(-2107023668);
            if (adom.cd(c)) {
                a = null;
            } else {
                a = ads.a(1.0f, bmp.a(c).B);
            }
            bwkVar.Y();
            cgaVar2 = aVar;
            bqv.c(a3, cmbVar, 0L, 0L, brg.a, brg.a, a, cdk.e(-1790592005, new aeqh(aesfVar, 5), c), c, 60);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelx((Object) aesfVar, cgaVar2, (Object) cmbVar, i, 17);
        }
    }

    public static void aG(cga cgaVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        arqvVar.getClass();
        int i6 = i & 14;
        bwj c = bwjVar.c(66525670);
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
            if (true != c.D(0.62f)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c.I(arqvVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            c.y(834963932);
            int i7 = i2 & 112;
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (i7 == 32 || T == bwj.a.a) {
                T = new aexb(1);
                bwkVar.ad(T);
            }
            cue cueVar = (cue) T;
            bwkVar.Y();
            int a = bwg.a(c);
            byx P = bwkVar.P();
            cga b = cfv.b(c, cgaVar);
            int i8 = cwl.a;
            int i9 = (((((i2 << 3) & 112) | ((i2 >> 6) & 14)) << 6) & 896) | 6;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, cueVar, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a))) {
                Integer valueOf = Integer.valueOf(a);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar2);
            }
            caw.b(c, b, cwl.a.c);
            arqvVar.a(c, Integer.valueOf((i9 >> 6) & 14));
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeqs(cgaVar, arqvVar, i, 6, null);
        }
    }

    public static void aH(Integer num, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        arqwVar.getClass();
        int i5 = i & 14;
        bwj c = bwjVar.c(1455696825);
        if (i5 == 0) {
            if (true != c.G(num)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.I(arqwVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            cga.a aVar = cga.e;
            int i6 = cfq.a;
            cue a = akc.a(cfq.a.a, false);
            int a2 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, aVar);
            int i7 = cwl.a;
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
            caw.b(c, b, cwl.a.c);
            akf akfVar = akf.a;
            c.y(2035849496);
            if (num != null) {
                cga b2 = akfVar.b(cga.e);
                c.y(2035852767);
                int i8 = i2 & 14;
                Object T = bwkVar.T();
                if (i8 == 4 || T == bwj.a.a) {
                    T = new aeql(num, 5);
                    bwkVar.ad(T);
                }
                bwkVar.Y();
                dsa.b((arqr) T, b2, null, c, 0, 4);
            }
            bwkVar.Y();
            arqwVar.a(akfVar, c, Integer.valueOf((i2 & 112) | 6));
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeqs(num, arqwVar, i, 5, null);
        }
    }

    public static void aI(amt amtVar, bwj bwjVar, int i) {
        int i2;
        cga b;
        cga a;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1561524606);
        if (i4 == 0) {
            if (true != c.G(amtVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !c.L()) {
            b = amtVar.b(amv.d(cga.e, 1.0f), 1.0f, true);
            a = adf.a(b, bmp.a(c).a, clw.a);
            akc.b(a, c, 0);
        } else {
            c.v();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelf(amtVar, i, 20);
        }
    }

    public static void aJ(cga cgaVar, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c2 = bwjVar.c(-122619566);
        if (i5 == 0) {
            if (true != c2.G(cgaVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.I(arqwVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !c2.L()) {
            c = amv.c(cgaVar, 1.0f);
            int i6 = cfq.a;
            int i7 = ((i2 << 6) & 7168) | 384;
            cue a = amq.a(ajw.a, cfq.a.k, c2, 48);
            int a2 = bwg.a(c2);
            bwk bwkVar = (bwk) c2;
            byx P = bwkVar.P();
            cga b = cfv.b(c2, c);
            int i8 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar);
            } else {
                c2.C();
            }
            caw.b(c2, a, cwl.a.e);
            caw.b(c2, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c2.j(valueOf, arqvVar);
            }
            caw.b(c2, b, cwl.a.c);
            arqwVar.a(amu.a, c2, Integer.valueOf(((i7 >> 6) & 112) | 6));
            c2.p();
        } else {
            c2.v();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new aeqs(cgaVar, arqwVar, i, 4, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void aK(defpackage.bwj r23, int r24) {
        /*
            r0 = 1794125091(0x6af02d23, float:1.4517767E26)
            r1 = r23
            bwj r0 = r1.c(r0)
            if (r24 != 0) goto L19
            boolean r1 = r0.L()
            r2 = 0
            if (r1 != 0) goto L15
            r22 = r2
            goto L1b
        L15:
            r0.v()
            goto L5b
        L19:
            r22 = r24
        L1b:
            r1 = 2132019365(0x7f1408a5, float:1.9677063E38)
            java.lang.String r1 = defpackage.dga.a(r1, r0)
            cga$a r2 = defpackage.cga.e
            r3 = 0
            r4 = 2
            r5 = 1073741824(0x40000000, float:2.0)
            cga r2 = defpackage.amh.i(r2, r5, r3, r4)
            bse r3 = defpackage.bmp.d(r0)
            dje r3 = r3.l
            r17 = r3
            blh r3 = defpackage.bmp.a(r0)
            long r3 = r3.a
            dqi r5 = new dqi
            r9 = r5
            r6 = 3
            r5.<init>(r6)
            r20 = 0
            r21 = 65016(0xfdf8, float:9.1107E-41)
            r5 = 0
            r7 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r19 = 48
            r18 = r0
            defpackage.ahji.e(r1, r2, r3, r5, r7, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r2 = r22
        L5b:
            bzz r0 = r0.e()
            if (r0 == 0) goto L6c
            lhs r1 = new lhs
            r3 = 19
            r1.<init>(r2, r3)
            bzf r0 = (defpackage.bzf) r0
            r0.d = r1
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeke.aK(bwj, int):void");
    }

    public static void aL(cga cgaVar, bwj bwjVar, int i) {
        int i2 = i | 6;
        int i3 = i2 & 11;
        bwj c = bwjVar.c(622730329);
        if (i3 == 2 && c.L()) {
            c.v();
        } else {
            int i4 = i2 & 14;
            cga.a aVar = cga.e;
            aJ(aVar, aerx.a, c, i4 | 48);
            cgaVar = aVar;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aery(cgaVar, i, 1);
        }
    }

    public static void aM(aerb aerbVar, boolean z, bwj bwjVar, int i) {
        int i2;
        long j;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-202170910);
        if (i5 == 0) {
            if (true != c.G(aerbVar)) {
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
            awg a = awh.a(8.0f);
            if (z) {
                c.y(-1060487320);
                j = bmp.a(c).f;
                ((bwk) c).Y();
            } else {
                c.y(-1060428637);
                j = bmp.a(c).r;
                ((bwk) c).Y();
            }
            bqv.c(null, a, j, 0L, brg.a, brg.a, null, cdk.e(1074390183, new aerv(aerbVar, z, 0), c), c, 121);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelm(aerbVar, z, i, 6);
        }
    }

    public static void aN(String str, bwj bwjVar, int i) {
        int i2;
        bwj bwjVar2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(24047939);
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
            ahji.e(str, amh.j(cga.e, brg.a, 2.0f, brg.a, brg.a, 13), bmp.a(c).s, 0L, 0L, null, 0L, 0, false, 0, 0, null, bmp.d(c).l, bwjVar2, (i2 & 14) | 48, 0, 65528);
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new aelf(str, i, 18);
        }
    }

    public static void aO(String str, bwj bwjVar, int i) {
        int i2;
        bwj bwjVar2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(1249554483);
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
            ahji.e(str, null, bmp.a(c).q, 0L, 0L, null, 0L, 0, false, 0, 0, null, adom.ca(c).g, bwjVar2, i2 & 14, 0, 65530);
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new aelf(str, i, 19);
        }
    }

    public static void aP(aerw aerwVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(332490897);
        if (i5 == 0) {
            if (true != c.G(aerwVar)) {
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
            aQ(cgaVar, aerwVar.e, cdk.e(-1852850347, new aeqh(aerwVar, 4), c), c, ((i2 >> 3) & 14) | 24576);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeqs(aerwVar, cgaVar, i, 3);
        }
    }

    public static void aQ(cga cgaVar, boolean z, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i & 14;
        bwj c = bwjVar.c(534063583);
        boolean z2 = true;
        if (i8 == 0) {
            if (true != c.G(cgaVar)) {
                i7 = 2;
            } else {
                i7 = 4;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.H(false)) {
                i6 = 16;
            } else {
                i6 = 32;
            }
            i2 |= i6;
        }
        if ((i & 896) == 0) {
            if (true != c.H(z)) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i2 |= i5;
        }
        if ((i & 7168) == 0) {
            if (true != c.I(null)) {
                i4 = 1024;
            } else {
                i4 = 2048;
            }
            i2 |= i4;
        }
        if ((57344 & i) == 0) {
            if (true != c.I(arqvVar)) {
                i3 = 8192;
            } else {
                i3 = 16384;
            }
            i2 |= i3;
        }
        if ((i2 & 46811) == 9362 && c.L()) {
            c.v();
            z2 = z;
        } else {
            cmb cmbVar = clw.a;
            c.y(836088412);
            bwk bwkVar = (bwk) c;
            bwkVar.Y();
            c.y(149116612);
            c.y(836096534);
            if (z) {
                j = cku.g;
            } else {
                z2 = false;
                j = bmp.a(c).p;
            }
            bwkVar.Y();
            bqv.c(cgaVar, cmbVar, j, 0L, brg.a, brg.a, null, arqvVar, c, 56);
            bwkVar.Y();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jyn(cgaVar, z2, arqvVar, i, 11);
        }
    }

    public static Uri aR(byn bynVar) {
        return (Uri) bynVar.a();
    }

    public static Uri aS(byn bynVar) {
        return (Uri) bynVar.a();
    }

    public static boolean aT(Uri uri) {
        if (uri != null && !d.F(uri, Uri.EMPTY)) {
            return false;
        }
        return true;
    }

    public static void aU(aerq aerqVar, Object obj, awg awgVar, boolean z, bwj bwjVar, int i) {
        csv csvVar;
        boolean z2;
        obj.getClass();
        bwj c = bwjVar.c(-970977324);
        if (z) {
            int i2 = csv.a;
            csvVar = csv.a.a;
        } else {
            int i3 = csv.a;
            csvVar = csv.a.d;
        }
        csv csvVar2 = csvVar;
        c.y(-192935791);
        if ((((i & 14) ^ 6) > 4 && c.G(aerqVar)) || (i & 6) == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        bwk bwkVar = (bwk) c;
        Object T = bwkVar.T();
        if (z2 || T == bwj.a.a) {
            T = new aanv(aerqVar, (arpe) null, 17);
            bwkVar.ad(T);
        }
        bwkVar.Y();
        bxl.g(aerqVar, (arqv) T, c);
        int ordinal = aerqVar.n().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                c.y(-1685147532);
                adcx.bx(aerqVar.o(), null, cdk.e(-1873474130, new aaho(aerqVar, obj, awgVar, csvVar2, 5), c), c, 384);
                bwkVar.Y();
            } else {
                c.y(-192927330);
                String q = aerqVar.q();
                String p = aerqVar.p();
                String a = aerqVar.a();
                if (a == null) {
                    a = "";
                }
                aetn.aA(new aeki(new aejl(q, p, a, 4), new aekh((byte[]) null), aerqVar.a(), aerqVar.d(), (arqg) null, 48), null, awgVar, c, i & 896, 2);
                bwkVar.Y();
            }
            bzz e = c.e();
            if (e != null) {
                ((bzf) e).d = new jxg(aerqVar, obj, awgVar, z, i, 4);
                return;
            }
            return;
        }
        c.y(-1685925570);
        bwkVar.Y();
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new jxg(aerqVar, obj, awgVar, z, i, 3);
        }
    }

    public static /* synthetic */ void aV(aerq aerqVar, Object obj, awg awgVar, csv csvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(-1163801708);
        boolean z = true;
        if (i6 == 0) {
            if (true != c.G(aerqVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 896) == 0) {
            if (true != c.G(awgVar)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (true != c.G(csvVar)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i2 |= i3;
        }
        c.w();
        if ((i & 1) != 0 && !c.J()) {
            c.v();
        }
        c.n();
        c.y(-1274075236);
        bwk bwkVar = (bwk) c;
        Object T = bwkVar.T();
        if (T == bwj.a.a) {
            byu byuVar = new byu(null, cav.a);
            bwkVar.ad(byuVar);
            T = byuVar;
        }
        byn bynVar = (byn) T;
        bwkVar.Y();
        if (aR(bynVar) == null && aerqVar.k() != null) {
            bynVar.h(aerqVar.k());
        }
        c.y(-1274054432);
        Object T2 = bwkVar.T();
        if (T2 == bwj.a.a) {
            byu byuVar2 = new byu(aerqVar.l(), cav.a);
            bwkVar.ad(byuVar2);
            T2 = byuVar2;
        }
        byn bynVar2 = (byn) T2;
        bwkVar.Y();
        if (aT(aS(bynVar2)) && !aT(aerqVar.l())) {
            bynVar2.h(aerqVar.l());
        }
        if (aR(bynVar) == null) {
            z = false;
        }
        aetn.b(aerqVar, null, awgVar, z, cdk.e(1254973913, new aeoc(bynVar2, bynVar, aerqVar, csvVar, 2), c), c, (i2 & 14) | 24576 | (i2 & 896), 2);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new lhq((Object) aerqVar, obj, (Object) awgVar, (Object) csvVar, i, 7, (byte[]) null);
        }
    }

    public static void aW(abt abtVar, cga cgaVar, aap aapVar, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(1912596737);
        if (i6 == 0) {
            if (true != c.G(abtVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i | i5;
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
        int i7 = i2 | 3072;
        if ((i & 57344) == 0) {
            if (true != c.I(arqwVar)) {
                i3 = 8192;
            } else {
                i3 = 16384;
            }
            i7 |= i3;
        }
        c.y(-459772095);
        bwk bwkVar = (bwk) c;
        Object T = bwkVar.T();
        if (T == bwj.a.a) {
            T = arue.b;
            bwkVar.ad(T);
        }
        arqr arqrVar = (arqr) T;
        bwkVar.Y();
        c.y(-459769285);
        Object T2 = bwkVar.T();
        Object obj = T2;
        if (T2 == bwj.a.a) {
            cez cezVar = new cez();
            cezVar.add(abtVar.e());
            bwkVar.ad(cezVar);
            obj = cezVar;
        }
        cez cezVar2 = (cez) obj;
        bwkVar.Y();
        c.y(-459766600);
        Object T3 = bwkVar.T();
        if (T3 == bwj.a.a) {
            T3 = new ve((byte[]) null);
            bwkVar.ad(T3);
        }
        ve veVar = (ve) T3;
        bwkVar.Y();
        c.y(-459764268);
        if (d.F(abtVar.e(), abtVar.f()) && (cezVar2.a() != 1 || !d.F(cezVar2.get(0), abtVar.f()))) {
            c.y(-459755344);
            int i8 = i7 & 14;
            Object T4 = bwkVar.T();
            if (i8 == 4 || T4 == bwj.a.a) {
                T4 = new aeql(abtVar, 4);
                bwkVar.ad(T4);
            }
            bwkVar.Y();
            aqjn.Q(cezVar2, (arqr) T4);
            veVar.i();
        }
        bwkVar.Y();
        c.y(-459752786);
        if (!ve.e(veVar, abtVar.f())) {
            cff cffVar = new cff(cezVar2, 0);
            int i9 = 0;
            while (true) {
                if (cffVar.hasNext()) {
                    if (d.F(arqrVar.a(cffVar.next()), arqrVar.a(abtVar.f()))) {
                        break;
                    } else {
                        i9++;
                    }
                } else {
                    i9 = -1;
                    break;
                }
            }
            if (i9 == -1) {
                cezVar2.add(abtVar.f());
            } else {
                cezVar2.set(i9, abtVar.f());
            }
            veVar.i();
            int i10 = 0;
            for (int a = cezVar2.a(); i10 < a; a = a) {
                Object obj2 = cezVar2.get(i10);
                veVar.j(obj2, cdk.e(1605336364, new lhq(abtVar, aapVar, i10, obj2, arqwVar, 5), c));
                i10++;
            }
        }
        bwkVar.Y();
        int i11 = cfq.a;
        cue a2 = akc.a(cfq.a.a, false);
        int a3 = bwg.a(c);
        byx P = bwkVar.P();
        cga b = cfv.b(c, cgaVar);
        int i12 = cwl.a;
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
        c.y(-370911942);
        int a4 = cezVar2.a();
        for (int i13 = 0; i13 < a4; i13++) {
            Object obj3 = cezVar2.get(i13);
            c.x(-296332823, arqrVar.a(obj3));
            arqv arqvVar2 = (arqv) veVar.a(obj3);
            if (arqvVar2 != null) {
                arqvVar2.a(c, 0);
            }
            bwkVar.Y();
        }
        bwkVar.Y();
        c.p();
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new lhq(abtVar, cgaVar, aapVar, arqwVar, i, 6, (char[]) null);
        }
    }

    public static void aX(Object obj, aap aapVar, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        arqwVar.getClass();
        int i6 = i & 14;
        bwj c = bwjVar.c(-2005669070);
        if (i6 == 0) {
            if (true != c.G(obj)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        int i7 = i2 | 48;
        if ((i & 7168) == 0) {
            if (true != c.G("ImageBubbleCrossFade")) {
                i4 = 1024;
            } else {
                i4 = 2048;
            }
            i7 |= i4;
        }
        if ((i & 57344) == 0) {
            if (true != c.I(arqwVar)) {
                i3 = 8192;
            } else {
                i3 = 16384;
            }
            i7 |= i3;
        }
        cga.a aVar = cga.e;
        aW(aby.d(obj, "ImageBubbleCrossFade", c, ((i7 >> 6) & 112) | (i7 & 14), 0), aVar, aapVar, arqwVar, c, (i7 & 112) | 512 | (i7 & 57344));
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelx(obj, aapVar, arqwVar, i, 16);
        }
    }

    public static void aY(Uri uri, String str, cga cgaVar, Uri uri2, Uri uri3, cfq cfqVar, csv csvVar, float f, Integer num, Integer num2, Duration duration, String str2, String str3, aerg aergVar, hts htsVar, bwj bwjVar, int i, int i2, int i3) {
        cgaVar.getClass();
        cfqVar.getClass();
        csvVar.getClass();
        bwj c = bwjVar.c(-1633802213);
        c.y(1741555173);
        Uri uri4 = (i3 & 16) != 0 ? null : uri3;
        aZ(uri, str, cgaVar, uri2, uri4, cfqVar, csvVar, f, num, num2, duration, str2, str3, aergVar, htsVar, c, (i & 112) | 36872 | (i & 896) | (i & 458752) | (i & 3670016) | (29360128 & i) | (234881024 & i) | (i & 1879048192), 16777728 | (i2 & 14) | (i2 & 112) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2));
        ((bwk) c).Y();
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aerl(uri, str, cgaVar, uri2, uri4, cfqVar, csvVar, f, num, num2, duration, str2, str3, aergVar, htsVar, i, i2, i3);
        }
    }

    public static void aZ(Uri uri, String str, cga cgaVar, Uri uri2, Uri uri3, cfq cfqVar, csv csvVar, float f, Integer num, Integer num2, Duration duration, String str2, String str3, aerg aergVar, hts htsVar, bwj bwjVar, int i, int i2) {
        bwj c = bwjVar.c(1543883858);
        int i3 = i >> 9;
        hmh.a(uri, str, str2 != null ? cgaVar.a(dea.a(cga.e, str2)) : cgaVar, cfqVar, csvVar, f, new aerm(num, num2, uri, aergVar, duration, str3, (ygv) c.g(aerd.a), uri3, uri2, htsVar), c, (i & 112) | 8 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016));
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aern(uri, str, cgaVar, uri2, uri3, cfqVar, csvVar, f, num, num2, duration, str2, str3, aergVar, htsVar, i, i2);
        }
    }

    public static void aa(String str, List list, bwj bwjVar, int i) {
        bwj c = bwjVar.c(-1874672293);
        c.y(329671405);
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !c.G(str)) && (i & 6) != 4) {
            z = false;
        }
        bwk bwkVar = (bwk) c;
        Object T = bwkVar.T();
        if (z || T == bwj.a.a) {
            byu byuVar = new byu(new dqi(3), cav.a);
            bwkVar.ad(byuVar);
            T = byuVar;
        }
        byn bynVar = (byn) T;
        bwkVar.Y();
        aeiq aeiqVar = new aeiq(str, list, 8);
        long j = bmp.a(c).s;
        dje y = dje.y(bmp.d(c).k, 0L, 0L, null, null, null, null, 0L, ((dqi) bynVar.a()).a, 0, 0L, null, null, 0, 16744447);
        c.y(329681957);
        boolean G = c.G(bynVar);
        Object T2 = bwkVar.T();
        if (G || T2 == bwj.a.a) {
            T2 = new aeju(bynVar, 5);
            bwkVar.ad(T2);
        }
        bwkVar.Y();
        aeim.f(aeiqVar, null, j, y, 0L, (arqr) T2, false, null, c, 0, 434);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aekg(str, list, i, 14);
        }
    }

    public static void ab(akn aknVar, arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-31447233);
        if (i5 == 0) {
            if (true != c.G(aknVar)) {
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
            cga.a aVar = cga.e;
            int i6 = cfq.a;
            ahji.P(arqgVar, amh.j(aknVar.a(aVar, cfq.a.o), brg.a, brg.a, 12.0f, brg.a, 11), false, null, null, aemd.b, c, ((i2 >> 3) & 14) | 1572864, 60);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aekg(aknVar, arqgVar, i, 17);
        }
    }

    public static void ac(cga cgaVar, bpq bpqVar, long j, long j2, aemc aemcVar, arqw arqwVar, bwj bwjVar, int i, int i2) {
        cga cgaVar2;
        int i3;
        int i4;
        bpq bpqVar2;
        long j3;
        long j4;
        cga cgaVar3;
        long j5;
        long j6;
        long j7;
        bpq bpqVar3;
        long j8;
        int i5;
        int i6;
        int i7 = i2 & 1;
        bwj c = bwjVar.c(1501240780);
        if (i7 != 0) {
            i3 = i | 6;
            cgaVar2 = cgaVar;
        } else if ((i & 14) == 0) {
            cgaVar2 = cgaVar;
            if (true != c.G(cgaVar2)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i3 = i4 | i;
        } else {
            cgaVar2 = cgaVar;
            i3 = i;
        }
        if ((i & 112) == 0) {
            int i8 = 16;
            if ((i2 & 2) == 0) {
                bpqVar2 = bpqVar;
                if (c.G(bpqVar2)) {
                    i8 = 32;
                }
            } else {
                bpqVar2 = bpqVar;
            }
            i3 |= i8;
        } else {
            bpqVar2 = bpqVar;
        }
        if ((i & 896) == 0) {
            int i9 = 128;
            if ((i2 & 4) == 0) {
                j3 = j;
                if (c.F(j3)) {
                    i9 = 256;
                }
            } else {
                j3 = j;
            }
            i3 |= i9;
        } else {
            j3 = j;
        }
        if ((i & 7168) == 0) {
            int i10 = 1024;
            if ((i2 & 8) == 0) {
                j4 = j2;
                if (c.F(j4)) {
                    i10 = 2048;
                }
            } else {
                j4 = j2;
            }
            i3 |= i10;
        } else {
            j4 = j2;
        }
        if ((i & 57344) == 0) {
            if (true != c.G(aemcVar)) {
                i6 = 8192;
            } else {
                i6 = 16384;
            }
            i3 |= i6;
        }
        if ((458752 & i) == 0) {
            if (true != c.I(arqwVar)) {
                i5 = 65536;
            } else {
                i5 = 131072;
            }
            i3 |= i5;
        }
        if ((374491 & i3) == 74898 && c.L()) {
            c.v();
            bpqVar3 = bpqVar2;
            j8 = j4;
        } else {
            int i11 = i2 & 8;
            int i12 = i2 & 4;
            int i13 = i2 & 2;
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
                if (i13 != 0) {
                    i3 &= -113;
                }
                if (i12 != 0) {
                    i3 &= -897;
                }
                if (i11 != 0) {
                    i3 &= -7169;
                }
                j6 = j3;
            } else {
                if (i7 != 0) {
                    cgaVar3 = cga.e;
                } else {
                    cgaVar3 = cgaVar2;
                }
                if (i13 != 0) {
                    i3 &= -113;
                    bpqVar2 = bnb.d(false, c, 0, 3);
                }
                if (i12 != 0) {
                    j5 = ahji.aq(c);
                    i3 &= -897;
                } else {
                    j5 = j3;
                }
                if (i11 != 0) {
                    i3 &= -7169;
                    j4 = ahji.aq(c);
                }
                cgaVar2 = cgaVar3;
                j6 = j5;
            }
            long j9 = j4;
            c.n();
            amj a = ang.a(anl.d(c), c);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = bxl.a(arpj.a, c);
                bwkVar.ad(T);
            }
            arwe arweVar = (arwe) T;
            c.y(-228978191);
            if (aemcVar.c()) {
                j7 = adom.bX(c).k;
            } else {
                j7 = cku.g;
            }
            bwkVar.Y();
            awg b = awh.b(28.0f, 28.0f, brg.a, brg.a);
            akv akvVar = new akv();
            zzg zzgVar = new zzg(arweVar, bpqVar2, aemcVar, 4);
            cdi e = cdk.e(1679626480, new aelv(cgaVar2, j9, a, arqwVar), c);
            int i14 = i3 << 3;
            ahji.I(zzgVar, cgaVar2, bpqVar2, b, j6, 0L, brg.a, j7, akvVar, null, e, c, (i14 & 896) | (i14 & 112) | 100663296 | ((i3 << 6) & 57344), 48);
            bpqVar3 = bpqVar2;
            j3 = j6;
            j8 = j9;
        }
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new aelw(cgaVar2, bpqVar3, j3, j8, aemcVar, arqwVar, i, i2);
        }
    }

    public static void ad(aemb aembVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-1505501397);
        if (i5 == 0) {
            if (true != c.G(aembVar)) {
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
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = bxl.a(arpj.a, c);
                bwkVar.ad(T);
            }
            bpq d = bnb.d(true, c, 6, 2);
            ac(cgaVar, d, 0L, 0L, aembVar, cdk.e(-1458929816, new aelz(aembVar, (arwe) T, d), c), c, ((i2 >> 3) & 14) | 196608 | ((i2 << 12) & 57344), 12);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aekg((Object) aembVar, cgaVar, i, 18);
        }
    }

    public static /* synthetic */ void ae(String str, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        bwj bwjVar2;
        cga cgaVar2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1300533792);
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
        int i5 = i2 | 432;
        if ((i5 & 731) == 146 && c.L()) {
            c.v();
            cgaVar2 = cgaVar;
            bwjVar2 = c;
        } else {
            cga.a aVar = cga.e;
            c.y(252712819);
            int i6 = i5 & 14;
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (i6 == 4 || T == bwj.a.a) {
                T = new byu(new dqi(3), cav.a);
                bwkVar.ad(T);
            }
            byn bynVar = (byn) T;
            bwkVar.Y();
            long j = bmp.a(c).q;
            c.y(252717231);
            dje djeVar = bmp.d(c).f;
            bwkVar.Y();
            dqi dqiVar = new dqi(((dqi) bynVar.a()).a);
            c.y(252720299);
            boolean G = c.G(bynVar);
            Object T2 = bwkVar.T();
            if (G || T2 == bwj.a.a) {
                T2 = new aeju(bynVar, 6);
                bwkVar.ad(T2);
            }
            bwkVar.Y();
            bwjVar2 = c;
            ahji.e(str, aVar, j, 0L, 0L, dqiVar, 0L, 0, false, 0, 0, (arqr) T2, djeVar, bwjVar2, i5 & 126, 0, 32248);
            cgaVar2 = aVar;
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new aekg((Object) str, cgaVar2, i, 16);
        }
    }

    public static void af(aelt aeltVar, aewr aewrVar, aewr aewrVar2, cga cgaVar, byn bynVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        bwj c = bwjVar.c(726273270);
        if ((i & 14) == 0) {
            if (true != c.G(aeltVar)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aewrVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (true != c.G(aewrVar2)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (true != c.H(false)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i2 |= i3;
        }
        int i7 = i2 | 24576;
        if ((i & 458752) == 0) {
            i7 = i2 | 90112;
        }
        if ((374491 & i7) == 74898 && c.L()) {
            c.v();
        } else {
            int i8 = (-458753) & i7;
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
            } else {
                cgaVar = cga.e;
                bynVar = new byu(true, cav.a);
            }
            int i9 = i8 >> 3;
            c.n();
            int i10 = i9 & 126;
            if (aeltVar == aelt.c) {
                c.y(2054852973);
                ag(aewrVar, aewrVar2, bynVar, cgaVar, c, (i9 & 1022) | (57344 & i7));
                ((bwk) c).Y();
            } else {
                c.y(2055051373);
                int i11 = ((i8 << 6) & 896) | i10 | (i7 & 7168);
                ah(aewrVar, aewrVar2, aeltVar, bynVar, cgaVar, c, i11 | ((i8 << 3) & 458752));
                ((bwk) c).Y();
            }
        }
        cga cgaVar2 = cgaVar;
        byn bynVar2 = bynVar;
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aahs(aeltVar, aewrVar, aewrVar2, cgaVar2, bynVar2, i, 2);
        }
    }

    public static void ag(aewr aewrVar, aewr aewrVar2, byn bynVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        cga c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i & 14;
        bwj c3 = bwjVar.c(1538835566);
        if (i8 == 0) {
            if (true != c3.G(aewrVar)) {
                i7 = 2;
            } else {
                i7 = 4;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c3.G(aewrVar2)) {
                i6 = 16;
            } else {
                i6 = 32;
            }
            i2 |= i6;
        }
        if ((i & 896) == 0) {
            if (true != c3.H(false)) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i2 |= i5;
        }
        if ((i & 7168) == 0) {
            if (true != c3.G(bynVar)) {
                i4 = 1024;
            } else {
                i4 = 2048;
            }
            i2 |= i4;
        }
        if ((57344 & i) == 0) {
            if (true != c3.G(cgaVar)) {
                i3 = 8192;
            } else {
                i3 = 16384;
            }
            i2 |= i3;
        }
        if ((46811 & i2) == 9362 && c3.L()) {
            c3.v();
        } else {
            cga j = amh.j(cgaVar, brg.a, brg.a, brg.a, 20.0f, 7);
            ajw.e eVar = ajw.c;
            int i9 = cfq.a;
            cue a = akk.a(eVar, cfq.a.m, c3, 0);
            int a2 = bwg.a(c3);
            bwk bwkVar = (bwk) c3;
            byx P = bwkVar.P();
            cga b = cfv.b(c3, j);
            int i10 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c3.A();
            if (bwkVar.y) {
                c3.l(arqgVar);
            } else {
                c3.C();
            }
            caw.b(c3, a, cwl.a.e);
            caw.b(c3, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c3.j(valueOf, arqvVar);
            }
            caw.b(c3, b, cwl.a.c);
            c = amv.c(cga.e, 1.0f);
            ahji.ak(aewrVar.c, c, ((Boolean) bynVar.a()).booleanValue(), null, null, null, null, null, null, cdk.e(-242089516, new aelu(aewrVar, 1), c3), c3, 805306416, 504);
            c2 = amv.c(cga.e, 1.0f);
            ai(((Boolean) bynVar.a()).booleanValue(), aewrVar2.c, c2, cdk.e(-1243862981, new aelu(aewrVar2, 0), c3), c3, ((i2 >> 6) & 14) | 27648, 0);
            c3.p();
        }
        bzz e = c3.e();
        if (e != null) {
            ((bzf) e).d = new lhq((Object) aewrVar, (Object) aewrVar2, (Object) bynVar, (Object) cgaVar, i, 4, (byte[]) null);
        }
    }

    public static void ah(aewr aewrVar, aewr aewrVar2, aelt aeltVar, byn bynVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        ajw.b bVar;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i & 14;
        bwj c2 = bwjVar.c(-124689242);
        if (i9 == 0) {
            if (true != c2.G(aewrVar)) {
                i8 = 2;
            } else {
                i8 = 4;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.G(aewrVar2)) {
                i7 = 16;
            } else {
                i7 = 32;
            }
            i2 |= i7;
        }
        if ((i & 896) == 0) {
            if (true != c2.G(aeltVar)) {
                i6 = 128;
            } else {
                i6 = 256;
            }
            i2 |= i6;
        }
        if ((i & 7168) == 0) {
            if (true != c2.H(false)) {
                i5 = 1024;
            } else {
                i5 = 2048;
            }
            i2 |= i5;
        }
        if ((57344 & i) == 0) {
            if (true != c2.G(bynVar)) {
                i4 = 8192;
            } else {
                i4 = 16384;
            }
            i2 |= i4;
        }
        if ((458752 & i) == 0) {
            if (true != c2.G(cgaVar)) {
                i3 = 65536;
            } else {
                i3 = 131072;
            }
            i2 |= i3;
        }
        if ((374491 & i2) != 74898 || !c2.L()) {
            c = amv.c(cgaVar, 1.0f);
            cga j = amh.j(c, brg.a, brg.a, brg.a, 20.0f, 7);
            if (aeltVar == aelt.a) {
                bVar = ajw.f;
            } else {
                bVar = ajw.b;
            }
            int i10 = cfq.a;
            cue a = amq.a(bVar, cfq.a.j, c2, 0);
            int a2 = bwg.a(c2);
            bwk bwkVar = (bwk) c2;
            byx P = bwkVar.P();
            cga b = cfv.b(c2, j);
            int i11 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar);
            } else {
                c2.C();
            }
            caw.b(c2, a, cwl.a.e);
            caw.b(c2, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c2.j(valueOf, arqvVar);
            }
            caw.b(c2, b, cwl.a.c);
            ai(((Boolean) bynVar.a()).booleanValue(), aewrVar2.c, null, cdk.e(-1035986037, new aelu(aewrVar2, 2), c2), c2, ((i2 >> 9) & 14) | 24576, 8);
            amx.a(amv.l(cga.e, 8.0f), c2);
            ahji.ak(aewrVar.c, null, ((Boolean) bynVar.a()).booleanValue(), null, null, null, null, null, null, cdk.e(2066398418, new aelu(aewrVar, 3), c2), c2, 805306368, 506);
            c2.p();
        } else {
            c2.v();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new aahs(aewrVar, aewrVar2, aeltVar, bynVar, cgaVar, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void ai(boolean r18, defpackage.arqg r19, defpackage.cga r20, defpackage.arqw r21, defpackage.bwj r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeke.ai(boolean, arqg, cga, arqw, bwj, int, int):void");
    }

    public static void aj(aema aemaVar, cga cgaVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        arqv arqvVar2;
        int i3;
        int i4;
        bwj c = bwjVar.c(1827483916);
        if ((i & 14) == 0) {
            if (true != c.G(aemaVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i | i4;
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
        int i5 = i2 | 384;
        if ((i5 & 731) == 146 && c.L()) {
            c.v();
            arqvVar2 = arqvVar;
        } else {
            arqv arqvVar3 = aemd.a;
            ac(cgaVar, bnb.d(true, c, 6, 2), bmp.a(c).p, bmp.a(c).p, aemaVar, cdk.e(-242400311, new jwz(18), c), c, ((i5 >> 3) & 14) | 196608 | ((i5 << 12) & 57344), 0);
            arqvVar2 = arqvVar3;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelx((Object) aemaVar, (Object) cgaVar, (Object) arqvVar2, i, 0);
        }
    }

    public static /* synthetic */ void ak(aews aewsVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        int i3;
        int i4 = i & 14;
        bwj c2 = bwjVar.c(-1103336773);
        if (i4 == 0) {
            if (true != c2.G(aewsVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 91) == 18 && c2.L()) {
            c2.v();
        } else {
            cgaVar = cga.e;
            c = amv.c(cgaVar, 1.0f);
            cga f = amv.f(c, 192.0f);
            c2.y(-1897245495);
            aet.a(dfv.a(aewsVar.a, c2, 0), null, f, null, null, brg.a, c2, 8, 120);
            ((bwk) c2).Y();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new aekg((Object) aewsVar, cgaVar, i, 15);
        }
    }

    public static void al(String str, boolean z, bwj bwjVar, int i) {
        int i2;
        float f;
        bwj bwjVar2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(549550847);
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
            if (str == null) {
                bzz e = c.e();
                if (e != null) {
                    ((bzf) e).d = new aell(z, i, 0);
                    return;
                }
                return;
            }
            cga.a aVar = cga.e;
            if (z) {
                f = 2.0f;
            } else {
                f = brg.a;
            }
            bwjVar2 = c;
            ahji.e(str, amh.j(aVar, brg.a, f, brg.a, brg.a, 13), bmp.a(c).s, 0L, 0L, null, 0L, 0, false, 0, 0, null, bmp.d(c).k, bwjVar2, i6 & 14, 0, 65528);
        }
        bzz e2 = bwjVar2.e();
        if (e2 != null) {
            ((bzf) e2).d = new aelm(str, z, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void am(defpackage.aelk r20, defpackage.aeln r21, defpackage.arqg r22, defpackage.arqv r23, defpackage.bwj r24, int r25) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeke.am(aelk, aeln, arqg, arqv, bwj, int):void");
    }

    public static void an(amt amtVar, boolean z, boolean z2, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        float f;
        float f2;
        cga b;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i & 14;
        bwj c = bwjVar.c(1513366823);
        if (i7 == 0) {
            if (true != c.G(amtVar)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.H(z)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (true != c.H(z2)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (true != c.I(arqwVar)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) == 1170 && c.L()) {
            c.v();
        } else {
            cga.a aVar = cga.e;
            if (z) {
                f = brg.a;
            } else {
                f = 16.0f;
            }
            if (z2) {
                f2 = 4.0f;
            } else {
                f2 = 16.0f;
            }
            b = amtVar.b(amh.f(aVar, 16.0f, 16.0f, f2, f), 1.0f, true);
            int i8 = i2 & 7168;
            ajw.e eVar = ajw.c;
            int i9 = cfq.a;
            cue a = akk.a(eVar, cfq.a.m, c, 0);
            int a2 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b2 = cfv.b(c, b);
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
            arqwVar.a(ako.a, c, Integer.valueOf(((i8 >> 6) & 112) | 6));
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeog(amtVar, z, z2, arqwVar, i, 1);
        }
    }

    public static void ao(aelk aelkVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(1164519877);
        if (i4 == 0) {
            if (true != c.G(aelkVar)) {
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
            cga i5 = amh.i(cga.e, brg.a, 16.0f, 1);
            ajw.b bVar = ajw.a;
            int i6 = cfq.a;
            cue a = amq.a(bVar, cfq.a.j, c, 0);
            int a2 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, i5);
            int i7 = cwl.a;
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
            caw.b(c, b, cwl.a.c);
            ap(c, 0);
            aw(aelkVar.d, false, c, 48);
            amx.a(amv.l(cga.e, 12.0f), c);
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelf(aelkVar, i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void ap(defpackage.bwj r9, int r10) {
        /*
            r0 = -1505099279(0xffffffffa64a01f1, float:-7.008546E-16)
            bwj r9 = r9.c(r0)
            if (r10 != 0) goto L16
            boolean r10 = r9.L()
            r0 = 0
            if (r10 != 0) goto L12
            r10 = r0
            goto L16
        L12:
            r9.v()
            goto L44
        L16:
            cga$a r0 = defpackage.cga.e
            r4 = 0
            r5 = 14
            r1 = 1094713344(0x41400000, float:12.0)
            r2 = 0
            r3 = 0
            cga r0 = defpackage.amh.j(r0, r1, r2, r3, r4, r5)
            r1 = 1103101952(0x41c00000, float:24.0)
            cga r3 = defpackage.amv.d(r0, r1)
            aerb r0 = defpackage.aerb.aa
            cor r1 = bg(r0, r9)
            blh r0 = defpackage.bmp.a(r9)
            long r4 = r0.q
            r0 = 2132017506(0x7f140162, float:1.9673292E38)
            java.lang.String r2 = defpackage.dga.a(r0, r9)
            r7 = 8
            r8 = 0
            r6 = r9
            defpackage.ahji.N(r1, r2, r3, r4, r6, r7, r8)
            r0 = r10
        L44:
            bzz r9 = r9.e()
            if (r9 == 0) goto L55
            lhs r10 = new lhs
            r1 = 12
            r10.<init>(r0, r1)
            bzf r9 = (defpackage.bzf) r9
            r9.d = r10
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeke.ap(bwj, int):void");
    }

    public static void aq(aerb aerbVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(1001645541);
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
            ahji.N(bg(aerbVar, c), null, amv.g(cga.e, 24.0f), bmp.a(c).b, c, 8, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelf(aerbVar, i, 8);
        }
    }

    public static void ar(aelr aelrVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        cga b;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c2 = bwjVar.c(1537733782);
        if (i5 == 0) {
            if (true != c2.G(aelrVar)) {
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
        int i6 = i2 | 384;
        if ((i6 & 731) != 146 || !c2.L()) {
            c = amv.c(cgaVar, 1.0f);
            ajw.b bVar = ajw.a;
            int i7 = cfq.a;
            cue a = amq.a(bVar, cfq.a.j, c2, 0);
            int a2 = bwg.a(c2);
            bwk bwkVar = (bwk) c2;
            byx P = bwkVar.P();
            cga b2 = cfv.b(c2, c);
            int i8 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar);
            } else {
                c2.C();
            }
            caw.b(c2, a, cwl.a.e);
            caw.b(c2, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c2.j(valueOf, arqvVar);
            }
            caw.b(c2, b2, cwl.a.c);
            b = amu.a.b(cga.e, 1.0f, true);
            amx.a(b, c2);
            aelk aelkVar = aelrVar.c;
            c2.y(-1450702736);
            ay(aelkVar, aelrVar.a, aelrVar.b, c2, i6 & 896);
            bwkVar.Y();
            c2.p();
        } else {
            c2.v();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new aekg((Object) aelrVar, cgaVar, i, 11);
        }
    }

    public static void as(aelj aeljVar, aelj aeljVar2, bwj bwjVar, int i) {
        int i2;
        cga c;
        bwk bwkVar;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c2 = bwjVar.c(-1842873231);
        if (i6 == 0) {
            if (true != c2.G(aeljVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.G(aeljVar2)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c2.H(false)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c2.L()) {
            c2.v();
        } else if (aeljVar != null || aeljVar2 != null) {
            c = amv.c(cga.e, 1.0f);
            cga j = amh.j(c, brg.a, 12.0f, 8.0f, 6.0f, 1);
            ajw.b bVar = ajw.b;
            int i7 = cfq.a;
            cue a = amq.a(bVar, cfq.a.j, c2, 6);
            int a2 = bwg.a(c2);
            bwk bwkVar2 = (bwk) c2;
            byx P = bwkVar2.P();
            cga b = cfv.b(c2, j);
            int i8 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c2.A();
            if (bwkVar2.y) {
                c2.l(arqgVar);
            } else {
                c2.C();
            }
            caw.b(c2, a, cwl.a.e);
            caw.b(c2, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar2.y || !d.F(bwkVar2.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar2.ad(valueOf);
                c2.j(valueOf, arqvVar);
            }
            caw.b(c2, b, cwl.a.c);
            c2.y(-1218853237);
            if (aeljVar2 != null) {
                bwkVar = bwkVar2;
                ahji.an(aeljVar2.b, null, false, null, cm(c2), null, null, cdk.e(-1942597391, new yzl(aeljVar2, 18), c2), c2, 805306368, 494);
            } else {
                bwkVar = bwkVar2;
            }
            bwkVar.Y();
            amx.a(amv.l(cga.e, 8.0f), c2);
            c2.y(-1218847605);
            if (aeljVar != null) {
                ahji.an(aeljVar.b, null, false, null, cm(c2), null, null, cdk.e(-855529190, new yzl(aeljVar, 19), c2), c2, 805306368, 494);
            }
            bwkVar.Y();
            c2.p();
        } else {
            bzz e = c2.e();
            if (e != null) {
                ((bzf) e).d = new lhs(i, 10);
                return;
            }
            return;
        }
        bzz e2 = c2.e();
        if (e2 != null) {
            ((bzf) e2).d = new aekg(aeljVar, aeljVar2, i, 12);
        }
    }

    public static void at(arqg arqgVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(481683502);
        if (i5 == 0) {
            if (true != c.I(arqgVar)) {
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
            if (arqgVar == null) {
                bzz e = c.e();
                if (e != null) {
                    ((bzf) e).d = new aelf(cgaVar, i, 3);
                    return;
                }
                return;
            }
            ahji.P(arqgVar, cgaVar, false, null, null, aels.b, c, (i2 & 14) | 1572864 | (i2 & 112), 60);
        }
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new aekg((Object) arqgVar, cgaVar, i, 13);
        }
    }

    public static void au(aerb aerbVar, boolean z, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i & 14;
        bwj c = bwjVar.c(-582116076);
        if (i7 == 0) {
            if (true != c.G(aerbVar)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.H(z)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (true != c.H(false)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
            i3 = 2;
        } else if (z) {
            c.y(1493994618);
            bqv.c(amv.h(amh.j(cga.e, 16.0f, 16.0f, brg.a, 16.0f, 4), 40.0f), awh.a, cl(c), 0L, brg.a, brg.a, null, cdk.e(239175582, new aekj(aerbVar, 2), c), c, 120);
            ((bwk) c).Y();
            i3 = 2;
        } else {
            i3 = 2;
            c.y(1494374368);
            ax(aerbVar, c, ((i2 >> 3) & 112) | (i2 & 14));
            ((bwk) c).Y();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelm(aerbVar, z, i, i3);
        }
    }

    public static void av(boolean z, bwj bwjVar, int i) {
        int i2;
        amj h;
        float f;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(1115168592);
        if (i5 == 0) {
            if (true != c.E(R.drawable.product_logo_gshield_color_48)) {
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
            c.y(1530439337);
            int i6 = i2 & 112;
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (i6 == 32 || T == bwj.a.a) {
                if (z) {
                    h = amh.h(16.0f, 16.0f, brg.a, 16.0f, 4);
                } else {
                    h = amh.h(12.0f, brg.a, 8.0f, brg.a, 10);
                }
                T = new byu(h, cav.a);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            cga c2 = amh.c(cga.e, (amj) ((byn) T).a());
            if (true != z) {
                f = 24.0f;
            } else {
                f = 40.0f;
            }
            aet.a(dfv.a(R.drawable.product_logo_gshield_color_48, c, i2 & 14), null, amv.h(c2, f), null, null, brg.a, c, 8, 120);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aell(z, i, 2);
        }
    }

    public static void aw(aelq aelqVar, boolean z, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(531500198);
        if (i6 == 0) {
            if (true != c.G(aelqVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.H(z)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c.H(false)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else if (aelqVar instanceof aelo) {
            c.y(1255689614);
            au(((aelo) aelqVar).a, z, c, i2 & 1008);
            ((bwk) c).Y();
        } else if (aelqVar instanceof aelp) {
            c.y(1255693101);
            av(z, c, i2 & 112);
            ((bwk) c).Y();
        } else {
            if (aelqVar == null) {
                c.y(271863704);
                ((bwk) c).Y();
                bzz e = c.e();
                if (e != null) {
                    ((bzf) e).d = new aell(z, i, 3);
                    return;
                }
                return;
            }
            c.y(1255688195);
            ((bwk) c).Y();
            throw new armm();
        }
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new aelm(aelqVar, z, i, 3);
        }
    }

    public static void ax(aerb aerbVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(1627886219);
        if (i5 == 0) {
            if (true != c.G(aerbVar)) {
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
        } else {
            ahji.N(bg(aerbVar, c), null, dea.a(amv.h(amh.j(cga.e, 12.0f, brg.a, 8.0f, brg.a, 10), 24.0f), "Logo"), cl(c), c, 8, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelf(aerbVar, i, 6);
        }
    }

    public static void ay(aelk aelkVar, aeln aelnVar, arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i & 14;
        bwj c = bwjVar.c(-337028306);
        if (i7 == 0) {
            if (true != c.G(aelkVar)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aelnVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (true != c.G(null)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (true != c.I(arqgVar)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) == 1170 && c.L()) {
            c.v();
        } else {
            am(aelkVar, aelnVar, arqgVar, cdk.e(1946717634, new ifn(aelnVar, aelkVar, 17), c), c, (i2 & 14) | 3072 | (i2 & 112) | ((i2 >> 3) & 896));
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelx(aelkVar, aelnVar, arqgVar, i, 1, (byte[]) null);
        }
    }

    public static /* synthetic */ void az(String str, bwj bwjVar, int i) {
        int i2;
        bwj bwjVar2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(1843767654);
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
            if (true != c.G(null)) {
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
            if (str == null) {
                bzz e = c.e();
                if (e != null) {
                    ((bzf) e).d = new lhs(i, 11);
                    return;
                }
                return;
            }
            dje djeVar = bmp.d(c).h;
            c.y(-1462543336);
            long j = bmp.a(c).q;
            ((bwk) c).Y();
            bwjVar2 = c;
            ahji.e(str, null, j, 0L, 0L, null, 0L, 0, false, 0, 0, null, djeVar, bwjVar2, i2 & 14, 0, 65530);
        }
        bzz e2 = bwjVar2.e();
        if (e2 != null) {
            ((bzf) e2).d = new aelf(str, i, 4);
        }
    }

    public static void b(aeiv aeivVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1169773195);
        if (i4 == 0) {
            if (true != c.G(aeivVar)) {
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
            h(null, 0, 0, cdk.e(-4839771, new yzl(aeivVar, 12), c), c, 3072, 7);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aaob(aeivVar, i, 2);
        }
    }

    public static float bA(float f) {
        return arrn.q((f - 0.25f) / 0.75f, brg.a, 1.0f);
    }

    public static void bB(arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1111066645);
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
            ahji.P(arqgVar, null, false, null, null, afha.a, c, (i2 & 14) | 1572864, 62);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new afaz(arqgVar, i, 3);
        }
    }

    public static void bC(cga cgaVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        int i3;
        int i4 = i & 14;
        bwj c2 = bwjVar.c(-1063579030);
        if (i4 == 0) {
            if (true != c2.G(cgaVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c2.L()) {
            c2.v();
        } else {
            String a = dga.a(R.string.gallery_empty_state_content_description, c2);
            c = amv.c(cgaVar, 1.0f);
            c2.y(-1271982341);
            bwk bwkVar = (bwk) c2;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = aeys.k;
                bwkVar.ad(T);
            }
            bwkVar.Y();
            cga c3 = dhb.c(c, true, (arqr) T);
            c2.y(-1271981229);
            boolean G = c2.G(a);
            Object T2 = bwkVar.T();
            if (G || T2 == bwj.a.a) {
                T2 = new aezb(a, 7);
                bwkVar.ad(T2);
            }
            bwkVar.Y();
            cga b = dhb.b(c3, (arqr) T2);
            int i5 = cfq.a;
            cue a2 = akc.a(cfq.a.a, false);
            int a3 = bwg.a(c2);
            byx P = bwkVar.P();
            cga b2 = cfv.b(c2, b);
            int i6 = cwl.a;
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
            cga a4 = akf.a.a(cga.e, cfq.a.e);
            cue a5 = akk.a(ajw.c, cfq.a.m, c2, 0);
            int a6 = bwg.a(c2);
            byx P2 = bwkVar.P();
            cga b3 = cfv.b(c2, a4);
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
            ako akoVar = ako.a;
            cga a7 = adf.a(akoVar.a(amv.h(cga.e, 56.0f), cfq.a.n), bmp.a(c2).D, awh.a);
            cue a8 = akc.a(cfq.a.a, false);
            int a9 = bwg.a(c2);
            byx P3 = bwkVar.P();
            cga b4 = cfv.b(c2, a7);
            arqg arqgVar3 = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar3);
            } else {
                c2.C();
            }
            caw.b(c2, a8, cwl.a.e);
            caw.b(c2, P3, cwl.a.d);
            arqv arqvVar3 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a9))) {
                Integer valueOf3 = Integer.valueOf(a9);
                bwkVar.ad(valueOf3);
                c2.j(valueOf3, arqvVar3);
            }
            caw.b(c2, b4, cwl.a.c);
            ahji.N(bg(aerb.bq, c2), null, akf.a.a(cga.e, cfq.a.e), bmp.a(c2).a, c2, 56, 0);
            c2.p();
            brx.b(dga.a(R.string.gallery_empty_state_title, c2), akoVar.a(cga.e, cfq.a.n), 0L, 0L, 0L, new dqi(3), 0L, 0, false, 0, 0, null, dje.y(bmp.d(c2).g, bmp.a(c2).q, 0L, null, null, null, null, 0L, 0, 0, 0L, null, null, 0, 16777214), c2, 0, 0, 65020);
            brx.b(dga.a(R.string.gallery_empty_state_body, c2), akoVar.a(cga.e, cfq.a.n), 0L, 0L, 0L, new dqi(3), 0L, 0, false, 0, 0, null, dje.y(bmp.d(c2).k, bmp.a(c2).s, 0L, null, null, null, null, 0L, 0, 0, 0L, null, null, 0, 16777214), c2, 0, 0, 65020);
            c2.p();
            c2.p();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new afaz(cgaVar, i, 5);
        }
    }

    public static void bD(cga cgaVar, afhe afheVar, bwj bwjVar, int i) {
        bwj c = bwjVar.c(-203890468);
        gqg a = gei.a(afheVar.c, null, c, 1);
        cas b = cao.b(afheVar.d, arnv.a, null, c, 2);
        apb.a aVar = new apb.a();
        ajx ajxVar = ajx.a;
        apf.b(aVar, cgaVar, null, null, new ajw.d(3.0f, true, ajxVar), new ajw.d(3.0f, true, ajxVar), null, false, new aaoa((Object) a, (Object) afheVar, (Object) b, 8, (short[]) null), c, ((i << 3) & 112) | 1769472);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new afbs(cgaVar, afheVar, i, 3);
        }
    }

    public static void bE(cga cgaVar, afts aftsVar, int i, bwj bwjVar, int i2) {
        boolean z;
        String b;
        float f;
        cga a;
        bwj c = bwjVar.c(-1605583583);
        String a2 = dga.a(aftsVar.l().b().a(), c);
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c.y(-1754355632);
            b = dga.b(R.string.gallery_item_content_description_selected_state, new Object[]{a2, Integer.valueOf(i + 1)}, c);
            ((bwk) c).Y();
        } else {
            c.y(-1754088443);
            b = dga.b(R.string.gallery_item_content_description_unselected_state, new Object[]{a2, bs(aftsVar.f())}, c);
            ((bwk) c).Y();
        }
        c.y(-887859254);
        bwk bwkVar = (bwk) c;
        Object T = bwkVar.T();
        if (T == bwj.a.a) {
            T = aeys.m;
            bwkVar.ad(T);
        }
        bwkVar.Y();
        cga c2 = dhb.c(cgaVar, true, (arqr) T);
        c.y(-887858152);
        boolean G = c.G(b);
        Object T2 = bwkVar.T();
        if (G || T2 == bwj.a.a) {
            T2 = new aezb(b, 8);
            bwkVar.ad(T2);
        }
        bwkVar.Y();
        cga b2 = dhb.b(c2, (arqr) T2);
        int i3 = cfq.a;
        cue a3 = akc.a(cfq.a.a, false);
        int a4 = bwg.a(c);
        byx P = bwkVar.P();
        cga b3 = cfv.b(c, b2);
        int i4 = cwl.a;
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
        caw.b(c, b3, cwl.a.c);
        c.y(349198822);
        if (z) {
            bF(i + 1, c, 0);
        }
        bwkVar.Y();
        float f2 = brg.a;
        if (z) {
            f = 10.0f;
        } else {
            f = 0.0f;
        }
        cga d = amh.d(cga.e, f);
        if (z) {
            f2 = 16.0f;
        }
        cga a5 = chk.a(d, awh.a(f2));
        cue a6 = akc.a(cfq.a.a, false);
        int a7 = bwg.a(c);
        byx P2 = bwkVar.P();
        cga b4 = cfv.b(c, a5);
        arqg arqgVar2 = cwl.a.a;
        c.A();
        if (bwkVar.y) {
            c.l(arqgVar2);
        } else {
            c.C();
        }
        caw.b(c, a6, cwl.a.e);
        caw.b(c, P2, cwl.a.d);
        arqv arqvVar2 = cwl.a.f;
        if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a7))) {
            Integer valueOf2 = Integer.valueOf(a7);
            bwkVar.ad(valueOf2);
            c.j(valueOf2, arqvVar2);
        }
        caw.b(c, b4, cwl.a.c);
        akf akfVar = akf.a;
        c.y(-1748467881);
        if (aftsVar instanceof aftq) {
            bI(akfVar, (aftq) aftsVar, c, 70);
        }
        bwkVar.Y();
        Uri parse = Uri.parse(aftsVar.i());
        a = cga.e.a(new AspectRatioElement());
        int i5 = csv.a;
        bf(parse, null, a, null, null, null, csv.a.a, null, brg.a, null, null, null, null, null, null, null, c, 12583352, 0, 524152);
        c.p();
        c.p();
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeis(cgaVar, aftsVar, i, i2, 11);
        }
    }

    public static void bF(int i, bwj bwjVar, int i2) {
        int i3;
        int i4;
        int i5 = i2 & 14;
        bwj c = bwjVar.c(1355826047);
        if (i5 == 0) {
            if (true != c.E(i)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && c.L()) {
            c.v();
        } else {
            float ef = ((dqv) c.g(dch.d)).ef(drn.c(20));
            long j = bmp.a(c).G;
            float f = 10.0f - (ef / 4.0f);
            cga a = adf.a(cld.b(amv.h(amh.e(cgh.a(cga.e, 2.0f), 0.9f * f, f * 1.1f), ef), brg.a, brg.a, brg.a, brg.a, brg.a, brg.a, brg.a, awh.a, true, 1, 59391), bmp.a(c).a, awh.a);
            c.y(1433185728);
            boolean F = c.F(j);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (F || T == bwj.a.a) {
                T = new aeri(j, 2);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            cga b = cho.b(a, (arqr) T);
            int i6 = cfq.a;
            cue a2 = akc.a(cfq.a.e, false);
            int a3 = bwg.a(c);
            byx P = bwkVar.P();
            cga b2 = cfv.b(c, b);
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
            caw.b(c, b2, cwl.a.c);
            brx.b(String.valueOf(i), null, 0L, drn.c(12), 0L, null, drn.c(14), 0, false, 0, 0, null, dje.y(bmp.d(c).o, bmp.a(c).b, 0L, null, null, null, null, 0L, 0, 0, 0L, null, null, 0, 16777214), c, 3072, 6, 64502);
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new afhm(i, i2);
        }
    }

    public static void bG(aki akiVar, afhe afheVar, float f, arqg arqgVar, bwj bwjVar, int i, int i2) {
        float f2;
        boolean booleanValue;
        float f3;
        boolean booleanValue2;
        arqgVar.getClass();
        asai asaiVar = afheVar.c;
        bwj c = bwjVar.c(541731934);
        gqg a = gei.a(asaiVar, null, c, 1);
        c.y(1867960003);
        bwk bwkVar = (bwk) c;
        Object T = bwkVar.T();
        if (T == bwj.a.a) {
            bxd bxdVar = new bxd(new afhj(a, 3), null);
            bwkVar.ad(bxdVar);
            T = bxdVar;
        }
        cas casVar = (cas) T;
        bwkVar.Y();
        c.y(1867965571);
        Object T2 = bwkVar.T();
        if (T2 == bwj.a.a) {
            bxd bxdVar2 = new bxd(new afhj(a, 2), null);
            bwkVar.ad(bxdVar2);
            T2 = bxdVar2;
        }
        if ((i2 & 2) != 0) {
            f2 = Float.NaN;
        } else {
            f2 = f;
        }
        cas casVar2 = (cas) T2;
        bwkVar.Y();
        float c2 = akiVar.c();
        booleanValue = ((Boolean) casVar.a()).booleanValue();
        if (booleanValue) {
            cga.a aVar = cga.e;
            ajw.e eVar = ajw.c;
            int i3 = cfq.a;
            cue a2 = akk.a(eVar, cfq.a.m, c, 0);
            int a3 = bwg.a(c);
            byx P = bwkVar.P();
            cga b = cfv.b(c, aVar);
            int i4 = cwl.a;
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
            cga.a aVar2 = cga.e;
            if (!dqy.b(f2, Float.NaN)) {
                dqy dqyVar = new dqy(f2);
                dqy dqyVar2 = new dqy(c2);
                if (dqyVar.compareTo(dqyVar2) > 0) {
                    dqyVar = dqyVar2;
                }
                f3 = dqyVar.a - 72.0f;
            } else {
                f3 = f2;
            }
            cga e = amv.e(aVar2, f3, c2 - 72.0f);
            booleanValue2 = ((Boolean) casVar2.a()).booleanValue();
            if (booleanValue2) {
                c.y(115478907);
                bD(e, afheVar, c, 64);
                bwkVar.Y();
            } else {
                c.y(115551044);
                bC(e, c, 0);
                bwkVar.Y();
            }
            bJ(amv.d(cga.e, 72.0f), afheVar, arqgVar, c, ((i >> 3) & 896) | 70);
            c.p();
        }
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new afhn(akiVar, afheVar, f2, arqgVar, i, i2);
        }
    }

    public static void bH(asai asaiVar, float f, arqg arqgVar, arqr arqrVar, bwj bwjVar, int i) {
        bwj c = bwjVar.c(151603534);
        dqv dqvVar = (dqv) c.g(dch.d);
        cdi e = cdk.e(1717962770, new aeyl(asaiVar, 7), c);
        cga a = cha.a(cga.e, f);
        c.y(-1968327225);
        boolean G = c.G(dqvVar);
        boolean z = true;
        if ((((i & 7168) ^ 3072) <= 2048 || !c.G(arqrVar)) && (i & 3072) != 2048) {
            z = false;
        }
        boolean z2 = G | z;
        bwk bwkVar = (bwk) c;
        Object T = bwkVar.T();
        if (z2 || T == bwj.a.a) {
            T = new afho(dqvVar, arqrVar, 0);
            bwkVar.ad(T);
        }
        bwkVar.Y();
        ahfn.a(e, cur.a(a, (arqr) T), cdk.e(-645878892, new aeyl(arqgVar, 8), c), null, brg.a, null, ahji.c(bmp.a(c).J, 0L, bmp.a(c).s, c, 22), null, c, 390, 184);
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new aemr(asaiVar, f, arqgVar, arqrVar, i, 2);
        }
    }

    public static void bI(ake akeVar, aftq aftqVar, bwj bwjVar, int i) {
        bwk bwkVar;
        bwj c = bwjVar.c(-2106222178);
        cga a = cgh.a(cga.e, 2.0f);
        int i2 = cfq.a;
        cga d = amh.d(akeVar.a(a, cfq.a.c), 4.0f);
        cue a2 = amq.a(ajw.a, cfq.a.k, c, 48);
        int a3 = bwg.a(c);
        bwk bwkVar2 = (bwk) c;
        byx P = bwkVar2.P();
        cga b = cfv.b(c, d);
        int i3 = cwl.a;
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
        c.y(-699036873);
        if (aftqVar.g.getSeconds() > 0) {
            String formatElapsedTime = DateUtils.formatElapsedTime(aftqVar.g.getSeconds());
            formatElapsedTime.getClass();
            bwkVar = bwkVar2;
            brx.b(formatElapsedTime, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, dje.y(bmp.d(c).o, cku.d, 0L, null, null, null, null, 0L, 0, 0, 0L, null, null, 0, 16777214), c, 0, 0, 65534);
        } else {
            bwkVar = bwkVar2;
        }
        bwkVar.Y();
        ahji.N(bg(aerb.cv, c), null, null, cku.d, c, 3128, 4);
        c.p();
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new afbs(akeVar, aftqVar, i, 4);
        }
    }

    public static void bJ(cga cgaVar, afhe afheVar, arqg arqgVar, bwj bwjVar, int i) {
        cga c;
        bwj c2 = bwjVar.c(146496125);
        c = amv.c(amh.d(cgaVar, 16.0f), 1.0f);
        ajw.c cVar = ajw.f;
        int i2 = cfq.a;
        cue a = amq.a(cVar, cfq.a.j, c2, 6);
        int a2 = bwg.a(c2);
        bwk bwkVar = (bwk) c2;
        byx P = bwkVar.P();
        cga b = cfv.b(c2, c);
        int i3 = cwl.a;
        arqg arqgVar2 = cwl.a.a;
        c2.A();
        if (bwkVar.y) {
            c2.l(arqgVar2);
        } else {
            c2.C();
        }
        caw.b(c2, a, cwl.a.e);
        caw.b(c2, P, cwl.a.d);
        arqv arqvVar = cwl.a.f;
        if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
            Integer valueOf = Integer.valueOf(a2);
            bwkVar.ad(valueOf);
            c2.j(valueOf, arqvVar);
        }
        caw.b(c2, b, cwl.a.c);
        cas b2 = cao.b(afheVar.d, arnv.a, null, c2, 2);
        Activity b3 = afzv.b((Context) c2.g(AndroidCompositionLocals_androidKt.b));
        bxl.g(b3, new aafa(afheVar, b3, (arpe) null, 20), c2);
        String a3 = dga.a(R.string.folders_button_content_description, c2);
        cga.a aVar = cga.e;
        c2.y(1863904379);
        Object T = bwkVar.T();
        if (T == bwj.a.a) {
            T = aeys.j;
            bwkVar.ad(T);
        }
        bwkVar.Y();
        cga c3 = dhb.c(aVar, true, (arqr) T);
        c2.y(1863905552);
        boolean G = c2.G(a3);
        Object T2 = bwkVar.T();
        if (G || T2 == bwj.a.a) {
            T2 = new aezb(a3, 5);
            bwkVar.ad(T2);
        }
        bwkVar.Y();
        cga b4 = dhb.b(c3, (arqr) T2);
        amk amkVar = new amk(24.0f, 10.0f, 24.0f, 10.0f);
        amj amjVar = ahfq.a;
        ahji.ak(new afhj(afheVar, 1), b4, false, null, ahfq.b(bmp.a(c2).H, bmp.a(c2).q, c2, 12), null, null, amkVar, null, afha.c, c2, 817889280, 364);
        c2.y(1863937257);
        if (a.x(b2).size() > 0) {
            ahji.ak(arqgVar, null, false, null, ahfq.b(bmp.a(c2).a, bmp.a(c2).p, c2, 12), null, null, new amk(24.0f, 10.0f, 24.0f, 10.0f), null, cdk.e(91263470, new aeyj(b2, 5), c2), c2, ((i >> 6) & 14) | 817889280, 366);
        }
        bwkVar.Y();
        c2.p();
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new afhf(cgaVar, afheVar, arqgVar, i, 0);
        }
    }

    public static /* synthetic */ void bK(cga cgaVar, bwj bwjVar, int i) {
        int i2;
        long f;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1634719668);
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
            cga i5 = amh.i(cgaVar, brg.a, 16.0f, 1);
            f = ckw.f(cku.d(r5), cku.c(r5), cku.b(r5), 0.4f, cku.f(bmp.a(c).s));
            bqv.c(i5, bmp.c(c).e, f, 0L, brg.a, brg.a, null, afha.b, c, 120);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new afaz(cgaVar, i, 4);
        }
    }

    public static void bL(afhe afheVar, cga cgaVar, afhp afhpVar, bwj bwjVar, int i) {
        bwj c = bwjVar.c(-276717121);
        bpq a = bpn.a(false, bkl.a, bps.c, true, c, 3072, 1);
        bwk bwkVar = (bwk) c;
        Object T = bwkVar.T();
        if (T == bwj.a.a) {
            T = new bqn();
            bwkVar.ad(T);
        }
        bqn bqnVar = (bqn) T;
        boolean G = c.G(a) | c.G(bqnVar);
        Object T2 = bwkVar.T();
        if (G || T2 == bwj.a.a) {
            T2 = new bkm(a, bqnVar);
            bwkVar.ad(T2);
        }
        akh.a(cfv.g(cgaVar, new anj()), null, cdk.e(971463701, new qjl(afhpVar, (bkm) T2, afheVar, 10), c), c, 3072, 6);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new afhf(afheVar, cgaVar, afhpVar, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object bM(defpackage.aiim r4, defpackage.afkj r5, boolean r6, defpackage.arpe r7) {
        /*
            boolean r0 = r7 instanceof defpackage.afkk
            if (r0 == 0) goto L13
            r0 = r7
            afkk r0 = (defpackage.afkk) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            afkk r0 = new afkk
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r7)
            goto L3f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.aqil.P(r7)
            java.util.List r5 = defpackage.aqjn.y(r5)
            r0.b = r3
            java.lang.Object r7 = bN(r4, r5, r6, r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            boolean r4 = r7.containsValue(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeke.bM(aiim, afkj, boolean, arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [afke, java.lang.Object] */
    public static /* synthetic */ Object bN(aiim aiimVar, List list, boolean z, arpe arpeVar) {
        if (z && bO(aiimVar, list)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(arrn.r(aqjn.i(aqjn.J(list, 10)), 16));
            for (Object obj : list) {
                linkedHashMap.put(obj, true);
            }
            return linkedHashMap;
        }
        return aiimVar.a.c("PermissionsManager#showPermissionsRequestDialog", new ikv(list, aiimVar, (arpe) null, 11), arpeVar);
    }

    public static boolean bO(aiim aiimVar, List list) {
        list.getClass();
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!aiimVar.s((afkj) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static aiwu bP(Context context, atsg atsgVar, apbt apbtVar, String str, String str2) {
        aiuz aiuzVar = new aiuz(context);
        aiuzVar.c(str);
        aiuzVar.d(str2.concat(".pb"));
        Uri a = aiuzVar.a();
        aiwl a2 = aiwm.a();
        a2.e(a);
        a2.d(apbtVar);
        return atsgVar.n(a2.a());
    }

    public static /* synthetic */ String bQ(int i) {
        if (i != 1) {
            if (i != 2) {
                return "LANDSCAPE";
            }
            return "PORTRAIT";
        }
        return "UNKNOWN";
    }

    public static /* synthetic */ String bR(int i) {
        if (i != 1) {
            if (i != 2) {
                return "POPUP_CAMERA";
            }
            return "FULLSCREEN_CAMERA";
        }
        return "MINI_CAMERA";
    }

    public static /* synthetic */ String bS(int i) {
        if (i != 1) {
            if (i != 2) {
                return "FRONT";
            }
            return "BACK";
        }
        return "UNKNOWN";
    }

    public static Duration bT(long j, int i, int i2) {
        int i3 = i * i2;
        Duration of = Duration.of((((float) j) / (i3 + i3)) * 1000000.0f, ChronoUnit.MICROS);
        of.getClass();
        return of;
    }

    public static void bU(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i) {
        byteBuffer2.getClass();
        int limit = byteBuffer2.limit();
        byteBuffer2.limit(byteBuffer2.position() + i);
        byteBuffer.put(byteBuffer2);
        byteBuffer2.limit(limit);
    }

    public static boolean bV(MediaCodec.BufferInfo bufferInfo) {
        bufferInfo.getClass();
        if ((bufferInfo.flags & 2) != 0) {
            return true;
        }
        return false;
    }

    public static MediaCodec bW(MediaFormat mediaFormat) {
        String findEncoderForFormat = new MediaCodecList(0).findEncoderForFormat(mediaFormat);
        if (findEncoderForFormat != null) {
            MediaCodec createByCodecName = MediaCodec.createByCodecName(findEncoderForFormat);
            createByCodecName.getClass();
            return createByCodecName;
        }
        throw new IOException("Unable to find audio encoder for ".concat(String.valueOf(mediaFormat.getString("mime"))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object bY(defpackage.afeg r4, defpackage.apbt r5, defpackage.arpe r6) {
        /*
            boolean r0 = r6 instanceof defpackage.afef
            if (r0 == 0) goto L13
            r0 = r6
            afef r0 = (defpackage.afef) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            afef r0 = new afef
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r4 = r0.a
            defpackage.aqil.P(r6)
            goto L4a
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.aqil.P(r6)
            afee r6 = r4.b()
            afcp r2 = r4.a(r5)
            r6.g(r2)
            r0.a = r6
            r0.d = r3
            java.lang.Object r4 = r4.f(r6, r5)
            if (r4 == r1) goto L4f
            r4 = r6
        L4a:
            afcq r4 = r4.b()
            return r4
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeke.bY(afeg, apbt, arpe):java.lang.Object");
    }

    public static void ba(arqg arqgVar, String str, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        cga b;
        long f;
        bwj bwjVar2;
        long f2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(552974201);
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
            if (true != c.G(str)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        int i7 = i2;
        if ((i7 & 731) == 146 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            c.y(-1234145671);
            int i8 = i7 & 14;
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (i8 == 4 || T == bwj.a.a) {
                T = new aeot(arqgVar, 3);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            cga c2 = adw.c(cgaVar, false, null, (arqg) T, 7);
            int i9 = cfq.a;
            cue a = akc.a(cfq.a.e, false);
            int a2 = bwg.a(c);
            byx P = bwkVar.P();
            cga b2 = cfv.b(c, c2);
            int i10 = cwl.a;
            arqg arqgVar2 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar2);
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
            akf akfVar = akf.a;
            b = amv.b(cgaVar, 1.0f);
            cga a3 = akfVar.a(b, cfq.a.e);
            cue a4 = akk.a(ajw.e, cfq.a.n, c, 54);
            int a5 = bwg.a(c);
            byx P2 = bwkVar.P();
            cga b3 = cfv.b(c, a3);
            arqg arqgVar3 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar3);
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
            cga h = amv.h(cga.e, 48.0f);
            f = ckw.f(cku.d(r5), cku.c(r5), cku.b(r5), 0.3f, cku.f(cku.a));
            cga a6 = adf.a(h, f, awh.a);
            cue a7 = akc.a(cfq.a.e, false);
            int a8 = bwg.a(c);
            byx P3 = bwkVar.P();
            cga b4 = cfv.b(c, a6);
            arqg arqgVar4 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar4);
            } else {
                c.C();
            }
            caw.b(c, a7, cwl.a.e);
            caw.b(c, P3, cwl.a.d);
            arqv arqvVar3 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a8))) {
                Integer valueOf3 = Integer.valueOf(a8);
                bwkVar.ad(valueOf3);
                c.j(valueOf3, arqvVar3);
            }
            caw.b(c, b4, cwl.a.c);
            ahji.N(bg(aerb.dK, c), null, amv.h(cga.e, 24.0f), cku.d, c, 3464, 0);
            c.p();
            c.y(425769991);
            if (str != null) {
                amx.a(amv.d(cga.e, 4.0f), c);
                dje djeVar = bmp.d(c).n;
                long j = cku.d;
                cga.a aVar = cga.e;
                f2 = ckw.f(cku.d(r6), cku.c(r6), cku.b(r6), 0.3f, cku.f(cku.a));
                bwjVar2 = c;
                ahji.e(str, amh.e(adf.a(aVar, f2, awh.d()), 8.0f, 2.0f), j, 0L, 0L, null, 0L, 0, false, 0, 0, null, djeVar, bwjVar2, ((i7 >> 3) & 14) | 384, 0, 65528);
            } else {
                bwjVar2 = c;
            }
            bwkVar.Y();
            bwjVar2.p();
            bwjVar2.p();
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new aelx(arqgVar, str, cgaVar, i, 15);
        }
    }

    public static void bb(Uri uri, String str, cga cgaVar, Uri uri2, Uri uri3, csv csvVar, Integer num, Integer num2, aerg aergVar, hts htsVar, arqg arqgVar, String str2, arqg arqgVar2, boolean z, bwj bwjVar, int i, int i2, int i3) {
        cga cgaVar2;
        cga c;
        float f;
        long f2;
        cga a;
        cga cgaVar3;
        cga b;
        cga b2;
        float f3;
        cga a2;
        bwj c2 = bwjVar.c(-1407448235);
        int i4 = cfq.a;
        cfq cfqVar = cfq.a.e;
        csv csvVar2 = csv.a.a;
        if (z) {
            cga.a aVar = cga.e;
            aVar.getClass();
            cgaVar2 = cgaVar.a(cfv.g(aVar, new aeua(6)));
        } else {
            cgaVar2 = cgaVar;
        }
        cue a3 = akc.a(cfq.a.a, false);
        int a4 = bwg.a(c2);
        bwk bwkVar = (bwk) c2;
        byx P = bwkVar.P();
        cga b3 = cfv.b(c2, cgaVar2);
        int i5 = cwl.a;
        arqg arqgVar3 = cwl.a.a;
        c2.A();
        if (bwkVar.y) {
            c2.l(arqgVar3);
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
        caw.b(c2, b3, cwl.a.c);
        akf akfVar = akf.a;
        cas b4 = zl.b((arqgVar2 != null || z) ? 40.0f : brg.a, null, c2, 384, 10);
        c = amv.c(cga.e, 1.0f);
        if (Build.VERSION.SDK_INT >= 31) {
            c2.y(-807325012);
            if (arqgVar2 != null || z) {
                cga.a aVar2 = cga.e;
                f3 = ((dqy) b4.a()).a;
                a2 = adf.a(chc.a(aVar2, f3), bmp.a(c2).v, clw.a);
                c = c.a(a2);
            }
            bwkVar.Y();
            cgaVar3 = c;
        } else {
            c2.y(-807096356);
            long j = bmp.a(c2).v;
            f = ((dqy) b4.a()).a;
            f2 = ckw.f(cku.d(j), cku.c(j), cku.b(j), f / 40.0f, cku.f(j));
            a = c.a(new cfw("com.google.android.libraries.communications.ux.components.image.foreground", new cku(f2), new aerj(f2, 0)));
            bwkVar.Y();
            cgaVar3 = a;
        }
        bf(uri, str, cgaVar3, uri2, uri3, cfqVar, csvVar, csvVar2, 1.0f, num, num2, null, null, null, aergVar, htsVar, c2, (i & 112) | 36872 | (i & 458752) | (i & 3670016) | (i & 29360128) | (i & 234881024) | (i & 1879048192), (458752 & i2) | (i2 & 14) | 134221824 | (i2 & 112) | (i2 & 896) | (i2 & 57344) | (3670016 & i2) | (i2 & 29360128), 0);
        c2.y(389631570);
        if (arqgVar2 != null) {
            b2 = amv.b(cga.e, 1.0f);
            ba(arqgVar2, str2, b2, c2, ((i3 >> 3) & 14) | 384 | ((i3 << 3) & 112));
        }
        bwkVar.Y();
        c2.y(389635728);
        if (arqgVar != null) {
            b = amv.b(cga.e, 1.0f);
            bc(arqgVar, akfVar.a(b, cfq.a.i), c2, (i2 >> 27) & 14);
        }
        bwkVar.Y();
        c2.p();
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new aerh(uri, str, cgaVar, uri2, uri3, csvVar, num, num2, aergVar, htsVar, arqgVar, str2, arqgVar2, z, i, i2, i3);
        }
    }

    public static void bc(arqg arqgVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        cga b;
        long f;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(721514269);
        if (i5 == 0) {
            if (true != c.I(arqgVar)) {
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
        if ((i2 & 91) != 18 || !c.L()) {
            b = amv.b(cgaVar, 1.0f);
            int i6 = cfq.a;
            cue a = akc.a(cfq.a.i, false);
            int a2 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b2 = cfv.b(c, b);
            int i7 = cwl.a;
            arqg arqgVar2 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar2);
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
            cga j = amh.j(amv.j(cga.e, 56.0f, 50.0f), brg.a, brg.a, 8.0f, 2.0f, 3);
            c.y(-1200397831);
            int i8 = i2 & 14;
            Object T = bwkVar.T();
            if (i8 == 4 || T == bwj.a.a) {
                T = new aeot(arqgVar, 4);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            cga c2 = adw.c(j, false, null, (arqg) T, 7);
            cue a3 = akc.a(cfq.a.e, false);
            int a4 = bwg.a(c);
            byx P2 = bwkVar.P();
            cga b3 = cfv.b(c, c2);
            arqg arqgVar3 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar3);
            } else {
                c.C();
            }
            caw.b(c, a3, cwl.a.e);
            caw.b(c, P2, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a4))) {
                Integer valueOf2 = Integer.valueOf(a4);
                bwkVar.ad(valueOf2);
                c.j(valueOf2, arqvVar2);
            }
            caw.b(c, b3, cwl.a.c);
            cga j2 = amv.j(cga.e, 32.0f, 20.0f);
            f = ckw.f(cku.d(r5), cku.c(r5), cku.b(r5), 0.3f, cku.f(cku.a));
            ahji.N(bg(aerb.dJ, c), dga.a(R.string.masked_glide_image_toggle, c), adf.a(j2, f, awh.d()), cku.d, c, 3080, 0);
            c.p();
            c.p();
        } else {
            c.v();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeqs(arqgVar, cgaVar, i, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x014f, code lost:
    
        if (r2 == bwj.a.a) goto L231;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void bd(defpackage.aerk r23, defpackage.cga r24, defpackage.hdv r25, defpackage.arqv r26, boolean r27, int r28, defpackage.bwj r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeke.bd(aerk, cga, hdv, arqv, boolean, int, bwj, int, int):void");
    }

    public static void be(boolean z, arqv arqvVar, arqv arqvVar2, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(-1533221143);
        if (i6 == 0) {
            if (true != c.H(z)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.I(arqvVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c.I(arqvVar2)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            if (z) {
                c.y(1998596059);
                arqvVar.a(c, Integer.valueOf((i2 >> 3) & 14));
            } else {
                c.y(1826966439);
                if (arqvVar2 != null) {
                    arqvVar2.a(c, Integer.valueOf((i2 >> 6) & 14));
                }
            }
            ((bwk) c).Y();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jyn(z, arqvVar, arqvVar2, i, 10);
        }
    }

    public static void bf(Uri uri, String str, cga cgaVar, Uri uri2, Uri uri3, cfq cfqVar, csv csvVar, csv csvVar2, float f, Integer num, Integer num2, Duration duration, String str2, String str3, aerg aergVar, hts htsVar, bwj bwjVar, int i, int i2, int i3) {
        cfq cfqVar2;
        csv csvVar3;
        csv csvVar4;
        csv csvVar5;
        boolean booleanValue;
        bwj bwjVar2;
        csv csvVar6;
        float f2;
        Integer num3;
        int i4 = i3 & 4;
        bwj c = bwjVar.c(1905331446);
        cga cgaVar2 = i4 != 0 ? cga.e : cgaVar;
        Uri uri4 = (i3 & 8) != 0 ? null : uri2;
        Uri uri5 = (i3 & 16) != 0 ? null : uri3;
        if ((i3 & 64) != 0) {
            int i5 = cfq.a;
            cfqVar2 = cfq.a.e;
        } else {
            cfqVar2 = cfqVar;
        }
        if ((i3 & 128) != 0) {
            int i6 = csv.a;
            csvVar3 = csv.a.b;
        } else {
            csvVar3 = csvVar;
        }
        if ((i3 & 256) != 0) {
            int i7 = csv.a;
            csvVar4 = csv.a.a;
        } else {
            csvVar4 = csvVar2;
        }
        float f3 = (i3 & 512) != 0 ? 1.0f : f;
        Integer num4 = (i3 & 2048) != 0 ? null : num;
        Integer num5 = (i3 & 4096) != 0 ? null : num2;
        Duration duration2 = (i3 & 8192) != 0 ? null : duration;
        String str4 = (32768 & i3) != 0 ? null : str2;
        String str5 = (65536 & i3) != 0 ? null : str3;
        aerg aergVar2 = (131072 & i3) != 0 ? null : aergVar;
        hts htsVar2 = (262144 & i3) != 0 ? null : htsVar;
        c.y(295190683);
        boolean G = c.G(uri5);
        bwk bwkVar = (bwk) c;
        Object T = bwkVar.T();
        if (G || T == bwj.a.a) {
            csvVar5 = csvVar4;
            byu byuVar = new byu(false, cav.a);
            bwkVar.ad(byuVar);
            T = byuVar;
        } else {
            csvVar5 = csvVar4;
        }
        int i8 = i >> 3;
        String str6 = str4;
        int i9 = i2 >> 3;
        int i10 = i & 3670016;
        Duration duration3 = duration2;
        int i11 = i & 896;
        Integer num6 = num5;
        int i12 = i & 112;
        byn bynVar = (byn) T;
        bwkVar.Y();
        int i13 = (i9 & 14) | 16777728;
        int i14 = i9 & 112;
        int i15 = i9 & 7168;
        int i16 = i9 & 57344;
        int i17 = i9 & 458752;
        int i18 = i9 & 3670016;
        int i19 = i8 & 234881024;
        int i20 = (i2 << 27) & 1879048192;
        if (!d.F(uri, Uri.EMPTY)) {
            c.y(561067072);
            aY(uri, str, cgaVar2, uri4, uri5, cfqVar2, csvVar3, f3, num4, num6, duration3, str6, str5, aergVar2, htsVar2, c, 36872 | i12 | i11 | (i & 458752) | i10 | (i & 29360128) | i19 | i20, i13 | i14 | i15 | i16 | i17 | i18, 0);
            bwkVar.Y();
            bwjVar2 = c;
            csvVar6 = csvVar3;
            f2 = f3;
            num3 = num4;
        } else {
            c.y(561704866);
            c.y(295213787);
            booleanValue = ((Boolean) bynVar.a()).booleanValue();
            if (booleanValue || uri5 == null) {
                bwjVar2 = c;
                csvVar6 = csvVar3;
                f2 = f3;
                num3 = num4;
            } else {
                ygv ygvVar = (ygv) c.g(aerd.a);
                csvVar6 = csvVar3;
                bwjVar2 = c;
                num3 = num4;
                f2 = f3;
                ((alvg) ygv.a.d().h("com/google/android/apps/messaging/shared/util/media/image/TikTokGlideImageManager", "cacheThumbnail", 28, "TikTokGlideImageManager.kt")).t("Caching thumbnail with uri: %s", uri5);
                hlp f4 = ygvVar.b.f(uri5);
                f4.v(new hxn(f4.a));
                bynVar.h(true);
            }
            bwkVar.Y();
            aY(uri5, str, cgaVar2, uri4, null, cfqVar2, csvVar5, f2, num3, num6, duration3, str6, str5, aergVar2, htsVar2, bwjVar2, i12 | 28680 | i11 | i10 | (i8 & 29360128) | i19 | i20, i15 | i13 | i14 | i16 | i17 | i18, 32);
            bwkVar.Y();
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new aerc(uri, str, cgaVar2, uri4, uri5, cfqVar2, csvVar6, csvVar5, f2, num3, num6, duration3, str6, str5, aergVar2, htsVar2, i, i2, i3);
        }
    }

    public static cor bg(aerb aerbVar, bwj bwjVar) {
        cor a;
        aerbVar.getClass();
        bwjVar.y(-304297433);
        switch (aerbVar.ordinal()) {
            case 0:
                bwjVar.y(-2045886188);
                a = dfv.a(R.drawable.gs_accessibility_new_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 1:
                bwjVar.y(-2045883183);
                a = dfv.a(R.drawable.gs_account_circle_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 2:
                bwjVar.y(-2045880139);
                a = dfv.a(R.drawable.gs_account_circle_off_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 3:
                bwjVar.y(-2045877466);
                a = dfv.a(R.drawable.gs_add_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 4:
                bwjVar.y(-2045875093);
                a = dfv.a(R.drawable.gs_add_call_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 5:
                bwjVar.y(-2045872499);
                a = dfv.a(R.drawable.gs_add_circle_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 6:
                bwjVar.y(-2045869613);
                a = dfv.a(R.drawable.gs_add_circle_fill1_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 7:
                bwjVar.y(-2045866705);
                a = dfv.a(R.drawable.gs_add_reaction_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 8:
                bwjVar.y(-2045864152);
                a = dfv.a(R.drawable.gs_alarm_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 9:
                bwjVar.y(-2045861717);
                a = dfv.a(R.drawable.gs_alarm_on_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 10:
                bwjVar.y(-2045858959);
                a = dfv.a(R.drawable.gs_alarm_on_fill1_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 11:
                bwjVar.y(-2045855981);
                a = dfv.a(R.drawable.gs_android_contacts_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 12:
                bwjVar.y(-2045852908);
                a = dfv.a(R.drawable.gs_android_satellite_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 13:
                bwjVar.y(-2045850035);
                a = dfv.a(R.drawable.gs_arrow_back_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 14:
                bwjVar.y(-2045847247);
                a = dfv.a(R.drawable.gs_arrow_downward_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 15:
                bwjVar.y(-2045844302);
                a = dfv.a(R.drawable.gs_arrow_drop_down_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 16:
                bwjVar.y(-2045841392);
                a = dfv.a(R.drawable.gs_arrow_drop_up_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 17:
                bwjVar.y(-2045838544);
                a = dfv.a(R.drawable.gs_arrow_forward_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 18:
                bwjVar.y(-2045835630);
                a = dfv.a(R.drawable.gs_arrow_right_alt_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 19:
                bwjVar.y(-2045832862);
                a = dfv.a(R.drawable.assistant_logo, bwjVar, 0);
                bwjVar.q();
                break;
            case 20:
                bwjVar.y(-2045830514);
                a = dfv.a(R.drawable.gs_attach_file_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 21:
                bwjVar.y(-2045827860);
                a = dfv.a(R.drawable.gs_autorenew_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 22:
                bwjVar.y(-2045825049);
                a = dfv.a(R.drawable.ic_avatar_anonymous, bwjVar, 0);
                bwjVar.q();
                break;
            case 23:
                bwjVar.y(-2045822612);
                a = dfv.a(R.drawable.gs_back_hand_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 24:
                bwjVar.y(-2045820152);
                a = dfv.a(R.drawable.gs_block_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 25:
                bwjVar.y(-2045817586);
                a = dfv.a(R.drawable.gs_block_fill1_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 26:
                bwjVar.y(-2045814998);
                a = dfv.a(R.drawable.gs_blur_on_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 27:
                bwjVar.y(-2045812501);
                a = dfv.a(R.drawable.gs_bookmark_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 28:
                bwjVar.y(-2045809808);
                a = dfv.a(R.drawable.gs_bottom_sheets_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                bwjVar.y(-2045806993);
                a = dfv.a(R.drawable.gs_brightness_2_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 30:
                bwjVar.y(-2045804209);
                a = dfv.a(R.drawable.gs_brightness_4_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 31:
                bwjVar.y(-2045801425);
                a = dfv.a(R.drawable.gs_brightness_5_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 32:
                bwjVar.y(-2045798641);
                a = dfv.a(R.drawable.gs_brightness_6_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                bwjVar.y(-2045795890);
                a = dfv.a(R.drawable.gs_buttons_alt_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                bwjVar.y(-2045793401);
                a = dfv.a(R.drawable.gs_cake_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                bwjVar.y(-2045790862);
                a = dfv.a(R.drawable.gs_calendar_add_on_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                bwjVar.y(-2045787919);
                a = dfv.a(R.drawable.gs_calendar_month_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                bwjVar.y(-2045785007);
                a = dfv.a(R.drawable.gs_calendar_today_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                bwjVar.y(-2045782425);
                a = dfv.a(R.drawable.gs_call_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 39:
                bwjVar.y(-2045780021);
                a = dfv.a(R.drawable.gs_call_end_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                bwjVar.y(-2045777395);
                a = dfv.a(R.drawable.gs_call_fill1_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                bwjVar.y(-2045774739);
                a = dfv.a(R.drawable.gs_call_merge_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                bwjVar.y(-2045771890);
                a = dfv.a(R.drawable.ic_top_app_bar_call_dialer, bwjVar, 0);
                bwjVar.q();
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                bwjVar.y(-2045769335);
                a = dfv.a(R.drawable.gs_cancel_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                bwjVar.y(-2045766705);
                a = dfv.a(R.drawable.gs_cancel_fill1_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                bwjVar.y(-2045763537);
                a = dfv.a(R.drawable.ic_cancel_filled_no_padding, bwjVar, 0);
                bwjVar.q();
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                bwjVar.y(-2045761017);
                a = dfv.a(R.drawable.gs_chat_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                bwjVar.y(-2045758514);
                a = dfv.a(R.drawable.gs_chat_bubble_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 48:
                bwjVar.y(-2045755794);
                a = dfv.a(R.drawable.gs_chat_mirror_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 49:
                bwjVar.y(-2045753272);
                a = dfv.a(R.drawable.gs_check_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 50:
                bwjVar.y(-2045750705);
                a = dfv.a(R.drawable.gs_check_circle_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 51:
                bwjVar.y(-2045747691);
                a = dfv.a(R.drawable.gs_check_circle_fill1_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 52:
                bwjVar.y(-2045744721);
                a = dfv.a(R.drawable.gs_chevron_left_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 53:
                bwjVar.y(-2045741904);
                a = dfv.a(R.drawable.gs_chevron_right_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 54:
                bwjVar.y(-2045739320);
                a = dfv.a(R.drawable.gs_close_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 55:
                bwjVar.y(-2045736621);
                a = dfv.a(R.drawable.gs_close_fullscreen_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 56:
                bwjVar.y(-2045733812);
                a = dfv.a(R.drawable.gs_cloud_off_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 57:
                bwjVar.y(-2045730935);
                a = dfv.a(R.drawable.ic_compose_add_legacy, bwjVar, 0);
                bwjVar.q();
                break;
            case 58:
                bwjVar.y(-2045727662);
                a = dfv.a(R.drawable.ic_compose_add_legacy_selected, bwjVar, 0);
                bwjVar.q();
                break;
            case 59:
                bwjVar.y(-2045724764);
                a = dfv.a(R.drawable.ic_compose_emoji, bwjVar, 0);
                bwjVar.q();
                break;
            case 60:
                bwjVar.y(-2045722003);
                a = dfv.a(R.drawable.ic_compose_emoji_selected, bwjVar, 0);
                bwjVar.q();
                break;
            case 61:
                bwjVar.y(-2045719194);
                a = dfv.a(R.drawable.ic_compose_gallery, bwjVar, 0);
                bwjVar.q();
                break;
            case 62:
                bwjVar.y(-2045716371);
                a = dfv.a(R.drawable.ic_compose_gallery_legacy, bwjVar, 0);
                bwjVar.q();
                break;
            case 63:
                bwjVar.y(-2045712842);
                a = dfv.a(R.drawable.ic_compose_gallery_legacy_selected, bwjVar, 0);
                bwjVar.q();
                break;
            case 64:
                bwjVar.y(-2045709457);
                a = dfv.a(R.drawable.ic_compose_gallery_selected, bwjVar, 0);
                bwjVar.q();
                break;
            case 65:
                bwjVar.y(-2045706388);
                a = dfv.a(R.drawable.ic_compose_magic_compose, bwjVar, 0);
                bwjVar.q();
                break;
            case 66:
                bwjVar.y(-2045702923);
                a = dfv.a(R.drawable.ic_compose_magic_compose_selected, bwjVar, 0);
                bwjVar.q();
                break;
            case 67:
                bwjVar.y(-2045699998);
                a = dfv.a(R.drawable.ic_compose_sim, bwjVar, 0);
                bwjVar.q();
                break;
            case 68:
                bwjVar.y(-2045697431);
                a = dfv.a(R.drawable.ic_compose_sim_filled, bwjVar, 0);
                bwjVar.q();
                break;
            case 69:
                bwjVar.y(-2045694581);
                a = dfv.a(R.drawable.ic_compose_voice_filled, bwjVar, 0);
                bwjVar.q();
                break;
            case 70:
                bwjVar.y(-2045692053);
                a = dfv.a(R.drawable.gs_contacts_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 71:
                bwjVar.y(-2045689261);
                a = dfv.a(R.drawable.gs_contacts_product_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 72:
                bwjVar.y(-2045686353);
                a = dfv.a(R.drawable.gs_content_copy_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 73:
                bwjVar.y(-2045683833);
                a = dfv.a(R.drawable.gs_crop_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 74:
                bwjVar.y(-2045681495);
                a = dfv.a(R.drawable.gs_delete_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 75:
                bwjVar.y(-2045678930);
                a = dfv.a(R.drawable.gs_description_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 76:
                bwjVar.y(-2045676342);
                a = dfv.a(R.drawable.gs_devices_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 77:
                bwjVar.y(-2045673878);
                a = dfv.a(R.drawable.gs_dialpad_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 78:
                bwjVar.y(-2045671414);
                a = dfv.a(R.drawable.gs_dogfood_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 79:
                bwjVar.y(-2045668983);
                a = dfv.a(R.drawable.gs_domain_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 80:
                bwjVar.y(-2045666517);
                a = dfv.a(R.drawable.gs_download_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 81:
                bwjVar.y(-2045663890);
                a = dfv.a(R.drawable.gs_downloading_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 82:
                bwjVar.y(-2045661368);
                a = dfv.a(R.drawable.gs_draft_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 83:
                bwjVar.y(-2045658900);
                a = dfv.a(R.drawable.gs_drive_pdf_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 84:
                bwjVar.y(-2045656011);
                a = dfv.a(R.drawable.gs_drive_presentation_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 85:
                bwjVar.y(-2045652876);
                a = dfv.a(R.drawable.gs_drive_spreadsheet_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 86:
                bwjVar.y(-2045650036);
                a = dfv.a(R.drawable.gs_drive_zip_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 87:
                bwjVar.y(-2045647609);
                a = dfv.a(R.drawable.gs_edit_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 88:
                bwjVar.y(-2045645172);
                a = dfv.a(R.drawable.gs_emergency_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 89:
                bwjVar.y(-2045642316);
                a = dfv.a(R.drawable.gs_encryption_shield_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 90:
                bwjVar.y(-2045639608);
                a = dfv.a(R.drawable.gs_error_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 91:
                bwjVar.y(-2045637042);
                a = dfv.a(R.drawable.gs_error_fill1_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 92:
                bwjVar.y(-2045634520);
                a = dfv.a(R.drawable.gs_event_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 93:
                bwjVar.y(-2045631986);
                a = dfv.a(R.drawable.gs_expand_less_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 94:
                bwjVar.y(-2045629266);
                a = dfv.a(R.drawable.gs_expand_more_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 95:
                bwjVar.y(-2045626579);
                a = dfv.a(R.drawable.gs_experiment_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 96:
                bwjVar.y(-2045623956);
                a = dfv.a(R.drawable.gs_extension_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 97:
                bwjVar.y(-2045621331);
                a = dfv.a(R.drawable.gs_fact_check_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 98:
                bwjVar.y(-2045618741);
                a = dfv.a(R.drawable.gs_favorite_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 99:
                bwjVar.y(-2045616081);
                a = dfv.a(R.drawable.gs_find_in_page_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case VCardConstants.DEFAULT_PREF /* 100 */:
                bwjVar.y(-2045613330);
                a = dfv.a(R.drawable.gs_folder_copy_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 101:
                bwjVar.y(-2045610610);
                a = dfv.a(R.drawable.gs_format_size_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 102:
                bwjVar.y(-2045608022);
                a = dfv.a(R.drawable.gs_forward_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 103:
                bwjVar.y(-2045605459);
                a = dfv.a(R.drawable.gs_fullscreen_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 104:
                bwjVar.y(-2045602752);
                a = dfv.a(R.drawable.gemini_spark, bwjVar, 0);
                bwjVar.q();
                break;
            case 105:
                bwjVar.y(-2045600217);
                a = dfv.a(R.drawable.gemini_spark_filled, bwjVar, 0);
                bwjVar.q();
                break;
            case 106:
                bwjVar.y(-2045597879);
                a = dfv.a(R.drawable.gs_google_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 107:
                bwjVar.y(-2045595380);
                a = dfv.a(R.drawable.gs_gpp_maybe_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 108:
                bwjVar.y(-2045592558);
                a = dfv.a(R.drawable.gs_gpp_maybe_fill1_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 109:
                bwjVar.y(-2045589912);
                a = dfv.a(R.drawable.gs_group_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 110:
                bwjVar.y(-2045587543);
                a = dfv.a(R.drawable.gs_groups_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 111:
                bwjVar.y(-2045585044);
                a = dfv.a(R.drawable.gs_group_add_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 112:
                bwjVar.y(-2045582222);
                a = dfv.a(R.drawable.gs_group_add_fill1_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 113:
                bwjVar.y(-2045579444);
                a = dfv.a(R.drawable.gs_group_off_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 114:
                bwjVar.y(-2045576913);
                a = dfv.a(R.drawable.gs_gshield_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 115:
                bwjVar.y(-2045574261);
                a = dfv.a(R.drawable.gs_handyman_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 116:
                bwjVar.y(-2045571865);
                a = dfv.a(R.drawable.gs_help_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 117:
                bwjVar.y(-2045569593);
                a = dfv.a(R.drawable.gs_hide_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 118:
                bwjVar.y(-2045567123);
                a = dfv.a(R.drawable.gs_hide_image_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 119:
                bwjVar.y(-2045564566);
                a = dfv.a(R.drawable.gs_history_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 120:
                bwjVar.y(-2045562168);
                a = dfv.a(R.drawable.gs_image_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 121:
                bwjVar.y(-2045559865);
                a = dfv.a(R.drawable.gs_info_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 122:
                bwjVar.y(-2045557363);
                a = dfv.a(R.drawable.gs_info_fill1_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 123:
                bwjVar.y(-2045554707);
                a = dfv.a(R.drawable.gs_info_spark_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 124:
                bwjVar.y(-2045552018);
                a = dfv.a(R.drawable.gs_inventory_2_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 125:
                bwjVar.y(-2045549034);
                a = dfv.a(R.drawable.gs_keyboard_arrow_down_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 126:
                bwjVar.y(-2045545868);
                a = dfv.a(R.drawable.gs_keyboard_arrow_up_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 127:
                bwjVar.y(-2045543061);
                a = dfv.a(R.drawable.gs_language_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 128:
                bwjVar.y(-2045540665);
                a = dfv.a(R.drawable.gs_link_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 129:
                bwjVar.y(-2045538393);
                a = dfv.a(R.drawable.gs_list_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 130:
                bwjVar.y(-2045535989);
                a = dfv.a(R.drawable.gs_list_alt_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 131:
                bwjVar.y(-2045533296);
                a = dfv.a(R.drawable.gs_location_chip_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 132:
                bwjVar.y(-2045530514);
                a = dfv.a(R.drawable.gs_location_on_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 133:
                bwjVar.y(-2045528025);
                a = dfv.a(R.drawable.gs_lock_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 134:
                bwjVar.y(-2045525552);
                a = dfv.a(R.drawable.gs_no_encryption_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 135:
                bwjVar.y(-2045522836);
                a = dfv.a(R.drawable.gs_lock_open_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 136:
                bwjVar.y(-2045520343);
                a = dfv.a(R.drawable.gs_logout_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 137:
                bwjVar.y(-2045517515);
                a = dfv.a(R.drawable.gs_magic_button_fill1_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 138:
                bwjVar.y(-2045514689);
                a = dfv.a(R.drawable.ic_messages, bwjVar, 0);
                bwjVar.q();
                break;
            case 139:
                bwjVar.y(-2045512347);
                a = dfv.a(R.drawable.ic_messages_spark, bwjVar, 0);
                bwjVar.q();
                break;
            case 140:
                bwjVar.y(-2045509588);
                a = dfv.a(R.drawable.ic_messages_spark_filled, bwjVar, 0);
                bwjVar.q();
                break;
            case 141:
                bwjVar.y(-2045507194);
                a = dfv.a(R.drawable.gs_mic_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 142:
                bwjVar.y(-2045504756);
                a = dfv.a(R.drawable.gs_mic_fill1_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 143:
                bwjVar.y(-2045502230);
                a = dfv.a(R.drawable.gs_mic_off_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 144:
                bwjVar.y(-2045499898);
                a = dfv.a(R.drawable.gs_mms_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 145:
                bwjVar.y(-2045497459);
                a = dfv.a(R.drawable.gs_mode_night_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 146:
                bwjVar.y(-2045495001);
                a = dfv.a(R.drawable.gs_mood_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 147:
                bwjVar.y(-2045492499);
                a = dfv.a(R.drawable.gs_mood_fill1_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 148:
                bwjVar.y(-2045489683);
                a = dfv.a(R.drawable.gs_more_horiz_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 149:
                bwjVar.y(-2045487060);
                a = dfv.a(R.drawable.gs_more_time_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 150:
                bwjVar.y(-2045484340);
                a = dfv.a(R.drawable.gs_more_vert_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 151:
                bwjVar.y(-2045481880);
                a = dfv.a(R.drawable.gs_movie_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 152:
                bwjVar.y(-2045479116);
                a = dfv.a(R.drawable.gs_my_location_fill1_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 153:
                bwjVar.y(-2045476144);
                a = dfv.a(R.drawable.gs_notifications_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 154:
                bwjVar.y(-2045473362);
                a = dfv.a(R.drawable.gs_no_accounts_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 155:
                bwjVar.y(-2045470609);
                a = dfv.a(R.drawable.gs_open_in_full_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 156:
                bwjVar.y(-2045467990);
                a = dfv.a(R.drawable.gs_palette_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 157:
                bwjVar.y(-2045465196);
                a = dfv.a(R.drawable.gs_partly_cloudy_day_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 158:
                bwjVar.y(-2045462488);
                a = dfv.a(R.drawable.gs_pause_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 159:
                bwjVar.y(-2045459921);
                a = dfv.a(R.drawable.gs_pause_circle_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 160:
                bwjVar.y(-2045456907);
                a = dfv.a(R.drawable.gs_pause_circle_fill1_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 161:
                bwjVar.y(-2045454102);
                a = dfv.a(R.drawable.gs_pending_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 162:
                bwjVar.y(-2045451572);
                a = dfv.a(R.drawable.gs_pen_spark_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 163:
                bwjVar.y(-2045448750);
                a = dfv.a(R.drawable.gs_pen_spark_fill1_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 164:
                bwjVar.y(-2045446071);
                a = dfv.a(R.drawable.gs_people_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 165:
                bwjVar.y(-2045443671);
                a = dfv.a(R.drawable.gs_person_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 166:
                bwjVar.y(-2045441139);
                a = dfv.a(R.drawable.gs_person_add_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 167:
                bwjVar.y(-2045438253);
                a = dfv.a(R.drawable.gs_person_add_fill1_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 168:
                bwjVar.y(-2045435313);
                a = dfv.a(R.drawable.gs_person_fill1_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 169:
                bwjVar.y(-2045432595);
                a = dfv.a(R.drawable.gs_person_off_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 170:
                bwjVar.y(-2045429906);
                a = dfv.a(R.drawable.comms_ic_phone_spark_vd_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 171:
                bwjVar.y(-2045427384);
                a = dfv.a(R.drawable.gs_photo_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 172:
                bwjVar.y(-2045424817);
                a = dfv.a(R.drawable.gs_photo_camera_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 173:
                bwjVar.y(-2045422165);
                a = dfv.a(R.drawable.gs_pin_drop_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 174:
                bwjVar.y(-2045419571);
                a = dfv.a(R.drawable.gs_play_arrow_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 175:
                bwjVar.y(-2045416685);
                a = dfv.a(R.drawable.gs_play_arrow_fill1_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 176:
                bwjVar.y(-2045413810);
                a = dfv.a(R.drawable.gs_play_circle_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 177:
                bwjVar.y(-2045410860);
                a = dfv.a(R.drawable.gs_play_circle_fill1_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 178:
                bwjVar.y(-2045408119);
                a = dfv.a(R.drawable.gs_public_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 179:
                bwjVar.y(-2045405686);
                a = dfv.a(R.drawable.gs_refresh_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 180:
                bwjVar.y(-2045403288);
                a = dfv.a(R.drawable.gs_reply_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 181:
                bwjVar.y(-2045400919);
                a = dfv.a(R.drawable.gs_report_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 182:
                bwjVar.y(-2045398289);
                a = dfv.a(R.drawable.gs_report_fill1_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 183:
                bwjVar.y(-2045395571);
                a = dfv.a(R.drawable.gs_restaurant_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 184:
                bwjVar.y(-2045393146);
                a = dfv.a(R.drawable.gs_rtt_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 185:
                bwjVar.y(-2045390608);
                a = dfv.a(R.drawable.gs_satellite_alt_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 186:
                bwjVar.y(-2045388057);
                a = dfv.a(R.drawable.gs_save_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 187:
                bwjVar.y(-2045385422);
                a = dfv.a(R.drawable.gs_screen_rotation_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 188:
                bwjVar.y(-2045382743);
                a = dfv.a(R.drawable.gs_search_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 189:
                bwjVar.y(-2045380211);
                a = dfv.a(R.drawable.gs_select_all_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 190:
                bwjVar.y(-2045377567);
                a = dfv.a(R.drawable.ic_selfie_gif, bwjVar, 0);
                bwjVar.q();
                break;
            case 191:
                bwjVar.y(-2045375473);
                a = dfv.a(R.drawable.ic_compose_send_no_modifier, bwjVar, 0);
                bwjVar.q();
                break;
            case 192:
                bwjVar.y(-2045372627);
                a = dfv.a(R.drawable.ic_compose_send_encrypted, bwjVar, 0);
                bwjVar.q();
                break;
            case 193:
                bwjVar.y(-2045369843);
                a = dfv.a(R.drawable.ic_compose_send_scheduled, bwjVar, 0);
                bwjVar.q();
                break;
            case 194:
                bwjVar.y(-2045367191);
                a = dfv.a(R.drawable.ic_compose_send_spark, bwjVar, 0);
                bwjVar.q();
                break;
            case 195:
                bwjVar.y(-2045364137);
                a = dfv.a(R.drawable.gs_sentiment_frustrated_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 196:
                bwjVar.y(-2045361072);
                a = dfv.a(R.drawable.gs_sentiment_sad_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 197:
                bwjVar.y(-2045358389);
                a = dfv.a(R.drawable.gs_settings_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 198:
                bwjVar.y(-2045355240);
                a = dfv.a(R.drawable.gs_settings_photo_camera_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 199:
                bwjVar.y(-2045351793);
                a = dfv.a(R.drawable.ic_settings_photo_camera_v2, bwjVar, 0);
                bwjVar.q();
                break;
            case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
                bwjVar.y(-2045349240);
                a = dfv.a(R.drawable.gs_share_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                bwjVar.y(-2045346640);
                a = dfv.a(R.drawable.gs_shield_locked_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                bwjVar.y(-2045343957);
                a = dfv.a(R.drawable.gs_sim_card_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
                bwjVar.y(-2045341594);
                a = dfv.a(R.drawable.gs_sms_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 204:
                bwjVar.y(-2045339155);
                a = dfv.a(R.drawable.gs_sms_failed_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 205:
                bwjVar.y(-2045336400);
                a = dfv.a(R.drawable.gs_sort_by_alpha_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 206:
                bwjVar.y(-2045333882);
                a = dfv.a(R.drawable.gs_sos_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 207:
                bwjVar.y(-2045331608);
                a = dfv.a(R.drawable.gs_spark_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 208:
                bwjVar.y(-2045328954);
                a = dfv.a(R.drawable.ic_sparkle_gallery, bwjVar, 0);
                bwjVar.q();
                break;
            case 209:
                bwjVar.y(-2045326383);
                a = dfv.a(R.drawable.gs_speech_to_text_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 210:
                bwjVar.y(-2045323801);
                a = dfv.a(R.drawable.gs_star_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 211:
                bwjVar.y(-2045321299);
                a = dfv.a(R.drawable.gs_star_fill1_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 212:
                bwjVar.y(-2045318457);
                a = dfv.a(R.drawable.ic_status_delivered, bwjVar, 0);
                bwjVar.q();
                break;
            case 213:
                bwjVar.y(-2045315966);
                a = dfv.a(R.drawable.ic_status_dots, bwjVar, 0);
                bwjVar.q();
                break;
            case 214:
                bwjVar.y(-2045313366);
                a = dfv.a(R.drawable.ic_status_double_check, bwjVar, 0);
                bwjVar.q();
                break;
            case 215:
                bwjVar.y(-2045310716);
                a = dfv.a(R.drawable.ic_status_gemini, bwjVar, 0);
                bwjVar.q();
                break;
            case 216:
                bwjVar.y(-2045308318);
                a = dfv.a(R.drawable.ic_status_read, bwjVar, 0);
                bwjVar.q();
                break;
            case 217:
                bwjVar.y(-2045305883);
                a = dfv.a(R.drawable.ic_status_sending, bwjVar, 0);
                bwjVar.q();
                break;
            case 218:
                bwjVar.y(-2045303454);
                a = dfv.a(R.drawable.ic_status_sent, bwjVar, 0);
                bwjVar.q();
                break;
            case 219:
                bwjVar.y(-2045300854);
                a = dfv.a(R.drawable.ic_status_single_check, bwjVar, 0);
                bwjVar.q();
                break;
            case 220:
                bwjVar.y(-2045298324);
                a = dfv.a(R.drawable.gs_subtitles_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 221:
                bwjVar.y(-2045295864);
                a = dfv.a(R.drawable.gs_sunny_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 222:
                bwjVar.y(-2045293264);
                a = dfv.a(R.drawable.gs_support_agent_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 223:
                bwjVar.y(-2045290515);
                a = dfv.a(R.drawable.gs_swap_calls_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 224:
                bwjVar.y(-2045287699);
                a = dfv.a(R.drawable.gs_swap_horiz_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 225:
                bwjVar.y(-2045285208);
                a = dfv.a(R.drawable.gs_swipe_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 226:
                bwjVar.y(-2045282575);
                a = dfv.a(R.drawable.gs_switch_account_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 227:
                bwjVar.y(-2045279795);
                a = dfv.a(R.drawable.gs_thumb_down_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 228:
                bwjVar.y(-2045277205);
                a = dfv.a(R.drawable.gs_thumb_up_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 229:
                bwjVar.y(-2045274776);
                a = dfv.a(R.drawable.gs_title_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 230:
                bwjVar.y(-2045272308);
                a = dfv.a(R.drawable.gs_toggle_on_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 231:
                bwjVar.y(-2045269650);
                a = dfv.a(R.drawable.gs_trending_up_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 232:
                bwjVar.y(-2045266843);
                a = dfv.a(R.drawable.ic_verified_badge, bwjVar, 0);
                bwjVar.q();
                break;
            case 233:
                bwjVar.y(-2045264336);
                a = dfv.a(R.drawable.gs_verified_user_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 234:
                bwjVar.y(-2045261066);
                a = dfv.a(R.drawable.gs_verified_user_fill1_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 235:
                bwjVar.y(-2045257576);
                a = dfv.a(R.drawable.gs_vertical_align_bottom_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 236:
                bwjVar.y(-2045254024);
                a = dfv.a(R.drawable.gs_vertical_align_center_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 237:
                bwjVar.y(-2045250763);
                a = dfv.a(R.drawable.gs_vertical_align_top_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 238:
                bwjVar.y(-2045247916);
                a = dfv.a(R.drawable.comms_gm_ic_videocam_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 239:
                bwjVar.y(-2045244879);
                a = dfv.a(R.drawable.gs_videocam_fill1_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 240:
                bwjVar.y(-2045242033);
                a = dfv.a(R.drawable.gs_videocam_off_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 241:
                bwjVar.y(-2045238916);
                a = dfv.a(R.drawable.comms_gm_ic_videocam_one_way_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 242:
                bwjVar.y(-2045235696);
                a = dfv.a(R.drawable.gs_view_carousel_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 243:
                bwjVar.y(-2045232947);
                a = dfv.a(R.drawable.gs_visibility_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 244:
                bwjVar.y(-2045230159);
                a = dfv.a(R.drawable.gs_visibility_off_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 245:
                bwjVar.y(-2045227412);
                a = dfv.a(R.drawable.gs_voicemail_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 246:
                bwjVar.y(-2045224787);
                a = dfv.a(R.drawable.gs_volume_off_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 247:
                bwjVar.y(-2045222164);
                a = dfv.a(R.drawable.gs_volume_up_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 248:
                bwjVar.y(-2045219275);
                a = dfv.a(R.drawable.gs_volunteer_activism_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 249:
                bwjVar.y(-2045216470);
                a = dfv.a(R.drawable.gs_warning_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 250:
                bwjVar.y(-2045213862);
                a = dfv.a(R.drawable.gs_signal_wifi_4_bar_fill1_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            case 251:
                bwjVar.y(-2045210869);
                a = dfv.a(R.drawable.gs_wifi_off_vd_theme_24, bwjVar, 0);
                bwjVar.q();
                break;
            default:
                bwjVar.y(-2045867731);
                bwjVar.q();
                throw new armm();
        }
        bwjVar.q();
        return a;
    }

    public static cga bh(cga cgaVar, drk drkVar) {
        cgaVar.getClass();
        drkVar.getClass();
        if (drkVar == drk.b) {
            return cgaVar.a(cld.b(cga.e, -1.0f, brg.a, brg.a, brg.a, brg.a, brg.a, brg.a, null, false, 0, 131070));
        }
        return cgaVar;
    }

    public static aeqy bi(float f, int i) {
        float f2 = ((-4.0f) + f) / 3.0f;
        float f3 = (f - f2) - 2.0f;
        if (i == 3) {
            f = f3;
        }
        return new aeqy(f2, f3, f);
    }

    public static void bj(aeqm aeqmVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        bwk bwkVar;
        cga cgaVar2;
        int i3;
        int i4 = i & 14;
        bwj c2 = bwjVar.c(1081593243);
        if (i4 == 0) {
            if (true != c2.G(aeqmVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i5 = i2 | 48;
        if ((i5 & 91) == 18 && c2.L()) {
            c2.v();
            cgaVar2 = cgaVar;
        } else {
            List list = aeqmVar.b;
            cga.a aVar = cga.e;
            if (!list.isEmpty()) {
                c = amv.c(aVar, 1.0f);
                ajw.e eVar = ajw.c;
                int i6 = cfq.a;
                cue a = akk.a(eVar, cfq.a.m, c2, 0);
                int a2 = bwg.a(c2);
                bwk bwkVar2 = (bwk) c2;
                byx P = bwkVar2.P();
                cga b = cfv.b(c2, c);
                int i7 = cwl.a;
                arqg arqgVar = cwl.a.a;
                c2.A();
                if (bwkVar2.y) {
                    c2.l(arqgVar);
                } else {
                    c2.C();
                }
                caw.b(c2, a, cwl.a.e);
                caw.b(c2, P, cwl.a.d);
                arqv arqvVar = cwl.a.f;
                if (bwkVar2.y || !d.F(bwkVar2.T(), Integer.valueOf(a2))) {
                    Integer valueOf = Integer.valueOf(a2);
                    bwkVar2.ad(valueOf);
                    c2.j(valueOf, arqvVar);
                }
                caw.b(c2, b, cwl.a.c);
                ahji.e(aeqmVar.a, amh.j(cga.e, 16.0f, 16.0f, brg.a, brg.a, 12), bmp.a(c2).q, 0L, 0L, null, 0L, 0, false, 0, 0, null, bmp.d(c2).m, c2, 48, 0, 65528);
                cga j = amh.j(cga.e, brg.a, 16.0f, brg.a, brg.a, 13);
                ajw.d dVar = new ajw.d(8.0f, true, ajx.a);
                amj g = amh.g(8.0f, brg.a, 2);
                c2.y(-259311628);
                int i8 = i5 & 14;
                Object T = bwkVar2.T();
                if (i8 != 4 && T != bwj.a.a) {
                    bwkVar = bwkVar2;
                } else {
                    T = new aeql(aeqmVar, 2);
                    bwkVar = bwkVar2;
                    bwkVar.ad(T);
                }
                bwkVar.Y();
                anp.b(j, null, g, dVar, null, null, false, (arqr) T, c2, 24966, 234);
                c2.p();
                cgaVar2 = aVar;
            } else {
                bzz e = c2.e();
                if (e != null) {
                    ((bzf) e).d = new aeol(aeqmVar, aVar, i, 19);
                    return;
                }
                return;
            }
        }
        bzz e2 = c2.e();
        if (e2 != null) {
            ((bzf) e2).d = new aeol(aeqmVar, cgaVar2, i, 20);
        }
    }

    public static void bk(aeqn aeqnVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        cga cgaVar2;
        int i3;
        aeqnVar.getClass();
        int i4 = i & 14;
        bwj c = bwjVar.c(-1919041619);
        if (i4 == 0) {
            if (true != c.G(aeqnVar)) {
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
            int i5 = cfq.a;
            cue a = akc.a(cfq.a.a, false);
            int a2 = bwg.a(c);
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
            caw.b(c, a, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b, cwl.a.c);
            akf akfVar = akf.a;
            long j = cku.g;
            bqv.d(aeqnVar.c, null, false, bmp.c(c).a, j, 0L, brg.a, null, null, cdk.e(898431806, new aeqh(aeqnVar, 3), c), c, 998);
            aehx aehxVar = aeqnVar.d;
            c.y(1222142825);
            if (aehxVar != null) {
                Y(akfVar, new aemf(aehxVar), null, null, c, 6, 6);
            }
            bwkVar.Y();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeol(aeqnVar, cgaVar2, i, 18);
        }
    }

    public static EditText bl(aflb aflbVar) {
        if (aflbVar instanceof afys) {
            afll m = ((afys) aflbVar).m();
            if (m == null) {
                return null;
            }
            return bl(m);
        }
        if (aflbVar instanceof aflf) {
            return ((aflf) aflbVar).b;
        }
        if (!(aflbVar instanceof afld)) {
            return null;
        }
        return ((afld) aflbVar).a;
    }

    public static void bm(artf artfVar, afkt afktVar, Map map) {
        map.put(armd.d(artfVar), afktVar);
    }

    public static String bn(Uri uri) {
        String str;
        uri.getClass();
        String scheme = uri.getScheme();
        String authority = uri.getAuthority();
        String path = uri.getPath();
        if (path != null) {
            str = cn(path);
        } else {
            str = null;
        }
        return scheme + "://" + authority + "/redacted-" + str;
    }

    public static String bo(String str) {
        return "redacted-".concat(cn(str));
    }

    public static void bp(Consumer consumer, Object obj) {
        consumer.q(obj);
    }

    public static Size bq(Size size, int i) {
        if (i % 180 != 0) {
            return new Size(size.getHeight(), size.getWidth());
        }
        return size;
    }

    public static boolean br(Size size) {
        if (size.getWidth() > 0 && size.getHeight() > 0) {
            return true;
        }
        return false;
    }

    public static String bs(Instant instant) {
        Locale.Category category;
        Locale locale;
        DateFormat instanceForSkeleton;
        Calendar calendar;
        TimeZone timeZone;
        String format;
        LocalDateTime L = instant.atZone(ZoneId.systemDefault()).L();
        L.getClass();
        category = Locale.Category.FORMAT;
        locale = Locale.getDefault(category);
        Date date = aoru.a;
        locale.getClass();
        instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMEdjm", locale);
        long epochSecond = L.toEpochSecond(ZoneOffset.UTC) * 1000;
        long j = L.get(ChronoField.MILLI_OF_SECOND);
        calendar = instanceForSkeleton.getCalendar();
        if (d$$ExternalSyntheticApiModelOutline0.m334m((Object) calendar)) {
            d$$ExternalSyntheticApiModelOutline0.m((Object) calendar).setGregorianChange(aoru.a);
        }
        calendar.setTimeInMillis(epochSecond + j);
        timeZone = TimeZone.GMT_ZONE;
        instanceForSkeleton.setTimeZone(timeZone);
        format = instanceForSkeleton.format(calendar);
        format.getClass();
        return format;
    }

    public static Integer bt(Cursor cursor, String str) {
        Integer valueOf = Integer.valueOf(cursor.getColumnIndex(str));
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        return Integer.valueOf(cursor.getInt(valueOf.intValue()));
    }

    public static Long bu(Cursor cursor, String str) {
        Integer valueOf = Integer.valueOf(cursor.getColumnIndex(str));
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        return Long.valueOf(cursor.getLong(valueOf.intValue()));
    }

    public static String bv(Cursor cursor, String str) {
        Integer valueOf = Integer.valueOf(cursor.getColumnIndex(str));
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        return cursor.getString(valueOf.intValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (r8 != r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object bw(defpackage.afjy r6, int r7, defpackage.arpe r8) {
        /*
            boolean r0 = r8 instanceof defpackage.afkb
            if (r0 == 0) goto L13
            r0 = r8
            afkb r0 = (defpackage.afkb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            afkb r0 = new afkb
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r6 = r0.a
            defpackage.aqil.P(r8)
            goto L55
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.a
            afjy r6 = (defpackage.afjy) r6
            defpackage.aqil.P(r8)
            goto L49
        L3c:
            defpackage.aqil.P(r8)
            r0.a = r6
            r0.c = r4
            java.lang.Object r8 = r6.a(r7, r0)
            if (r8 == r1) goto L5b
        L49:
            r0.a = r8
            r0.c = r3
            ascc r6 = r6.g
            if (r6 != r1) goto L52
            goto L5b
        L52:
            r5 = r8
            r8 = r6
            r6 = r5
        L55:
            armo r7 = new armo
            r7.<init>(r6, r8)
            return r7
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeke.bw(afjy, int, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object bx(defpackage.afjy r4, int r5, defpackage.arpe r6) {
        /*
            boolean r0 = r6 instanceof defpackage.afkc
            if (r0 == 0) goto L13
            r0 = r6
            afkc r0 = (defpackage.afkc) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            afkc r0 = new afkc
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            afjy r4 = r0.c
            defpackage.aqil.P(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.aqil.P(r6)
            r0.c = r4
            r0.b = r3
            java.lang.Object r6 = r4.a(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            ascc r5 = r4.b()
            armt r0 = new armt
            ascc r4 = r4.i
            r0.<init>(r6, r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeke.bx(afjy, int, arpe):java.lang.Object");
    }

    public static void by(artf artfVar, afjh afjhVar, Map map) {
        map.put(artfVar, afjhVar);
    }

    public static adwq bz(Map map) {
        return new adwq(aqjn.r(map), null);
    }

    public static void c(long j, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1699371756);
        if (i4 == 0) {
            if (true != c.F(j)) {
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
            h(null, 0, 0, cdk.e(-534438332, new aerj(j, 1), c), c, 3072, 7);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeut(j, i, 1);
        }
    }

    public static /* synthetic */ String ca(int i) {
        if (i != 1) {
            switch (i) {
                case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                    return "UNKNOWN_SOURCE";
                case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                    return "EXTERNAL_SOURCE";
                case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
                    return "REMOTE_SOURCE";
                default:
                    return "null";
            }
        }
        return "SOURCE_NOT_SET";
    }

    public static int cb(int i) {
        if (i != 0) {
            switch (i) {
                case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
                    return BasePaymentResult.ERROR_REQUEST_TIMEOUT;
                case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                    return BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED;
                case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                    return BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED;
                default:
                    return 0;
            }
        }
        return 1;
    }

    public static afcu cc(afcy afcyVar) {
        if (ce(afcyVar)) {
            return afct.a;
        }
        throw new IllegalArgumentException("Local attachment source wasn't set");
    }

    public static afcy cd(afcv afcvVar) {
        aozy createBuilder = afcy.a.createBuilder();
        createBuilder.getClass();
        String a = afcvVar.d().a();
        a.getClass();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        afcy afcyVar = (afcy) apagVar;
        afcyVar.b |= 1;
        afcyVar.e = a;
        String i = afcvVar.i();
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        afcy afcyVar2 = (afcy) apagVar2;
        afcyVar2.b |= 2;
        afcyVar2.f = i;
        long b = afcvVar.b();
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        afcy afcyVar3 = (afcy) apagVar3;
        afcyVar3.b |= 4;
        afcyVar3.g = b;
        String g = afcvVar.g();
        if (g != null) {
            if (!apagVar3.isMutable()) {
                createBuilder.u();
            }
            afcy afcyVar4 = (afcy) createBuilder.b;
            afcyVar4.b |= 8;
            afcyVar4.h = g;
        }
        apct k = aoue.k(afcvVar.f());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        afcy afcyVar5 = (afcy) createBuilder.b;
        afcyVar5.i = k;
        afcyVar5.b |= 16;
        if (afcvVar.fh() instanceof afct) {
            aozy createBuilder2 = afcx.a.createBuilder();
            createBuilder2.getClass();
            apag s = createBuilder2.s();
            s.getClass();
            afcx afcxVar = (afcx) s;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            afcy afcyVar6 = (afcy) createBuilder.b;
            afcyVar6.d = afcxVar;
            afcyVar6.c = BasePaymentResult.ERROR_REQUEST_FAILED;
        }
        apag s2 = createBuilder.s();
        s2.getClass();
        return (afcy) s2;
    }

    public static boolean ce(afcy afcyVar) {
        int i = afcyVar.c;
        if (cg(i) != 0 && cg(i) != 1) {
            return true;
        }
        return false;
    }

    public static void cf(afdb afdbVar, afcy afcyVar) {
        afcy afcyVar2;
        String str = afcyVar.e;
        str.getClass();
        afsx H = afwv.H(str);
        if (H != null) {
            afdbVar.e(H);
            String str2 = afcyVar.f;
            str2.getClass();
            afdbVar.t(str2);
            afdbVar.q(afcyVar.g);
            if ((afcyVar.b & 8) == 0) {
                afcyVar2 = null;
            } else {
                afcyVar2 = afcyVar;
            }
            if (afcyVar2 != null) {
                String str3 = afcyVar2.h;
                str3.getClass();
                afdbVar.d(str3);
            }
            apct apctVar = afcyVar.i;
            if (apctVar == null) {
                apctVar = apct.a;
            }
            apctVar.getClass();
            afdbVar.c(aoue.m(apctVar));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static int cg(int i) {
        if (i != 0) {
            if (i != 200) {
                return 0;
            }
            return BasePaymentResult.ERROR_REQUEST_TIMEOUT;
        }
        return 1;
    }

    public static String ci(afcv afcvVar) {
        return afcvVar.i();
    }

    public static boolean cj(afcs afcsVar, afcs afcsVar2) {
        afcsVar.getClass();
        afcsVar2.getClass();
        return d.F(afcsVar.fi(), afcsVar2.fi());
    }

    public static void ck(lga lgaVar, afgk afgkVar, bwj bwjVar, int i) {
        int i2 = i & 1;
        bwj c = bwjVar.c(393917698);
        if (i2 == 0 && c.L()) {
            c.v();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new afbs(lgaVar, afgkVar, i, 2);
        }
    }

    private static long cl(bwj bwjVar) {
        bwjVar.y(1186664705);
        bwjVar.y(1242697841);
        long j = bmp.a(bwjVar).a;
        bwk bwkVar = (bwk) bwjVar;
        bwkVar.Y();
        bwkVar.Y();
        return j;
    }

    private static bkn cm(bwj bwjVar) {
        bwjVar.y(-56649089);
        amj amjVar = ahfq.a;
        bwjVar.y(762287948);
        long j = bmp.a(bwjVar).a;
        bwk bwkVar = (bwk) bwjVar;
        bwkVar.Y();
        bkn c = ahfq.c(j, bwjVar, 13);
        bwkVar.Y();
        return c;
    }

    private static String cn(String str) {
        int i = ambp.a;
        return ambn.a.c(str, StandardCharsets.UTF_8).toString();
    }

    public static void d(long j, long j2, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-1330133905);
        if (i5 == 0) {
            if (true != c.F(j)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.F(j2)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            bqv.c(amh.d(amv.h(cga.e, 48.0f), 7.0f), awh.a, j, 0L, brg.a, brg.a, null, cdk.e(-2059771596, new aejy(j2), c), c, 120);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aekd(j, j2, i, 1);
        }
    }

    public static void e(aeix aeixVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(1686834829);
        if (i4 == 0) {
            if (true != c.G(aeixVar)) {
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
            h(dea.a(cga.e, "audio_bubble_loading"), 0, 0, cdk.e(-463430723, new yzl(aeixVar, 13), c), c, 3078, 6);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aaob(aeixVar, i, 3);
        }
    }

    public static void f(amt amtVar, long j, bwj bwjVar, int i) {
        int i2;
        cga b;
        cga c;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c2 = bwjVar.c(-1037370465);
        if (i5 == 0) {
            if (true != c2.G(amtVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.F(j)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c2.L()) {
            c2.v();
        } else {
            String a = dga.a(R.string.audiobubble_loading_slider_content_description, c2);
            b = amtVar.b(cga.e, 1.0f, true);
            cga aT = adcx.aT(chk.a(amv.d(amh.i(b, 8.0f, brg.a, 2), 4.0f), awh.a(4.0f)), new cku(j), 6);
            c2.y(916090801);
            boolean G = c2.G(a);
            bwk bwkVar = (bwk) c2;
            Object T = bwkVar.T();
            if (G || T == bwj.a.a) {
                T = new aeju(a, 2);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            c = dhb.c(aT, false, (arqr) T);
            akc.b(c, c2, 0);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new aejz(amtVar, j, i, 1);
        }
    }

    public static void g(boolean z, arqg arqgVar, long j, bwj bwjVar, int i) {
        int i2;
        int i3;
        aerb aerbVar;
        int i4;
        int i5;
        int i6;
        int i7 = i & 14;
        bwj c = bwjVar.c(-2032552469);
        if (i7 == 0) {
            if (true != c.H(z)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.I(arqgVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (true != c.F(j)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            if (z) {
                i3 = R.string.audiobubble_pause_button_content_description;
            } else {
                i3 = R.string.audiobubble_play_button_content_description;
            }
            int i8 = i3;
            if (z) {
                aerbVar = aerb.ce;
            } else {
                aerbVar = aerb.cv;
            }
            ahji.P(arqgVar, null, false, null, null, cdk.e(-1929471731, new aejz(aerbVar, i8, j, 0), c), c, ((i2 >> 3) & 14) | 1572864, 62);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeka(z, arqgVar, j, i);
        }
    }

    public static void h(cga cgaVar, int i, int i2, arqw arqwVar, bwj bwjVar, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8 = i4 & 1;
        bwj c = bwjVar.c(-1572672345);
        if (i8 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            if (true != c.G(cgaVar)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i5 = i6 | i3;
        } else {
            i5 = i3;
        }
        int i9 = i5 | 432;
        if ((i3 & 7168) == 0) {
            if (true != c.I(arqwVar)) {
                i7 = 1024;
            } else {
                i7 = 2048;
            }
            i9 |= i7;
        }
        if ((i9 & 5851) == 1170 && c.L()) {
            c.v();
        } else {
            if (i8 != 0) {
                cgaVar = cga.e;
            }
            cga f = amh.f(cgaVar, 12.0f, 12.0f, 16.0f, 12.0f);
            int i10 = cfq.a;
            int i11 = (i9 & 7168) | 384;
            cue a = amq.a(ajw.a, cfq.a.k, c, 48);
            int a2 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, f);
            int i12 = cwl.a;
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
            caw.b(c, b, cwl.a.c);
            arqwVar.a(amu.a, c, Integer.valueOf(((i11 >> 6) & 112) | 6));
            c.p();
            i2 = 12;
            i = 16;
        }
        cga cgaVar2 = cgaVar;
        int i13 = i;
        int i14 = i2;
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aekb(cgaVar2, i13, i14, arqwVar, i3, i4);
        }
    }

    public static void i(amt amtVar, aeiy aeiyVar, long j, long j2, bwj bwjVar, int i) {
        int i2;
        cga b;
        cga c;
        long f;
        long f2;
        long f3;
        long f4;
        long f5;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        int i3;
        int i4;
        int i5;
        int i6;
        long j10 = j;
        long j11 = j2;
        int i7 = i & 14;
        bwj c2 = bwjVar.c(-928818076);
        if (i7 == 0) {
            if (true != c2.G(amtVar)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.G(aeiyVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (true != c2.F(j10)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (true != c2.F(j11)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) == 1170 && c2.L()) {
            c2.v();
        } else {
            String a = dga.a(R.string.audiobubble_slider_content_description, c2);
            c2.y(-739783068);
            String string = ((Context) c2.g(AndroidCompositionLocals_androidKt.b)).getResources().getString(R.string.audiobubble_slider_state_description, Integer.valueOf((int) (aeiyVar.a * 100.0f)));
            string.getClass();
            bwk bwkVar = (bwk) c2;
            bwkVar.Y();
            b = amtVar.b(cga.e, 1.0f, true);
            c2.y(-1018648629);
            boolean G = c2.G(a) | c2.G(string);
            Object T = bwkVar.T();
            if (G || T == bwj.a.a) {
                T = new aaop(a, string, 9, null);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            c = dhb.c(b, false, (arqr) T);
            float f6 = aeiyVar.a;
            arsy arsyVar = new arsy(brg.a, 1.0f);
            arqg arqgVar = aeiyVar.c;
            c2.y(1931781400);
            long ab = ahji.ab(32, c2);
            long ab2 = ahji.ab(26, c2);
            f = ckw.f(cku.d(r9), cku.c(r9), cku.b(r9), 0.38f, cku.f(ahji.ab(18, c2)));
            long h = ckw.h(f, bmp.a(c2).p);
            f2 = ckw.f(cku.d(r10), cku.c(r10), cku.b(r10), 0.38f, cku.f(ahji.ab(18, c2)));
            f3 = ckw.f(cku.d(r10), cku.c(r10), cku.b(r10), 0.12f, cku.f(ahji.ab(18, c2)));
            f4 = ckw.f(cku.d(r9), cku.c(r9), cku.b(r9), 0.12f, cku.f(bmp.a(c2).q));
            f5 = ckw.f(cku.d(r9), cku.c(r9), cku.b(r9), 0.38f, cku.f(ahji.ab(18, c2)));
            bpv bpvVar = bpv.a;
            bpt b2 = bpv.b(bmp.a(c2));
            if (j10 != 16) {
                j3 = j10;
            } else {
                j3 = b2.a;
                j10 = 16;
            }
            if (j10 != 16) {
                j4 = j10;
            } else {
                j4 = b2.b;
                j10 = 16;
            }
            if (ab == 16) {
                ab = b2.c;
            }
            long j12 = ab;
            if (j11 != 16) {
                j5 = j11;
            } else {
                j5 = b2.d;
                j11 = 16;
            }
            if (ab2 != 16) {
                j6 = ab2;
            } else {
                j6 = b2.e;
            }
            if (h == 16) {
                h = b2.f;
            }
            long j13 = h;
            if (f2 != 16) {
                j7 = f2;
            } else {
                j7 = b2.g;
            }
            if (f3 != 16) {
                j8 = f3;
            } else {
                j8 = b2.h;
            }
            if (f4 != 16) {
                j9 = f4;
            } else {
                j9 = b2.i;
            }
            if (f5 == 16) {
                f5 = b2.j;
            }
            bpt bptVar = new bpt(j3, j4, j12, j5, j6, j13, j7, j8, j9, f5);
            bwkVar.Y();
            ahhb.b(f6, new aeju(aeiyVar, 3), c, false, arsyVar, arqgVar, bptVar, null, c2, 0);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new aekc(amtVar, aeiyVar, j10, j11, i);
        }
    }

    public static void j(long j, long j2, bwj bwjVar, int i) {
        int i2;
        String string;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-2004999742);
        if (i5 == 0) {
            if (true != c.F(j)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.F(j2)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            long j3 = j / 1000;
            c.y(-1086667073);
            Resources resources = ((Context) c.g(AndroidCompositionLocals_androidKt.b)).getResources();
            int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(j);
            int seconds = ((int) TimeUnit.MILLISECONDS.toSeconds(j)) % 60;
            if (minutes == 0) {
                string = resources.getQuantityString(R.plurals.audiobubble_timer_seconds_content_description, seconds, Integer.valueOf(seconds));
                string.getClass();
                ((bwk) c).Y();
            } else if (seconds == 0) {
                string = resources.getQuantityString(R.plurals.audiobubble_timer_minutes_content_description, minutes, Integer.valueOf(minutes));
                string.getClass();
                ((bwk) c).Y();
            } else {
                if (minutes == 1) {
                    if (seconds == 1) {
                        string = resources.getString(R.string.audiobubble_timer_minute_second_content_description);
                        string.getClass();
                        ((bwk) c).Y();
                    } else {
                        minutes = 1;
                    }
                }
                if (minutes > 1 && seconds == 1) {
                    string = resources.getString(R.string.audiobubble_timer_minutes_second_content_description, Integer.valueOf(minutes));
                    string.getClass();
                    ((bwk) c).Y();
                } else if (minutes == 1 && seconds > 1) {
                    string = resources.getString(R.string.audiobubble_timer_minute_seconds_content_description, Integer.valueOf(seconds));
                    string.getClass();
                    ((bwk) c).Y();
                } else {
                    string = resources.getString(R.string.audiobubble_timer_minutes_seconds_content_description, Integer.valueOf(minutes), Integer.valueOf(seconds));
                    string.getClass();
                    ((bwk) c).Y();
                }
            }
            cga j4 = amh.j(cga.e, 4.0f, brg.a, brg.a, brg.a, 14);
            c.y(1179643076);
            boolean G = c.G(string);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (G || T == bwj.a.a) {
                T = new aeju(string, 4);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            cga c2 = dhb.c(j4, true, (arqr) T);
            String formatElapsedTime = DateUtils.formatElapsedTime(j3);
            formatElapsedTime.getClass();
            ahji.e(formatElapsedTime, c2, j2, 0L, 0L, null, 0L, 0, false, 0, 0, null, dje.y(bmp.d(c).n, 0L, 0L, null, null, null, "tnum", 0L, 0, 0, 0L, null, null, 0, 16777151), c, (i2 << 3) & 896, 0, 65528);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aekd(j, j2, i, 0);
        }
    }

    public static void k(aeja aejaVar, cga cgaVar, cmb cmbVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-1450374329);
        if (i5 == 0) {
            if (true != c.G(aejaVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        int i6 = i2 | 48;
        if ((i & 896) == 0) {
            if (true != c.G(cmbVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i6 |= i3;
        }
        if ((i6 & 731) == 146 && c.L()) {
            c.v();
        } else {
            cgaVar = cga.e;
            arnb arnbVar = arnb.a;
            c.y(1694977743);
            int i7 = i6 & 14;
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (i7 == 4 || T == bwj.a.a) {
                T = new aeju(aejaVar, 0);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            bxl.c(arnbVar, (arqr) T, c);
            adom.bq(cdk.e(-1946799448, new aaho(aejaVar, cgaVar, cmbVar, (drk) c.g(dch.i), 3), c), c, 6);
        }
        cga cgaVar2 = cgaVar;
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jkb(aejaVar, cgaVar2, cmbVar, i, 19);
        }
    }

    public static void l(cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(1367865687);
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
            aP(new aerw(aerb.aM, dga.a(R.string.contact_view_fetch_failed_text, c), null, false, false, 124), cgaVar, c, (i2 << 3) & 112);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aaob(cgaVar, i, 4);
        }
    }

    public static void m(cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(1215268299);
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
            awg a = awh.a(20.0f);
            cga e = amh.e(cgaVar, 16.0f, 18.0f);
            int i5 = cfq.a;
            cue a2 = amq.a(ajw.a, cfq.a.k, c, 48);
            int a3 = bwg.a(c);
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
            caw.b(c, a2, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b, cwl.a.c);
            o(chk.a(amv.h(cga.e, 36.0f), awh.a), c, 0);
            amx.a(amv.l(cga.e, 12.0f), c);
            cga.a aVar = cga.e;
            cue a4 = akk.a(ajw.c, cfq.a.m, c, 0);
            int a5 = bwg.a(c);
            byx P2 = bwkVar.P();
            cga b2 = cfv.b(c, aVar);
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
            o(chk.a(amv.d(amv.l(cga.e, 82.0f), 14.0f), a), c, 0);
            amx.a(amv.d(cga.e, 4.0f), c);
            o(chk.a(amv.d(amv.l(cga.e, 44.0f), 14.0f), a), c, 0);
            c.p();
            c.p();
        }
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new aaob(cgaVar, i, 5);
        }
    }

    public static void n(cga cgaVar, String str, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-328943889);
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
            if (true != c.G(str)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            aP(new aerw(aerb.aC, dga.a(R.string.contact_downloadable_title, c), dga.b(R.string.contact_downloadable_subtitle, new Object[]{str}, c), true, false, 104), cgaVar, c, (i2 << 3) & 112);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zcj(cgaVar, str, i, 16, null);
        }
    }

    public static void o(cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-161938889);
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
            ((bzf) e).d = new aaob(cgaVar, i, 6);
        }
    }

    public static void p(aejf aejfVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(1644049492);
        if (i4 == 0) {
            if (true != c.G(aejfVar)) {
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
            boolean z = aejfVar instanceof aeje;
            cga.a aVar = cga.e;
            if (z) {
                c.y(1559168323);
                m(aVar, c, (i5 >> 3) & 14);
                ((bwk) c).Y();
            } else if (aejfVar instanceof aejc) {
                c.y(1559170977);
                l(aVar, c, (i5 >> 3) & 14);
                ((bwk) c).Y();
            } else if (aejfVar instanceof aejd) {
                int i6 = (i5 >> 3) & 14;
                c.y(1559173863);
                aejd aejdVar = (aejd) aejfVar;
                q(aVar, aejdVar.b, aejdVar.a, c, i6);
                ((bwk) c).Y();
            } else if (aejfVar instanceof aejb) {
                c.y(1559181048);
                n(aVar, ((aejb) aejfVar).a, c, (i5 >> 3) & 14);
                ((bwk) c).Y();
            } else {
                c.y(1559166916);
                ((bwk) c).Y();
                throw new armm();
            }
            cgaVar = aVar;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zcj(aejfVar, cgaVar, i, 15);
        }
    }

    public static void q(cga cgaVar, aevy aevyVar, String str, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i & 14;
        bwj c = bwjVar.c(737821789);
        if (i8 == 0) {
            if (true != c.G(cgaVar)) {
                i7 = 2;
            } else {
                i7 = 4;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aevyVar)) {
                i6 = 16;
            } else {
                i6 = 32;
            }
            i2 |= i6;
        }
        if ((i & 896) == 0) {
            if (true != c.G(str)) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i2 |= i5;
        }
        if ((i & 7168) == 0) {
            if (true != c.G(null)) {
                i4 = 1024;
            } else {
                i4 = 2048;
            }
            i2 |= i4;
        }
        if ((57344 & i) == 0) {
            if (true != c.H(false)) {
                i3 = 8192;
            } else {
                i3 = 16384;
            }
            i2 |= i3;
        }
        if ((46811 & i2) == 9362 && c.L()) {
            c.v();
        } else {
            int i9 = cfq.a;
            cue a = akc.a(cfq.a.a, false);
            int a2 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, cgaVar);
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
            caw.b(c, b, cwl.a.c);
            cga b2 = alw.b(amh.e(cga.e, 16.0f, 18.0f), alx.b);
            cue a3 = amq.a(ajw.a, cfq.a.k, c, 48);
            int a4 = bwg.a(c);
            byx P2 = bwkVar.P();
            cga b3 = cfv.b(c, b2);
            arqg arqgVar2 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar2);
            } else {
                c.C();
            }
            caw.b(c, a3, cwl.a.e);
            caw.b(c, P2, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a4))) {
                Integer valueOf2 = Integer.valueOf(a4);
                bwkVar.ad(valueOf2);
                c.j(valueOf2, arqvVar2);
            }
            caw.b(c, b3, cwl.a.c);
            adcx.bh(aevyVar, null, amv.h(cga.e, 36.0f), null, null, c, ((i2 >> 3) & 14) | 432, 24);
            amx.a(amv.l(cga.e, 12.0f), c);
            cga.a aVar = cga.e;
            cue a5 = akk.a(ajw.c, cfq.a.m, c, 0);
            int a6 = bwg.a(c);
            byx P3 = bwkVar.P();
            cga b4 = cfv.b(c, aVar);
            arqg arqgVar3 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar3);
            } else {
                c.C();
            }
            caw.b(c, a5, cwl.a.e);
            caw.b(c, P3, cwl.a.d);
            arqv arqvVar3 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a6))) {
                Integer valueOf3 = Integer.valueOf(a6);
                bwkVar.ad(valueOf3);
                c.j(valueOf3, arqvVar3);
            }
            caw.b(c, b4, cwl.a.c);
            ahji.e(str, null, bmp.a(c).q, 0L, 0L, null, 0L, 2, false, 1, 0, null, bmp.d(c).i, c, (i2 >> 6) & 14, 3120, 55290);
            ahji.e(dga.a(R.string.contact_view_button_text, c), null, bmp.a(c).s, 0L, 0L, null, 0L, 2, false, 1, 0, null, bmp.d(c).l, c, 0, 3120, 55290);
            c.p();
            c.y(214078944);
            bwkVar.Y();
            c.p();
            c.y(2140884442);
            bwkVar.Y();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jkb(cgaVar, aevyVar, str, i, 20, (int[]) null);
        }
    }

    public static void r(aejp aejpVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-1355257528);
        if (i5 == 0) {
            if (true != c.G(aejpVar)) {
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
            aP(new aerw(aerb.dG, aejpVar.a, aejpVar.b, false, true, 72), alw.b(cgaVar, alx.b), c, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aekg((Object) aejpVar, cgaVar, i, 3);
        }
    }

    public static void s(aejq aejqVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        cga a;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-638731328);
        if (i5 == 0) {
            if (true != c.G(aejqVar)) {
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
            akf akfVar = akf.a;
            a = cga.e.a(new AspectRatioElement());
            Uri uri = aejqVar.a;
            Uri uri2 = aejqVar.b;
            String str = aejqVar.c;
            int i8 = csv.a;
            bf(uri, str, a, uri2, null, null, csv.a.a, null, brg.a, null, null, null, null, null, null, null, c, 12587400, 0, 524144);
            u(akfVar, false, c, 6, 1);
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aekg((Object) aejqVar, cgaVar, i, 4);
        }
    }

    public static void t(cga cgaVar, bwj bwjVar, int i) {
        int i2;
        cga a;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(2115820536);
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
            int i5 = cfq.a;
            cue a2 = akc.a(cfq.a.a, false);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, cgaVar);
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
            akf akfVar = akf.a;
            a = cga.e.a(new AspectRatioElement());
            amx.a(adcx.aQ(a, new cku(cku.g), new cku(bmp.a(c).v), true), c);
            u(akfVar, true, c, 54, 0);
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aaob(cgaVar, i, 15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void u(ake akeVar, boolean z, bwj bwjVar, int i, int i2) {
        int i3;
        int i4;
        long j;
        boolean z2;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(-166802540);
        boolean z3 = true;
        if (i6 == 0) {
            if (true != c.G(akeVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        if (i2 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (true != c.H(z)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i3 |= i4;
        }
        if ((i3 & 91) == 18 && c.L()) {
            c.v();
            z2 = z;
        } else {
            boolean z4 = (z ? 1 : 0) & (i2 ^ 1);
            cga h = amv.h(cga.e, 32.0f);
            int i7 = cfq.a;
            cga a = akeVar.a(h, cfq.a.e);
            cor bg = bg(aerb.cv, c);
            c.y(1000796553);
            if (z4 != 0) {
                j = bmp.a(c).s;
            } else {
                j = cku.d;
            }
            ((bwk) c).Y();
            ahji.N(bg, null, a, j, c, 8, 0);
            z2 = z4;
        }
        bzz e = c.e();
        if (e != null) {
            if (true != z2) {
                z3 = false;
            }
            ((bzf) e).d = new lil(akeVar, z3, i, i2, 2);
        }
    }

    public static void v(aejs aejsVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(193162915);
        if (i4 == 0) {
            if (true != c.G(aejsVar)) {
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
            boolean z = aejsVar instanceof aejr;
            cga.a aVar = cga.e;
            if (z) {
                c.y(-391765486);
                t(aVar, c, (i5 >> 3) & 14);
                ((bwk) c).Y();
            } else if (aejsVar instanceof aejq) {
                c.y(-391763241);
                s((aejq) aejsVar, aVar, c, i5 & 112);
                ((bwk) c).Y();
            } else if (aejsVar instanceof aejp) {
                c.y(-391760874);
                r((aejp) aejsVar, aVar, c, i5 & 112);
                ((bwk) c).Y();
            } else {
                c.y(-391767039);
                ((bwk) c).Y();
                throw new armm();
            }
            cgaVar = aVar;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aekg((Object) aejsVar, cgaVar, i, 2);
        }
    }

    public static void w(aejl aejlVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(1296353160);
        if (i5 == 0) {
            if (true != c.G(aejlVar)) {
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
            aP(new aerw(aerb.bo, aejlVar.a, aejlVar.b, false, true, 72), alw.b(cgaVar, alx.b), c, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aekg((Object) aejlVar, cgaVar, i, 1);
        }
    }

    public static void x(aejm aejmVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        cga a;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-1298869760);
        if (i5 == 0) {
            if (true != c.G(aejmVar)) {
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
        if ((i2 & 91) != 18 || !c.L()) {
            a = cgaVar.a(new AspectRatioElement());
            Uri uri = aejmVar.a;
            Uri uri2 = aejmVar.b;
            String str = aejmVar.c;
            int i6 = csv.a;
            bf(uri, str, a, uri2, null, null, csv.a.a, null, brg.a, null, null, null, "ImageAttachment", null, null, null, c, 12587016, 196608, 491376);
        } else {
            c.v();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aekg((Object) aejmVar, cgaVar, i, 0);
        }
    }

    public static void y(cga cgaVar, bwj bwjVar, int i) {
        int i2;
        cga a;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1517696456);
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
        if ((i2 & 11) != 2 || !c.L()) {
            a = cgaVar.a(new AspectRatioElement());
            amx.a(adcx.aQ(a, new cku(cku.g), new cku(bmp.a(c).v), true), c);
        } else {
            c.v();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aaob(cgaVar, i, 14);
        }
    }

    public static void z(aejo aejoVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(636920835);
        if (i4 == 0) {
            if (true != c.G(aejoVar)) {
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
            boolean z = aejoVar instanceof aejn;
            cga.a aVar = cga.e;
            if (z) {
                c.y(-1151854574);
                y(aVar, c, (i5 >> 3) & 14);
                ((bwk) c).Y();
            } else if (aejoVar instanceof aejm) {
                c.y(-1151852329);
                x((aejm) aejoVar, aVar, c, i5 & 112);
                ((bwk) c).Y();
            } else if (aejoVar instanceof aejl) {
                c.y(-1151849962);
                w((aejl) aejoVar, aVar, c, i5 & 112);
                ((bwk) c).Y();
            } else {
                c.y(-1151856127);
                ((bwk) c).Y();
                throw new armm();
            }
            cgaVar = aVar;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zcj(aejoVar, cgaVar, i, 20);
        }
    }

    public /* synthetic */ aeke(byte[] bArr, byte[] bArr2) {
    }
}
