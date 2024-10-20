package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acju;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AddAccountToConsentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AddAccountToConsentRequest> CREATOR = new acju(14);
    public final String a;
    public final boolean b;

    public AddAccountToConsentRequest(String str, boolean z) {
        this.a = str;
        this.b = z;
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
