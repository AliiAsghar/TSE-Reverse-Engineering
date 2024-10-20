package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.usagereporting.internal.UsageReportingClientImpl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acjm extends UsageReportingClientImpl.AbstractCallbacks {
    private final acit a;

    public acjm(acit acitVar) {
        this.a = acitVar;
    }

    @Override // com.google.android.gms.usagereporting.internal.UsageReportingClientImpl.AbstractCallbacks, com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
    public final void onGetCheckboxSettingsPendingIntent(PendingIntent pendingIntent) {
        this.a.b(pendingIntent);
    }
}
