package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vmi implements vkc {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public vmi(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [armf, java.lang.Object] */
    @Override // defpackage.vkc
    public final akul a(wng wngVar, Intent intent, Bundle bundle, vkv vkvVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                alwl alwlVar = (alwl) vmk.a.g();
                alwlVar.X(vjh.n, vkvVar.a);
                alwlVar.X(vjh.d, (String) vkvVar.b.orElse(null));
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageCallbacksModule$4", "onActionCalled", 167, "IncomingMessageCallbacksModule.java")).q("Cancel IM notification from copy OTP callback");
                vmg.b((vco) this.a, vkvVar);
                return aktp.ag(null);
            }
            vkf b = vkf.b(intent.getIntExtra("extra_notification_action_type", vkf.NAT_UNKNOWN.o));
            b.getClass();
            alwl alwlVar2 = (alwl) vkz.a.g();
            alwlVar2.X(vjh.n, vkvVar.a);
            alwlVar2.X(vjh.d, (String) vkvVar.b.orElse(null));
            alwlVar2.X(vjh.p, b);
            ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/notification2o/NotificationDirectorCallbacksModule$1", "onActionCalled", 55, "NotificationDirectorCallbacksModule.java")).q("Notification action clicked");
            ((mbl) ((vjs) this.a).a.b()).e("Bugle.Notifications2o.ActionClicked.Count", b.o);
            return aktp.ag(null);
        }
        alwl alwlVar3 = (alwl) vmk.a.g();
        alwlVar3.X(vjh.n, vkvVar.a);
        alwlVar3.X(vjh.d, (String) vkvVar.b.orElse(null));
        ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageCallbacksModule$3", "onActionCalled", 144, "IncomingMessageCallbacksModule.java")).q("Cancel IM notification from mark as read callback");
        vmg.b((vco) this.a, vkvVar);
        return aktp.ag(null);
    }
}
