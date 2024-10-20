package com.google.android.gms.search.ime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.achi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetIMEUpdatesCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetIMEUpdatesCall$Request> CREATOR = new achi(8);
    public int a;
    public byte[] b;

    public GetIMEUpdatesCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.j(parcel, 2, this.b, false);
        abhi.g(parcel, e);
    }

    public GetIMEUpdatesCall$Request(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }
}
