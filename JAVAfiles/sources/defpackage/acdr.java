package defpackage;

import com.google.android.gms.location.ILocationCallback;
import com.google.android.gms.location.internal.FusedLocationProviderResult;
import com.google.android.gms.location.internal.IFusedLocationProviderCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acdr extends IFusedLocationProviderCallback.Stub {
    final /* synthetic */ acit a;
    final /* synthetic */ ILocationCallback b;

    public acdr(acit acitVar, ILocationCallback iLocationCallback) {
        this.a = acitVar;
        this.b = iLocationCallback;
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
