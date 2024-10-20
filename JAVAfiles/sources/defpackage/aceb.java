package defpackage;

import android.location.Location;
import com.google.android.gms.location.ILocationListener;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aceb extends ILocationListener.Stub {
    public final acdy a;

    public aceb(acdy acdyVar) {
        this.a = acdyVar;
    }

    @Override // com.google.android.gms.location.ILocationListener
    public final void onLocationChanged(Location location) {
        this.a.b().b(new acdz(location, 2));
    }

    @Override // com.google.android.gms.location.ILocationListener
    public final void onRemoved() {
        this.a.b().b(new acdz(this, 3));
    }
}
