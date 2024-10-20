package defpackage;

import com.google.android.rcs.client.lifecycle.RcsEngineLifecycleServiceResult;
import j$.util.Optional;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vip implements algk {
    private final /* synthetic */ int a;

    public /* synthetic */ vip(int i) {
        this.a = i;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                alwo alwoVar = viq.a;
                aozy builder = ((amwk) obj).toBuilder();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                amwk.b((amwk) builder.b);
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                amwk.c((amwk) builder.b);
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                apag apagVar = builder.b;
                amwk amwkVar = (amwk) apagVar;
                amwkVar.b |= 4;
                amwkVar.c = 0;
                if (!apagVar.isMutable()) {
                    builder.u();
                }
                amwk.d((amwk) builder.b);
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                amwk.a((amwk) builder.b);
                return (amwk) builder.s();
            case 1:
                Throwable th = (Throwable) obj;
                xze xzeVar = vhn.a;
                if (vch.d(th)) {
                    vhn.a.r("TachyonRefreshWorker failed with a retriable error", th);
                    return new gsv();
                }
                vhn.a.r("TachyonRefreshWorker failed with a non-retriable error", th);
                return new gsu();
            case 2:
                amwk amwkVar2 = (amwk) obj;
                alwo alwoVar2 = viq.a;
                aozy builder2 = amwkVar2.toBuilder();
                int i = amwkVar2.c + 1;
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                amwk amwkVar3 = (amwk) builder2.b;
                amwkVar3.b |= 4;
                amwkVar3.c = i;
                return (amwk) builder2.s();
            case 3:
                return upm.b();
            case 4:
                return upm.b();
            case 5:
                vjv vjvVar = (vjv) obj;
                if (vjvVar == null) {
                    return null;
                }
                Optional optional = vjvVar.a;
                vkm a = vkn.a();
                a.f(optional);
                a.c(vjvVar.c);
                a.e(vjvVar.e);
                a.j(vjvVar.d);
                a.g(vjvVar.b);
                a.h(vjvVar.f);
                return new vku(alog.r(a.a()), Optional.empty());
            case 6:
                ((alwl) ((alwl) ((alwl) vlx.a.i()).g((TimeoutException) obj)).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageAudioPlayer", "playInConversationNotificationSoundSync", 94, "IncomingMessageAudioPlayer.java")).q("In-conversation notification sound timed out");
                return ygh.a(2);
            case 7:
                ((alwl) ((alwl) ((alwl) vlx.a.i()).g((ygm) obj)).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageAudioPlayer", "playInConversationNotificationSoundSync", 102, "IncomingMessageAudioPlayer.java")).q("Failed to play notification sound");
                return ygh.a(2);
            case 8:
                alwo alwoVar3 = vmf.a;
                if (((alog) obj).isEmpty()) {
                    ((alwl) ((alwl) vmf.a.g()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageBlueprint", "createNotificationSummaryBuilderInfo", 989, "IncomingMessageBlueprint.java")).q("Conversation and messages data list is empty, not creating summary builder info");
                    return null;
                }
                return new vll(null);
            case 9:
                vmx vmxVar = (vmx) obj;
                if (vmxVar != null) {
                    vmq vmqVar = vmxVar.c;
                    if (vmqVar == null) {
                        return vmq.a;
                    }
                    return vmqVar;
                }
                return vmq.a;
            case 10:
                alvw i2 = vmv.a.i();
                i2.X(alwp.a, "BugleNotifications");
                ((alvg) ((alvg) ((alvg) i2).g((apba) obj)).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageSettingsStore", "getDataAsync", 89, "IncomingMessageSettingsStore.java")).q("Error getting data from incoming message settings store");
                return vmx.a;
            case 11:
                alvw i3 = vmv.a.i();
                i3.X(alwp.a, "BugleNotifications");
                ((alvg) ((alvg) ((alvg) i3).g((apba) obj)).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageSettingsStore", "saveNotificationState", 118, "IncomingMessageSettingsStore.java")).q("Error updating data from incoming message settings store");
                return vmx.a;
            case 12:
                return null;
            case 13:
                vrq.a((IOException) obj);
                return null;
            case 14:
                vrq.a((FileNotFoundException) obj);
                return null;
            case 15:
                vsu.a.n("TimeoutException was raised while waiting to connect to RcsEngineLifecycleService", (TimeoutException) obj);
                return new RcsEngineLifecycleServiceResult(14);
            case 16:
                vsu.a.n("IllegalArgumentException was raised while waiting to connect to RcsEngineLifecycleService", (IllegalArgumentException) obj);
                return new RcsEngineLifecycleServiceResult(1);
            case 17:
                vsu.a.n("SecurityException was raised while waiting to connect to RcsEngineLifecycleService", (SecurityException) obj);
                return new RcsEngineLifecycleServiceResult(1);
            case 18:
                vsu.a.n("RcsServiceConnectionException was raised while waiting to connect to RcsEngineLifecycleService", (ylp) obj);
                return new RcsEngineLifecycleServiceResult(1);
            case 19:
                vsz.a.n("IllegalArgumentException was raised while waiting to connect to RcsEngineLifecycleServiceV2", (IllegalArgumentException) obj);
                return new com.google.android.ims.rcs.engine.RcsEngineLifecycleServiceResult(1);
            default:
                vsz.a.n("IllegalStateException was raised while waiting to connect to RcsEngineLifecycleServiceV2", (IllegalStateException) obj);
                return new com.google.android.ims.rcs.engine.RcsEngineLifecycleServiceResult(1);
        }
    }
}
