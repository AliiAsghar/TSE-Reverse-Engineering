package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abjg;
import defpackage.abrm;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetRecentContextCall$Response extends AbstractSafeParcelable implements abrm {
    public static final Parcelable.Creator<GetRecentContextCall$Response> CREATOR = new abjg(11);
    public Status a;
    public List b;

    @Deprecated
    public String[] c;

    public GetRecentContextCall$Response() {
    }

    @Override // defpackage.abrm
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, this.a, i, false);
        abhi.r(parcel, 2, this.b, false);
        abhi.F(parcel, 3, this.c);
        abhi.g(parcel, e);
    }

    public GetRecentContextCall$Response(Status status, List list, String[] strArr) {
        this.a = status;
        this.b = list;
        this.c = strArr;
    }
}
