package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acdi;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new acdi(0);
    public final boolean a;
    public final boolean b;
    private final List c;

    public LocationSettingsRequest(List list, boolean z, boolean z2) {
        this.c = list;
        this.a = z;
        this.b = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.c;
        int e = abhi.e(parcel);
        abhi.r(parcel, 1, DesugarCollections.unmodifiableList(list), false);
        abhi.h(parcel, 2, this.a);
        abhi.h(parcel, 3, this.b);
        abhi.g(parcel, e);
    }
}
