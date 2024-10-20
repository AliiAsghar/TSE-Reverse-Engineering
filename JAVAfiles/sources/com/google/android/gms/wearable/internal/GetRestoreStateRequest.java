package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.aclk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetRestoreStateRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetRestoreStateRequest> CREATOR = new aclk(15);
    public final String a;

    public GetRestoreStateRequest(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.g(parcel, e);
    }
}
