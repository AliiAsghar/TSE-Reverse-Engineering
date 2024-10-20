package com.google.android.gms.people.consentprimitive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfp;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetContactsConsentsStatusRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetContactsConsentsStatusRequest> CREATOR = new acfp(2);
    public final List a;
    public final int b;
    public final int c;

    public GetContactsConsentsStatusRequest(List list, int i, int i2) {
        this.a = list;
        this.b = i;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int e = abhi.e(parcel);
        abhi.r(parcel, 1, list, false);
        abhi.m(parcel, 2, this.b);
        abhi.m(parcel, 3, this.c);
        abhi.g(parcel, e);
    }
}
