package defpackage;

import com.google.android.gms.asterism.GetAsterismConsentResponse;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abki extends abkl {
    final /* synthetic */ acit a;

    public abki(acit acitVar) {
        this.a = acitVar;
    }

    @Override // defpackage.abkl, com.google.android.gms.asterism.internal.IAsterismCallbacks
    public final void onConsentFetched(Status status, GetAsterismConsentResponse getAsterismConsentResponse) {
        abhb.d(status, getAsterismConsentResponse, this.a);
    }
}
