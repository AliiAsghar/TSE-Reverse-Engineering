package defpackage;

import android.content.Context;
import android.service.notification.StatusBarNotification;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vjw extends unl {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/notification2o/CancelNotificationHandler");
    public final Map b;
    private final anen c;
    private final armf d;
    private final vln e;
    private final vkt f;
    private final dzt g;
    private final vco h;

    public vjw(Context context, anen anenVar, armf armfVar, Map map, vln vlnVar, vkt vktVar, vco vcoVar) {
        this.g = new dzt(context);
        this.c = anenVar;
        this.d = armfVar;
        this.b = map;
        this.e = vlnVar;
        this.f = vktVar;
        this.h = vcoVar;
    }

    private final void k(vlm vlmVar, List list) {
        if (list.isEmpty()) {
            alvw g = a.g();
            g.X(alwp.a, "BugleNotifications");
            alvg alvgVar = (alvg) g;
            alvgVar.X(vjh.n, vlmVar);
            alvgVar.X(vjh.d, null);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/notification2o/CancelNotificationHandler", "runCancelCallbacks", 147, "CancelNotificationHandler.java")).q("No notifications given, not running cancel callbacks");
            return;
        }
        aktp.aa(aktp.aj(new ncx(this, list, vlmVar, 11, (char[]) null), this.c), new pum(6), andi.a);
    }

    @Override // defpackage.unl, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        Long l = (Long) this.d.b();
        l.getClass();
        a2.e(l.intValue());
        if (this.g.g()) {
            vkt vktVar = this.f;
            if (!vktVar.k(vktVar.f())) {
                a2.c(unv.FOREGROUND_SERVICE);
                a2.b = this.h.w();
                return a2.a();
            }
        }
        a2.c(unv.WAKELOCK);
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("CancelNotificationHandler");
    }

    @Override // defpackage.unx
    public final apca e() {
        return vkq.a.getParserForType();
    }

    @Override // defpackage.unl, defpackage.unx
    public final String f() {
        return "shared_notification_queue_name";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.unl
    public final akul j(alog alogVar) {
        for (int i = 0; i < ((alsx) alogVar).c; i++) {
            vkq vkqVar = (vkq) alogVar.get(i);
            if ((vkqVar.b & 2) != 0) {
                vlm b = vlm.b(vkqVar.c);
                if (b == null) {
                    b = vlm.NT_UNKNOWN;
                }
                String str = vkqVar.d;
                StatusBarNotification a2 = this.e.a(b, str);
                if (!vln.f(a2)) {
                    alvw g = a.g();
                    g.X(alwp.a, "BugleNotifications");
                    alvg alvgVar = (alvg) g;
                    alvgVar.X(vjh.n, b);
                    alvgVar.X(vjh.d, str);
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/notification2o/CancelNotificationHandler", "cancelNotification", 130, "CancelNotificationHandler.java")).q("No active notification to cancel");
                } else {
                    this.e.d(a2);
                    a2.getClass();
                    k(b, Arrays.asList(a2));
                }
            } else {
                vlm b2 = vlm.b(vkqVar.c);
                if (b2 == null) {
                    b2 = vlm.NT_UNKNOWN;
                }
                List c = this.e.c(b2);
                if (c.isEmpty()) {
                    alvw g2 = a.g();
                    g2.X(alwp.a, "BugleNotifications");
                    alvg alvgVar2 = (alvg) g2;
                    alvgVar2.X(vjh.n, b2);
                    ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/notification2o/CancelNotificationHandler", "cancelNotificationsOfType", 108, "CancelNotificationHandler.java")).q("No active status bar notification of this type exists, cancelNotificationsOfType does nothing");
                } else {
                    vln vlnVar = this.e;
                    Iterator it = c.iterator();
                    while (it.hasNext()) {
                        vlnVar.d((StatusBarNotification) it.next());
                    }
                    k(b2, c);
                    alvw g3 = a.g();
                    g3.X(alwp.a, "BugleNotifications");
                    alvg alvgVar3 = (alvg) g3;
                    alvgVar3.X(vjh.n, b2);
                    ((alvg) alvgVar3.h("com/google/android/apps/messaging/shared/notification2o/CancelNotificationHandler", "cancelNotificationsOfType", 119, "CancelNotificationHandler.java")).q("Cancelled the active status bar notifications that match the type");
                }
            }
        }
        return aktp.ag(upm.b());
    }
}
