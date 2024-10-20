package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetBackupSyncSuggestionResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetBackupSyncSuggestionResponse> CREATOR = new acfp(12);
    public final int a;
    public final String b;
    public final BackupSyncContactInfo c;

    public GetBackupSyncSuggestionResponse(int i, String str, BackupSyncContactInfo backupSyncContactInfo) {
        this.a = i;
        this.b = str;
        this.c = backupSyncContactInfo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, i2);
        abhi.q(parcel, 2, this.b, false);
        abhi.o(parcel, 3, this.c, i, false);
        abhi.g(parcel, e);
    }
}
