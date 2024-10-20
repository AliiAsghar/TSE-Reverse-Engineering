package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abxj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ThemeSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ThemeSettings> CREATOR = new abxj(9);
    public int a;
    int b;

    public ThemeSettings(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 2, this.a);
        abhi.m(parcel, 3, this.b);
        abhi.g(parcel, e);
    }

    public ThemeSettings() {
        this(3, 0);
    }
}
