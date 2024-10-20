package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.vcard.VCardConstants;
import com.bumptech.glide.load.ImageHeaderParser;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.settings.ConversationSettingsOptionItemView;
import com.google.android.apps.messaging.conversation2.api.OpenConversation2Arguments;
import com.google.android.apps.messaging.conversation2.bottomcontent.composerow.draft.attachment.RichLocation;
import defpackage.ajw;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;
import defpackage.ixd;
import defpackage.ztc;
import defpackage.ztr;
import defpackage.zxh;
import j$.time.Instant;
import j$.time.MonthDay;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.util.DesugarTimeZone;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlc {
    public hlc() {
    }

    public static final void A(idz idzVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-1916634779);
        if (i5 == 0) {
            if (true != c.G(idzVar)) {
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
            aap aapVar = adom.bZ(c).a;
            aap aapVar2 = adom.bZ(c).b;
            c.y(1460850864);
            z(idzVar, aapVar, aapVar2, cgaVar, c, (i2 & 14) | 576 | ((i2 << 6) & 7168));
            ((bwk) c).Y();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new iea(idzVar, cgaVar, i, 1);
        }
    }

    public static final void B(idz idzVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(285504848);
        if (i5 == 0) {
            if (true != c.G(idzVar)) {
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
        } else if (idzVar != null) {
            if (idzVar instanceof ieo) {
                c.y(-381068570);
                y((ieo) idzVar, cgaVar, c, i2 & 112);
                ((bwk) c).Y();
            } else if (idzVar instanceof ieq) {
                c.y(-381066613);
                x((ieq) idzVar, cgaVar, c, i2 & 112);
                ((bwk) c).Y();
            } else {
                c.y(1071872630);
                ((bwk) c).Y();
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new iea(idzVar, cgaVar, i, 0);
        }
    }

    public static final void C(hld hldVar, bhv bhvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        hldVar.getClass();
        bhvVar.getClass();
        int i5 = i & 14;
        bwj c = bwjVar.c(-1169255637);
        if (i5 == 0) {
            if (true != c.G(hldVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(bhvVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else if (hldVar instanceof ifw) {
            q((ifw) hldVar, bhvVar, c, i2 & 112);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new iea(hldVar, bhvVar, i, 6);
        }
    }

    public static final afcp D(jha jhaVar) {
        jhaVar.getClass();
        if (jhaVar instanceof jgz) {
            return ((jgz) jhaVar).a.fh();
        }
        if (jhaVar instanceof jgv) {
            return ((jgv) jhaVar).a.fh();
        }
        if (jhaVar instanceof jgw) {
            return ((jgw) jhaVar).d;
        }
        throw new armm();
    }

    public static final afsw E(jha jhaVar) {
        jhaVar.getClass();
        if (jhaVar instanceof jgz) {
            return aa(((jgz) jhaVar).a);
        }
        if (jhaVar instanceof jgv) {
            return aa(((jgv) jhaVar).a);
        }
        if (jhaVar instanceof jgw) {
            return ((jgw) jhaVar).a.b;
        }
        throw new armm();
    }

    public static final afsx F(afcq afcqVar, afsp afspVar, long j) {
        if (afcqVar instanceof afcv) {
            return ((afcv) afcqVar).d();
        }
        if (afcqVar instanceof afsn) {
            return afsy.c((afso) afcqVar, afspVar, Long.valueOf(j)).d();
        }
        if (afcqVar instanceof afsm) {
            return ((afsm) afcqVar).d();
        }
        if (afcqVar instanceof RichLocation) {
            return ((RichLocation) afcqVar).d;
        }
        throw new UnsupportedOperationException("Cannot get MediaType for ".concat(String.valueOf(afcqVar.fj())));
    }

    public static final boolean G(jha jhaVar) {
        boolean z;
        jhaVar.getClass();
        afsw E = E(jhaVar);
        if (!d.F(E, afsu.a) && !d.F(E, afsv.a)) {
            z = false;
        } else {
            z = true;
        }
        boolean F = d.F(D(jhaVar), afct.a);
        if (!z || F) {
            return false;
        }
        return true;
    }

    public static final int H(int i) {
        if (i >= 0) {
            return arsk.f(i / 5.0d) * 5;
        }
        throw new IllegalArgumentException(a.bV(i, "Text length is negative: "));
    }

    public static final jgj I(afnr afnrVar, int i) {
        int i2;
        afwv afwvVar = afnrVar.e;
        if (d.F(afwvVar, afnp.a)) {
            i2 = 2;
        } else if (d.F(afwvVar, afnn.a)) {
            i2 = 3;
        } else if (afwvVar instanceof afnq) {
            i2 = 4;
        } else if (d.F(afwvVar, afno.a)) {
            if (i == 3) {
                i2 = 5;
            } else {
                i2 = 6;
            }
        } else {
            throw new armm();
        }
        return new jgj(afnrVar.b, i2, afnrVar.d);
    }

    public static final amoq J(int i, Boolean bool) {
        ahlp aV = akec.aV(amoq.a.createBuilder());
        jgn.c(aV, i);
        Y(aV, i, bool);
        return aV.A();
    }

    public static final long K(long j, long j2) {
        return j2 * arsk.h(j / j2);
    }

    public static final void L(aeip aeipVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        int i3;
        int i4 = i & 14;
        bwj c2 = bwjVar.c(-2126555103);
        if (i4 == 0) {
            if (true != c2.G(aeipVar)) {
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
            cga a = dea.a(ani.b(amh.e(adf.a(c, bmp.a(c2).I, awh.c(4.0f, 4.0f, brg.a, brg.a, 12)), 30.0f, 20.0f)), ((aeiq) aeipVar).a);
            int i5 = cfq.a;
            cue a2 = akc.a(cfq.a.e, false);
            int a3 = bwg.a(c2);
            bwk bwkVar = (bwk) c2;
            byx P = bwkVar.P();
            cga b = cfv.b(c2, a);
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
            caw.b(c2, b, cwl.a.c);
            aeim.f(aeipVar, dea.a(cga.e, "Compose:Disabled"), 0L, null, 0L, null, false, null, c2, (i2 & 14) | 48, 508);
            c2.p();
        } else {
            c2.v();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new jgb(aeipVar, i, 0);
        }
    }

    public static final void M(jfz jfzVar, cga cgaVar, boolean z, bwj bwjVar, int i) {
        int i2;
        cga c;
        cga c2;
        float f;
        aap aapVar;
        long j;
        float floatValue;
        int i3;
        int i4;
        int i5;
        int i6;
        bwj c3 = bwjVar.c(-98837613);
        if ((i & 14) == 0) {
            if (true != c3.G(jfzVar)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c3.G(cgaVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (true != c3.H(z)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (true != c3.G(null)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) != 1170 || !c3.L()) {
            c = amv.c(cgaVar, 1.0f);
            c3.y(-1982282127);
            int i7 = i2 & 14;
            bwk bwkVar = (bwk) c3;
            Object T = bwkVar.T();
            if (i7 == 4 || T == bwj.a.a) {
                T = new ipk(jfzVar, 9);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            cga a = cur.a(c, (arqr) T);
            ajw.e eVar = ajw.c;
            int i8 = cfq.a;
            cue a2 = akk.a(eVar, cfq.a.m, c3, 0);
            int a3 = bwg.a(c3);
            byx P = bwkVar.P();
            cga b = cfv.b(c3, a);
            int i9 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c3.A();
            if (bwkVar.y) {
                c3.l(arqgVar);
            } else {
                c3.C();
            }
            caw.b(c3, a2, cwl.a.e);
            caw.b(c3, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                bwkVar.ad(valueOf);
                c3.j(valueOf, arqvVar);
            }
            caw.b(c3, b, cwl.a.c);
            ascv ascvVar = jfzVar.b;
            ako akoVar = ako.a;
            c3.y(-1075184541);
            boolean G = c3.G(ascvVar);
            Object T2 = bwkVar.T();
            if (G || T2 == bwj.a.a) {
                jdn jdnVar = new jdn((Object) new armo(null, false), (asai) jfzVar.b, (arqw) new jdy((arpe) null, 3, (short[]) null), 16);
                bwkVar.ad(jdnVar);
                T2 = jdnVar;
            }
            bwkVar.Y();
            armo armoVar = (armo) cao.b((asai) T2, new armo(null, false), null, c3, 2).a();
            wf.b(akoVar, ((Boolean) armoVar.b).booleanValue(), akoVar.a(cga.e, cfq.a.n), null, null, null, cdk.e(-1312134395, new ifo((afal) armoVar.a, akoVar, 2), c3), c3, 1572870, 28);
            c2 = amv.c(cga.e, 1.0f);
            cue a4 = akk.a(ajw.c, cfq.a.m, c3, 0);
            int a5 = bwg.a(c3);
            byx P2 = bwkVar.P();
            cga b2 = cfv.b(c3, c2);
            arqg arqgVar2 = cwl.a.a;
            c3.A();
            if (bwkVar.y) {
                c3.l(arqgVar2);
            } else {
                c3.C();
            }
            caw.b(c3, a4, cwl.a.e);
            caw.b(c3, P2, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a5))) {
                Integer valueOf2 = Integer.valueOf(a5);
                bwkVar.ad(valueOf2);
                c3.j(valueOf2, arqvVar2);
            }
            caw.b(c3, b2, cwl.a.c);
            cas a6 = cak.a(jfzVar.a, c3);
            jkz jkzVar = ((jgc) a6.a()).e;
            if (jkzVar != null) {
                c3.y(1008797093);
                L(jkzVar.a, c3, 0);
                bwkVar.Y();
            } else {
                c3.y(1008915110);
                boolean booleanValue = ((Boolean) cao.b(((jgc) a6.a()).d, false, null, c3, 2).a()).booleanValue();
                if (true != booleanValue) {
                    f = 0.96f;
                } else {
                    f = 0.25f;
                }
                if (booleanValue) {
                    c3.y(1009248267);
                    aapVar = adom.bZ(c3).l;
                    bwkVar.Y();
                } else {
                    c3.y(1009338508);
                    aapVar = adom.bZ(c3).k;
                    bwkVar.Y();
                }
                cas c4 = zl.c(f, aapVar, null, c3, 3136, 20);
                jgc jgcVar = (jgc) a6.a();
                c3.y(400030459);
                if (adom.cd(c3)) {
                    c3.y(1601961604);
                    j = adom.bX(c3).d.a;
                    bwkVar.Y();
                } else if (z) {
                    c3.y(1601963403);
                    j = adom.bX(c3).H;
                    bwkVar.Y();
                } else {
                    c3.y(1601965185);
                    j = bmp.a(c3).p;
                    bwkVar.Y();
                }
                bwkVar.Y();
                floatValue = ((Number) c4.a()).floatValue();
                N(jgcVar, j, floatValue, c3, i2 & 7168);
                bwkVar.Y();
            }
            c3.p();
            c3.p();
        } else {
            c3.v();
        }
        bzz e = c3.e();
        if (e != null) {
            ((bzf) e).d = new jyn(jfzVar, cgaVar, z, i, 1);
        }
    }

    public static final void N(jgc jgcVar, long j, float f, bwj bwjVar, int i) {
        int i2;
        long f2;
        cga a;
        long j2;
        cga a2;
        cga a3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i & 14;
        bwj c = bwjVar.c(1021570795);
        if (i7 == 0) {
            if (true != c.G(jgcVar)) {
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
            if (true != c.D(f)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (true != c.G(null)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) != 1170 || !c.L()) {
            f2 = ckw.f(cku.d(j), cku.c(j), cku.b(j), f, cku.f(j));
            c.y(-1230803213);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                byu byuVar = new byu(new dqy(brg.a), cav.a);
                bwkVar.ad(byuVar);
                T = byuVar;
            }
            bwkVar.Y();
            aeoq aeoqVar = jgcVar.a;
            c.y(-1230795789);
            a = adf.a(cga.e, f2, clw.a);
            bwkVar.Y();
            adom.aE(aeoqVar, a, null, c, 0, 4);
            afyo afyoVar = jgcVar.b;
            c.y(-1230775438);
            c.y(-1230782498);
            cga.a aVar = cga.e;
            if (true != anfi.a("bugle.prevent_input_close_on_scroll", "bugle")) {
                j2 = f2;
            } else {
                j2 = j;
            }
            a2 = adf.a(aVar, j2, clw.a);
            if (adom.cd(c) && !(jgcVar.b.a instanceof agfg)) {
                a3 = adf.a(cga.e, bmp.a(c).J, clw.a);
                a2 = a2.a(a3);
            }
            bwkVar.Y();
            bwkVar.Y();
            afzv.p(afyoVar, a2, false, c, 0);
            bxl.g(arnb.a, new emz(jgcVar, (Context) c.g(AndroidCompositionLocals_androidKt.b), (arpe) null, 20), c);
        } else {
            c.v();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jga(jgcVar, j, f, i);
        }
    }

    public static final boolean O(OpenConversation2Arguments openConversation2Arguments) {
        openConversation2Arguments.getClass();
        return openConversation2Arguments.e;
    }

    public static final String P(miz mizVar) {
        mym e = mizVar.e();
        if (e instanceof mys) {
            return ((mys) e).c();
        }
        return null;
    }

    public static final String Q(miz mizVar) {
        mym e = mizVar.e();
        if (e instanceof myr) {
            return ((myr) e).b();
        }
        if (e instanceof mxx) {
            alog alogVar = ((mxx) e).a;
            alogVar.getClass();
            return ((mxw) aqjn.X(alogVar)).a;
        }
        if (!(e instanceof myp)) {
            return null;
        }
        return ((myp) e).n();
    }

    public static final boolean R(myk mykVar) {
        return gh.u(mykVar.j());
    }

    public static final List S(Set set, List list) {
        try {
            jbs jbsVar = jbs.i;
            list.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(arrn.r(aqjn.i(aqjn.J(set, 10)), 16));
            for (Object obj : set) {
                linkedHashMap.put(jbsVar.a(obj), obj);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object obj2 = linkedHashMap.get(it.next());
                if (obj2 != null) {
                    arrayList.add(obj2);
                } else {
                    throw new NoSuchElementException("Key in sortedKeys was not found in collection.");
                }
            }
            return arrayList;
        } catch (NoSuchElementException e) {
            throw new IllegalStateException("Action was included in manifest but was not bound.", e);
        }
    }

    public static final boolean T(Object obj) {
        if (obj instanceof jch) {
            return true;
        }
        if ((obj instanceof akkh) && jch.class.isAssignableFrom(((akkh) obj).C())) {
            return true;
        }
        return false;
    }

    public static void U(aiuc aiucVar, jar jarVar) {
        aktp.H(aiucVar, lzd.class, new ixl(jarVar, 8));
        aktp.H(aiucVar, jal.class, new ixl(jarVar, 9));
    }

    public static void V(aiub aiubVar, izz izzVar) {
        aktp.G(aiubVar, izy.class, new ixl(izzVar, 7));
    }

    public static void W(aiuc aiucVar, izh izhVar) {
        aktp.H(aiucVar, ConversationSettingsOptionItemView.a.class, new izi(izhVar));
    }

    public static void X(aiuc aiucVar, ixd ixdVar) {
        aktp.H(aiucVar, ixd.e.class, new ixk(ixdVar, 3));
        aktp.H(aiucVar, zwn.class, new ixk(ixdVar, 13));
        aktp.H(aiucVar, ztr.a.class, new ixl(ixdVar, 2));
        aktp.H(aiucVar, ztc.b.class, new ixl(ixdVar, 5));
        aktp.H(aiucVar, ztc.d.class, new itc(6));
        aktp.H(aiucVar, ztc.c.class, new itc(7));
        aktp.H(aiucVar, ztc.a.class, new itc(8));
        aktp.H(aiucVar, zxh.a.class, new ixl(ixdVar, 6));
        aktp.H(aiucVar, jaj.class, new itc(9));
        aktp.H(aiucVar, jan.class, new itc(2));
        aktp.H(aiucVar, lud.class, new itc(3));
        aktp.H(aiucVar, jce.class, new ilx(ixdVar, 16));
        aktp.H(aiucVar, jbw.class, new ilx(ixdVar, 17));
        aktp.H(aiucVar, jby.class, new ilx(ixdVar, 18));
        aktp.H(aiucVar, jcc.class, new ilx(ixdVar, 19));
        aktp.H(aiucVar, itd.class, new ilx(ixdVar, 20));
        aktp.H(aiucVar, jal.class, new ixk(ixdVar, 1));
        aktp.H(aiucVar, abdf.class, new ixk(ixdVar, 0));
        aktp.H(aiucVar, aaet.class, new ixk(ixdVar, 2));
        aktp.H(aiucVar, itj.class, new ixk(ixdVar, 4));
        aktp.H(aiucVar, lzl.class, new ixk(ixdVar, 5));
        aktp.H(aiucVar, yyd.class, new ixk(ixdVar, 6));
        aktp.H(aiucVar, lzd.class, new ixk(ixdVar, 7));
        aktp.H(aiucVar, lyu.class, new ixk(ixdVar, 8));
        aktp.H(aiucVar, lyx.class, new ixk(ixdVar, 9));
        aktp.H(aiucVar, lyt.class, new itc(4));
        aktp.H(aiucVar, abaq.class, new ixk(ixdVar, 10));
        aktp.H(aiucVar, zvr.class, new ixk(ixdVar, 11));
        aktp.H(aiucVar, jbl.class, new ixk(ixdVar, 12));
        aktp.H(aiucVar, lyf.class, new ixk(ixdVar, 14));
        aktp.H(aiucVar, lyl.class, new ixk(ixdVar, 15));
        aktp.H(aiucVar, lyk.class, new ixk(ixdVar, 16));
        aktp.H(aiucVar, lyp.class, new ixk(ixdVar, 17));
        aktp.H(aiucVar, lyo.class, new ixk(ixdVar, 18));
        aktp.H(aiucVar, lyq.class, new ixk(ixdVar, 19));
        aktp.H(aiucVar, zoi.class, new ixk(ixdVar, 20));
        aktp.H(aiucVar, aagq.class, new ixl(ixdVar, 1));
        aktp.H(aiucVar, wpo.class, new itc(5));
        aktp.H(aiucVar, ubb.class, new ixl(ixdVar, 0));
        aktp.H(aiucVar, ubd.class, new ixl(ixdVar, 3));
        aktp.H(aiucVar, icb.class, new ixl(ixdVar, 4));
    }

    public static final void Y(ahlp ahlpVar, int i, Boolean bool) {
        aozy createBuilder = amox.a.createBuilder();
        createBuilder.getClass();
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amox amoxVar = (amox) createBuilder.b;
            amoxVar.b |= 1;
            amoxVar.e = booleanValue;
        }
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        aozy createBuilder2 = amou.a.createBuilder();
                        createBuilder2.getClass();
                        apag s = createBuilder2.s();
                        s.getClass();
                        amou amouVar = (amou) s;
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        amox amoxVar2 = (amox) createBuilder.b;
                        amoxVar2.d = amouVar;
                        amoxVar2.c = 101;
                    } else {
                        aozy createBuilder3 = amow.a.createBuilder();
                        createBuilder3.getClass();
                        apag s2 = createBuilder3.s();
                        s2.getClass();
                        amow amowVar = (amow) s2;
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        amox amoxVar3 = (amox) createBuilder.b;
                        amoxVar3.d = amowVar;
                        amoxVar3.c = 104;
                    }
                } else {
                    aozy createBuilder4 = amot.a.createBuilder();
                    createBuilder4.getClass();
                    apag s3 = createBuilder4.s();
                    s3.getClass();
                    amot amotVar = (amot) s3;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amox amoxVar4 = (amox) createBuilder.b;
                    amoxVar4.d = amotVar;
                    amoxVar4.c = 102;
                }
            } else {
                aozy createBuilder5 = amov.a.createBuilder();
                createBuilder5.getClass();
                apag s4 = createBuilder5.s();
                s4.getClass();
                amov amovVar = (amov) s4;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amox amoxVar5 = (amox) createBuilder.b;
                amoxVar5.d = amovVar;
                amoxVar5.c = 103;
            }
        }
        ahlpVar.C(akec.O(createBuilder));
    }

    private static final idz Z(byn bynVar) {
        return (idz) bynVar.a();
    }

    public static hkg a(Context context) {
        hkg hkgVar = new hkg(new atog(new hkw(context.getApplicationContext())), new ico(new hlc()));
        hjt hjtVar = hkgVar.e;
        if (hjtVar != null) {
            hjtVar.a();
        }
        hjy[] hjyVarArr = hkgVar.d;
        for (int i = 0; i < 4; i++) {
            hjy hjyVar = hjyVarArr[i];
            if (hjyVar != null) {
                hjyVar.a = true;
                hjyVar.interrupt();
            }
        }
        hkgVar.e = new hjt(hkgVar.b, hkgVar.c, hkgVar.h, hkgVar.g);
        hkgVar.e.start();
        for (int i2 = 0; i2 < 4; i2++) {
            hjy hjyVar2 = new hjy(hkgVar.c, hkgVar.i, hkgVar.h, hkgVar.g);
            hkgVar.d[i2] = hjyVar2;
            hjyVar2.start();
        }
        return hkgVar;
    }

    private static final afsw aa(afcq afcqVar) {
        if (afcqVar instanceof afcv) {
            return ((afcv) afcqVar).d().b;
        }
        if (afcqVar instanceof afso) {
            return ((afso) afcqVar).m();
        }
        if (afcqVar instanceof RichLocation) {
            return ((RichLocation) afcqVar).d.b;
        }
        throw new UnsupportedOperationException("Cannot get type for ".concat(String.valueOf(afcqVar.fj())));
    }

    public static long b(String str) {
        try {
            return d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if (!"0".equals(str) && !"-1".equals(str)) {
                hkn.c(e, "Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            hkn.d("Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public static hjs c(hka hkaVar) {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        ?? r1 = hkaVar.d;
        long currentTimeMillis = System.currentTimeMillis();
        if (r1 != 0) {
            String str = (String) r1.get("Date");
            if (str != null) {
                j = b(str);
            } else {
                j = 0;
            }
            String str2 = (String) r1.get("Cache-Control");
            int i = 0;
            if (str2 != null) {
                String[] split = str2.split(",", 0);
                z = false;
                j2 = 0;
                j3 = 0;
                while (i < split.length) {
                    String trim = split[i].trim();
                    if (!trim.equals("no-cache") && !trim.equals("no-store")) {
                        if (trim.startsWith("max-age=")) {
                            try {
                                j3 = Long.parseLong(trim.substring(8));
                            } catch (Exception unused) {
                            }
                        } else if (trim.startsWith("stale-while-revalidate=")) {
                            j2 = Long.parseLong(trim.substring(23));
                        } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                            z = true;
                        }
                        i++;
                    } else {
                        return null;
                    }
                }
                i = 1;
            } else {
                z = false;
                j2 = 0;
                j3 = 0;
            }
            String str3 = (String) r1.get("Expires");
            if (str3 != null) {
                j4 = b(str3);
            } else {
                j4 = 0;
            }
            String str4 = (String) r1.get("Last-Modified");
            if (str4 != null) {
                j5 = b(str4);
            } else {
                j5 = 0;
            }
            String str5 = (String) r1.get("ETag");
            if (i != 0) {
                j7 = currentTimeMillis + (j3 * 1000);
                if (z) {
                    j8 = j7;
                } else {
                    Long.signum(j2);
                    j8 = (j2 * 1000) + j7;
                }
                j6 = j8;
            } else {
                j6 = 0;
                if (j > 0 && j4 >= j) {
                    j7 = currentTimeMillis + (j4 - j);
                    j6 = j7;
                } else {
                    j7 = 0;
                }
            }
            hjs hjsVar = new hjs();
            hjsVar.a = (byte[]) hkaVar.c;
            hjsVar.b = str5;
            hjsVar.f = j7;
            hjsVar.e = j6;
            hjsVar.c = j;
            hjsVar.d = j5;
            hjsVar.g = r1;
            hjsVar.h = hkaVar.e;
            return hjsVar;
        }
        return null;
    }

    public static SimpleDateFormat d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    public static List e(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new hjx((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public static /* synthetic */ String f(int i) {
        switch (i) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return VCardConstants.PROPERTY_SOURCE;
            case 5:
                return "ENCODE";
            case 6:
                return "FINISHED";
            default:
                return "null";
        }
    }

    public static boolean g(Uri uri) {
        if (uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }

    public static boolean h(int i, int i2) {
        if (i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384) {
            return true;
        }
        return false;
    }

    public static boolean i(Uri uri) {
        return uri.getPathSegments().contains("video");
    }

    public static int j(List list, hnc hncVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a = hncVar.a((ImageHeaderParser) list.get(i));
            if (a != -1) {
                return a;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType k(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return l(list, new hmz(byteBuffer, 0));
    }

    public static ImageHeaderParser.ImageType l(List list, hnd hndVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType a = hndVar.a((ImageHeaderParser) list.get(i));
            if (a != ImageHeaderParser.ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static int m(List list, InputStream inputStream, hqh hqhVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new huj(inputStream, hqhVar);
        }
        inputStream.mark(5242880);
        return j(list, new hnb(inputStream, hqhVar, 0));
    }

    public static ImageHeaderParser.ImageType n(List list, InputStream inputStream, hqh hqhVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new huj(inputStream, hqhVar);
        }
        inputStream.mark(5242880);
        return l(list, new hmz(inputStream, 1));
    }

    public static /* synthetic */ String o(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return "null";
                        }
                        return "MEMORY_CACHE";
                    }
                    return "RESOURCE_DISK_CACHE";
                }
                return "DATA_DISK_CACHE";
            }
            return "REMOTE";
        }
        return "LOCAL";
    }

    public static final void p(ifx ifxVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(1308759374);
        if (i5 == 0) {
            if (true != c.G(ifxVar)) {
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
            i3 = 1;
        } else {
            c.y(695381870);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = new bhv();
                bwkVar.ad(T);
            }
            bhv bhvVar = (bhv) T;
            bwkVar.Y();
            bzc bzcVar = bgz.a;
            bgm bgmVar = bgm.a;
            bgg bggVar = bgg.a;
            Object[] objArr = new Object[0];
            cej cejVar = new cej(bgj.a, new bgk(bggVar));
            boolean G = c.G(bggVar);
            Object T2 = bwkVar.T();
            if (G || T2 == bwj.a.a) {
                T2 = new bgh(bgmVar, bggVar);
                bwkVar.ad(T2);
            }
            Object T3 = bwkVar.T();
            if (T3 == bwj.a.a) {
                T3 = new bhj(bhvVar);
                bwkVar.ad(T3);
            }
            i3 = 1;
            bgz.a(null, (bhj) T3, null, null, null, null, 0, false, null, brg.a, 0L, 0L, 0L, 0L, 0L, cdk.e(-444034992, new ifo(ifxVar, bhvVar, 0), c), c, 0, 12582912);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jgb(ifxVar, i, i3);
        }
    }

    public static final void q(ifw ifwVar, bhv bhvVar, bwj bwjVar, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(618433333);
        boolean z2 = true;
        if (i5 == 0) {
            if (true != c.G(ifwVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(bhvVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            aov a = aoz.a(c);
            c.y(-1650679304);
            if ((i2 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            if ((i2 & 112) != 32) {
                z2 = false;
            }
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if ((z | z2) || T == bwj.a.a) {
                T = new geg(ifwVar, bhvVar, 4);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            anp.a(null, a, null, false, null, null, null, false, (arqr) T, c, 0, 253);
            if (ifwVar.b) {
                c.y(-1650670091);
                boolean G = c.G(a) | z;
                Object T2 = bwkVar.T();
                if (G || T2 == bwj.a.a) {
                    T2 = new gbv(a, ifwVar, (arpe) null, 11);
                    bwkVar.ad(T2);
                }
                bwkVar.Y();
                bxl.g(a, (arqv) T2, c);
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new iea(ifwVar, bhvVar, i, 5);
        }
    }

    public static final void r(ift iftVar, bhv bhvVar, bwj bwjVar, int i) {
        int i2;
        boolean z;
        cga c;
        int i3;
        int i4;
        iftVar.getClass();
        int i5 = i & 14;
        bwj c2 = bwjVar.c(-691222728);
        boolean z2 = true;
        if (i5 == 0) {
            if (true != c2.G(iftVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.G(bhvVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c2.L()) {
            c2.v();
        } else {
            String str = iftVar.a;
            str.getClass();
            String b = dga.b(R.string.unblocked_toast_message, new Object[]{str}, c2);
            c2.y(-1067744208);
            if ((i2 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            if ((i2 & 112) != 32) {
                z2 = false;
            }
            boolean G = c2.G(b) | z2 | z;
            bwk bwkVar = (bwk) c2;
            Object T = bwkVar.T();
            if (G || T == bwj.a.a) {
                T = new bp(iftVar, bhvVar, b, 6);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            float a = dfw.a(R.dimen.blocked_participant_list_item_view_padding, c2);
            float a2 = dfw.a(R.dimen.contact_list_row_icon_size, c2);
            c = amv.c(amh.d(cga.e, a), 1.0f);
            cga c3 = adw.c(c, false, null, (arqg) T, 7);
            ajw.c cVar = ajw.f;
            int i6 = cfq.a;
            cue a3 = amq.a(cVar, cfq.a.k, c2, 54);
            int a4 = bwg.a(c2);
            byx P = bwkVar.P();
            cga b2 = cfv.b(c2, c3);
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
            c2.y(-1871819792);
            Uri uri = iftVar.b;
            if (uri != null) {
                lgc.u(uri.toString(), amv.j(cga.e, a2, a2), c2, 0);
            }
            bwkVar.Y();
            bid.b(iftVar.c, amh.d(cga.e, a), bmp.a(c2).o, 0L, 0L, 0L, 2, false, 1, 0, null, c2, 0, 3120, 120824);
            bid.b(dga.a(R.string.tap_to_unblock_message, c2), amh.d(cga.e, a), bmp.a(c2).a, 0L, 0L, 0L, 0, false, 0, 0, null, c2, 0, 0, 131064);
            c2.p();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new iea(iftVar, bhvVar, i, 4);
        }
    }

    public static final boolean s(kzd kzdVar) {
        if (ier.a() && kzdVar.T == qhy.CONVERSATION_CLASSIFICATION_TYPE_BIRTHDAY) {
            return true;
        }
        return false;
    }

    public static final long t(xnv xnvVar) {
        return u(xnvVar).toEpochMilli();
    }

    public static final Instant u(xnv xnvVar) {
        Instant instant = xnvVar.f().atZone(ZoneId.systemDefault()).truncatedTo(ChronoUnit.DAYS).toInstant();
        instant.getClass();
        return instant;
    }

    public static final MonthDay v(xnv xnvVar) {
        Instant f = xnvVar.f();
        f.getClass();
        return w(f);
    }

    public static final MonthDay w(Instant instant) {
        MonthDay from = MonthDay.from(instant.atZone(ZoneId.systemDefault()));
        from.getClass();
        return from;
    }

    public static final void x(ieq ieqVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        bwj bwjVar2;
        int i3;
        int i4 = i & 112;
        bwj c = bwjVar.c(168190276);
        if (i4 == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) == 16 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            bwjVar2 = c;
            ahji.e("Not implemented", cgaVar, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, bwjVar2, (i2 & 112) | 6, 0, 131068);
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new iea(ieqVar, cgaVar, i, 3);
        }
    }

    public static final void y(ieo ieoVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(412152758);
        if (i5 == 0) {
            if (true != c.G(ieoVar)) {
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
            aeke.ar(ieoVar.a, cgaVar, c, i2 & 112);
            aelr aelrVar = ieoVar.a;
            c.y(-1612631833);
            int i6 = i2 & 14;
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (i6 == 4 || T == bwj.a.a) {
                T = new gau(ieoVar, (arpe) null, 11);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            bxl.g(aelrVar.c, (arqv) T, c);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new iea(ieoVar, cgaVar, i, 2);
        }
    }

    public static final void z(idz idzVar, aap aapVar, aap aapVar2, cga cgaVar, bwj bwjVar, int i) {
        boolean z;
        bwj c = bwjVar.c(-1698094240);
        c.y(1840106499);
        c.y(1607293032);
        bwk bwkVar = (bwk) c;
        Object T = bwkVar.T();
        if (T == bwj.a.a) {
            byu byuVar = new byu(idzVar, cav.a);
            bwkVar.ad(byuVar);
            T = byuVar;
        }
        byn bynVar = (byn) T;
        bwkVar.Y();
        if (idzVar != null && !d.F(idzVar, Z(bynVar))) {
            bynVar.h(idzVar);
        }
        idz Z = Z(bynVar);
        if (idzVar != null) {
            z = true;
        } else {
            z = false;
        }
        armo armoVar = new armo(Z, Boolean.valueOf(z));
        bwkVar.Y();
        idz idzVar2 = (idz) armoVar.a;
        boolean booleanValue = ((Boolean) armoVar.b).booleanValue();
        c.y(-1247164612);
        Object T2 = bwkVar.T();
        if (T2 == bwj.a.a) {
            T2 = gvj.e;
            bwkVar.ad(T2);
        }
        bwkVar.Y();
        xl b = wx.b(aapVar, (arqr) T2);
        c.y(-1247162053);
        Object T3 = bwkVar.T();
        if (T3 == bwj.a.a) {
            T3 = gvj.f;
            bwkVar.ad(T3);
        }
        bwkVar.Y();
        wf.a(booleanValue, null, b, wx.c(aapVar2, new xi((arqr) T3)), null, cdk.e(-351007864, new ifo(idzVar2, cgaVar, 1), c), c, 196608, 18);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new lhq(idzVar, aapVar, aapVar2, cgaVar, i, 1);
        }
    }

    public hlc(Context context) {
        context.getClass();
    }
}
