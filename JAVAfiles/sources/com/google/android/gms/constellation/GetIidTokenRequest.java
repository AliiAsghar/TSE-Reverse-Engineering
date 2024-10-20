package com.google.android.gms.constellation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abuz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetIidTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetIidTokenRequest> CREATOR = new abuz(4);
    public final Long a;

    public GetIidTokenRequest(Long l) {
        this.a = l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.a;
        int e = abhi.e(parcel);
        abhi.D(parcel, 1, l);
        abhi.g(parcel, e);
    }
}
