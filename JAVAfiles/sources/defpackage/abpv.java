package defpackage;

import com.google.android.gms.cobalt.internal.ICobaltLoggerCallbacks;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abpv extends ICobaltLoggerCallbacks.Stub {
    final /* synthetic */ acit a;

    public abpv(acit acitVar) {
        this.a = acitVar;
    }

    @Override // com.google.android.gms.cobalt.internal.ICobaltLoggerCallbacks
    public final void onLogOccurrence(Status status) {
        abhb.c(status, this.a);
    }
}
