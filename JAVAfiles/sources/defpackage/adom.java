package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.compose.foundation.BackgroundElement;
import androidx.compose.foundation.layout.AspectRatioElement;
import androidx.compose.ui.SensitiveNodeElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.android.ims.rcsmigration.File;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import defpackage.ajw;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cko;
import defpackage.cwl;
import j$.net.URLEncoder;
import j$.time.ZoneId;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class adom {
    private static adom a;
    private static adom b;

    public adom() {
    }

    public static adom A() {
        if (b == null) {
            b = new adom();
        }
        return b;
    }

    public static void B(cga cgaVar, aepy aepyVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        cgaVar.getClass();
        int i5 = i & 14;
        bwj c = bwjVar.c(-1877236062);
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
            if (true != c.G(aepyVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
            bzz e = c.e();
            if (e != null) {
                ((bzf) e).d = new aepu(cgaVar, aepyVar, i);
                return;
            }
            return;
        }
        c.y(-851504799);
        float f = ((Configuration) c.g(AndroidCompositionLocals_androidKt.a)).screenWidthDp;
        bwk bwkVar = (bwk) c;
        bwkVar.Y();
        Float.compare(f, 336.0f);
        ZoneId.systemDefault().getClass();
        Object[] objArr = new Object[0];
        c.y(-425016081);
        Object T = bwkVar.T();
        if (T == bwj.a.a) {
            T = aepv.a;
            bwkVar.ad(T);
        }
        bwkVar.Y();
        throw null;
    }

    public static void C(cga cgaVar, aepx aepxVar, bwj bwjVar, int i) {
        int i2;
        cdi e;
        cdi e2;
        long au;
        int i3;
        int i4;
        cgaVar.getClass();
        int i5 = i & 14;
        bwj c = bwjVar.c(-1516118501);
        if (i5 == 0) {
            if (true != c.G(cgaVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aepxVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        int i6 = i2;
        if ((i6 & 91) == 18 && c.L()) {
            c.v();
        } else {
            aerb aerbVar = aepxVar.c;
            String str = aepxVar.d;
            arqg arqgVar = aepxVar.i;
            c.y(-2055180876);
            cdi cdiVar = null;
            if (aerbVar == null) {
                e = null;
            } else {
                e = cdk.e(1838762066, new aekj(aerbVar, 9), c);
            }
            bwk bwkVar = (bwk) c;
            bwkVar.Y();
            c.y(-2055177522);
            if (str != null) {
                cdiVar = cdk.e(1251151504, new aekj(str, 11), c);
            }
            bwkVar.Y();
            if (aepxVar.e) {
                c.y(714160361);
                e2 = cdk.e(-1132368631, new aekj(aepxVar, 13), c);
                bwkVar.Y();
            } else {
                c.y(714316136);
                e2 = cdk.e(-1306967136, new aekj(aepxVar, 14), c);
                bwkVar.Y();
            }
            cdi cdiVar2 = e2;
            if (aepxVar.f) {
                c.y(714714641);
                au = bmp.a(c).w;
                bwkVar.Y();
            } else {
                c.y(714769356);
                au = ahji.au(c);
                bwkVar.Y();
            }
            ahji.as(arqgVar, cdk.e(-1670386077, new aekj(aepxVar, 15), c), cgaVar, cdk.e(-1243831579, new aekj(aepxVar, 16), c), e, cdiVar, cdiVar2, null, 0L, brg.a, au, 0L, 0L, null, c, ((i6 << 6) & 896) | 3120, 0, 15232);
        }
        bzz e3 = c.e();
        if (e3 != null) {
            ((bzf) e3).d = new aeol(cgaVar, aepxVar, i, 5, null);
        }
    }

    public static void D(amt amtVar, aept aeptVar, cit citVar, bwj bwjVar, int i) {
        int i2;
        cga b2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(-1433315823);
        if (i6 == 0) {
            if (true != c.G(amtVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aeptVar)) {
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
        if ((i2 & 731) != 146 || !c.L()) {
            b2 = amtVar.b(dea.a(cga.e, "ContactSearchBar"), 1.0f, true);
            akz.b(afs.c(b2, afs.b(c, 0), true, 6), new ajw.d(4.0f, true, ajx.a), null, null, 0, 0, null, cdk.e(313513677, new ifo(aeptVar, citVar, 11), c), c, 12582960, 124);
        } else {
            c.v();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelx(amtVar, aeptVar, citVar, i, 11, (char[]) null);
        }
    }

    public static void E(alo aloVar, aept aeptVar, cit citVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(-115612018);
        if (i6 == 0) {
            if (true != c.G(aloVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aeptVar)) {
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
            List list = aeptVar.a;
            c.y(1207808531);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                aeke.U((aemk) it.next(), null, c, 0);
            }
            ((bwk) c).Y();
            F(aloVar, !list.isEmpty(), aeptVar.e, aeptVar.b, aeptVar.c, aeptVar.d, citVar, c, (i2 & 14) | ((i2 << 12) & 3670016));
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelx(aloVar, aeptVar, citVar, i, 12, (char[]) null);
        }
    }

    public static void F(alo aloVar, boolean z, cas casVar, arqr arqrVar, arqg arqgVar, arqg arqgVar2, cit citVar, bwj bwjVar, int i) {
        int i2;
        cga b2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i & 14;
        bwj c = bwjVar.c(-321324693);
        if (i10 == 0) {
            if (true != c.G(aloVar)) {
                i9 = 2;
            } else {
                i9 = 4;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.H(z)) {
                i8 = 16;
            } else {
                i8 = 32;
            }
            i2 |= i8;
        }
        if ((i & 896) == 0) {
            if (true != c.G(casVar)) {
                i7 = 128;
            } else {
                i7 = 256;
            }
            i2 |= i7;
        }
        if ((i & 7168) == 0) {
            if (true != c.I(arqrVar)) {
                i6 = 1024;
            } else {
                i6 = 2048;
            }
            i2 |= i6;
        }
        if ((i & 57344) == 0) {
            if (true != c.I(arqgVar)) {
                i5 = 8192;
            } else {
                i5 = 16384;
            }
            i2 |= i5;
        }
        if ((i & 458752) == 0) {
            if (true != c.I(arqgVar2)) {
                i4 = 65536;
            } else {
                i4 = 131072;
            }
            i2 |= i4;
        }
        if ((3670016 & i) == 0) {
            if (true != c.G(citVar)) {
                i3 = 524288;
            } else {
                i3 = 1048576;
            }
            i2 |= i3;
        }
        if ((2995931 & i2) == 599186 && c.L()) {
            c.v();
        } else {
            long j = bmp.a(c).a;
            c.y(1922400241);
            boolean F = c.F(j);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (F || T == bwj.a.a) {
                T = new byu(new cmd(j), cav.a);
                bwkVar.ad(T);
            }
            byn bynVar = (byn) T;
            bwkVar.Y();
            b2 = aloVar.b(cga.e, 1.0f, true);
            cga a2 = civ.a(b2, citVar);
            c.y(1922406503);
            int i11 = i2 & 57344;
            Object T2 = bwkVar.T();
            if (i11 == 16384 || T2 == bwj.a.a) {
                T2 = new aeju(arqgVar, 15);
                bwkVar.ad(T2);
            }
            bwkVar.Y();
            cga a3 = dea.a(cpu.a(a2, (arqr) T2), "ContactSearchField");
            cmd cmdVar = (cmd) bynVar.a();
            ayc aycVar = new ayc(2, 0, 7, 118);
            dje y = dje.y(bmp.d(c).k, bmp.a(c).q, 0L, null, null, null, null, 0L, 0, 0, 0L, null, null, 0, 16777214);
            c.y(1922423159);
            int i12 = 458752 & i2;
            Object T3 = bwkVar.T();
            if (i12 == 131072 || T3 == bwj.a.a) {
                T3 = new aeju(arqgVar2, 16);
                bwkVar.ad(T3);
            }
            bwkVar.Y();
            ayb aybVar = new ayb((arqr) T3, null, null, 62);
            String str = (String) casVar.a();
            c.y(1922416544);
            int i13 = i2 & 7168;
            Object T4 = bwkVar.T();
            if (i13 == 2048 || T4 == bwj.a.a) {
                T4 = new aeju(arqrVar, 17);
                bwkVar.ad(T4);
            }
            bwkVar.Y();
            awo.c(str, (arqr) T4, a3, false, y, aycVar, aybVar, true, 0, 0, null, null, null, cmdVar, cdk.e(-2121727858, new aeps(casVar, z, 0), c), c, 102236160, 196608, 15896);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeow(aloVar, z, casVar, arqrVar, arqgVar, arqgVar2, citVar, i, 2);
        }
    }

    public static void G(boolean z, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(569445051);
        if (i5 == 0) {
            if (true != c.H(z)) {
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
        } else {
            if (z) {
                i3 = R.string.contact_bar_hint_filled;
            } else {
                i3 = R.string.contact_bar_hint_empty;
            }
            ahji.e(dga.a(i3, c), null, bmp.a(c).s, 0L, 0L, null, 0L, 2, false, 1, 0, null, bmp.d(c).k, c, 0, 3120, 55290);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aell(z, i, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void H(defpackage.bwj r23, int r24) {
        /*
            r0 = 1862085784(0x6efd2c98, float:3.917681E28)
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
            goto L59
        L19:
            r22 = r24
        L1b:
            cga$a r1 = defpackage.cga.e
            r5 = 0
            r6 = 9
            r2 = 0
            r3 = 1096810496(0x41600000, float:14.0)
            r4 = 1099956224(0x41900000, float:18.0)
            cga r2 = defpackage.amh.j(r1, r2, r3, r4, r5, r6)
            r1 = 2132017973(0x7f140335, float:1.967424E38)
            java.lang.String r1 = defpackage.dga.a(r1, r0)
            blh r3 = defpackage.bmp.a(r0)
            long r3 = r3.q
            bse r5 = defpackage.bmp.d(r0)
            dje r5 = r5.k
            r17 = r5
            r20 = 0
            r21 = 65528(0xfff8, float:9.1824E-41)
            r5 = 0
            r7 = 0
            r9 = 0
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
        L59:
            bzz r0 = r0.e()
            if (r0 == 0) goto L6a
            lhs r1 = new lhs
            r3 = 18
            r1.<init>(r2, r3)
            bzf r0 = (defpackage.bzf) r0
            r0.d = r1
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adom.H(bwj, int):void");
    }

    public static void I(aept aeptVar, cga cgaVar, cit citVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        cga a2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c2 = bwjVar.c(-677013339);
        if (i5 == 0) {
            if (true != c2.G(aeptVar)) {
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
            if (true != c2.G(citVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i6 |= i3;
        }
        if ((i6 & 731) == 146 && c2.L()) {
            c2.v();
        } else {
            c2.w();
            if ((i & 1) != 0 && !c2.J()) {
                c2.v();
            } else {
                cgaVar = cga.e;
            }
            c2.n();
            c = amv.c(cgaVar, 1.0f);
            a2 = adf.a(amv.e(c, 48.0f, 120.0f), bmp.a(c2).F, clw.a);
            cga j = amh.j(a2, 20.0f, brg.a, 16.0f, brg.a, 10);
            ajw.b bVar = ajw.a;
            int i7 = cfq.a;
            cue a3 = amq.a(bVar, cfq.a.j, c2, 0);
            int a4 = bwg.a(c2);
            bwk bwkVar = (bwk) c2;
            byx P = bwkVar.P();
            cga b2 = cfv.b(c2, j);
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
            caw.b(c2, b2, cwl.a.c);
            amu amuVar = amu.a;
            H(c2, 0);
            D(amuVar, aeptVar, citVar, c2, (i6 & 896) | ((i6 << 3) & 112) | 6);
            c2.p();
        }
        cga cgaVar2 = cgaVar;
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new aelx((Object) aeptVar, cgaVar2, (Object) citVar, i, 10);
        }
    }

    public static cga J(cga cgaVar, byn bynVar, aepp aeppVar, arqr arqrVar) {
        cga a2;
        cgaVar.getClass();
        bynVar.getClass();
        a2 = cgaVar.a(new cfy("com.google.android.libraries.communications.ux.components.composerow.addVoiceInputButtonModifier", bynVar, aeppVar, arqrVar, new qjl(aeppVar, bynVar, arqrVar, 8, (char[]) null)));
        return a2;
    }

    public static void K(aenr aenrVar, cit citVar, aeop aeopVar, bwj bwjVar, int i) {
        int i2;
        bwk bwkVar;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(-1387657523);
        if (i6 == 0) {
            if (true != c.G(aenrVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(citVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c.G(aeopVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            c.y(-716778519);
            bwk bwkVar2 = (bwk) c;
            Object T = bwkVar2.T();
            if (T == bwj.a.a) {
                byu byuVar = new byu(false, cav.a);
                bwkVar2.ad(byuVar);
                T = byuVar;
            }
            byn bynVar = (byn) T;
            bwkVar2.Y();
            int i7 = cfq.a;
            cfq.c cVar = cfq.a.l;
            cga.a aVar = cga.e;
            cue a2 = amq.a(ajw.a, cVar, c, 48);
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
            amu amuVar = amu.a;
            amx.a(amv.l(cga.e, 16.0f), c);
            c.y(-553291669);
            Object T2 = bwkVar2.T();
            if (T2 == bwj.a.a) {
                T2 = new aeju(bynVar, 14);
                bwkVar2.ad(T2);
            }
            bwkVar2.Y();
            int i9 = i2 << 3;
            aO(amuVar, aenrVar, citVar, (arqr) T2, null, false, false, brg.a, aeopVar, c, (i9 & 896) | (i9 & 112) | 3078 | ((i2 << 18) & 234881024), 120);
            aeno aenoVar = aenrVar.a;
            c.y(-553288592);
            aeor aeorVar = aenoVar.f;
            if (aeorVar == null) {
                bwkVar = bwkVar2;
            } else {
                cga i10 = amh.i(amv.d(cga.e, 48.0f), 16.0f, brg.a, 2);
                cue a4 = akc.a(cfq.a.e, false);
                int a5 = bwg.a(c);
                byx P2 = bwkVar2.P();
                cga b3 = cfv.b(c, i10);
                arqg arqgVar2 = cwl.a.a;
                c.A();
                bwkVar = bwkVar2;
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
                aP(aeorVar, 12, c, 48, 0);
                c.p();
            }
            bwkVar.Y();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelx(aenrVar, citVar, aeopVar, i, 9);
        }
    }

    public static void L(aenr aenrVar, aeoo aeooVar, float f, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(-410429381);
        if (i6 == 0) {
            if (true != c.G(aenrVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aeooVar)) {
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
            bqv.c(null, awh.a, aY(false, false, true, aenrVar.d.g.c, aeooVar, f, aepi.VOICE_BUTTON_BACKGROUND_DEFAULT, true, c), 0L, brg.a, brg.a, null, cdk.e(1314578560, new aekj(aenrVar, 8), c), c, 121);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aepf(aenrVar, aeooVar, f, i, 0);
        }
    }

    public static void M(aenr aenrVar, aeoo aeooVar, float f, cga cgaVar, cit citVar, aeop aeopVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        cgaVar.getClass();
        int i9 = i & 14;
        bwj c = bwjVar.c(-320620138);
        if (i9 == 0) {
            if (true != c.G(aenrVar)) {
                i8 = 2;
            } else {
                i8 = 4;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aeooVar)) {
                i7 = 16;
            } else {
                i7 = 32;
            }
            i2 |= i7;
        }
        if ((i & 896) == 0) {
            if (true != c.D(f)) {
                i6 = 128;
            } else {
                i6 = 256;
            }
            i2 |= i6;
        }
        if ((i & 7168) == 0) {
            if (true != c.G(cgaVar)) {
                i5 = 1024;
            } else {
                i5 = 2048;
            }
            i2 |= i5;
        }
        if ((57344 & i) == 0) {
            if (true != c.G(citVar)) {
                i4 = 8192;
            } else {
                i4 = 16384;
            }
            i2 |= i4;
        }
        if ((458752 & i) == 0) {
            if (true != c.G(aeopVar)) {
                i3 = 65536;
            } else {
                i3 = 131072;
            }
            i2 |= i3;
        }
        int i10 = i2;
        if ((374491 & i10) == 74898 && c.L()) {
            c.v();
        } else {
            cga d = amh.d(cgaVar, 8.0f);
            int i11 = cfq.a;
            cue a2 = amq.a(ajw.a, cfq.a.l, c, 48);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b2 = cfv.b(c, d);
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
            caw.b(c, b2, cwl.a.c);
            aeke.K(amu.a, aeooVar, f, cdk.e(-1887742381, new aepg(aenrVar, f, aeooVar, citVar, aeopVar), c), c, (i10 & 112) | 3078 | (i10 & 896));
            amx.a(amv.l(cga.e, 8.0f), c);
            cfq.b bVar = cfq.a.n;
            cga.a aVar = cga.e;
            cue a4 = akk.a(ajw.c, bVar, c, 48);
            int a5 = bwg.a(c);
            byx P2 = bwkVar.P();
            cga b3 = cfv.b(c, aVar);
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
            L(aenrVar, aeooVar, f, c, i10 & 1022);
            c.p();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aetx(aenrVar, aeooVar, f, cgaVar, citVar, aeopVar, i, 1);
        }
    }

    public static void N(aenr aenrVar, aeom aeomVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(1826242253);
        if (i5 == 0) {
            if (true != c.G(aenrVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aeomVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            aq(aeomVar, c, (i2 >> 3) & 14);
            int i6 = cfq.a;
            cfq.b bVar = cfq.a.n;
            cga.a aVar = cga.e;
            cue a2 = akk.a(ajw.c, bVar, c, 48);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b2 = cfv.b(c, aVar);
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
            aeno aenoVar = aenrVar.a;
            c.y(1627421963);
            aeor aeorVar = aenoVar.f;
            if (aeorVar != null) {
                amx.a(amv.d(cga.e, 8.0f), c);
                aP(aeorVar, 0, c, 0, 2);
            }
            bwkVar.Y();
            ay(aenrVar.d, false, false, c, 0, 6);
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeol(aenrVar, aeomVar, i, 4, null);
        }
    }

    public static void O(aenr aenrVar, aeom aeomVar, aeoo aeooVar, float f, cga cgaVar, cit citVar, aeop aeopVar, bwj bwjVar, int i) {
        int i2;
        bwj bwjVar2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        cgaVar.getClass();
        int i10 = i & 14;
        bwj c = bwjVar.c(-1581516938);
        if (i10 == 0) {
            if (true != c.G(aenrVar)) {
                i9 = 2;
            } else {
                i9 = 4;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aeomVar)) {
                i8 = 16;
            } else {
                i8 = 32;
            }
            i2 |= i8;
        }
        if ((i & 896) == 0) {
            if (true != c.G(aeooVar)) {
                i7 = 128;
            } else {
                i7 = 256;
            }
            i2 |= i7;
        }
        if ((i & 7168) == 0) {
            if (true != c.D(f)) {
                i6 = 1024;
            } else {
                i6 = 2048;
            }
            i2 |= i6;
        }
        if ((57344 & i) == 0) {
            if (true != c.G(cgaVar)) {
                i5 = 8192;
            } else {
                i5 = 16384;
            }
            i2 |= i5;
        }
        if ((458752 & i) == 0) {
            if (true != c.G(citVar)) {
                i4 = 65536;
            } else {
                i4 = 131072;
            }
            i2 |= i4;
        }
        if ((3670016 & i) == 0) {
            if (true != c.G(aeopVar)) {
                i3 = 524288;
            } else {
                i3 = 1048576;
            }
            i2 |= i3;
        }
        int i11 = i2;
        if ((i11 & 2995931) == 599186 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            cga i12 = amh.i(cgaVar, brg.a, 8.0f, 1);
            ajw.e eVar = ajw.c;
            int i13 = cfq.a;
            cue a2 = akk.a(eVar, cfq.a.m, c, 0);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b2 = cfv.b(c, i12);
            int i14 = cwl.a;
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
            cfq.c cVar = cfq.a.l;
            cga.a aVar = cga.e;
            cue a4 = amq.a(ajw.a, cVar, c, 48);
            int a5 = bwg.a(c);
            byx P2 = bwkVar.P();
            cga b3 = cfv.b(c, aVar);
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
            amx.a(amv.l(cga.e, 8.0f), c);
            int i15 = i11 >> 3;
            bwjVar2 = c;
            aeke.M(aenrVar.c, aeooVar, f, false, cdk.e(-1229251129, new aepe(aenrVar, aeooVar, f, citVar, aeopVar, aeomVar, 0), c), bwjVar2, (i15 & 112) | 24576 | (i15 & 896), 8);
            bwjVar2.p();
            bwjVar2.p();
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new hmg(aenrVar, aeomVar, aeooVar, f, cgaVar, citVar, aeopVar, i, 2);
        }
    }

    public static Boolean P(byn bynVar) {
        return (Boolean) bynVar.a();
    }

    public static String Q(byn bynVar) {
        return (String) bynVar.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0395, code lost:
    
        if (r31.a.b.length() == 0) goto L279;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void R(defpackage.aenr r31, defpackage.aeom r32, defpackage.aeoa r33, boolean r34, defpackage.arqg r35, boolean r36, defpackage.aeoo r37, defpackage.cit r38, boolean r39, defpackage.aeop r40, defpackage.bwj r41, int r42) {
        /*
            Method dump skipped, instructions count: 1024
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adom.R(aenr, aeom, aeoa, boolean, arqg, boolean, aeoo, cit, boolean, aeop, bwj, int):void");
    }

    public static void S(aenr aenrVar, aeoa aeoaVar, aeoo aeooVar, float f, byn bynVar, bwj bwjVar, int i) {
        int i2;
        bwk bwkVar;
        int i3;
        bwj bwjVar2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i & 14;
        bwj c = bwjVar.c(1544238733);
        if (i9 == 0) {
            if (true != c.G(aenrVar)) {
                i8 = 2;
            } else {
                i8 = 4;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aeoaVar)) {
                i7 = 16;
            } else {
                i7 = 32;
            }
            i2 |= i7;
        }
        if ((i & 896) == 0) {
            if (true != c.G(aeooVar)) {
                i6 = 128;
            } else {
                i6 = 256;
            }
            i2 |= i6;
        }
        if ((i & 7168) == 0) {
            if (true != c.D(f)) {
                i5 = 1024;
            } else {
                i5 = 2048;
            }
            i2 |= i5;
        }
        if ((57344 & i) == 0) {
            if (true != c.G(bynVar)) {
                i4 = 8192;
            } else {
                i4 = 16384;
            }
            i2 |= i4;
        }
        if ((46811 & i2) == 9362 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            int i10 = cfq.a;
            cfq.b bVar = cfq.a.n;
            cga.a aVar = cga.e;
            cue a2 = akk.a(ajw.c, bVar, c, 48);
            int a3 = bwg.a(c);
            bwk bwkVar2 = (bwk) c;
            byx P = bwkVar2.P();
            cga b2 = cfv.b(c, aVar);
            int i11 = cwl.a;
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
            aenl aenlVar = aenrVar.e;
            c.y(1142503795);
            if (aenlVar != null) {
                bwkVar = bwkVar2;
                i3 = 48;
                aQ(aenlVar.a, aeooVar, null, true, c, ((i2 >> 3) & 112) | 3072, 4);
            } else {
                bwkVar = bwkVar2;
                i3 = 48;
            }
            bwkVar.Y();
            aeno aenoVar = aenrVar.a;
            c.y(1142509663);
            aeor aeorVar = aenoVar.f;
            if (aeorVar != null) {
                aP(aeorVar, 12, c, i3, 0);
                amx.a(amv.d(cga.e, 4.0f), c);
            }
            bwkVar.Y();
            bwjVar2 = c;
            T(aenrVar, aeoaVar, aeooVar, f, bynVar, c, i2 & 65534);
            bwjVar2.p();
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new aeoy(aenrVar, aeoaVar, aeooVar, f, bynVar, i, 0);
        }
    }

    public static void T(aenr aenrVar, aeoa aeoaVar, aeoo aeooVar, float f, byn bynVar, bwj bwjVar, int i) {
        int i2;
        boolean booleanValue;
        bwj bwjVar2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i & 14;
        bwj c = bwjVar.c(2049166182);
        boolean z = true;
        if (i8 == 0) {
            if (true != c.G(aenrVar)) {
                i7 = 2;
            } else {
                i7 = 4;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aeoaVar)) {
                i6 = 16;
            } else {
                i6 = 32;
            }
            i2 |= i6;
        }
        if ((i & 896) == 0) {
            if (true != c.G(aeooVar)) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i2 |= i5;
        }
        if ((i & 7168) == 0) {
            if (true != c.D(f)) {
                i4 = 1024;
            } else {
                i4 = 2048;
            }
            i2 |= i4;
        }
        if ((57344 & i) == 0) {
            if (true != c.G(bynVar)) {
                i3 = 8192;
            } else {
                i3 = 16384;
            }
            i2 |= i3;
        }
        if ((46811 & i2) == 9362 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            aeoi aeoiVar = aenrVar.d;
            c.y(-553353048);
            int i9 = i2 & 14;
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (i9 == 4 || T == bwj.a.a) {
                T = new byu(Boolean.valueOf(aenrVar.a()), cav.a);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            boolean z2 = aeoaVar.g;
            booleanValue = ((Boolean) ((byn) T).a()).booleanValue();
            aeoi aeoiVar2 = aenrVar.d;
            aenz aenzVar = aeoaVar.h;
            aepp aeppVar = aeoaVar.b;
            if (aeppVar != null) {
                z = aeppVar.b;
            }
            long aY = aY(z2, aeoiVar.g.b, booleanValue, aeoiVar2.g.c, aeooVar, f, aenzVar.b, z, c);
            bwjVar2 = c;
            bqv.c(null, awh.a, aY, 0L, brg.a, brg.a, null, cdk.e(-889257365, new keh(aenrVar, aeoaVar, bynVar, 11, (char[]) null), c), bwjVar2, 121);
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new aeoy(aenrVar, aeoaVar, aeooVar, f, bynVar, i, 2);
        }
    }

    public static void U(String str, boolean z, arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        boolean z2;
        String str2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(-467242085);
        if (i6 == 0) {
            if (true != c.G(str)) {
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
            if (true != c.I(arqgVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            c.y(-809233566);
            boolean z3 = false;
            if ((i2 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i2 & 112) == 32) {
                z3 = true;
            }
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if ((z2 | z3) || T == bwj.a.a) {
                if (true != z) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                T = new byu(str2, cav.a);
                bwkVar.ad(T);
            }
            byn bynVar = (byn) T;
            bwkVar.Y();
            ws.a(Q(bynVar), null, null, "hint_text_crossfade", cdk.e(-1484721379, new ifo(arqgVar, bynVar, 10), c), c, 27648, 6);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jyn(str, z, arqgVar, i, 9);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v5 ??, still in use, count: 1, list:
          (r9v5 ?? I:java.lang.Object) from 0x0365: INVOKE (r11v3 ?? I:bwk), (r9v5 ?? I:java.lang.Object) VIRTUAL call: bwk.ad(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:870)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public static void V(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v5 ??, still in use, count: 1, list:
          (r9v5 ?? I:java.lang.Object) from 0x0365: INVOKE (r11v3 ?? I:bwk), (r9v5 ?? I:java.lang.Object) VIRTUAL call: bwk.ad(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:870)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r34v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public static void W(byn bynVar, Boolean bool) {
        bynVar.h(bool);
    }

    public static void X(aenr aenrVar, aeom aeomVar, aeoa aeoaVar, aeoo aeooVar, float f, boolean z, cga cgaVar, cit citVar, boolean z2, boolean z3, aeop aeopVar, bwj bwjVar, int i, int i2) {
        int i3;
        int i4;
        bwk bwkVar;
        cga d;
        cgaVar.getClass();
        int i5 = i & 14;
        bwj c = bwjVar.c(-1788493171);
        if (i5 == 0) {
            i3 = (true != c.G(aenrVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= true != c.G(aeomVar) ? 16 : 32;
        }
        if ((i & 896) == 0) {
            i3 |= true != c.G(aeoaVar) ? 128 : 256;
        }
        if ((i & 7168) == 0) {
            i3 |= true != c.G(aeooVar) ? 1024 : 2048;
        }
        if ((i & 57344) == 0) {
            i3 |= true != c.D(f) ? 8192 : 16384;
        }
        if ((458752 & i) == 0) {
            i3 |= true != c.H(z) ? 65536 : 131072;
        }
        if ((3670016 & i) == 0) {
            i3 |= true != c.G(cgaVar) ? 524288 : 1048576;
        }
        if ((29360128 & i) == 0) {
            i3 |= true != c.G(citVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((234881024 & i) == 0) {
            i3 |= true != c.H(z2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((1879048192 & i) == 0) {
            i3 |= true != c.H(z3) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        int i6 = i3;
        if ((i2 & 14) == 0) {
            i4 = i2 | (true != c.G(aeopVar) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i6 & 1533916891) == 306783378 && (i4 & 11) == 2 && c.L()) {
            c.v();
        } else {
            c.y(-272488039);
            bwk bwkVar2 = (bwk) c;
            Object T = bwkVar2.T();
            if (T == bwj.a.a) {
                byu byuVar = new byu(false, cav.a);
                bwkVar2.ad(byuVar);
                T = byuVar;
            }
            byn bynVar = (byn) T;
            bwkVar2.Y();
            c.y(-272486304);
            if (((Boolean) bynVar.a()).booleanValue()) {
                aepp aeppVar = aeoaVar.b;
                if (aeppVar != null) {
                    bwkVar = bwkVar2;
                    ak(aeppVar.a, aeppVar.c, aeooVar, f, cgaVar, c, ((i6 >> 3) & 8064) | ((i6 >> 6) & 57344));
                } else {
                    throw new IllegalArgumentException("No way to handle recording events.");
                }
            } else {
                bwkVar = bwkVar2;
            }
            int i7 = i6 >> 3;
            int i8 = i6 >> 6;
            int i9 = i7 & 7168;
            int i10 = i7 & 896;
            bwkVar.Y();
            if (((Boolean) bynVar.a()).booleanValue()) {
                d = amv.h(cga.e, brg.a);
            } else {
                d = amh.d(cgaVar, 8.0f);
            }
            int i11 = cfq.a;
            cue a2 = amq.a(ajw.a, cfq.a.l, c, 48);
            int a3 = bwg.a(c);
            byx P = bwkVar.P();
            cga b2 = cfv.b(c, d);
            int i12 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            bwk bwkVar3 = bwkVar;
            if (bwkVar3.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a2, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar3.y || !d.F(bwkVar3.T(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                bwkVar3.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b2, cwl.a.c);
            aeke.K(amu.a, aeooVar, f, cdk.e(441331504, new aepb(aenrVar, aeoaVar, aeomVar, citVar, z, aeooVar, f, z2, z3, aeopVar), c), c, (i8 & 112) | 3078 | (i8 & 896));
            amx.a(amv.l(cga.e, 8.0f), c);
            S(aenrVar, aeoaVar, aeooVar, f, bynVar, c, (i6 & 14) | 24576 | (i7 & 112) | i10 | i9);
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aepc(aenrVar, aeomVar, aeoaVar, aeooVar, f, z, cgaVar, citVar, z2, z3, aeopVar, i, i2);
        }
    }

    public static void Y(aenr aenrVar, cit citVar, Boolean bool, boolean z, aeop aeopVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i & 14;
        bwj c = bwjVar.c(1782151499);
        if (i9 == 0) {
            if (true != c.G(aenrVar)) {
                i8 = 2;
            } else {
                i8 = 4;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(citVar)) {
                i7 = 16;
            } else {
                i7 = 32;
            }
            i2 |= i7;
        }
        if ((i & 896) == 0) {
            if (true != c.G(bool)) {
                i6 = 128;
            } else {
                i6 = 256;
            }
            i2 |= i6;
        }
        if ((i & 7168) == 0) {
            if (true != c.H(z)) {
                i5 = 1024;
            } else {
                i5 = 2048;
            }
            i2 |= i5;
        }
        if ((i & 57344) == 0) {
            if (true != c.D(1.0f)) {
                i4 = 8192;
            } else {
                i4 = 16384;
            }
            i2 |= i4;
        }
        if ((i & 458752) == 0) {
            if (true != c.G(aeopVar)) {
                i3 = 65536;
            } else {
                i3 = 131072;
            }
            i2 |= i3;
        }
        if ((374491 & i2) == 74898 && c.L()) {
            c.v();
        } else {
            cga.a aVar = cga.e;
            ajw.e eVar = ajw.c;
            int i10 = cfq.a;
            cue a2 = akk.a(eVar, cfq.a.m, c, 0);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b2 = cfv.b(c, aVar);
            int i11 = cwl.a;
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
            cga i12 = amh.i(cga.e, 16.0f, brg.a, 2);
            cue a4 = amq.a(ajw.a, cfq.a.j, c, 0);
            int a5 = bwg.a(c);
            byx P2 = bwkVar.P();
            cga b3 = cfv.b(c, i12);
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
            int i13 = i2 << 3;
            int i14 = i2 << 6;
            int i15 = i2 << 9;
            aO(amu.a, aenrVar, citVar, null, bool, z, true, 1.0f, aeopVar, c, (i13 & 896) | (i13 & 112) | 1572870 | (57344 & i14) | (i14 & 458752) | (29360128 & i15) | (i15 & 234881024), 4);
            c.p();
            c.y(-1714372222);
            if (aenrVar.a.b.length() > 0 || z) {
                ahji.V(null, brg.a, bX(c).u, c, 0, 3);
            }
            bwkVar.Y();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeod(aenrVar, citVar, bool, z, aeopVar, i, 3);
        }
    }

    public static void Z(aenr aenrVar, aeom aeomVar, aeoa aeoaVar, aeoo aeooVar, float f, boolean z, boolean z2, cga cgaVar, cit citVar, aeop aeopVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        boolean z3;
        cga h;
        boolean z4;
        boolean G;
        Object T;
        boolean booleanValue;
        bwj bwjVar2;
        boolean booleanValue2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        cgaVar.getClass();
        int i14 = i & 14;
        bwj c = bwjVar.c(-719282317);
        if (i14 == 0) {
            if (true != c.G(aenrVar)) {
                i13 = 2;
            } else {
                i13 = 4;
            }
            i2 = i13 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aeomVar)) {
                i12 = 16;
            } else {
                i12 = 32;
            }
            i2 |= i12;
        }
        if ((i & 896) == 0) {
            if (true != c.G(aeoaVar)) {
                i11 = 128;
            } else {
                i11 = 256;
            }
            i2 |= i11;
        }
        if ((i & 7168) == 0) {
            if (true != c.G(aeooVar)) {
                i10 = 1024;
            } else {
                i10 = 2048;
            }
            i2 |= i10;
        }
        if ((i & 57344) == 0) {
            if (true != c.D(f)) {
                i9 = 8192;
            } else {
                i9 = 16384;
            }
            i2 |= i9;
        }
        if ((i & 458752) == 0) {
            if (true != c.H(z)) {
                i8 = 65536;
            } else {
                i8 = 131072;
            }
            i2 |= i8;
        }
        if ((3670016 & i) == 0) {
            if (true != c.H(z2)) {
                i7 = 524288;
            } else {
                i7 = 1048576;
            }
            i2 |= i7;
        }
        if ((29360128 & i) == 0) {
            if (true != c.G(cgaVar)) {
                i6 = 4194304;
            } else {
                i6 = VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
            }
            i2 |= i6;
        }
        if ((234881024 & i) == 0) {
            if (true != c.G(citVar)) {
                i5 = VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
            } else {
                i5 = VCardConfig.FLAG_APPEND_TYPE_PARAM;
            }
            i2 |= i5;
        }
        if ((1879048192 & i) == 0) {
            if (true != c.G(aeopVar)) {
                i4 = VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
            } else {
                i4 = 536870912;
            }
            i2 |= i4;
        }
        int i15 = i2;
        if ((1533916891 & i15) == 306783378 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            c.y(-272519432);
            bwk bwkVar = (bwk) c;
            Object T2 = bwkVar.T();
            if (T2 == bwj.a.a) {
                byu byuVar = new byu(false, cav.a);
                bwkVar.ad(byuVar);
                T2 = byuVar;
            }
            byn bynVar = (byn) T2;
            bwkVar.Y();
            c.y(-272517697);
            if (((Boolean) bynVar.a()).booleanValue()) {
                aepp aeppVar = aeoaVar.b;
                if (aeppVar != null) {
                    int i16 = i15 >> 3;
                    int i17 = (i15 >> 9) & 57344;
                    i3 = i15;
                    ak(aeppVar.a, aeppVar.c, aeooVar, f, cgaVar, c, (i16 & 8064) | i17);
                } else {
                    throw new IllegalArgumentException("No way to handle recording events.");
                }
            } else {
                i3 = i15;
            }
            bwkVar.Y();
            if (!((Boolean) bynVar.a()).booleanValue()) {
                z3 = true;
                h = amh.i(cgaVar, brg.a, 8.0f, 1);
            } else {
                z3 = true;
                h = amv.h(cga.e, brg.a);
            }
            ajw.e eVar = ajw.c;
            int i18 = cfq.a;
            cue a2 = akk.a(eVar, cfq.a.m, c, 0);
            int a3 = bwg.a(c);
            byx P = bwkVar.P();
            cga b2 = cfv.b(c, h);
            int i19 = cwl.a;
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
            cfq.c cVar = cfq.a.l;
            cga.a aVar = cga.e;
            cue a4 = amq.a(ajw.a, cVar, c, 48);
            int a5 = bwg.a(c);
            byx P2 = bwkVar.P();
            cga b3 = cfv.b(c, aVar);
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
            aeno aenoVar = aenrVar.a;
            c.y(-1914437439);
            CharSequence charSequence = aenoVar.b;
            boolean G2 = c.G(charSequence);
            Object T3 = bwkVar.T();
            if (G2 || T3 == bwj.a.a) {
                byu byuVar2 = new byu(false, cav.a);
                bwkVar.ad(byuVar2);
                T3 = byuVar2;
            }
            byn bynVar2 = (byn) T3;
            bwkVar.Y();
            c.y(-1914434954);
            Object T4 = bwkVar.T();
            if (T4 == bwj.a.a) {
                byu byuVar3 = new byu(false, cav.a);
                bwkVar.ad(byuVar3);
                T4 = byuVar3;
            }
            byn bynVar3 = (byn) T4;
            bwkVar.Y();
            if (charSequence.length() > 0) {
                booleanValue2 = ((Boolean) bynVar2.a()).booleanValue();
                if (!booleanValue2) {
                    z4 = z3;
                    c.y(-1914430609);
                    G = c.G(bynVar2);
                    T = bwkVar.T();
                    if (!G || T == bwj.a.a) {
                        T = new aeot(bynVar2, 0);
                        bwkVar.ad(T);
                    }
                    bwkVar.Y();
                    booleanValue = ((Boolean) bynVar3.a()).booleanValue();
                    ab(z4, (arqg) T, aeoaVar, booleanValue, aenrVar, aeopVar, c, (i3 & 896) | ((i3 << 12) & 57344) | ((i3 >> 12) & 458752));
                    bwjVar2 = c;
                    int i20 = i3 >> 6;
                    aeke.M(aenrVar.c, aeooVar, f, false, cdk.e(-1843359870, new aeou(aenrVar, z, aeooVar, f, citVar, aeopVar, aeomVar, aeoaVar, bynVar, z2, bynVar3), bwjVar2), bwjVar2, (i20 & 112) | 24576 | (i20 & 896), 8);
                    bwjVar2.p();
                    bwjVar2.p();
                }
            }
            z4 = false;
            c.y(-1914430609);
            G = c.G(bynVar2);
            T = bwkVar.T();
            if (!G) {
            }
            T = new aeot(bynVar2, 0);
            bwkVar.ad(T);
            bwkVar.Y();
            booleanValue = ((Boolean) bynVar3.a()).booleanValue();
            ab(z4, (arqg) T, aeoaVar, booleanValue, aenrVar, aeopVar, c, (i3 & 896) | ((i3 << 12) & 57344) | ((i3 >> 12) & 458752));
            bwjVar2 = c;
            int i202 = i3 >> 6;
            aeke.M(aenrVar.c, aeooVar, f, false, cdk.e(-1843359870, new aeou(aenrVar, z, aeooVar, f, citVar, aeopVar, aeomVar, aeoaVar, bynVar, z2, bynVar3), bwjVar2), bwjVar2, (i202 & 112) | 24576 | (i202 & 896), 8);
            bwjVar2.p();
            bwjVar2.p();
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new aeov(aenrVar, aeomVar, aeoaVar, aeooVar, f, z, z2, cgaVar, citVar, aeopVar, i);
        }
    }

    public static void a(Context context, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.ims.provisioning.engine.update_provisioning_status_key", i - 1);
        adjk.c(context, 11, bundle);
    }

    public static void aA(aeoi aeoiVar, bwj bwjVar, int i) {
        int i2;
        long f;
        long j;
        long j2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(2025191757);
        boolean z = true;
        if (i4 == 0) {
            if (true != c.G(aeoiVar)) {
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
            aeoh aeohVar = aeoiVar.g;
            cga c2 = amd.c(cga.e, 1.0f, brg.a, 2);
            if (aeoiVar.e != null) {
                c2 = c2.a(amd.c(cga.e, brg.a, -4.0f, 1));
            }
            cga bh = aeke.bh(c2, (drk) c.g(dch.i));
            cor bg = aeke.bg(aeoiVar.a, c);
            String str = aeoiVar.d;
            c.y(818332414);
            if (str == null) {
                str = dga.a(R.string.compose_icon_send_content_description, c);
            }
            boolean z2 = aeohVar.c;
            bwk bwkVar = (bwk) c;
            bwkVar.Y();
            if (aeoiVar.f) {
                c.y(-401371499);
                if (z2) {
                    c.y(-401333276);
                    j = bmp.a(c).b;
                    bwkVar.Y();
                } else {
                    c.y(-401270842);
                    long j3 = bmp.a(c).a;
                    bwkVar.Y();
                    z = false;
                    j = j3;
                }
                bwkVar.Y();
            } else {
                c.y(-401196597);
                if (z2) {
                    c.y(-401159552);
                    j = ckw.f(cku.d(r5), cku.c(r5), cku.b(r5), bfw.b(c), cku.f(bmp.a(c).b));
                    bwkVar.Y();
                } else {
                    c.y(-401061344);
                    f = ckw.f(cku.d(r7), cku.c(r7), cku.b(r7), bfw.b(c), cku.f(bmp.a(c).q));
                    bwkVar.Y();
                    z = false;
                    j = f;
                }
                bwkVar.Y();
            }
            boolean z3 = z;
            ahji.N(bg, str, bh, j, c, 8, 0);
            String str2 = aeoiVar.e;
            if (str2 != null) {
                cga aP = aetn.aP(amd.b(cga.e, 1.0f, 10.0f));
                dje djeVar = ca(c).e;
                if (z3) {
                    c.y(-1702829403);
                    j2 = bmp.a(c).b;
                    bwkVar.Y();
                } else {
                    c.y(-1702766969);
                    j2 = bmp.a(c).a;
                    bwkVar.Y();
                }
                cq(str2, aP, j2, null, 0, 0, djeVar, c, 0, 56);
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelf(aeoiVar, i, 12);
        }
    }

    public static void aB(boolean z, boolean z2, cga cgaVar, aepi aepiVar, bwj bwjVar, int i) {
        int i2;
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i & 14;
        bwj c = bwjVar.c(1176073398);
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
            if (true != c.H(z2)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (true != c.G(cgaVar)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (true != c.G(aepiVar)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) == 1170 && c.L()) {
            c.v();
        } else {
            cor bg = aeke.bg(aerb.ar, c);
            String aV = aV(aenw.f, z2, c);
            if (!z) {
                c.y(-2101505438);
                j = ckw.f(cku.d(r1), cku.c(r1), cku.b(r1), bfw.b(c), cku.f(bmp.a(c).q));
                ((bwk) c).Y();
            } else if (z2) {
                c.y(-2101389188);
                int ordinal = aepiVar.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        c.y(-2145988626);
                        j = bmp.a(c).a;
                        ((bwk) c).Y();
                    } else {
                        c.y(-2145990321);
                        j = bmp.a(c).j;
                        ((bwk) c).Y();
                    }
                } else {
                    c.y(-2145993419);
                    j = bmp.a(c).e;
                    ((bwk) c).Y();
                }
                ((bwk) c).Y();
            } else {
                c.y(-2101097695);
                int ordinal2 = aepiVar.ordinal();
                if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        c.y(-2145978665);
                        j = bmp.a(c).s;
                        ((bwk) c).Y();
                    } else {
                        c.y(-2145980710);
                        j = bmp.a(c).m;
                        ((bwk) c).Y();
                    }
                } else {
                    c.y(-2145984048);
                    j = bmp.a(c).b;
                    ((bwk) c).Y();
                }
                ((bwk) c).Y();
            }
            ahji.N(bg, aV, cgaVar, j, c, (i2 & 896) | 8, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeog(z, z2, cgaVar, aepiVar, i, 0);
        }
    }

    public static void aC(arqg arqgVar, arqg arqgVar2, boolean z, cga cgaVar, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        aev a2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i & 14;
        bwj c = bwjVar.c(-1959351197);
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
        if ((i & 112) == 0) {
            if (true != c.I(arqgVar2)) {
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
            if (true != c.G(cgaVar)) {
                i4 = 1024;
            } else {
                i4 = 2048;
            }
            i2 |= i4;
        }
        if ((57344 & i) == 0) {
            if (true != c.I(arqwVar)) {
                i3 = 8192;
            } else {
                i3 = 16384;
            }
            i2 |= i3;
        }
        int i9 = i2;
        if ((46811 & i9) == 9362 && c.L()) {
            c.v();
        } else {
            cga a3 = chk.a(amv.h(bmi.a(cgaVar), 40.0f), awh.a);
            c.y(-185300699);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = new ajs();
                bwkVar.ad(T);
            }
            ajr ajrVar = (ajr) T;
            bwkVar.Y();
            c.y(-185298118);
            if (((Boolean) bY(c).a.a()).booleanValue()) {
                a2 = bon.a(false, 20.0f, 0L, 4);
            } else {
                a2 = biy.a(false, 20.0f, c, 54, 4);
            }
            aev aevVar = a2;
            bwkVar.Y();
            dgv dgvVar = new dgv(0);
            c.y(-185304177);
            int i10 = i9 & 112;
            Object T2 = bwkVar.T();
            if (i10 == 32 || T2 == bwj.a.a) {
                T2 = new abcv(arqgVar2, 19);
                bwkVar.ad(T2);
            }
            bwkVar.Y();
            cga e = adw.e(a3, ajrVar, aevVar, z, dgvVar, (arqg) T2, null, arqgVar, 424);
            int i11 = cfq.a;
            int i12 = (i9 >> 3) & 7168;
            cue a4 = akc.a(cfq.a.e, false);
            int a5 = bwg.a(c);
            byx P = bwkVar.P();
            cga b2 = cfv.b(c, e);
            int i13 = cwl.a;
            arqg arqgVar3 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar3);
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
            caw.b(c, b2, cwl.a.c);
            arqwVar.a(akf.a, c, Integer.valueOf((((i12 | 48) >> 6) & 112) | 6));
            c.p();
        }
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new aeod(arqgVar, arqgVar2, z, cgaVar, arqwVar, i, 2);
        }
    }

    public static void aD(aenm aenmVar, float f, bwj bwjVar, int i) {
        int i2;
        long j;
        cga c;
        cga b2;
        int i3;
        int i4;
        aenmVar.getClass();
        int i5 = i & 14;
        bwj c2 = bwjVar.c(-2138478046);
        if (i5 == 0) {
            if (true != c2.G(aenmVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.D(f)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c2.L()) {
            c2.v();
            bzz e = c2.e();
            if (e != null) {
                ((bzf) e).d = new aeud(aenmVar, f, i, 1);
                return;
            }
            return;
        }
        cga.a aVar = cga.e;
        if (bX(c2).m) {
            c2.y(-94821790);
            j = aW(aeoo.a, f, c2);
            ((bwk) c2).Y();
        } else {
            c2.y(-94628009);
            j = bmp.a(c2).G;
            ((bwk) c2).Y();
        }
        c = amv.c(adf.a(amh.f(adf.a(aVar, j, awh.c(24.0f, 24.0f, brg.a, brg.a, 12)), 8.0f, 8.0f, 8.0f, brg.a), bmp.a(c2).n, awh.b(16.0f, 16.0f, 8.0f, 8.0f)), 1.0f);
        cga a2 = dea.a(c, "Compose:Draft:Header:ReplySnippet");
        ajw.b bVar = ajw.a;
        int i6 = cfq.a;
        cue a3 = amq.a(bVar, cfq.a.j, c2, 0);
        int a4 = bwg.a(c2);
        bwk bwkVar = (bwk) c2;
        byx P = bwkVar.P();
        cga b3 = cfv.b(c2, a2);
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
        caw.b(c2, b3, cwl.a.c);
        b2 = amu.a.b(amh.j(cga.e, 12.0f, 12.0f, brg.a, 12.0f, 4), 1.0f, true);
        cga aO = aetn.aO(b2);
        cue a5 = amq.a(ajw.a, cfq.a.j, c2, 0);
        int a6 = bwg.a(c2);
        byx P2 = bwkVar.P();
        cga b4 = cfv.b(c2, aO);
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
        caw.b(c2, b4, cwl.a.c);
        throw null;
    }

    public static void aE(aeoq aeoqVar, cga cgaVar, cit citVar, bwj bwjVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        aeoqVar.getClass();
        int i6 = i2 & 1;
        bwj c = bwjVar.c(-11901093);
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (true != c.G(aeoqVar)) {
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
        if ((i & 896) == 0) {
            int i8 = 128;
            if ((i2 & 4) == 0 && c.G(citVar)) {
                i8 = 256;
            }
            i3 |= i8;
        }
        if ((i3 & 731) == 146 && c.L()) {
            c.v();
        } else {
            int i9 = i2 & 4;
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
                if (i9 != 0) {
                    i3 &= -897;
                }
            } else {
                if (i7 != 0) {
                    cgaVar = cga.e;
                }
                if (i9 != 0) {
                    i3 &= -897;
                    citVar = cit.a;
                }
            }
            c.n();
            aeop aeopVar = aeoqVar.g;
            int i10 = i3 & 1022;
            if (!aeopVar.c && !aeopVar.a) {
                c.y(-653345121);
                aeke.N(aeoqVar, cgaVar, citVar, c, i10);
                ((bwk) c).Y();
            } else {
                c.y(-653405633);
                aeke.L(aeoqVar, cgaVar, citVar, c, i10);
                ((bwk) c).Y();
            }
        }
        cga cgaVar2 = cgaVar;
        cit citVar2 = citVar;
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeob(aeoqVar, cgaVar2, citVar2, i, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void aF(defpackage.aenv r11, defpackage.cku r12, defpackage.cku r13, boolean r14, defpackage.bwj r15, int r16, int r17) {
        /*
            r1 = r11
            r4 = r14
            r5 = r16
            r11.getClass()
            r0 = r17 & 1
            r2 = 1089545809(0x40f12651, float:7.5359273)
            r3 = r15
            bwj r2 = r15.c(r2)
            r3 = 1
            if (r0 == 0) goto L17
            r0 = r5 | 6
            goto L27
        L17:
            r0 = r5 & 14
            if (r0 != 0) goto L26
            boolean r0 = r2.G(r11)
            if (r3 == r0) goto L23
            r0 = 2
            goto L24
        L23:
            r0 = 4
        L24:
            r0 = r0 | r5
            goto L27
        L26:
            r0 = r5
        L27:
            r6 = r17 & 2
            if (r6 == 0) goto L2e
            r0 = r0 | 48
            goto L40
        L2e:
            r7 = r5 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L40
            r7 = r12
            boolean r8 = r2.G(r12)
            if (r3 == r8) goto L3c
            r8 = 16
            goto L3e
        L3c:
            r8 = 32
        L3e:
            r0 = r0 | r8
            goto L41
        L40:
            r7 = r12
        L41:
            r8 = r17 & 4
            if (r8 == 0) goto L48
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L5a
        L48:
            r9 = r5 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L5a
            r9 = r13
            boolean r10 = r2.G(r13)
            if (r3 == r10) goto L56
            r10 = 128(0x80, float:1.8E-43)
            goto L58
        L56:
            r10 = 256(0x100, float:3.59E-43)
        L58:
            r0 = r0 | r10
            goto L5b
        L5a:
            r9 = r13
        L5b:
            r10 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L6b
            boolean r10 = r2.H(r14)
            if (r3 == r10) goto L68
            r3 = 1024(0x400, float:1.435E-42)
            goto L6a
        L68:
            r3 = 2048(0x800, float:2.87E-42)
        L6a:
            r0 = r0 | r3
        L6b:
            r0 = r0 & 5851(0x16db, float:8.199E-42)
            r3 = 1170(0x492, float:1.64E-42)
            if (r0 != r3) goto L7d
            boolean r0 = r2.L()
            if (r0 != 0) goto L78
            goto L7d
        L78:
            r2.v()
        L7b:
            r3 = r9
            goto L9d
        L7d:
            r0 = 0
            if (r6 == 0) goto L81
            r7 = r0
        L81:
            if (r8 == 0) goto L84
            r9 = r0
        L84:
            r0 = 2131427708(0x7f0b017c, float:1.847704E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            aent r3 = new aent
            r3.<init>(r7, r11, r9, r14)
            r6 = 1578440336(0x5e151690, float:2.685733E18)
            cdi r3 = defpackage.cdk.e(r6, r3, r2)
            r6 = 48
            defpackage.aeke.aH(r0, r3, r2, r6)
            goto L7b
        L9d:
            bzz r8 = r2.e()
            if (r8 == 0) goto Lb6
            aenf r9 = new aenf
            r10 = 2
            r0 = r9
            r1 = r11
            r2 = r7
            r4 = r14
            r5 = r16
            r6 = r17
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            bzf r8 = (defpackage.bzf) r8
            r8.d = r9
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adom.aF(aenv, cku, cku, boolean, bwj, int, int):void");
    }

    public static void aG(amt amtVar, String str, cku ckuVar, bwj bwjVar, int i) {
        int i2;
        cga b2;
        long j;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(-1960382197);
        if (i6 == 0) {
            if (true != c.G(amtVar)) {
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
            if (true != c.G(ckuVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !c.L()) {
            b2 = amtVar.b(amh.j(cga.e, 16.0f, brg.a, brg.a, brg.a, 14), 1.0f, true);
            cga a2 = dea.a(b2, "Compose:Draft:Header:Text");
            dje djeVar = bmp.d(c).n;
            c.y(-1052421680);
            if (ckuVar == null) {
                j = bmp.a(c).a;
            } else {
                j = ckuVar.i;
            }
            ((bwk) c).Y();
            ahji.e(str, a2, j, 0L, 0L, null, 0L, 2, false, 1, 0, null, djeVar, c, (i2 >> 3) & 14, 3120, 55288);
        } else {
            c.v();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelx(amtVar, str, ckuVar, i, 5, (char[]) null);
        }
    }

    public static /* synthetic */ void aH(arqg arqgVar, boolean z, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(-133568541);
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
            if (true != c.G(null)) {
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
            cga cgaVar = cga.e;
            if (z) {
                cgaVar = amh.j(cga.e, brg.a, brg.a, 4.0f, brg.a, 11);
            }
            ahji.P(arqgVar, cgaVar, false, null, null, cdk.e(-1098929663, new aahl(19), c), c, (i2 & 14) | 1572864, 60);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelm(arqgVar, z, i, 4);
        }
    }

    public static /* synthetic */ void aI(cku ckuVar, arqg arqgVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i & 14;
        bwj c2 = bwjVar.c(-1340852569);
        if (i7 == 0) {
            if (true != c2.G(ckuVar)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.I(arqgVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (true != c2.H(false)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (true != c2.I(arqvVar)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) != 1170 || !c2.L()) {
            c = amv.c(cga.e, 1.0f);
            cga q = amv.q(c, 48.0f, brg.a, 2);
            c2.y(-950919225);
            if (ckuVar == null) {
                j = bmp.a(c2).c;
            } else {
                j = ckuVar.i;
            }
            bwk bwkVar = (bwk) c2;
            bwkVar.Y();
            awg c3 = awh.c(24.0f, 24.0f, brg.a, brg.a, 12);
            c2.y(-950912195);
            bwkVar.Y();
            c2.y(586626577);
            bqv.d(arqgVar, q, false, c3, j, 0L, brg.a, null, null, arqvVar, c2, 996);
            bwkVar.Y();
        } else {
            c2.v();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new aelx(ckuVar, arqgVar, arqvVar, i, 4, (byte[]) null);
        }
    }

    public static aenw aJ(byn bynVar) {
        return (aenw) bynVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void aK(defpackage.aenk r26, boolean r27, defpackage.aeoo r28, float r29, java.lang.String r30, defpackage.bwj r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adom.aK(aenk, boolean, aeoo, float, java.lang.String, bwj, int, int):void");
    }

    public static void aL(aenk aenkVar, boolean z, aeoo aeooVar, float f, bwj bwjVar, int i) {
        int i2;
        boolean z2;
        Integer num;
        afv afvVar;
        cga c;
        cga d;
        amj h;
        bwj bwjVar2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i & 14;
        bwj c2 = bwjVar.c(-1315329833);
        if (i7 == 0) {
            if (true != c2.G(aenkVar)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.H(z)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (true != c2.G(aeooVar)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (true != c2.D(f)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) == 1170 && c2.L()) {
            c2.v();
            bwjVar2 = c2;
        } else {
            c2.y(1910195968);
            bwk bwkVar = (bwk) c2;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = new bys(0);
                bwkVar.ad(T);
            }
            byk bykVar = (byk) T;
            bwkVar.Y();
            afv b2 = afs.b(c2, 0);
            Integer valueOf = Integer.valueOf(aenkVar.a.size());
            c2.y(1910199648);
            if ((i2 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean G = z2 | c2.G(b2);
            Object T2 = bwkVar.T();
            if (!G && T2 != bwj.a.a) {
                num = valueOf;
                afvVar = b2;
            } else {
                num = valueOf;
                afvVar = b2;
                aemw aemwVar = new aemw(aenkVar, b2, bykVar, (arpe) null, 0);
                bwkVar.ad(aemwVar);
                T2 = aemwVar;
            }
            bwkVar.Y();
            bxl.g(num, (arqv) T2, c2);
            c = amv.c(cga.e, 1.0f);
            d = afs.d(c, afvVar, false, true, false);
            if (aenkVar.a.isEmpty()) {
                h = new amk(brg.a, brg.a, brg.a, brg.a);
            } else {
                h = amh.h(16.0f, 12.0f, 12.0f, brg.a, 8);
            }
            cga c3 = amh.c(d, h);
            ajw.b bVar = ajw.a;
            int i8 = cfq.a;
            cue a2 = amq.a(bVar, cfq.a.j, c2, 0);
            int a3 = bwg.a(c2);
            byx P = bwkVar.P();
            cga b3 = cfv.b(c2, c3);
            int i9 = cwl.a;
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
                Integer valueOf2 = Integer.valueOf(a3);
                bwkVar.ad(valueOf2);
                c2.j(valueOf2, arqvVar);
            }
            caw.b(c2, b3, cwl.a.c);
            c2.y(-1518383702);
            int i10 = 0;
            for (Object obj : aenkVar.a) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    aqjn.G();
                }
                aejt aejtVar = (aejt) obj;
                String format = String.format(dga.a(R.string.compose_remove_button_content_description, c2), Arrays.copyOf(new Object[]{aejtVar.c()}, 1));
                format.getClass();
                c2.y(-1244993355);
                boolean E = z2 | c2.E(i10);
                Object T3 = bwkVar.T();
                if (E || T3 == bwj.a.a) {
                    T3 = new aems(aenkVar, i10, 4);
                    bwkVar.ad(T3);
                }
                bwkVar.Y();
                aehx aehxVar = new aehx(format, (arqg) T3);
                c2.y(-1244984364);
                boolean E2 = z2 | c2.E(i10);
                Object T4 = bwkVar.T();
                if (E2 || T4 == bwj.a.a) {
                    T4 = new aems(aenkVar, i10, 5);
                    bwkVar.ad(T4);
                }
                arqg arqgVar2 = (arqg) T4;
                bwkVar.Y();
                c2.y(-1244982792);
                boolean E3 = z2 | c2.E(i10);
                Object T5 = bwkVar.T();
                if (E3 || T5 == bwj.a.a) {
                    T5 = new aems(aenkVar, i10, 6);
                    bwkVar.ad(T5);
                }
                bwkVar.Y();
                aetn.az(new aekk(aehxVar, arqgVar2, (arqg) T5, (aejtVar instanceof aejo) & z), null, new cku(aW(aeooVar, f, c2)), cdk.e(-986761395, new aelu(aejtVar, 5), c2), c2, 3072);
                i10 = i11;
                bwkVar = bwkVar;
            }
            bwjVar2 = c2;
            bwkVar.Y();
            bwjVar2.p();
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new aemx(aenkVar, z, aeooVar, f, i);
        }
    }

    public static void aM(CharSequence charSequence, aeoa aeoaVar, boolean z, boolean z2, aeop aeopVar, bwj bwjVar, int i, int i2) {
        boolean z3;
        aenw aenwVar;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean booleanValue;
        boolean booleanValue2;
        boolean booleanValue3;
        bwj c = bwjVar.c(-956323864);
        c.y(-675056720);
        boolean G = c.G(charSequence);
        int i3 = (i & 112) ^ 48;
        boolean z8 = false;
        if ((i3 > 32 && c.G(aeoaVar)) || (i & 48) == 32) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z9 = G | z3;
        bwk bwkVar = (bwk) c;
        Object T = bwkVar.T();
        if (z9 || T == bwj.a.a) {
            if (charSequence.length() == 0 && aeoaVar.d.b) {
                aenwVar = aenw.b;
            } else {
                aenwVar = aenw.a;
            }
            byu byuVar = new byu(aenwVar, cav.a);
            bwkVar.ad(byuVar);
            T = byuVar;
        }
        byn bynVar = (byn) T;
        bwkVar.Y();
        c.y(-675048423);
        boolean G2 = c.G(charSequence);
        if ((i3 > 32 && c.G(aeoaVar)) || (i & 48) == 32) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z10 = G2 | z4;
        Object T2 = bwkVar.T();
        if (z10 || T2 == bwj.a.a) {
            aenw aJ = aJ(bynVar);
            aenw aenwVar2 = aenw.b;
            aenw aJ2 = aJ(bynVar);
            aenw aenwVar3 = aenw.a;
            if (charSequence.length() > 0 && !aeoaVar.d.c) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (aJ != aenwVar2 && (aJ2 != aenwVar3 || !z5)) {
                z6 = false;
            } else {
                z6 = true;
            }
            byu byuVar2 = new byu(Boolean.valueOf(z6), cav.a);
            bwkVar.ad(byuVar2);
            T2 = byuVar2;
        }
        if ((i2 & 8) != 0) {
            z7 = false;
        } else {
            z7 = true;
        }
        boolean z11 = !z7;
        if ((i2 & 4) == 0) {
            z8 = true;
        }
        boolean z12 = z11 | z2;
        boolean z13 = z8 & z;
        byn bynVar2 = (byn) T2;
        bwkVar.Y();
        if (!z12) {
            booleanValue = ((Boolean) bynVar2.a()).booleanValue();
            if (booleanValue) {
                c.y(549407628);
                aR(aJ(bynVar), aeoaVar, z13, null, false, null, brg.a, aeopVar, c, (i & 1008) | ((i << 9) & 29360128), 120);
                bwkVar.Y();
            } else {
                c.y(549544090);
                bwkVar.Y();
            }
        } else {
            c.y(548707772);
            aap aapVar = bZ(c).c;
            aap aapVar2 = bZ(c).d;
            booleanValue3 = ((Boolean) bynVar2.a()).booleanValue();
            wf.a(booleanValue3, null, wx.i(aapVar, brg.a, 6), wx.j(aapVar2), "magic_compose_animated_icon_visibility", cdk.e(-1111094507, new aemz(bynVar, aapVar, aapVar2, aeoaVar, z13, aeopVar), c), c, 221184, 2);
            bwkVar.Y();
        }
        booleanValue2 = ((Boolean) bynVar2.a()).booleanValue();
        if (booleanValue2) {
            aeoaVar.d.d.a();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aena(charSequence, aeoaVar, z13, z12, aeopVar, i, i2);
        }
    }

    public static void aN(cor corVar, String str, cga cgaVar, long j, bwj bwjVar, int i, int i2) {
        cga cgaVar2;
        long j2;
        int i3;
        corVar.getClass();
        int i4 = i2 & 4;
        bwj c = bwjVar.c(2085100639);
        if (i4 != 0) {
            cgaVar2 = cga.e;
        } else {
            cgaVar2 = cgaVar;
        }
        if ((i2 & 8) != 0) {
            i3 = i & (-7169);
            j2 = bmp.a(c).s;
        } else {
            j2 = j;
            i3 = i;
        }
        ahji.N(corVar, str, cgaVar2, j2, c, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168), 0);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeok(corVar, str, cgaVar2, j2, i, i2, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void aO(defpackage.amt r21, defpackage.aenr r22, defpackage.cit r23, defpackage.arqr r24, java.lang.Boolean r25, boolean r26, boolean r27, float r28, defpackage.aeop r29, defpackage.bwj r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adom.aO(amt, aenr, cit, arqr, java.lang.Boolean, boolean, boolean, float, aeop, bwj, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void aP(defpackage.aeor r28, int r29, defpackage.bwj r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adom.aP(aeor, int, bwj, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void aQ(java.lang.String r23, defpackage.aeoo r24, defpackage.cga r25, boolean r26, defpackage.bwj r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adom.aQ(java.lang.String, aeoo, cga, boolean, bwj, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0373  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void aR(defpackage.aenw r32, defpackage.aeoa r33, boolean r34, defpackage.byn r35, boolean r36, defpackage.aeoo r37, float r38, defpackage.aeop r39, defpackage.bwj r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 1005
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adom.aR(aenw, aeoa, boolean, byn, boolean, aeoo, float, aeop, bwj, int, int):void");
    }

    public static void aS(aenp aenpVar, aeoo aeooVar, float f, boolean z, bwj bwjVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        int i7;
        cku ckuVar;
        int i8 = i2 & 1;
        bwj c = bwjVar.c(666911971);
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (true != c.G(aenpVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (true != c.G(aeooVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (true != c.D(f)) {
                i6 = 128;
            } else {
                i6 = 256;
            }
            i3 |= i6;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (true != c.H(z)) {
                i7 = 1024;
            } else {
                i7 = 2048;
            }
            i3 |= i7;
        }
        if ((i3 & 5851) == 1170 && c.L()) {
            c.v();
        } else {
            z &= z2;
            if (aenpVar instanceof aenm) {
                c.y(-1192280886);
                aD((aenm) aenpVar, f, c, (i3 >> 3) & 112);
                ((bwk) c).Y();
            } else if (aenpVar instanceof aenv) {
                c.y(-1192278143);
                aF((aenv) aenpVar, null, null, z, c, i3 & 7168, 6);
                ((bwk) c).Y();
            } else if (aenpVar instanceof aeon) {
                int i10 = i3 >> 3;
                c.y(-1192274320);
                aeon aeonVar = (aeon) aenpVar;
                c.y(-1192271305);
                if (aeooVar == null) {
                    ckuVar = null;
                } else {
                    ckuVar = new cku(aW(aeooVar, f, c));
                }
                bwk bwkVar = (bwk) c;
                bwkVar.Y();
                al(aeonVar, ckuVar, z, c, i10 & 896);
                bwkVar.Y();
            } else {
                c.y(1694417475);
                ((bwk) c).Y();
            }
        }
        boolean z3 = z;
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new agid(aenpVar, aeooVar, f, z3, i, i2, 1);
        }
    }

    public static boolean aT(aenw aenwVar, aeoa aeoaVar) {
        aenwVar.getClass();
        int ordinal = aenwVar.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        return true;
                    }
                    aepp aeppVar = aeoaVar.b;
                    if (aeppVar == null) {
                        return false;
                    }
                    return aeppVar.b;
                }
                if (aeoaVar.e == null) {
                    return false;
                }
                return true;
            }
            if (aeoaVar.f == null) {
                return false;
            }
            return true;
        }
        aemn aemnVar = aeoaVar.c;
        if (aemnVar == null) {
            return false;
        }
        return aemnVar.a;
    }

    public static void aU(cga cgaVar, boolean z, bma bmaVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        long j;
        cga a2;
        long j2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i & 14;
        bwj c = bwjVar.c(-1342249231);
        if (i7 == 0) {
            if (true != c.G(cgaVar)) {
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
            if (true != c.G(bmaVar)) {
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
        if ((i2 & 5851) == 1170 && c.L()) {
            c.v();
        } else {
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
            }
            c.n();
            cga a3 = chk.a(amv.h(bmi.a(cgaVar), 40.0f), awh.a);
            if (z) {
                j = bmaVar.a;
            } else {
                j = bmaVar.c;
            }
            a2 = adf.a(a3, j, clw.a);
            int i8 = cfq.a;
            cue a4 = akc.a(cfq.a.e, false);
            int a5 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b2 = cfv.b(c, a2);
            int i9 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a4, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a5))) {
                Integer valueOf = Integer.valueOf(a5);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar2);
            }
            caw.b(c, b2, cwl.a.c);
            if (z) {
                j2 = bmaVar.b;
            } else {
                j2 = bmaVar.d;
            }
            bwx.a(blp.a.c(new cku(j2)), arqvVar, c, ((i2 >> 6) & 112) | 8);
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jxg(cgaVar, z, bmaVar, arqvVar, i, 2);
        }
    }

    public static String aV(aenw aenwVar, boolean z, bwj bwjVar) {
        int i;
        int i2;
        aenwVar.getClass();
        bwjVar.y(1251414004);
        int ordinal = aenwVar.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            i = R.string.compose_icon_voice_unselected_content_description;
                            i2 = R.string.compose_icon_voice_selected_content_description;
                        } else {
                            throw new armm();
                        }
                    } else {
                        i = R.string.compose_icon_shortcuts_unselected_content_description;
                        i2 = R.string.compose_icon_shortcuts_selected_content_description;
                    }
                } else {
                    i = R.string.compose_icon_emotive_unselected_content_description;
                    i2 = R.string.compose_icon_emotive_selected_content_description;
                }
            } else {
                i = R.string.compose_icon_gallery_unselected_content_description;
                i2 = R.string.compose_icon_gallery_selected_content_description;
            }
        } else {
            i = R.string.compose_icon_ai_unselected_content_description;
            i2 = R.string.compose_icon_ai_selected_content_description;
        }
        if (true == z) {
            i = i2;
        }
        String a2 = dga.a(i, bwjVar);
        bwjVar.q();
        return a2;
    }

    public static long aW(aeoo aeooVar, float f, bwj bwjVar) {
        long j;
        aeooVar.getClass();
        bwjVar.y(-1126102497);
        if (cd(bwjVar)) {
            bwjVar.y(-1819854478);
            j = bmp.a(bwjVar).J;
            bwjVar.q();
        } else if (aeooVar == aeoo.b) {
            bwjVar.y(-1819851376);
            j = bmp.a(bwjVar).G;
            bwjVar.q();
        } else if (aeooVar == aeoo.c) {
            bwjVar.y(-1819848991);
            bwjVar.q();
            j = cku.d;
        } else {
            bwjVar.y(-1819847572);
            j = bmp.a(bwjVar).v;
            bwjVar.q();
        }
        if (cku.a(j) != f) {
            j = ckw.f(cku.d(j), cku.c(j), cku.b(j), f, cku.f(j));
        }
        bwjVar.q();
        return j;
    }

    public static long aX(aeoo aeooVar, float f, aepi aepiVar, boolean z, bwj bwjVar) {
        long aW;
        bwjVar.y(-508894614);
        if (z) {
            bwjVar.y(1304715656);
            int ordinal = aepiVar.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    bwjVar.y(319189386);
                    aW = aW(aeooVar, f, bwjVar);
                    ((bwk) bwjVar).Y();
                } else {
                    bwjVar.y(319188034);
                    aW = bmp.a(bwjVar).l;
                    ((bwk) bwjVar).Y();
                }
            } else {
                bwjVar.y(319185272);
                aW = bmp.a(bwjVar).a;
                ((bwk) bwjVar).Y();
            }
            ((bwk) bwjVar).Y();
        } else {
            bwjVar.y(1305040846);
            aW = aW(aeooVar, f, bwjVar);
            ((bwk) bwjVar).Y();
        }
        ((bwk) bwjVar).Y();
        return aW;
    }

    public static long aY(boolean z, boolean z2, boolean z3, boolean z4, aeoo aeooVar, float f, aepi aepiVar, boolean z5, bwj bwjVar) {
        long aW;
        aepiVar.getClass();
        bwjVar.y(-806002448);
        if (z4) {
            bwjVar.y(-327531528);
            if (z) {
                bwjVar.y(-327515656);
                aW = bmp.a(bwjVar).a;
                ((bwk) bwjVar).Y();
            } else if (z2 && !z3) {
                bwjVar.y(-327413170);
                aW = aX(aeooVar, f, aepiVar, z5, bwjVar);
                ((bwk) bwjVar).Y();
            } else {
                bwjVar.y(-327166472);
                aW = bmp.a(bwjVar).a;
                ((bwk) bwjVar).Y();
            }
            ((bwk) bwjVar).Y();
        } else if (aepiVar != aepi.VOICE_BUTTON_BACKGROUND_DEFAULT && z2 && !z3 && !z) {
            bwjVar.y(-326954308);
            aW = aX(aeooVar, f, aepiVar, z5, bwjVar);
            ((bwk) bwjVar).Y();
        } else {
            bwjVar.y(-326719452);
            aW = aW(aeooVar, f, bwjVar);
            ((bwk) bwjVar).Y();
        }
        ((bwk) bwjVar).Y();
        return aW;
    }

    public static /* synthetic */ String aZ(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "DRAG_AND_DROP";
                    }
                    return "CLIPBOARD";
                }
                return "INPUT_METHOD_EDITOR";
            }
            return "INTENT";
        }
        return "UNKNOWN";
    }

    public static void aa(aenr aenrVar, aeom aeomVar, aeoa aeoaVar, byn bynVar, boolean z, aeoo aeooVar, aeop aeopVar, bwj bwjVar, int i) {
        int i2;
        bwj bwjVar2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i & 14;
        bwj c = bwjVar.c(2004228756);
        if (i10 == 0) {
            if (true != c.G(aenrVar)) {
                i9 = 2;
            } else {
                i9 = 4;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aeomVar)) {
                i8 = 16;
            } else {
                i8 = 32;
            }
            i2 |= i8;
        }
        if ((i & 896) == 0) {
            if (true != c.G(aeoaVar)) {
                i7 = 128;
            } else {
                i7 = 256;
            }
            i2 |= i7;
        }
        if ((i & 7168) == 0) {
            if (true != c.G(bynVar)) {
                i6 = 1024;
            } else {
                i6 = 2048;
            }
            i2 |= i6;
        }
        if ((i & 57344) == 0) {
            if (true != c.H(z)) {
                i5 = 8192;
            } else {
                i5 = 16384;
            }
            i2 |= i5;
        }
        if ((i & 458752) == 0) {
            if (true != c.G(aeooVar)) {
                i4 = 65536;
            } else {
                i4 = 131072;
            }
            i2 |= i4;
        }
        if ((3670016 & i) == 0) {
            if (true != c.G(aeopVar)) {
                i3 = 524288;
            } else {
                i3 = 1048576;
            }
            i2 |= i3;
        }
        if ((2995931 & i2) == 599186 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            int i11 = 458752 & i2;
            int i12 = 57344 & i2;
            int i13 = i2 >> 3;
            c.y(199162679);
            int i14 = (i13 & 112) | 6;
            int i15 = (i2 << 3) & 29360128;
            if (aeoaVar.g) {
                aR(aenw.d, aeoaVar, false, null, z, aeooVar, brg.a, aeopVar, c, i14 | i12 | i11 | i15, 76);
                int i16 = cfq.a;
                cfq.b bVar = cfq.a.n;
                cga.a aVar = cga.e;
                cue a2 = akk.a(ajw.c, bVar, c, 48);
                int a3 = bwg.a(c);
                bwk bwkVar = (bwk) c;
                byx P = bwkVar.P();
                cga b2 = cfv.b(c, aVar);
                int i17 = cwl.a;
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
                aP(aenrVar.a.f, 0, c, 0, 2);
                ay(aenrVar.d, false, false, c, 0, 6);
                c.p();
                bwkVar.Y();
                bzz e = c.e();
                if (e != null) {
                    ((bzf) e).d = new aeow(aenrVar, aeomVar, aeoaVar, bynVar, z, aeooVar, aeopVar, i, 1);
                    return;
                }
                return;
            }
            bwjVar2 = c;
            int i18 = i2;
            bwk bwkVar2 = (bwk) bwjVar2;
            bwkVar2.Y();
            aq(aeomVar, bwjVar2, i13 & 14);
            aR(aenw.d, aeoaVar, false, null, z, aeooVar, brg.a, aeopVar, bwjVar2, i14 | i12 | i11 | i15, 76);
            if ((aenrVar.d.g.b && !aenrVar.a()) || ((Boolean) bynVar.a()).booleanValue()) {
                bwjVar2.y(1879860923);
                aR(aenw.f, aeoaVar, false, bynVar, false, null, brg.a, aeopVar, bwjVar2, i14 | (i18 & 7168) | i15, 116);
                bwkVar2.Y();
            } else {
                bwjVar2.y(1880028416);
                int i19 = cfq.a;
                cfq.b bVar2 = cfq.a.n;
                cga.a aVar2 = cga.e;
                cue a4 = akk.a(ajw.c, bVar2, bwjVar2, 48);
                int a5 = bwg.a(bwjVar2);
                byx P2 = bwkVar2.P();
                cga b3 = cfv.b(bwjVar2, aVar2);
                int i20 = cwl.a;
                arqg arqgVar2 = cwl.a.a;
                bwjVar2.A();
                if (bwkVar2.y) {
                    bwjVar2.l(arqgVar2);
                } else {
                    bwjVar2.C();
                }
                caw.b(bwjVar2, a4, cwl.a.e);
                caw.b(bwjVar2, P2, cwl.a.d);
                arqv arqvVar2 = cwl.a.f;
                if (bwkVar2.y || !d.F(bwkVar2.T(), Integer.valueOf(a5))) {
                    Integer valueOf2 = Integer.valueOf(a5);
                    bwkVar2.ad(valueOf2);
                    bwjVar2.j(valueOf2, arqvVar2);
                }
                caw.b(bwjVar2, b3, cwl.a.c);
                aP(aenrVar.a.f, 0, bwjVar2, 0, 2);
                ay(aenrVar.d, false, false, bwjVar2, 0, 6);
                bwjVar2.p();
                bwkVar2.Y();
            }
        }
        bzz e2 = bwjVar2.e();
        if (e2 != null) {
            ((bzf) e2).d = new aeow(aenrVar, aeomVar, aeoaVar, bynVar, z, aeooVar, aeopVar, i, 0);
        }
    }

    public static void ab(boolean z, arqg arqgVar, aeoa aeoaVar, boolean z2, aenr aenrVar, aeop aeopVar, bwj bwjVar, int i) {
        int i2;
        bwk bwkVar;
        bwj bwjVar2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        bwj c = bwjVar.c(-883297753);
        int b2 = c.b();
        if ((i & 14) == 0) {
            if (true != c.H(z)) {
                i8 = 2;
            } else {
                i8 = 4;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.I(arqgVar)) {
                i7 = 16;
            } else {
                i7 = 32;
            }
            i2 |= i7;
        }
        if ((i & 896) == 0) {
            if (true != c.G(aeoaVar)) {
                i6 = 128;
            } else {
                i6 = 256;
            }
            i2 |= i6;
        }
        if ((i & 7168) == 0) {
            if (true != c.H(z2)) {
                i5 = 1024;
            } else {
                i5 = 2048;
            }
            i2 |= i5;
        }
        if ((i & 57344) == 0) {
            if (true != c.G(aenrVar)) {
                i4 = 8192;
            } else {
                i4 = 16384;
            }
            i2 |= i4;
        }
        if ((458752 & i) == 0) {
            if (true != c.G(aeopVar)) {
                i3 = 65536;
            } else {
                i3 = 131072;
            }
            i2 |= i3;
        }
        if ((374491 & i2) == 74898 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            int i9 = i2 >> 3;
            cga i10 = amh.i(cga.e, 4.0f, brg.a, 2);
            if (z2) {
                i10 = i10.a(wj.b(cga.e));
            }
            ajw.b bVar = ajw.a;
            int i11 = cfq.a;
            cue a2 = amq.a(bVar, cfq.a.j, c, 0);
            int a3 = bwg.a(c);
            bwk bwkVar2 = (bwk) c;
            byx P = bwkVar2.P();
            cga b3 = cfv.b(c, i10);
            int i12 = cwl.a;
            arqg arqgVar2 = cwl.a.a;
            c.A();
            if (bwkVar2.y) {
                c.l(arqgVar2);
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
            caw.b(c, b3, cwl.a.c);
            c.y(-557042876);
            if (z && !aeoaVar.g) {
                c.y(-557013179);
                bwkVar = bwkVar2;
                ahji.P(arqgVar, null, false, null, null, aemq.a, c, (i9 & 14) | 1572864, 62);
                bwkVar.Y();
                bwjVar2 = c;
            } else {
                bwkVar = bwkVar2;
                int i13 = i9 & 112;
                c.y(-556759382);
                c.y(120587263);
                int i14 = i13 | 6;
                int i15 = (i2 << 6) & 29360128;
                if (aeoaVar.g) {
                    aR(aenw.c, aeoaVar, false, null, false, null, brg.a, aeopVar, c, i14 | i15, 124);
                    c.t(b2);
                    bzz e = c.e();
                    if (e != null) {
                        ((bzf) e).d = new kbg(z, arqgVar, aeoaVar, z2, aenrVar, aeopVar, i, 3);
                        return;
                    }
                    return;
                }
                bwjVar2 = c;
                bwkVar.Y();
                int i16 = i14 | i15;
                aR(aenw.e, aeoaVar, false, null, false, null, brg.a, aeopVar, bwjVar2, i16, 124);
                aR(aenw.c, aeoaVar, false, null, false, null, brg.a, aeopVar, bwjVar2, i16, 124);
                if (aeoaVar.d.a) {
                    aM(aenrVar.a.b, aeoaVar, false, false, aeopVar, bwjVar2, i13 | 8 | (i9 & 57344), 12);
                }
                bwkVar.Y();
            }
            bwkVar.Y();
            bwjVar2.p();
        }
        bzz e2 = bwjVar2.e();
        if (e2 != null) {
            ((bzf) e2).d = new kbg(z, arqgVar, aeoaVar, z2, aenrVar, aeopVar, i, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void ac(defpackage.bwj r14, int r15) {
        /*
            r0 = 1875835042(0x6fcef8a2, float:1.2810898E29)
            bwj r14 = r14.c(r0)
            r0 = 0
            if (r15 != 0) goto L16
            boolean r15 = r14.L()
            if (r15 != 0) goto L12
            r15 = r0
            goto L16
        L12:
            r14.v()
            goto L64
        L16:
            aax r1 = defpackage.aay.b(r14)
            aezu r2 = bZ(r14)
            arqr r2 = r2.h
            r3 = 1064094925(0x3f6ccccd, float:0.925)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Object r2 = r2.a(r3)
            aaw r2 = (defpackage.aaw) r2
            r3 = 1062836634(0x3f59999a, float:0.85)
            r4 = 1065353216(0x3f800000, float:1.0)
            cas r1 = defpackage.aay.a(r1, r3, r4, r2, r14)
            cga$a r2 = defpackage.cga.e
            float r3 = defpackage.a.F(r1)
            float r4 = defpackage.a.F(r1)
            awg r10 = defpackage.awh.a
            r12 = 0
            r13 = 124924(0x1e7fc, float:1.75056E-40)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 1
            cga r1 = defpackage.cld.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r2 = 1115684864(0x42800000, float:64.0)
            cga r1 = defpackage.amv.h(r1, r2)
            aezm r2 = bX(r14)
            long r2 = r2.p
            cga r1 = defpackage.adf.b(r1, r2)
            defpackage.akc.b(r1, r14, r0)
            r0 = r15
        L64:
            bzz r14 = r14.e()
            if (r14 == 0) goto L75
            lhs r15 = new lhs
            r1 = 13
            r15.<init>(r0, r1)
            bzf r14 = (defpackage.bzf) r14
            r14.d = r15
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adom.ac(bwj, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void ad(defpackage.bwj r17, int r18) {
        /*
            r0 = -1369299553(0xffffffffae62259f, float:-5.1419865E-11)
            r1 = r17
            bwj r0 = r1.c(r0)
            r1 = 0
            if (r18 != 0) goto L18
            boolean r2 = r0.L()
            if (r2 != 0) goto L14
            r2 = r1
            goto L1a
        L14:
            r0.v()
            goto L70
        L18:
            r2 = r18
        L1a:
            aax r3 = defpackage.aay.b(r0)
            aezu r4 = bZ(r0)
            aaw r4 = r4.i
            r5 = 1062836634(0x3f59999a, float:0.85)
            r6 = 1075838976(0x40200000, float:2.5)
            cas r4 = defpackage.aay.a(r3, r5, r6, r4, r0)
            aezu r5 = bZ(r0)
            aaw r5 = r5.i
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            cas r3 = defpackage.aay.a(r3, r6, r7, r5, r0)
            cga$a r5 = defpackage.cga.e
            float r6 = defpackage.a.F(r4)
            float r7 = defpackage.a.F(r4)
            awg r13 = defpackage.awh.a
            r15 = 0
            r16 = 124924(0x1e7fc, float:1.75056E-40)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 1
            cga r4 = defpackage.cld.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            float r3 = defpackage.a.F(r3)
            cga r3 = defpackage.cha.a(r4, r3)
            r4 = 1115684864(0x42800000, float:64.0)
            cga r3 = defpackage.amv.h(r3, r4)
            aezm r4 = bX(r0)
            long r4 = r4.q
            cga r3 = defpackage.adf.b(r3, r4)
            defpackage.akc.b(r3, r0, r1)
            r1 = r2
        L70:
            bzz r0 = r0.e()
            if (r0 == 0) goto L81
            lhs r2 = new lhs
            r3 = 14
            r2.<init>(r1, r3)
            bzf r0 = (defpackage.bzf) r0
            r0.d = r2
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adom.ad(bwj, int):void");
    }

    public static void ae(amt amtVar, boolean z, aekm aekmVar, bwj bwjVar, int i) {
        int i2;
        boolean z2;
        cga b2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(-25590888);
        if (i6 == 0) {
            if (true != c.G(amtVar)) {
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
            if (true != c.G(aekmVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            if (c.g(dch.i) == drk.a) {
                z2 = true;
            } else {
                z2 = false;
            }
            b2 = amtVar.b(cga.e, 1.0f, true);
            cga j = amh.j(b2, 16.0f, brg.a, 50.666664f, brg.a, 10);
            c.y(-340293206);
            boolean H = c.H(z2);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (H || T == bwj.a.a) {
                T = new jsw(z2, 12);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            abm abmVar = wx.a;
            cjp cjpVar = acz.a;
            wf.g(amtVar, z, j, wx.a(zs.c(brg.a, 400.0f, new dre(4294967297L), 1), new xh((arqr) T)).a(wx.g(null, 3)), xn.a, null, cdk.e(841052096, new ifo(amtVar, aekmVar, 9, null), c), c, (i2 & 14) | 1572864 | (i2 & 112));
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jyn(amtVar, z, aekmVar, i, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void af(defpackage.bwj r9, int r10) {
        /*
            r0 = 2064232287(0x7b09af5f, float:7.149016E35)
            bwj r9 = r9.c(r0)
            r0 = 0
            if (r10 != 0) goto L17
            boolean r10 = r9.L()
            if (r10 != 0) goto L12
            r10 = r0
            goto L17
        L12:
            r9.v()
            goto L96
        L17:
            cga$a r1 = defpackage.cga.e
            r2 = 1115684864(0x42800000, float:64.0)
            cga r1 = defpackage.amv.h(r1, r2)
            int r2 = defpackage.cfq.a
            cfq r2 = cfq.a.e
            cue r2 = defpackage.akc.a(r2, r0)
            int r3 = defpackage.bwg.a(r9)
            r4 = r9
            bwk r4 = (defpackage.bwk) r4
            byx r5 = r4.P()
            cga r1 = defpackage.cfv.b(r9, r1)
            int r6 = defpackage.cwl.a
            arqg r6 = cwl.a.a
            r9.A()
            boolean r7 = r4.y
            if (r7 == 0) goto L45
            r9.l(r6)
            goto L48
        L45:
            r9.C()
        L48:
            arqv r6 = cwl.a.e
            defpackage.caw.b(r9, r2, r6)
            arqv r2 = cwl.a.d
            defpackage.caw.b(r9, r5, r2)
            arqv r2 = cwl.a.f
            boolean r5 = r4.y
            if (r5 != 0) goto L66
            java.lang.Object r5 = r4.T()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            boolean r5 = defpackage.d.F(r5, r6)
            if (r5 != 0) goto L70
        L66:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.ad(r3)
            r9.j(r3, r2)
        L70:
            arqv r2 = cwl.a.c
            defpackage.caw.b(r9, r1, r2)
            ad(r9, r0)
            ac(r9, r0)
            aerb r0 = defpackage.aerb.ar
            cor r1 = defpackage.aeke.bg(r0, r9)
            long r4 = defpackage.cku.d
            r0 = 2132017927(0x7f140307, float:1.9674146E38)
            java.lang.String r2 = defpackage.dga.a(r0, r9)
            r7 = 3080(0xc08, float:4.316E-42)
            r8 = 4
            r3 = 0
            r6 = r9
            aN(r1, r2, r3, r4, r6, r7, r8)
            r9.p()
            r0 = r10
        L96:
            bzz r9 = r9.e()
            if (r9 == 0) goto La7
            lhs r10 = new lhs
            r1 = 15
            r10.<init>(r0, r1)
            bzf r9 = (defpackage.bzf) r9
            r9.d = r10
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adom.af(bwj, int):void");
    }

    public static void ag(amt amtVar, aekm aekmVar, bwj bwjVar, int i) {
        int i2;
        cga b2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(886913687);
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
            if (true != c.G(aekmVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !c.L()) {
            b2 = amtVar.b(cga.e, 1.0f, true);
            cga d = amv.d(b2, 48.0f);
            int i6 = cfq.a;
            cue a2 = amq.a(ajw.f, cfq.a.k, c, 54);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b3 = cfv.b(c, d);
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
            caw.b(c, b3, cwl.a.c);
            aetn.ax(aekmVar, null, c, (i2 >> 3) & 14);
            cga.a aVar = cga.e;
            cue a4 = amq.a(ajw.a, cfq.a.j, c, 0);
            int a5 = bwg.a(c);
            byx P2 = bwkVar.P();
            cga b4 = cfv.b(c, aVar);
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
            caw.b(c, b4, cwl.a.c);
            aN(aeke.bg(aerb.aw, c), dga.a(R.string.compose_icon_cancel_voice_message_content_description, c), null, 0L, c, 8, 12);
            aN(aeke.bg(aerb.aa, c), dga.a(R.string.compose_icon_swipe_to_cancel_voice_message_content_description, c), null, 0L, c, 8, 12);
            c.p();
            ah(c, 0);
            c.p();
        } else {
            c.v();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeol(amtVar, aekmVar, i, 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void ah(defpackage.bwj r25, int r26) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adom.ah(bwj, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void ai(defpackage.bwj r13, int r14) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adom.ai(bwj, int):void");
    }

    public static void aj(boolean z, aeph aephVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        float f;
        float floatValue;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(-817835909);
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
            if (true != c.G(aephVar)) {
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
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            if (true != z) {
                f = 0.0f;
            } else {
                f = 100.0f;
            }
            cas c2 = zl.c(f, bZ(c).j, null, c, 64, 28);
            boolean z2 = false;
            if (z && aephVar != null) {
                z2 = true;
            }
            c.y(-1079405293);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = aedh.l;
                bwkVar.ad(T);
            }
            bwkVar.Y();
            abm abmVar = wx.a;
            cjp cjpVar = acz.a;
            xl b2 = wx.b(zs.c(brg.a, 400.0f, new dre(4294967297L), 1), (arqr) T);
            floatValue = ((Number) c2.a()).floatValue();
            wf.a(z2, cgh.a(cgaVar, floatValue), b2, null, null, cdk.e(212840099, new aelu(aephVar, 7), c), c, 196992, 24);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jyn(z, aephVar, cgaVar, i, 8);
        }
    }

    public static void ak(aekm aekmVar, aeph aephVar, aeoo aeooVar, float f, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        boolean booleanValue;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i & 14;
        bwj c = bwjVar.c(1294516863);
        if (i8 == 0) {
            if (true != c.G(aekmVar)) {
                i7 = 2;
            } else {
                i7 = 4;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aephVar)) {
                i6 = 16;
            } else {
                i6 = 32;
            }
            i2 |= i6;
        }
        if ((i & 896) == 0) {
            if (true != c.G(aeooVar)) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i2 |= i5;
        }
        if ((i & 7168) == 0) {
            if (true != c.D(f)) {
                i4 = 1024;
            } else {
                i4 = 2048;
            }
            i2 |= i4;
        }
        if ((57344 & i) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 8192;
            } else {
                i3 = 16384;
            }
            i2 |= i3;
        }
        if ((46811 & i2) == 9362 && c.L()) {
            c.v();
        } else {
            c.y(-1633293819);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = new fzj((arpe) null, 9, (short[][]) null);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            cas a2 = cam.a(false, (arqv) T, c);
            int i9 = cfq.a;
            cfq.b bVar = cfq.a.o;
            cga.a aVar = cga.e;
            cue a3 = akk.a(ajw.c, bVar, c, 48);
            int a4 = bwg.a(c);
            byx P = bwkVar.P();
            cga b2 = cfv.b(c, aVar);
            int i10 = cwl.a;
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
            booleanValue = ((Boolean) a2.a()).booleanValue();
            aj(booleanValue, aephVar, amh.j(cga.e, brg.a, brg.a, 8.0f, brg.a, 11), c, (i2 & 112) | 384);
            cga.a aVar2 = cga.e;
            cue a5 = akc.a(cfq.a.a, false);
            int a6 = bwg.a(c);
            byx P2 = bwkVar.P();
            cga b3 = cfv.b(c, aVar2);
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
            caw.b(c, b3, cwl.a.c);
            akf akfVar = akf.a;
            cga i11 = amh.i(cgaVar, brg.a, 8.0f, 1);
            cue a7 = amq.a(ajw.a, cfq.a.l, c, 48);
            int a8 = bwg.a(c);
            byx P3 = bwkVar.P();
            cga b4 = cfv.b(c, i11);
            arqg arqgVar3 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar3);
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
            int i12 = i2 >> 3;
            aeke.M(null, aeooVar, f, true, cdk.e(1779391624, new keh(amu.a, aekmVar, a2, 10, (short[]) null), c), c, (i12 & 112) | 27648 | (i12 & 896), 1);
            c.p();
            cga a9 = akfVar.a(amh.j(cga.e, brg.a, brg.a, 8.0f, brg.a, 11), cfq.a.f);
            cue a10 = akc.a(cfq.a.a, false);
            int a11 = bwg.a(c);
            byx P4 = bwkVar.P();
            cga b5 = cfv.b(c, a9);
            arqg arqgVar4 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar4);
            } else {
                c.C();
            }
            caw.b(c, a10, cwl.a.e);
            caw.b(c, P4, cwl.a.d);
            arqv arqvVar4 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a11))) {
                Integer valueOf4 = Integer.valueOf(a11);
                bwkVar.ad(valueOf4);
                c.j(valueOf4, arqvVar4);
            }
            caw.b(c, b5, cwl.a.c);
            af(c, 0);
            c.p();
            c.p();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeoy(aekmVar, aephVar, aeooVar, f, cgaVar, i, 1);
        }
    }

    public static void al(aeon aeonVar, cku ckuVar, boolean z, bwj bwjVar, int i) {
        int i2;
        cga c;
        int i3;
        int i4;
        int i5;
        aeonVar.getClass();
        int i6 = i & 14;
        bwj c2 = bwjVar.c(-577445018);
        if (i6 == 0) {
            if (true != c2.G(aeonVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.G(ckuVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c2.H(z)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c2.L()) {
            c2.v();
        } else if (z) {
            c2.y(1655804871);
            aF(new aenv(aeonVar.a, aeonVar.e, aeonVar.f, new aenu(null)), new cku(cku.g), new cku(bmp.a(c2).q), true, c2, 3120, 0);
            ((bwk) c2).Y();
        } else {
            c2.y(1656214257);
            if (ckuVar != null) {
                c2.y(1656246373);
                c = amv.c(cga.e, 1.0f);
                bqv.c(chk.a(c, awh.c(24.0f, 24.0f, brg.a, brg.a, 12)), null, ckuVar.i, 0L, brg.a, brg.a, null, cdk.e(-317247680, new aekj(aeonVar, 7), c2), c2, 122);
                ((bwk) c2).Y();
            } else {
                c2.y(1656464954);
                ao(aeonVar, c2, i2 & 14);
                ((bwk) c2).Y();
            }
            ((bwk) c2).Y();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new jyn(aeonVar, ckuVar, z, i, 6);
        }
    }

    public static void am(String str, arqr arqrVar, arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c2 = bwjVar.c(1066983511);
        if (i6 == 0) {
            if (true != c2.G(str)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.I(arqrVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c2.I(arqgVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !c2.L()) {
            c = amv.c(cga.e, 1.0f);
            cga j = amh.j(c, 16.0f, brg.a, 4.0f, brg.a, 10);
            int i7 = cfq.a;
            cue a2 = amq.a(ajw.a, cfq.a.k, c2, 48);
            int a3 = bwg.a(c2);
            bwk bwkVar = (bwk) c2;
            byx P = bwkVar.P();
            cga b2 = cfv.b(c2, j);
            int i8 = cwl.a;
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
            caw.b(c2, b2, cwl.a.c);
            int i9 = i2 << 3;
            an(amu.a, str, arqrVar, c2, (i9 & 896) | (i9 & 112) | 6);
            ahji.P(arqgVar, null, false, null, null, aemp.a, c2, ((i2 >> 6) & 14) | 1572864, 62);
            c2.p();
        } else {
            c2.v();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new aelx(str, arqrVar, arqgVar, i, 7, (char[]) null);
        }
    }

    public static void an(amt amtVar, String str, arqr arqrVar, bwj bwjVar, int i) {
        int i2;
        cga b2;
        bwj bwjVar2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(-1642521056);
        if (i6 == 0) {
            if (true != c.G(amtVar)) {
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
            if (true != c.I(arqrVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            long j = bmp.a(c).q;
            c.y(692229712);
            boolean F = c.F(j);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (F || T == bwj.a.a) {
                T = new byu(new cmd(j), cav.a);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            b2 = amtVar.b(cga.e, 1.0f, true);
            cga aN = aetn.aN(b2, dga.a(R.string.compose_subject_placeholder, c), true);
            cmd cmdVar = (cmd) ((byn) T).a();
            int i7 = i2 >> 3;
            bwjVar2 = c;
            awo.c(str, arqrVar, aN, false, dje.y(bmp.d(c).k, bmp.a(c).q, 0L, null, null, null, null, 0L, 0, 0, 0L, null, null, 0, 16777214), new ayc(3, 0, 0, 126), null, false, 2, 0, null, null, null, cmdVar, cdk.e(1091585923, new aelu(str, 6), c), bwjVar2, (i7 & 14) | 806879232 | (i7 & 112), 196608, 15768);
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new aelx(amtVar, str, arqrVar, i, 8, (byte[]) null);
        }
    }

    public static void ao(aeon aeonVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-263108111);
        if (i4 == 0) {
            if (true != c.G(aeonVar)) {
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
            cga i5 = amh.i(cga.e, brg.a, 8.0f, 1);
            int i6 = cfq.a;
            cue a2 = akk.a(ajw.c, cfq.a.o, c, 48);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b2 = cfv.b(c, i5);
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
            ap(aeonVar.b, aeonVar.d, c, 0);
            am(aeonVar.a, aeonVar.c, aeonVar.f, c, 0);
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelf(aeonVar, i, 15);
        }
    }

    public static void ap(boolean z, arqr arqrVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c2 = bwjVar.c(-1392555399);
        boolean z2 = true;
        if (i5 == 0) {
            if (true != c2.H(z)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.I(arqrVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c2.L()) {
            c2.v();
        } else {
            String a2 = dga.a(R.string.compose_urgent_checked, c2);
            String a3 = dga.a(R.string.compose_urgent_unchecked, c2);
            cga g = cfv.g(amh.j(cga.e, brg.a, brg.a, 14.0f, brg.a, 11), new avv(z, arqrVar));
            c2.y(-1815212592);
            if ((i2 & 14) != 4) {
                z2 = false;
            }
            boolean G = c2.G(a2) | z2 | c2.G(a3);
            bwk bwkVar = (bwk) c2;
            Object T = bwkVar.T();
            if (G || T == bwj.a.a) {
                T = new xks(z, a2, a3, 2);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            c = dhb.c(g, false, (arqr) T);
            ajw.b bVar = ajw.b;
            int i6 = cfq.a;
            cue a4 = amq.a(bVar, cfq.a.k, c2, 54);
            int a5 = bwg.a(c2);
            byx P = bwkVar.P();
            cga b2 = cfv.b(c2, c);
            int i7 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar);
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
            String upperCase = dga.a(R.string.compose_urgent_label, c2).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            ahji.e(upperCase, null, bmp.a(c2).s, 0L, 0L, null, 0L, 0, false, 0, 0, null, bmp.d(c2).n, c2, 0, 0, 65530);
            amx.a(amv.l(cga.e, 4.0f), c2);
            aeke.Q(new aeml(z, arqrVar, 9), amv.h(cga.e, 28.0f), c2, 48);
            c2.p();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new aelm(z, arqrVar, i, 5);
        }
    }

    public static void aq(aeom aeomVar, bwj bwjVar, int i) {
        int i2;
        aeoj aeojVar;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(366201116);
        if (i4 == 0) {
            if (true != c.G(aeomVar)) {
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
            List list = aeomVar.a;
            Integer num = aeomVar.b;
            if (num != null) {
                aeojVar = (aeoj) list.get(num.intValue());
            } else {
                aeojVar = null;
            }
            if (aeojVar != null && list.size() > 1) {
                as(aeomVar, aeojVar, c, i2 & 14);
            } else {
                bzz e = c.e();
                if (e != null) {
                    ((bzf) e).d = new aelf(aeomVar, i, 13);
                    return;
                }
                return;
            }
        }
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new aelf(aeomVar, i, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void ar(java.lang.Character r35, long r36, java.lang.String r38, defpackage.cga r39, defpackage.bwj r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adom.ar(java.lang.Character, long, java.lang.String, cga, bwj, int, int):void");
    }

    public static void as(aeom aeomVar, aeoj aeojVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-910740396);
        if (i5 == 0) {
            if (true != c.G(aeomVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aeojVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            c.y(102548727);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                byu byuVar = new byu(false, cav.a);
                bwkVar.ad(byuVar);
                T = byuVar;
            }
            byn bynVar = (byn) T;
            bwkVar.Y();
            c.y(102550573);
            Object T2 = bwkVar.T();
            if (T2 == bwj.a.a) {
                T2 = new abcv(bynVar, 20);
                bwkVar.ad(T2);
            }
            bwkVar.Y();
            ahji.P((arqg) T2, null, false, null, null, cdk.e(1630715250, new keh(aeojVar, aeomVar, bynVar, 9, (char[]) null), c), c, 1572870, 62);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeol(aeomVar, aeojVar, i, 0);
        }
    }

    public static void at(Character ch, long j, String str, String str2, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i & 14;
        bwj c = bwjVar.c(-2145683878);
        if (i7 == 0) {
            if (true != c.G(ch)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.F(j)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (true != c.G(str)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (true != c.G(str2)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) == 1170 && c.L()) {
            c.v();
        } else {
            ar(ch, j, null, amh.j(cga.e, 16.0f, brg.a, brg.a, brg.a, 14), c, (i2 & 14) | 3072 | (i2 & 112), 0);
            av(str, str2, c, (i2 >> 6) & 126);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeuv(ch, j, str, str2, i, 1);
        }
    }

    public static void au(aeom aeomVar, boolean z, arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        bwj bwjVar2;
        int i3;
        int i4;
        int i5;
        arqgVar.getClass();
        int i6 = i & 14;
        bwj c = bwjVar.c(-1809627965);
        if (i6 == 0) {
            if (true != c.G(aeomVar)) {
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
            if (true != c.I(arqgVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            bwjVar2 = c;
            ahji.J(z, arqgVar, null, 0L, null, null, null, 0L, brg.a, cdk.e(-603841240, new ifo(aeomVar, arqgVar, 8, null), c), c, (i2 >> 3) & 126, 48, 2044);
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new jyn(aeomVar, z, arqgVar, i, 5);
        }
    }

    public static void av(String str, String str2, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(1903894843);
        if (i5 == 0) {
            if (true != c.G(str)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(str2)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        int i6 = i2;
        if ((i6 & 91) == 18 && c.L()) {
            c.v();
        } else {
            cga f = amh.f(cga.e, 16.0f, 8.0f, 24.0f, 8.0f);
            ajw.e eVar = ajw.c;
            int i7 = cfq.a;
            cue a2 = akk.a(eVar, cfq.a.m, c, 0);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b2 = cfv.b(c, f);
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
            ahji.e(str, null, bmp.a(c).q, 0L, 0L, null, 0L, 0, false, 0, 0, null, bmp.d(c).j, c, i6 & 14, 0, 65530);
            ahji.e(str2, null, bmp.a(c).q, 0L, 0L, null, 0L, 0, false, 0, 0, null, bmp.d(c).k, c, (i6 >> 3) & 14, 0, 65530);
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeol(str, str2, i, 2, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void aw(defpackage.ake r21, defpackage.aeoi r22, defpackage.aeoa r23, defpackage.byn r24, boolean r25, defpackage.bwj r26, int r27) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adom.aw(ake, aeoi, aeoa, byn, boolean, bwj, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [cga] */
    public static void ax(ake akeVar, boolean z, aeoi aeoiVar, aeoa aeoaVar, byn bynVar, bwj bwjVar, int i) {
        int i2;
        cga.a aVar;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i & 14;
        bwj c = bwjVar.c(-1591634878);
        if (i8 == 0) {
            if (true != c.G(akeVar)) {
                i7 = 2;
            } else {
                i7 = 4;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.H(z)) {
                i6 = 16;
            } else {
                i6 = 32;
            }
            i2 |= i6;
        }
        if ((i & 896) == 0) {
            if (true != c.G(aeoiVar)) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i2 |= i5;
        }
        if ((i & 7168) == 0) {
            if (true != c.G(aeoaVar)) {
                i4 = 1024;
            } else {
                i4 = 2048;
            }
            i2 |= i4;
        }
        if ((57344 & i) == 0) {
            if (true != c.G(bynVar)) {
                i3 = 8192;
            } else {
                i3 = 16384;
            }
            i2 |= i3;
        }
        if ((46811 & i2) == 9362 && c.L()) {
            c.v();
        } else {
            cga b2 = akeVar.b(cga.e);
            int i9 = cfq.a;
            cue a2 = akc.a(cfq.a.e, false);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b3 = cfv.b(c, b2);
            int i10 = cwl.a;
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
            caw.b(c, b3, cwl.a.c);
            if (z) {
                c.y(1606502922);
                aA(aeoiVar, c, (i2 >> 6) & 14);
                bwkVar.Y();
            } else {
                c.y(1606554196);
                aepp aeppVar = aeoaVar.b;
                cga.a aVar2 = cga.e;
                if (aeppVar != null) {
                    aVar = J(aVar2, bynVar, aeppVar, aeoaVar.i);
                } else {
                    aVar = aVar2;
                }
                aepp aeppVar2 = aeoaVar.b;
                if (aeppVar2 != null) {
                    z2 = aeppVar2.b;
                } else {
                    z2 = true;
                }
                if (aeoaVar.a == aenw.f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                aB(z2, z3, aVar, aeoaVar.h.b, c, 0);
                bwkVar.Y();
            }
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeod(akeVar, z, aeoiVar, aeoaVar, bynVar, i, 0);
        }
    }

    public static void ay(aeoi aeoiVar, boolean z, boolean z2, bwj bwjVar, int i, int i2) {
        int i3;
        int i4;
        boolean z3;
        int i5;
        int i6;
        boolean z4 = z;
        boolean z5 = z2;
        int i7 = i2 & 1;
        bwj c = bwjVar.c(-133112426);
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (true != c.G(aeoiVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        boolean z6 = false;
        if (i8 != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (true != c.H(z)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i3 |= i5;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            z6 = true;
        }
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (true != c.H(z2)) {
                i6 = 128;
            } else {
                i6 = 256;
            }
            i3 |= i6;
        }
        if ((i3 & 731) == 146 && c.L()) {
            c.v();
        } else {
            z4 &= z3;
            z5 &= z6;
            aC(aeoiVar.b, aeoiVar.c, aeoiVar.f, dea.a(cga.e, "Compose:Draft:Send"), cdk.e(-815516524, new aeoe(z4, aeoiVar, z5), c), c, 27648);
        }
        boolean z7 = z5;
        boolean z8 = z4;
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeof(aeoiVar, z8, z7, i, i2);
        }
    }

    public static void az(aenr aenrVar, aeoa aeoaVar, byn bynVar, bwj bwjVar, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        bynVar.getClass();
        int i6 = i & 14;
        bwj c = bwjVar.c(-2081205287);
        boolean z3 = true;
        if (i6 == 0) {
            if (true != c.G(aenrVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aeoaVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c.G(bynVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            cga a2 = dea.a(cga.e, "Compose:Draft:Send");
            if (aenrVar.d.g.b && !aenrVar.a() && !aeoaVar.g) {
                z = aT(aenw.f, aeoaVar);
            } else {
                z = aenrVar.d.f;
            }
            aeoi aeoiVar = aenrVar.d;
            c.y(-561212979);
            if ((i2 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i2 & 112) != 32) {
                z3 = false;
            }
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if ((z2 | z3) || T == bwj.a.a) {
                T = new aenj(aenrVar, aeoaVar, 2, null);
                bwkVar.ad(T);
            }
            arqg arqgVar = aeoiVar.c;
            bwkVar.Y();
            aC((arqg) T, arqgVar, z, a2, cdk.e(1852108503, new qjl(aeoaVar, aenrVar, bynVar, 7), c), c, 27648);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelx(aenrVar, aeoaVar, bynVar, i, 6);
        }
    }

    public static synchronized void b() {
        synchronized (adom.class) {
            if (a == null) {
                a = new adom();
            }
        }
    }

    public static void bA(afat afatVar, cit citVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        citVar.getClass();
        int i5 = i & 14;
        bwj c = bwjVar.c(-1083361201);
        if (i5 == 0) {
            if (true != c.G(afatVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(citVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else if (afatVar instanceof afas) {
            c.y(-943769120);
            bD((afas) afatVar, c, 0);
            ((bwk) c).Y();
        } else if (afatVar instanceof afar) {
            c.y(-943766927);
            bB((afar) afatVar, citVar, c, i2 & 112);
            ((bwk) c).Y();
        } else if (afatVar instanceof afap) {
            c.y(808075449);
            ((bwk) c).Y();
        } else {
            c.y(-943770664);
            ((bwk) c).Y();
            throw new armm();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexd(afatVar, citVar, i, 17, null);
        }
    }

    public static void bB(afar afarVar, cit citVar, bwj bwjVar, int i) {
        int i2;
        dje djeVar;
        String str;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(738665632);
        boolean z = true;
        if (i5 == 0) {
            if (true != c.G(afarVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(citVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            long j = bmp.a(c).q;
            c.y(-173877200);
            boolean F = c.F(j);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (F || T == bwj.a.a) {
                T = new byu(new cmd(j), cav.a);
                bwkVar.ad(T);
            }
            byn bynVar = (byn) T;
            bwkVar.Y();
            String str2 = afarVar.a;
            c.y(-173874294);
            boolean G = c.G(str2);
            Object T2 = bwkVar.T();
            if (G || T2 == bwj.a.a) {
                byu byuVar = new byu(afarVar.a, cav.a);
                bwkVar.ad(byuVar);
                T2 = byuVar;
            }
            byn bynVar2 = (byn) T2;
            bwkVar.Y();
            cij cijVar = (cij) c.g(dch.e);
            if (afarVar.c) {
                c.y(-1094972756);
                djeVar = bmp.d(c).k;
                bwkVar.Y();
            } else {
                c.y(-1094918165);
                djeVar = ca(c).f;
                bwkVar.Y();
            }
            dje djeVar2 = djeVar;
            cga a2 = dea.a(civ.a(cga.e, citVar), "search_box_text_field_test_tag");
            cmd cmdVar = (cmd) bynVar.a();
            ayc aycVar = new ayc(0, 0, 3, 118);
            ayb aybVar = new ayb(null, new aaop(afarVar, cijVar, 17), null, 47);
            dje y = dje.y(djeVar2, bmp.a(c).q, 0L, null, null, null, null, 0L, 0, 0, 0L, null, null, 0, 16777214);
            String cB = cB(bynVar2);
            c.y(-173849573);
            boolean G2 = c.G(bynVar2);
            if ((i2 & 14) != 4) {
                z = false;
            }
            boolean z2 = G2 | z;
            Object T3 = bwkVar.T();
            if (z2 || T3 == bwj.a.a) {
                T3 = new aaop(afarVar, bynVar2, 18);
                bwkVar.ad(T3);
            }
            bwkVar.Y();
            awo.c(cB, (arqr) T3, a2, false, y, aycVar, aybVar, true, 0, 0, null, null, null, cmdVar, null, c, 102236160, 0, 48664);
            if (cB(bynVar2).length() == 0 && ((str = afarVar.b) == null || str.length() > 0)) {
                String str3 = afarVar.b;
                c.y(-173841138);
                if (str3 == null) {
                    str3 = dga.a(R.string.top_app_bar_default_hint_text, c);
                }
                bwkVar.Y();
                ahji.e(str3, null, bmp.a(c).s, 0L, 0L, null, 0L, 2, false, 1, 0, null, djeVar2, c, 0, 3120, 55290);
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexd(afarVar, citVar, i, 18, null);
        }
    }

    public static void bC(String str, bwj bwjVar, int i) {
        int i2;
        bwj bwjVar2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1434485277);
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
            ahji.e(str, null, bmp.a(c).s, 0L, 0L, null, 0L, 2, false, 1, 0, null, bmp.d(c).l, bwjVar2, i2 & 14, 3120, 55290);
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new aexq(str, i, 16);
        }
    }

    public static void bD(afas afasVar, bwj bwjVar, int i) {
        int i2;
        float f;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-850010560);
        if (i4 == 0) {
            if (true != c.G(afasVar)) {
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
            boolean z = afasVar.d;
            c.y(-1911261715);
            boolean H = c.H(z);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (H || T == bwj.a.a) {
                T = zk.a(brg.a);
                bwkVar.ad(T);
            }
            zj zjVar = (zj) T;
            bwkVar.Y();
            aewe aeweVar = afasVar.c;
            if (aeweVar != null) {
                f = -12.0f;
            } else {
                f = -4.0f;
            }
            bz(afasVar.e, cdk.e(-1404530718, new afau(f, afasVar, zjVar, aeweVar), c), c, 48);
            bxl.g(Boolean.valueOf(afasVar.d), new aemw(afasVar, zjVar, bZ(c).m, (arpe) null, 3), c);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexq(afasVar, i, 17);
        }
    }

    public static void bE(aehz aehzVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(910636515);
        if (i4 == 0) {
            if (true != c.G(aehzVar)) {
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
            aerb aerbVar = aehzVar.b;
            if (aerbVar != null) {
                c.y(-1643923185);
                bG(aehzVar.c, cdk.e(1155135947, new ifo(aehzVar, aerbVar, 20, null), c), c, 48);
                ((bwk) c).Y();
            } else {
                c.y(-1643822187);
                bH(aehzVar, c, i2 & 14);
                ((bwk) c).Y();
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexq(aehzVar, i, 13);
        }
    }

    public static void bF(aehz aehzVar, aerb aerbVar, bwj bwjVar, int i) {
        int i2;
        boolean booleanValue;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(1841323421);
        boolean z = true;
        if (i5 == 0) {
            if (true != c.G(aehzVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aerbVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            c.y(1791330390);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                byu byuVar = new byu(false, cav.a);
                bwkVar.ad(byuVar);
                T = byuVar;
            }
            byn bynVar = (byn) T;
            bwkVar.Y();
            c.y(1791332485);
            int i6 = i2 & 14;
            Object T2 = bwkVar.T();
            if (i6 == 4 || T2 == bwj.a.a) {
                T2 = new aenj(aehzVar, bynVar, 7);
                bwkVar.ad(T2);
            }
            arqg arqgVar = (arqg) T2;
            bwkVar.Y();
            if (aehzVar.g.isEmpty()) {
                z = aehzVar.f;
            }
            ahji.P(arqgVar, null, z, null, null, cdk.e(1258538175, new aezg(aerbVar, aehzVar, 2, null), c), c, 1572864, 58);
            List list = aehzVar.g;
            booleanValue = ((Boolean) bynVar.a()).booleanValue();
            c.y(1791346357);
            Object T3 = bwkVar.T();
            if (T3 == bwj.a.a) {
                T3 = new aetz(bynVar, 6);
                bwkVar.ad(T3);
            }
            bwkVar.Y();
            bK(list, booleanValue, (arqg) T3, c, 3080);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexd(aehzVar, aerbVar, i, 14);
        }
    }

    public static void bG(boolean z, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-649054573);
        if (i5 == 0) {
            if (true != c.H(z)) {
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
        } else if (z) {
            c.y(-1919468262);
            cga.a aVar = cga.e;
            int i6 = cfq.a;
            cue a2 = akc.a(cfq.a.a, false);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b2 = cfv.b(c, aVar);
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
            akf akfVar = akf.a;
            ahji.ar(amd.b(akfVar.a(cga.e, cfq.a.c), -10.0f, 10.0f), 0L, 0L, c, 0);
            arqwVar.a(akfVar, c, Integer.valueOf((i2 & 112) | 6));
            c.p();
            bwkVar.Y();
        } else {
            c.y(-1919254703);
            int i8 = i2 << 6;
            cga.a aVar2 = cga.e;
            int i9 = cfq.a;
            cue a4 = akc.a(cfq.a.a, false);
            int a5 = bwg.a(c);
            bwk bwkVar2 = (bwk) c;
            byx P2 = bwkVar2.P();
            cga b3 = cfv.b(c, aVar2);
            int i10 = cwl.a;
            arqg arqgVar2 = cwl.a.a;
            c.A();
            if (bwkVar2.y) {
                c.l(arqgVar2);
            } else {
                c.C();
            }
            caw.b(c, a4, cwl.a.e);
            caw.b(c, P2, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar2.y || !d.F(bwkVar2.T(), Integer.valueOf(a5))) {
                Integer valueOf2 = Integer.valueOf(a5);
                bwkVar2.ad(valueOf2);
                c.j(valueOf2, arqvVar2);
            }
            caw.b(c, b3, cwl.a.c);
            arqwVar.a(akf.a, c, Integer.valueOf((((i8 & 7168) >> 6) & 112) | 6));
            c.p();
            bwkVar2.Y();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelm(z, arqwVar, i, 14);
        }
    }

    public static void bH(aehz aehzVar, bwj bwjVar, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1914539188);
        if (i4 == 0) {
            if (true != c.G(aehzVar)) {
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
            c.y(-111089014);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                byu byuVar = new byu(false, cav.a);
                bwkVar.ad(byuVar);
                T = byuVar;
            }
            byn bynVar = (byn) T;
            bwkVar.Y();
            c.y(-111086951);
            int i5 = i2 & 14;
            Object T2 = bwkVar.T();
            if (i5 == 4 || T2 == bwj.a.a) {
                T2 = new aenj(aehzVar, bynVar, 8);
                bwkVar.ad(T2);
            }
            arqg arqgVar = (arqg) T2;
            bwkVar.Y();
            if (aehzVar.g.isEmpty()) {
                z = aehzVar.f;
            } else {
                z = true;
            }
            ahji.an(arqgVar, null, z, null, null, null, null, cdk.e(493951241, new afao(aehzVar, bynVar, 1), c), c, 805306368, 506);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexq(aehzVar, i, 14);
        }
    }

    public static void bI(aehz aehzVar, boolean z, boolean z2, bwj bwjVar, int i) {
        int i2;
        aerb aerbVar;
        cga cgaVar;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(-1270813441);
        if (i6 == 0) {
            if (true != c.G(aehzVar)) {
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
            if (true != c.H(z2)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else if (!z && aehzVar.f && (aerbVar = aehzVar.b) != null) {
            arqg arqgVar = aehzVar.j;
            cga.a aVar = cga.e;
            if (z2) {
                cgaVar = amd.c(amh.j(cga.e, 4.0f, brg.a, brg.a, brg.a, 14), -4.0f, brg.a, 2);
            } else {
                cgaVar = aVar;
            }
            ahji.P(arqgVar, cgaVar, false, null, null, cdk.e(67325946, new aezg(aerbVar, aehzVar, 4, null), c), c, 1572864, 60);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new afan(aehzVar, z, z2, i, 0);
        }
    }

    public static void bJ(List list, bwj bwjVar, int i) {
        bwj c = bwjVar.c(-6680137);
        c.y(-1191137311);
        bwk bwkVar = (bwk) c;
        Object T = bwkVar.T();
        if (T == bwj.a.a) {
            byu byuVar = new byu(false, cav.a);
            bwkVar.ad(byuVar);
            T = byuVar;
        }
        byn bynVar = (byn) T;
        bwkVar.Y();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((aehz) obj).d) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        armo armoVar = new armo(arrayList, arrayList2);
        List list2 = (List) armoVar.a;
        List list3 = (List) armoVar.b;
        c.y(-1191133479);
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            bE((aehz) it.next(), c, 0);
        }
        bwkVar.Y();
        if (!list2.isEmpty()) {
            c.y(-1191129614);
            Object T2 = bwkVar.T();
            if (T2 == bwj.a.a) {
                T2 = new aetz(bynVar, 8);
                bwkVar.ad(T2);
            }
            bwkVar.Y();
            ahji.P((arqg) T2, null, false, null, null, cdk.e(-451910032, new aezg(list2, bynVar, 3, null), c), c, 1572870, 62);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexq(list, i, 15);
        }
    }

    public static void bK(List list, boolean z, arqg arqgVar, bwj bwjVar, int i) {
        bwj c = bwjVar.c(-381484834);
        if (list.isEmpty()) {
            bzz e = c.e();
            if (e != null) {
                ((bzf) e).d = new jyn(list, z, arqgVar, i, 19);
                return;
            }
            return;
        }
        ahji.J(z, arqgVar, null, 0L, null, null, null, 0L, brg.a, cdk.e(-357660455, new afao((Object) list, arqgVar, 0), c), c, (i >> 6) & 126, 48, 2044);
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new jyn(list, z, arqgVar, i, 20);
        }
    }

    public static /* synthetic */ void bL(List list, boolean z, arqg arqgVar, bwj bwjVar, int i) {
        bwj c = bwjVar.c(-1967271891);
        int i2 = i >> 6;
        ahji.J(z, arqgVar, amv.t(cga.e, 192.0f, brg.a, 2), 0L, null, null, null, 0L, brg.a, cdk.e(-1943447512, new afao((Object) list, arqgVar, 2), c), c, (i2 & 14) | 384 | (i2 & 112), 48, 2040);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new afym(list, z, arqgVar, i, 1);
        }
    }

    public static /* synthetic */ void bM(aehz aehzVar, arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(-1384131308);
        if (i6 == 0) {
            if (true != c.G(aehzVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.H(false)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c.I(arqgVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            boolean z = aehzVar.f;
            c.y(1491059521);
            ((bwk) c).Y();
            ahji.K(cdk.e(-1977622716, new aeyl(aehzVar, 3), c), arqgVar, null, z, null, null, null, c, ((i2 >> 3) & 112) | 6, 468);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexd(aehzVar, arqgVar, i, 15);
        }
    }

    public static void bN(afam afamVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        arqvVar.getClass();
        int i5 = i & 14;
        bwj c = bwjVar.c(-7607429);
        if (i5 == 0) {
            if (true != c.G(afamVar)) {
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
            i6 = i2 | 176;
        }
        if ((i & 7168) == 0) {
            i6 |= 1024;
        }
        if ((57344 & i) == 0) {
            i6 |= 8192;
        }
        if ((458752 & i) == 0) {
            if (true != c.I(arqvVar)) {
                i3 = 65536;
            } else {
                i3 = 131072;
            }
            i6 |= i3;
        }
        if ((374491 & i6) == 74898 && c.L()) {
            c.v();
            bzz e = c.e();
            if (e != null) {
                ((bzf) e).d = new aexd(afamVar, arqvVar, i, 13);
                return;
            }
            return;
        }
        c.w();
        if ((i & 1) != 0 && !c.J()) {
            c.v();
        } else {
            cga.a aVar = cga.e;
            long j = bmp.a(c).p;
            long j2 = bmp.a(c).s;
            long j3 = bmp.a(c).a;
        }
        c.n();
        throw null;
    }

    public static void bO(cga cgaVar, arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(1814479188);
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
            arqv arqvVar = afak.a;
            ahji.P(arqgVar, cgaVar, false, null, null, arqvVar, c, ((i2 >> 3) & 14) | 1572864 | ((i2 << 3) & 112), 60);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexd(cgaVar, arqgVar, i, 12);
        }
    }

    public static void bP(aerb aerbVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-879152371);
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
            ahji.N(aeke.bg(aerbVar, c), null, amv.g(amh.j(cga.e, brg.a, brg.a, 10.0f, brg.a, 11), 18.0f), bmp.a(c).s, c, 392, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexq(aerbVar, i, 11);
        }
    }

    public static void bQ(arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-2042151454);
        if (i4 == 0) {
            if (true != c.I(arqwVar)) {
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
            bqv.c(amv.q(cga.e, 36.0f, brg.a, 2), bmp.c(c).c, bmp.a(c).I, 0L, brg.a, brg.a, null, cdk.e(-1123463235, new aeyl(arqwVar, 2), c), c, 120);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexq(arqwVar, i, 12);
        }
    }

    public static void bR(afal afalVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        afalVar.getClass();
        int i5 = i & 14;
        bwj c = bwjVar.c(395308051);
        if (i5 == 0) {
            if (true != c.G(afalVar)) {
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
            cue a2 = akc.a(cfq.a.e, false);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b2 = cfv.b(c, cgaVar);
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
            akf akfVar = akf.a;
            bQ(cdk.e(-602027282, new aeyj(afalVar, 3), c), c, 6);
            arqg arqgVar2 = afalVar.d;
            c.y(-266029683);
            bO(akfVar.a(cga.e, cfq.a.f), arqgVar2, c, 0);
            bwkVar.Y();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexd(afalVar, cgaVar, i, 11, null);
        }
    }

    public static void bS(amt amtVar, String str, List list, bwj bwjVar, int i) {
        bwj c = bwjVar.c(-403573901);
        cga b2 = amtVar.b(cga.e, 1.0f, false);
        int i2 = cfq.a;
        cue a2 = akc.a(cfq.a.a, false);
        int a3 = bwg.a(c);
        bwk bwkVar = (bwk) c;
        byx P = bwkVar.P();
        cga b3 = cfv.b(c, b2);
        int i3 = cwl.a;
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
        caw.b(c, b3, cwl.a.c);
        cga i4 = amh.i(amh.j(cga.e, brg.a, brg.a, 36.0f, brg.a, 11), brg.a, 8.0f, 1);
        aeim.f(new aeiq(str, list, 12), i4, bmp.a(c).s, bmp.d(c).l, 0L, null, false, null, c, 0, 496);
        c.p();
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeub(amtVar, str, list, i, 17, (byte[]) null);
        }
    }

    public static void bT(cga cgaVar, List list, boolean z, bwj bwjVar, int i) {
        long j;
        cga a2;
        cga c;
        boolean z2;
        bwj c2 = bwjVar.c(883360582);
        float f = brg.a;
        cga i2 = amh.i(cgaVar, brg.a, 8.0f, 1);
        c2.y(-594100036);
        bwk bwkVar = (bwk) c2;
        Object T = bwkVar.T();
        if (T == bwj.a.a) {
            T = aeys.d;
            bwkVar.ad(T);
        }
        bwkVar.Y();
        cga c3 = dhb.c(i2, true, (arqr) T);
        ajw.b bVar = ajw.a;
        int i3 = cfq.a;
        cue a3 = amq.a(bVar, cfq.a.j, c2, 0);
        int a4 = bwg.a(c2);
        byx P = bwkVar.P();
        cga b2 = cfv.b(c2, c3);
        int i4 = cwl.a;
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
        cga.a aVar = cga.e;
        c2.y(88871036);
        if (z) {
            j = bmp.a(c2).I;
        } else {
            j = cku.g;
        }
        bwkVar.Y();
        a2 = adf.a(aVar, j, clw.a);
        c = amv.c(a2, 1.0f);
        if (z) {
            f = 10.0f;
            z2 = true;
        } else {
            z2 = false;
        }
        cga e = amh.e(c, 24.0f, f);
        cue a5 = akk.a(ajw.c, cfq.a.m, c2, 0);
        int a6 = bwg.a(c2);
        byx P2 = bwkVar.P();
        cga b3 = cfv.b(c2, e);
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
        c2.y(-2132887791);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bU((afag) it.next(), c2, 0);
        }
        bwkVar.Y();
        c2.p();
        c2.p();
        bzz e2 = c2.e();
        if (e2 != null) {
            ((bzf) e2).d = new jyn(cgaVar, list, z2, i, 18, null);
        }
    }

    public static void bU(afag afagVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        int i3;
        int i4 = i & 14;
        bwj c2 = bwjVar.c(-2053730280);
        if (i4 == 0) {
            if (true != c2.G(afagVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !c2.L()) {
            c = amv.c(cga.e, 1.0f);
            ajw.c cVar = ajw.e;
            int i5 = cfq.a;
            cue a2 = amq.a(cVar, cfq.a.j, c2, 54);
            int a3 = bwg.a(c2);
            bwk bwkVar = (bwk) c2;
            byx P = bwkVar.P();
            cga b2 = cfv.b(c2, c);
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
            aerb aerbVar = afagVar.b;
            c2.y(1399278239);
            if (aerbVar != null) {
                bW(aerbVar, c2, 0);
            }
            bwkVar.Y();
            aeim.f(afagVar, null, bmp.a(c2).s, dje.y(bmp.d(c2).l, 0L, 0L, null, null, null, null, 0L, 3, 0, 0L, null, null, 0, 16744447), 0L, null, false, null, c2, i2 & 14, 498);
            c2.p();
        } else {
            c2.v();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new aexq(afagVar, i, 10);
        }
    }

    public static void bV(afaj afajVar, cga cgaVar, boolean z, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(-2049216313);
        if (i6 == 0) {
            if (true != c.G(afajVar)) {
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
            if (true != c.H(z)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else if (afajVar instanceof afai) {
            c.y(-1237634434);
            bT(cgaVar, aqjn.y(((afai) afajVar).a), z, c, (i2 & 896) | ((i2 >> 3) & 14));
            ((bwk) c).Y();
        } else if (afajVar instanceof afah) {
            c.y(-1237520571);
            bT(cgaVar, ((afah) afajVar).a, z, c, (i2 & 896) | ((i2 >> 3) & 14) | 64);
            ((bwk) c).Y();
        } else {
            c.y(-594114551);
            ((bwk) c).Y();
            throw new armm();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jyn(afajVar, cgaVar, z, i, 17);
        }
    }

    public static void bW(aerb aerbVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(281482614);
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
            ahji.N(aeke.bg(aerbVar, c), null, amv.h(amh.j(cga.e, brg.a, 2.0f, 4.0f, brg.a, 9), ((dqv) c.g(dch.d)).ed() * 12.0f), bmp.a(c).s, c, (i2 & 112) | 8, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexq(aerbVar, i, 9);
        }
    }

    public static aezm bX(bwj bwjVar) {
        return (aezm) bwjVar.g(aezn.a);
    }

    public static aezp bY(bwj bwjVar) {
        return (aezp) bwjVar.g(aezq.a);
    }

    public static aezu bZ(bwj bwjVar) {
        return (aezu) bwjVar.g(aezy.a);
    }

    public static /* synthetic */ int ba(Context context, int i) {
        if (i == 0) {
            return 0;
        }
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            switch (cz(i)) {
                case -16749196:
                    return -11677471;
                case -15502541:
                    return -8271467;
                case -15181124:
                    return -7686920;
                case -9033797:
                    return -3831047;
                case -6728704:
                    return -217744;
                case -4716942:
                    return -29749;
                default:
                    return i;
            }
        }
        return cz(i);
    }

    public static /* synthetic */ int bb(int i) {
        return (int) (i * Resources.getSystem().getDisplayMetrics().density);
    }

    public static WebView bc(byn bynVar) {
        return (WebView) bynVar.a();
    }

    /* JADX WARN: Type inference failed for: r2v18, types: [cas, java.lang.Object] */
    public static void bd(adec adecVar, List list, cga cgaVar, bwj bwjVar, int i) {
        boolean z;
        adecVar.getClass();
        list.getClass();
        bwj c = bwjVar.c(-1546687207);
        c.y(2062471267);
        bwk bwkVar = (bwk) c;
        Object T = bwkVar.T();
        if (T == bwj.a.a) {
            T = bxl.a(arpj.a, c);
            bwkVar.ad(T);
        }
        arwe arweVar = (arwe) T;
        c.y(27994143);
        boolean G = c.G(arweVar);
        Object T2 = bwkVar.T();
        if (G || T2 == bwj.a.a) {
            T2 = new adtl(arweVar);
            bwkVar.ad(T2);
        }
        adtl adtlVar = (adtl) T2;
        bwkVar.Y();
        bwkVar.Y();
        c.y(-1185233820);
        Object T3 = bwkVar.T();
        if (T3 == bwj.a.a) {
            T3 = aeys.f;
            bwkVar.ad(T3);
        }
        arqr arqrVar = (arqr) T3;
        bwkVar.Y();
        c.y(-1185232636);
        Object T4 = bwkVar.T();
        if (T4 == bwj.a.a) {
            T4 = aeys.g;
            bwkVar.ad(T4);
        }
        arqr arqrVar2 = (arqr) T4;
        bwkVar.Y();
        c.y(-1185231083);
        Object T5 = bwkVar.T();
        if (T5 == bwj.a.a) {
            T5 = new afce(new aipq(list));
            bwkVar.ad(T5);
        }
        afce afceVar = (afce) T5;
        bwkVar.Y();
        c.y(-1185226965);
        Object T6 = bwkVar.T();
        if (T6 == bwj.a.a) {
            T6 = new afca();
            bwkVar.ad(T6);
        }
        afca afcaVar = (afca) T6;
        bwkVar.Y();
        int i2 = i & (-264298497);
        c.y(-1185224463);
        Object T7 = bwkVar.T();
        if (T7 == bwj.a.a) {
            T7 = aeys.h;
            bwkVar.ad(T7);
        }
        arqr arqrVar3 = (arqr) T7;
        bwkVar.Y();
        c.y(-1185223219);
        Object T8 = bwkVar.T();
        if (T8 == bwj.a.a) {
            byu byuVar = new byu(null, cav.a);
            bwkVar.ad(byuVar);
            T8 = byuVar;
        }
        byn bynVar = (byn) T8;
        bwkVar.Y();
        boolean booleanValue = ((Boolean) adtlVar.c.a()).booleanValue();
        c.y(-1185219977);
        Object T9 = bwkVar.T();
        if (T9 == bwj.a.a) {
            T9 = new aetz(bynVar, 11);
            bwkVar.ad(T9);
        }
        bwkVar.Y();
        a.bS(booleanValue, (arqg) T9, c, 48, 0);
        WebView bc = bc(bynVar);
        c.y(-1185218021);
        if ((((57344 & i) ^ 24576) > 16384 && c.G(adtlVar)) || (i & 24576) == 16384) {
            z = true;
        } else {
            z = false;
        }
        Object T10 = bwkVar.T();
        if (z || T10 == bwj.a.a) {
            T10 = new adzx(adtlVar, bynVar, (arpe) null, 9);
            bwkVar.ad(T10);
        }
        bwkVar.Y();
        bxl.f(bc, adtlVar, (arqv) T10, c);
        cas a2 = cap.a(arqrVar2, c);
        WebView bc2 = bc(bynVar);
        c.y(-1185213877);
        if (bc2 != null) {
            bxl.c(bc2, new aaop(bc2, a2, 19, null), c);
        }
        bwkVar.Y();
        afceVar.b = adecVar;
        adtlVar.getClass();
        afceVar.a = adtlVar;
        afcaVar.a = adecVar;
        akh.a(cgaVar, null, cdk.e(360397423, new afci(((Boolean) c.g(dda.a)).booleanValue(), adecVar, adtlVar, arqrVar3, arqrVar, afcaVar, afceVar, bynVar), c), c, ((i2 >> 6) & 14) | 3072, 6);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new afhf(adecVar, list, cgaVar, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void be(defpackage.afbz r24, defpackage.cga r25, boolean r26, int r27, boolean r28, defpackage.arqv r29, defpackage.arqw r30, defpackage.bwj r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adom.be(afbz, cga, boolean, int, boolean, arqv, arqw, bwj, int, int):void");
    }

    public static cga bf(cga cgaVar, long j, long j2, float f) {
        cgaVar.getClass();
        return cho.a(cgaVar, new afbx(j, j2, f));
    }

    public static void bg(ake akeVar, String str, bwj bwjVar, int i) {
        int i2;
        long f;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-1351040213);
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
            cga.a aVar = cga.e;
            int i6 = cfq.a;
            cga a2 = dea.a(amh.j(akeVar.a(aVar, cfq.a.g), 8.0f, brg.a, brg.a, 8.0f, 6), "video_controls_duration_tag");
            f = ckw.f(cku.d(r6), cku.c(r6), cku.b(r6), 0.7f, cku.f(bX(c).i));
            bqv.c(a2, awh.a, f, 0L, brg.a, brg.a, null, cdk.e(1818921584, new aeyl(str, 5), c), c, 120);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexd(akeVar, str, i, 20);
        }
    }

    public static void bh(aerb aerbVar, String str, bwj bwjVar, int i) {
        int i2;
        cga a2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(1366438761);
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
            if (true != c.G(str)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !c.L()) {
            a2 = adf.a(amv.h(cga.e, 16.0f), cku.a, clw.a);
            amx.a(a2, c);
            ahji.N(aeke.bg(aerbVar, c), str, amv.h(cga.e, 40.0f), cku.d, c, (i2 & 112) | 3464, 0);
        } else {
            c.v();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new afbs(aerbVar, str, i, 0);
        }
    }

    public static void bi(ake akeVar, arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(-1150281173);
        if (i6 == 0) {
            if (true != c.G(akeVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.H(false)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c.I(arqgVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            aerb aerbVar = aerb.cv;
            c.y(1636371871);
            String a2 = dga.a(R.string.video_controls_play_content_description, c);
            bwk bwkVar = (bwk) c;
            bwkVar.Y();
            if (arqgVar != null) {
                c.y(1636475783);
                cga.a aVar = cga.e;
                int i7 = cfq.a;
                ahji.P(arqgVar, akeVar.a(aVar, cfq.a.e), false, null, null, cdk.e(-164085724, new aezg(aerbVar, a2, 6), c), c, ((i2 >> 6) & 14) | 1572864, 60);
                bwkVar.Y();
            } else {
                c.y(1636646748);
                cga.a aVar2 = cga.e;
                int i8 = cfq.a;
                cga a3 = akeVar.a(aVar2, cfq.a.e);
                cue a4 = akc.a(cfq.a.e, false);
                int a5 = bwg.a(c);
                byx P = bwkVar.P();
                cga b2 = cfv.b(c, a3);
                int i9 = cwl.a;
                arqg arqgVar2 = cwl.a.a;
                c.A();
                if (bwkVar.y) {
                    c.l(arqgVar2);
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
                caw.b(c, b2, cwl.a.c);
                bh(aerbVar, a2, c, 0);
                c.p();
                bwkVar.Y();
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new afbs(akeVar, arqgVar, i, 1);
        }
    }

    public static void bj(ake akeVar, afbt afbtVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(1713133330);
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
            if (true != c.G(afbtVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            cga b2 = akeVar.b(cga.e);
            int i6 = cfq.a;
            cue a2 = akc.a(cfq.a.a, false);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b3 = cfv.b(c, b2);
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
            caw.b(c, b3, cwl.a.c);
            akf akfVar = akf.a;
            c.y(522353130);
            bi(akfVar, afbtVar.b, c, 6);
            bwkVar.Y();
            String str = afbtVar.a;
            c.y(522357908);
            if (str != null) {
                bg(akfVar, str, c, 6);
            }
            bwkVar.Y();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeub(akeVar, (Object) afbtVar, (Object) cgaVar, i, 20);
        }
    }

    public static Uri bk(byn bynVar) {
        return (Uri) bynVar.a();
    }

    public static Uri bl(byn bynVar) {
        return (Uri) bynVar.a();
    }

    public static void bm(afbr afbrVar, Object obj, awg awgVar, bwj bwjVar, int i) {
        boolean z;
        Uri uri;
        bwj c = bwjVar.c(-427239681);
        c.y(-1457992604);
        bwk bwkVar = (bwk) c;
        Object T = bwkVar.T();
        if (T == bwj.a.a) {
            byu byuVar = new byu(Uri.EMPTY, cav.a);
            bwkVar.ad(byuVar);
            T = byuVar;
        }
        byn bynVar = (byn) T;
        bwkVar.Y();
        c.y(-1457990525);
        boolean G = c.G(obj);
        Object T2 = bwkVar.T();
        if (G || T2 == bwj.a.a) {
            T2 = new byu(null, cav.a);
            bwkVar.ad(T2);
        }
        byn bynVar2 = (byn) T2;
        bwkVar.Y();
        c.y(-1457988512);
        Object T3 = bwkVar.T();
        if (T3 == bwj.a.a) {
            byu byuVar2 = new byu(false, cav.a);
            bwkVar.ad(byuVar2);
            T3 = byuVar2;
        }
        byn bynVar3 = (byn) T3;
        bwkVar.Y();
        if (afbrVar.f.a) {
            if (!d.F(afbrVar.a, Uri.EMPTY) && (d.F(bk(bynVar), Uri.EMPTY) || !d.F(bk(bynVar), afbrVar.a))) {
                cA(bynVar, afbrVar.a);
            }
        } else if (d.F(bk(bynVar), Uri.EMPTY) && !d.F(afbrVar.a, Uri.EMPTY)) {
            cA(bynVar, afbrVar.a);
        }
        if (bl(bynVar2) == null && (uri = afbrVar.b) != null) {
            bynVar2.h(uri);
        }
        cga aN = aetn.aN(cga.e, afbrVar.g, true);
        if (bl(bynVar2) != null) {
            z = true;
        } else {
            z = false;
        }
        aetn.b(afbrVar, aN, awgVar, z, cdk.e(1419684932, new aeoc(afbrVar, bynVar3, bynVar, bynVar2, 3), c), c, (i & 14) | 24576 | (i & 896), 0);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeub(afbrVar, obj, awgVar, i, 19);
        }
    }

    public static Object bn(crk crkVar, arqr arqrVar, boolean z, arpe arpeVar) {
        Object d = arwi.d(new afbk(crkVar, z, arqrVar, new afbo(crkVar), null), arpeVar);
        if (d == arpl.a) {
            return d;
        }
        return arnb.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
    
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0095 -> B:11:0x0097). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object bo(defpackage.cqg r13, defpackage.arpe r14) {
        /*
            boolean r0 = r14 instanceof defpackage.afbl
            if (r0 == 0) goto L13
            r0 = r14
            afbl r0 = (defpackage.afbl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            afbl r0 = new afbl
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L3c
            if (r2 == r6) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r13 = r0.a
            defpackage.aqil.P(r14)
            goto L97
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            java.lang.Object r13 = r0.a
            defpackage.aqil.P(r14)
            goto L4c
        L3c:
            defpackage.aqil.P(r14)
        L3f:
            cqs r14 = defpackage.cqs.a
            r0.a = r13
            r0.c = r6
            java.lang.Object r14 = r13.r(r14, r0)
            if (r14 != r1) goto L4c
            return r1
        L4c:
            cqq r14 = (defpackage.cqq) r14
            java.util.List r2 = r14.a
            int r7 = r2.size()
            r8 = r5
        L55:
            if (r8 >= r7) goto Lb6
            java.lang.Object r9 = r2.get(r8)
            crc r9 = (defpackage.crc) r9
            boolean r9 = defpackage.cqr.f(r9)
            if (r9 != 0) goto Lb3
            java.util.List r14 = r14.a
            int r2 = r14.size()
            r7 = r5
        L6a:
            if (r7 >= r2) goto L8b
            java.lang.Object r8 = r14.get(r7)
            crc r8 = (defpackage.crc) r8
            boolean r9 = r8.c()
            if (r9 != 0) goto L8a
            long r9 = r13.o()
            long r11 = r13.a()
            boolean r8 = defpackage.cqr.h(r8, r9, r11)
            if (r8 == 0) goto L87
            goto L8a
        L87:
            int r7 = r7 + 1
            goto L6a
        L8a:
            return r3
        L8b:
            cqs r14 = defpackage.cqs.c
            r0.a = r13
            r0.c = r4
            java.lang.Object r14 = r13.r(r14, r0)
            if (r14 == r1) goto Lb2
        L97:
            cqq r14 = (defpackage.cqq) r14
            java.util.List r14 = r14.a
            int r2 = r14.size()
            r7 = r5
        La0:
            if (r7 >= r2) goto L3f
            java.lang.Object r8 = r14.get(r7)
            crc r8 = (defpackage.crc) r8
            boolean r8 = r8.c()
            if (r8 == 0) goto Laf
            return r3
        Laf:
            int r7 = r7 + 1
            goto La0
        Lb2:
            return r1
        Lb3:
            int r8 = r8 + 1
            goto L55
        Lb6:
            java.util.List r13 = r14.a
            java.lang.Object r13 = defpackage.aqjn.Z(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adom.bo(cqg, arpe):java.lang.Object");
    }

    public static void bq(arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        arqvVar.getClass();
        int i4 = i & 14;
        bwj c = bwjVar.c(1861542867);
        if (i4 == 0) {
            if (true != c.I(arqvVar)) {
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
            bwx.a(dch.i.c(drk.a), cdk.e(88819859, new aeyl(arqvVar, 4), c), c, 56);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new afaz(arqvVar, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void br(defpackage.afbg r23, defpackage.cga r24, long r25, defpackage.bwj r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adom.br(afbg, cga, long, bwj, int, int):void");
    }

    public static void bs(long j, bwj bwjVar, int i) {
        int i2;
        cga a2;
        cga a3;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(1831720063);
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
            hdw ah = gvf.ah(new heb(), c);
            kkc[] kkcVarArr = new kkc[1];
            Integer num = hbq.a;
            Integer valueOf = Integer.valueOf(ckw.b(j));
            String[] strArr = {"**"};
            c.y(-1788530187);
            c.y(-1522843975);
            boolean G = c.G(strArr);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (G || T == bwj.a.a) {
                T = new heo((String[]) Arrays.copyOf(strArr, 1));
                bwkVar.ad(T);
            }
            heo heoVar = (heo) T;
            bwkVar.Y();
            c.y(-1522842278);
            boolean G2 = c.G(heoVar) | c.G(num) | c.G(valueOf);
            Object T2 = bwkVar.T();
            if (G2 || T2 == bwj.a.a) {
                T2 = new kkc((Object) num, heoVar, (Object) valueOf);
                bwkVar.ad(T2);
            }
            bwkVar.Y();
            bwkVar.Y();
            kkcVarArr[0] = (kkc) T2;
            c.y(-395574495);
            int hashCode = Arrays.hashCode(kkcVarArr);
            c.y(1068508243);
            boolean E = c.E(hashCode);
            Object T3 = bwkVar.T();
            if (E || T3 == bwj.a.a) {
                T3 = new rae(aqil.p(kkcVarArr));
                bwkVar.ad(T3);
            }
            rae raeVar = (rae) T3;
            bwkVar.Y();
            bwkVar.Y();
            if (ah.a() != null) {
                a2 = cga.e.a(amv.b);
                a3 = a2.a(new AspectRatioElement());
                gvf.am(ah.a(), dea.a(aeke.bh(a3, (drk) c.g(dch.i)), "Lottie"), false, false, null, brg.a, Integer.MAX_VALUE, 0, raeVar, c, 1572872, 4096, 253884);
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeut(j, i, 3);
        }
    }

    public static void bt(afbb afbbVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        int i3;
        int i4 = i & 14;
        bwj c2 = bwjVar.c(1753589671);
        if (i4 == 0) {
            if (true != c2.G(afbbVar)) {
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
            float f = afbbVar.b;
            c = amv.c(cga.e, 1.0f);
            ahji.C(f, dea.a(amv.d(c, 1.0f), "progress_bar"), bmp.a(c2).a, bmp.a(c2).B, 0, c2, 48);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new aexq(afbbVar, i, 19);
        }
    }

    public static void bu(afbb afbbVar, bwj bwjVar, int i) {
        int i2;
        float f;
        cga c;
        float f2;
        int i3;
        int i4 = i & 14;
        bwj c2 = bwjVar.c(-1945983707);
        if (i4 == 0) {
            if (true != c2.G(afbbVar)) {
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
            if (true != afbbVar.a) {
                f = brg.a;
            } else {
                f = 64.0f;
            }
            cas b2 = zl.b(f, null, c2, 0, 14);
            cga.a aVar = cga.e;
            ajw.e eVar = ajw.c;
            int i5 = cfq.a;
            cue a2 = akk.a(eVar, cfq.a.m, c2, 0);
            int a3 = bwg.a(c2);
            bwk bwkVar = (bwk) c2;
            byx P = bwkVar.P();
            cga b3 = cfv.b(c2, aVar);
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
            caw.b(c2, b3, cwl.a.c);
            c = amv.c(cga.e, 1.0f);
            f2 = ((dqy) b2.a()).a;
            cga d = amv.d(c, f2);
            cue a4 = akc.a(cfq.a.a, false);
            int a5 = bwg.a(c2);
            byx P2 = bwkVar.P();
            cga b4 = cfv.b(c2, d);
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
            caw.b(c2, b4, cwl.a.c);
            ahji.e(dga.a(R.string.transcription_in_progress_text, c2), akf.a.a(cga.e, cfq.a.e), bmp.a(c2).s, 0L, 0L, new dqi(3), 0L, 0, false, 0, 0, null, bmp.d(c2).l, c2, 0, 0, 65016);
            c2.p();
            c2.y(-957041958);
            if (afbbVar.a) {
                bt(afbbVar, c2, i2 & 14);
            }
            bwkVar.Y();
            c2.p();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new afaz(afbbVar, i, 1);
        }
    }

    public static void bv(arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-680662034);
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
            awg awgVar = awh.a;
            adr a2 = ads.a(1.0f, bmp.a(c).B);
            amj amjVar = ahfq.a;
            ahji.ao(arqgVar, null, false, awgVar, ahfq.b(cku.g, bmp.a(c).s, c, 12), a2, null, null, afax.a, c, (i2 & 14) | 805306368);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexq(arqgVar, i, 20);
        }
    }

    public static zj bw(byn bynVar) {
        return (zj) bynVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void bx(defpackage.afaw r22, defpackage.cga r23, defpackage.bsc r24, defpackage.cit r25, boolean r26, defpackage.bwj r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adom.bx(afaw, cga, bsc, cit, boolean, bwj, int, int):void");
    }

    public static void by(String str, bwj bwjVar, int i) {
        int i2;
        bwj bwjVar2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(1779493464);
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
            dje djeVar = ca(c).f;
            c.y(1826593641);
            bwjVar2 = c;
            ahji.e(str, null, 0L, 0L, 0L, null, 0L, 2, false, 1, 0, null, djeVar, bwjVar2, i2 & 14, 3120, 55294);
            ((bwk) bwjVar2).Y();
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new aexq(str, i, 18);
        }
    }

    public static void bz(afam afamVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        arnb arnbVar;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(943301237);
        if (i5 == 0) {
            if (true != c.G(afamVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.I(arqvVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            c.y(570237286);
            if (afamVar == null) {
                arnbVar = null;
            } else {
                bN(afamVar, arqvVar, c, (i2 << 12) & 458752);
                arnbVar = arnb.a;
            }
            ((bwk) c).Y();
            if (arnbVar == null) {
                arqvVar.a(c, Integer.valueOf((i2 >> 3) & 14));
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexd(afamVar, arqvVar, i, 16);
        }
    }

    public static aneo c(Context context) {
        return ((adnz) akec.w(context, adnz.class)).hU();
    }

    private static void cA(byn bynVar, Uri uri) {
        bynVar.h(uri);
    }

    private static String cB(byn bynVar) {
        return (String) bynVar.a();
    }

    private static cga cC(cga cgaVar, int i, int i2) {
        if (i2 == 1) {
            return amh.j(cgaVar, 16.0f, brg.a, 16.0f, brg.a, 10);
        }
        if (i == 0) {
            return amh.j(cgaVar, 16.0f, brg.a, brg.a, brg.a, 14);
        }
        if (i == i2 - 1) {
            return amh.j(cgaVar, brg.a, brg.a, 16.0f, brg.a, 11);
        }
        return cgaVar;
    }

    public static afae ca(bwj bwjVar) {
        return (afae) bwjVar.g(afaf.a);
    }

    public static ahhm cb(bwj bwjVar) {
        return bX(bwjVar).a;
    }

    public static boolean cc(bwj bwjVar) {
        return bX(bwjVar).l;
    }

    public static boolean cd(bwj bwjVar) {
        return bX(bwjVar).m;
    }

    public static long ce(long j) {
        eap.j(ckw.b(j), r0);
        float f = r0[0] - 3.0f;
        float[] fArr = {f};
        if (f < brg.a) {
            return j;
        }
        return ckw.c(eap.c(fArr));
    }

    public static long cf(long j, float f) {
        eap.j(ckw.b(j), r0);
        float[] fArr = {0.0f, 0.0f, Math.max(f, fArr[2])};
        return ckw.c(eap.c(fArr));
    }

    public static dje cg(aezf aezfVar, bwj bwjVar) {
        dje djeVar;
        bwjVar.y(-895050133);
        if (aezfVar.e) {
            bwjVar.y(618296519);
            djeVar = bmp.d(bwjVar).d;
            ((bwk) bwjVar).Y();
        } else {
            bwjVar.y(618361867);
            djeVar = bmp.d(bwjVar).j;
            ((bwk) bwjVar).Y();
        }
        dje b2 = afaf.b(djeVar, bwjVar);
        ((bwk) bwjVar).Y();
        return b2;
    }

    public static void ch(arqg arqgVar, arqg arqgVar2, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(187602164);
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
            if (true != c.I(arqgVar2)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            cga j = amh.j(cga.e, brg.a, brg.a, 4.0f, brg.a, 11);
            ajw.b bVar = ajw.a;
            int i6 = cfq.a;
            cue a2 = amq.a(bVar, cfq.a.j, c, 0);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b2 = cfv.b(c, j);
            int i7 = cwl.a;
            arqg arqgVar3 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar3);
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
            ci(aerb.aa, dga.a(R.string.text_results_bar_previous, c), arqgVar, c, ((i2 << 6) & 896) | 6);
            ci(aerb.ab, dga.a(R.string.text_results_bar_next, c), arqgVar2, c, ((i2 << 3) & 896) | 6);
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexd(arqgVar, arqgVar2, i, 10, null);
        }
    }

    public static void ci(aerb aerbVar, String str, arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(-2074331909);
        if (i6 == 0) {
            if (true != c.G(aerbVar)) {
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
            if (true != c.I(arqgVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            ahji.P(arqgVar, null, false, null, null, cdk.e(1054108057, new aezg(aerbVar, str, 0), c), c, ((i2 >> 6) & 14) | 1572864, 62);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeub(aerbVar, str, arqgVar, i, 16, (byte[]) null);
        }
    }

    public static void cj(aezh aezhVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        cga b2;
        cga a2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c2 = bwjVar.c(562311825);
        if (i5 == 0) {
            if (true != c2.G(aezhVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i | i4;
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
            cga d = amv.d(cgaVar, 56.0f);
            ajw.e eVar = ajw.c;
            int i6 = cfq.a;
            cue a3 = akk.a(eVar, cfq.a.m, c2, 0);
            int a4 = bwg.a(c2);
            bwk bwkVar = (bwk) c2;
            byx P = bwkVar.P();
            cga b3 = cfv.b(c2, d);
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
            caw.b(c2, b3, cwl.a.c);
            ako akoVar = ako.a;
            c = amv.c(cga.e, 1.0f);
            b2 = akoVar.b(c, 1.0f, true);
            a2 = adf.a(b2, bmp.a(c2).n, clw.a);
            cue a5 = amq.a(ajw.f, cfq.a.k, c2, 54);
            int a6 = bwg.a(c2);
            byx P2 = bwkVar.P();
            cga b4 = cfv.b(c2, a2);
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
            caw.b(c2, b4, cwl.a.c);
            cga j = amh.j(cga.e, 20.0f, brg.a, brg.a, brg.a, 14);
            c2.y(663443680);
            String quantityString = ((Context) c2.g(AndroidCompositionLocals_androidKt.b)).getResources().getQuantityString(R.plurals.text_results_bar_results, aezhVar.a, Integer.valueOf(aezhVar.b), Integer.valueOf(aezhVar.a));
            quantityString.getClass();
            bwkVar.Y();
            ahji.e(quantityString, j, bmp.a(c2).q, 0L, 0L, null, 0L, 0, false, 0, 0, null, bmp.d(c2).k, c2, 48, 0, 65528);
            ch(aezhVar.c, aezhVar.d, c2, 0);
            c2.p();
            ahji.U(null, 1.0f, bmp.a(c2).r, c2, 48, 1);
            c2.p();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new aexd(aezhVar, cgaVar, i, 9, null);
        }
    }

    public static void ck(cga cgaVar, String str, long j, float f, List list, arqg arqgVar, boolean z, aezf aezfVar, bwj bwjVar, int i) {
        bwk bwkVar;
        cga c;
        hdv hdvVar;
        bwk bwkVar2;
        boolean z2;
        cga c2;
        Object obj = str;
        bwj c3 = bwjVar.c(-1985380311);
        arrx arrxVar = new arrx();
        cga.a aVar = cga.e;
        ajw.b bVar = ajw.a;
        int i2 = cfq.a;
        cue a2 = amq.a(bVar, cfq.a.j, c3, 0);
        int a3 = bwg.a(c3);
        bwk bwkVar3 = (bwk) c3;
        byx P = bwkVar3.P();
        cga b2 = cfv.b(c3, aVar);
        int i3 = cwl.a;
        arqg arqgVar2 = cwl.a.a;
        c3.A();
        if (bwkVar3.y) {
            c3.l(arqgVar2);
        } else {
            c3.C();
        }
        caw.b(c3, a2, cwl.a.e);
        caw.b(c3, P, cwl.a.d);
        arqv arqvVar = cwl.a.f;
        if (bwkVar3.y || !d.F(bwkVar3.T(), Integer.valueOf(a3))) {
            Integer valueOf = Integer.valueOf(a3);
            bwkVar3.ad(valueOf);
            c3.j(valueOf, arqvVar);
        }
        caw.b(c3, b2, cwl.a.c);
        amu amuVar = amu.a;
        c3.y(-1491316129);
        int i4 = 0;
        for (Object obj2 : list) {
            int i5 = i & 112;
            int i6 = i4 + 1;
            if (i4 < 0) {
                aqjn.G();
            }
            int i7 = i5 ^ 48;
            aeza aezaVar = (aeza) obj2;
            String str2 = aezaVar.b;
            boolean z3 = true;
            if (str2 == null) {
                c3.y(1747638811);
                cga cC = cC(cga.e, i4, ((aron) list).c);
                if (z) {
                    cC = cC.a(amh.i(cga.e, brg.a, 8.0f, 1));
                }
                c3.y(1718951387);
                if ((i7 > 32 && c3.G(obj)) || (i & 48) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object T = bwkVar3.T();
                if (z2 || T == bwj.a.a) {
                    T = new aezb(obj, 1);
                    bwkVar3.ad(T);
                }
                bwkVar3.Y();
                c2 = dhb.c(cC, false, (arqr) T);
                String str3 = aezaVar.a;
                drn.e(j);
                bwk bwkVar4 = bwkVar3;
                ahji.e(str3, c2, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, new dje(0L, drn.d(drm.b(j), drm.a(j) * 0.85f), null, null, 0L, 0, 0L, 16777213), c3, 0, 0, 65532);
                bwkVar4.Y();
                bwkVar2 = bwkVar4;
            } else {
                bwk bwkVar5 = bwkVar3;
                c3.y(1748202887);
                arrxVar.a = true;
                boolean booleanValue = ((Boolean) c3.g(aetr.a)).booleanValue();
                aerk aerkVar = new aerk(str2, "animated_emoji");
                cga cC2 = cC(cga.e, i4, ((aron) list).c);
                if (z) {
                    cC2 = cC2.a(amh.i(cga.e, brg.a, 8.0f, 1));
                }
                cga a4 = amuVar.a(amv.h(cC2, f), cfq.a.k);
                c3.y(1718976667);
                if ((i7 <= 32 || !c3.G(obj)) && (i & 48) != 32) {
                    z3 = false;
                }
                Object T2 = bwkVar5.T();
                if (!z3 && T2 != bwj.a.a) {
                    bwkVar = bwkVar5;
                } else {
                    T2 = new aezb(obj, 0);
                    bwkVar = bwkVar5;
                    bwkVar.ad(T2);
                }
                bwkVar.Y();
                c = dhb.c(a4, false, (arqr) T2);
                if (booleanValue) {
                    hdvVar = new hdv(null);
                } else {
                    hdvVar = null;
                }
                bwkVar2 = bwkVar;
                int i8 = i4;
                aeke.bd(aerkVar, c, hdvVar, cdk.e(-1798851884, new aezc(f), c3), !booleanValue, 0, c3, 3072, 96);
                if (i8 != r9.c - 1) {
                    amx.a(amv.h(cgaVar, 2.0f), c3);
                }
                bwkVar2.Y();
            }
            obj = str;
            bwkVar3 = bwkVar2;
            i4 = i6;
        }
        bwk bwkVar6 = bwkVar3;
        bwkVar6.Y();
        c3.y(-1491260481);
        bwkVar6.Y();
        c3.p();
        bxl.g(Boolean.valueOf(arrxVar.a), new aafa(arrxVar, arqgVar, (arpe) null, 17), c3);
        bzz e = c3.e();
        if (e != null) {
            ((bzf) e).d = new aezd(cgaVar, str, j, f, list, arqgVar, z, aezfVar, i);
        }
    }

    public static void cl(ake akeVar, apdy apdyVar, cmb cmbVar, bwj bwjVar, int i) {
        int i2;
        boolean z;
        boolean z2;
        bwj bwjVar2;
        zj zjVar;
        Object cmdVar;
        cga a2;
        int i3;
        int i4;
        int i5;
        cmbVar.getClass();
        int i6 = i & 14;
        bwj c = bwjVar.c(-1567835993);
        if (i6 == 0) {
            if (true != c.G(akeVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(apdyVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c.G(cmbVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            if (apdyVar.b.size() == 0) {
                bzz e = c.e();
                if (e != null) {
                    ((bzf) e).d = new aeub(akeVar, (Object) apdyVar, (Object) cmbVar, i, 12);
                    return;
                }
                return;
            }
            c.y(-509084627);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = zk.a(brg.a);
                bwkVar.ad(T);
            }
            zj zjVar2 = (zj) T;
            bwkVar.Y();
            c.y(-509082853);
            if ((i2 & 112) == 32) {
                z = true;
            } else {
                z = false;
            }
            if ((i2 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object T2 = bwkVar.T();
            if (!(z | z2) && T2 != bwj.a.a) {
                bwjVar2 = c;
                zjVar = zjVar2;
            } else {
                if (apdyVar.b.size() > 1) {
                    int aU = a.aU(apdyVar.e);
                    if (aU == 0) {
                        aU = 1;
                    }
                    apar<Long> aparVar = apdyVar.b;
                    aparVar.getClass();
                    ArrayList arrayList = new ArrayList(aqjn.J(aparVar, 10));
                    for (Long l : aparVar) {
                        l.getClass();
                        arrayList.add(new cku(ckw.d(l.longValue())));
                    }
                    int i7 = aU - 2;
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 != 4) {
                                    if (i7 != 5) {
                                        cmdVar = cko.a.b(arrayList);
                                        bwjVar2 = c;
                                        zjVar = zjVar2;
                                    } else {
                                        bwjVar2 = c;
                                        zjVar = zjVar2;
                                        cmdVar = new clk(arrayList, (Float.floatToRawIntBits(brg.a) << 32) | (Float.floatToRawIntBits(brg.a) & 4294967295L), (Float.floatToRawIntBits(brg.a) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & 4294967295L));
                                    }
                                } else {
                                    bwjVar2 = c;
                                    zjVar = zjVar2;
                                    cmdVar = new cme(arrayList);
                                }
                            } else {
                                bwjVar2 = c;
                                zjVar = zjVar2;
                                cmdVar = cko.a.a(arrayList, 0L, brg.a, 14);
                            }
                        } else {
                            bwjVar2 = c;
                            zjVar = zjVar2;
                            cmdVar = new clk(arrayList, 0L, 9187343241974906880L);
                        }
                    } else {
                        bwjVar2 = c;
                        zjVar = zjVar2;
                        cmdVar = cko.a.b(arrayList);
                    }
                } else {
                    bwjVar2 = c;
                    zjVar = zjVar2;
                    apar aparVar2 = apdyVar.b;
                    aparVar2.getClass();
                    Object X = aqjn.X(aparVar2);
                    X.getClass();
                    cmdVar = new cmd(ckw.d(((Number) X).longValue()));
                }
                T2 = new byu(cmdVar, cav.a);
                bwkVar.ad(T2);
            }
            bwkVar.Y();
            zj zjVar3 = zjVar;
            a2 = cld.a(akeVar.b(cga.e), new aezb(zjVar3, 2)).a(new BackgroundElement(0L, (cko) ((byn) T2).a(), cmbVar, 1));
            c = bwjVar2;
            amx.a(a2, c);
            agkx.w(apdyVar, zjVar3, c, ((i2 >> 3) & 14) | 64);
        }
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new aeub(akeVar, (Object) apdyVar, (Object) cmbVar, i, 13);
        }
    }

    public static void cm(aezf aezfVar, long j, bwj bwjVar, int i) {
        int i2;
        cga c;
        dje cg;
        int c2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c3 = bwjVar.c(-159507343);
        if (i5 == 0) {
            if (true != c3.G(aezfVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c3.F(j)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c3.L()) {
            c3.v();
        } else {
            cga e = amh.e(cga.e, 16.0f, 8.0f);
            c3.y(1983258626);
            int i6 = i2 & 14;
            bwk bwkVar = (bwk) c3;
            Object T = bwkVar.T();
            if (i6 == 4 || T == bwj.a.a) {
                T = new aezb(aezfVar, 3);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            c = dhb.c(e, false, (arqr) T);
            cga a2 = dea.a(c, "message_text");
            if (aezfVar.r) {
                a2 = a2.a(new SensitiveNodeElement());
            }
            cga cgaVar = a2;
            String str = aezfVar.a;
            if (aezfVar.j) {
                c3.y(1351841870);
                long c4 = drn.c(48);
                c3.y(-987042609);
                dje djeVar = bmp.d(c3).d;
                long i7 = djeVar.i();
                float a3 = drm.a(c4);
                drn.e(i7);
                long d = drn.d(drm.b(i7), a3 * drm.a(i7));
                float a4 = drm.a(djeVar.g());
                drn.e(d);
                cg = dje.y(djeVar, 0L, c4, null, null, null, null, 0L, 0, 0, drn.d(drm.b(d), drm.a(d) / a4), null, null, 0, 16646141);
                bwkVar.Y();
                bwkVar.Y();
            } else {
                c3.y(1351925849);
                cg = cg(aezfVar, c3);
                bwkVar.Y();
            }
            dje djeVar2 = cg;
            c3.y(1095246285);
            if (aezfVar.j && aezfVar.h) {
                c2 = 6;
            } else {
                c2 = ((dje) c3.g(brx.a)).c();
            }
            bwkVar.Y();
            ahji.e(str, cgaVar, j, 0L, 0L, new dqi(c2), 0L, 0, false, 0, 0, null, djeVar2, c3, (i2 << 3) & 896, 0, 65016);
        }
        bzz e2 = c3.e();
        if (e2 != null) {
            ((bzf) e2).d = new aejz(aezfVar, j, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void cn(defpackage.aezf r30, defpackage.cga r31, defpackage.cmb r32, defpackage.arqv r33, defpackage.bwj r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 1341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adom.cn(aezf, cga, cmb, arqv, bwj, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0086  */
    /* JADX WARN: Type inference failed for: r3v7, types: [acg, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void co(defpackage.aezf r26, defpackage.aezi r27, defpackage.drm r28, defpackage.arqv r29, defpackage.bwj r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adom.co(aezf, aezi, drm, arqv, bwj, int, int):void");
    }

    public static void cp(ake akeVar, aezf aezfVar, cmb cmbVar, bwj bwjVar, int i) {
        int i2;
        long f;
        int i3;
        int i4;
        int i5;
        cmbVar.getClass();
        int i6 = i & 14;
        bwj c = bwjVar.c(1508170745);
        if (i6 == 0) {
            if (true != c.G(akeVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aezfVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c.G(cmbVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            c.y(-2051880346);
            cku ckuVar = null;
            if (aezfVar.j && aezfVar.g) {
                f = ckw.f(cku.d(r0), cku.c(r0), cku.b(r0), 0.5f, cku.f(bmp.a(c).a));
                ckuVar = new cku(f);
            }
            ((bwk) c).Y();
            if (ckuVar != null) {
                akc.b(adf.a(cgh.a(akeVar.b(cga.e), 1.0f), ckuVar.i, cmbVar), c, 0);
            } else {
                bzz e = c.e();
                if (e != null) {
                    ((bzf) e).d = new aeub(akeVar, (Object) aezfVar, (Object) cmbVar, i, 15);
                    return;
                }
                return;
            }
        }
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new aeub(akeVar, (Object) aezfVar, (Object) cmbVar, i, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void cq(java.lang.String r19, defpackage.cga r20, long r21, defpackage.dqi r23, int r24, int r25, defpackage.dje r26, defpackage.bwj r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adom.cq(java.lang.String, cga, long, dqi, int, int, dje, bwj, int, int):void");
    }

    public static void cr(cga cgaVar, bwj bwjVar, int i) {
        int i2 = (i | 6) & 11;
        bwj c = bwjVar.c(-194005086);
        if (i2 == 2 && c.L()) {
            c.v();
        } else {
            cgaVar = cga.e;
            awg a2 = awh.a(20.0f);
            cga c2 = adl.c(adf.a(amv.j(cgaVar, 64.0f, 40.0f), bmp.a(c).n, a2), 1.0f, bmp.a(c).a, a2);
            int i3 = cfq.a;
            cue a3 = akc.a(cfq.a.e, false);
            int a4 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b2 = cfv.b(c, c2);
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
            caw.b(c, b2, cwl.a.c);
            br(new afbg(arnv.a, null, aezo.g, new afbf((byte[]) null)), amv.h(cga.e, 40.0f), bmp.a(c).a, c, 54, 0);
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexq(cgaVar, i, 8);
        }
    }

    public static void cs(aeyr aeyrVar, cga cgaVar, aov aovVar, bwj bwjVar, int i) {
        int i2;
        cga cgaVar2;
        aov a2;
        cga c;
        aov aovVar2;
        int i3;
        bwj c2 = bwjVar.c(-21951198);
        if ((i & 14) == 0) {
            if (true != c2.G(aeyrVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 896) == 0) {
            i4 = i2 | 176;
        }
        if ((i4 & 731) == 146 && c2.L()) {
            c2.v();
            cgaVar2 = cgaVar;
            aovVar2 = aovVar;
        } else {
            c2.w();
            if ((i & 1) != 0 && !c2.J()) {
                c2.v();
                cgaVar2 = cgaVar;
                a2 = aovVar;
            } else {
                cgaVar2 = cga.e;
                a2 = aoz.a(c2);
            }
            c2.n();
            c = amv.c(cgaVar2, 1.0f);
            cga a3 = dea.a(wj.b(c), "suggestion_row");
            amj h = amh.h(8.0f, brg.a, 8.0f, brg.a, 10);
            int i5 = cfq.a;
            ajw.b e = ajw.e(8.0f, cfq.a.o);
            cfq.c cVar = cfq.a.l;
            c2.y(-574860092);
            int i6 = i4 & 14;
            bwk bwkVar = (bwk) c2;
            Object T = bwkVar.T();
            if (i6 == 4 || T == bwj.a.a) {
                T = new aeql(aeyrVar, 20);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            anp.b(a3, a2, h, e, cVar, null, false, (arqr) T, c2, 221568, BasePaymentResult.ERROR_REQUEST_FAILED);
            aovVar2 = a2;
        }
        bzz e2 = c2.e();
        if (e2 != null) {
            ((bzf) e2).d = new aeub(aeyrVar, cgaVar2, aovVar2, i, 11, (char[]) null);
        }
    }

    public static void ct(afbd afbdVar, qdq qdqVar, cku ckuVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-1888234911);
        if (i5 == 0) {
            if (true != c.G(afbdVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 896) == 0) {
            if (true != c.G(ckuVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        c.w();
        if ((i & 1) != 0 && !c.J()) {
            c.v();
        }
        c.n();
        afbdVar.b();
        c.y(341192484);
        cv(afbdVar, qdqVar, c, (i2 & 14) | 64);
        ((bwk) c).Y();
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeub(afbdVar, qdqVar, ckuVar, i, 18, (char[]) null);
        }
    }

    public static void cu(qdq qdqVar, bwj bwjVar, int i) {
        cga c;
        bwj c2 = bwjVar.c(-1615784527);
        cga.a aVar = cga.e;
        ajw.e eVar = ajw.c;
        int i2 = cfq.a;
        cue a2 = akk.a(eVar, cfq.a.m, c2, 0);
        int a3 = bwg.a(c2);
        bwk bwkVar = (bwk) c2;
        byx P = bwkVar.P();
        cga b2 = cfv.b(c2, aVar);
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
        caw.b(c2, b2, cwl.a.c);
        c = amv.c(amv.d(cga.e, 64.0f), 1.0f);
        cue a4 = akc.a(cfq.a.e, false);
        int a5 = bwg.a(c2);
        byx P2 = bwkVar.P();
        cga b3 = cfv.b(c2, c);
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
        bv(new aetz(qdqVar, 10), c2, 0);
        c2.p();
        ahji.U(dea.a(cga.e, "divider"), brg.a, bmp.a(c2).B, c2, 6, 2);
        c2.p();
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new afaz(qdqVar, i, 0);
        }
    }

    public static void cv(afbd afbdVar, qdq qdqVar, bwj bwjVar, int i) {
        int i2 = i & 14;
        bwj c = bwjVar.c(1054845390);
        if (i2 == 0) {
            c.G(afbdVar);
        }
        c.w();
        if ((i & 1) != 0 && !c.J()) {
            c.v();
        }
        c.n();
        if (afbdVar instanceof afbb) {
            c.y(340871964);
            bu((afbb) afbdVar, c, 0);
            ((bwk) c).Y();
        } else {
            if (afbdVar instanceof afba) {
                c.y(340874469);
                c.c(1515486477);
                cga.a aVar = cga.e;
                ajw.e eVar = ajw.c;
                int i3 = cfq.a;
                cue a2 = akk.a(eVar, cfq.a.m, c, 0);
                int a3 = bwg.a(c);
                bwk bwkVar = (bwk) c;
                byx P = bwkVar.P();
                cga b2 = cfv.b(c, aVar);
                int i4 = cwl.a;
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
                throw null;
            }
            if (afbdVar instanceof afbc) {
                c.y(340877179);
                cu(qdqVar, c, 8);
                ((bwk) c).Y();
            } else {
                c.y(340870146);
                ((bwk) c).Y();
                throw new armm();
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexd(afbdVar, qdqVar, i, 19, null);
        }
    }

    private static int cw() {
        if (((Boolean) admf.a.a()).booleanValue() && ((Boolean) admf.c.a()).booleanValue()) {
            return 1;
        }
        if (((Boolean) admf.a.a()).booleanValue() && !((Boolean) admf.c.a()).booleanValue()) {
            return 2;
        }
        return 3;
    }

    private static Intent cx(String str, String str2, String str3) {
        Intent intent = new Intent(str3);
        intent.setComponent(new ComponentName(str, str2));
        return intent;
    }

    private static cga cy(cga cgaVar, aeoa aeoaVar, aenw aenwVar, bwj bwjVar, int i) {
        boolean z;
        bwjVar.y(1781157691);
        afa a2 = bgx.a(false, 20.0f, 4);
        boolean aT = aT(aenwVar, aeoaVar);
        bwjVar.y(-1457523151);
        bwk bwkVar = (bwk) bwjVar;
        Object T = bwkVar.T();
        if (T == bwj.a.a) {
            T = new ajs();
            bwkVar.ad(T);
        }
        ajr ajrVar = (ajr) T;
        bwkVar.Y();
        dgv dgvVar = new dgv(0);
        bwjVar.y(-1457528575);
        boolean z2 = true;
        if ((((i & 112) ^ 48) > 32 && bwjVar.G(aeoaVar)) || (i & 48) == 32) {
            z = true;
        } else {
            z = false;
        }
        if ((((i & 896) ^ 384) <= 256 || !bwjVar.G(aenwVar)) && (i & 384) != 256) {
            z2 = false;
        }
        boolean z3 = z | z2;
        Object T2 = bwkVar.T();
        if (z3 || T2 == bwj.a.a) {
            T2 = new aenj(aeoaVar, aenwVar, 0);
            bwkVar.ad(T2);
        }
        bwkVar.Y();
        cga b2 = adw.b(cgaVar, ajrVar, a2, aT, null, dgvVar, (arqg) T2, 8);
        bwkVar.Y();
        return b2;
    }

    private static int cz(int i) {
        switch (i) {
            case -16746133:
                return -16749196;
            case -15108398:
                return -15181124;
            case -13615201:
                return -15502541;
            case -8708190:
                return -9033797;
            case -4056997:
                return -4716942;
            case -2937041:
                return -6728704;
            default:
                return i;
        }
    }

    public static aneo d(Context context) {
        return ((adnz) akec.w(context, adnz.class)).hV();
    }

    public static boolean e() {
        if (!xyp.h()) {
            return true;
        }
        return false;
    }

    public static String f(adjp adjpVar, String str) {
        if (adjpVar != null) {
            String e = adjpVar.e(str);
            if (e != null) {
                return e;
            }
            throw new adna(str.concat(" parameter cannot be null."), 3);
        }
        throw new adna("Characteristic cannot be null.", 1);
    }

    public static void g(adjp adjpVar, String[] strArr) {
        if (adjpVar != null) {
            for (String str : strArr) {
                if (adjpVar.e(str) == null) {
                    throw new adna(String.valueOf(str).concat(" parameter cannot be null."), 3);
                }
            }
            return;
        }
        throw new adna("Characteristic cannot be null.", 1);
    }

    public static boolean h() {
        if (cw() == 2) {
            return true;
        }
        return false;
    }

    public static boolean i() {
        if (cw() == 1) {
            return true;
        }
        return false;
    }

    public static boolean j() {
        if (!h() && cw() != 3) {
            return false;
        }
        return true;
    }

    public static boolean k() {
        if (!h() && !i()) {
            return false;
        }
        return true;
    }

    public static boolean l(armf armfVar, armf armfVar2) {
        if (!((acxq) armfVar.b()).a() && !((olz) armfVar2.b()).a()) {
            return false;
        }
        return true;
    }

    public static void m(int i) {
        if (i != -1) {
            if (i != -2) {
                if (i > -3) {
                    return;
                } else {
                    throw new adiz(i);
                }
            }
            throw new adja();
        }
        throw new adiy();
    }

    public static adiw n(adiv adivVar) {
        adiw adiwVar;
        adivVar.getClass();
        if (adivVar instanceof adiw) {
            adiwVar = (adiw) adivVar;
        } else {
            adiwVar = null;
        }
        if (adiwVar != null) {
            return adiwVar;
        }
        Objects.toString(adivVar);
        throw new IllegalArgumentException("Not a SimId: ".concat(adivVar.toString()));
    }

    public static boolean o(Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            return false;
        }
        return true;
    }

    public static long[] p(Collection collection) {
        int i = 0;
        if (collection == null) {
            return new long[0];
        }
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static String q(String str) {
        int lastIndexOf;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int indexOf = str.indexOf(64);
        if (indexOf > 0) {
            str = str.substring(indexOf + 1);
        }
        int indexOf2 = str.indexOf(59);
        if (indexOf2 > 0) {
            str = str.substring(0, indexOf2);
        } else {
            int indexOf3 = str.indexOf(63);
            if (indexOf3 > 0) {
                str = str.substring(0, indexOf3);
            }
        }
        String trim = str.trim();
        if (trim.charAt(trim.length() - 1) != ']' && (lastIndexOf = trim.lastIndexOf(58)) > 0) {
            return trim.substring(0, lastIndexOf).trim();
        }
        return trim;
    }

    public static Intent r(String str, String str2) {
        return cx("com.google.android.ims", str, str2);
    }

    public static Intent s(String str) {
        return cx("com.google.android.apps.messaging", "com.google.android.ims.service.JibeService", str);
    }

    public static boolean t(Context context) {
        try {
            NetworkInfo d = adwp.f(context).d();
            if (d != null) {
                if (d.isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (adwk e) {
            advr.s(e, "Failed due to missing permission.", new Object[0]);
            return false;
        }
    }

    public static boolean u(Context context) {
        try {
            NetworkInfo d = adwp.f(context).d();
            if (d != null && d.getType() == 1 && d.isConnected()) {
                advr.c("Wifi connection is available.", new Object[0]);
                return true;
            }
        } catch (adwk e) {
            advr.s(e, "Failed due to missing permission.", new Object[0]);
        }
        return false;
    }

    public static IInterface v(adud adudVar) {
        IInterface iInterface = adudVar.getInterface();
        if (acrj.b(adudVar.getContext()).c().h()) {
            if (iInterface == null) {
                if (((Boolean) adue.a.a()).booleanValue()) {
                    throw new IllegalStateException("JibeService Not Initialized");
                }
                throw new RemoteException("JibeService Not Initialized");
            }
            return iInterface;
        }
        throw new IllegalStateException("No permission to run RCS Engine.");
    }

    public static File w(Context context, String str) {
        try {
            FileInputStream openFileInput = context.openFileInput(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            abhg.m(openFileInput);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = openFileInput.read(bArr);
                if (read == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    agkx.aa(openFileInput);
                    return new File(str, byteArray);
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (FileNotFoundException e) {
            advr.i(e, "File not found.", new Object[0]);
            return null;
        } catch (IOException e2) {
            advr.i(e2, "Error while converting file to byte[]", new Object[0]);
            return null;
        }
    }

    public static /* synthetic */ String x(int i) {
        if (i != 1) {
            return "STANDALONE_MESSAGING";
        }
        return "SESSION_BASED_CHAT";
    }

    public static String z(adtl adtlVar) {
        String str;
        ImsConfiguration imsConfiguration = adtlVar.w().mImsConfiguration;
        if (imsConfiguration != null && (str = imsConfiguration.mPublicIdentity) != null) {
            try {
                return hht.h(URLEncoder.encode(str, StandardCharsets.UTF_8.name()), "_groupsessions.xml");
            } catch (UnsupportedEncodingException e) {
                advr.i(e, "URLEncoder does not support UTF-8 encoding", new Object[0]);
                return null;
            }
        }
        return null;
    }

    public final synchronized void y(Context context, adtl adtlVar) {
        advr.c("Clearing legacy data", new Object[0]);
        aduu aduuVar = new aduu(context);
        adtlVar.w().g();
        xzb.c("RcsProvisioning", "Clearing backup token");
        adut y = adtlVar.y();
        y.f("token_value");
        y.f("token_expiration");
        acre acreVar = new acre(context);
        acreVar.a();
        acreVar.close();
        advr.k("Deleted transfers file: %s", Boolean.valueOf(new java.io.File("httpft_pending").delete()));
        String z = z(adtlVar);
        if (z != null) {
            advr.k("Deleted conferences file: %s", Boolean.valueOf(new java.io.File(z).delete()));
        }
        ((adut) aduuVar.a).f("msisdn");
        ((adut) aduuVar.a).f("sim_serial_number");
        ((adut) aduuVar.a).f("sessionid");
    }

    public adom(int[] iArr) {
    }
}
