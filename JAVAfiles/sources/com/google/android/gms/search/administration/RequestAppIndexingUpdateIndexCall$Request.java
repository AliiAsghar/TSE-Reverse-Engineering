package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ache;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RequestAppIndexingUpdateIndexCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RequestAppIndexingUpdateIndexCall$Request> CREATOR = new ache(0);
    public final String a;

    public RequestAppIndexingUpdateIndexCall$Request(String str) {
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
