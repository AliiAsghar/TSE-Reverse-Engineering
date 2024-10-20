package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.internal.UsageReportingClientImpl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acjl extends UsageReportingClientImpl.AbstractCallbacks {
    @Override // com.google.android.gms.usagereporting.internal.UsageReportingClientImpl.AbstractCallbacks, com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
    public final void onUnregisterOptInOptionsChangedListener(Status status) {
        if (!status.c()) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener: status=".concat(String.valueOf(String.valueOf(status))));
        }
    }
}
