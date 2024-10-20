package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ablm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DeleteRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeleteRequest> CREATOR = new ablm(4);
    public final Credential a;

    public DeleteRequest(Credential credential) {
        this.a = credential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Credential credential = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, credential, i, false);
        abhi.g(parcel, e);
    }
}
