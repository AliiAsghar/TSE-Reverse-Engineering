package defpackage;

import com.google.android.gms.asterism.SetAsterismConsentResponse;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abkj extends abkl {
    final /* synthetic */ acit a;

    public abkj(acit acitVar) {
        this.a = acitVar;
    }

    @Override // defpackage.abkl, com.google.android.gms.asterism.internal.IAsterismCallbacks
    public final void onConsentRegistered(Status status, SetAsterismConsentResponse setAsterismConsentResponse) {
        abhb.d(status, setAsterismConsentResponse, this.a);
    }
}
