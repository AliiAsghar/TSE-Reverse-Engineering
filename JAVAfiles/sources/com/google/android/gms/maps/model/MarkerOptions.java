package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.abhi;
import defpackage.acfb;
import defpackage.adae;
import defpackage.brg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new acfb();
    public LatLng a;
    public String b;
    public String c;
    public float d;
    public float e;
    public boolean f;
    public boolean g;
    public boolean h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public int n;
    public int o;
    public String p;
    public float q;
    private View r;
    private adae s;

    public MarkerOptions() {
        this.d = 0.5f;
        this.e = 1.0f;
        this.g = true;
        this.h = false;
        this.i = brg.a;
        this.j = 0.5f;
        this.k = brg.a;
        this.l = 1.0f;
        this.n = 0;
    }

    /* JADX WARN: Type inference failed for: r6v19, types: [com.google.android.gms.dynamic.IObjectWrapper, android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.google.android.gms.dynamic.IObjectWrapper, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int e = abhi.e(parcel);
        abhi.o(parcel, 2, this.a, i, false);
        abhi.q(parcel, 3, this.b, false);
        abhi.q(parcel, 4, this.c, false);
        adae adaeVar = this.s;
        if (adaeVar == null) {
            asBinder = null;
        } else {
            asBinder = adaeVar.a.asBinder();
        }
        abhi.x(parcel, 5, asBinder);
        abhi.l(parcel, 6, this.d);
        abhi.l(parcel, 7, this.e);
        abhi.h(parcel, 8, this.f);
        abhi.h(parcel, 9, this.g);
        abhi.h(parcel, 10, this.h);
        abhi.l(parcel, 11, this.i);
        abhi.l(parcel, 12, this.j);
        abhi.l(parcel, 13, this.k);
        abhi.l(parcel, 14, this.l);
        abhi.l(parcel, 15, this.m);
        abhi.m(parcel, 17, this.n);
        abhi.x(parcel, 18, ObjectWrapper.wrap(this.r));
        abhi.m(parcel, 19, this.o);
        abhi.q(parcel, 20, this.p, false);
        abhi.l(parcel, 21, this.q);
        abhi.g(parcel, e);
    }

    public MarkerOptions(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7, int i, IBinder iBinder2, int i2, String str3, float f8) {
        this.d = 0.5f;
        this.e = 1.0f;
        this.g = true;
        this.h = false;
        this.i = brg.a;
        this.j = 0.5f;
        this.k = brg.a;
        this.l = 1.0f;
        this.n = 0;
        this.a = latLng;
        this.b = str;
        this.c = str2;
        if (iBinder == null) {
            this.s = null;
        } else {
            this.s = new adae(IObjectWrapper.Stub.asInterface(iBinder));
        }
        this.d = f;
        this.e = f2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = f3;
        this.j = f4;
        this.k = f5;
        this.l = f6;
        this.m = f7;
        this.o = i2;
        this.n = i;
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(iBinder2);
        this.r = asInterface != null ? (View) ObjectWrapper.unwrap(asInterface) : null;
        this.p = str3;
        this.q = f8;
    }
}
