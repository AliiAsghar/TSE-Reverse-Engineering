package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.ILocationCallback;
import com.google.android.gms.location.ILocationListener;
import com.google.android.gms.location.internal.IFusedLocationProviderCallback;
import defpackage.abhi;
import defpackage.acdi;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class LocationRequestUpdateData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationRequestUpdateData> CREATOR = new acdi(13);
    public final int a;
    public final LocationRequestInternal b;
    public final PendingIntent c;
    public final String d;
    private final ILocationListener e;
    private final ILocationCallback f;
    private final IFusedLocationProviderCallback g;

    public LocationRequestUpdateData(int i, LocationRequestInternal locationRequestInternal, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        ILocationListener iLocationListener;
        ILocationCallback iLocationCallback;
        this.a = i;
        this.b = locationRequestInternal;
        if (iBinder != null) {
            iLocationListener = ILocationListener.Stub.asInterface(iBinder);
        } else {
            iLocationListener = null;
        }
        this.e = iLocationListener;
        this.c = pendingIntent;
        if (iBinder2 != null) {
            iLocationCallback = ILocationCallback.Stub.asInterface(iBinder2);
        } else {
            iLocationCallback = null;
        }
        this.f = iLocationCallback;
        this.g = iBinder3 != null ? IFusedLocationProviderCallback.Stub.asInterface(iBinder3) : null;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        IBinder asBinder2;
        int i2 = this.a;
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, i2);
        abhi.o(parcel, 2, this.b, i, false);
        ILocationListener iLocationListener = this.e;
        IBinder iBinder = null;
        if (iLocationListener == null) {
            asBinder = null;
        } else {
            asBinder = iLocationListener.asBinder();
        }
        abhi.x(parcel, 3, asBinder);
        abhi.o(parcel, 4, this.c, i, false);
        ILocationCallback iLocationCallback = this.f;
        if (iLocationCallback == null) {
            asBinder2 = null;
        } else {
            asBinder2 = iLocationCallback.asBinder();
        }
        abhi.x(parcel, 5, asBinder2);
        IFusedLocationProviderCallback iFusedLocationProviderCallback = this.g;
        if (iFusedLocationProviderCallback != null) {
            iBinder = iFusedLocationProviderCallback.asBinder();
        }
        abhi.x(parcel, 6, iBinder);
        abhi.q(parcel, 8, this.d, false);
        abhi.g(parcel, e);
    }
}
