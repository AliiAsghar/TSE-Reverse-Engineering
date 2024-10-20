package com.google.android.gms.auth.api.proxy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ablq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ProxyGrpcRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyGrpcRequest> CREATOR = new ablq(18);
    final int a;
    public final String b;
    public final int c;
    public final long d;
    public final byte[] e;
    public final String f;

    public ProxyGrpcRequest(int i, String str, int i2, long j, byte[] bArr, String str2) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = j;
        this.e = bArr;
        this.f = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.m(parcel, 2, this.c);
        abhi.n(parcel, 3, this.d);
        abhi.j(parcel, 4, this.e, false);
        abhi.q(parcel, 5, this.f, false);
        abhi.m(parcel, 1000, this.a);
        abhi.g(parcel, e);
    }
}
