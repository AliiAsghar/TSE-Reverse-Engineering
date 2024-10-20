package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.QosSocketInfo;
import com.google.android.apps.messaging.shared.datamodel.action.SendMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import java.net.Socket;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mfg implements dts {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mfg(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // defpackage.dts
    public final Object a(dtq dtqVar) {
        int i;
        int i2 = 0;
        switch (this.c) {
            case 0:
                ndk ndkVar = new ndk(dtqVar, this.b);
                hin hinVar = (hin) ((mfh) this.a).d.b();
                if (hinVar.a()) {
                    gvf.Q("Service connection is valid. No need to re-initialize.");
                    ndkVar.j(0);
                    return "Requesting install referrer from Play Store";
                }
                int i3 = hinVar.a;
                if (i3 == 1) {
                    gvf.R("Client is already in the process of connecting to the service.");
                    ndkVar.j(3);
                    return "Requesting install referrer from Play Store";
                }
                if (i3 == 3) {
                    gvf.R("Client was already closed and can't be reused. Please create another instance.");
                    ndkVar.j(3);
                    return "Requesting install referrer from Play Store";
                }
                gvf.Q("Starting install referrer service setup.");
                Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                List<ResolveInfo> queryIntentServices = hinVar.b.getPackageManager().queryIntentServices(intent, 0);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    ResolveInfo resolveInfo = queryIntentServices.get(0);
                    if (resolveInfo.serviceInfo != null) {
                        String str = resolveInfo.serviceInfo.packageName;
                        String str2 = resolveInfo.serviceInfo.name;
                        if ("com.android.vending".equals(str) && str2 != null) {
                            try {
                                if (hinVar.b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                                    Intent intent2 = new Intent(intent);
                                    hinVar.e = new hio(hinVar, ndkVar);
                                    try {
                                        if (hinVar.b.bindService(intent2, hinVar.e, 1)) {
                                            gvf.Q("Service was bonded successfully.");
                                            return "Requesting install referrer from Play Store";
                                        }
                                        gvf.R("Connection to service is blocked.");
                                        hinVar.a = 0;
                                        ndkVar.j(1);
                                        return "Requesting install referrer from Play Store";
                                    } catch (SecurityException unused) {
                                        gvf.R("No permission to connect to service.");
                                        hinVar.a = 0;
                                        ndkVar.j(4);
                                        return "Requesting install referrer from Play Store";
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException unused2) {
                            }
                        }
                        gvf.R("Play Store missing or incompatible. Version 8.3.73 or later required.");
                        hinVar.a = 0;
                        ndkVar.j(2);
                        return "Requesting install referrer from Play Store";
                    }
                    i = 0;
                } else {
                    i = 0;
                }
                hinVar.a = i;
                gvf.Q("Install Referrer service unavailable on device.");
                ndkVar.j(2);
                return "Requesting install referrer from Play Store";
            case 1:
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                dtqVar.a(new gtq(atomicBoolean, i2), gsn.a);
                this.b.execute(new faq(atomicBoolean, dtqVar, this.a, 11, (char[]) null));
                return arnb.a;
            case 2:
                ((pur) this.b).e((String) this.a, dtqVar, false);
                return "DualRegistrationNetworkCapabilitiesProvider.getOnlineStatus";
            case 3:
                alwl alwlVar = (alwl) pur.b.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/DualRegistrationNetworkCapabilitiesProvider", "getCapabilities", 110, "DualRegistrationNetworkCapabilitiesProvider.java");
                ?? r4 = this.a;
                alwlVar.t("DualRegistrationNetworkCapabilitiesProvider: start forceRefresh for remoteUserId %s", yyb.bh(r4));
                ((pur) this.b).e((String) r4, dtqVar, true);
                return "DualRegistrationNetworkCapabilitiesProvider.getCapabilities";
            case 4:
                Object obj = this.b;
                SendMessageAction sendMessageAction = (SendMessageAction) obj;
                rat ratVar = (rat) sendMessageAction.d.b();
                DeviceData deviceData = (DeviceData) sendMessageAction.u.h("secondary_device");
                MessageUsageStatisticsData messageUsageStatisticsData = (MessageUsageStatisticsData) sendMessageAction.u.h("message_usage_stats_data");
                amgj b = amgj.b(sendMessageAction.u.a("message_source"));
                rhl rhlVar = sendMessageAction.u;
                ratVar.f(new rag((Action) obj, this.a, deviceData, messageUsageStatisticsData, b, rhlVar.d("sent_realtime"), rhlVar.b("sub_id", -1), rhlVar.b("locked_default_sms_sub_id", -1), rhlVar.z("update_draft", true), rhlVar.l("archive"), rhlVar.z("should_refresh_notification", false), rhlVar.y("from_notification"), rhlVar.y("is_rbm_conversation"), rhlVar.y("is_early_send"), rhlVar.y("ui_has_been_notified"), new ahjj(dtqVar)));
                return "Start save future";
            case 5:
                Object obj2 = this.a;
                Object obj3 = this.b;
                if (obj2 != null) {
                    wue.a.o("Remove completer on time out for UserId: ".concat((String) obj2));
                    wue wueVar = (wue) obj3;
                    dtqVar.a(new vri(obj3, obj2, (Object) dtqVar, 8, (byte[]) null), wueVar.d);
                    synchronized (wueVar.h) {
                        Set set = (Set) ((wue) obj3).i.get(obj2);
                        if (set == null) {
                            set = new HashSet();
                            ((wue) obj3).i.put(obj2, set);
                        }
                        set.add(dtqVar);
                    }
                    short[] sArr = null;
                    qiu.h(aktp.ai(new vze(obj3, obj2, 10), wueVar.b).h(new way(obj3, dtqVar, obj2, 5, sArr), wueVar.c).e(ajny.class, new way(obj3, dtqVar, obj2, 6, sArr), wueVar.c));
                    return "RbmBotIdResolverServiceImpl.getBotChatEndpoint";
                }
                wue.a.q("Shortcode does not exist!");
                dtqVar.d(new psx("Getting Capabilities failed due to remote user id being null"));
                return "RbmBotIdResolverServiceImpl.getBotChatEndpoint";
            case 6:
                Object obj4 = this.b;
                AtomicBoolean atomicBoolean2 = new AtomicBoolean();
                ?? r2 = this.a;
                Context context = (Context) obj4;
                agpz agpzVar = new agpz(atomicBoolean2, context, r2, dtqVar);
                context.registerReceiver(agpzVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                if (agqa.e(context) && atomicBoolean2.compareAndSet(false, true)) {
                    context.unregisterReceiver(agpzVar);
                    r2.run();
                    dtqVar.b(null);
                    return "DirectBootUtils.runWhenUnlocked";
                }
                dtqVar.a(new adub((Object) atomicBoolean2, obj4, (Object) agpzVar, 2, (byte[]) null), andi.a);
                return "DirectBootUtils.runWhenUnlocked";
            default:
                Object obj5 = this.a;
                aigu aiguVar = (aigu) this.b;
                Socket socket = (Socket) obj5;
                try {
                    ((ConnectivityManager) aiguVar.e.a).registerQosCallback(new QosSocketInfo(aiguVar.d, socket), aiguVar.c, new aigt(aiguVar, dtqVar, socket));
                    return "SingleRegistrationQosHandler#waitForDedicatedBearerSetup";
                } catch (SecurityException e) {
                    throw new adwk("CONNECTIVITY_USE_RESTRICTED_NETWORKS permission is missing.", e);
                }
        }
    }

    public /* synthetic */ mfg(mfh mfhVar, hin hinVar, int i) {
        this.c = i;
        this.a = mfhVar;
        this.b = hinVar;
    }
}
