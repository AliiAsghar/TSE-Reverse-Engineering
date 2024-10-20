package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BackupAndSyncOptInState extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BackupAndSyncOptInState> CREATOR = new acfp(5);
    public final String a;
    public final int[] b;
    public final int c;
    public final String[] d;

    public BackupAndSyncOptInState(String str, int[] iArr, int i, String[] strArr) {
        this.a = str;
        this.b = iArr;
        this.c = i;
        this.d = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.y(parcel, 2, this.b);
        abhi.m(parcel, 4, this.c);
        abhi.F(parcel, 5, this.d);
        abhi.g(parcel, e);
    }
}
