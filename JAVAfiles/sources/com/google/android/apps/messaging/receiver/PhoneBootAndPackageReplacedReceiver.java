package com.google.android.apps.messaging.receiver;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.UserManager;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import defpackage.akct;
import defpackage.akcw;
import defpackage.akcx;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.akul;
import defpackage.alwl;
import defpackage.alwo;
import defpackage.aogy;
import defpackage.apwt;
import defpackage.apxx;
import defpackage.armf;
import defpackage.gsi;
import defpackage.hgi;
import defpackage.ltb;
import defpackage.mbl;
import defpackage.mej;
import defpackage.mek;
import defpackage.mfo;
import defpackage.mho;
import defpackage.pnc;
import defpackage.qiu;
import defpackage.qrd;
import defpackage.rft;
import defpackage.utz;
import defpackage.uyg;
import defpackage.uyh;
import defpackage.vrw;
import defpackage.vyv;
import defpackage.wfh;
import defpackage.wlb;
import defpackage.wlc;
import defpackage.wmy;
import defpackage.wns;
import defpackage.wnw;
import defpackage.wnx;
import defpackage.wpp;
import defpackage.xnv;
import defpackage.xyo;
import defpackage.xze;
import defpackage.yep;
import defpackage.yjv;
import defpackage.ykw;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PhoneBootAndPackageReplacedReceiver extends ltb {
    public apwt a;
    public apwt b;
    public armf c;

    @Override // defpackage.wng
    public final akrc a() {
        return ((aksr) this.a.b()).b("PhoneBootAndPackageReplacedReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        xze xzeVar = wlc.a;
        return "Bugle.Broadcast.BootAndPackageReplaced.Latency";
    }

    @Override // defpackage.wna
    public final String f() {
        xze xzeVar = wlc.a;
        return "Bugle.Broadcast.ForegroundService.BootAndPackageReplaced.Latency";
    }

    @Override // defpackage.wna
    public final void g(Context context, Intent intent) {
        JobInfo pendingJob;
        boolean isManagedProfile;
        wlc wlcVar = (wlc) this.b.b();
        if (wlc.a(intent) && ((pnc) wlcVar.u.b()).a()) {
            ((mfo) wlcVar.j.b()).e(this);
            String action = intent.getAction();
            if (action != null) {
                wfh wfhVar = (wfh) wlcVar.v.b();
                alwo alwoVar = wmy.a;
                hgi hgiVar = new hgi((char[]) null);
                hgiVar.n("intent_action", action);
                gsi j = hgiVar.j();
                akct a = akcx.a(wmy.class);
                a.e(new akcw("BOOT_AND_PACKAGE_REPLACE_WORKER", 4));
                a.f = j;
                akul g = akul.g(((aogy) wfhVar.a).r(a.a()));
                g.getClass();
                qiu.h(g);
            }
        } else if (((yjv) wlcVar.d.b()).e()) {
            String action2 = intent.getAction();
            if (!"android.intent.action.BOOT_COMPLETED".equals(action2) && !"android.intent.action.MY_PACKAGE_REPLACED".equals(action2)) {
                if ("android.intent.action.LOCALE_CHANGED".equals(action2)) {
                    wlcVar.k.ifPresent(new vrw(8));
                    xyo a2 = wlc.a.a();
                    a2.H("refresh self participant on locale changed");
                    a2.q();
                    ((rft) wlcVar.q.b()).b().J();
                    ((mek) wlcVar.m.b()).e(mej.LOCALE_CHANGED, Optional.empty());
                } else {
                    xyo c = wlc.a.c();
                    c.H("got unexpected action:");
                    c.H(intent.getAction());
                    c.q();
                }
            } else {
                long epochMilli = ((xnv) wlcVar.e.b()).f().toEpochMilli();
                if ("android.intent.action.MY_PACKAGE_REPLACED".equals(action2)) {
                    ((ykw) wlcVar.f.b()).k("last_app_update_time_millis", epochMilli);
                    Iterator it = ((Set) wlcVar.o.b()).iterator();
                    while (it.hasNext()) {
                        ((wnx) it.next()).b();
                    }
                }
                if (((ykw) wlcVar.f.b()).e("app_install_time_millis", 0L) == 0) {
                    ((ykw) wlcVar.f.b()).k("app_install_time_millis", epochMilli);
                }
                ((alwl) ((alwl) wlc.b.g()).h("com/google/android/apps/messaging/shared/receiver/BootAndPackageReplacedReceiverDelegate", "doSync", 181, "BootAndPackageReplacedReceiverDelegate.java")).q("Silently refreshing notifications after Boot/Package replacement");
                ((wpp) wlcVar.t.b()).L();
                ((wlb) wlcVar.l.b()).a();
                if ("android.intent.action.MY_PACKAGE_REPLACED".equals(action2)) {
                    ((yep) wlcVar.g.b()).h();
                    ((mbl) wlcVar.h.b()).c("Bugle.Receiver.BootAndPackageReplacedReceiver.RefreshGmsCore");
                    ((mek) wlcVar.m.b()).e(mej.PACKAGE_REPLACED, Optional.empty());
                }
                if ("android.intent.action.BOOT_COMPLETED".equals(action2)) {
                    ((wnw) wlcVar.c.b()).c();
                    ((mho) wlcVar.i.b()).ae();
                    ((mek) wlcVar.m.b()).e(mej.BOOT_COMPLETE, Optional.empty());
                    ((Optional) ((apxx) wlcVar.n).a).ifPresent(new vrw(7));
                    Iterator it2 = ((Set) wlcVar.p.b()).iterator();
                    while (it2.hasNext()) {
                        ((wns) it2.next()).a();
                    }
                }
            }
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            if (jobScheduler != null) {
                int[] iArr = {BasePaymentResult.ERROR_REQUEST_TIMEOUT, BasePaymentResult.ERROR_REQUEST_FAILED};
                for (int i = 0; i < 2; i++) {
                    int i2 = iArr[i];
                    pendingJob = jobScheduler.getPendingJob(i2);
                    if (pendingJob != null) {
                        jobScheduler.cancel(i2);
                    }
                }
            } else {
                wlc.a.m("JobScheduler is null");
            }
            ((mfo) wlcVar.j.b()).e(this);
            ((mfo) wlcVar.j.b()).d();
            Optional optional = (Optional) wlcVar.s.b();
            if (optional.isPresent()) {
                qiu.h(((vyv) optional.get()).w());
            }
            if (((Boolean) ((utz) qrd.a.get()).e()).booleanValue()) {
                qiu.h(((qrd) wlcVar.r.b()).a());
            }
        }
        UserManager userManager = (UserManager) context.getSystemService("user");
        userManager.getClass();
        isManagedProfile = userManager.isManagedProfile();
        if (isManagedProfile) {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, "com.google.android.apps.messaging.ui.ConversationListActivity"), 2, 1);
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, "com.google.android.apps.messaging.ui.conversationlist.ShareIntentActivity"), 2, 1);
        }
        if (((Boolean) ((utz) uyh.b.get()).e()).booleanValue() && "android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction()) && ((Optional) ((apxx) this.c).a).isPresent()) {
            ((uyg) ((Optional) ((apxx) this.c).a).get()).a();
        }
    }

    @Override // defpackage.wna
    public final boolean i(Intent intent) {
        wlc wlcVar = (wlc) this.b.b();
        if (wlc.a(intent) && ((pnc) wlcVar.u.b()).a()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.wna
    public final String k(Context context, Intent intent) {
        xze xzeVar = wlc.a;
        return context.getString(R.string.syncing_with_device_foreground_notification_text);
    }
}
