package com.google.android.gms.constellation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abuz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetIidTokenResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetIidTokenResponse> CREATOR = new abuz(5);
    public final String a;
    public final String b;
    public final byte[] c;
    public final long d;

    public GetIidTokenResponse(String str, String str2, byte[] bArr, long j) {
        this.a = str;
        this.b = str2;
        this.c = bArr;
        this.d = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.j(parcel, 3, this.c, false);
        abhi.n(parcel, 4, this.d);
        abhi.g(parcel, e);
    }
}
