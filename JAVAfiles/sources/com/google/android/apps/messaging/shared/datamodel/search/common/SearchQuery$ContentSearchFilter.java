package com.google.android.apps.messaging.shared.datamodel.search.common;

import android.os.Parcel;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SearchQuery$ContentSearchFilter extends SearchQuery$SearchFilter {
    public final int a;

    public SearchQuery$ContentSearchFilter(int i) {
        this.a = i;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$SearchFilter
    protected final byte a() {
        return (byte) 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SearchQuery$ContentSearchFilter) && this.a == ((SearchQuery$ContentSearchFilter) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.a));
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$SearchFilter, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }

    public SearchQuery$ContentSearchFilter(Parcel parcel) {
        this.a = parcel.readInt();
    }
}
