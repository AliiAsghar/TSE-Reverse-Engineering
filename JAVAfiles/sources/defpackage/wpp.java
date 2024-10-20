package defpackage;

import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.StrictMode;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.Collectors;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wpp {
    public final Object a;
    public final Object b;
    public final Object c;

    public wpp(Object obj, Object obj2, armf armfVar) {
        this.a = obj;
        this.c = obj2;
        this.b = armfVar;
    }

    public static final int D(Integer num) {
        if (num != null && num.intValue() == 2) {
            return 4;
        }
        if (num != null && num.intValue() == 1) {
            return 3;
        }
        if (num != null && num.intValue() == 0) {
            return 2;
        }
        return 1;
    }

    private static final boolean ah(wwz wwzVar, String str) {
        return d.F(wwzVar.c, str);
    }

    /* JADX WARN: Type inference failed for: r2v15, types: [armf, java.lang.Object] */
    private final aozy ai(String str, boolean z) {
        askq askqVar;
        aozy createBuilder = aqgb.a.createBuilder();
        aozy createBuilder2 = aqfl.a.createBuilder();
        int b = xws.b((Context) this.a);
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ((aqfl) createBuilder2.b).b = b;
        int c = xws.c((Context) this.a);
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ((aqfl) createBuilder2.b).c = c;
        int a = xws.a((Context) this.a);
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ((aqfl) createBuilder2.b).d = a;
        String d = xws.d((Context) this.a);
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        d.getClass();
        ((aqfl) apagVar).g = d;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        ((aqfl) createBuilder2.b).e = a.am(6);
        int A = ((vjs) this.b.b()).A();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ((aqfl) createBuilder2.b).f = arwi.H(A);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aqgb aqgbVar = (aqgb) createBuilder.b;
        aqfl aqflVar = (aqfl) createBuilder2.s();
        aqflVar.getClass();
        aqgbVar.f = aqflVar;
        aqgbVar.b |= 1;
        String uuid = UUID.randomUUID().toString();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        uuid.getClass();
        ((aqgb) apagVar2).c = uuid;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        ((aqgb) createBuilder.b).d = str;
        if (z) {
            ankp S = ((vyv) this.c).S();
            int i = vzo.a;
            int ordinal = S.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal == 4) {
                                askqVar = askq.ETHERNET;
                            } else {
                                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(S))));
                            }
                        } else {
                            askqVar = askq.WIFI;
                        }
                    } else {
                        askqVar = askq.MOBILE;
                    }
                } else {
                    askqVar = askq.ACCESS_NETWORK_TYPE_UNSPECIFIED;
                }
            } else {
                askqVar = askq.ACCESS_NETWORK_TYPE_UNSPECIFIED;
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((aqgb) createBuilder.b).i = askqVar.a();
        }
        return createBuilder;
    }

    static /* synthetic */ void t(wpp wppVar, ConversationIdType conversationIdType, yni yniVar, amzu amzuVar, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if ((i4 & 16) != 0) {
            i5 = 0;
        } else {
            i5 = i2;
        }
        if ((i4 & 32) != 0) {
            i6 = 0;
        } else {
            i6 = i3;
        }
        wppVar.n(conversationIdType, yniVar, amzuVar, i, i5, i6, null);
    }

    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, vau] */
    public final wgi A(String str, boolean z, String str2) {
        aozy createBuilder = wgi.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wgi wgiVar = (wgi) createBuilder.b;
        wgiVar.b |= 1;
        wgiVar.c = str;
        if (z) {
            aozy createBuilder2 = wge.a.createBuilder();
            apct b = apds.b(((xnv) this.c).f().toEpochMilli());
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            wge wgeVar = (wge) createBuilder2.b;
            b.getClass();
            wgeVar.c = b;
            wgeVar.b |= 1;
            wge wgeVar2 = (wge) createBuilder2.s();
            aozy createBuilder3 = wgh.a.createBuilder();
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            wgh wghVar = (wgh) createBuilder3.b;
            wgeVar2.getClass();
            wghVar.c = wgeVar2;
            wghVar.b |= 1;
            if (!aczv.x() || !aczv.X() ? aczf.z() : this.b.c(str2).x) {
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                wgh wghVar2 = (wgh) createBuilder3.b;
                wghVar2.e = a.an(4);
                wghVar2.b = 4 | wghVar2.b;
            }
            createBuilder.aa((wgh) createBuilder3.s());
        }
        return (wgi) createBuilder.s();
    }

    public final akul B(String str, wgi wgiVar) {
        return ((whj) this.a).f(str, wgiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0098, code lost:
    
        if (r1.isEmpty() != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ee  */
    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int C(defpackage.adiv r9) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wpp.C(adiv):int");
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    public final int E(qei qeiVar) {
        boolean z;
        qeiVar.getClass();
        qeh b = qeh.b(qeiVar.c);
        if (b == null) {
            b = qeh.UNKNOWN_TYPE;
        }
        if (b == qeh.PHONE) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        qeiVar.d.getClass();
        d.s(!arsd.M(r0));
        adji adjiVar = (adji) this.a.b();
        adae adaeVar = (adae) this.c.b();
        String str = qeiVar.d;
        str.getClass();
        Object orElseThrow = adjiVar.h(adaeVar.d(str)).orElseThrow(new uzg(19));
        orElseThrow.getClass();
        return ((adix) orElseThrow).a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final qwm F(qei qeiVar) {
        qeiVar.getClass();
        ?? r0 = this.b;
        qwm f = ((ryg) r0.b()).f(E(qeiVar));
        f.getClass();
        return f;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    public final qwm G(qei qeiVar) {
        boolean z;
        qeiVar.getClass();
        qeh b = qeh.b(qeiVar.c);
        if (b == null) {
            b = qeh.UNKNOWN_TYPE;
        }
        if (b == qeh.PHONE) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        qeiVar.d.getClass();
        d.s(!arsd.M(r0));
        adji adjiVar = (adji) this.a.b();
        adae adaeVar = (adae) this.c.b();
        String str = qeiVar.d;
        str.getClass();
        adix adixVar = (adix) arsd.k(adjiVar.h(adaeVar.d(str)));
        if (adixVar != null) {
            return ((ryg) this.b.b()).f(adixVar.a);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    public final void H(ConversationIdType conversationIdType) {
        ((vco) this.a.b()).u(vlm.NT_INCOMING_MESSAGE, ((vjs) this.b.b()).s(conversationIdType));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    public final void I(ConversationIdType conversationIdType, Duration duration, boolean z) {
        vco vcoVar = (vco) this.a.b();
        vkh vkhVar = (vkh) this.c.b();
        aozy createBuilder = vmq.a.createBuilder();
        String a = conversationIdType.a();
        aozy createBuilder2 = vmn.a.createBuilder();
        long millis = duration.toMillis();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        vmn vmnVar = (vmn) createBuilder2.b;
        vmnVar.b |= 1;
        vmnVar.c = millis;
        createBuilder.V(a, (vmn) createBuilder2.s());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        vmq vmqVar = (vmq) apagVar;
        vmqVar.b |= 2;
        vmqVar.e = false;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        vmq vmqVar2 = (vmq) createBuilder.b;
        vmqVar2.b |= 1;
        vmqVar2.d = false;
        vcoVar.v(vkhVar, (vmq) createBuilder.s(), z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    public final void J() {
        vco vcoVar = (vco) this.a.b();
        vkh vkhVar = (vkh) this.c.b();
        aozy createBuilder = vmq.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        vmq vmqVar = (vmq) apagVar;
        vmqVar.b |= 2;
        vmqVar.e = false;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        vmq vmqVar2 = (vmq) apagVar2;
        vmqVar2.b |= 1;
        vmqVar2.d = true;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        vmq vmqVar3 = (vmq) createBuilder.b;
        vmqVar3.b |= 4;
        vmqVar3.f = true;
        vcoVar.v(vkhVar, (vmq) createBuilder.s(), true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    public final void K() {
        vco vcoVar = (vco) this.a.b();
        vkh vkhVar = (vkh) this.c.b();
        aozy createBuilder = vmq.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        vmq vmqVar = (vmq) apagVar;
        vmqVar.b |= 2;
        vmqVar.e = false;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        vmq vmqVar2 = (vmq) createBuilder.b;
        vmqVar2.b |= 1;
        vmqVar2.d = false;
        vcoVar.v(vkhVar, (vmq) createBuilder.s(), true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    public final void L() {
        vco vcoVar = (vco) this.a.b();
        vkh vkhVar = (vkh) this.c.b();
        aozy createBuilder = vmq.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        vmq vmqVar = (vmq) apagVar;
        vmqVar.b |= 2;
        vmqVar.e = true;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        vmq vmqVar2 = (vmq) createBuilder.b;
        vmqVar2.b |= 1;
        vmqVar2.d = false;
        vcoVar.v(vkhVar, (vmq) createBuilder.s(), true);
    }

    public final dyk M(amme ammeVar) {
        PendingIntent d = ((luj) this.a).d("com.google.android.apps.messaging.shared.reportissue.LAUNCH_FEEDBACK_FROM_NOTIFICATION_ACTION", 3, ammeVar, null, null);
        String string = ((Context) this.c).getString(R.string.report_issue_action_text);
        d.getClass();
        dyj dyjVar = new dyj(R.drawable.ic_warning_light, string, d);
        dyjVar.d = true;
        return dyjVar.a();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    public final vfb N(long j, Optional optional, Callable callable, Supplier supplier) {
        anen anenVar = (anen) this.a.b();
        anenVar.getClass();
        vti vtiVar = (vti) this.b.b();
        vtiVar.getClass();
        vcs vcsVar = (vcs) this.c.b();
        vcsVar.getClass();
        return new vfb(anenVar, vtiVar, vcsVar, j, optional, callable, supplier);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    public final veq O(aqfn aqfnVar, Optional optional) {
        ves vesVar = (ves) this.b.b();
        vesVar.getClass();
        lpg lpgVar = (lpg) this.c.b();
        lpgVar.getClass();
        aqfnVar.getClass();
        return new veq(vesVar, lpgVar, aqfnVar, optional);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    public final veq P(tro troVar) {
        ves vesVar = (ves) this.a.b();
        vesVar.getClass();
        lpg lpgVar = (lpg) this.c.b();
        lpgVar.getClass();
        troVar.getClass();
        return new veq(vesVar, lpgVar, troVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, mce] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul Q(vdd vddVar, ListenableFuture listenableFuture) {
        mbm b;
        String str = vddVar.a;
        if (str == null) {
            b = new mbw();
        } else {
            b = this.b.b(str);
        }
        aktp.aa(listenableFuture, new vdc(this, b, vddVar, 0), this.a);
        return akul.g(listenableFuture);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [armf, java.lang.Object] */
    public final Object R(aqfn aqfnVar, arqv arqvVar) {
        akrh e = aktp.e("GrpcProxyFactory#create");
        try {
            adae adaeVar = (adae) this.c.b();
            String str = aqfnVar.c;
            str.getClass();
            vcq a = ((vdf) this.b.b()).a(adaeVar.d(str));
            vcv vcvVar = (vcv) this.a.b();
            aquc aqucVar = (aquc) Map.EL.computeIfAbsent(vcvVar.o, a, new vbk(vcvVar, 17));
            aqut d = vcvVar.d();
            aqucVar.getClass();
            Object a2 = arqvVar.a(aqucVar, d);
            armd.i(e, null);
            return a2;
        } finally {
        }
    }

    public final aozy S(String str) {
        return ai(str, false);
    }

    public final aozy T(String str) {
        return ai(str, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul U(List list) {
        aozy createBuilder = uzw.a.createBuilder();
        int i = 14;
        createBuilder.R((Iterable) Collection.EL.stream(list).map(new uzd(i)).collect(Collectors.toCollection(new uzg(2))));
        return ((vjs) this.c).D((uzw) createBuilder.s()).i(new uva(4), this.b).h(new uyi(i), this.b);
    }

    public final void V(MessageIdType messageIdType) {
        aozy createBuilder = uzw.a.createBuilder();
        createBuilder.S(messageIdType.a());
        ((vjs) this.c).F((uzw) createBuilder.s());
    }

    public final void W(MessageIdType messageIdType) {
        aozy createBuilder = uzw.a.createBuilder();
        createBuilder.S(messageIdType.a());
        ((vjs) this.c).E((uzw) createBuilder.s());
    }

    @Deprecated
    public final void X(List list) {
        aozy createBuilder = uzw.a.createBuilder();
        createBuilder.R((Iterable) Collection.EL.stream(list).map(new uzd(14)).collect(Collectors.toCollection(new uzg(2))));
        ((vjs) this.c).E((uzw) createBuilder.s());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nzq, java.lang.Object] */
    public final void Y(MessageIdType messageIdType, int i) {
        if (!this.a.a()) {
            V(messageIdType);
            return;
        }
        Object obj = this.c;
        aozy createBuilder = uzw.a.createBuilder();
        createBuilder.S(messageIdType.a());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        uzw uzwVar = (uzw) createBuilder.b;
        uzwVar.e = uzz.b(i);
        uzwVar.b |= 1;
        ((vjs) obj).F((uzw) createBuilder.s());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nzq, java.lang.Object] */
    public final void Z(MessageIdType messageIdType, int i) {
        if (!this.a.a()) {
            W(messageIdType);
            return;
        }
        Object obj = this.c;
        aozy createBuilder = uzw.a.createBuilder();
        createBuilder.S(messageIdType.a());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        uzw uzwVar = (uzw) createBuilder.b;
        uzwVar.e = uzz.b(i);
        uzwVar.b |= 1;
        ((vjs) obj).E((uzw) createBuilder.s());
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [armf, java.lang.Object] */
    public final void a(qgr qgrVar, rve rveVar, int i) {
        Object fu = ((algf) this.a).m().fu(qgrVar);
        if (fu != null) {
            atok atokVar = (atok) fu;
            if (!yad.a(atokVar)) {
                return;
            }
            maq maqVar = (maq) this.c.b();
            amfq amfqVar = (amfq) amfr.a.createBuilder();
            amfqVar.getClass();
            alzz.n(amfp.XSL_REQUEST_EVENT, amfqVar);
            aozy createBuilder = asgx.a.createBuilder();
            createBuilder.getClass();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            asgx asgxVar = (asgx) createBuilder.b;
            asgxVar.c = atokVar;
            asgxVar.b |= 1;
            if (rveVar.k()) {
                aozy createBuilder2 = asgv.a.createBuilder();
                createBuilder2.getClass();
                DesugarCollections.unmodifiableList(((asgv) createBuilder2.b).c).getClass();
                createBuilder2.bP(rveVar.f());
                apag s = createBuilder2.s();
                s.getClass();
                asgv asgvVar = (asgv) s;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                asgx asgxVar2 = (asgx) createBuilder.b;
                asgxVar2.d = asgvVar;
                asgxVar2.b |= 2;
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((asgx) createBuilder.b).f = atpj.b(21);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((asgx) createBuilder.b).g = arsd.at(45);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((asgx) createBuilder.b).e = a.aq(i);
            Instant f = ((xnv) this.b).f();
            f.getClass();
            apct k = aoue.k(f);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            asgx asgxVar3 = (asgx) createBuilder.b;
            asgxVar3.h = k;
            asgxVar3.b |= 4;
            apag s2 = createBuilder.s();
            s2.getClass();
            asgx asgxVar4 = (asgx) s2;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar = (amfr) amfqVar.b;
            amfrVar.aI = asgxVar4;
            amfrVar.e |= 16777216;
            maqVar.j((amfq) alzz.h(amfqVar).toBuilder());
            return;
        }
        throw new IllegalStateException(a.cc(qgrVar, "Converted trace id from ", " is null."));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [armf, java.lang.Object] */
    public final void aa(int i, ConversationIdType conversationIdType) {
        aktp.ah(new qq(this, i, conversationIdType, 20), (Executor) this.a.b());
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [armf, java.lang.Object] */
    public final void ab(int i, int i2, ConversationIdType conversationIdType) {
        aktp.ah(new uym(this, i, i2, conversationIdType, 0), (Executor) this.a.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul ac(aqfn aqfnVar) {
        return ((vhi) ((Optional) this.a).get()).e(aqfnVar.c).h(new ult(this, 10), this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul ad(aqfn aqfnVar) {
        return ((vhi) ((Optional) this.a).get()).b(aqfnVar).h(new ult(this, 11), this.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object ae(defpackage.arpe r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.uto
            if (r0 == 0) goto L13
            r0 = r6
            uto r0 = (defpackage.uto) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            uto r0 = new uto
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            arvb r1 = r0.c
            wpp r0 = r0.e
            defpackage.aqil.P(r6)
            goto L5f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            defpackage.aqil.P(r6)
            java.lang.Object r6 = r5.c
            arvb r6 = (defpackage.arvb) r6
            boolean r6 = r6.b()
            if (r6 == 0) goto L45
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L45:
            java.lang.Object r6 = r5.c
            java.lang.Object r2 = r5.b
            r0.e = r5
            r4 = r6
            arvb r4 = (defpackage.arvb) r4
            r0.c = r4
            r0.b = r3
            eij r2 = (defpackage.eij) r2
            asai r2 = r2.e
            java.lang.Object r0 = defpackage.arrn.U(r2, r0)
            if (r0 == r1) goto L74
            r1 = r6
            r6 = r0
            r0 = r5
        L5f:
            utn r6 = (defpackage.utn) r6
            boolean r6 = r6.b
            arvb r1 = (defpackage.arvb) r1
            r1.b = r6
            java.lang.Object r6 = r0.c
            arvb r6 = (defpackage.arvb) r6
            boolean r6 = r6.b()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wpp.ae(arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.function.Function] */
    public final File af(Context context, String str) {
        Object apply;
        apply = this.a.apply(context);
        return new File((File) apply, str);
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v9, types: [armf, java.lang.Object] */
    public final void ag(ConversationIdType conversationIdType, MessageIdType messageIdType, String str, Instant instant) {
        Object apply;
        agnw d;
        agnw d2;
        agnw d3;
        long parseLong = Long.parseLong(str);
        akrh e = aktp.e("ReportOperations#updateDeliveryReport");
        try {
            tex b = tfa.b();
            b.w("markFailedToDecrypt");
            b.d(new lce(messageIdType, parseLong, 10));
            tes tesVar = (tes) ((tev) b.b().n()).cO();
            int i = 3;
            int i2 = 11;
            if (tesVar == null) {
                tet a = tfa.a();
                a.c(messageIdType);
                a.d(parseLong);
                a.b(Optional.of(instant));
                tes a2 = a.a();
                d2 = agnc.d("$primary");
                d3 = agnc.d("$primary");
                agnc.a(d3, "read_reports", a2, new tbe(d2, 11), new ter(a2, i));
            } else {
                tet m = tesVar.m();
                m.b(Optional.of(instant));
                tes a3 = m.a();
                apply = new lce(messageIdType, parseLong, i2).apply(new tez());
                agpw agpwVar = new agpw((tez) apply);
                d = agnc.d("$primary");
                ((Boolean) d.r(new tdw((aglz) a3, agpwVar, d, i))).booleanValue();
            }
            if (((trz) this.b.b()).i()) {
                ((uhj) this.c.b()).j(conversationIdType, messageIdType, "read_reports");
            }
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

    public final wwz b() {
        wxa wxaVar = (wxa) ((AtomicReference) this.c).get();
        if (wxaVar != null) {
            wwz wwzVar = wxaVar.d;
            if (wwzVar == null) {
                return wwz.a;
            }
            return wwzVar;
        }
        return null;
    }

    public final adiv c(int i) {
        Object obj = ((ConcurrentHashMap) this.a).get(new adix(i));
        if (i < 0) {
            obj = null;
        }
        adiv adivVar = (adiv) obj;
        if (adivVar == null || adom.n(adivVar).a.length() == 0) {
            return null;
        }
        return adivVar;
    }

    public final Set d() {
        apax apaxVar;
        wxa wxaVar = (wxa) ((AtomicReference) this.c).get();
        if (wxaVar != null && (apaxVar = wxaVar.c) != null) {
            return aqjn.aE(apaxVar);
        }
        return null;
    }

    public final void e(wxa wxaVar) {
        ((AtomicReference) this.c).set(wxaVar);
    }

    public final akul f(qei qeiVar, String str) {
        qeh b = qeh.b(qeiVar.c);
        if (b == null) {
            b = qeh.UNKNOWN_TYPE;
        }
        if (b != qeh.GROUP) {
            return aktp.ag((aqfn) new xei().fu(qeiVar));
        }
        return g(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul g(String str) {
        xep xepVar = (xep) this.a.b();
        return xepVar.b(xep.a(str, amku.TACHYGRAM_GET_ROUTING_TOKEN)).h(new xdh(6), xepVar.d).h(new xeu(str, 13), this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul h(aqfn aqfnVar) {
        xep xepVar = (xep) this.a.b();
        return xepVar.b(xep.a(aqfnVar.c, amku.TACHYGRAM_TO_CHAT_API_INCOMING_MESSAGE_ADAPTER)).h(new wxv(xepVar, 19), xepVar.d).h(new xeu(this, 12), this.b);
    }

    public final void i(qgf qgfVar) {
        if ((qgfVar.b & 512) != 0) {
            qgr qgrVar = qgfVar.l;
            if (qgrVar == null) {
                qgrVar = qgr.a;
            }
            l(qgrVar, rve.a(qgfVar.f), 4);
        }
    }

    public final void j(qgf qgfVar) {
        if ((qgfVar.b & 512) != 0) {
            qgr qgrVar = qgfVar.l;
            if (qgrVar == null) {
                qgrVar = qgr.a;
            }
            l(qgrVar, rve.a(qgfVar.f), 9);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
    public final void k(atok atokVar, rve rveVar, int i, int i2) {
        if (!yad.a(atokVar)) {
            return;
        }
        maq maqVar = (maq) this.a.b();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.XSL_REQUEST_EVENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        aozy createBuilder = asgx.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        asgx asgxVar = (asgx) createBuilder.b;
        atokVar.getClass();
        asgxVar.c = atokVar;
        asgxVar.b |= 1;
        aozy createBuilder2 = asgv.a.createBuilder();
        createBuilder2.bP(rveVar.f());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        asgx asgxVar2 = (asgx) createBuilder.b;
        asgv asgvVar = (asgv) createBuilder2.s();
        asgvVar.getClass();
        asgxVar2.d = asgvVar;
        asgxVar2.b |= 2;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((asgx) createBuilder.b).f = atpj.b(27);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((asgx) createBuilder.b).e = a.aq(i);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((asgx) createBuilder.b).g = arsd.at(i2);
        apct b = apds.b(((xnv) this.c).f().toEpochMilli());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        asgx asgxVar3 = (asgx) createBuilder.b;
        b.getClass();
        asgxVar3.h = b;
        asgxVar3.b |= 4;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        asgx asgxVar4 = (asgx) createBuilder.s();
        asgxVar4.getClass();
        amfrVar2.aI = asgxVar4;
        amfrVar2.e |= 16777216;
        maqVar.j(amfqVar);
    }

    public final void l(qgr qgrVar, rve rveVar, int i) {
        k((atok) ((algf) this.b).m().fu(qgrVar), rveVar, i, 42);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ef, code lost:
    
        if (r15 != r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a8, code lost:
    
        if (r15 != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0091, code lost:
    
        if (r15 != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r15v9, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [arpi, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(defpackage.you r14, defpackage.arpe r15) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wpp.m(you, arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [arwe, java.lang.Object] */
    public final void n(ConversationIdType conversationIdType, yni yniVar, amzu amzuVar, int i, int i2, int i3, amzq amzqVar) {
        qjh.l(this.b, null, new ynj(this, conversationIdType, yniVar, i2, amzuVar, i, i3, amzqVar, null), 3);
    }

    public final void o(ConversationIdType conversationIdType, yni yniVar, amzu amzuVar, int i, int i2, int i3) {
        conversationIdType.getClass();
        yniVar.getClass();
        amzuVar.getClass();
        if (aqjn.B(amzu.REPORTED_SPAM, amzu.REPORTED_NOT_SPAM, amzu.BLOCKED, amzu.UNBLOCKED, amzu.DISMISSED_WARNING_BANNER).contains(amzuVar)) {
            t(this, conversationIdType, yniVar, amzuVar, i, i2, i3, 64);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void p(ConversationIdType conversationIdType, ParticipantsTable.BindData bindData, tqc tqcVar, amzu amzuVar, int i, int i2, int i3) {
        conversationIdType.getClass();
        amzuVar.getClass();
        aiut.b();
        o(conversationIdType, ((aiqj) this.a.b()).n(bindData, tqcVar), amzuVar, i, i2, i3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [armf, java.lang.Object] */
    public final void q(ConversationIdType conversationIdType) {
        yni yniVar;
        aiut.b();
        aiqj aiqjVar = (aiqj) this.a.b();
        aiut.b();
        swt a = sww.a();
        a.w("SpamLoggingMetadata#cacheMetadataForConversationDelete");
        a.c(new yec(conversationIdType, 14));
        if (a.b().K()) {
            yni yniVar2 = new yni(((xnv) aiqjVar.a.b()).f().toEpochMilli());
            aiqj.t(yniVar2, conversationIdType);
            aiqj.u(yniVar2, conversationIdType);
            aiqjVar.r(yniVar2, null, conversationIdType);
            aiqjVar.q(yniVar2, conversationIdType);
            aiqjVar.p(yniVar2, conversationIdType);
            ynr ynrVar = (ynr) aiqjVar.h.b();
            aiut.b();
            long a2 = ynrVar.a();
            yoa yoaVar = new yoa(yoc.a);
            yoaVar.w("SpamLoggingIds#getValidConversationLoggingIdsWithoutExpiringOldIds");
            yoaVar.c(new lce(conversationIdType, a2, 15));
            alog t = yoaVar.b().t();
            t.getClass();
            yniVar2.h = t;
            yniVar = yniVar2;
        } else {
            yniVar = null;
        }
        if (yniVar != null) {
            t(this, conversationIdType, yniVar, amzu.DELETED, 3, 0, 0, 112);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    public final yke r(yjo yjoVar, int i) {
        wyp wypVar = (wyp) this.c.b();
        wypVar.getClass();
        ykp ykpVar = (ykp) this.a.b();
        ykpVar.getClass();
        Context context = (Context) this.b.b();
        context.getClass();
        yjoVar.getClass();
        return new yke(wypVar, ykpVar, context, yjoVar, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [armf, java.lang.Object] */
    public final void s(String str) {
        ((mbl) this.c.b()).c(str);
        ((mbl) this.c.b()).a();
        ((ActivityManager) this.b.b()).clearApplicationUserData();
        yyb.am();
    }

    public final void u() {
        ((atal) this.c).j();
        ((atal) this.b).j();
        ((atal) this.a).j();
    }

    public final void v() {
        ((atal) this.c).k();
        ((atal) this.b).k();
        ((atal) this.a).k();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List, java.lang.Object] */
    public final void w(wng wngVar) {
        if (this.b.remove(wngVar) && this.b.isEmpty()) {
            Object obj = this.c;
            qiu.h(aktp.ah(new uql(obj, 19), ((wnb) obj).b));
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [arwe, java.lang.Object] */
    public final void x(amyn amynVar, String str) {
        qjh.l(this.c, null, new mmz(this, amynVar, str, (arpe) null, 19), 3);
    }

    public final void y(String str, int i) {
        str.getClass();
        aozy createBuilder = amyn.a.createBuilder();
        createBuilder.getClass();
        aozy createBuilder2 = amyq.a.createBuilder();
        createBuilder2.getClass();
        aozy createBuilder3 = amyp.a.createBuilder();
        createBuilder3.getClass();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        amyp amypVar = (amyp) createBuilder3.b;
        amypVar.c = i - 1;
        amypVar.b |= 1;
        apag s = createBuilder3.s();
        s.getClass();
        amyp amypVar2 = (amyp) s;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amyq amyqVar = (amyq) createBuilder2.b;
        amyqVar.c = amypVar2;
        amyqVar.b = 3;
        aktp.az(aktp.ax(createBuilder2), createBuilder);
        x(aktp.ay(createBuilder), str);
    }

    public final void z(String str, int i) {
        aozy createBuilder = amyn.a.createBuilder();
        createBuilder.getClass();
        aozy createBuilder2 = amys.a.createBuilder();
        createBuilder2.getClass();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amys amysVar = (amys) createBuilder2.b;
        amysVar.c = i - 1;
        amysVar.b |= 1;
        apag s = createBuilder2.s();
        s.getClass();
        amys amysVar2 = (amys) s;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amyn amynVar = (amyn) createBuilder.b;
        amynVar.c = amysVar2;
        amynVar.b = 3;
        x(aktp.ay(createBuilder), str);
    }

    public wpp(Object obj, Object obj2, Object obj3) {
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public wpp(Object obj, Object obj2, Object obj3, byte[] bArr) {
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public wpp(Object obj, Object obj2, Object obj3, char[] cArr) {
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public wpp(Object obj, Object obj2, Object obj3, short[] sArr) {
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public wpp(String str, String str2, Intent intent) {
        this.a = str;
        this.b = str2;
        this.c = intent;
    }

    public wpp(Function function) {
        this.b = "com.google.android.apps.messaging.shared.datamodel.richcard.RichCardMediaFileProvider";
        this.c = "richcard-";
        this.a = function;
    }

    public wpp(wcj wcjVar, was wasVar, wel welVar) {
        this.b = wcjVar;
        this.c = wasVar;
        this.a = welVar;
    }

    public wpp(wej wejVar, vzh vzhVar, anen anenVar) {
        this.a = vzhVar;
        this.c = anenVar;
        this.b = wejVar;
    }

    public wpp(agnw agnwVar) {
        this.a = Thread.currentThread().getStackTrace();
        this.c = StrictMode.getThreadPolicy();
        this.b = agnwVar;
    }

    public wpp(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
        armfVar4.getClass();
    }

    public wpp(armf armfVar, armf armfVar2, armf armfVar3, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
    }

    public wpp(armf armfVar, armf armfVar2, armf armfVar3, byte[] bArr, char[] cArr) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        this.a = armfVar;
        this.c = armfVar2;
        this.b = armfVar3;
    }

    public wpp(armf armfVar, armf armfVar2, armf armfVar3, byte[] bArr, char[] cArr, byte[] bArr2) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        this.b = armfVar;
        this.c = armfVar2;
        this.a = armfVar3;
    }

    public wpp(armf armfVar, armf armfVar2, armf armfVar3, short[] sArr) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
    }

    public wpp(arwe arweVar, armf armfVar, armf armfVar2) {
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.c = arweVar;
        this.a = armfVar;
        this.b = armfVar2;
    }

    public wpp(arwe arweVar, arwe arweVar2, eij eijVar) {
        arweVar.getClass();
        arweVar2.getClass();
        eijVar.getClass();
        this.a = arweVar;
        this.b = eijVar;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = arvb.a;
        this.c = new arvb(false, arvf.a);
    }

    public wpp(armf armfVar, Optional optional, Optional optional2) {
        optional.getClass();
        optional2.getClass();
        this.c = armfVar;
        this.a = optional;
        this.b = optional2;
    }

    public wpp(wnb wnbVar) {
        this.b = new ArrayList();
        this.c = wnbVar;
        this.a = new anew(andi.a);
    }

    public wpp(xnv xnvVar, anen anenVar) {
        this.c = xnvVar;
        this.a = new anew(anenVar);
        this.b = new AtomicReference();
    }

    public wpp(aolz aolzVar, Context context, anen anenVar) {
        context.getClass();
        anenVar.getClass();
        this.a = aolzVar;
        this.b = context;
        this.c = anenVar;
        HashMap hashMap = new HashMap();
        aqam.m("stargate.DatagramNotificationService", aode.U(context, new altx("com.google.android.apps.stargate"), anenVar), hashMap);
        aqam.m("stargate.SatelliteSessionStateNotificationService", aode.U(context, new altx("com.google.android.apps.stargate"), anenVar), hashMap);
        aolzVar.b(aqam.o(hashMap));
    }

    public wpp(armf armfVar, armf armfVar2, arwe arweVar, byte[] bArr) {
        armfVar.getClass();
        armfVar2.getClass();
        arweVar.getClass();
        this.a = armfVar;
        this.b = armfVar2;
        this.c = arweVar;
    }

    public wpp(armf armfVar, armf armfVar2, armf armfVar3, short[] sArr, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
    }

    public wpp(armf armfVar, armf armfVar2, armf armfVar3, char[] cArr, char[] cArr2) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
    }

    public wpp(rvw rvwVar, znj znjVar, armf armfVar) {
        rvwVar.getClass();
        armfVar.getClass();
        this.b = rvwVar;
        this.c = znjVar;
        this.a = armfVar;
    }

    public wpp() {
        this.c = new AtomicReference();
        this.b = new AtomicBoolean();
        this.a = new ConcurrentHashMap();
    }

    public wpp(armf armfVar, pvw pvwVar, xnv xnvVar) {
        armfVar.getClass();
        pvwVar.getClass();
        xnvVar.getClass();
        this.c = armfVar;
        this.a = pvwVar;
        this.b = xnvVar;
    }

    public wpp(Context context, armf armfVar, arwe arweVar) {
        context.getClass();
        armfVar.getClass();
        arweVar.getClass();
        this.b = context;
        this.a = armfVar;
        this.c = arweVar;
    }

    public wpp(armf armfVar, armf armfVar2, armf armfVar3, char[] cArr, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
    }

    public wpp(armf armfVar, armf armfVar2, armf armfVar3, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
    }

    public wpp(armf armfVar, armf armfVar2, armf armfVar3, byte[] bArr) {
        armfVar.getClass();
        this.c = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
    }

    public wpp(armf armfVar, armf armfVar2, armf armfVar3) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
    }

    public wpp(armf armfVar, armf armfVar2, arwe arweVar) {
        armfVar.getClass();
        armfVar2.getClass();
        arweVar.getClass();
        this.a = armfVar;
        this.c = armfVar2;
        this.b = arweVar;
    }

    public wpp(armf armfVar, armf armfVar2, arpi arpiVar) {
        armfVar.getClass();
        armfVar2.getClass();
        arpiVar.getClass();
        this.a = armfVar;
        this.c = armfVar2;
        this.b = arpiVar;
    }
}
