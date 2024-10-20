package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfe;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TimeSeriesFootprintsSubscriptionFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TimeSeriesFootprintsSubscriptionFilter> CREATOR = new acfe(4);
    public final int a;
    public final Long b;
    public final Long c;

    public TimeSeriesFootprintsSubscriptionFilter(int i, Long l, Long l2) {
        this.a = i;
        this.c = l2;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter = (TimeSeriesFootprintsSubscriptionFilter) obj;
            if (d.B(Integer.valueOf(this.a), Integer.valueOf(timeSeriesFootprintsSubscriptionFilter.a)) && d.B(this.b, timeSeriesFootprintsSubscriptionFilter.b) && d.B(this.c, timeSeriesFootprintsSubscriptionFilter.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, i2);
        abhi.D(parcel, 2, this.b);
        abhi.D(parcel, 3, this.c);
        abhi.g(parcel, e);
    }
}
