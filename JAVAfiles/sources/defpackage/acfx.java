package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.people.contactssync.DeviceContactsSyncClient;
import com.google.android.gms.people.contactssync.model.DeviceContactsSyncSetting;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acfx extends abrc implements DeviceContactsSyncClient {
    public static final /* synthetic */ int a = 0;
    private static final abqt b;
    private static final aaoc m;
    private static final abmt n;

    static {
        abmt abmtVar = new abmt();
        n = abmtVar;
        acfr acfrVar = new acfr();
        b = acfrVar;
        m = new aaoc("People.API", acfrVar, abmtVar);
    }

    public acfx(Activity activity) {
        super(activity, activity, m, abqy.q, abrb.a);
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final acir<DeviceContactsSyncSetting> getDeviceContactsSyncSetting() {
        ajxp ajxpVar = new ajxp(null);
        ajxpVar.d = new Feature[]{acfl.b};
        ajxpVar.c = new abxb(5);
        ajxpVar.b = 2731;
        return g(ajxpVar.b());
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final acir<Void> launchDeviceContactsSyncSettingActivity(Context context) {
        d.aC(context, "Please provide a non-null context");
        ajxp ajxpVar = new ajxp(null);
        ajxpVar.d = new Feature[]{acfl.b};
        ajxpVar.c = new abot(context, 7);
        ajxpVar.b = 2733;
        return g(ajxpVar.b());
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final acir<Void> registerSyncSettingUpdatedListener(DeviceContactsSyncClient.SyncSettingUpdatedListener syncSettingUpdatedListener) {
        absy e = e(syncSettingUpdatedListener, "dataChangedListenerKey");
        abot abotVar = new abot(e, 8);
        abxb abxbVar = new abxb(4);
        abte abteVar = new abte();
        abteVar.c = e;
        abteVar.a = abotVar;
        abteVar.b = abxbVar;
        abteVar.d = new Feature[]{acfl.a};
        abteVar.e = 2729;
        return v(abteVar.b());
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final acir<Boolean> unregisterSyncSettingUpdatedListener(DeviceContactsSyncClient.SyncSettingUpdatedListener syncSettingUpdatedListener) {
        return h(abhb.f(syncSettingUpdatedListener, "dataChangedListenerKey"), 2730);
    }

    public acfx(Context context) {
        super(context, m, abqy.q, abrb.a);
    }
}
