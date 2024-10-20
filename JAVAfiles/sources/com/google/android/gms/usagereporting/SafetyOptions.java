package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.aciz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SafetyOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SafetyOptions> CREATOR = new aciz(5);
    public final boolean a;
    public final boolean b;
    public final int c;

    public SafetyOptions(boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.h(parcel, 2, this.a);
        abhi.h(parcel, 3, this.b);
        abhi.m(parcel, 4, this.c);
        abhi.g(parcel, e);
    }
}
