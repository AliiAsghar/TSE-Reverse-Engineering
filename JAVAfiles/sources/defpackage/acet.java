package defpackage;

import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IOnMapReadyCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acet extends IOnMapReadyCallback.Stub {
    final /* synthetic */ aceq a;

    public acet(aceq aceqVar) {
        this.a = aceqVar;
    }

    @Override // com.google.android.gms.maps.internal.IOnMapReadyCallback
    public final void onMapReady(IGoogleMapDelegate iGoogleMapDelegate) {
        this.a.A(new acej(iGoogleMapDelegate));
    }
}
