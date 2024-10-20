package com.google.android.gms.duokit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abxj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SetupDuoResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetupDuoResponse> CREATOR = new abxj(0);

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof SetupDuoResponse)) {
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
