package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.receiver.RestoreReceiver;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.aktp;
import defpackage.akul;
import defpackage.alok;
import defpackage.amfp;
import defpackage.amfq;
import defpackage.amfr;
import defpackage.amme;
import defpackage.ammi;
import defpackage.amnb;
import defpackage.andi;
import defpackage.aotl;
import defpackage.aozn;
import defpackage.aozy;
import defpackage.apag;
import defpackage.apct;
import defpackage.apdp;
import defpackage.apds;
import defpackage.apwt;
import defpackage.armf;
import defpackage.mad;
import defpackage.maq;
import defpackage.qiu;
import defpackage.rgl;
import defpackage.sxy;
import defpackage.uof;
import defpackage.upk;
import defpackage.uuf;
import defpackage.uuh;
import defpackage.vix;
import defpackage.vwq;
import defpackage.wgb;
import defpackage.wlr;
import defpackage.wmi;
import defpackage.wzy;
import defpackage.xhb;
import defpackage.xhl;
import defpackage.xhq;
import defpackage.xnv;
import defpackage.xyo;
import defpackage.xze;
import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RestoreReceiver extends wlr {
    public armf A;
    public armf B;
    public armf C;
    public apwt m;
    public apwt n;
    public apwt o;
    public apwt p;
    public apwt q;
    public aksr r;
    public armf s;
    public armf t;
    public armf u;
    public armf v;
    public armf w;
    public armf x;
    public armf y;
    public armf z;
    public static final xze a = xze.g("Bugle", "RestoreReceiver");
    static final uuf b = uuh.e(uuh.b, "telephony_db_recreated_notification", 0);
    static final uuf c = uuh.f(uuh.b, "telephony_db_recreated_notification_back_off_ms", TimeUnit.DAYS.toMillis(7));
    public static final uuf d = uuh.i(uuh.b, "restore_receiver_run_wipeout_detector", true);
    public static final uuf e = uuh.i(uuh.b, "restore_receiver_run_wipeout_detector_on_telephony_db_initial_creation", false);
    public static final uuf f = uuh.i(uuh.b, "reverse_sync_instead_of_wipeout", false);
    static final uuf g = uuh.f(uuh.b, "reverse_sync_delay", 5000);
    public static final uuf h = uuh.r(174024787, "wipeout_when_no_sms_permissions");
    static final uuf i = uuh.i(uuh.b, "use_sync_telephony_threads_action_instead_of_wipeout", false);
    public static final uuf j = uuh.i(uuh.b, "reverse_sync_when_inconclusive_db_recreated", false);
    public static final uuf k = uuh.i(uuh.b, "reverse_sync_when_inconclusive_db_initial_creation", false);
    public static final uuf l = uuh.i(uuh.b, "reverse_sync_check_throttle", true);
    private static final uuf R = uuh.e(uuh.b, "restore_receiver_sync_telephony_threads_action_delay_ms", 5000);

    public static int m() {
        if (((Boolean) i.e()).booleanValue()) {
            return 3;
        }
        return 4;
    }

    private final akul u(Context context) {
        Resources resources = context.getResources();
        long longValue = ((Long) c.e()).longValue();
        vix vixVar = (vix) this.t.b();
        amme ammeVar = amme.TELEPHONY_DB_RECREATED;
        String string = resources.getString(R.string.report_telephone_db_recreation_message);
        alok alokVar = new alok();
        alokVar.h("TelephonyRecreatedTelephonySmsCountBucket", v(((wzy) this.w.b()).an()));
        alokVar.h("TelephonyRecreatedTelephonyMmsCountBucket", v(((wzy) this.w.b()).am()));
        sxy d2 = MessagesTable.d();
        d2.w("createPsdMap-messages1");
        d2.q();
        d2.g(new wmi(1));
        alokVar.h("TelephonyRecreatedBugleSmsCountBucket", v(d2.b().i()));
        sxy d3 = MessagesTable.d();
        d3.w("createPsdMap-messages2");
        d3.q();
        d3.g(new wmi(0));
        alokVar.h("TelephonyRecreatedBugleMmsCountBucket", v(d3.b().i()));
        return vixVar.L(ammeVar, string, longValue, alokVar.b());
    }

    private static String v(int i2) {
        if (i2 == -1) {
            return "unknown";
        }
        if (i2 == 0) {
            return "zero";
        }
        if (i2 <= 10) {
            return "one_to_ten";
        }
        if (i2 <= 50) {
            return "eleven_to_fifty";
        }
        return "more_than_fifty";
    }

    @Override // defpackage.wng
    public final akrc a() {
        return this.r.b("RestoreReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return null;
    }

    @Override // defpackage.wng
    protected final int e() {
        return 5;
    }

    @Override // defpackage.wna
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.Restore.Latency";
    }

    @Override // defpackage.wna
    public final boolean i(Intent intent) {
        return true;
    }

    @Override // defpackage.wna
    public final akul j(final Context context, final Intent intent) {
        return aktp.ai(new Callable() { // from class: wmj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                wmk wmkVar;
                boolean z;
                boolean z2;
                int i2;
                int i3;
                wmk wmkVar2;
                int i4;
                Intent intent2 = intent;
                Optional empty = Optional.empty();
                akrh e2 = aktp.e("RestoreReceiver.executeAction");
                if (intent2 != null) {
                    try {
                        String action = intent2.getAction();
                        xyo e3 = RestoreReceiver.a.e();
                        e3.H(intent2);
                        e3.q();
                        boolean equals = "com.lge.bnr.intent.action.REQUEST_MESSAGE".equals(action);
                        RestoreReceiver restoreReceiver = RestoreReceiver.this;
                        int i5 = 2;
                        boolean z3 = false;
                        if (equals && intent2.getIntExtra("BNR_MODE", 0) == 2) {
                            if (((Boolean) ((utz) wzp.a.get()).e()).booleanValue()) {
                                empty = Optional.of(amvm.LG_TELEPHONY_RESTORE);
                            } else {
                                ((wzp) restoreReceiver.o.b()).p(true);
                            }
                        } else {
                            boolean equals2 = "android.telephony.action.CARRIER_CONFIG_CHANGED".equals(action);
                            Context context2 = context;
                            if (equals2) {
                                if (intent2.getBooleanExtra("RESET_DOWNLOAD_PREFERENCES", false)) {
                                    ykw x = ((zxy) restoreReceiver.n.b()).x(-1);
                                    RestoreReceiver.a.p("removePrefs - roaming prefs deleted");
                                    x.n(context2.getString(R.string.auto_retrieve_mms_when_roaming_pref_key));
                                    x.n(context2.getString(R.string.auto_retrieve_mms_pref_key));
                                }
                            } else if ("com.hicloud.android.clone.action.SMS_RESTORE_COMPLETE".equals(action)) {
                                if (((Boolean) ((utz) wzp.a.get()).e()).booleanValue()) {
                                    empty = Optional.of(amvm.HUAWEI_SMS_RESTORE);
                                } else {
                                    ((wzp) restoreReceiver.o.b()).k(amvm.HUAWEI_SMS_RESTORE);
                                }
                            } else if ("com.samsung.android.messaging.intent.action.TP_SYNC_FOR_RESTORE_MESSAGE".equals(action)) {
                                if (((Boolean) ((utz) wzp.a.get()).e()).booleanValue()) {
                                    empty = Optional.of(amvm.SAMSUNG_TELEPHONY_RESTORE);
                                } else {
                                    ((wzp) restoreReceiver.o.b()).k(amvm.SAMSUNG_TELEPHONY_RESTORE);
                                }
                            } else if ("android.provider.action.SMS_MMS_DB_CREATED".equals(action)) {
                                if (intent2.getBooleanExtra("android.provider.extra.IS_INITIAL_CREATE", false)) {
                                    ((mbl) restoreReceiver.p.b()).c("Bugle.Datamodel.DatabaseTelephonyDBCreationInitial.Counts");
                                    ((yyt) restoreReceiver.s.b()).H(2);
                                    if (((Boolean) RestoreReceiver.e.e()).booleanValue()) {
                                        Optional a2 = ((xhe) restoreReceiver.v.b()).a(amnf.SMS_MMS_DB_CREATED);
                                        if (a2.isPresent() && ((Boolean) a2.get()).booleanValue()) {
                                            wmkVar2 = new wmk(5, 6);
                                        } else if (a2.isEmpty() && ((Boolean) RestoreReceiver.k.e()).booleanValue()) {
                                            wmkVar2 = new wmk(5, 7);
                                        } else {
                                            if (true != a2.isPresent()) {
                                                i4 = 7;
                                            } else {
                                                i4 = 8;
                                            }
                                            wmkVar2 = new wmk(2, i4);
                                        }
                                    } else {
                                        wmkVar2 = new wmk(2, 10);
                                    }
                                    restoreReceiver.n(2, wmkVar2.a, wmkVar2.b);
                                    restoreReceiver.p(context2, wmkVar2.a);
                                } else {
                                    RestoreReceiver.a.q("DATAMODEL_DATABASE_TELEPHONY_DB_CREATED_REBUILD");
                                    ((yyt) restoreReceiver.s.b()).H(3);
                                    ((mbl) restoreReceiver.p.b()).c("Bugle.Datamodel.DatabaseTelephonyDBCreationRebuild.Counts");
                                    ((xhq) restoreReceiver.z.b()).g(Optional.of(aotl.j(((xnv) restoreReceiver.A.b()).f())), Optional.empty());
                                    if (((Boolean) RestoreReceiver.h.e()).booleanValue() && !((wyj) restoreReceiver.B.b()).f()) {
                                        restoreReceiver.o(3);
                                        wmkVar = new wmk(RestoreReceiver.m(), 4);
                                    } else if (((Boolean) RestoreReceiver.d.e()).booleanValue()) {
                                        Optional b2 = ((xhe) restoreReceiver.v.b()).b(amnf.SMS_MMS_DB_RECREATED);
                                        Optional flatMap = b2.flatMap(new wmi(i5));
                                        if (b2.isPresent()) {
                                            Object obj = b2.get();
                                            if (((Boolean) flatMap.orElse(false)).booleanValue()) {
                                                int intValue = ((Number) ((xhf) obj).b.orElse(0)).intValue();
                                                Object orElse = ((xhf) obj).c.orElse(0);
                                                orElse.getClass();
                                                if (intValue + ((Number) orElse).intValue() != 0) {
                                                    restoreReceiver.o(4);
                                                    wmkVar = new wmk(RestoreReceiver.m(), 5);
                                                }
                                            }
                                        }
                                        if (flatMap.isEmpty() && !((Boolean) RestoreReceiver.j.e()).booleanValue()) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (flatMap.isEmpty() && ((Boolean) RestoreReceiver.j.e()).booleanValue()) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        boolean booleanValue = ((Boolean) flatMap.orElse(false)).booleanValue();
                                        if (z) {
                                            wmkVar = new wmk(RestoreReceiver.m(), 7);
                                        } else {
                                            if (!z2) {
                                                if (booleanValue) {
                                                    booleanValue = true;
                                                } else {
                                                    if (true != flatMap.isPresent()) {
                                                        i3 = 7;
                                                    } else {
                                                        i3 = 8;
                                                    }
                                                    wmkVar = new wmk(2, i3);
                                                }
                                            }
                                            if (((Boolean) RestoreReceiver.l.e()).booleanValue() && ((xgz) ((xhl) restoreReceiver.y.b()).c.b()).a()) {
                                                z3 = true;
                                            }
                                            if (((Boolean) RestoreReceiver.f.e()).booleanValue()) {
                                                if (!z3) {
                                                    if (true != booleanValue) {
                                                        i2 = 7;
                                                    } else {
                                                        i2 = 6;
                                                    }
                                                    wmkVar = new wmk(5, i2);
                                                }
                                                restoreReceiver.o(2);
                                                wmkVar = new wmk(RestoreReceiver.m(), 3);
                                            } else {
                                                if (!z3) {
                                                    wmkVar = new wmk(RestoreReceiver.m(), 11);
                                                }
                                                restoreReceiver.o(2);
                                                wmkVar = new wmk(RestoreReceiver.m(), 3);
                                            }
                                        }
                                    } else {
                                        wmkVar = new wmk(RestoreReceiver.m(), 9);
                                    }
                                    restoreReceiver.n(3, wmkVar.a, wmkVar.b);
                                    restoreReceiver.p(context2, wmkVar.a);
                                }
                            } else if ("android.provider.action.SMS_MMS_DB_LOST".equals(action)) {
                                ((yyt) restoreReceiver.s.b()).H(4);
                                restoreReceiver.n(4, 2, 2);
                            }
                        }
                    } finally {
                    }
                }
                e2.close();
                return empty;
            }
        }, (Executor) this.u.b()).i(new wgb(this, 3), (Executor) this.u.b());
    }

    public final void n(int i2, int i3, int i4) {
        aozy createBuilder = amnb.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amnb amnbVar = (amnb) apagVar;
        amnbVar.c = i2 - 1;
        amnbVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amnb amnbVar2 = (amnb) apagVar2;
        amnbVar2.d = i3 - 1;
        amnbVar2.b |= 2;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        amnb amnbVar3 = (amnb) createBuilder.b;
        amnbVar3.e = i4 - 1;
        amnbVar3.b |= 4;
        amnb amnbVar4 = (amnb) createBuilder.s();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.TELEPHONY_DATABASE_ACTION_EVENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amnbVar4.getClass();
        amfrVar2.ac = amnbVar4;
        amfrVar2.d |= 4;
        ((maq) this.x.b()).j(amfqVar);
    }

    public final void o(int i2) {
        maq maqVar = (maq) this.x.b();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.TELEPHONY_REVERSE_SYNC_NOT_ATTEMPTED_EVENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        aozy createBuilder = ammi.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ammi ammiVar = (ammi) createBuilder.b;
        ammiVar.c = i2 - 1;
        ammiVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        ammi ammiVar2 = (ammi) createBuilder.s();
        ammiVar2.getClass();
        amfrVar2.ao = ammiVar2;
        amfrVar2.d |= 1048576;
        maqVar.j(amfqVar);
    }

    public final void p(Context context, int i2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        return;
                    }
                    ((xhq) this.z.b()).f(aotl.j(((xnv) this.A.b()).f()));
                    xhl xhlVar = (xhl) this.y.b();
                    Duration ofMillis = Duration.ofMillis(((Long) g.e()).longValue());
                    xyo c2 = xhl.a.c();
                    c2.H("Scheduling reverse sync with delay");
                    c2.z("initialDelay", ofMillis);
                    c2.q();
                    uof uofVar = xhlVar.d;
                    aozy createBuilder = xhb.a.createBuilder();
                    apct b2 = apds.b(xhlVar.b.f().toEpochMilli());
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    xhb xhbVar = (xhb) createBuilder.b;
                    b2.getClass();
                    xhbVar.c = b2;
                    xhbVar.b |= 1;
                    aozn c3 = apdp.c(ofMillis.toMillis());
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    xhb xhbVar2 = (xhb) createBuilder.b;
                    c3.getClass();
                    xhbVar2.d = c3;
                    xhbVar2.b |= 2;
                    uofVar.a(upk.a("ReverseTelephonySync", createBuilder.s()));
                    return;
                }
                int intValue = ((Integer) b.e()).intValue();
                xyo e2 = a.e();
                e2.H("Telephony DB recreated");
                e2.x("DB_RECREATED_NOTIFICATION", intValue);
                e2.q();
                akul ag = aktp.ag(null);
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue == 3) {
                            ((mad) this.q.b()).a("android.provider.action.SMS_MMS_DB_CREATED");
                            ag = u(context);
                        }
                    } else {
                        ag = u(context);
                    }
                } else {
                    ((mad) this.q.b()).a("android.provider.action.SMS_MMS_DB_CREATED");
                }
                ag.k(qiu.c(new vwq(this, 14)), andi.a);
                return;
            }
            ((rgl) this.C.b()).a(true).w(((Integer) R.e()).intValue());
            return;
        }
        a.q("Unknown action should not be used in a log");
    }
}
