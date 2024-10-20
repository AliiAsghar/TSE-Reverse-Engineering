package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.startchat.chip.ChipData;
import com.google.android.gms.common.ConnectionResult;
import defpackage.ajw;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yzc {
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v7 ??, still in use, count: 1, list:
          (r15v7 ?? I:java.lang.Object) from 0x01a7: INVOKE (r13v5 ?? I:bwk), (r15v7 ?? I:java.lang.Object) VIRTUAL call: bwk.ad(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:424)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public static final void A(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v7 ??, still in use, count: 1, list:
          (r15v7 ?? I:java.lang.Object) from 0x01a7: INVOKE (r13v5 ?? I:bwk), (r15v7 ?? I:java.lang.Object) VIRTUAL call: bwk.ad(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:424)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v0 ??
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

    private static final long B(bwj bwjVar) {
        long j;
        bwjVar.y(1327463927);
        if (aef.a(bwjVar)) {
            bwjVar.y(-1354462711);
            j = bmp.a(bwjVar).v;
            ((bwk) bwjVar).Y();
        } else {
            bwjVar.y(-1354405175);
            j = bmp.a(bwjVar).s;
            ((bwk) bwjVar).Y();
        }
        ((bwk) bwjVar).Y();
        return j;
    }

    private static final zdx C(cas casVar) {
        return (zdx) casVar.a();
    }

    private static final zea D(cas casVar) {
        return (zea) casVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ChipData a(mkh mkhVar, msh mshVar) {
        alog alogVar = mkhVar.e;
        alogVar.getClass();
        if (!alogVar.isEmpty()) {
            alur it = alogVar.iterator();
            while (it.hasNext()) {
                if (((agoe) it.next()).b.equals(mshVar)) {
                    return new ChipData(mshVar, mkhVar.d, mkhVar.b, mkhVar.f, false, 16, null);
                }
            }
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final void b(yzi yziVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-987060721);
        if (i4 == 0) {
            if (true != c.G(yziVar)) {
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
            i(yziVar, gei.a(yziVar.b, ((qip) c.g(qjf.a)).a, c, 0), cak.a(yziVar.a, c), (yzz) cak.a(yziVar.c, c).a(), (yzr) cak.a(yziVar.d, c).a(), (zaj) cak.a(yziVar.e, c).a(), (zae) cak.a(yziVar.f, c).a(), a.x(cak.a(yziVar.g, c)), c, (i2 & 14) | 16777288);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new kjt(yziVar, i, 19);
        }
    }

    public static final void c(arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-672649377);
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
            ahji.am(arqgVar, amh.j(cga.e, 16.0f, 18.0f, 16.0f, brg.a, 8), false, null, null, null, null, null, yzh.b, c, (i2 & 14) | 805306368);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new kjt(arqgVar, i, 20);
        }
    }

    public static final ConversationId d(eog eogVar) {
        eogVar.getClass();
        ConversationId conversationId = (ConversationId) eogVar.a("conversation_mapi_id");
        if (conversationId != null) {
            return conversationId;
        }
        String str = (String) eogVar.a("conversation_id");
        if (str == null) {
            return null;
        }
        return new BugleConversationId(ruy.b(str));
    }

    public static final amui e(int i) {
        if (i != -1) {
            if (i != 0) {
                if (i != 10) {
                    switch (i) {
                        case 4:
                            return amui.SIGN_IN_REQUIRED;
                        case 5:
                            return amui.INVALID_ACCOUNT;
                        case 6:
                            return amui.RESOLUTION_REQUIRED;
                        case 7:
                            return amui.NETWORK_ERROR;
                        case 8:
                            return amui.INTERNAL_ERROR;
                        default:
                            switch (i) {
                                case 13:
                                    return amui.GMS_ERROR;
                                case 14:
                                    return amui.INTERRUPTED;
                                case 15:
                                    return amui.TIMEOUT;
                                case 16:
                                    return amui.CANCELED;
                                case 17:
                                    return amui.API_NOT_CONNECTED;
                                case 18:
                                    return amui.DEAD_CLIENT;
                                case 19:
                                    return amui.REMOTE_EXCEPTION;
                                case 20:
                                    return amui.CONNECTION_SUSPENDED_DURING_CALL;
                                case 21:
                                    return amui.RECONNECTION_TIMED_OUT_DURING_UPDATE;
                                case 22:
                                    return amui.RECONNECTION_TIMED_OUT;
                                default:
                                    switch (i) {
                                        case 4000:
                                            return amui.TARGET_NODE_NOT_CONNECTED;
                                        case 4001:
                                            return amui.DUPLICATE_LISTENER;
                                        case 4002:
                                            return amui.UNKNOWN_LISTENER;
                                        case 4003:
                                            return amui.DATA_ITEM_TOO_LARGE;
                                        case 4004:
                                            return amui.INVALID_TARGET_NODE;
                                        case 4005:
                                            return amui.ASSET_UNAVAILABLE;
                                        case 4006:
                                            return amui.DUPLICATE_CAPABILITY;
                                        case 4007:
                                            return amui.UNKNOWN_CAPABILITY;
                                        case 4008:
                                            return amui.WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED;
                                        case 4009:
                                            return amui.UNSUPPORTED_BY_TARGET_NODE;
                                        default:
                                            return amui.STATUS_CODE_NOT_MAPPED;
                                    }
                            }
                    }
                }
                return amui.DEVELOPER_ERROR;
            }
            return amui.SUCCESS;
        }
        return amui.SUCCESS_CACHE;
    }

    public static final ywe f(abra abraVar) {
        Integer num;
        abraVar.getClass();
        ConnectionResult connectionResult = abraVar.a.i;
        if (connectionResult != null) {
            num = Integer.valueOf(connectionResult.c);
        } else {
            num = null;
        }
        if (num == null) {
            return ywe.A;
        }
        if (num.intValue() == 0) {
            return ywe.b;
        }
        if (num.intValue() == 1) {
            return ywe.c;
        }
        if (num.intValue() == 2) {
            return ywe.d;
        }
        if (num.intValue() == 3) {
            return ywe.e;
        }
        if (num.intValue() == 4) {
            return ywe.f;
        }
        if (num.intValue() == 5) {
            return ywe.g;
        }
        if (num.intValue() == 6) {
            return ywe.h;
        }
        if (num.intValue() == 7) {
            return ywe.i;
        }
        if (num.intValue() == 8) {
            return ywe.j;
        }
        if (num.intValue() == 9) {
            return ywe.k;
        }
        if (num.intValue() == 10) {
            return ywe.l;
        }
        if (num.intValue() == 11) {
            return ywe.m;
        }
        if (num.intValue() == 13) {
            return ywe.n;
        }
        if (num.intValue() == 14) {
            return ywe.o;
        }
        if (num.intValue() == 15) {
            return ywe.p;
        }
        if (num.intValue() == 16) {
            return ywe.q;
        }
        if (num.intValue() == 17) {
            return ywe.r;
        }
        if (num.intValue() == 18) {
            return ywe.s;
        }
        if (num.intValue() == 19) {
            return ywe.t;
        }
        if (num.intValue() == 20) {
            return ywe.u;
        }
        if (num.intValue() == 22) {
            return ywe.w;
        }
        if (num.intValue() == 23) {
            return ywe.x;
        }
        if (num.intValue() == 24) {
            return ywe.y;
        }
        return ywe.B;
    }

    public static int g(int i) {
        switch (i) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            default:
                return 1;
            case 7:
            case 11:
                return 8;
            case 8:
            case 10:
                return 9;
            case 9:
                return 10;
        }
    }

    public static String h(String str) {
        return ysu.b(str, true);
    }

    public static final void i(yzi yziVar, gqg gqgVar, cas casVar, yzz yzzVar, yzr yzrVar, zaj zajVar, zae zaeVar, List list, bwj bwjVar, int i) {
        boolean booleanValue;
        bwj bwjVar2;
        bwk bwkVar;
        bwj c = bwjVar.c(-398090467);
        aov a = aoz.a(c);
        c.y(-1233833425);
        bwk bwkVar2 = (bwk) c;
        Object T = bwkVar2.T();
        if (T == bwj.a.a) {
            bxd bxdVar = new bxd(new yyy(gqgVar, 10), null);
            bwkVar2.ad(bxdVar);
            T = bxdVar;
        }
        bwkVar2.Y();
        booleanValue = ((Boolean) ((cas) T).a()).booleanValue();
        if (booleanValue && ((zat) casVar.a()).b) {
            aeqm aeqmVar = ((zat) casVar.a()).a;
            cga p = amv.p(cga.e);
            if (!yzzVar.b) {
                p = adcx.af(p, a, new ynn(yzzVar, 3), new aeyi(Float.valueOf(0.1f)), yziVar.j);
            }
            anp.a(dea.a(p, "contact_list"), a, null, false, null, null, null, false, new aepl(yzrVar, zajVar, aeqmVar, list, zaeVar, gqgVar, 1), c, 0, 252);
            bwjVar2 = c;
            bxl.g(arnb.a, new icz(yziVar, aeqmVar, list, a, gqgVar, (arpe) null, 11), bwjVar2);
            Boolean valueOf = Boolean.valueOf(yzrVar.a());
            bwjVar2.y(-1233735517);
            boolean z = true;
            if ((((57344 & i) ^ 24576) <= 16384 || !bwjVar2.G(yzrVar)) && (i & 24576) != 16384) {
                z = false;
            }
            Object T2 = bwkVar2.T();
            if (!z && T2 != bwj.a.a) {
                bwkVar = bwkVar2;
            } else {
                T2 = new uxs(yzrVar, (arpe) null, 16);
                bwkVar = bwkVar2;
                bwkVar.ad(T2);
            }
            bwkVar.Y();
            bxl.g(valueOf, (arqv) T2, bwjVar2);
            bxl.g(a, new yqs(a, yziVar, (arpe) null, 13), bwjVar2);
        } else {
            bwjVar2 = c;
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new yzq(yziVar, gqgVar, casVar, yzzVar, yzrVar, zajVar, zaeVar, list, i);
        }
    }

    public static final void j(zie zieVar, Context context, bwj bwjVar, int i) {
        cga c;
        bwj c2 = bwjVar.c(1109888170);
        cga o = amv.o(cga.e);
        c2.y(2116029341);
        bwk bwkVar = (bwk) c2;
        Object T = bwkVar.T();
        if (T == bwj.a.a) {
            T = yzm.j;
            bwkVar.ad(T);
        }
        bwkVar.Y();
        c = dhb.c(o, false, (arqr) T);
        cga c3 = adw.c(amh.j(c, 15.0f, brg.a, brg.a, brg.a, 14), false, null, new zdh(context, zieVar, 9, null), 7);
        ajw.e eVar = ajw.c;
        int i2 = cfq.a;
        cue a = akk.a(eVar, cfq.a.m, c2, 0);
        int a2 = bwg.a(c2);
        byx P = bwkVar.P();
        cga b = cfv.b(c2, c3);
        int i3 = cwl.a;
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
        String y = wfh.y(zieVar.a);
        y.getClass();
        ahji.e(y, null, B(c2), 0L, 0L, new dqi(5), 0L, 0, false, 0, 0, null, bmp.d(c2).j, c2, 0, 0, 65018);
        String y2 = wfh.y(zieVar.b);
        y2.getClass();
        ahji.e(y2, null, B(c2), 0L, 0L, new dqi(5), 0L, 0, false, 0, 0, null, bmp.d(c2).j, c2, 0, 0, 65018);
        c2.p();
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new zcj(zieVar, context, i, 2);
        }
    }

    public static final void k(List list, Context context, Intent intent, bwj bwjVar, int i) {
        long j;
        bwj c = bwjVar.c(-308216697);
        cga.a aVar = cga.e;
        ajw.e eVar = ajw.c;
        int i2 = cfq.a;
        cue a = akk.a(eVar, cfq.a.m, c, 0);
        int a2 = bwg.a(c);
        bwk bwkVar = (bwk) c;
        byx P = bwkVar.P();
        cga b = cfv.b(c, aVar);
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
        m(c, 6);
        l(context, intent, c, 72);
        c.y(1943161165);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zie zieVar = (zie) it.next();
            m(c, 6);
            cga p = amv.p(cga.e);
            c.y(1087211232);
            if (aef.a(c)) {
                c.y(451587600);
                j = bmp.a(c).u;
                bwkVar.Y();
            } else {
                c.y(451643152);
                j = bmp.a(c).r;
                bwkVar.Y();
            }
            bwkVar.Y();
            ahji.V(p, brg.a, j, c, 6, 2);
            m(c, 6);
            j(zieVar, context, c, 72);
        }
        bwkVar.Y();
        c.p();
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jkb(list, context, intent, i, 9);
        }
    }

    public static final void l(Context context, Intent intent, bwj bwjVar, int i) {
        bwj c = bwjVar.c(-1722500702);
        cga c2 = adw.c(amh.j(amv.o(cga.e), 15.0f, brg.a, brg.a, brg.a, 14), false, null, new zdh(context, intent, 10, null), 7);
        ajw.e eVar = ajw.c;
        int i2 = cfq.a;
        cue a = akk.a(eVar, cfq.a.m, c, 0);
        int a2 = bwg.a(c);
        bwk bwkVar = (bwk) c;
        byx P = bwkVar.P();
        cga b = cfv.b(c, c2);
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
        String string = context.getString(R.string.general_settings);
        string.getClass();
        ahji.e(string, null, B(c), 0L, 0L, new dqi(5), 0L, 0, false, 0, 0, null, bmp.d(c).j, c, 0, 0, 65018);
        c.p();
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zcj(context, intent, i, 3, null);
        }
    }

    public static final void m(bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(272086554);
        if (i4 == 0) {
            if (true != c.E(16)) {
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
            amx.a(amv.d(amv.p(cga.e), 16.0f), c);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new lhs(i, 5);
        }
    }

    public static void n(en enVar, SpannableString spannableString) {
        xyl.g();
        if (TextUtils.isEmpty(spannableString)) {
            enVar.setTitle("");
        } else {
            enVar.setTitle(spannableString);
        }
    }

    public static void o(en enVar, CharSequence charSequence) {
        if (enVar == null) {
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            n(enVar, null);
        } else {
            n(enVar, new SpannableString(charSequence));
        }
    }

    public static void p(Context context, en enVar, int i) {
        n(enVar, new SpannableString(context.getString(i)));
    }

    public static final int q(Context context) {
        context.getClass();
        return ahnz.f(context, R.attr.colorSurfaceContainerLow, "BugleSurfaceColors");
    }

    public static final int r(Context context) {
        context.getClass();
        return ahnz.f(context, R.attr.colorSurfaceContainer, "BugleSurfaceColors");
    }

    public static final int s(Context context) {
        context.getClass();
        return ahnz.f(context, R.attr.colorSurfaceContainerHigh, "BugleSurfaceColors");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void t(defpackage.ascv r24, defpackage.arqv r25, boolean r26, defpackage.arqr r27, boolean r28, defpackage.arqv r29, defpackage.bwj r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yzc.t(ascv, arqv, boolean, arqr, boolean, arqv, bwj, int, int):void");
    }

    public static final void u(ascv ascvVar, arqv arqvVar, boolean z, arqr arqrVar, boolean z2, arqv arqvVar2, bwj bwjVar, int i) {
        int i2;
        arqv arqvVar3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i & 112;
        bwj c = bwjVar.c(666789380);
        if (i8 == 0) {
            if (true != c.I(arqvVar)) {
                i7 = 16;
            } else {
                i7 = 32;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
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
            if (true != c.I(arqrVar)) {
                i5 = 1024;
            } else {
                i5 = 2048;
            }
            i2 |= i5;
        }
        if ((57344 & i) == 0) {
            if (true != c.H(z2)) {
                i4 = 8192;
            } else {
                i4 = 16384;
            }
            i2 |= i4;
        }
        if ((458752 & i) == 0) {
            if (true != c.I(arqvVar2)) {
                i3 = 65536;
            } else {
                i3 = 131072;
            }
            i2 |= i3;
        }
        if (arqvVar == null) {
            arqvVar3 = afac.a;
        } else {
            arqvVar3 = arqvVar;
        }
        arqv arqvVar4 = arqvVar3;
        afad.a(new aepr(z2, 1), null, arqvVar4, null, null, null, jke.b, new yzl(ascvVar, 3), null, z, arqrVar, anfi.a("bugle.use_async_typography", "bugle"), arqvVar2, c, (i2 << 21) & 1879048192, (i2 >> 9) & 910, 314);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new kbg(ascvVar, arqvVar, z, arqrVar, z2, arqvVar2, i, 2);
        }
    }

    public static final zep v(int i) {
        if (i == zep.a.ordinal()) {
            return zep.a;
        }
        if (i == zep.b.ordinal()) {
            return zep.b;
        }
        if (i == zep.c.ordinal()) {
            return zep.c;
        }
        if (i == zep.d.ordinal()) {
            return zep.d;
        }
        if (i == zep.e.ordinal()) {
            return zep.e;
        }
        if (i == zep.f.ordinal()) {
            return zep.f;
        }
        throw new IllegalArgumentException(a.cb(i, "ordinal ", " does not match any entry of the enum"));
    }

    public static final void w(aehz aehzVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-262230002);
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
            enm enmVar = (enm) c.g(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            int i5 = rr.a;
            ro a = rr.a(c);
            if (a != null) {
                bxl.c(aehzVar, new eiw(aehzVar, a.c(), enmVar, 20, (int[]) null), c);
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zaf(aehzVar, i, 11);
        }
    }

    public static final void x(cit citVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        citVar.getClass();
        int i4 = i & 14;
        bwj c = bwjVar.c(1947308496);
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
            View view = (View) c.g(AndroidCompositionLocals_androidKt.f);
            agak agakVar = (agak) c.g(agas.a);
            des desVar = (des) c.g(dch.n);
            bxl.g(desVar, new wju(desVar, citVar, agakVar, view, (arpe) null, 7), c);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zaf(citVar, i, 12);
        }
    }

    public static final void y(zej zejVar, bwj bwjVar, int i) {
        int i2;
        boolean z;
        agaq agaqVar;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-754392025);
        if (i4 == 0) {
            if (true != c.G(zejVar)) {
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
            cas a = cak.a(zejVar.a, c);
            cas a2 = cak.a(zejVar.b, c);
            cas a3 = cak.a(zejVar.c, c);
            afaw afawVar = D(a2).a;
            c.y(-660367560);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = new cit();
                bwkVar.ad(T);
            }
            cit citVar = (cit) T;
            bwkVar.Y();
            if (zejVar.d.a) {
                c.y(1003633733);
                agak agakVar = (agak) c.g(agas.a);
                c.y(-660359815);
                Object T2 = bwkVar.T();
                if (T2 == bwj.a.a) {
                    if (agakVar == null || (agaqVar = agakVar.d()) == null) {
                        agaqVar = agaq.d;
                    }
                    byu byuVar = new byu(agaqVar, cav.a);
                    bwkVar.ad(byuVar);
                    T2 = byuVar;
                }
                byn bynVar = (byn) T2;
                bwkVar.Y();
                bxl.c(c.g(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()), new wup(agakVar, bynVar, 13, null), c);
                if (D(a2).b && ((agaq) bynVar.a()) != agaq.a) {
                    c.y(1004666498);
                    w(afawVar.b, c, 0);
                    bwkVar.Y();
                }
                bwkVar.Y();
            } else {
                c.y(1004781167);
                if (D(a2).b) {
                    c.y(1005712066);
                    w(afawVar.b, c, 0);
                    bwkVar.Y();
                }
                bwkVar.Y();
            }
            cga.a aVar = cga.e;
            ajw.e eVar = ajw.c;
            int i5 = cfq.a;
            cue a4 = akk.a(eVar, cfq.a.m, c, 0);
            int a5 = bwg.a(c);
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
            caw.b(c, a4, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a5))) {
                Integer valueOf = Integer.valueOf(a5);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b, cwl.a.c);
            c.y(1912085637);
            if (zejVar.d.a && ((!D(a2).b) & (c.g(lyb.a) instanceof yyx))) {
                z = true;
            } else {
                z = false;
            }
            bwkVar.Y();
            adom.bx(afawVar, null, null, null, z, c, 0, 14);
            adom.I(C(a).a, null, citVar, c, 384);
            yyb.k((zec) a3.a(), c, 0);
            yyb.m(C(a).b, c, 0);
            c.p();
            x(citVar, c, 6);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zaf(zejVar, i, 13);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v7 ??, still in use, count: 1, list:
          (r15v7 ?? I:java.lang.Object) from 0x01a7: INVOKE (r13v5 ?? I:bwk), (r15v7 ?? I:java.lang.Object) VIRTUAL call: bwk.ad(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:424)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public static final void z(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v7 ??, still in use, count: 1, list:
          (r15v7 ?? I:java.lang.Object) from 0x01a7: INVOKE (r13v5 ?? I:bwk), (r15v7 ?? I:java.lang.Object) VIRTUAL call: bwk.ad(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:424)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v0 ??
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
}
