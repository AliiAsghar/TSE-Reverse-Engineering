package com.google.android.gms.constellation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abuz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PhoneNumberInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PhoneNumberInfo> CREATOR = new abuz(8);
    public final int a;
    public final String b;
    public final Long c;
    public final Bundle d;

    public PhoneNumberInfo(int i, String str, Long l, Bundle bundle) {
        this.a = i;
        this.b = str;
        this.c = l;
        this.d = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.q(parcel, 2, this.b, false);
        abhi.D(parcel, 3, this.c);
        abhi.t(parcel, 4, this.d);
        abhi.g(parcel, e);
    }
}
