package com.google.android.gms.carrierauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abmm;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class EapInfoRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<EapInfoRequest> CREATOR = new abmm(19);
    public final int a;

    public EapInfoRequest(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof EapInfoRequest) && this.a == ((EapInfoRequest) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, i2);
        abhi.g(parcel, e);
    }
}
