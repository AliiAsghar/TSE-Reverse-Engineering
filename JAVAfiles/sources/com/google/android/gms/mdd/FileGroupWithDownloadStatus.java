package com.google.android.gms.mdd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FileGroupWithDownloadStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FileGroupWithDownloadStatus> CREATOR = new acfd(11);
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public FileGroupWithDownloadStatus(String str, String str2, int i, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.h(parcel, 3, this.d);
        abhi.m(parcel, 4, this.c);
        abhi.g(parcel, e);
    }
}
