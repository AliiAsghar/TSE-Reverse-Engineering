package defpackage;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ContentUris;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.support.constraint.Guideline;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.vcard.VCardConstants;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.conversation.details.CdpOpeningArguments;
import defpackage.ajw;
import defpackage.amj;
import defpackage.atz;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cov;
import defpackage.cwl;
import defpackage.dhv;
import defpackage.yg;
import defpackage.zij;
import defpackage.zly;
import j$.util.Optional;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aabr {
    private static volatile aabr a;

    public aabr() {
    }

    public static void A(aahr aahrVar, arqg arqgVar, arqg arqgVar2, bwj bwjVar, int i) {
        long j;
        arqgVar.getClass();
        arqgVar2.getClass();
        bwj c = bwjVar.c(-1838700521);
        cga j2 = amh.j(cga.e, 22.0f, brg.a, 22.0f, brg.a, 10);
        int i2 = cfq.a;
        cue a2 = akc.a(cfq.a.a, false);
        int a3 = bwg.a(c);
        bwk bwkVar = (bwk) c;
        byx P = bwkVar.P();
        cga b = cfv.b(c, j2);
        int i3 = cwl.a;
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
        caw.b(c, b, cwl.a.c);
        akf akfVar = akf.a;
        cga j3 = amh.j(cga.e, brg.a, 8.0f, brg.a, 8.0f, 5);
        float f = brg.a;
        cga a4 = akfVar.a(amv.q(j3, 36.0f, brg.a, 2), cfq.a.a);
        awg a5 = awh.a(12.0f);
        if (((Boolean) c.g(bli.b)).booleanValue()) {
            c.y(-1798657200);
            j = bmp.a(c).p;
            bwkVar.Y();
        } else {
            c.y(-1798596316);
            j = bmp.a(c).I;
            bwkVar.Y();
        }
        long j4 = j;
        if (true == ((Boolean) c.g(bli.b)).booleanValue()) {
            f = 2.0f;
        }
        bqv.c(a4, a5, j4, 0L, f, brg.a, null, cdk.e(-1184098154, new ifn(aahrVar, arqgVar2, 15, null), c), c, 104);
        B(arqgVar, akfVar.a(cga.e, cfq.a.c), aahm.a, c, ((i >> 3) & 14) | 384);
        c.p();
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jkb(aahrVar, arqgVar, arqgVar2, i, 14, (int[]) null);
        }
    }

    public static void B(arqg arqgVar, cga cgaVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(-909976578);
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
            cga g = amv.g(cgaVar, 48.0f);
            c.y(1437543118);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = new ajs();
                bwkVar.ad(T);
            }
            bwkVar.Y();
            cga j = amh.j(adw.b(g, (ajr) T, bgx.a(false, 18.0f, 4), false, null, new dgv(0), arqgVar, 12), brg.a, 18.0f, 16.0f, brg.a, 9);
            int i7 = cfq.a;
            cue a2 = akc.a(cfq.a.c, false);
            int a3 = bwg.a(c);
            byx P = bwkVar.P();
            cga b = cfv.b(c, j);
            int i8 = cwl.a;
            arqg arqgVar2 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar2);
            } else {
                c.C();
            }
            caw.b(c, a2, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar2);
            }
            caw.b(c, b, cwl.a.c);
            arqvVar.a(c, Integer.valueOf((i2 >> 6) & 14));
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jkb((Object) arqgVar, (Object) cgaVar, (Object) arqvVar, i, 15, (char[]) null);
        }
    }

    public static dhv C(aahr aahrVar, boolean z, bwj bwjVar, int i) {
        boolean z2;
        dqj dqjVar;
        String spannableStringBuilder;
        bwjVar.y(200771501);
        SpannableStringBuilder spannableStringBuilder2 = aahrVar.a;
        Object obj = aqil.p(spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), Object.class)).get(0);
        int spanStart = spannableStringBuilder2.getSpanStart(obj);
        int spanEnd = spannableStringBuilder2.getSpanEnd(obj);
        long j = bmp.a(bwjVar).a;
        if ((i & 2) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z3 = z2 & z;
        if (z3) {
            dqjVar = dqj.b;
        } else {
            dqjVar = dqj.a;
        }
        List y = aqjn.y(new dhv.c(new dip(j, 0L, null, null, null, null, null, 0L, null, null, 0L, dqjVar, null, 61438), spanStart, spanEnd));
        if (z3) {
            spannableStringBuilder = aahrVar.a.toString();
            if (spanStart <= spanEnd && spanStart >= 0 && spanEnd <= spannableStringBuilder.length()) {
                String substring = spannableStringBuilder.substring(0, spanStart);
                substring.getClass();
                String substring2 = spannableStringBuilder.substring(spanStart, spanEnd);
                substring2.getClass();
                String a2 = new arus("\\s").a(substring2, " ");
                String substring3 = spannableStringBuilder.substring(spanEnd);
                substring3.getClass();
                spannableStringBuilder = substring + a2 + substring3;
            }
        } else {
            spannableStringBuilder = aahrVar.a.toString();
        }
        dhv.b bVar = new dhv.b((byte[]) null);
        bVar.e(new dhv(spannableStringBuilder, y, 4));
        bVar.c.add(new dhv.b.a(new dis(aahrVar.b), spanStart, spanEnd, VCardConstants.PROPERTY_URL));
        dhv b = bVar.b();
        bwjVar.q();
        return b;
    }

    public static /* synthetic */ void D(bwj bwjVar, int i) {
        if ((i & 11) == 2 && bwjVar.L()) {
            bwjVar.v();
            return;
        }
        cov covVar = big.a;
        if (covVar == null) {
            float f = 24.0f;
            cov.a aVar = new cov.a("Outlined.Close", f, f, f, f, 0L, 0, false, 96);
            List list = cpe.a;
            cmd cmdVar = new cmd(cku.a);
            cow cowVar = new cow();
            cowVar.c();
            cowVar.b(17.59f, 5.0f);
            cowVar.b(12.0f, 10.59f);
            cowVar.b(6.41f, 5.0f);
            cowVar.b(5.0f, 6.41f);
            cowVar.b(10.59f, 12.0f);
            cowVar.b(5.0f, 17.59f);
            cowVar.b(6.41f, 19.0f);
            cowVar.b(12.0f, 13.41f);
            cowVar.b(17.59f, 19.0f);
            cowVar.b(19.0f, 17.59f);
            cowVar.b(13.41f, 12.0f);
            cowVar.b(19.0f, 6.41f);
            cowVar.a();
            cov.a.e(aVar, cowVar.a, cmdVar);
            big.a = aVar.a();
            covVar = big.a;
            covVar.getClass();
        }
        ahji.O(covVar, dga.a(R.string.action_close, bwjVar), amv.h(cga.e, 16.0f), bmp.a(bwjVar).s, bwjVar, 384, 0);
    }

    public static void E(Calendar calendar, apun apunVar) {
        calendar.set(apunVar.b, apunVar.c, apunVar.d);
    }

    public static void F(Calendar calendar, apur apurVar) {
        calendar.set(11, apurVar.b);
        calendar.set(12, apurVar.c);
    }

    public static void G(aaaj aaajVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(481164401);
        if (i4 == 0) {
            if (true != c.G(aaajVar)) {
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
            float f = bsb.a;
            bjp.b(aaah.a, null, cdk.e(-1853674389, new zny(aaajVar, 11), c), null, brg.a, null, bsb.b(cku.g, 0L, 0L, 0L, 0L, c, 30), bsb.a(ahfn.b(brg.a, c, 384), null, null, null, c, 0, 14), c, 390, 58);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zyu(aaajVar, i, 18);
        }
    }

    public static void H(aehz aehzVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(866876089);
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
            c.y(1199419000);
            int i5 = i2 & 14;
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (i5 == 4 || T == bwj.a.a) {
                T = new zzq(aehzVar, 7);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            ahji.P((arqg) T, null, false, null, null, aaah.b, c, 1572864, 62);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zyu(aehzVar, i, 19);
        }
    }

    public static void I(aaag aaagVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(1953543464);
        if (i4 == 0) {
            if (true != c.G(aaagVar)) {
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
                ((bzf) e).d = new zyu(aaagVar, i, 17);
                return;
            }
            return;
        }
        if (aaagVar == null) {
            bzz e2 = c.e();
            if (e2 != null) {
                ((bzf) e2).d = new lhs(i, 7);
                return;
            }
            return;
        }
        throw null;
    }

    public static void J(arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-176963545);
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
            c.y(-263483054);
            int i5 = i2 & 14;
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (i5 == 4 || T == bwj.a.a) {
                T = new zzq(arqgVar, 0);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            ahji.P((arqg) T, null, false, null, null, zzm.a, c, 1572864, 62);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zyu(arqgVar, i, 11);
        }
    }

    public static void K(avc avcVar, bwj bwjVar, int i) {
        int i2;
        long h;
        String a2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(240657982);
        if (i4 == 0) {
            if (true != c.G(avcVar)) {
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
        } else if (!avcVar.i()) {
            int b = avcVar.b();
            for (int i5 = 0; i5 < b; i5++) {
                if (avcVar.j() == i5) {
                    c.y(199206241);
                    h = bmp.a(c).q;
                    ((bwk) c).Y();
                } else {
                    c.y(199208139);
                    h = cku.h(bmp.a(c).q, 0.65f);
                    ((bwk) c).Y();
                }
                bwk bwkVar = (bwk) c;
                Object T = bwkVar.T();
                if (T == bwj.a.a) {
                    T = bxl.a(arpj.a, c);
                    bwkVar.ad(T);
                }
                raq raqVar = new raq((arwe) T, avcVar, i5, 3);
                cga a3 = cgh.a(cga.e, 100.0f);
                c.y(199216268);
                boolean G = c.G(raqVar);
                Object T2 = bwkVar.T();
                if (G || T2 == bwj.a.a) {
                    T2 = new zzq(raqVar, 2);
                    bwkVar.ad(T2);
                }
                bwkVar.Y();
                cga c2 = adl.c(amv.h(adf.b(chk.a(amh.d(adw.c(a3, false, null, (arqg) T2, 7), 12.0f), awh.a), h), 24.0f), 1.0f, bmp.a(c).q, awh.a);
                int j = avcVar.j();
                if (j == i5) {
                    c.y(199227955);
                    a2 = dga.a(R.string.current_picture_navigation_button_content_description, c);
                    bwkVar.Y();
                } else if (j == 0) {
                    c.y(199233128);
                    a2 = dga.a(R.string.next_picture_navigation_button_content_description, c);
                    bwkVar.Y();
                } else {
                    c.y(199237108);
                    a2 = dga.a(R.string.previous_picture_navigation_button_content_description, c);
                    bwkVar.Y();
                }
                akc.b(aetn.aQ(c2, a2), c, 0);
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zyu(avcVar, i, 12);
        }
    }

    public static void L(yg ygVar, zzp zzpVar, wh whVar, bwj bwjVar, int i) {
        bwj c = bwjVar.c(160957385);
        ahge.a(ahji.Z(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15), null, null, cdk.e(871282531, new keh(zzpVar, ygVar, whVar, 5), c), c, 3072, 6);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jkb((Object) ygVar, (Object) zzpVar, (Object) whVar, i, 12, (short[]) null);
        }
    }

    public static void M(yg ygVar, List list, zzl zzlVar, zzu zzuVar, boolean z, wh whVar, bwj bwjVar, int i) {
        bwk bwkVar;
        atz atzVar;
        float floatValue;
        float floatValue2;
        float floatValue3;
        bwj c = bwjVar.c(-321192103);
        avc b = avf.b(0, new zzq(list, 6), c, 3);
        zzt zztVar = (zzt) list.get(b.j());
        int i2 = ((Configuration) c.g(AndroidCompositionLocals_androidKt.a)).orientation;
        afv b2 = afs.b(c, 0);
        ajw.e eVar = ajw.d;
        int i3 = cfq.a;
        cfq.b bVar = cfq.a.n;
        cga cgaVar = cga.e;
        if (i2 == 2) {
            cgaVar = afs.c(cga.e, b2, false, 14);
        }
        cga b3 = adf.b(cgaVar, cku.a);
        cue a2 = akk.a(eVar, bVar, c, 54);
        int a3 = bwg.a(c);
        bwk bwkVar2 = (bwk) c;
        byx P = bwkVar2.P();
        cga b4 = cfv.b(c, b3);
        int i4 = cwl.a;
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
            Object valueOf = Integer.valueOf(a3);
            bwkVar2.ad(valueOf);
            c.j(valueOf, arqvVar);
        }
        caw.b(c, b4, cwl.a.c);
        ako akoVar = ako.a;
        if (zzuVar == zzu.c) {
            c.y(1037057695);
            amx.a(amv.d(cga.e, 100.0f), c);
            bwkVar2.Y();
        } else {
            c.y(1037119199);
            amx.a(amv.d(cga.e, 150.0f), c);
            bwkVar2.Y();
        }
        c.y(1141836753);
        Object T = bwkVar2.T();
        if (T == bwj.a.a) {
            byu byuVar = new byu(null, cav.a);
            bwkVar2.ad(byuVar);
            T = byuVar;
        }
        byn bynVar = (byn) T;
        bwkVar2.Y();
        dqv dqvVar = (dqv) c.g(dch.d);
        c.y(1141840369);
        cga cgaVar2 = cga.e;
        if (z) {
            yg.d b5 = ygVar.b(c);
            int i5 = yg.c.c;
            bwkVar = bwkVar2;
            cgaVar2 = yf.a(ygVar, cgaVar2, b5, whVar, wx.g(zs.d(1000, 0, null, 6), 2), yg.c.a.a(), 984);
        } else {
            bwkVar = bwkVar2;
        }
        bwkVar.Y();
        cue a4 = akc.a(cfq.a.a, false);
        int a5 = bwg.a(c);
        byx P2 = bwkVar.P();
        cga b6 = cfv.b(c, cgaVar2);
        arqg arqgVar2 = cwl.a.a;
        c.A();
        bwk bwkVar3 = bwkVar;
        if (bwkVar3.y) {
            c.l(arqgVar2);
        } else {
            c.C();
        }
        caw.b(c, a4, cwl.a.e);
        caw.b(c, P2, cwl.a.d);
        arqv arqvVar2 = cwl.a.f;
        if (bwkVar3.y || !d.F(bwkVar3.T(), Integer.valueOf(a5))) {
            Object valueOf2 = Integer.valueOf(a5);
            bwkVar3.ad(valueOf2);
            c.j(valueOf2, arqvVar2);
        }
        caw.b(c, b6, cwl.a.c);
        cga p = amv.p(cga.e);
        if (a(bynVar) != null) {
            dqy a6 = a(bynVar);
            a6.getClass();
            atzVar = new atz.b(a6.a);
        } else {
            atzVar = atz.a.a;
        }
        aue.c(b, p, null, atzVar, brg.a, null, null, false, null, null, cdk.e(-325008137, new zzs(dqvVar, b, list, bynVar, zztVar), c), c, 48, 3072, 8180);
        c.p();
        Object a7 = whVar.a();
        c.y(1141888960);
        boolean G = c.G(a7) | c.G(b);
        Object T2 = bwkVar3.T();
        if (G || T2 == bwj.a.a) {
            T2 = new bxd(new zwj(b, whVar, 11), null);
            bwkVar3.ad(T2);
        }
        cas casVar = (cas) T2;
        bwkVar3.Y();
        cga.a aVar = cga.e;
        floatValue = ((Number) casVar.a()).floatValue();
        cga a8 = akoVar.a(adf.b(chk.a(amd.c(amh.f(amv.w(amv.u(cha.a(aVar, floatValue))), 60.0f, 16.0f, 60.0f, 16.0f), brg.a, -100.0f, 1), awh.a(35.0f)), cku.h(cku.b, 0.5f)), cfq.a.n);
        cue a9 = amq.a(ajw.e, cfq.a.j, c, 6);
        int a10 = bwg.a(c);
        byx P3 = bwkVar3.P();
        cga b7 = cfv.b(c, a8);
        arqg arqgVar3 = cwl.a.a;
        c.A();
        if (bwkVar3.y) {
            c.l(arqgVar3);
        } else {
            c.C();
        }
        caw.b(c, a9, cwl.a.e);
        caw.b(c, P3, cwl.a.d);
        arqv arqvVar3 = cwl.a.f;
        if (bwkVar3.y || !d.F(bwkVar3.T(), Integer.valueOf(a10))) {
            Object valueOf3 = Integer.valueOf(a10);
            bwkVar3.ad(valueOf3);
            c.j(valueOf3, arqvVar3);
        }
        caw.b(c, b7, cwl.a.c);
        K(b, c, 0);
        c.p();
        c.y(1141914218);
        Object T3 = bwkVar3.T();
        if (T3 == bwj.a.a) {
            byu byuVar2 = new byu(Float.valueOf(brg.a), cav.a);
            bwkVar3.ad(byuVar2);
            T3 = byuVar2;
        }
        byn bynVar2 = (byn) T3;
        bwkVar3.Y();
        bxl.e(Boolean.valueOf(whVar.a().s()), Integer.valueOf(b.j()), Boolean.valueOf(b.i()), new zez(whVar, bynVar2, (arpe) null, 10), c);
        cfq cfqVar = cfq.a.e;
        cga.a aVar2 = cga.e;
        floatValue2 = ((Number) casVar.a()).floatValue();
        cga c2 = amd.c(amv.p(cha.a(aVar2, floatValue2)), brg.a, ((Number) bynVar2.a()).floatValue(), 1);
        cue a11 = akc.a(cfqVar, false);
        int a12 = bwg.a(c);
        byx P4 = bwkVar3.P();
        cga b8 = cfv.b(c, c2);
        arqg arqgVar4 = cwl.a.a;
        c.A();
        if (bwkVar3.y) {
            c.l(arqgVar4);
        } else {
            c.C();
        }
        caw.b(c, a11, cwl.a.e);
        caw.b(c, P4, cwl.a.d);
        arqv arqvVar4 = cwl.a.f;
        if (bwkVar3.y || !d.F(bwkVar3.T(), Integer.valueOf(a12))) {
            Object valueOf4 = Integer.valueOf(a12);
            bwkVar3.ad(valueOf4);
            c.j(valueOf4, arqvVar4);
        }
        caw.b(c, b8, cwl.a.c);
        cfq.b bVar2 = cfq.a.n;
        cga.a aVar3 = cga.e;
        cue a13 = akk.a(ajw.c, bVar2, c, 48);
        int a14 = bwg.a(c);
        byx P5 = bwkVar3.P();
        cga b9 = cfv.b(c, aVar3);
        arqg arqgVar5 = cwl.a.a;
        c.A();
        if (bwkVar3.y) {
            c.l(arqgVar5);
        } else {
            c.C();
        }
        caw.b(c, a13, cwl.a.e);
        caw.b(c, P5, cwl.a.d);
        arqv arqvVar5 = cwl.a.f;
        if (bwkVar3.y || !d.F(bwkVar3.T(), Integer.valueOf(a14))) {
            Object valueOf5 = Integer.valueOf(a14);
            bwkVar3.ad(valueOf5);
            c.j(valueOf5, arqvVar5);
        }
        caw.b(c, b9, cwl.a.c);
        ahji.e(zztVar.c, null, cku.d, 0L, 0L, null, 0L, 0, false, 2, 0, null, bmp.d(c).g, c, 384, 3072, 57338);
        String str = zztVar.e;
        c.y(-1910004002);
        if (str != null) {
            cga c3 = adw.c(cga.e, false, null, new zzq(zztVar, 5), 7);
            cue a15 = akc.a(cfq.a.a, false);
            int a16 = bwg.a(c);
            byx P6 = bwkVar3.P();
            cga b10 = cfv.b(c, c3);
            arqg arqgVar6 = cwl.a.a;
            c.A();
            if (bwkVar3.y) {
                c.l(arqgVar6);
            } else {
                c.C();
            }
            caw.b(c, a15, cwl.a.e);
            caw.b(c, P6, cwl.a.d);
            arqv arqvVar6 = cwl.a.f;
            if (bwkVar3.y || !d.F(bwkVar3.T(), Integer.valueOf(a16))) {
                Object valueOf6 = Integer.valueOf(a16);
                bwkVar3.ad(valueOf6);
                c.j(valueOf6, arqvVar6);
            }
            caw.b(c, b10, cwl.a.c);
            ahji.e(str, null, bmp.a(c).f, 0L, 0L, null, 0L, 0, false, 2, 0, null, bmp.d(c).i, c, 0, 3072, 57338);
            c.p();
        }
        bwkVar3.Y();
        c.p();
        c.p();
        amx.a(akm.a(akoVar, cga.e, 1.0f), c);
        cga.a aVar4 = cga.e;
        floatValue3 = ((Number) casVar.a()).floatValue();
        cga j = amh.j(amv.p(cha.a(aVar4, floatValue3)), brg.a, brg.a, brg.a, 80.0f, 7);
        cue a17 = akc.a(cfq.a.e, false);
        int a18 = bwg.a(c);
        byx P7 = bwkVar3.P();
        cga b11 = cfv.b(c, j);
        arqg arqgVar7 = cwl.a.a;
        c.A();
        if (bwkVar3.y) {
            c.l(arqgVar7);
        } else {
            c.C();
        }
        caw.b(c, a17, cwl.a.e);
        caw.b(c, P7, cwl.a.d);
        arqv arqvVar7 = cwl.a.f;
        if (bwkVar3.y || !d.F(bwkVar3.T(), Integer.valueOf(a18))) {
            Object valueOf7 = Integer.valueOf(a18);
            bwkVar3.ad(valueOf7);
            c.j(valueOf7, arqvVar7);
        }
        caw.b(c, b11, cwl.a.c);
        O(!zztVar.d, zzlVar, zztVar.b, c, (i >> 3) & 112);
        c.p();
        c.y(1141970045);
        if (zzuVar == zzu.c) {
            amx.a(amv.d(cga.e, 50.0f), c);
        }
        bwkVar3.Y();
        c.p();
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aanz(ygVar, list, zzlVar, zzuVar, z, whVar, i, 1);
        }
    }

    public static void N(String str, arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(1936361453);
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
            ahfn.a(cdk.e(-325933647, new zny(str, 7), c), null, cdk.e(59928755, new zny(arqgVar, 8), c), null, brg.a, null, ahji.c(cku.g, 0L, 0L, c, 30), null, c, 390, 186);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zcj(str, arqgVar, i, 6, null);
        }
    }

    public static void O(boolean z, zzl zzlVar, vox voxVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(-1715959082);
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
            if (true != c.G(zzlVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c.G(voxVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else if (z) {
            c.y(977384059);
            ahji.ak(new zwj(zzlVar, voxVar, 12), aetn.aQ(cga.e, zzlVar.a), false, null, null, null, null, null, null, cdk.e(-1928920597, new yzl(zzlVar, 9), c), c, 805306368, 508);
            ((bwk) c).Y();
        } else {
            c.y(977569470);
            c.y(1139914609);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = yyo.p;
                bwkVar.ad(T);
            }
            bwkVar.Y();
            ahji.al((arqg) T, null, false, null, null, null, null, null, cdk.e(-435577800, new yzl(zzlVar, 10), c), c, 805306758);
            bwkVar.Y();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jyn(z, zzlVar, voxVar, i, 3);
        }
    }

    public static void P(zyi zyiVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-429794360);
        if (i4 == 0) {
            if (true != c.G(zyiVar)) {
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
        } else if (!zyiVar.a.isEmpty()) {
            ahji.af(null, null, ahji.aj(bmp.a(c).D, c, 14), null, null, cdk.e(-1055868011, new yzl(zyiVar, 8), c), c, 196608, 27);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zyu(zyiVar, i, 10);
        }
    }

    public static void Q(zzj zzjVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(133542504);
        if (i4 == 0) {
            if (true != c.G(zzjVar)) {
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
                ((bzf) e).d = new zyu(zzjVar, i, 9);
                return;
            }
            return;
        }
        if (zzjVar == null) {
            bzz e2 = c.e();
            if (e2 != null) {
                ((bzf) e2).d = new lhs(i, 6);
                return;
            }
            return;
        }
        throw null;
    }

    public static void R(zzf zzfVar, bwj bwjVar, int i) {
        int i2;
        bwk bwkVar;
        cpm cpmVar;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(1241846776);
        if (i4 == 0) {
            if (true != c.G(zzfVar)) {
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
            if (zzfVar.a == null && zzfVar.b == null) {
                bzz e = c.e();
                if (e != null) {
                    ((bzf) e).d = new zyu(zzfVar, i, 7);
                    return;
                }
                return;
            }
            dcf dcfVar = (dcf) c.g(dch.b);
            cpm cpmVar2 = (cpm) c.g(dch.g);
            cga j = amh.j(cga.e, brg.a, 8.0f, brg.a, brg.a, 13);
            int i5 = cfq.a;
            cue a2 = akk.a(ajw.c, cfq.a.n, c, 48);
            int a3 = bwg.a(c);
            bwk bwkVar2 = (bwk) c;
            byx P = bwkVar2.P();
            cga b = cfv.b(c, j);
            int i6 = cwl.a;
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
            String str = zzfVar.a;
            c.y(1534028906);
            if (str == null) {
                cpmVar = cpmVar2;
                bwkVar = bwkVar2;
            } else {
                long j2 = bmp.a(c).q;
                dje djeVar = bmp.d(c).h;
                boolean z = zzfVar.d;
                cga.a aVar = cga.e;
                zzg zzgVar = new zzg(cpmVar2, dcfVar, str, 0);
                c.y(-1280139238);
                Object T = bwkVar2.T();
                if (T == bwj.a.a) {
                    T = yyo.o;
                    bwkVar2.ad(T);
                }
                bwkVar2.Y();
                bwkVar = bwkVar2;
                cpmVar = cpmVar2;
                ahji.e(str, adw.f(aVar, z, zzgVar, (arqg) T, 110), j2, 0L, 0L, new dqi(3), 0L, 2, false, 1, 0, null, djeVar, c, 0, 3120, 54776);
            }
            bwkVar.Y();
            String str2 = zzfVar.b;
            c.y(1534052150);
            if (str2 != null) {
                ahji.e(str2, adw.f(cga.e, zzfVar.d, new zzg(zzfVar, cpmVar, dcfVar, 2), new zwj(zzfVar, dcfVar, 10), 110), bmp.a(c).q, 0L, 0L, new dqi(3), 0L, 2, false, 1, 0, null, bmp.d(c).k, c, 0, 3120, 54776);
            }
            bwkVar.Y();
            c.p();
        }
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new zyu(zzfVar, i, 8);
        }
    }

    public static void S(zze zzeVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1213595422);
        if (i4 == 0) {
            if (true != c.G(zzeVar)) {
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
            aevv aevvVar = zzeVar.a;
            if (aevvVar != null) {
                int i5 = cfq.a;
                cfq cfqVar = cfq.a.e;
                cga.a aVar = cga.e;
                cue a2 = akc.a(cfqVar, false);
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
                c.y(901951213);
                int i7 = i2 & 14;
                Object T = bwkVar.T();
                if (i7 == 4 || T == bwj.a.a) {
                    T = new zni(zzeVar, 20);
                    bwkVar.ad(T);
                }
                bwkVar.Y();
                adcx.bo(new aewg(aevvVar, null, 0, null, (arqg) T, 30), aetn.aQ(amv.g(cga.e, 64.0f), dga.a(R.string.conversation_icon, c)), c, 0);
                c.p();
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zyu(zzeVar, i, 6);
        }
    }

    public static lcq T(int i) {
        lcp a2 = lcq.a();
        a2.e(i);
        a2.d(true);
        return a2.a();
    }

    public static lcq U(ConversationIdType conversationIdType, long j, int i) {
        lcp a2 = lcq.a();
        a2.e(i);
        a2.d(true);
        a2.b(conversationIdType);
        a2.g(j);
        return a2.a();
    }

    public static Uri V(Uri uri, Uri uri2) {
        if (uri != null && uri2 != null) {
            return ContentUris.withAppendedId(uri2, ContentUris.parseId(uri));
        }
        return null;
    }

    public static void W(Context context, Runnable runnable) {
        ajgi ajgiVar = new ajgi(context);
        ajgiVar.x(R.string.title_of_video_attachment_needs_trimming);
        ajgiVar.m(R.string.text_of_video_attachment_needs_trimming);
        ajgiVar.t(R.string.open_video_trimmer_dialog_positive, new aajo(runnable, 15));
        ajgiVar.o(R.string.open_video_trimmer_dialog_negative, new aala(8));
        ajgiVar.create().show();
    }

    public static boolean X(PackageManager packageManager) {
        try {
            return packageManager.getApplicationInfo("com.samsung.app.newtrim", 0).enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean Y(String str, long j, long j2) {
        if (gh.z(str) && j > j2) {
            return true;
        }
        return false;
    }

    public static Point Z(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    private static dqy a(byn bynVar) {
        return (dqy) bynVar.a();
    }

    public static /* synthetic */ String aA(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "NOT_ELIGIBLE";
                    }
                    return "DETECTED_PARTICIPANT";
                }
                return "REPORTED_CONVERSATION";
            }
            return "REPORTED_PARTICIPANT";
        }
        return "BLOCKED_PARTICIPANT";
    }

    public static amfe aB(boolean z) {
        if (z) {
            return amfe.CONVERSATION_FROM_UNBLOCK_ACTION;
        }
        return amfe.CONVERSATION_FROM_UNSPAM_ACTION;
    }

    public static int aC(boolean z) {
        if (z) {
            return 12;
        }
        return 13;
    }

    public static ObjectAnimator aD(View view, boolean z, int i) {
        float f;
        float f2 = brg.a;
        if (true != z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        Property property = View.ALPHA;
        if (true != z) {
            f2 = 1.0f;
        }
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f, f2).setDuration(i);
    }

    public static ObjectAnimator aE(View view, float f, float f2, int i) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, (Property<View, Float>) zsc.a, f, f2).setDuration(i);
        duration.setRepeatMode(2);
        duration.setRepeatCount(-1);
        return duration;
    }

    public static int aF(View view, int i) {
        int i2;
        xze xzeVar = rsr.a;
        float dimension = view.getResources().getDimension(R.dimen.surface_elevation_level3);
        ajgm ajgmVar = new ajgm(view.getContext());
        if (rsr.p(i) == 3) {
            i2 = R.attr.colorComposePillBackgroundRcs;
        } else {
            i2 = R.attr.colorComposePillBackgroundXms;
        }
        return ajgmVar.b(ahnz.d(view, i2), dimension);
    }

    public static void aG(View view, float[] fArr) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setAntiAlias(false);
        ColorStateList valueOf = ColorStateList.valueOf(ahnz.d(view, R.attr.colorOnSurfaceStateLayer));
        if (valueOf == null) {
            return;
        }
        view.setForeground(new RippleDrawable(valueOf, null, shapeDrawable));
    }

    public static void aH(View view, MessagePartCoreData messagePartCoreData) {
        aI(view, messagePartCoreData, new ytt(7));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void aI(android.view.View r8, com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r9, java.util.function.Predicate r10) {
        /*
            r0 = 2131428121(0x7f0b0319, float:1.8477878E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 2131428120(0x7f0b0318, float:1.8477876E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 0
            if (r9 == 0) goto L24
            boolean r3 = r9.aU()
            if (r3 == 0) goto L24
            java.lang.String r10 = r9.X()
            r0.setText(r10)
            goto L91
        L24:
            if (r9 == 0) goto L83
            java.lang.String r3 = r9.U()
            boolean r10 = defpackage.d$$ExternalSyntheticApiModelOutline0.m(r10, r3)
            if (r10 == 0) goto L83
            android.content.Context r10 = r8.getContext()
            java.lang.String r3 = r9.U()
            r4 = 2132022555(0x7f14151b, float:1.9683533E38)
            if (r3 != 0) goto L42
            java.lang.String r10 = r10.getString(r4)
            goto L7f
        L42:
            int r5 = r3.hashCode()
            r6 = -1248334925(0xffffffffb597ebb3, float:-1.1318974E-6)
            r7 = 1
            if (r5 == r6) goto L5c
            r6 = 326991069(0x137d7cdd, float:3.1994652E-27)
            if (r5 == r6) goto L52
            goto L66
        L52:
            java.lang.String r5 = "text/x-vCalendar"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L66
            r3 = r7
            goto L67
        L5c:
            java.lang.String r5 = "application/pdf"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L66
            r3 = r2
            goto L67
        L66:
            r3 = -1
        L67:
            if (r3 == 0) goto L78
            if (r3 == r7) goto L70
            java.lang.String r10 = r10.getString(r4)
            goto L7f
        L70:
            r3 = 2132022680(0x7f141598, float:1.9683786E38)
            java.lang.String r10 = r10.getString(r3)
            goto L7f
        L78:
            r3 = 2132020203(0x7f140beb, float:1.9678763E38)
            java.lang.String r10 = r10.getString(r3)
        L7f:
            r0.setText(r10)
            goto L91
        L83:
            android.content.Context r10 = r8.getContext()
            r3 = 2132022607(0x7f14154f, float:1.9683638E38)
            java.lang.String r10 = r10.getString(r3)
            r0.setText(r10)
        L91:
            android.content.Context r10 = r8.getContext()
            int r10 = defpackage.zpt.f(r10)
            r0.setTextColor(r10)
            if (r9 == 0) goto Ld2
            long r3 = r9.p()
            r5 = 0
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 <= 0) goto Ld2
            android.content.Context r10 = r8.getContext()
            long r3 = r9.p()
            java.lang.String r9 = android.text.format.Formatter.formatFileSize(r10, r3)
            android.content.Context r10 = r8.getContext()
            java.util.Locale r10 = defpackage.yhx.b(r10)
            java.lang.String r9 = r9.toUpperCase(r10)
            r1.setText(r9)
            android.content.Context r8 = r8.getContext()
            int r8 = defpackage.zpt.g(r8)
            r1.setTextColor(r8)
            r1.setVisibility(r2)
            return
        Ld2:
            r8 = 8
            r1.setVisibility(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aabr.aI(android.view.View, com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.util.function.Predicate):void");
    }

    public static void aJ(arqg arqgVar, arqg arqgVar2, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-183550654);
        if (i5 == 0) {
            if (true != c.I(arqgVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i | i4;
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
            ajw.c cVar = ajw.e;
            cga p = amv.p(cga.e);
            int i6 = cfq.a;
            cue a2 = amq.a(cVar, cfq.a.j, c, 6);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, p);
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
            caw.b(c, b, cwl.a.c);
            amu amuVar = amu.a;
            ahji.ak(arqgVar, ams.a(amuVar, cga.e, 1.0f), false, null, null, null, null, null, null, znw.a, c, (i2 & 14) | 805306368, 508);
            amx.a(amv.l(cga.e, 8.0f), c);
            ahji.ak(arqgVar2, ams.a(amuVar, cga.e, 1.0f), false, null, null, null, null, null, null, znw.b, c, ((i2 >> 3) & 14) | 805306368, 508);
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zcj(arqgVar, arqgVar2, i, 4, null);
        }
    }

    public static void aK(aerb aerbVar, String str, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(1734276709);
        if (i5 == 0) {
            if (true != c.G(aerbVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i | i4;
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
            cga j = amh.j(cga.e, 16.0f, 4.0f, brg.a, 4.0f, 4);
            int i6 = cfq.a;
            cue a2 = amq.a(ajw.a, cfq.a.k, c, 48);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, j);
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
            ahji.N(aeke.bg(aerbVar, c), null, null, 0L, c, 56, 12);
            amx.a(amv.l(cga.e, 16.0f), c);
            ahji.e(str, null, bmp.a(c).s, 0L, 0L, new dqi(5), 0L, 0, false, 0, 0, null, bmp.d(c).k, c, (i2 >> 3) & 14, 0, 65018);
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zcj(aerbVar, str, i, 5, null);
        }
    }

    public static void aL(akn aknVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(1179349872);
        if (i4 == 0) {
            if (true != c.G(aknVar)) {
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
            cor bg = aeke.bg(aerb.dP, c);
            cga h = amv.h(cga.e, 32.0f);
            int i5 = cfq.a;
            ahji.N(bg, null, aknVar.a(h, cfq.a.n), bmp.a(c).s, c, 56, 0);
            amx.a(amv.d(cga.e, 8.0f), c);
            ahji.e(dga.a(R.string.turn_off_rcs_title, c), aknVar.a(cga.e, cfq.a.n), bmp.a(c).s, 0L, 0L, new dqi(3), 0L, 0, false, 0, 0, null, bmp.d(c).d, c, 0, 0, 65016);
            amx.a(amv.d(cga.e, 24.0f), c);
            ahji.e(dga.a(R.string.turn_off_rcs_description, c), null, bmp.a(c).s, 0L, 0L, new dqi(5), 0L, 0, false, 0, 0, null, bmp.d(c).k, c, 0, 0, 65018);
            amx.a(amv.d(cga.e, 8.0f), c);
            aK(aerb.aj, dga.a(R.string.high_quality_photos_video, c), c, 6);
            aK(aerb.bg, dga.a(R.string.rcs_group_chats, c), c, 6);
            aK(aerb.Y, dga.a(R.string.read_receipts, c), c, 6);
            aK(aerb.cf, dga.a(R.string.typing_indicators, c), c, 6);
            aK(aerb.dR, dga.a(R.string.messaging_with_wifi_data, c), c, 6);
            aK(aerb.ba, dga.a(R.string.messaging_with_gemini, c), c, 6);
            amx.a(amv.d(cga.e, 24.0f), c);
            cga d = amh.d(chk.a(adl.c(cga.e, 1.0f, bmp.a(c).B, awh.a(12.0f)), awh.a(12.0f)), 16.0f);
            cue a2 = amq.a(ajw.a, cfq.a.j, c, 0);
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
            aK(aerb.bj, dga.a(R.string.removed_in_30_days, c), c, 6);
            c.p();
            amx.a(amv.d(cga.e, 24.0f), c);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zaf(aknVar, i, 14);
        }
    }

    public static void aM(ascv ascvVar, bwj bwjVar, int i) {
        bwj c = bwjVar.c(198220392);
        znx znxVar = (znx) cak.a(ascvVar, c).a();
        if (znxVar == null) {
            bzz e = c.e();
            if (e != null) {
                ((bzf) e).d = new zaf(ascvVar, i, 16);
                return;
            }
            return;
        }
        bqv.c(anh.b(amv.o(cga.e), anl.e(c)), null, 0L, 0L, brg.a, brg.a, null, cdk.e(1193351405, new zny(znxVar, 0), c), c, 126);
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new zaf(ascvVar, i, 15);
        }
    }

    public static void aN(aiuc aiucVar, zly zlyVar) {
        aktp.H(aiucVar, zly.b.class, new kwf(zlyVar, 12));
    }

    public static void aO(lzh lzhVar, zjx zjxVar) {
        aktp.H(lzhVar, zij.a.class, new kwf(zjxVar, 11));
    }

    public static zbg aP(cas casVar) {
        return (zbg) casVar.a();
    }

    public static void aQ(rg rgVar, bwj bwjVar, int i) {
        bwj c = bwjVar.c(-615875323);
        if (rgVar == null) {
            bzz e = c.e();
            if (e != null) {
                ((bzf) e).d = new lhs(i, 4);
                return;
            }
            return;
        }
        enm enmVar = (enm) c.g(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        int i2 = rr.a;
        ro a2 = rr.a(c);
        if (a2 != null) {
            bxl.c(rgVar, new eiw((Object) a2.c(), (Object) enmVar, (Object) rgVar, 18, (byte[]) null), c);
            bzz e2 = c.e();
            if (e2 != null) {
                ((bzf) e2).d = new zaf(rgVar, i, 4);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static void aR(zav zavVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(1689376971);
        if (i4 == 0) {
            if (true != c.G(zavVar)) {
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
            ahji.e(dga.a(R.string.group_rename_choose_unique_group_name_notice, c), amh.j(cga.e, brg.a, 16.0f, brg.a, brg.a, 13), bmp.a(c).s, 0L, 0L, null, 0L, 0, false, 0, 0, null, bmp.d(c).n, c, 48, 0, 65528);
            String a2 = dga.a(R.string.group_rename_duplicate_legacy_group_link, c);
            c.y(1632920646);
            dhv.b bVar = new dhv.b((byte[]) null);
            bVar.a(new dip(bmp.a(c).a, 0L, null, null, null, null, null, 0L, null, null, 0L, null, null, 65534));
            bVar.f(a2);
            bVar.b();
            dhv b = bVar.b();
            bwk bwkVar = (bwk) c;
            bwkVar.Y();
            dje djeVar = bmp.d(c).l;
            c.y(-1864997214);
            int i5 = i2 & 14;
            Object T = bwkVar.T();
            if (i5 == 4 || T == bwj.a.a) {
                T = new ynn(zavVar, 6);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            awq.a(b, null, djeVar, false, 0, 0, null, (arqr) T, c, 0, 122);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zaf(zavVar, i, 5);
        }
    }

    public static void aS(String str, rg rgVar, bwj bwjVar, int i) {
        bwj c = bwjVar.c(5272367);
        List list = null;
        boolean z = false;
        arqr arqrVar = null;
        adom.bx(new afaw(new afas(str, null, null, false, null, null, null, 254), new aehz(dga.a(R.string.action_back, c), aerb.n, false, false, false, false, null, null, new yyy(rgVar, 11), 1020), list, z, arqrVar, null, 124), null, null, null, false, c, 0, 30);
        aQ(rgVar, c, 8);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new kie(str, rgVar, i, 16);
        }
    }

    public static void aT(cit citVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        citVar.getClass();
        int i4 = i & 14;
        bwj c = bwjVar.c(2034368354);
        if (i4 == 0) {
            if (true != c.G(citVar)) {
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
            bxl.g(citVar, new yiv(citVar, (agak) c.g(agas.a), (View) c.g(AndroidCompositionLocals_androidKt.f), (arpe) null, 2), c);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zaf(citVar, i, 6);
        }
    }

    public static void aU(ascv ascvVar, cga cgaVar, bwj bwjVar, int i) {
        bwj c = bwjVar.c(-48244357);
        afv b = afs.b(c, 0);
        cas a2 = cak.a(ascvVar, c);
        if (!aP(a2).k) {
            bzz e = c.e();
            if (e != null) {
                ((bzf) e).d = new kie(ascvVar, cgaVar, i, 17);
                return;
            }
            return;
        }
        wf.a(aP(a2).j, cgaVar, wx.g(null, 3), wx.h(null, 3), null, cdk.e(-912458157, new ifo(b, a2, 5, null), c), c, (i & 112) | 200064, 16);
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new kie(ascvVar, cgaVar, i, 18);
        }
    }

    public static void aV(arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-599205977);
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
            ahji.an(arqgVar, amh.j(cga.e, 16.0f, 18.0f, 16.0f, brg.a, 8), false, null, null, null, null, zak.a, c, (i2 & 14) | 805306368, 508);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zaf(arqgVar, i, 2);
        }
    }

    public static void aW(zae zaeVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(728590508);
        if (i4 == 0) {
            if (true != c.G(zaeVar)) {
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
            bzz e = c.e();
            if (e != null) {
                ((bzf) e).d = new zaf(zaeVar, i, 0);
                return;
            }
            return;
        }
        cga.a aVar = cga.e;
        c.y(294197194);
        bwk bwkVar = (bwk) c;
        Object T = bwkVar.T();
        if (T == bwj.a.a) {
            T = new ajs();
            bwkVar.ad(T);
        }
        bwkVar.Y();
        chk.a(amh.e(aVar, 8.0f, 2.0f), awh.a(24.0f));
        bgx.a(true, brg.a, 6);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void aX(defpackage.bwj r2, int r3) {
        /*
            r0 = 2029967448(0x78fed858, float:4.135098E34)
            bwj r2 = r2.c(r0)
            r0 = 0
            if (r3 != 0) goto L16
            boolean r3 = r2.L()
            if (r3 != 0) goto L12
            r3 = r0
            goto L16
        L12:
            r2.v()
            goto L1a
        L16:
            defpackage.aetn.J(r2, r0)
            r0 = r3
        L1a:
            bzz r2 = r2.e()
            if (r2 == 0) goto L2a
            lhs r3 = new lhs
            r1 = 3
            r3.<init>(r0, r1)
            bzf r2 = (defpackage.bzf) r2
            r2.d = r3
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aabr.aX(bwj, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        if (defpackage.d.F(((defpackage.yzv) r8).a, r7.c) == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void aY(defpackage.yzt r7, defpackage.yzx r8, defpackage.bwj r9, int r10) {
        /*
            r7.getClass()
            r0 = r10 & 14
            r1 = -851569779(0xffffffffcd3e138d, float:-1.9930952E8)
            bwj r9 = r9.c(r1)
            r1 = 1
            if (r0 != 0) goto L1a
            boolean r0 = r9.G(r7)
            if (r1 == r0) goto L17
            r0 = 2
            goto L18
        L17:
            r0 = 4
        L18:
            r0 = r0 | r10
            goto L1b
        L1a:
            r0 = r10
        L1b:
            r2 = r10 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L2b
            boolean r2 = r9.G(r8)
            if (r1 == r2) goto L28
            r1 = 16
            goto L2a
        L28:
            r1 = 32
        L2a:
            r0 = r0 | r1
        L2b:
            r1 = r0 & 91
            r2 = 18
            if (r1 != r2) goto L3c
            boolean r1 = r9.L()
            if (r1 != 0) goto L38
            goto L3c
        L38:
            r9.v()
            goto L91
        L3c:
            yzw r1 = defpackage.yzw.b
            boolean r1 = defpackage.d.F(r8, r1)
            if (r1 == 0) goto L45
            goto L5f
        L45:
            yzw r1 = defpackage.yzw.a
            boolean r1 = defpackage.d.F(r8, r1)
            if (r1 == 0) goto L4e
            goto L71
        L4e:
            boolean r1 = r8 instanceof defpackage.yzv
            if (r1 == 0) goto La8
            r1 = r8
            yzv r1 = (defpackage.yzv) r1
            java.lang.String r1 = r1.a
            java.lang.String r2 = r7.c
            boolean r1 = defpackage.d.F(r1, r2)
            if (r1 != 0) goto L71
        L5f:
            r1 = -493586928(0xffffffffe2947610, float:-1.3693127E21)
            r9.y(r1)
            r0 = r0 & 14
            aZ(r7, r9, r0)
            r0 = r9
            bwk r0 = (defpackage.bwk) r0
            r0.Y()
            goto L91
        L71:
            r0 = -493540366(0xffffffffe2952bf2, float:-1.3758657E21)
            r9.y(r0)
            aesp r0 = r7.b
            java.lang.String r1 = r7.a
            cga$a r2 = defpackage.cga.e
            java.lang.String r3 = "contact_row_test_prefix_"
            java.lang.String r1 = r3.concat(r1)
            cga r1 = defpackage.dea.a(r2, r1)
            r2 = 0
            defpackage.aetn.P(r0, r1, r9, r2, r2)
            r0 = r9
            bwk r0 = (defpackage.bwk) r0
            r0.Y()
        L91:
            bzz r9 = r9.e()
            if (r9 == 0) goto La7
            kie r6 = new kie
            r4 = 15
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            bzf r9 = (defpackage.bzf) r9
            r9.d = r6
        La7:
            return
        La8:
            armm r7 = new armm
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aabr.aY(yzt, yzx, bwj, int):void");
    }

    public static void aZ(yzt yztVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(1510340622);
        if (i4 == 0) {
            if (true != c.G(yztVar)) {
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
            cga p = amv.p(cga.e);
            ajw.e eVar = ajw.c;
            int i5 = cfq.a;
            cue a2 = akk.a(eVar, cfq.a.m, c, 0);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, p);
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
            aetn.P(new aesl(yztVar.c), null, c, 0, 2);
            aetn.P(yztVar.b, dea.a(cga.e, "contact_row_test_prefix_".concat(yztVar.a)), c, 0, 0);
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zaf(yztVar, i, 1);
        }
    }

    public static Uri aa(String str, Context context) {
        return Uri.parse(str).buildUpon().appendQueryParameter("hl", yhx.b(context).getLanguage()).build();
    }

    public static SpannableStringBuilder ab(final Context context, final armf armfVar, final armf armfVar2, String str, String str2, final uuf uufVar, final uuf uufVar2) {
        return ae(context, str, str2, new View.OnClickListener() { // from class: abbr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                uuf uufVar3 = uuf.this;
                Context context2 = context;
                if (uufVar3 != null && !TextUtils.isEmpty((CharSequence) uufVar3.e())) {
                    ((ksm) armfVar2.b()).e(context2, (String) uufVar3.e());
                    return;
                }
                uuf uufVar4 = uufVar2;
                if (uufVar4 != null && !TextUtils.isEmpty((CharSequence) uufVar4.e())) {
                    ((lzv) armfVar.b()).y(context2, (String) uufVar4.e());
                }
            }
        });
    }

    public static SpannableStringBuilder ac(Context context, armf armfVar, armf armfVar2, int i, uuf uufVar, uuf uufVar2) {
        String bs = yyb.bs(context);
        return ab(context, armfVar, armfVar2, context.getString(i, bs), bs, uufVar, uufVar2);
    }

    public static SpannableStringBuilder ad(Context context, int i) {
        String bs = yyb.bs(context);
        return ae(context, context.getString(i, bs), bs, null);
    }

    public static SpannableStringBuilder ae(Context context, String str, String str2, View.OnClickListener onClickListener) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        yyb.bv(context, spannableStringBuilder, str2, onClickListener);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder af(Context context, String str, String str2) {
        return ae(context, str, str2, null);
    }

    public static void ag(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.bottomMargin = view.getContext().getResources().getDimensionPixelSize(i);
        view.setLayoutParams(marginLayoutParams);
    }

    public static void ah(View view, int i) {
        ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).setMarginStart(view.getContext().getResources().getDimensionPixelSize(i));
    }

    public static void ai(View view) {
        ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).setMarginEnd(view.getContext().getResources().getDimensionPixelSize(R.dimen.media_viewer_button_margin));
    }

    public static void aj(Guideline guideline, int i) {
        ad adVar = (ad) guideline.getLayoutParams();
        adVar.a = i;
        adVar.b = -1;
        guideline.setLayoutParams(adVar);
    }

    public static void ak(Guideline guideline, int i) {
        ad adVar = (ad) guideline.getLayoutParams();
        adVar.b = i;
        adVar.a = -1;
        guideline.setLayoutParams(adVar);
    }

    public static Activity al(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        baseContext.getClass();
        return al(baseContext);
    }

    public static void am(View view, Runnable runnable) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ztb(view, runnable, 2));
    }

    public static void an(aerb aerbVar, String str, arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(-796303005);
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
            ahji.P(arqgVar, adf.b(chk.a(amv.h(cga.e, 48.0f), awh.a), bmp.a(c).D).a(dea.a(cga.e, str)), false, null, null, cdk.e(27289477, new ifn(aerbVar, str, 12, null), c), c, ((i2 >> 6) & 14) | 1572864, 60);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jkb(aerbVar, str, arqgVar, i, 11, (int[]) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void ao(zzc zzcVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(1787884150);
        if (i4 == 0) {
            if (true != c.G(zzcVar)) {
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
            ajw.d dVar = new ajw.d(24.0f, true, ajx.a);
            cga j = amh.j(cga.e, brg.a, 8.0f, brg.a, 16.0f, 5);
            int i5 = cfq.a;
            cue a2 = amq.a(dVar, cfq.a.j, c, 0);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, j);
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
            c.y(860660540);
            alur it = zzcVar.a.iterator();
            it.getClass();
            while (it.hasNext()) {
                aehz aehzVar = (aehz) it.next();
                aerb aerbVar = aehzVar.b;
                aerbVar.getClass();
                an(aerbVar, aehzVar.a, aehzVar.j, c, 0);
            }
            bwkVar.Y();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zyu(zzcVar, i, 5);
        }
    }

    public static void ap(zyz zyzVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1483412301);
        if (i4 == 0) {
            if (true != c.G(zyzVar)) {
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
            cfq.b bVar = cfq.a.n;
            cga p = amv.p(cga.e);
            cue a2 = akk.a(ajw.c, bVar, c, 48);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, p);
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
            S(zyzVar.a, c, 0);
            R(zyzVar.b, c, 0);
            ao(zyzVar.c, c, 0);
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zyu(zyzVar, i, 4);
        }
    }

    public static void aq(yg ygVar, zyz zyzVar, wh whVar, bwj bwjVar, int i) {
        bwj c = bwjVar.c(-876404820);
        int i2 = cfq.a;
        cfq.b bVar = cfq.a.n;
        cga p = amv.p(cga.e);
        cue a2 = akk.a(ajw.c, bVar, c, 48);
        int a3 = bwg.a(c);
        bwk bwkVar = (bwk) c;
        byx P = bwkVar.P();
        cga b = cfv.b(c, p);
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
        caw.b(c, b, cwl.a.c);
        c.y(1481932908);
        zyy zyyVar = zyzVar.d;
        cga cgaVar = cga.e;
        if (!zyyVar.a) {
            yg.d b2 = ygVar.b(c);
            int i4 = yg.c.c;
            cgaVar = yf.a(ygVar, cgaVar, b2, whVar, null, yg.c.a.a(), 988);
        }
        bwkVar.Y();
        cue a4 = akc.a(cfq.a.a, false);
        int a5 = bwg.a(c);
        byx P2 = bwkVar.P();
        cga b3 = cfv.b(c, cgaVar);
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
        S(zyzVar.a, c, 0);
        c.p();
        R(zyzVar.b, c, 0);
        ao(zyzVar.c, c, 0);
        c.p();
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jkb((Object) ygVar, (Object) zyzVar, (Object) whVar, i, 10, (short[]) null);
        }
    }

    public static void ar(zyx zyxVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(603494105);
        if (i4 == 0) {
            if (true != c.G(zyxVar)) {
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
            ahji.af(null, null, ahji.aj(bmp.a(c).D, c, 14), null, null, cdk.e(1053118795, new yzl(zyxVar, 7), c), c, 196608, 27);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zyu(zyxVar, i, 2);
        }
    }

    public static void as(alog alogVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1524843218);
        if (i4 == 0) {
            if (true != c.G(alogVar)) {
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
            alur it = alogVar.iterator();
            it.getClass();
            while (it.hasNext()) {
                aesg aesgVar = (aesg) it.next();
                aesgVar.getClass();
                aetn.ae(aesgVar, dea.a(cga.e, dga.a(R.string.group_member_details, c)), c, 0, 0);
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zyu(alogVar, i, 3);
        }
    }

    public static void at(zyx zyxVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(1692652074);
        if (i4 == 0) {
            if (true != c.G(zyxVar)) {
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
            ahji.L(zyt.a, null, cdk.e(48340744, new zny(zyxVar.a, 4), c), cdk.e(-296575001, new zny(zyxVar.c, 5), c), ahji.M(bmp.a(c).D, c, 510), c, 221190, 398);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zyu(zyxVar, i, 0);
        }
    }

    public static void au(zym zymVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(624206876);
        if (i4 == 0) {
            if (true != c.G(zymVar)) {
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
        } else if (zymVar != null && !zymVar.a.isEmpty()) {
            ahji.af(null, null, ahji.aj(bmp.a(c).D, c, 14), null, null, cdk.e(-1215041394, new yzl(zymVar, 6), c), c, 196608, 27);
        } else {
            bzz e = c.e();
            if (e != null) {
                ((bzf) e).d = new zaf(zymVar, i, 20);
                return;
            }
            return;
        }
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new zyu(zymVar, i, 1);
        }
    }

    public static long av(int i, bwj bwjVar) {
        if (i - 1 != 0) {
            bwjVar.y(-888445915);
            long j = bmp.a(bwjVar).w;
            bwjVar.q();
            return j;
        }
        bwjVar.y(-888447607);
        long j2 = bmp.a(bwjVar).q;
        bwjVar.q();
        return j2;
    }

    public static void aw(zyi zyiVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(2018364944);
        if (i4 == 0) {
            if (true != c.G(zyiVar)) {
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
            alur it = zyiVar.a.iterator();
            it.getClass();
            while (it.hasNext()) {
                aesg aesgVar = (aesg) it.next();
                if (aesgVar instanceof aeth) {
                    c.y(-360836010);
                    aetn.k((aeth) aesgVar, null, dje.y(bmp.d(c).l, 0L, drn.c(13), null, null, null, null, 0L, 0, 0, 0L, null, null, 0, 16777213), null, null, null, c, 0, 0, 2042);
                    ((bwk) c).Y();
                } else {
                    c.y(-360831417);
                    aesgVar.getClass();
                    aetn.ae(aesgVar, null, c, 0, 2);
                    ((bwk) c).Y();
                }
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zaf(zyiVar, i, 19);
        }
    }

    public static void ax(zyf zyfVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(102138216);
        if (i4 == 0) {
            if (true != c.G(zyfVar)) {
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
            ahji.af(null, null, ahji.aj(bmp.a(c).D, c, 14), null, null, cdk.e(789582262, new yzl(zyfVar, 5), c), c, 196608, 27);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zaf(zyfVar, i, 18);
        }
    }

    public static void ay(zyc zycVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(743434759);
        if (i4 == 0) {
            if (true != c.G(zycVar)) {
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
        } else if (!zycVar.a.isEmpty()) {
            ahji.af(null, null, ahji.aj(bmp.a(c).D, c, 14), null, null, cdk.e(230392026, new yzl(zycVar, 4), c), c, 196608, 27);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zaf(zycVar, i, 17);
        }
    }

    public static int az(CdpOpeningArguments cdpOpeningArguments) {
        cdpOpeningArguments.getClass();
        return cdpOpeningArguments.a;
    }

    public static boolean ba(MessageCoreData messageCoreData) {
        Optional a2 = uzc.a(messageCoreData.am());
        try {
            if (a2.isPresent()) {
                if (arsd.x(new URL((String) a2.get()).getHost(), "duo.app.goo.gl", true)) {
                    return true;
                }
            }
        } catch (MalformedURLException unused) {
        }
        return false;
    }

    public static String bb(String str) {
        String a2 = yta.a(str);
        if (a2 != null) {
            return a2.trim();
        }
        return null;
    }

    public static void bc(aohs aohsVar, aaed aaedVar) {
        aohsVar.r(((View) aohsVar.a).findViewById(R.id.rbm_bottom_sheet_sim_button), new zqq(aaedVar, 18, null));
    }

    public static /* synthetic */ wfh bd(aozy aozyVar) {
        aozyVar.getClass();
        return new wfh(aozyVar);
    }

    public static /* synthetic */ wfh be(aozy aozyVar) {
        aozyVar.getClass();
        return new wfh(aozyVar);
    }

    public static aaal t(da daVar) {
        aaal aaalVar = (aaal) daVar.e("emojiGallery");
        if (aaalVar != null) {
            aaalVar.a();
        }
        return aaalVar;
    }

    public static void u() {
        if (a == null) {
            synchronized (aabr.class) {
                if (a == null) {
                    a = new aabr();
                }
            }
        }
    }

    public static int v(View view, int i, int i2) {
        view.measure(i, i2);
        return view.getMeasuredHeight();
    }

    public static int w(int i) {
        if (i != 2) {
            if (i == 3) {
                return 2;
            }
            if (i == 4) {
                return 3;
            }
            if (i == 5) {
                return 4;
            }
            return 0;
        }
        return 1;
    }

    public static void x(aahr aahrVar, arqg arqgVar, arqg arqgVar2, bwj bwjVar, int i) {
        bwj c = bwjVar.c(-792385139);
        cga.a aVar = cga.e;
        int i2 = cfq.a;
        cfq cfqVar = cfq.a.b;
        cga a2 = alw.a(aVar, alx.a);
        cue a3 = akc.a(cfqVar, false);
        int a4 = bwg.a(c);
        bwk bwkVar = (bwk) c;
        byx P = bwkVar.P();
        cga b = cfv.b(c, a2);
        int i3 = cwl.a;
        arqg arqgVar3 = cwl.a.a;
        c.A();
        if (bwkVar.y) {
            c.l(arqgVar3);
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
        bqv.c(cgh.a(amv.n(amv.p(amv.q(amh.f(aVar, 8.0f, 8.0f, 8.0f, 8.0f), 36.0f, brg.a, 2))), -1.0f), awh.a(12.0f), bmp.a(c).I, 0L, brg.a, brg.a, null, aahn.a, c, 120);
        cga p = amv.p(amh.j(aVar, 8.0f, brg.a, brg.a, 8.0f, 6));
        c.y(-1003410150);
        c.y(212064437);
        bwkVar.Y();
        dqv dqvVar = (dqv) c.g(dch.d);
        Object T = bwkVar.T();
        if (T == bwj.a.a) {
            T = new duj(dqvVar);
            bwkVar.ad(T);
        }
        duj dujVar = (duj) T;
        Object T2 = bwkVar.T();
        if (T2 == bwj.a.a) {
            T2 = new duc((char[]) null);
            bwkVar.ad(T2);
        }
        duc ducVar = (duc) T2;
        Object T3 = bwkVar.T();
        if (T3 == bwj.a.a) {
            byu byuVar = new byu(false, cav.a);
            bwkVar.ad(byuVar);
            T3 = byuVar;
        }
        byn bynVar = (byn) T3;
        Object T4 = bwkVar.T();
        if (T4 == bwj.a.a) {
            T4 = new duh(ducVar);
            bwkVar.ad(T4);
        }
        duh duhVar = (duh) T4;
        Object T5 = bwkVar.T();
        if (T5 == bwj.a.a) {
            byu byuVar2 = new byu(arnb.a, byo.a);
            bwkVar.ad(byuVar2);
            T5 = byuVar2;
        }
        byn bynVar2 = (byn) T5;
        boolean I = c.I(dujVar) | c.E(257);
        Object T6 = bwkVar.T();
        if (I || T6 == bwj.a.a) {
            agiu agiuVar = new agiu(bynVar2, dujVar, duhVar, bynVar, 1);
            bwkVar.ad(agiuVar);
            T6 = agiuVar;
        }
        cue cueVar = (cue) T6;
        Object T7 = bwkVar.T();
        if (T7 == bwj.a.a) {
            T7 = new zwj(bynVar, duhVar, 13, null);
            bwkVar.ad(T7);
        }
        boolean I2 = c.I(dujVar);
        Object T8 = bwkVar.T();
        if (I2 || T8 == bwj.a.a) {
            T8 = new ynn(dujVar, 20);
            bwkVar.ad(T8);
        }
        cto.b(dhb.d(p, (arqr) T8), cdk.e(1200550679, new aahs(bynVar2, ducVar, aahrVar, arqgVar, i, arqgVar2, 0), c), cueVar, c, 48);
        bwkVar.Y();
        c.p();
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jkb(aahrVar, arqgVar, arqgVar2, i, 17, (int[]) null);
        }
    }

    public static /* synthetic */ void y(arqg arqgVar, cga cgaVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(-2024626801);
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
            cga h = amv.h(cgaVar, 48.0f);
            c.y(1437575982);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = new ajs();
                bwkVar.ad(T);
            }
            bwkVar.Y();
            cga j = amh.j(adw.b(h, (ajr) T, bgx.a(false, 18.0f, 4), false, null, new dgv(0), arqgVar, 12), 8.0f, 19.5f, brg.a, brg.a, 12);
            int i7 = cfq.a;
            cue a2 = akc.a(cfq.a.a, false);
            int a3 = bwg.a(c);
            byx P = bwkVar.P();
            cga b = cfv.b(c, j);
            int i8 = cwl.a;
            arqg arqgVar2 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar2);
            } else {
                c.C();
            }
            caw.b(c, a2, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar2);
            }
            caw.b(c, b, cwl.a.c);
            arqvVar.a(c, Integer.valueOf((i2 >> 6) & 14));
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jkb((Object) arqgVar, (Object) cgaVar, (Object) arqvVar, i, 16, (char[]) null);
        }
    }

    public static /* synthetic */ void z(aahr aahrVar, arqg arqgVar, bwj bwjVar, int i) {
        bwj bwjVar2;
        bwj c = bwjVar.c(-1287955633);
        cga.a aVar = cga.e;
        boolean z = true;
        dhv C = C(aahrVar, true, c, 0);
        dje y = dje.y(bmp.d(c).k, bmp.a(c).s, 0L, null, null, null, null, 0L, 3, 0, 0L, null, null, 0, 16744446);
        int i2 = i >> 3;
        int i3 = i2 & 112;
        if (xwr.h((Context) c.g(AndroidCompositionLocals_androidKt.b))) {
            c.y(770359030);
            ahji.an(arqgVar, aVar, false, null, null, new amj.a(), null, cdk.e(-528381193, new ifo(C, y, 6, null), c), c, (i2 & 14) | 817889280 | i3, 380);
            ((bwk) c).Y();
            bwjVar2 = c;
        } else {
            c.y(770562359);
            c.y(856144397);
            boolean G = c.G(C);
            if ((((i & 112) ^ 48) <= 32 || !c.G(arqgVar)) && (i & 48) != 32) {
                z = false;
            }
            boolean z2 = z | G;
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (z2 || T == bwj.a.a) {
                T = new wup(C, arqgVar, 20);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            bwjVar2 = c;
            awq.a(C, aVar, y, false, 0, 0, null, (arqr) T, bwjVar2, i3, 120);
            bwkVar.Y();
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new zcj(aahrVar, arqgVar, i, 7, null);
        }
    }

    public aabr(byte[] bArr, byte[] bArr2, char[] cArr) {
    }

    public aabr(View view) {
        view.getClass();
    }

    public aabr(View view, byte[] bArr) {
        xyl.g();
        xyl.l(view);
        xyl.e(0L, view.getResources().getDimensionPixelSize(R.dimen.people_add_a_photo_touch_extra));
    }
}
