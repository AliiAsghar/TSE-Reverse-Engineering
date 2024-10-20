package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.ablm;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FetchVerifiedPhoneNumbersResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FetchVerifiedPhoneNumbersResult> CREATOR = new ablm(20);
    public final List a;
    public final String b;
    public final int c;

    public FetchVerifiedPhoneNumbersResult(List list, String str, int i) {
        abhg.m(list);
        this.a = list;
        this.b = str;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int e = abhi.e(parcel);
        abhi.G(parcel, 1, list);
        abhi.q(parcel, 2, this.b, false);
        abhi.m(parcel, 3, this.c);
        abhi.g(parcel, e);
    }
}
