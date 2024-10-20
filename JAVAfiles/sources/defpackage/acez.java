package defpackage;

import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acez {
    public float a;
    public float b;
    public float c;
    private LatLng d;

    public final CameraPosition a() {
        return new CameraPosition(this.d, this.a, this.b, this.c);
    }

    public final void b(LatLng latLng) {
        d.aC(latLng, "location must not be null.");
        this.d = latLng;
    }
}
