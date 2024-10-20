package defpackage;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.location.LocationResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acds extends abgj {
    final /* synthetic */ acit b;
    final /* synthetic */ acec c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acds(acec acecVar, acit acitVar) {
        super(null);
        this.b = acitVar;
        this.c = acecVar;
    }

    @Override // defpackage.abgj
    public final void l(LocationResult locationResult) {
        Location location;
        int size = locationResult.b.size();
        if (size == 0) {
            location = null;
        } else {
            location = (Location) locationResult.b.get(size - 1);
        }
        this.b.d(location);
        try {
            this.c.K(abhb.f(this, "GetCurrentLocation"), false, new acit());
        } catch (RemoteException unused) {
        }
    }
}
