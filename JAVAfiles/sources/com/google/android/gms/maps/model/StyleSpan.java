package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class StyleSpan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StyleSpan> CREATOR = new acfd(5);
    public final StrokeStyle a;
    public final double b;

    public StyleSpan(StrokeStyle strokeStyle, double d) {
        if (d > 0.0d) {
            this.a = strokeStyle;
            this.b = d;
            return;
        }
        throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        StrokeStyle strokeStyle = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 2, strokeStyle, i, false);
        abhi.k(parcel, 3, this.b);
        abhi.g(parcel, e);
    }
}
