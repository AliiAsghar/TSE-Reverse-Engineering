package defpackage;

import com.google.android.gms.location.internal.FusedLocationProviderResult;
import com.google.android.gms.location.internal.IFusedLocationProviderCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acdw extends IFusedLocationProviderCallback.Stub {
    final /* synthetic */ Object a;
    final /* synthetic */ acit b;

    public acdw(Object obj, acit acitVar) {
        this.a = obj;
        this.b = acitVar;
    }

    @Override // com.google.android.gms.location.internal.IFusedLocationProviderCallback
    public final void onFusedLocationProviderResult(FusedLocationProviderResult fusedLocationProviderResult) {
        abhb.d(fusedLocationProviderResult.a, this.a, this.b);
    }

    @Override // com.google.android.gms.location.internal.IFusedLocationProviderCallback
    public final void onRequestRemoved() {
    }
}
