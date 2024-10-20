package com.google.android.gms.constellation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abuz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PhoneNumberVerification extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PhoneNumberVerification> CREATOR = new abuz(9);
    public final String a;
    public final long b;
    public final int c;
    public final int d;
    public final String e;
    public final Bundle f;
    public final int g;
    public final long h;

    public PhoneNumberVerification(String str, long j, int i, int i2, String str2, Bundle bundle, int i3, long j2) {
        this.a = str;
        this.b = j;
        this.f = bundle;
        this.c = i;
        this.d = i2;
        this.e = str2;
        this.g = i3;
        this.h = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.n(parcel, 2, this.b);
        abhi.m(parcel, 3, this.c);
        abhi.m(parcel, 4, this.d);
        abhi.q(parcel, 5, this.e, false);
        abhi.t(parcel, 6, this.f);
        abhi.m(parcel, 7, this.g);
        abhi.n(parcel, 8, this.h);
        abhi.g(parcel, e);
    }
}
