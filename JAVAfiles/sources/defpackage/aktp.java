package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Trace;
import android.view.View;
import android.view.ViewParent;
import com.google.android.apps.messaging.ui.attachment.video.VideoAttachmentView;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aktp {
    public static aklj A(algw algwVar, aklj akljVar) {
        if (algwVar.f()) {
            return new aklj((cj) algwVar.b());
        }
        akljVar.getClass();
        return akljVar;
    }

    public static ListenableFuture B(ListenableFuture listenableFuture, algk algkVar, Executor executor) {
        SettableFuture create = SettableFuture.create();
        albo.bR(listenableFuture, new aktn(new akwf(create), new akwg(algkVar, create), 2), new akwi(executor, create));
        return create;
    }

    public static TypedArray C(View view) {
        albo.U(view instanceof VideoAttachmentView, "Tried to @Inject @StyledAttributes TypedArray in a Peer not annotated by @Styleable. See g3doc.corp.google.com/java/com/google/apps/tiktok/g3doc/dagger/viewpeers.md#styleable for more information.");
        return ((VideoAttachmentView) view).a;
    }

    public static void D(Context context) {
        ((akwd) akec.w(context, akwd.class)).OC();
    }

    public static void E(Context context) {
        ((akwd) akec.w(context, akwd.class)).OC();
    }

    public static void F(Activity activity, Class cls, akvz akvzVar) {
        View findViewById = activity.findViewById(R.id.content);
        findViewById.getClass();
        bN(com.google.android.apps.messaging.R.id.tiktok_event_activity_listeners, findViewById, cls, akvzVar);
    }

    public static void G(bw bwVar, Class cls, akvz akvzVar) {
        View M = M(bwVar);
        M.getClass();
        bN(com.google.android.apps.messaging.R.id.tiktok_event_fragment_listeners, M, cls, akvzVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void H(cg cgVar, Class cls, akvz akvzVar) {
        View view = cgVar.Q;
        if (view == null) {
            d.t(cgVar instanceof akwc, "Fragments without views must implement EventReceiver to add a listener!");
            ((akwc) cgVar).o(cls, akvzVar);
        } else {
            bN(com.google.android.apps.messaging.R.id.tiktok_event_fragment_listeners, view, cls, akvzVar);
        }
    }

    public static void I(View view, Class cls, akvz akvzVar) {
        bN(com.google.android.apps.messaging.R.id.tiktok_event_view_listeners, view, cls, akvzVar);
    }

    public static void J(akvv akvvVar, Activity activity) {
        View findViewById = activity.findViewById(R.id.content);
        findViewById.getClass();
        bO(com.google.android.apps.messaging.R.id.tiktok_event_activity_listeners, akvvVar, findViewById);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void K(akvv akvvVar, cg cgVar) {
        boolean z;
        View view = cgVar.Q;
        if (view == null) {
            aiut.c();
            if (cgVar instanceof akwc) {
                akwa e = ((akwc) cgVar).e(akvvVar);
                if (e == akwa.a) {
                    return;
                }
                if (e != akwa.b) {
                    akvvVar = e.c;
                }
            }
            cg cgVar2 = cgVar.E;
            if (cgVar2 != null) {
                K(akvvVar, cgVar2);
                return;
            }
            cj fe = cgVar.fe();
            if (fe != null) {
                z = true;
            } else {
                z = false;
            }
            d.t(z, "Fragments must be attached to an Activity to receive events!");
            J(akvvVar, fe);
            return;
        }
        bO(com.google.android.apps.messaging.R.id.tiktok_event_fragment_listeners, akvvVar, view);
    }

    public static void L(akvv akvvVar, View view) {
        view.getClass();
        bO(com.google.android.apps.messaging.R.id.tiktok_event_view_listeners, akvvVar, view);
    }

    public static View M(bw bwVar) {
        View view = bwVar.Q;
        if (view == null) {
            Dialog dialog = bwVar.d;
            if (dialog != null) {
                return dialog.findViewById(R.id.content);
            }
            return null;
        }
        return view;
    }

    public static void N(bw bwVar) {
        View view;
        O(bwVar);
        View M = M(bwVar);
        cg cgVar = bwVar.E;
        if (cgVar == null) {
            view = bwVar.fe().findViewById(R.id.content);
        } else if (cgVar instanceof bw) {
            view = M((bw) cgVar);
        } else {
            view = cgVar.Q;
        }
        M.getClass();
        M.setTag(com.google.android.apps.messaging.R.id.tiktok_event_parent, view);
    }

    public static void O(bw bwVar) {
        if (bwVar.c && M(bwVar) == null) {
            throw new IllegalStateException("DialogFragment is being used as a dialog. Must return a valid view in onCreateView() or a valid Dialog in onCreateDialog().");
        }
        if (!bwVar.c && bwVar.Q == null) {
            throw new IllegalStateException("DialogFragment not being used as a dialog. Must return a valid view in onCreateView() -- onCreateDialog() is not called.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.akvq P(defpackage.aktq r18, android.util.SparseArray r19, float r20) {
        /*
            Method dump skipped, instructions count: 956
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aktp.P(aktq, android.util.SparseArray, float):akvq");
    }

    public static void Q(cg cgVar, Intent intent) {
        Intent intent2 = new Intent(intent);
        akti r = akto.r(intent2);
        try {
            cgVar.au(intent2);
            r.close();
        } catch (Throwable th) {
            try {
                r.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static acil R(acil acilVar) {
        return new vdn(aktr.b(), acilVar, 8);
    }

    public static acim S(acim acimVar) {
        return new vdo(aktr.b(), acimVar, 3);
    }

    public static ListenableFuture T(ListenableFuture listenableFuture, Class cls, algk algkVar, Executor executor) {
        return ancd.f(listenableFuture, cls, akto.a(algkVar), executor);
    }

    public static ListenableFuture U(ListenableFuture listenableFuture, Class cls, ancs ancsVar, Executor executor) {
        return ancd.g(listenableFuture, cls, akto.d(ancsVar), executor);
    }

    public static ListenableFuture V(Runnable runnable, Executor executor) {
        return albo.bL(akto.j(runnable), executor);
    }

    public static ListenableFuture W(Callable callable, Executor executor) {
        return albo.bM(akto.k(callable), executor);
    }

    public static ListenableFuture X(ancr ancrVar, Executor executor) {
        return albo.bN(akto.c(ancrVar), executor);
    }

    public static ListenableFuture Y(ListenableFuture listenableFuture, algk algkVar, Executor executor) {
        return ancj.f(listenableFuture, akto.a(algkVar), executor);
    }

    public static ListenableFuture Z(ListenableFuture listenableFuture, ancs ancsVar, Executor executor) {
        return ancj.g(listenableFuture, akto.d(ancsVar), executor);
    }

    public static final arpi a(arpi arpiVar) {
        aksb akrvVar;
        arpiVar.getClass();
        arpi minusKey = arpiVar.minusKey(aktz.a);
        aktz aktzVar = (aktz) arpiVar.get(aktz.a);
        if (aktzVar != null) {
            akrvVar = aktzVar.b;
        } else {
            akrvVar = new akrv(0);
        }
        return minusKey.plus(h(akrvVar, true, 2));
    }

    public static final /* synthetic */ amtv aA(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (amtv) s;
    }

    public static final /* synthetic */ ampq aB(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (ampq) s;
    }

    public static final void aC(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ampq ampqVar = (ampq) aozyVar.b;
        ampq ampqVar2 = ampq.a;
        ampqVar.b |= 1;
        ampqVar.c = i;
    }

    public static final void aD(aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ampq ampqVar = (ampq) aozyVar.b;
        ampq ampqVar2 = ampq.a;
        ampqVar.b |= 2;
        ampqVar.d = true;
    }

    public static final /* synthetic */ amyj aE(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (amyj) s;
    }

    public static final /* synthetic */ amyc aF(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (amyc) s;
    }

    public static final void aG(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amyc amycVar = (amyc) aozyVar.b;
        amyc amycVar2 = amyc.a;
        amycVar.c = a.ao(i);
        amycVar.b |= 1;
    }

    public static final /* synthetic */ amrr aH(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (amrr) s;
    }

    public static final void aI(String str, aozy aozyVar) {
        str.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amrr amrrVar = (amrr) aozyVar.b;
        amrr amrrVar2 = amrr.a;
        amrrVar.b |= 1;
        amrrVar.c = str;
    }

    public static final void aJ(aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amrr amrrVar = (amrr) aozyVar.b;
        amrr amrrVar2 = amrr.a;
        amrrVar.b |= 2;
        amrrVar.d = "";
    }

    public static final /* synthetic */ amyb aK(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (amyb) s;
    }

    public static final /* synthetic */ amro aL(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (amro) s;
    }

    public static final void aM(amrn amrnVar, aozy aozyVar) {
        amrnVar.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amro amroVar = (amro) aozyVar.b;
        amro amroVar2 = amro.a;
        amroVar.c = amrnVar.f;
        amroVar.b |= 1;
    }

    public static final /* synthetic */ amxs aN(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (amxs) s;
    }

    public static final void aO(amxr amxrVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amxs amxsVar = (amxs) aozyVar.b;
        amxs amxsVar2 = amxs.a;
        amxsVar.e = amxrVar.l;
        amxsVar.b |= 1;
    }

    public static final void aP(lwz lwzVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amxs amxsVar = (amxs) aozyVar.b;
        amxs amxsVar2 = amxs.a;
        amxsVar.h = lwzVar.d;
        amxsVar.b |= 8;
    }

    public static final void aQ(aozb aozbVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amxs amxsVar = (amxs) aozyVar.b;
        amxs amxsVar2 = amxs.a;
        amxsVar.b |= 2;
        amxsVar.f = aozbVar;
    }

    public static final /* synthetic */ amxq aR(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (amxq) s;
    }

    public static final void aS(amxp amxpVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amxq amxqVar = (amxq) aozyVar.b;
        amxq amxqVar2 = amxq.a;
        amxqVar.f = amxpVar;
        amxqVar.b |= 8;
    }

    public static final void aT(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amxq amxqVar = (amxq) aozyVar.b;
        amxq amxqVar2 = amxq.a;
        amxqVar.e = i - 1;
        amxqVar.b |= 4;
    }

    public static final /* synthetic */ amxn aU(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (amxn) s;
    }

    public static final void aV(amxm amxmVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amxn amxnVar = (amxn) aozyVar.b;
        amxn amxnVar2 = amxn.a;
        amxnVar.g = amxmVar;
        amxnVar.b |= 4;
    }

    public static final void aW(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amxn amxnVar = (amxn) aozyVar.b;
        amxn amxnVar2 = amxn.a;
        amxnVar.c = i - 1;
        amxnVar.b |= 1;
    }

    public static String aX(int i) {
        return Integer.toString(a.M(i));
    }

    public static final /* synthetic */ amxc aY(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (amxc) s;
    }

    public static final void aZ(amwx amwxVar, aozy aozyVar) {
        amwxVar.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amxc amxcVar = (amxc) aozyVar.b;
        amxc amxcVar2 = amxc.a;
        amxcVar.e = amwxVar.x;
        amxcVar.b |= 8;
    }

    public static void aa(ListenableFuture listenableFuture, andy andyVar, Executor executor) {
        albo.bR(listenableFuture, akto.h(andyVar), executor);
    }

    public static ListenableFuture ab(ListenableFuture listenableFuture, Callable callable, Executor executor) {
        return akec.f(listenableFuture, akto.k(callable), executor);
    }

    public static ListenableFuture ac(ListenableFuture listenableFuture, ancr ancrVar, Executor executor) {
        ListenableFuture bN = albo.bN(new aktk(akto.c(ancrVar), listenableFuture, 1), new ajzt((Object) listenableFuture, executor, 2));
        akec.g(listenableFuture, bN);
        return bN;
    }

    public static akul ad(Iterable iterable) {
        return akul.g(albo.bE(iterable));
    }

    public static akul ae() {
        return akul.g(albo.bG());
    }

    public static akul af(Throwable th) {
        return akul.g(albo.bH(th));
    }

    public static akul ag(Object obj) {
        return akul.g(albo.bI(obj));
    }

    public static akul ah(Runnable runnable, Executor executor) {
        return akul.g(V(runnable, executor));
    }

    public static akul ai(Callable callable, Executor executor) {
        return aj(new akdj(callable, 19), executor);
    }

    public static akul aj(ancr ancrVar, Executor executor) {
        return akul.g(X(ancrVar, executor));
    }

    public static akul ak(Iterable iterable) {
        return akul.g(albo.bO(iterable));
    }

    public static final boolean al(arpi arpiVar) {
        if (arpiVar.get(aktz.a) != null) {
            return true;
        }
        return false;
    }

    public static ahmn am(Iterable iterable) {
        return new ahmn(aq(iterable), null);
    }

    @SafeVarargs
    public static ahmn an(ListenableFuture... listenableFutureArr) {
        return new ahmn(ar(listenableFutureArr), null);
    }

    public static ahmn ao(Iterable iterable) {
        return new ahmn(new akmy(albo.bX(iterable)), null);
    }

    @SafeVarargs
    public static ahmn ap(ListenableFuture... listenableFutureArr) {
        return new ahmn(as(listenableFutureArr), null);
    }

    public static akmy aq(Iterable iterable) {
        return new akmy(albo.bV(iterable));
    }

    @SafeVarargs
    public static akmy ar(ListenableFuture... listenableFutureArr) {
        return new akmy(albo.bW(listenableFutureArr));
    }

    @SafeVarargs
    public static akmy as(ListenableFuture... listenableFutureArr) {
        return new akmy(albo.bY(listenableFutureArr));
    }

    public static int at(int i) {
        switch (i) {
            case 0:
                return 1;
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
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                return 34;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                return 35;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                return 36;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                return 37;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                return 38;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                return 39;
            case 39:
                return 40;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                return 41;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                return 42;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
            case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
            default:
                return 0;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                return 46;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                return 47;
            case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
        }
    }

    public static String au(int i) {
        return Integer.toString(a.an(i));
    }

    public static String av(int i) {
        return Integer.toString(a.au(i));
    }

    public static String aw(int i) {
        return Integer.toString(a.ak(i));
    }

    public static final /* synthetic */ amyq ax(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (amyq) s;
    }

    public static final /* synthetic */ amyn ay(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (amyn) s;
    }

    public static final void az(amyq amyqVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amyn amynVar = (amyn) aozyVar.b;
        amyn amynVar2 = amyn.a;
        amynVar.c = amyqVar;
        amynVar.b = 2;
    }

    public static final boolean b(long j, float f) {
        if ((((int) j) & 1073741823) < ((int) (f * 1.0737418E9f))) {
            return true;
        }
        return false;
    }

    public static final void bA(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ampa ampaVar = (ampa) aozyVar.b;
        ampa ampaVar2 = ampa.a;
        ampaVar.c = i - 1;
        ampaVar.b |= 1;
    }

    public static final /* synthetic */ ahmn bB(aozy aozyVar) {
        aozyVar.getClass();
        return new ahmn(aozyVar, null);
    }

    public static final /* synthetic */ ahlp bC(aozy aozyVar) {
        aozyVar.getClass();
        return new ahlp(aozyVar);
    }

    public static final /* synthetic */ ahlp bD(aozy aozyVar) {
        aozyVar.getClass();
        return new ahlp(aozyVar);
    }

    public static final /* synthetic */ ahlp bE(aozy aozyVar) {
        aozyVar.getClass();
        return new ahlp(aozyVar);
    }

    public static final /* synthetic */ ahmn bF(aozy aozyVar) {
        aozyVar.getClass();
        return new ahmn(aozyVar, null);
    }

    public static aohs bG(Activity activity) {
        return ((akvw) aovp.m(activity, akvw.class)).XE();
    }

    public static aohs bH(cg cgVar) {
        return ((akvx) aovp.m(cgVar, akvx.class)).w();
    }

    public static aqrs bI(armf armfVar, aknj aknjVar, atii atiiVar, algw algwVar) {
        aojy aojyVar = aknjVar.a;
        String str = aojyVar.a().a;
        aqrs aqrsVar = (aqrs) ((ConcurrentHashMap) atiiVar.b).get(aojyVar);
        int i = 0;
        int i2 = 1;
        if (aqrsVar == null) {
            aqrs aqrsVar2 = (aqrs) ((ConcurrentHashMap) atiiVar.a).get(str);
            if (aqrsVar2 == null) {
                alob alobVar = new alob();
                alobVar.h(aotl.D(new aolb(atiiVar, 2)));
                if (((aojr) atiiVar.c).h == null) {
                    alobVar.h(new akux(3));
                } else {
                    alobVar.h(new akux(2));
                    alobVar.h(aotl.D(new ahjy(11)));
                }
                alobVar.h(new aola());
                Object obj = atiiVar.c;
                alobVar.h(aotl.D(new ahjy(12)));
                alobVar.h(aotl.D(new aolb(atiiVar, i2)));
                aqrsVar2 = apsd.s(new aolg(str, (aojr) atiiVar.c), alobVar.g());
                aqrs aqrsVar3 = (aqrs) ((ConcurrentHashMap) atiiVar.a).putIfAbsent(str, aqrsVar2);
                if (aqrsVar3 != null) {
                    aqrsVar2 = aqrsVar3;
                }
            }
            aqrsVar = apsd.t(aqrsVar2, aotl.D(new aolb(aojyVar, i)));
            aqrs aqrsVar4 = (aqrs) ((ConcurrentHashMap) atiiVar.b).putIfAbsent(aojyVar, aqrsVar);
            if (aqrsVar4 != null) {
                aqrsVar = aqrsVar4;
            }
        }
        return apsd.t(aqrsVar, aotl.D(new acss(armfVar, 15)));
    }

    private static boolean bJ(Context context) {
        if (context == null) {
            return true;
        }
        if (context instanceof cj) {
            if (!((cj) context).a().ab()) {
                return true;
            }
            return false;
        }
        if (!(context instanceof ContextWrapper)) {
            return true;
        }
        return bJ(((ContextWrapper) context).getBaseContext());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static View bK(ViewParent viewParent) {
        if (viewParent instanceof View) {
            return (View) viewParent;
        }
        if (viewParent != 0) {
            return bK(viewParent.getParent());
        }
        return null;
    }

    private static vl bL(int i, View view) {
        return (vl) view.getTag(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [akvv, java.lang.Object] */
    private static algw bM(int i, View view, algw algwVar) {
        akwa akwaVar;
        if (algwVar.f()) {
            ?? b = algwVar.b();
            vl bL = bL(i, view);
            if (bL != null && !bL.isEmpty()) {
                Class<?> cls = b.getClass();
                int i2 = 0;
                while (true) {
                    if (i2 < bL.d) {
                        Class cls2 = (Class) bL.d(i2);
                        akvz akvzVar = (akvz) bL.g(i2);
                        if (cls2.isAssignableFrom(cls)) {
                            akwaVar = akvzVar.a(b);
                            akwaVar.getClass();
                            break;
                        }
                        i2++;
                    } else {
                        akwaVar = akwa.b;
                        break;
                    }
                }
            } else {
                akwaVar = akwa.b;
            }
            if (akwaVar == akwa.a) {
                return alfd.a;
            }
            if (akwaVar != akwa.b) {
                return algw.i(akwaVar.c);
            }
        }
        return algwVar;
    }

    private static void bN(int i, View view, Class cls, akvz akvzVar) {
        aiut.c();
        vl bL = bL(i, view);
        if (bL == null) {
            bL = new tm();
            view.setTag(i, bL);
        }
        for (int i2 = 0; i2 < bL.d; i2++) {
            Class<?> cls2 = (Class) bL.d(i2);
            if (!cls.equals(cls2)) {
                if (!cls.isAssignableFrom(cls2)) {
                    if (cls2.isAssignableFrom(cls)) {
                        throw new IllegalArgumentException(String.format(Locale.US, "For class %s, a listener is already registered as a supertype: %s", cls.getSimpleName(), cls2.getSimpleName()));
                    }
                } else {
                    throw new IllegalArgumentException(String.format(Locale.US, "For class %s, a listener is already registered as a subtype: %s", cls.getSimpleName(), cls2.getSimpleName()));
                }
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "Class %s is already registered as a listener. Are you adding the same View instance twice?", cls.getSimpleName()));
            }
        }
        bL.put(cls, akvzVar);
    }

    private static void bO(int i, akvv akvvVar, View view) {
        aiut.c();
        algw i2 = algw.i(akvvVar);
        View view2 = view;
        while (view2 != null) {
            if (view2 != view || i == com.google.android.apps.messaging.R.id.tiktok_event_view_listeners) {
                i2 = bM(com.google.android.apps.messaging.R.id.tiktok_event_view_listeners, view2, i2);
            }
            if (view2 != view || i != com.google.android.apps.messaging.R.id.tiktok_event_activity_listeners) {
                i2 = bM(com.google.android.apps.messaging.R.id.tiktok_event_fragment_listeners, view2, i2);
            }
            i2 = bM(com.google.android.apps.messaging.R.id.tiktok_event_activity_listeners, view2, i2);
            if (i2.f()) {
                Object tag = view2.getTag(com.google.android.apps.messaging.R.id.tiktok_event_parent);
                if (tag != null && !(tag instanceof View)) {
                    throw new IllegalStateException("Invalid tag returned: " + String.valueOf(tag.getClass()) + tag.toString() + " for view " + view2.toString());
                }
                View view3 = (View) tag;
                if (view3 != null) {
                    view2 = view3;
                } else {
                    view2 = bK(view2.getParent());
                }
            } else {
                return;
            }
        }
    }

    public static final void ba(amwy amwyVar, aozy aozyVar) {
        amwyVar.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amxc amxcVar = (amxc) aozyVar.b;
        amxc amxcVar2 = amxc.a;
        amxcVar.f = amwyVar.f;
        amxcVar.b |= 16;
    }

    public static final void bb(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amxc amxcVar = (amxc) aozyVar.b;
        amxc amxcVar2 = amxc.a;
        amxcVar.d = i - 1;
        amxcVar.b |= 4;
    }

    public static final /* synthetic */ amxb bc(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (amxb) s;
    }

    public static final void bd(amxc amxcVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amxb amxbVar = (amxb) aozyVar.b;
        amxb amxbVar2 = amxb.a;
        amxbVar.c = amxcVar;
        amxbVar.b |= 1;
    }

    public static final /* synthetic */ amtf be(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (amtf) s;
    }

    public static final void bf(boolean z, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amtf amtfVar = (amtf) aozyVar.b;
        amtf amtfVar2 = amtf.a;
        amtfVar.b |= 4;
        amtfVar.e = z;
    }

    public static final void bg(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amtf amtfVar = (amtf) aozyVar.b;
        amtf amtfVar2 = amtf.a;
        amtfVar.d = i - 1;
        amtfVar.b |= 2;
    }

    public static final void bh(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amtf amtfVar = (amtf) aozyVar.b;
        amtf amtfVar2 = amtf.a;
        amtfVar.c = i - 1;
        amtfVar.b |= 1;
    }

    public static final /* synthetic */ amsu bi(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (amsu) s;
    }

    public static final void bj(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amsu amsuVar = (amsu) aozyVar.b;
        amsu amsuVar2 = amsu.a;
        amsuVar.c = i - 1;
        amsuVar.b |= 1;
    }

    public static final void bk(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amsu amsuVar = (amsu) aozyVar.b;
        amsu amsuVar2 = amsu.a;
        amsuVar.d = i - 1;
        amsuVar.b |= 2;
    }

    public static final /* synthetic */ amst bl(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (amst) s;
    }

    public static final void bm(long j, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amst amstVar = (amst) aozyVar.b;
        apap apapVar = amst.a;
        amstVar.c |= 1;
        amstVar.d = j;
    }

    public static final void bn(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amst amstVar = (amst) aozyVar.b;
        apap apapVar = amst.a;
        amstVar.e = i - 1;
        amstVar.c |= 2;
    }

    public static final void bo(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amst amstVar = (amst) aozyVar.b;
        apap apapVar = amst.a;
        amstVar.g = i - 1;
        amstVar.c |= 8;
    }

    public static final void bp(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amst amstVar = (amst) aozyVar.b;
        apap apapVar = amst.a;
        amstVar.f = i - 1;
        amstVar.c |= 4;
    }

    public static final void bq(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amst amstVar = (amst) aozyVar.b;
        apap apapVar = amst.a;
        amstVar.h = i - 1;
        amstVar.c |= 16;
    }

    public static final void br(aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amst amstVar = (amst) aozyVar.b;
        apap apapVar = amst.a;
        amstVar.k = 1;
        amstVar.c |= 64;
    }

    public static final /* synthetic */ amrq bs(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (amrq) s;
    }

    public static final void bt(amrr amrrVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amrq amrqVar = (amrq) aozyVar.b;
        amrq amrqVar2 = amrq.a;
        amrqVar.e = amrrVar;
        amrqVar.d |= 1;
    }

    public static final /* synthetic */ ampk bu(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (ampk) s;
    }

    public static final /* synthetic */ amph bv(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (amph) s;
    }

    public static final void bw(String str, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amph amphVar = (amph) aozyVar.b;
        amph amphVar2 = amph.a;
        amphVar.b |= 1;
        amphVar.c = str;
    }

    public static final /* synthetic */ ampd bx(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (ampd) s;
    }

    public static final void by(ampy ampyVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ampd ampdVar = (ampd) aozyVar.b;
        ampd ampdVar2 = ampd.a;
        ampdVar.c = ampyVar;
        ampdVar.b |= 1;
    }

    public static final /* synthetic */ ampa bz(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (ampa) s;
    }

    public static String c() {
        akry c = akqj.c();
        if (c == null) {
            return "<no trace>";
        }
        return akqj.n(c);
    }

    public static void d() {
        akqj.y(false);
    }

    public static akrh e(String str) {
        return f(str, akrk.a);
    }

    public static akrh f(String str, akrl akrlVar) {
        return g(str, akrlVar, true);
    }

    public static akrh g(String str, akrl akrlVar, boolean z) {
        boolean z2;
        akry akryVar;
        akqv akqvVar;
        akru b = akqj.b();
        akry akryVar2 = b.c;
        if (akryVar2 == akrf.a) {
            akryVar2 = null;
            akqj.h(b, null);
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z3 = z2;
        if (akryVar2 == null) {
            UUID b2 = akqn.a.b();
            if (akrz.a()) {
                akqa akqaVar = new akqa();
                akqv.k();
                akqvVar = new akqv(b2, str, akrlVar, akqaVar, z, akqj.t(akqaVar), b);
            } else {
                akqa akqaVar2 = akqu.a;
                akqv.k();
                akqvVar = new akqv(b2, str, akrlVar, akqaVar2, z, false, b);
            }
            boolean z4 = akqvVar.a;
            akryVar = akqvVar;
            akryVar = akqvVar;
            if (!z4 && z) {
                akqj.x();
                akryVar = akqvVar;
            }
        } else if (akryVar2 instanceof akqc) {
            akryVar = ((akqc) akryVar2).f(str, akrlVar, z, b);
        } else {
            akryVar = akryVar2.m(str, akrlVar, b);
        }
        akqj.h(b, akryVar);
        return new akrh(akryVar, z3);
    }

    public static /* synthetic */ aktz h(aksb aksbVar, boolean z, int i) {
        boolean z2;
        if ((i & 1) != 0) {
            aksbVar = new akrv(0);
        }
        if ((i & 4) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        return new aktz(aksbVar, false, false, z & z2);
    }

    public static aksr i(Context context) {
        return ((akst) aovp.m(context, akst.class)).a();
    }

    public static aksr j(Context context) {
        return ((aksu) aovp.m(context, aksu.class)).a();
    }

    public static Set k(Context context) {
        return ((aksu) aovp.m(context, aksu.class)).A();
    }

    public static void l(akry akryVar) {
        Trace.beginSection(akqj.m(akryVar.c()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(akry akryVar) {
        if (o(akryVar)) {
            Trace.beginSection("<propagated>");
            l(akryVar);
        } else {
            if (akryVar.a() != null) {
                m(akryVar.a());
            }
            l(akryVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void n(akry akryVar) {
        if (o(akryVar)) {
            Trace.endSection();
            Trace.endSection();
        } else {
            Trace.endSection();
            if (akryVar.a() != null) {
                n(akryVar.a());
            }
        }
    }

    public static boolean o(akry akryVar) {
        if (akryVar.d() != Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public static final akry p(Intent intent) {
        long j = akto.a;
        return akto.p(intent, false);
    }

    public static final aksa q(Service service, String str) {
        aiut.c();
        return j(service).b(str);
    }

    public static akri r(aktp aktpVar) {
        akri d = akri.d(2);
        for (akry c = akqj.c(); c != null; c = c.a()) {
            d = c.j(aktpVar);
            if (d.c() - 1 == 0) {
                break;
            }
        }
        return d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        r2 = r0.j(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if ((r2.c() - 1) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r0 = r0.a();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.akri s(defpackage.aktp r5) {
        /*
            akry r0 = defpackage.akqj.c()
            java.util.List r1 = defpackage.akpw.b
            if (r0 != 0) goto Le
            r5 = 2
            akri r5 = defpackage.akri.d(r5)
            goto L42
        Le:
            r2 = 3
            akri r2 = defpackage.akri.d(r2)
        L13:
            if (r0 == 0) goto L41
            java.util.Iterator r3 = r1.iterator()
        L19:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L30
            java.lang.Object r4 = r3.next()
            aktp r4 = (defpackage.aktp) r4
            akri r4 = r0.j(r4)
            boolean r4 = r4.b()
            if (r4 == 0) goto L19
            goto L41
        L30:
            akri r2 = r0.j(r5)
            int r3 = r2.c()
            int r3 = r3 + (-1)
            if (r3 == 0) goto L41
            akry r0 = r0.a()
            goto L13
        L41:
            r5 = r2
        L42:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aktp.s(aktp):akri");
    }

    public static boolean t(View view) {
        return bJ(view.getContext());
    }

    public static /* synthetic */ boolean u(akry akryVar) {
        if (akryVar != null && !(akryVar instanceof akqc) && !(akryVar instanceof akqw) && !(akryVar instanceof akrf) && !(akryVar instanceof akra)) {
            return true;
        }
        return false;
    }

    public static final void v(Collection collection, Set set) {
        set.addAll(collection);
    }

    public static Map w(Set set) {
        tm tmVar = new tm();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = (AbstractMap.SimpleImmutableEntry) it.next();
            Set set2 = (Set) tmVar.get(simpleImmutableEntry.getKey());
            if (set2 == null) {
                set2 = Collections.newSetFromMap(new tm());
                tmVar.put((akno) simpleImmutableEntry.getKey(), set2);
            }
            set2.add((armf) simpleImmutableEntry.getValue());
        }
        return tmVar;
    }

    public static akmt x(Context context) {
        return (akmt) hkz.c(context);
    }

    public static akmt y(View view) {
        return (akmt) hkz.d(view);
    }

    public static final arwe z(arpi arpiVar, enh enhVar) {
        enhVar.getClass();
        aryj aryjVar = new aryj(null);
        enhVar.c(new akly(aryjVar, 0));
        return new aklz(arpiVar, aryjVar);
    }
}
