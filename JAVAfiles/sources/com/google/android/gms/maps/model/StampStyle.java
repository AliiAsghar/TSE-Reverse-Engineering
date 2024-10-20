package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.abhi;
import defpackage.aced;
import defpackage.adae;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class StampStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StampStyle> CREATOR = new aced(19);
    protected final adae a;

    public StampStyle(IBinder iBinder) {
        this.a = new adae(IObjectWrapper.Stub.asInterface(iBinder));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.dynamic.IObjectWrapper, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.x(parcel, 2, this.a.a.asBinder());
        abhi.g(parcel, e);
    }
}
