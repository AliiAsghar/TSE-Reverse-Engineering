package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.action.NoConfirmationMessageSendAction;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.ahka;
import defpackage.ahqq;
import defpackage.aiut;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.alls;
import defpackage.alog;
import defpackage.alwl;
import defpackage.alwo;
import defpackage.amhc;
import defpackage.aoyj;
import defpackage.aozy;
import defpackage.apag;
import defpackage.apax;
import defpackage.armf;
import defpackage.dyu;
import defpackage.dzt;
import defpackage.lqn;
import defpackage.mbl;
import defpackage.mgv;
import defpackage.mho;
import defpackage.rjb;
import defpackage.ruy;
import defpackage.uof;
import defpackage.upk;
import defpackage.vhu;
import defpackage.vhw;
import defpackage.vip;
import defpackage.viq;
import defpackage.vjm;
import defpackage.vjp;
import defpackage.vjs;
import defpackage.vtc;
import defpackage.wga;
import defpackage.wlp;
import defpackage.xcr;
import defpackage.xcs;
import defpackage.xyo;
import defpackage.xyq;
import defpackage.xze;
import defpackage.yhx;
import j$.util.Collection;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class NotificationReceiver extends wlp {
    public armf c;
    public armf d;
    public armf e;
    public armf f;
    public armf g;
    public armf h;
    public armf i;
    public armf j;
    public armf k;
    public armf l;
    public armf m;
    private static final xze n = xze.g("Bugle", "NotificationReceiver");
    public static final alwo a = alwo.o("BugleNotifications");
    public static final ahka b = new ahka("SwipeNotificationTimer");

    @Override // defpackage.wng
    public final akrc a() {
        return ((aksr) this.g.b()).b("NotificationReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "Bugle.Broadcast.Notification.Latency";
    }

    @Override // defpackage.wng
    protected final int e() {
        return 18;
    }

    @Override // defpackage.wna
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.Notification.Latency";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.Object, wul] */
    /* JADX WARN: Type inference failed for: r11v37, types: [armf, java.lang.Object] */
    @Override // defpackage.wna
    public final void g(Context context, Intent intent) {
        char c;
        String stringExtra;
        StatusBarNotification a2;
        xze xzeVar = n;
        xyo c2 = xzeVar.c();
        c2.H("onReceive.");
        c2.z("intent", intent);
        c2.q();
        String action = intent.getAction();
        if (action == null) {
            xzeVar.m("Missing action in intent");
            return;
        }
        int i = 2;
        switch (action.hashCode()) {
            case -759508139:
                if (action.equals("com.google.android.apps.messaging.notification_reply")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 881519446:
                if (action.equals("com.google.android.apps.messaging.reset_failed_message_notification")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1514506865:
                if (action.equals("com.google.android.apps.messaging.clear_bubble_metadata")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1928082713:
                if (action.equals("com.google.android.apps.messaging.reset_notifications")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        xyo e = xzeVar.e();
                        e.H("Unexpected action");
                        e.z(GroupManagementRequest.ACTION_TAG, action);
                        e.q();
                        return;
                    }
                    if (yhx.d && (a2 = ((vhw) this.i.b()).a((stringExtra = intent.getStringExtra("notification_tag")), vhu.INCOMING_MESSAGE.F)) != null) {
                        dyu dyuVar = new dyu((Context) this.m.b(), a2.getNotification());
                        dyuVar.M = null;
                        new dzt((Context) this.m.b()).f(stringExtra, vhu.INCOMING_MESSAGE.F, dyuVar.a());
                        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/receiver/NotificationReceiver", "clearBubbleMetadata", 165, "NotificationReceiver.java")).t("Clearing bubble metadata for tag: %s", stringExtra);
                        return;
                    }
                    return;
                }
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("failed_messages");
                if (parcelableArrayListExtra == null) {
                    xzeVar.q("No failed message info provided");
                    return;
                }
                vjs vjsVar = (vjs) this.d.b();
                aozy createBuilder = vjp.a.createBuilder();
                Stream map = Collection.EL.stream(parcelableArrayListExtra).map(new wga(20));
                int i2 = alog.d;
                Iterable iterable = (Iterable) map.collect(alls.a);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                vjp vjpVar = (vjp) createBuilder.b;
                apax apaxVar = vjpVar.b;
                if (!apaxVar.c()) {
                    vjpVar.b = apag.mutableCopy(apaxVar);
                }
                aoyj.addAll(iterable, vjpVar.b);
                ((uof) vjsVar.a.b()).b(upk.a("mark_failures_as_notified", (vjp) createBuilder.s()));
                return;
            }
            ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/receiver/NotificationReceiver", "replyViaNotification", 229, "NotificationReceiver.java")).q("Reply via notification start");
            ((xcs) this.l.b()).h(xcr.NOTIFICATION);
            Intent a3 = lqn.f(context, NoConfirmationMessageSendAction.class, "android.intent.action.RESPOND_VIA_MESSAGE").a();
            a3.putExtras(intent);
            a3.setClipData(intent.getClipData());
            ((rjb) this.f.b()).a(this, a3);
            return;
        }
        ahqq a4 = ((mgv) this.k.b()).a();
        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/receiver/NotificationReceiver", "resetNotifications", 170, "NotificationReceiver.java")).q("User swiped/cleared notification");
        String stringExtra2 = intent.getStringExtra("conversation_id_set");
        if (stringExtra2 == null) {
            xzeVar.o("marking all messages as notified.");
            vjs vjsVar2 = (vjs) this.c.b();
            aozy createBuilder2 = vjm.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            vjm.a((vjm) createBuilder2.b);
            vjsVar2.i((vjm) createBuilder2.s());
        } else {
            xyq xyqVar = new xyq(ruy.c(Arrays.asList(stringExtra2.split("\\|"))));
            vjs vjsVar3 = (vjs) this.c.b();
            aozy createBuilder3 = vjm.a.createBuilder();
            int i3 = 18;
            Iterable iterable2 = (Iterable) Collection.EL.stream(xyqVar).map(new wga(19)).collect(Collectors.toCollection(new vtc(i3)));
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            vjm vjmVar = (vjm) createBuilder3.b;
            apax apaxVar2 = vjmVar.b;
            if (!apaxVar2.c()) {
                vjmVar.b = apag.mutableCopy(apaxVar2);
            }
            aoyj.addAll(iterable2, vjmVar.b);
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            vjm.a((vjm) createBuilder3.b);
            vjsVar3.i((vjm) createBuilder3.s());
            ((mbl) this.e.b()).c("Bugle.Notification.SwipeHorizontallyAway.Count");
            ((mho) this.h.b()).aK(amhc.INCOMING_MSG_NOTIFICATION, 3, (List) Collection.EL.stream(xyqVar).collect(Collectors.toCollection(new vtc(i3))));
        }
        viq viqVar = (viq) this.j.b();
        if (aiut.g()) {
            ((alwl) viq.a.m().h("com/google/android/apps/messaging/shared/notification/NotificationMetricsEventLogger", "incrementSwipeToDismissCounterOnDisk", 318, "NotificationMetricsEventLogger.java")).q("Unable to increment swipe to dismiss count because main thread");
        } else {
            viqVar.c.get().m(new vip(i));
        }
        if (a4 != null) {
            ((mgv) this.k.b()).h(a4, b);
        }
    }

    @Override // defpackage.wna
    public final boolean i(Intent intent) {
        return true;
    }

    @Override // defpackage.wna
    public final String k(Context context, Intent intent) {
        return context.getString(R.string.updating_notifications_foreground_notification_text);
    }
}
