package com.google.android.gms.location.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.IDeviceOrientationListener;
import com.google.android.gms.location.internal.IFusedLocationProviderCallback;
import defpackage.abhi;
import defpackage.acdi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DeviceOrientationRequestUpdateData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceOrientationRequestUpdateData> CREATOR = new acdi(9);
    final int a;
    final DeviceOrientationRequestInternal b;
    final IDeviceOrientationListener c;
    final IFusedLocationProviderCallback d;

    public DeviceOrientationRequestUpdateData(int i, DeviceOrientationRequestInternal deviceOrientationRequestInternal, IBinder iBinder, IBinder iBinder2) {
        IDeviceOrientationListener asInterface;
        this.a = i;
        this.b = deviceOrientationRequestInternal;
        if (iBinder == null) {
            asInterface = null;
        } else {
            asInterface = IDeviceOrientationListener.Stub.asInterface(iBinder);
        }
        this.c = asInterface;
        this.d = iBinder2 != null ? IFusedLocationProviderCallback.Stub.asInterface(iBinder2) : null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.o(parcel, 2, this.b, i, false);
        IDeviceOrientationListener iDeviceOrientationListener = this.c;
        IBinder iBinder = null;
        if (iDeviceOrientationListener == null) {
            asBinder = null;
        } else {
            asBinder = iDeviceOrientationListener.asBinder();
        }
        abhi.x(parcel, 3, asBinder);
        IFusedLocationProviderCallback iFusedLocationProviderCallback = this.d;
        if (iFusedLocationProviderCallback != null) {
            iBinder = iFusedLocationProviderCallback.asBinder();
        }
        abhi.x(parcel, 4, iBinder);
        abhi.g(parcel, e);
    }
}
