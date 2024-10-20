package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abos;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DataCollectionIdentifierParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DataCollectionIdentifierParcelable> CREATOR = new abos(2);
    public final int a;
    public final int b;
    public final int c;

    public DataCollectionIdentifierParcelable(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, i2);
        abhi.m(parcel, 2, this.b);
        abhi.m(parcel, 3, this.c);
        abhi.g(parcel, e);
    }
}
