package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acju;
import defpackage.albo;
import defpackage.algv;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ConnectionRestrictions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionRestrictions> CREATOR = new acju(7);
    public final List a;
    public final List b;
    public final List c;

    public ConnectionRestrictions(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("allowedDataItemFilters", this.a);
        aj.b("allowedCapabilities", this.b);
        aj.b("allowedPackages", this.c);
        return aj.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int e = abhi.e(parcel);
        abhi.r(parcel, 1, list, false);
        abhi.G(parcel, 2, this.b);
        abhi.G(parcel, 3, this.c);
        abhi.g(parcel, e);
    }
}
