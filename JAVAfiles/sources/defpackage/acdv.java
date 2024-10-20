package defpackage;

import android.location.Location;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.internal.ILocationStatusCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acdv extends ILocationStatusCallback.Stub {
    final /* synthetic */ acit a;

    public acdv(acit acitVar) {
        this.a = acitVar;
    }

    @Override // com.google.android.gms.location.internal.ILocationStatusCallback
    public final void onResult(Status status, Location location) {
        abhb.d(status, location, this.a);
    }
}
