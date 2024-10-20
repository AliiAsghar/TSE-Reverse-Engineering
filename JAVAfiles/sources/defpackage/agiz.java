package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.provider.Settings;
import android.text.format.DateUtils;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;
import defpackage.ajw;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agiz {
    public agiz(addp addpVar, afjy afjyVar) {
        addpVar.getClass();
        afjyVar.getClass();
    }

    public static final boolean A(aggy aggyVar) {
        int i;
        int i2;
        if (aggyVar != null) {
            i = w(aggyVar.c);
            if (i == 0) {
                i = 1;
            }
        } else {
            i = 0;
        }
        if (i != 0 && i - 2 != -1 && i2 != 0 && i2 != 1) {
            return true;
        }
        return false;
    }

    public static final int C(int i) {
        switch (i - 2) {
            case 2:
                return R.string.celebrate_mood_content_description;
            case 3:
                return R.string.love_mood_content_description;
            case 4:
                return R.string.laughing_mood_content_description;
            case 5:
                return R.string.sobbing_mood_content_description;
            case 6:
                return R.string.happy_mood_content_description;
            case 7:
                return R.string.angry_mood_content_description;
            case 8:
                return R.string.shocked_mood_content_description;
            case 9:
                return R.string.annoyed_mood_content_description;
            case 10:
                return R.string.sad_mood_content_description;
            default:
                return R.string.no_mood_content_description;
        }
    }

    public static final String D(int i) {
        int i2 = i - 2;
        if (i2 != 1) {
            if (i2 == 2) {
                return "voice_moods";
            }
            Objects.toString(F(i));
            throw new IllegalArgumentException("Invalid file group: ".concat(F(i)));
        }
        return "animated_emoji";
    }

    public static String E(int i) {
        return Integer.toString(a.ak(i));
    }

    public static String F(int i) {
        return Integer.toString(a.an(i));
    }

    public static final aggt G(aggq aggqVar) {
        aggp aggpVar = (aggp) aggqVar;
        if ((aggpVar.b & 2) != 0) {
            aggt aggtVar = aggpVar.d;
            if (aggtVar == null) {
                return aggt.a;
            }
            return aggtVar;
        }
        return null;
    }

    public static final /* synthetic */ aggp H(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (aggp) s;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void I(defpackage.agfp r12, defpackage.cga r13, defpackage.bwj r14, int r15, int r16) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agiz.I(agfp, cga, bwj, int, int):void");
    }

    public static final void J(float f, long j, bwj bwjVar, int i) {
        int i2;
        cga a;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-874970497);
        if (i5 == 0) {
            if (true != c.D(f)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.F(j)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !c.L()) {
            a = adf.a(chk.a(amv.h(cga.e, f), awh.a), j, clw.a);
            akc.b(dea.a(a, "timer_dot"), c, 0);
        } else {
            c.v();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new agfq(f, j, i, 0);
        }
    }

    public static final void K(Duration duration, dje djeVar, long j, bwj bwjVar, int i) {
        bwj c = bwjVar.c(1483279988);
        cga.a aVar = cga.e;
        String formatElapsedTime = DateUtils.formatElapsedTime(duration.getSeconds());
        formatElapsedTime.getClass();
        brx.b(formatElapsedTime, aVar, j, 0L, 0L, null, 0L, 0, false, 0, 0, null, dje.y(djeVar, 0L, 0L, null, null, null, "tnum", 0L, 0, 0, 0L, null, null, 0, 16777151), c, (i >> 3) & 1008, 0, 65528);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeus(duration, djeVar, j, i, 2);
        }
    }

    public static final float L(bwj bwjVar) {
        float f;
        bwjVar.y(893917588);
        f = ((dqy) aay.c(aay.b(bwjVar), new dqy(6.0f), new dqy(12.0f), aci.c, zs.b(zs.d(1000, 0, aao.c, 2), null, 6), bwjVar, 37256).a()).a;
        bwjVar.q();
        return f;
    }

    public static final agae M(agek agekVar, arqg arqgVar) {
        agekVar.getClass();
        return new agae(agekVar, arqgVar);
    }

    public static aglh N(aday adayVar, agle agleVar) {
        if (agleVar.c) {
            return adayVar.Z(agleVar);
        }
        return aglh.a;
    }

    private static final Uri O(aggx aggxVar) {
        Uri.Builder scheme = new Uri.Builder().scheme("mdd");
        int aT = a.aT(aggxVar.c);
        if (aT == 0) {
            aT = 1;
        }
        return scheme.authority(D(aT)).appendPath(aggxVar.b).build();
    }

    private static final boolean P(aggx aggxVar) {
        int aT;
        String str = aggxVar.b;
        str.getClass();
        if (!arsd.M(str)) {
            int aT2 = a.aT(aggxVar.c);
            if ((aT2 == 0 || aT2 != 2) && (aT = a.aT(aggxVar.c)) != 0 && aT != 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v3 ??, still in use, count: 1, list:
          (r11v3 ?? I:java.lang.Object) from 0x00f3: INVOKE (r3v5 ?? I:bwk), (r11v3 ?? I:java.lang.Object) VIRTUAL call: bwk.ad(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:244)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public static final void a(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v3 ??, still in use, count: 1, list:
          (r11v3 ?? I:java.lang.Object) from 0x00f3: INVOKE (r3v5 ?? I:bwk), (r11v3 ?? I:java.lang.Object) VIRTUAL call: bwk.ad(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:244)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r20v0 ??
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.bwj r23, int r24) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agiz.b(bwj, int):void");
    }

    public static final boolean c(agii agiiVar, agjj agjjVar) {
        if (((Boolean) agiiVar.a.c()).booleanValue() && !agiiVar.b.isEmpty() && (agjjVar instanceof agjg)) {
            return true;
        }
        return false;
    }

    public static final void d(asai asaiVar, asai asaiVar2, agih agihVar, agii agiiVar, bwj bwjVar, int i) {
        agjg agjgVar;
        bwj c = bwjVar.c(1415415211);
        aeko aekoVar = null;
        agjj agjjVar = (agjj) cao.b(asaiVar, agjh.a, null, c, 2).a();
        bwk bwkVar = (bwk) c;
        Object T = bwkVar.T();
        if (T == bwj.a.a) {
            T = bxl.a(arpj.a, c);
            bwkVar.ad(T);
        }
        arwe arweVar = (arwe) T;
        c.y(1834672803);
        Object T2 = bwkVar.T();
        if (T2 == bwj.a.a) {
            T2 = new cez();
            bwkVar.ad(T2);
        }
        cez cezVar = (cez) T2;
        bwkVar.Y();
        bxl.g(arweVar, new yiv(arweVar, asaiVar2, cezVar, (arpe) null, 9), c);
        boolean z = agjjVar instanceof agjg;
        if (z) {
            agjgVar = (agjg) agjjVar;
        } else {
            agjgVar = null;
        }
        if (agjgVar != null) {
            agig agigVar = agjgVar.f;
            aekoVar = new aeko(agjgVar.e, new afya((Object) agigVar, 4, (int[]) null), new zay(agigVar, 15, (short[][][]) null));
        }
        aekt aektVar = new aekt(cezVar, aekoVar);
        agiy agiyVar = new agiy(agihVar, (cpm) c.g(dch.g), cezVar, agjjVar);
        cga a = dea.a(amh.d(cga.e, 8.0f), "voice_screen");
        ajw.d dVar = new ajw.d(8.0f, true, ajx.a);
        int i2 = cfq.a;
        cue a2 = akk.a(dVar, cfq.a.m, c, 6);
        int a3 = bwg.a(c);
        byx P = bwkVar.P();
        cga b = cfv.b(c, a);
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
        bwx.a(dch.i.c(drk.a), cdk.e(-625942731, new agix(agiiVar, agjjVar, ako.a, agiyVar, aektVar, 0), c), c, 56);
        c.y(-195540722);
        if (c(agiiVar, agjjVar)) {
            if (z) {
                h((agjg) agjjVar, agiiVar, c, 64);
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        bwkVar.Y();
        u(agjjVar, ((Boolean) cak.a(agiiVar.a, c).a()).booleanValue(), agiyVar, c, 512);
        c.p();
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new lhq(asaiVar, asaiVar2, agihVar, agiiVar, i, 20);
        }
    }

    public static final agfp e(agjj agjjVar, float f, bwj bwjVar) {
        agfp agfpVar;
        Duration duration;
        long j;
        long j2;
        agjjVar.getClass();
        bwjVar.y(-485633043);
        if (agjjVar instanceof agji) {
            bwjVar.y(-1533329061);
            agfo agfoVar = new agfo(f, bmp.a(bwjVar).w);
            agji agjiVar = (agji) agjjVar;
            Duration duration2 = agjiVar.a;
            Duration minus = agjiVar.b.minus(duration2);
            Duration duration3 = agin.a;
            if (minus.compareTo(agin.a) <= 0) {
                bwjVar.y(-288344780);
                j2 = bmp.a(bwjVar).w;
                bwjVar.q();
            } else {
                bwjVar.y(-288282160);
                j2 = bmp.a(bwjVar).q;
                bwjVar.q();
            }
            agfpVar = new agfp(agfoVar, duration2, j2, bmp.d(bwjVar).f);
            bwjVar.q();
        } else if (agjjVar instanceof agjg) {
            bwjVar.y(-1533314355);
            agjg agjgVar = (agjg) agjjVar;
            if (!d.F(agjgVar.d, Duration.ZERO)) {
                duration = agjgVar.d;
            } else {
                duration = agjgVar.a;
            }
            Duration duration4 = duration;
            bwjVar.y(-1533308252);
            if (z(agjgVar.g)) {
                j = cku.a;
            } else {
                j = bmp.a(bwjVar).q;
            }
            bwjVar.q();
            agfpVar = new agfp(null, duration4, j, bmp.d(bwjVar).m);
            bwjVar.q();
        } else {
            bwjVar.y(-287699640);
            bwjVar.q();
            agfpVar = null;
        }
        bwjVar.q();
        return agfpVar;
    }

    public static final int f(byk bykVar) {
        return bykVar.b();
    }

    public static final void g(aggy aggyVar, boolean z, bwj bwjVar, int i) {
        int i2;
        Object obj;
        hdv hdvVar;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(575055615);
        int i6 = 1;
        if (i5 == 0) {
            if (true != c.G(aggyVar)) {
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
        } else if (!A(aggyVar)) {
            c.y(39581833);
            bmd.a(dfv.a(R.drawable.gs_block_vd_theme_24, c, 0), null, amv.h(cga.e, 30.0f), bmp.a(c).B, c, 440, 0);
            ((bwk) c).Y();
        } else {
            c.y(39811264);
            aggyVar.getClass();
            apax apaxVar = aggyVar.d;
            apaxVar.getClass();
            Iterator<E> it = apaxVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    int Z = a.Z(((aggu) obj).c);
                    if (Z != 0 && Z == 5) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            aggu agguVar = (aggu) obj;
            if (agguVar != null) {
                aggx aggxVar = agguVar.b;
                if (aggxVar == null) {
                    aggxVar = aggx.a;
                }
                String str = aggxVar.b;
                str.getClass();
                aggx aggxVar2 = agguVar.b;
                if (aggxVar2 == null) {
                    aggxVar2 = aggx.a;
                }
                int aT = a.aT(aggxVar2.c);
                if (aT != 0) {
                    i6 = aT;
                }
                aerk aerkVar = new aerk(str, D(i6));
                cga h = amv.h(cga.e, 30.0f);
                if (z) {
                    hdvVar = null;
                } else {
                    hdvVar = new hdv(null);
                }
                aeke.bd(aerkVar, h, hdvVar, null, z, 0, c, ((i2 << 9) & 57344) | 48, 104);
            }
            ((bwk) c).Y();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelm(aggyVar, z, i, 15);
        }
    }

    public static final void h(agjg agjgVar, agii agiiVar, bwj bwjVar, int i) {
        cga c;
        agjgVar.getClass();
        bwj c2 = bwjVar.c(-631607887);
        cga.a aVar = cga.e;
        Context context = (Context) c2.g(AndroidCompositionLocals_androidKt.b);
        aov a = aoz.a(c2);
        c2.y(-412568815);
        bwk bwkVar = (bwk) c2;
        Object T = bwkVar.T();
        boolean z = false;
        if (T == bwj.a.a) {
            T = new bys(0);
            bwkVar.ad(T);
        }
        byk bykVar = (byk) T;
        bwkVar.Y();
        c2.y(-412566633);
        Object T2 = bwkVar.T();
        if (T2 == bwj.a.a) {
            if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != brg.a) {
                z = true;
            }
            T2 = Boolean.valueOf(z);
            bwkVar.ad(T2);
        }
        boolean booleanValue = ((Boolean) T2).booleanValue();
        bwkVar.Y();
        aozy createBuilder = aggy.a.createBuilder();
        createBuilder.getClass();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aggy aggyVar = (aggy) createBuilder.b;
        aggyVar.c = a.at(3);
        aggyVar.b |= 1;
        apag s = createBuilder.s();
        s.getClass();
        List aq = aqjn.aq(aqjn.y((aggy) s), agiiVar.b);
        c = amv.c(amv.d(aVar, 64.0f), 1.0f);
        anp.b(dea.a(c, "mood_selector_tag"), a, null, new ajw.d(8.0f, true, ajx.a), null, null, false, new agik(aq, agjgVar, bykVar, booleanValue, agiiVar, 0), c2, 24576, 236);
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new afbs(agjgVar, agiiVar, i, 15, null);
        }
    }

    public static final StrictMode.ThreadPolicy i() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    public static ThreadFactory j(String str, ThreadFactory threadFactory) {
        arbj arbjVar = new arbj((char[]) null, (byte[]) null);
        arbjVar.i();
        arbjVar.j(str.concat(" Thread #%d"));
        arbjVar.b = threadFactory;
        return arbj.t(arbjVar);
    }

    public static ExecutorService k(agle agleVar, ThreadFactory threadFactory, aglh aglhVar) {
        if (agleVar.c) {
            threadFactory = new aglj(threadFactory, aglhVar, 0);
        }
        return new amdj(agleVar.b, threadFactory, new aefw(aglhVar, 10), new aefw(aglhVar, 11));
    }

    public static /* synthetic */ void l(agih agihVar, boolean z, boolean z2, aggp aggpVar, int i) {
        boolean z3;
        boolean z4 = false;
        if ((i & 2) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean z5 = z2 & z3;
        if ((i & 4) != 0) {
            aggpVar = null;
        }
        if (1 == ((z ? 1 : 0) | (i & 1))) {
            z4 = true;
        }
        agihVar.a(z4, z5, aggpVar);
    }

    public static final void n(boolean z, boolean z2, cga cgaVar, agig agigVar, aggp aggpVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i & 14;
        bwj c = bwjVar.c(-1004109865);
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
        if ((57344 & i) == 0) {
            if (true != c.G(aggpVar)) {
                i3 = 8192;
            } else {
                i3 = 16384;
            }
            i2 |= i3;
        }
        c.w();
        if ((i & 1) != 0 && !c.J()) {
            c.v();
        }
        c.n();
        int i8 = i2 >> 3;
        ws.a(Boolean.valueOf(z2), cgaVar, null, null, cdk.e(1080009784, new agib(agigVar, z, aggpVar, 2), c), c, (i8 & 112) | (i8 & 14) | 24576, 12);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new agif(z, z2, cgaVar, agigVar, aggpVar, i);
        }
    }

    public static final void o(amt amtVar, arqg arqgVar, bkn bknVar, cor corVar, String str, cga cgaVar, boolean z, String str2, float f, bwj bwjVar, int i, int i2) {
        cga cgaVar2;
        boolean z2;
        String str3;
        float f2;
        cga a;
        cga b;
        int i3 = i2 & 16;
        bwj c = bwjVar.c(-449768508);
        if (i3 != 0) {
            cgaVar2 = cga.e;
        } else {
            cgaVar2 = cgaVar;
        }
        if ((i2 & 32) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z3 = (!z2) | z;
        if ((i2 & 64) != 0) {
            str3 = null;
        } else {
            str3 = str2;
        }
        if ((i2 & 128) != 0) {
            f2 = 24.0f;
        } else {
            f2 = f;
        }
        a = cgaVar2.a(amv.b);
        b = amtVar.b(a, 1.0f, true);
        bks.a(arqgVar, b, z3, awh.a(30.0f), bknVar, null, null, new amk(brg.a, brg.a, brg.a, brg.a), null, cdk.e(-1695820876, new aghz(corVar, str, f2, str3), c), c, ((i >> 3) & 14) | 817889280 | ((i >> 12) & 896) | (57344 & (i << 6)), 352);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new agia(amtVar, arqgVar, bknVar, corVar, str, cgaVar2, z3, str3, f2, i, i2);
        }
    }

    public static final void p(amt amtVar, boolean z, arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(-92632601);
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
            amj amjVar = bko.a;
            int i7 = (i2 & 14) | 4096;
            int i8 = (i2 >> 3) & 112;
            o(amtVar, arqgVar, bko.b(bmp.a(c).a, bmp.a(c).b, 0L, 0L, c, 12), dfv.a(R.drawable.gs_done_vd_theme_24, c, 0), dga.a(R.string.finish_recording_button_content_description, c), null, z, dga.a(R.string.finish_recording_button_text, c), brg.a, c, ((i2 << 15) & 3670016) | i7 | i8, 144);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new afym(amtVar, z, arqgVar, i, 4);
        }
    }

    public static final void q(amt amtVar, arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-580631954);
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
            amj amjVar = bko.a;
            o(amtVar, arqgVar, bko.b(bmp.a(c).G, bmp.a(c).a, 0L, 0L, c, 12), dfv.a(R.drawable.gs_close_vd_theme_24, c, 0), dga.a(R.string.cancel_button_content_description, c), null, false, dga.a(R.string.cancel_button_text, c), brg.a, c, (i2 & 14) | 4096 | (i2 & 112), 176);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new afbs(amtVar, arqgVar, i, 13);
        }
    }

    public static final void r(amt amtVar, float f, arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(295289113);
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
            if (true != c.D(f)) {
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
            amj amjVar = bko.a;
            v(amtVar, arqgVar, f, bko.b(bmp.a(c).s, 0L, 0L, 0L, c, 14), dfv.a(R.drawable.gs_mic_vd_theme_24, c, 0), dga.a(R.string.start_recording_button_content_description, c), false, c, (i2 & 14) | 32768 | ((i2 >> 3) & 112) | ((i2 << 3) & 896), 96);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aepf(amtVar, f, arqgVar, i, 2);
        }
    }

    public static final void s(amt amtVar, arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-1069798011);
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
            amj amjVar = bko.a;
            o(amtVar, arqgVar, bko.b(bmp.a(c).G, bmp.a(c).a, 0L, 0L, c, 12), dfv.a(R.drawable.gs_restart_alt_vd_theme_24, c, 0), dga.a(R.string.restart_recording_button_content_description, c), null, false, dga.a(R.string.restart_recording_button_text, c), brg.a, c, (i2 & 14) | 4096 | (i2 & 112), 176);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new afbs(amtVar, arqgVar, i, 14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void t(defpackage.amt r19, boolean r20, float r21, defpackage.arqg r22, defpackage.bwj r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agiz.t(amt, boolean, float, arqg, bwj, int, int):void");
    }

    public static final void u(agjj agjjVar, boolean z, agih agihVar, bwj bwjVar, int i) {
        agjjVar.getClass();
        int i2 = i & 14;
        bwj c = bwjVar.c(305062365);
        if (i2 == 0) {
            c.G(agjjVar);
        }
        if ((i & 112) == 0) {
            c.H(z);
        }
        c.w();
        if ((i & 1) != 0 && !c.J()) {
            c.v();
        }
        c.n();
        akh.a(null, null, cdk.e(343962183, new agib(agjjVar, z, agihVar, 0), c), c, 3072, 7);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new afym(agjjVar, z, agihVar, i, 3);
        }
    }

    public static final void v(amt amtVar, arqg arqgVar, float f, bkn bknVar, cor corVar, String str, boolean z, bwj bwjVar, int i, int i2) {
        cga cgaVar;
        boolean z2;
        bwj c = bwjVar.c(-806046630);
        if (Float.compare(f, 300.0f) < 0) {
            cgaVar = amtVar.b(cga.e, 0.5f, true);
        } else {
            cgaVar = cga.e;
        }
        cga cgaVar2 = cgaVar;
        if ((i2 & 32) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z3 = (!z2) | z;
        int i3 = i >> 3;
        o(amtVar, arqgVar, bknVar, corVar, str, cgaVar2, z3, null, 28.0f, c, (i & 14) | 4096 | (i & 112) | (i3 & 896) | (57344 & i3) | (i & 3670016) | (i & 29360128), 0);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new agic(amtVar, arqgVar, f, bknVar, corVar, str, z3, i, i2);
        }
    }

    public static int w(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            default:
                return 0;
        }
    }

    public static final Uri x(aggy aggyVar) {
        aggx aggxVar;
        if (aggyVar != null) {
            aggv aggvVar = aggyVar.e;
            if (aggvVar == null) {
                aggvVar = aggv.a;
            }
            if (aggvVar != null) {
                aggxVar = aggvVar.b;
                if (aggxVar == null) {
                    aggxVar = aggx.a;
                }
                if (aggxVar != null || !P(aggxVar)) {
                    return null;
                }
                return O(aggxVar);
            }
        }
        aggxVar = null;
        if (aggxVar != null) {
        }
        return null;
    }

    public static final afbz y(aggy aggyVar, boolean z) {
        int i;
        aggv aggvVar;
        afbv afbvVar;
        afbz afbzVar = null;
        Uri uri = null;
        if (A(aggyVar)) {
            apax apaxVar = aggyVar.d;
            apaxVar.getClass();
            ArrayList<aggu> arrayList = new ArrayList();
            Iterator<E> it = apaxVar.iterator();
            while (true) {
                i = 1;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                aggu agguVar = (aggu) next;
                agguVar.getClass();
                aggx aggxVar = agguVar.b;
                if (aggxVar == null) {
                    aggxVar = aggx.a;
                }
                aggxVar.getClass();
                if (P(aggxVar)) {
                    int Z = a.Z(agguVar.c);
                    if (Z == 0) {
                        Z = 1;
                    }
                    if (Z != 2 && Z != 1) {
                        arrayList.add(next);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(aqjn.J(arrayList, 10));
            for (aggu agguVar2 : arrayList) {
                agguVar2.getClass();
                aggx aggxVar2 = agguVar2.b;
                if (aggxVar2 == null) {
                    aggxVar2 = aggx.a;
                }
                aggxVar2.getClass();
                String str = aggxVar2.b;
                str.getClass();
                int aT = a.aT(aggxVar2.c);
                if (aT == 0) {
                    aT = 1;
                }
                aerk aerkVar = new aerk(str, D(aT));
                int Z2 = a.Z(agguVar2.c);
                if (Z2 == 0) {
                    Z2 = 1;
                }
                int i2 = Z2 - 2;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            afbvVar = afbv.c;
                        } else {
                            Objects.toString(E(Z2));
                            throw new UnsupportedOperationException("Invalid position: ".concat(E(Z2)));
                        }
                    } else {
                        afbvVar = afbv.b;
                    }
                } else {
                    afbvVar = afbv.a;
                }
                arrayList2.add(new afbu(aerkVar, afbvVar));
            }
            aggv aggvVar2 = aggyVar.e;
            if (aggvVar2 == null) {
                aggvVar2 = aggv.a;
            }
            aggx aggxVar3 = aggvVar2.b;
            if (aggxVar3 == null) {
                aggxVar3 = aggx.a;
            }
            aggxVar3.getClass();
            if (P(aggxVar3)) {
                aggv aggvVar3 = aggyVar.e;
                if (aggvVar3 == null) {
                    aggvVar3 = aggv.a;
                }
                aggx aggxVar4 = aggvVar3.b;
                if (aggxVar4 == null) {
                    aggxVar4 = aggx.a;
                }
                aggxVar4.getClass();
                uri = O(aggxVar4);
            }
            Uri uri2 = uri;
            alog aZ = alzz.aZ(arrayList2);
            aggv aggvVar4 = aggyVar.e;
            if (aggvVar4 == null) {
                aggvVar4 = aggv.a;
            }
            aggw aggwVar = aggvVar4.c;
            if (aggwVar == null) {
                aggwVar = aggw.a;
            }
            long j = aggwVar.b;
            aggv aggvVar5 = aggyVar.e;
            if (aggvVar5 == null) {
                aggvVar = aggv.a;
            } else {
                aggvVar = aggvVar5;
            }
            aggw aggwVar2 = aggvVar.c;
            if (aggwVar2 == null) {
                aggwVar2 = aggw.a;
            }
            long j2 = aggwVar2.c;
            if (aggvVar5 == null) {
                aggvVar5 = aggv.a;
            }
            aggw aggwVar3 = aggvVar5.c;
            if (aggwVar3 == null) {
                aggwVar3 = aggw.a;
            }
            float f = aggwVar3.d;
            int w = w(aggyVar.c);
            if (w != 0) {
                i = w;
            }
            afbzVar = new afbz(aZ, uri2, j, j2, f, z, C(i), true);
        }
        return afbzVar;
    }

    public static final boolean z(aggp aggpVar) {
        aggy aggyVar = aggpVar.c;
        if (aggyVar == null) {
            aggyVar = aggy.a;
        }
        return A(aggyVar);
    }
}
