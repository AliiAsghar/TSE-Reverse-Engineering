package defpackage;

import com.google.android.gms.wearable.internal.GetFdForAssetResponse;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acls extends aclo {
    public acls(abrz abrzVar) {
        super(abrzVar);
    }

    @Override // com.google.android.gms.wearable.internal.AbstractWearableCallbacks, com.google.android.gms.wearable.internal.IWearableCallbacks
    public final void onGetFdForAsset(GetFdForAssetResponse getFdForAssetResponse) {
        a(new acld(actx.o(getFdForAssetResponse.a), getFdForAssetResponse.b));
    }
}
