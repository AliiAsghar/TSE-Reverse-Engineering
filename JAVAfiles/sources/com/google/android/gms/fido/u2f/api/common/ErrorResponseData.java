package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhi;
import defpackage.abzo;
import defpackage.albo;
import defpackage.algv;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class ErrorResponseData extends ResponseData {
    public static final Parcelable.Creator<ErrorResponseData> CREATOR = new abzo(1);
    public final String a;
    private final ErrorCode b;

    public ErrorResponseData(int i, String str) {
        this.b = ErrorCode.a(i);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ErrorResponseData)) {
            return false;
        }
        ErrorResponseData errorResponseData = (ErrorResponseData) obj;
        if (!d.B(this.b, errorResponseData.b) || !d.B(this.a, errorResponseData.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.f("errorCode", this.b.g);
        String str = this.a;
        if (str != null) {
            aj.b("errorMessage", str);
        }
        return aj.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 2, this.b.g);
        abhi.q(parcel, 3, this.a, false);
        abhi.g(parcel, e);
    }
}
