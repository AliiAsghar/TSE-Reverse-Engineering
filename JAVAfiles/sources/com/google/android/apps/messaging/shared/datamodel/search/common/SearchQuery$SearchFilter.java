package com.google.android.apps.messaging.shared.datamodel.search.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.sdr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class SearchQuery$SearchFilter implements Parcelable {
    public static final Parcelable.Creator<SearchQuery$SearchFilter> CREATOR = new sdr(11);

    protected abstract byte a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(a());
    }
}
