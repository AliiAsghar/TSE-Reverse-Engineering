package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acll;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PrivacyRecordOptinRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PrivacyRecordOptinRequest> CREATOR = new acll(8);
    public final String a;
    public final int b;
    public final boolean c;
    public final String d;

    public PrivacyRecordOptinRequest(String str, int i, boolean z, String str2) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.m(parcel, 2, this.b);
        abhi.h(parcel, 3, this.c);
        abhi.q(parcel, 4, this.d, false);
        abhi.g(parcel, e);
    }
}
