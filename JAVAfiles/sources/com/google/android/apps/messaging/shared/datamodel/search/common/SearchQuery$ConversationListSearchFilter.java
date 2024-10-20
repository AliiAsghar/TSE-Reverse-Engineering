package com.google.android.apps.messaging.shared.datamodel.search.common;

import defpackage.ujo;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SearchQuery$ConversationListSearchFilter extends SearchQuery$SearchFilter {
    public final ujo a;

    public SearchQuery$ConversationListSearchFilter(ujo ujoVar) {
        this.a = ujoVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$SearchFilter
    protected final byte a() {
        return (byte) 5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }
}
