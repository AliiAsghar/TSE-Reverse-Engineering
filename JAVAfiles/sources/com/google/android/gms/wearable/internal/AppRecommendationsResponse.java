package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ackp;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AppRecommendationsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AppRecommendationsResponse> CREATOR = new ackp(1);
    public final int a;
    public final List b;
    public final WebIconParcelable c;

    public AppRecommendationsResponse(int i, List list, WebIconParcelable webIconParcelable) {
        this.a = i;
        this.b = list;
        this.c = webIconParcelable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.r(parcel, 2, this.b, false);
        abhi.o(parcel, 3, this.c, i, false);
        abhi.g(parcel, e);
    }
}
