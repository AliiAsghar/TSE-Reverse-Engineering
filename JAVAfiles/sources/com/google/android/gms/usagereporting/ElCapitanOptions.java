package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.aciz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ElCapitanOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ElCapitanOptions> CREATOR = new aciz(4);
    public final boolean a;
    public final int b;

    public ElCapitanOptions(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.h(parcel, 2, this.a);
        abhi.m(parcel, 3, this.b);
        abhi.g(parcel, e);
    }
}
