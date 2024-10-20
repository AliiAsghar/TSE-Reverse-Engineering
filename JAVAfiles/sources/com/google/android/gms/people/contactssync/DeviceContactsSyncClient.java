package com.google.android.gms.people.contactssync;

import android.content.Context;
import com.google.android.gms.people.contactssync.model.DeviceContactsSyncSetting;
import defpackage.acir;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface DeviceContactsSyncClient {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public interface SyncSettingUpdatedListener {
        void onDeviceContactsSyncSettingUpdated();
    }

    acir<DeviceContactsSyncSetting> getDeviceContactsSyncSetting();

    acir<Void> launchDeviceContactsSyncSettingActivity(Context context);

    acir<Void> registerSyncSettingUpdatedListener(SyncSettingUpdatedListener syncSettingUpdatedListener);

    acir<Boolean> unregisterSyncSettingUpdatedListener(SyncSettingUpdatedListener syncSettingUpdatedListener);
}
