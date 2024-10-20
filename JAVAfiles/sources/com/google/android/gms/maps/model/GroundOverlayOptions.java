package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.abhi;
import defpackage.aced;
import defpackage.adae;
import defpackage.brg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GroundOverlayOptions> CREATOR = new aced(10);
    public LatLng a;
    public float b;
    public float c;
    public LatLngBounds d;
    public float e;
    public float f;
    public boolean g;
    public float h;
    public float i;
    public float j;
    public boolean k;
    private adae l;

    public GroundOverlayOptions() {
        this.g = true;
        this.h = brg.a;
        this.i = 0.5f;
        this.j = 0.5f;
        this.k = false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.dynamic.IObjectWrapper, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.x(parcel, 2, this.l.a.asBinder());
        abhi.o(parcel, 3, this.a, i, false);
        abhi.l(parcel, 4, this.b);
        abhi.l(parcel, 5, this.c);
        abhi.o(parcel, 6, this.d, i, false);
        abhi.l(parcel, 7, this.e);
        abhi.l(parcel, 8, this.f);
        abhi.h(parcel, 9, this.g);
        abhi.l(parcel, 10, this.h);
        abhi.l(parcel, 11, this.i);
        abhi.l(parcel, 12, this.j);
        abhi.h(parcel, 13, this.k);
        abhi.g(parcel, e);
    }

    public GroundOverlayOptions(IBinder iBinder, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7, boolean z2) {
        this.g = true;
        this.h = brg.a;
        this.i = 0.5f;
        this.j = 0.5f;
        this.k = false;
        this.l = new adae(IObjectWrapper.Stub.asInterface(iBinder));
        this.a = latLng;
        this.b = f;
        this.c = f2;
        this.d = latLngBounds;
        this.e = f3;
        this.f = f4;
        this.g = z;
        this.h = f5;
        this.i = f6;
        this.j = f7;
        this.k = z2;
    }
}
