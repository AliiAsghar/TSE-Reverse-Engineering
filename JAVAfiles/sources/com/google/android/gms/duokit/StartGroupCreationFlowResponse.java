package com.google.android.gms.duokit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abxj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class StartGroupCreationFlowResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StartGroupCreationFlowResponse> CREATOR = new abxj(5);

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof StartGroupCreationFlowResponse)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        abhi.g(parcel, abhi.e(parcel));
    }
}
