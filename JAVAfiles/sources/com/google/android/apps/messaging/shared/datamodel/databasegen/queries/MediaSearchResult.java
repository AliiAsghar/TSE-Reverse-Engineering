package com.google.android.apps.messaging.shared.datamodel.databasegen.queries;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MediaSearchQuery;
import defpackage.rha;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MediaSearchResult extends MediaSearchQuery.BindData implements Parcelable {
    public static final Parcelable.Creator<MediaSearchResult> CREATOR = new rha(20);

    public MediaSearchResult() {
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MediaSearchQuery.BindData, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public MediaSearchResult(Parcel parcel) {
        ap(parcel);
    }
}
