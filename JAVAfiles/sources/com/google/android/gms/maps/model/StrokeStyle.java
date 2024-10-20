package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class StrokeStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StrokeStyle> CREATOR = new acfd(4);
    public final float a;
    public final int b;
    public final int c;
    public final boolean d;
    public final StampStyle e;

    public StrokeStyle(float f, int i, int i2, boolean z, StampStyle stampStyle) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = stampStyle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        float f = this.a;
        int e = abhi.e(parcel);
        abhi.l(parcel, 2, f);
        abhi.m(parcel, 3, this.b);
        abhi.m(parcel, 4, this.c);
        abhi.h(parcel, 5, this.d);
        abhi.o(parcel, 6, this.e, i, false);
        abhi.g(parcel, e);
    }
}
