package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.apps.tachyon.clientapi.IClientApiService;
import com.google.android.apps.tachyon.contacts.reachability.IReachabilityService;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.gmscompliance.IGmsDeviceComplianceService;
import com.google.android.gms.people.contactssync.internal.IContactsSyncThirdPartyService;
import com.google.android.gms.phenotype.internal.IPhenotypeService;
import com.google.android.gms.pseudonymous.internal.IPseudonymousIdService;
import com.google.android.gms.usagereporting.internal.IUsageReportingService;
import com.google.android.gms.usagereporting.internal.UsageReportingClientImpl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class abxb implements abtf {
    private final /* synthetic */ int a;

    public /* synthetic */ abxb(int i) {
        this.a = i;
    }

    @Override // defpackage.abtf
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                IBinder b = ((abtb) obj).b();
                abhg.m(b);
                ((acit) obj2).b(IReachabilityService.Stub.asInterface(b));
                return;
            case 1:
                IBinder b2 = ((abtb) obj).b();
                abhg.m(b2);
                ((acit) obj2).b(IClientApiService.Stub.asInterface(b2));
                return;
            case 2:
                IBinder b3 = ((abtb) obj).b();
                abhg.m(b3);
                ((acit) obj2).b(IReachabilityService.Stub.asInterface(b3));
                return;
            case 3:
                acab acabVar = (acab) obj;
                acad acadVar = new acad((acit) obj2);
                Context context = acabVar.b;
                ((IGmsDeviceComplianceService) acabVar.w()).getGmsDeviceCompliance(acadVar, new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
                return;
            case 4:
                ((IContactsSyncThirdPartyService) ((acfq) obj).w()).removeDeviceContactsSyncSettingChangedListener(new acfv((acit) obj2));
                return;
            case 5:
                try {
                    ((IContactsSyncThirdPartyService) ((acfq) obj).w()).getBackupAndSyncOptInState(new acfs((acit) obj2));
                    return;
                } catch (RemoteException e) {
                    ((acit) obj2).c(e);
                    return;
                }
            case 6:
                ((IPhenotypeService) ((acgq) obj).w()).getStorageInfo(new acgi((acit) obj2));
                return;
            case 7:
                int i = acgl.a;
                return;
            case 8:
                ((IPseudonymousIdService) ((acgw) obj).w()).getToken(new acgu((acit) obj2));
                return;
            case 9:
                ((IUsageReportingService) ((UsageReportingClientImpl) obj).w()).getCheckboxSettingsPendingIntent(new acjm((acit) obj2));
                return;
            default:
                ((IUsageReportingService) ((UsageReportingClientImpl) obj).w()).getOptInOptions(new acjb((acit) obj2));
                return;
        }
    }
}
