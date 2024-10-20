package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.constellation.VerifyPhoneNumberResponse;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abvq extends abvs {
    final /* synthetic */ acit a;

    public abvq(acit acitVar) {
        this.a = acitVar;
    }

    @Override // defpackage.abvs, com.google.android.gms.constellation.internal.IConstellationCallbacks
    public final void onPhoneNumberVerificationsCompleted(Status status, VerifyPhoneNumberResponse verifyPhoneNumberResponse) {
        try {
            abhb.d(status, verifyPhoneNumberResponse, this.a);
        } catch (RejectedExecutionException e) {
            abvt.a.o("Rejected API result: ", e, new Object[0]);
        }
    }
}
