package defpackage;

import android.os.Bundle;
import com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ablb extends IGetTokenWithDetailsCallback.Stub {
    final /* synthetic */ acit a;

    public ablb(acit acitVar) {
        this.a = acitVar;
    }

    @Override // com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback
    public final void onResponse(Status status, Bundle bundle) {
        abld.a(status, bundle, this.a);
    }
}
