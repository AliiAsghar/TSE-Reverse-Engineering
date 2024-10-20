package com.google.android.gms.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.achm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RecordConsentByConsentResultRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RecordConsentByConsentResultRequest> CREATOR = new achm(6);
    public final Bundle a;

    public RecordConsentByConsentResultRequest(Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = this.a;
        int e = abhi.e(parcel);
        abhi.t(parcel, 1, bundle);
        abhi.g(parcel, e);
    }
}
