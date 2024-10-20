package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abos;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ApiMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiMetadata> CREATOR = abos.a;
    public static final ApiMetadata a = new ApiMetadata(null);
    public final ComplianceOptions b;

    public ApiMetadata(ComplianceOptions complianceOptions) {
        this.b = complianceOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ApiMetadata)) {
            return false;
        }
        return Objects.equals(this.b, ((ApiMetadata) obj).b);
    }

    public final int hashCode() {
        return Objects.hashCode(this.b);
    }

    public final String toString() {
        return "ApiMetadata(complianceOptions=" + String.valueOf(this.b) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-204102970);
        ComplianceOptions complianceOptions = this.b;
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, complianceOptions, i, false);
        abhi.g(parcel, e);
    }
}
