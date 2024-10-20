package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abrm;
import defpackage.achm;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RecordConsentByConsentResultResponse extends AbstractSafeParcelable implements abrm {
    public static final Parcelable.Creator<RecordConsentByConsentResultResponse> CREATOR = new achm(7);
    public final List a;
    public final String b;

    public RecordConsentByConsentResultResponse(List list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // defpackage.abrm
    public final Status a() {
        if (this.b != null) {
            return Status.a;
        }
        return Status.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int e = abhi.e(parcel);
        abhi.G(parcel, 1, list);
        abhi.q(parcel, 2, this.b, false);
        abhi.g(parcel, e);
    }
}
