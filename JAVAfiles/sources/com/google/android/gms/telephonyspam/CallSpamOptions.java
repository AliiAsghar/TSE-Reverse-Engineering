package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.achm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CallSpamOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CallSpamOptions> CREATOR = new achm(13);
    public final int a;
    public final String b;
    public final long c;
    public final int d;
    public final long e;

    public CallSpamOptions(int i, String str, long j, int i2, long j2) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = i2;
        this.e = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.q(parcel, 2, this.b, false);
        abhi.n(parcel, 3, this.c);
        abhi.m(parcel, 4, this.d);
        abhi.n(parcel, 5, this.e);
        abhi.g(parcel, e);
    }
}
