package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abtz extends abts {
    final /* synthetic */ BaseGmsClient g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abtz(BaseGmsClient baseGmsClient, int i, Bundle bundle) {
        super(baseGmsClient, i, bundle);
        this.g = baseGmsClient;
    }

    @Override // defpackage.abts
    protected final void a(ConnectionResult connectionResult) {
        this.g.h.a(connectionResult);
        System.currentTimeMillis();
    }

    @Override // defpackage.abts
    protected final boolean c() {
        this.g.h.a(ConnectionResult.a);
        return true;
    }
}
