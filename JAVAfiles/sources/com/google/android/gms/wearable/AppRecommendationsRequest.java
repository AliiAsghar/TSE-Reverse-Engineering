package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acju;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AppRecommendationsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AppRecommendationsRequest> CREATOR = new acju(2);
    public final String a;
    public final int b;
    public final int c;

    public AppRecommendationsRequest(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final String toString() {
        String binaryString = Integer.toBinaryString(this.b);
        binaryString.getClass();
        if (binaryString.length() < 8) {
            StringBuilder sb = new StringBuilder(8);
            for (int length = binaryString.length(); length < 8; length++) {
                sb.append('0');
            }
            sb.append(binaryString);
            binaryString = sb.toString();
        }
        return "AppRecommendationsRequest{androidId='" + this.a + "', searchFlags=" + binaryString + ", limit=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        d.aC(this.a, "Android id is required");
        if ((this.b & 3) != 0) {
            int e = abhi.e(parcel);
            abhi.q(parcel, 1, this.a, false);
            abhi.m(parcel, 2, this.b);
            abhi.m(parcel, 3, this.c);
            abhi.g(parcel, e);
            return;
        }
        throw new IllegalArgumentException("Recommendation type is required");
    }
}
