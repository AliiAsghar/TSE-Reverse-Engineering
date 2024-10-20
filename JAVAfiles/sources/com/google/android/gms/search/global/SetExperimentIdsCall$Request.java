package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.achi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SetExperimentIdsCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetExperimentIdsCall$Request> CREATOR = new achi(2);
    public byte[] a;
    public boolean b;

    public SetExperimentIdsCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.j(parcel, 1, this.a, false);
        abhi.h(parcel, 2, this.b);
        abhi.g(parcel, e);
    }

    public SetExperimentIdsCall$Request(byte[] bArr, boolean z) {
        this.a = bArr;
        this.b = z;
    }
}
