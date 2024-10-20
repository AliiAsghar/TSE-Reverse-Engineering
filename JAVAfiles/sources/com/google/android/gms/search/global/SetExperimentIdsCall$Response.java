package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abrm;
import defpackage.achi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SetExperimentIdsCall$Response extends AbstractSafeParcelable implements abrm {
    public static final Parcelable.Creator<SetExperimentIdsCall$Response> CREATOR = new achi(3);
    public Status a;

    public SetExperimentIdsCall$Response() {
    }

    @Override // defpackage.abrm
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, this.a, i, false);
        abhi.g(parcel, e);
    }

    public SetExperimentIdsCall$Response(Status status) {
        this.a = status;
    }
}
