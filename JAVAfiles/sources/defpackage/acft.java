package defpackage;

import com.google.android.gms.people.contactssync.DeviceContactsSyncClient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acft implements absx {
    private final /* synthetic */ int a;

    public acft(int i) {
        this.a = i;
    }

    @Override // defpackage.absx
    public final /* synthetic */ void a(Object obj) {
        switch (this.a) {
            case 0:
                ((DeviceContactsSyncClient.SyncSettingUpdatedListener) obj).onDeviceContactsSyncSettingUpdated();
                return;
            case 1:
                return;
            case 2:
                ((acfm) obj).a();
                return;
            case 3:
                ((acji) obj).a();
                return;
            case 4:
                return;
            case 5:
                ((acjz) obj).a();
                return;
            case 6:
                ((acjx) obj).a();
                return;
            case 7:
                ((ackh) obj).a();
                return;
            case 8:
                return;
            case 9:
                return;
            case 10:
                return;
            case 11:
                return;
            default:
                return;
        }
    }

    @Override // defpackage.absx
    public final void b() {
    }
}
