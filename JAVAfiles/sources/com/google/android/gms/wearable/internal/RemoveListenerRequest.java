package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.internal.IWearableListener;
import defpackage.abhi;
import defpackage.acll;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RemoveListenerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoveListenerRequest> CREATOR = new acll(12);
    final int a;
    public final IWearableListener b;

    public RemoveListenerRequest(int i, IBinder iBinder) {
        IWearableListener iWearableListener;
        this.a = i;
        if (iBinder != null) {
            iWearableListener = IWearableListener.Stub.asInterface(iBinder);
        } else {
            iWearableListener = null;
        }
        this.b = iWearableListener;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        IWearableListener iWearableListener = this.b;
        if (iWearableListener == null) {
            asBinder = null;
        } else {
            asBinder = iWearableListener.asBinder();
        }
        abhi.x(parcel, 2, asBinder);
        abhi.g(parcel, e);
    }
}
