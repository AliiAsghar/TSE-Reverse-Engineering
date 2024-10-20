package defpackage;

import j$.time.Duration;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vmj implements vkp {
    final /* synthetic */ armf a;
    final /* synthetic */ vmv b;
    final /* synthetic */ armf c;

    public vmj(armf armfVar, vmv vmvVar, armf armfVar2) {
        this.a = armfVar;
        this.b = vmvVar;
        this.c = armfVar2;
    }

    @Override // defpackage.vkp
    public final akul a(List list) {
        if (list.isEmpty()) {
            ((alwl) ((alwl) vmk.a.i()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageCallbacksModule$5", "onNotificationCanceled", 223, "IncomingMessageCallbacksModule.java")).q("No notification data when trying to cancel notification");
            return aktp.ag(null);
        }
        ((vjs) this.c.b()).i(vjm.a);
        return this.b.a(((vkv) list.get(0)).a);
    }

    @Override // defpackage.vkp
    public final akul b(List list) {
        if (list.isEmpty()) {
            ((alwl) ((alwl) vmk.a.i()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageCallbacksModule$5", "onNotificationPosted", 263, "IncomingMessageCallbacksModule.java")).q("No notification data when trying to post notification");
            return aktp.ag(null);
        }
        return this.b.a(((vkv) list.get(0)).a);
    }

    @Override // defpackage.vkp
    public final akul c(vkv vkvVar) {
        ((viq) this.a.b()).e(5, Duration.ZERO);
        return this.b.a(vkvVar.a);
    }

    @Override // defpackage.vkp
    public final akul d(vkv vkvVar) {
        return this.b.a(vkvVar.a);
    }

    @Override // defpackage.vkp
    public final akul e(vkv vkvVar) {
        ((viq) this.a.b()).e(5, Duration.ZERO);
        return this.b.a(vkvVar.a);
    }

    @Override // defpackage.vkp
    public final akul f(vkv vkvVar) {
        ((vjs) this.c.b()).i(vjm.a);
        return this.b.a(vkvVar.a);
    }
}
