package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.achm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LookupSpamStatusOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LookupSpamStatusOptions> CREATOR = new achm(15);
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final boolean f;

    public LookupSpamStatusOptions(int i, String str, String str2, boolean z, String str3, boolean z2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.q(parcel, 2, this.b, false);
        abhi.q(parcel, 3, this.c, false);
        abhi.h(parcel, 4, this.d);
        abhi.q(parcel, 5, this.e, false);
        abhi.h(parcel, 6, this.f);
        abhi.g(parcel, e);
    }
}
