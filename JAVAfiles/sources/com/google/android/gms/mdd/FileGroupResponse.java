package com.google.android.gms.mdd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfd;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FileGroupResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FileGroupResponse> CREATOR = new acfd(10);
    public final String a;
    public final String b;
    public final List c;
    public final int d;

    public FileGroupResponse(String str, String str2, int i, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.r(parcel, 2, this.c, false);
        abhi.q(parcel, 3, this.b, false);
        abhi.m(parcel, 4, this.d);
        abhi.g(parcel, e);
    }
}
