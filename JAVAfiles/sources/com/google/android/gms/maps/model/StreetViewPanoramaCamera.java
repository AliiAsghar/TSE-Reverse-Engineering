package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.aced;
import defpackage.brg;
import defpackage.d;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class StreetViewPanoramaCamera extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaCamera> CREATOR = new aced(20);
    public final float a;
    public final float b;
    public final float c;

    public StreetViewPanoramaCamera(float f, float f2, float f3) {
        float f4;
        boolean z = false;
        if (f2 >= -90.0f && f2 <= 90.0f) {
            z = true;
        }
        d.t(z, "Tilt needs to be between -90 and 90 inclusive: " + f2);
        this.a = ((double) f) <= 0.0d ? 0.0f : f;
        this.b = brg.a + f2;
        if (f3 <= 0.0d) {
            f4 = (f3 % 360.0f) + 360.0f;
        } else {
            f4 = f3;
        }
        this.c = f4 % 360.0f;
        new StreetViewPanoramaOrientation(f2, f3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        if (Float.floatToIntBits(this.a) == Float.floatToIntBits(streetViewPanoramaCamera.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(streetViewPanoramaCamera.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(streetViewPanoramaCamera.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        abhg.q("zoom", Float.valueOf(this.a), arrayList);
        abhg.q("tilt", Float.valueOf(this.b), arrayList);
        abhg.q("bearing", Float.valueOf(this.c), arrayList);
        return abhg.p(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.l(parcel, 2, this.a);
        abhi.l(parcel, 3, this.b);
        abhi.l(parcel, 4, this.c);
        abhi.g(parcel, e);
    }
}
