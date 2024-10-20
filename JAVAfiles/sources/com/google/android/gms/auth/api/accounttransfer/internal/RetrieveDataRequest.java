package com.google.android.gms.auth.api.accounttransfer.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abkq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RetrieveDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RetrieveDataRequest> CREATOR = new abkq(17);
    public final String a;

    public RetrieveDataRequest(String str) {
        abhg.m(str);
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, 1);
        abhi.q(parcel, 2, this.a, false);
        abhi.g(parcel, e);
    }
}
