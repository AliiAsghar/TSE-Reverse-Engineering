package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfp;
import defpackage.albo;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GetImportSimContactsSuggestionsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetImportSimContactsSuggestionsRequest> CREATOR = new acfp(13);
    public final AccountWithDataSet a;
    public final boolean b;
    private final Set c;

    public GetImportSimContactsSuggestionsRequest(AccountWithDataSet accountWithDataSet, Set set, boolean z) {
        this.a = accountWithDataSet;
        this.c = set;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AccountWithDataSet accountWithDataSet = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, accountWithDataSet, i, false);
        abhi.y(parcel, 2, albo.cy(this.c));
        abhi.h(parcel, 3, this.b);
        abhi.g(parcel, e);
    }
}
