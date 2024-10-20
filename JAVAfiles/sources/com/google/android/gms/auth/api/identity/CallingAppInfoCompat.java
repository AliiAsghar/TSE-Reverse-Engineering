package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ablm;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CallingAppInfoCompat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CallingAppInfoCompat> CREATOR = new ablm(17);
    public final String a;
    public final SigningInfoCompat b;
    public final String c;

    public CallingAppInfoCompat(String str, SigningInfoCompat signingInfoCompat, String str2) {
        this.a = str;
        this.b = signingInfoCompat;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallingAppInfoCompat)) {
            return false;
        }
        CallingAppInfoCompat callingAppInfoCompat = (CallingAppInfoCompat) obj;
        if (this.a.equals(callingAppInfoCompat.a) && this.b.equals(callingAppInfoCompat.b) && Objects.equals(this.c, callingAppInfoCompat.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public final String toString() {
        return "CallingAppInfoCompat{packageName='" + this.a + "', signingInfo=" + this.b + ", origin='" + this.c + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.o(parcel, 2, this.b, i, false);
        abhi.q(parcel, 3, this.c, false);
        abhi.g(parcel, e);
    }
}
