package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.aced;
import defpackage.brg;
import defpackage.d;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new aced(4);
    public final LatLng a;
    public final float b;
    public final float c;
    public final float d;

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        boolean z;
        d.aC(latLng, "camera target must not be null.");
        if (f2 >= brg.a && f2 <= 90.0f) {
            z = true;
        } else {
            z = false;
        }
        abhg.c(z, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.a = latLng;
        this.b = f;
        this.c = f2 + brg.a;
        this.d = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        if (this.a.equals(cameraPosition.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(cameraPosition.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(cameraPosition.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(cameraPosition.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        abhg.q(GroupManagementRequest.TARGET_ATTRIBUTE, this.a, arrayList);
        abhg.q("zoom", Float.valueOf(this.b), arrayList);
        abhg.q("tilt", Float.valueOf(this.c), arrayList);
        abhg.q("bearing", Float.valueOf(this.d), arrayList);
        return abhg.p(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 2, this.a, i, false);
        abhi.l(parcel, 3, this.b);
        abhi.l(parcel, 4, this.c);
        abhi.l(parcel, 5, this.d);
        abhi.g(parcel, e);
    }
}
