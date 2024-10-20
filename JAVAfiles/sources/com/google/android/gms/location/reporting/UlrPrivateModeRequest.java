package com.google.android.gms.location.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.aced;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class UlrPrivateModeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UlrPrivateModeRequest> CREATOR = new aced(1);
    public final String a;
    public final boolean b;

    public UlrPrivateModeRequest(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final String toString() {
        return "UlrPrivateModeRequest{Tag='" + this.a + ", privateMode=" + this.b + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.h(parcel, 2, this.b);
        abhi.g(parcel, e);
    }
}
