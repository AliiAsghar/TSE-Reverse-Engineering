package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.aced;
import defpackage.acex;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new aced(3);
    public StreetViewPanoramaCamera a;
    public String b;
    public LatLng c;
    public Integer d;
    public StreetViewSource e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;

    public StreetViewPanoramaOptions() {
        this.f = true;
        this.g = true;
        this.h = true;
        this.i = true;
        this.e = StreetViewSource.a;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        abhg.q("PanoramaId", this.b, arrayList);
        abhg.q("Position", this.c, arrayList);
        abhg.q("Radius", this.d, arrayList);
        abhg.q("Source", this.e, arrayList);
        abhg.q("StreetViewPanoramaCamera", this.a, arrayList);
        abhg.q("UserNavigationEnabled", this.f, arrayList);
        abhg.q("ZoomGesturesEnabled", this.g, arrayList);
        abhg.q("PanningGesturesEnabled", this.h, arrayList);
        abhg.q("StreetNamesEnabled", this.i, arrayList);
        abhg.q("UseViewLifecycleInFragment", this.j, arrayList);
        return abhg.p(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 2, this.a, i, false);
        abhi.q(parcel, 3, this.b, false);
        abhi.o(parcel, 4, this.c, i, false);
        abhi.A(parcel, 5, this.d);
        abhi.i(parcel, 6, acex.e(this.f));
        abhi.i(parcel, 7, acex.e(this.g));
        abhi.i(parcel, 8, acex.e(this.h));
        abhi.i(parcel, 9, acex.e(this.i));
        abhi.i(parcel, 10, acex.e(this.j));
        abhi.o(parcel, 11, this.e, i, false);
        abhi.g(parcel, e);
    }

    public StreetViewPanoramaOptions(StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b, byte b2, byte b3, byte b4, byte b5, StreetViewSource streetViewSource) {
        this.f = true;
        this.g = true;
        this.h = true;
        this.i = true;
        this.e = StreetViewSource.a;
        this.a = streetViewPanoramaCamera;
        this.c = latLng;
        this.d = num;
        this.b = str;
        this.f = acex.f(b);
        this.g = acex.f(b2);
        this.h = acex.f(b3);
        this.i = acex.f(b4);
        this.j = acex.f(b5);
        this.e = streetViewSource;
    }
}
