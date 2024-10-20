package com.google.android.apps.messaging.shared.datamodel.search.common;

import android.os.Parcel;
import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SearchQuery$ParticipantSearchFilter extends SearchQuery$SearchFilter {
    public final String a;

    public SearchQuery$ParticipantSearchFilter(String str) {
        this.a = str;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$SearchFilter
    protected final byte a() {
        return (byte) 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SearchQuery$ParticipantSearchFilter) && TextUtils.equals(this.a, ((SearchQuery$ParticipantSearchFilter) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$SearchFilter, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
    }

    public SearchQuery$ParticipantSearchFilter(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.a = readString;
    }
}
