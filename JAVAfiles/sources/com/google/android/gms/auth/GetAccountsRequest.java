package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abkq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetAccountsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetAccountsRequest> CREATOR = new abkq(2);
    public final String a;
    public final String[] b;

    public GetAccountsRequest(String str, String[] strArr) {
        this.a = str;
        this.b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.F(parcel, 2, this.b);
        abhi.g(parcel, e);
    }
}
