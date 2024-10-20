package com.google.android.gms.wallet.button;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acjq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GetInstrumentAvailabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetInstrumentAvailabilityResponse> CREATOR = new acjq(13);
    String a;
    int b;
    boolean c;
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;

    private GetInstrumentAvailabilityResponse() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, this.a, false);
        abhi.m(parcel, 2, this.b);
        abhi.h(parcel, 3, this.c);
        abhi.q(parcel, 4, this.d, false);
        abhi.q(parcel, 5, this.e, false);
        abhi.q(parcel, 6, this.f, false);
        abhi.q(parcel, 7, this.g, false);
        abhi.q(parcel, 8, this.h, false);
        abhi.q(parcel, 9, this.i, false);
        abhi.g(parcel, e);
    }

    public GetInstrumentAvailabilityResponse(String str, int i, boolean z, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
    }
}
