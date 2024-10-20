package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.internal.AbstractContactsSyncServiceCallbacks;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.gms.people.contactssync.model.DeviceContactsSyncSetting;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acfs extends AbstractContactsSyncServiceCallbacks {
    final /* synthetic */ acit a;

    public acfs(acit acitVar) {
        this.a = acitVar;
    }

    @Override // com.google.android.gms.people.contactssync.internal.AbstractContactsSyncServiceCallbacks, com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
    public final void onGetBackupAndSyncOptInState(Status status, BackupAndSyncOptInState backupAndSyncOptInState) {
        if (status.c()) {
            int i = backupAndSyncOptInState.c;
            int i2 = acfx.a;
            int i3 = 1;
            if (i != 1) {
                i3 = 2;
                if (i != 2) {
                    i3 = 3;
                    if (i != 3) {
                        i3 = 0;
                    }
                }
            }
            abhb.d(status, new DeviceContactsSyncSetting(i3), this.a);
            return;
        }
        abhb.d(status, null, this.a);
    }
}
