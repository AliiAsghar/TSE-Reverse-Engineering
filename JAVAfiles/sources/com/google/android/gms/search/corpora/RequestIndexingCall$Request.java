package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ache;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RequestIndexingCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RequestIndexingCall$Request> CREATOR = new ache(13);
    public String a;
    public String b;
    public long c;

    public RequestIndexingCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, this.a, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.n(parcel, 3, this.c);
        abhi.g(parcel, e);
    }

    public RequestIndexingCall$Request(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }
}
