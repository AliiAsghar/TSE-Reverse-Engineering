package com.google.android.gms.kids;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acbp;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class IndividualContactRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<IndividualContactRequest> CREATOR = new acbp(4);
    public String a;
    public UriWithType[] b;

    public IndividualContactRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IndividualContactRequest) {
            IndividualContactRequest individualContactRequest = (IndividualContactRequest) obj;
            if (d.B(this.a, individualContactRequest.a) && Arrays.equals(this.b, individualContactRequest.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, this.a, false);
        abhi.H(parcel, 2, this.b, i);
        abhi.g(parcel, e);
    }

    public IndividualContactRequest(String str, UriWithType[] uriWithTypeArr) {
        this.a = str;
        this.b = uriWithTypeArr;
    }
}
