package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BackupAndSyncOptInOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BackupAndSyncOptInOptions> CREATOR = new acfp(4);
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public BackupAndSyncOptInOptions(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int e = abhi.e(parcel);
        abhi.h(parcel, 1, z);
        abhi.h(parcel, 2, this.b);
        abhi.h(parcel, 3, this.c);
        abhi.g(parcel, e);
    }
}
