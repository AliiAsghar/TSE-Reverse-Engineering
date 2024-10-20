package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acgc;
import defpackage.aoee;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AppIndexingUserActionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AppIndexingUserActionInfo> CREATOR = new acgc(10);
    public String a;
    public long b;
    public aoee c;

    public AppIndexingUserActionInfo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, this.a, false);
        abhi.n(parcel, 2, this.b);
        abhi.o(parcel, 3, this.c, i, false);
        abhi.g(parcel, e);
    }

    public AppIndexingUserActionInfo(String str, long j, aoee aoeeVar) {
        this.a = str;
        this.b = j;
        this.c = aoeeVar;
    }
}
