package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.internal.IUsageReportingService;
import com.google.android.gms.usagereporting.internal.UsageReportingClientImpl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acjn extends UsageReportingClientImpl.AbstractCallbacks {
    private final IUsageReportingService a;
    private final abrz b;
    private final UsageReportingClientImpl.UsageReportingOptInOptionsChangedListener c;

    public acjn(IUsageReportingService iUsageReportingService, abrz abrzVar, UsageReportingClientImpl.UsageReportingOptInOptionsChangedListener usageReportingOptInOptionsChangedListener) {
        this.a = iUsageReportingService;
        this.b = abrzVar;
        this.c = usageReportingOptInOptionsChangedListener;
    }

    @Override // com.google.android.gms.usagereporting.internal.UsageReportingClientImpl.AbstractCallbacks, com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
    public final void onRegisterOptInOptionsChangedListener(Status status) {
        if (!status.c()) {
            this.b.c(status);
        } else {
            this.b.c(Status.a);
        }
    }

    @Override // com.google.android.gms.usagereporting.internal.UsageReportingClientImpl.AbstractCallbacks, com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
    public final void onUnregisterOptInOptionsChangedListener(Status status) {
        if (!status.c()) {
            this.b.c(status);
            return;
        }
        UsageReportingClientImpl.UsageReportingOptInOptionsChangedListener usageReportingOptInOptionsChangedListener = this.c;
        if (usageReportingOptInOptionsChangedListener == null) {
            this.b.c(Status.a);
        } else {
            this.a.registerOptInOptionsChangedListener(usageReportingOptInOptionsChangedListener, this);
        }
    }
}
