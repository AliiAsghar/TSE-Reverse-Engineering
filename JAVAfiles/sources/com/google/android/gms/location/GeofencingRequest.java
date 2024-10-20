package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acbp;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new acbp(17);
    public final List a;
    public final int b;
    public final String c;

    public GeofencingRequest(List list, int i, String str) {
        this.a = list;
        this.b = i;
        this.c = str;
    }

    public final String toString() {
        return "GeofencingRequest[geofences=" + String.valueOf(this.a) + ", initialTrigger=" + this.b + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int e = abhi.e(parcel);
        abhi.r(parcel, 1, list, false);
        abhi.m(parcel, 2, this.b);
        abhi.q(parcel, 4, this.c, false);
        abhi.g(parcel, e);
    }
}
