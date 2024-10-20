package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.constellation.GetIidTokenResponse;
import com.google.android.gms.constellation.PhoneNumberInfo;
import com.google.android.gms.constellation.VerifyPhoneNumberResponse;
import com.google.android.gms.constellation.internal.IConstellationCallbacks;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
class abvs extends IConstellationCallbacks.Stub {
    public void onIidTokenGenerated(Status status, GetIidTokenResponse getIidTokenResponse) {
        throw new UnsupportedOperationException();
    }

    public void onPhoneNumberVerificationsCompleted(Status status, VerifyPhoneNumberResponse verifyPhoneNumberResponse) {
        throw new UnsupportedOperationException();
    }

    public void onPhoneNumberVerified(Status status, List<PhoneNumberInfo> list) {
        throw new UnsupportedOperationException();
    }
}
