package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vln {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/notification2o/NotificationUtility");
    private final NotificationManager b;
    private final dzt c;
    private final Context d;

    public vln(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        notificationManager.getClass();
        this.b = notificationManager;
        this.c = new dzt(context);
        this.d = context;
    }

    public static final boolean e(StatusBarNotification statusBarNotification) {
        Notification notification;
        if (!yhx.d || statusBarNotification == null || (notification = statusBarNotification.getNotification()) == null || (notification.flags & 4096) != 4096) {
            return false;
        }
        return true;
    }

    public static final boolean f(StatusBarNotification statusBarNotification) {
        Notification.BubbleMetadata bubbleMetadata;
        boolean isNotificationSuppressed;
        if (statusBarNotification == null) {
            return false;
        }
        if (!yhx.d) {
            return true;
        }
        Notification notification = statusBarNotification.getNotification();
        if (notification == null) {
            return false;
        }
        bubbleMetadata = notification.getBubbleMetadata();
        if (bubbleMetadata != null) {
            isNotificationSuppressed = bubbleMetadata.isNotificationSuppressed();
            if (isNotificationSuppressed) {
                return false;
            }
        }
        return true;
    }

    public final StatusBarNotification a(vlm vlmVar, String str) {
        NotificationManager notificationManager = this.b;
        Optional of = Optional.of(str);
        for (StatusBarNotification statusBarNotification : Arrays.asList(notificationManager.getActiveNotifications())) {
            if (statusBarNotification.getId() == vlmVar.i && TextUtils.equals((CharSequence) of.orElse(null), statusBarNotification.getTag())) {
                return statusBarNotification;
            }
        }
        return null;
    }

    public final List b(String str) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return (List) DesugarArrays.stream(this.b.getActiveNotifications()).filter(new uhe(str, 10)).collect(Collectors.toCollection(new uzg(13)));
    }

    public final List c(vlm vlmVar) {
        return (List) DesugarArrays.stream(this.b.getActiveNotifications()).filter(new uhe(vlmVar, 11)).collect(Collectors.toCollection(new uzg(13)));
    }

    public final void d(StatusBarNotification statusBarNotification) {
        vlm b;
        StatusBarNotification statusBarNotification2;
        boolean anyMatch;
        if (statusBarNotification != null && f(statusBarNotification) && (b = vlm.b(statusBarNotification.getId())) != null && b != vlm.NT_UNKNOWN) {
            List list = (List) Collection.EL.stream(b(statusBarNotification.getNotification().getGroup())).filter(new uzr(19)).collect(Collectors.toCollection(new uzg(13)));
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    statusBarNotification2 = (StatusBarNotification) it.next();
                    if (dyd.d(statusBarNotification2.getNotification())) {
                        break;
                    }
                } else {
                    statusBarNotification2 = null;
                    break;
                }
            }
            String group = statusBarNotification.getNotification().getGroup();
            if (!yhx.d) {
                anyMatch = false;
            } else {
                anyMatch = Collection.EL.stream(b(group)).anyMatch(new uzr(20));
            }
            if (statusBarNotification2 != null && list.size() == 2 && !anyMatch) {
                alvw g = a.g();
                g.X(alwp.a, "BugleNotifications");
                alvg alvgVar = (alvg) g;
                alvgVar.X(vjh.n, b);
                alvgVar.X(vjh.d, statusBarNotification2.getTag());
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationUtility", "cancelNotification", 383, "NotificationUtility.java")).q("Canceling summary notification");
                this.c.c(statusBarNotification2.getTag(), statusBarNotification2.getId());
            }
            if (yhx.d && e(statusBarNotification)) {
                alvw g2 = a.g();
                g2.X(alwp.a, "BugleNotifications");
                alvg alvgVar2 = (alvg) g2;
                alvgVar2.X(vjh.n, b);
                alvgVar2.X(vjh.d, statusBarNotification.getTag());
                ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/notification2o/NotificationUtility", "cancelNotification", 395, "NotificationUtility.java")).q("Bubble showing, suppressing shade notification");
                dyu dyuVar = new dyu(this.d, statusBarNotification.getNotification());
                dyr c = dyd.c(statusBarNotification.getNotification());
                if (c != null) {
                    PendingIntent pendingIntent = c.a;
                    pendingIntent.getClass();
                    IconCompat iconCompat = c.c;
                    iconCompat.getClass();
                    rhc rhcVar = new rhc(pendingIntent, iconCompat);
                    rhcVar.d(Integer.MAX_VALUE);
                    rhcVar.f(true);
                    rhcVar.c(c.a());
                    rhcVar.e = c.b;
                    dyuVar.M = rhcVar.b();
                    int i = statusBarNotification.getNotification().flags;
                    Notification a2 = dyuVar.a();
                    a2.flags = i;
                    new dzt(this.d).f(statusBarNotification.getTag(), statusBarNotification.getId(), a2);
                    return;
                }
                return;
            }
            alvw g3 = a.g();
            g3.X(alwp.a, "BugleNotifications");
            alvg alvgVar3 = (alvg) g3;
            alvgVar3.X(vjh.n, b);
            alvgVar3.X(vjh.d, statusBarNotification.getTag());
            ((alvg) alvgVar3.h("com/google/android/apps/messaging/shared/notification2o/NotificationUtility", "cancelNotification", 402, "NotificationUtility.java")).q("Canceling notification");
            this.c.c(statusBarNotification.getTag(), statusBarNotification.getId());
        }
    }
}
