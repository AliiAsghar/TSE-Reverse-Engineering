package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ablu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DeviceManagementInfoResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceManagementInfoResponse> CREATOR = new ablu(18);
    final int a;
    public final String b;
    public final boolean c;

    public DeviceManagementInfoResponse(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.q(parcel, 2, this.b, false);
        abhi.h(parcel, 3, this.c);
        abhi.g(parcel, e);
    }
}
