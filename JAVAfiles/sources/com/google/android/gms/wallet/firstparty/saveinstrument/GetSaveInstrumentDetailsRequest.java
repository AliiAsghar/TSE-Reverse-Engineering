package com.google.android.gms.wallet.firstparty.saveinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acjs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetSaveInstrumentDetailsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSaveInstrumentDetailsRequest> CREATOR = new acjs(5);
    String a;
    long b;

    private GetSaveInstrumentDetailsRequest() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, this.a, false);
        abhi.n(parcel, 2, this.b);
        abhi.g(parcel, e);
    }

    public GetSaveInstrumentDetailsRequest(String str, long j) {
        this.a = str;
        this.b = j;
    }
}
