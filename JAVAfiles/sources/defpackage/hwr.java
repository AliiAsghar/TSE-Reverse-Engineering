package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation2.bottomcontent.composerow.draft.attachment.RichLocation;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.startchat.chip.ChipData;
import com.google.android.apps.messaging.ui.appsettings.VmtSettingsActivity;
import defpackage.ajw;
import defpackage.apb;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hwr {
    public hwr() {
    }

    public static String A(msh mshVar) {
        return mshVar.F().toString();
    }

    public static aeyr B(aeyr aeyrVar) {
        return new aeyr(aqjn.av(aeyrVar.a, aeyrVar.a.size() / 2));
    }

    public static aeyr C(aeyr aeyrVar) {
        int size = aeyrVar.a.size() / 2;
        List list = aeyrVar.a;
        return new aeyr(list.subList(size, list.size()));
    }

    public static void D(jzh jzhVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(831231238);
        if (i4 == 0) {
            if (true != c.G(jzhVar)) {
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
            int i5 = i2 & 14;
            if (jzhVar.e.a) {
                c.y(1353638954);
                F(jzhVar, c, i5);
                ((bwk) c).Y();
            } else {
                c.y(1353692522);
                E(jzhVar, c, i5);
                ((bwk) c).Y();
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jgb(jzhVar, i, 5);
        }
    }

    public static void E(jzh jzhVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1832524255);
        if (i4 == 0) {
            if (true != c.G(jzhVar)) {
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
            ajw.d dVar = new ajw.d(4.0f, true, ajx.a);
            cga b = wj.b(amv.p(cga.e));
            int i5 = cfq.a;
            cue a = akk.a(dVar, cfq.a.m, c, 6);
            int a2 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b2 = cfv.b(c, b);
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
            caw.b(c, b2, cwl.a.c);
            G(jzhVar, c, i2 & 14);
            aeyr aeyrVar = (aeyr) cak.a(jzhVar.b, c).a();
            c.y(-1176492673);
            if (aeyrVar != null) {
                bzc bzcVar = aeyq.a;
                c.y(-1176488445);
                cku ckuVar = new cku(adom.bX(c).d.a);
                boolean cd = adom.cd(c);
                Boolean.valueOf(cd).getClass();
                if (true != cd) {
                    ckuVar = null;
                }
                bwkVar.Y();
                bwx.a(bzcVar.c(ckuVar), cdk.e(-670751032, new ifn(jzhVar, aeyrVar, 4, null), c), c, 56);
            }
            bwkVar.Y();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jgb(jzhVar, i, 6);
        }
    }

    public static void F(jzh jzhVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(1988417058);
        if (i4 == 0) {
            if (true != c.G(jzhVar)) {
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
            cue a = akk.a(eVar, cfq.a.m, c, 0);
            int a2 = bwg.a(c);
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
            caw.b(c, a, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b, cwl.a.c);
            ajw.d dVar = new ajw.d(4.0f, true, ajx.a);
            cga b2 = wj.b(amv.p(cga.e));
            cue a3 = akk.a(dVar, cfq.a.m, c, 6);
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
            G(jzhVar, c, i2 & 14);
            aeyr aeyrVar = (aeyr) cak.a(jzhVar.b, c).a();
            c.y(-2028850821);
            if (aeyrVar != null) {
                bzc bzcVar = aeyq.a;
                c.y(-2028846425);
                cku ckuVar = new cku(adom.bX(c).d.a);
                boolean cd = adom.cd(c);
                Boolean.valueOf(cd).getClass();
                if (true != cd) {
                    ckuVar = null;
                }
                bwkVar.Y();
                bwx.a(bzcVar.c(ckuVar), cdk.e(1683274431, new ifn(jzhVar, aeyrVar, 5, null), c), c, 56);
            }
            bwkVar.Y();
            c.p();
            lsa lsaVar = (lsa) cak.a(jzhVar.c, c).a();
            c.y(331104506);
            if (lsaVar != null) {
                lgb.i(lsaVar, c, 0);
            }
            bwkVar.Y();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jgb(jzhVar, i, 7);
        }
    }

    public static void G(jzh jzhVar, bwj bwjVar, int i) {
        int i2;
        float f;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1343627670);
        if (i4 == 0) {
            if (true != c.G(jzhVar)) {
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
            afbg afbgVar = (afbg) cak.a(jzhVar.a, c).a();
            if (afbgVar != null) {
                cga f2 = amv.f(cga.e, 26.0f);
                if (true != afbgVar.d.a) {
                    f = brg.a;
                } else {
                    f = 4.0f;
                }
                cga j = amh.j(f2, 12.0f, brg.a, brg.a, f, 6);
                int i5 = cfq.a;
                cue a = akc.a(cfq.a.a, false);
                int a2 = bwg.a(c);
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
                caw.b(c, a, cwl.a.e);
                caw.b(c, P, cwl.a.d);
                arqv arqvVar = cwl.a.f;
                if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                    Integer valueOf = Integer.valueOf(a2);
                    bwkVar.ad(valueOf);
                    c.j(valueOf, arqvVar);
                }
                caw.b(c, b, cwl.a.c);
                adom.br(afbgVar, null, 0L, c, 0, 6);
                c.p();
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jgb(jzhVar, i, 8);
        }
    }

    public static void H(jym jymVar, aov aovVar, jzj jzjVar, bwj bwjVar, int i) {
        int i2;
        boolean z;
        String str;
        Boolean bool;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(1231026869);
        boolean z2 = true;
        if (i6 == 0) {
            if (true != c.G(jymVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aovVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c.G(jzjVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            eng engVar = (eng) dyy.m(((enm) c.g(epa.a)).N(), c).a();
            boolean z3 = !aovVar.g();
            Boolean valueOf = Boolean.valueOf(z3);
            String b = jzjVar.b();
            c.y(221018270);
            boolean H = c.H(z3) | c.G(engVar);
            if ((i2 & 896) == 256) {
                z = true;
            } else {
                z = false;
            }
            if ((i2 & 14) != 4) {
                z2 = false;
            }
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (!(z2 | H | z) && T != bwj.a.a) {
                str = b;
                bool = valueOf;
            } else {
                str = b;
                bool = valueOf;
                T = new jyo(z3, engVar, jzjVar, jymVar, (arpe) null, 0);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            bxl.e(bool, engVar, str, (arqv) T, c);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jkb((Object) jymVar, (Object) aovVar, (Object) jzjVar, i, 4, (char[]) null);
        }
    }

    public static void I(aov aovVar, jym jymVar, jxu jxuVar, float f, bwj bwjVar, int i) {
        int i2;
        boolean z;
        cas casVar;
        float f2;
        ajw.e eVar;
        bwj bwjVar2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i & 14;
        bwj c = bwjVar.c(1551411922);
        boolean z2 = true;
        if (i7 == 0) {
            if (true != c.G(aovVar)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(jymVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (true != c.G(jxuVar)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (true != c.D(f)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i2 |= i3;
        }
        int i8 = i2;
        if ((i8 & 5851) == 1170 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            gqg gqgVar = jxuVar.a;
            jyl jylVar = jymVar.q;
            aovVar.getClass();
            c.y(304806680);
            c.y(455115196);
            int i9 = (i8 & 14) | 64;
            if ((((i9 & 14) ^ 6) > 4 && c.G(aovVar)) || (i9 & 6) == 4) {
                z = true;
            } else {
                z = false;
            }
            boolean G = z | c.G(gqgVar);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (G || T == bwj.a.a) {
                T = new jxt(aovVar, gqgVar, jylVar.b);
                bwkVar.ad(T);
            }
            jxt jxtVar = (jxt) T;
            bwkVar.Y();
            bwkVar.Y();
            cas a = cak.a(jymVar.f, c);
            c.y(1909409167);
            if (jymVar.q.a) {
                c.y(305153402);
                casVar = cak.a(jymVar.e, c);
                bwkVar.Y();
            } else {
                c.y(305205358);
                c.y(2088055498);
                Object T2 = bwkVar.T();
                if (T2 == bwj.a.a) {
                    byu byuVar = new byu(null, cav.a);
                    bwkVar.ad(byuVar);
                    T2 = byuVar;
                }
                casVar = (byn) T2;
                bwkVar.Y();
                bwkVar.Y();
            }
            cas casVar2 = casVar;
            bwkVar.Y();
            casVar2.getClass();
            c.y(-1870953452);
            if (!jymVar.q.a || casVar2.a() == null) {
                z2 = false;
            }
            bwkVar.Y();
            Object T3 = bwkVar.T();
            if (T3 == bwj.a.a) {
                T3 = bxl.a(arpj.a, c);
                bwkVar.ad(T3);
            }
            c.y(2013513570);
            Object T4 = bwkVar.T();
            if (T4 == bwj.a.a) {
                T4 = new byr(brg.a);
                bwkVar.ad(T4);
            }
            byj byjVar = (byj) T4;
            bwkVar.Y();
            c.y(2013515277);
            Object T5 = bwkVar.T();
            if (T5 == bwj.a.a) {
                T5 = zk.a(byjVar.b());
                bwkVar.ad(T5);
            }
            zj zjVar = (zj) T5;
            bwkVar.Y();
            c.y(2013542890);
            if (z2) {
                f2 = f - ang.a(anl.g(c), c).d();
            } else {
                f2 = f;
            }
            bwkVar.Y();
            cga a2 = dea.a(amv.o(cga.e), "message_list");
            c.y(2013574030);
            if (z2) {
                c.y(1940031661);
                eVar = new jyx();
                bwkVar.Y();
            } else {
                eVar = ajw.d;
            }
            bwkVar.Y();
            anp.a(a2, aovVar, null, true, eVar, null, null, false, new jys(jxuVar, z2, jymVar, a, jxtVar, aovVar, zjVar, casVar2, f2), c, ((i8 << 3) & 112) | 3072, 228);
            bwjVar2 = c;
            bxl.g(jxtVar, new jyw(jymVar, jxtVar, aovVar, (arpe) null, 1), bwjVar2);
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new aemr(aovVar, jymVar, jxuVar, f, i, 1);
        }
    }

    public static void J(jzj jzjVar, jym jymVar, bwj bwjVar, int i) {
        int i2;
        aeva aevaVar;
        boolean z;
        List b;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-569209560);
        boolean z2 = true;
        if (i5 == 0) {
            if (true != c.G(jzjVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(jymVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            if (jzjVar instanceof jzx) {
                aevaVar = ((jzx) jzjVar).a.j;
            } else {
                aevaVar = null;
            }
            if (aevaVar != null && (b = aevaVar.b()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : b) {
                    if (obj instanceof aeum) {
                        arrayList.add(obj);
                    }
                }
                if (((aeum) aqjn.Z(arrayList)) != null) {
                    throw null;
                }
            }
            c.y(368449272);
            bwk bwkVar = (bwk) c;
            bwkVar.Y();
            String b2 = jzjVar.b();
            c.y(368451943);
            if ((i2 & 112) == 32) {
                z = true;
            } else {
                z = false;
            }
            if ((i2 & 14) != 4) {
                z2 = false;
            }
            Object T = bwkVar.T();
            if ((z | z2) || T == bwj.a.a) {
                T = new jli(jymVar, jzjVar, (arpe) null, 18);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            bxl.e(b2, aevaVar, null, (arqv) T, c);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new iea(jzjVar, jymVar, i, 9);
        }
    }

    public static void K(jym jymVar, aov aovVar) {
        int i;
        int b = aovVar.b();
        anw anwVar = (anw) aqjn.Z(aovVar.d().i());
        if (anwVar != null) {
            i = anwVar.c();
        } else {
            i = 0;
        }
        jymVar.t.d(b * i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0106, code lost:
    
        if (r9 == r11) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02e1  */
    /* JADX WARN: Type inference failed for: r9v13, types: [asai, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void L(defpackage.jym r26, float r27, defpackage.cga r28, defpackage.bwj r29, int r30) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hwr.L(jym, float, cga, bwj, int):void");
    }

    public static Object M(qkg qkgVar, bwj bwjVar) {
        Object obj;
        bwjVar.y(433349789);
        boolean z = qkgVar instanceof qjp;
        arpj arpjVar = arpj.a;
        if (z) {
            try {
                obj = ((qjp) qkgVar).c();
            } catch (NullPointerException e) {
                ((alvg) ((alvg) jxy.a.i()).g(e).h("com/google/android/apps/messaging/conversation2/messagelist/PagedMessageListScrollHelperKt", "collectMessage", 85, "PagedMessageListScrollHelper.kt")).q("Failed to get state flow value to display");
                obj = null;
            }
        } else {
            obj = cao.b(qkgVar, qkgVar.b(), arpjVar, bwjVar, 0).a();
        }
        bwjVar.q();
        return obj;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [asai, java.lang.Object] */
    public static float N(kjp kjpVar, bwj bwjVar) {
        bwjVar.y(-1520118675);
        float eh = ((dqv) bwjVar.g(dch.d)).eh(((Number) cao.b(kjpVar.a, 0, null, bwjVar, 2).a()).intValue());
        bwjVar.y(-616029730);
        if (dqy.b(eh, brg.a)) {
            bwjVar.y(1280460081);
            dqv dqvVar = (dqv) bwjVar.g(dch.d);
            eh = ((dqy) arrn.y(new dqy(dqvVar.eh(new amc(anl.e(bwjVar), 32).a(dqvVar)) + 64.0f), new dqy(brg.a))).a;
            bwjVar.q();
        }
        bwjVar.q();
        bwjVar.q();
        return eh;
    }

    public static void O(jxq jxqVar, cga cgaVar, cit citVar, bwj bwjVar, int i) {
        int i2;
        cit citVar2;
        cit citVar3;
        int i3;
        int i4;
        bwj c = bwjVar.c(745607218);
        if ((i & 14) == 0) {
            if (true != c.G(jxqVar)) {
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
        if ((i & 896) == 0) {
            i2 |= 128;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
            citVar3 = citVar;
        } else {
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
                citVar2 = citVar;
            } else {
                citVar2 = cit.a;
            }
            c.n();
            afad.a(eif.f, null, null, null, null, null, null, null, null, false, null, false, cdk.e(-1473691272, new keh((Object) jxqVar, (Object) cgaVar, (Object) citVar2, 1, (byte[]) null), c), c, 805306368, 384, 3582);
            citVar3 = citVar2;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jkb(jxqVar, cgaVar, citVar3, i, 3);
        }
    }

    public static void P(jym jymVar, boolean z, gqg gqgVar, bwj bwjVar, int i) {
        int i2;
        MessageId messageId;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(2049303654);
        if (i6 == 0) {
            if (true != c.G(jymVar)) {
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
            if (true != c.G(gqgVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            eng engVar = (eng) dyy.m(((enm) c.g(epa.a)).N(), c).a();
            Boolean valueOf = Boolean.valueOf(z);
            jzk jzkVar = (jzk) gqgVar.h(0);
            if (jzkVar != null) {
                messageId = jzkVar.a();
            } else {
                messageId = null;
            }
            bxl.e(valueOf, engVar, messageId, new jyo(z, engVar, gqgVar, jymVar, (arpe) null, 1), c);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jyn(jymVar, z, gqgVar, i, 0);
        }
    }

    public static jxb Q(cas casVar) {
        return (jxb) casVar.a();
    }

    public static jxb R(byn bynVar) {
        return (jxb) bynVar.a();
    }

    public static void S(jxd jxdVar, jxb jxbVar, jxb jxbVar2, bwj bwjVar, int i) {
        boolean z;
        bwj c = bwjVar.c(-523252814);
        cga p = amv.p(cga.e);
        awg awgVar = jxe.a;
        cga e = amh.e(adf.b(p, jxe.a(c)), 20.0f, 20.0f);
        ajw.c cVar = ajw.f;
        int i2 = cfq.a;
        cue a = amq.a(cVar, cfq.a.j, c, 6);
        int a2 = bwg.a(c);
        bwk bwkVar = (bwk) c;
        byx P = bwkVar.P();
        cga b = cfv.b(c, e);
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
        c.y(1397901974);
        if ((((i & 14) ^ 6) > 4 && c.G(jxdVar)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        Object T = bwkVar.T();
        if (z || T == bwj.a.a) {
            T = new juf(jxdVar, 11);
            bwkVar.ad(T);
        }
        bwkVar.Y();
        ahji.an((arqg) T, null, true, null, null, null, null, jxa.b, c, 805306752, 506);
        ahji.ak(new jkq(jxdVar, jxbVar, 6, null), null, !d.F(jxbVar, jxbVar2), null, null, null, null, null, null, jxa.c, c, 805306368, 506);
        c.p();
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new jkb((Object) jxdVar, (Object) jxbVar, (Object) jxbVar2, i, 2, (byte[]) null);
        }
    }

    public static void T(ake akeVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-303734284);
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
            String a = dga.a(R.string.default_theme, c);
            cga.a aVar = cga.e;
            int i5 = cfq.a;
            cga j = amh.j(akeVar.a(aVar, cfq.a.h), brg.a, brg.a, brg.a, 10.0f, 7);
            awg awgVar = jxe.a;
            ahji.e(a, amh.i(j, jxe.b, brg.a, 2), bmp.a(c).q, drn.c(12), 0L, null, 0L, 0, false, 0, 0, null, dje.y((dje) c.g(brx.a), 0L, 0L, null, null, null, null, 0L, 0, 0, 0L, null, null, 2, 12582911), c, 3072, 0, 65520);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jgb(akeVar, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void U(defpackage.bwj r13, int r14) {
        /*
            r0 = 2140918273(0x7f9bd201, float:NaN)
            bwj r13 = r13.c(r0)
            if (r14 != 0) goto L16
            boolean r14 = r13.L()
            r0 = 0
            if (r14 != 0) goto L12
            r14 = r0
            goto L16
        L12:
            r13.v()
            goto L3e
        L16:
            awg r0 = defpackage.jxe.a
            long r3 = defpackage.jxe.b(r13)
            bpk r0 = defpackage.bmp.c(r13)
            awa r2 = r0.e
            cga$a r0 = defpackage.cga.e
            r1 = 1101004800(0x41a00000, float:20.0)
            r5 = 1098907648(0x41800000, float:16.0)
            cga r0 = defpackage.amh.e(r0, r1, r5)
            cga r1 = defpackage.amv.p(r0)
            arqv r10 = defpackage.jxa.a
            r12 = 120(0x78, float:1.68E-43)
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = r13
            defpackage.bqv.c(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            r0 = r14
        L3e:
            bzz r13 = r13.e()
            if (r13 == 0) goto L4e
            lhs r14 = new lhs
            r1 = 1
            r14.<init>(r0, r1)
            bzf r13 = (defpackage.bzf) r13
            r13.d = r14
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hwr.U(bwj, int):void");
    }

    public static void V(ake akeVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(1316561616);
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
            long j = bmp.a(c).v;
            awg awgVar = awh.a;
            awg awgVar2 = jxe.a;
            adr a = ads.a(2.0f, jxe.a(c));
            cga h = amv.h(cga.e, 40.0f);
            int i5 = cfq.a;
            cga a2 = akeVar.a(h, cfq.a.h);
            c.y(1498490541);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = jwz.c;
                bwkVar.ad(T);
            }
            bwkVar.Y();
            bqv.c(cts.a(a2, (arqw) T), awgVar, j, 0L, brg.a, brg.a, a, jxa.d, c, 56);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jgb(akeVar, i, 3);
        }
    }

    public static void W(jxf jxfVar, bwj bwjVar, int i) {
        int i2;
        ahhm ahhmVar;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(2067937244);
        if (i4 == 0) {
            if (true != c.G(jxfVar)) {
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
            cas a = cak.a(jxfVar.a, c);
            jxb Q = Q(a);
            c.y(-191443565);
            boolean G = c.G(Q);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (G || T == bwj.a.a) {
                byu byuVar = new byu(Q(a), cav.a);
                bwkVar.ad(byuVar);
                T = byuVar;
            }
            byn bynVar = (byn) T;
            bwkVar.Y();
            c.y(-191440092);
            boolean G2 = c.G(bynVar);
            Object T2 = bwkVar.T();
            if (G2 || T2 == bwj.a.a) {
                T2 = new jsv(bynVar, 11);
                bwkVar.ad(T2);
            }
            arqr arqrVar = (arqr) T2;
            bwkVar.Y();
            jxb R = R(bynVar);
            if (R != null) {
                ahhmVar = R.b;
            } else {
                ahhmVar = null;
            }
            Y(ahhmVar, cdk.e(-1616234550, new aaho(jxfVar, arqrVar, a, bynVar, 1, null), c), c, 48);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jgb(jxfVar, i, 4);
        }
    }

    public static void X(List list, jxd jxdVar, jxb jxbVar, jxb jxbVar2, arqr arqrVar, bwj bwjVar, int i) {
        bwj c = bwjVar.c(-2068574092);
        cga.a aVar = cga.e;
        awg awgVar = jxe.a;
        cga p = amv.p(adf.a(aVar, jxe.a(c), awh.b(20.0f, 20.0f, brg.a, brg.a)));
        ajw.e eVar = ajw.c;
        int i2 = cfq.a;
        cue a = akk.a(eVar, cfq.a.m, c, 0);
        int a2 = bwg.a(c);
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
        caw.b(c, a, cwl.a.e);
        caw.b(c, P, cwl.a.d);
        arqv arqvVar = cwl.a.f;
        if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
            Integer valueOf = Integer.valueOf(a2);
            bwkVar.ad(valueOf);
            c.j(valueOf, arqvVar);
        }
        caw.b(c, b, cwl.a.c);
        ako akoVar = ako.a;
        apb.b bVar = new apb.b();
        ajx ajxVar = ajx.a;
        apf.b(bVar, dea.a(akm.a(akoVar, amh.i(cga.e, 20.0f, brg.a, 2), 1.0f), "ThemeGrid"), null, null, new ajw.d(16.0f, true, ajxVar), new ajw.d(18.0f, true, ajxVar), null, false, new eiw((Object) list, (Object) jxbVar2, (Object) arqrVar, 8, (short[]) null), c, 1769472);
        S(jxdVar, jxbVar2, jxbVar, c, ((i >> 3) & 14) | 576);
        c.p();
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aahs(list, jxdVar, jxbVar, jxbVar2, arqrVar, i, 1);
        }
    }

    public static void Y(ahhm ahhmVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        gck gckVar;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-359584400);
        if (i5 == 0) {
            if (true != c.G(ahhmVar)) {
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
            if (ahhmVar == null) {
                gckVar = null;
            } else {
                gckVar = new gck(ahhmVar, 14);
            }
            yzc.t(null, gckVar, adom.cd(c), null, false, arqvVar, c, (i2 << 12) & 458752, 25);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new iea(ahhmVar, arqvVar, i, 8, null);
        }
    }

    public static void Z(aeul aeulVar, cga cgaVar, boolean z, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        int i3 = i & 14;
        bwj c = bwjVar.c(-456854885);
        if (i3 == 0) {
            i2 = (true != c.G(aeulVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= true != c.G(cgaVar) ? 16 : 32;
        }
        if ((i & 896) == 0) {
            i2 |= true != c.H(z) ? 128 : 256;
        }
        if ((i & 7168) == 0) {
            i2 |= true != c.I(arqwVar) ? 1024 : 2048;
        }
        if ((i2 & 5851) == 1170 && c.L()) {
            c.v();
        } else {
            cga p = amv.p(cgaVar);
            cue a = akk.a(ajw.c, adcx.ca(aeulVar), c, 0);
            int a2 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, p);
            int i4 = cwl.a;
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
            cga.a aVar = cga.e;
            ajw.b bVar = ajw.a;
            int i5 = cfq.a;
            cue a3 = amq.a(bVar, cfq.a.j, c, 0);
            int a4 = bwg.a(c);
            byx P2 = bwkVar.P();
            cga b2 = cfv.b(c, aVar);
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
            cga b3 = amu.a.b(cga.e, 1.0f, aeulVar.A == 2);
            cue a5 = akc.a(aeulVar.A == 2 ? cfq.a.c : cfq.a.a, false);
            int a6 = bwg.a(c);
            byx P3 = bwkVar.P();
            cga b4 = cfv.b(c, b3);
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
            cga c2 = amv.c(cga.e, 0.8f);
            cue a7 = akc.a(adcx.cb(aeulVar), false);
            int a8 = bwg.a(c);
            byx P4 = bwkVar.P();
            cga b5 = cfv.b(c, c2);
            arqg arqgVar4 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar4);
            } else {
                c.C();
            }
            caw.b(c, a7, cwl.a.e);
            caw.b(c, P4, cwl.a.d);
            arqv arqvVar4 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a8))) {
                Integer valueOf4 = Integer.valueOf(a8);
                bwkVar.ad(valueOf4);
                c.j(valueOf4, arqvVar4);
            }
            caw.b(c, b5, cwl.a.c);
            cga cgaVar2 = cga.e;
            if (z) {
                cgaVar2 = amv.f(amv.p(cgaVar2), 28.0f);
            }
            cga b6 = alw.b(cgaVar2, alx.b);
            cue a9 = akk.a(ajw.c, cfq.a.m, c, 0);
            int a10 = bwg.a(c);
            byx P5 = bwkVar.P();
            cga b7 = cfv.b(c, b6);
            arqg arqgVar5 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar5);
            } else {
                c.C();
            }
            caw.b(c, a9, cwl.a.e);
            caw.b(c, P5, cwl.a.d);
            arqv arqvVar5 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a10))) {
                Integer valueOf5 = Integer.valueOf(a10);
                bwkVar.ad(valueOf5);
                c.j(valueOf5, arqvVar5);
            }
            caw.b(c, b7, cwl.a.c);
            arqwVar.a(adcx.cd(aeulVar), c, Integer.valueOf((i2 >> 6) & 112));
            c.p();
            c.p();
            c.p();
            c.p();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jxg(aeulVar, cgaVar, z, arqwVar, i, 1);
        }
    }

    private static jop a(afcq afcqVar, jno jnoVar, boolean z) {
        Long l = null;
        long j = 0;
        if (afcqVar instanceof afsn) {
            afsm e = afsy.e((afsn) afcqVar, jnoVar.b, jnoVar.a, jnoVar.c);
            long b = e.b();
            Long valueOf = Long.valueOf(e.b());
            valueOf.longValue();
            if (true != z) {
                l = valueOf;
            }
            if (l != null) {
                j = l.longValue();
            }
            return new jop(b, j);
        }
        if (afcqVar instanceof afcv) {
            afcv afcvVar = (afcv) afcqVar;
            long b2 = afcvVar.b();
            Long valueOf2 = Long.valueOf(afcvVar.b());
            valueOf2.longValue();
            if (true != z) {
                l = valueOf2;
            }
            if (l != null) {
                j = l.longValue();
            }
            return new jop(b2, j);
        }
        if (afcqVar instanceof RichLocation) {
            return new jop(0L, 0L);
        }
        Objects.toString(afcqVar);
        throw new UnsupportedOperationException("Cannot get size metadata for ".concat(afcqVar.toString()));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void aa(defpackage.cga r22, java.lang.String r23, boolean r24, defpackage.bwj r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hwr.aa(cga, java.lang.String, boolean, bwj, int, int):void");
    }

    public static /* synthetic */ void ab(cga cgaVar, String str, boolean z, boolean z2, String str2, arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i & 14;
        bwj c = bwjVar.c(-1919960412);
        if (i9 == 0) {
            if (true != c.G(cgaVar)) {
                i8 = 2;
            } else {
                i8 = 4;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(str)) {
                i7 = 16;
            } else {
                i7 = 32;
            }
            i2 |= i7;
        }
        if ((i & 896) == 0) {
            if (true != c.H(z)) {
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
        if ((57344 & i) == 0) {
            if (true != c.G(str2)) {
                i4 = 8192;
            } else {
                i4 = 16384;
            }
            i2 |= i4;
        }
        if ((i & 458752) == 0) {
            if (true != c.I(arqgVar)) {
                i3 = 65536;
            } else {
                i3 = 131072;
            }
            i2 |= i3;
        }
        if ((374491 & i2) == 74898 && c.L()) {
            c.v();
        } else {
            cga p = amv.p(cgaVar);
            awg awgVar = jxe.a;
            cga j = amh.j(p, brg.a, brg.a, brg.a, 20.0f, 7);
            int i10 = cfq.a;
            cue a = akc.a(cfq.a.a, false);
            int a2 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, j);
            int i11 = cwl.a;
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
            caw.b(c, b, cwl.a.c);
            akf akfVar = akf.a;
            cga a3 = chk.a(adf.a(amv.l(amv.d(amv.p(cga.e), 180.0f), 112.0f), jxe.b(c), jxe.a), jxe.a);
            c.y(1766735772);
            int i12 = i2 & 458752;
            Object T = bwkVar.T();
            if (i12 == 131072 || T == bwj.a.a) {
                T = new juf(arqgVar, 12);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            cga aQ = aetn.aQ(dea.a(amh.e(adw.c(a3, false, null, (arqg) T, 7), jxe.b, 40.0f), str2), str);
            cue a4 = akk.a(ajw.c, cfq.a.m, c, 0);
            int a5 = bwg.a(c);
            byx P2 = bwkVar.P();
            cga b2 = cfv.b(c, aQ);
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
            caw.b(c, b2, cwl.a.c);
            aa(amh.j(cga.e, brg.a, brg.a, brg.a, 8.0f, 7), null, false, c, 6, 14);
            aa(null, null, true, c, 3072, 7);
            c.p();
            if (z2 && !z) {
                c.y(-1065412173);
                T(akfVar, c, 6);
                bwkVar.Y();
            } else if (z) {
                c.y(-1065358574);
                V(akfVar, c, 6);
                bwkVar.Y();
            } else {
                c.y(-1065326861);
                bwkVar.Y();
            }
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new kbg(cgaVar, str, z, z2, str2, arqgVar, i, 1);
        }
    }

    public static agej ac(int i, Map map) {
        if (map.containsKey(zfr.c)) {
            return new ageh();
        }
        if (map.containsKey(zfr.a)) {
            return new ageh();
        }
        return new agei(i);
    }

    public static Object ad(jsd jsdVar, Uri uri, arpe arpeVar) {
        if (yyb.aP(uri)) {
            if (yyb.aP(uri)) {
                return arro.q(jsdVar.b, new jli(uri, jsdVar, (arpe) null, 7), arpeVar);
            }
            Objects.toString(uri);
            throw new IllegalArgumentException(uri.toString().concat(" is not a remote uri."));
        }
        return uri;
    }

    public static /* synthetic */ jpo ae(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (jpo) s;
    }

    public static /* synthetic */ void af(Iterable iterable, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        jpo jpoVar = (jpo) aozyVar.b;
        jpo jpoVar2 = jpo.a;
        apax apaxVar = jpoVar.c;
        if (!apaxVar.c()) {
            jpoVar.c = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(iterable, jpoVar.c);
    }

    public static /* synthetic */ jpn ah(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (jpn) s;
    }

    public static void ai(String str, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        jpn jpnVar = (jpn) aozyVar.b;
        jpn jpnVar2 = jpn.a;
        jpnVar.b |= 2;
        jpnVar.d = str;
    }

    public static void aj(afdg afdgVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        jpn jpnVar = (jpn) aozyVar.b;
        jpn jpnVar2 = jpn.a;
        jpnVar.c = afdgVar;
        jpnVar.b |= 1;
    }

    public static jhc ak(IncomingDraft incomingDraft, int i) {
        incomingDraft.getClass();
        List<IncomingDraft.Attachment> list = incomingDraft.b;
        ArrayList arrayList = new ArrayList(aqjn.J(list, 10));
        for (IncomingDraft.Attachment attachment : list) {
            afsx H = afwv.H(attachment.a);
            if (H != null) {
                arrayList.add(new jgw(H, attachment.b, attachment.c, new afcm(null, 2)));
            } else {
                throw new IllegalArgumentException("Failed to parse MediaType: ".concat(attachment.a));
            }
        }
        return new jhc(incomingDraft.a, arrayList, incomingDraft.c, incomingDraft.d, null, incomingDraft.f, incomingDraft.e, false, i, incomingDraft.g, 144);
    }

    public static jop al(jha jhaVar, jno jnoVar) {
        long j;
        jhaVar.getClass();
        if (jhaVar instanceof jgz) {
            return a(((jgz) jhaVar).a, jnoVar, hlc.G(jhaVar));
        }
        if (jhaVar instanceof jgv) {
            return a(((jgv) jhaVar).a, jnoVar, hlc.G(jhaVar));
        }
        if (jhaVar instanceof jgw) {
            jgw jgwVar = (jgw) jhaVar;
            Long l = jgwVar.c;
            long j2 = 0;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            Long l2 = jgwVar.c;
            if (true == hlc.G(jhaVar)) {
                l2 = null;
            }
            if (l2 != null) {
                j2 = l2.longValue();
            }
            return new jop(j, j2);
        }
        throw new armm();
    }

    public static jop am(List list, jno jnoVar) {
        list.getClass();
        ArrayList<jop> arrayList = new ArrayList(aqjn.J(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(al((jha) it.next(), jnoVar));
        }
        jop jopVar = new jop(0L, 0L);
        for (jop jopVar2 : arrayList) {
            jopVar2.getClass();
            long j = jopVar.a;
            long j2 = jopVar.b;
            jopVar = new jop(j + jopVar2.a, j2 + jopVar2.b);
        }
        return jopVar;
    }

    public static efu an(View view) {
        return efu.l(view, view.getWidth(), view.getHeight());
    }

    public static /* synthetic */ void ap(kkc kkcVar, long j, boolean z) {
        Object obj;
        Object obj2;
        arqr arqrVar = iaw.b;
        arqrVar.getClass();
        Object obj3 = kkcVar.a;
        if (obj3 != null) {
            ((efu) obj3).a(z);
        }
        if (Build.VERSION.SDK_INT >= 29 && (obj2 = kkcVar.c) != null) {
            ((Window) obj2).setNavigationBarContrastEnforced(true);
        }
        Object obj4 = kkcVar.c;
        if (obj4 != null) {
            if (z && ((obj = kkcVar.a) == null || !((eec) ((efu) obj).a).e())) {
                j = ((cku) arqrVar.a(new cku(j))).i;
            }
            ((Window) obj4).setNavigationBarColor(ckw.b(j));
        }
    }

    public static /* synthetic */ void aq(kkc kkcVar, long j, boolean z) {
        Object obj;
        arqr arqrVar = iaw.b;
        arqrVar.getClass();
        Object obj2 = kkcVar.a;
        if (obj2 != null) {
            ((efu) obj2).b(z);
        }
        Object obj3 = kkcVar.c;
        if (obj3 != null) {
            if (z && ((obj = kkcVar.a) == null || !((efu) obj).c())) {
                j = ((cku) arqrVar.a(new cku(j))).i;
            }
            ((Window) obj3).setStatusBarColor(ckw.b(j));
        }
    }

    public static void e(boolean z) {
        f(z, "");
    }

    public static void f(boolean z, String str) {
        if (z) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static void g(String str) {
        if (!TextUtils.isEmpty(str)) {
        } else {
            throw new IllegalArgumentException("Must not be null or empty");
        }
    }

    public static void h(Collection collection) {
        if (!collection.isEmpty()) {
        } else {
            throw new IllegalArgumentException("Must not be empty.");
        }
    }

    public static void i(Object obj) {
        d.aB(obj, "Argument must not be null");
    }

    public static Intent k(Context context) {
        context.getClass();
        return new Intent(context, (Class<?>) VmtSettingsActivity.class);
    }

    public static /* synthetic */ hmk l(aozy aozyVar) {
        aozyVar.getClass();
        return new hmk(aozyVar);
    }

    public static afcp m(imv imvVar) {
        return imr.a(imvVar.g());
    }

    public static /* synthetic */ String n(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "null";
                    }
                    return "COMBINED";
                }
                return "DATABASE";
            }
            return "INCOMING";
        }
        return "UNKNOWN";
    }

    public static void o(aiuc aiucVar, ilw ilwVar) {
        aktp.H(aiucVar, aaet.class, new ilx(ilwVar, 1));
        aktp.H(aiucVar, zoi.class, new ilx(ilwVar, 0));
        aktp.H(aiucVar, lue.class, new itc(1));
        aktp.H(aiucVar, ima.class, new ilx(ilwVar, 2));
    }

    public static skz p(ConversationIdType conversationIdType) {
        sla a = sld.a();
        a.w("createOneOnOneParticipantIdsQuery");
        a.d(new idc(13));
        a.f(new ijs(conversationIdType, 10));
        return a.b();
    }

    public static sml q(ConversationIdType conversationIdType) {
        smm smmVar = new smm(smp.a);
        smmVar.w("createOneOnOneParticipantIdsQuery");
        smmVar.d(new idc(11));
        smmVar.e(new ijs(conversationIdType, 8));
        return smmVar.b();
    }

    public static tay r(ConversationIdType conversationIdType) {
        taz e = ParticipantsTable.e();
        e.w("createOtherParticipantDestinationQuery");
        e.d(new idc(14));
        e.g(new ijs(conversationIdType, 6));
        return e.b();
    }

    public static tay s(ConversationIdType conversationIdType) {
        taz e = ParticipantsTable.e();
        e.w("createRbmBotDestinationQuery");
        e.e(new idc(12));
        e.g(new ijs(conversationIdType, 9));
        return e.b();
    }

    public static agpj t(ConversationIdType conversationIdType) {
        if (ody.a()) {
            smm smmVar = new smm(smp.a);
            smmVar.w("createIsOneOnOneConversationExpression");
            smmVar.e(new ijs(conversationIdType, 5));
            return new agpk("($V)=1", new Object[]{smmVar.b().r()});
        }
        sla a = sld.a();
        a.w("createIsOneOnOneConversationExpression");
        a.d(new idc(10));
        a.f(new ijs(conversationIdType, 7));
        return new agpk("($V)=1", new Object[]{a.b().r()});
    }

    public static Rect u(RecyclerView recyclerView, View view, View view2, View view3) {
        int min;
        int min2;
        int left = recyclerView.getLeft() + view.getLeft();
        int left2 = recyclerView.getLeft() + view.getRight();
        int top = recyclerView.getTop() + view.getTop();
        int top2 = recyclerView.getTop() + view.getBottom();
        int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.badge_touch_target_size);
        int max = Math.max(0, dimensionPixelSize - (left2 - left));
        int max2 = Math.max(0, dimensionPixelSize - (top2 - top));
        if (view2 == null) {
            min = max / 2;
        } else {
            min = Math.min(max / 2, (view.getLeft() - view2.getRight()) / 2);
        }
        if (view3 == null) {
            min2 = max / 2;
        } else {
            min2 = Math.min(max / 2, (view3.getLeft() - view.getRight()) / 2);
        }
        Rect rect = new Rect();
        rect.top = top;
        rect.bottom = top2 + max2;
        rect.left = left - min;
        rect.right = left2 + min2;
        return rect;
    }

    @armg
    public static aevy v(ChipData chipData, Context context) {
        chipData.getClass();
        Uri uri = chipData.d;
        if (uri != null) {
            return new aevv(uri, null, null, null, null, 30);
        }
        String str = chipData.c;
        if (str != null) {
            return y(chipData.b, str);
        }
        Uri c = xvc.c(context);
        c.getClass();
        return new aevv(c, null, null, null, null, 30);
    }

    @armg
    public static aevy w(String str, String str2, aevs aevsVar) {
        aevsVar.getClass();
        if (str.length() == 0) {
            return new aevx(new gck(str2, 7), aevsVar);
        }
        return new aevu(new gck(str2, 8), str.charAt(0), aevsVar);
    }

    public static /* synthetic */ aewe x(mkl mklVar) {
        aevy w;
        aevs aevsVar = aevs.a;
        mklVar.getClass();
        aevsVar.getClass();
        Uri a = mklVar.a();
        if (a != null) {
            w = new aevv(a, null, null, aevsVar, null, 22);
        } else {
            w = w(mklVar.e(), mklVar.g(), aevsVar);
        }
        return new aewg(w, "", 1, null, null, 56);
    }

    public static /* synthetic */ aevy y(String str, String str2) {
        return w(str, str2, aevs.a);
    }

    public static /* synthetic */ aewe z(mkh mkhVar, boolean z, int i) {
        aevy w;
        aevs aevsVar = aevs.a;
        aevsVar.getClass();
        Uri uri = mkhVar.f;
        if (uri != null) {
            w = new aevv(uri, null, null, aevsVar, null, 22);
        } else {
            w = w(mkhVar.d, mkhVar.b, aevsVar);
        }
        aevy aevyVar = w;
        int i2 = 1;
        if (1 == ((z ? 1 : 0) & ((i & 1) ^ 1))) {
            i2 = 3;
        }
        return new aewg(aevyVar, "", i2, null, null, 56);
    }

    public hwr(byte[] bArr) {
    }

    public hwr(mjg mjgVar, Context context, lga lgaVar, armf armfVar, armf armfVar2) {
        mjgVar.getClass();
        context.getClass();
        lgaVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
    }

    public hwr(Context context, ConversationId conversationId, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8) {
        context.getClass();
        conversationId.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        armfVar8.getClass();
        armd.a(new juf(armfVar, 19));
        armd.a(new juf(armfVar2, 15));
        armd.a(new juf(armfVar4, 20));
        armd.a(new juf(armfVar5, 16));
        armd.a(new juf(armfVar6, 18));
        armd.a(new juf(armfVar7, 17));
        armd.a(new jyb(armfVar8, 1));
    }

    public hwr(mjg mjgVar, arwe arweVar, nei neiVar, armf armfVar) {
        mjgVar.getClass();
        arweVar.getClass();
        neiVar.getClass();
        armfVar.getClass();
    }

    public void d(Context context, hkz hkzVar, mgu mguVar) {
    }
}
