package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BackupAndSyncSuggestion extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BackupAndSyncSuggestion> CREATOR = new acfp(6);
    public final int a;
    public final int b;

    public BackupAndSyncSuggestion(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int e = abhi.e(parcel);
        abhi.m(parcel, 2, i2);
        abhi.m(parcel, 3, this.b);
        abhi.g(parcel, e);
    }
}
