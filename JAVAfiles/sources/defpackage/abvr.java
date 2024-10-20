package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.constellation.GetIidTokenResponse;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abvr extends abvs {
    final /* synthetic */ acit a;

    public abvr(acit acitVar) {
        this.a = acitVar;
    }

    @Override // defpackage.abvs, com.google.android.gms.constellation.internal.IConstellationCallbacks
    public final void onIidTokenGenerated(Status status, GetIidTokenResponse getIidTokenResponse) {
        try {
            abhb.d(status, getIidTokenResponse, this.a);
        } catch (RejectedExecutionException e) {
            abvt.a.o("Rejected API result: ", e, new Object[0]);
        }
    }
}
