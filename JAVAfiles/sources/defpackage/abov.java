package defpackage;

import com.google.android.gms.clearcut.internal.DefaultClearcutLoggerCallbacks;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abov extends DefaultClearcutLoggerCallbacks {
    final /* synthetic */ acit a;

    public abov(acit acitVar) {
        this.a = acitVar;
    }

    @Override // com.google.android.gms.clearcut.internal.DefaultClearcutLoggerCallbacks, com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks
    public final void onLogError(Status status) {
        this.a.b(status);
    }
}
