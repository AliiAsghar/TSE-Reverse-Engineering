package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import j$.util.DesugarArrays;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vhy implements vhw {
    public static final /* synthetic */ int a = 0;
    private static final alwo b = alwo.o("BugleNotifications");
    private final Context c;
    private final armf d;
    private final armf e;
    private final dzt f;
    private final alhr g;

    public vhy(Context context, armf armfVar, armf armfVar2) {
        this.c = context;
        this.d = armfVar;
        this.e = armfVar2;
        this.f = new dzt(context);
        this.g = new uqw(context, 17);
    }

    private final boolean g(String str) {
        for (StatusBarNotification statusBarNotification : ((NotificationManager) this.g.get()).getActiveNotifications()) {
            if (TextUtils.equals(statusBarNotification.getTag(), str)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.vhw
    public final StatusBarNotification a(final String str, final int i) {
        if (str == null) {
            return null;
        }
        return (StatusBarNotification) DesugarArrays.stream(((NotificationManager) this.g.get()).getActiveNotifications()).filter(new Predicate() { // from class: vhx
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo407negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                StatusBarNotification statusBarNotification = (StatusBarNotification) obj;
                int i2 = vhy.a;
                if (TextUtils.equals(statusBarNotification.getTag(), str)) {
                    if (statusBarNotification.getId() == i) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        }).findFirst().orElse(null);
    }

    @Override // defpackage.vhw
    public final void b(String str, vhu vhuVar) {
        this.f.c(str, vhuVar.F);
        if (g(str)) {
            int length = ((NotificationManager) this.g.get()).getActiveNotifications().length;
            alwl alwlVar = (alwl) b.g();
            alwlVar.X(vjh.d, str);
            alwlVar.X(vhv.g, vhuVar);
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/notification/BugleNotificationDispatcherImpl", "cancelNotification", 223, "BugleNotificationDispatcherImpl.java")).r("Canceling notification, active count: %d", length);
        }
    }

    @Override // defpackage.vhw
    public final boolean c(vhv vhvVar) {
        return g(vhvVar.e());
    }

    @Override // defpackage.vhw
    public final boolean d(vhv vhvVar) {
        String channelId;
        String channelId2;
        NotificationChannel notificationChannel;
        Notification b2 = vhvVar.b();
        int i = 0;
        if (b2 == null) {
            alwl alwlVar = (alwl) b.g();
            alwlVar.X(vhv.f, vhvVar);
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/notification/BugleNotificationDispatcherImpl", "notify", 84, "BugleNotificationDispatcherImpl.java")).q("Won't notify null Android notification");
            return false;
        }
        String e = vhvVar.e();
        try {
            if (e != null) {
                this.f.f(e, vhvVar.a(), b2);
            } else {
                this.f.e(vhvVar.a(), b2);
            }
            try {
                Object obj = this.g.get();
                channelId2 = b2.getChannelId();
                notificationChannel = ((NotificationManager) obj).getNotificationChannel(channelId2);
                i = notificationChannel.getImportance();
            } catch (Exception e2) {
                ((alwl) ((alwl) ((alwl) b.i()).g(e2)).h("com/google/android/apps/messaging/shared/notification/BugleNotificationDispatcherImpl", "notify", '~', "BugleNotificationDispatcherImpl.java")).q("Error getting notification channel importance.");
                i = -1;
            }
            channelId = b2.getChannelId();
            alwl alwlVar2 = (alwl) b.g();
            alwlVar2.X(vhv.f, vhvVar);
            alwlVar2.X(vjh.c, Integer.valueOf(i));
            alwlVar2.X(vjh.k, channelId);
            ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/notification/BugleNotificationDispatcherImpl", "notify", 136, "BugleNotificationDispatcherImpl.java")).q("Notifying");
            return true;
        } catch (RuntimeException e3) {
            StackTraceElement[] stackTrace = e3.getStackTrace();
            if (stackTrace.length > 0 && TextUtils.equals(stackTrace[i].getClassName(), "android.os.Parcel") && TextUtils.equals(stackTrace[i].getMethodName(), "readIntArray")) {
                alwl alwlVar3 = (alwl) ((alwl) b.i()).g(e3);
                alwlVar3.X(vhv.f, vhvVar);
                ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/notification/BugleNotificationDispatcherImpl", "notify", 104, "BugleNotificationDispatcherImpl.java")).q("Encountered an error when notifying");
                return true;
            }
            throw e3;
        }
    }

    @Override // defpackage.vhw
    public final boolean e() {
        Context context = this.c;
        return ((yhu) this.e.b()).h(((ykw) this.d.b()).q(context.getString(R.string.notifications_enabled_pref_key), context.getResources().getBoolean(R.bool.notifications_enabled_pref_default)));
    }

    @Override // defpackage.vhw
    public final void f(vhv vhvVar) {
        if (c(vhvVar)) {
            d(vhvVar);
            return;
        }
        alwl alwlVar = (alwl) b.g();
        alwlVar.X(vjh.d, vhvVar.e());
        alwlVar.X(vhv.f, vhvVar);
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/notification/BugleNotificationDispatcherImpl", "updateIfActive", 160, "BugleNotificationDispatcherImpl.java")).q("Notifications is not active, won't update it.");
    }
}
