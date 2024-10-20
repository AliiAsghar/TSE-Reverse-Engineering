package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.acfd;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class StreetViewPanoramaLink extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaLink> CREATOR = new acfd(1);
    public final String a;
    public final float b;

    public StreetViewPanoramaLink(String str, float f) {
        this.a = str;
        this.b = (((double) f) <= 0.0d ? (f % 360.0f) + 360.0f : f) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLink)) {
            return false;
        }
        StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) obj;
        if (this.a.equals(streetViewPanoramaLink.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(streetViewPanoramaLink.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        abhg.q("panoId", this.a, arrayList);
        abhg.q("bearing", Float.valueOf(this.b), arrayList);
        return abhg.p(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 2, str, false);
        abhi.l(parcel, 3, this.b);
        abhi.g(parcel, e);
    }
}
