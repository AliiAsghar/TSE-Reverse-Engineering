package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.ui.appsettings.PerSubscriptionSettingsActivity;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vic implements via {
    public static final alwo a = alwo.o("BugleNotifications");
    public final armf b;
    public final armf c;
    Notification d = null;
    private final apwt e;
    private final Context f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final anen j;
    private final alhr k;
    private final armf l;
    private final armf m;
    private final Optional n;
    private final Optional o;
    private final armf p;
    private final alhr q;
    private final apwt r;

    public vic(Context context, apwt apwtVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, anen anenVar, armf armfVar7, Optional optional, Optional optional2, armf armfVar8, apwt apwtVar2) {
        this.f = context;
        this.e = apwtVar;
        this.g = armfVar;
        this.h = armfVar2;
        this.i = armfVar3;
        this.j = anenVar;
        this.b = armfVar7;
        this.p = armfVar8;
        this.q = new uqw(context, 18);
        this.l = armfVar4;
        this.m = armfVar5;
        this.c = armfVar6;
        this.n = optional;
        this.o = optional2;
        this.r = apwtVar2;
        this.k = new uqw(context, 19);
    }

    private final akul S(amme ammeVar, vhv vhvVar, long j) {
        akul i;
        wor worVar = (wor) this.b.b();
        if (j < 0) {
            i = aktp.af(new IllegalArgumentException("backoffTimeMs cannot be negative."));
        } else {
            i = wor.a.b().i(new wgb(worVar, 4), worVar.c).i(new woq(worVar, ammeVar, j, 0), worVar.c);
        }
        return i.i(new ukk(this, ammeVar, vhvVar, 16), this.j);
    }

    @Override // defpackage.via
    public final void A(alog alogVar) {
        if (!E()) {
            ((alwl) a.n().h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl", "refreshRcsStillSendingNotification", 230, "BugleNotificationManagerImpl.java")).q("Notifications disabled, cannot refresh the RCS still sending notification.");
            return;
        }
        viv h = ((aaya) this.i.b()).h(this);
        int size = alogVar.size();
        h.m = size;
        if (size == 0) {
            if (h.b.C(h)) {
                h.d.c("Bugle.Notification.RcsStillSending.AutoDismissed.Count");
            }
            h.b.h("rcs_still_sending_notification_tag", h.c());
            return;
        }
        sxy d = MessagesTable.d();
        d.w("+RcsStillSendingNotification.refresh");
        boolean z = false;
        d.g(new viu(alogVar, 0 == true ? 1 : 0));
        alpt o = alpt.o(d.b().f());
        int size2 = o.size();
        h.l = size2;
        if (size2 == 1) {
            h.j = (ConversationIdType) Collection.EL.stream(o).iterator2().next();
            smr q = ((rtz) h.c.b()).q(h.j);
            if (q == null) {
                alwl alwlVar = (alwl) viv.a.i();
                alwlVar.X(ydl.o, h.j.toString());
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/notification/RcsStillSendingNotification", "refresh", 174, "RcsStillSendingNotification.java")).q("Skipping RCS still sending notification for missing conversation.");
                return;
            } else {
                h.i = Optional.ofNullable(q.P());
                if (qrl.a()) {
                    z = q.ac();
                }
                h.n = z;
                h.k = ((lrf) h.h.b()).l(h.j, q.S(), h.n);
            }
        }
        if (h.b.C(h)) {
            h.b.H(h);
        } else if (h.b.D(h)) {
            h.d.c("Bugle.Notification.RcsStillSending.Posted.Count");
            h.e.d(5);
        }
    }

    @Override // defpackage.via
    public final void B(alog alogVar) {
        String str;
        if (!E()) {
            ((alwl) a.n().h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl", "refreshStuckMessagesNotification", 186, "BugleNotificationManagerImpl.java")).q("Notifications disabled, won't refresh stuck messages.");
            return;
        }
        vjd i = ((aaya) this.i.b()).i(this);
        int size = alogVar.size();
        i.j = size;
        if (size == 0) {
            if (i.d.C(i)) {
                i.d.h("stuck_messages_notification_tag", i.c());
                kor korVar = (kor) i.c.b();
                aozy createBuilder = ammf.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                ammf ammfVar = (ammf) apagVar;
                ammfVar.c = 5;
                ammfVar.b = 1 | ammfVar.b;
                amme ammeVar = amme.MESSAGE_STUCK_IN_SENDING;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                ammf ammfVar2 = (ammf) createBuilder.b;
                ammfVar2.d = ammeVar.o;
                ammfVar2.b |= 2;
                korVar.f((ammf) createBuilder.s());
                return;
            }
            return;
        }
        List a2 = ((rvv) i.b.b()).a((List) Collection.EL.stream(alogVar).map(new vil(3)).collect(alls.a));
        Set set = (Set) Collection.EL.stream(a2).map(new vil(4)).collect(Collectors.toCollection(new uzg(9)));
        i.m = Collection.EL.stream(a2).filter(new uzr(10)).count();
        i.n = Collection.EL.stream(a2).filter(new uzr(11)).count();
        i.o = Collection.EL.stream(a2).filter(new uzr(12)).count();
        if (set.size() == 1) {
            ((rtn) a2.get(0)).c();
            i.h = ((rtn) a2.get(0)).t();
            rto z = ((uac) i.a.b()).z(i.h);
            if (z != null) {
                str = z.r();
            } else {
                str = "";
            }
            i.l = str;
            if (qrl.a() && z != null) {
                i.p = z.R();
            }
            i.i = ((lrf) i.e.b()).l(i.h, ((rtn) a2.get(0)).N(), i.p);
        }
        i.k = set.size();
        if (Collection.EL.stream(alogVar).anyMatch(new uzr(13))) {
            if (!i.d.C(i)) {
                kor korVar2 = (kor) i.c.b();
                aozy createBuilder2 = ammf.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar2 = createBuilder2.b;
                ammf ammfVar3 = (ammf) apagVar2;
                ammfVar3.c = 1;
                ammfVar3.b = 1 | ammfVar3.b;
                amme ammeVar2 = amme.MESSAGE_STUCK_IN_SENDING;
                if (!apagVar2.isMutable()) {
                    createBuilder2.u();
                }
                ammf ammfVar4 = (ammf) createBuilder2.b;
                ammfVar4.d = ammeVar2.o;
                ammfVar4.b |= 2;
                korVar2.f((ammf) createBuilder2.s());
            }
            i.d.D(i);
            return;
        }
        i.d.H(i);
    }

    @Override // defpackage.via
    public final boolean C(vhv vhvVar) {
        return ((vhw) this.g.b()).c(vhvVar);
    }

    @Override // defpackage.via
    public final boolean D(vhv vhvVar) {
        return ((vhw) this.g.b()).d(vhvVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f9  */
    @Override // defpackage.via
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean E() {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vic.E():boolean");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    @Override // defpackage.via
    public final void F() {
        gpx gpxVar = (gpx) ((aaya) this.i.b()).k.b();
        P(((vjs) gpxVar.c).k(new iie(gpxVar, 0), vhu.DASHER_DISABLED));
    }

    @Override // defpackage.via
    public final akul G() {
        return aktp.ag(null);
    }

    @Override // defpackage.via
    public final void H(vhv vhvVar) {
        ((vhw) this.g.b()).f(vhvVar);
    }

    @Override // defpackage.via
    public final void I(final int i, final int i2) {
        vhu vhuVar;
        vhu vhuVar2;
        vhu vhuVar3;
        final gpx gpxVar = (gpx) ((aaya) this.i.b()).a.b();
        if (i - 1 != 2) {
            if (i2 == 2) {
                vhuVar3 = vhu.PRIMARY_DEVICE_CHANGED_MD;
                vhuVar = vhuVar3;
                i2 = 2;
            } else if (i2 == 3) {
                vhuVar2 = vhu.BACKUP_DELETED_MD;
                vhuVar = vhuVar2;
                i2 = 3;
            } else {
                vhuVar = vhu.UNSPECIFIED_PRIMARY_DEVICE_ENFORCEMENT_MD;
            }
        } else if (i2 == 2) {
            vhuVar3 = vhu.PRIMARY_DEVICE_CHANGED_BNR;
            vhuVar = vhuVar3;
            i2 = 2;
        } else if (i2 == 3) {
            vhuVar2 = vhu.BACKUP_DELETED_BNR;
            vhuVar = vhuVar2;
            i2 = 3;
        } else {
            vhuVar = vhu.UNSPECIFIED_PRIMARY_DEVICE_ENFORCEMENT_BNR;
        }
        P(((vjs) gpxVar.a).k(new vja() { // from class: iif
            /* JADX WARN: Type inference failed for: r0v16, types: [qoq, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r9v21, types: [qoq, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r9v3, types: [qoq, java.lang.Object] */
            @Override // defpackage.vja
            public final Notification a(String str) {
                String string;
                String string2;
                Intent a2;
                Intent d;
                int i3 = i;
                gpx gpxVar2 = gpx.this;
                int i4 = i2;
                if (!xxy.a()) {
                    string = ((Context) gpxVar2.b).getString(R.string.opt_out_multidevice_notification_title_legacy_res_0x7f140b9f);
                } else if (i3 - 1 != 2) {
                    if (i4 == 1) {
                        string = ((Context) gpxVar2.b).getString(R.string.unspecified_opt_out_multidevice_notification_title);
                        i4 = 1;
                    } else {
                        string = ((Context) gpxVar2.b).getString(R.string.opt_out_multidevice_notification_title);
                    }
                } else if (i4 == 1) {
                    string = ((Context) gpxVar2.b).getString(R.string.unspecified_opt_out_bnr_notification_title);
                    i4 = 1;
                } else {
                    string = ((Context) gpxVar2.b).getString(R.string.opt_out_bnr_notification_title);
                }
                if (!xxy.a()) {
                    string2 = ((Context) gpxVar2.b).getString(R.string.primary_device_changed_multidevice_notification_body_legacy);
                } else if (i3 - 1 != 2) {
                    if (i4 == 2) {
                        string2 = ((Context) gpxVar2.b).getString(R.string.primary_device_changed_multidevice_notification_body);
                    } else if (i4 == 3) {
                        string2 = ((Context) gpxVar2.b).getString(R.string.backup_deleted_multidevice_notification_body);
                    } else {
                        string2 = ((Context) gpxVar2.b).getString(R.string.unspecified_opt_out_multidevice_notification_body);
                    }
                } else if (i4 == 2) {
                    string2 = ((Context) gpxVar2.b).getString(R.string.primary_device_changed_bnr_notification_body);
                } else if (i4 == 3) {
                    string2 = ((Context) gpxVar2.b).getString(R.string.backup_deleted_bnr_notification_body);
                } else {
                    string2 = ((Context) gpxVar2.b).getString(R.string.unspecified_opt_out_bnr_notification_body);
                }
                dyu dyuVar = new dyu((Context) gpxVar2.b, str);
                dyuVar.i(string);
                dyuVar.h(string2);
                dyuVar.q(R.drawable.notification_icon);
                dyuVar.l = 0;
                dyo dyoVar = new dyo(dyuVar);
                dyoVar.d(string2);
                dyuVar.t(dyoVar);
                if (xxy.a()) {
                    if (i3 - 1 != 2) {
                        if (((Boolean) xxy.e.e()).booleanValue()) {
                            d = gpxVar2.c.d((Context) gpxVar2.b);
                        } else if (((Optional) gpxVar2.d).isPresent()) {
                            d = ((ihk) ((Optional) gpxVar2.d).get()).a();
                        } else {
                            d = null;
                        }
                    } else {
                        d = gpxVar2.c.d((Context) gpxVar2.b);
                    }
                    d.getClass();
                    dzx dzxVar = new dzx((Context) gpxVar2.b);
                    dzxVar.d(d);
                    PendingIntent a3 = dzxVar.a(0, yhy.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
                    a3.getClass();
                    dyuVar.g(true);
                    dyuVar.g = a3;
                } else if (((Optional) gpxVar2.d).isPresent()) {
                    if (((Boolean) xxy.e.e()).booleanValue()) {
                        a2 = gpxVar2.c.d((Context) gpxVar2.b);
                    } else {
                        a2 = ((ihk) ((Optional) gpxVar2.d).get()).a();
                    }
                    dzx dzxVar2 = new dzx((Context) gpxVar2.b);
                    dzxVar2.d(a2);
                    PendingIntent a4 = dzxVar2.a(0, yhy.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
                    a4.getClass();
                    dyuVar.g(true);
                    dyuVar.g = a4;
                    dyuVar.d(R.drawable.notification_icon, ((Context) gpxVar2.b).getString(R.string.primary_device_changed_notification_action_sign_in), a4);
                }
                return dyuVar.a();
            }
        }, vhuVar));
    }

    @Override // defpackage.via
    public final vjs J() {
        return (vjs) this.e.b();
    }

    @Override // defpackage.vix
    public final akul K(Throwable th, long j) {
        ((alwl) ((alwl) ((alwl) a.g()).g(th)).h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl", "postReportIssueNotification", (char) 622, "BugleNotificationManagerImpl.java")).q("Messages automatically detected an error. Showing notification");
        armf armfVar = this.i;
        amme ammeVar = amme.SILENT_CRASH;
        yyt yytVar = (yyt) ((aaya) armfVar.b()).d.b();
        xsr a2 = viw.a();
        a2.e(amme.SILENT_CRASH);
        a2.a = Optional.of(th);
        return S(ammeVar, yytVar.U(a2.d()), j);
    }

    @Override // defpackage.vix
    public final akul L(amme ammeVar, String str, long j, alor alorVar) {
        return S(ammeVar, ((aaya) this.i.b()).f(ammeVar, str, alorVar), j);
    }

    public final void M(amme ammeVar, vhv vhvVar) {
        Optional empty;
        Bundle bundle;
        StatusBarNotification[] activeNotifications = ((NotificationManager) this.q.get()).getActiveNotifications();
        int length = activeNotifications.length;
        int i = 0;
        while (true) {
            if (i < length) {
                StatusBarNotification statusBarNotification = activeNotifications[i];
                if (statusBarNotification.getId() == vhu.REPORT_ISSUE.F && (bundle = statusBarNotification.getNotification().extras) != null) {
                    empty = Optional.of(amme.b(bundle.getInt("issue_type_extra")));
                    break;
                }
                i++;
            } else {
                empty = Optional.empty();
                break;
            }
        }
        if (P(vhvVar)) {
            empty.ifPresent(new uoa(this, 13));
            R(2, ammeVar);
        }
    }

    @Override // defpackage.vix
    public final void N(amme ammeVar, String str) {
        M(ammeVar, ((aaya) this.i.b()).f(ammeVar, str, null));
    }

    public final boolean O(vhu vhuVar) {
        for (StatusBarNotification statusBarNotification : ((NotificationManager) this.q.get()).getActiveNotifications()) {
            if (statusBarNotification.getId() == vhuVar.F) {
                return true;
            }
        }
        return false;
    }

    public final boolean P(vhv vhvVar) {
        if (!E()) {
            alwl alwlVar = (alwl) a.g();
            alwlVar.X(vhv.f, vhvVar);
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl", "notifyIfAllowed", 421, "BugleNotificationManagerImpl.java")).q("Notifications disabled, won't notify");
            return false;
        }
        return D(vhvVar);
    }

    @Override // defpackage.vix
    public final void Q(amme ammeVar, String str) {
        S(ammeVar, ((aaya) this.i.b()).f(ammeVar, str, null), 0L);
    }

    public final void R(int i, amme ammeVar) {
        kor korVar = (kor) this.m.b();
        aozy createBuilder = ammf.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ammf ammfVar = (ammf) apagVar;
        ammfVar.c = i - 1;
        ammfVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ammf ammfVar2 = (ammf) createBuilder.b;
        ammfVar2.d = ammeVar.o;
        ammfVar2.b |= 2;
        korVar.f((ammf) createBuilder.s());
    }

    @Override // defpackage.via
    public final Notification a() {
        return b(this.f.getString(R.string.foreground_service_notification_generic_text));
    }

    @Override // defpackage.via
    public final Notification b(String str) {
        return ((aaya) this.i.b()).d(str).b();
    }

    @Override // defpackage.via
    public final Notification c() {
        return this.d;
    }

    @Override // defpackage.via
    public final vhz d() {
        return (vhz) this.k.get();
    }

    @Override // defpackage.via
    public final /* synthetic */ void e() {
        g(vhu.AUTOMOVED_SPAM);
    }

    @Override // defpackage.via
    public final /* synthetic */ void f() {
        g(vhu.DIAGNOSTICS_TOOL);
    }

    @Override // defpackage.via
    public final void g(vhu vhuVar) {
        h(null, vhuVar);
    }

    @Override // defpackage.via
    public final void h(String str, vhu vhuVar) {
        ((vhw) this.g.b()).b(str, vhuVar);
    }

    @Override // defpackage.via
    public final /* synthetic */ void i() {
        g(vhu.REPORT_ISSUE);
    }

    @Override // defpackage.via
    public final /* synthetic */ void j() {
        g(vhu.SIM_STORAGE_FULL);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    @Override // defpackage.via
    public final void k() {
        kkc kkcVar = (kkc) ((aaya) this.i.b()).i.b();
        P(((vjs) kkcVar.a).k(new vgg(kkcVar, 1), vhu.ACCOUNT_REMOVED));
    }

    @Override // defpackage.via
    public final void l() {
        aaya aayaVar = (aaya) this.i.b();
        aayaVar.getClass();
        aktp.ai(new vib(aayaVar, 0), this.j).k(qjc.a(new isn(this, 9)), andi.a);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [apwt, java.lang.Object] */
    @Override // defpackage.via
    public final void m() {
        ?? r0 = ((aaya) this.i.b()).n;
        String string = this.f.getString(R.string.foreground_service_notification_generic_text);
        yyt yytVar = (yyt) r0.b();
        P(((vjs) yytVar.d.b()).l(new iie((Object) yytVar, string, 3), vhu.CMS_SYNC_FOREGROUND_SERVICE, new vie(yytVar, 0)));
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [armf, java.lang.Object] */
    @Override // defpackage.via
    public final void n(Intent intent) {
        if (!O(vhu.UNSPECIFIED_PRIMARY_DEVICE_ENFORCEMENT_MD) && !O(vhu.UNSPECIFIED_PRIMARY_DEVICE_ENFORCEMENT_BNR)) {
            ico icoVar = (ico) ((aaya) this.i.b()).g.b();
            P(((vjs) icoVar.b).k(new iie(icoVar, intent, 1), vhu.CMS_VITAL_ERROR));
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    @Override // defpackage.via
    public final void o() {
        vco vcoVar = (vco) ((aaya) this.i.b()).l.b();
        P(((vjs) vcoVar.b).k(new vgg(vcoVar, 2), vhu.DIAGNOSTICS_TOOL));
    }

    @Override // defpackage.via
    public final void p() {
        P(((aaya) this.i.b()).d(this.f.getString(R.string.foreground_service_notification_generic_text)));
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [armf, java.lang.Object] */
    @Override // defpackage.via
    public final void q() {
        if (!Collection.EL.stream((Set) this.r.b()).allMatch(new uzr(8))) {
            return;
        }
        wpp wppVar = (wpp) ((aaya) this.i.b()).j.b();
        P(((vjs) wppVar.a).k(new vgg(wppVar, 0), vhu.GAIA_PAIRING_VERIFICATION));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [armf, java.lang.Object] */
    @Override // defpackage.via
    public final void r(final ConversationId conversationId, final int i, final int i2) {
        final wpp wppVar = (wpp) ((aaya) this.i.b()).o.b();
        String valueOf = String.valueOf(vhu.MEDIA_RESIZING.G);
        Object obj = wppVar.a;
        vja vjaVar = new vja() { // from class: vih
            /* JADX WARN: Type inference failed for: r8v11, types: [qoq, java.lang.Object] */
            @Override // defpackage.vja
            public final Notification a(String str) {
                String str2;
                wpp wppVar2 = wpp.this;
                Resources resources = ((Context) wppVar2.c).getResources();
                int i3 = i;
                int i4 = i2;
                if (i3 > 0 && i4 > 0) {
                    int i5 = i3 + i4;
                    str2 = resources.getQuantityString(R.plurals.resize_service_notification_title_attachment_plural, i5, Integer.valueOf(i5));
                } else if (i3 > 0 && i4 == 0) {
                    str2 = resources.getQuantityString(R.plurals.resize_service_notification_title_photo_plural, i3, Integer.valueOf(i3));
                } else if (i3 == 0 && i4 > 0) {
                    str2 = resources.getQuantityString(R.plurals.resize_service_notification_title_video_plural, i4, Integer.valueOf(i4));
                } else {
                    str2 = "";
                }
                ConversationId conversationId2 = conversationId;
                dyu dyuVar = new dyu((Context) wppVar2.c, str);
                dyuVar.q(R.drawable.notification_icon);
                dyuVar.C = ((Context) wppVar2.c).getColor(R.color.primary_brand_non_icon_color);
                dyuVar.i(str2);
                dyuVar.h(((Context) wppVar2.c).getText(R.string.resize_service_notification_text));
                dyuVar.p(true);
                dyuVar.l = 2;
                dyuVar.O = true;
                if (!(conversationId2 instanceof InvalidConversationId)) {
                    dyuVar.g = wppVar2.b.m((Context) wppVar2.c, conversationId2, false);
                }
                return dyuVar.a();
            }
        };
        ?? r10 = ((vjs) obj).a;
        vhu vhuVar = vhu.MEDIA_RESIZING;
        vjs vjsVar = (vjs) r10.b();
        vjsVar.getClass();
        vhuVar.getClass();
        vjb vjbVar = new vjb(vjsVar, vjaVar, vhuVar, valueOf.concat("[silent]"), null);
        this.d = vjbVar.b();
        P(vjbVar);
    }

    @Override // defpackage.via
    public final void s(ConversationIdType conversationIdType, msh mshVar) {
        P(((aaya) this.i.b()).e((qoq) this.l.b(), conversationIdType, mshVar.G(((Boolean) new mss(10).get()).booleanValue()).toString()));
    }

    @Override // defpackage.via
    public final void t(ConversationIdType conversationIdType, String str) {
        P(((aaya) this.i.b()).e((qoq) this.l.b(), conversationIdType, str));
    }

    @Override // defpackage.via
    public final void u() {
        P(((aaya) this.i.b()).g(this));
    }

    @Override // defpackage.via
    public final void v() {
        P(((aaya) this.i.b()).h(this));
    }

    @Override // defpackage.via
    public final void w(final int i, final String str) {
        final wpp wppVar = (wpp) ((aaya) this.i.b()).c.b();
        P(((vjs) wppVar.a).k(new vja() { // from class: viy
            @Override // defpackage.vja
            public final Notification a(String str2) {
                wpp wppVar2 = wpp.this;
                Context context = (Context) wppVar2.c;
                dzx dzxVar = new dzx(context);
                Intent intent = new Intent(context, (Class<?>) PerSubscriptionSettingsActivity.class);
                int i2 = i;
                dzxVar.c(intent.putExtra("sub_id", i2).putExtra("per_sub_setting_title", str));
                dzxVar.c(((lzv) ((ghw) wppVar2.b).a).m(context, i2));
                ClipData clipData = aipr.a;
                PendingIntent a2 = dzxVar.a(0, 201326592);
                a2.getClass();
                Optional of = Optional.of(a2);
                if (of.isEmpty()) {
                    return null;
                }
                Resources resources = ((Context) wppVar2.c).getResources();
                String string = resources.getString(R.string.sim_storage_full_text);
                dyu dyuVar = new dyu((Context) wppVar2.c, str2);
                dyuVar.i(resources.getString(R.string.sim_storage_full_title));
                dyuVar.h(string);
                dyuVar.q(R.drawable.ic_warning_light);
                dyo dyoVar = new dyo(dyuVar);
                dyoVar.d(string);
                dyuVar.t(dyoVar);
                dyuVar.g = (PendingIntent) of.get();
                return dyuVar.a();
            }
        }, vhu.SIM_STORAGE_FULL));
    }

    @Override // defpackage.via
    public final void x() {
        P(((aaya) this.i.b()).i(this));
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    @Override // defpackage.via
    public final void y() {
        if (!E()) {
            ((alwl) a.n().h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl", "refreshMessageFailureNotification", 171, "BugleNotificationManagerImpl.java")).q("Notifications disabled, won't refresh message failure.");
            return;
        }
        yyz yyzVar = (yyz) ((aaya) this.i.b()).m.b();
        Context context = (Context) yyzVar.f.b();
        context.getClass();
        vjs vjsVar = (vjs) yyzVar.m.b();
        vjsVar.getClass();
        ((wnt) yyzVar.h.b()).getClass();
        mbl mblVar = (mbl) yyzVar.j.b();
        mblVar.getClass();
        xnv xnvVar = (xnv) yyzVar.c.b();
        xnvVar.getClass();
        qoq qoqVar = (qoq) yyzVar.g.b();
        qoqVar.getClass();
        wpp wppVar = (wpp) yyzVar.a.b();
        wppVar.getClass();
        ((znj) yyzVar.b.b()).getClass();
        ibi ibiVar = (ibi) yyzVar.l.b();
        ibiVar.getClass();
        lrf lrfVar = (lrf) yyzVar.e.b();
        lrfVar.getClass();
        ?? r14 = yyzVar.i;
        new vim(context, vjsVar, yyzVar.d, yyzVar.k, mblVar, xnvVar, qoqVar, wppVar, ibiVar, this, lrfVar, r14).d(false);
    }

    @Override // defpackage.via
    public final void z(alog alogVar) {
        boolean z;
        if (!E()) {
            ((alwl) a.n().h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl", "refreshRcsNotDeliveredNotification", BasePaymentResult.ERROR_REQUEST_TIMEOUT, "BugleNotificationManagerImpl.java")).q("Notifications disabled, cannot refresh the RCS not delivered notification.");
            return;
        }
        vit g = ((aaya) this.i.b()).g(this);
        int size = alogVar.size();
        g.l = size;
        if (size == 0) {
            if (g.a.C(g)) {
                g.c.c("Bugle.Notification.RcsNotDelivered.AutoDismissed.Count");
            }
            g.a.h("rcs_not_delivered_notification_tag", g.c());
            return;
        }
        alog alogVar2 = (alog) Collection.EL.stream(alogVar).map(new vil(2)).collect(alls.a);
        sxy d = MessagesTable.d();
        d.w("+RcsNotDeliveredNotification#refresh");
        d.g(new viu(alogVar2, 1));
        alpt alptVar = (alpt) Collection.EL.stream(d.b().f()).collect(alls.b);
        int size2 = alptVar.size();
        g.k = size2;
        if (size2 == 1) {
            g.i = (ConversationIdType) Collection.EL.stream(alptVar).iterator2().next();
            smr q = ((rtz) g.b.b()).q(g.i);
            q.getClass();
            g.h = Optional.ofNullable(q.P());
            if (qrl.a()) {
                z = q.ac();
            } else {
                z = false;
            }
            g.m = z;
            g.j = ((lrf) g.e.b()).l(g.i, q.S(), g.m);
        }
        if (Collection.EL.stream(alogVar).anyMatch(new uzr(9))) {
            if (g.a.C(g)) {
                g.a.H(g);
            } else if (g.a.D(g)) {
                g.c.c("Bugle.Notification.RcsNotDelivered.Posted.Count");
                g.d.d(3);
            }
        }
    }
}
