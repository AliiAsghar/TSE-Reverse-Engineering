package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.aced;
import defpackage.brg;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CircleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CircleOptions> CREATOR = new aced(6);
    public final LatLng a;
    public final double b;
    public final float c;
    public final int d;
    public final int e;
    public final float f;
    public final boolean g;
    public final boolean h;
    public final List i;

    public CircleOptions() {
        this.a = null;
        this.b = 0.0d;
        this.c = 10.0f;
        this.d = -16777216;
        this.e = 0;
        this.f = brg.a;
        this.g = true;
        this.h = false;
        this.i = null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 2, this.a, i, false);
        abhi.k(parcel, 3, this.b);
        abhi.l(parcel, 4, this.c);
        abhi.m(parcel, 5, this.d);
        abhi.m(parcel, 6, this.e);
        abhi.l(parcel, 7, this.f);
        abhi.h(parcel, 8, this.g);
        abhi.h(parcel, 9, this.h);
        abhi.r(parcel, 10, this.i, false);
        abhi.g(parcel, e);
    }

    public CircleOptions(LatLng latLng, double d, float f, int i, int i2, float f2, boolean z, boolean z2, List list) {
        this.a = latLng;
        this.b = d;
        this.c = f;
        this.d = i;
        this.e = i2;
        this.f = f2;
        this.g = z;
        this.h = z2;
        this.i = list;
    }
}
