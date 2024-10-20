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
public final class TrustedContactsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TrustedContactsRequest> CREATOR = new acbp(6);
    public IndividualContactRequest[] a;
    public RequestContext b;

    public TrustedContactsRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TrustedContactsRequest) {
            TrustedContactsRequest trustedContactsRequest = (TrustedContactsRequest) obj;
            if (Arrays.equals(this.a, trustedContactsRequest.a) && d.B(this.b, trustedContactsRequest.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.H(parcel, 1, this.a, i);
        abhi.o(parcel, 2, this.b, i, false);
        abhi.g(parcel, e);
    }

    public TrustedContactsRequest(IndividualContactRequest[] individualContactRequestArr, RequestContext requestContext) {
        this.a = individualContactRequestArr;
        this.b = requestContext;
    }
}
