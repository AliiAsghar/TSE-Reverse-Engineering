package defpackage;

import android.util.Log;
import com.google.android.apps.messaging.shared.datamodel.action.RebuildShortcutsAction;
import com.google.android.rcs.client.messaging.data.GroupNotification;
import j$.util.Optional;
import java.util.Map;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pum implements andy {
    private final /* synthetic */ int a;

    public pum(int i) {
        this.a = i;
    }

    @Override // defpackage.andy
    public final void a(Throwable th) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                alvw i = ksi.a.i();
                i.X(alwp.a, "Bugle");
                ((alvg) ((alvg) ((alvg) i).g(th)).h("com/google/android/apps/messaging/growthkit/GrowthKitLogger$1", "onFailure", ':', "GrowthKitLogger.java")).q("Reporting event to GrowthKit failed.");
                return;
            case 2:
                ((alwl) ((alwl) ((alwl) RebuildShortcutsAction.a.i()).g(th)).h("com/google/android/apps/messaging/shared/datamodel/action/RebuildShortcutsAction$1", "onFailure", '|', "RebuildShortcutsAction.java")).q("Error rebuilding shortcuts");
                return;
            case 3:
                ((alwl) ((alwl) rfa.c.a(Level.SEVERE).g(th)).h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmsMessageHelper$1", "onFailure", 2222, "ReceiveSmsMessageHelper.java")).q("Verified SMS verification work enqueue failed!");
                return;
            case 4:
                ((alwl) ((alwl) rfa.c.a(Level.SEVERE).g(th)).h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmsMessageHelper$2", "onFailure", 2276, "ReceiveSmsMessageHelper.java")).q("Verified SMS update message status enqueue failed!");
                return;
            case 5:
                ujd.a.r("Failed to call callback", th);
                return;
            case 6:
                alvw i2 = vjw.a.i();
                i2.X(alwp.a, "BugleNotifications");
                ((alvg) ((alvg) ((alvg) i2).g(th)).h("com/google/android/apps/messaging/shared/notification2o/CancelNotificationHandler$1", "onFailure", (char) 190, "CancelNotificationHandler.java")).q("Notification canceled callback failed");
                return;
            case 7:
                xwj.a.n("Copy Otp failed", th);
                return;
            case 8:
                abau.a.l("Failed to send daily report event to clearcut.");
                return;
            case 9:
                advr.r(acpt.x, "getConfiguration API call failed", new Object[0]);
                return;
            case 10:
                advr.i(th, "Error while receiving notification: %s", th.getMessage());
                return;
            case 11:
                advr.i(th, "Error while receiving message: %s", th.getMessage());
                return;
            case 12:
                advr.i(th, "Error while receiving message: %s", th.getMessage());
                return;
            case 13:
                ((alwl) ((alwl) ((alwl) adnt.b.h()).g(th)).h("com/google/android/ims/provisioning/util/ProvisioningEngineMetricsStorage$1", "onFailure", (char) 217, "ProvisioningEngineMetricsStorage.java")).q("Failed to updateData in updateStorage");
                return;
            case 14:
                ((alvg) ((alvg) ((alvg) aegy.a.i()).g(th)).h("com/google/android/libraries/communications/mobileconfiguration/api/MobileConfigurationApi$1", "onFailure", 'd', "MobileConfigurationApi.java")).q("registerParameters API call failed");
                return;
            case 15:
                ((alvg) ((alvg) ((alvg) aguq.a.h()).g(th)).h("com/google/android/libraries/inputmethod/emoji/data/EmojiVariantDataProvider$1", "onFailure", (char) 159, "EmojiVariantDataProvider.java")).q("Emoji variant data initialized error.");
                return;
            case 16:
                ((alvg) ((alvg) ((alvg) agux.a.h()).g(th)).h("com/google/android/libraries/inputmethod/emoji/data/GlobalVariantsPreferences$1", "onFailure", 'n', "GlobalVariantsPreferences.java")).q("Global variant data initialized error.");
                return;
            case 17:
                ((alwl) ((alwl) ((alwl) ahez.a.h()).g(th)).h("com/google/android/libraries/logging/ve/handlers/result/flogger/FloggerResultDaggerModule", "provideEventResultHandler", 24, "FloggerResultDaggerModule.java")).o();
                return;
            default:
                if (Log.isLoggable("ClearcutMetricXmitter", 4)) {
                    Log.i("ClearcutMetricXmitter", "Transmission has failed: ".concat(String.valueOf(String.valueOf(th))));
                    return;
                }
                return;
        }
    }

    @Override // defpackage.andy
    public final /* synthetic */ void b(Object obj) {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("RCS-capable ChatEndpoints: ");
                StringBuilder sb2 = new StringBuilder("Non-RCS ChatEndpoints: ");
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    String bh = yyb.bh(((qei) entry.getKey()).d);
                    if (((pto) entry.getValue()).c()) {
                        sb.append(bh);
                        sb.append(",");
                    } else {
                        sb2.append(bh);
                        sb2.append(",");
                    }
                }
                alvw g = pun.a.g();
                g.X(alwp.a, "BugleRcsCapabilities");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CapabilitiesLoggingInterceptor$BatchLoggingCallback", "onSuccess", 101, "CapabilitiesLoggingInterceptor.java")).p(sb);
                alvw g2 = pun.a.g();
                g2.X(alwp.a, "BugleRcsCapabilities");
                ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CapabilitiesLoggingInterceptor$BatchLoggingCallback", "onSuccess", 102, "CapabilitiesLoggingInterceptor.java")).p(sb2);
                return;
            case 1:
                return;
            case 2:
                ((alwl) ((alwl) RebuildShortcutsAction.a.g()).h("com/google/android/apps/messaging/shared/datamodel/action/RebuildShortcutsAction$1", "onSuccess", 119, "RebuildShortcutsAction.java")).q("Successfully finished rebuilding shortcuts");
                return;
            case 3:
                rfa.b.p("Verified SMS verification work successfully enqueued");
                return;
            case 4:
                rfa.b.p("Verified SMS update message status successfully enqueued");
                return;
            case 5:
                return;
            case 6:
                alvw g3 = vjw.a.g();
                g3.X(alwp.a, "BugleNotifications");
                ((alvg) ((alvg) g3).h("com/google/android/apps/messaging/shared/notification2o/CancelNotificationHandler$1", "onSuccess", 185, "CancelNotificationHandler.java")).q("Notification canceled callback successfully run");
                return;
            case 7:
                xwj.a.p("Copy Otp succeeded");
                return;
            case 8:
                return;
            case 9:
                return;
            case 10:
                GroupNotification groupNotification = (GroupNotification) obj;
                if (groupNotification == null) {
                    advr.k("Null group notification produced.", new Object[0]);
                    return;
                } else {
                    advr.k("Group notification produced: %s", groupNotification);
                    return;
                }
            case 11:
                adcx.gu((Optional) obj);
                return;
            case 12:
                adcx.gu((Optional) obj);
                return;
            case 13:
                return;
            case 14:
                return;
            case 15:
                ((alvg) ((alvg) aguq.a.c()).h("com/google/android/libraries/inputmethod/emoji/data/EmojiVariantDataProvider$1", "onSuccess", 154, "EmojiVariantDataProvider.java")).q("Emoji variant data has been loaded and set.");
                return;
            case 16:
                ((alvg) ((alvg) agux.a.c()).h("com/google/android/libraries/inputmethod/emoji/data/GlobalVariantsPreferences$1", "onSuccess", 105, "GlobalVariantsPreferences.java")).q("Global variant data has been loaded and set.");
                return;
            case 17:
                return;
            default:
                Log.v("ClearcutMetricXmitter", "Transmission is done.");
                return;
        }
    }
}
