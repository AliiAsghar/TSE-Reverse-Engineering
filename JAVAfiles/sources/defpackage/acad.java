package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acad extends acae {
    final /* synthetic */ acit a;

    public acad(acit acitVar) {
        this.a = acitVar;
    }

    @Override // defpackage.acae, com.google.android.gms.gmscompliance.IGmsDeviceComplianceServiceCallback
    public final void onGetGmsDeviceCompliance(Status status, GmsDeviceComplianceResponse gmsDeviceComplianceResponse) {
        abhb.e(status, gmsDeviceComplianceResponse, this.a);
    }
}
