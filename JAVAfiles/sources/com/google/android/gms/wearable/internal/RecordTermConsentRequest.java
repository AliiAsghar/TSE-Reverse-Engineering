package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acll;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RecordTermConsentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RecordTermConsentRequest> CREATOR = new acll(10);
    public final int a;
    public final int b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;

    public RecordTermConsentRequest(int i, int i2, boolean z, String str, String str2, String str3) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.m(parcel, 2, this.b);
        abhi.h(parcel, 3, this.c);
        abhi.q(parcel, 4, this.d, false);
        abhi.q(parcel, 5, this.e, false);
        abhi.q(parcel, 6, this.f, false);
        abhi.g(parcel, e);
    }
}
