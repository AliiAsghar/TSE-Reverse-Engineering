package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abmr;
import defpackage.abmt;
import defpackage.abos;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GoogleCertificatesLookupResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleCertificatesLookupResponse> CREATOR = new abos(12);
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;

    public GoogleCertificatesLookupResponse(boolean z, String str, int i, int i2) {
        this.a = z;
        this.b = str;
        this.c = abmt.e(i) - 1;
        this.d = abmr.k(i2) - 1;
    }

    public final int a() {
        return abmt.e(this.c);
    }

    public final void b() {
        abmr.k(this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int e = abhi.e(parcel);
        abhi.h(parcel, 1, z);
        abhi.q(parcel, 2, this.b, false);
        abhi.m(parcel, 3, this.c);
        abhi.m(parcel, 4, this.d);
        abhi.g(parcel, e);
    }
}
