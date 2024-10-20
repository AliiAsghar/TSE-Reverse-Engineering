package com.google.android.apps.messaging.shared.datamodel.search.common;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.ruy;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SearchQuery$ConversationSearchFilter extends SearchQuery$SearchFilter {
    public final ConversationIdType a;

    public SearchQuery$ConversationSearchFilter(ConversationIdType conversationIdType) {
        this.a = conversationIdType;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$SearchFilter
    protected final byte a() {
        return (byte) 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SearchQuery$ConversationSearchFilter) && this.a.equals(((SearchQuery$ConversationSearchFilter) obj).a)) {
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
        parcel.writeString(this.a.a());
    }

    public SearchQuery$ConversationSearchFilter(Parcel parcel) {
        this.a = ruy.b(parcel.readString());
    }
}
