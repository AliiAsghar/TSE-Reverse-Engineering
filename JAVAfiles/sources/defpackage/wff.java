package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessPendingMessagesAction;
import com.google.android.apps.messaging.shared.datamodel.action.WaitForRcsServiceConnectionAction;
import com.google.android.ims.rcsservice.ims.ImsRegistrationState;
import com.google.android.rcs.client.contacts.ContactsService;
import com.google.android.rcs.client.events.EventService;
import com.google.android.rcs.client.filetransfer.FileTransferService;
import com.google.android.rcs.client.ims.ImsConnectionTrackerService;
import com.google.android.rcs.client.locationsharing.LocationSharingService;
import com.google.android.rcs.client.messaging.RcsMessagingService;
import com.google.android.rcs.client.profile.RcsProfileService;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wff implements wfe {
    private static final AtomicBoolean a = new AtomicBoolean(false);
    private static final AtomicBoolean b = new AtomicBoolean(true);
    private static final alvi c = alvi.m("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl");
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final armf j;
    private final armf k;
    private final armf l;
    private final armf m;
    private final xyt n;
    private final armf o;
    private final armf p;
    private final armf q;
    private final List r = new CopyOnWriteArrayList();
    private final armf s;
    private final armf t;
    private final armf u;
    private final armf v;
    private final armf w;
    private final ppc x;
    private final armf y;

    public wff(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, xyt xytVar, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, armf armfVar16, armf armfVar17, yjf yjfVar, armf armfVar18, ppc ppcVar, armf armfVar19) {
        this.d = armfVar;
        this.e = armfVar2;
        this.f = armfVar3;
        this.g = armfVar4;
        this.h = armfVar5;
        this.i = armfVar6;
        this.j = armfVar7;
        this.k = armfVar8;
        this.l = armfVar9;
        this.m = armfVar10;
        this.n = xytVar;
        this.o = armfVar11;
        this.p = armfVar12;
        this.q = armfVar13;
        this.s = armfVar14;
        this.t = armfVar15;
        this.u = armfVar16;
        this.v = armfVar17;
        this.w = armfVar18;
        this.x = ppcVar;
        this.y = armfVar19;
        yaq yaqVar = (yaq) xytVar.a();
        aozy createBuilder = yam.a.createBuilder();
        yal yalVar = yjfVar.i() ? yal.ALL_ACTIVE_SUBSCRIPTIONS : yal.DEFAULT_SYSTEM_SUBSCRIPTION;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        yam yamVar = (yam) createBuilder.b;
        yamVar.c = yalVar.e;
        yamVar.b |= 1;
        yaqVar.j(this, (yam) createBuilder.s());
    }

    private final amhu p(int i) {
        qei a2 = ((vpk) this.w.b()).a(i);
        if (a2 != null) {
            return q(a2);
        }
        alvg alvgVar = (alvg) c.g();
        alvgVar.X(ydl.t, Integer.valueOf(i));
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "calculateRcsReadinessConditions", 348, "ChatReadinessManagerImpl.java")).q("Missing identity mapping for subId, assuming that RCS is disabled");
        return r(amwt.DISABLED_FROM_PREFERENCES, amuk.TRANSPORT_UNKNOWN);
    }

    private final amhu q(qei qeiVar) {
        amwt amwtVar;
        if (((adjc) this.v.b()).v(qeiVar.d)) {
            amwtVar = amwt.AVAILABLE;
        } else {
            amwtVar = amwt.DISABLED_SIM_ABSENT;
        }
        return r(amwtVar, ((xtj) this.s.b()).c(qeiVar).f);
    }

    private final amhu r(amwt amwtVar, amuk amukVar) {
        amhu amhuVar;
        akrh e = aktp.e("ChatReadinessManager::calculateRcsReadinessConditions");
        try {
            aozy createBuilder = amhu.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            amhu amhuVar2 = (amhu) apagVar;
            amhuVar2.c = amwtVar.E;
            amhuVar2.b |= 2;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            amhu amhuVar3 = (amhu) createBuilder.b;
            amhuVar3.o = amukVar.e;
            amhuVar3.b |= 16384;
            if (!amwtVar.equals(amwt.AVAILABLE)) {
                amhv c2 = ((vrn) ((xyt) this.q.b()).a()).c();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amhu amhuVar4 = (amhu) createBuilder.b;
                amhuVar4.d = c2.j;
                amhuVar4.b |= 4;
                int w = ((zxy) this.d.b()).w();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amhu amhuVar5 = (amhu) createBuilder.b;
                amhuVar5.e = w - 1;
                amhuVar5.b |= 8;
                amhuVar = (amhu) createBuilder.s();
                ((alvg) ((alvg) c.d()).h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "calculateRcsReadinessConditions", 377, "ChatReadinessManagerImpl.java")).t("calculateRcsReadinessConditions: RCS is not available. BugleRcsReadinessConditions: %s", amhuVar);
            } else {
                int v = v(Objects.equals(((yaq) this.n.a()).c(), yay.AVAILABLE));
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amhu amhuVar6 = (amhu) createBuilder.b;
                amhuVar6.r = v - 1;
                amhuVar6.b |= 131072;
                if (!amukVar.equals(amuk.TRANSPORT_SINGLE_REGISTRATION) && !amukVar.equals(amuk.TRANSPORT_RCS)) {
                    amhuVar = (amhu) createBuilder.s();
                    ((alvg) ((alvg) c.d()).h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "calculateRcsReadinessConditions", 399, "ChatReadinessManagerImpl.java")).t("calculateRcsReadinessConditions: BugleRcsReadinessConditions: %s", amhuVar);
                } else {
                    int v2 = v(((ImsConnectionTrackerService) this.g.b()).isConnected());
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amhu amhuVar7 = (amhu) createBuilder.b;
                    amhuVar7.g = v2 - 1;
                    amhuVar7.b |= 32;
                    int v3 = v(((LocationSharingService) this.h.b()).isConnected());
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amhu amhuVar8 = (amhu) createBuilder.b;
                    amhuVar8.h = v3 - 1;
                    amhuVar8.b |= 64;
                    int v4 = v(((FileTransferService) this.i.b()).isConnected());
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amhu amhuVar9 = (amhu) createBuilder.b;
                    amhuVar9.i = v4 - 1;
                    amhuVar9.b |= 128;
                    int v5 = v(((ContactsService) this.k.b()).isConnected());
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amhu amhuVar10 = (amhu) createBuilder.b;
                    amhuVar10.j = v5 - 1;
                    amhuVar10.b |= 256;
                    int v6 = v(((RcsProfileService) this.j.b()).isConnected());
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amhu amhuVar11 = (amhu) createBuilder.b;
                    amhuVar11.k = v6 - 1;
                    amhuVar11.b |= 512;
                    int v7 = v(((RcsMessagingService) this.m.b()).isConnected());
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amhu amhuVar12 = (amhu) createBuilder.b;
                    amhuVar12.q = v7 - 1;
                    amhuVar12.b |= 65536;
                    int v8 = v(((EventService) this.l.b()).isConnected());
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amhu amhuVar13 = (amhu) createBuilder.b;
                    amhuVar13.p = v8 - 1;
                    amhuVar13.b |= 32768;
                    try {
                        if (((ImsConnectionTrackerService) this.g.b()).isConnected()) {
                            ImsRegistrationState registrationState = ((ImsConnectionTrackerService) this.g.b()).getRegistrationState();
                            if (registrationState != null) {
                                int i = registrationState.a.l;
                                if (!createBuilder.b.isMutable()) {
                                    createBuilder.u();
                                }
                                amhu amhuVar14 = (amhu) createBuilder.b;
                                amhuVar14.b |= 1024;
                                amhuVar14.l = i;
                                int ordinal = registrationState.b.ordinal();
                                if (!createBuilder.b.isMutable()) {
                                    createBuilder.u();
                                }
                                amhu amhuVar15 = (amhu) createBuilder.b;
                                amhuVar15.b |= 2048;
                                amhuVar15.m = ordinal;
                            }
                            boolean isRegistered = ((ImsConnectionTrackerService) this.g.b()).isRegistered();
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            amhu amhuVar16 = (amhu) createBuilder.b;
                            amhuVar16.b |= 8192;
                            amhuVar16.n = isRegistered;
                        }
                    } catch (ajny e2) {
                        ((alvg) ((alvg) ((alvg) c.i()).g(e2)).h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "calculateSipReadinessConditions", (char) 428, "ChatReadinessManagerImpl.java")).q("Failed to get SIP connection status for determining RCS Readiness");
                    }
                    amhuVar = (amhu) createBuilder.s();
                    ((alvg) ((alvg) c.d()).h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "calculateRcsReadinessConditions", 392, "ChatReadinessManagerImpl.java")).D("calculateRcsReadinessConditions: Enabled ChatTransportType is: %s, BugleRcsReadinessConditions: %s", amukVar, amhuVar);
                }
            }
            e.close();
            return amhuVar;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Deprecated
    private final amhu s(Optional optional) {
        amwt d;
        vrn vrnVar = (vrn) ((xyt) this.q.b()).a();
        if (optional.isPresent()) {
            d = vrnVar.f(((Integer) optional.get()).intValue());
        } else {
            d = vrnVar.d();
        }
        return r(d, ((xtj) this.s.b()).d());
    }

    private final boolean t() {
        return amuk.TRANSPORT_TACHYGRAM.equals(((xtj) this.s.b()).d());
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r0 == 3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cb, code lost:
    
        if (r0 == 3) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean u(defpackage.amhu r7) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wff.u(amhu):boolean");
    }

    private static int v(boolean z) {
        if (z) {
            return 3;
        }
        return 2;
    }

    @Override // defpackage.yan
    public final void a(Intent intent) {
        if (t() && !intent.getBooleanExtra("noConnectivity", false)) {
            xzb.c("Bugle", "onConnectivityStateChanged: kicking off pending messages and notifying RcsOnReadyListeners if now connected");
            n();
        }
    }

    @Override // defpackage.yan
    public final void b(int i) {
        if (t() && i == 0) {
            xzb.c("Bugle", "onPhoneStateChanged: kicking off pending messages and notifying RcsOnReadyListeners if now connected");
            n();
        }
    }

    @Override // defpackage.wfe
    public final amhu c() {
        akrh e = aktp.e("ChatReadinessManager::getRcsReadinessConditions");
        try {
            amhu s = s(Optional.empty());
            e.close();
            return s;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.wfe
    public final amhu d(int i) {
        akrh e = aktp.e("ChatReadinessManager::getRcsReadinessConditions");
        try {
            amhu p = p(i);
            e.close();
            return p;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.wfe
    public final amhu e(qei qeiVar) {
        akrh e = aktp.e("ChatReadinessManager::getRcsReadinessConditions");
        try {
            amhu q = q(qeiVar);
            e.close();
            return q;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.wfe
    public final String f() {
        return g(c());
    }

    @Override // defpackage.wfe
    public final String g(amhu amhuVar) {
        int w;
        String str;
        vrn vrnVar = (vrn) ((xyt) this.q.b()).a();
        amwt b2 = amwt.b(amhuVar.c);
        if (b2 == null) {
            b2 = amwt.INVALID_PRE_KOTO;
        }
        amhv b3 = amhv.b(amhuVar.d);
        if (b3 == null) {
            b3 = amhv.UNKNOWN_UNINITIALIZED_REASON;
        }
        if (b2.equals(amwt.CARRIER_SETUP_PENDING) && ((zxy) this.d.b()).w() - 1 != 0) {
            int aG = akec.aG(w);
            if (aG != 1) {
                if (aG != 21) {
                    if (aG != 31) {
                        if (aG != 44) {
                            if (aG != 47) {
                                if (aG != 51) {
                                    if (aG != 11) {
                                        if (aG != 12) {
                                            if (aG != 41) {
                                                if (aG != 42) {
                                                    str = "null";
                                                } else {
                                                    str = "RCS_ONBOARDING_FLOW_COMPLETED_STARTED_PROVISIONING";
                                                }
                                            } else {
                                                str = "RCS_ONBOARDING_SAW_BOEW_DOUBLECHECK_DIALOG";
                                            }
                                        } else {
                                            str = "RCS_ONBOARDING_SAW_PROMO_UPSELL_RECTIFIED";
                                        }
                                    } else {
                                        str = "RCS_ONBOARDING_SAW_PROMO_UPSELL";
                                    }
                                } else {
                                    str = "RCS_ONBOARDING_FLOW_COMPLETED_SAW_CHECKMARK";
                                }
                            } else {
                                str = "RCS_ONBOARDING_SAW_TERMS_AND_CONDITIONS_DOUBLECHECK_DIALOG";
                            }
                        } else {
                            str = "RCS_ONBOARDING_SAW_TERMS_AND_CONDITIONS";
                        }
                    } else {
                        str = "RCS_ONBOARDING_SAW_BOEW_SYSTEM_DIALOG";
                    }
                } else {
                    str = "RCS_ONBOARDING_SAW_FULL_SCREEN_PROMO";
                }
            } else {
                str = "RCS_ONBOARDING_UNKNOWN";
            }
            if (aG != 0) {
                return str;
            }
            throw null;
        }
        if (!amwt.AVAILABLE.equals(b2)) {
            return vrnVar.g(b2, b3);
        }
        amuk amukVar = amuk.TRANSPORT_TACHYGRAM;
        amuk b4 = amuk.b(amhuVar.o);
        if (b4 == null) {
            b4 = amuk.TRANSPORT_UNKNOWN;
        }
        if (amukVar.equals(b4)) {
            int R = a.R(amhuVar.r);
            if (R == 0 || R != 3) {
                return "No network connection";
            }
            return "RCS appears to be active";
        }
        int R2 = a.R(amhuVar.p);
        if (R2 != 0 && R2 == 3) {
            int R3 = a.R(amhuVar.g);
            if (R3 != 0 && R3 == 3) {
                int R4 = a.R(amhuVar.h);
                if (R4 != 0 && R4 == 3) {
                    int R5 = a.R(amhuVar.i);
                    if (R5 != 0 && R5 == 3) {
                        int R6 = a.R(amhuVar.j);
                        if (R6 != 0 && R6 == 3) {
                            int R7 = a.R(amhuVar.k);
                            if (R7 != 0 && R7 == 3) {
                                int R8 = a.R(amhuVar.q);
                                if (R8 != 0 && R8 == 3) {
                                    if (!amhuVar.n) {
                                        if ((amhuVar.b & 1024) != 0) {
                                            return "RCS not connected to server: ".concat(new ImsRegistrationState(adsw.a(amhuVar.l), acok.a(amhuVar.m)).toString());
                                        }
                                        return "RCS is not connected to server and getImsRegistrationState is empty! This is a bug!";
                                    }
                                    return "RCS appears to be active";
                                }
                                return "RCS MessagingService not connected";
                            }
                            return "RCS ProfileService not connected";
                        }
                        return "RCS ContactsService not connected";
                    }
                    return "RCS FileTransferService not connected";
                }
                return "RCS LocationSharingService not connected";
            }
            return "RCS ImsConnectionTrackerService not connected";
        }
        return "RCS EventService not connected";
    }

    @Override // defpackage.wfe
    public final Set h() {
        return (Set) Collection.EL.stream(((xtj) this.s.b()).e()).filter(new uhe(this, 18)).collect(alls.b);
    }

    @Override // defpackage.wfe
    public final void i(wfd wfdVar) {
        this.r.add(wfdVar);
        if (l()) {
            wfdVar.a();
        }
    }

    @Override // defpackage.wfe
    public final void j(wfd wfdVar) {
        this.r.remove(wfdVar);
    }

    @Override // defpackage.wfe
    public final boolean k(qei qeiVar) {
        akrh e = aktp.e("ChatReadinessManager::isReadyToSendAndReceiveChat");
        try {
            boolean u = u(q(qeiVar));
            e.close();
            return u;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.wfe
    public final boolean l() {
        akrh e = aktp.e("ChatReadinessManager::readyToSendAndReceiveChat");
        try {
            boolean u = u(c());
            e.close();
            return u;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.wfe
    public final boolean m(int i) {
        amhu s;
        akrh e = aktp.e("ChatReadinessManager::readyToSendAndReceiveChatWithSubId");
        try {
            if (((olt) this.y.b()).a()) {
                s = p(i);
            } else {
                s = s(Optional.of(Integer.valueOf(i)));
            }
            boolean u = u(s);
            e.close();
            return u;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.wfe
    public final void n() {
        boolean l = l();
        AtomicBoolean atomicBoolean = b;
        if (!atomicBoolean.get()) {
            ((alvg) ((alvg) c.g()).h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "kickOffPendingIfNowConnected", 253, "ChatReadinessManagerImpl.java")).q("shouldLaunchPostReadyWork is false. Returning from the method");
            return;
        }
        if (l) {
            alvi alviVar = c;
            ((alvg) ((alvg) alviVar.g()).h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "kickOffPendingIfNowConnected", 258, "ChatReadinessManagerImpl.java")).q("kickOffPendingIfNowConnected: RCS is ready and it was off. Trigger scheduling: [scheduleProcessPendingMessagesActionForStartup, scheduleOnlyForCurrentProcess, maybeScheduleImmediately]");
            if (amuk.TRANSPORT_RCS.equals(((xtj) this.s.b()).d())) {
                ((alvg) ((alvg) alviVar.g()).h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "kickOffPendingIfNowConnected", 264, "ChatReadinessManagerImpl.java")).q("Trigger scheduling: [schedulePendingMessagesCatchup]");
                vyn vynVar = (vyn) this.t.b();
                if (((Boolean) vyn.a.e()).booleanValue()) {
                    vynVar.c().b();
                }
            }
            if (((ansy) ((poo) this.x).a.b()).e("bugle.send_rcs_immediately_when_network_connects")) {
                new ProcessPendingMessagesAction(1).w(0L);
            } else {
                rje.a();
            }
            ((rjm) this.f.b()).e(rvc.a, ruy.a, 3).F(0L);
            ((rjf) this.o.b()).a();
            atomicBoolean.set(false);
            Iterator it = this.r.iterator();
            while (it.hasNext()) {
                ((wfd) it.next()).a();
            }
            Iterator it2 = ((Set) this.u.b()).iterator();
            while (it2.hasNext()) {
                ((wfd) it2.next()).a();
            }
            return;
        }
        if (yay.AVAILABLE.equals(((yaq) this.n.a()).c())) {
            ((alvg) ((alvg) c.g()).h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "kickOffPendingIfNowConnected", 280, "ChatReadinessManagerImpl.java")).q("kickOffPendingIfNowConnected: RCS is not ready but RCS is available. Trigger scheduling: [processPendingMessagesActionForStartup]");
            rje.a();
        }
    }

    @Override // defpackage.wfe
    public final void o(wng wngVar) {
        if (!l()) {
            xzb.l("Bugle", "Rcs services not connected. Queueing action");
            rgu rguVar = (rgu) this.e.b();
            lrf lrfVar = (lrf) rguVar.a.b();
            lrfVar.getClass();
            ibi ibiVar = (ibi) rguVar.b.b();
            ibiVar.getClass();
            new WaitForRcsServiceConnectionAction(lrfVar, ibiVar).r(wngVar);
        }
    }

    @Override // defpackage.yao
    public final void w() {
        if (t()) {
            if (yay.AVAILABLE.equals(((yaq) this.n.a()).c())) {
                xzb.c("Bugle", "onConnectivityStateChanged: kicking off pending messages and notifying RcsOnReadyListeners if now connected");
                n();
            }
        }
    }
}
