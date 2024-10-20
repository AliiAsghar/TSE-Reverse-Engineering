package com.google.android.apps.messaging.shared.datamodel.databasegen.queries;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.UrlSearchQuery;
import defpackage.sdr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class UrlSearchResult extends UrlSearchQuery.BindData implements Parcelable {
    public static final Parcelable.Creator<UrlSearchResult> CREATOR = new sdr(3);

    public UrlSearchResult() {
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.databasegen.queries.UrlSearchQuery.BindData, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public UrlSearchResult(Parcel parcel) {
        ap(parcel);
    }
}
