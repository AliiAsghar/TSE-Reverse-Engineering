package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhi;
import defpackage.abzo;
import defpackage.abzp;
import defpackage.albo;
import defpackage.algv;
import defpackage.amcn;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class RegisterResponseData extends ResponseData {
    public static final Parcelable.Creator<RegisterResponseData> CREATOR = new abzo(5);
    public final byte[] a;
    public final String b;
    private final ProtocolVersion c;

    public RegisterResponseData(byte[] bArr, String str, String str2) {
        this.a = bArr;
        try {
            this.c = ProtocolVersion.a(str);
            this.b = str2;
        } catch (abzp e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RegisterResponseData)) {
            return false;
        }
        RegisterResponseData registerResponseData = (RegisterResponseData) obj;
        if (!d.B(this.c, registerResponseData.c) || !Arrays.equals(this.a, registerResponseData.a) || !d.B(this.b, registerResponseData.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Integer.valueOf(Arrays.hashCode(this.a)), this.b});
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("protocolVersion", this.c);
        aj.b("registerData", amcn.h.j(this.a));
        String str = this.b;
        if (str != null) {
            aj.b("clientDataString", str);
        }
        return aj.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int e = abhi.e(parcel);
        abhi.j(parcel, 2, bArr, false);
        abhi.q(parcel, 3, this.c.d, false);
        abhi.q(parcel, 4, this.b, false);
        abhi.g(parcel, e);
    }
}
