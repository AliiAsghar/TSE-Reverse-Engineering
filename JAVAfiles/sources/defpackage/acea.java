package defpackage;

import com.google.android.gms.location.ILocationCallback;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acea extends ILocationCallback.Stub {
    public final acdy a;

    public acea(acdy acdyVar) {
        this.a = acdyVar;
    }

    @Override // com.google.android.gms.location.ILocationCallback
    public final void onLocationAvailability(LocationAvailability locationAvailability) {
        ((acdt) this.a).a.b(new acft(1));
    }

    @Override // com.google.android.gms.location.ILocationCallback
    public final void onLocationResult(LocationResult locationResult) {
        ((acdt) this.a).a.b(new acdz(locationResult, 1));
    }

    @Override // com.google.android.gms.location.ILocationCallback
    public final void onRemoved() {
        ((acdt) this.a).a.b(new acdz(this, 0));
    }
}
