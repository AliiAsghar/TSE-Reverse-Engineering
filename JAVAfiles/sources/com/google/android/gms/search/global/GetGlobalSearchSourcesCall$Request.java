package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ache;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetGlobalSearchSourcesCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetGlobalSearchSourcesCall$Request> CREATOR = new ache(19);
    public boolean a;

    public GetGlobalSearchSourcesCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.h(parcel, 1, this.a);
        abhi.g(parcel, e);
    }

    public GetGlobalSearchSourcesCall$Request(boolean z) {
        this.a = z;
    }
}
