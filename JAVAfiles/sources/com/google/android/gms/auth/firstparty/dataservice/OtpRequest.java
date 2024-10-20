package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abmi;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class OtpRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OtpRequest> CREATOR = new abmi(2);
    final int a;
    public final String b;
    public final AppDescription c;
    public final byte[] d;
    public final boolean e;

    public OtpRequest(int i, String str, AppDescription appDescription, byte[] bArr, boolean z) {
        this.a = i;
        this.b = str;
        this.d = bArr;
        d.aC(appDescription, "Caller's app description cannot be null!");
        this.c = appDescription;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.q(parcel, 2, this.b, false);
        abhi.o(parcel, 3, this.c, i, false);
        abhi.j(parcel, 4, this.d, false);
        abhi.h(parcel, 5, this.e);
        abhi.g(parcel, e);
    }
}
