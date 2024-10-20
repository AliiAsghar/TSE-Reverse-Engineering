package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.acek;
import defpackage.aces;
import defpackage.acex;
import defpackage.acez;
import defpackage.brg;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new acek();
    private static final Integer i = Integer.valueOf(Color.argb(255, 236, 233, 225));
    public int a;
    public CameraPosition b;
    public Float c;
    public Float d;
    public LatLngBounds e;
    public Integer f;
    public String g;
    public int h;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    private Boolean m;
    private Boolean n;
    private Boolean o;
    private Boolean p;
    private Boolean q;
    private Boolean r;
    private Boolean s;
    private Boolean t;
    private Boolean u;

    public GoogleMapOptions() {
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public static GoogleMapOptions a(Context context, AttributeSet attributeSet) {
        Float f;
        Float f2;
        Float f3;
        Float f4;
        float f5;
        float f6;
        String string;
        LatLngBounds latLngBounds = null;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, aces.a);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(16)) {
            googleMapOptions.a = obtainAttributes.getInt(16, -1);
        }
        if (obtainAttributes.hasValue(26)) {
            googleMapOptions.j = Boolean.valueOf(obtainAttributes.getBoolean(26, false));
        }
        if (obtainAttributes.hasValue(25)) {
            googleMapOptions.k = Boolean.valueOf(obtainAttributes.getBoolean(25, false));
        }
        if (obtainAttributes.hasValue(17)) {
            googleMapOptions.m = Boolean.valueOf(obtainAttributes.getBoolean(17, true));
        }
        if (obtainAttributes.hasValue(19)) {
            googleMapOptions.q = Boolean.valueOf(obtainAttributes.getBoolean(19, true));
        }
        if (obtainAttributes.hasValue(21)) {
            googleMapOptions.u = Boolean.valueOf(obtainAttributes.getBoolean(21, true));
        }
        if (obtainAttributes.hasValue(20)) {
            googleMapOptions.n = Boolean.valueOf(obtainAttributes.getBoolean(20, true));
        }
        if (obtainAttributes.hasValue(22)) {
            googleMapOptions.p = Boolean.valueOf(obtainAttributes.getBoolean(22, true));
        }
        if (obtainAttributes.hasValue(24)) {
            googleMapOptions.o = Boolean.valueOf(obtainAttributes.getBoolean(24, true));
        }
        if (obtainAttributes.hasValue(23)) {
            googleMapOptions.l = Boolean.valueOf(obtainAttributes.getBoolean(23, true));
        }
        if (obtainAttributes.hasValue(13)) {
            googleMapOptions.r = Boolean.valueOf(obtainAttributes.getBoolean(13, false));
        }
        if (obtainAttributes.hasValue(18)) {
            googleMapOptions.s = Boolean.valueOf(obtainAttributes.getBoolean(18, true));
        }
        if (obtainAttributes.hasValue(0)) {
            googleMapOptions.t = Boolean.valueOf(obtainAttributes.getBoolean(0, false));
        }
        if (obtainAttributes.hasValue(4)) {
            googleMapOptions.c = Float.valueOf(obtainAttributes.getFloat(4, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(4)) {
            googleMapOptions.d = Float.valueOf(obtainAttributes.getFloat(3, Float.POSITIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(1)) {
            googleMapOptions.f = Integer.valueOf(obtainAttributes.getColor(1, i.intValue()));
        }
        if (obtainAttributes.hasValue(15) && (string = obtainAttributes.getString(15)) != null && !string.isEmpty()) {
            googleMapOptions.g = string;
        }
        if (obtainAttributes.hasValue(14)) {
            googleMapOptions.h = obtainAttributes.getInt(14, 0);
        }
        TypedArray obtainAttributes2 = context.getResources().obtainAttributes(attributeSet, aces.a);
        if (obtainAttributes2.hasValue(11)) {
            f = Float.valueOf(obtainAttributes2.getFloat(11, brg.a));
        } else {
            f = null;
        }
        if (obtainAttributes2.hasValue(12)) {
            f2 = Float.valueOf(obtainAttributes2.getFloat(12, brg.a));
        } else {
            f2 = null;
        }
        if (obtainAttributes2.hasValue(9)) {
            f3 = Float.valueOf(obtainAttributes2.getFloat(9, brg.a));
        } else {
            f3 = null;
        }
        if (obtainAttributes2.hasValue(10)) {
            f4 = Float.valueOf(obtainAttributes2.getFloat(10, brg.a));
        } else {
            f4 = null;
        }
        obtainAttributes2.recycle();
        if (f != null && f2 != null && f3 != null && f4 != null) {
            latLngBounds = new LatLngBounds(new LatLng(f.floatValue(), f2.floatValue()), new LatLng(f3.floatValue(), f4.floatValue()));
        }
        googleMapOptions.e = latLngBounds;
        TypedArray obtainAttributes3 = context.getResources().obtainAttributes(attributeSet, aces.a);
        if (obtainAttributes3.hasValue(5)) {
            f5 = obtainAttributes3.getFloat(5, brg.a);
        } else {
            f5 = 0.0f;
        }
        if (obtainAttributes3.hasValue(6)) {
            f6 = obtainAttributes3.getFloat(6, brg.a);
        } else {
            f6 = 0.0f;
        }
        LatLng latLng = new LatLng(f5, f6);
        acez acezVar = new acez();
        acezVar.b(latLng);
        if (obtainAttributes3.hasValue(8)) {
            acezVar.a = obtainAttributes3.getFloat(8, brg.a);
        }
        if (obtainAttributes3.hasValue(2)) {
            acezVar.c = obtainAttributes3.getFloat(2, brg.a);
        }
        if (obtainAttributes3.hasValue(7)) {
            acezVar.b = obtainAttributes3.getFloat(7, brg.a);
        }
        obtainAttributes3.recycle();
        googleMapOptions.b = acezVar.a();
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        abhg.q("MapType", Integer.valueOf(this.a), arrayList);
        abhg.q("LiteMode", this.r, arrayList);
        abhg.q("Camera", this.b, arrayList);
        abhg.q("CompassEnabled", this.m, arrayList);
        abhg.q("ZoomControlsEnabled", this.l, arrayList);
        abhg.q("ScrollGesturesEnabled", this.n, arrayList);
        abhg.q("ZoomGesturesEnabled", this.o, arrayList);
        abhg.q("TiltGesturesEnabled", this.p, arrayList);
        abhg.q("RotateGesturesEnabled", this.q, arrayList);
        abhg.q("ScrollGesturesEnabledDuringRotateOrZoom", this.u, arrayList);
        abhg.q("MapToolbarEnabled", this.s, arrayList);
        abhg.q("AmbientEnabled", this.t, arrayList);
        abhg.q("MinZoomPreference", this.c, arrayList);
        abhg.q("MaxZoomPreference", this.d, arrayList);
        abhg.q("BackgroundColor", this.f, arrayList);
        abhg.q("LatLngBoundsForCameraTarget", this.e, arrayList);
        abhg.q("ZOrderOnTop", this.j, arrayList);
        abhg.q("UseViewLifecycleInFragment", this.k, arrayList);
        abhg.q("mapColorScheme", Integer.valueOf(this.h), arrayList);
        return abhg.p(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int e = abhi.e(parcel);
        abhi.i(parcel, 2, acex.e(this.j));
        abhi.i(parcel, 3, acex.e(this.k));
        abhi.m(parcel, 4, this.a);
        abhi.o(parcel, 5, this.b, i2, false);
        abhi.i(parcel, 6, acex.e(this.l));
        abhi.i(parcel, 7, acex.e(this.m));
        abhi.i(parcel, 8, acex.e(this.n));
        abhi.i(parcel, 9, acex.e(this.o));
        abhi.i(parcel, 10, acex.e(this.p));
        abhi.i(parcel, 11, acex.e(this.q));
        abhi.i(parcel, 12, acex.e(this.r));
        abhi.i(parcel, 14, acex.e(this.s));
        abhi.i(parcel, 15, acex.e(this.t));
        abhi.w(parcel, 16, this.c);
        abhi.w(parcel, 17, this.d);
        abhi.o(parcel, 18, this.e, i2, false);
        abhi.i(parcel, 19, acex.e(this.u));
        abhi.A(parcel, 20, this.f);
        abhi.q(parcel, 21, this.g, false);
        abhi.m(parcel, 23, this.h);
        abhi.g(parcel, e);
    }

    public GoogleMapOptions(byte b, byte b2, int i2, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds, byte b12, Integer num, String str, int i3) {
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.j = acex.f(b);
        this.k = acex.f(b2);
        this.a = i2;
        this.b = cameraPosition;
        this.l = acex.f(b3);
        this.m = acex.f(b4);
        this.n = acex.f(b5);
        this.o = acex.f(b6);
        this.p = acex.f(b7);
        this.q = acex.f(b8);
        this.r = acex.f(b9);
        this.s = acex.f(b10);
        this.t = acex.f(b11);
        this.c = f;
        this.d = f2;
        this.e = latLngBounds;
        this.u = acex.f(b12);
        this.f = num;
        this.g = str;
        this.h = i3;
    }
}
