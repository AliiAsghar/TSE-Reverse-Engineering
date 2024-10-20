package com.google.android.gms.people.identity.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.acfy;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ParcelableGetOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ParcelableGetOptions> CREATOR = new acfy(0);
    final boolean a;
    final boolean b;
    final String c;
    final boolean d;
    final Bundle e;

    public ParcelableGetOptions(boolean z, boolean z2, boolean z3, String str, Bundle bundle) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = bundle == null ? new Bundle() : bundle;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        abhg.q("useOfflineDatabase", Boolean.valueOf(this.a), arrayList);
        abhg.q("useWebData", Boolean.valueOf(this.b), arrayList);
        abhg.q("endpoint", this.c, arrayList);
        return abhg.p(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.h(parcel, 1, this.a);
        abhi.h(parcel, 2, this.b);
        abhi.q(parcel, 3, this.c, false);
        abhi.h(parcel, 4, this.d);
        abhi.t(parcel, 5, this.e);
        abhi.g(parcel, e);
    }
}
