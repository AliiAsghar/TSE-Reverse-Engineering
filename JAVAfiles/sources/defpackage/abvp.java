package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.constellation.PhoneNumberInfo;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abvp extends abvs {
    final /* synthetic */ acit a;

    public abvp(acit acitVar) {
        this.a = acitVar;
    }

    @Override // defpackage.abvs, com.google.android.gms.constellation.internal.IConstellationCallbacks
    public final void onPhoneNumberVerified(Status status, List<PhoneNumberInfo> list) {
        try {
            abhb.d(status, list, this.a);
        } catch (RejectedExecutionException e) {
            abvt.a.o("Rejected API result: ", e, new Object[0]);
        }
    }
}
