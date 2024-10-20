package defpackage;

import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IOnMapReadyCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acel extends IOnMapReadyCallback.Stub {
    final /* synthetic */ aceq a;

    public acel(aceq aceqVar) {
        this.a = aceqVar;
    }

    @Override // com.google.android.gms.maps.internal.IOnMapReadyCallback
    public final void onMapReady(IGoogleMapDelegate iGoogleMapDelegate) {
        this.a.A(new acej(iGoogleMapDelegate));
    }
}
