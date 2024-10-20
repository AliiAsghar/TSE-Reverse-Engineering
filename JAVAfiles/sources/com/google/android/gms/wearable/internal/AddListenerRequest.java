package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.internal.IWearableListener;
import defpackage.abhi;
import defpackage.acju;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AddListenerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AddListenerRequest> CREATOR = new acju(15);
    public final IWearableListener a;
    public final IntentFilter[] b;
    public final String c;
    public final String d;

    public AddListenerRequest(IBinder iBinder, IntentFilter[] intentFilterArr, String str, String str2) {
        this.a = iBinder != null ? IWearableListener.Stub.asInterface(iBinder) : null;
        this.b = intentFilterArr;
        this.c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        IWearableListener iWearableListener = this.a;
        int e = abhi.e(parcel);
        if (iWearableListener == null) {
            asBinder = null;
        } else {
            asBinder = iWearableListener.asBinder();
        }
        abhi.x(parcel, 2, asBinder);
        abhi.H(parcel, 3, this.b, i);
        abhi.q(parcel, 4, this.c, false);
        abhi.q(parcel, 5, this.d, false);
        abhi.g(parcel, e);
    }

    public AddListenerRequest(WearableListenerStubImpl wearableListenerStubImpl) {
        this.a = wearableListenerStubImpl;
        this.b = wearableListenerStubImpl.getFilters();
        this.c = wearableListenerStubImpl.getChannelToken();
        this.d = null;
    }
}
