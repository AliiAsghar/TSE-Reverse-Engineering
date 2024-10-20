package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acjq;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ShippingAddressRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ShippingAddressRequirements> CREATOR = new acjq(8);
    ArrayList a;

    private ShippingAddressRequirements() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.G(parcel, 1, this.a);
        abhi.g(parcel, e);
    }

    public ShippingAddressRequirements(ArrayList arrayList) {
        this.a = arrayList;
    }
}
