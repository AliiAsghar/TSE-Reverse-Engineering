package com.google.android.gms.carrierauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abmm;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class EAPAKARequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<EAPAKARequest> CREATOR = new abmm(17);
    public final String a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final int e;

    public EAPAKARequest(String str, Integer num, Integer num2, Integer num3, int i) {
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = num3;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EAPAKARequest)) {
            return false;
        }
        EAPAKARequest eAPAKARequest = (EAPAKARequest) obj;
        if (this.e == eAPAKARequest.e && d.B(this.a, eAPAKARequest.a) && d.B(this.b, eAPAKARequest.b) && d.B(this.c, eAPAKARequest.c) && d.B(this.d, eAPAKARequest.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Integer.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.A(parcel, 2, this.b);
        abhi.A(parcel, 3, this.c);
        abhi.A(parcel, 4, this.d);
        abhi.m(parcel, 5, this.e);
        abhi.g(parcel, e);
    }
}
