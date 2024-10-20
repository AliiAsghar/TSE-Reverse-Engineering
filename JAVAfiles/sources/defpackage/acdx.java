package defpackage;

import com.google.android.gms.location.ILocationListener;
import com.google.android.gms.location.internal.FusedLocationProviderResult;
import com.google.android.gms.location.internal.IFusedLocationProviderCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acdx extends IFusedLocationProviderCallback.Stub {
    final /* synthetic */ acit a;
    final /* synthetic */ ILocationListener b;

    public acdx(acit acitVar, ILocationListener iLocationListener) {
        this.a = acitVar;
        this.b = iLocationListener;
    }

    @Override // com.google.android.gms.location.internal.IFusedLocationProviderCallback
    public final void onFusedLocationProviderResult(FusedLocationProviderResult fusedLocationProviderResult) {
        abhb.c(fusedLocationProviderResult.a, this.a);
    }

    @Override // com.google.android.gms.location.internal.IFusedLocationProviderCallback
    public final void onRequestRemoved() {
        this.b.onRemoved();
    }
}
