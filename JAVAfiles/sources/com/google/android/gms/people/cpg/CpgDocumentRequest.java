package com.google.android.gms.people.cpg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfp;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CpgDocumentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CpgDocumentRequest> CREATOR = new acfp(18);
    public final int a;
    public final PreferenceDocumentRequest b;

    public CpgDocumentRequest(int i, PreferenceDocumentRequest preferenceDocumentRequest) {
        this.a = i;
        this.b = preferenceDocumentRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CpgDocumentRequest cpgDocumentRequest = (CpgDocumentRequest) obj;
            if (this.a == cpgDocumentRequest.a && d.B(this.b, cpgDocumentRequest.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, i2);
        abhi.o(parcel, 2, this.b, i, false);
        abhi.g(parcel, e);
    }
}
