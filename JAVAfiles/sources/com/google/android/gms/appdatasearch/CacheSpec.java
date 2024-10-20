package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abjg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CacheSpec extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CacheSpec> CREATOR = new abjg(0);
    public final String a;
    public final int b;

    public CacheSpec(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.m(parcel, 2, this.b);
        abhi.g(parcel, e);
    }
}
