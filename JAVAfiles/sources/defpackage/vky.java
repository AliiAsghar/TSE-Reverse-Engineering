package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vky implements vkp {
    final /* synthetic */ vjs a;

    public vky(vjs vjsVar) {
        this.a = vjsVar;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [armf, java.lang.Object] */
    @Override // defpackage.vkp
    public final akul a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vkv vkvVar = (vkv) it.next();
            alwl alwlVar = (alwl) vkz.a.g();
            alwlVar.X(vjh.n, vkvVar.a);
            alwlVar.X(vjh.d, (String) vkvVar.b.orElse(null));
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationDirectorCallbacksModule$2", "onNotificationCanceled", 132, "NotificationDirectorCallbacksModule.java")).q("Notification canceled");
            ((mbl) this.a.a.b()).e("Bugle.Notifications2o.Canceled.Count", vkvVar.a.i);
        }
        return aktp.ag(null);
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [armf, java.lang.Object] */
    @Override // defpackage.vkp
    public final akul b(List list) {
        if (list.isEmpty()) {
            return aktp.ag(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vkv vkvVar = (vkv) it.next();
            alwl alwlVar = (alwl) vkz.a.g();
            alwlVar.X(vjh.n, vkvVar.a);
            alwlVar.X(vjh.d, (String) vkvVar.b.orElse(null));
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationDirectorCallbacksModule$2", "onNotificationPosted", 151, "NotificationDirectorCallbacksModule.java")).q("Notification posted");
            ((mbl) this.a.a.b()).e("Bugle.Notifications2o.Posted.Count", vkvVar.a.i);
        }
        return aktp.ag(null);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    @Override // defpackage.vkp
    public final akul c(vkv vkvVar) {
        alwl alwlVar = (alwl) vkz.a.g();
        alwlVar.X(vjh.n, vkvVar.a);
        alwlVar.X(vjh.d, (String) vkvVar.b.orElse(null));
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationDirectorCallbacksModule$2", "onNotificationBubbleClicked", 91, "NotificationDirectorCallbacksModule.java")).q("Bubble clicked");
        ((mbl) this.a.a.b()).e("Bugle.Notifications2o.BubbleClicked.Count", vkvVar.a.i);
        return aktp.ag(null);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    @Override // defpackage.vkp
    public final akul d(vkv vkvVar) {
        alwl alwlVar = (alwl) vkz.a.g();
        alwlVar.X(vjh.n, vkvVar.a);
        alwlVar.X(vjh.d, (String) vkvVar.b.orElse(null));
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationDirectorCallbacksModule$2", "onNotificationBubbleSwiped", 105, "NotificationDirectorCallbacksModule.java")).q("Bubble swiped");
        ((mbl) this.a.a.b()).e("Bugle.Notifications2o.BubbleSwiped.Count", vkvVar.a.i);
        return aktp.ag(null);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    @Override // defpackage.vkp
    public final akul e(vkv vkvVar) {
        alwl alwlVar = (alwl) vkz.a.g();
        alwlVar.X(vjh.n, vkvVar.a);
        alwlVar.X(vjh.d, (String) vkvVar.b.orElse(null));
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationDirectorCallbacksModule$2", "onNotificationClicked", 77, "NotificationDirectorCallbacksModule.java")).q("Notification clicked");
        ((mbl) this.a.a.b()).e("Bugle.Notifications2o.Clicked.Count", vkvVar.a.i);
        return aktp.ag(null);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    @Override // defpackage.vkp
    public final akul f(vkv vkvVar) {
        alwl alwlVar = (alwl) vkz.a.g();
        alwlVar.X(vjh.n, vkvVar.a);
        alwlVar.X(vjh.d, (String) vkvVar.b.orElse(null));
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationDirectorCallbacksModule$2", "onNotificationSwiped", 119, "NotificationDirectorCallbacksModule.java")).q("Notification swiped");
        ((mbl) this.a.a.b()).e("Bugle.Notifications2o.Swiped.Count", vkvVar.a.i);
        return aktp.ag(null);
    }
}
