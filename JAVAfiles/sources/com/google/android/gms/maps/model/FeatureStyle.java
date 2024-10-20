package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.aced;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FeatureStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FeatureStyle> CREATOR = new aced(8);
    public final Integer a;
    public final Integer b;
    public final Float c;
    public final Float d;

    public FeatureStyle(Integer num, Integer num2, Float f, Float f2) {
        this.a = num;
        this.b = num2;
        this.c = f;
        this.d = f2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.a;
        int e = abhi.e(parcel);
        abhi.A(parcel, 1, num);
        abhi.A(parcel, 2, this.b);
        abhi.w(parcel, 3, this.c);
        abhi.w(parcel, 4, this.d);
        abhi.g(parcel, e);
    }
}
