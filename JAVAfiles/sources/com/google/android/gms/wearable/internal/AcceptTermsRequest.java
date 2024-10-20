package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acju;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AcceptTermsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AcceptTermsRequest> CREATOR = new acju(12);
    public final int a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final boolean h;

    public AcceptTermsRequest(int i, List list, String str, String str2, String str3, String str4, List list2, boolean z) {
        this.a = i;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = list2;
        this.h = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.z(parcel, 2, this.b);
        abhi.q(parcel, 3, this.c, false);
        abhi.q(parcel, 4, this.d, false);
        abhi.q(parcel, 5, this.e, false);
        abhi.q(parcel, 6, this.f, false);
        abhi.z(parcel, 7, this.g);
        abhi.h(parcel, 8, this.h);
        abhi.g(parcel, e);
    }
}
