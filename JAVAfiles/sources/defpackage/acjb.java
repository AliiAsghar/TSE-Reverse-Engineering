package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import com.google.android.gms.usagereporting.internal.UsageReportingClientImpl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acjb extends UsageReportingClientImpl.AbstractCallbacks {
    final /* synthetic */ acit a;

    public acjb(acit acitVar) {
        this.a = acitVar;
    }

    @Override // com.google.android.gms.usagereporting.internal.UsageReportingClientImpl.AbstractCallbacks, com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
    public final void onGetOptInOptions(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
        abhb.d(status, new adjw(new acjk(Status.a, usageReportingOptInOptions)), this.a);
    }
}
