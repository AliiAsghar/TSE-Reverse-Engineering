package com.google.android.apps.messaging.shared.datamodel.action;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.datamodel.action.RecurringTelemetryUploaderAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.acvo;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.akul;
import defpackage.alpr;
import defpackage.amdy;
import defpackage.amip;
import defpackage.andi;
import defpackage.anen;
import defpackage.ansy;
import defpackage.armf;
import defpackage.ijq;
import defpackage.kli;
import defpackage.kva;
import defpackage.lig;
import defpackage.lso;
import defpackage.mbl;
import defpackage.mdr;
import defpackage.mds;
import defpackage.mfj;
import defpackage.mfo;
import defpackage.rbg;
import defpackage.rdk;
import defpackage.rfd;
import defpackage.uuf;
import defpackage.uuh;
import defpackage.wwn;
import defpackage.xhe;
import defpackage.xhl;
import defpackage.xze;
import defpackage.yxb;
import defpackage.zas;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RecurringTelemetryUploaderAction extends Action<Void> implements Parcelable {
    public final Context e;
    public final mfo f;
    public final mbl g;
    public final xhe h;
    public final armf i;
    public final xhl j;
    private final anen k;
    private final anen l;
    private final lig m;
    public static final xze a = xze.g("BugleUsageStatistics", "RecurringTelemetryUploaderAction");
    public static final uuf b = uuh.i(uuh.b, "recurring_telemetry_uploader_run_wipeout_detector", true);
    public static final uuf c = uuh.i(uuh.b, "reverse_sync_after_wipeout_in_telemetry_action", false);
    public static final long d = TimeUnit.MINUTES.toMillis(1);
    public static final Parcelable.Creator<Action<Void>> CREATOR = new rdk(9);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rfd NO();
    }

    public RecurringTelemetryUploaderAction(Context context, mfo mfoVar, mbl mblVar, lig ligVar, xhe xheVar, xhl xhlVar, anen anenVar, anen anenVar2, armf armfVar) {
        super(amdy.RECURRING_TELEMETRY_UPLOADER_ACTION);
        this.e = context;
        this.f = mfoVar;
        this.g = mblVar;
        this.m = ligVar;
        this.k = anenVar;
        this.l = anenVar2;
        this.h = xheVar;
        this.j = xhlVar;
        this.i = armfVar;
        this.u.r("retry_count", 0);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("RecurringTelemetryUploaderAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.RecurringTelemetryUpload.ExecuteAction.Latency";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v17, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v21, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [armf, java.lang.Object] */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akul fx() {
        akul akulVar;
        akul akulVar2;
        final akul akulVar3;
        final int a2 = this.u.a("retry_count");
        final akul ai = aktp.ai(new rbg(this, 2), this.k);
        final akul ai2 = aktp.ai(new kli(12), this.k);
        lig ligVar = this.m;
        Object obj = ligVar.c;
        mfo mfoVar = (mfo) obj;
        final akul i = akul.g(mfoVar.w.d()).h(new mdr(12), andi.a).i(new mfj(obj, mfoVar.s.f().toEpochMilli(), 0), mfoVar.x);
        final akul ai3 = aktp.ai(new kva(ligVar, 16), ligVar.b);
        alpr alprVar = new alpr();
        if (((ansy) ((acvo) ligVar.l).a.b()).e("cslib.enable_recurring_metrics_availability_update_for_eligible_sims")) {
            akulVar = ((wwn) ligVar.h.b()).c();
        } else {
            akulVar = ((wwn) ligVar.h.b()).b();
        }
        final akul h = akulVar.h(new ijq(ligVar, alprVar, 17), ligVar.b);
        final akul h2 = ai3.h(new mds(ligVar, 6), ligVar.j);
        final akul j = ligVar.j(new kva(ligVar, 19));
        final akul j2 = ligVar.j(new kva(ligVar, 20));
        final akul j3 = ligVar.j(new kva(ligVar, 11));
        final akul j4 = ligVar.j(new kva(ligVar, 12));
        final akul j5 = ligVar.j(new kva(ligVar, 13));
        final akul j6 = ligVar.j(new kva(ligVar, 14));
        int i2 = 8;
        if (((yxb) ligVar.a.b()).a()) {
            akulVar2 = aktp.ag(0);
            akulVar3 = aktp.ag(amip.UNKNOWN_HAPPINESS_TRACKING_MODE);
        } else {
            zas zasVar = (zas) ligVar.i.b();
            akul a3 = zasVar.a();
            akul i3 = zasVar.c().i(new lso(ligVar, i2), ligVar.g);
            akulVar2 = a3;
            akulVar3 = i3;
        }
        final akul j7 = ligVar.j(new kva(ligVar, 15));
        final akul j8 = ligVar.j(new kva(ligVar, 17));
        final akul j9 = ligVar.j(new kva(ligVar, 18));
        final akul j10 = ligVar.j(new kli(6));
        final akul akulVar4 = akulVar2;
        final akul h3 = aktp.ap(ai3, h2, j, j2, j3, j4, j5, j6, akulVar3, akulVar2, j7, j8, j9, j10, h).h(new Callable() { // from class: mfr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new mfs(akul.this, (amwt) albo.bQ(ai3), (amhv) albo.bQ(h2), ((Integer) albo.bQ(j)).intValue(), ((Integer) albo.bQ(j2)).intValue(), ((Integer) albo.bQ(j3)).intValue(), ((Integer) albo.bQ(j4)).intValue(), ((Integer) albo.bQ(j5)).intValue(), ((Integer) albo.bQ(j6)).intValue(), (amip) albo.bQ(akulVar3), ((Integer) albo.bQ(akulVar4)).intValue(), (alor) albo.bQ(j7), (alor) albo.bQ(j8), (alor) albo.bQ(j9), ((Integer) albo.bQ(j10)).intValue(), (alpt) albo.bQ(h));
            }
        }, ligVar.g);
        return aktp.ap(ai, ai2, h3).h(new Callable() { // from class: rfc
            /* JADX WARN: Type inference failed for: r0v11, types: [mbl, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v110, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, wul] */
            /* JADX WARN: Type inference failed for: r2v30, types: [java.util.concurrent.Executor, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v63, types: [arwe, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v64, types: [arwe, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, wul] */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                akul f;
                List notificationChannels;
                int i4;
                int importance;
                Uri sound;
                String str;
                int i5;
                boolean shouldVibrate;
                int i6;
                int lockscreenVisibility;
                int i7;
                boolean canShowBadge;
                int i8;
                boolean canBypassDnd;
                amhx a4;
                Uri sound2;
                List notificationChannels2;
                NotificationManager notificationManager;
                int bubblePreference;
                int i9;
                int intValue = ((Integer) albo.bQ(ai)).intValue();
                long longValue = ((Long) albo.bQ(ai2)).longValue();
                mfs mfsVar = (mfs) albo.bQ(h3);
                int i10 = a2;
                RecurringTelemetryUploaderAction recurringTelemetryUploaderAction = RecurringTelemetryUploaderAction.this;
                int i11 = 1;
                if (i10 != intValue && (mfsVar == null || mfsVar.b == amwt.BUGLE_LOADING_AVAILABILITY_EXCEPTION)) {
                    xyo e = RecurringTelemetryUploaderAction.a.e();
                    e.H("failed to get availability, will retry in");
                    e.G(longValue);
                    e.H("ms");
                    e.q();
                    rfd NO = ((RecurringTelemetryUploaderAction.a) yyb.aL(RecurringTelemetryUploaderAction.a.class)).NO();
                    Context context = (Context) NO.a.b();
                    context.getClass();
                    mfo mfoVar2 = (mfo) NO.b.b();
                    mfoVar2.getClass();
                    mbl mblVar = (mbl) NO.c.b();
                    mblVar.getClass();
                    lig ligVar2 = (lig) NO.d.b();
                    ligVar2.getClass();
                    xhe xheVar = (xhe) NO.e.b();
                    xheVar.getClass();
                    xhl xhlVar = (xhl) NO.f.b();
                    xhlVar.getClass();
                    anen anenVar = (anen) NO.g.b();
                    anenVar.getClass();
                    anen anenVar2 = (anen) NO.h.b();
                    anenVar2.getClass();
                    new RecurringTelemetryUploaderAction(context, mfoVar2, mblVar, ligVar2, xheVar, xhlVar, anenVar, anenVar2, NO.i, i10 + 1).x(109, longValue);
                } else {
                    mfo mfoVar3 = recurringTelemetryUploaderAction.f;
                    NetworkStatsManager networkStatsManager = (NetworkStatsManager) recurringTelemetryUploaderAction.e.getSystemService(NetworkStatsManager.class);
                    aiut.b();
                    int a5 = mfoVar3.u.a();
                    xyo d2 = mfo.a.d();
                    d2.H("Message status rows deleted");
                    d2.F(a5);
                    d2.q();
                    int a6 = mfoVar3.v.a();
                    xyo d3 = mfo.a.d();
                    d3.H("App event rows deleted");
                    d3.F(a6);
                    d3.q();
                    if (!mfoVar3.m.al()) {
                        mfo.a.l("Clearcut loggings are disabled.");
                    } else {
                        mfoVar3.b(mfsVar, networkStatsManager);
                        vco vcoVar = (vco) mfoVar3.J.b();
                        if (yhx.e && (notificationManager = (NotificationManager) ((Context) vcoVar.a).getSystemService("notification")) != null) {
                            maq maqVar = (maq) vcoVar.b.b();
                            amfq amfqVar = (amfq) amfr.a.createBuilder();
                            amfp amfpVar = amfp.BUBBLE_SETTING_EVENT;
                            if (!amfqVar.b.isMutable()) {
                                amfqVar.u();
                            }
                            amfr amfrVar = (amfr) amfqVar.b;
                            amfrVar.i = amfpVar.dg;
                            amfrVar.b |= 1;
                            aozy createBuilder = amon.a.createBuilder();
                            bubblePreference = notificationManager.getBubblePreference();
                            if (bubblePreference != 1) {
                                if (bubblePreference != 2) {
                                    i9 = 1;
                                } else {
                                    i9 = 3;
                                }
                            } else {
                                i9 = 2;
                            }
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            amon amonVar = (amon) createBuilder.b;
                            amonVar.c = i9;
                            amonVar.b |= 1;
                            if (!amfqVar.b.isMutable()) {
                                amfqVar.u();
                            }
                            amfr amfrVar2 = (amfr) amfqVar.b;
                            amon amonVar2 = (amon) createBuilder.s();
                            amonVar2.getClass();
                            amfrVar2.aH = amonVar2;
                            amfrVar2.e |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
                            maqVar.j(amfqVar);
                        }
                        viq viqVar = (viq) mfoVar3.K.b();
                        int i12 = 8;
                        int i13 = 4;
                        if (aiut.g()) {
                            ((alwl) ((alwl) viq.a.g()).h("com/google/android/apps/messaging/shared/notification/NotificationMetricsEventLogger", "logNotificationCounter", 209, "NotificationMetricsEventLogger.java")).q("Unable to log notification counter because running on main thread is not allowed");
                        } else {
                            try {
                                aozy createBuilder2 = amwo.a.createBuilder();
                                boolean b2 = viqVar.b();
                                if (!createBuilder2.b.isMutable()) {
                                    createBuilder2.u();
                                }
                                amwo amwoVar = (amwo) createBuilder2.b;
                                amwoVar.b |= 2;
                                amwoVar.f = b2;
                                amwk amwkVar = (amwk) viqVar.c.get().l();
                                aozy createBuilder3 = amwk.a.createBuilder(amwkVar);
                                if ((amwkVar.b & 1) == 0) {
                                    if (!createBuilder3.b.isMutable()) {
                                        createBuilder3.u();
                                    }
                                    amwk.b((amwk) createBuilder3.b);
                                }
                                if ((amwkVar.b & 2) == 0) {
                                    if (!createBuilder3.b.isMutable()) {
                                        createBuilder3.u();
                                    }
                                    amwk.c((amwk) createBuilder3.b);
                                }
                                if ((amwkVar.b & 8) == 0) {
                                    if (!createBuilder3.b.isMutable()) {
                                        createBuilder3.u();
                                    }
                                    amwk.d((amwk) createBuilder3.b);
                                }
                                if ((amwkVar.b & 4) == 0) {
                                    if (!createBuilder3.b.isMutable()) {
                                        createBuilder3.u();
                                    }
                                    amwk amwkVar2 = (amwk) createBuilder3.b;
                                    amwkVar2.b |= 4;
                                    amwkVar2.c = 0;
                                }
                                if ((amwkVar.b & 16) == 0) {
                                    if (!createBuilder3.b.isMutable()) {
                                        createBuilder3.u();
                                    }
                                    amwk.a((amwk) createBuilder3.b);
                                }
                                if (!createBuilder2.b.isMutable()) {
                                    createBuilder2.u();
                                }
                                amwo amwoVar2 = (amwo) createBuilder2.b;
                                amwk amwkVar3 = (amwk) createBuilder3.s();
                                amwkVar3.getClass();
                                amwoVar2.d = amwkVar3;
                                amwoVar2.c = 6;
                                maq maqVar2 = (maq) viqVar.b.b();
                                amfq amfqVar2 = (amfq) amfr.a.createBuilder();
                                amfp amfpVar2 = amfp.NOTIFICATION_METRICS_EVENT;
                                if (!amfqVar2.b.isMutable()) {
                                    amfqVar2.u();
                                }
                                amfr amfrVar3 = (amfr) amfqVar2.b;
                                amfrVar3.i = amfpVar2.dg;
                                amfrVar3.b |= 1;
                                if (!amfqVar2.b.isMutable()) {
                                    amfqVar2.u();
                                }
                                amfr amfrVar4 = (amfr) amfqVar2.b;
                                amwo amwoVar3 = (amwo) createBuilder2.s();
                                amwoVar3.getClass();
                                amfrVar4.aU = amwoVar3;
                                amfrVar4.f |= 2048;
                                maqVar2.j(amfqVar2);
                                viqVar.c.get().m(new vip(0));
                            } catch (apba e2) {
                                throw new IllegalStateException("Unexpected error while getting notification counter data", e2);
                            }
                        }
                        if (!((pqy) mfoVar3.U.b()).a()) {
                            ((Optional) ((apxx) mfoVar3.B).a).ifPresent(new met(mfoVar3, i12));
                        }
                        ((Optional) ((apxx) mfoVar3.F).a).ifPresent(new met(mfoVar3, 6));
                        qiu.h(aktp.ai(new kli(4), mfoVar3.x).h(new mds(mfoVar3, i13), mfoVar3.y));
                        lxe lxeVar = (lxe) mfoVar3.D.b();
                        qiu.h(aktp.ai(new kva(lxeVar, 7), lxeVar.a));
                        mfoVar3.t.w();
                        yyb.aO(aktp.Y(mfoVar3.w.b().i(new lso(mfoVar3, 5), mfoVar3.x), new ijq(mfoVar3, mfsVar, 15), mfoVar3.x), "BugleUsageStatistics", "Failed to log rcs active");
                        qrg qrgVar = (qrg) mfoVar3.I.b();
                        if (!((Boolean) qrg.a.e()).booleanValue()) {
                            f = aktp.ag(null);
                        } else {
                            akrh e3 = aktp.e("PhoneNumberMinMatchGuessLogger#computeAndLog");
                            try {
                                f = ((qrh) qrgVar.c.b()).a().h(new qlf(qrgVar, 13), qrgVar.e).f(Throwable.class, new prf(qrgVar, 12), qrgVar.e);
                                e3.b(f);
                                e3.close();
                            } finally {
                            }
                        }
                        qiu.h(f);
                        if (((Boolean) utw.i.e()).booleanValue()) {
                            aiut.b();
                            mfoVar3.n.g("Bugle.Ditto.Pairing.Computers.Count.Daily", mfoVar3.j.d().size());
                        }
                        alor alorVar = mfsVar.l;
                        alor alorVar2 = mfsVar.m;
                        alor alorVar3 = mfsVar.n;
                        mfoVar3.a(alorVar, "Bugle.Rbm.UniqueBotConversations.1Day.Counts");
                        mfoVar3.a(alorVar2, "Bugle.Rbm.UniqueBotConversations.7Days.Counts");
                        mfoVar3.a(alorVar3, "Bugle.Rbm.UniqueBotConversations.28Days.Counts");
                        aiut.b();
                        yhu yhuVar = mfoVar3.l;
                        notificationChannels = ((NotificationManager) yhuVar.a.b()).getNotificationChannels();
                        if (notificationChannels != null) {
                            notificationChannels2 = ((NotificationManager) yhuVar.a.b()).getNotificationChannels();
                            i4 = notificationChannels2.size();
                        } else {
                            i4 = 0;
                        }
                        mfoVar3.n.e("Bugle.Notification.Channel.Count", i4);
                        aiut.b();
                        NotificationChannel a7 = ((vml) mfoVar3.N.b()).a();
                        mbl mblVar2 = mfoVar3.n;
                        importance = a7.getImportance();
                        mblVar2.e("Bugle.Notification.DefaultChannel.Importance.Count", importance);
                        sound = a7.getSound();
                        if (sound != null) {
                            sound2 = a7.getSound();
                            str = sound2.toString();
                        } else {
                            str = null;
                        }
                        if (str != null && !str.endsWith("notification_sound")) {
                            i5 = 2;
                        } else {
                            i5 = 1;
                        }
                        mfoVar3.n.e("Bugle.Notification.DefaultChannel.Sound.Count", i5);
                        shouldVibrate = a7.shouldVibrate();
                        mbl mblVar3 = mfoVar3.n;
                        if (true != shouldVibrate) {
                            i6 = 2;
                        } else {
                            i6 = 1;
                        }
                        mblVar3.e("Bugle.Notification.DefaultChannel.Vibrate.Count", i6);
                        lockscreenVisibility = a7.getLockscreenVisibility();
                        if (lockscreenVisibility == -1) {
                            i7 = 3;
                        } else if (lockscreenVisibility == 1) {
                            i7 = 1;
                        } else if (lockscreenVisibility == 0) {
                            i7 = 2;
                        } else {
                            i7 = 0;
                        }
                        mfoVar3.n.e("Bugle.Notification.DefaultChannel.LockScreenVisibility.Count", i7);
                        canShowBadge = a7.canShowBadge();
                        mbl mblVar4 = mfoVar3.n;
                        if (true != canShowBadge) {
                            i8 = 2;
                        } else {
                            i8 = 1;
                        }
                        mblVar4.e("Bugle.Notification.DefaultChannel.ShowOnBadge.Count", i8);
                        canBypassDnd = a7.canBypassDnd();
                        mbl mblVar5 = mfoVar3.n;
                        if (true != canBypassDnd) {
                            i11 = 2;
                        }
                        mblVar5.e("Bugle.Notification.DefaultChannel.OverrideDoNotDisturb.Count", i11);
                        if (mfoVar3.r.i()) {
                            min minVar = (min) mfoVar3.o.b();
                            min.a.p("Logging periodic event.");
                            synchronized (minVar) {
                                minVar.d = minVar.e;
                                a4 = minVar.a();
                            }
                            minVar.b(a4);
                        }
                        Iterator it = ((Set) mfoVar3.O.b()).iterator();
                        while (it.hasNext()) {
                            ((mfd) it.next()).a();
                        }
                        mfoVar3.L.ifPresent(new ldx(16));
                        ((Optional) mfoVar3.E.b()).ifPresent(new ldx(17));
                        yyb.aO(mfoVar3.w.c.b(akto.a(new mdq(mfoVar3.s.f().toEpochMilli(), 0)), andi.a), "BugleUsageStatistics", "Failed to update LastRecurrentAnalyticsUploadTimeInMillis");
                        mfoVar3.H.isPresent();
                        if (((odw) mfoVar3.T.b()).a()) {
                            zai zaiVar = (zai) mfoVar3.P.b();
                            qiu.e(qjh.j(zaiVar.c, new txt(zaiVar, (arpe) null, 14)));
                        } else {
                            zai zaiVar2 = (zai) mfoVar3.P.b();
                            qjh.l(zaiVar2.c, null, new uww(zaiVar2, null), 3);
                        }
                        if (uzz.g()) {
                            uac uacVar = (uac) mfoVar3.R.b();
                            if (((vco) uacVar.a).i()) {
                                uacVar.b.c("Bugle.Kids.Engagement.Supervised.Count");
                            }
                        }
                    }
                    recurringTelemetryUploaderAction.g.e("Bugle.DataModel.Action.RecurringTelemetryUpload.Retry.Count", i10);
                }
                if (((Boolean) RecurringTelemetryUploaderAction.b.e()).booleanValue()) {
                    Optional a8 = recurringTelemetryUploaderAction.h.a(amnf.RECURRING_EVENT);
                    if (a8.isPresent() && ((Boolean) a8.get()).booleanValue()) {
                        RecurringTelemetryUploaderAction.a.q("Telephony database was wiped out!");
                        if (((Boolean) RecurringTelemetryUploaderAction.c.e()).booleanValue()) {
                            RecurringTelemetryUploaderAction.a.o("Starting reverse telephony sync due to wipeout");
                            recurringTelemetryUploaderAction.j.a();
                            return null;
                        }
                        return null;
                    }
                    return null;
                }
                return null;
            }
        }, this.l);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public RecurringTelemetryUploaderAction(Context context, mfo mfoVar, mbl mblVar, lig ligVar, xhe xheVar, xhl xhlVar, anen anenVar, anen anenVar2, armf armfVar, int i) {
        super(amdy.RECURRING_TELEMETRY_UPLOADER_ACTION);
        this.e = context;
        this.f = mfoVar;
        this.g = mblVar;
        this.h = xheVar;
        this.m = ligVar;
        this.j = xhlVar;
        this.k = anenVar;
        this.l = anenVar2;
        this.i = armfVar;
        this.u.r("retry_count", i);
    }

    public RecurringTelemetryUploaderAction(Context context, mfo mfoVar, mbl mblVar, lig ligVar, anen anenVar, anen anenVar2, xhe xheVar, xhl xhlVar, armf armfVar, Parcel parcel) {
        super(parcel, amdy.RECURRING_TELEMETRY_UPLOADER_ACTION);
        this.e = context;
        this.f = mfoVar;
        this.g = mblVar;
        this.m = ligVar;
        this.h = xheVar;
        this.j = xhlVar;
        this.k = anenVar;
        this.l = anenVar2;
        this.i = armfVar;
    }
}
