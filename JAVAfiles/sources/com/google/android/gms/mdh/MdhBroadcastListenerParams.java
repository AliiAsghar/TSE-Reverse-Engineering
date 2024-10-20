package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfd;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdhBroadcastListenerParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MdhBroadcastListenerParams> CREATOR = new acfd(17);
    public final LatestFootprintFilter a;

    public MdhBroadcastListenerParams(LatestFootprintFilter latestFootprintFilter) {
        this.a = latestFootprintFilter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdhBroadcastListenerParams)) {
            return false;
        }
        return d.B(this.a, ((MdhBroadcastListenerParams) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "MdhBroadcastListenerParams{latestFootprintFilter=" + String.valueOf(this.a) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LatestFootprintFilter latestFootprintFilter = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, latestFootprintFilter, i, false);
        abhi.g(parcel, e);
    }
}
