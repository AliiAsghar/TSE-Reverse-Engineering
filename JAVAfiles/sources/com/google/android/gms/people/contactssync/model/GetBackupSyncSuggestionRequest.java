package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetBackupSyncSuggestionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetBackupSyncSuggestionRequest> CREATOR = new acfp(11);
    public final int a;
    public final int b;

    public GetBackupSyncSuggestionRequest(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.m(parcel, 2, this.b);
        abhi.g(parcel, e);
    }
}
