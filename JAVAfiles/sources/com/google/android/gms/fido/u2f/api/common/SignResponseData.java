package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abzo;
import defpackage.albo;
import defpackage.algv;
import defpackage.amcn;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class SignResponseData extends ResponseData {
    public static final Parcelable.Creator<SignResponseData> CREATOR = new abzo(8);
    public final byte[] a;
    public final String b;
    public final byte[] c;
    public final byte[] d;

    public SignResponseData(byte[] bArr, String str, byte[] bArr2, byte[] bArr3) {
        abhg.m(bArr);
        this.a = bArr;
        abhg.m(str);
        this.b = str;
        abhg.m(bArr2);
        this.c = bArr2;
        abhg.m(bArr3);
        this.d = bArr3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignResponseData)) {
            return false;
        }
        SignResponseData signResponseData = (SignResponseData) obj;
        if (!Arrays.equals(this.a, signResponseData.a) || !d.B(this.b, signResponseData.b) || !Arrays.equals(this.c, signResponseData.c) || !Arrays.equals(this.d, signResponseData.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d))});
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("keyHandle", amcn.h.j(this.a));
        aj.b("clientDataString", this.b);
        aj.b("signatureData", amcn.h.j(this.c));
        aj.b("application", amcn.h.j(this.d));
        return aj.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int e = abhi.e(parcel);
        abhi.j(parcel, 2, bArr, false);
        abhi.q(parcel, 3, this.b, false);
        abhi.j(parcel, 4, this.c, false);
        abhi.j(parcel, 5, this.d, false);
        abhi.g(parcel, e);
    }
}
